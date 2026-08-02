package com.yandex.plus.home.feature.panel.internal.shortcuts.lite.family;

import com.yandex.plus.core.data.common.k;
import defpackage.f1d;
import defpackage.k5r;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b {
    public final String a;
    public final String b;
    public final com.yandex.plus.core.theme.c c;
    public final com.yandex.plus.core.theme.c d;
    public final k e;
    public final k f;
    public final int g;
    public final a h;
    public final Map i;

    public b(String str, String str2, com.yandex.plus.core.theme.c cVar, com.yandex.plus.core.theme.c cVar2, k kVar, k kVar2, int i, a aVar, Map map) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = cVar;
        this.d = cVar2;
        this.e = kVar;
        this.f = kVar2;
        this.g = i;
        this.h = aVar;
        this.i = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.a, bVar.a) && Intrinsics.d(this.b, bVar.b) && this.c.equals(bVar.c) && this.d.equals(bVar.d) && Intrinsics.d(this.e, bVar.e) && Intrinsics.d(this.f, bVar.f) && this.g == bVar.g && Intrinsics.d(this.h, bVar.h) && Intrinsics.d(this.i, bVar.i);
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + ((this.c.hashCode() + k5r.c(this.a.hashCode() * 31, 31, this.b)) * 31)) * 31;
        k kVar = this.e;
        int hashCode2 = (hashCode + (kVar == null ? 0 : kVar.hashCode())) * 31;
        k kVar2 = this.f;
        int a = f1d.a(this.g, (hashCode2 + (kVar2 == null ? 0 : kVar2.hashCode())) * 31, 31);
        a aVar = this.h;
        int hashCode3 = (a + (aVar == null ? 0 : aVar.hashCode())) * 31;
        Map map = this.i;
        return hashCode3 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FamilyViewContent(title=");
        sb.append(this.a);
        sb.append(", subtitle=");
        sb.append(this.b);
        sb.append(", titleDrawableHolder=");
        sb.append(this.c);
        sb.append(", subtitleDrawableHolder=");
        sb.append(this.d);
        sb.append(", arrowIconColor=");
        sb.append(this.e);
        sb.append(", backgroundPlusColor=");
        sb.append(this.f);
        sb.append(", defaultBackgroundColor=");
        sb.append(this.g);
        sb.append(", addInFamilyViewContent=");
        sb.append(this.h);
        sb.append(", subtitlePluralForms=");
        return k5r.p(sb, this.i, ')');
    }
}
