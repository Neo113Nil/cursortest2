package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.hq5;
import defpackage.nbt;
import defpackage.rvf;
import defpackage.uif;
import defpackage.yci;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* renamed from: ru.kinopoisk.sdk.easylogin.internal.i2, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1075i2 extends uif implements Function2<hq5, Integer, Unit> {
    public final /* synthetic */ yci a;
    public final /* synthetic */ nbt b;
    public final /* synthetic */ H3 c;
    public final /* synthetic */ Function0<Unit> d;
    public final /* synthetic */ Function0<Unit> e;
    public final /* synthetic */ Function0<Unit> f;
    public final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1075i2(yci yciVar, nbt nbtVar, H3 h3, Function0 function0, Function0 function02, Function0 function03, int i) {
        super(2);
        this.a = yciVar;
        this.b = nbtVar;
        this.c = h3;
        this.d = function0;
        this.e = function02;
        this.f = function03;
        this.g = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1089j2.a(this.a, this.b, this.c, this.d, this.e, this.f, (hq5) obj, rvf.R(this.g | 1));
        return Unit.a;
    }
}
