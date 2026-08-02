package com.yandex.passport.data.network;

import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class e6 {

    @NotNull
    public static final d6 Companion = new d6();
    public final b6 a;
    public final b6 b;

    public /* synthetic */ e6(int i, b6 b6Var, b6 b6Var2) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = b6Var;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = b6Var2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e6)) {
            return false;
        }
        e6 e6Var = (e6) obj;
        return Intrinsics.d(this.a, e6Var.a) && Intrinsics.d(this.b, e6Var.b);
    }

    public final int hashCode() {
        b6 b6Var = this.a;
        int hashCode = (b6Var == null ? 0 : b6Var.hashCode()) * 31;
        b6 b6Var2 = this.b;
        return hashCode + (b6Var2 != null ? b6Var2.hashCode() : 0);
    }

    public final String toString() {
        return "UrlTemplateConfigDTO(updateTokenWithMasterUrl=" + this.a + ", switchMemberUrl=" + this.b + ')';
    }
}
