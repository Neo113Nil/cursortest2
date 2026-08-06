package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import io.appmetrica.analytics.coreapi.internal.model.ScreenInfo;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import io.appmetrica.analytics.internal.AppMetricaService;

/* loaded from: classes.dex */
public final class G1 {

    /* renamed from: a, reason: collision with root package name */
    public final SafePackageManager f4409a = new SafePackageManager();

    public final Intent a(Context context) {
        Bundle bundle;
        C0309bj c0309bj;
        C0294b4.l().f5601u.getClass();
        Intent data = new Intent(context, (Class<?>) AppMetricaService.class).setAction("io.appmetrica.analytics.IAppMetricaService").setData(new Uri.Builder().scheme(G7.f4414b).authority(context.getPackageName()).path("client").appendQueryParameter("pid", String.valueOf(Process.myPid())).appendQueryParameter("psid", Bf.f4213c).build());
        ApplicationInfo applicationInfo = this.f4409a.getApplicationInfo(context, context.getPackageName(), 128);
        if (applicationInfo == null || (bundle = applicationInfo.metaData) == null) {
            bundle = new Bundle();
        }
        Intent putExtras = data.putExtras(bundle);
        C0294b4 l2 = C0294b4.l();
        synchronized (l2) {
            try {
                if (l2.f5596o == null) {
                    C0309bj c0309bj2 = new C0309bj();
                    l2.f5596o = c0309bj2;
                    l2.f5589h.a(c0309bj2);
                }
                c0309bj = l2.f5596o;
            } catch (Throwable th) {
                throw th;
            }
        }
        ScreenInfo b2 = c0309bj.b(context);
        return putExtras.putExtra("screen_size", b2 != null ? AbstractC0430gb.a(b2) : null);
    }
}
