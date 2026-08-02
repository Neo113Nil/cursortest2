package com.plaid.internal;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h8 {
    public final String a;
    public final String b;
    public final byte[] c;

    public h8(String str, String str2, byte[] bArr) {
        str.getClass();
        str2.getClass();
        bArr.getClass();
        this.a = str;
        this.b = str2;
        this.c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!h8.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        h8 h8Var = (h8) obj;
        return Intrinsics.areEqual(this.a, h8Var.a) && Intrinsics.areEqual(this.b, h8Var.b) && Arrays.equals(this.c, h8Var.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.c) + C0322x.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("WorkflowAnalyticsEntity(workflowId=", str, ", id=", str2, ", model="), Arrays.toString(this.c), ")");
    }
}
