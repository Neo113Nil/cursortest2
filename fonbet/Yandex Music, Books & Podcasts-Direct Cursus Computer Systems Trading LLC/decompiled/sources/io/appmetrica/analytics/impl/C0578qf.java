package io.appmetrica.analytics.impl;

import defpackage.fai;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: io.appmetrica.analytics.impl.qf, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0578qf {
    public final fai a;
    public final Gf b;

    public C0578qf(fai faiVar, Ff ff) {
        this.a = faiVar;
        this.b = ff;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0578qf)) {
            return false;
        }
        C0578qf c0578qf = (C0578qf) obj;
        return Intrinsics.d(this.a, c0578qf.a) && Intrinsics.d(this.b, c0578qf.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "MviParameters(trackerParams=" + this.a + ", reportingDataProvider=" + this.b + ')';
    }
}
