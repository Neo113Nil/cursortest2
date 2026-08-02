package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.ep, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0241ep extends E6 {
    public final C0509o4 b;

    public C0241ep(@NonNull Context context, @NonNull String str) {
        this(context, str, new SafePackageManager(), C0747wb.k().f());
    }

    @NonNull
    public final C0270fp a() {
        return new C0270fp();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.appmetrica.analytics.impl.E6, io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.ComponentLoader, io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.RequestConfigLoader
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C0270fp load(@NonNull D6 d6) {
        C0270fp c0270fp = (C0270fp) super.load(d6);
        C0385jp c0385jp = d6.a;
        c0270fp.d = c0385jp.f;
        c0270fp.e = c0385jp.g;
        C0212dp c0212dp = (C0212dp) d6.componentArguments;
        String str = c0212dp.a;
        if (str != null) {
            c0270fp.f = str;
            c0270fp.g = c0212dp.b;
        }
        Map<String, String> map = c0212dp.c;
        c0270fp.h = map;
        c0270fp.i = (C0278g4) this.b.a(new C0278g4(map, X8.c));
        C0212dp c0212dp2 = (C0212dp) d6.componentArguments;
        c0270fp.k = c0212dp2.d;
        c0270fp.j = c0212dp2.e;
        C0385jp c0385jp2 = d6.a;
        c0270fp.l = c0385jp2.q;
        c0270fp.m = c0385jp2.s;
        long j = c0385jp2.w;
        if (c0270fp.n == 0) {
            c0270fp.n = j;
        }
        return c0270fp;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.ComponentLoader
    @NonNull
    public final BaseRequestConfig createBlankConfig() {
        return new C0270fp();
    }

    public C0241ep(@NonNull Context context, @NonNull String str, @NonNull SafePackageManager safePackageManager, @NonNull C0509o4 c0509o4) {
        super(context, str, safePackageManager);
        this.b = c0509o4;
    }
}
