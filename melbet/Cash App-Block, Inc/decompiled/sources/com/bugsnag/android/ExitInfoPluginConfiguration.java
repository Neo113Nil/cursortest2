package com.bugsnag.android;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes.dex */
public final class ExitInfoPluginConfiguration {
    public boolean includeLogcat;
    public final boolean listOpenFds;
    public boolean reportUnmatchedANR;

    public ExitInfoPluginConfiguration(boolean z, boolean z2, boolean z3) {
        this.listOpenFds = z;
        this.includeLogcat = z2;
        this.reportUnmatchedANR = z3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ExitInfoPluginConfiguration)) {
            return false;
        }
        ExitInfoPluginConfiguration exitInfoPluginConfiguration = (ExitInfoPluginConfiguration) obj;
        return this.listOpenFds == exitInfoPluginConfiguration.listOpenFds && this.includeLogcat == exitInfoPluginConfiguration.includeLogcat && this.reportUnmatchedANR == exitInfoPluginConfiguration.reportUnmatchedANR;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Boolean.hashCode(this.listOpenFds) * 31, 31, this.includeLogcat), 31, this.reportUnmatchedANR);
    }
}
