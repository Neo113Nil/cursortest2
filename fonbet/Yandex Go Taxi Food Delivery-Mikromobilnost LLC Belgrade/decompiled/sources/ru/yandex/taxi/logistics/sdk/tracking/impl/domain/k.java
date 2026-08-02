package ru.yandex.taxi.logistics.sdk.tracking.impl.domain;

import com.yandex.delivery.mapper.model.CancelType;
import defpackage.psc;
import defpackage.rn;
import defpackage.tje;
import defpackage.tls;
import defpackage.tv7;
import defpackage.un;
import defpackage.vn;
import defpackage.w511;
import defpackage.xkj;
import defpackage.zn;
import defpackage.zy11;

/* loaded from: classes5.dex */
public final /* synthetic */ class k implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ l b;

    public /* synthetic */ k(l lVar, int i) {
        this.a = i;
        this.b = lVar;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        l lVar = this.b;
        switch (i) {
            case 0:
                tv7 tv7Var = (tv7) obj;
                if (!(tv7Var instanceof zn)) {
                    if (!(tv7Var instanceof un)) {
                        if (!(tv7Var instanceof rn)) {
                            if (!(tv7Var instanceof vn)) {
                                w511.b();
                                break;
                            } else {
                                lVar.g((vn) tv7Var);
                                break;
                            }
                        } else {
                            lVar.getClass();
                            l.b(lVar, "edit_order_details", null, 14);
                            tje.N(lVar.p, null, null, new TrackingActionsHandler$onEditOrderDetailsClicked$1(lVar, (rn) tv7Var, null), 3);
                            break;
                        }
                    } else {
                        lVar.f((un) tv7Var);
                        break;
                    }
                } else {
                    zn znVar = (zn) tv7Var;
                    lVar.getClass();
                    l.b(lVar, "call", znVar.c, 6);
                    tje.N(lVar.p, null, null, new TrackingActionsHandler$onCall$1(lVar, znVar.b, lVar.d(), null), 3);
                    break;
                }
            case 1:
                tje.N(lVar.p, null, null, new TrackingActionsHandler$cancelOrder$1(lVar, new xkj((CancelType) obj, lVar.c()), null), 3);
                break;
            case 2:
                tje.N(lVar.p, null, null, new TrackingActionsHandler$cancelOrder$1(lVar, new xkj((CancelType) obj, lVar.c()), null), 3);
                break;
            default:
                tje.N(lVar.p, null, null, new TrackingActionsHandler$onCall$1(lVar, (psc) obj, lVar.d(), null), 3);
                break;
        }
        return zy11Var;
    }
}
