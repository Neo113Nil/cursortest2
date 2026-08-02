package com.squareup.cash.nfc.backend.real;

import android.app.Activity;
import android.nfc.NfcAdapter;
import android.os.Bundle;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda5;
import kotlin.Lazy;
import kotlin.LazyKt;

/* loaded from: classes4.dex */
public final class RealNfcPaymentsManager {
    public final Activity activity;
    public final Lazy nfcAdapter$delegate = LazyKt.lazy(new MoneyTabUIKt$$ExternalSyntheticLambda5(this, 14));

    public RealNfcPaymentsManager(Activity activity) {
        this.activity = activity;
    }

    public final void disableReaderMode() {
        NfcAdapter nfcAdapter = (NfcAdapter) this.nfcAdapter$delegate.getValue();
        if (nfcAdapter != null && nfcAdapter.isEnabled()) {
            Activity activity = this.activity;
            if (activity.isFinishing() || activity.isDestroyed()) {
                return;
            }
            nfcAdapter.disableReaderMode(activity);
        }
    }

    public final void enableReaderMode(Integer num, Bundle bundle, NfcAdapter.ReaderCallback readerCallback) {
        NfcAdapter nfcAdapter = (NfcAdapter) this.nfcAdapter$delegate.getValue();
        if (nfcAdapter != null && nfcAdapter.isEnabled()) {
            Activity activity = this.activity;
            if (activity.isFinishing() || activity.isDestroyed()) {
                return;
            }
            if (readerCallback == null) {
                readerCallback = new RealNfcPaymentsManager$$ExternalSyntheticLambda1();
            }
            nfcAdapter.enableReaderMode(activity, readerCallback, num != null ? num.intValue() : EnumC0170g.SDK_ASSET_ILLUSTRATION_FORM_VALUE, bundle);
        }
    }
}
