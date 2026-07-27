package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.components.network.http.exceptions.HttpException;
import com.appsflyer.internal.components.network.http.exceptions.ParsingException;
import com.appsflyer.internal.components.queue.exceptions.CreateHttpCallException;
import java.io.IOException;

/* loaded from: classes4.dex */
public abstract class AFf1oSDK<Result> extends AFe1eSDK<AFe1kSDK<Result>> {
    protected final AFb1cSDK areAllFieldsValid;
    public final AFg1wSDK component1;
    protected final AFe1qSDK component2;
    private AFb1uSDK component3;
    public AFe1kSDK<Result> component4;
    private String equals;

    protected boolean a_() {
        return true;
    }

    protected abstract AppsFlyerRequestListener areAllFieldsValid();

    protected abstract boolean copydefault();

    protected abstract AFe1tSDK<Result> getMediationNetwork(String str);

    @Override // com.appsflyer.internal.AFe1eSDK
    public long getMonetizationNetwork() {
        return 60000L;
    }

    private AFf1oSDK(AFf1zSDK aFf1zSDK, AFf1zSDK[] aFf1zSDKArr, AFe1qSDK aFe1qSDK, AFg1wSDK aFg1wSDK, AFb1cSDK aFb1cSDK, AFb1uSDK aFb1uSDK, String str) {
        super(aFf1zSDK, aFf1zSDKArr, str);
        this.component2 = aFe1qSDK;
        this.component1 = aFg1wSDK;
        this.areAllFieldsValid = aFb1cSDK;
        this.component3 = aFb1uSDK;
    }

    public AFf1oSDK(AFf1zSDK aFf1zSDK, AFf1zSDK[] aFf1zSDKArr, AFd1kSDK aFd1kSDK, String str) {
        this(aFf1zSDK, aFf1zSDKArr, aFd1kSDK.getCurrencyIso4217Code(), aFd1kSDK.AFKeystoreWrapper(), aFd1kSDK.copydefault(), aFd1kSDK.valueOf(), str);
    }

    public AFf1oSDK(AFf1zSDK aFf1zSDK, AFf1zSDK[] aFf1zSDKArr, AFd1kSDK aFd1kSDK, String str, String str2) {
        this(aFf1zSDK, aFf1zSDKArr, aFd1kSDK.getCurrencyIso4217Code(), aFd1kSDK.AFKeystoreWrapper(), aFd1kSDK.copydefault(), aFd1kSDK.valueOf(), str);
        this.equals = str2;
    }

    @Override // com.appsflyer.internal.AFe1eSDK
    public final void getCurrencyIso4217Code() {
        super.getCurrencyIso4217Code();
        if (copydefault()) {
            AFg1wSDK aFg1wSDK = this.component1;
            String str = (String) AFg1wSDK.getCurrencyIso4217Code(new Object[]{aFg1wSDK}, -1684451992, 1684451992, System.identityHashCode(aFg1wSDK));
            if (str == null || str.trim().isEmpty()) {
                return;
            }
            AFe1tSDK<Result> mediationNetwork = getMediationNetwork(str);
            if (mediationNetwork != null) {
                AFAdRevenueData(mediationNetwork.getRevenue);
            } else {
                AFLogger.afErrorLogForExcManagerOnly("Failed to create a cached HTTP call", new CreateHttpCallException("createHttpCall returned null"));
            }
        }
    }

