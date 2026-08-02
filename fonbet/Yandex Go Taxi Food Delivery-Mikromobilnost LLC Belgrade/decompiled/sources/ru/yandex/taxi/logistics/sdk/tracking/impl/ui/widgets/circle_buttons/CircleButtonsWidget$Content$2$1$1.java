package ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.circle_buttons;

import defpackage.jtb;
import defpackage.ktb;
import defpackage.ltb;
import defpackage.ptb;
import defpackage.tls;
import defpackage.w511;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
final /* synthetic */ class CircleButtonsWidget$Content$2$1$1 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        ltb ltbVar = (ltb) obj;
        ptb ptbVar = (ptb) this.receiver;
        if (ltbVar instanceof jtb) {
            ptbVar.getClass();
            ptbVar.a.x("SharedOrderCard.Tapped", ptb.a("courierinfo", null, null));
        } else {
            if (!(ltbVar instanceof ktb)) {
                ptbVar.getClass();
                w511.b();
                return null;
            }
            ptbVar.c.e(((ktb) ltbVar).a);
        }
        return zy11.a;
    }
}
