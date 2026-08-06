package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.am, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0286am extends M5 {

    /* renamed from: b, reason: collision with root package name */
    public final C0914z3 f5572b;

    public C0286am(Context context, String str) {
        this(context, str, new SafePackageManager(), C0610na.k().f());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.appmetrica.analytics.impl.M5, io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.ComponentLoader, io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.RequestConfigLoader
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C0312bm load(L5 l5) {
        C0312bm c0312bm = (C0312bm) super.load(l5);
        C0415fm c0415fm = l5.f4671a;
        c0312bm.f5687d = c0415fm.f6007f;
        c0312bm.f5688e = c0415fm.f6008g;
        Zl zl = (Zl) l5.componentArguments;
        String str = zl.f5527a;
        if (str != null) {
            c0312bm.f5689f = str;
            c0312bm.f5690g = zl.f5528b;
        }
        Map<String, String> map = zl.f5529c;
        c0312bm.f5691h = map;
        c0312bm.f5692i = (C0706r3) this.f5572b.a(new C0706r3(map, S7.f5045c));
        Zl zl2 = (Zl) l5.componentArguments;
        c0312bm.f5694k = zl2.f5530d;
        c0312bm.f5693j = zl2.f5531e;
        C0415fm c0415fm2 = l5.f4671a;
        c0312bm.f5695l = c0415fm2.f6017p;
        c0312bm.f5696m = c0415fm2.f6019r;
        long j2 = c0415fm2.f6022v;
        if (c0312bm.f5697n == 0) {
            c0312bm.f5697n = j2;
        }
        return c0312bm;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.ComponentLoader
    public final BaseRequestConfig createBlankConfig() {
        return new C0312bm();
    }

    public C0286am(Context context, String str, SafePackageManager safePackageManager, C0914z3 c0914z3) {
        super(context, str, safePackageManager);
        this.f5572b = c0914z3;
    }

    public final C0312bm a() {
        return new C0312bm();
    }
}
