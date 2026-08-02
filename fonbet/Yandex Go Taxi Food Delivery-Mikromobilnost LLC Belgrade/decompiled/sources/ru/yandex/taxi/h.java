package ru.yandex.taxi;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.telephony.TelephonyManager;
import defpackage.evu0;
import defpackage.hst;
import defpackage.jst;
import defpackage.kyh0;
import defpackage.nib1;
import defpackage.pvn;
import defpackage.q5z;
import defpackage.tpr;
import defpackage.unr0;
import defpackage.ys20;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes9.dex */
public final class h {
    public final Context a;

    public h(Context context) {
        this.a = context.getApplicationContext();
    }

    public final tpr a() {
        TelephonyManager telephonyManager = (TelephonyManager) this.a.getSystemService(TelephonyManager.class);
        return telephonyManager == null ? pvn.a : kotlinx.coroutines.flow.e.g(new PlatformHelper$observeCallState$1(this, telephonyManager, null));
    }

    public final List b() {
        Context context = this.a;
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(TelephonyManager.class);
        if (telephonyManager == null) {
            return null;
        }
        Configuration configuration = context.getResources().getConfiguration();
        int i = configuration.mcc;
        String valueOf = i > 0 ? String.valueOf(i) : null;
        int i2 = configuration.mnc;
        String valueOf2 = i2 > 0 ? String.valueOf(i2) : null;
        String networkCountryIso = telephonyManager.getNetworkCountryIso();
        if ((valueOf == null || evu0.J(valueOf)) && ((valueOf2 == null || evu0.J(valueOf2)) && (networkCountryIso == null || evu0.J(networkCountryIso)))) {
            return null;
        }
        return Collections.singletonList(new ys20(valueOf, valueOf2, networkCountryIso));
    }

    public final boolean c(String str) {
        try {
            PackageInfo packageInfo = this.a.getPackageManager().getPackageInfo(str, 0);
            hst hstVar = jst.e;
            String.format("Package %s is found!", Arrays.copyOf(new Object[]{str}, 1));
            hstVar.getClass();
            return packageInfo != null;
        } catch (PackageManager.NameNotFoundException unused) {
            unr0.C(new Object[]{str}, 1, "Cannot find package %s", jst.e);
            return false;
        }
    }

    public final void d(String str) {
        String d = nib1.d(str);
        String c = nib1.c(str);
        Context context = this.a;
        q5z.P(context, c, d, context.getString(kyh0.common_cant_open_url, d));
    }
}
