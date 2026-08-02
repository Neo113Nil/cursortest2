package com.squareup.cash.blockers.viewmodels;

import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import com.knotapi.knot.utilities.Constants;
import com.squareup.cash.blockers.screens.InstrumentSelectionData;
import com.squareup.protos.franklin.api.BlockerAction;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public interface InstrumentSelectionViewEvent {

    public final class Close implements InstrumentSelectionViewEvent {
        public static final Close INSTANCE = new Close();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Close);
        }

        public final int hashCode() {
            return -457099242;
        }

        public final String toString() {
            return Constants.META_CLOSE;
        }
    }

    public final class DetailRowClicked implements InstrumentSelectionViewEvent {
        public final int rowIndex;

        public DetailRowClicked(int i) {
            this.rowIndex = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DetailRowClicked) && this.rowIndex == ((DetailRowClicked) obj).rowIndex;
        }

        public final int hashCode() {
            return Integer.hashCode(this.rowIndex);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.rowIndex, "DetailRowClicked(rowIndex=", ")");
        }
    }

    public final class DetailTextClicked implements InstrumentSelectionViewEvent {
        public static final DetailTextClicked INSTANCE = new DetailTextClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof DetailTextClicked);
        }

        public final int hashCode() {
            return 1458513479;
        }

        public final String toString() {
            return "DetailTextClicked";
        }
    }

    public final class DismissInstrumentDetails implements InstrumentSelectionViewEvent {
        public final boolean isSecondaryOption;

        public DismissInstrumentDetails(boolean z) {
            this.isSecondaryOption = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DismissInstrumentDetails) && this.isSecondaryOption == ((DismissInstrumentDetails) obj).isSecondaryOption;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.isSecondaryOption);
        }

        public final String toString() {
            return Fragment$5$$ExternalSyntheticOutline0.m("DismissInstrumentDetails(isSecondaryOption=", ")", this.isSecondaryOption);
        }
    }

    public final class InstrumentDetailActionRequested implements InstrumentSelectionViewEvent {
        public final BlockerAction blockerAction;
        public final int id;
        public final boolean isSecondaryOption;

        public InstrumentDetailActionRequested(int i, boolean z, BlockerAction blockerAction) {
            blockerAction.getClass();
            this.id = i;
            this.isSecondaryOption = z;
            this.blockerAction = blockerAction;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InstrumentDetailActionRequested)) {
                return false;
            }
            InstrumentDetailActionRequested instrumentDetailActionRequested = (InstrumentDetailActionRequested) obj;
            return this.id == instrumentDetailActionRequested.id && this.isSecondaryOption == instrumentDetailActionRequested.isSecondaryOption && Intrinsics.areEqual(this.blockerAction, instrumentDetailActionRequested.blockerAction);
        }

        public final int hashCode() {
            return this.blockerAction.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Integer.hashCode(this.id) * 31, 31, this.isSecondaryOption);
        }

        public final String toString() {
            return "InstrumentDetailActionRequested(id=" + this.id + ", isSecondaryOption=" + this.isSecondaryOption + ", blockerAction=" + this.blockerAction + ")";
        }
    }

    public final class NewInstrumentSelected implements InstrumentSelectionViewEvent {
        public final int id;
        public final boolean isSecondaryOption;

        public NewInstrumentSelected(int i, boolean z) {
            this.id = i;
            this.isSecondaryOption = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NewInstrumentSelected)) {
                return false;
            }
            NewInstrumentSelected newInstrumentSelected = (NewInstrumentSelected) obj;
            return this.id == newInstrumentSelected.id && this.isSecondaryOption == newInstrumentSelected.isSecondaryOption;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.isSecondaryOption) + (Integer.hashCode(this.id) * 31);
        }

        public final String toString() {
            return "NewInstrumentSelected(id=" + this.id + ", isSecondaryOption=" + this.isSecondaryOption + ")";
        }
    }

    public final class Next implements InstrumentSelectionViewEvent {
        public final InstrumentSelectionData.InstrumentOption.Enabled.SelectOption secondarySubmittedOption;
        public final InstrumentSelectionData.InstrumentOption.Enabled.SelectOption submittedOption;

        public Next(InstrumentSelectionData.InstrumentOption.Enabled.SelectOption selectOption, InstrumentSelectionData.InstrumentOption.Enabled.SelectOption selectOption2) {
            this.submittedOption = selectOption;
            this.secondarySubmittedOption = selectOption2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Next)) {
                return false;
            }
            Next next = (Next) obj;
            return this.submittedOption.equals(next.submittedOption) && Intrinsics.areEqual(this.secondarySubmittedOption, next.secondarySubmittedOption);
        }

        public final int hashCode() {
            int hashCode = this.submittedOption.hashCode() * 31;
            InstrumentSelectionData.InstrumentOption.Enabled.SelectOption selectOption = this.secondarySubmittedOption;
            return hashCode + (selectOption == null ? 0 : selectOption.hashCode());
        }

        public final String toString() {
            return "Next(submittedOption=" + this.submittedOption + ", secondarySubmittedOption=" + this.secondarySubmittedOption + ")";
        }
    }
}
