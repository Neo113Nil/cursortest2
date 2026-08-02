package com.squareup.cash.savings.viewmodels;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public interface TransferringViewModel {

    public final class Error implements TransferringViewModel {
        public final String actionText;
        public final String description;

        public Error(String str, String str2) {
            str.getClass();
            str2.getClass();
            this.description = str;
            this.actionText = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Error)) {
                return false;
            }
            Error error = (Error) obj;
            if (!Intrinsics.areEqual(this.description, error.description) || !Intrinsics.areEqual(this.actionText, error.actionText)) {
                return false;
            }
            TransferringViewEvent$Exit transferringViewEvent$Exit = TransferringViewEvent$Exit.INSTANCE;
            return transferringViewEvent$Exit.equals(transferringViewEvent$Exit);
        }

        public final int hashCode() {
            return ((this.actionText.hashCode() + (this.description.hashCode() * 31)) * 31) - 1722077302;
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Error(description=", this.description, ", actionText=", this.actionText, ", action=");
            m.append(TransferringViewEvent$Exit.INSTANCE);
            m.append(")");
            return m.toString();
        }
    }

    public final class Loading implements TransferringViewModel {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return 226118879;
        }

        public final String toString() {
            return "Loading";
        }
    }
}
