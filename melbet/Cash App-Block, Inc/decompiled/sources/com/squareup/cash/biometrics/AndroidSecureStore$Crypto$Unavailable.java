package com.squareup.cash.biometrics;

import app.cash.molecule.PlatformKt;

/* loaded from: classes5.dex */
public final class AndroidSecureStore$Crypto$Unavailable extends PlatformKt {
    public static final AndroidSecureStore$Crypto$Unavailable INSTANCE = new AndroidSecureStore$Crypto$Unavailable();

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof AndroidSecureStore$Crypto$Unavailable);
    }

    public final int hashCode() {
        return 2021593877;
    }

    public final String toString() {
        return "Unavailable";
    }
}
