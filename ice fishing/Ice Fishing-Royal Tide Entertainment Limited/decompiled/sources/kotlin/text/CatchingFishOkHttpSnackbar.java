package kotlin.text;

import android.content.Context;
import android.text.TextUtils;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class CatchingFishOkHttpSnackbar {
    public final String CatchingFishCoroutine;
    public final String CatchingFishDaggerWebsocket;
    public final String CatchingFishParcelableFAB;
    public final String CatchingFishReduxKtor;
    public final String CatchingFishSnackbar;
    public final String CatchingFishViewModelScope;
    public final String CatchingFishWorkManager;

    public CatchingFishOkHttpSnackbar(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        int i = CatchingFishRoomJUnitGson.CatchingFishParcelableFAB;
        if (str == null || str.trim().isEmpty()) {
            throw new IllegalStateException("ApplicationId must be set.");
        }
        this.CatchingFishSnackbar = str;
        this.CatchingFishParcelableFAB = str2;
        this.CatchingFishCoroutine = str3;
        this.CatchingFishReduxKtor = str4;
        this.CatchingFishDaggerWebsocket = str5;
        this.CatchingFishWorkManager = str6;
        this.CatchingFishViewModelScope = str7;
    }

    public static CatchingFishOkHttpSnackbar CatchingFishParcelableFAB(Context context) {
        CatchingFishViewModelIntent catchingFishViewModelIntent = new CatchingFishViewModelIntent(context, 18);
        String CatchingFishOkHttp = catchingFishViewModelIntent.CatchingFishOkHttp("google_app_id");
        if (TextUtils.isEmpty(CatchingFishOkHttp)) {
            return null;
        }
        return new CatchingFishOkHttpSnackbar(CatchingFishOkHttp, catchingFishViewModelIntent.CatchingFishOkHttp("google_api_key"), catchingFishViewModelIntent.CatchingFishOkHttp("firebase_database_url"), catchingFishViewModelIntent.CatchingFishOkHttp("ga_trackingId"), catchingFishViewModelIntent.CatchingFishOkHttp("gcm_defaultSenderId"), catchingFishViewModelIntent.CatchingFishOkHttp("google_storage_bucket"), catchingFishViewModelIntent.CatchingFishOkHttp("project_id"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof CatchingFishOkHttpSnackbar)) {
            return false;
        }
        CatchingFishOkHttpSnackbar catchingFishOkHttpSnackbar = (CatchingFishOkHttpSnackbar) obj;
        return CatchingFishLayoutRoom.CatchingFishOkHttp(this.CatchingFishSnackbar, catchingFishOkHttpSnackbar.CatchingFishSnackbar) && CatchingFishLayoutRoom.CatchingFishOkHttp(this.CatchingFishParcelableFAB, catchingFishOkHttpSnackbar.CatchingFishParcelableFAB) && CatchingFishLayoutRoom.CatchingFishOkHttp(this.CatchingFishCoroutine, catchingFishOkHttpSnackbar.CatchingFishCoroutine) && CatchingFishLayoutRoom.CatchingFishOkHttp(this.CatchingFishReduxKtor, catchingFishOkHttpSnackbar.CatchingFishReduxKtor) && CatchingFishLayoutRoom.CatchingFishOkHttp(this.CatchingFishDaggerWebsocket, catchingFishOkHttpSnackbar.CatchingFishDaggerWebsocket) && CatchingFishLayoutRoom.CatchingFishOkHttp(this.CatchingFishWorkManager, catchingFishOkHttpSnackbar.CatchingFishWorkManager) && CatchingFishLayoutRoom.CatchingFishOkHttp(this.CatchingFishViewModelScope, catchingFishOkHttpSnackbar.CatchingFishViewModelScope);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.CatchingFishSnackbar, this.CatchingFishParcelableFAB, this.CatchingFishCoroutine, this.CatchingFishReduxKtor, this.CatchingFishDaggerWebsocket, this.CatchingFishWorkManager, this.CatchingFishViewModelScope});
    }

    public final String toString() {
        CatchingFishViewModelIntent catchingFishViewModelIntent = new CatchingFishViewModelIntent(this);
        catchingFishViewModelIntent.CatchingFishSnackbar(this.CatchingFishSnackbar, "applicationId");
        catchingFishViewModelIntent.CatchingFishSnackbar(this.CatchingFishParcelableFAB, "apiKey");
        catchingFishViewModelIntent.CatchingFishSnackbar(this.CatchingFishCoroutine, "databaseUrl");
        catchingFishViewModelIntent.CatchingFishSnackbar(this.CatchingFishDaggerWebsocket, "gcmSenderId");
        catchingFishViewModelIntent.CatchingFishSnackbar(this.CatchingFishWorkManager, "storageBucket");
        catchingFishViewModelIntent.CatchingFishSnackbar(this.CatchingFishViewModelScope, "projectId");
        return catchingFishViewModelIntent.toString();
    }
}
