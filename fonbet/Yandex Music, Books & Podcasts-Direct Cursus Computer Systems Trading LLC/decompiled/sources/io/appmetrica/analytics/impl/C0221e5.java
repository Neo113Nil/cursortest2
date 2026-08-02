package io.appmetrica.analytics.impl;

import defpackage.vz1;

/* renamed from: io.appmetrica.analytics.impl.e5, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0221e5 extends P3 {
    public final int b;

    public C0221e5(int i, int i2) {
        super(i2);
        this.b = i;
    }

    @Override // io.appmetrica.analytics.impl.P3
    public final String toString() {
        StringBuilder sb = new StringBuilder("CollectionTrimInfo{itemsDropped=");
        sb.append(this.b);
        sb.append(", bytesTruncated=");
        return vz1.r(sb, this.a, '}');
    }
}
