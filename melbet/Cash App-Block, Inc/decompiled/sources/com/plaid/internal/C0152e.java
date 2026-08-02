package com.plaid.internal;

import defpackage.Drop$$ExternalSyntheticBUOutline0;

/* renamed from: com.plaid.internal.e, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0152e {

    /* renamed from: com.plaid.internal.e$a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[com.plaid.internal.core.protos.link.workflow.primitives.f.values().length];
            try {
                iArr[com.plaid.internal.core.protos.link.workflow.primitives.f.ANDROID_SMS_VERIFICATION_API_TYPE_UNKNOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[com.plaid.internal.core.protos.link.workflow.primitives.f.UNRECOGNIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[com.plaid.internal.core.protos.link.workflow.primitives.f.ANDROID_SMS_VERIFICATION_API_TYPE_SMS_RETRIEVER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public static final EnumC0151d7 a(com.plaid.internal.core.protos.link.workflow.primitives.f fVar) {
        fVar.getClass();
        int i = a.a[fVar.ordinal()];
        if (i != 1 && i != 2) {
            if (i == 3) {
                return EnumC0151d7.SMS_RECEIVER;
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return null;
        }
        return EnumC0151d7.NO_SMS_AUTOFILL;
    }
}
