package ru.yandex.taxi.logistics.sdk.tracking.impl.vertical_timeline.ui;

import android.content.Context;
import defpackage.jl40;
import defpackage.lj31;
import defpackage.tls;
import defpackage.vaz0;
import defpackage.w511;
import defpackage.waz0;
import defpackage.xaz0;
import defpackage.zia1;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
final /* synthetic */ class VerticalTimelineRoot$getView$1$1$1$1$1$1$1 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        xaz0 xaz0Var = (xaz0) obj;
        d dVar = (d) this.receiver;
        dVar.w.x("Delivery.OrderStatusCard.Details.ShareStatusButton.Tapped", dVar.x.d());
        lj31 lj31Var = dVar.c;
        if (xaz0Var instanceof vaz0) {
            vaz0 vaz0Var = (vaz0) xaz0Var;
            zia1.c((Context) lj31Var.a.b, vaz0Var.b, vaz0Var.a);
        } else {
            lj31Var.getClass();
            if (!jl40.l(xaz0Var, waz0.a) && xaz0Var != null) {
                w511.b();
                return null;
            }
        }
        return zy11.a;
    }
}
