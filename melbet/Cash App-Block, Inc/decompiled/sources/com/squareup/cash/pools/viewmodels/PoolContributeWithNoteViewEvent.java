package com.squareup.cash.pools.viewmodels;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.knotapi.knot.utilities.Constants;
import com.squareup.cash.pools.viewmodels.PoolContributeWithNoteViewModel;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface PoolContributeWithNoteViewEvent {

    public final class AmountCustomChanged implements PoolContributeWithNoteViewEvent {
        public final long amountCents;

        public AmountCustomChanged(long j) {
            this.amountCents = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AmountCustomChanged) && this.amountCents == ((AmountCustomChanged) obj).amountCents;
        }

        public final int hashCode() {
            return Long.hashCode(this.amountCents);
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m(this.amountCents, "AmountCustomChanged(amountCents=", ")");
        }
    }

    public final class AmountItemClicked implements PoolContributeWithNoteViewEvent {
        public final PoolContributeWithNoteViewModel.AmountAtmPicker.AmountPickerQuickAmount item;

        public AmountItemClicked(PoolContributeWithNoteViewModel.AmountAtmPicker.AmountPickerQuickAmount amountPickerQuickAmount) {
            amountPickerQuickAmount.getClass();
            this.item = amountPickerQuickAmount;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AmountItemClicked) && Intrinsics.areEqual(this.item, ((AmountItemClicked) obj).item);
        }

        public final int hashCode() {
            return this.item.hashCode();
        }

        public final String toString() {
            return "AmountItemClicked(item=" + this.item + ")";
        }
    }

    public final class Back implements PoolContributeWithNoteViewEvent {
        public static final Back INSTANCE = new Back();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Back);
        }

        public final int hashCode() {
            return 641266039;
        }

        public final String toString() {
            return Constants.META_BACK_BUTTON;
        }
    }

    public final class Continue implements PoolContributeWithNoteViewEvent {
        public static final Continue INSTANCE = new Continue();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Continue);
        }

        public final int hashCode() {
            return -187477705;
        }

        public final String toString() {
            return "Continue";
        }
    }

    public final class DismissSheet implements PoolContributeWithNoteViewEvent {
        public static final DismissSheet INSTANCE = new DismissSheet();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof DismissSheet);
        }

        public final int hashCode() {
            return 301473157;
        }

        public final String toString() {
            return "DismissSheet";
        }
    }

    public final class InstrumentClicked implements PoolContributeWithNoteViewEvent {
        public static final InstrumentClicked INSTANCE = new InstrumentClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof InstrumentClicked);
        }

        public final int hashCode() {
            return -1810505808;
        }

        public final String toString() {
            return "InstrumentClicked";
        }
    }

    public final class NoteChanged implements PoolContributeWithNoteViewEvent {
        public final String note;

        public NoteChanged(String str) {
            str.getClass();
            this.note = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NoteChanged) && Intrinsics.areEqual(this.note, ((NoteChanged) obj).note);
        }

        public final int hashCode() {
            return this.note.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("NoteChanged(note=", this.note, ")");
        }
    }
}
