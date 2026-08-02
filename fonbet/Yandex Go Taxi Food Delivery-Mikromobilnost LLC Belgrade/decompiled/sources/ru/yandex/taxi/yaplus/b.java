package ru.yandex.taxi.yaplus;

import defpackage.iid0;
import defpackage.js41;
import defpackage.mdh;
import defpackage.n20;
import defpackage.ny61;
import defpackage.qmp;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tpr;
import defpackage.ul51;
import defpackage.uyj;
import defpackage.vng;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.am.g;
import ru.yandex.taxi.yaplus.YaPlusStatusRepository;

/* loaded from: classes10.dex */
public final class b {
    public final n20 a;
    public final e b;
    public final iid0 c;
    public final g d;
    public final qmp e;

    public b(n20 n20Var, e eVar, iid0 iid0Var, g gVar, qmp qmpVar) {
        this.a = n20Var;
        this.b = eVar;
        this.c = iid0Var;
        this.d = gVar;
        this.e = qmpVar;
    }

    public final Object a(String str, Continuation continuation) {
        e eVar = this.b;
        eVar.a.getClass();
        sjh sjhVar = uyj.a;
        return tje.k0(mdh.b, new YaPlusProvider$getAuthorizationUrl$2(eVar, str, null), continuation);
    }

    public final tpr b() {
        e eVar = this.b;
        d dVar = new d(vng.l(eVar.h.c(), new js41(25), vng.c), eVar);
        eVar.a.getClass();
        return kotlinx.coroutines.flow.e.F(dVar, uyj.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0069, code lost:
    
        if (r4.d.g() != false) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ContinuationImpl continuationImpl) {
        YaPlusInteractorImpl$shouldShowPlusHomeAfterSplash$1 yaPlusInteractorImpl$shouldShowPlusHomeAfterSplash$1;
        Object obj;
        int i;
        if (continuationImpl instanceof YaPlusInteractorImpl$shouldShowPlusHomeAfterSplash$1) {
            yaPlusInteractorImpl$shouldShowPlusHomeAfterSplash$1 = (YaPlusInteractorImpl$shouldShowPlusHomeAfterSplash$1) continuationImpl;
            int i2 = yaPlusInteractorImpl$shouldShowPlusHomeAfterSplash$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                yaPlusInteractorImpl$shouldShowPlusHomeAfterSplash$1.label = i2 - Integer.MIN_VALUE;
                obj = yaPlusInteractorImpl$shouldShowPlusHomeAfterSplash$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = yaPlusInteractorImpl$shouldShowPlusHomeAfterSplash$1.label;
                boolean z = true;
                if (i != 0) {
                    kotlin.b.b(obj);
                    n20 n20Var = this.a;
                    yaPlusInteractorImpl$shouldShowPlusHomeAfterSplash$1.label = 1;
                    obj = ((com.yandex.go.taxi.order.provider.a) n20Var).q(yaPlusInteractorImpl$shouldShowPlusHomeAfterSplash$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                if (!((Boolean) obj).booleanValue()) {
                    iid0 iid0Var = this.c;
                    if (iid0Var.a.f(iid0Var.b)) {
                        ((ul51) this.e).getClass();
                        if (this.b.g.a == YaPlusStatusRepository.JoinPlusStatus.NOT_JOINED) {
                        }
                    }
                }
                z = false;
                return Boolean.valueOf(z);
            }
        }
        yaPlusInteractorImpl$shouldShowPlusHomeAfterSplash$1 = new YaPlusInteractorImpl$shouldShowPlusHomeAfterSplash$1(this, continuationImpl);
        obj = yaPlusInteractorImpl$shouldShowPlusHomeAfterSplash$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = yaPlusInteractorImpl$shouldShowPlusHomeAfterSplash$1.label;
        boolean z2 = true;
        if (i != 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
        z2 = false;
        return Boolean.valueOf(z2);
    }
}
