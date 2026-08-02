package com.onesignal.debug.internal.logging.otel.android;

import android.content.Context;
import kotlin.jvm.internal.h;
import w.AbstractC5128c;

/* loaded from: classes2.dex */
public final class d {
    private final String appPackageId;
    private final String appVersion;
    private final Context context;
    private final String crashStoragePath;
    private final I7.a getIsInForeground;

    public d(String crashStoragePath, String appPackageId, String appVersion, Context context, I7.a aVar) {
        h.e(crashStoragePath, "crashStoragePath");
        h.e(appPackageId, "appPackageId");
        h.e(appVersion, "appVersion");
        this.crashStoragePath = crashStoragePath;
        this.appPackageId = appPackageId;
        this.appVersion = appVersion;
        this.context = context;
        this.getIsInForeground = aVar;
    }

    public static /* synthetic */ d copy$default(d dVar, String str, String str2, String str3, Context context, I7.a aVar, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dVar.crashStoragePath;
        }
        if ((i & 2) != 0) {
            str2 = dVar.appPackageId;
        }
        if ((i & 4) != 0) {
            str3 = dVar.appVersion;
        }
        if ((i & 8) != 0) {
            context = dVar.context;
        }
        if ((i & 16) != 0) {
            aVar = dVar.getIsInForeground;
        }
        I7.a aVar2 = aVar;
        String str4 = str3;
        return dVar.copy(str, str2, str4, context, aVar2);
    }

    public final String component1() {
        return this.crashStoragePath;
    }

    public final String component2() {
        return this.appPackageId;
    }

    public final String component3() {
        return this.appVersion;
    }

    public final Context component4() {
        return this.context;
    }

    public final I7.a component5() {
        return this.getIsInForeground;
    }

    public final d copy(String crashStoragePath, String appPackageId, String appVersion, Context context, I7.a aVar) {
        h.e(crashStoragePath, "crashStoragePath");
        h.e(appPackageId, "appPackageId");
        h.e(appVersion, "appVersion");
        return new d(crashStoragePath, appPackageId, appVersion, context, aVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return h.a(this.crashStoragePath, dVar.crashStoragePath) && h.a(this.appPackageId, dVar.appPackageId) && h.a(this.appVersion, dVar.appVersion) && h.a(this.context, dVar.context) && h.a(this.getIsInForeground, dVar.getIsInForeground);
    }

    public final String getAppPackageId() {
        return this.appPackageId;
    }

    public final String getAppVersion() {
        return this.appVersion;
    }

    public final Context getContext() {
        return this.context;
    }

    public final String getCrashStoragePath() {
        return this.crashStoragePath;
    }

    public final I7.a getGetIsInForeground() {
        return this.getIsInForeground;
    }

    public int hashCode() {
        int a9 = AbstractC5128c.a(AbstractC5128c.a(this.crashStoragePath.hashCode() * 31, 31, this.appPackageId), 31, this.appVersion);
        Context context = this.context;
        int hashCode = (a9 + (context == null ? 0 : context.hashCode())) * 31;
        I7.a aVar = this.getIsInForeground;
        return hashCode + (aVar != null ? aVar.hashCode() : 0);
    }

    public String toString() {
        return "OtelPlatformProviderConfig(crashStoragePath=" + this.crashStoragePath + ", appPackageId=" + this.appPackageId + ", appVersion=" + this.appVersion + ", context=" + this.context + ", getIsInForeground=" + this.getIsInForeground + ')';
    }

    public /* synthetic */ d(String str, String str2, String str3, Context context, I7.a aVar, int i, kotlin.jvm.internal.e eVar) {
        this(str, str2, str3, (i & 8) != 0 ? null : context, (i & 16) != 0 ? null : aVar);
    }
}
