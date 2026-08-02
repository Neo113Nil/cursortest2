package com.yandex.plus.core.network.request;

import android.net.Uri;
import com.yandex.plus.core.insets.d;
import defpackage.hlr;
import defpackage.k5r;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b {
    public final Uri a;
    public final d b;
    public final a c;
    public final com.yandex.plus.core.network.content.a d;
    public final Object e;

    public b(Uri uri, d dVar, a aVar, com.yandex.plus.core.network.content.a aVar2, Object obj) {
        uri.getClass();
        aVar2.getClass();
        this.a = uri;
        this.b = dVar;
        this.c = aVar;
        this.d = aVar2;
        this.e = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.a, bVar.a) && this.b.equals(bVar.b) && this.c.equals(bVar.c) && Intrinsics.d(this.d, bVar.d) && Intrinsics.d(this.e, bVar.e);
    }

    public final int hashCode() {
        int c = k5r.c(k5r.c((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c.a), 31, this.d.a);
        Object obj = this.e;
        return c + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return hlr.d("\n            Request uri: " + this.a + "\n            Method: " + this.c + "\n            \n            Headers:\n            " + this.b + "\n        ");
    }
}
