package com.yandex.plus.core.graphql;

import defpackage.k5r;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class z {
    public final String a;
    public final String b;
    public final y c;

    public z(String str, String str2, y yVar) {
        this.a = str;
        this.b = str2;
        this.c = yVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return this.a.equals(zVar.a) && this.b.equals(zVar.b) && Intrinsics.d(this.c, zVar.c);
    }

    public final int hashCode() {
        int c = k5r.c(this.a.hashCode() * 31, 31, this.b);
        y yVar = this.c;
        return c + (yVar == null ? 0 : yVar.hashCode());
    }

    public final String toString() {
        return "WidgetUrls(lightTheme=" + this.a + ", darkTheme=" + this.b + ", widgetPollingParameters=" + this.c + ')';
    }
}
