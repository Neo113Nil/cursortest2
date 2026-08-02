package com.anythink.basead.exoplayer;

import java.util.HashSet;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public static final String f9322a = "ExoPlayer";

    /* renamed from: b, reason: collision with root package name */
    public static final String f9323b = "2.8.4";

    /* renamed from: c, reason: collision with root package name */
    public static final String f9324c = "ExoPlayerLib/2.8.4";

    /* renamed from: d, reason: collision with root package name */
    public static final int f9325d = 2008004;

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f9326e = true;

    /* renamed from: f, reason: collision with root package name */
    public static final boolean f9327f = true;

    /* renamed from: g, reason: collision with root package name */
    private static final HashSet<String> f9328g = new HashSet<>();

    /* renamed from: h, reason: collision with root package name */
    private static String f9329h = "goog.exo.core";

    private l() {
    }

    public static synchronized String a() {
        String str;
        synchronized (l.class) {
            str = f9329h;
        }
        return str;
    }

    private static synchronized void a(String str) {
        synchronized (l.class) {
            if (f9328g.add(str)) {
                f9329h += ", " + str;
            }
        }
    }
}
