package kotlin.text;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class CatchingFishSpannableView {
    public final CatchingFishManifestBundle CatchingFishCoroutine;
    public final long CatchingFishDaggerWebsocket;
    public final String CatchingFishParcelableFAB;
    public final long CatchingFishReduxKtor;
    public final Integer CatchingFishSnackbar;
    public final Map CatchingFishWorkManager;

    public CatchingFishSpannableView(String str, Integer num, CatchingFishManifestBundle catchingFishManifestBundle, long j, long j2, HashMap hashMap) {
        this.CatchingFishParcelableFAB = str;
        this.CatchingFishSnackbar = num;
        this.CatchingFishCoroutine = catchingFishManifestBundle;
        this.CatchingFishReduxKtor = j;
        this.CatchingFishDaggerWebsocket = j2;
        this.CatchingFishWorkManager = hashMap;
    }

    public final CatchingFishViewWorkManager CatchingFishCoroutine() {
        CatchingFishViewWorkManager catchingFishViewWorkManager = new CatchingFishViewWorkManager();
        String str = this.CatchingFishParcelableFAB;
        if (str == null) {
            throw new NullPointerException("Null transportName");
        }
        catchingFishViewWorkManager.CatchingFishReduxKtor = str;
        catchingFishViewWorkManager.CatchingFishDaggerWebsocket = this.CatchingFishSnackbar;
        CatchingFishManifestBundle catchingFishManifestBundle = this.CatchingFishCoroutine;
        if (catchingFishManifestBundle == null) {
            throw new NullPointerException("Null encodedPayload");
        }
        catchingFishViewWorkManager.CatchingFishWorkManager = catchingFishManifestBundle;
        catchingFishViewWorkManager.CatchingFishViewModelScope = Long.valueOf(this.CatchingFishReduxKtor);
        catchingFishViewWorkManager.CatchingFishViewModelFAB = Long.valueOf(this.CatchingFishDaggerWebsocket);
        catchingFishViewWorkManager.CatchingFishLayout = new HashMap(this.CatchingFishWorkManager);
        return catchingFishViewWorkManager;
    }

    public final String CatchingFishParcelableFAB(String str) {
        String str2 = (String) this.CatchingFishWorkManager.get(str);
        return str2 == null ? "" : str2;
    }

    public final int CatchingFishSnackbar(String str) {
        String str2 = (String) this.CatchingFishWorkManager.get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public final boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (obj instanceof CatchingFishSpannableView) {
            CatchingFishSpannableView catchingFishSpannableView = (CatchingFishSpannableView) obj;
            String str = catchingFishSpannableView.CatchingFishParcelableFAB;
            Integer num2 = catchingFishSpannableView.CatchingFishSnackbar;
            if (this.CatchingFishParcelableFAB.equals(str) && ((num = this.CatchingFishSnackbar) != null ? num.equals(num2) : num2 == null) && this.CatchingFishCoroutine.equals(catchingFishSpannableView.CatchingFishCoroutine) && this.CatchingFishReduxKtor == catchingFishSpannableView.CatchingFishReduxKtor && this.CatchingFishDaggerWebsocket == catchingFishSpannableView.CatchingFishDaggerWebsocket && this.CatchingFishWorkManager.equals(catchingFishSpannableView.CatchingFishWorkManager)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.CatchingFishParcelableFAB.hashCode() ^ 1000003) * 1000003;
        Integer num = this.CatchingFishSnackbar;
        int hashCode2 = (((hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.CatchingFishCoroutine.hashCode()) * 1000003;
        long j = this.CatchingFishReduxKtor;
        int i = (hashCode2 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.CatchingFishDaggerWebsocket;
        return ((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.CatchingFishWorkManager.hashCode();
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.CatchingFishParcelableFAB + ", code=" + this.CatchingFishSnackbar + ", encodedPayload=" + this.CatchingFishCoroutine + ", eventMillis=" + this.CatchingFishReduxKtor + ", uptimeMillis=" + this.CatchingFishDaggerWebsocket + ", autoMetadata=" + this.CatchingFishWorkManager + "}";
    }
}
