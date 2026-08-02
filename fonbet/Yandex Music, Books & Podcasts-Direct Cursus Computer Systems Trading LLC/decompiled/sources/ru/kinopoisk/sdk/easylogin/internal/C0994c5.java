package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.hq5;
import defpackage.nbt;
import defpackage.rvf;
import defpackage.uif;
import defpackage.yci;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* renamed from: ru.kinopoisk.sdk.easylogin.internal.c5, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0994c5 extends uif implements Function2<hq5, Integer, Unit> {
    public final /* synthetic */ H3 a;
    public final /* synthetic */ nbt b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Function0<Unit> d;
    public final /* synthetic */ Function0<Unit> e;
    public final /* synthetic */ Function0<Unit> f;
    public final /* synthetic */ yci g;
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0994c5(H3 h3, nbt nbtVar, boolean z, Function0 function0, Function0 function02, Function0 function03, yci yciVar, int i) {
        super(2);
        this.a = h3;
        this.b = nbtVar;
        this.c = z;
        this.d = function0;
        this.e = function02;
        this.f = function03;
        this.g = yciVar;
        this.h = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1008d5.a(this.a, this.b, this.c, this.d, this.e, this.f, this.g, (hq5) obj, rvf.R(this.h | 1));
        return Unit.a;
    }
}
