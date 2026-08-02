package com.yandex.passport.internal.ui.challenge.vpn;

import defpackage.dfi;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class q {
    public final boolean a;
    public final String b;
    public final p c;
    public final boolean d;

    public q(boolean z, String str, p pVar, boolean z2) {
        this.a = z;
        this.b = str;
        this.c = pVar;
        this.d = z2;
    }

    public static q a(q qVar, String str, boolean z, int i) {
        boolean z2 = (i & 1) != 0 ? qVar.a : false;
        if ((i & 2) != 0) {
            str = qVar.b;
        }
        p pVar = (i & 4) != 0 ? qVar.c : p.a;
        if ((i & 8) != 0) {
            z = qVar.d;
        }
        qVar.getClass();
        return new q(z2, str, pVar, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.a == qVar.a && Intrinsics.d(this.b, qVar.b) && Intrinsics.d(this.c, qVar.c) && this.d == qVar.d;
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        int i = 0;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        p pVar = this.c;
        if (pVar != null) {
            pVar.getClass();
            i = -376798774;
        }
        return Boolean.hashCode(this.d) + ((hashCode2 + i) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("State(isLoading=");
        sb.append(this.a);
        sb.append(", url=");
        sb.append(this.b);
        sb.append(", result=");
        sb.append(this.c);
        sb.append(", shouldOpenSettings=");
        return dfi.j(sb, this.d, ')');
    }
}
