package com.yandex.plus.home.feature.panel.internalapi.shortcuts.daily.progress;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a implements c {
    public final com.yandex.plus.core.gradient.api.e a;

    public a(com.yandex.plus.core.gradient.api.e eVar) {
        eVar.getClass();
        this.a = eVar;
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
        return "GradientDrawable(drawable=" + this.a + ')';
    }
}
