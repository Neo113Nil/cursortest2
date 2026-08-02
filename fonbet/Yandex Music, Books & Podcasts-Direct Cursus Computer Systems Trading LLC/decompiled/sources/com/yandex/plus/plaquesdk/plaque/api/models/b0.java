package com.yandex.plus.plaquesdk.plaque.api.models;

import defpackage.dfi;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b0 implements c0 {
    public final String a;

    public b0(String str) {
        str.getClass();
        this.a = str;
    }

    @Override // com.yandex.plus.plaquesdk.plaque.api.models.c0
    public final String a() {
        return "";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b0) && Intrinsics.d(this.a, ((b0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return dfi.i(new StringBuilder("ToggleSwitch(actionContext=, widgetId="), this.a, ')');
    }
}
