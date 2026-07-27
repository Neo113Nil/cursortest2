package com.google.android.gms.internal.ads;

import android.os.IBinder;
import t0.AbstractC5051n;

/* loaded from: classes2.dex */
public final class EA {

    /* renamed from: a, reason: collision with root package name */
    public final IBinder f24666a;

    /* renamed from: b, reason: collision with root package name */
    public final String f24667b;

    /* renamed from: c, reason: collision with root package name */
    public final int f24668c;

    /* renamed from: d, reason: collision with root package name */
    public final float f24669d;

    /* renamed from: e, reason: collision with root package name */
    public final int f24670e;

    /* renamed from: f, reason: collision with root package name */
    public final String f24671f;

    public EA(IBinder iBinder, String str, int i, float f6, int i4, String str2) {
        this.f24666a = iBinder;
        this.f24667b = str;
        this.f24668c = i;
        this.f24669d = f6;
        this.f24670e = i4;
        this.f24671f = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof EA) {
            EA ea = (EA) obj;
            if (this.f24666a.equals(ea.f24666a)) {
                String str = ea.f24667b;
                String str2 = this.f24667b;
                if (str2 != null ? str2.equals(str) : str == null) {
                    if (this.f24668c == ea.f24668c && Float.floatToIntBits(this.f24669d) == Float.floatToIntBits(ea.f24669d) && this.f24670e == ea.f24670e) {
                        String str3 = ea.f24671f;
                        String str4 = this.f24671f;
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
        int hashCode = this.f24666a.hashCode() ^ 1000003;
        String str = this.f24667b;
        int hashCode2 = (((((hashCode * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f24668c) * 1000003) ^ Float.floatToIntBits(this.f24669d);
        String str2 = this.f24671f;
        return ((((hashCode2 * 1525764945) ^ this.f24670e) * (-721379959)) ^ (str2 != null ? str2.hashCode() : 0)) * 1000003;
    }

    public final String toString() {
        String obj = this.f24666a.toString();
        int length = obj.length();
        String str = this.f24667b;
        int length2 = String.valueOf(str).length();
        int i = this.f24668c;
        int length3 = String.valueOf(i).length();
        float f6 = this.f24669d;
        int length4 = String.valueOf(f6).length();
        int i4 = this.f24670e;
        int length5 = String.valueOf(i4).length();
        String str2 = this.f24671f;
        StringBuilder sb = new StringBuilder(length + 46 + length2 + 16 + length3 + 23 + length4 + 65 + length5 + 33 + String.valueOf(str2).length() + 30);
        AbstractC5051n.j(sb, "OverlayDisplayShowRequest{windowToken=", obj, ", appId=", str);
        sb.append(", layoutGravity=");
        sb.append(i);
        sb.append(", layoutVerticalMargin=");
        sb.append(f6);
        sb.append(", displayMode=0, triggerMode=0, sessionToken=null, windowWidthPx=");
        sb.append(i4);
        sb.append(", deeplinkUrl=null, adFieldEnifd=");
        sb.append(str2);
        sb.append(", thirdPartyAuthCallerId=null}");
        return sb.toString();
    }
}
