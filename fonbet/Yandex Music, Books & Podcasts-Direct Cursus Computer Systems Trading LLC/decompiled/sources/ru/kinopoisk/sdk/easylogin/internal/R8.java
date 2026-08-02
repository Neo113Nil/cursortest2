package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.hq5;
import defpackage.rvf;
import defpackage.uif;
import defpackage.vci;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class R8 extends uif implements Function2<hq5, Integer, Unit> {
    public final /* synthetic */ vci a;
    public final /* synthetic */ T8 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R8(vci vciVar, T8 t8, long j, int i, int i2) {
        super(2);
        this.a = vciVar;
        this.b = t8;
        this.c = j;
        this.d = i;
        this.e = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        S8.a(this.a, this.b, this.c, (hq5) obj, rvf.R(this.d | 1), this.e);
        return Unit.a;
    }
}
