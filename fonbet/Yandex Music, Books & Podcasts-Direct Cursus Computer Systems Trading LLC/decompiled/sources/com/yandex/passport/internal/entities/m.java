package com.yandex.passport.internal.entities;

import com.yandex.passport.api.w0;
import com.yandex.passport.api.z1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class m {
    public final z1 a;
    public final w0 b;
    public final String c;

    public m(z1 z1Var, w0 w0Var, String str) {
        w0Var.getClass();
        this.a = z1Var;
        this.b = w0Var;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        boolean d;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (!Intrinsics.d(this.a, mVar.a) || this.b != mVar.b) {
            return false;
        }
        String str = mVar.c;
        String str2 = this.c;
        if (str2 == null) {
            if (str == null) {
                d = true;
            }
            d = false;
        } else {
            if (str != null) {
                d = Intrinsics.d(str2, str);
            }
            d = false;
        }
        return d;
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LoginResult(uid=");
        sb.append(this.a);
        sb.append(", loginAction=");
        sb.append(this.b);
        sb.append(", additionalActionResponse=");
        String str = this.c;
        sb.append((Object) (str == null ? "null" : com.yandex.passport.internal.ui.a.J(str)));
        sb.append(')');
        return sb.toString();
    }
}
