package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;

/* renamed from: com.google.android.gms.internal.ads.Qp, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2750Qp {

    /* renamed from: a, reason: collision with root package name */
    public final String f27103a;

    /* renamed from: b, reason: collision with root package name */
    public final String f27104b;

    /* renamed from: c, reason: collision with root package name */
    public final Drawable f27105c;

    public C2750Qp(String str, String str2, Drawable drawable) {
        this.f27103a = str;
        if (str2 == null) {
            throw new NullPointerException("Null imageUrl");
        }
        this.f27104b = str2;
        this.f27105c = drawable;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C2750Qp) {
            C2750Qp c2750Qp = (C2750Qp) obj;
            String str = this.f27103a;
            if (str != null ? str.equals(c2750Qp.f27103a) : c2750Qp.f27103a == null) {
                if (this.f27104b.equals(c2750Qp.f27104b)) {
                    Drawable drawable = c2750Qp.f27105c;
                    Drawable drawable2 = this.f27105c;
                    if (drawable2 != null ? drawable2.equals(drawable) : drawable == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f27103a;
        int hashCode = (((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.f27104b.hashCode();
        Drawable drawable = this.f27105c;
        return (drawable != null ? drawable.hashCode() : 0) ^ (hashCode * 1000003);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f27105c);
        String str = this.f27103a;
        int length = String.valueOf(str).length();
        int length2 = valueOf.length();
        String str2 = this.f27104b;
        StringBuilder sb = new StringBuilder(str2.length() + length + 42 + 7 + length2 + 1);
        u1.h.i(sb, "OfflineAdAssets{advertiserName=", str, ", imageUrl=", str2);
        return D.y.s(sb, ", icon=", valueOf, "}");
    }
}
