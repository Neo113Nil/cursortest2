package com.squareup.cash.observability.types;

/* loaded from: classes.dex */
public abstract class MetadataKey {
    public final String bugsnagName;
    public final String datadogName;

    public /* synthetic */ MetadataKey(String str, String str2, int i) {
        this(str, str, (i & 4) != 0 ? str : str2);
    }

    public String getBugsnagName() {
        return this.bugsnagName;
    }

    public String getDatadogName() {
        return this.datadogName;
    }

    public MetadataKey(String str, String str2, String str3) {
        this.bugsnagName = str2;
        this.datadogName = str3;
    }
}
