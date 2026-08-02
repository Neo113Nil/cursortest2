package com.squareup.cash.blockers.viewmodels;

import com.google.android.gms.internal.mlkit_genai_prompt.zzage;
import com.squareup.cash.blockers.viewmodels.InstrumentSelectionViewEvent;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class InstrumentSelectionViewModel {

    public final class Selecting extends InstrumentSelectionViewModel {
        public final zzage details;
        public final String headerText;
        public final SelectedInstrumentModel secondarySelectedInstrument;
        public final SelectedInstrumentModel selectedInstrument;
        public final InstrumentSelectionViewEvent submitButtonAction;
        public final String submitButtonTitle;

        public Selecting(String str, zzage zzageVar, String str2, InstrumentSelectionViewEvent.Next next, SelectedInstrumentModel selectedInstrumentModel, SelectedInstrumentModel selectedInstrumentModel2) {
            str.getClass();
            str2.getClass();
            this.headerText = str;
            this.details = zzageVar;
            this.submitButtonTitle = str2;
            this.submitButtonAction = next;
            this.selectedInstrument = selectedInstrumentModel;
            this.secondarySelectedInstrument = selectedInstrumentModel2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Selecting)) {
                return false;
            }
            Selecting selecting = (Selecting) obj;
            return Intrinsics.areEqual(this.headerText, selecting.headerText) && Intrinsics.areEqual(this.details, selecting.details) && Intrinsics.areEqual(this.submitButtonTitle, selecting.submitButtonTitle) && Intrinsics.areEqual(this.submitButtonAction, selecting.submitButtonAction) && this.selectedInstrument.equals(selecting.selectedInstrument) && Intrinsics.areEqual(this.secondarySelectedInstrument, selecting.secondarySelectedInstrument);
        }

        public final int hashCode() {
            int hashCode = this.headerText.hashCode() * 31;
            zzage zzageVar = this.details;
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (zzageVar == null ? 0 : zzageVar.hashCode())) * 31, 31, this.submitButtonTitle);
            InstrumentSelectionViewEvent instrumentSelectionViewEvent = this.submitButtonAction;
            int hashCode2 = (this.selectedInstrument.hashCode() + ((m + (instrumentSelectionViewEvent == null ? 0 : instrumentSelectionViewEvent.hashCode())) * 31)) * 31;
            SelectedInstrumentModel selectedInstrumentModel = this.secondarySelectedInstrument;
            return hashCode2 + (selectedInstrumentModel != null ? selectedInstrumentModel.hashCode() : 0);
        }

        public final String toString() {
            return "Selecting(headerText=" + this.headerText + ", details=" + this.details + ", submitButtonTitle=" + this.submitButtonTitle + ", submitButtonAction=" + this.submitButtonAction + ", selectedInstrument=" + this.selectedInstrument + ", secondarySelectedInstrument=" + this.secondarySelectedInstrument + ")";
        }
    }

    public final class Submitting extends InstrumentSelectionViewModel {
        public static final Submitting INSTANCE = new Submitting();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Submitting);
        }

        public final int hashCode() {
            return -1158944839;
        }

        public final String toString() {
            return "Submitting";
        }
    }
}
