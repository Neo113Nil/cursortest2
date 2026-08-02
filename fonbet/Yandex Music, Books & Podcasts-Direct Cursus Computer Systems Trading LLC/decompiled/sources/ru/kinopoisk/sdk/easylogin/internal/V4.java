package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.hq5;
import defpackage.nbt;
import defpackage.rvf;
import defpackage.uif;
import defpackage.yci;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class V4 extends uif implements Function2<hq5, Integer, Unit> {
    public final /* synthetic */ H3 a;
    public final /* synthetic */ nbt b;
    public final /* synthetic */ yci c;
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V4(H3 h3, nbt nbtVar, yci yciVar, int i) {
        super(2);
        this.a = h3;
        this.b = nbtVar;
        this.c = yciVar;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        W4.a(this.a, this.b, this.c, (hq5) obj, rvf.R(this.d | 1));
        return Unit.a;
    }
}
