package com.squareup.cash.activity.backend;

import com.squareup.protos.franklin.app.CancelPaymentRequest;
import com.squareup.protos.franklin.app.ConfirmPasscodeRequest;
import com.squareup.protos.franklin.app.ConfirmPaymentRequest;
import com.squareup.protos.franklin.app.RefundPaymentRequest;
import com.squareup.wire.Message;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class PaymentRequestsListener {
    public final RealActivityUpdatesNotifier activityNotifier;

    public PaymentRequestsListener(RealActivityUpdatesNotifier realActivityUpdatesNotifier) {
        this.activityNotifier = realActivityUpdatesNotifier;
    }

    public final void onRequest(Message message) {
        message.getClass();
        boolean z = message instanceof ConfirmPaymentRequest;
        RealActivityUpdatesNotifier realActivityUpdatesNotifier = this.activityNotifier;
        if (z) {
            Iterator it = ((ConfirmPaymentRequest) message).payment_tokens.iterator();
            while (it.hasNext()) {
                realActivityUpdatesNotifier.notifyItemUpdated((String) it.next());
            }
            return;
        }
        if (message instanceof RefundPaymentRequest) {
            String str = ((RefundPaymentRequest) message).payment_token;
            if (str != null) {
                realActivityUpdatesNotifier.notifyItemUpdated(str);
                return;
            }
            return;
        }
        if (message instanceof CancelPaymentRequest) {
            String str2 = ((CancelPaymentRequest) message).payment_token;
            if (str2 != null) {
                realActivityUpdatesNotifier.notifyItemUpdated(str2);
                return;
            }
            return;
        }
        if (message instanceof ConfirmPasscodeRequest) {
            Iterator it2 = ((ConfirmPasscodeRequest) message).payment_tokens.iterator();
            while (it2.hasNext()) {
                realActivityUpdatesNotifier.notifyItemUpdated((String) it2.next());
            }
        }
    }
}
