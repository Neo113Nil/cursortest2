package defpackage;

/* loaded from: classes.dex */
public final class eq1 extends defpackage.ry0 implements java.io.Serializable {
    public int AARZUJiTa;
    public int EXtogiMhuM;
    public int SH1y5HwkJhh;
    public int ez2rX8ReCYw;
    public int riuEU0zW4;
    public int xiZrDbcSW0;

    @Override // defpackage.ry0
    public final int IHQe1A4L2xu(int i) {
        return (oh6vYeIP() >>> (32 - i)) & ((-i) >> 31);
    }

    @Override // defpackage.ry0
    public final int oh6vYeIP() {
        int i = this.xiZrDbcSW0;
        int i2 = i ^ (i >>> 2);
        this.xiZrDbcSW0 = this.AARZUJiTa;
        this.AARZUJiTa = this.EXtogiMhuM;
        this.EXtogiMhuM = this.riuEU0zW4;
        int i3 = this.SH1y5HwkJhh;
        this.riuEU0zW4 = i3;
        int i4 = ((i2 ^ (i2 << 1)) ^ i3) ^ (i3 << 4);
        this.SH1y5HwkJhh = i4;
        int i5 = this.ez2rX8ReCYw + 362437;
        this.ez2rX8ReCYw = i5;
        return i4 + i5;
    }
}
