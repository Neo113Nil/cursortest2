package io.appmetrica.analytics.impl;

import android.content.Context;
import t1.InterfaceC1046a;

/* loaded from: classes.dex */
public final class Q extends kotlin.jvm.internal.j implements InterfaceC1046a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ U f4946a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q(U u2) {
        super(0);
        this.f4946a = u2;
    }

    @Override // t1.InterfaceC1046a
    public final Object invoke() {
        U u2 = this.f4946a;
        N n2 = u2.f5136f;
        Context context = u2.f5131a;
        n2.getClass();
        return N.a(new L(n2, context));
    }
}
