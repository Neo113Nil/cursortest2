package com.google.android.gms.internal.ads;

import android.os.IBinder;
import w.AbstractC5128c;

/* loaded from: classes2.dex */
public final class BA {

    /* renamed from: a, reason: collision with root package name */
    public final IBinder f24625a;

    /* renamed from: b, reason: collision with root package name */
    public final String f24626b;

    /* renamed from: c, reason: collision with root package name */
    public final int f24627c;

    /* renamed from: d, reason: collision with root package name */
    public final float f24628d;

    /* renamed from: e, reason: collision with root package name */
    public final int f24629e;

    /* renamed from: f, reason: collision with root package name */
    public final String f24630f;

    public BA(IBinder iBinder, String str, int i, float f2, int i4, String str2) {
        this.f24625a = iBinder;
        this.f24626b = str;
        this.f24627c = i;
        this.f24628d = f2;
        this.f24629e = i4;
        this.f24630f = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BA) {
            BA ba = (BA) obj;
            if (this.f24625a.equals(ba.f24625a)) {
                String str = ba.f24626b;
                String str2 = this.f24626b;
                if (str2 != null ? str2.equals(str) : str == null) {
                    if (this.f24627c == ba.f24627c && Float.floatToIntBits(this.f24628d) == Float.floatToIntBits(ba.f24628d) && this.f24629e == ba.f24629e) {
                        String str3 = ba.f24630f;
                        String str4 = this.f24630f;
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
        int hashCode = this.f24625a.hashCode() ^ 1000003;
        String str = this.f24626b;
        int hashCode2 = (((((hashCode * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f24627c) * 1000003) ^ Float.floatToIntBits(this.f24628d);
        String str2 = this.f24630f;
        return ((((hashCode2 * (-429739981)) ^ this.f24629e) * (-721379959)) ^ (str2 != null ? str2.hashCode() : 0)) * 1000003;
    }

    public final String toString() {
        String obj = this.f24625a.toString();
        int length = obj.length();
        String str = this.f24626b;
        int length2 = String.valueOf(str).length();
        int i = this.f24627c;
        int length3 = String.valueOf(i).length();
        float f2 = this.f24628d;
        int length4 = String.valueOf(f2).length();
        int i4 = this.f24629e;
        int length5 = String.valueOf(i4).length();
        String str2 = this.f24630f;
        StringBuilder sb = new StringBuilder(length + 46 + length2 + 16 + length3 + 23 + length4 + 74 + length5 + 33 + String.valueOf(str2).length() + 30);
        AbstractC5128c.h(sb, "OverlayDisplayShowRequest{windowToken=", obj, ", appId=", str);
        sb.append(", layoutGravity=");
        sb.append(i);
        sb.append(", layoutVerticalMargin=");
        sb.append(f2);
        sb.append(", displayMode=0, triggerMode=0, theme=0, sessionToken=null, windowWidthPx=");
        sb.append(i4);
        sb.append(", deeplinkUrl=null, adFieldEnifd=");
        sb.append(str2);
        sb.append(", thirdPartyAuthCallerId=null}");
        return sb.toString();
    }
}
