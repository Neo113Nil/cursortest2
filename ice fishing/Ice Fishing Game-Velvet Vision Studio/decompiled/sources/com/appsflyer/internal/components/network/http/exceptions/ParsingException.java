package com.appsflyer.internal.components.network.http.exceptions;

import com.appsflyer.internal.AFe1wSDK;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public class ParsingException extends IOException {
    private final AFe1wSDK<String> getCurrencyIso4217Code;

    public ParsingException(String str, Throwable th, AFe1wSDK<String> aFe1wSDK) {
        super(str, th);
        this.getCurrencyIso4217Code = aFe1wSDK;
    }

    public AFe1wSDK<String> getRawResponse() {
        return this.getCurrencyIso4217Code;
    }
}
