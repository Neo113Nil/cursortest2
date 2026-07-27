package com.google.android.gms.internal.ads;

import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.kP, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3472kP {

    /* renamed from: a, reason: collision with root package name */
    public final TP f32295a;

    /* renamed from: b, reason: collision with root package name */
    public final TC f32296b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC3832r8 f32297c;

    /* renamed from: d, reason: collision with root package name */
    public final BQ f32298d;

    public /* synthetic */ C3472kP(PE pe) {
        this.f32295a = (TP) pe.f26882b;
        this.f32296b = (TC) pe.f26883c;
        this.f32297c = (AbstractC3832r8) pe.f26884d;
        this.f32298d = (BQ) pe.f26885e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3472kP)) {
            return false;
        }
        C3472kP c3472kP = (C3472kP) obj;
        c3472kP.getClass();
        return this.f32295a.equals(c3472kP.f32295a) && Objects.equals(this.f32296b, c3472kP.f32296b) && this.f32297c.equals(c3472kP.f32297c) && Objects.equals(this.f32298d, c3472kP.f32298d);
    }

    public final int hashCode() {
        int hashCode = this.f32295a.hashCode() * 961;
        TC tc = this.f32296b;
        int hashCode2 = this.f32297c.hashCode() + ((hashCode + (tc == null ? 0 : tc.hashCode())) * 31);
        BQ bq = this.f32298d;
        return (hashCode2 * 31) + (bq != null ? bq.hashCode() : 0);
    }
}
