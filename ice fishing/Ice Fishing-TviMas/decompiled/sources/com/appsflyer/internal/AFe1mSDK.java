package com.appsflyer.internal;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class AFe1mSDK {
    public boolean AFAdRevenueData;
    private final boolean areAllFieldsValid;
    private final byte[] component1;
    private final boolean component2;
    public int component3;
    private boolean component4;
    final String getCurrencyIso4217Code;
    public final String getMediationNetwork;
    public boolean getMonetizationNetwork;
    final Map<String, String> getRevenue;

    public AFe1mSDK(String str, byte[] bArr, String str2, Map<String, String> map, boolean z) {
        this(str, bArr, str2, map, z, (byte) 0);
    }

    private AFe1mSDK(String str, byte[] bArr, String str2, Map<String, String> map, boolean z, byte b) {
        this.component4 = true;
        this.getMonetizationNetwork = false;
        this.AFAdRevenueData = true;
        this.component3 = -1;
        this.getMediationNetwork = str;
        this.component1 = bArr;
        this.getCurrencyIso4217Code = str2;
        this.getRevenue = map;
        this.areAllFieldsValid = z;
        this.component2 = true;
    }

    public AFe1mSDK(String str, String str2) {
        this(str, null, str2, new HashMap(), false);
    }

    public final byte[] getCurrencyIso4217Code() {
        return this.component1;
    }

    public final boolean AFAdRevenueData() {
        return this.areAllFieldsValid;
    }

    public final boolean getMediationNetwork() {
        return this.component4;
    }

    public final boolean getMonetizationNetwork() {
        return this.getMonetizationNetwork;
    }

    public final boolean getRevenue() {
        return this.component2;
    }

    public final boolean component3() {
        return this.AFAdRevenueData;
    }
}
