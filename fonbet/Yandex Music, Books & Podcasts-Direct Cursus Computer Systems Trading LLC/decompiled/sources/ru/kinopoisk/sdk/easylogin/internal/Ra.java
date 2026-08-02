package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.b6e;
import defpackage.bqi;
import defpackage.hq5;
import defpackage.ild;
import defpackage.nbt;
import defpackage.oq5;
import defpackage.szf;
import defpackage.uif;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ru.kinopoisk.sdk.easylogin.internal.Kb;
import ru.kinopoisk.sdk.easylogin.internal.Za;

/* loaded from: classes5.dex */
public final class Ra extends uif implements Function2<hq5, Integer, Unit> {
    public final /* synthetic */ bqi a;
    public final /* synthetic */ Function0<Unit> b;
    public final /* synthetic */ Function0<Unit> c;
    public final /* synthetic */ Function1<H3, Unit> d;
    public final /* synthetic */ nbt e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ Function0<Unit> g;
    public final /* synthetic */ Function0<Unit> h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ra(bqi bqiVar, Function0 function0, Function0 function02, Function1 function1, nbt nbtVar, boolean z, Function0 function03, Function0 function04) {
        super(2);
        this.a = bqiVar;
        this.b = function0;
        this.c = function02;
        this.d = function1;
        this.e = nbtVar;
        this.f = z;
        this.g = function03;
        this.h = function04;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        float f;
        hq5 hq5Var = (hq5) obj;
        if ((((Number) obj2).intValue() & 3) == 2) {
            oq5 oq5Var = (oq5) hq5Var;
            if (oq5Var.z()) {
                oq5Var.S();
                return Unit.a;
            }
        }
        Za za = (Za) szf.Q(this.a, hq5Var).getValue();
        if (!(za instanceof Za.a)) {
            if (za instanceof Za.b) {
                f = 0;
                Qb.a(null, false, true, 0L, 0L, 0L, 0L, 0.0f, 0.0f, this.b, null, new Kb.b(f, null), null, ild.s(hq5Var, 349633915, new Qa(za, this.c, this.d, this.e, this.f, this.g, this.h)), hq5Var, 3072, 24576, 11255);
                return Unit.a;
            }
            if (!(za instanceof Za.c) && !(za instanceof Za.d) && !(za instanceof Za.e)) {
                b6e.s();
                return null;
            }
        }
        f = 8;
        Qb.a(null, false, true, 0L, 0L, 0L, 0L, 0.0f, 0.0f, this.b, null, new Kb.b(f, null), null, ild.s(hq5Var, 349633915, new Qa(za, this.c, this.d, this.e, this.f, this.g, this.h)), hq5Var, 3072, 24576, 11255);
        return Unit.a;
    }
}
