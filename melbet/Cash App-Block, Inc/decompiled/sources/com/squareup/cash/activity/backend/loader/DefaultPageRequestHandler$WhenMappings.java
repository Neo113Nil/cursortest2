package com.squareup.cash.activity.backend.loader;

import com.squareup.protos.cash.activity.api.v1.ActivityScope;

/* loaded from: classes8.dex */
public abstract /* synthetic */ class DefaultPageRequestHandler$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[ActivityScope.values().length];
        try {
            iArr[ActivityScope.SPONSORED_ACCOUNT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
