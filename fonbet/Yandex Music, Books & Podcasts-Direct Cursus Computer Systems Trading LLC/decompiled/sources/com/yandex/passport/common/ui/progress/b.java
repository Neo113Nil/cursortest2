package com.yandex.passport.common.ui.progress;

import defpackage.vz1;

/* loaded from: classes4.dex */
public final class b implements c {
    public final int a;

    public b(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && this.a == ((b) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return vz1.r(new StringBuilder("Lottie(lottieAnimationResId="), this.a, ')');
    }
}
