package com.adjust.sdk.network;

import com.adjust.sdk.network.UtilNetworking;
import javax.net.ssl.HttpsURLConnection;

/* loaded from: classes.dex */
public final class CatchingFishViewPagerToast implements UtilNetworking.IConnectionOptions {
    @Override // com.adjust.sdk.network.UtilNetworking.IConnectionOptions
    public final void applyConnectionOptions(HttpsURLConnection httpsURLConnection, String str, int i) {
        httpsURLConnection.setRequestProperty("Client-SDK", str);
        httpsURLConnection.setConnectTimeout(i);
        httpsURLConnection.setReadTimeout(i);
    }
}
