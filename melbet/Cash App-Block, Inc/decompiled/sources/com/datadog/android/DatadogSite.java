package com.datadog.android;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes4.dex */
public enum DatadogSite {
    US1("us1", "browser-intake-datadoghq.com"),
    /* JADX INFO: Fake field, exist only in values array */
    US3("us3"),
    /* JADX INFO: Fake field, exist only in values array */
    US5("us5"),
    /* JADX INFO: Fake field, exist only in values array */
    EU1("eu1", "browser-intake-datadoghq.eu"),
    /* JADX INFO: Fake field, exist only in values array */
    AP1("ap1"),
    /* JADX INFO: Fake field, exist only in values array */
    AP2("ap2"),
    /* JADX INFO: Fake field, exist only in values array */
    US1_FED("us1_fed", "browser-intake-ddog-gov.com"),
    /* JADX INFO: Fake field, exist only in values array */
    STAGING("staging", "browser-intake-datad0g.com");

    public final String intakeEndpoint;
    public final String siteName;

    DatadogSite(String str, String str2) {
        this.siteName = str;
        this.intakeEndpoint = "https://".concat(str2);
    }

    public final String getSiteName$dd_sdk_android_core_release() {
        return this.siteName;
    }

    DatadogSite(String str) {
        this(str, JsonLogicResult$Success$$ExternalSyntheticOutline0.m("browser-intake-", str, "-datadoghq.com"));
    }
}
