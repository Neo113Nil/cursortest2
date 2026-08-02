package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.hq5;
import defpackage.rvf;
import defpackage.uif;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class Ob extends uif implements Function2<hq5, Integer, Unit> {
    public final /* synthetic */ androidx.compose.foundation.layout.b a;
    public final /* synthetic */ String b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Function0<Unit> d;
    public final /* synthetic */ Function0<Unit> e;
    public final /* synthetic */ long f;
    public final /* synthetic */ long g;
    public final /* synthetic */ long h;
    public final /* synthetic */ int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ob(androidx.compose.foundation.layout.b bVar, String str, boolean z, Function0 function0, Function0 function02, long j, long j2, long j3, int i) {
        super(2);
        this.a = bVar;
        this.b = str;
        this.c = z;
        this.d = function0;
        this.e = function02;
        this.f = j;
        this.g = j2;
        this.h = j3;
        this.i = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        Qb.a(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, (hq5) obj, rvf.R(this.i | 1));
        return Unit.a;
    }
}
