package com.yandex.plus.core.templating.template;

import defpackage.lm4;
import defpackage.yct;

/* loaded from: classes4.dex */
public final class l {
    public final lm4 a;
    public final Class b;
    public final yct c;

    public l(lm4 lm4Var, Class cls, yct yctVar) {
        this.a = lm4Var;
        this.b = cls;
        this.c = yctVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.a.equals(lVar.a) && this.b.equals(lVar.b) && this.c.equals(lVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "TypeInfo(klass=" + this.a + ", clazz=" + this.b + ", type=" + this.c + ')';
    }
}
