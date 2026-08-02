package com.yandex.passport.common.coroutine;

import defpackage.bsd;
import defpackage.ca8;
import defpackage.dq7;
import defpackage.j5h;
import defpackage.mn7;
import defpackage.uob;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes4.dex */
public final class b implements a {
    public final bsd a;
    public final bsd b;
    public final dq7 c;
    public final mn7 d;
    public final uob e;
    public final uob f;

    public b() {
        dq7 dq7Var = ca8.a;
        bsd bsdVar = j5h.a;
        this.a = bsdVar;
        this.b = bsdVar.g;
        this.c = ca8.a;
        this.d = mn7.d;
        ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
        newCachedThreadPool.getClass();
        this.e = new uob(newCachedThreadPool);
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        newSingleThreadExecutor.getClass();
        this.f = new uob(newSingleThreadExecutor);
    }
}
