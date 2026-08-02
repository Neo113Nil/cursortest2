package com.yandex.passport.api;

import defpackage.dfi;

/* loaded from: classes4.dex */
public final class a0 implements b0 {
    public final String a;

    public a0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a0) && this.a.equals(((a0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return dfi.i(new StringBuilder("Success(trackId="), this.a, ')');
    }
}
