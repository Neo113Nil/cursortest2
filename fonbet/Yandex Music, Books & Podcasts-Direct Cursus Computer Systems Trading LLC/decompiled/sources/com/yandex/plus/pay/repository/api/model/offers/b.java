package com.yandex.plus.pay.repository.api.model.offers;

import defpackage.dfi;
import defpackage.k5r;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b {
    public final String a;
    public final String b;
    public final ArrayList c;
    public final List d;
    public final m0 e;

    public b(String str, String str2, ArrayList arrayList, List list, m0 m0Var) {
        list.getClass();
        this.a = str;
        this.b = str2;
        this.c = arrayList;
        this.d = list;
        this.e = m0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.a.equals(bVar.a) && this.b.equals(bVar.b) && this.c.equals(bVar.c) && Intrinsics.d(this.d, bVar.d) && Intrinsics.d(this.e, bVar.e);
    }

    public final int hashCode() {
        int d = k5r.d(dfi.b(this.c, k5r.c(this.a.hashCode() * 31, 31, this.b), 31), 31, this.d);
        m0 m0Var = this.e;
        return d + (m0Var == null ? 0 : m0Var.hashCode());
    }

    public final String toString() {
        return "AdditionalOffers(eventSessionId=" + this.a + ", title=" + this.b + ", offers=" + this.c + ", passedUpsaleSteps=" + this.d + ", offerSwitchToggle=" + this.e + ')';
    }
}
