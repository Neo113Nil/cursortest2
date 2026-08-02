package io.appmetrica.analytics.impl;

import android.content.Context;
import defpackage.uif;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class X extends uif implements Function0 {
    public final /* synthetic */ Y a;
    public final /* synthetic */ InterfaceC0526ol b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X(Y y, InterfaceC0526ol interfaceC0526ol) {
        super(0);
        this.a = y;
        this.b = interfaceC0526ol;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Y y = this.a;
        P p = y.h;
        Context context = y.a;
        InterfaceC0526ol interfaceC0526ol = this.b;
        p.getClass();
        return P.a(new O(p, context, interfaceC0526ol));
    }
}
