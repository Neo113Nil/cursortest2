package com.google.android.gms.internal.ads;

import android.app.Activity;
import v2.BinderC5100d;
import w.AbstractC5128c;

/* renamed from: com.google.android.gms.internal.ads.Rp, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2787Rp {

    /* renamed from: a, reason: collision with root package name */
    public final Activity f28047a;

    /* renamed from: b, reason: collision with root package name */
    public final BinderC5100d f28048b;

    /* renamed from: c, reason: collision with root package name */
    public final String f28049c;

    /* renamed from: d, reason: collision with root package name */
    public final String f28050d;

    public C2787Rp(Activity activity, BinderC5100d binderC5100d, String str, String str2) {
        this.f28047a = activity;
        this.f28048b = binderC5100d;
        this.f28049c = str;
        this.f28050d = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C2787Rp) {
            C2787Rp c2787Rp = (C2787Rp) obj;
            if (this.f28047a.equals(c2787Rp.f28047a)) {
                BinderC5100d binderC5100d = c2787Rp.f28048b;
                BinderC5100d binderC5100d2 = this.f28048b;
                if (binderC5100d2 != null ? binderC5100d2.equals(binderC5100d) : binderC5100d == null) {
                    String str = c2787Rp.f28049c;
                    String str2 = this.f28049c;
                    if (str2 != null ? str2.equals(str) : str == null) {
                        String str3 = c2787Rp.f28050d;
                        String str4 = this.f28050d;
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
        int hashCode = this.f28047a.hashCode() ^ 1000003;
        BinderC5100d binderC5100d = this.f28048b;
        int hashCode2 = ((hashCode * 1000003) ^ (binderC5100d == null ? 0 : binderC5100d.hashCode())) * 1000003;
        String str = this.f28049c;
        int hashCode3 = (hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f28050d;
        return hashCode3 ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        String obj = this.f28047a.toString();
        int length = obj.length();
        String valueOf = String.valueOf(this.f28048b);
        int length2 = valueOf.length();
        String str = this.f28049c;
        int length3 = String.valueOf(str).length();
        String str2 = this.f28050d;
        StringBuilder sb = new StringBuilder(length + 40 + length2 + 13 + length3 + 6 + String.valueOf(str2).length() + 1);
        AbstractC5128c.h(sb, "OfflineUtilsParams{activity=", obj, ", adOverlay=", valueOf);
        AbstractC5128c.h(sb, ", gwsQueryId=", str, ", uri=", str2);
        sb.append("}");
        return sb.toString();
    }
}
