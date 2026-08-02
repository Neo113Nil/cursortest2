package com.squareup.cash.payments.viewmodels;

/* loaded from: classes6.dex */
public final class RecipientsInputViewConfig {
    public final int maxChars;
    public final boolean singleLine;

    public RecipientsInputViewConfig(int i, boolean z) {
        this.maxChars = i;
        this.singleLine = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecipientsInputViewConfig)) {
            return false;
        }
        RecipientsInputViewConfig recipientsInputViewConfig = (RecipientsInputViewConfig) obj;
        return this.maxChars == recipientsInputViewConfig.maxChars && this.singleLine == recipientsInputViewConfig.singleLine;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.singleLine) + (Integer.hashCode(this.maxChars) * 31);
    }

    public final String toString() {
        return "RecipientsInputViewConfig(maxChars=" + this.maxChars + ", singleLine=" + this.singleLine + ")";
    }
}
