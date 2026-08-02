package com.yandex.passport.internal.links;

import android.net.Uri;
import com.yandex.passport.internal.l;
import defpackage.dfi;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class c extends e {
    public final Uri e;
    public final l f;
    public final String g;

    public c(Uri uri, l lVar, String str) {
        super(uri, lVar, h.c, str);
        this.e = uri;
        this.f = lVar;
        this.g = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.d(this.e, cVar.e) && Intrinsics.d(this.f, cVar.f) && Intrinsics.d(this.g, cVar.g);
    }

    public final int hashCode() {
        int hashCode = this.e.hashCode() * 31;
        l lVar = this.f;
        int hashCode2 = (hashCode + (lVar == null ? 0 : lVar.hashCode())) * 31;
        String str = this.g;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("QrWithoutQr(uri=");
        sb.append(this.e);
        sb.append(", account=");
        sb.append(this.f);
        sb.append(", browserName=");
        return dfi.i(sb, this.g, ')');
    }
}
