package com.adjust.sdk.network;

import com.adjust.sdk.network.UtilNetworking;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterObserverMaxHeroTitanium2434 implements UtilNetworking.IHttpsURLConnectionProvider {
    @Override // com.adjust.sdk.network.UtilNetworking.IHttpsURLConnectionProvider
    public final HttpsURLConnection generateHttpsURLConnection(URL url) {
        return (HttpsURLConnection) url.openConnection();
    }
}
