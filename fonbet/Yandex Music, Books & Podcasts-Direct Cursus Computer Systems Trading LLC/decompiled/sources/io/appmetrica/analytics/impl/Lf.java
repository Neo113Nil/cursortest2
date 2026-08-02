package io.appmetrica.analytics.impl;

import defpackage.fai;
import defpackage.gai;
import defpackage.uif;
import defpackage.xq0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class Lf extends uif implements Function0 {
    public final /* synthetic */ Pf a;
    public final /* synthetic */ C0578qf b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Lf(Pf pf, C0578qf c0578qf) {
        super(0);
        this.a = pf;
        this.b = c0578qf;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        if (Nf.b != null) {
            xq0.q("MviService already started.");
            return null;
        }
        Pf pf = this.a;
        fai faiVar = this.b.a;
        pf.getClass();
        C0549pf c0549pf = new C0549pf(new gai(faiVar), this.b.b);
        Nf.b(Nf.a).a(c0549pf);
        Nf.b = c0549pf;
        return Unit.a;
    }
}
