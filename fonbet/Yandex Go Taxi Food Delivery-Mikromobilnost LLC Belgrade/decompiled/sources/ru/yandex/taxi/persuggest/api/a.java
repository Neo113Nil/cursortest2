package ru.yandex.taxi.persuggest.api;

import android.os.SystemClock;
import defpackage.blh;
import defpackage.bva0;
import defpackage.ck;
import defpackage.cmt;
import defpackage.dzb;
import defpackage.fmt;
import defpackage.i3y;
import defpackage.j3z;
import defpackage.mdh;
import defpackage.nc61;
import defpackage.ny61;
import defpackage.on2;
import defpackage.p0t;
import defpackage.p7v0;
import defpackage.q0t;
import defpackage.q3e;
import defpackage.q6r;
import defpackage.rc61;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.u6r;
import defpackage.uc61;
import defpackage.uyj;
import defpackage.zy11;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes9.dex */
public final class a {
    public final tt2 a;
    public final bva0 b;
    public final blh c;
    public final i3y d;

    public a(tt2 tt2Var, bva0 bva0Var, blh blhVar, on2 on2Var) {
        this.a = tt2Var;
        this.b = bva0Var;
        this.c = blhVar;
        this.d = kotlin.a.a(new ck(on2Var, 19));
    }

    public final Object a(String str, dzb dzbVar, Continuation continuation) {
        this.a.getClass();
        sjh sjhVar = uyj.a;
        return tje.k0(mdh.b, new PerSuggestApiImpl$clarifyPoints$2(this, str, dzbVar, null), continuation);
    }

    public final Object b(String str, q3e q3eVar, Continuation continuation) {
        this.a.getClass();
        sjh sjhVar = uyj.a;
        Object k0 = tje.k0(mdh.b, new PerSuggestApiImpl$confirm$2(this, str, q3eVar, null), continuation);
        return k0 == CoroutineSingletons.COROUTINE_SUSPENDED ? k0 : zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, q6r q6rVar, p0t p0tVar, ContinuationImpl continuationImpl) {
        PerSuggestApiImpl$finalSuggest$1 perSuggestApiImpl$finalSuggest$1;
        int i;
        if (continuationImpl instanceof PerSuggestApiImpl$finalSuggest$1) {
            perSuggestApiImpl$finalSuggest$1 = (PerSuggestApiImpl$finalSuggest$1) continuationImpl;
            int i2 = perSuggestApiImpl$finalSuggest$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                perSuggestApiImpl$finalSuggest$1.label = i2 - Integer.MIN_VALUE;
                Object obj = perSuggestApiImpl$finalSuggest$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = perSuggestApiImpl$finalSuggest$1.label;
                if (i != 0) {
                    b.b(obj);
                    j3z j3zVar = new j3z(((q0t) p0tVar).a);
                    this.a.getClass();
                    sjh sjhVar = uyj.a;
                    mdh mdhVar = mdh.b;
                    PerSuggestApiImpl$finalSuggest$response$1 perSuggestApiImpl$finalSuggest$response$1 = new PerSuggestApiImpl$finalSuggest$response$1(this, str, q6rVar, j3zVar, null);
                    perSuggestApiImpl$finalSuggest$1.L$0 = null;
                    perSuggestApiImpl$finalSuggest$1.L$1 = null;
                    perSuggestApiImpl$finalSuggest$1.L$2 = null;
                    perSuggestApiImpl$finalSuggest$1.L$3 = null;
                    perSuggestApiImpl$finalSuggest$1.label = 1;
                    obj = tje.k0(mdhVar, perSuggestApiImpl$finalSuggest$response$1, perSuggestApiImpl$finalSuggest$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                fmt fmtVar = (fmt) obj;
                return u6r.g((u6r) fmtVar.a, fmtVar.e.a("X-YaTraceId"));
            }
        }
        perSuggestApiImpl$finalSuggest$1 = new PerSuggestApiImpl$finalSuggest$1(this, continuationImpl);
        Object obj2 = perSuggestApiImpl$finalSuggest$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = perSuggestApiImpl$finalSuggest$1.label;
        if (i != 0) {
        }
        fmt fmtVar2 = (fmt) obj2;
        return u6r.g((u6r) fmtVar2.a, fmtVar2.e.a("X-YaTraceId"));
    }

    public final PerSuggestInternalApi d() {
        return (PerSuggestInternalApi) this.d.getValue();
    }

    public final Object e(String str, p7v0 p7v0Var, Continuation continuation) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.a.getClass();
        sjh sjhVar = uyj.a;
        return tje.k0(mdh.b, new PerSuggestApiImpl$suggest$2(this, str, p7v0Var, elapsedRealtime, null), continuation);
    }

