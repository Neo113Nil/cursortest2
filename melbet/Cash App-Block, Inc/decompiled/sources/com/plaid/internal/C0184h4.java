package com.plaid.internal;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.plaid.internal.h4, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0184h4 {
    public final int a;
    public final String b;

    public C0184h4(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0184h4)) {
            return false;
        }
        C0184h4 c0184h4 = (C0184h4) obj;
        return this.a == c0184h4.a && Intrinsics.areEqual(this.b, c0184h4.b);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NetworkRequestResult(status=");
        sb.append(this.a);
        sb.append(", message=");
        return CameraState$Type$EnumUnboxingLocalUtility.m(sb, this.b, ')');
    }
}
