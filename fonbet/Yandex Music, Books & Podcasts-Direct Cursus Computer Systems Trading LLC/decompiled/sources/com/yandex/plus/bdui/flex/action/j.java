package com.yandex.plus.bdui.flex.action;

import defpackage.md;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class j implements com.yandex.plus.bdui.action.a {
    public final md a;

    public j(md mdVar) {
        this.a = mdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && Intrinsics.d(this.a, ((j) obj).a);
    }

    public final int hashCode() {
        md mdVar = this.a;
        if (mdVar == null) {
            return 0;
        }
        return mdVar.hashCode();
    }

    public final String toString() {
        return "PlusAction(flexAction=" + this.a + ')';
    }
}
