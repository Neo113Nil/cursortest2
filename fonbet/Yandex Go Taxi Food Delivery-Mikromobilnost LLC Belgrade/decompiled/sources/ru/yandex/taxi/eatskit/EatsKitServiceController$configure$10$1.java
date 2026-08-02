package ru.yandex.taxi.eatskit;

import defpackage.bj20;
import defpackage.evu0;
import defpackage.g8e;
import defpackage.g90;
import defpackage.gcn;
import defpackage.h1p;
import defpackage.jst;
import defpackage.k90;
import defpackage.ka0;
import defpackage.rcc;
import defpackage.s5w0;
import defpackage.wls;
import defpackage.x5s0;
import defpackage.xvf0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.yandex.taxi.superapp.j;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
final /* synthetic */ class EatsKitServiceController$configure$10$1 extends FunctionReferenceImpl implements wls {
    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        k90 k90Var = (k90) obj;
        gcn gcnVar = (gcn) obj2;
        j jVar = (j) this.receiver;
        bj20 bj20Var = jVar.e;
        h1p h1pVar = jVar.b;
        String value = h1pVar.getValue();
        ListBuilder a = rcc.a();
        String str = k90Var.a;
        if (str == null || evu0.J(str)) {
            a.add("serviceToken");
        }
        if (k90Var.b == null) {
            a.add("regionId");
        }
        String str2 = k90Var.c;
        if (str2 == null || evu0.J(str2)) {
            a.add("countryCode");
        }
        String str3 = k90Var.d;
        if (str3 == null || evu0.J(str3)) {
            a.add("currencyCode");
        }
        ListBuilder j = a.j();
        if (!j.isEmpty()) {
            g8e.B(jst.e, g8e.o("ADD_CARD_MISSING_PARAMS:", value), null, "Start add card with missing params: ".concat(kotlin.collections.a.X(j, null, null, null, null, 63)), 2);
        }
        jVar.j.o(h1pVar, ((g90) ((xvf0) jVar.f.b(h1pVar).b.a.b.m).get()).a(new ka0(k90Var.a, k90Var.b, null, k90Var.c, k90Var.d), new x5s0(11, new s5w0(0, gcnVar))));
        return zy11.a;
    }
}
