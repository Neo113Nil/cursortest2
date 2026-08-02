package com.squareup.cash.pdf.view;

import com.squareup.cash.payments.viewmodels.PersonalizePaymentViewEvent;
import com.squareup.cash.payments.viewmodels.PersonalizePaymentViewEvent$DialogEvent$CloseDialog;
import com.squareup.cash.payments.viewmodels.PersonalizePaymentViewEvent$DialogEvent$RetryResourceSync;
import com.squareup.cash.pdf.view.PdfPreviewEvent;
import com.squareup.cash.phoneplans.PhonePlansEsimCheckViewEvent;
import com.squareup.cash.phoneplans.PhonePlansHomeViewEvent;
import com.squareup.cash.phoneplans.PhonePlansNewLineLoadingViewEvent$Close;
import com.squareup.cash.phoneplans.WirelessProviderListViewEvent;
import com.squareup.cash.pools.viewmodels.PoolContributeWithNoteViewEvent;
import com.squareup.cash.pools.viewmodels.PoolCreateViewEvent;
import com.squareup.cash.pools.viewmodels.PoolDetailsViewEvent;
import com.squareup.cash.pools.viewmodels.StartPoolViewEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final /* synthetic */ class PdfPreviewView$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;

    public /* synthetic */ PdfPreviewView$$ExternalSyntheticLambda0(int i, Function1 function1) {
        this.$r8$classId = i;
        this.f$0 = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        PdfPreviewEvent.Close close = PdfPreviewEvent.Close.INSTANCE;
        PhonePlansHomeViewEvent.HeaderCtaClicked headerCtaClicked = PhonePlansHomeViewEvent.HeaderCtaClicked.INSTANCE;
        PoolContributeWithNoteViewEvent.Back back = PoolContributeWithNoteViewEvent.Back.INSTANCE;
        PoolContributeWithNoteViewEvent.Continue r4 = PoolContributeWithNoteViewEvent.Continue.INSTANCE;
        Function1 function1 = this.f$0;
        switch (i) {
            case 0:
                int i2 = PdfPreviewView.$r8$clinit;
                function1.invoke(close);
                break;
            case 1:
                function1.invoke(PersonalizePaymentViewEvent.Back.INSTANCE);
                break;
            case 2:
                function1.invoke(PersonalizePaymentViewEvent$DialogEvent$RetryResourceSync.INSTANCE);
                break;
            case 3:
                function1.invoke(PersonalizePaymentViewEvent$DialogEvent$CloseDialog.INSTANCE);
                break;
            case 4:
                function1.invoke(close);
                break;
            case 5:
                function1.invoke(PdfPreviewEvent.DismissToast.INSTANCE);
                break;
            case 6:
                function1.invoke(PdfPreviewEvent.Download.INSTANCE);
                break;
            case 7:
                function1.invoke(PdfPreviewEvent.Share.INSTANCE);
                break;
            case 8:
                function1.invoke(PhonePlansEsimCheckViewEvent.ToolbarButtonClicked.INSTANCE);
                break;
            case 9:
                function1.invoke(headerCtaClicked);
                break;
            case 10:
                function1.invoke(headerCtaClicked);
                break;
            case 11:
                function1.invoke(PhonePlansHomeViewEvent.Close.INSTANCE);
                break;
            case 12:
                function1.invoke(PhonePlansHomeViewEvent.RetryClicked.INSTANCE);
                break;
            case 13:
                function1.invoke(new PhonePlansHomeViewEvent.InfoCardClicked(0));
                break;
            case 14:
                function1.invoke(new PhonePlansHomeViewEvent.InfoCardClicked(1));
                break;
            case 15:
                function1.invoke(PhonePlansNewLineLoadingViewEvent$Close.INSTANCE);
                break;
            case 16:
                function1.invoke(WirelessProviderListViewEvent.SubmitClicked.INSTANCE);
                break;
            case 17:
                function1.invoke(WirelessProviderListViewEvent.HelpButtonClicked.INSTANCE);
                break;
            case 18:
                function1.invoke(WirelessProviderListViewEvent.TitleBarButtonClicked.INSTANCE);
                break;
            case 19:
                function1.invoke(r4);
                break;
            case 20:
                function1.invoke(r4);
                break;
            case 21:
                function1.invoke(back);
                break;
            case 22:
                function1.invoke(back);
                break;
            case 23:
                function1.invoke(r4);
                break;
            case 24:
                function1.invoke(back);
                break;
            case 25:
                function1.invoke(PoolContributeWithNoteViewEvent.InstrumentClicked.INSTANCE);
                break;
            case 26:
                function1.invoke(r4);
                break;
            case 27:
                function1.invoke(PoolCreateViewEvent.Close.INSTANCE);
                break;
            case 28:
                function1.invoke(StartPoolViewEvent.Continue.INSTANCE);
                break;
            default:
                function1.invoke(PoolDetailsViewEvent.AdditionalOptionsTapped.INSTANCE);
                break;
        }
        return Unit.INSTANCE;
    }
}
