package com.datadog.android.rum.internal.domain;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.datadog.android.rum.RumErrorSource$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Map;
import java.util.UUID;
import kotlin.Pair;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes4.dex */
public final class RumContext {
    public static final String NULL_UUID;
    public final String actionId;
    public final String applicationId;
    public final boolean hasReplay;
    public final boolean isSessionActive;
    public final String sessionId;
    public final int sessionStartReason;
    public final int sessionState;
    public final String syntheticsResultId;
    public final String syntheticsTestId;
    public final String viewId;
    public final String viewName;
    public final long viewTimestamp;
    public final long viewTimestampOffset;
    public final int viewType;
    public final String viewUrl;

    static {
        String uuid = new UUID(0L, 0L).toString();
        uuid.getClass();
        NULL_UUID = uuid;
    }

    public RumContext(String str, String str2, boolean z, String str3, String str4, String str5, String str6, int i, int i2, int i3, String str7, String str8, long j, long j2, boolean z2) {
        str.getClass();
        str2.getClass();
        if (i == 0) {
            throw null;
        }
        if (i2 == 0) {
            throw null;
        }
        if (i3 == 0) {
            throw null;
        }
        this.applicationId = str;
        this.sessionId = str2;
        this.isSessionActive = z;
        this.viewId = str3;
        this.viewName = str4;
        this.viewUrl = str5;
        this.actionId = str6;
        this.sessionState = i;
        this.sessionStartReason = i2;
        this.viewType = i3;
        this.syntheticsTestId = str7;
        this.syntheticsResultId = str8;
        this.viewTimestamp = j;
        this.viewTimestampOffset = j2;
        this.hasReplay = z2;
    }

