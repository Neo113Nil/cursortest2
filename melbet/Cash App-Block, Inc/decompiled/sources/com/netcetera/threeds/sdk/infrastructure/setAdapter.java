package com.netcetera.threeds.sdk.infrastructure;

import java.io.OutputStream;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes5.dex */
class setAdapter extends setWebChromeClient {
    private static int ThreeDS2Service = 0;
    private static int initialize = 1;
    private final SSLSocketFactory get;

    public setAdapter(setWebViewClient setwebviewclient, SSLSocketFactory sSLSocketFactory) {
        super(setwebviewclient);
        this.get = sSLSocketFactory;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setWebChromeClient
    public void ThreeDS2ServiceInstance(HttpsURLConnection httpsURLConnection) {
        int i = ThreeDS2Service;
        int i2 = i & 85;
        int i3 = i | 85;
        initialize = ((i2 & i3) + (i3 | i2)) % 128;
        super.ThreeDS2ServiceInstance(httpsURLConnection);
        OutputStream outputStream = httpsURLConnection.getOutputStream();
        try {
            byte[] ThreeDS2Service2 = ThreeDS2Service().ThreeDS2ServiceInstance().ThreeDS2Service();
            outputStream.write(ThreeDS2Service2, 0, ThreeDS2Service2.length);
            int i4 = ThreeDS2Service;
            int i5 = (i4 & (-126)) | ((~i4) & 125);
            int i6 = (i4 & 125) << 1;
            initialize = ((i5 & i6) + (i6 | i5)) % 128;
            outputStream.close();
            int i7 = initialize;
            int i8 = i7 & 17;
            int i9 = -(-((i7 ^ 17) | i8));
            int i10 = (i8 & i9) + (i9 | i8);
            ThreeDS2Service = i10 % 128;
            if (i10 % 2 != 0) {
                throw null;
            }
        } catch (Throwable th) {
            if (outputStream != null) {
                try {
                    outputStream.close();
                    int i11 = ThreeDS2Service;
                    int i12 = (i11 & (-64)) | ((~i11) & 63);
                    int i13 = -(-((i11 & 63) << 1));
                    initialize = (((i12 | i13) << 1) - (i13 ^ i12)) % 128;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setWebChromeClient
    public setInitialScale getWarnings() {
        setAdapter setadapter = new setAdapter(ThreeDS2Service(), this.get);
        int i = initialize + 108;
        int i2 = (i ^ (-1)) + (i << 1);
        ThreeDS2Service = i2 % 128;
        if (i2 % 2 == 0) {
            return setadapter;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setWebChromeClient
    public void initialize(HttpsURLConnection httpsURLConnection) {
        int i = initialize;
        int i2 = i & 53;
        int i3 = ((i | 53) & (~i2)) + (i2 << 1);
        ThreeDS2Service = i3 % 128;
        int i4 = i3 % 2;
        super.initialize(httpsURLConnection);
        httpsURLConnection.setSSLSocketFactory(this.get);
        httpsURLConnection.setDoInput(true);
    }
}
