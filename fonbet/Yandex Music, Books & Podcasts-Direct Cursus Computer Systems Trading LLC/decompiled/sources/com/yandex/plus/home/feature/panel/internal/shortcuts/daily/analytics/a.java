package com.yandex.plus.home.feature.panel.internal.shortcuts.daily.analytics;

import defpackage.su4;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a {
    public final String a;

    public a(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && Intrinsics.d(this.a, ((a) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        return (str == null ? 0 : str.hashCode()) * 31;
    }

    public final String toString() {
        return su4.o(new StringBuilder("DailyAnalyticsParams(counterValue="), this.a, ", additionalParams=null)");
    }
}
