package com.yandex.plus.home.repository.api.model.panel;

import defpackage.eta;
import defpackage.k5r;
import java.util.List;

/* loaded from: classes5.dex */
public final class i {
    public final String a;
    public final String b;
    public final List c;

    public i(String str, String str2, List list) {
        this.a = str;
        this.b = str2;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.a.equals(iVar.a) && this.b.equals(iVar.b) && this.c.equals(iVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + k5r.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Panel(configId=");
        sb.append(this.a);
        sb.append(", configName=");
        sb.append(this.b);
        sb.append(", sections=");
        return eta.h(sb, this.c, ')');
    }
}
