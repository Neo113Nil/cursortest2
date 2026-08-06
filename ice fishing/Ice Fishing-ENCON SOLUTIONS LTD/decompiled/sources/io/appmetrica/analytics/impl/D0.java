package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Handler;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;

/* loaded from: classes.dex */
public abstract class D0 {
    public static B6 a(Handler handler, C0 c02) {
        return new B6(handler, c02);
    }

    public static Bf a(Context context, B6 b6) {
        return new Bf(context, b6);
    }

    public static C0851wi a(Bf bf, Context context, ICommonExecutor iCommonExecutor) {
        C0652p0 c0652p0 = new C0652p0(context, iCommonExecutor);
        return new C0851wi(c0652p0, new Sn(new C0559lb()), new F4(bf), new Yj(context, c0652p0));
    }

    public static Ol a(Context context, C0851wi c0851wi, Ve ve, Handler handler) {
        return new Ol(c0851wi, new Wl(context, ve), handler);
    }

    public static C0512jg a(C0851wi c0851wi, Ve ve, Handler handler) {
        return new C0512jg(c0851wi, ve, handler, ve.s());
    }

    public static C0514ji a(Context context, Bf bf, C0851wi c0851wi, Handler handler, Ol ol) {
        return new C0514ji(context, bf, c0851wi, handler, ol);
    }

    public static C0329cd a(Context context) {
        return new C0329cd(C0294b4.l().f5584c.a(), C0294b4.l().b(context), "client_modules", new SystemTimeProvider());
    }
}
