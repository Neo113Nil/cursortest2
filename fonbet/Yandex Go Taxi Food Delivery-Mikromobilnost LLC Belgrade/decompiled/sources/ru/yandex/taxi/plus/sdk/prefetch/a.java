package ru.yandex.taxi.plus.sdk.prefetch;

import defpackage.d6d0;
import defpackage.e1c;
import defpackage.jst;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.pzt0;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.zy11;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.plus.sdk.cache.c;

/* loaded from: classes9.dex */
public final class a {
    public final e1c a;
    public final ru.yandex.taxi.plus.sdk.domain.a b;
    public final tse c;
    public final d6d0 d;
    public final tt2 e;
    public pzt0 f;

    public a(e1c e1cVar, ru.yandex.taxi.plus.sdk.domain.a aVar, tse tseVar, d6d0 d6d0Var, tt2 tt2Var) {
        this.a = e1cVar;
        this.b = aVar;
        this.c = tseVar;
        this.d = d6d0Var;
        this.e = tt2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(a aVar, String str, ContinuationImpl continuationImpl) {
        PlusDataPrefetchInteractorImpl$prefetch$2 plusDataPrefetchInteractorImpl$prefetch$2;
        int i;
        Object b;
        aVar.getClass();
        if (continuationImpl instanceof PlusDataPrefetchInteractorImpl$prefetch$2) {
            plusDataPrefetchInteractorImpl$prefetch$2 = (PlusDataPrefetchInteractorImpl$prefetch$2) continuationImpl;
            int i2 = plusDataPrefetchInteractorImpl$prefetch$2.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                plusDataPrefetchInteractorImpl$prefetch$2.label = i2 - Integer.MIN_VALUE;
                Object obj = plusDataPrefetchInteractorImpl$prefetch$2.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = plusDataPrefetchInteractorImpl$prefetch$2.label;
                if (i != 0) {
                    b.b(obj);
                    ru.yandex.taxi.plus.sdk.domain.a aVar2 = aVar.b;
                    plusDataPrefetchInteractorImpl$prefetch$2.L$0 = null;
                    plusDataPrefetchInteractorImpl$prefetch$2.label = 1;
                    b = ru.yandex.taxi.plus.sdk.domain.a.b(aVar2, str, plusDataPrefetchInteractorImpl$prefetch$2, 1);
                    if (b == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                    b = ((Result) obj).getValue();
                }
                if (Result.a(b) != null) {
                    jst.e.getClass();
                    c cVar = aVar.a.a.a.a;
                    cVar.a = null;
                    cVar.e.l(null);
                }
                return zy11.a;
            }
        }
        plusDataPrefetchInteractorImpl$prefetch$2 = new PlusDataPrefetchInteractorImpl$prefetch$2(aVar, continuationImpl);
        Object obj2 = plusDataPrefetchInteractorImpl$prefetch$2.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = plusDataPrefetchInteractorImpl$prefetch$2.label;
        if (i != 0) {
        }
        if (Result.a(b) != null) {
        }
        return zy11.a;
    }

    public final void b() {
        pzt0 pzt0Var = this.f;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.e.getClass();
        sjh sjhVar = uyj.a;
        this.f = tje.N(this.c, mdh.b, null, new PlusDataPrefetchInteractorImpl$prefetch$1(this, null), 2);
    }
}
