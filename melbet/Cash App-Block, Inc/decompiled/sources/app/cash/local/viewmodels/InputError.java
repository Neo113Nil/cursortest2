package app.cash.local.viewmodels;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public interface InputError {

    public final class TextTooLong implements InputError {
        public final int maxLength;

        public TextTooLong(int i) {
            this.maxLength = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TextTooLong) && this.maxLength == ((TextTooLong) obj).maxLength;
        }

        public final int hashCode() {
            return Integer.hashCode(this.maxLength);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.maxLength, "TextTooLong(maxLength=", ")");
        }
    }

    public final class ValueMissing implements InputError {
        public final String errorMessage;

        public ValueMissing(String str) {
            str.getClass();
            this.errorMessage = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ValueMissing) && Intrinsics.areEqual(this.errorMessage, ((ValueMissing) obj).errorMessage);
        }

        public final int hashCode() {
            return this.errorMessage.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ValueMissing(errorMessage=", this.errorMessage, ")");
        }
    }
}
