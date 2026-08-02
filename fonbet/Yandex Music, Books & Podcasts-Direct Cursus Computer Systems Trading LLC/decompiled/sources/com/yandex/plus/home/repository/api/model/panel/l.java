package com.yandex.plus.home.repository.api.model.panel;

import defpackage.dfi;
import defpackage.k5r;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class l implements n {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final boolean g;

    public l(String str, String str2, String str3, String str4, String str5, String str6, boolean z, int i) {
        str3 = (i & 4) != 0 ? null : str3;
        str5 = (i & 16) != 0 ? null : str5;
        str6.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return Intrinsics.d(this.a, lVar.a) && Intrinsics.d(this.b, lVar.b) && Intrinsics.d(this.c, lVar.c) && this.d.equals(lVar.d) && Intrinsics.d(this.e, lVar.e) && Intrinsics.d(this.f, lVar.f) && this.g == lVar.g;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int c = k5r.c((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.d);
        String str4 = this.e;
        return Boolean.hashCode(this.g) + k5r.c((c + (str4 != null ? str4.hashCode() : 0)) * 961, 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InvalidProperty(widgetType=");
        sb.append(this.a);
        sb.append(", shortcutId=");
        sb.append(this.b);
        sb.append(", overlayShape=");
        sb.append(this.c);
        sb.append(", name=");
        sb.append(this.d);
        sb.append(", value=");
        sb.append(this.e);
        sb.append(", itemsCount=null, parentTypeName=");
        sb.append(this.f);
        sb.append(", isLight=");
        return dfi.j(sb, this.g, ')');
    }
}
