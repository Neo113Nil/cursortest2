package com.yandex.plus.bdui.flex.ui;

import com.yandex.passport.internal.report.we;
import defpackage.i04;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class p {
    public final b a;
    public final com.yandex.plus.bdui.query.e b;
    public final com.yandex.plus.bdui.shared.b c;
    public final we d;
    public final i04 e;

    public p(b bVar, com.yandex.plus.bdui.query.e eVar, com.yandex.plus.bdui.shared.b bVar2, we weVar, i04 i04Var) {
        this.a = bVar;
        this.b = eVar;
        this.c = bVar2;
        this.d = weVar;
        this.e = i04Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.a.equals(pVar.a) && Intrinsics.d(this.b, pVar.b) && this.c.equals(pVar.c) && this.d.equals(pVar.d) && this.e.equals(pVar.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        com.yandex.plus.bdui.query.e eVar = this.b;
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((hashCode + (eVar == null ? 0 : eVar.hashCode())) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "PlusUiControllerUpdateTaskInfo(controllerInfo=" + this.a + ", query=" + this.b + ", baseShared=" + this.c + ", prepareUpdate=" + this.d + ", applyUpdate=" + this.e + ')';
    }
}
