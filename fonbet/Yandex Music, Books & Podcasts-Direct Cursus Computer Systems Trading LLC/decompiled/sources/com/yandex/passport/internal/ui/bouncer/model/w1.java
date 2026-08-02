package com.yandex.passport.internal.ui.bouncer.model;

/* loaded from: classes4.dex */
public final class w1 implements g2 {
    public final com.yandex.passport.internal.properties.l a;

    public w1(com.yandex.passport.internal.properties.l lVar) {
        this.a = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w1) && this.a.equals(((w1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ActivityOpen(loginProperties=" + this.a + ')';
    }
}
