package com.yandex.plus.pay.internal.network;

import defpackage.dfi;
import java.io.Serializable;

/* loaded from: classes5.dex */
public final class e implements Serializable {
    public final String a;
    public final String b;

    public e(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.a.equals(eVar.a) && this.b.equals(eVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SimOperator(mcc=");
        sb.append(this.a);
        sb.append(", mnc=");
        return dfi.i(sb, this.b, ')');
    }
}
