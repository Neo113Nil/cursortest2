package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.ai3;
import defpackage.jpa;
import defpackage.nmq;
import defpackage.nsh;
import defpackage.uif;
import defpackage.vz1;
import defpackage.xzi;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final class V extends uif implements Function1<jpa, Unit> {
    public final /* synthetic */ ai3 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V(ai3 ai3Var) {
        super(1);
        this.a = ai3Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        jpa jpaVar = (jpa) obj;
        jpaVar.getClass();
        float d = nmq.d(jpaVar.e()) / nmq.b(jpaVar.e());
        ai3 ai3Var = this.a;
        nsh q0 = jpaVar.q0();
        long B = q0.B();
        q0.s().r();
        ((xzi) q0.b).f0(d, 1.0f, 0L);
        jpa.A0(jpaVar, ai3Var, 0L, 0L, 0.0f, null, null, 0, 126);
        vz1.A(q0, B);
        return Unit.a;
    }
}
