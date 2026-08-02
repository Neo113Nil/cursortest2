package com.yandex.plus.home.plaque.plugin.internal.di;

import com.yandex.plus.home.t;
import defpackage.c5b;
import defpackage.eta;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d {
    public final t a;
    public final List b;

    public d(t tVar, c5b c5bVar) {
        c5bVar.getClass();
        this.a = tVar;
        this.b = c5bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.a.equals(dVar.a) && Intrinsics.d(this.b, dVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 961);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PluginDependenciesModule(sdkInternal=");
        sb.append(this.a);
        sb.append(", typefaceProvider=null, supportedFeatures=");
        return eta.h(sb, this.b, ')');
    }
}