    @Override // com.appsflyer.internal.AFe1eSDK
    public AFe1cSDK AFAdRevenueData() throws Exception {
        if (!a_() || !this.component1.getCurrencyIso4217Code()) {
            AFg1wSDK aFg1wSDK = this.component1;
            String str = (String) AFg1wSDK.getCurrencyIso4217Code(new Object[]{aFg1wSDK}, -1684451992, 1684451992, System.identityHashCode(aFg1wSDK));
            if (str != null && !str.trim().isEmpty()) {
                AFe1tSDK<Result> mediationNetwork = getMediationNetwork(str);
                if (mediationNetwork == null) {
                    AFLogger.afErrorLogForExcManagerOnly("Failed to create a cached HTTP call", new CreateHttpCallException("createHttpCall returned null"));
                    return AFe1cSDK.FAILURE;
                }
                if (copydefault()) {
                    AFAdRevenueData(mediationNetwork.getRevenue);
                }
                AFe1kSDK<Result> monetizationNetwork = mediationNetwork.getMonetizationNetwork();
                this.component4 = monetizationNetwork;
                this.areAllFieldsValid.getMediationNetwork(mediationNetwork.getRevenue.getMediationNetwork, monetizationNetwork.getStatusCode(), monetizationNetwork.getBody().toString());
                AppsFlyerRequestListener areAllFieldsValid = areAllFieldsValid();
                if (areAllFieldsValid != null) {
                    if (monetizationNetwork.isSuccessful()) {
                        areAllFieldsValid.onSuccess();
                    } else {
                        areAllFieldsValid.onError(50, new StringBuilder("Status code failure ").append(monetizationNetwork.getStatusCode()).toString());
                    }
                }
                if (monetizationNetwork.isSuccessful()) {
                    return AFe1cSDK.SUCCESS;
                }
                return AFe1cSDK.FAILURE;
            }
            AppsFlyerRequestListener areAllFieldsValid2 = areAllFieldsValid();
            if (areAllFieldsValid2 != null) {
                areAllFieldsValid2.onError(41, "No dev key");
            }
            throw new AFf1wSDK();
        }
        AppsFlyerRequestListener areAllFieldsValid3 = areAllFieldsValid();
        if (areAllFieldsValid3 != null) {
            areAllFieldsValid3.onError(11, "Skipping event because 'isStopped' is true");
        }
        throw new AFf1ySDK();
    }

    @Override // com.appsflyer.internal.AFe1eSDK
    public boolean getMediationNetwork() {
        if (component1() instanceof AFf1ySDK) {
            return false;
        }
        if (this.getMediationNetwork == AFe1cSDK.TIMEOUT) {
            return true;
        }
        Throwable component1 = component1();
        return (component1 instanceof IOException) && !(component1 instanceof ParsingException);
    }

    @Override // com.appsflyer.internal.AFe1eSDK
    public final void getCurrencyIso4217Code(Throwable th) {
        boolean z = !(th instanceof HttpException);
        if (th instanceof AFf1ySDK) {
            AFLogger.INSTANCE.e(AFh1vSDK.HTTP_CLIENT, "AppsFlyer SDK is stopped: the request was not sent to the server", th, true, false);
        } else {
            AFLogger.INSTANCE.e(AFh1vSDK.HTTP_CLIENT, "Error while sending request to server: ".concat(String.valueOf(th)), th, true, true, z);
        }
        AppsFlyerRequestListener areAllFieldsValid = areAllFieldsValid();
        if (areAllFieldsValid != null) {
            String message = th.getMessage();
            if (message == null) {
                message = "";
            }
            areAllFieldsValid.onError(40, message);
        }
    }

    private void AFAdRevenueData(AFe1mSDK aFe1mSDK) {
        String str = this.equals;
        this.equals = this.component3.AFAdRevenueData(new AFb1kSDK(aFe1mSDK.getMediationNetwork, aFe1mSDK.getCurrencyIso4217Code(), "6.15.2", this.getMonetizationNetwork));
        if (str != null) {
            this.component3.AFAdRevenueData(str);
        }
    }

    @Override // com.appsflyer.internal.AFe1eSDK
    public void getRevenue() {
        String str;
        if (this.getMediationNetwork != AFe1cSDK.SUCCESS) {
            if (getMediationNetwork() || (str = this.equals) == null) {
                return;
            }
            this.component3.AFAdRevenueData(str);
            return;
        }
        String str2 = this.equals;
        if (str2 != null) {
            this.component3.AFAdRevenueData(str2);
        }
    }
}
