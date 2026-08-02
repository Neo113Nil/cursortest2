package io.appmetrica.analytics;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes9.dex */
public abstract class CommonPulseConfig {
    public static final int CHANNEL_BETA = 3;
    public static final int CHANNEL_CANARY = 1;
    public static final int CHANNEL_DEFAULT = 0;
    public static final int CHANNEL_DEV = 2;
    public static final int CHANNEL_STABLE = 4;
    public static final int CHANNEL_UNKNOWN = 0;
    public static final boolean HISTOGRAMS_REPORTING_DEFAULT = true;
    public static final int[] POSSIBLE_CHANNELS = {0, 1, 2, 3, 4};
    public final Integer channelId;
    public final Boolean enableLogging;
    public final Executor executor;
    public final String histogramPrefix;
    public final Boolean histogramsReporting;
    public final ArrayList<Integer> testIds;
    public final String uploadUrl;

    @Deprecated
    public final Map<String, String> variations;

    public CommonPulseConfig(String str, Integer num, LinkedHashMap linkedHashMap, ArrayList arrayList, Executor executor, Boolean bool, String str2, Boolean bool2) {
        this.histogramPrefix = str;
        this.channelId = num;
        this.variations = linkedHashMap;
        this.testIds = arrayList;
        this.executor = executor;
        this.histogramsReporting = bool;
        this.uploadUrl = str2;
        this.enableLogging = bool2;
    }
}
