package B0;

import O.O;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.res.ColorStateList;
import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class c extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f39b;

    public /* synthetic */ c(int i, Object obj) {
        this.f38a = i;
        this.f39b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f38a) {
            case 2:
                ((O) this.f39b).b();
                break;
            case 5:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f39b;
                actionBarOverlayLayout.f1818w = null;
                actionBarOverlayLayout.j = false;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f38a) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f39b;
                bottomSheetBehavior.I(5);
                WeakReference weakReference = bottomSheetBehavior.f2385U;
                if (weakReference != null && weakReference.get() != null) {
                    ((View) bottomSheetBehavior.f2385U.get()).requestLayout();
                    break;
                }
                break;
            case 1:
                M0.i iVar = (M0.i) this.f39b;
                iVar.f606b.setTranslationY(RecyclerView.f2111C0);
                iVar.b(RecyclerView.f2111C0);
                break;
            case 2:
                ((O) this.f39b).a();
                break;
            case 3:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f39b;
                sideSheetBehavior.w(5);
                WeakReference weakReference2 = sideSheetBehavior.f2576p;
                if (weakReference2 != null && weakReference2.get() != null) {
                    ((View) sideSheetBehavior.f2576p.get()).requestLayout();
                    break;
                }
                break;
            case 4:
                V0.k kVar = (V0.k) this.f39b;
                kVar.q();
                kVar.f1290r.start();
                break;
            case 5:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f39b;
                actionBarOverlayLayout.f1818w = null;
                actionBarOverlayLayout.j = false;
                break;
            case 6:
                ((p0.m) this.f39b).m();
                animator.removeListener(this);
                break;
            case 7:
                q0.f fVar = (q0.f) this.f39b;
                ArrayList arrayList = new ArrayList(fVar.e);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ColorStateList colorStateList = ((F0.a) arrayList.get(i)).f233b.f247o;
                    if (colorStateList != null) {
                        fVar.setTintList(colorStateList);
                    }
                }
                break;
            default:
                ((HideBottomViewOnScrollBehavior) this.f39b).f2359h = null;
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f38a) {
            case 2:
                ((O) this.f39b).c();
                break;
            case 7:
                q0.f fVar = (q0.f) this.f39b;
                ArrayList arrayList = new ArrayList(fVar.e);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    F0.d dVar = ((F0.a) arrayList.get(i)).f233b;
                    ColorStateList colorStateList = dVar.f247o;
                    if (colorStateList != null) {
                        fVar.setTint(colorStateList.getColorForState(dVar.f251s, colorStateList.getDefaultColor()));
                    }
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public c(O o2, View view) {
        this.f38a = 2;
        this.f39b = o2;
    }
}
