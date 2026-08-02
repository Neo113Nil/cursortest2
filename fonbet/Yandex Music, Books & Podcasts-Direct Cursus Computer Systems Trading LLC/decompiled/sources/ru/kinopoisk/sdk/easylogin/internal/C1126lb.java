package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.aqi;
import defpackage.hqe;
import defpackage.uif;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* renamed from: ru.kinopoisk.sdk.easylogin.internal.lb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1126lb extends uif implements Function1<hqe, Unit> {
    public final /* synthetic */ aqi a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1126lb(aqi aqiVar, float f, float f2) {
        super(1);
        this.a = aqiVar;
        this.b = f;
        this.c = f2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        float f = 2;
        this.a.setValue(Integer.valueOf((int) (((((int) (((hqe) obj).a >> 32)) - this.b) - (this.c * f)) / f)));
        return Unit.a;
    }
}
