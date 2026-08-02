package com.squareup.cash.instruments.viewmodels;

import com.squareup.cash.instruments.screens.TransferOptionPickerSelection;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class TransferOptionPickerViewModel {
    public final boolean continueEnabled;
    public final String cta;
    public final ArrayList options;
    public final String title;

    public final class Option {
        public final InstrumentCellViewModel instrument;
        public final boolean selected;
        public final TransferOptionPickerSelection selection;

        public Option(TransferOptionPickerSelection transferOptionPickerSelection, InstrumentCellViewModel instrumentCellViewModel, boolean z) {
            this.selection = transferOptionPickerSelection;
            this.instrument = instrumentCellViewModel;
            this.selected = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Option)) {
                return false;
            }
            Option option = (Option) obj;
            return this.selection.equals(option.selection) && this.instrument.equals(option.instrument) && this.selected == option.selected;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.selected) + ((this.instrument.hashCode() + (this.selection.hashCode() * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Option(selection=");
            sb.append(this.selection);
            sb.append(", instrument=");
            sb.append(this.instrument);
            sb.append(", selected=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.selected, ")");
        }
    }

    public TransferOptionPickerViewModel(String str, String str2, ArrayList arrayList, boolean z) {
        str2.getClass();
        this.title = str;
        this.cta = str2;
        this.continueEnabled = z;
        this.options = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransferOptionPickerViewModel)) {
            return false;
        }
        TransferOptionPickerViewModel transferOptionPickerViewModel = (TransferOptionPickerViewModel) obj;
        return Intrinsics.areEqual(this.title, transferOptionPickerViewModel.title) && Intrinsics.areEqual(this.cta, transferOptionPickerViewModel.cta) && this.continueEnabled == transferOptionPickerViewModel.continueEnabled && this.options.equals(transferOptionPickerViewModel.options);
    }

    public final int hashCode() {
        String str = this.title;
        return this.options.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((str == null ? 0 : str.hashCode()) * 31, 31, this.cta), 31, this.continueEnabled);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("TransferOptionPickerViewModel(title=", this.title, ", cta=", this.cta, ", continueEnabled=");
        m.append(this.continueEnabled);
        m.append(", options=");
        m.append(this.options);
        m.append(")");
        return m.toString();
    }
}
