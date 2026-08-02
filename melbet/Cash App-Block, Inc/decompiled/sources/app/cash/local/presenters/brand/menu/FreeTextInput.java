package app.cash.local.presenters.brand.menu;

import app.cash.local.viewmodels.InputError;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class FreeTextInput {
    public InputError.TextTooLong error;
    public final String value;

    public FreeTextInput(String str, InputError.TextTooLong textTooLong) {
        str.getClass();
        this.value = str;
        this.error = textTooLong;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FreeTextInput)) {
            return false;
        }
        FreeTextInput freeTextInput = (FreeTextInput) obj;
        return Intrinsics.areEqual(this.value, freeTextInput.value) && Intrinsics.areEqual(this.error, freeTextInput.error);
    }

    public final int hashCode() {
        int hashCode = this.value.hashCode() * 31;
        InputError.TextTooLong textTooLong = this.error;
        return hashCode + (textTooLong == null ? 0 : Integer.hashCode(textTooLong.maxLength));
    }

    public final String toString() {
        return "FreeTextInput(value=" + this.value + ", error=" + this.error + ")";
    }
}
