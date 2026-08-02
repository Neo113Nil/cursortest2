package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import w.AbstractC5128c;

/* renamed from: com.google.android.gms.internal.ads.Qp, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2770Qp {

    /* renamed from: a, reason: collision with root package name */
    public final String f27859a;

    /* renamed from: b, reason: collision with root package name */
    public final String f27860b;

    /* renamed from: c, reason: collision with root package name */
    public final Drawable f27861c;

    public C2770Qp(String str, String str2, Drawable drawable) {
        this.f27859a = str;
        if (str2 == null) {
            throw new NullPointerException("Null imageUrl");
        }
        this.f27860b = str2;
        this.f27861c = drawable;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C2770Qp) {
            C2770Qp c2770Qp = (C2770Qp) obj;
            String str = this.f27859a;
            if (str != null ? str.equals(c2770Qp.f27859a) : c2770Qp.f27859a == null) {
                if (this.f27860b.equals(c2770Qp.f27860b)) {
                    Drawable drawable = c2770Qp.f27861c;
                    Drawable drawable2 = this.f27861c;
                    if (drawable2 != null ? drawable2.equals(drawable) : drawable == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f27859a;
        int hashCode = (((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.f27860b.hashCode();
        Drawable drawable = this.f27861c;
        return (drawable != null ? drawable.hashCode() : 0) ^ (hashCode * 1000003);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f27861c);
        String str = this.f27859a;
        int length = String.valueOf(str).length();
        int length2 = valueOf.length();
        String str2 = this.f27860b;
        StringBuilder sb = new StringBuilder(str2.length() + length + 42 + 7 + length2 + 1);
        AbstractC5128c.h(sb, "OfflineAdAssets{advertiserName=", str, ", imageUrl=", str2);
        return D.x.p(sb, ", icon=", valueOf, "}");
    }
}
