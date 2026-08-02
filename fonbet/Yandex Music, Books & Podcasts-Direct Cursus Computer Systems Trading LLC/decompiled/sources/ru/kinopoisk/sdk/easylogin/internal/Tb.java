package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.hq5;
import defpackage.rvf;
import defpackage.uif;
import defpackage.yci;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class Tb extends uif implements Function2<hq5, Integer, Unit> {
    public final /* synthetic */ yci a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Function0<Unit> d;
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Tb(yci yciVar, long j, long j2, Function0 function0, int i) {
        super(2);
        this.a = yciVar;
        this.b = j;
        this.c = j2;
        this.d = function0;
        this.e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        Ub.a(this.a, this.b, this.c, this.d, (hq5) obj, rvf.R(this.e | 1));
        return Unit.a;
    }
}
