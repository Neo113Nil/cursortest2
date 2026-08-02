package com.yandex.passport.api;

import defpackage.dfi;

/* loaded from: classes4.dex */
public final class n0 implements o0 {
    public final String a;

    public n0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n0) && this.a.equals(((n0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return dfi.i(new StringBuilder("Success(taskId="), this.a, ')');
    }
}
