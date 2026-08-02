package io.appmetrica.analytics.impl;

import defpackage.fv20;
import defpackage.gv20;
import defpackage.ny61;
import defpackage.sls;
import defpackage.zy11;
import kotlin.jvm.internal.Lambda;

/* renamed from: io.appmetrica.analytics.impl.ag, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0191ag extends Lambda implements sls {
    public final /* synthetic */ C0306eg a;
    public final /* synthetic */ Ff b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0191ag(C0306eg c0306eg, Ff ff) {
        super(0);
        this.a = c0306eg;
        this.b = ff;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        if (C0249cg.b != null) {
            ny61.r("MviService already started.");
            return null;
        }
        C0306eg c0306eg = this.a;
        fv20 fv20Var = this.b.a;
        c0306eg.getClass();
        Ef ef = new Ef(new gv20(fv20Var), this.b.b);
        C0249cg.b(C0249cg.a).a(ef);
        C0249cg.b = ef;
        return zy11.a;
    }
}
