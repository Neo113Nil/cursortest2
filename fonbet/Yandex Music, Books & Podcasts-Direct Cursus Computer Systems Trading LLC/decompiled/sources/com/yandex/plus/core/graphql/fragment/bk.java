package com.yandex.plus.core.graphql.fragment;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class bk {
    public final String a;
    public final vj b;
    public final List c;
    public final yj d;
    public final wj e;
    public final com.yandex.plus.core.graphql.type.e1 f;
    public final ak g;
    public final tj h;
    public final uj i;
    public final zj j;
    public final xj k;

    public bk(String str, vj vjVar, List list, yj yjVar, wj wjVar, com.yandex.plus.core.graphql.type.e1 e1Var, ak akVar, tj tjVar, uj ujVar, zj zjVar, xj xjVar) {
        this.a = str;
        this.b = vjVar;
        this.c = list;
        this.d = yjVar;
        this.e = wjVar;
        this.f = e1Var;
        this.g = akVar;
        this.h = tjVar;
        this.i = ujVar;
        this.j = zjVar;
        this.k = xjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bk)) {
            return false;
        }
        bk bkVar = (bk) obj;
        return this.a.equals(bkVar.a) && Intrinsics.d(this.b, bkVar.b) && Intrinsics.d(this.c, bkVar.c) && Intrinsics.d(this.d, bkVar.d) && this.e.equals(bkVar.e) && this.f == bkVar.f && Intrinsics.d(this.g, bkVar.g) && Intrinsics.d(this.h, bkVar.h) && Intrinsics.d(this.i, bkVar.i) && Intrinsics.d(this.j, bkVar.j) && Intrinsics.d(this.k, bkVar.k);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        vj vjVar = this.b;
        int hashCode2 = (hashCode + (vjVar == null ? 0 : vjVar.hashCode())) * 31;
        List list = this.c;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        yj yjVar = this.d;
        int hashCode4 = (this.f.hashCode() + ((this.e.hashCode() + ((hashCode3 + (yjVar == null ? 0 : yjVar.hashCode())) * 31)) * 31)) * 31;
        ak akVar = this.g;
        int hashCode5 = (hashCode4 + (akVar == null ? 0 : akVar.hashCode())) * 31;
        tj tjVar = this.h;
        int hashCode6 = (hashCode5 + (tjVar == null ? 0 : tjVar.hashCode())) * 31;
        uj ujVar = this.i;
        int hashCode7 = (hashCode6 + (ujVar == null ? 0 : ujVar.hashCode())) * 31;
        zj zjVar = this.j;
        int hashCode8 = (hashCode7 + (zjVar == null ? 0 : zjVar.hashCode())) * 31;
        xj xjVar = this.k;
        return hashCode8 + (xjVar != null ? xjVar.hashCode() : 0);
    }

    public final String toString() {
        return "PlaqueWidget(widgetId=" + this.a + ", contentDescription=" + this.b + ", templates=" + this.c + ", strictAction=" + this.d + ", displayWidgetRules=" + this.e + ", type=" + this.f + ", textWidget=" + this.g + ", balanceWidget=" + this.h + ", buttonWidget=" + this.i + ", switchWidget=" + this.j + ", iconWidget=" + this.k + ')';
    }
}
