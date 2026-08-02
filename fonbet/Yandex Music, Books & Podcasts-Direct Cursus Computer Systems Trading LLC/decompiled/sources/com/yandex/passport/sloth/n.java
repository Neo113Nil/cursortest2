package com.yandex.passport.sloth;

import defpackage.dfi;

/* loaded from: classes4.dex */
public final class n implements u {
    public final boolean a;

    public n(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n) && this.a == ((n) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return dfi.j(new StringBuilder("BlockOnLoading(blockOnLoading="), this.a, ')');
    }
}
