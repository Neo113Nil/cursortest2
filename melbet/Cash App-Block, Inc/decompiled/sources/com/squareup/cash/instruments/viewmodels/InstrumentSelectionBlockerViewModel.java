package com.squareup.cash.instruments.viewmodels;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface InstrumentSelectionBlockerViewModel {

    public final class Content implements InstrumentSelectionBlockerViewModel {
        public final String ctaButtonLabel;
        public final ArrayList instrumentSections;
        public final SelectedInstrumentOptionIndex selectedInstrumentOptionIndex;

        public final class InstrumentSection {
            public final ArrayList instrumentOptions;
            public final String title;

            public final class InstrumentOption {
                public final String infoMessage;
                public final InstrumentCellViewModel instrumentCellViewModel;

                public InstrumentOption(InstrumentCellViewModel instrumentCellViewModel, String str) {
                    this.instrumentCellViewModel = instrumentCellViewModel;
                    this.infoMessage = str;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof InstrumentOption)) {
                        return false;
                    }
                    InstrumentOption instrumentOption = (InstrumentOption) obj;
                    return this.instrumentCellViewModel.equals(instrumentOption.instrumentCellViewModel) && Intrinsics.areEqual(this.infoMessage, instrumentOption.infoMessage);
                }

                public final int hashCode() {
                    int hashCode = this.instrumentCellViewModel.hashCode() * 31;
                    String str = this.infoMessage;
                    return hashCode + (str == null ? 0 : str.hashCode());
                }

                public final String toString() {
                    return "InstrumentOption(instrumentCellViewModel=" + this.instrumentCellViewModel + ", infoMessage=" + this.infoMessage + ")";
                }
            }

            public InstrumentSection(String str, ArrayList arrayList) {
                str.getClass();
                this.title = str;
                this.instrumentOptions = arrayList;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof InstrumentSection)) {
                    return false;
                }
                InstrumentSection instrumentSection = (InstrumentSection) obj;
                return Intrinsics.areEqual(this.title, instrumentSection.title) && this.instrumentOptions.equals(instrumentSection.instrumentOptions);
            }

            public final int hashCode() {
                return this.instrumentOptions.hashCode() + (this.title.hashCode() * 31);
            }

            public final String toString() {
                return NavAction$$ExternalSyntheticOutline0.m(this.instrumentOptions, "InstrumentSection(title=", this.title, ", instrumentOptions=", ")");
            }
        }

        public Content(ArrayList arrayList, SelectedInstrumentOptionIndex selectedInstrumentOptionIndex, String str) {
            selectedInstrumentOptionIndex.getClass();
            str.getClass();
            this.instrumentSections = arrayList;
            this.selectedInstrumentOptionIndex = selectedInstrumentOptionIndex;
            this.ctaButtonLabel = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Content)) {
                return false;
            }
            Content content = (Content) obj;
            return this.instrumentSections.equals(content.instrumentSections) && Intrinsics.areEqual(this.selectedInstrumentOptionIndex, content.selectedInstrumentOptionIndex) && Intrinsics.areEqual(this.ctaButtonLabel, content.ctaButtonLabel);
        }

        public final int hashCode() {
            return this.ctaButtonLabel.hashCode() + ((this.selectedInstrumentOptionIndex.hashCode() + (this.instrumentSections.hashCode() * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Content(instrumentSections=");
            sb.append(this.instrumentSections);
            sb.append(", selectedInstrumentOptionIndex=");
            sb.append(this.selectedInstrumentOptionIndex);
            sb.append(", ctaButtonLabel=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.ctaButtonLabel, ")");
        }
    }

    public final class Loading implements InstrumentSelectionBlockerViewModel {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return -846987566;
        }

        public final String toString() {
            return "Loading";
        }
    }

    public final class SelectedInstrumentOptionIndex {
        public final int itemIndex;
        public final int sectionIndex;

        public SelectedInstrumentOptionIndex(int i, int i2) {
            this.sectionIndex = i;
            this.itemIndex = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SelectedInstrumentOptionIndex)) {
                return false;
            }
            SelectedInstrumentOptionIndex selectedInstrumentOptionIndex = (SelectedInstrumentOptionIndex) obj;
            return this.sectionIndex == selectedInstrumentOptionIndex.sectionIndex && this.itemIndex == selectedInstrumentOptionIndex.itemIndex;
        }

        public final int hashCode() {
            return Integer.hashCode(this.itemIndex) + (Integer.hashCode(this.sectionIndex) * 31);
        }

        public final String toString() {
            return Recorder$$ExternalSyntheticOutline2.m(this.sectionIndex, this.itemIndex, "SelectedInstrumentOptionIndex(sectionIndex=", ", itemIndex=", ")");
        }
    }
}
