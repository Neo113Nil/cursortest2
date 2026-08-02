package com.yandex.plus.core.graphql.fragment;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class hp {
    public final String a;
    public final gp b;
    public final fp c;
    public final ep d;

    public hp(String str, gp gpVar, fp fpVar, ep epVar) {
        str.getClass();
        this.a = str;
        this.b = gpVar;
        this.c = fpVar;
        this.d = epVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hp)) {
            return false;
        }
        hp hpVar = (hp) obj;
        return Intrinsics.d(this.a, hpVar.a) && Intrinsics.d(this.b, hpVar.b) && Intrinsics.d(this.c, hpVar.c) && Intrinsics.d(this.d, hpVar.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        gp gpVar = this.b;
        int hashCode2 = (hashCode + (gpVar == null ? 0 : gpVar.a.hashCode())) * 31;
        fp fpVar = this.c;
        int hashCode3 = (hashCode2 + (fpVar == null ? 0 : fpVar.a.hashCode())) * 31;
        ep epVar = this.d;
        return hashCode3 + (epVar != null ? epVar.hashCode() : 0);
    }

    public final String toString() {
        return "TypedWidgetGroupProperties(__typename=" + this.a + ", onRowCrossWidgetGroupProperties=" + this.b + ", onColumnCrossWidgetGroupProperties=" + this.c + ", onBoxCrossWidgetGroupProperties=" + this.d + ')';
    }
}
