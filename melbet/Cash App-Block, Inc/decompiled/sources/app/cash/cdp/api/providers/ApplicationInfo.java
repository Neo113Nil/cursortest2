package app.cash.cdp.api.providers;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ApplicationInfo {
    public final String build;
    public final String packageName;
    public final String version;

    public ApplicationInfo(String str, String str2, String str3) {
        str2.getClass();
        str3.getClass();
        this.version = str;
        this.build = str2;
        this.packageName = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApplicationInfo)) {
            return false;
        }
        ApplicationInfo applicationInfo = (ApplicationInfo) obj;
        return this.version.equals(applicationInfo.version) && Intrinsics.areEqual(this.build, applicationInfo.build) && Intrinsics.areEqual(this.packageName, applicationInfo.packageName);
    }

    public final int hashCode() {
        return this.packageName.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(536053963, 31, this.version), 31, this.build);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ApplicationInfo(name=cash-android, version=", this.version, ", build=", this.build, ", packageName="), this.packageName, ")");
    }
}
