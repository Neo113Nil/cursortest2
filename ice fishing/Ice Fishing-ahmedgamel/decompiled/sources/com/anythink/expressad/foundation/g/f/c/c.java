package com.anythink.expressad.foundation.g.f.c;

import android.text.TextUtils;
import com.google.android.gms.internal.ads.Wv;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final String f20040a;

    /* renamed from: b, reason: collision with root package name */
    private final String f20041b;

    public c(String str, String str2) {
        this.f20040a = str;
        this.f20041b = str2;
    }

    public final String a() {
        return this.f20040a;
    }

    public final String b() {
        return this.f20041b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (TextUtils.equals(this.f20040a, cVar.f20040a) && TextUtils.equals(this.f20041b, cVar.f20041b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f20041b.hashCode() + (this.f20040a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Header[name=");
        sb.append(this.f20040a);
        sb.append(",value=");
        return Wv.i(sb, this.f20041b, "]");
    }
}
