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
public final class E9 extends uif implements Function2<hq5, Integer, Unit> {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ nbt b;
    public final /* synthetic */ vci c;
    public final /* synthetic */ Function0<Unit> d;
    public final /* synthetic */ Function0<Unit> e;
    public final /* synthetic */ Function0<Unit> f;
    public final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E9(boolean z, nbt nbtVar, vci vciVar, Function0 function0, Function0 function02, Function0 function03, int i) {
        super(2);
        this.a = z;
        this.b = nbtVar;
        this.c = vciVar;
        this.d = function0;
        this.e = function02;
        this.f = function03;
        this.g = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        G9.a(this.a, this.b, this.c, this.d, this.e, this.f, (hq5) obj, rvf.R(this.g | 1));
        return Unit.a;
    }
}
