package com.yandex.passport.sloth.ui.dependencies;

import defpackage.vz1;

/* loaded from: classes4.dex */
public final class f implements g {
    public final int a;

    public f(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && this.a == ((f) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return vz1.r(new StringBuilder("Lottie(lottieAnimationResId="), this.a, ')');
    }
}
