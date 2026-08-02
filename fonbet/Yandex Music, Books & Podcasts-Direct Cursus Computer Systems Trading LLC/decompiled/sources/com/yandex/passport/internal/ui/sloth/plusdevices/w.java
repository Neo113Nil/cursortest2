package com.yandex.passport.internal.ui.sloth.plusdevices;

import defpackage.dfi;

/* loaded from: classes4.dex */
public final class w implements x {
    public final boolean a;

    public w(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w) && this.a == ((w) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return dfi.j(new StringBuilder("TryAddPlusDevice(isFirstRequest="), this.a, ')');
    }
}
