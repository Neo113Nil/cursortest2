package io.appmetrica.analytics.impl;

import defpackage.uif;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* renamed from: io.appmetrica.analytics.impl.y, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0792y extends uif implements Function1 {
    public final /* synthetic */ C0648t a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0792y(C0648t c0648t) {
        super(1);
        this.a = c0648t;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        this.a.e = (byte[]) obj;
        return Unit.a;
    }
}
