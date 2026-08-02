package ru.yandex.taxi.logistics.sdk.mission_details;

import defpackage.g8e;
import defpackage.ij20;
import defpackage.jwh;
import defpackage.sls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
final /* synthetic */ class MissionDetailsScreen$getView$1$1$1$1$1$1$1 extends FunctionReferenceImpl implements sls {
    @Override // defpackage.sls
    public final Object invoke() {
        b bVar = (b) this.receiver;
        ij20 ij20Var = bVar.w;
        String str = bVar.c.a;
        jwh jwhVar = ij20Var.a;
        jwhVar.a.o("DeliveryMission.Details.DoneTapped", null, g8e.x("mission_id", str));
        bVar.b.a.dismiss();
        return zy11.a;
    }
}
