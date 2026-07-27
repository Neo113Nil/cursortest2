package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class Z0 {

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f28815c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* renamed from: a, reason: collision with root package name */
    public int f28816a = -1;

    /* renamed from: b, reason: collision with root package name */
    public int f28817b = -1;

    public final void a(O3 o32) {
        C3500lC a9 = o32.a(Y1.class, Y0.f28628v);
        int i = a9.f31747w;
        int i6 = 0;
        int i9 = 0;
        while (i9 < i) {
            boolean b9 = b(((Y1) a9.get(i9)).f28635d);
            i9++;
            if (b9) {
                return;
            }
        }
        C3500lC a10 = o32.a(C3061d2.class, Y0.f28627u);
        int i10 = a10.f31747w;
        while (i6 < i10) {
            boolean b10 = b(((C3061d2) a10.get(i6)).f29664d);
            i6++;
            if (b10) {
                return;
            }
        }
    }

    public final boolean b(String str) {
        Matcher matcher = f28815c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            String group = matcher.group(1);
            String str2 = AbstractC3159eu.f29993a;
            int parseInt = Integer.parseInt(group, 16);
            int parseInt2 = Integer.parseInt(matcher.group(2), 16);
            if (parseInt <= 0 && parseInt2 <= 0) {
                return false;
            }
            this.f28816a = parseInt;
            this.f28817b = parseInt2;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }
}
