package com.yandex.passport.internal.ui.sloth.plusdevices;

import defpackage.vz1;

/* loaded from: classes4.dex */
public final class v implements x {
    public final int a;

    public v(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v) && this.a == ((v) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return vz1.r(new StringBuilder("SlothResult(resultCode="), this.a, ')');
    }
}
