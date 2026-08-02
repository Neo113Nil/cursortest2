package com.yandex.plus.home.feature.panel.internal.shortcuts.daily.bottom;

import android.graphics.drawable.RippleDrawable;
import android.view.View;
import com.yandex.plus.home.feature.panel.internal.shortcuts.daily.e;
import com.yandex.plus.home.feature.panel.internal.shortcuts.daily.f;
import defpackage.k5r;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a {
    public final RippleDrawable a;
    public final f b;
    public final f c;
    public final View.OnClickListener d;
    public final f e;
    public final List f;
    public final com.yandex.plus.home.feature.panel.internal.shortcuts.daily.d g;
    public final String h;
    public final e i;
    public final e j;

    public a(RippleDrawable rippleDrawable, f fVar, f fVar2, View.OnClickListener onClickListener, f fVar3, List list, com.yandex.plus.home.feature.panel.internal.shortcuts.daily.d dVar, String str, e eVar, e eVar2) {
        rippleDrawable.getClass();
        fVar.getClass();
        str.getClass();
        this.a = rippleDrawable;
        this.b = fVar;
        this.c = fVar2;
        this.d = onClickListener;
        this.e = fVar3;
        this.f = list;
        this.g = dVar;
        this.h = str;
        this.i = eVar;
        this.j = eVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.a, aVar.a) && Intrinsics.d(this.b, aVar.b) && Intrinsics.d(this.c, aVar.c) && Intrinsics.d(this.d, aVar.d) && Intrinsics.d(this.e, aVar.e) && Intrinsics.d(this.f, aVar.f) && Intrinsics.d(this.g, aVar.g) && Intrinsics.d(this.h, aVar.h) && Intrinsics.d(this.i, aVar.i) && Intrinsics.d(this.j, aVar.j);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        f fVar = this.c;
        int hashCode2 = (hashCode + (fVar == null ? 0 : fVar.hashCode())) * 31;
        View.OnClickListener onClickListener = this.d;
        int hashCode3 = (hashCode2 + (onClickListener == null ? 0 : onClickListener.hashCode())) * 31;
        f fVar2 = this.e;
        int hashCode4 = (hashCode3 + (fVar2 == null ? 0 : fVar2.hashCode())) * 31;
        List list = this.f;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        com.yandex.plus.home.feature.panel.internal.shortcuts.daily.d dVar = this.g;
        int c = k5r.c((hashCode5 + (dVar == null ? 0 : dVar.hashCode())) * 31, 31, this.h);
        e eVar = this.i;
        int hashCode6 = (c + (eVar == null ? 0 : eVar.hashCode())) * 31;
        e eVar2 = this.j;
        return hashCode6 + (eVar2 != null ? eVar2.hashCode() : 0);
    }

    public final String toString() {
        return "DailyBottomContent(background=" + this.a + ", title=" + this.b + ", subtitle=" + this.c + ", rootClickListener=" + this.d + ", description=" + this.e + ", serviceUrls=" + this.f + ", button=" + this.g + ", contentDescription=" + this.h + ", leftConfettiContent=" + this.i + ", rightConfettiContent=" + this.j + ')';
    }
}
