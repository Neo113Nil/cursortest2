package com.yandex.plus.core.graphql.fragment;

import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class hi {
    public final ArrayList a;
    public final fi b;

    public hi(ArrayList arrayList, fi fiVar) {
        this.a = arrayList;
        this.b = fiVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hi)) {
            return false;
        }
        hi hiVar = (hi) obj;
        return this.a.equals(hiVar.a) && this.b.equals(hiVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PlaqueRadialGradient(colors=" + this.a + ", centralPoint=" + this.b + ')';
    }
}
