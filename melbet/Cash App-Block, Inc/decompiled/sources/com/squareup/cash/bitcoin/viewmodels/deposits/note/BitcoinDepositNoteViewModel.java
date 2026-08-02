package com.squareup.cash.bitcoin.viewmodels.deposits.note;

import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class BitcoinDepositNoteViewModel {
    public final boolean isEdit;
    public final String note;

    public BitcoinDepositNoteViewModel(String str, boolean z) {
        this.note = str;
        this.isEdit = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BitcoinDepositNoteViewModel)) {
            return false;
        }
        BitcoinDepositNoteViewModel bitcoinDepositNoteViewModel = (BitcoinDepositNoteViewModel) obj;
        return Intrinsics.areEqual(this.note, bitcoinDepositNoteViewModel.note) && this.isEdit == bitcoinDepositNoteViewModel.isEdit;
    }

    public final int hashCode() {
        String str = this.note;
        return Boolean.hashCode(this.isEdit) + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return Request$Priority$EnumUnboxingLocalUtility.m("BitcoinDepositNoteViewModel(note=", this.note, ", isEdit=", ")", this.isEdit);
    }
}
