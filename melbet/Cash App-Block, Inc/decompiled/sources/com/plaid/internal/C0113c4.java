package com.plaid.internal;

import com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse;

/* renamed from: com.plaid.internal.c4, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* synthetic */ class C0113c4 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[Workflow$LinkWorkflowStartResponse.c.values().length];
        try {
            iArr[Workflow$LinkWorkflowStartResponse.c.MOBILE_SDK_LOG_LEVEL_ALL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Workflow$LinkWorkflowStartResponse.c.MOBILE_SDK_LOG_LEVEL_ERRORS_ONLY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[Workflow$LinkWorkflowStartResponse.c.MOBILE_SDK_LOG_LEVEL_NONE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[Workflow$LinkWorkflowStartResponse.c.MOBILE_SDK_LOG_LEVEL_UNKNOWN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[Workflow$LinkWorkflowStartResponse.c.UNRECOGNIZED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
    }
}
