package com.yandex.plus.home.feature.panel.internal.shortcuts.daily.mapper;

import defpackage.dfi;
import defpackage.k5r;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e extends com.yandex.plus.bdui.plus.analytics.b {
    public final String a;
    public final String b;
    public final String c;

    public e(String str, String str2, String str3) {
        dfi.s(str, str2, str3);
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.d(this.a, eVar.a) && Intrinsics.d(this.b, eVar.b) && Intrinsics.d(this.c, eVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + k5r.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Icon(placeholderId=");
        sb.append(this.a);
        sb.append(", url=");
        sb.append(this.b);
        sb.append(", fallbackText=");
        return dfi.i(sb, this.c, ')');
    }
}
