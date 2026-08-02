package com.plaid.internal;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class A1 extends X {
    public final String b;
    public final Map<String, String> c;
    public final int d;

    public A1(String str, Map<String, String> map, int i) {
        str.getClass();
        map.getClass();
        this.b = str;
        this.c = map;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A1)) {
            return false;
        }
        A1 a1 = (A1) obj;
        return Intrinsics.areEqual(this.b, a1.b) && Intrinsics.areEqual(this.c, a1.c) && this.d == a1.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + CameraState$Type$EnumUnboxingLocalUtility.m(this.b.hashCode() * 31, this.c, 31);
    }

    public final String toString() {
        String str = this.b;
        Map<String, String> map = this.c;
        int i = this.d;
        StringBuilder sb = new StringBuilder("InformationBreadCrumb(message=");
        sb.append(str);
        sb.append(", data=");
        sb.append(map);
        sb.append(", logLevel=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, ")", sb);
    }
}
