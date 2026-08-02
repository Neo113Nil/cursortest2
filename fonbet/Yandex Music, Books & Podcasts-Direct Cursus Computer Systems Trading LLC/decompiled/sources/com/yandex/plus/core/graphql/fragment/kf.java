package com.yandex.plus.core.graphql.fragment;

import defpackage.dfi;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class kf {
    public final jf a;
    public final ArrayList b;
    public final hf c;

    public kf(jf jfVar, ArrayList arrayList, hf hfVar) {
        this.a = jfVar;
        this.b = arrayList;
        this.c = hfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kf)) {
            return false;
        }
        kf kfVar = (kf) obj;
        return this.a.equals(kfVar.a) && this.b.equals(kfVar.b) && this.c.equals(kfVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + dfi.b(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "PlaqueDisplayRules(indentRules=" + this.a + ", backgroundColorSettings=" + this.b + ", backgroundShapeSettings=" + this.c + ')';
    }
}
