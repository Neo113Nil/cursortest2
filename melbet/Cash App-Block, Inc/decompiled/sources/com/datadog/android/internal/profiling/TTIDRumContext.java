package com.datadog.android.internal.profiling;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.re$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class TTIDRumContext {
    public final String applicationId;
    public final String sessionId;
    public final String viewId;
    public final String viewName;
    public final String vitalId;

    public TTIDRumContext(String str, String str2, String str3, String str4, String str5) {
        re$$ExternalSyntheticOutline0.m1432m(str, str2, str3);
        this.applicationId = str;
        this.sessionId = str2;
        this.vitalId = str3;
        this.viewId = str4;
        this.viewName = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TTIDRumContext)) {
            return false;
        }
        TTIDRumContext tTIDRumContext = (TTIDRumContext) obj;
        return Intrinsics.areEqual(this.applicationId, tTIDRumContext.applicationId) && Intrinsics.areEqual(this.sessionId, tTIDRumContext.sessionId) && Intrinsics.areEqual(this.vitalId, tTIDRumContext.vitalId) && Intrinsics.areEqual(this.viewId, tTIDRumContext.viewId) && Intrinsics.areEqual(this.viewName, tTIDRumContext.viewName);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.applicationId.hashCode() * 31, 31, this.sessionId), 31, this.vitalId);
        String str = this.viewId;
        int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.viewName;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("TTIDRumContext(applicationId=", this.applicationId, ", sessionId=", this.sessionId, ", vitalId=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.vitalId, ", viewId=", this.viewId, ", viewName=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.viewName, ")");
    }
}
