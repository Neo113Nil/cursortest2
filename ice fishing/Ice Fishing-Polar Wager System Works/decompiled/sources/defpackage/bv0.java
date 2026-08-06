package defpackage;

/* loaded from: classes.dex */
public abstract class bv0 {
    public int adDC3e2L;
    public int xiZrDbcSW0;
    public long AARZUJiTa = 0;
    public long EXtogiMhuM = defpackage.cv0.IHQe1A4L2xu;
    public long riuEU0zW4 = 0;

    public final void CGXpA9s3RjIa() {
        this.adDC3e2L = defpackage.x80.JlrlGoKF((int) (this.AARZUJiTa >> 32), defpackage.ki.SH1y5HwkJhh(this.EXtogiMhuM), defpackage.ki.EXtogiMhuM(this.EXtogiMhuM));
        this.xiZrDbcSW0 = defpackage.x80.JlrlGoKF((int) (this.AARZUJiTa & 4294967295L), defpackage.ki.riuEU0zW4(this.EXtogiMhuM), defpackage.ki.AARZUJiTa(this.EXtogiMhuM));
        int i = this.adDC3e2L;
        long j = this.AARZUJiTa;
        this.riuEU0zW4 = (((i - ((int) (j >> 32))) / 2) << 32) | (4294967295L & ((r0 - ((int) (j & 4294967295L))) / 2));
    }

    public final void JcqDrWrgMf(long j) {
        if (defpackage.i70.IHQe1A4L2xu(this.AARZUJiTa, j)) {
            return;
        }
        this.AARZUJiTa = j;
        CGXpA9s3RjIa();
    }

    public int QUKZkWRtw6() {
        return (int) (this.AARZUJiTa & 4294967295L);
    }

    public java.lang.Object ez2rX8ReCYw() {
        return null;
    }

    public abstract void mL9sMlGfef(long j, float f, defpackage.g00 g00Var);

    public int nVhUznk1t() {
        return (int) (this.AARZUJiTa >> 32);
    }

    public final void sJNB7mCer5(long j) {
        if (defpackage.ki.oh6vYeIP(this.EXtogiMhuM, j)) {
            return;
        }
        this.EXtogiMhuM = j;
        CGXpA9s3RjIa();
    }
}
