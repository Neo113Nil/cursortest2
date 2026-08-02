package com.yandex.passport.internal.ui.router;

import android.os.Bundle;
import defpackage.dfi;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class o implements n {
    public final c0 a;
    public final Bundle b;
    public final String c;

    public o(c0 c0Var, Bundle bundle, String str) {
        this.a = c0Var;
        this.b = bundle;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.a == oVar.a && this.b.equals(oVar.b) && Intrinsics.d(this.c, oVar.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RouteData(roadSign=");
        sb.append(this.a);
        sb.append(", bundle=");
        sb.append(this.b);
        sb.append(", correction=");
        return dfi.i(sb, this.c, ')');
    }
}
