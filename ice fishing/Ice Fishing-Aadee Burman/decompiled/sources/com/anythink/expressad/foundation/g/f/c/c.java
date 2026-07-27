package com.anythink.expressad.foundation.g.f.c;

import android.text.TextUtils;
import u1.h;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final String f19253a;

    /* renamed from: b, reason: collision with root package name */
    private final String f19254b;

    public c(String str, String str2) {
        this.f19253a = str;
        this.f19254b = str2;
    }

    public final String a() {
        return this.f19253a;
    }

    public final String b() {
        return this.f19254b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (TextUtils.equals(this.f19253a, cVar.f19253a) && TextUtils.equals(this.f19254b, cVar.f19254b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f19254b.hashCode() + (this.f19253a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Header[name=");
        sb.append(this.f19253a);
        sb.append(",value=");
        return h.g(sb, this.f19254b, "]");
    }
}