    public final Object f(String str, p7v0 p7v0Var, Continuation continuation) {
        this.a.getClass();
        sjh sjhVar = uyj.a;
        return tje.k0(mdh.b, new PerSuggestApiImpl$suggestV2$2(this, str, p7v0Var, null), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(String str, nc61 nc61Var, boolean z, ContinuationImpl continuationImpl) {
        PerSuggestApiImpl$zeroSuggest$1 perSuggestApiImpl$zeroSuggest$1;
        int i;
        if (continuationImpl instanceof PerSuggestApiImpl$zeroSuggest$1) {
            perSuggestApiImpl$zeroSuggest$1 = (PerSuggestApiImpl$zeroSuggest$1) continuationImpl;
            int i2 = perSuggestApiImpl$zeroSuggest$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                perSuggestApiImpl$zeroSuggest$1.label = i2 - Integer.MIN_VALUE;
                PerSuggestApiImpl$zeroSuggest$1 perSuggestApiImpl$zeroSuggest$12 = perSuggestApiImpl$zeroSuggest$1;
                Object obj = perSuggestApiImpl$zeroSuggest$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = perSuggestApiImpl$zeroSuggest$12.label;
                if (i != 0) {
                    b.b(obj);
                    cmt<rc61> g = d().g(str, nc61Var);
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    this.a.getClass();
                    sjh sjhVar = uyj.a;
                    mdh mdhVar = mdh.b;
                    PerSuggestApiImpl$zeroSuggest$response$1 perSuggestApiImpl$zeroSuggest$response$1 = new PerSuggestApiImpl$zeroSuggest$response$1(z, g, elapsedRealtime, this, nc61Var, null);
                    perSuggestApiImpl$zeroSuggest$12.L$0 = null;
                    perSuggestApiImpl$zeroSuggest$12.L$1 = null;
                    perSuggestApiImpl$zeroSuggest$12.L$2 = null;
                    perSuggestApiImpl$zeroSuggest$12.Z$0 = z;
                    perSuggestApiImpl$zeroSuggest$12.J$0 = elapsedRealtime;
                    perSuggestApiImpl$zeroSuggest$12.label = 1;
                    obj = tje.k0(mdhVar, perSuggestApiImpl$zeroSuggest$response$1, perSuggestApiImpl$zeroSuggest$12);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                fmt fmtVar = (fmt) obj;
                return rc61.a((rc61) fmtVar.a, fmtVar.e.a("X-YaTraceId"));
            }
        }
        perSuggestApiImpl$zeroSuggest$1 = new PerSuggestApiImpl$zeroSuggest$1(this, continuationImpl);
        PerSuggestApiImpl$zeroSuggest$1 perSuggestApiImpl$zeroSuggest$122 = perSuggestApiImpl$zeroSuggest$1;
        Object obj2 = perSuggestApiImpl$zeroSuggest$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = perSuggestApiImpl$zeroSuggest$122.label;
        if (i != 0) {
        }
        fmt fmtVar2 = (fmt) obj2;
        return rc61.a((rc61) fmtVar2.a, fmtVar2.e.a("X-YaTraceId"));
    }

    public final Object h(String str, nc61 nc61Var, Continuation continuation) {
        cmt<uc61> c = d().c(str, nc61Var);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.a.getClass();
        sjh sjhVar = uyj.a;
        return tje.k0(mdh.b, new PerSuggestApiImpl$zeroSuggestV2$2(c, elapsedRealtime, this, nc61Var, null), continuation);
    }
}
