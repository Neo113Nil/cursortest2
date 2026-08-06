package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class s61 extends h21 implements n51 {
    public final void cilMamHF(int i) {
        synchronized (this) {
            Object[] objArr = this.rQPn8YBR;
            objArr.getClass();
            WIEu4Ya2g8(Integer.valueOf(((Number) objArr[((int) ((this.E7jCp8Ls + ((int) ((uFEq9NpZ() + this.uFEq9NpZ) - this.E7jCp8Ls))) - 1)) & (objArr.length - 1)]).intValue() + i));
        }
    }

    @Override // defpackage.n51
    public final Object getValue() {
        Integer valueOf;
        synchronized (this) {
            Object[] objArr = this.rQPn8YBR;
            objArr.getClass();
            valueOf = Integer.valueOf(((Number) objArr[((int) ((this.E7jCp8Ls + ((int) ((uFEq9NpZ() + this.uFEq9NpZ) - this.E7jCp8Ls))) - 1)) & (objArr.length - 1)]).intValue());
        }
        return valueOf;
    }
}
