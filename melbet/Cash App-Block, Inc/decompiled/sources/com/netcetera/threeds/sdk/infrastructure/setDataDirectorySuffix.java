package com.netcetera.threeds.sdk.infrastructure;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes5.dex */
class setDataDirectorySuffix extends setWebChromeClient {
    private static int ThreeDS2Service = 1;
    private static int initialize;
    private final boolean get;
    private final SSLSocketFactory getWarnings;

    public setDataDirectorySuffix(setWebViewClient setwebviewclient, SSLSocketFactory sSLSocketFactory, boolean z) {
        super(setwebviewclient);
        this.getWarnings = sSLSocketFactory;
        this.get = z;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setWebChromeClient
    public setInitialScale getWarnings() {
        setDataDirectorySuffix setdatadirectorysuffix = new setDataDirectorySuffix(ThreeDS2Service(), this.getWarnings, this.get);
        int i = initialize;
        int i2 = i & 99;
        ThreeDS2Service = (i2 + ((i ^ 99) | i2)) % 128;
        return setdatadirectorysuffix;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
    
        r5.setSSLSocketFactory(r4.getWarnings);
        r4 = com.netcetera.threeds.sdk.infrastructure.setDataDirectorySuffix.initialize;
        r5 = r4 & 75;
        com.netcetera.threeds.sdk.infrastructure.setDataDirectorySuffix.ThreeDS2Service = (r5 + ((r4 ^ 75) | r5)) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
    
        if (r4.get != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001e, code lost:
    
        if (r4.get != false) goto L9;
     */
    @Override // com.netcetera.threeds.sdk.infrastructure.setWebChromeClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void initialize(HttpsURLConnection httpsURLConnection) {
        int i = ThreeDS2Service;
        int i2 = i & 7;
        int i3 = (i ^ 7) | i2;
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        initialize = i4 % 128;
        if (i4 % 2 != 0) {
            super.initialize(httpsURLConnection);
            int i5 = 45 / 0;
        } else {
            super.initialize(httpsURLConnection);
        }
        int i6 = initialize;
        int i7 = (i6 & 47) + (i6 | 47);
        ThreeDS2Service = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 7 / 0;
        }
    }
}
