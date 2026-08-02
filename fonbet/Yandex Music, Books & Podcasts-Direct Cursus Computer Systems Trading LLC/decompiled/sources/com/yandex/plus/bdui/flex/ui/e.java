package com.yandex.plus.bdui.flex.ui;

import defpackage.eta;
import java.util.List;

/* loaded from: classes4.dex */
public final class e implements f {
    public final List a;

    public e(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && this.a.equals(((e) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return eta.h(new StringBuilder("Success(updates="), this.a, ')');
    }
}
