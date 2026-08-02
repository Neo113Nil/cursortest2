package androidx.fragment.app;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import androidx.camera.video.Recorder;
import androidx.core.os.CancellationSignal;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.FragmentTransitionImpl;
import androidx.recyclerview.widget.AsyncListDiffer;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import com.bugsnag.android.Client;
import com.google.android.gms.measurement.internal.zzgy;
import com.google.android.gms.measurement.internal.zzll;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes3.dex */
public abstract class FragmentTransitionImpl {
    public static void bfsAddViewChildren(List list, View view) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (list.get(i) == view) {
                return;
            }
        }
        WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
        if (view.getTransitionName() != null) {
            list.add(view);
        }
        for (int i2 = size; i2 < list.size(); i2++) {
            View view2 = (View) list.get(i2);
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                int childCount = viewGroup.getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    View childAt = viewGroup.getChildAt(i3);
                    int i4 = 0;
                    while (true) {
                        if (i4 < size) {
                            if (list.get(i4) == childAt) {
                                break;
                            } else {
                                i4++;
                            }
                        } else if (childAt.getTransitionName() != null) {
                            list.add(childAt);
                        }
                    }
                }
            }
        }
    }

    public static void getBoundsOnScreen(Rect rect, View view) {
        if (view.isAttachedToWindow()) {
            RectF rectF = new RectF();
            rectF.set(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, view.getWidth(), view.getHeight());
            view.getMatrix().mapRect(rectF);
            rectF.offset(view.getLeft(), view.getTop());
            Object parent = view.getParent();
            while (parent instanceof View) {
                View view2 = (View) parent;
                rectF.offset(-view2.getScrollX(), -view2.getScrollY());
                view2.getMatrix().mapRect(rectF);
                rectF.offset(view2.getLeft(), view2.getTop());
                parent = view2.getParent();
            }
            view.getRootView().getLocationOnScreen(new int[2]);
            rectF.offset(r1[0], r1[1]);
            rect.set(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
        }
    }

    public static boolean isNullOrEmpty(List list) {
        return list == null || list.isEmpty();
    }

    public abstract void addTarget(View view, Object obj);

    public abstract void addTargets(Object obj, ArrayList arrayList);

    public void animateToEnd(Object obj) {
    }

    public void animateToStart(Object obj, DefaultSpecialEffectsController$TransitionEffect$$ExternalSyntheticLambda4 defaultSpecialEffectsController$TransitionEffect$$ExternalSyntheticLambda4) {
    }

    public abstract void beginDelayedTransition(ViewGroup viewGroup, Object obj);

    public abstract boolean canHandle(Object obj);

    public abstract Object cloneTransition(Object obj);

    public Object controlDelayedTransition(ViewGroup viewGroup, Object obj) {
        return null;
    }

    public abstract boolean isSeekingSupported();

    public abstract boolean isSeekingSupported(Object obj);

    public abstract Object mergeTransitionsInSequence(Object obj, Object obj2, Object obj3);

    public abstract Object mergeTransitionsTogether(Object obj, Object obj2);

    public abstract void scheduleHideFragmentView(Object obj, View view, ArrayList arrayList);

    public abstract void scheduleRemoveTargets(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2);

    public void setCurrentPlayTime(Object obj, float f) {
    }

    public abstract void setEpicenter(View view, Object obj);

    public abstract void setEpicenter(Object obj, Rect rect);

    public abstract void setListenerForTransitionEnd(Fragment fragment, Object obj, CancellationSignal cancellationSignal, Runnable runnable);

    public void setListenerForTransitionEnd(Object obj, CancellationSignal cancellationSignal, Fragment$$ExternalSyntheticLambda1 fragment$$ExternalSyntheticLambda1, Runnable runnable) {
        ((DefaultSpecialEffectsController$TransitionEffect$$ExternalSyntheticLambda1) runnable).run();
    }

    public abstract void setSharedElementTargets(Object obj, View view, ArrayList arrayList);

    public abstract void swapSharedElementTargets(Object obj, ArrayList arrayList, ArrayList arrayList2);

    public abstract Object wrapTransitionInSet(Object obj);

    /* renamed from: androidx.fragment.app.FragmentTransitionImpl$1, reason: invalid class name */
    public final class AnonymousClass1 implements Runnable {
        public final /* synthetic */ int $r8$classId = 0;
        public final /* synthetic */ Object val$inNames;
        public final /* synthetic */ int val$numSharedElements;
        public final /* synthetic */ Object val$outNames;
        public final /* synthetic */ Object val$sharedElementsIn;
        public final /* synthetic */ Object val$sharedElementsOut;

        public /* synthetic */ AnonymousClass1(zzgy zzgyVar, int i, Exception exc, byte[] bArr, Map map) {
            this.val$sharedElementsIn = zzgyVar;
            this.val$numSharedElements = i;
            this.val$inNames = exc;
            this.val$sharedElementsOut = bArr;
            this.val$outNames = map;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public final void run() {
            int i = this.$r8$classId;
            Object[] objArr = 0;
            Object obj = this.val$sharedElementsOut;
            Object obj2 = this.val$inNames;
            Object obj3 = this.val$sharedElementsIn;
            Object obj4 = this.val$outNames;
            switch (i) {
                case 0:
                    break;
                case 1:
                    Recorder.SetupVideoTask calculateDiff = DiffUtil.calculateDiff(new DiffUtil.Callback() { // from class: androidx.recyclerview.widget.AsyncListDiffer$1$1
                        @Override // androidx.recyclerview.widget.DiffUtil.Callback
                        public final boolean areContentsTheSame(int i2, int i3) {
                            FragmentTransitionImpl.AnonymousClass1 anonymousClass1 = FragmentTransitionImpl.AnonymousClass1.this;
                            Object obj5 = ((List) anonymousClass1.val$sharedElementsIn).get(i2);
                            Object obj6 = ((List) anonymousClass1.val$inNames).get(i3);
                            if (obj5 != null && obj6 != null) {
                                return ((DiffUtil) ((AsyncListDiffer) anonymousClass1.val$outNames).mConfig.renderOptions).areContentsTheSame(obj5, obj6);
                            }
                            if (obj5 == null && obj6 == null) {
                                return true;
                            }
                            Path$$ExternalSyntheticBUOutline0.m$2();
                            return false;
                        }

                        @Override // androidx.recyclerview.widget.DiffUtil.Callback
                        public final boolean areItemsTheSame(int i2, int i3) {
                            FragmentTransitionImpl.AnonymousClass1 anonymousClass1 = FragmentTransitionImpl.AnonymousClass1.this;
                            Object obj5 = ((List) anonymousClass1.val$sharedElementsIn).get(i2);
                            Object obj6 = ((List) anonymousClass1.val$inNames).get(i3);
                            return (obj5 == null || obj6 == null) ? obj5 == null && obj6 == null : ((DiffUtil) ((AsyncListDiffer) anonymousClass1.val$outNames).mConfig.renderOptions).areItemsTheSame(obj5, obj6);
                        }

                        @Override // androidx.recyclerview.widget.DiffUtil.Callback
                        public final Object getChangePayload(int i2, int i3) {
                            FragmentTransitionImpl.AnonymousClass1 anonymousClass1 = FragmentTransitionImpl.AnonymousClass1.this;
                            Object obj5 = ((List) anonymousClass1.val$sharedElementsIn).get(i2);
                            Object obj6 = ((List) anonymousClass1.val$inNames).get(i3);
                            if (obj5 != null && obj6 != null) {
                                return ((DiffUtil) ((AsyncListDiffer) anonymousClass1.val$outNames).mConfig.renderOptions).getChangePayload(obj5, obj6);
                            }
                            Path$$ExternalSyntheticBUOutline0.m$2();
                            return null;
                        }

                        @Override // androidx.recyclerview.widget.DiffUtil.Callback
                        public final int getNewListSize() {
                            return ((List) FragmentTransitionImpl.AnonymousClass1.this.val$inNames).size();
                        }

                        @Override // androidx.recyclerview.widget.DiffUtil.Callback
                        public final int getOldListSize() {
                            return ((List) FragmentTransitionImpl.AnonymousClass1.this.val$sharedElementsIn).size();
                        }
                    });
                    ((AsyncListDiffer) obj4).mMainThreadExecutor.execute(new Client.AnonymousClass4(this, calculateDiff, objArr == true ? 1 : 0, 8));
                    return;
                default:
                    zzgy zzgyVar = (zzgy) obj3;
                    ((zzll) zzgyVar.zzd).zza(zzgyVar.zze, this.val$numSharedElements, (Exception) obj2, (byte[]) obj, (Map) obj4);
                    return;
            }
            for (int i2 = 0; i2 < this.val$numSharedElements; i2++) {
                View view = (View) ((ArrayList) obj3).get(i2);
                String str = (String) ((ArrayList) obj2).get(i2);
                WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
                view.setTransitionName(str);
                ((View) ((ArrayList) obj).get(i2)).setTransitionName((String) ((ArrayList) obj4).get(i2));
            }
        }

        public AnonymousClass1(int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
            this.val$numSharedElements = i;
            this.val$sharedElementsIn = arrayList;
            this.val$inNames = arrayList2;
            this.val$sharedElementsOut = arrayList3;
            this.val$outNames = arrayList4;
        }

        public AnonymousClass1(AsyncListDiffer asyncListDiffer, List list, List list2, int i, Runnable runnable) {
            this.val$outNames = asyncListDiffer;
            this.val$sharedElementsIn = list;
            this.val$inNames = list2;
            this.val$numSharedElements = i;
            this.val$sharedElementsOut = runnable;
        }
    }
}
