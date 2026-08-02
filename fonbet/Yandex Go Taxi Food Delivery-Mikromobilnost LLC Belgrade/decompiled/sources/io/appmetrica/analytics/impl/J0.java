package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Handler;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;

/* loaded from: classes9.dex */
public abstract class J0 {
    public static C0600ol a(C0597oi c0597oi, Context context, ICommonExecutor iCommonExecutor) {
        C0781v0 c0781v0 = new C0781v0(context, iCommonExecutor);
        return new C0600ol(c0781v0, new C0664qr(new C0188ad()), new C0902z5(c0597oi), new C0602on(context, c0781v0));
    }

    public static C0597oi a(Context context, ResultReceiverC0904z7 resultReceiverC0904z7) {
        return new C0597oi(context, resultReceiverC0904z7);
    }

    public static ResultReceiverC0904z7 a(Handler handler, I0 i0) {
        return new ResultReceiverC0904z7(handler, i0);
    }

    public static C0459jp a(Context context, C0600ol c0600ol, Handler handler) {
        return new C0459jp(c0600ol, V4.l().d(context), handler);
    }

    public static Si a(C0600ol c0600ol, Hh hh, Handler handler) {
        return new Si(c0600ol, hh, handler, hh.s());
    }

    public static Wk a(Context context, C0597oi c0597oi, C0600ol c0600ol, Handler handler, C0459jp c0459jp) {
        return new Wk(context, c0597oi, c0600ol, handler, c0459jp);
    }

    public static Xe a(Context context) {
        return new Xe(V4.l().c.a(), V4.l().b(context), "client_modules", new SystemTimeProvider());
    }
}
