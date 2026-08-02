package com.plaid.internal;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import com.plaid.internal.V;
import com.plaid.internal.Z;
import com.plaid.internal.core.crashreporting.internal.models.Breadcrumb;
import com.plaid.internal.core.crashreporting.internal.models.CrashApiOptions;
import com.plaid.internal.core.crashreporting.internal.models.CrashApiOptionsKt;
import com.plaid.internal.core.crashreporting.internal.models.SentryProject;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.MapsKt__MapsKt;

/* renamed from: com.plaid.internal.c5, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0114c5 {
    public final X6 a;
    public final C0099b0 b;
    public final C0207k0 c;

    public C0114c5(Application application, SentryProject.LinkSdk linkSdk, String str, Z.a aVar, E5 e5, C0230m5 c0230m5, M2 m2) {
        application.getClass();
        linkSdk.getClass();
        str.getClass();
        aVar.getClass();
        e5.getClass();
        c0230m5.getClass();
        m2.getClass();
        Resources resources = application.getResources();
        resources.getClass();
        CrashApiOptions crashOptions = CrashApiOptionsKt.toCrashOptions(linkSdk, resources, str);
        W w = new W(e5);
        aVar.getClass();
        V.a aVar2 = Z.a.b;
        aVar2.getClass();
        X6 a = w.a(aVar2.a);
        this.a = a;
        crashOptions.getClass();
        a.c = crashOptions;
        Context applicationContext = application.getApplicationContext();
        applicationContext.getClass();
        C0099b0 c0099b0 = new C0099b0(applicationContext, crashOptions, c0230m5);
        this.b = c0099b0;
        Context applicationContext2 = application.getApplicationContext();
        applicationContext2.getClass();
        applicationContext2.getClass();
        File filesDir = applicationContext2.getFilesDir();
        filesDir.getClass();
        C0180h0 c0180h0 = new C0180h0(new C0194i5(filesDir, "plaid-sdk/crashes"), c0099b0);
        Context applicationContext3 = application.getApplicationContext();
        applicationContext3.getClass();
        C0207k0 c0207k0 = new C0207k0(applicationContext3, c0180h0, aVar2, crashOptions);
        this.c = c0207k0;
        new Z4(c0099b0, c0207k0, m2).a();
    }

    public final void a(X x) {
        Breadcrumb breadcrumb;
        x.getClass();
        C0099b0 c0099b0 = this.b;
        if (x instanceof C0157e4) {
            C0157e4 c0157e4 = (C0157e4) x;
            breadcrumb = new Breadcrumb(Breadcrumb.Type.NAVIGATION, x.a, X.a(c0157e4.d), c0157e4.b, null, c0157e4.c, 16, null);
        } else {
            if (!(x instanceof A1)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return;
            }
            Breadcrumb.Type type2 = Breadcrumb.Type.DEFAULT;
            A1 a1 = (A1) x;
            String str = a1.b;
            Map<String, String> map = a1.c;
            int i = a1.d;
            LinkedHashMap mutableMap = MapsKt__MapsKt.toMutableMap(map);
            mutableMap.put("level", X.a(i).name());
            breadcrumb = new Breadcrumb(type2, x.a, X.a(a1.d), str, null, mutableMap, 16, null);
        }
        c0099b0.getClass();
        P6<Breadcrumb> p6 = c0099b0.e;
        if (p6.a.get(p6.c) != null) {
            p6.b = (p6.b + 1) % 50;
        }
        p6.a.set(p6.c, breadcrumb);
        p6.c = (p6.c + 1) % 50;
        int i2 = p6.d;
        if (i2 != 50) {
            p6.d = i2 + 1;
        }
    }
}
