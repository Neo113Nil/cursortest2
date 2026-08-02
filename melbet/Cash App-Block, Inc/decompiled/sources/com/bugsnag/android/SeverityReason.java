package com.bugsnag.android;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.bugsnag.android.JsonStream;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes.dex */
public final class SeverityReason implements JsonStream.Streamable {
    public final String attributeKey;
    public final String attributeValue;
    public Severity currentSeverity;
    public final Severity defaultSeverity;
    public final boolean originalUnhandled;
    public final String severityReasonType;
    public final boolean unhandled;

    public SeverityReason(String str, Severity severity, boolean z, boolean z2, String str2, String str3) {
        this.severityReasonType = str;
        this.unhandled = z;
        this.originalUnhandled = z2;
        this.defaultSeverity = severity;
        this.currentSeverity = severity;
        this.attributeValue = str2;
        this.attributeKey = str3;
    }

    public static SeverityReason newInstance(Severity severity, String str, String str2) {
        if (str.equals("strictMode") && (str2 == null || str2.length() == 0)) {
            a$$ExternalSyntheticBUOutline0.m$3("No reason supplied for strictmode");
            return null;
        }
        if (!str.equals("strictMode") && !str.equals("log") && str2 != null && str2.length() != 0) {
            a$$ExternalSyntheticBUOutline0.m$3("attributeValue should not be supplied");
            return null;
        }
        switch (str) {
            case "strictMode":
                break;
            case "userCallbackSetSeverity":
            case "userSpecifiedSeverity":
                break;
            case "unhandledException":
            case "signal":
            case "anrError":
            case "unhandledPromiseRejection":
                break;
            case "handledError":
            case "httpError":
            case "handledException":
                break;
            case "log":
                break;
            default:
                a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m('\'', "Invalid argument for severityReason: '", str));
                break;
        }
        return null;
    }

    @Override // com.bugsnag.android.JsonStream.Streamable
    public final void toStream(JsonStream jsonStream) {
        String str;
        jsonStream.beginObject();
        jsonStream.name("type");
        jsonStream.value(this.defaultSeverity == this.currentSeverity ? this.severityReasonType : "userCallbackSetSeverity");
        jsonStream.name("unhandledOverridden");
        jsonStream.value(this.unhandled != this.originalUnhandled);
        String str2 = this.attributeKey;
        if (str2 != null && (str = this.attributeValue) != null) {
            jsonStream.name("attributes");
            jsonStream.beginObject();
            jsonStream.name(str2);
            jsonStream.value(str);
            jsonStream.endObject();
        }
        jsonStream.endObject();
    }
}
