package com.squareup.cash.activity.views.receipts;

import androidx.compose.ui.text.LinkAnnotation;
import androidx.compose.ui.text.LinkInteractionListener;
import com.squareup.cash.activity.viewmodels.ReceiptViewEvent;
import com.squareup.cash.bugreporting.viewmodels.BugReportingViewEvent;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final /* synthetic */ class ReceiptUiKt$$ExternalSyntheticLambda47 implements LinkInteractionListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;
    public final /* synthetic */ String f$1;

    public /* synthetic */ ReceiptUiKt$$ExternalSyntheticLambda47(Function1 function1, String str, int i) {
        this.$r8$classId = i;
        this.f$0 = function1;
        this.f$1 = str;
    }

    @Override // androidx.compose.ui.text.LinkInteractionListener
    public final void onClick(LinkAnnotation linkAnnotation) {
        int i = this.$r8$classId;
        String str = this.f$1;
        Function1 function1 = this.f$0;
        switch (i) {
            case 0:
                linkAnnotation.getClass();
                function1.invoke(new ReceiptViewEvent.OpenUrl(str));
                break;
            case 1:
                linkAnnotation.getClass();
                function1.invoke(new BugReportingViewEvent.OpenTicketUrl(str));
                break;
            default:
                linkAnnotation.getClass();
                function1.invoke(str);
                break;
        }
    }
}
