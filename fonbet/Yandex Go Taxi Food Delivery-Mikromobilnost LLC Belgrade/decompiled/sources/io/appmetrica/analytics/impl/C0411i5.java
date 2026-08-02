package io.appmetrica.analytics.impl;

import defpackage.oyr;

/* renamed from: io.appmetrica.analytics.impl.i5, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0411i5 extends S3 {
    public final int b;

    public C0411i5(int i, int i2) {
        super(i2);
        this.b = i;
    }

    @Override // io.appmetrica.analytics.impl.S3
    public final String toString() {
        StringBuilder sb = new StringBuilder("CollectionTrimInfo{itemsDropped=");
        sb.append(this.b);
        sb.append(", bytesTruncated=");
        return oyr.s(sb, this.a, '}');
    }
}
