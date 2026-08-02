package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class Z0 {

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f29595c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* renamed from: a, reason: collision with root package name */
    public int f29596a = -1;

    /* renamed from: b, reason: collision with root package name */
    public int f29597b = -1;

    public final void a(O3 o32) {
        C3523lC a9 = o32.a(Y1.class, Y0.f29405v);
        int i = a9.f32527w;
        int i4 = 0;
        int i6 = 0;
        while (i6 < i) {
            boolean b9 = b(((Y1) a9.get(i6)).f29412d);
            i6++;
            if (b9) {
                return;
            }
        }
        C3523lC a10 = o32.a(C3084d2.class, Y0.f29404u);
        int i9 = a10.f32527w;
        while (i4 < i9) {
            boolean b10 = b(((C3084d2) a10.get(i4)).f30436d);
            i4++;
            if (b10) {
                return;
            }
        }
    }

    public final boolean b(String str) {
        Matcher matcher = f29595c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            String group = matcher.group(1);
            String str2 = AbstractC3182eu.f30782a;
            int parseInt = Integer.parseInt(group, 16);
            int parseInt2 = Integer.parseInt(matcher.group(2), 16);
            if (parseInt <= 0 && parseInt2 <= 0) {
                return false;
            }
            this.f29596a = parseInt;
            this.f29597b = parseInt2;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }
}
