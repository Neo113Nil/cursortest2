package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.List;

/* loaded from: classes2.dex */
public final class YA implements Serializable, XA {

    /* renamed from: n, reason: collision with root package name */
    public final List f29434n;

    @Override // com.google.android.gms.internal.ads.XA
    public final boolean a(Object obj) {
        int i = 0;
        while (true) {
            List list = this.f29434n;
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
            return this.f29434n.equals(((YA) obj).f29434n);
        }
        return false;
    }

    public final int hashCode() {
        return this.f29434n.hashCode() + 306654252;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Predicates.and(");
        boolean z6 = true;
        for (Object obj : this.f29434n) {
            if (!z6) {
                sb.append(',');
            }
            sb.append(obj);
            z6 = false;
        }
        sb.append(')');
        return sb.toString();
    }
}
