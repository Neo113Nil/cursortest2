package com.squareup.cash.profile.views.security;

import com.squareup.protos.franklin.privacy.IncomingRequestPolicy;
import okio.internal.ResourceFileSystem;

/* loaded from: classes7.dex */
public abstract /* synthetic */ class RequestsSectionKt$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[IncomingRequestPolicy.values().length];
        try {
            ResourceFileSystem.Companion companion = IncomingRequestPolicy.Companion;
            iArr[0] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            ResourceFileSystem.Companion companion2 = IncomingRequestPolicy.Companion;
            iArr[1] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            ResourceFileSystem.Companion companion3 = IncomingRequestPolicy.Companion;
            iArr[2] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
