package androidx.biometric;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class BiometricErrorData {
    public final int mErrorCode;
    public final CharSequence mErrorMessage;

    public BiometricErrorData(int i, CharSequence charSequence) {
        this.mErrorCode = i;
        this.mErrorMessage = charSequence;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof BiometricErrorData)) {
            return false;
        }
        BiometricErrorData biometricErrorData = (BiometricErrorData) obj;
        if (this.mErrorCode != biometricErrorData.mErrorCode) {
            return false;
        }
        CharSequence charSequence = biometricErrorData.mErrorMessage;
        CharSequence charSequence2 = this.mErrorMessage;
        String charSequence3 = charSequence2 != null ? charSequence2.toString() : null;
        String charSequence4 = charSequence != null ? charSequence.toString() : null;
        if (charSequence3 == null && charSequence4 == null) {
            return true;
        }
        return charSequence3 != null && charSequence3.equals(charSequence4);
    }

    public final int hashCode() {
        Integer valueOf = Integer.valueOf(this.mErrorCode);
        CharSequence charSequence = this.mErrorMessage;
        return Arrays.hashCode(new Object[]{valueOf, charSequence != null ? charSequence.toString() : null});
    }
}
