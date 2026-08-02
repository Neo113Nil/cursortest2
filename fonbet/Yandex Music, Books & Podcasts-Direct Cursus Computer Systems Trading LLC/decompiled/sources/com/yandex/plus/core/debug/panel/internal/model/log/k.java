package com.yandex.plus.core.debug.panel.internal.model.log;

import defpackage.k5r;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class k implements com.yandex.plus.core.debug.panel.internal.model.ui.b {
    public final String a;
    public final String b;
    public final j c;

    public k(String str, String str2, j jVar) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = jVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return Intrinsics.d(this.a, kVar.a) && Intrinsics.d(this.b, kVar.b) && this.c.equals(kVar.c);
    }

    @Override // com.yandex.plus.core.debug.panel.internal.model.ui.b
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return this.c.hashCode() + k5r.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "LogModel(id=" + this.a + ", title=" + this.b + ", details=" + this.c + ')';
    }
}
