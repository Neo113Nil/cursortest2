package com.google.android.gms.internal.ads;

import java.lang.reflect.Method;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes2.dex */
public final class O7 {

    /* renamed from: a, reason: collision with root package name */
    public final C4101w7 f26652a;

    /* renamed from: b, reason: collision with root package name */
    public final String f26653b;

    /* renamed from: c, reason: collision with root package name */
    public final String f26654c;

    /* renamed from: e, reason: collision with root package name */
    public final Class[] f26656e;

    /* renamed from: d, reason: collision with root package name */
    public volatile Method f26655d = null;

    /* renamed from: f, reason: collision with root package name */
    public final CountDownLatch f26657f = new CountDownLatch(1);

    public O7(C4101w7 c4101w7, String str, String str2, Class... clsArr) {
        this.f26652a = c4101w7;
        this.f26653b = str;
        this.f26654c = str2;
        this.f26656e = clsArr;
        c4101w7.f34930b.submit(new RunnableC3068d(this));
    }
}
