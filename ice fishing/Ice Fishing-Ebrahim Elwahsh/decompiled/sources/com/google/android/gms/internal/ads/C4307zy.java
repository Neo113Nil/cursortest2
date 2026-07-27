package com.google.android.gms.internal.ads;

import java.io.File;
import java.util.concurrent.ExecutorService;

/* renamed from: com.google.android.gms.internal.ads.zy, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4307zy {

    /* renamed from: a, reason: collision with root package name */
    public final File f35643a;

    /* renamed from: b, reason: collision with root package name */
    public final ExecutorService f35644b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC4253yy f35645c;

    /* renamed from: d, reason: collision with root package name */
    public final XA f35646d;

    public C4307zy(File file, ExecutorService executorService, InterfaceC4253yy interfaceC4253yy, XA xa) {
        this.f35643a = file;
        this.f35644b = executorService;
        this.f35645c = interfaceC4253yy;
        this.f35646d = xa;
    }

    public final RunnableFutureC3083dE a(Object obj) {
        return C3686oN.p(new T6(10, this, obj), this.f35644b);
    }
}
