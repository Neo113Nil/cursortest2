package io.appmetrica.analytics.impl;

import defpackage.gvo;
import defpackage.uif;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final class Bf extends uif implements Function1 {
    public final /* synthetic */ Ff a;
    public final /* synthetic */ gvo b;
    public final /* synthetic */ String c;
    public final /* synthetic */ long d;
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Bf(Ff ff, gvo gvoVar, String str, long j, String str2, String str3) {
        super(1);
        this.a = ff;
        this.b = gvoVar;
        this.c = str;
        this.d = j;
        this.e = str2;
        this.f = str3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        this.a.a.reportAdditionalMetric(this.b, this.c, this.d, this.e, this.f);
        return Unit.a;
    }
}
