package ru.yandex.taxi.utils;

import defpackage.bvf0;
import defpackage.cuy;
import defpackage.cvw;
import defpackage.ffx;
import defpackage.ike;
import defpackage.jl40;
import defpackage.jqr;
import defpackage.pwf0;
import defpackage.tac;
import defpackage.tje;
import defpackage.uyj;
import defpackage.zxf0;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import kotlinx.coroutines.flow.n0;
import kotlinx.coroutines.flow.o;

/* loaded from: classes10.dex */
public final class f implements cuy {
    public final ike a = bvf0.a(cvw.U(jl40.a(), uyj.b));
    public final n0 b = ffx.c(0, 1, null, 4);
    public final zxf0 c;

    public f(Class cls) {
        this.c = (zxf0) pwf0.d(cls, new InvocationHandler() { // from class: ru.yandex.taxi.utils.e
            @Override // java.lang.reflect.InvocationHandler
            public final Object invoke(Object obj, Method method, Object[] objArr) {
                f fVar = f.this;
                return tje.N(fVar.a, null, null, new Proxies$Listeners$notifier$1$1(fVar, method, objArr, null), 3);
            }
        });
    }

    public final tac h(zxf0 zxf0Var) {
        return new tac(1, kotlinx.coroutines.flow.e.H(this.a, new o(new jqr(this.b, new Proxies$Listeners$addListener$listenerJob$1(zxf0Var, null), 3), new Proxies$Listeners$addListener$listenerJob$2(zxf0Var, null))));
    }
}
