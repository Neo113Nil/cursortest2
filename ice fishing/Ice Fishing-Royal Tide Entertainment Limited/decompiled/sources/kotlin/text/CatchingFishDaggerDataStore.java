package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishDaggerDataStore {
    public final String CatchingFishCoroutine;
    public final long CatchingFishDaggerWebsocket;
    public final String CatchingFishParcelableFAB;
    public final String CatchingFishReduxKtor;
    public final int CatchingFishSnackbar;
    public final String CatchingFishViewModelScope;
    public final long CatchingFishWorkManager;

    public CatchingFishDaggerDataStore(String str, int i, String str2, String str3, long j, long j2, String str4) {
        this.CatchingFishParcelableFAB = str;
        this.CatchingFishSnackbar = i;
        this.CatchingFishCoroutine = str2;
        this.CatchingFishReduxKtor = str3;
        this.CatchingFishDaggerWebsocket = j;
        this.CatchingFishWorkManager = j2;
        this.CatchingFishViewModelScope = str4;
    }

    public final CatchingFishKtorReduxBundle CatchingFishParcelableFAB() {
        CatchingFishKtorReduxBundle catchingFishKtorReduxBundle = new CatchingFishKtorReduxBundle();
        catchingFishKtorReduxBundle.CatchingFishSnackbar = this.CatchingFishParcelableFAB;
        catchingFishKtorReduxBundle.CatchingFishParcelableFAB = this.CatchingFishSnackbar;
        catchingFishKtorReduxBundle.CatchingFishCoroutine = this.CatchingFishCoroutine;
        catchingFishKtorReduxBundle.CatchingFishReduxKtor = this.CatchingFishReduxKtor;
        catchingFishKtorReduxBundle.CatchingFishWorkManager = Long.valueOf(this.CatchingFishDaggerWebsocket);
        catchingFishKtorReduxBundle.CatchingFishViewModelScope = Long.valueOf(this.CatchingFishWorkManager);
        catchingFishKtorReduxBundle.CatchingFishDaggerWebsocket = this.CatchingFishViewModelScope;
        return catchingFishKtorReduxBundle;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CatchingFishDaggerDataStore)) {
            return false;
        }
        CatchingFishDaggerDataStore catchingFishDaggerDataStore = (CatchingFishDaggerDataStore) obj;
        String str = this.CatchingFishParcelableFAB;
        if (str == null) {
            if (catchingFishDaggerDataStore.CatchingFishParcelableFAB != null) {
                return false;
            }
        } else if (!str.equals(catchingFishDaggerDataStore.CatchingFishParcelableFAB)) {
            return false;
        }
        int i = catchingFishDaggerDataStore.CatchingFishSnackbar;
        String str2 = catchingFishDaggerDataStore.CatchingFishViewModelScope;
        String str3 = catchingFishDaggerDataStore.CatchingFishReduxKtor;
        String str4 = catchingFishDaggerDataStore.CatchingFishCoroutine;
        if (!CatchingFishMVPLiveData.CatchingFishReduxKtor(this.CatchingFishSnackbar, i)) {
            return false;
        }
        String str5 = this.CatchingFishCoroutine;
        if (str5 == null) {
            if (str4 != null) {
                return false;
            }
        } else if (!str5.equals(str4)) {
            return false;
        }
        String str6 = this.CatchingFishReduxKtor;
        if (str6 == null) {
            if (str3 != null) {
                return false;
            }
        } else if (!str6.equals(str3)) {
            return false;
        }
        if (this.CatchingFishDaggerWebsocket != catchingFishDaggerDataStore.CatchingFishDaggerWebsocket || this.CatchingFishWorkManager != catchingFishDaggerDataStore.CatchingFishWorkManager) {
            return false;
        }
        String str7 = this.CatchingFishViewModelScope;
        return str7 == null ? str2 == null : str7.equals(str2);
    }

    public final int hashCode() {
        String str = this.CatchingFishParcelableFAB;
        int hashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ CatchingFishMVPLiveData.CatchingFishParcelableFlux(this.CatchingFishSnackbar)) * 1000003;
        String str2 = this.CatchingFishCoroutine;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.CatchingFishReduxKtor;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        long j = this.CatchingFishDaggerWebsocket;
        int i = (hashCode3 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.CatchingFishWorkManager;
        int i2 = (i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        String str4 = this.CatchingFishViewModelScope;
        return (str4 != null ? str4.hashCode() : 0) ^ i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PersistedInstallationEntry{firebaseInstallationId=");
        sb.append(this.CatchingFishParcelableFAB);
        sb.append(", registrationStatus=");
        int i = this.CatchingFishSnackbar;
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "REGISTER_ERROR" : "REGISTERED" : "UNREGISTERED" : "NOT_GENERATED" : "ATTEMPT_MIGRATION");
        sb.append(", authToken=");
        sb.append(this.CatchingFishCoroutine);
        sb.append(", refreshToken=");
        sb.append(this.CatchingFishReduxKtor);
        sb.append(", expiresInSecs=");
        sb.append(this.CatchingFishDaggerWebsocket);
        sb.append(", tokenCreationEpochInSecs=");
        sb.append(this.CatchingFishWorkManager);
        sb.append(", fisError=");
        return CatchingFishMVPLiveData.CatchingFishStateLiveData(sb, this.CatchingFishViewModelScope, "}");
    }
}
