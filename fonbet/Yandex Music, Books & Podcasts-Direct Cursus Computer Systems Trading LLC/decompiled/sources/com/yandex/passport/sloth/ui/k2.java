package com.yandex.passport.sloth.ui;

import defpackage.dfi;

/* loaded from: classes4.dex */
public final class k2 implements n2 {
    public final String a;

    public k2(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k2) && this.a.equals(((k2) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return dfi.i(new StringBuilder("ExecJs(js="), this.a, ')');
    }
}
