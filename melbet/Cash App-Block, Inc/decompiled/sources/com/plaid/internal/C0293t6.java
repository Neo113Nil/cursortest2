package com.plaid.internal;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.plaid.internal.t6, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0293t6 extends AbstractC0187h7 {
    public final String a;

    public C0293t6(String str) {
        str.getClass();
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0293t6) && Intrinsics.areEqual(this.a, ((C0293t6) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ProveSnaSessionInfo(verificationId=", this.a, ")");
    }
}
