package io.appmetrica.analytics.locationinternal.impl;

import defpackage.b64;
import defpackage.unr0;

/* renamed from: io.appmetrica.analytics.locationinternal.impl.r0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0981r0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final long h;

    public C0981r0(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, long j) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
        this.g = z7;
        this.h = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C0981r0.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        C0981r0 c0981r0 = (C0981r0) obj;
        return this.a == c0981r0.a && this.b == c0981r0.b && this.c == c0981r0.c && this.d == c0981r0.d && this.e == c0981r0.e && this.f == c0981r0.f && this.g == c0981r0.g && this.h == c0981r0.h;
    }

    public final int hashCode() {
        return Long.hashCode(this.h) + unr0.e(unr0.e(unr0.e(unr0.e(unr0.e(unr0.e(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LbsArguments(lbsCollectionEnabled=");
        sb.append(this.a);
        sb.append(", wifiCollectingEnabled=");
        sb.append(this.b);
        sb.append(", wifiConnectedEnabled=");
        sb.append(this.c);
        sb.append(", allCellsCollectingEnabled=");
        sb.append(this.d);
        sb.append(", connectedCellCollectingEnabled=");
        sb.append(this.e);
        sb.append(", cellsAdditionalInfo=");
        sb.append(this.f);
        sb.append(", cellsAdditionalInfoConnectedOnly=");
        sb.append(this.g);
        sb.append(", lbsUpdateTimeInterval=");
        return b64.o(sb, this.h, ')');
    }
}
