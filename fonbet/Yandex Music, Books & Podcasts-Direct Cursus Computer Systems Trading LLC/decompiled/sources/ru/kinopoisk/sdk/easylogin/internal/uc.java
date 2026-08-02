package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.hq5;
import defpackage.rvf;
import defpackage.sn5;
import defpackage.uif;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class uc extends uif implements Function2<hq5, Integer, Unit> {
    public final /* synthetic */ Vb a;
    public final /* synthetic */ yc b;
    public final /* synthetic */ Integer c;
    public final /* synthetic */ sn5 d;
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uc(Vb vb, yc ycVar, Integer num, sn5 sn5Var, int i) {
        super(2);
        this.a = vb;
        this.b = ycVar;
        this.c = num;
        this.d = sn5Var;
        this.e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1224sc.a(this.a, this.b, this.c, this.d, (hq5) obj, rvf.R(this.e | 1));
        return Unit.a;
    }
}
