package com.yandex.passport.internal.ui.sloth.ebs;

import defpackage.dfi;

/* loaded from: classes4.dex */
public final class w0 implements e1 {
    public final String a;

    public w0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w0) && this.a.equals(((w0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return dfi.i(new StringBuilder("BiometricVerificationError(error="), this.a, ')');
    }
}
