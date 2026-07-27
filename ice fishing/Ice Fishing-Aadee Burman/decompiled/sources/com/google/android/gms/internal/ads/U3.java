package com.google.android.gms.internal.ads;

import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class U3 {

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f27881c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f27882d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");

    /* renamed from: a, reason: collision with root package name */
    public final Cr f27883a = new Cr();

    /* renamed from: b, reason: collision with root package name */
    public final StringBuilder f27884b = new StringBuilder();

    public static void a(Cr cr) {
        while (true) {
            for (boolean z3 = true; cr.B() > 0 && z3; z3 = false) {
                int i = cr.f24253b;
                byte[] bArr = cr.f24252a;
                byte b9 = bArr[i];
                char c9 = (char) b9;
                if (c9 == '\t' || c9 == '\n' || c9 == '\f' || c9 == '\r' || c9 == ' ') {
                    cr.G(1);
                } else {
                    int i6 = cr.f24254c;
                    if (i + 2 <= i6) {
                        int i9 = i + 1;
                        if (b9 == 47) {
                            int i10 = i + 2;
                            if (bArr[i9] == 42) {
                                while (true) {
                                    int i11 = i10 + 1;
                                    if (i11 >= i6) {
                                        break;
                                    }
                                    if (((char) bArr[i10]) == '*' && ((char) bArr[i11]) == '/') {
                                        i6 = i10 + 2;
                                        i10 = i6;
                                    } else {
                                        i10 = i11;
                                    }
                                }
                                cr.G(i6 - cr.f24253b);
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
        int i = cr.f24253b;
        int i6 = cr.f24254c;
        loop0: while (true) {
            for (boolean z3 = false; i < i6 && !z3; z3 = true) {
                char c9 = (char) cr.f24252a[i];
                if ((c9 >= 'A' && c9 <= 'Z') || ((c9 >= 'a' && c9 <= 'z') || ((c9 >= '0' && c9 <= '9') || c9 == '#' || c9 == '-' || c9 == '.' || c9 == '_'))) {
                    sb.append(c9);
                    i++;
                }
            }
        }
        cr.G(i - cr.f24253b);
        return sb.toString();
    }
}
