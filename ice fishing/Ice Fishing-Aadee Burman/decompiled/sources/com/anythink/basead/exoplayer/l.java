package com.anythink.basead.exoplayer;

import java.util.HashSet;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public static final String f8536a = "ExoPlayer";

    /* renamed from: b, reason: collision with root package name */
    public static final String f8537b = "2.8.4";

    /* renamed from: c, reason: collision with root package name */
    public static final String f8538c = "ExoPlayerLib/2.8.4";

    /* renamed from: d, reason: collision with root package name */
    public static final int f8539d = 2008004;

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f8540e = true;

    /* renamed from: f, reason: collision with root package name */
    public static final boolean f8541f = true;

    /* renamed from: g, reason: collision with root package name */
    private static final HashSet<String> f8542g = new HashSet<>();

    /* renamed from: h, reason: collision with root package name */
    private static String f8543h = "goog.exo.core";

    private l() {
    }

    public static synchronized String a() {
        String str;
        synchronized (l.class) {
            str = f8543h;
        }
        return str;
    }

    private static synchronized void a(String str) {
        synchronized (l.class) {
            if (f8542g.add(str)) {
                f8543h += ", " + str;
            }
        }
    }
}
