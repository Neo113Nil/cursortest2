package com.datadog.android.telemetry.internal;

import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class TelemetryEventId {
    public final String kind;
    public final String message;

    /* renamed from: type, reason: collision with root package name */
    public final int f974type;

    public TelemetryEventId(int i, String str, String str2) {
        if (i == 0) {
            throw null;
        }
        str.getClass();
        this.f974type = i;
        this.message = str;
        this.kind = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TelemetryEventId)) {
            return false;
        }
        TelemetryEventId telemetryEventId = (TelemetryEventId) obj;
        return this.f974type == telemetryEventId.f974type && Intrinsics.areEqual(this.message, telemetryEventId.message) && Intrinsics.areEqual(this.kind, telemetryEventId.kind);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(CameraSelector$$ExternalSyntheticOutline0.ordinal(this.f974type) * 31, 31, this.message);
        String str = this.kind;
        return m + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("TelemetryEventId(type=");
        switch (this.f974type) {
            case 1:
                str = "DEBUG";
                break;
            case 2:
                str = "ERROR";
                break;
            case 3:
                str = "CONFIGURATION";
                break;
            case 4:
                str = "INTERCEPTOR_SETUP";
                break;
            case 5:
                str = "API_USAGE";
                break;
            case 6:
                str = "METRIC";
                break;
            default:
                str = "null";
                break;
        }
        sb.append(str);
        sb.append(", message=");
        sb.append(this.message);
        sb.append(", kind=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.kind, ")");
    }
}
