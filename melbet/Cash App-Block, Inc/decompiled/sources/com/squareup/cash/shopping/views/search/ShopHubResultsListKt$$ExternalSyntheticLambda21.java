package com.squareup.cash.shopping.views.search;

import app.cash.broadway.ui.Ui;
import app.cash.directoryui.viewmodels.DirectoryViewEvent;
import com.squareup.cash.buynowpaylater.viewmodels.AfterPayOrderDetailsViewEvent;
import com.squareup.cash.buynowpaylater.viewmodels.AfterPayOrderHubViewEvent;
import com.squareup.cash.deposits.physical.viewmodels.barcode.PaperMoneyDepositBarcodeEvent;
import com.squareup.cash.formview.viewevents.api.FormViewEvent;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final /* synthetic */ class ShopHubResultsListKt$$ExternalSyntheticLambda21 implements Ui.EventReceiver {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;

    public /* synthetic */ ShopHubResultsListKt$$ExternalSyntheticLambda21(int i, Function1 function1) {
        this.$r8$classId = i;
        this.f$0 = function1;
    }

    @Override // app.cash.broadway.ui.Ui.EventReceiver
    public final void sendEvent(Object obj) {
        int i = this.$r8$classId;
        Function1 function1 = this.f$0;
        switch (i) {
            case 0:
                DirectoryViewEvent directoryViewEvent = (DirectoryViewEvent) obj;
                directoryViewEvent.getClass();
                ShopMessageKt.ShopHubResultsList$trackEvent(function1, directoryViewEvent, null);
                break;
            case 1:
                AfterPayOrderDetailsViewEvent afterPayOrderDetailsViewEvent = (AfterPayOrderDetailsViewEvent) obj;
                afterPayOrderDetailsViewEvent.getClass();
                function1.invoke(afterPayOrderDetailsViewEvent);
                break;
            case 2:
                AfterPayOrderDetailsViewEvent afterPayOrderDetailsViewEvent2 = (AfterPayOrderDetailsViewEvent) obj;
                afterPayOrderDetailsViewEvent2.getClass();
                function1.invoke(afterPayOrderDetailsViewEvent2);
                break;
            case 3:
                AfterPayOrderHubViewEvent afterPayOrderHubViewEvent = (AfterPayOrderHubViewEvent) obj;
                afterPayOrderHubViewEvent.getClass();
                function1.invoke(afterPayOrderHubViewEvent);
                break;
            case 4:
                AfterPayOrderHubViewEvent afterPayOrderHubViewEvent2 = (AfterPayOrderHubViewEvent) obj;
                afterPayOrderHubViewEvent2.getClass();
                function1.invoke(afterPayOrderHubViewEvent2);
                break;
            case 5:
                FormViewEvent formViewEvent = (FormViewEvent) obj;
                formViewEvent.getClass();
                function1.invoke(formViewEvent);
                break;
            default:
                PaperMoneyDepositBarcodeEvent paperMoneyDepositBarcodeEvent = (PaperMoneyDepositBarcodeEvent) obj;
                paperMoneyDepositBarcodeEvent.getClass();
                function1.invoke(paperMoneyDepositBarcodeEvent);
                break;
        }
    }
}
