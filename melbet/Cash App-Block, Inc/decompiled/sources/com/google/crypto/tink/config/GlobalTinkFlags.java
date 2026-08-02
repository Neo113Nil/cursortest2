package com.google.crypto.tink.config;

import okhttp3.ConnectionPool;

/* loaded from: classes.dex */
public abstract class GlobalTinkFlags {
    public static final ConnectionPool validateKeysetsOnParsing = new ConnectionPool(2, false);
}
