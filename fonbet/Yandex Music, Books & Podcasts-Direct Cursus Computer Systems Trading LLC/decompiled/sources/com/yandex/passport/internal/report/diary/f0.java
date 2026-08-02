package com.yandex.passport.internal.report.diary;

import defpackage.vz1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class f0 {
    public final String a;
    public final int b;

    public f0(String str, int i) {
        str.getClass();
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return Intrinsics.d(this.a, f0Var.a) && this.b == f0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DiaryMethodStats(name=");
        sb.append(this.a);
        sb.append(", count=");
        return vz1.r(sb, this.b, ')');
    }
}
