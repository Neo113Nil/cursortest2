package io.appmetrica.analytics.impl;

import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.qd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0691qd extends kotlin.jvm.internal.j implements t1.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0404fb f6775a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0691qd(C0404fb c0404fb) {
        super(1);
        this.f6775a = c0404fb;
    }

    @Override // t1.l
    public final Object invoke(Object obj) {
        Yc yc = (Yc) ((Map.Entry) obj).getValue();
        return yc.f5430b.parse(this.f6775a);
    }
}
