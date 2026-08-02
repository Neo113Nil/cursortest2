package com.yandex.plus.home.dailyquests.repository.rest.prefs;

import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class w {

    @NotNull
    public static final v Companion = new v();
    public final String a;
    public final t b;

    public /* synthetic */ w(int i, String str, t tVar) {
        if (3 != (i & 3)) {
            u7g.V(i, 3, u.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = tVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return Intrinsics.d(this.a, wVar.a) && Intrinsics.d(this.b, wVar.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        t tVar = this.b;
        return hashCode + (tVar != null ? tVar.hashCode() : 0);
    }

    public final String toString() {
        return "ToolbarPart(chainText=" + this.a + ", reward=" + this.b + ')';
    }

    public w(String str, t tVar) {
        this.a = str;
        this.b = tVar;
    }
}
