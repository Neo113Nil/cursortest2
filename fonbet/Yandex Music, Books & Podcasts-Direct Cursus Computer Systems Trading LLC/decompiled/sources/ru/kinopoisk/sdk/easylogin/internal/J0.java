package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.act;
import defpackage.hq5;
import defpackage.jyn;
import defpackage.m85;
import defpackage.rvf;
import defpackage.uif;
import defpackage.w4k;
import defpackage.yci;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class J0 extends uif implements Function2<hq5, Integer, Unit> {
    public final /* synthetic */ w4k a;
    public final /* synthetic */ yci b;
    public final /* synthetic */ float c;
    public final /* synthetic */ act d;
    public final /* synthetic */ jyn e;
    public final /* synthetic */ m85 f;
    public final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J0(w4k w4kVar, yci yciVar, float f, act actVar, jyn jynVar, m85 m85Var, int i) {
        super(2);
        this.a = w4kVar;
        this.b = yciVar;
        this.c = f;
        this.d = actVar;
        this.e = jynVar;
        this.f = m85Var;
        this.g = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        K0.a(this.a, this.b, this.c, this.d, this.e, this.f, (hq5) obj, rvf.R(this.g | 1));
        return Unit.a;
    }
}
