package D0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.res.ColorStateList;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import java.util.ArrayList;
import java.util.Objects;
import u3.C5068a;
import u3.C5070c;

/* loaded from: classes.dex */
public final class k extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f463a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f464b;

    public /* synthetic */ k(int i, Object obj) {
        this.f463a = i;
        this.f464b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f463a) {
            case 3:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f464b;
                actionBarOverlayLayout.f4514P = null;
                actionBarOverlayLayout.f4502C = false;
                break;
            case 4:
            default:
                super.onAnimationCancel(animator);
                break;
            case 5:
                v2.m mVar = (v2.m) this.f464b;
                mVar.setEnabled(true);
                mVar.f41145n.setEnabled(true);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f463a) {
            case 0:
                ((o) this.f464b).r();
                animator.removeListener(this);
                break;
            case 1:
                E0.f fVar = (E0.f) this.f464b;
                ArrayList arrayList = new ArrayList(fVar.f648x);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ColorStateList colorStateList = ((C5068a) arrayList.get(i)).f41018b.f41031H;
                    if (colorStateList != null) {
                        H.a.h(fVar, colorStateList);
                    }
                }
                break;
            case 2:
                J3.m mVar = (J3.m) this.f464b;
                mVar.q();
                mVar.f1497r.start();
                break;
            case 3:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f464b;
                actionBarOverlayLayout.f4514P = null;
                actionBarOverlayLayout.f4502C = false;
                break;
            case 4:
                ((HideBottomViewOnScrollBehavior) this.f464b).f36590h = null;
                break;
            default:
                v2.m mVar2 = (v2.m) this.f464b;
                mVar2.setEnabled(true);
                mVar2.f41145n.setEnabled(true);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f463a) {
            case 1:
                E0.f fVar = (E0.f) this.f464b;
                ArrayList arrayList = new ArrayList(fVar.f648x);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    C5070c c5070c = ((C5068a) arrayList.get(i)).f41018b;
                    ColorStateList colorStateList = c5070c.f41031H;
                    if (colorStateList != null) {
                        H.a.g(fVar, colorStateList.getColorForState(c5070c.f41034L, colorStateList.getDefaultColor()));
                    }
                }
                break;
            case 5:
                v2.m mVar = (v2.m) this.f464b;
                mVar.setEnabled(false);
                mVar.f41145n.setEnabled(false);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public k(v2.m mVar) {
        this.f463a = 5;
        Objects.requireNonNull(mVar);
        this.f464b = mVar;
    }
}
