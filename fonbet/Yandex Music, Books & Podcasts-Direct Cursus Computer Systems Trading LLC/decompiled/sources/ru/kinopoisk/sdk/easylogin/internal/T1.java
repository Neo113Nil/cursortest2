package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.hq5;
import defpackage.nbt;
import defpackage.rvf;
import defpackage.uif;
import defpackage.yci;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class T1 extends uif implements Function2<hq5, Integer, Unit> {
    public final /* synthetic */ H3 a;
    public final /* synthetic */ nbt b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Function0<Unit> d;
    public final /* synthetic */ Function0<Unit> e;
    public final /* synthetic */ yci f;
    public final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T1(H3 h3, nbt nbtVar, boolean z, Function0 function0, Function0 function02, yci yciVar, int i) {
        super(2);
        this.a = h3;
        this.b = nbtVar;
        this.c = z;
        this.d = function0;
        this.e = function02;
        this.f = yciVar;
        this.g = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        U1.a(this.a, this.b, this.c, this.d, this.e, this.f, (hq5) obj, rvf.R(this.g | 1));
        return Unit.a;
    }
}
