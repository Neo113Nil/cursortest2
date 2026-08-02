package com.plaid.internal.core.crashreporting.internal.models;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0000\u0018\u00002\u00020\u0001B\u0081\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\r\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00120\r\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d¢\u0006\u0002\u0010\u001eR\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0000X\u0081\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00038\u0000X\u0081\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\"\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00120\r8\u0000X\u0081\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0000X\u0081\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\"R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001d8\u0000X\u0081\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00038\u0000X\u0081\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\"R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00038\u0000X\u0081\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\"R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u001b8\u0000X\u0081\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u001e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00188\u0000X\u0081\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010 R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\"R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0000X\u0081\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0000X\u0081\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\"R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0000X\u0081\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\"R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0000X\u0081\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\"R\u0016\u0010\t\u001a\u00020\u00038\u0000X\u0081\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\"R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0000X\u0081\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u0010\"R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00038\u0000X\u0081\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u0010\"R\"\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\r8\u0000X\u0081\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u0010$R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0000X\u0081\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u0010\"¨\u00068"}, d2 = {"Lcom/plaid/internal/core/crashreporting/internal/models/Crash;", "", "id", "", "message", "timestamp", "level", "Lcom/plaid/internal/core/crashreporting/internal/models/CrashLogLevel;", "logger", "platform", "culprit", "method", "tags", "", "breadcrumbs", "", "Lcom/plaid/internal/core/crashreporting/internal/models/Breadcrumb;", "contexts", "Lcom/plaid/internal/core/crashreporting/internal/models/CrashContext;", "release", "dist", "environment", "serverName", "fingerprint", "", "checksum", "exceptionInterface", "Lcom/plaid/internal/core/crashreporting/internal/models/ExceptionInterface;", "debugMetaInterface", "Lcom/plaid/internal/core/crashreporting/internal/models/DebugMetaInterface;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/plaid/internal/core/crashreporting/internal/models/CrashLogLevel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/List;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/plaid/internal/core/crashreporting/internal/models/ExceptionInterface;Lcom/plaid/internal/core/crashreporting/internal/models/DebugMetaInterface;)V", "getBreadcrumbs$crash_reporting_release", "()Ljava/util/List;", "getChecksum$crash_reporting_release", "()Ljava/lang/String;", "getContexts$crash_reporting_release", "()Ljava/util/Map;", "getCulprit$crash_reporting_release", "getDebugMetaInterface$crash_reporting_release", "()Lcom/plaid/internal/core/crashreporting/internal/models/DebugMetaInterface;", "getDist$crash_reporting_release", "getEnvironment$crash_reporting_release", "getExceptionInterface$crash_reporting_release", "()Lcom/plaid/internal/core/crashreporting/internal/models/ExceptionInterface;", "getFingerprint$crash_reporting_release", "getId", "getLevel$crash_reporting_release", "()Lcom/plaid/internal/core/crashreporting/internal/models/CrashLogLevel;", "getLogger$crash_reporting_release", "getMessage$crash_reporting_release", "getMethod$crash_reporting_release", "getPlatform$crash_reporting_release", "getRelease$crash_reporting_release", "getServerName$crash_reporting_release", "getTags$crash_reporting_release", "getTimestamp$crash_reporting_release", "crash-reporting_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class Crash {

    @SerializedName("breadcrumbs")
    private final List<Breadcrumb> breadcrumbs;

    @SerializedName("checksum")
    private final String checksum;

    @SerializedName("contexts")
    private final Map<String, CrashContext> contexts;

    @SerializedName("culprit")
    private final String culprit;

    @SerializedName("debug_meta")
    private final DebugMetaInterface debugMetaInterface;

    @SerializedName("dist")
    private final String dist;

    @SerializedName("environment")
    private final String environment;

    @SerializedName(ExceptionInterface.EXCEPTION_INTERFACE)
    private final ExceptionInterface exceptionInterface;

    @SerializedName("fingerprint")
    private final List<String> fingerprint;

    @SerializedName("event_id")
    private final String id;

    @SerializedName("level")
    private final CrashLogLevel level;

    @SerializedName("logger")
    private final String logger;

    @SerializedName("message")
    private final String message;

    @SerializedName("method")
    private final String method;

    @SerializedName("platform")
    private final String platform;

    @SerializedName("release")
    private final String release;

    @SerializedName("serverName")
    private final String serverName;

    @SerializedName("tags")
    private final Map<String, String> tags;

    @SerializedName("timestamp")
    private final String timestamp;

    public /* synthetic */ Crash(String str, String str2, String str3, CrashLogLevel crashLogLevel, String str4, String str5, String str6, String str7, Map map, List list, Map map2, String str8, String str9, String str10, String str11, List list2, String str12, ExceptionInterface exceptionInterface, DebugMetaInterface debugMetaInterface, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : crashLogLevel, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? "java" : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : str7, (i & 256) != 0 ? new HashMap() : map, (i & 512) != 0 ? new ArrayList() : list, (i & 1024) != 0 ? new HashMap() : map2, (i & 2048) != 0 ? null : str8, (i & 4096) != 0 ? null : str9, (i & PKIFailureInfo.certRevoked) != 0 ? null : str10, (i & 16384) != 0 ? null : str11, (i & 32768) != 0 ? null : list2, (i & 65536) != 0 ? null : str12, (i & PKIFailureInfo.unsupportedVersion) != 0 ? null : exceptionInterface, (i & PKIFailureInfo.transactionIdInUse) != 0 ? null : debugMetaInterface);
    }

    public final List<Breadcrumb> getBreadcrumbs$crash_reporting_release() {
        return this.breadcrumbs;
    }

    /* renamed from: getChecksum$crash_reporting_release, reason: from getter */
    public final String getChecksum() {
        return this.checksum;
    }

    public final Map<String, CrashContext> getContexts$crash_reporting_release() {
        return this.contexts;
    }

    /* renamed from: getCulprit$crash_reporting_release, reason: from getter */
    public final String getCulprit() {
        return this.culprit;
    }

    /* renamed from: getDebugMetaInterface$crash_reporting_release, reason: from getter */
    public final DebugMetaInterface getDebugMetaInterface() {
        return this.debugMetaInterface;
    }

    /* renamed from: getDist$crash_reporting_release, reason: from getter */
    public final String getDist() {
        return this.dist;
    }

    /* renamed from: getEnvironment$crash_reporting_release, reason: from getter */
    public final String getEnvironment() {
        return this.environment;
    }

    /* renamed from: getExceptionInterface$crash_reporting_release, reason: from getter */
    public final ExceptionInterface getExceptionInterface() {
        return this.exceptionInterface;
    }

    public final List<String> getFingerprint$crash_reporting_release() {
        return this.fingerprint;
    }

    public final String getId() {
        return this.id;
    }

    /* renamed from: getLevel$crash_reporting_release, reason: from getter */
    public final CrashLogLevel getLevel() {
        return this.level;
    }

    /* renamed from: getLogger$crash_reporting_release, reason: from getter */
    public final String getLogger() {
        return this.logger;
    }

    /* renamed from: getMessage$crash_reporting_release, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* renamed from: getMethod$crash_reporting_release, reason: from getter */
    public final String getMethod() {
        return this.method;
    }

    /* renamed from: getPlatform$crash_reporting_release, reason: from getter */
    public final String getPlatform() {
        return this.platform;
    }

    /* renamed from: getRelease$crash_reporting_release, reason: from getter */
    public final String getRelease() {
        return this.release;
    }

    /* renamed from: getServerName$crash_reporting_release, reason: from getter */
    public final String getServerName() {
        return this.serverName;
    }

    public final Map<String, String> getTags$crash_reporting_release() {
        return this.tags;
    }

    /* renamed from: getTimestamp$crash_reporting_release, reason: from getter */
    public final String getTimestamp() {
        return this.timestamp;
    }

    public Crash(String str, String str2, String str3, CrashLogLevel crashLogLevel, String str4, String str5, String str6, String str7, Map<String, String> map, List<Breadcrumb> list, Map<String, CrashContext> map2, String str8, String str9, String str10, String str11, List<String> list2, String str12, ExceptionInterface exceptionInterface, DebugMetaInterface debugMetaInterface) {
        str.getClass();
        str5.getClass();
        map.getClass();
        list.getClass();
        map2.getClass();
        this.id = str;
        this.message = str2;
        this.timestamp = str3;
        this.level = crashLogLevel;
        this.logger = str4;
        this.platform = str5;
        this.culprit = str6;
        this.method = str7;
        this.tags = map;
        this.breadcrumbs = list;
        this.contexts = map2;
        this.release = str8;
        this.dist = str9;
        this.environment = str10;
        this.serverName = str11;
        this.fingerprint = list2;
        this.checksum = str12;
        this.exceptionInterface = exceptionInterface;
        this.debugMetaInterface = debugMetaInterface;
    }
}
