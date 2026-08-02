package com.yandex.passport.common.ui.progress;

import defpackage.vz1;

/* loaded from: classes4.dex */
public final class d implements f {
    public final int a;

    public d(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && this.a == ((d) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return vz1.r(new StringBuilder("Custom(backgroundResId="), this.a, ')');
    }
}
