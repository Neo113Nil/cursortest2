package io.appmetrica.analytics.impl;

import android.text.TextUtils;

/* loaded from: classes.dex */
public abstract class Qf {
    public static final String a(C0376e9 c0376e9) {
        String str;
        StringBuilder sb = new StringBuilder("Event sent: ");
        int i2 = c0376e9.f5907c;
        String str2 = c0376e9.f5908d;
        byte[] bArr = c0376e9.f5909e;
        if (i2 == 1) {
            str = "Attribution";
        } else if (i2 == 2) {
            str = "Session start";
        } else if (i2 == 4) {
            if (str2 == null) {
                str2 = "null";
            }
            StringBuilder sb2 = new StringBuilder(str2);
            if (bArr != null) {
                String str3 = new String(bArr, z1.a.f8620a);
                if (!TextUtils.isEmpty(str3)) {
                    sb2.append(" with value ");
                    sb2.append(str3);
                }
            }
            str = sb2.toString();
        } else if (i2 == 5) {
            str = "Referrer";
        } else if (i2 == 7) {
            str = "Session heartbeat";
        } else if (i2 == 13) {
            str = "The very first event";
        } else if (i2 == 35) {
            str = "E-Commerce";
        } else if (i2 == 40) {
            str = "Ad revenue (ILRD)";
        } else if (i2 == 42) {
            str = "External attribution";
        } else if (i2 == 16) {
            str = "Open";
        } else if (i2 == 17) {
            str = "Update";
        } else if (i2 == 20) {
            str = "User profile update";
        } else if (i2 != 21) {
            switch (i2) {
                case C0376e9.f5885F /* 25 */:
                    str = "ANR";
                    break;
                case C0376e9.G /* 26 */:
                    str = C1.a.i("Crash: ", str2);
                    break;
                case C0376e9.f5886H /* 27 */:
                    str = C1.a.i("Error: ", str2);
                    break;
                default:
                    str = C1.a.f(i2, "type=");
                    break;
            }
        } else {
            str = "Revenue";
        }
        sb.append(str);
        return sb.toString();
    }

    public static final String a(String str, EnumC0301bb enumC0301bb, String str2, String str3) {
        if (!AbstractC0842w9.f7099d.contains(EnumC0301bb.a(enumC0301bb.f5664a))) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(": ");
        sb.append(enumC0301bb.name());
        if (AbstractC0842w9.f7101f.contains(enumC0301bb) && !TextUtils.isEmpty(str2)) {
            sb.append(" with name ");
            sb.append(str2);
        }
        if (AbstractC0842w9.f7100e.contains(enumC0301bb) && !TextUtils.isEmpty(str3)) {
            sb.append(" with value ");
            sb.append(str3);
        }
        return sb.toString();
    }
}
