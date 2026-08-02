package com.google.android.gms.internal.ads;

import w.AbstractC5128c;

/* renamed from: com.google.android.gms.internal.ads.zA, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4276zA {

    /* renamed from: a, reason: collision with root package name */
    public final String f36088a;

    /* renamed from: b, reason: collision with root package name */
    public final String f36089b;

    public C4276zA(String str, String str2) {
        this.f36088a = str;
        this.f36089b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C4276zA) {
            C4276zA c4276zA = (C4276zA) obj;
            String str = this.f36088a;
            if (str != null ? str.equals(c4276zA.f36088a) : c4276zA.f36088a == null) {
                String str2 = this.f36089b;
                if (str2 != null ? str2.equals(c4276zA.f36089b) : c4276zA.f36089b == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f36088a;
        int hashCode = str == null ? 0 : str.hashCode();
        String str2 = this.f36089b;
        return (str2 != null ? str2.hashCode() : 0) ^ ((hashCode ^ 1000003) * 1000003);
    }

    public final String toString() {
        String str = this.f36088a;
        int length = String.valueOf(str).length();
        String str2 = this.f36089b;
        StringBuilder sb = new StringBuilder(length + 50 + String.valueOf(str2).length() + 1);
        AbstractC5128c.h(sb, "OverlayDisplayDismissRequest{sessionToken=", str, ", appId=", str2);
        sb.append("}");
        return sb.toString();
    }
}
