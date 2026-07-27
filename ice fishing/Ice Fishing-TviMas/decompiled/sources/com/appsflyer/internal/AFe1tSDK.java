package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.internal.components.network.http.exceptions.ParsingException;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;

/* loaded from: classes4.dex */
public final class AFe1tSDK<ResponseBody> {
    private final AFe1jSDK<ResponseBody> AFAdRevenueData;
    private final AtomicBoolean getCurrencyIso4217Code = new AtomicBoolean(false);
    private final AFe1lSDK getMediationNetwork;
    private final ExecutorService getMonetizationNetwork;
    public final AFe1mSDK getRevenue;

    public AFe1tSDK(AFe1mSDK aFe1mSDK, ExecutorService executorService, AFe1lSDK aFe1lSDK, AFe1jSDK<ResponseBody> aFe1jSDK) {
        this.getRevenue = aFe1mSDK;
        this.getMonetizationNetwork = executorService;
        this.getMediationNetwork = aFe1lSDK;
        this.AFAdRevenueData = aFe1jSDK;
    }

    public final AFe1kSDK<ResponseBody> getMonetizationNetwork() throws IOException {
        if (!this.getCurrencyIso4217Code.getAndSet(true)) {
            AFe1kSDK<String> mediationNetwork = this.getMediationNetwork.getMediationNetwork(this.getRevenue);
            try {
                return new AFe1kSDK<>(this.AFAdRevenueData.getRevenue(mediationNetwork.getBody()), mediationNetwork.getMediationNetwork, mediationNetwork.getRevenue, mediationNetwork.getMonetizationNetwork, mediationNetwork.AFAdRevenueData);
            } catch (JSONException e) {
                AFLogger.afErrorLogForExcManagerOnly("could not parse raw response - execute", e);
                throw new ParsingException(e.getMessage(), e, mediationNetwork);
            }
        }
        throw new IllegalStateException("Http call is already executed");
    }
}
