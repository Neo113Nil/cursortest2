package com.squareup.cash.instruments.presenters;

import com.squareup.cash.instruments.screens.TransferOptionPickerSelectedOption;
import com.squareup.cash.instruments.screens.TransferOptionPickerSelection;
import com.squareup.cash.instruments.screens.TransferOptions;
import com.squareup.cash.instruments.viewmodels.InstrumentCellViewModel;

/* loaded from: classes6.dex */
public final class ResolvedTransferOption {
    public final InstrumentCellViewModel instrument;
    public final TransferOptionPickerSelectedOption selectedOption;
    public final TransferOptionPickerSelection selection;

    public ResolvedTransferOption(TransferOptionPickerSelection transferOptionPickerSelection, TransferOptionPickerSelectedOption transferOptionPickerSelectedOption, InstrumentCellViewModel instrumentCellViewModel) {
        this.selection = transferOptionPickerSelection;
        this.selectedOption = transferOptionPickerSelectedOption;
        this.instrument = instrumentCellViewModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResolvedTransferOption)) {
            return false;
        }
        ResolvedTransferOption resolvedTransferOption = (ResolvedTransferOption) obj;
        return this.selection.equals(resolvedTransferOption.selection) && this.selectedOption.equals(resolvedTransferOption.selectedOption) && this.instrument.equals(resolvedTransferOption.instrument);
    }

    public final int hashCode() {
        return this.instrument.hashCode() + ((this.selectedOption.hashCode() + (this.selection.hashCode() * 31)) * 31);
    }

    public final boolean isSelectable() {
        return this.instrument.enabled && this.selection.transferOption != TransferOptions.LinkDebit;
    }

    public final String toString() {
        return "ResolvedTransferOption(selection=" + this.selection + ", selectedOption=" + this.selectedOption + ", instrument=" + this.instrument + ")";
    }
}
