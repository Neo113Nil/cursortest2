package ru.yandex.taxi.location.zerokm.datasource;

import android.content.Context;
import android.net.Uri;
import defpackage.dxt0;
import defpackage.mdh;
import defpackage.qie;
import defpackage.rie;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes9.dex */
public final class a {
    public final Context a;
    public final tt2 b;
    public final dxt0 c;
    public final Uri d;

    public a(qie qieVar, Context context, tt2 tt2Var, dxt0 dxt0Var) {
        this.a = context;
        this.b = tt2Var;
        this.c = dxt0Var;
        this.d = ((rie) qieVar).a("zero_km");
    }

    public final Object a(String str, Continuation continuation) {
        this.b.getClass();
        sjh sjhVar = uyj.a;
        return tje.k0(mdh.b, new ZeroKmDbSource$getByMcc$2(this, str, null), continuation);
    }

    public final Object b(Iterable iterable, Continuation continuation) {
        this.b.getClass();
        sjh sjhVar = uyj.a;
        Object k0 = tje.k0(mdh.b, new ZeroKmDbSource$save$2(this, iterable, null), continuation);
        return k0 == CoroutineSingletons.COROUTINE_SUSPENDED ? k0 : zy11.a;
    }
}
