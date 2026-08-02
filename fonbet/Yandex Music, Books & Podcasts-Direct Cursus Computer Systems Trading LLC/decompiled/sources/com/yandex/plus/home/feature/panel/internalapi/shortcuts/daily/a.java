package com.yandex.plus.home.feature.panel.internalapi.shortcuts.daily;

import defpackage.vz1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a {
    public final com.yandex.plus.core.data.common.k a;
    public final int b;

    public a(com.yandex.plus.core.data.common.k kVar, int i) {
        this.a = kVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.a, aVar.a) && this.b == aVar.b;
    }

    public final int hashCode() {
        com.yandex.plus.core.data.common.k kVar = this.a;
        return Integer.hashCode(this.b) + ((kVar == null ? 0 : kVar.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackgroundProperties(plusColor=");
        sb.append(this.a);
        sb.append(", defaultColorInt=");
        return vz1.r(sb, this.b, ')');
    }
}
