package com.google.android.gms.internal.ads;

import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class U3 {

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f28678c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f28679d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");

    /* renamed from: a, reason: collision with root package name */
    public final Cr f28680a = new Cr();

    /* renamed from: b, reason: collision with root package name */
    public final StringBuilder f28681b = new StringBuilder();

    public static void a(Cr cr) {
        while (true) {
            for (boolean z6 = true; cr.B() > 0 && z6; z6 = false) {
                int i = cr.f24998b;
                byte[] bArr = cr.f24997a;
                byte b9 = bArr[i];
                char c9 = (char) b9;
                if (c9 == '\t' || c9 == '\n' || c9 == '\f' || c9 == '\r' || c9 == ' ') {
                    cr.G(1);
                } else {
                    int i4 = cr.f24999c;
                    if (i + 2 <= i4) {
                        int i6 = i + 1;
                        if (b9 == 47) {
                            int i9 = i + 2;
                            if (bArr[i6] == 42) {
                                while (true) {
                                    int i10 = i9 + 1;
                                    if (i10 >= i4) {
                                        break;
                                    }
                                    if (((char) bArr[i9]) == '*' && ((char) bArr[i10]) == '/') {
                                        i4 = i9 + 2;
                                        i9 = i4;
                                    } else {
                                        i9 = i10;
                                    }
                                }
                                cr.G(i4 - cr.f24998b);
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
            return;
        }
    }

    public static String b(Cr cr, StringBuilder sb) {
        a(cr);
        if (cr.B() == 0) {
            return null;
        }
        String c9 = c(cr, sb);
        if (!c9.isEmpty()) {
            return c9;
        }
        char K7 = (char) cr.K();
        StringBuilder sb2 = new StringBuilder(String.valueOf(K7).length());
        sb2.append(K7);
        return sb2.toString();
    }

    public static String c(Cr cr, StringBuilder sb) {
        sb.setLength(0);
        int i = cr.f24998b;
        int i4 = cr.f24999c;
        loop0: while (true) {
            for (boolean z6 = false; i < i4 && !z6; z6 = true) {
                char c9 = (char) cr.f24997a[i];
                if ((c9 >= 'A' && c9 <= 'Z') || ((c9 >= 'a' && c9 <= 'z') || ((c9 >= '0' && c9 <= '9') || c9 == '#' || c9 == '-' || c9 == '.' || c9 == '_'))) {
                    sb.append(c9);
                    i++;
                }
            }
        }
        cr.G(i - cr.f24998b);
        return sb.toString();
    }
}
