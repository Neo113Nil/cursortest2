package com.squareup.cash.blockers.viewmodels;

import com.knotapi.knot.utilities.Constants;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes5.dex */
public abstract class InstrumentSelectionListSheetViewEvent {

    public final class Close extends InstrumentSelectionListSheetViewEvent {
        public static final Close INSTANCE = new Close();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Close);
        }

        public final int hashCode() {
            return 333284199;
        }

        public final String toString() {
            return Constants.META_CLOSE;
        }
    }

    public final class SelectInstrument extends InstrumentSelectionListSheetViewEvent {
        public final int id;

        public SelectInstrument(int i) {
            this.id = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SelectInstrument) && this.id == ((SelectInstrument) obj).id;
        }

        public final int hashCode() {
            return Integer.hashCode(this.id);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.id, "SelectInstrument(id=", ")");
        }
    }
}
