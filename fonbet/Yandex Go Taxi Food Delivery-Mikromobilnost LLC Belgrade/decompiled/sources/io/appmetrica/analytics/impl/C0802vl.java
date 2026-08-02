package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.vl, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0802vl implements T3 {
    public final Object a;
    public final T3 b;

    public C0802vl(Object obj, T3 t3) {
        this.a = obj;
        this.b = t3;
    }

    @Override // io.appmetrica.analytics.impl.T3
    public final int getBytesTruncated() {
        return this.b.getBytesTruncated();
    }

    public final String toString() {
        return "Result{result=" + this.a + ", metaInfo=" + this.b + '}';
    }
}
