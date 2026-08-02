package com.squareup.cash.clientroutes;

/* loaded from: classes.dex */
public final class ClientRoutesConfig {
    public static final ClientRoutesConfig standard = new ClientRoutesConfig();

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ClientRoutesConfig);
    }

    public final int hashCode() {
        return 844271980;
    }

    public final String toString() {
        return "ClientRoutesConfig(protocol=https, host=internal.cash.app)";
    }
}
