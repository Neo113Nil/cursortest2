package defpackage;

/* loaded from: classes5.dex */
public final class wor extends x0q implements vdr {
    @Override // defpackage.vdr
    public final Object getValue() {
        Integer valueOf;
        synchronized (this) {
            Object[] objArr = this.h;
            objArr.getClass();
            valueOf = Integer.valueOf(((Number) objArr[((int) ((this.i + ((int) ((q() + this.k) - this.i))) - 1)) & (objArr.length - 1)]).intValue());
        }
        return valueOf;
    }

    public final void x(int i) {
        synchronized (this) {
            Object[] objArr = this.h;
            objArr.getClass();
            a(Integer.valueOf(((Number) objArr[((int) ((this.i + ((int) ((q() + this.k) - this.i))) - 1)) & (objArr.length - 1)]).intValue() + i));
        }
    }
}
