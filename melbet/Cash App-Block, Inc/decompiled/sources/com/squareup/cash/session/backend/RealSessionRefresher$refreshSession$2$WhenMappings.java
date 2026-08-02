package com.squareup.cash.session.backend;

import com.squareup.protos.franklin.app.RefreshSessionResponse;
import okio.ByteString;

/* loaded from: classes8.dex */
public abstract /* synthetic */ class RealSessionRefresher$refreshSession$2$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[RefreshSessionResponse.Status.values().length];
        try {
            ByteString.Companion companion = RefreshSessionResponse.Status.Companion;
            iArr[1] = 1;
        } catch (NoSuchFieldError unused) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
