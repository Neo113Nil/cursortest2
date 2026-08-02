package io.appmetrica.analytics.impl;

import defpackage.juc;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes5.dex */
public final class Ie {
    public final Executor a;
    public final InterfaceC0789xo b;
    public final String c;
    public final SystemTimeProvider d;

    public Ie(IHandlerExecutor iHandlerExecutor, Tf tf, String str, SystemTimeProvider systemTimeProvider) {
        this.a = iHandlerExecutor;
        this.b = tf;
        this.c = str;
        this.d = systemTimeProvider;
    }

    public static final void a(Ie ie, List list) {
        Om om = AbstractC0469mm.a;
        Ke ke = new Ke(ie.b, ie.c, ie.d, list);
        om.getClass();
        om.a(new Cm(ke));
    }

    public final void a(ArrayList arrayList) {
        this.a.execute(new juc(4, this, arrayList));
    }
}
