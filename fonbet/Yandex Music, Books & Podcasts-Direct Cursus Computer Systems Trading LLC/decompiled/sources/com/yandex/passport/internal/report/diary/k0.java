package com.yandex.passport.internal.report.diary;

/* loaded from: classes4.dex */
public final class k0 implements l0 {
    public final com.yandex.passport.internal.ui.router.c0 a;

    public k0(com.yandex.passport.internal.ui.router.c0 c0Var) {
        this.a = c0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k0) && this.a == ((k0) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "TypeRoadSign(sign=" + this.a + ')';
    }
}
