package com.squareup.cash.bitcoin.viewmodels.deposits.note;

import com.knotapi.knot.utilities.Constants;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract class BitcoinDepositNoteViewEvent {

    public final class Close extends BitcoinDepositNoteViewEvent {
        public static final Close INSTANCE = new Close();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Close);
        }

        public final int hashCode() {
            return -759143155;
        }

        public final String toString() {
            return Constants.META_CLOSE;
        }
    }

    public final class Done extends BitcoinDepositNoteViewEvent {
        public final String note;

        public Done(String str) {
            str.getClass();
            this.note = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Done) && Intrinsics.areEqual(this.note, ((Done) obj).note);
        }

        public final int hashCode() {
            return this.note.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Done(note=", this.note, ")");
        }
    }
}
