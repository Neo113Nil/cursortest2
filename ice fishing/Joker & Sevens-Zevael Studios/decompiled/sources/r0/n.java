package r0;

import l1.f0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class n extends l {

    /* renamed from: j, reason: collision with root package name */
    public final f0 f5925j;

    public n(f0 f0Var) {
        this.f5925j = f0Var;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i10 = this.f5923i;
        this.f5923i = i10 + 2;
        Object[] objArr = this.f5921g;
        return new b(this.f5925j, objArr[i10], objArr[i10 + 1]);
    }
}
