package com.adjust.sdk.network;

import com.adjust.sdk.network.UtilNetworking;
import javax.net.ssl.HttpsURLConnection;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final class IronMatrixResolverStreamK7wqznxY7VqvqBw6ZQ27769191864119 implements UtilNetworking.IConnectionOptions {
    @Override // com.adjust.sdk.network.UtilNetworking.IConnectionOptions
    public final void applyConnectionOptions(HttpsURLConnection httpsURLConnection, String str, int i) {
        httpsURLConnection.setRequestProperty("Client-SDK", str);
        httpsURLConnection.setConnectTimeout(i);
        httpsURLConnection.setReadTimeout(i);
    }
}
