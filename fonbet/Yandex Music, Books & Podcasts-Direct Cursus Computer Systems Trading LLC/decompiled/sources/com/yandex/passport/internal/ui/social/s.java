package com.yandex.passport.internal.ui.social;

/* loaded from: classes4.dex */
public final class s extends t {
    public final com.yandex.passport.internal.ui.base.l a;

    public s(com.yandex.passport.internal.ui.base.l lVar) {
        this.a = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s) && this.a.equals(((s) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ShowActivityData(showActivityInfo=" + this.a + ')';
    }
}
