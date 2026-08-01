package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.List;

/* loaded from: classes2.dex */
public final class YA implements Serializable, XA {

    /* renamed from: n, reason: collision with root package name */
    public final List f28657n;

    @Override // com.google.android.gms.internal.ads.XA
    public final boolean a(Object obj) {
        int i = 0;
        while (true) {
            List list = this.f28657n;
            if (i >= list.size()) {
                return true;
            }
            if (!((XA) list.get(i)).a(obj)) {
                return false;
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof YA) {
            return this.f28657n.equals(((YA) obj).f28657n);
        }
        return false;
    }

    public final int hashCode() {
        return this.f28657n.hashCode() + 306654252;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Predicates.and(");
        boolean z3 = true;
        for (Object obj : this.f28657n) {
            if (!z3) {
                sb.append(',');
            }
            sb.append(obj);
            z3 = false;
        }
        sb.append(')');
        return sb.toString();
    }
}
