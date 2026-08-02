package com.yandex.passport.internal.ui.bouncer.chooser;

import com.yandex.passport.internal.ui.bouncer.model.j2;
import defpackage.f1d;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class w {
    public final List a;
    public final com.yandex.passport.common.core.f b;
    public final j2 c;
    public final Throwable d;

    public w(List list, com.yandex.passport.common.core.f fVar, j2 j2Var, Throwable th) {
        this.a = list;
        this.b = fVar;
        this.c = j2Var;
        this.d = th;
    }

    public static w a(w wVar, List list, com.yandex.passport.common.core.f fVar, j2 j2Var, Throwable th, int i) {
        if ((i & 1) != 0) {
            list = wVar.a;
        }
        if ((i & 2) != 0) {
            fVar = wVar.b;
        }
        if ((i & 4) != 0) {
            j2Var = wVar.c;
        }
        if ((i & 8) != 0) {
            th = wVar.d;
        }
        wVar.getClass();
        return new w(list, fVar, j2Var, th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return Intrinsics.d(this.a, wVar.a) && Intrinsics.d(this.b, wVar.b) && Intrinsics.d(this.c, wVar.c) && Intrinsics.d(this.d, wVar.d);
    }

    public final int hashCode() {
        List list = this.a;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        com.yandex.passport.common.core.f fVar = this.b;
        int hashCode2 = (hashCode + (fVar == null ? 0 : fVar.hashCode())) * 31;
        j2 j2Var = this.c;
        int hashCode3 = (hashCode2 + (j2Var == null ? 0 : j2Var.hashCode())) * 31;
        Throwable th = this.d;
        return hashCode3 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("State(masterChooserItems=");
        sb.append(this.a);
        sb.append(", selectedMasterUid=");
        sb.append(this.b);
        sb.append(", createProfileData=");
        sb.append(this.c);
        sb.append(", error=");
        return f1d.k(sb, this.d, ')');
    }
}
