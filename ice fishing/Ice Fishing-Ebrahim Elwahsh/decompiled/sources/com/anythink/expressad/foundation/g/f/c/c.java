package com.anythink.expressad.foundation.g.f.c;

import android.text.TextUtils;
import t0.AbstractC5051n;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final String f19411a;

    /* renamed from: b, reason: collision with root package name */
    private final String f19412b;

    public c(String str, String str2) {
        this.f19411a = str;
        this.f19412b = str2;
    }

    public final String a() {
        return this.f19411a;
    }

    public final String b() {
        return this.f19412b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (TextUtils.equals(this.f19411a, cVar.f19411a) && TextUtils.equals(this.f19412b, cVar.f19412b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f19412b.hashCode() + (this.f19411a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Header[name=");
        sb.append(this.f19411a);
        sb.append(",value=");
        return AbstractC5051n.g(sb, this.f19412b, "]");
    }
}
