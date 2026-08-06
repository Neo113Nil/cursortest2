package defpackage;

/* loaded from: classes.dex */
public final class aj1 extends defpackage.zi1 {
    public final /* synthetic */ int EXtogiMhuM;

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        switch (this.EXtogiMhuM) {
            case 0:
                int i = this.AARZUJiTa;
                this.AARZUJiTa = i + 2;
                java.lang.Object[] objArr = this.adDC3e2L;
                return new defpackage.yg0(0, objArr[i], objArr[i + 1]);
            case 1:
                int i2 = this.AARZUJiTa;
                this.AARZUJiTa = i2 + 2;
                return this.adDC3e2L[i2];
            default:
                int i3 = this.AARZUJiTa;
                this.AARZUJiTa = i3 + 2;
                return this.adDC3e2L[i3 + 1];
        }
    }
}
