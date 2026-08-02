package com.yandex.plus.bdui.plus.content.controller;

import android.view.ViewGroup;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class e {
    public final ViewGroup a;
    public final com.yandex.plus.divkit.impl.p b;
    public final com.yandex.plus.divkit.impl.r c;

    public e(ViewGroup viewGroup, com.yandex.plus.divkit.impl.p pVar, com.yandex.plus.divkit.impl.r rVar) {
        viewGroup.getClass();
        this.a = viewGroup;
        this.b = pVar;
        this.c = rVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.d(this.a, eVar.a) && this.b.equals(eVar.b) && this.c.equals(eVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "DivHolder(container=" + this.a + ", variableController=" + this.b + ", viewController=" + this.c + ')';
    }
}
