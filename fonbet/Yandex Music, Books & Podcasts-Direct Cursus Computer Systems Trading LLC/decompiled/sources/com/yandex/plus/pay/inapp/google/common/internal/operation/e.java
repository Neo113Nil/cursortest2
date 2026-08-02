package com.yandex.plus.pay.inapp.google.common.internal.operation;

import defpackage.dfi;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e {
    public final d a;
    public final String b;

    public e(d dVar, String str) {
        str.getClass();
        this.a = dVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.a == eVar.a && Intrinsics.d(this.b, eVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlusPayGoogleBillingResponse(code=");
        sb.append(this.a);
        sb.append(", debugMessage=");
        return dfi.i(sb, this.b, ')');
    }
}
