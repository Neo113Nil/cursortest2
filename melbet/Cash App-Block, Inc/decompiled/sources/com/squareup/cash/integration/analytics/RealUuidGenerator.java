package com.squareup.cash.integration.analytics;

import java.util.UUID;

/* loaded from: classes.dex */
public final class RealUuidGenerator {
    public static UUID generate() {
        UUID randomUUID = UUID.randomUUID();
        randomUUID.getClass();
        return randomUUID;
    }
}
