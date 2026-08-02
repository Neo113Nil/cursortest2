package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Bundle;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class Yj implements Runnable {
    public final Context a;
    public final K6 b;
    public final Bundle c;
    public final U4 d;

    public Yj(Context context, K6 k6, Bundle bundle, U4 u4) {
        this.a = context;
        this.b = k6;
        this.c = bundle;
        this.d = u4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            B4 a = B4.a(this.a, this.c);
            if (a == null) {
                return;
            }
            J4 a2 = J4.a(a);
            C0745tm v = Jb.I.v();
            v.a(a.b.getAppVersion(), a.b.getAppBuildNumber());
            v.a(a.b.getDeviceType());
            C0468k5 c0468k5 = new C0468k5(a);
            this.d.a(a2, c0468k5).a(this.b, c0468k5);
        } catch (Throwable th) {
            C0313en c0313en = Cm.a;
            String str = "Exception during processing event with type: " + this.b.d + Extension.O_BRAKE_SPACE + this.b.e + "): " + th.getMessage();
            c0313en.getClass();
            c0313en.a(new Dm(str, th));
        }
    }
}
