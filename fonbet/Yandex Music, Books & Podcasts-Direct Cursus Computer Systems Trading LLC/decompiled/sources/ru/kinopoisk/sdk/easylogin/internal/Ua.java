package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.hq5;
import defpackage.nbt;
import defpackage.rvf;
import defpackage.uif;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class Ua extends uif implements Function2<hq5, Integer, Unit> {
    public final /* synthetic */ nbt a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Function0<Unit> c;
    public final /* synthetic */ Function0<Unit> d;
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ua(nbt nbtVar, boolean z, Function0 function0, Function0 function02, int i) {
        super(2);
        this.a = nbtVar;
        this.b = z;
        this.c = function0;
        this.d = function02;
        this.e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        Va.a(this.a, this.b, this.c, this.d, (hq5) obj, rvf.R(this.e | 1));
        return Unit.a;
    }
}
