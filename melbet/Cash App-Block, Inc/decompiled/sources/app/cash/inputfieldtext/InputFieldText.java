package app.cash.inputfieldtext;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public interface InputFieldText {

    public final class Simple implements InputFieldText {
        public final CharSequence value;

        public Simple(CharSequence charSequence) {
            charSequence.getClass();
            this.value = charSequence;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Simple) && Intrinsics.areEqual(this.value, ((Simple) obj).value);
        }

        @Override // app.cash.inputfieldtext.InputFieldText
        public final CharSequence getValue() {
            return this.value;
        }

        public final int hashCode() {
            return this.value.hashCode();
        }

        public final String toString() {
            return "Simple(value=" + ((Object) this.value) + ")";
        }
    }

    CharSequence getValue();
}
