package com.google.android.gms.internal.ads;

import android.app.Activity;
import t2.BinderC5036d;

/* renamed from: com.google.android.gms.internal.ads.Rp, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2767Rp {

    /* renamed from: a, reason: collision with root package name */
    public final Activity f27333a;

    /* renamed from: b, reason: collision with root package name */
    public final BinderC5036d f27334b;

    /* renamed from: c, reason: collision with root package name */
    public final String f27335c;

    /* renamed from: d, reason: collision with root package name */
    public final String f27336d;

    public C2767Rp(Activity activity, BinderC5036d binderC5036d, String str, String str2) {
        this.f27333a = activity;
        this.f27334b = binderC5036d;
        this.f27335c = str;
        this.f27336d = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C2767Rp) {
            C2767Rp c2767Rp = (C2767Rp) obj;
            if (this.f27333a.equals(c2767Rp.f27333a)) {
                BinderC5036d binderC5036d = c2767Rp.f27334b;
                BinderC5036d binderC5036d2 = this.f27334b;
                if (binderC5036d2 != null ? binderC5036d2.equals(binderC5036d) : binderC5036d == null) {
                    String str = c2767Rp.f27335c;
                    String str2 = this.f27335c;
                    if (str2 != null ? str2.equals(str) : str == null) {
                        String str3 = c2767Rp.f27336d;
                        String str4 = this.f27336d;
                        if (str4 != null ? str4.equals(str3) : str3 == null) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f27333a.hashCode() ^ 1000003;
        BinderC5036d binderC5036d = this.f27334b;
        int hashCode2 = ((hashCode * 1000003) ^ (binderC5036d == null ? 0 : binderC5036d.hashCode())) * 1000003;
        String str = this.f27335c;
        int hashCode3 = (hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f27336d;
        return hashCode3 ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        String obj = this.f27333a.toString();
        int length = obj.length();
        String valueOf = String.valueOf(this.f27334b);
        int length2 = valueOf.length();
        String str = this.f27335c;
        int length3 = String.valueOf(str).length();
        String str2 = this.f27336d;
        StringBuilder sb = new StringBuilder(length + 40 + length2 + 13 + length3 + 6 + String.valueOf(str2).length() + 1);
        u1.h.i(sb, "OfflineUtilsParams{activity=", obj, ", adOverlay=", valueOf);
        u1.h.i(sb, ", gwsQueryId=", str, ", uri=", str2);
        sb.append("}");
        return sb.toString();
    }
}
