package com.yandex.plus.home.feature.webviews.internal.uri;

import android.net.Uri;
import defpackage.dfi;
import defpackage.k5r;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b extends j {
    public final Uri a;
    public final boolean b;
    public final String c;

    public b(Uri uri, boolean z, String str) {
        this.a = uri;
        this.b = z;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.a.equals(bVar.a) && this.b == bVar.b && Intrinsics.d(this.c, bVar.c);
    }

    public final int hashCode() {
        int e = k5r.e(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return e + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Home(url=");
        sb.append(this.a);
        sb.append(", isForceBuyPlus=");
        sb.append(this.b);
        sb.append(", message=");
        return dfi.i(sb, this.c, ')');
    }
}
