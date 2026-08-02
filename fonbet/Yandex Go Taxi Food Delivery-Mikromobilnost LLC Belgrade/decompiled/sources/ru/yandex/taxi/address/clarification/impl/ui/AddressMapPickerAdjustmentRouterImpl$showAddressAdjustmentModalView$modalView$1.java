package ru.yandex.taxi.address.clarification.impl.ui;

import com.yandex.go.clarify_address.AddressClarificationReason;
import defpackage.qu;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.yandex.taxi.address.clarification.AddressClarificationCloseReason;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
final /* synthetic */ class AddressMapPickerAdjustmentRouterImpl$showAddressAdjustmentModalView$modalView$1 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        AddressClarificationCloseReason addressClarificationCloseReason = (AddressClarificationCloseReason) obj;
        d dVar = (d) this.receiver;
        dVar.getClass();
        if (addressClarificationCloseReason == AddressClarificationCloseReason.DONE_PRESSED) {
            ((com.yandex.go.clarify_address.a) dVar.L).c(true, AddressClarificationReason.Map);
            dVar.r(new qu(9));
        } else if (addressClarificationCloseReason == AddressClarificationCloseReason.BACK_PRESSED) {
            dVar.G.c();
        }
        return zy11.a;
    }
}
