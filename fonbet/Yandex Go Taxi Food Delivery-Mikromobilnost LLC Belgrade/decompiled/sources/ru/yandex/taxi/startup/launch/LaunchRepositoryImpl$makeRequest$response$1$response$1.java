package ru.yandex.taxi.startup.launch;

import defpackage.tls;
import defpackage.yux;
import defpackage.zux;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes10.dex */
final /* synthetic */ class LaunchRepositoryImpl$makeRequest$response$1$response$1 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        zux zuxVar = (zux) this.receiver;
        zuxVar.getClass();
        String concat = "launch".concat("error");
        yux yuxVar = new yux(0, (Throwable) obj);
        ru.yandex.taxi.analytics.j jVar = (ru.yandex.taxi.analytics.j) zuxVar.a;
        ru.yandex.taxi.analytics.i d = jVar.d(concat);
        yuxVar.invoke(d);
        d.m();
        ru.yandex.taxi.analytics.i d2 = jVar.d(concat);
        yuxVar.invoke(d2);
        d2.n();
        return zy11.a;
    }
}
