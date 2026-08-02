package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.hq5;
import defpackage.oq5;
import defpackage.sn5;
import defpackage.uif;
import defpackage.wn5;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class Yb extends uif implements Function2<hq5, Integer, Unit> {
    public final /* synthetic */ sn5 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Yb(sn5 sn5Var) {
        super(2);
        this.a = sn5Var;
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
        ((wn5) this.a).invoke(hq5Var, 0);
        return Unit.a;
    }
}
