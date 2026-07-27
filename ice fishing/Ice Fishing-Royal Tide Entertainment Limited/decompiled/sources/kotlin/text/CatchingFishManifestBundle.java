package kotlin.text;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class CatchingFishManifestBundle {
    public final CatchingFishBiometricIntent CatchingFishParcelableFAB;
    public final byte[] CatchingFishSnackbar;

    public CatchingFishManifestBundle(CatchingFishBiometricIntent catchingFishBiometricIntent, byte[] bArr) {
        if (catchingFishBiometricIntent == null) {
            throw new NullPointerException("encoding is null");
        }
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        }
        this.CatchingFishParcelableFAB = catchingFishBiometricIntent;
        this.CatchingFishSnackbar = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatchingFishManifestBundle)) {
            return false;
        }
        CatchingFishManifestBundle catchingFishManifestBundle = (CatchingFishManifestBundle) obj;
        if (this.CatchingFishParcelableFAB.equals(catchingFishManifestBundle.CatchingFishParcelableFAB)) {
            return Arrays.equals(this.CatchingFishSnackbar, catchingFishManifestBundle.CatchingFishSnackbar);
        }
        return false;
    }

    public final int hashCode() {
        return ((this.CatchingFishParcelableFAB.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.CatchingFishSnackbar);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.CatchingFishParcelableFAB + ", bytes=[...]}";
    }
}
