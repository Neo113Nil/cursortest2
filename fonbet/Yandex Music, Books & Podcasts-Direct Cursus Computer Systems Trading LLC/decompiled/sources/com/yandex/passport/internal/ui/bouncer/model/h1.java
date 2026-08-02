package com.yandex.passport.internal.ui.bouncer.model;

import defpackage.dfi;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class h1 implements k1 {
    public final String a;
    public final String b;

    public h1(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h1)) {
            return false;
        }
        h1 h1Var = (h1) obj;
        return Intrinsics.d(this.a, h1Var.a) && Intrinsics.d(this.b, h1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OpenUrl(url=");
        com.appsflyer.internal.k.y(sb, this.a, ", purpose=");
        return dfi.i(sb, this.b, ')');
    }
}
