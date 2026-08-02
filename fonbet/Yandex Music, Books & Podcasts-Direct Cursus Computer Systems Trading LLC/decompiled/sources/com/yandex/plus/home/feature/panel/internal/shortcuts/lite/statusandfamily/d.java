package com.yandex.plus.home.feature.panel.internal.shortcuts.lite.statusandfamily;

import com.yandex.plus.core.data.common.k;
import defpackage.dfi;
import defpackage.f1d;
import defpackage.k5r;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d {
    public final String a;
    public final com.yandex.plus.core.theme.c b;
    public final k c;
    public final k d;
    public final int e;
    public final com.yandex.plus.home.feature.panel.internal.shortcuts.lite.family.a f;
    public final String g;
    public final String h;

    public d(String str, com.yandex.plus.core.theme.c cVar, k kVar, k kVar2, int i, com.yandex.plus.home.feature.panel.internal.shortcuts.lite.family.a aVar, String str2, String str3) {
        str.getClass();
        this.a = str;
        this.b = cVar;
        this.c = kVar;
        this.d = kVar2;
        this.e = i;
        this.f = aVar;
        this.g = str2;
        this.h = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.d(this.a, dVar.a) && this.b.equals(dVar.b) && Intrinsics.d(this.c, dVar.c) && Intrinsics.d(this.d, dVar.d) && this.e == dVar.e && Intrinsics.d(this.f, dVar.f) && this.g.equals(dVar.g) && this.h.equals(dVar.h);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        k kVar = this.c;
        int hashCode2 = (hashCode + (kVar == null ? 0 : kVar.hashCode())) * 31;
        k kVar2 = this.d;
        int a = f1d.a(this.e, (hashCode2 + (kVar2 == null ? 0 : kVar2.hashCode())) * 31, 31);
        com.yandex.plus.home.feature.panel.internal.shortcuts.lite.family.a aVar = this.f;
        return this.h.hashCode() + k5r.c((a + (aVar != null ? aVar.hashCode() : 0)) * 31, 31, this.g);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StatusAndFamilyViewContent(title=");
        sb.append(this.a);
        sb.append(", titleDrawableHolder=");
        sb.append(this.b);
        sb.append(", arrowIconColor=");
        sb.append(this.c);
        sb.append(", backgroundColor=");
        sb.append(this.d);
        sb.append(", defaultBackgroundColor=");
        sb.append(this.e);
        sb.append(", addInFamilyViewContent=");
        sb.append(this.f);
        sb.append(", statusContentDescription=");
        sb.append(this.g);
        sb.append(", familyContentDescription=");
        return dfi.i(sb, this.h, ')');
    }
}
