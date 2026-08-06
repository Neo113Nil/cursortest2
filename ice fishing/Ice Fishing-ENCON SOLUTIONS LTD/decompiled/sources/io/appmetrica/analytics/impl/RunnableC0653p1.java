package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.p1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0653p1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f6712a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f6713b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0756t1 f6714c;

    public RunnableC0653p1(C0756t1 c0756t1, String str, List list) {
        this.f6714c = c0756t1;
        this.f6712a = str;
        this.f6713b = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0756t1.a(this.f6714c).reportEvent(this.f6712a, CollectionUtils.getMapFromList(this.f6713b));
    }
}
