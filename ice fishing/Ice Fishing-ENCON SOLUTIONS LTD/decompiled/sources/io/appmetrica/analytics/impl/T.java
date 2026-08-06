package io.appmetrica.analytics.impl;

import android.content.Context;
import t1.InterfaceC1046a;

/* loaded from: classes.dex */
public final class T extends kotlin.jvm.internal.j implements InterfaceC1046a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ U f5079a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Gi f5080b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T(U u2, Gi gi) {
        super(0);
        this.f5079a = u2;
        this.f5080b = gi;
    }

    @Override // t1.InterfaceC1046a
    public final Object invoke() {
        U u2 = this.f5079a;
        N n2 = u2.f5138h;
        Context context = u2.f5131a;
        Gi gi = this.f5080b;
        n2.getClass();
        return N.a(new M(n2, context, gi));
    }
}
