package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.bqi;
import defpackage.hq5;
import defpackage.nbt;
import defpackage.rvf;
import defpackage.uif;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class Sa extends uif implements Function2<hq5, Integer, Unit> {
    public final /* synthetic */ bqi a;
    public final /* synthetic */ nbt b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Function0<Unit> d;
    public final /* synthetic */ Function0<Unit> e;
    public final /* synthetic */ Function1<H3, Unit> f;
    public final /* synthetic */ Function0<Unit> g;
    public final /* synthetic */ Function0<Unit> h;
    public final /* synthetic */ int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Sa(bqi bqiVar, nbt nbtVar, boolean z, Function0 function0, Function0 function02, Function1 function1, Function0 function03, Function0 function04, int i) {
        super(2);
        this.a = bqiVar;
        this.b = nbtVar;
        this.c = z;
        this.d = function0;
        this.e = function02;
        this.f = function1;
        this.g = function03;
        this.h = function04;
        this.i = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        Ta.a(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, (hq5) obj, rvf.R(this.i | 1));
        return Unit.a;
    }
}
