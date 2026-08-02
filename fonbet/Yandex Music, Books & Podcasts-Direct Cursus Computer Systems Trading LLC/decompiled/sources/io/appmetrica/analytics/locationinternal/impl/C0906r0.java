package io.appmetrica.analytics.locationinternal.impl;

import defpackage.eta;
import defpackage.jj4;
import defpackage.k5r;

/* renamed from: io.appmetrica.analytics.locationinternal.impl.r0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0906r0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final long h;

    public C0906r0(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, long j) {
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
        if (!C0906r0.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj != null) {
            C0906r0 c0906r0 = (C0906r0) obj;
            return this.a == c0906r0.a && this.b == c0906r0.b && this.c == c0906r0.c && this.d == c0906r0.d && this.e == c0906r0.e && this.f == c0906r0.f && this.g == c0906r0.g && this.h == c0906r0.h;
        }
        jj4.j("null cannot be cast to non-null type io.appmetrica.analytics.locationinternal.impl.model.LbsArguments");
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.h) + k5r.e(k5r.e(k5r.e(k5r.e(k5r.e(k5r.e(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
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
        return eta.g(sb, this.h, ')');
    }
}
