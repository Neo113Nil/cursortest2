package ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.pay_now;

import defpackage.f770;
import defpackage.fz6;
import defpackage.qt90;
import defpackage.tls;
import defpackage.xvq;
import defpackage.zy11;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
final /* synthetic */ class PayNowWidget$Content$2$2$1 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        fz6 fz6Var = (fz6) obj;
        qt90 qt90Var = (qt90) this.receiver;
        qt90Var.getClass();
        LinkedHashMap l = kotlin.collections.b.l(new Pair("button_name", "pay_on_delivery"));
        l.putAll(fz6Var.c);
        qt90Var.a.x("SharedOrderCard.Tapped", l);
        if (fz6Var.a) {
            qt90Var.f.a();
        } else {
            qt90Var.d.a.a(new f770(fz6Var.b, new xvq(29)));
        }
        return zy11.a;
    }
}
