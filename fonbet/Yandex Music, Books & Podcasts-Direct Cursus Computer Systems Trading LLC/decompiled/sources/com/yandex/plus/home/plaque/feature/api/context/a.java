package com.yandex.plus.home.plaque.feature.api.context;

import defpackage.e5b;
import defpackage.f1d;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a {
    public final Map a;
    public final Map b;
    public final Map c;

    public a(Map map, e5b e5bVar, e5b e5bVar2) {
        e5bVar.getClass();
        e5bVar2.getClass();
        this.a = map;
        this.b = e5bVar;
        this.c = e5bVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.a.equals(aVar.a) && Intrinsics.d(this.b, aVar.b) && Intrinsics.d(this.c, aVar.c);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + f1d.b(this.c, f1d.b(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "PlaqueExternalContext(conditionValues=" + this.a + ", templates=" + this.b + ", switchesStates=" + this.c + ", defaultSwitchState=false)";
    }
}
