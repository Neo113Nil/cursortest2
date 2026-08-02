package com.squareup.cash.featureflags;

import kotlin.collections.EmptyList;

/* loaded from: classes.dex */
public final class LocalFeatureFlagProvider$Empty {
    public static final LocalFeatureFlagProvider$Empty INSTANCE = new LocalFeatureFlagProvider$Empty();
    public static final EmptyList localFlags;
    public static final EmptyList localOnlyFlags;

    static {
        EmptyList emptyList = EmptyList.INSTANCE;
        localFlags = emptyList;
        localOnlyFlags = emptyList;
    }
}
