package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.setCacheColorHint;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import java.security.KeyPair;
import java.security.PublicKey;

/* loaded from: classes5.dex */
public class setFontFeatureSettings {
    private static int addParam = 1;
    private static int onError;
    private final String ThreeDS2Service;
    private final KeyPair ThreeDS2ServiceInitializationCallback;
    private final String ThreeDS2ServiceInstance;
    private int cleanup;
    private final String createTransaction;
    private final String get;
    private final PublicKey getSDKInfo;
    private final String getSDKVersion;
    private final String getWarnings;
    private final setCacheColorHint.getWarnings initialize;

    public setFontFeatureSettings(com.netcetera.threeds.sdk.api.transaction.challenge.ChallengeParameters challengeParameters, setLocalePreferredLineHeightForMinimumUsed setlocalepreferredlineheightforminimumused, setCacheColorHint.getWarnings getwarnings, KeyPair keyPair, int i, String str) {
        this.get = challengeParameters.get3DSServerTransactionID();
        this.ThreeDS2Service = challengeParameters.getAcsTransactionID();
        this.ThreeDS2ServiceInstance = challengeParameters.getAcsRefNumber();
        this.getWarnings = setlocalepreferredlineheightforminimumused.ThreeDS2Service();
        this.getSDKInfo = setlocalepreferredlineheightforminimumused.ThreeDS2ServiceInstance();
        this.initialize = getwarnings;
        this.ThreeDS2ServiceInitializationCallback = keyPair;
        this.cleanup = i;
        this.getSDKVersion = str;
        this.createTransaction = challengeParameters.getThreeDSRequestorAppURL();
    }

    public KeyPair ThreeDS2Service() {
        int i = (addParam + 61) % 128;
        onError = i;
        KeyPair keyPair = this.ThreeDS2ServiceInitializationCallback;
        int i2 = (((i & (-70)) | ((~i) & 69)) - (~((i & 69) << 1))) - 1;
        addParam = i2 % 128;
        if (i2 % 2 != 0) {
            return keyPair;
        }
        throw null;
    }

    public setCacheColorHint.getWarnings ThreeDS2ServiceInitializationCallback() {
        int i = onError;
        setCacheColorHint.getWarnings getwarnings = this.initialize;
        int i2 = (i & (-28)) | ((~i) & 27);
        int i3 = -(-((i & 27) << 1));
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        addParam = i4 % 128;
        if (i4 % 2 != 0) {
            return getwarnings;
        }
        throw null;
    }

    public PublicKey ThreeDS2ServiceInstance() {
        int i = onError;
        int i2 = (i & (-40)) | ((~i) & 39);
        int i3 = -(-((i & 39) << 1));
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        addParam = i4 % 128;
        int i5 = i4 % 2;
        PublicKey publicKey = this.getSDKInfo;
        if (i5 != 0) {
            return publicKey;
        }
        throw null;
    }

    public String cleanup() {
        int i = addParam + 71;
        onError = i % 128;
        int i2 = i % 2;
        String str = this.createTransaction;
        if (i2 == 0) {
            return str;
        }
        throw null;
    }

    public String createTransaction() {
        int i = onError;
        int i2 = (i & (-86)) | ((~i) & 85);
        int i3 = (i & 85) << 1;
        int i4 = ((i2 | i3) << 1) - (i2 ^ i3);
        addParam = i4 % 128;
        int i5 = i4 % 2;
        String str = this.getSDKVersion;
        if (i5 == 0) {
            throw null;
        }
        int i6 = i & 5;
        int i7 = (i | 5) & (~i6);
        int i8 = -(-(i6 << 1));
        addParam = ((i7 & i8) + (i7 | i8)) % 128;
        return str;
    }

    public String get() {
        int i = addParam;
        int i2 = (i ^ 81) + ((i & 81) << 1);
        onError = i2 % 128;
        int i3 = i2 % 2;
        String str = this.get;
        if (i3 != 0) {
            throw null;
        }
        onError = (i + 65) % 128;
        return str;
    }

    public int getSDKInfo() {
        int i = addParam;
        int i2 = this.cleanup;
        onError = ((i & 47) + (i | 47)) % 128;
        return i2;
    }

    public void getSDKVersion() {
        int i = onError;
        int m$1 = SVG$Unit$EnumUnboxingLocalUtility.m$1(i & 73, ~(i | 73), 1, 128);
        addParam = m$1;
        int i2 = this.cleanup;
        int i3 = i2 & 1;
        int i4 = (i2 ^ 1) | i3;
        this.cleanup = (i3 & i4) + (i4 | i3);
        int i5 = ((m$1 | 99) << 1) - (m$1 ^ 99);
        onError = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public String getWarnings() {
        int i = addParam;
        int i2 = ((i ^ 8) + ((i & 8) << 1)) - 1;
        int i3 = i2 % 128;
        onError = i3;
        int i4 = i2 % 2;
        String str = this.getWarnings;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i3 & 95;
        addParam = SVG$Unit$EnumUnboxingLocalUtility.m$1(i5, ~(-(-((i3 ^ 95) | i5))), 1, 128);
        return str;
    }

    public String initialize() {
        int i = addParam;
        int i2 = (i & (-28)) | ((~i) & 27);
        int i3 = -(-((i & 27) << 1));
        int i4 = (i2 & i3) + (i3 | i2);
        onError = i4 % 128;
        int i5 = i4 % 2;
        String str = this.ThreeDS2Service;
        if (i5 == 0) {
            return str;
        }
        throw null;
    }
}
