package com.google.android.gms.internal.ads;

import java.io.File;
import java.util.concurrent.ExecutorService;

/* renamed from: com.google.android.gms.internal.ads.yy, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4263yy {

    /* renamed from: a, reason: collision with root package name */
    public final File f36037a;

    /* renamed from: b, reason: collision with root package name */
    public final ExecutorService f36038b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC4209xy f36039c;

    /* renamed from: d, reason: collision with root package name */
    public final UA f36040d;

    public C4263yy(File file, ExecutorService executorService, InterfaceC4209xy interfaceC4209xy, UA ua) {
        this.f36037a = file;
        this.f36038b = executorService;
        this.f36039c = interfaceC4209xy;
        this.f36040d = ua;
    }

    public final RunnableFutureC2989bE a(Object obj) {
        return QC.o(new E2.w(11, this, obj), this.f36038b);
    }
}
