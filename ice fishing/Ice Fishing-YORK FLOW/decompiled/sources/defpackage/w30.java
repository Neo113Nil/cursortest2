package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class w30 extends android.widget.EdgeEffect {
    public final float ZpBGe2uQfcn8;
    public float giKS3J6vZuNy;

    public w30(android.content.Context context) {
        super(context);
        this.ZpBGe2uQfcn8 = defpackage.i61.giKS3J6vZuNy(context).WDYagTQQm9ns * 1.0f;
    }

    @Override // android.widget.EdgeEffect
    public final void onAbsorb(int i) {
        this.giKS3J6vZuNy = 0.0f;
        super.onAbsorb(i);
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f, float f2) {
        this.giKS3J6vZuNy = 0.0f;
        super.onPull(f, f2);
    }

    @Override // android.widget.EdgeEffect
    public final void onRelease() {
        this.giKS3J6vZuNy = 0.0f;
        super.onRelease();
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f) {
        this.giKS3J6vZuNy = 0.0f;
        super.onPull(f);
    }
}
