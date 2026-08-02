package ru.yandex.taxi.widget.map;

import defpackage.jl40;
import defpackage.sls;

/* loaded from: classes6.dex */
public final class a {
    public final String a;
    public final sls b;

    public a(sls slsVar, String str) {
        this.a = str;
        this.b = slsVar;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return jl40.l(this.a, aVar.a) && this.b == aVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
