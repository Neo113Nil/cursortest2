package ru.yandex.taxi.persuggest.repository;

import defpackage.jy60;
import defpackage.mdh;
import defpackage.noh;
import defpackage.ny61;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyj;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.persuggest.source.m;

/* loaded from: classes9.dex */
public final class e implements jy60 {
    public final m a;
    public final com.yandex.go.route.interactor.c b;
    public final tse c;
    public final com.yandex.go.address.search.perf.c d;
    public final AtomicReference e = new AtomicReference(null);

    public e(m mVar, com.yandex.go.route.interactor.c cVar, tse tseVar, com.yandex.go.address.search.perf.c cVar2) {
        this.a = mVar;
        this.b = cVar;
        this.c = tseVar;
        this.d = cVar2;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(2:3|(6:5|6|7|(1:(2:10|11)(2:16|17))(3:18|(2:20|(1:22))|23)|12|13))|25|6|7|(0)(0)|12|13) */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(ContinuationImpl continuationImpl) {
        ZeroSuggestPrefetchRepository$consumePrefetch$1 zeroSuggestPrefetchRepository$consumePrefetch$1;
        int i;
        if (continuationImpl instanceof ZeroSuggestPrefetchRepository$consumePrefetch$1) {
            zeroSuggestPrefetchRepository$consumePrefetch$1 = (ZeroSuggestPrefetchRepository$consumePrefetch$1) continuationImpl;
            int i2 = zeroSuggestPrefetchRepository$consumePrefetch$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zeroSuggestPrefetchRepository$consumePrefetch$1.label = i2 - Integer.MIN_VALUE;
                Object obj = zeroSuggestPrefetchRepository$consumePrefetch$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = zeroSuggestPrefetchRepository$consumePrefetch$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    noh nohVar = (noh) this.e.getAndSet(null);
                    if (nohVar != null) {
                        zeroSuggestPrefetchRepository$consumePrefetch$1.L$0 = null;
                        zeroSuggestPrefetchRepository$consumePrefetch$1.label = 1;
                        obj = nohVar.k(zeroSuggestPrefetchRepository$consumePrefetch$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    return null;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                i();
                return (List) obj;
            }
        }
        zeroSuggestPrefetchRepository$consumePrefetch$1 = new ZeroSuggestPrefetchRepository$consumePrefetch$1(this, continuationImpl);
        Object obj2 = zeroSuggestPrefetchRepository$consumePrefetch$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = zeroSuggestPrefetchRepository$consumePrefetch$1.label;
        if (i != 0) {
        }
        i();
        return (List) obj2;
    }

    @Override // defpackage.s150
    public final String getName() {
        return "ZeroSuggestPrefetchRepository";
    }

    @Override // defpackage.jy60
    public final void h() {
        tje.N(this.c, null, null, new ZeroSuggestPrefetchRepository$onFirstContentfulPaint$1(this, null), 3);
    }

    public final void i() {
        AtomicReference atomicReference = this.e;
        if (atomicReference.get() == null && this.b.c().h() != null) {
            sjh sjhVar = uyj.a;
            atomicReference.set(tje.h(this.c, mdh.b, null, new ZeroSuggestPrefetchRepository$startPrefetch$1(this, null), 2));
        }
    }
}
