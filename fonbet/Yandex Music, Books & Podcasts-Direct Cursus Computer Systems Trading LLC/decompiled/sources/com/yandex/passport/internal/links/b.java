package com.yandex.passport.internal.links;

import android.net.Uri;
import com.yandex.passport.internal.l;
import defpackage.dfi;
import defpackage.k5r;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b extends e {
    public final Uri e;
    public final l f;
    public final String g;
    public final String h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Uri uri, l lVar, String str, String str2) {
        super(uri, lVar, h.d, str2);
        uri.getClass();
        str.getClass();
        this.e = uri;
        this.f = lVar;
        this.g = str;
        this.h = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.e, bVar.e) && Intrinsics.d(this.f, bVar.f) && Intrinsics.d(this.g, bVar.g) && Intrinsics.d(this.h, bVar.h);
    }

    public final int hashCode() {
        int hashCode = this.e.hashCode() * 31;
        l lVar = this.f;
        int c = k5r.c((hashCode + (lVar == null ? 0 : lVar.hashCode())) * 31, 31, this.g);
        String str = this.h;
        return c + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PayUrl(uri=");
        sb.append(this.e);
        sb.append(", account=");
        sb.append(this.f);
        sb.append(", paySessionId=");
        sb.append(this.g);
        sb.append(", browserName=");
        return dfi.i(sb, this.h, ')');
    }
}
