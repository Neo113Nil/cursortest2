package com.appsflyer.internal.components.network.http.exceptions;

import com.appsflyer.internal.AFe1nSDK;
import java.io.IOException;

/* loaded from: classes4.dex */
public class HttpException extends IOException {
    private final AFe1nSDK AFAdRevenueData;

    public HttpException(Throwable th, AFe1nSDK aFe1nSDK) {
        super(th.getMessage(), th);
        this.AFAdRevenueData = aFe1nSDK;
    }

    public AFe1nSDK getMetrics() {
        return this.AFAdRevenueData;
    }
}
