package com.yandex.plus.bdui.plus.content.controller;

import defpackage.tf6;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class r {
    public final com.yandex.plus.bdui.content.d a;
    public final List b;
    public final tf6 c;

    public r(com.yandex.plus.bdui.content.d dVar, ArrayList arrayList, tf6 tf6Var) {
        dVar.getClass();
        this.a = dVar;
        this.b = arrayList;
        this.c = tf6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return Intrinsics.d(this.a, rVar.a) && Intrinsics.d(this.b, rVar.b) && this.c.equals(rVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        List list = this.b;
        return this.c.hashCode() + ((hashCode + (list == null ? 0 : list.hashCode())) * 31);
    }

    public final String toString() {
        return "UpdateHolder(update=" + this.a + ", variables=" + this.b + ", scope=" + this.c + ')';
    }
}
