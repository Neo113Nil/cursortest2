package com.yandex.plus.home.dailyquests.feature.api.model;

import defpackage.dfi;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a implements c {
    public final String a;
    public final String b;

    public a(String str, String str2) {
        str2.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.a, aVar.a) && Intrinsics.d(this.b, aVar.b);
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Deeplink(popupId=");
        sb.append(this.a);
        sb.append(", deeplink=");
        return dfi.i(sb, this.b, ')');
    }
}
