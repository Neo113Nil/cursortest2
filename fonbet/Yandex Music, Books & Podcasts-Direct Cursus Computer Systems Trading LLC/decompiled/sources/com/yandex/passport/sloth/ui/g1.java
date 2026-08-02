package com.yandex.passport.sloth.ui;

import defpackage.dfi;

/* loaded from: classes4.dex */
public final class g1 implements n1 {
    public final String a;

    public g1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g1) && this.a.equals(((g1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return dfi.i(new StringBuilder("ExecJs(js="), this.a, ')');
    }
}
