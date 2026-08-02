package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.hq5;
import defpackage.rvf;
import defpackage.uif;
import defpackage.vci;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class R4 extends uif implements Function2<hq5, Integer, Unit> {
    public final /* synthetic */ C1064h5 a;
    public final /* synthetic */ vci b;
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R4(C1064h5 c1064h5, vci vciVar, int i) {
        super(2);
        this.a = c1064h5;
        this.b = vciVar;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        S4.a(this.a, this.b, (hq5) obj, rvf.R(this.c | 1));
        return Unit.a;
    }
}
