package com.squareup.cash.fidesmo.api;

/* loaded from: classes6.dex */
public enum FidesmoServiceType {
    INSTALL("install"),
    UNINSTALL("uninstall");

    public final String serviceId;

    FidesmoServiceType(String str) {
        this.serviceId = str;
    }
}
