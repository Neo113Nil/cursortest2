package defpackage;

/* loaded from: classes.dex */
public final class rrk implements Runnable {
    public final float a;
    public final float b;
    public final long c = System.currentTimeMillis();
    public final float d;
    public final float e;
    public final /* synthetic */ trk f;

    public rrk(trk trkVar, float f, float f2, float f3, float f4) {
        this.f = trkVar;
        this.a = f3;
        this.b = f4;
        this.d = f;
        this.e = f2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        trk trkVar = this.f;
        float interpolation = trkVar.a.getInterpolation(Math.min(1.0f, ((System.currentTimeMillis() - this.c) * 1.0f) / trkVar.b));
        float f = this.d;
        trkVar.v.v(su4.e(this.e, f, interpolation, f) / trkVar.d(), this.a, this.b);
        if (interpolation < 1.0f) {
            trkVar.h.postOnAnimation(this);
        }
    }
}
