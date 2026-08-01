package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.zA, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4253zA {

    /* renamed from: a, reason: collision with root package name */
    public final String f35304a;

    /* renamed from: b, reason: collision with root package name */
    public final String f35305b;

    public C4253zA(String str, String str2) {
        this.f35304a = str;
        this.f35305b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C4253zA) {
            C4253zA c4253zA = (C4253zA) obj;
            String str = this.f35304a;
            if (str != null ? str.equals(c4253zA.f35304a) : c4253zA.f35304a == null) {
                String str2 = this.f35305b;
                if (str2 != null ? str2.equals(c4253zA.f35305b) : c4253zA.f35305b == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f35304a;
        int hashCode = str == null ? 0 : str.hashCode();
        String str2 = this.f35305b;
        return (str2 != null ? str2.hashCode() : 0) ^ ((hashCode ^ 1000003) * 1000003);
    }

    public final String toString() {
        String str = this.f35304a;
        int length = String.valueOf(str).length();
        String str2 = this.f35305b;
        StringBuilder sb = new StringBuilder(length + 50 + String.valueOf(str2).length() + 1);
        u1.h.i(sb, "OverlayDisplayDismissRequest{sessionToken=", str, ", appId=", str2);
        sb.append("}");
        return sb.toString();
    }
}
