package com.yandex.passport.sloth.ui;

import defpackage.dfi;

/* loaded from: classes4.dex */
public final class w0 implements y0 {
    public final boolean a;

    public w0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w0) && this.a == ((w0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return dfi.j(new StringBuilder("Fail(runInNative="), this.a, ')');
    }
}
