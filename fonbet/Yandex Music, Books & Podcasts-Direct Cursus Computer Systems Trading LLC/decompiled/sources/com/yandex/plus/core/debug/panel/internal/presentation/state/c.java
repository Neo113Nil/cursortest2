package com.yandex.plus.core.debug.panel.internal.presentation.state;

import defpackage.vdr;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class c implements d {
    public final vdr a;

    public c(vdr vdrVar) {
        vdrVar.getClass();
        this.a = vdrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && Intrinsics.d(this.a, ((c) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ShowLogsState(logsFlow=" + this.a + ')';
    }
}
