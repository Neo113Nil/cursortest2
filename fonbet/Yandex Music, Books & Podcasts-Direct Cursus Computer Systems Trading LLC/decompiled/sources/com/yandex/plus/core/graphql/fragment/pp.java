package com.yandex.plus.core.graphql.fragment;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class pp {
    public final String a;
    public final mp b;
    public final np c;
    public final op d;

    public pp(String str, mp mpVar, np npVar, op opVar) {
        str.getClass();
        this.a = str;
        this.b = mpVar;
        this.c = npVar;
        this.d = opVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pp)) {
            return false;
        }
        pp ppVar = (pp) obj;
        return Intrinsics.d(this.a, ppVar.a) && Intrinsics.d(this.b, ppVar.b) && Intrinsics.d(this.c, ppVar.c) && Intrinsics.d(this.d, ppVar.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        mp mpVar = this.b;
        int hashCode2 = (hashCode + (mpVar == null ? 0 : mpVar.a.hashCode())) * 31;
        np npVar = this.c;
        int hashCode3 = (hashCode2 + (npVar == null ? 0 : npVar.a.hashCode())) * 31;
        op opVar = this.d;
        return hashCode3 + (opVar != null ? Integer.hashCode(opVar.a) : 0);
    }

    public final String toString() {
        return "WidgetGroupWidth(__typename=" + this.a + ", onFillWidth=" + this.b + ", onFitWidth=" + this.c + ", onFixWidth=" + this.d + ')';
    }
}
