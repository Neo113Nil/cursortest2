package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.cardview.widget.CardView;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.behavior.HideViewOnScrollBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.google.android.material.transformation.ExpandableTransformationBehavior;
import com.yandex.passport.internal.widget.ErrorView;
import com.yandex.plus.home.feature.webviews.internal.container.j;
import com.yandex.plus.plaquesdk.design.e;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class le extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ le(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.b;
                actionBarOverlayLayout.w = null;
                actionBarOverlayLayout.j = false;
                break;
            case 6:
                ((ts2) this.b).m();
                break;
            case 15:
                animator.getClass();
                ((j) this.b).c.invoke();
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        WeakReference weakReference;
        WeakReference weakReference2;
        WeakReference weakReference3;
        switch (this.a) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.b;
                actionBarOverlayLayout.w = null;
                actionBarOverlayLayout.j = false;
                break;
            case 1:
                pl0 pl0Var = (pl0) this.b;
                ArrayList arrayList = new ArrayList(pl0Var.e);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((ek0) arrayList.get(i)).a(pl0Var);
                }
                break;
            case 2:
                Function0<Unit> swipeOutCallback = ((mm9) this.b).getSwipeOutCallback();
                if (swipeOutCallback != null) {
                    swipeOutCallback.invoke();
                    break;
                }
                break;
            case 3:
                animator.getClass();
                xdh xdhVar = ((f2a) this.b).a;
                ((CardView) xdhVar.c).setVisibility(8);
                ((View) xdhVar.b).setAlpha(1.0f);
                break;
            case 4:
                wra wraVar = (wra) this.b;
                wraVar.p();
                wraVar.r.start();
                break;
            case 5:
                ((ExpandableTransformationBehavior) this.b).currentAnimation = null;
                break;
            case 6:
                ((ts2) this.b).n();
                break;
            case 7:
                ((HideBottomViewOnScrollBehavior) this.b).currentAnimator = null;
                break;
            case 8:
                ((HideViewOnScrollBehavior) this.b).currentAnimator = null;
                break;
            case 9:
            default:
                super.onAnimationEnd(animator);
                break;
            case 10:
                rch rchVar = (rch) this.b;
                ((View) rchVar.e).setTranslationY(0.0f);
                rchVar.g(0.0f);
                break;
            case 11:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.b;
                sideSheetBehavior.setStateInternal(5);
                weakReference = sideSheetBehavior.viewRef;
                if (weakReference != null) {
                    weakReference2 = sideSheetBehavior.viewRef;
                    if (weakReference2.get() != null) {
                        weakReference3 = sideSheetBehavior.viewRef;
                        ((View) weakReference3.get()).requestLayout();
                        break;
                    }
                }
                break;
            case 12:
                ((b8t) this.b).q();
                animator.removeListener(this);
                break;
            case 13:
                animator.getClass();
                super/*android.app.Activity*/.finish();
                break;
            case 14:
                animator.getClass();
                ErrorView errorView = (ErrorView) this.b;
                errorView.o = true;
                Iterator it = errorView.n.iterator();
                while (it.hasNext()) {
                    ((Function0) it.next()).invoke();
                }
                break;
            case 15:
                animator.getClass();
                ((j) this.b).c.invoke();
                break;
            case 16:
                ((e) this.b).e = null;
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
        switch (this.a) {
            case 9:
                super.onAnimationRepeat(animator);
                t6g t6gVar = (t6g) this.b;
                t6gVar.g = (t6gVar.g + 1) % t6gVar.f.e.length;
                t6gVar.h = true;
                break;
            default:
                super.onAnimationRepeat(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 1:
                pl0 pl0Var = (pl0) this.b;
                ArrayList arrayList = new ArrayList(pl0Var.e);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((ek0) arrayList.get(i)).b(pl0Var);
                }
                break;
            case 6:
                ((ts2) this.b).o(animator);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
