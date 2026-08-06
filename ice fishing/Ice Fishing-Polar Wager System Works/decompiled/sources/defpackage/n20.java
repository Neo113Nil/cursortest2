package defpackage;

/* loaded from: classes.dex */
public final class n20 extends android.widget.EdgeEffect {
    public final float IHQe1A4L2xu;
    public float oh6vYeIP;

    public n20(android.content.Context context) {
        super(context);
        this.IHQe1A4L2xu = defpackage.h1.r1MBDhnF(context).adDC3e2L * 1.0f;
    }

    @Override // android.widget.EdgeEffect
    public final void onAbsorb(int i) {
        this.oh6vYeIP = 0.0f;
        super.onAbsorb(i);
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f, float f2) {
        this.oh6vYeIP = 0.0f;
        super.onPull(f, f2);
    }

    @Override // android.widget.EdgeEffect
    public final void onRelease() {
        this.oh6vYeIP = 0.0f;
        super.onRelease();
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f) {
        this.oh6vYeIP = 0.0f;
        super.onPull(f);
    }
}
