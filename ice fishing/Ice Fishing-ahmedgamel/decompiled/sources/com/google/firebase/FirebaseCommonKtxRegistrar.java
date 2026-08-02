package com.google.firebase;

import Q3.h;
import S3.c;
import S3.d;
import S7.AbstractC0406u;
import T3.a;
import T3.b;
import T3.j;
import T3.r;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import java.util.concurrent.Executor;
import v7.AbstractC5120k;

@Keep
/* loaded from: classes2.dex */
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<b> getComponents() {
        a a9 = b.a(new r(S3.a.class, AbstractC0406u.class));
        a9.a(new j(new r(S3.a.class, Executor.class), 1, 0));
        a9.f3168z = h.f2669u;
        b b9 = a9.b();
        a a10 = b.a(new r(c.class, AbstractC0406u.class));
        a10.a(new j(new r(c.class, Executor.class), 1, 0));
        a10.f3168z = h.f2670v;
        b b10 = a10.b();
        a a11 = b.a(new r(S3.b.class, AbstractC0406u.class));
        a11.a(new j(new r(S3.b.class, Executor.class), 1, 0));
        a11.f3168z = h.f2671w;
        b b11 = a11.b();
        a a12 = b.a(new r(d.class, AbstractC0406u.class));
        a12.a(new j(new r(d.class, Executor.class), 1, 0));
        a12.f3168z = h.f2672x;
        return AbstractC5120k.t(b9, b10, b11, a12.b());
    }
}
