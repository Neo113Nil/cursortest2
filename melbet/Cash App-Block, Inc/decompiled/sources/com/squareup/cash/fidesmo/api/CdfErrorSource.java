package com.squareup.cash.fidesmo.api;

/* loaded from: classes6.dex */
public enum CdfErrorSource {
    CLIENT("client"),
    SERVER("server"),
    FIDESMO_SDK("sdk"),
    FIDESMO_SERVER("sdk");

    public final String messagePrefix;

    CdfErrorSource(String str) {
        this.messagePrefix = str;
    }
}
