package com.anythink.basead.exoplayer.d;

import android.util.Pair;
import java.util.Map;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public static final String f7669a = "LicenseDurationRemaining";

    /* renamed from: b, reason: collision with root package name */
    public static final String f7670b = "PlaybackDurationRemaining";

    private p() {
    }

    public static Pair<Long, Long> a(f<?> fVar) {
        Map<String, String> h3 = fVar.h();
        if (h3 == null) {
            return null;
        }
        return new Pair<>(Long.valueOf(a(h3, f7669a)), Long.valueOf(a(h3, f7670b)));
    }

    private static long a(Map<String, String> map, String str) {
        if (map == null) {
            return com.anythink.basead.exoplayer.b.f7168b;
        }
        try {
            String str2 = map.get(str);
            return str2 != null ? Long.parseLong(str2) : com.anythink.basead.exoplayer.b.f7168b;
        } catch (NumberFormatException unused) {
            return com.anythink.basead.exoplayer.b.f7168b;
        }
    }
}
