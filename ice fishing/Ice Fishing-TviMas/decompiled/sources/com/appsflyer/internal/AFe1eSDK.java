package com.appsflyer.internal;

import android.net.TrafficStats;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes4.dex */
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

    protected abstract AFe1cSDK AFAdRevenueData() throws Exception;

    protected void getCurrencyIso4217Code(Throwable th) {
    }

    protected abstract boolean getMediationNetwork();

    protected abstract long getMonetizationNetwork();

    protected void getRevenue() {
    }

    public AFe1eSDK(AFf1zSDK aFf1zSDK, AFf1zSDK[] aFf1zSDKArr, String str) {
        HashSet hashSet = new HashSet();
        this.getRevenue = hashSet;
        this.getCurrencyIso4217Code = new HashSet();
        int incrementAndGet = component1.incrementAndGet();
        this.areAllFieldsValid = incrementAndGet;
        this.toString = false;
        this.AFAdRevenueData = 0;
        this.getMonetizationNetwork = aFf1zSDK;
        Collections.addAll(hashSet, aFf1zSDKArr);
        if (str != null) {
            this.component2 = str;
        } else {
            this.component2 = String.valueOf(incrementAndGet);
        }
    }

    public void getCurrencyIso4217Code() {
        this.toString = true;
    }

    protected final boolean component2() {
        return this.toString;
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: component3, reason: merged with bridge method [inline-methods] */
    public final AFe1cSDK call() throws Exception {
        TrafficStats.setThreadStatsTag("AppsFlyer".hashCode());
        this.getMediationNetwork = null;
        this.component3 = null;
        long currentTimeMillis = System.currentTimeMillis();
        this.AFAdRevenueData++;
        try {
            AFe1cSDK AFAdRevenueData = AFAdRevenueData();
            this.getMediationNetwork = AFAdRevenueData;
            return AFAdRevenueData;
        } finally {
        }
    }

    public final Throwable component1() {
        return this.component3;
    }

    @Override // java.lang.Comparable
    /* renamed from: getCurrencyIso4217Code, reason: merged with bridge method [inline-methods] */
    public final int compareTo(AFe1eSDK<?> aFe1eSDK) {
        int i = this.getMonetizationNetwork.AFLogger - aFe1eSDK.getMonetizationNetwork.AFLogger;
        if (i != 0) {
            return i;
        }
        if (this.component2.equals(aFe1eSDK.component2)) {
            return 0;
        }
        return this.areAllFieldsValid - aFe1eSDK.areAllFieldsValid;
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

    public final int hashCode() {
        return (this.getMonetizationNetwork.hashCode() * 31) + this.component2.hashCode();
    }

    public String toString() {
        String obj = new StringBuilder().append(this.getMonetizationNetwork).append("-").append(this.component2).toString();
        return !String.valueOf(this.areAllFieldsValid).equals(this.component2) ? new StringBuilder().append(obj).append("-").append(this.areAllFieldsValid).toString() : obj;
    }
}
