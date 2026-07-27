package D0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.res.ColorStateList;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import java.util.ArrayList;
import java.util.Objects;
import s3.C4972a;
import s3.C4974c;

/* loaded from: classes.dex */
public final class k extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f568a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f569b;

    public /* synthetic */ k(int i, Object obj) {
        this.f568a = i;
        this.f569b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f568a) {
            case 3:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f569b;
                actionBarOverlayLayout.f4546P = null;
                actionBarOverlayLayout.f4534C = false;
                break;
            case 4:
            default:
                super.onAnimationCancel(animator);
                break;
            case 5:
                t2.m mVar = (t2.m) this.f569b;
                mVar.setEnabled(true);
                mVar.f40854n.setEnabled(true);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f568a) {
            case 0:
                ((o) this.f569b).r();
                animator.removeListener(this);
                break;
            case 1:
                E0.f fVar = (E0.f) this.f569b;
                ArrayList arrayList = new ArrayList(fVar.f668x);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ColorStateList colorStateList = ((C4972a) arrayList.get(i)).f40461b.f40474H;
                    if (colorStateList != null) {
                        H.a.h(fVar, colorStateList);
                    }
                }
                break;
            case 2:
                H3.m mVar = (H3.m) this.f569b;
                mVar.q();
                mVar.f1141r.start();
                break;
            case 3:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f569b;
                actionBarOverlayLayout.f4546P = null;
                actionBarOverlayLayout.f4534C = false;
                break;
            case 4:
                ((HideBottomViewOnScrollBehavior) this.f569b).f35822h = null;
                break;
            default:
                t2.m mVar2 = (t2.m) this.f569b;
                mVar2.setEnabled(true);
                mVar2.f40854n.setEnabled(true);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f568a) {
            case 1:
                E0.f fVar = (E0.f) this.f569b;
                ArrayList arrayList = new ArrayList(fVar.f668x);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    C4974c c4974c = ((C4972a) arrayList.get(i)).f40461b;
                    ColorStateList colorStateList = c4974c.f40474H;
                    if (colorStateList != null) {
                        H.a.g(fVar, colorStateList.getColorForState(c4974c.f40477L, colorStateList.getDefaultColor()));
                    }
                }
                break;
            case 5:
                t2.m mVar = (t2.m) this.f569b;
                mVar.setEnabled(false);
                mVar.f40854n.setEnabled(false);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public k(t2.m mVar) {
        this.f568a = 5;
        Objects.requireNonNull(mVar);
        this.f569b = mVar;
    }
}
