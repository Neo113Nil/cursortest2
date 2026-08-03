package w;

import android.content.Context;
import android.widget.EdgeEffect;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class f0 extends EdgeEffect {

    /* renamed from: a, reason: collision with root package name */
    public final float f7416a;

    /* renamed from: b, reason: collision with root package name */
    public float f7417b;

    public f0(Context context) {
        super(context);
        this.f7416a = i7.b.b(context).f6384g * 1;
    }

    @Override // android.widget.EdgeEffect
    public final void onAbsorb(int i10) {
        this.f7417b = 0.0f;
        super.onAbsorb(i10);
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f10, float f11) {
        this.f7417b = 0.0f;
        super.onPull(f10, f11);
    }

    @Override // android.widget.EdgeEffect
    public final void onRelease() {
        this.f7417b = 0.0f;
        super.onRelease();
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f10) {
        this.f7417b = 0.0f;
        super.onPull(f10);
    }
}
