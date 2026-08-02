package com.yandex.plus.bdui.flex.scaffold;

import defpackage.sro;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a extends sro {
    public final com.yandex.plus.bdui.plus.scaffold.a a;

    public a(com.yandex.plus.bdui.plus.scaffold.a aVar) {
        aVar.getClass();
        this.a = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && Intrinsics.d(this.a, ((a) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "FlexScaffold(plusScaffold=" + this.a + ')';
    }
}
