package com.yandex.plus.bdui.plus.handler;

import com.yandex.plus.pay.internal.feature.counter_offers.f;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class d {
    public final String a;
    public final f b;

    public d(String str, f fVar) {
        str.getClass();
        this.a = str;
        this.b = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.d(this.a, dVar.a) && this.b.equals(dVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PlusDivHandlerDescriptor(type=" + this.a + ", handlerFactory=" + this.b + ')';
    }
}
