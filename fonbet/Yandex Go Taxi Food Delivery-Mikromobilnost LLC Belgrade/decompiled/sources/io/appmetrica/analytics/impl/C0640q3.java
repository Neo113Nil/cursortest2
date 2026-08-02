package io.appmetrica.analytics.impl;

import defpackage.uza;
import io.appmetrica.analytics.ExternalAttribution;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* renamed from: io.appmetrica.analytics.impl.q3, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C0640q3 implements ExternalAttribution {
    public final Qa a;

    public C0640q3(Qa qa) {
        this.a = qa;
    }

    @Override // io.appmetrica.analytics.ExternalAttribution
    public final byte[] toBytes() {
        return MessageNano.toByteArray(this.a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ExternalAttribution(type=`");
        sb.append(AbstractC0186ab.a(this.a.a));
        sb.append("`value=`");
        return AbstractC0748tp.a(sb, new String(this.a.b, uza.a), "`)");
    }
}
