package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.filament.Viewport;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public class DefaultItemAnimator extends RecyclerView.ItemAnimator {
    public static TimeInterpolator sDefaultInterpolator;
    public final ArrayList mAddAnimations;
    public final ArrayList mAdditionsList;
    public final ArrayList mChangeAnimations;
    public final ArrayList mChangesList;
    public final ArrayList mMoveAnimations;
    public final ArrayList mMovesList;
    public final ArrayList mPendingAdditions;
    public final ArrayList mPendingChanges;
    public final ArrayList mPendingMoves;
    public final ArrayList mPendingRemovals;
    public final ArrayList mRemoveAnimations;
    public boolean mSupportsChangeAnimations;

    public final class ChangeInfo {
        public int fromX;
        public int fromY;
        public RecyclerView.ViewHolder newHolder;
        public RecyclerView.ViewHolder oldHolder;
        public int toX;
        public int toY;

        public final String toString() {
            StringBuilder sb = new StringBuilder("ChangeInfo{oldHolder=");
            sb.append(this.oldHolder);
            sb.append(", newHolder=");
            sb.append(this.newHolder);
            sb.append(", fromX=");
            sb.append(this.fromX);
            sb.append(", fromY=");
            sb.append(this.fromY);
            sb.append(", toX=");
            sb.append(this.toX);
            sb.append(", toY=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.toY, '}');
        }
    }

    public final class MoveInfo {
        public int fromX;
        public int fromY;
        public RecyclerView.ViewHolder holder;
        public int toX;
        public int toY;
    }

    public DefaultItemAnimator() {
        this.mListener = null;
        this.mFinishedListeners = new ArrayList();
        this.mAddDuration = 120L;
        this.mRemoveDuration = 120L;
        this.mMoveDuration = 250L;
        this.mChangeDuration = 250L;
        this.mSupportsChangeAnimations = true;
        this.mPendingRemovals = new ArrayList();
        this.mPendingAdditions = new ArrayList();
        this.mPendingMoves = new ArrayList();
        this.mPendingChanges = new ArrayList();
        this.mAdditionsList = new ArrayList();
        this.mMovesList = new ArrayList();
        this.mChangesList = new ArrayList();
        this.mAddAnimations = new ArrayList();
        this.mMoveAnimations = new ArrayList();
        this.mRemoveAnimations = new ArrayList();
        this.mChangeAnimations = new ArrayList();
    }

    public static void cancelAll(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((RecyclerView.ViewHolder) arrayList.get(size)).itemView.animate().cancel();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public final boolean animateChange(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2, Viewport viewport, Viewport viewport2) {
        int i;
        int i2;
        int i3 = viewport.width;
        int i4 = viewport.height;
        if (viewHolder2.shouldIgnore()) {
            int i5 = viewport.width;
            i2 = viewport.height;
            i = i5;
        } else {
            i = viewport2.width;
            i2 = viewport2.height;
        }
        if (viewHolder == viewHolder2) {
            return animateMove(viewHolder, i3, i4, i, i2);
        }
        float translationX = viewHolder.itemView.getTranslationX();
        float translationY = viewHolder.itemView.getTranslationY();
        float alpha = viewHolder.itemView.getAlpha();
        resetAnimation(viewHolder);
        viewHolder.itemView.setTranslationX(translationX);
        viewHolder.itemView.setTranslationY(translationY);
        viewHolder.itemView.setAlpha(alpha);
        resetAnimation(viewHolder2);
        viewHolder2.itemView.setTranslationX(-((int) ((i - i3) - translationX)));
        viewHolder2.itemView.setTranslationY(-((int) ((i2 - i4) - translationY)));
        viewHolder2.itemView.setAlpha(RecyclerView.DECELERATION_RATE);
        ChangeInfo changeInfo = new ChangeInfo();
        changeInfo.oldHolder = viewHolder;
        changeInfo.newHolder = viewHolder2;
        changeInfo.fromX = i3;
        changeInfo.fromY = i4;
        changeInfo.toX = i;
        changeInfo.toY = i2;
        this.mPendingChanges.add(changeInfo);
        return true;
    }

    public final boolean animateMove(RecyclerView.ViewHolder viewHolder, int i, int i2, int i3, int i4) {
        View view = viewHolder.itemView;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) viewHolder.itemView.getTranslationY());
        resetAnimation(viewHolder);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            dispatchAnimationFinished(viewHolder);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX(-i5);
        }
        if (i6 != 0) {
            view.setTranslationY(-i6);
        }
        MoveInfo moveInfo = new MoveInfo();
        moveInfo.holder = viewHolder;
        moveInfo.fromX = translationX;
        moveInfo.fromY = translationY;
        moveInfo.toX = i3;
        moveInfo.toY = i4;
        this.mPendingMoves.add(moveInfo);
        return true;
    }

    public final void dispatchFinishedWhenDone() {
        if (isRunning()) {
            return;
        }
        dispatchAnimationsFinished();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public void endAnimation(RecyclerView.ViewHolder viewHolder) {
        View view = viewHolder.itemView;
        view.animate().cancel();
        ArrayList arrayList = this.mPendingMoves;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((MoveInfo) arrayList.get(size)).holder == viewHolder) {
                view.setTranslationY(RecyclerView.DECELERATION_RATE);
                view.setTranslationX(RecyclerView.DECELERATION_RATE);
                dispatchAnimationFinished(viewHolder);
                arrayList.remove(size);
            }
        }
        endChangeAnimation(this.mPendingChanges, viewHolder);
        if (this.mPendingRemovals.remove(viewHolder)) {
            view.setAlpha(1.0f);
            dispatchAnimationFinished(viewHolder);
        }
        if (this.mPendingAdditions.remove(viewHolder)) {
            view.setAlpha(1.0f);
            dispatchAnimationFinished(viewHolder);
        }
        ArrayList arrayList2 = this.mChangesList;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList3 = (ArrayList) arrayList2.get(size2);
            endChangeAnimation(arrayList3, viewHolder);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList arrayList4 = this.mMovesList;
        for (int size3 = arrayList4.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList5 = (ArrayList) arrayList4.get(size3);
            int size4 = arrayList5.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                }
                if (((MoveInfo) arrayList5.get(size4)).holder == viewHolder) {
                    view.setTranslationY(RecyclerView.DECELERATION_RATE);
                    view.setTranslationX(RecyclerView.DECELERATION_RATE);
                    dispatchAnimationFinished(viewHolder);
                    arrayList5.remove(size4);
                    if (arrayList5.isEmpty()) {
                        arrayList4.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        ArrayList arrayList6 = this.mAdditionsList;
        for (int size5 = arrayList6.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList7 = (ArrayList) arrayList6.get(size5);
            if (arrayList7.remove(viewHolder)) {
                view.setAlpha(1.0f);
                dispatchAnimationFinished(viewHolder);
                if (arrayList7.isEmpty()) {
                    arrayList6.remove(size5);
                }
            }
        }
        this.mRemoveAnimations.remove(viewHolder);
        this.mAddAnimations.remove(viewHolder);
        this.mChangeAnimations.remove(viewHolder);
        this.mMoveAnimations.remove(viewHolder);
        dispatchFinishedWhenDone();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public void endAnimations() {
        ArrayList arrayList = this.mPendingMoves;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            MoveInfo moveInfo = (MoveInfo) arrayList.get(size);
            View view = moveInfo.holder.itemView;
            view.setTranslationY(RecyclerView.DECELERATION_RATE);
            view.setTranslationX(RecyclerView.DECELERATION_RATE);
            dispatchAnimationFinished(moveInfo.holder);
            arrayList.remove(size);
        }
        ArrayList arrayList2 = this.mPendingRemovals;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            dispatchAnimationFinished((RecyclerView.ViewHolder) arrayList2.get(size2));
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.mPendingAdditions;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.ViewHolder viewHolder = (RecyclerView.ViewHolder) arrayList3.get(size3);
            viewHolder.itemView.setAlpha(1.0f);
            dispatchAnimationFinished(viewHolder);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.mPendingChanges;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            ChangeInfo changeInfo = (ChangeInfo) arrayList4.get(size4);
            RecyclerView.ViewHolder viewHolder2 = changeInfo.oldHolder;
            if (viewHolder2 != null) {
                endChangeAnimationIfNecessary(changeInfo, viewHolder2);
            }
            RecyclerView.ViewHolder viewHolder3 = changeInfo.newHolder;
            if (viewHolder3 != null) {
                endChangeAnimationIfNecessary(changeInfo, viewHolder3);
            }
        }
        arrayList4.clear();
        if (isRunning()) {
            ArrayList arrayList5 = this.mMovesList;
            for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList6 = (ArrayList) arrayList5.get(size5);
                for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
                    MoveInfo moveInfo2 = (MoveInfo) arrayList6.get(size6);
                    View view2 = moveInfo2.holder.itemView;
                    view2.setTranslationY(RecyclerView.DECELERATION_RATE);
                    view2.setTranslationX(RecyclerView.DECELERATION_RATE);
                    dispatchAnimationFinished(moveInfo2.holder);
                    arrayList6.remove(size6);
                    if (arrayList6.isEmpty()) {
                        arrayList5.remove(arrayList6);
                    }
                }
            }
            ArrayList arrayList7 = this.mAdditionsList;
            for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList8 = (ArrayList) arrayList7.get(size7);
                for (int size8 = arrayList8.size() - 1; size8 >= 0; size8--) {
                    RecyclerView.ViewHolder viewHolder4 = (RecyclerView.ViewHolder) arrayList8.get(size8);
                    viewHolder4.itemView.setAlpha(1.0f);
                    dispatchAnimationFinished(viewHolder4);
                    arrayList8.remove(size8);
                    if (arrayList8.isEmpty()) {
                        arrayList7.remove(arrayList8);
                    }
                }
            }
            ArrayList arrayList9 = this.mChangesList;
            for (int size9 = arrayList9.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList10 = (ArrayList) arrayList9.get(size9);
                for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                    ChangeInfo changeInfo2 = (ChangeInfo) arrayList10.get(size10);
                    RecyclerView.ViewHolder viewHolder5 = changeInfo2.oldHolder;
                    if (viewHolder5 != null) {
                        endChangeAnimationIfNecessary(changeInfo2, viewHolder5);
                    }
                    RecyclerView.ViewHolder viewHolder6 = changeInfo2.newHolder;
                    if (viewHolder6 != null) {
                        endChangeAnimationIfNecessary(changeInfo2, viewHolder6);
                    }
                    if (arrayList10.isEmpty()) {
                        arrayList9.remove(arrayList10);
                    }
                }
            }
            cancelAll(this.mRemoveAnimations);
            cancelAll(this.mMoveAnimations);
            cancelAll(this.mAddAnimations);
            cancelAll(this.mChangeAnimations);
            dispatchAnimationsFinished();
        }
    }

    public final void endChangeAnimation(ArrayList arrayList, RecyclerView.ViewHolder viewHolder) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ChangeInfo changeInfo = (ChangeInfo) arrayList.get(size);
            if (endChangeAnimationIfNecessary(changeInfo, viewHolder) && changeInfo.oldHolder == null && changeInfo.newHolder == null) {
                arrayList.remove(changeInfo);
            }
        }
    }

    public final boolean endChangeAnimationIfNecessary(ChangeInfo changeInfo, RecyclerView.ViewHolder viewHolder) {
        if (changeInfo.newHolder == viewHolder) {
            changeInfo.newHolder = null;
        } else {
            if (changeInfo.oldHolder != viewHolder) {
                return false;
            }
            changeInfo.oldHolder = null;
        }
        viewHolder.itemView.setAlpha(1.0f);
        viewHolder.itemView.setTranslationX(RecyclerView.DECELERATION_RATE);
        viewHolder.itemView.setTranslationY(RecyclerView.DECELERATION_RATE);
        dispatchAnimationFinished(viewHolder);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public boolean isRunning() {
        return (this.mPendingAdditions.isEmpty() && this.mPendingChanges.isEmpty() && this.mPendingMoves.isEmpty() && this.mPendingRemovals.isEmpty() && this.mMoveAnimations.isEmpty() && this.mRemoveAnimations.isEmpty() && this.mAddAnimations.isEmpty() && this.mChangeAnimations.isEmpty() && this.mMovesList.isEmpty() && this.mAdditionsList.isEmpty() && this.mChangesList.isEmpty()) ? false : true;
    }

    public final void resetAnimation(RecyclerView.ViewHolder viewHolder) {
        if (sDefaultInterpolator == null) {
            sDefaultInterpolator = new ValueAnimator().getInterpolator();
        }
        viewHolder.itemView.animate().setInterpolator(sDefaultInterpolator);
        endAnimation(viewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public void runPendingAnimations() {
        long j = this.mRemoveDuration;
        ArrayList arrayList = this.mPendingRemovals;
        boolean isEmpty = arrayList.isEmpty();
        ArrayList arrayList2 = this.mPendingMoves;
        boolean isEmpty2 = arrayList2.isEmpty();
        ArrayList arrayList3 = this.mPendingChanges;
        boolean isEmpty3 = arrayList3.isEmpty();
        ArrayList arrayList4 = this.mPendingAdditions;
        boolean isEmpty4 = arrayList4.isEmpty();
        if (isEmpty && isEmpty2 && isEmpty4 && isEmpty3) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            RecyclerView.ViewHolder viewHolder = (RecyclerView.ViewHolder) it.next();
            View view = viewHolder.itemView;
            ViewPropertyAnimator animate = view.animate();
            this.mRemoveAnimations.add(viewHolder);
            animate.setDuration(j).alpha(RecyclerView.DECELERATION_RATE).setListener(new AnonymousClass4(viewHolder, animate, view)).start();
            arrayList = arrayList;
        }
        arrayList.clear();
        final int i = 0;
        if (!isEmpty2) {
            final ArrayList arrayList5 = new ArrayList();
            arrayList5.addAll(arrayList2);
            this.mMovesList.add(arrayList5);
            arrayList2.clear();
            Runnable runnable = new Runnable(this) { // from class: androidx.recyclerview.widget.DefaultItemAnimator.1
                public final /* synthetic */ DefaultItemAnimator this$0;

                {
                    this.this$0 = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i2 = i;
                    ArrayList arrayList6 = arrayList5;
                    switch (i2) {
                        case 0:
                            Iterator it2 = arrayList6.iterator();
                            while (true) {
                                boolean hasNext = it2.hasNext();
                                final DefaultItemAnimator defaultItemAnimator = this.this$0;
                                if (!hasNext) {
                                    arrayList6.clear();
                                    defaultItemAnimator.mMovesList.remove(arrayList6);
                                    break;
                                } else {
                                    MoveInfo moveInfo = (MoveInfo) it2.next();
                                    final RecyclerView.ViewHolder viewHolder2 = moveInfo.holder;
                                    int i3 = moveInfo.fromX;
                                    int i4 = moveInfo.fromY;
                                    int i5 = moveInfo.toX;
                                    int i6 = moveInfo.toY;
                                    final View view2 = viewHolder2.itemView;
                                    final int i7 = i5 - i3;
                                    final int i8 = i6 - i4;
                                    if (i7 != 0) {
                                        view2.animate().translationX(RecyclerView.DECELERATION_RATE);
                                    }
                                    if (i8 != 0) {
                                        view2.animate().translationY(RecyclerView.DECELERATION_RATE);
                                    }
                                    final ViewPropertyAnimator animate2 = view2.animate();
                                    defaultItemAnimator.mMoveAnimations.add(viewHolder2);
                                    animate2.setDuration(defaultItemAnimator.mMoveDuration).setListener(new AnimatorListenerAdapter() { // from class: androidx.recyclerview.widget.DefaultItemAnimator.6
                                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                                        public final void onAnimationCancel(Animator animator) {
                                            int i9 = i7;
                                            View view3 = view2;
                                            if (i9 != 0) {
                                                view3.setTranslationX(RecyclerView.DECELERATION_RATE);
                                            }
                                            if (i8 != 0) {
                                                view3.setTranslationY(RecyclerView.DECELERATION_RATE);
                                            }
                                        }

                                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                                        public final void onAnimationEnd(Animator animator) {
                                            animate2.setListener(null);
                                            DefaultItemAnimator defaultItemAnimator2 = DefaultItemAnimator.this;
                                            RecyclerView.ViewHolder viewHolder3 = viewHolder2;
                                            defaultItemAnimator2.dispatchAnimationFinished(viewHolder3);
                                            defaultItemAnimator2.mMoveAnimations.remove(viewHolder3);
                                            defaultItemAnimator2.dispatchFinishedWhenDone();
                                        }

                                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                                        public final void onAnimationStart(Animator animator) {
                                        }
                                    }).start();
                                }
                            }
                        case 1:
                            Iterator it3 = arrayList6.iterator();
                            while (true) {
                                boolean hasNext2 = it3.hasNext();
                                final DefaultItemAnimator defaultItemAnimator2 = this.this$0;
                                if (!hasNext2) {
                                    arrayList6.clear();
                                    defaultItemAnimator2.mChangesList.remove(arrayList6);
                                    break;
                                } else {
                                    final ChangeInfo changeInfo = (ChangeInfo) it3.next();
                                    ArrayList arrayList7 = defaultItemAnimator2.mChangeAnimations;
                                    long j2 = defaultItemAnimator2.mChangeDuration;
                                    RecyclerView.ViewHolder viewHolder3 = changeInfo.oldHolder;
                                    final View view3 = viewHolder3 == null ? null : viewHolder3.itemView;
                                    RecyclerView.ViewHolder viewHolder4 = changeInfo.newHolder;
                                    final View view4 = viewHolder4 != null ? viewHolder4.itemView : null;
                                    if (view3 != null) {
                                        final ViewPropertyAnimator duration = view3.animate().setDuration(j2);
                                        arrayList7.add(changeInfo.oldHolder);
                                        duration.translationX(changeInfo.toX - changeInfo.fromX);
                                        duration.translationY(changeInfo.toY - changeInfo.fromY);
                                        final int i9 = 0;
                                        duration.alpha(RecyclerView.DECELERATION_RATE).setListener(new AnimatorListenerAdapter() { // from class: androidx.recyclerview.widget.DefaultItemAnimator.7
                                            private final void onAnimationStart$androidx$recyclerview$widget$DefaultItemAnimator$7(Animator animator) {
                                            }

                                            private final void onAnimationStart$androidx$recyclerview$widget$DefaultItemAnimator$8(Animator animator) {
                                            }

                                            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                                            public final void onAnimationEnd(Animator animator) {
                                                int i10 = i9;
                                                ChangeInfo changeInfo2 = changeInfo;
                                                DefaultItemAnimator defaultItemAnimator3 = defaultItemAnimator2;
                                                View view5 = view3;
                                                ViewPropertyAnimator viewPropertyAnimator = duration;
                                                switch (i10) {
                                                    case 0:
                                                        viewPropertyAnimator.setListener(null);
                                                        view5.setAlpha(1.0f);
                                                        view5.setTranslationX(RecyclerView.DECELERATION_RATE);
                                                        view5.setTranslationY(RecyclerView.DECELERATION_RATE);
                                                        defaultItemAnimator3.dispatchAnimationFinished(changeInfo2.oldHolder);
                                                        defaultItemAnimator3.mChangeAnimations.remove(changeInfo2.oldHolder);
                                                        defaultItemAnimator3.dispatchFinishedWhenDone();
                                                        break;
                                                    default:
                                                        viewPropertyAnimator.setListener(null);
                                                        view5.setAlpha(1.0f);
                                                        view5.setTranslationX(RecyclerView.DECELERATION_RATE);
                                                        view5.setTranslationY(RecyclerView.DECELERATION_RATE);
                                                        defaultItemAnimator3.dispatchAnimationFinished(changeInfo2.newHolder);
                                                        defaultItemAnimator3.mChangeAnimations.remove(changeInfo2.newHolder);
                                                        defaultItemAnimator3.dispatchFinishedWhenDone();
                                                        break;
                                                }
                                            }

                                            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                                            public final void onAnimationStart(Animator animator) {
                                                int i10 = i9;
                                            }
                                        }).start();
                                    }
                                    if (view4 != null) {
                                        final ViewPropertyAnimator animate3 = view4.animate();
                                        arrayList7.add(changeInfo.newHolder);
                                        final int i10 = 1;
                                        animate3.translationX(RecyclerView.DECELERATION_RATE).translationY(RecyclerView.DECELERATION_RATE).setDuration(j2).alpha(1.0f).setListener(new AnimatorListenerAdapter() { // from class: androidx.recyclerview.widget.DefaultItemAnimator.7
                                            private final void onAnimationStart$androidx$recyclerview$widget$DefaultItemAnimator$7(Animator animator) {
                                            }

                                            private final void onAnimationStart$androidx$recyclerview$widget$DefaultItemAnimator$8(Animator animator) {
                                            }

                                            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                                            public final void onAnimationEnd(Animator animator) {
                                                int i102 = i10;
                                                ChangeInfo changeInfo2 = changeInfo;
                                                DefaultItemAnimator defaultItemAnimator3 = defaultItemAnimator2;
                                                View view5 = view4;
                                                ViewPropertyAnimator viewPropertyAnimator = animate3;
                                                switch (i102) {
                                                    case 0:
                                                        viewPropertyAnimator.setListener(null);
                                                        view5.setAlpha(1.0f);
                                                        view5.setTranslationX(RecyclerView.DECELERATION_RATE);
                                                        view5.setTranslationY(RecyclerView.DECELERATION_RATE);
                                                        defaultItemAnimator3.dispatchAnimationFinished(changeInfo2.oldHolder);
                                                        defaultItemAnimator3.mChangeAnimations.remove(changeInfo2.oldHolder);
                                                        defaultItemAnimator3.dispatchFinishedWhenDone();
                                                        break;
                                                    default:
                                                        viewPropertyAnimator.setListener(null);
                                                        view5.setAlpha(1.0f);
                                                        view5.setTranslationX(RecyclerView.DECELERATION_RATE);
                                                        view5.setTranslationY(RecyclerView.DECELERATION_RATE);
                                                        defaultItemAnimator3.dispatchAnimationFinished(changeInfo2.newHolder);
                                                        defaultItemAnimator3.mChangeAnimations.remove(changeInfo2.newHolder);
                                                        defaultItemAnimator3.dispatchFinishedWhenDone();
                                                        break;
                                                }
                                            }

                                            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                                            public final void onAnimationStart(Animator animator) {
                                                int i102 = i10;
                                            }
                                        }).start();
                                    }
                                }
                            }
                        default:
                            Iterator it4 = arrayList6.iterator();
                            while (true) {
                                boolean hasNext3 = it4.hasNext();
                                DefaultItemAnimator defaultItemAnimator3 = this.this$0;
                                if (!hasNext3) {
                                    arrayList6.clear();
                                    defaultItemAnimator3.mAdditionsList.remove(arrayList6);
                                    break;
                                } else {
                                    RecyclerView.ViewHolder viewHolder5 = (RecyclerView.ViewHolder) it4.next();
                                    View view5 = viewHolder5.itemView;
                                    ViewPropertyAnimator animate4 = view5.animate();
                                    defaultItemAnimator3.mAddAnimations.add(viewHolder5);
                                    animate4.alpha(1.0f).setDuration(defaultItemAnimator3.mAddDuration).setListener(defaultItemAnimator3.new AnonymousClass4(viewHolder5, view5, animate4)).start();
                                }
                            }
                    }
                }
            };
            if (isEmpty) {
                runnable.run();
            } else {
                View view2 = ((MoveInfo) arrayList5.get(0)).holder.itemView;
                WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
                view2.postOnAnimationDelayed(runnable, j);
            }
        }
        if (!isEmpty3) {
            final ArrayList arrayList6 = new ArrayList();
            arrayList6.addAll(arrayList3);
            this.mChangesList.add(arrayList6);
            arrayList3.clear();
            final int i2 = 1;
            Runnable runnable2 = new Runnable(this) { // from class: androidx.recyclerview.widget.DefaultItemAnimator.1
                public final /* synthetic */ DefaultItemAnimator this$0;

                {
                    this.this$0 = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i22 = i2;
                    ArrayList arrayList62 = arrayList6;
                    switch (i22) {
                        case 0:
                            Iterator it2 = arrayList62.iterator();
                            while (true) {
                                boolean hasNext = it2.hasNext();
                                final DefaultItemAnimator defaultItemAnimator = this.this$0;
                                if (!hasNext) {
                                    arrayList62.clear();
                                    defaultItemAnimator.mMovesList.remove(arrayList62);
                                    break;
                                } else {
                                    MoveInfo moveInfo = (MoveInfo) it2.next();
                                    final RecyclerView.ViewHolder viewHolder2 = moveInfo.holder;
                                    int i3 = moveInfo.fromX;
                                    int i4 = moveInfo.fromY;
                                    int i5 = moveInfo.toX;
                                    int i6 = moveInfo.toY;
                                    final View view22 = viewHolder2.itemView;
                                    final int i7 = i5 - i3;
                                    final int i8 = i6 - i4;
                                    if (i7 != 0) {
                                        view22.animate().translationX(RecyclerView.DECELERATION_RATE);
                                    }
                                    if (i8 != 0) {
                                        view22.animate().translationY(RecyclerView.DECELERATION_RATE);
                                    }
                                    final ViewPropertyAnimator animate2 = view22.animate();
                                    defaultItemAnimator.mMoveAnimations.add(viewHolder2);
                                    animate2.setDuration(defaultItemAnimator.mMoveDuration).setListener(new AnimatorListenerAdapter() { // from class: androidx.recyclerview.widget.DefaultItemAnimator.6
                                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                                        public final void onAnimationCancel(Animator animator) {
                                            int i9 = i7;
                                            View view3 = view22;
                                            if (i9 != 0) {
                                                view3.setTranslationX(RecyclerView.DECELERATION_RATE);
                                            }
                                            if (i8 != 0) {
                                                view3.setTranslationY(RecyclerView.DECELERATION_RATE);
                                            }
                                        }

                                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                                        public final void onAnimationEnd(Animator animator) {
                                            animate2.setListener(null);
                                            DefaultItemAnimator defaultItemAnimator2 = DefaultItemAnimator.this;
                                            RecyclerView.ViewHolder viewHolder3 = viewHolder2;
                                            defaultItemAnimator2.dispatchAnimationFinished(viewHolder3);
                                            defaultItemAnimator2.mMoveAnimations.remove(viewHolder3);
                                            defaultItemAnimator2.dispatchFinishedWhenDone();
                                        }

                                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                                        public final void onAnimationStart(Animator animator) {
                                        }
                                    }).start();
                                }
                            }
                        case 1:
                            Iterator it3 = arrayList62.iterator();
                            while (true) {
                                boolean hasNext2 = it3.hasNext();
                                final DefaultItemAnimator defaultItemAnimator2 = this.this$0;
                                if (!hasNext2) {
                                    arrayList62.clear();
                                    defaultItemAnimator2.mChangesList.remove(arrayList62);
                                    break;
                                } else {
                                    final ChangeInfo changeInfo = (ChangeInfo) it3.next();
                                    ArrayList arrayList7 = defaultItemAnimator2.mChangeAnimations;
                                    long j2 = defaultItemAnimator2.mChangeDuration;
                                    RecyclerView.ViewHolder viewHolder3 = changeInfo.oldHolder;
                                    final View view3 = viewHolder3 == null ? null : viewHolder3.itemView;
                                    RecyclerView.ViewHolder viewHolder4 = changeInfo.newHolder;
                                    final View view4 = viewHolder4 != null ? viewHolder4.itemView : null;
                                    if (view3 != null) {
                                        final ViewPropertyAnimator duration = view3.animate().setDuration(j2);
                                        arrayList7.add(changeInfo.oldHolder);
                                        duration.translationX(changeInfo.toX - changeInfo.fromX);
                                        duration.translationY(changeInfo.toY - changeInfo.fromY);
                                        final int i9 = 0;
                                        duration.alpha(RecyclerView.DECELERATION_RATE).setListener(new AnimatorListenerAdapter() { // from class: androidx.recyclerview.widget.DefaultItemAnimator.7
                                            private final void onAnimationStart$androidx$recyclerview$widget$DefaultItemAnimator$7(Animator animator) {
                                            }

                                            private final void onAnimationStart$androidx$recyclerview$widget$DefaultItemAnimator$8(Animator animator) {
                                            }

                                            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                                            public final void onAnimationEnd(Animator animator) {
                                                int i102 = i9;
                                                ChangeInfo changeInfo2 = changeInfo;
                                                DefaultItemAnimator defaultItemAnimator3 = defaultItemAnimator2;
                                                View view5 = view3;
                                                ViewPropertyAnimator viewPropertyAnimator = duration;
                                                switch (i102) {
                                                    case 0:
                                                        viewPropertyAnimator.setListener(null);
                                                        view5.setAlpha(1.0f);
                                                        view5.setTranslationX(RecyclerView.DECELERATION_RATE);
                                                        view5.setTranslationY(RecyclerView.DECELERATION_RATE);
                                                        defaultItemAnimator3.dispatchAnimationFinished(changeInfo2.oldHolder);
                                                        defaultItemAnimator3.mChangeAnimations.remove(changeInfo2.oldHolder);
                                                        defaultItemAnimator3.dispatchFinishedWhenDone();
                                                        break;
                                                    default:
                                                        viewPropertyAnimator.setListener(null);
                                                        view5.setAlpha(1.0f);
                                                        view5.setTranslationX(RecyclerView.DECELERATION_RATE);
                                                        view5.setTranslationY(RecyclerView.DECELERATION_RATE);
                                                        defaultItemAnimator3.dispatchAnimationFinished(changeInfo2.newHolder);
                                                        defaultItemAnimator3.mChangeAnimations.remove(changeInfo2.newHolder);
                                                        defaultItemAnimator3.dispatchFinishedWhenDone();
                                                        break;
                                                }
                                            }

                                            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                                            public final void onAnimationStart(Animator animator) {
                                                int i102 = i9;
                                            }
                                        }).start();
                                    }
                                    if (view4 != null) {
                                        final ViewPropertyAnimator animate3 = view4.animate();
                                        arrayList7.add(changeInfo.newHolder);
                                        final int i10 = 1;
                                        animate3.translationX(RecyclerView.DECELERATION_RATE).translationY(RecyclerView.DECELERATION_RATE).setDuration(j2).alpha(1.0f).setListener(new AnimatorListenerAdapter() { // from class: androidx.recyclerview.widget.DefaultItemAnimator.7
                                            private final void onAnimationStart$androidx$recyclerview$widget$DefaultItemAnimator$7(Animator animator) {
                                            }

                                            private final void onAnimationStart$androidx$recyclerview$widget$DefaultItemAnimator$8(Animator animator) {
                                            }

                                            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                                            public final void onAnimationEnd(Animator animator) {
                                                int i102 = i10;
                                                ChangeInfo changeInfo2 = changeInfo;
                                                DefaultItemAnimator defaultItemAnimator3 = defaultItemAnimator2;
                                                View view5 = view4;
                                                ViewPropertyAnimator viewPropertyAnimator = animate3;
                                                switch (i102) {
                                                    case 0:
                                                        viewPropertyAnimator.setListener(null);
                                                        view5.setAlpha(1.0f);
                                                        view5.setTranslationX(RecyclerView.DECELERATION_RATE);
                                                        view5.setTranslationY(RecyclerView.DECELERATION_RATE);
                                                        defaultItemAnimator3.dispatchAnimationFinished(changeInfo2.oldHolder);
                                                        defaultItemAnimator3.mChangeAnimations.remove(changeInfo2.oldHolder);
                                                        defaultItemAnimator3.dispatchFinishedWhenDone();
                                                        break;
                                                    default:
                                                        viewPropertyAnimator.setListener(null);
                                                        view5.setAlpha(1.0f);
                                                        view5.setTranslationX(RecyclerView.DECELERATION_RATE);
                                                        view5.setTranslationY(RecyclerView.DECELERATION_RATE);
                                                        defaultItemAnimator3.dispatchAnimationFinished(changeInfo2.newHolder);
                                                        defaultItemAnimator3.mChangeAnimations.remove(changeInfo2.newHolder);
                                                        defaultItemAnimator3.dispatchFinishedWhenDone();
                                                        break;
                                                }
                                            }

                                            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                                            public final void onAnimationStart(Animator animator) {
                                                int i102 = i10;
                                            }
                                        }).start();
                                    }
                                }
                            }
                        default:
                            Iterator it4 = arrayList62.iterator();
                            while (true) {
                                boolean hasNext3 = it4.hasNext();
                                DefaultItemAnimator defaultItemAnimator3 = this.this$0;
                                if (!hasNext3) {
                                    arrayList62.clear();
                                    defaultItemAnimator3.mAdditionsList.remove(arrayList62);
                                    break;
                                } else {
                                    RecyclerView.ViewHolder viewHolder5 = (RecyclerView.ViewHolder) it4.next();
                                    View view5 = viewHolder5.itemView;
                                    ViewPropertyAnimator animate4 = view5.animate();
                                    defaultItemAnimator3.mAddAnimations.add(viewHolder5);
                                    animate4.alpha(1.0f).setDuration(defaultItemAnimator3.mAddDuration).setListener(defaultItemAnimator3.new AnonymousClass4(viewHolder5, view5, animate4)).start();
                                }
                            }
                    }
                }
            };
            if (isEmpty) {
                runnable2.run();
            } else {
                View view3 = ((ChangeInfo) arrayList6.get(0)).oldHolder.itemView;
                WeakHashMap weakHashMap2 = ViewCompat.sViewPropertyAnimatorMap;
                view3.postOnAnimationDelayed(runnable2, j);
            }
        }
        if (isEmpty4) {
            return;
        }
        final ArrayList arrayList7 = new ArrayList();
        arrayList7.addAll(arrayList4);
        this.mAdditionsList.add(arrayList7);
        arrayList4.clear();
        final int i3 = 2;
        Runnable runnable3 = new Runnable(this) { // from class: androidx.recyclerview.widget.DefaultItemAnimator.1
            public final /* synthetic */ DefaultItemAnimator this$0;

            {
                this.this$0 = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i22 = i3;
                ArrayList arrayList62 = arrayList7;
                switch (i22) {
                    case 0:
                        Iterator it2 = arrayList62.iterator();
                        while (true) {
                            boolean hasNext = it2.hasNext();
                            final DefaultItemAnimator defaultItemAnimator = this.this$0;
                            if (!hasNext) {
                                arrayList62.clear();
                                defaultItemAnimator.mMovesList.remove(arrayList62);
                                break;
                            } else {
                                MoveInfo moveInfo = (MoveInfo) it2.next();
                                final RecyclerView.ViewHolder viewHolder2 = moveInfo.holder;
                                int i32 = moveInfo.fromX;
                                int i4 = moveInfo.fromY;
                                int i5 = moveInfo.toX;
                                int i6 = moveInfo.toY;
                                final View view22 = viewHolder2.itemView;
                                final int i7 = i5 - i32;
                                final int i8 = i6 - i4;
                                if (i7 != 0) {
                                    view22.animate().translationX(RecyclerView.DECELERATION_RATE);
                                }
                                if (i8 != 0) {
                                    view22.animate().translationY(RecyclerView.DECELERATION_RATE);
                                }
                                final ViewPropertyAnimator animate2 = view22.animate();
                                defaultItemAnimator.mMoveAnimations.add(viewHolder2);
                                animate2.setDuration(defaultItemAnimator.mMoveDuration).setListener(new AnimatorListenerAdapter() { // from class: androidx.recyclerview.widget.DefaultItemAnimator.6
                                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                                    public final void onAnimationCancel(Animator animator) {
                                        int i9 = i7;
                                        View view32 = view22;
                                        if (i9 != 0) {
                                            view32.setTranslationX(RecyclerView.DECELERATION_RATE);
                                        }
                                        if (i8 != 0) {
                                            view32.setTranslationY(RecyclerView.DECELERATION_RATE);
                                        }
                                    }

                                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                                    public final void onAnimationEnd(Animator animator) {
                                        animate2.setListener(null);
                                        DefaultItemAnimator defaultItemAnimator2 = DefaultItemAnimator.this;
                                        RecyclerView.ViewHolder viewHolder3 = viewHolder2;
                                        defaultItemAnimator2.dispatchAnimationFinished(viewHolder3);
                                        defaultItemAnimator2.mMoveAnimations.remove(viewHolder3);
                                        defaultItemAnimator2.dispatchFinishedWhenDone();
                                    }

                                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                                    public final void onAnimationStart(Animator animator) {
                                    }
                                }).start();
                            }
                        }
                    case 1:
                        Iterator it3 = arrayList62.iterator();
                        while (true) {
                            boolean hasNext2 = it3.hasNext();
                            final DefaultItemAnimator defaultItemAnimator2 = this.this$0;
                            if (!hasNext2) {
                                arrayList62.clear();
                                defaultItemAnimator2.mChangesList.remove(arrayList62);
                                break;
                            } else {
                                final ChangeInfo changeInfo = (ChangeInfo) it3.next();
                                ArrayList arrayList72 = defaultItemAnimator2.mChangeAnimations;
                                long j2 = defaultItemAnimator2.mChangeDuration;
                                RecyclerView.ViewHolder viewHolder3 = changeInfo.oldHolder;
                                final View view32 = viewHolder3 == null ? null : viewHolder3.itemView;
                                RecyclerView.ViewHolder viewHolder4 = changeInfo.newHolder;
                                final View view4 = viewHolder4 != null ? viewHolder4.itemView : null;
                                if (view32 != null) {
                                    final ViewPropertyAnimator duration = view32.animate().setDuration(j2);
                                    arrayList72.add(changeInfo.oldHolder);
                                    duration.translationX(changeInfo.toX - changeInfo.fromX);
                                    duration.translationY(changeInfo.toY - changeInfo.fromY);
                                    final int i9 = 0;
                                    duration.alpha(RecyclerView.DECELERATION_RATE).setListener(new AnimatorListenerAdapter() { // from class: androidx.recyclerview.widget.DefaultItemAnimator.7
                                        private final void onAnimationStart$androidx$recyclerview$widget$DefaultItemAnimator$7(Animator animator) {
                                        }

                                        private final void onAnimationStart$androidx$recyclerview$widget$DefaultItemAnimator$8(Animator animator) {
                                        }

                                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                                        public final void onAnimationEnd(Animator animator) {
                                            int i102 = i9;
                                            ChangeInfo changeInfo2 = changeInfo;
                                            DefaultItemAnimator defaultItemAnimator3 = defaultItemAnimator2;
                                            View view5 = view32;
                                            ViewPropertyAnimator viewPropertyAnimator = duration;
                                            switch (i102) {
                                                case 0:
                                                    viewPropertyAnimator.setListener(null);
                                                    view5.setAlpha(1.0f);
                                                    view5.setTranslationX(RecyclerView.DECELERATION_RATE);
                                                    view5.setTranslationY(RecyclerView.DECELERATION_RATE);
                                                    defaultItemAnimator3.dispatchAnimationFinished(changeInfo2.oldHolder);
                                                    defaultItemAnimator3.mChangeAnimations.remove(changeInfo2.oldHolder);
                                                    defaultItemAnimator3.dispatchFinishedWhenDone();
                                                    break;
                                                default:
                                                    viewPropertyAnimator.setListener(null);
                                                    view5.setAlpha(1.0f);
                                                    view5.setTranslationX(RecyclerView.DECELERATION_RATE);
                                                    view5.setTranslationY(RecyclerView.DECELERATION_RATE);
                                                    defaultItemAnimator3.dispatchAnimationFinished(changeInfo2.newHolder);
                                                    defaultItemAnimator3.mChangeAnimations.remove(changeInfo2.newHolder);
                                                    defaultItemAnimator3.dispatchFinishedWhenDone();
                                                    break;
                                            }
                                        }

                                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                                        public final void onAnimationStart(Animator animator) {
                                            int i102 = i9;
                                        }
                                    }).start();
                                }
                                if (view4 != null) {
                                    final ViewPropertyAnimator animate3 = view4.animate();
                                    arrayList72.add(changeInfo.newHolder);
                                    final int i10 = 1;
                                    animate3.translationX(RecyclerView.DECELERATION_RATE).translationY(RecyclerView.DECELERATION_RATE).setDuration(j2).alpha(1.0f).setListener(new AnimatorListenerAdapter() { // from class: androidx.recyclerview.widget.DefaultItemAnimator.7
                                        private final void onAnimationStart$androidx$recyclerview$widget$DefaultItemAnimator$7(Animator animator) {
                                        }

                                        private final void onAnimationStart$androidx$recyclerview$widget$DefaultItemAnimator$8(Animator animator) {
                                        }

                                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                                        public final void onAnimationEnd(Animator animator) {
                                            int i102 = i10;
                                            ChangeInfo changeInfo2 = changeInfo;
                                            DefaultItemAnimator defaultItemAnimator3 = defaultItemAnimator2;
                                            View view5 = view4;
                                            ViewPropertyAnimator viewPropertyAnimator = animate3;
                                            switch (i102) {
                                                case 0:
                                                    viewPropertyAnimator.setListener(null);
                                                    view5.setAlpha(1.0f);
                                                    view5.setTranslationX(RecyclerView.DECELERATION_RATE);
                                                    view5.setTranslationY(RecyclerView.DECELERATION_RATE);
                                                    defaultItemAnimator3.dispatchAnimationFinished(changeInfo2.oldHolder);
                                                    defaultItemAnimator3.mChangeAnimations.remove(changeInfo2.oldHolder);
                                                    defaultItemAnimator3.dispatchFinishedWhenDone();
                                                    break;
                                                default:
                                                    viewPropertyAnimator.setListener(null);
                                                    view5.setAlpha(1.0f);
                                                    view5.setTranslationX(RecyclerView.DECELERATION_RATE);
                                                    view5.setTranslationY(RecyclerView.DECELERATION_RATE);
                                                    defaultItemAnimator3.dispatchAnimationFinished(changeInfo2.newHolder);
                                                    defaultItemAnimator3.mChangeAnimations.remove(changeInfo2.newHolder);
                                                    defaultItemAnimator3.dispatchFinishedWhenDone();
                                                    break;
                                            }
                                        }

                                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                                        public final void onAnimationStart(Animator animator) {
                                            int i102 = i10;
                                        }
                                    }).start();
                                }
                            }
                        }
                    default:
                        Iterator it4 = arrayList62.iterator();
                        while (true) {
                            boolean hasNext3 = it4.hasNext();
                            DefaultItemAnimator defaultItemAnimator3 = this.this$0;
                            if (!hasNext3) {
                                arrayList62.clear();
                                defaultItemAnimator3.mAdditionsList.remove(arrayList62);
                                break;
                            } else {
                                RecyclerView.ViewHolder viewHolder5 = (RecyclerView.ViewHolder) it4.next();
                                View view5 = viewHolder5.itemView;
                                ViewPropertyAnimator animate4 = view5.animate();
                                defaultItemAnimator3.mAddAnimations.add(viewHolder5);
                                animate4.alpha(1.0f).setDuration(defaultItemAnimator3.mAddDuration).setListener(defaultItemAnimator3.new AnonymousClass4(viewHolder5, view5, animate4)).start();
                            }
                        }
                }
            }
        };
        if (isEmpty && isEmpty2 && isEmpty3) {
            runnable3.run();
            return;
        }
        if (isEmpty) {
            j = 0;
        }
        long max = Math.max(!isEmpty2 ? this.mMoveDuration : 0L, isEmpty3 ? 0L : this.mChangeDuration) + j;
        View view4 = ((RecyclerView.ViewHolder) arrayList7.get(0)).itemView;
        WeakHashMap weakHashMap3 = ViewCompat.sViewPropertyAnimatorMap;
        view4.postOnAnimationDelayed(runnable3, max);
    }

    /* renamed from: androidx.recyclerview.widget.DefaultItemAnimator$4, reason: invalid class name */
    public final class AnonymousClass4 extends AnimatorListenerAdapter {
        public final /* synthetic */ int $r8$classId = 1;
        public final /* synthetic */ ViewPropertyAnimator val$animation;
        public final /* synthetic */ RecyclerView.ViewHolder val$holder;
        public final /* synthetic */ View val$view;

        public AnonymousClass4(RecyclerView.ViewHolder viewHolder, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.val$holder = viewHolder;
            this.val$animation = viewPropertyAnimator;
            this.val$view = view;
        }

        private final void onAnimationStart$androidx$recyclerview$widget$DefaultItemAnimator$4(Animator animator) {
        }

        private final void onAnimationStart$androidx$recyclerview$widget$DefaultItemAnimator$5(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            switch (this.$r8$classId) {
                case 1:
                    this.val$view.setAlpha(1.0f);
                    break;
                default:
                    super.onAnimationCancel(animator);
                    break;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            int i = this.$r8$classId;
            RecyclerView.ViewHolder viewHolder = this.val$holder;
            DefaultItemAnimator defaultItemAnimator = DefaultItemAnimator.this;
            ViewPropertyAnimator viewPropertyAnimator = this.val$animation;
            switch (i) {
                case 0:
                    viewPropertyAnimator.setListener(null);
                    this.val$view.setAlpha(1.0f);
                    defaultItemAnimator.dispatchAnimationFinished(viewHolder);
                    defaultItemAnimator.mRemoveAnimations.remove(viewHolder);
                    defaultItemAnimator.dispatchFinishedWhenDone();
                    break;
                default:
                    viewPropertyAnimator.setListener(null);
                    defaultItemAnimator.dispatchAnimationFinished(viewHolder);
                    defaultItemAnimator.mAddAnimations.remove(viewHolder);
                    defaultItemAnimator.dispatchFinishedWhenDone();
                    break;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            int i = this.$r8$classId;
        }

        public AnonymousClass4(RecyclerView.ViewHolder viewHolder, View view, ViewPropertyAnimator viewPropertyAnimator) {
            this.val$holder = viewHolder;
            this.val$view = view;
            this.val$animation = viewPropertyAnimator;
        }
    }
}
