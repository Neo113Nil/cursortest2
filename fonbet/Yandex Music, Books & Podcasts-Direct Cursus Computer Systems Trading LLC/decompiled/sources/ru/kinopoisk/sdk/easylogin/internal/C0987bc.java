package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.hq5;
import defpackage.ild;
import defpackage.oq5;
import defpackage.qzm;
import defpackage.sn5;
import defpackage.uif;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* renamed from: ru.kinopoisk.sdk.easylogin.internal.bc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0987bc extends uif implements Function2<hq5, Integer, Unit> {
    public final /* synthetic */ qzm[] a;
    public final /* synthetic */ sn5 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0987bc(qzm[] qzmVarArr, sn5 sn5Var) {
        super(2);
        N4 n4 = N4.Old;
        this.a = qzmVarArr;
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
        N4 n4 = N4.Old;
        C1224sc.a(null, ild.s(hq5Var, -1298764475, new C0973ac(this.a, this.b)), hq5Var, 48);
        return Unit.a;
    }
}
