package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.bqi;
import defpackage.hq5;
import defpackage.rvf;
import defpackage.uif;
import defpackage.yci;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* renamed from: ru.kinopoisk.sdk.easylogin.internal.h3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1062h3 extends uif implements Function2<hq5, Integer, Unit> {
    public final /* synthetic */ yci a;
    public final /* synthetic */ H3 b;
    public final /* synthetic */ bqi c;
    public final /* synthetic */ Function1<String, Unit> d;
    public final /* synthetic */ Function0<Unit> e;
    public final /* synthetic */ Function0<Unit> f;
    public final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1062h3(yci yciVar, H3 h3, bqi bqiVar, Function1 function1, Function0 function0, Function0 function02, int i) {
        super(2);
        this.a = yciVar;
        this.b = h3;
        this.c = bqiVar;
        this.d = function1;
        this.e = function0;
        this.f = function02;
        this.g = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1076i3.a(this.a, this.b, this.c, this.d, this.e, this.f, (hq5) obj, rvf.R(this.g | 1));
        return Unit.a;
    }
}
