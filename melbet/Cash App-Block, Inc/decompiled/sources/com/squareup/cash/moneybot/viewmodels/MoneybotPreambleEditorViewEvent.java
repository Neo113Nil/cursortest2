package com.squareup.cash.moneybot.viewmodels;

import com.knotapi.knot.utilities.Constants;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface MoneybotPreambleEditorViewEvent {

    public final class ClearOverride implements MoneybotPreambleEditorViewEvent {
        public static final ClearOverride INSTANCE = new ClearOverride();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ClearOverride);
        }

        public final int hashCode() {
            return -1025672266;
        }

        public final String toString() {
            return "ClearOverride";
        }
    }

    public final class Close implements MoneybotPreambleEditorViewEvent {
        public static final Close INSTANCE = new Close();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Close);
        }

        public final int hashCode() {
            return -761164427;
        }

        public final String toString() {
            return Constants.META_CLOSE;
        }
    }

    public final class FetchLatest implements MoneybotPreambleEditorViewEvent {
        public static final FetchLatest INSTANCE = new FetchLatest();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof FetchLatest);
        }

        public final int hashCode() {
            return 798780574;
        }

        public final String toString() {
            return "FetchLatest";
        }
    }

    public final class Save implements MoneybotPreambleEditorViewEvent {
        public final String preamble;

        public Save(String str) {
            str.getClass();
            this.preamble = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Save) && Intrinsics.areEqual(this.preamble, ((Save) obj).preamble);
        }

        public final int hashCode() {
            return this.preamble.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Save(preamble=", this.preamble, ")");
        }
    }
}
