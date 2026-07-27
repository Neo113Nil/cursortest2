package com.adjust.sdk.network;

import com.adjust.sdk.network.UtilNetworking;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;

/* loaded from: classes.dex */
public final class CatchingFishUnitTestingGson implements UtilNetworking.IHttpsURLConnectionProvider {
    @Override // com.adjust.sdk.network.UtilNetworking.IHttpsURLConnectionProvider
    public final HttpsURLConnection generateHttpsURLConnection(URL url) {
        return (HttpsURLConnection) url.openConnection();
    }
}
