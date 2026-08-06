package defpackage;

/* loaded from: classes.dex */
public final class jz implements java.lang.Comparable {
    public final java.lang.String AARZUJiTa;
    public final java.lang.String EXtogiMhuM;
    public final int adDC3e2L;
    public final int xiZrDbcSW0;

    public jz(int i, int i2, java.lang.String str, java.lang.String str2) {
        str.getClass();
        str2.getClass();
        this.adDC3e2L = i;
        this.xiZrDbcSW0 = i2;
        this.AARZUJiTa = str;
        this.EXtogiMhuM = str2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(java.lang.Object obj) {
        defpackage.jz jzVar = (defpackage.jz) obj;
        jzVar.getClass();
        int i = this.adDC3e2L - jzVar.adDC3e2L;
        return i == 0 ? this.xiZrDbcSW0 - jzVar.xiZrDbcSW0 : i;
    }
}
