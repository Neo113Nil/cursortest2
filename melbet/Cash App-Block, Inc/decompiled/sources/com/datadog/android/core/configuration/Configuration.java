package com.datadog.android.core.configuration;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.datadog.android.DatadogSite;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Map;
import kotlin.collections.EmptyMap;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

/* loaded from: classes4.dex */
public final class Configuration {
    public static final Core DEFAULT_CORE_CONFIG;
    public final Map additionalConfig;
    public final String clientToken;
    public final Core coreConfig;
    public final boolean crashReportsEnabled;
    public final String env;
    public final String service;
    public final String variant;
    public final String version;

    public final class Core {
        public final BackPressureStrategy backpressureStrategy;
        public final int batchProcessingLevel;
        public final int batchSize;
        public final Map firstPartyHostsWithHeaderTypes;
        public final HttpUrl.Companion proxyAuth;
        public final DatadogSite site;
        public final int uploadFrequency;

        public Core(Map map, int i, int i2, HttpUrl.Companion companion, DatadogSite datadogSite, int i3, BackPressureStrategy backPressureStrategy) {
            map.getClass();
            if (i == 0) {
                throw null;
            }
            if (i2 == 0) {
                throw null;
            }
            datadogSite.getClass();
            if (i3 == 0) {
                throw null;
            }
            this.firstPartyHostsWithHeaderTypes = map;
            this.batchSize = i;
            this.uploadFrequency = i2;
            this.proxyAuth = companion;
            this.site = datadogSite;
            this.batchProcessingLevel = i3;
            this.backpressureStrategy = backPressureStrategy;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Core)) {
                return false;
            }
            Core core = (Core) obj;
            return Intrinsics.areEqual(this.firstPartyHostsWithHeaderTypes, core.firstPartyHostsWithHeaderTypes) && this.batchSize == core.batchSize && this.uploadFrequency == core.uploadFrequency && this.proxyAuth.equals(core.proxyAuth) && this.site == core.site && this.batchProcessingLevel == core.batchProcessingLevel && this.backpressureStrategy.equals(core.backpressureStrategy);
        }

        public final DatadogSite getSite() {
            return this.site;
        }

        public final int hashCode() {
            return (this.backpressureStrategy.hashCode() + Thread$State$EnumUnboxingLocalUtility.m(this.batchProcessingLevel, (this.site.hashCode() + ((this.proxyAuth.hashCode() + Thread$State$EnumUnboxingLocalUtility.m(this.uploadFrequency, Thread$State$EnumUnboxingLocalUtility.m(this.batchSize, CameraState$Type$EnumUnboxingLocalUtility.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Boolean.hashCode(false) * 31, 31, false), this.firstPartyHostsWithHeaderTypes, 31), 31), 961)) * 961)) * 31, 961)) * 31;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Core(needsClearTextHttp=false, enableDeveloperModeWhenDebuggable=false, firstPartyHostsWithHeaderTypes=");
            sb.append(this.firstPartyHostsWithHeaderTypes);
            sb.append(", batchSize=");
            String str = "MEDIUM";
            int i = this.batchSize;
            sb.append(i != 1 ? i != 2 ? i != 3 ? "null" : "LARGE" : "MEDIUM" : "SMALL");
            sb.append(", uploadFrequency=");
            sb.append(Thread$State$EnumUnboxingLocalUtility.stringValueOf$10(this.uploadFrequency));
            sb.append(", proxy=null, proxyAuth=");
            sb.append(this.proxyAuth);
            sb.append(", encryption=null, site=");
            sb.append(this.site);
            sb.append(", batchProcessingLevel=");
            int i2 = this.batchProcessingLevel;
            if (i2 == 1) {
                str = "LOW";
            } else if (i2 != 2) {
                str = i2 != 3 ? "null" : "HIGH";
            }
            sb.append(str);
            sb.append(", persistenceStrategyFactory=null, backpressureStrategy=");
            sb.append(this.backpressureStrategy);
            sb.append(", uploadSchedulerStrategy=null)");
            return sb.toString();
        }
    }

    static {
        BackPressureStrategy backPressureStrategy = new BackPressureStrategy();
        EmptyMap emptyMap = EmptyMap.INSTANCE;
        emptyMap.getClass();
        DEFAULT_CORE_CONFIG = new Core(emptyMap, 2, 2, HttpUrl.Companion.NONE, DatadogSite.US1, 2, backPressureStrategy);
    }

    public Configuration(Core core, String str, String str2, String str3, String str4, boolean z, Map map, String str5) {
        core.getClass();
        str.getClass();
        str2.getClass();
        map.getClass();
        this.coreConfig = core;
        this.clientToken = str;
        this.env = str2;
        this.variant = str3;
        this.service = str4;
        this.crashReportsEnabled = z;
        this.additionalConfig = map;
        this.version = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Configuration)) {
            return false;
        }
        Configuration configuration = (Configuration) obj;
        return Intrinsics.areEqual(this.coreConfig, configuration.coreConfig) && Intrinsics.areEqual(this.clientToken, configuration.clientToken) && Intrinsics.areEqual(this.env, configuration.env) && this.variant.equals(configuration.variant) && Intrinsics.areEqual(this.service, configuration.service) && this.crashReportsEnabled == configuration.crashReportsEnabled && Intrinsics.areEqual(this.additionalConfig, configuration.additionalConfig) && Intrinsics.areEqual(this.version, configuration.version);
    }

    public final Core getCoreConfig$dd_sdk_android_core_release() {
        return this.coreConfig;
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.coreConfig.hashCode() * 31, 31, this.clientToken), 31, this.env), 31, this.variant);
        String str = this.service;
        int m2 = CameraState$Type$EnumUnboxingLocalUtility.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((m + (str == null ? 0 : str.hashCode())) * 31, 31, this.crashReportsEnabled), this.additionalConfig, 31);
        String str2 = this.version;
        return m2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Configuration(coreConfig=");
        sb.append(this.coreConfig);
        sb.append(", clientToken=");
        sb.append(this.clientToken);
        sb.append(", env=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.env, ", variant=", this.variant, ", service=");
        NavAction$$ExternalSyntheticOutline0.m(sb, this.service, ", crashReportsEnabled=", this.crashReportsEnabled, ", additionalConfig=");
        sb.append(this.additionalConfig);
        sb.append(", version=");
        sb.append(this.version);
        sb.append(")");
        return sb.toString();
    }
}
