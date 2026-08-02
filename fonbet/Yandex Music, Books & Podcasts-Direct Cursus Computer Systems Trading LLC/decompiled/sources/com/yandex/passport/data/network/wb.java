package com.yandex.passport.data.network;

import defpackage.dfi;
import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class wb {

    @NotNull
    public static final vb Companion = new vb();
    public final String a;
    public final String b;

    public /* synthetic */ wb(int i, String str, String str2) {
        if (1 != (i & 1)) {
            u7g.V(i, 1, ub.a.getDescriptor());
            throw null;
        }
        this.a = str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wb)) {
            return false;
        }
        wb wbVar = (wb) obj;
        return Intrinsics.d(this.a, wbVar.a) && Intrinsics.d(this.b, wbVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Response(result=");
        sb.append(this.a);
        sb.append(", requestId=");
        return dfi.i(sb, this.b, ')');
    }
}
