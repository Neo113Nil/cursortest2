package defpackage;

import android.animation.Animator;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final class k0c extends ts2 {
    public final /* synthetic */ ExtendedFloatingActionButton g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0c(ExtendedFloatingActionButton extendedFloatingActionButton, jzi jziVar) {
        super(extendedFloatingActionButton, jziVar);
        this.g = extendedFloatingActionButton;
    }

    @Override // defpackage.ts2
    public final int k() {
        return R.animator.mtrl_extended_fab_show_motion_spec;
    }

    @Override // defpackage.ts2
    public final void n() {
        ((jzi) this.d).a = null;
        this.g.I = 0;
    }

    @Override // defpackage.ts2
    public final void o(Animator animator) {
        jzi jziVar = (jzi) this.d;
        Animator animator2 = (Animator) jziVar.a;
        if (animator2 != null) {
            animator2.cancel();
        }
        jziVar.a = animator;
        ExtendedFloatingActionButton extendedFloatingActionButton = this.g;
        extendedFloatingActionButton.setVisibility(0);
        extendedFloatingActionButton.I = 2;
    }

    @Override // defpackage.ts2
    public final void p() {
        ExtendedFloatingActionButton extendedFloatingActionButton = this.g;
        extendedFloatingActionButton.setVisibility(0);
        extendedFloatingActionButton.setAlpha(1.0f);
        extendedFloatingActionButton.setScaleY(1.0f);
        extendedFloatingActionButton.setScaleX(1.0f);
    }

    @Override // defpackage.ts2
    public final boolean r() {
        mb4 mb4Var = ExtendedFloatingActionButton.H0;
        ExtendedFloatingActionButton extendedFloatingActionButton = this.g;
        int visibility = extendedFloatingActionButton.getVisibility();
        int i = extendedFloatingActionButton.I;
        if (visibility != 0) {
            if (i != 2) {
                return false;
            }
        } else if (i == 1) {
            return false;
        }
        return true;
    }
}
