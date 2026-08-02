package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Process;
import io.appmetrica.analytics.coreapi.internal.model.ScreenInfo;

/* renamed from: io.appmetrica.analytics.impl.m2, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0449m2 {
    public static Intent a(Context context) {
        Zl zl;
        C0268fn a = R4.l().w.a(context);
        Intent data = new Intent(context, (Class<?>) a.b).setAction("io.appmetrica.analytics.IAppMetricaService").setData(new Uri.Builder().scheme(C0829z8.b).authority(a.a).path("client").appendQueryParameter("pid", String.valueOf(Process.myPid())).appendQueryParameter("psid", Xh.c).build());
        R4 l = R4.l();
        synchronized (l) {
            try {
                if (l.p == null) {
                    Zl zl2 = new Zl();
                    l.p = zl2;
                    l.h.a(zl2);
                }
                zl = l.p;
            } catch (Throwable th) {
                throw th;
            }
        }
        ScreenInfo b = zl.b(context);
        return data.putExtra("screen_size", b != null ? Fc.a(b) : null);
    }
}
