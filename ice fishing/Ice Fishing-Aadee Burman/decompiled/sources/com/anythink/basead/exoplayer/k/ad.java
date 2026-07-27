package com.anythink.basead.exoplayer.k;

import android.os.Trace;

/* loaded from: classes.dex */
public final class ad {
    private ad() {
    }

    public static void a(String str) {
        if (af.f8346a >= 18) {
            Trace.beginSection(str);
        }
    }

    private static void b(String str) {
        Trace.beginSection(str);
    }

    private static void b() {
        Trace.endSection();
    }

    public static void a() {
        if (af.f8346a >= 18) {
            Trace.endSection();
        }
    }
}
