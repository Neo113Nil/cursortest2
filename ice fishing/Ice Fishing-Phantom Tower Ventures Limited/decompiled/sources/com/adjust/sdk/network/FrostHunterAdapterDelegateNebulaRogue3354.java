package com.adjust.sdk.network;

import com.adjust.sdk.network.UtilNetworking;
import javax.net.ssl.HttpsURLConnection;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterAdapterDelegateNebulaRogue3354 implements UtilNetworking.IConnectionOptions {
    @Override // com.adjust.sdk.network.UtilNetworking.IConnectionOptions
    public final void applyConnectionOptions(HttpsURLConnection httpsURLConnection, String str, int i) {
        httpsURLConnection.setRequestProperty("Client-SDK", str);
        httpsURLConnection.setConnectTimeout(i);
        httpsURLConnection.setReadTimeout(i);
    }
}
