package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import defpackage.f1d;
import defpackage.k5r;
import defpackage.tlm;
import kotlin.text.Charsets;

/* renamed from: io.appmetrica.analytics.impl.ni, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC0494ni {
    public static final String a(C0457ma c0457ma) {
        String str;
        StringBuilder sb = new StringBuilder("Event sent: ");
        int i = c0457ma.c;
        String str2 = c0457ma.d;
        byte[] bArr = c0457ma.e;
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
                String str3 = new String(bArr, Charsets.UTF_8);
                if (!TextUtils.isEmpty(str3)) {
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
                    str = f1d.g("Crash: ", str2);
                    break;
                case 27:
                    str = f1d.g("Error: ", str2);
                    break;
                default:
                    str = k5r.i(i, "type=");
                    break;
            }
        } else {
            str = "Revenue";
        }
        sb.append(str);
        return sb.toString();
    }

    public static final String a(String str, EnumC0603rc enumC0603rc, String str2, String str3) {
        if (!Ea.d.contains(EnumC0603rc.a(enumC0603rc.a))) {
            return null;
        }
        StringBuilder m = tlm.m(str, ": ");
        m.append(enumC0603rc.name());
        if (Ea.f.contains(enumC0603rc) && !TextUtils.isEmpty(str2)) {
            m.append(" with name ");
            m.append(str2);
        }
        if (Ea.e.contains(enumC0603rc) && !TextUtils.isEmpty(str3)) {
            m.append(" with value ");
            m.append(str3);
        }
        return m.toString();
    }
}
