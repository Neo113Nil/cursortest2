package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.hq5;
import defpackage.oq5;
import defpackage.sn5;
import defpackage.uif;
import defpackage.xcs;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* renamed from: ru.kinopoisk.sdk.easylogin.internal.tc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1238tc extends uif implements Function2<hq5, Integer, Unit> {
    public final /* synthetic */ yc a;
    public final /* synthetic */ sn5 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1238tc(yc ycVar, sn5 sn5Var) {
        super(2);
        this.a = ycVar;
        this.b = sn5Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        hq5 hq5Var = (hq5) obj;
        if ((((Number) obj2).intValue() & 3) == 2) {
            oq5 oq5Var = (oq5) hq5Var;
            if (oq5Var.z()) {
                oq5Var.S();
                return Unit.a;
            }
        }
        xcs.a(this.a.A, this.b, hq5Var, 0);
        return Unit.a;
    }
}
