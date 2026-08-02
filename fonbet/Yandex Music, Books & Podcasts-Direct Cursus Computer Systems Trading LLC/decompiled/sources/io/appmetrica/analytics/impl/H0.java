package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Handler;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;

/* loaded from: classes5.dex */
public abstract class H0 {
    public static C0237el a(Xh xh, Context context, ICommonExecutor iCommonExecutor) {
        C0649t0 c0649t0 = new C0649t0(context, iCommonExecutor);
        return new C0237el(c0649t0, new Xq(new Kc()), new C0741w5(xh), new Wm(context, c0649t0));
    }

    public static Xh a(Context context, ResultReceiverC0685u7 resultReceiverC0685u7) {
        return new Xh(context, resultReceiverC0685u7);
    }

    public static ResultReceiverC0685u7 a(Handler handler, G0 g0) {
        return new ResultReceiverC0685u7(handler, g0);
    }

    public static Ro a(Context context, C0237el c0237el, C0608rh c0608rh, Handler handler) {
        return new Ro(c0237el, new Zo(context, c0608rh), handler);
    }

    public static Mi a(C0237el c0237el, C0608rh c0608rh, Handler handler) {
        return new Mi(c0237el, c0608rh, handler, c0608rh.s());
    }

    public static Mk a(Context context, Xh xh, C0237el c0237el, Handler handler, Ro ro) {
        return new Mk(context, xh, c0237el, handler, ro);
    }

    public static Ie a(Context context) {
        return new Ie(R4.l().c.a(), R4.l().b(context), "client_modules", new SystemTimeProvider());
    }
}
