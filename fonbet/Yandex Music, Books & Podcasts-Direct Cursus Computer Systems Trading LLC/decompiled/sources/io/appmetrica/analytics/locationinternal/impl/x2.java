package io.appmetrica.analytics.locationinternal.impl;

/* loaded from: classes5.dex */
public final class x2 extends AbstractC0883j0 {
    public x2(w2 w2Var) {
        super(w2Var);
    }

    @Override // io.appmetrica.analytics.locationinternal.impl.AbstractC0883j0
    public final boolean a(AbstractC0883j0 abstractC0883j0) {
        String str = ((w2) this.a).a;
        if (str == null ? ((w2) abstractC0883j0.a).a != null : !str.equals(((w2) abstractC0883j0.a).a)) {
            return false;
        }
        String str2 = ((w2) this.a).b;
        return str2 != null ? str2.equals(((w2) abstractC0883j0.a).b) : ((w2) abstractC0883j0.a).b == null;
    }

    public final int hashCode() {
        String str = ((w2) this.a).a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = ((w2) this.a).b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
