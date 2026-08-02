package com.yandex.passport.data.network;

import defpackage.dfi;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class b8 {

    @NotNull
    public static final a8 Companion = new a8();
    public final String a;
    public final String b;

    public /* synthetic */ b8(int i, String str, String str2) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b8)) {
            return false;
        }
        b8 b8Var = (b8) obj;
        return Intrinsics.d(this.a, b8Var.a) && Intrinsics.d(this.b, b8Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SsoConfigDTO(appId=");
        sb.append(this.a);
        sb.append(", fingerprint=");
        return dfi.i(sb, this.b, ')');
    }
}
