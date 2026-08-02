package com.yandex.plus.home.feature.panel.internal.shortcuts.lite.family;

import defpackage.k5r;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g {
    public final String a;
    public final com.yandex.plus.core.theme.c b;
    public final Map c;

    public g(String str, com.yandex.plus.core.theme.c cVar, Map map) {
        str.getClass();
        this.a = str;
        this.b = cVar;
        this.c = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Intrinsics.d(this.a, gVar.a) && this.b.equals(gVar.b) && Intrinsics.d(this.c, gVar.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        Map map = this.c;
        return hashCode + (map == null ? 0 : map.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SubtitleContent(subtitle=");
        sb.append(this.a);
        sb.append(", subtitleDrawableHolder=");
        sb.append(this.b);
        sb.append(", pluralForms=");
        return k5r.p(sb, this.c, ')');
    }
}
