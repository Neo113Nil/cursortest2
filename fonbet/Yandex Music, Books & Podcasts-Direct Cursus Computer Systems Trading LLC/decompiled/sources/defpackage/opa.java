package defpackage;

import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import kotlin.KotlinVersion;

/* loaded from: classes.dex */
public final class opa extends w4k implements eun {
    public final Drawable e;
    public final x6k f;
    public final x6k g;
    public final jyr h;

    public opa(Drawable drawable) {
        drawable.getClass();
        this.e = drawable;
        this.f = szf.g0(0);
        Object obj = ppa.a;
        this.g = szf.g0(new nmq((drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) ? 9205357640488583168L : a4g.i(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight())));
        this.h = btf.b(new rs6(28, this));
        if (drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) {
            return;
        }
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
    }

    @Override // defpackage.w4k
    public final void a(float f) {
        this.e.setAlpha(yhn.d(eeh.b(f * KotlinVersion.MAX_COMPONENT_VALUE), 0, KotlinVersion.MAX_COMPONENT_VALUE));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.eun
    public final void b() {
        Drawable.Callback callback = (Drawable.Callback) this.h.getValue();
        Drawable drawable = this.e;
        drawable.setCallback(callback);
        drawable.setVisible(true, true);
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).start();
        }
    }

    @Override // defpackage.w4k
    public final void c(m85 m85Var) {
        this.e.setColorFilter(m85Var != null ? m85Var.a : null);
    }

    @Override // defpackage.eun
    public final void d() {
        e();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.eun
    public final void e() {
        Drawable drawable = this.e;
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).stop();
        }
        drawable.setVisible(false, false);
        drawable.setCallback(null);
    }

    @Override // defpackage.w4k
    public final void f(xof xofVar) {
        int i;
        xofVar.getClass();
        int ordinal = xofVar.ordinal();
        if (ordinal != 0) {
            i = 1;
            if (ordinal != 1) {
                b6e.s();
                return;
            }
        } else {
            i = 0;
        }
        this.e.setLayoutDirection(i);
    }

    @Override // defpackage.w4k
    public final long i() {
        return ((nmq) this.g.getValue()).a;
    }

    @Override // defpackage.w4k
    public final void j(jpa jpaVar) {
        jpaVar.getClass();
        mu3 s = jpaVar.q0().s();
        ((Number) this.f.getValue()).intValue();
        int b = eeh.b(nmq.d(jpaVar.e()));
        int b2 = eeh.b(nmq.b(jpaVar.e()));
        Drawable drawable = this.e;
        drawable.setBounds(0, 0, b, b2);
        try {
            s.r();
            Canvas canvas = vd0.a;
            drawable.draw(((ud0) s).a);
        } finally {
            s.k();
        }
    }
}
