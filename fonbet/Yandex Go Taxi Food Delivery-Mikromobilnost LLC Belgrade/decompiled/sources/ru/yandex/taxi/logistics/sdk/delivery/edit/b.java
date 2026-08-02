package ru.yandex.taxi.logistics.sdk.delivery.edit;

import defpackage.b7i;
import defpackage.bvf0;
import defpackage.c7i;
import defpackage.eci0;
import defpackage.ffx;
import defpackage.s6i;
import defpackage.st2;
import defpackage.tje;
import defpackage.v4r0;
import java.util.Map;
import java.util.Set;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.n0;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes9.dex */
public final class b {
    public final st2 a;
    public final b7i b;
    public final c7i c;
    public final n0 d;
    public final eci0 e;

    public b(st2 st2Var, b7i b7iVar, c7i c7iVar) {
        this.a = st2Var;
        this.b = b7iVar;
        this.c = c7iVar;
        n0 c = ffx.c(0, 0, null, 7);
        this.d = c;
        this.e = e.c(c);
    }

    public final void a(s6i s6iVar, String str, Map map) {
        String a = s6iVar.a();
        r0 r0Var = this.c.a;
        r0Var.m(null, v4r0.i((Set) r0Var.getValue(), a));
        tje.N(bvf0.a(this.a.b), null, null, new DeliveryEditInteractorImpl$edit$1(this, s6iVar, str, map, null), 3);
    }
}
