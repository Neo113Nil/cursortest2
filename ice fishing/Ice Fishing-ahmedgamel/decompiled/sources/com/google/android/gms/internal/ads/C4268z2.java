package com.google.android.gms.internal.ads;

import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.z2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4268z2 implements InterfaceC3945t3 {

    /* renamed from: a, reason: collision with root package name */
    public final float f36049a;

    /* renamed from: b, reason: collision with root package name */
    public final C4214y2 f36050b;

    /* renamed from: c, reason: collision with root package name */
    public final C4214y2 f36051c;

    public C4268z2(float f2, C4214y2 c4214y2, C4214y2 c4214y22) {
        this.f36049a = f2;
        this.f36050b = c4214y2;
        this.f36051c = c4214y22;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4268z2)) {
            return false;
        }
        C4268z2 c4268z2 = (C4268z2) obj;
        return Float.compare(this.f36049a, c4268z2.f36049a) == 0 && Objects.equals(this.f36050b, c4268z2.f36050b) && Objects.equals(this.f36051c, c4268z2.f36051c);
    }

    public final int hashCode() {
        int hashCode = Float.hashCode(this.f36049a) * 31;
        C4214y2 c4214y2 = this.f36050b;
        int hashCode2 = (hashCode + (c4214y2 != null ? c4214y2.hashCode() : 0)) * 31;
        C4214y2 c4214y22 = this.f36051c;
        return hashCode2 + (c4214y22 != null ? c4214y22.hashCode() : 0);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f36050b);
        String valueOf2 = String.valueOf(this.f36051c);
        float f2 = this.f36049a;
        int length = String.valueOf(f2).length();
        StringBuilder sb = new StringBuilder(length + 37 + valueOf.length() + 10 + valueOf2.length());
        sb.append("ReplayGain Xing/Info: peak=");
        sb.append(f2);
        sb.append(", field 1=");
        sb.append(valueOf);
        return Wv.i(sb, ", field 2=", valueOf2);
    }
}
