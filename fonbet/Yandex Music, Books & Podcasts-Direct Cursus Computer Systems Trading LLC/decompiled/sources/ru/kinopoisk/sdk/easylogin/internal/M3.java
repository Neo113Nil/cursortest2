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
public final class M3 extends uif implements Function2<hq5, Integer, Unit> {
    public final /* synthetic */ yci a;
    public final /* synthetic */ H3 b;
    public final /* synthetic */ nbt c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Function0<Unit> e;
    public final /* synthetic */ Function0<Unit> f;
    public final /* synthetic */ Function0<Unit> g;
    public final /* synthetic */ Function0<Unit> h;
    public final /* synthetic */ int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M3(yci yciVar, H3 h3, nbt nbtVar, boolean z, Function0 function0, Function0 function02, Function0 function03, Function0 function04, int i) {
        super(2);
        this.a = yciVar;
        this.b = h3;
        this.c = nbtVar;
        this.d = z;
        this.e = function0;
        this.f = function02;
        this.g = function03;
        this.h = function04;
        this.i = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        N3.a(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, (hq5) obj, rvf.R(this.i | 1));
        return Unit.a;
    }
}
