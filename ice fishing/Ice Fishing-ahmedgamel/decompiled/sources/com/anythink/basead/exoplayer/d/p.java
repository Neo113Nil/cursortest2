package com.anythink.basead.exoplayer.d;

import android.util.Pair;
import java.util.Map;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public static final String f6883a = "LicenseDurationRemaining";

    /* renamed from: b, reason: collision with root package name */
    public static final String f6884b = "PlaybackDurationRemaining";

    private p() {
    }

    public static Pair<Long, Long> a(f<?> fVar) {
        Map<String, String> h9 = fVar.h();
        if (h9 == null) {
            return null;
        }
        return new Pair<>(Long.valueOf(a(h9, f6883a)), Long.valueOf(a(h9, f6884b)));
    }

    private static long a(Map<String, String> map, String str) {
        if (map == null) {
            return com.anythink.basead.exoplayer.b.f6382b;
        }
        try {
            String str2 = map.get(str);
            return str2 != null ? Long.parseLong(str2) : com.anythink.basead.exoplayer.b.f6382b;
        } catch (NumberFormatException unused) {
            return com.anythink.basead.exoplayer.b.f6382b;
        }
    }
}
