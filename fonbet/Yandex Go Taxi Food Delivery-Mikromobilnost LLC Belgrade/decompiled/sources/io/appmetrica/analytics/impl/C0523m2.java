package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Process;
import io.appmetrica.analytics.coreapi.internal.model.ScreenInfo;

/* renamed from: io.appmetrica.analytics.impl.m2, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0523m2 {
    public static Intent a(Context context) {
        C0659qm c0659qm;
        C0862xn a = V4.l().x.a(context);
        Intent data = new Intent(context, (Class<?>) a.b).setAction("io.appmetrica.analytics.IAppMetricaService").setData(new Uri.Builder().scheme(E8.b).authority(a.a).path("client").appendQueryParameter("pid", String.valueOf(Process.myPid())).appendQueryParameter("psid", C0597oi.c).build());
        V4 l = V4.l();
        synchronized (l) {
            try {
                if (l.q == null) {
                    C0659qm c0659qm2 = new C0659qm();
                    l.q = c0659qm2;
                    l.h.a(c0659qm2);
                }
                c0659qm = l.q;
            } catch (Throwable th) {
                throw th;
            }
        }
        ScreenInfo a2 = c0659qm.a(context);
        return data.putExtra("screen_size", a2 != null ? Vc.a(a2) : null);
    }
}
