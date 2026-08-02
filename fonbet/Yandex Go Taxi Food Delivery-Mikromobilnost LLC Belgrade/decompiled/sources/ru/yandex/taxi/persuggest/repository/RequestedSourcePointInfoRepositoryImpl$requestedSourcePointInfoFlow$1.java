package ru.yandex.taxi.persuggest.repository;

import defpackage.p9j0;
import defpackage.wls;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* synthetic */ class RequestedSourcePointInfoRepositoryImpl$requestedSourcePointInfoFlow$1 extends FunctionReferenceImpl implements wls {
    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        p9j0 p9j0Var = (p9j0) obj;
        p9j0 p9j0Var2 = (p9j0) obj2;
        ((RequestedSourcePointInfoRepositoryImpl) this.receiver).getClass();
        return Boolean.valueOf(ru.yandex.taxi.map.utils.a.j(p9j0Var.b.b, p9j0Var2.b.b) < ((float) Math.max(p9j0Var.b.b.c, p9j0Var2.b.b.c)));
    }
}
