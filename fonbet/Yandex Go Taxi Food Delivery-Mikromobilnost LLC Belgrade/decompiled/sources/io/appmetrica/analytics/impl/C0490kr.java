package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.kr, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0490kr implements T3 {
    public final Object a;
    public final T3 b;

    public C0490kr(Object obj, T3 t3) {
        this.a = obj;
        this.b = t3;
    }

    @Override // io.appmetrica.analytics.impl.T3
    public final int getBytesTruncated() {
        return this.b.getBytesTruncated();
    }

    public final String toString() {
        return "TrimmingResult{value=" + this.a + ", metaInfo=" + this.b + '}';
    }
}
