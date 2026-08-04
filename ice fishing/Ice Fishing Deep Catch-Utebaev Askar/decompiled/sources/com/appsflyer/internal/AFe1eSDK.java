package com.appsflyer.internal;

import android.net.TrafficStats;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public abstract class AFe1eSDK<Result> implements Comparable<AFe1eSDK<?>>, Callable<AFe1cSDK> {
    private static final AtomicInteger component1 = new AtomicInteger();
    public volatile int AFAdRevenueData;
    private final int areAllFieldsValid;
    private final String component2;
    private Throwable component3;
    private long component4;
    public final Set<AFf1zSDK> getCurrencyIso4217Code;
    public AFe1cSDK getMediationNetwork;
    public final AFf1zSDK getMonetizationNetwork;
    public final Set<AFf1zSDK> getRevenue;
    private boolean toString;

    public AFe1eSDK(AFf1zSDK aFf1zSDK, AFf1zSDK[] aFf1zSDKArr, String str) {
        HashSet hashSet = new HashSet();
        this.getRevenue = hashSet;
        this.getCurrencyIso4217Code = new HashSet();
        int iIncrementAndGet = component1.incrementAndGet();
        this.areAllFieldsValid = iIncrementAndGet;
        this.toString = false;
        this.AFAdRevenueData = 0;
        this.getMonetizationNetwork = aFf1zSDK;
        Collections.addAll(hashSet, aFf1zSDKArr);
        if (str != null) {
            this.component2 = str;
        } else {
            this.component2 = String.valueOf(iIncrementAndGet);
        }
    }

    public abstract AFe1cSDK AFAdRevenueData();

    public final Throwable component1() {
        return this.component3;
    }

    public final boolean component2() {
        return this.toString;
    }

    @Override // java.util.concurrent.Callable
    /* JADX INFO: renamed from: component3, reason: merged with bridge method [inline-methods] */
    public final AFe1cSDK call() {
        TrafficStats.setThreadStatsTag("AppsFlyer".hashCode());
        this.getMediationNetwork = null;
        this.component3 = null;
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.AFAdRevenueData++;
        try {
            AFe1cSDK aFe1cSDKAFAdRevenueData = AFAdRevenueData();
            this.getMediationNetwork = aFe1cSDKAFAdRevenueData;
            this.component4 = System.currentTimeMillis() - jCurrentTimeMillis;
            getRevenue();
            return aFe1cSDKAFAdRevenueData;
        } catch (Throwable th) {
            try {
                this.component3 = th;
                this.getMediationNetwork = AFe1cSDK.FAILURE;
                getCurrencyIso4217Code(th);
                throw th;
            } catch (Throwable th2) {
                this.component4 = System.currentTimeMillis() - jCurrentTimeMillis;
                getRevenue();
                throw th2;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AFe1eSDK aFe1eSDK = (AFe1eSDK) obj;
        if (this.getMonetizationNetwork != aFe1eSDK.getMonetizationNetwork) {
            return false;
        }
        return this.component2.equals(aFe1eSDK.component2);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: getCurrencyIso4217Code, reason: merged with bridge method [inline-methods] */
    public final int compareTo(AFe1eSDK<?> aFe1eSDK) {
        int i2 = this.getMonetizationNetwork.AFLogger - aFe1eSDK.getMonetizationNetwork.AFLogger;
        if (i2 != 0) {
            return i2;
        }
        if (this.component2.equals(aFe1eSDK.component2)) {
            return 0;
        }
        return this.areAllFieldsValid - aFe1eSDK.areAllFieldsValid;
    }

    public abstract boolean getMediationNetwork();

    public abstract long getMonetizationNetwork();

    public void getRevenue() {
    }

    public final int hashCode() {
        return this.component2.hashCode() + (this.getMonetizationNetwork.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.getMonetizationNetwork);
        sb.append("-");
        sb.append(this.component2);
        String string = sb.toString();
        if (String.valueOf(this.areAllFieldsValid).equals(this.component2)) {
            return string;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(string);
        sb2.append("-");
        sb2.append(this.areAllFieldsValid);
        return sb2.toString();
    }

    public void getCurrencyIso4217Code() {
        this.toString = true;
    }

    public void getCurrencyIso4217Code(Throwable th) {
    }
}
