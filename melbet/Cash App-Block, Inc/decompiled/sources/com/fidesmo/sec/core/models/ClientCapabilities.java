package com.fidesmo.sec.core.models;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/fidesmo/sec/core/models/ClientCapabilities;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "SeAccess", "PaymentAidAccess", "App2app", "Support3ds", "Accounts", "sec-client-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public enum ClientCapabilities {
    SeAccess("se-access"),
    PaymentAidAccess("payment-aid-access"),
    App2app("app2app"),
    Support3ds("support3DS"),
    Accounts("accounts");

    private final String value;

    ClientCapabilities(String str) {
        this.value = str;
    }

    public final String getValue() {
        return this.value;
    }
}
