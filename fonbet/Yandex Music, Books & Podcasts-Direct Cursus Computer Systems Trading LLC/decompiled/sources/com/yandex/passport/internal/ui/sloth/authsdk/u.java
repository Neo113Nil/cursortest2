package com.yandex.passport.internal.ui.sloth.authsdk;

/* loaded from: classes4.dex */
public final class u implements v {
    public final g a;

    public u(g gVar) {
        this.a = gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u) && this.a.equals(((u) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SetResult(result=" + this.a + ')';
    }
}
