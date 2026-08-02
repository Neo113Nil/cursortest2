package com.yandex.plus.core.graphql;

import defpackage.k5r;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class h0 {
    public final String a;
    public final String b;
    public final ArrayList c;

    public h0(String str, String str2, ArrayList arrayList) {
        this.a = str;
        this.b = str2;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return this.a.equals(h0Var.a) && this.b.equals(h0Var.b) && this.c.equals(h0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + k5r.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UpsaleComposites(offersBatchIdUpsale=");
        sb.append(this.a);
        sb.append(", eventSessionId=");
        sb.append(this.b);
        sb.append(", upsales=");
        return k5r.o(sb, this.c, ')');
    }
}
