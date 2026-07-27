package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class YO {

    /* renamed from: a, reason: collision with root package name */
    public final DP f28677a;

    /* renamed from: b, reason: collision with root package name */
    public final RC f28678b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC3604n8 f28679c;

    /* renamed from: d, reason: collision with root package name */
    public final C3676oQ f28680d;

    public /* synthetic */ YO(ME me) {
        this.f28677a = (DP) me.f26270b;
        this.f28678b = (RC) me.f26271c;
        this.f28679c = (AbstractC3604n8) me.f26272d;
        this.f28680d = (C3676oQ) me.f26273e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof YO)) {
            return false;
        }
        YO yo = (YO) obj;
        yo.getClass();
        return this.f28677a.equals(yo.f28677a) && Objects.equals(this.f28678b, yo.f28678b) && this.f28679c.equals(yo.f28679c) && Objects.equals(this.f28680d, yo.f28680d);
    }

    public final int hashCode() {
        int hashCode = this.f28677a.hashCode() * 961;
        RC rc = this.f28678b;
        int hashCode2 = this.f28679c.hashCode() + ((hashCode + (rc == null ? 0 : rc.hashCode())) * 31);
        C3676oQ c3676oQ = this.f28680d;
        return (hashCode2 * 31) + (c3676oQ != null ? c3676oQ.hashCode() : 0);
    }
}
