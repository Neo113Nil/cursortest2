package com.yandex.plus.home.datasource.openapi.models;

import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class a7 {

    @NotNull
    public static final z6 Companion = new z6();
    public final b3 a;
    public final x6 b;

    public /* synthetic */ a7(int i, b3 b3Var, x6 x6Var) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = b3Var;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = x6Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a7)) {
            return false;
        }
        a7 a7Var = (a7) obj;
        return Intrinsics.d(this.a, a7Var.a) && Intrinsics.d(this.b, a7Var.b);
    }

    public final int hashCode() {
        b3 b3Var = this.a;
        int hashCode = (b3Var == null ? 0 : b3Var.a.hashCode()) * 31;
        x6 x6Var = this.b;
        return hashCode + (x6Var != null ? x6Var.hashCode() : 0);
    }

    public final String toString() {
        return "NetworkSdkConfigurationResponseModel(error=" + this.a + ", data=" + this.b + ')';
    }
}
