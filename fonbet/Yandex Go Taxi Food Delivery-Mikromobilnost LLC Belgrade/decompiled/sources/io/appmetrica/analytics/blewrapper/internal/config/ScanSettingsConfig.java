package io.appmetrica.analytics.blewrapper.internal.config;

import defpackage.b64;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\f\u0018\u00002\u00020\u0001:\u0004)*+,B7\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001b\u0012\u0006\u0010&\u001a\u00020!¢\u0006\u0004\b'\u0010(J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010 \u001a\u0004\u0018\u00010\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010&\u001a\u00020!8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%¨\u0006-"}, d2 = {"Lio/appmetrica/analytics/blewrapper/internal/config/ScanSettingsConfig;", "", "other", "", "equals", "", "hashCode", "", "toString", "Lio/appmetrica/analytics/blewrapper/internal/config/ScanSettingsConfig$CallbackType;", "a", "Lio/appmetrica/analytics/blewrapper/internal/config/ScanSettingsConfig$CallbackType;", "getCallbackType", "()Lio/appmetrica/analytics/blewrapper/internal/config/ScanSettingsConfig$CallbackType;", "callbackType", "Lio/appmetrica/analytics/blewrapper/internal/config/ScanSettingsConfig$MatchMode;", "b", "Lio/appmetrica/analytics/blewrapper/internal/config/ScanSettingsConfig$MatchMode;", "getMatchMode", "()Lio/appmetrica/analytics/blewrapper/internal/config/ScanSettingsConfig$MatchMode;", "matchMode", "Lio/appmetrica/analytics/blewrapper/internal/config/ScanSettingsConfig$NumOfMatches;", "c", "Lio/appmetrica/analytics/blewrapper/internal/config/ScanSettingsConfig$NumOfMatches;", "getNumOfMatches", "()Lio/appmetrica/analytics/blewrapper/internal/config/ScanSettingsConfig$NumOfMatches;", "numOfMatches", "Lio/appmetrica/analytics/blewrapper/internal/config/ScanSettingsConfig$ScanMode;", "d", "Lio/appmetrica/analytics/blewrapper/internal/config/ScanSettingsConfig$ScanMode;", "getScanMode", "()Lio/appmetrica/analytics/blewrapper/internal/config/ScanSettingsConfig$ScanMode;", "scanMode", "", "e", "J", "getReportDelay", "()J", "reportDelay", "<init>", "(Lio/appmetrica/analytics/blewrapper/internal/config/ScanSettingsConfig$CallbackType;Lio/appmetrica/analytics/blewrapper/internal/config/ScanSettingsConfig$MatchMode;Lio/appmetrica/analytics/blewrapper/internal/config/ScanSettingsConfig$NumOfMatches;Lio/appmetrica/analytics/blewrapper/internal/config/ScanSettingsConfig$ScanMode;J)V", "CallbackType", "MatchMode", "NumOfMatches", "ScanMode", "ble-wrapper_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class ScanSettingsConfig {

    /* renamed from: a, reason: from kotlin metadata */
    private final CallbackType callbackType;

    /* renamed from: b, reason: from kotlin metadata */
    private final MatchMode matchMode;

    /* renamed from: c, reason: from kotlin metadata */
    private final NumOfMatches numOfMatches;

    /* renamed from: d, reason: from kotlin metadata */
    private final ScanMode scanMode;

    /* renamed from: e, reason: from kotlin metadata */
    private final long reportDelay;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lio/appmetrica/analytics/blewrapper/internal/config/ScanSettingsConfig$CallbackType;", "", "ALL_MATCHES", "FIRST_MATCH", "MATCH_LOST", "ble-wrapper_release"}, k = 1, mv = {1, 9, 0})
    public static final class CallbackType {
        public static final CallbackType ALL_MATCHES;
        public static final CallbackType FIRST_MATCH;
        public static final CallbackType MATCH_LOST;
        private static final /* synthetic */ CallbackType[] a;
        private static final /* synthetic */ k4o b;

        static {
            CallbackType callbackType = new CallbackType("ALL_MATCHES", 0);
            ALL_MATCHES = callbackType;
            CallbackType callbackType2 = new CallbackType("FIRST_MATCH", 1);
            FIRST_MATCH = callbackType2;
            CallbackType callbackType3 = new CallbackType("MATCH_LOST", 2);
            MATCH_LOST = callbackType3;
            CallbackType[] callbackTypeArr = {callbackType, callbackType2, callbackType3};
            a = callbackTypeArr;
            b = a.a(callbackTypeArr);
        }

        private CallbackType(String str, int i) {
        }

        public static k4o getEntries() {
            return b;
        }

        public static CallbackType valueOf(String str) {
            return (CallbackType) Enum.valueOf(CallbackType.class, str);
        }

        public static CallbackType[] values() {
            return (CallbackType[]) a.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lio/appmetrica/analytics/blewrapper/internal/config/ScanSettingsConfig$MatchMode;", "", "AGGRESSIVE", "STICKY", "ble-wrapper_release"}, k = 1, mv = {1, 9, 0})
    public static final class MatchMode {
        public static final MatchMode AGGRESSIVE;
        public static final MatchMode STICKY;
        private static final /* synthetic */ MatchMode[] a;
        private static final /* synthetic */ k4o b;

        static {
            MatchMode matchMode = new MatchMode("AGGRESSIVE", 0);
            AGGRESSIVE = matchMode;
            MatchMode matchMode2 = new MatchMode("STICKY", 1);
            STICKY = matchMode2;
            MatchMode[] matchModeArr = {matchMode, matchMode2};
            a = matchModeArr;
            b = a.a(matchModeArr);
        }

        private MatchMode(String str, int i) {
        }

        public static k4o getEntries() {
            return b;
        }

        public static MatchMode valueOf(String str) {
            return (MatchMode) Enum.valueOf(MatchMode.class, str);
        }

        public static MatchMode[] values() {
            return (MatchMode[]) a.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lio/appmetrica/analytics/blewrapper/internal/config/ScanSettingsConfig$NumOfMatches;", "", "ONE_AD", "FEW_AD", "MAX_AD", "ble-wrapper_release"}, k = 1, mv = {1, 9, 0})
    public static final class NumOfMatches {
        public static final NumOfMatches FEW_AD;
        public static final NumOfMatches MAX_AD;
        public static final NumOfMatches ONE_AD;
        private static final /* synthetic */ NumOfMatches[] a;
        private static final /* synthetic */ k4o b;

        static {
            NumOfMatches numOfMatches = new NumOfMatches("ONE_AD", 0);
            ONE_AD = numOfMatches;
            NumOfMatches numOfMatches2 = new NumOfMatches("FEW_AD", 1);
            FEW_AD = numOfMatches2;
            NumOfMatches numOfMatches3 = new NumOfMatches("MAX_AD", 2);
            MAX_AD = numOfMatches3;
            NumOfMatches[] numOfMatchesArr = {numOfMatches, numOfMatches2, numOfMatches3};
            a = numOfMatchesArr;
            b = a.a(numOfMatchesArr);
        }

        private NumOfMatches(String str, int i) {
        }

        public static k4o getEntries() {
            return b;
        }

        public static NumOfMatches valueOf(String str) {
            return (NumOfMatches) Enum.valueOf(NumOfMatches.class, str);
        }

        public static NumOfMatches[] values() {
            return (NumOfMatches[]) a.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lio/appmetrica/analytics/blewrapper/internal/config/ScanSettingsConfig$ScanMode;", "", "LOW_POWER", "BALANCED", "LOW_LATENCY", "ble-wrapper_release"}, k = 1, mv = {1, 9, 0})
    public static final class ScanMode {
        public static final ScanMode BALANCED;
        public static final ScanMode LOW_LATENCY;
        public static final ScanMode LOW_POWER;
        private static final /* synthetic */ ScanMode[] a;
        private static final /* synthetic */ k4o b;

        static {
            ScanMode scanMode = new ScanMode("LOW_POWER", 0);
            LOW_POWER = scanMode;
            ScanMode scanMode2 = new ScanMode("BALANCED", 1);
            BALANCED = scanMode2;
            ScanMode scanMode3 = new ScanMode("LOW_LATENCY", 2);
            LOW_LATENCY = scanMode3;
            ScanMode[] scanModeArr = {scanMode, scanMode2, scanMode3};
            a = scanModeArr;
            b = a.a(scanModeArr);
        }

        private ScanMode(String str, int i) {
        }

        public static k4o getEntries() {
            return b;
        }

        public static ScanMode valueOf(String str) {
            return (ScanMode) Enum.valueOf(ScanMode.class, str);
        }

        public static ScanMode[] values() {
            return (ScanMode[]) a.clone();
        }
    }

    public ScanSettingsConfig(CallbackType callbackType, MatchMode matchMode, NumOfMatches numOfMatches, ScanMode scanMode, long j) {
        this.callbackType = callbackType;
        this.matchMode = matchMode;
        this.numOfMatches = numOfMatches;
        this.scanMode = scanMode;
        this.reportDelay = j;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!ScanSettingsConfig.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        ScanSettingsConfig scanSettingsConfig = (ScanSettingsConfig) other;
        return this.callbackType == scanSettingsConfig.callbackType && this.matchMode == scanSettingsConfig.matchMode && this.numOfMatches == scanSettingsConfig.numOfMatches && this.scanMode == scanSettingsConfig.scanMode && this.reportDelay == scanSettingsConfig.reportDelay;
    }

    public final CallbackType getCallbackType() {
        return this.callbackType;
    }

    public final MatchMode getMatchMode() {
        return this.matchMode;
    }

    public final NumOfMatches getNumOfMatches() {
        return this.numOfMatches;
    }

    public final long getReportDelay() {
        return this.reportDelay;
    }

    public final ScanMode getScanMode() {
        return this.scanMode;
    }

    public int hashCode() {
        CallbackType callbackType = this.callbackType;
        int hashCode = (callbackType != null ? callbackType.hashCode() : 0) * 31;
        MatchMode matchMode = this.matchMode;
        int hashCode2 = (hashCode + (matchMode != null ? matchMode.hashCode() : 0)) * 31;
        NumOfMatches numOfMatches = this.numOfMatches;
        int hashCode3 = (hashCode2 + (numOfMatches != null ? numOfMatches.hashCode() : 0)) * 31;
        ScanMode scanMode = this.scanMode;
        return Long.hashCode(this.reportDelay) + ((hashCode3 + (scanMode != null ? scanMode.hashCode() : 0)) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ScanSettingsConfig(callbackType=");
        sb.append(this.callbackType);
        sb.append(", matchMode=");
        sb.append(this.matchMode);
        sb.append(", numOfMatches=");
        sb.append(this.numOfMatches);
        sb.append(", scanMode=");
        sb.append(this.scanMode);
        sb.append(", reportDelay=");
        return b64.o(sb, this.reportDelay, ')');
    }
}
