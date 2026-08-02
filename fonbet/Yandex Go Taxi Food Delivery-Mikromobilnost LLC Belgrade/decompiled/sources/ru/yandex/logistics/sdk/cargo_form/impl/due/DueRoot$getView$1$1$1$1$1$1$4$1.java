package ru.yandex.logistics.sdk.cargo_form.impl.due;

import defpackage.b64;
import defpackage.dxm;
import defpackage.evm;
import defpackage.fsg;
import defpackage.gw00;
import defpackage.h3y;
import defpackage.hvm;
import defpackage.o9x0;
import defpackage.p6s;
import defpackage.r9x0;
import defpackage.ri20;
import defpackage.sls;
import defpackage.u1n;
import defpackage.x2s;
import defpackage.ysu;
import defpackage.zrm;
import defpackage.zy11;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.yandex.logistics.sdk.cargo_form.impl.domain.c;

@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
final /* synthetic */ class DueRoot$getView$1$1$1$1$1$1$4$1 extends FunctionReferenceImpl implements sls {
    @Override // defpackage.sls
    public final Object invoke() {
        ZonedDateTime zonedDateTime;
        List list;
        ri20 ri20Var;
        r9x0 r9x0Var;
        b bVar = (b) this.receiver;
        evm evmVar = bVar.b;
        int intValue = ((Number) bVar.z.getValue()).intValue();
        int intValue2 = ((Number) bVar.A.getValue()).intValue();
        int intValue3 = ((Number) bVar.B.getValue()).intValue();
        fsg fsgVar = (fsg) kotlin.collections.a.S(intValue, bVar.y.a);
        ysu ysuVar = fsgVar != null ? (ysu) kotlin.collections.a.S(intValue2, fsgVar.c) : null;
        if (ysuVar == null || (zonedDateTime = ysuVar.b) == null) {
            zonedDateTime = (ysuVar == null || (list = ysuVar.c) == null || (ri20Var = (ri20) kotlin.collections.a.S(intValue3, list)) == null) ? null : ri20Var.b;
        }
        u1n.m(bVar.w, new x2s(b64.j(evmVar.y, ".Confirm"), gw00.e(new Pair("selected_time_option", zonedDateTime))));
        zrm zrmVar = bVar.x;
        ((p6s) zrmVar.b).c(zonedDateTime != null ? zonedDateTime.format(DateTimeFormatter.ISO_DATE_TIME) : null, evmVar.z);
        dxm dxmVar = bVar.c;
        o9x0 o9x0Var = dxmVar.a;
        o9x0Var.g.invoke();
        dxmVar.b.dismiss();
        hvm hvmVar = o9x0Var.j;
        if (hvmVar != null && (r9x0Var = hvmVar.a.c) != null) {
            ((c) ((h3y) dxmVar.c.x).get()).b(r9x0Var);
        }
        return zy11.a;
    }
}
