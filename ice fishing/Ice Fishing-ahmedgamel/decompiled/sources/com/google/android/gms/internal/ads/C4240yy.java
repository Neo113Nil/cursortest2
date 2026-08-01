package com.google.android.gms.internal.ads;

import java.io.File;
import java.util.concurrent.ExecutorService;

/* renamed from: com.google.android.gms.internal.ads.yy, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4240yy {

    /* renamed from: a, reason: collision with root package name */
    public final File f35253a;

    /* renamed from: b, reason: collision with root package name */
    public final ExecutorService f35254b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC4186xy f35255c;

    /* renamed from: d, reason: collision with root package name */
    public final UA f35256d;

    public C4240yy(File file, ExecutorService executorService, InterfaceC4186xy interfaceC4186xy, UA ua) {
        this.f35253a = file;
        this.f35254b = executorService;
        this.f35255c = interfaceC4186xy;
        this.f35256d = ua;
    }

    public final RunnableFutureC2966bE a(Object obj) {
        return QC.o(new C2.x(11, this, obj), this.f35254b);
    }
}
