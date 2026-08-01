package com.google.firebase.ktx;

import Q3.c;
import Q3.d;
import R3.a;
import R3.b;
import R3.j;
import R3.r;
import S7.AbstractC0402u;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import i4.C4583a;
import java.util.List;
import java.util.concurrent.Executor;
import v7.AbstractC5130k;

@Keep
/* loaded from: classes2.dex */
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<b> getComponents() {
        a a9 = b.a(new r(Q3.a.class, AbstractC0402u.class));
        a9.a(new j(new r(Q3.a.class, Executor.class), 1, 0));
        a9.f2713z = C4583a.f38059u;
        b b9 = a9.b();
        a a10 = b.a(new r(c.class, AbstractC0402u.class));
        a10.a(new j(new r(c.class, Executor.class), 1, 0));
        a10.f2713z = C4583a.f38060v;
        b b10 = a10.b();
        a a11 = b.a(new r(Q3.b.class, AbstractC0402u.class));
        a11.a(new j(new r(Q3.b.class, Executor.class), 1, 0));
        a11.f2713z = C4583a.f38061w;
        b b11 = a11.b();
        a a12 = b.a(new r(d.class, AbstractC0402u.class));
        a12.a(new j(new r(d.class, Executor.class), 1, 0));
        a12.f2713z = C4583a.f38062x;
        return AbstractC5130k.v(b9, b10, b11, a12.b());
    }
}
