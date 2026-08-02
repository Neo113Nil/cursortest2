package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.hq5;
import defpackage.rvf;
import defpackage.sn5;
import defpackage.uif;
import defpackage.vci;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class Pb extends uif implements Function2<hq5, Integer, Unit> {
    public final /* synthetic */ String a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;
    public final /* synthetic */ long f;
    public final /* synthetic */ long g;
    public final /* synthetic */ float h;
    public final /* synthetic */ float i;
    public final /* synthetic */ Function0<Unit> j;
    public final /* synthetic */ Function0<Unit> k;
    public final /* synthetic */ Kb l;
    public final /* synthetic */ vci m;
    public final /* synthetic */ sn5 n;
    public final /* synthetic */ int o;
    public final /* synthetic */ int p;
    public final /* synthetic */ int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Pb(String str, boolean z, boolean z2, long j, long j2, long j3, long j4, float f, float f2, Function0 function0, Function0 function02, Kb kb, vci vciVar, sn5 sn5Var, int i, int i2, int i3) {
        super(2);
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = j;
        this.e = j2;
        this.f = j3;
        this.g = j4;
        this.h = f;
        this.i = f2;
        this.j = function0;
        this.k = function02;
        this.l = kb;
        this.m = vciVar;
        this.n = sn5Var;
        this.o = i;
        this.p = i2;
        this.q = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        Qb.a(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, (hq5) obj, rvf.R(this.o | 1), rvf.R(this.p), this.q);
        return Unit.a;
    }
}
