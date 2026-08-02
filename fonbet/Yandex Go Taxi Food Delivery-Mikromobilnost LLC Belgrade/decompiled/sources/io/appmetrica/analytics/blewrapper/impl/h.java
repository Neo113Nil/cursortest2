package io.appmetrica.analytics.blewrapper.impl;

import io.appmetrica.analytics.blewrapper.internal.config.ScanSettingsConfig;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class h {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;
    public static final /* synthetic */ int[] d;

    static {
        int[] iArr = new int[ScanSettingsConfig.ScanMode.values().length];
        try {
            iArr[ScanSettingsConfig.ScanMode.LOW_POWER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ScanSettingsConfig.ScanMode.BALANCED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ScanSettingsConfig.ScanMode.LOW_LATENCY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
        int[] iArr2 = new int[ScanSettingsConfig.CallbackType.values().length];
        try {
            iArr2[ScanSettingsConfig.CallbackType.MATCH_LOST.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[ScanSettingsConfig.CallbackType.FIRST_MATCH.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[ScanSettingsConfig.CallbackType.ALL_MATCHES.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        b = iArr2;
        int[] iArr3 = new int[ScanSettingsConfig.MatchMode.values().length];
        try {
            iArr3[ScanSettingsConfig.MatchMode.AGGRESSIVE.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr3[ScanSettingsConfig.MatchMode.STICKY.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        c = iArr3;
        int[] iArr4 = new int[ScanSettingsConfig.NumOfMatches.values().length];
        try {
            iArr4[ScanSettingsConfig.NumOfMatches.ONE_AD.ordinal()] = 1;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr4[ScanSettingsConfig.NumOfMatches.FEW_AD.ordinal()] = 2;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr4[ScanSettingsConfig.NumOfMatches.MAX_AD.ordinal()] = 3;
        } catch (NoSuchFieldError unused11) {
        }
        d = iArr4;
    }
}
