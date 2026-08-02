package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.ColorStateList;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.connectsdk.service.webos.lgcast.remotecamera.service.CameraProperty;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final class h0c extends ts2 {
    public final l0c g;
    public final boolean h;
    public final /* synthetic */ ExtendedFloatingActionButton i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0c(ExtendedFloatingActionButton extendedFloatingActionButton, jzi jziVar, l0c l0cVar, boolean z) {
        super(extendedFloatingActionButton, jziVar);
        this.i = extendedFloatingActionButton;
        this.g = l0cVar;
        this.h = z;
    }

    @Override // defpackage.ts2
    public final AnimatorSet b() {
        zei zeiVar = (zei) this.f;
        if (zeiVar == null) {
            if (((zei) this.e) == null) {
                this.e = zei.b((Context) this.a, k());
            }
            zeiVar = (zei) this.e;
            zeiVar.getClass();
        }
        boolean g = zeiVar.g(CameraProperty.WIDTH);
        l0c l0cVar = this.g;
        ExtendedFloatingActionButton extendedFloatingActionButton = this.i;
        if (g) {
            PropertyValuesHolder[] e = zeiVar.e(CameraProperty.WIDTH);
            e[0].setFloatValues(extendedFloatingActionButton.getWidth(), l0cVar.c());
            zeiVar.h(CameraProperty.WIDTH, e);
        }
        if (zeiVar.g(CameraProperty.HEIGHT)) {
            PropertyValuesHolder[] e2 = zeiVar.e(CameraProperty.HEIGHT);
            e2[0].setFloatValues(extendedFloatingActionButton.getHeight(), l0cVar.a());
            zeiVar.h(CameraProperty.HEIGHT, e2);
        }
        if (zeiVar.g("paddingStart")) {
            PropertyValuesHolder[] e3 = zeiVar.e("paddingStart");
            e3[0].setFloatValues(extendedFloatingActionButton.getPaddingStart(), l0cVar.F());
            zeiVar.h("paddingStart", e3);
        }
        if (zeiVar.g("paddingEnd")) {
            PropertyValuesHolder[] e4 = zeiVar.e("paddingEnd");
            e4[0].setFloatValues(extendedFloatingActionButton.getPaddingEnd(), l0cVar.i());
            zeiVar.h("paddingEnd", e4);
        }
        if (zeiVar.g("labelOpacity")) {
            PropertyValuesHolder[] e5 = zeiVar.e("labelOpacity");
            boolean z = this.h;
            e5[0].setFloatValues(z ? 0.0f : 1.0f, z ? 1.0f : 0.0f);
            zeiVar.h("labelOpacity", e5);
        }
        return h(zeiVar);
    }

    @Override // defpackage.ts2
    public final int k() {
        return this.h ? R.animator.mtrl_extended_fab_change_size_expand_motion_spec : R.animator.mtrl_extended_fab_change_size_collapse_motion_spec;
    }

    @Override // defpackage.ts2
    public final void n() {
        ((jzi) this.d).a = null;
        ExtendedFloatingActionButton extendedFloatingActionButton = this.i;
        extendedFloatingActionButton.C0 = false;
        extendedFloatingActionButton.setHorizontallyScrolling(false);
        ViewGroup.LayoutParams layoutParams = extendedFloatingActionButton.getLayoutParams();
        if (layoutParams == null) {
            return;
        }
        l0c l0cVar = this.g;
        layoutParams.width = l0cVar.w().width;
        layoutParams.height = l0cVar.w().height;
    }

    @Override // defpackage.ts2
    public final void o(Animator animator) {
        jzi jziVar = (jzi) this.d;
        Animator animator2 = (Animator) jziVar.a;
        if (animator2 != null) {
            animator2.cancel();
        }
        jziVar.a = animator;
        boolean z = this.h;
        ExtendedFloatingActionButton extendedFloatingActionButton = this.i;
        extendedFloatingActionButton.B0 = z;
        extendedFloatingActionButton.C0 = true;
        extendedFloatingActionButton.setHorizontallyScrolling(true);
    }

    @Override // defpackage.ts2
    public final void p() {
        ExtendedFloatingActionButton extendedFloatingActionButton = this.i;
        boolean z = this.h;
        extendedFloatingActionButton.B0 = z;
        ViewGroup.LayoutParams layoutParams = extendedFloatingActionButton.getLayoutParams();
        if (layoutParams == null) {
            return;
        }
        if (!z) {
            extendedFloatingActionButton.F0 = layoutParams.width;
            extendedFloatingActionButton.G0 = layoutParams.height;
        }
        l0c l0cVar = this.g;
        layoutParams.width = l0cVar.w().width;
        layoutParams.height = l0cVar.w().height;
        if (z) {
            extendedFloatingActionButton.l(extendedFloatingActionButton.E0);
        } else if (extendedFloatingActionButton.getText() != null && extendedFloatingActionButton.getText() != "") {
            extendedFloatingActionButton.l(ColorStateList.valueOf(0));
        }
        extendedFloatingActionButton.setPaddingRelative(l0cVar.F(), extendedFloatingActionButton.getPaddingTop(), l0cVar.i(), extendedFloatingActionButton.getPaddingBottom());
        extendedFloatingActionButton.requestLayout();
    }

    @Override // defpackage.ts2
    public final boolean r() {
        ExtendedFloatingActionButton extendedFloatingActionButton = this.i;
        return this.h == extendedFloatingActionButton.B0 || extendedFloatingActionButton.getIcon() == null || TextUtils.isEmpty(extendedFloatingActionButton.getText());
    }
}
