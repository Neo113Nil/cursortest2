package com.yandex.plus.pay.ui.common.internal.error.content;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f {
    public final String a;
    public final e b;

    public f(String str, e eVar) {
        str.getClass();
        eVar.getClass();
        this.a = str;
        this.b = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.d(this.a, fVar.a) && this.b == fVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PaymentErrorButtonContent(text=" + this.a + ", clickAction=" + this.b + ')';
    }
}
