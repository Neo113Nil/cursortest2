package ru.yandex.taxi.checkin;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.TaxiOrderLocalData;
import com.yandex.go.taxi.order.models.api.response.CheckInInfo;
import com.yandex.go.taxi.order.models.api.response.Instruction;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.AdaptedFunctionReference;
import ru.yandex.taxi.styling.ButtonType;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
final /* synthetic */ class OpenCheckInInstructionInteractorImpl$openInstructionFlow$5 extends AdaptedFunctionReference implements wls {
    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        TaxiOrder taxiOrder = (TaxiOrder) obj;
        i iVar = (i) this.receiver;
        iVar.getClass();
        CheckInInfo checkInInfo = taxiOrder.V().a0;
        Instruction instruction = checkInInfo != null ? checkInInfo.b : null;
        if (instruction != null && instruction.h) {
            synchronized (taxiOrder) {
                TaxiOrderLocalData taxiOrderLocalData = taxiOrder.l;
                taxiOrderLocalData.getClass();
                taxiOrder.l = TaxiOrderLocalData.b(taxiOrderLocalData, false, 0, false, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, null, null, -8388609, 16777215);
            }
            iVar.c.g(taxiOrder);
            iVar.e.a(iVar.f.d(taxiOrder.M(), taxiOrder.x()).a.a(ButtonType.DEFAULT), instruction);
        }
        return zy11.a;
    }
}
