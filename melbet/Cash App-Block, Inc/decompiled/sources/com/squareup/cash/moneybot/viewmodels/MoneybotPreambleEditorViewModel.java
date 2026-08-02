package com.squareup.cash.moneybot.viewmodels;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes6.dex */
public interface MoneybotPreambleEditorViewModel {

    public final class Error implements MoneybotPreambleEditorViewModel {
        public final String message;

        public Error(String str) {
            this.message = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Error) && this.message.equals(((Error) obj).message);
        }

        public final int hashCode() {
            return this.message.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Error(message=", this.message, ")");
        }
    }

    public final class Loaded implements MoneybotPreambleEditorViewModel {
        public final String currentPreamble;

        public Loaded(String str) {
            this.currentPreamble = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Loaded) && this.currentPreamble.equals(((Loaded) obj).currentPreamble);
        }

        public final int hashCode() {
            return this.currentPreamble.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Loaded(currentPreamble=", this.currentPreamble, ")");
        }
    }

    public final class Loading implements MoneybotPreambleEditorViewModel {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return 25046792;
        }

        public final String toString() {
            return "Loading";
        }
    }
}
