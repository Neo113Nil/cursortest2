package com.yandex.plus.home.feature.webviews.internal.settings.model;

import defpackage.dfi;
import defpackage.k5r;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a {
    public final String a;
    public final boolean b;

    public a(String str, boolean z) {
        this.a = str;
        this.b = z;
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
        String str = this.a;
        return Boolean.hashCode(this.b) + k5r.e(k5r.e((str == null ? 0 : str.hashCode()) * 961, 31, false), 31, true);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BooleanSettingData(id=");
        sb.append(this.a);
        sb.append(", metricaName=null, isEnabled=false, isLocal=true, value=");
        return dfi.j(sb, this.b, ')');
    }
}
