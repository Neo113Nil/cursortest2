package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class X0 {

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f28580c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* renamed from: a, reason: collision with root package name */
    public int f28581a = -1;

    /* renamed from: b, reason: collision with root package name */
    public int f28582b = -1;

    public final void a(R3 r32) {
        C3675oC a9 = r32.a(W1.class, W0.f28339v);
        int i = a9.f33117w;
        int i4 = 0;
        int i9 = 0;
        while (i9 < i) {
            boolean b9 = b(((W1) a9.get(i9)).f28346d);
            i9++;
            if (b9) {
                return;
            }
        }
        C3675oC a10 = r32.a(C2907a2.class, W0.f28338u);
        int i10 = a10.f33117w;
        while (i4 < i10) {
            boolean b10 = b(((C2907a2) a10.get(i4)).f29162d);
            i4++;
            if (b10) {
                return;
            }
        }
    }

    public final boolean b(String str) {
        Matcher matcher = f28580c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            String group = matcher.group(1);
            String str2 = AbstractC3548lu.f32613a;
            int parseInt = Integer.parseInt(group, 16);
            int parseInt2 = Integer.parseInt(matcher.group(2), 16);
            if (parseInt <= 0 && parseInt2 <= 0) {
                return false;
            }
            this.f28581a = parseInt;
            this.f28582b = parseInt2;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }
}
