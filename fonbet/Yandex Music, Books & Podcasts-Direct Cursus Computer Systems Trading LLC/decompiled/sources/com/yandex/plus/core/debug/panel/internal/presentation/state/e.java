package com.yandex.plus.core.debug.panel.internal.presentation.state;

import defpackage.f1d;
import defpackage.k5r;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class e {
    public final List a;
    public final int b;
    public final boolean c;
    public final com.yandex.plus.core.debug.panel.internal.model.log.d d;

    public e(List list, int i, boolean z, com.yandex.plus.core.debug.panel.internal.model.log.d dVar) {
        list.getClass();
        this.a = list;
        this.b = i;
        this.c = z;
        this.d = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.d(this.a, eVar.a) && this.b == eVar.b && this.c == eVar.c && Intrinsics.d(this.d, eVar.d);
    }

    public final int hashCode() {
        int e = k5r.e(f1d.a(this.b, this.a.hashCode() * 31, 31), 31, this.c);
        com.yandex.plus.core.debug.panel.internal.model.log.d dVar = this.d;
        return e + (dVar == null ? 0 : dVar.hashCode());
    }

    public final String toString() {
        return "LogsScreenUiState(logs=" + this.a + ", targetIndex=" + this.b + ", isMatchButtonsEnabled=" + this.c + ", dialogState=" + this.d + ')';
    }
}
