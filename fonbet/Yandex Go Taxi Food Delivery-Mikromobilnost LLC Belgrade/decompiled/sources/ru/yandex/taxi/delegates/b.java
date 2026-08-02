package ru.yandex.taxi.delegates;

import com.yandex.go.superapp.impl.interactor.c;
import defpackage.tje;
import defpackage.tse;
import defpackage.ydn;

/* loaded from: classes5.dex */
public final class b {
    public final c a;
    public final tse b;

    public b(c cVar, tse tseVar) {
        this.a = cVar;
        this.b = tseVar;
    }

    public final void a(ydn ydnVar) {
        tje.N(this.b, null, null, new SuperAppServiceContextDelegate$requestContext$1(this, ydnVar, null), 3);
    }
}
