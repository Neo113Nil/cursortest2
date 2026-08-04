package com.appsflyer.internal;

import android.content.Context;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import com.appsflyer.AFLogger;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public abstract class AFc1dSDK<T> {
    public final String AFAdRevenueData;
    public final Executor getCurrencyIso4217Code;
    public final FutureTask<T> getMediationNetwork = new FutureTask<>(new Callable<T>() { // from class: com.appsflyer.internal.AFc1dSDK.5
        @Override // java.util.concurrent.Callable
        public final T call() {
            if (AFc1dSDK.this.getCurrencyIso4217Code()) {
                return (T) AFc1dSDK.this.getMonetizationNetwork();
            }
            return null;
        }
    });
    private final String[] getMonetizationNetwork;
    public final Context getRevenue;

    public AFc1dSDK(Context context, Executor executor, String str, String... strArr) {
        this.getRevenue = context;
        this.AFAdRevenueData = str;
        this.getMonetizationNetwork = strArr;
        this.getCurrencyIso4217Code = executor;
    }

    public T AFAdRevenueData() {
        try {
            return this.getMediationNetwork.get(500L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e2) {
            e = e2;
            AFLogger.afErrorLog(e.getMessage(), e, false, true);
            return null;
        } catch (ExecutionException e3) {
            e = e3;
            AFLogger.afErrorLog(e.getMessage(), e, false, true);
            return null;
        } catch (TimeoutException e4) {
            AFLogger.afErrorLog(e4.getMessage(), e4, false, false);
            return null;
        }
    }

    public final boolean getCurrencyIso4217Code() {
        try {
            ProviderInfo providerInfoResolveContentProvider = this.getRevenue.getPackageManager().resolveContentProvider(this.AFAdRevenueData, 128);
            return providerInfoResolveContentProvider != null && Arrays.asList(this.getMonetizationNetwork).contains(AFb1qSDK.e_(this.getRevenue.getPackageManager(), ((PackageItemInfo) providerInfoResolveContentProvider).packageName));
        } catch (PackageManager.NameNotFoundException | NoSuchAlgorithmException | CertificateException e2) {
            AFLogger.afErrorLog(e2.getMessage(), e2, false, true);
            return false;
        }
    }

    public abstract T getMonetizationNetwork();
}
