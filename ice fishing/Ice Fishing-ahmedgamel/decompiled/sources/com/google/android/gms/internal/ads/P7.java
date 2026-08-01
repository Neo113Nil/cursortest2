package com.google.android.gms.internal.ads;

import java.lang.reflect.Method;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes2.dex */
public final class P7 {

    /* renamed from: a, reason: collision with root package name */
    public final C4196y7 f26738a;

    /* renamed from: b, reason: collision with root package name */
    public final String f26739b;

    /* renamed from: c, reason: collision with root package name */
    public final String f26740c;

    /* renamed from: e, reason: collision with root package name */
    public final Class[] f26742e;

    /* renamed from: d, reason: collision with root package name */
    public volatile Method f26741d = null;

    /* renamed from: f, reason: collision with root package name */
    public final CountDownLatch f26743f = new CountDownLatch(1);

    public P7(C4196y7 c4196y7, String str, String str2, Class... clsArr) {
        this.f26738a = c4196y7;
        this.f26739b = str;
        this.f26740c = str2;
        this.f26742e = clsArr;
        c4196y7.f35096b.submit(new RunnableC3111e(this));
    }
}
