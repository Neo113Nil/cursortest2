package app.cash.local.presenters.brand.checkout;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Updater;

/* loaded from: classes3.dex */
public final class CheckoutGiftCardState {
    public final ParcelableSnapshotMutableState code$delegate;
    public final ParcelableSnapshotMutableState error$delegate;
    public final ParcelableSnapshotMutableState isExpanded$delegate;

    public CheckoutGiftCardState(String str, String str2, boolean z) {
        str.getClass();
        this.code$delegate = Updater.mutableStateOf$default(str);
        this.error$delegate = Updater.mutableStateOf$default(str2);
        this.isExpanded$delegate = Updater.mutableStateOf$default(Boolean.valueOf(z));
    }

    public final String getCode() {
        return (String) this.code$delegate.getValue();
    }
}
