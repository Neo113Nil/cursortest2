package com.squareup.cash.shopping.viewmodels;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class CashAppPayIncentiveSheetViewModel {
    public final String message;
    public final String title;

    public CashAppPayIncentiveSheetViewModel(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.title = str;
        this.message = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CashAppPayIncentiveSheetViewModel)) {
            return false;
        }
        CashAppPayIncentiveSheetViewModel cashAppPayIncentiveSheetViewModel = (CashAppPayIncentiveSheetViewModel) obj;
        return Intrinsics.areEqual(this.title, cashAppPayIncentiveSheetViewModel.title) && Intrinsics.areEqual(this.message, cashAppPayIncentiveSheetViewModel.message);
    }

    public final int hashCode() {
        return this.message.hashCode() + (this.title.hashCode() * 31);
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("CashAppPayIncentiveSheetViewModel(title=", this.title, ", message=", this.message, ")");
    }
}
