package com.plaid.internal;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class I4 {
    public final String a;
    public final String b;
    public final byte[] c;

    public I4(String str, String str2, byte[] bArr) {
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
        if (!(obj instanceof I4)) {
            return false;
        }
        I4 i4 = (I4) obj;
        return Intrinsics.areEqual(this.a, i4.a) && Intrinsics.areEqual(this.b, i4.b) && Intrinsics.areEqual(this.c, i4.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.c) + C0322x.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("PaneEntity(workflowId=", str, ", renderingId=", str2, ", model="), Arrays.toString(this.c), ")");
    }
}
