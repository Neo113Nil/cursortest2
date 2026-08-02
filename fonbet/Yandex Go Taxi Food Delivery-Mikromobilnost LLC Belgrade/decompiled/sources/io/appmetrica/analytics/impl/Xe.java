package io.appmetrica.analytics.impl;

import defpackage.bsq0;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes9.dex */
public final class Xe {
    public final Executor a;
    public final So b;
    public final String c;
    public final SystemTimeProvider d;

    public Xe(IHandlerExecutor iHandlerExecutor, AbstractC0421ig abstractC0421ig, String str, SystemTimeProvider systemTimeProvider) {
        this.a = iHandlerExecutor;
        this.b = abstractC0421ig;
        this.c = str;
        this.d = systemTimeProvider;
    }

    public static final void a(Xe xe, List list) {
        C0313en c0313en = Cm.a;
        Ze ze = new Ze(xe.b, xe.c, xe.d, list);
        c0313en.getClass();
        c0313en.a(new Sm(ze));
    }

    public final void a(ArrayList arrayList) {
        this.a.execute(new bsq0(7, this, arrayList));
    }
}
