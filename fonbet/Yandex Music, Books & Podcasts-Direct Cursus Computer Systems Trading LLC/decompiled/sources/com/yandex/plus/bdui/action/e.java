package com.yandex.plus.bdui.action;

import defpackage.f1d;

/* loaded from: classes4.dex */
public final class e implements g {
    public final Throwable a;

    public e(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && this.a.equals(((e) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f1d.k(new StringBuilder("Failure(cause="), this.a, ')');
    }
}
