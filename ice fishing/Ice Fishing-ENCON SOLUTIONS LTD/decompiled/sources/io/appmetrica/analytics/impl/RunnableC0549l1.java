package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.l1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0549l1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f6410a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0756t1 f6411b;

    public RunnableC0549l1(C0756t1 c0756t1, List list) {
        this.f6411b = c0756t1;
        this.f6410a = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0756t1.a(this.f6411b).reportAnr(CollectionUtils.getMapFromList(this.f6410a));
    }
}
