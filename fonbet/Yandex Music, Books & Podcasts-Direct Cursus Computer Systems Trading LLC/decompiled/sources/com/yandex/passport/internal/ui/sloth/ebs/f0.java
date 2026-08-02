package com.yandex.passport.internal.ui.sloth.ebs;

import defpackage.vz1;

/* loaded from: classes4.dex */
public final class f0 implements h0 {
    public final int a;

    public f0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f0) && this.a == ((f0) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return vz1.r(new StringBuilder("SetResultCode(resultCode="), this.a, ')');
    }
}
