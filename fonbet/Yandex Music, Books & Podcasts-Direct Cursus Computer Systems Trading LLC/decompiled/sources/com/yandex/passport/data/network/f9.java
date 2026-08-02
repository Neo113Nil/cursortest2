package com.yandex.passport.data.network;

import defpackage.dfi;
import defpackage.k5r;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class f9 {
    public final com.yandex.passport.data.models.w a;
    public final f1 b;
    public final List c;
    public final String d;
    public final boolean e;

    public f9(com.yandex.passport.data.models.w wVar, f1 f1Var, List list, String str, boolean z) {
        list.getClass();
        this.a = wVar;
        this.b = f1Var;
        this.c = list;
        this.d = str;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f9)) {
            return false;
        }
        f9 f9Var = (f9) obj;
        return this.a.equals(f9Var.a) && Intrinsics.d(this.b, f9Var.b) && Intrinsics.d(this.c, f9Var.c) && Intrinsics.d(this.d, f9Var.d) && this.e == f9Var.e;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        f1 f1Var = this.b;
        int d = k5r.d((hashCode + (f1Var == null ? 0 : f1Var.hashCode())) * 31, 31, this.c);
        String str = this.d;
        return Boolean.hashCode(this.e) + ((d + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Result(userInfoData=");
        sb.append(this.a);
        sb.append(", completeStatus=");
        sb.append(this.b);
        sb.append(", members=");
        sb.append(this.c);
        sb.append(", xTokenClientId=");
        sb.append(this.d);
        sb.append(", xTokenNeedReset=");
        return dfi.j(sb, this.e, ')');
    }
}
