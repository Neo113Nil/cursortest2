package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.hq5;
import defpackage.rvf;
import defpackage.sn5;
import defpackage.uif;
import defpackage.yci;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* renamed from: ru.kinopoisk.sdk.easylogin.internal.la, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1125la extends uif implements Function2<hq5, Integer, Unit> {
    public final /* synthetic */ H3 a;
    public final /* synthetic */ Function0<Unit> b;
    public final /* synthetic */ Function0<Unit> c;
    public final /* synthetic */ yci d;
    public final /* synthetic */ sn5 e;
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1125la(H3 h3, Function0 function0, Function0 function02, yci yciVar, sn5 sn5Var, int i) {
        super(2);
        this.a = h3;
        this.b = function0;
        this.c = function02;
        this.d = yciVar;
        this.e = sn5Var;
        this.f = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1139ma.a(this.a, this.b, this.c, this.d, this.e, (hq5) obj, rvf.R(this.f | 1));
        return Unit.a;
    }
}
