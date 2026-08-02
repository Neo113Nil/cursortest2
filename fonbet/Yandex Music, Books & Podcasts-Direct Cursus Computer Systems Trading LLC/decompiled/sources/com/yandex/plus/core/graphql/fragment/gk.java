package com.yandex.plus.core.graphql.fragment;

import defpackage.dfi;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class gk {
    public final String a;
    public final ArrayList b;
    public final dk c;
    public final fk d;
    public final ek e;
    public final ck f;

    public gk(String str, ArrayList arrayList, dk dkVar, fk fkVar, ek ekVar, ck ckVar) {
        this.a = str;
        this.b = arrayList;
        this.c = dkVar;
        this.d = fkVar;
        this.e = ekVar;
        this.f = ckVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gk)) {
            return false;
        }
        gk gkVar = (gk) obj;
        return this.a.equals(gkVar.a) && this.b.equals(gkVar.b) && this.c.equals(gkVar.c) && this.d.equals(gkVar.d) && Intrinsics.d(this.e, gkVar.e) && Intrinsics.d(this.f, gkVar.f);
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + ((this.c.hashCode() + dfi.b(this.b, this.a.hashCode() * 31, 31)) * 31)) * 31;
        ek ekVar = this.e;
        int hashCode2 = (hashCode + (ekVar == null ? 0 : ekVar.hashCode())) * 31;
        ck ckVar = this.f;
        return hashCode2 + (ckVar != null ? ckVar.hashCode() : 0);
    }

    public final String toString() {
        return "PlaqueWidgetGroup(widgetGroupId=" + this.a + ", widgets=" + this.b + ", groupDisplayRules=" + this.c + ", typedProperties=" + this.d + ", strictAction=" + this.e + ", contentDescription=" + this.f + ')';
    }
}
