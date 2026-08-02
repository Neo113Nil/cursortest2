package com.yandex.plus.paymentsdk.internal.method.card;

import com.yandex.passport.sloth.ui.dependencies.m;
import com.yandex.plus.core.data.pay.o;
import defpackage.bfk;
import defpackage.qek;
import defpackage.rek;
import defpackage.xdr;

/* loaded from: classes5.dex */
public final /* synthetic */ class a {
    public final /* synthetic */ int a;
    public final /* synthetic */ m b;

    public /* synthetic */ a(m mVar, int i) {
        this.a = i;
        this.b = mVar;
    }

    public final void a(rek rekVar) {
        switch (this.a) {
            case 0:
                m mVar = this.b;
                if (rekVar instanceof qek) {
                    xdr xdrVar = (xdr) mVar.i;
                    bfk bfkVar = ((qek) rekVar).a;
                    o oVar = new o(bfkVar.c, bfkVar.e, bfkVar.d, bfkVar.a.name(), bfkVar.b.name());
                    xdrVar.getClass();
                    xdrVar.m(null, oVar);
                    break;
                }
                break;
            default:
                m mVar2 = this.b;
                if (rekVar instanceof qek) {
                    xdr xdrVar2 = (xdr) mVar2.i;
                    bfk bfkVar2 = ((qek) rekVar).a;
                    o oVar2 = new o(bfkVar2.c, bfkVar2.e, bfkVar2.d, bfkVar2.a.name(), bfkVar2.b.name());
                    xdrVar2.getClass();
                    xdrVar2.m(null, oVar2);
                    break;
                }
                break;
        }
    }
}
