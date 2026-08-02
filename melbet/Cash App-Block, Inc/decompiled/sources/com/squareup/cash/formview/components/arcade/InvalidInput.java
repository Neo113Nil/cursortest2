package com.squareup.cash.formview.components.arcade;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* loaded from: classes6.dex */
public final class InvalidInput {
    public final String message;
    public final Regex regex;

    public InvalidInput(String str, Regex regex) {
        this.regex = regex;
        this.message = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InvalidInput)) {
            return false;
        }
        InvalidInput invalidInput = (InvalidInput) obj;
        return Intrinsics.areEqual(this.regex, invalidInput.regex) && Intrinsics.areEqual(this.message, invalidInput.message);
    }

    public final int hashCode() {
        Regex regex = this.regex;
        int hashCode = (regex == null ? 0 : regex.hashCode()) * 31;
        String str = this.message;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "InvalidInput(regex=" + this.regex + ", message=" + this.message + ")";
    }
}
