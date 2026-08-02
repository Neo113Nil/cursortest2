package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.hq5;
import defpackage.nbt;
import defpackage.rvf;
import defpackage.uif;
import defpackage.vci;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class T9 extends uif implements Function2<hq5, Integer, Unit> {
    public final /* synthetic */ nbt a;
    public final /* synthetic */ vci b;
    public final /* synthetic */ Function0<Unit> c;
    public final /* synthetic */ Function0<Unit> d;
    public final /* synthetic */ Function0<Unit> e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T9(nbt nbtVar, vci vciVar, Function0 function0, Function0 function02, Function0 function03, int i, int i2) {
        super(2);
        this.a = nbtVar;
        this.b = vciVar;
        this.c = function0;
        this.d = function02;
        this.e = function03;
        this.f = i;
        this.g = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        U9.a(this.a, this.b, this.c, this.d, this.e, (hq5) obj, rvf.R(this.f | 1), this.g);
        return Unit.a;
    }
}
