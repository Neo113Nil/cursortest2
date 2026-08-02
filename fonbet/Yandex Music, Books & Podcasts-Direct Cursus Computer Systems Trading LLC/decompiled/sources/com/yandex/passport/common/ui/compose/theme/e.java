package com.yandex.passport.common.ui.compose.theme;

import defpackage.dfi;

/* loaded from: classes4.dex */
public final class e {
    public final boolean a;

    public e(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && this.a == ((e) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return dfi.j(new StringBuilder("WhileLabel(isWhiteLabel="), this.a, ')');
    }
}
