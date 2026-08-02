package com.yandex.plus.home.feature.webviews.internal.container;

import defpackage.f1d;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class i {
    public final int a;
    public final int b;
    public final com.yandex.plus.home.feature.webviews.internalapi.container.c c;
    public final Integer d;
    public final Boolean e;

    public i(int i, int i2, com.yandex.plus.home.feature.webviews.internalapi.container.c cVar, Integer num, Boolean bool) {
        this.a = i;
        this.b = i2;
        this.c = cVar;
        this.d = num;
        this.e = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.a == iVar.a && this.b == iVar.b && Intrinsics.d(this.c, iVar.c) && Intrinsics.d(this.d, iVar.d) && Intrinsics.d(this.e, iVar.e);
    }

    public final int hashCode() {
        int a = f1d.a(this.b, Integer.hashCode(this.a) * 31, 31);
        com.yandex.plus.home.feature.webviews.internalapi.container.c cVar = this.c;
        int hashCode = (a + (cVar == null ? 0 : cVar.hashCode())) * 31;
        Integer num = this.d;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.e;
        return hashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ModalViewOptions(hideThreshold=");
        sb.append(this.a);
        sb.append(", downwardScrollFriction=");
        sb.append(this.b);
        sb.append(", modalHeight=");
        sb.append(this.c);
        sb.append(", shadowAlpha=");
        sb.append(this.d);
        sb.append(", disableClose=");
        return com.appsflyer.internal.k.p(sb, this.e, ')');
    }
}
