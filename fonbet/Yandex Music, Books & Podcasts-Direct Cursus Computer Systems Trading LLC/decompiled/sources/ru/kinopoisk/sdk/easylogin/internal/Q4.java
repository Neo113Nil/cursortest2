package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.hq5;
import defpackage.nbt;
import defpackage.rvf;
import defpackage.uif;
import defpackage.yci;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class Q4 extends uif implements Function2<hq5, Integer, Unit> {
    public final /* synthetic */ yci a;
    public final /* synthetic */ nbt b;
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q4(yci yciVar, nbt nbtVar, int i) {
        super(2);
        this.a = yciVar;
        this.b = nbtVar;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        S4.a(this.a, this.b, (hq5) obj, rvf.R(this.c | 1));
        return Unit.a;
    }
}
