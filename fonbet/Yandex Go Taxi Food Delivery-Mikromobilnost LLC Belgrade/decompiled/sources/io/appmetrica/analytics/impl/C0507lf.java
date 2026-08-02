package io.appmetrica.analytics.impl;

import defpackage.tls;
import java.util.Map;
import kotlin.jvm.internal.Lambda;

/* renamed from: io.appmetrica.analytics.impl.lf, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0507lf extends Lambda implements tls {
    public final /* synthetic */ Uc a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0507lf(Uc uc) {
        super(1);
        this.a = uc;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        Te te = (Te) ((Map.Entry) obj).getValue();
        return te.b.parse(this.a);
    }
}
