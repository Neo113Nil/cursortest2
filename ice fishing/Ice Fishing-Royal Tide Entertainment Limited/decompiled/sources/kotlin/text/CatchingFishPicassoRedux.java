package kotlin.text;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class CatchingFishPicassoRedux extends CatchingFishParcelableGson {
    public final long CatchingFishCoroutine;
    public final String CatchingFishDaggerWebsocket;
    public final long CatchingFishParcelableFAB;
    public final byte[] CatchingFishReduxKtor;
    public final Integer CatchingFishSnackbar;
    public final CatchingFishBundleAppCompat CatchingFishViewModelScope;
    public final long CatchingFishWorkManager;

    public CatchingFishPicassoRedux(long j, Integer num, long j2, byte[] bArr, String str, long j3, CatchingFishBundleAppCompat catchingFishBundleAppCompat) {
        this.CatchingFishParcelableFAB = j;
        this.CatchingFishSnackbar = num;
        this.CatchingFishCoroutine = j2;
        this.CatchingFishReduxKtor = bArr;
        this.CatchingFishDaggerWebsocket = str;
        this.CatchingFishWorkManager = j3;
        this.CatchingFishViewModelScope = catchingFishBundleAppCompat;
    }

    public final boolean equals(Object obj) {
        Integer num;
        String str;
        CatchingFishBundleAppCompat catchingFishBundleAppCompat;
        if (obj == this) {
            return true;
        }
        if (obj instanceof CatchingFishParcelableGson) {
            CatchingFishParcelableGson catchingFishParcelableGson = (CatchingFishParcelableGson) obj;
            if (this.CatchingFishParcelableFAB == ((CatchingFishPicassoRedux) catchingFishParcelableGson).CatchingFishParcelableFAB && ((num = this.CatchingFishSnackbar) != null ? num.equals(((CatchingFishPicassoRedux) catchingFishParcelableGson).CatchingFishSnackbar) : ((CatchingFishPicassoRedux) catchingFishParcelableGson).CatchingFishSnackbar == null)) {
                CatchingFishPicassoRedux catchingFishPicassoRedux = (CatchingFishPicassoRedux) catchingFishParcelableGson;
                CatchingFishBundleAppCompat catchingFishBundleAppCompat2 = catchingFishPicassoRedux.CatchingFishViewModelScope;
                String str2 = catchingFishPicassoRedux.CatchingFishDaggerWebsocket;
                if (this.CatchingFishCoroutine == catchingFishPicassoRedux.CatchingFishCoroutine) {
                    if (Arrays.equals(this.CatchingFishReduxKtor, catchingFishParcelableGson instanceof CatchingFishPicassoRedux ? ((CatchingFishPicassoRedux) catchingFishParcelableGson).CatchingFishReduxKtor : catchingFishPicassoRedux.CatchingFishReduxKtor) && ((str = this.CatchingFishDaggerWebsocket) != null ? str.equals(str2) : str2 == null) && this.CatchingFishWorkManager == catchingFishPicassoRedux.CatchingFishWorkManager && ((catchingFishBundleAppCompat = this.CatchingFishViewModelScope) != null ? catchingFishBundleAppCompat.equals(catchingFishBundleAppCompat2) : catchingFishBundleAppCompat2 == null)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.CatchingFishParcelableFAB;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.CatchingFishSnackbar;
        int hashCode = (i ^ (num == null ? 0 : num.hashCode())) * 1000003;
        long j2 = this.CatchingFishCoroutine;
        int hashCode2 = (((hashCode ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.CatchingFishReduxKtor)) * 1000003;
        String str = this.CatchingFishDaggerWebsocket;
        int hashCode3 = (hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j3 = this.CatchingFishWorkManager;
        int i2 = (hashCode3 ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        CatchingFishBundleAppCompat catchingFishBundleAppCompat = this.CatchingFishViewModelScope;
        return i2 ^ (catchingFishBundleAppCompat != null ? catchingFishBundleAppCompat.hashCode() : 0);
    }

    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.CatchingFishParcelableFAB + ", eventCode=" + this.CatchingFishSnackbar + ", eventUptimeMs=" + this.CatchingFishCoroutine + ", sourceExtension=" + Arrays.toString(this.CatchingFishReduxKtor) + ", sourceExtensionJsonProto3=" + this.CatchingFishDaggerWebsocket + ", timezoneOffsetSeconds=" + this.CatchingFishWorkManager + ", networkConnectionInfo=" + this.CatchingFishViewModelScope + "}";
    }
}
