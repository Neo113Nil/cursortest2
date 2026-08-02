package ru.yandex.taxi.linked_order.modals.info;

import defpackage.hny;
import defpackage.jl40;
import defpackage.nly;
import defpackage.nny;
import defpackage.oly;
import defpackage.ony;
import defpackage.ply;
import defpackage.qly;
import defpackage.rly;
import defpackage.sly;
import defpackage.tls;
import defpackage.w511;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
final /* synthetic */ class LinkedOrderInfoPresenter$attachView$2 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        sly slyVar = (sly) obj;
        ony onyVar = (ony) this.receiver;
        onyVar.G = false;
        if (jl40.l(slyVar, qly.a)) {
            onyVar.Kg();
            onyVar.B.x(onyVar.F, "error");
            ((nny) onyVar.Dg()).td(true);
        } else if (!jl40.l(slyVar, rly.a) && !(slyVar instanceof nly)) {
            if (slyVar instanceof ply) {
                onyVar.I = ((ply) slyVar).a.c.a;
                onyVar.G = true;
            } else {
                if (!(slyVar instanceof oly)) {
                    w511.b();
                    return null;
                }
                oly olyVar = (oly) slyVar;
                String str = olyVar.b;
                onyVar.z.a().setMessage(str).setPositiveButton(olyVar.c, new hny(onyVar, 5)).show();
            }
        }
        return zy11.a;
    }
}
