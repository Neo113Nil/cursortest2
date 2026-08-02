package io.appmetrica.analytics.impl;

import defpackage.g8e;
import defpackage.oyr;
import defpackage.uza;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public abstract class Ei {
    public static final String a(C0733ta c0733ta) {
        String str;
        StringBuilder sb = new StringBuilder("Event sent: ");
        int i = c0733ta.c;
        String str2 = c0733ta.d;
        byte[] bArr = c0733ta.e;
        if (i == 1) {
            str = "Attribution";
        } else if (i == 2) {
            str = "Session start";
        } else if (i == 4) {
            if (str2 == null) {
                str2 = "null";
            }
            StringBuilder sb2 = new StringBuilder(str2);
            if (bArr != null) {
                String str3 = new String(bArr, uza.a);
                if (str3.length() > 0) {
                    sb2.append(" with value ");
                    sb2.append(str3);
                }
            }
            str = sb2.toString();
        } else if (i == 5) {
            str = "Referrer";
        } else if (i == 7) {
            str = "Session heartbeat";
        } else if (i == 13) {
            str = "The very first event";
        } else if (i == 35) {
            str = "E-Commerce";
        } else if (i == 40) {
            str = "Ad revenue (ILRD)";
        } else if (i == 42) {
            str = "External attribution";
        } else if (i == 16) {
            str = "Open";
        } else if (i == 17) {
            str = "Update";
        } else if (i == 20) {
            str = "User profile update";
        } else if (i != 21) {
            switch (i) {
                case 25:
                    str = "ANR";
                    break;
                case 26:
                    str = g8e.o("Crash: ", str2);
                    break;
                case 27:
                    str = g8e.o("Error: ", str2);
                    break;
                default:
                    str = oyr.i(i, "type=");
                    break;
            }
        } else {
            str = "Revenue";
        }
        sb.append(str);
        return sb.toString();
    }

    public static final String a(String str, Hc hc, String str2, String str3) {
        if (hc == null) {
            hc = Hc.EVENT_TYPE_UNDEFINED;
        }
        if (!La.d.contains(Hc.a(hc.a))) {
            return null;
        }
        StringBuilder v = oyr.v(str, Extension.COLON_SPACE);
        v.append(hc.name());
        if (La.f.contains(hc) && str2 != null && str2.length() != 0) {
            v.append(" with name ");
            v.append(str2);
        }
        if (La.e.contains(hc) && str3 != null && str3.length() != 0) {
            v.append(" with value ");
            v.append(str3);
        }
        return v.toString();
    }
}
