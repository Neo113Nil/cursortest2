package com.google.android.gms.internal.ads;

import android.app.Activity;
import s2.BinderC4996d;
import t0.AbstractC5051n;

/* renamed from: com.google.android.gms.internal.ads.Up, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2817Up {

    /* renamed from: a, reason: collision with root package name */
    public final Activity f28087a;

    /* renamed from: b, reason: collision with root package name */
    public final BinderC4996d f28088b;

    /* renamed from: c, reason: collision with root package name */
    public final String f28089c;

    /* renamed from: d, reason: collision with root package name */
    public final String f28090d;

    public C2817Up(Activity activity, BinderC4996d binderC4996d, String str, String str2) {
        this.f28087a = activity;
        this.f28088b = binderC4996d;
        this.f28089c = str;
        this.f28090d = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C2817Up) {
            C2817Up c2817Up = (C2817Up) obj;
            if (this.f28087a.equals(c2817Up.f28087a)) {
                BinderC4996d binderC4996d = c2817Up.f28088b;
                BinderC4996d binderC4996d2 = this.f28088b;
                if (binderC4996d2 != null ? binderC4996d2.equals(binderC4996d) : binderC4996d == null) {
                    String str = c2817Up.f28089c;
                    String str2 = this.f28089c;
                    if (str2 != null ? str2.equals(str) : str == null) {
                        String str3 = c2817Up.f28090d;
                        String str4 = this.f28090d;
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
        int hashCode = this.f28087a.hashCode() ^ 1000003;
        BinderC4996d binderC4996d = this.f28088b;
        int hashCode2 = ((hashCode * 1000003) ^ (binderC4996d == null ? 0 : binderC4996d.hashCode())) * 1000003;
        String str = this.f28089c;
        int hashCode3 = (hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f28090d;
        return hashCode3 ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        String obj = this.f28087a.toString();
        int length = obj.length();
        String valueOf = String.valueOf(this.f28088b);
        int length2 = valueOf.length();
        String str = this.f28089c;
        int length3 = String.valueOf(str).length();
        String str2 = this.f28090d;
        StringBuilder sb = new StringBuilder(length + 40 + length2 + 13 + length3 + 6 + String.valueOf(str2).length() + 1);
        AbstractC5051n.j(sb, "OfflineUtilsParams{activity=", obj, ", adOverlay=", valueOf);
        AbstractC5051n.j(sb, ", gwsQueryId=", str, ", uri=", str2);
        sb.append("}");
        return sb.toString();
    }
}
