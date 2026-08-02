package com.yandex.plus.divkit.api;

import android.net.Uri;
import defpackage.dfi;
import defpackage.k5r;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class a {
    public final Uri a;
    public final JSONObject b;
    public final String c;
    public final String d;

    public a(Uri uri, JSONObject jSONObject, String str, String str2) {
        uri.getClass();
        str.getClass();
        this.a = uri;
        this.b = jSONObject;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.a, aVar.a) && Intrinsics.d(this.b, aVar.b) && Intrinsics.d(this.c, aVar.c) && Intrinsics.d(this.d, aVar.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        JSONObject jSONObject = this.b;
        int c = k5r.c((hashCode + (jSONObject == null ? 0 : jSONObject.hashCode())) * 31, 31, this.c);
        String str = this.d;
        return c + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlusDivAction(uri=");
        sb.append(this.a);
        sb.append(", payload=");
        sb.append(this.b);
        sb.append(", logId=");
        sb.append(this.c);
        sb.append(", uid=");
        return dfi.i(sb, this.d, ')');
    }
}
