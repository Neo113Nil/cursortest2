package com.yandex.passport.internal.storage.datastore;

import defpackage.f1d;
import defpackage.hmm;
import defpackage.q5b;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class f {
    public final hmm.a a;
    public final Object b;

    public f(hmm.a aVar, q5b q5bVar) {
        this.a = aVar;
        this.b = q5bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.a.equals(fVar.a) && Intrinsics.d(this.b, fVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.a.hashCode() * 31;
        Object obj = this.b;
        return hashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PreferenceRequest(key=");
        sb.append(this.a);
        sb.append(", defaultValue=");
        return f1d.j(sb, this.b, ')');
    }
}
