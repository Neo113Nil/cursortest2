package cd;

import bd.c0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class b0 extends bd.t implements c0 {
    @Override // bd.c0
    public final Object getValue() {
        Integer valueOf;
        synchronized (this) {
            Object[] objArr = this.f1149n;
            pc.j.b(objArr);
            valueOf = Integer.valueOf(((Number) objArr[((int) ((this.f1150o + ((int) ((o() + this.f1152q) - this.f1150o))) - 1)) & (objArr.length - 1)]).intValue());
        }
        return valueOf;
    }

    public final void w(int i10) {
        synchronized (this) {
            Object[] objArr = this.f1149n;
            pc.j.b(objArr);
            q(Integer.valueOf(((Number) objArr[((int) ((this.f1150o + ((int) ((o() + this.f1152q) - this.f1150o))) - 1)) & (objArr.length - 1)]).intValue() + i10));
        }
    }
}
