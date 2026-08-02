package com.yandex.plus.plaquesdk.plaque.api.models.display;

import defpackage.vz1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class x {
    public final b a;
    public final w b;
    public final int c;

    public x(b bVar, w wVar, int i) {
        bVar.getClass();
        this.a = bVar;
        this.b = wVar;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        if (!Intrinsics.d(this.a, xVar.a) || !this.b.equals(xVar.b)) {
            return false;
        }
        u uVar = u.a;
        return uVar.equals(uVar) && this.c == xVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + ((((this.b.hashCode() + (this.a.hashCode() * 31)) * 31) + 1718719672) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WidgetDisplaySettings(displaySettings=");
        sb.append(this.a);
        sb.append(", widthType=");
        sb.append(this.b);
        sb.append(", heightType=");
        sb.append(u.a);
        sb.append(", gravity=");
        return vz1.r(sb, this.c, ')');
    }
}
