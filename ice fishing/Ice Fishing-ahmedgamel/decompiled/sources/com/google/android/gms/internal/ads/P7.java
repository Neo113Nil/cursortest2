package com.google.android.gms.internal.ads;

import java.lang.reflect.Method;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes2.dex */
public final class P7 {

    /* renamed from: a, reason: collision with root package name */
    public final C4219y7 f27521a;

    /* renamed from: b, reason: collision with root package name */
    public final String f27522b;

    /* renamed from: c, reason: collision with root package name */
    public final String f27523c;

    /* renamed from: e, reason: collision with root package name */
    public final Class[] f27525e;

    /* renamed from: d, reason: collision with root package name */
    public volatile Method f27524d = null;

    /* renamed from: f, reason: collision with root package name */
    public final CountDownLatch f27526f = new CountDownLatch(1);

    public P7(C4219y7 c4219y7, String str, String str2, Class... clsArr) {
        this.f27521a = c4219y7;
        this.f27522b = str;
        this.f27523c = str2;
        this.f27525e = clsArr;
        c4219y7.f35882b.submit(new RunnableC3134e(this));
    }
}
