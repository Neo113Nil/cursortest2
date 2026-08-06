package defpackage;

/* loaded from: classes.dex */
public final class bj1 extends defpackage.zi1 {
    public final defpackage.lu0 EXtogiMhuM;

    public bj1(defpackage.lu0 lu0Var) {
        this.EXtogiMhuM = lu0Var;
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        int i = this.AARZUJiTa;
        this.AARZUJiTa = i + 2;
        java.lang.Object[] objArr = this.adDC3e2L;
        return new defpackage.dl0(this.EXtogiMhuM, objArr[i], objArr[i + 1]);
    }
}
