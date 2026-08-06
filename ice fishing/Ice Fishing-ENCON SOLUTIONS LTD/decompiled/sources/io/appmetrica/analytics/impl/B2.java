package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ExternalAttribution;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* loaded from: classes.dex */
public class B2 implements ExternalAttribution {

    /* renamed from: a, reason: collision with root package name */
    public final A9 f4183a;

    public B2(A9 a9) {
        this.f4183a = a9;
    }

    @Override // io.appmetrica.analytics.ExternalAttribution
    public final byte[] toBytes() {
        return MessageNano.toByteArray(this.f4183a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ExternalAttribution(type=`");
        sb.append(K9.a(this.f4183a.f4134a));
        sb.append("`value=`");
        return C1.a.k(sb, new String(this.f4183a.f4135b, z1.a.f8620a), "`)");
    }
}
