package com.yandex.plus.bdui.plus.webview;

import defpackage.vz1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class j implements k {
    public final g a;
    public final int b;

    public j(g gVar, int i) {
        gVar.getClass();
        this.a = gVar;
        this.b = i;
    }

    @Override // com.yandex.plus.bdui.plus.webview.k
    public final g a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Intrinsics.d(this.a, jVar.a) && this.b == jVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Retried(loadingResult=");
        sb.append(this.a);
        sb.append(", retriesCount=");
        return vz1.r(sb, this.b, ')');
    }
}
