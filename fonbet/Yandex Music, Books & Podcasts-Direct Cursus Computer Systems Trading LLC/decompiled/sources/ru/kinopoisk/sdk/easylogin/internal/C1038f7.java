package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.hq5;
import defpackage.nbt;
import defpackage.rvf;
import defpackage.uif;
import defpackage.yci;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* renamed from: ru.kinopoisk.sdk.easylogin.internal.f7, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1038f7 extends uif implements Function2<hq5, Integer, Unit> {
    public final /* synthetic */ yci a;
    public final /* synthetic */ nbt b;
    public final /* synthetic */ Function0<Unit> c;
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1038f7(yci yciVar, nbt nbtVar, Function0 function0, int i) {
        super(2);
        this.a = yciVar;
        this.b = nbtVar;
        this.c = function0;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1052g7.a(this.a, this.b, this.c, (hq5) obj, rvf.R(this.d | 1));
        return Unit.a;
    }
}
