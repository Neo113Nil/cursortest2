package com.squareup.cash.blockers.viewmodels;

import com.knotapi.knot.utilities.Constants;
import com.squareup.protos.franklin.api.BlockerAction;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class InstrumentSelectionDetailsSheetViewEvent {

    public final class Close extends InstrumentSelectionDetailsSheetViewEvent {
        public static final Close INSTANCE = new Close();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Close);
        }

        public final int hashCode() {
            return -394281063;
        }

        public final String toString() {
            return Constants.META_CLOSE;
        }
    }

    public final class Continue extends InstrumentSelectionDetailsSheetViewEvent {
        public final BlockerAction continueButtonAction;
        public final int id;

        public Continue(int i, BlockerAction blockerAction) {
            blockerAction.getClass();
            this.id = i;
            this.continueButtonAction = blockerAction;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Continue)) {
                return false;
            }
            Continue r5 = (Continue) obj;
            return this.id == r5.id && Intrinsics.areEqual(this.continueButtonAction, r5.continueButtonAction);
        }

        public final int hashCode() {
            return this.continueButtonAction.hashCode() + (Integer.hashCode(this.id) * 31);
        }

        public final String toString() {
            return "Continue(id=" + this.id + ", continueButtonAction=" + this.continueButtonAction + ")";
        }
    }
}
