package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Bundle;

/* loaded from: classes5.dex */
public final class Oj implements Runnable {
    public final Context a;
    public final H6 b;
    public final Bundle c;
    public final Q4 d;

    public Oj(Context context, H6 h6, Bundle bundle, Q4 q4) {
        this.a = context;
        this.b = h6;
        this.c = bundle;
        this.d = q4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            C0769x4 a = C0769x4.a(this.a, this.c);
            if (a == null) {
                return;
            }
            F4 a2 = F4.a(a);
            C0181cm v = C0747wb.I.v();
            v.a(a.b.getAppVersion(), a.b.getAppBuildNumber());
            v.a(a.b.getDeviceType());
            C0279g5 c0279g5 = new C0279g5(a);
            this.d.a(a2, c0279g5).a(this.b, c0279g5);
        } catch (Throwable th) {
            Om om = AbstractC0469mm.a;
            String str = "Exception during processing event with type: " + this.b.d + " (" + this.b.e + "): " + th.getMessage();
            om.getClass();
            om.a(new C0498nm(str, th));
        }
    }
}
