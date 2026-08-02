package io.appmetrica.analytics.impl;

import defpackage.gvo;
import defpackage.uif;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final class Ef extends uif implements Function1 {
    public final /* synthetic */ Ff a;
    public final /* synthetic */ gvo b;
    public final /* synthetic */ String c;
    public final /* synthetic */ double d;
    public final /* synthetic */ Map e;
    public final /* synthetic */ String f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ef(Ff ff, gvo gvoVar, String str, double d, Map map, String str2) {
        super(1);
        this.a = ff;
        this.b = gvoVar;
        this.c = str;
        this.d = d;
        this.e = map;
        this.f = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        this.a.a.reportTotalScoreStartupSpecific(this.b, this.c, this.d, this.e, this.f);
        return Unit.a;
    }
}
