package ru.yandex.taxi.location.zerokm.datasource;

import defpackage.mdh;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.wnt;
import defpackage.zuj0;
import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class b {
    public final zuj0 a;
    public final wnt b;
    public final tt2 c;

    public b(tt2 tt2Var, wnt wntVar, zuj0 zuj0Var) {
        this.a = zuj0Var;
        this.b = wntVar;
        this.c = tt2Var;
    }

    public final Object a(Continuation continuation) {
        this.c.getClass();
        sjh sjhVar = uyj.a;
        return tje.k0(mdh.b, new ZeroKmDefaultSource$getAll$2(this, null), continuation);
    }
}
