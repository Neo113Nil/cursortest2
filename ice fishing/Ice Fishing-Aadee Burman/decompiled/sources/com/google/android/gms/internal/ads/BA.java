package com.google.android.gms.internal.ads;

import android.os.IBinder;

/* loaded from: classes2.dex */
public final class BA {

    /* renamed from: a, reason: collision with root package name */
    public final IBinder f23854a;

    /* renamed from: b, reason: collision with root package name */
    public final String f23855b;

    /* renamed from: c, reason: collision with root package name */
    public final int f23856c;

    /* renamed from: d, reason: collision with root package name */
    public final float f23857d;

    /* renamed from: e, reason: collision with root package name */
    public final int f23858e;

    /* renamed from: f, reason: collision with root package name */
    public final String f23859f;

    public BA(IBinder iBinder, String str, int i, float f3, int i6, String str2) {
        this.f23854a = iBinder;
        this.f23855b = str;
        this.f23856c = i;
        this.f23857d = f3;
        this.f23858e = i6;
        this.f23859f = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BA) {
            BA ba = (BA) obj;
            if (this.f23854a.equals(ba.f23854a)) {
                String str = ba.f23855b;
                String str2 = this.f23855b;
                if (str2 != null ? str2.equals(str) : str == null) {
                    if (this.f23856c == ba.f23856c && Float.floatToIntBits(this.f23857d) == Float.floatToIntBits(ba.f23857d) && this.f23858e == ba.f23858e) {
                        String str3 = ba.f23859f;
                        String str4 = this.f23859f;
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
        int hashCode = this.f23854a.hashCode() ^ 1000003;
        String str = this.f23855b;
        int hashCode2 = (((((hashCode * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f23856c) * 1000003) ^ Float.floatToIntBits(this.f23857d);
        String str2 = this.f23859f;
        return ((((hashCode2 * (-429739981)) ^ this.f23858e) * (-721379959)) ^ (str2 != null ? str2.hashCode() : 0)) * 1000003;
    }

    public final String toString() {
        String obj = this.f23854a.toString();
        int length = obj.length();
        String str = this.f23855b;
        int length2 = String.valueOf(str).length();
        int i = this.f23856c;
        int length3 = String.valueOf(i).length();
        float f3 = this.f23857d;
        int length4 = String.valueOf(f3).length();
        int i6 = this.f23858e;
        int length5 = String.valueOf(i6).length();
        String str2 = this.f23859f;
        StringBuilder sb = new StringBuilder(length + 46 + length2 + 16 + length3 + 23 + length4 + 74 + length5 + 33 + String.valueOf(str2).length() + 30);
        u1.h.i(sb, "OverlayDisplayShowRequest{windowToken=", obj, ", appId=", str);
        sb.append(", layoutGravity=");
        sb.append(i);
        sb.append(", layoutVerticalMargin=");
        sb.append(f3);
        sb.append(", displayMode=0, triggerMode=0, theme=0, sessionToken=null, windowWidthPx=");
        sb.append(i6);
        sb.append(", deeplinkUrl=null, adFieldEnifd=");
        sb.append(str2);
        sb.append(", thirdPartyAuthCallerId=null}");
        return sb.toString();
    }
}
