package io.appmetrica.analytics.impl;

import defpackage.gvo;
import defpackage.uif;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final class Cf extends uif implements Function1 {
    public final /* synthetic */ Ff a;
    public final /* synthetic */ gvo b;
    public final /* synthetic */ String c;
    public final /* synthetic */ long d;
    public final /* synthetic */ double e;
    public final /* synthetic */ String f;
    public final /* synthetic */ String g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Cf(Ff ff, gvo gvoVar, String str, long j, double d, String str2, String str3) {
        super(1);
        this.a = ff;
        this.b = gvoVar;
        this.c = str;
        this.d = j;
        this.e = d;
        this.f = str2;
        this.g = str3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        this.a.a.reportKeyMetric(this.b, this.c, this.d, this.e, this.f, this.g);
        return Unit.a;
    }
}
