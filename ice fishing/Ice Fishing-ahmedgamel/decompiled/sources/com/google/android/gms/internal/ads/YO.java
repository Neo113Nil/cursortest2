package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class YO {

    /* renamed from: a, reason: collision with root package name */
    public final DP f29454a;

    /* renamed from: b, reason: collision with root package name */
    public final RC f29455b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC3627n8 f29456c;

    /* renamed from: d, reason: collision with root package name */
    public final C3860rQ f29457d;

    public /* synthetic */ YO(ME me) {
        this.f29454a = (DP) me.f27061b;
        this.f29455b = (RC) me.f27062c;
        this.f29456c = (AbstractC3627n8) me.f27063d;
        this.f29457d = (C3860rQ) me.f27064e;
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
        return this.f29454a.equals(yo.f29454a) && Objects.equals(this.f29455b, yo.f29455b) && this.f29456c.equals(yo.f29456c) && Objects.equals(this.f29457d, yo.f29457d);
    }

    public final int hashCode() {
        int hashCode = this.f29454a.hashCode() * 961;
        RC rc = this.f29455b;
        int hashCode2 = this.f29456c.hashCode() + ((hashCode + (rc == null ? 0 : rc.hashCode())) * 31);
        C3860rQ c3860rQ = this.f29457d;
        return (hashCode2 * 31) + (c3860rQ != null ? c3860rQ.hashCode() : 0);
    }
}
