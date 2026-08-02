package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.wp, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0835wp extends H6 {
    public final C0698s4 b;

    public C0835wp(Context context, String str) {
        this(context, str, new SafePackageManager(), Jb.k().f());
    }

    public final C0864xp a() {
        return new C0864xp();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.appmetrica.analytics.impl.H6, io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.ComponentLoader, io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.RequestConfigLoader
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C0864xp load(G6 g6) {
        C0864xp c0864xp = (C0864xp) super.load(g6);
        Bp bp = g6.a;
        c0864xp.d = bp.f;
        c0864xp.e = bp.g;
        C0806vp c0806vp = (C0806vp) g6.componentArguments;
        String str = c0806vp.a;
        if (str != null) {
            c0864xp.f = str;
            c0864xp.g = c0806vp.b;
        }
        Map<String, String> map = c0806vp.c;
        c0864xp.h = map;
        c0864xp.i = (C0467k4) this.b.a(new C0467k4(map, EnumC0271d9.d));
        C0806vp c0806vp2 = (C0806vp) g6.componentArguments;
        c0864xp.k = c0806vp2.d;
        c0864xp.j = c0806vp2.e;
        Bp bp2 = g6.a;
        c0864xp.l = bp2.q;
        c0864xp.m = bp2.s;
        long j = bp2.w;
        if (c0864xp.n == 0) {
            c0864xp.n = j;
        }
        return c0864xp;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.ComponentLoader
    public final BaseRequestConfig createBlankConfig() {
        return new C0864xp();
    }

    public C0835wp(Context context, String str, SafePackageManager safePackageManager, C0698s4 c0698s4) {
        super(context, str, safePackageManager);
        this.b = c0698s4;
    }
}
