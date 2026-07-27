package kotlin.text;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class CatchingFishExoPlayerIntent extends CatchingFishViewModelRoom {
    public final CatchingFishFragmentOkHttp CatchingFishCoroutine;
    public final String CatchingFishDaggerWebsocket;
    public final long CatchingFishParcelableFAB;
    public final Integer CatchingFishReduxKtor;
    public final long CatchingFishSnackbar;
    public final ArrayList CatchingFishWorkManager;

    public CatchingFishExoPlayerIntent(long j, long j2, CatchingFishFragmentOkHttp catchingFishFragmentOkHttp, Integer num, String str, ArrayList arrayList) {
        CatchingFishJUnitWidget catchingFishJUnitWidget = CatchingFishJUnitWidget.CatchingFishReduxKtor;
        this.CatchingFishParcelableFAB = j;
        this.CatchingFishSnackbar = j2;
        this.CatchingFishCoroutine = catchingFishFragmentOkHttp;
        this.CatchingFishReduxKtor = num;
        this.CatchingFishDaggerWebsocket = str;
        this.CatchingFishWorkManager = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CatchingFishViewModelRoom)) {
            return false;
        }
        CatchingFishExoPlayerIntent catchingFishExoPlayerIntent = (CatchingFishExoPlayerIntent) ((CatchingFishViewModelRoom) obj);
        if (this.CatchingFishParcelableFAB != catchingFishExoPlayerIntent.CatchingFishParcelableFAB) {
            return false;
        }
        catchingFishExoPlayerIntent.getClass();
        Object obj2 = CatchingFishJUnitWidget.CatchingFishReduxKtor;
        ArrayList arrayList = catchingFishExoPlayerIntent.CatchingFishWorkManager;
        String str = catchingFishExoPlayerIntent.CatchingFishDaggerWebsocket;
        Integer num = catchingFishExoPlayerIntent.CatchingFishReduxKtor;
        CatchingFishFragmentOkHttp catchingFishFragmentOkHttp = catchingFishExoPlayerIntent.CatchingFishCoroutine;
        if (this.CatchingFishSnackbar != catchingFishExoPlayerIntent.CatchingFishSnackbar || !this.CatchingFishCoroutine.equals(catchingFishFragmentOkHttp)) {
            return false;
        }
        Integer num2 = this.CatchingFishReduxKtor;
        if (num2 == null) {
            if (num != null) {
                return false;
            }
        } else if (!num2.equals(num)) {
            return false;
        }
        String str2 = this.CatchingFishDaggerWebsocket;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        return this.CatchingFishWorkManager.equals(arrayList) && obj2.equals(obj2);
    }

    public final int hashCode() {
        long j = this.CatchingFishParcelableFAB;
        long j2 = this.CatchingFishSnackbar;
        int hashCode = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.CatchingFishCoroutine.hashCode()) * 1000003;
        Integer num = this.CatchingFishReduxKtor;
        int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.CatchingFishDaggerWebsocket;
        return ((((hashCode2 ^ (str != null ? str.hashCode() : 0)) * 1000003) ^ this.CatchingFishWorkManager.hashCode()) * 1000003) ^ CatchingFishJUnitWidget.CatchingFishReduxKtor.hashCode();
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.CatchingFishParcelableFAB + ", requestUptimeMs=" + this.CatchingFishSnackbar + ", clientInfo=" + this.CatchingFishCoroutine + ", logSource=" + this.CatchingFishReduxKtor + ", logSourceName=" + this.CatchingFishDaggerWebsocket + ", logEvents=" + this.CatchingFishWorkManager + ", qosTier=" + CatchingFishJUnitWidget.CatchingFishReduxKtor + "}";
    }
}
