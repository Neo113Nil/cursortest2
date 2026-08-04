package com.appsflyer.internal.components.network.http.exceptions;

import com.appsflyer.internal.AFe1kSDK;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class ParsingException extends IOException {
    private final AFe1kSDK<String> getRevenue;

    public ParsingException(String str, Throwable th, AFe1kSDK<String> aFe1kSDK) {
        super(str, th);
        this.getRevenue = aFe1kSDK;
    }

    public AFe1kSDK<String> getRawResponse() {
        return this.getRevenue;
    }
}
