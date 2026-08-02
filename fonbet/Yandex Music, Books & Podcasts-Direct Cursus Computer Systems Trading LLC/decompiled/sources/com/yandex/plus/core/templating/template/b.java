package com.yandex.plus.core.templating.template;

import defpackage.ouj;

/* loaded from: classes4.dex */
public final class b implements d {
    public final String a;

    public /* synthetic */ b(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return this.a.equals(((b) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ouj.k(')', "Text(text=", this.a);
    }
}
