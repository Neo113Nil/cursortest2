package com.gamericefishpro.space.t0;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class h0 implements v2 {
    public final f1 a;

    public h0(f1 f1Var) {
        this.a = f1Var;
    }

    @Override // com.gamericefishpro.space.t0.v2
    public final Object a(l1 l1Var) {
        return this.a.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h0) && this.a.equals(((h0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DynamicValueHolder(state=" + this.a + ')';
    }
}
