package com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.product.texts;

import defpackage.vz1;

/* loaded from: classes4.dex */
public final class f {
    public final int a;
    public final int b;

    public f(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.a == fVar.a && this.b == fVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextAppearances(title=");
        sb.append(this.a);
        sb.append(", subtitle=");
        return vz1.r(sb, this.b, ')');
    }
}