    public static RumContext copy$default(RumContext rumContext, String str, boolean z, String str2, String str3, String str4, String str5, int i, int i2, int i3, String str6, String str7, long j, long j2, boolean z2, int i4) {
        String str8 = rumContext.applicationId;
        String str9 = (i4 & 2) != 0 ? rumContext.sessionId : str;
        boolean z3 = (i4 & 4) != 0 ? rumContext.isSessionActive : z;
        String str10 = (i4 & 8) != 0 ? rumContext.viewId : str2;
        String str11 = (i4 & 16) != 0 ? rumContext.viewName : str3;
        String str12 = (i4 & 32) != 0 ? rumContext.viewUrl : str4;
        String str13 = (i4 & 64) != 0 ? rumContext.actionId : str5;
        int i5 = (i4 & 128) != 0 ? rumContext.sessionState : i;
        int i6 = (i4 & 256) != 0 ? rumContext.sessionStartReason : i2;
        int i7 = (i4 & 512) != 0 ? rumContext.viewType : i3;
        String str14 = (i4 & 1024) != 0 ? rumContext.syntheticsTestId : str6;
        String str15 = (i4 & 2048) != 0 ? rumContext.syntheticsResultId : str7;
        long j3 = (i4 & 4096) != 0 ? rumContext.viewTimestamp : j;
        String str16 = str9;
        long j4 = (i4 & PKIFailureInfo.certRevoked) != 0 ? rumContext.viewTimestampOffset : j2;
        boolean z4 = (i4 & 16384) != 0 ? rumContext.hasReplay : z2;
        rumContext.getClass();
        str8.getClass();
        str16.getClass();
        if (i5 == 0) {
            throw null;
        }
        if (i6 == 0) {
            throw null;
        }
        if (i7 != 0) {
            return new RumContext(str8, str16, z3, str10, str11, str12, str13, i5, i6, i7, str14, str15, j3, j4, z4);
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RumContext)) {
            return false;
        }
        RumContext rumContext = (RumContext) obj;
        return Intrinsics.areEqual(this.applicationId, rumContext.applicationId) && Intrinsics.areEqual(this.sessionId, rumContext.sessionId) && this.isSessionActive == rumContext.isSessionActive && Intrinsics.areEqual(this.viewId, rumContext.viewId) && Intrinsics.areEqual(this.viewName, rumContext.viewName) && Intrinsics.areEqual(this.viewUrl, rumContext.viewUrl) && Intrinsics.areEqual(this.actionId, rumContext.actionId) && this.sessionState == rumContext.sessionState && this.sessionStartReason == rumContext.sessionStartReason && this.viewType == rumContext.viewType && Intrinsics.areEqual(this.syntheticsTestId, rumContext.syntheticsTestId) && Intrinsics.areEqual(this.syntheticsResultId, rumContext.syntheticsResultId) && this.viewTimestamp == rumContext.viewTimestamp && this.viewTimestampOffset == rumContext.viewTimestampOffset && this.hasReplay == rumContext.hasReplay;
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.applicationId.hashCode() * 31, 31, this.sessionId), 31, this.isSessionActive);
        String str = this.viewId;
        int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.viewName;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.viewUrl;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.actionId;
        int m2 = Thread$State$EnumUnboxingLocalUtility.m(this.viewType, Thread$State$EnumUnboxingLocalUtility.m(this.sessionStartReason, Thread$State$EnumUnboxingLocalUtility.m(this.sessionState, (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31, 31), 31), 31);
        String str5 = this.syntheticsTestId;
        int hashCode4 = (m2 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.syntheticsResultId;
        return Boolean.hashCode(this.hasReplay) + Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m((hashCode4 + (str6 != null ? str6.hashCode() : 0)) * 31, 31, this.viewTimestamp), 31, this.viewTimestampOffset);
    }

    public final Map toMap() {
        return MapsKt__MapsKt.mapOf(new Pair("application_id", this.applicationId), new Pair("session_id", this.sessionId), new Pair("session_active", Boolean.valueOf(this.isSessionActive)), new Pair("session_state", RumErrorSource$EnumUnboxingLocalUtility.getAsString$1(this.sessionState)), new Pair("session_start_reason", RumErrorSource$EnumUnboxingLocalUtility.getAsString(this.sessionStartReason)), new Pair("view_id", this.viewId), new Pair("view_name", this.viewName), new Pair("view_url", this.viewUrl), new Pair("view_type", RumErrorSource$EnumUnboxingLocalUtility.getAsString$2(this.viewType)), new Pair("action_id", this.actionId), new Pair("synthetics_test_id", this.syntheticsTestId), new Pair("synthetics_result_id", this.syntheticsResultId), new Pair("view_timestamp", Long.valueOf(this.viewTimestamp)), new Pair("view_has_replay", Boolean.valueOf(this.hasReplay)), new Pair("view_timestamp_offset", Long.valueOf(this.viewTimestampOffset)));
    }

    public final String toString() {
        String str;
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("RumContext(applicationId=", this.applicationId, ", sessionId=", this.sessionId, ", isSessionActive=");
        NavAction$$ExternalSyntheticOutline0.m(m, this.isSessionActive, ", viewId=", this.viewId, ", viewName=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.viewName, ", viewUrl=", this.viewUrl, ", actionId=");
        m.append(this.actionId);
        m.append(", sessionState=");
        int i = this.sessionState;
        m.append(i != 1 ? i != 2 ? i != 3 ? "null" : "EXPIRED" : "TRACKED" : "NOT_TRACKED");
        m.append(", sessionStartReason=");
        switch (this.sessionStartReason) {
            case 1:
                str = "USER_APP_LAUNCH";
                break;
            case 2:
                str = "INACTIVITY_TIMEOUT";
                break;
            case 3:
                str = "MAX_DURATION";
                break;
            case 4:
                str = "BACKGROUND_LAUNCH";
                break;
            case 5:
                str = "PREWARM";
                break;
            case 6:
                str = "FROM_NON_INTERACTIVE_SESSION";
                break;
            case 7:
                str = "EXPLICIT_STOP";
                break;
            default:
                str = "null";
                break;
        }
        m.append(str);
        m.append(", viewType=");
        int i2 = this.viewType;
        m.append(i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? "null" : "APPLICATION_LAUNCH" : "BACKGROUND" : "FOREGROUND" : "NONE");
        m.append(", syntheticsTestId=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.syntheticsTestId, ", syntheticsResultId=", this.syntheticsResultId, ", viewTimestamp=");
        m.append(this.viewTimestamp);
        Boxes$$ExternalSyntheticOutline1.m1151m(this.viewTimestampOffset, ", viewTimestampOffset=", ", hasReplay=", m);
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.hasReplay, ")");
    }
}
