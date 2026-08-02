package ru.yandex.taxi.settings.main;

import defpackage.hxx;
import defpackage.idr0;
import defpackage.m950;
import defpackage.ny61;
import defpackage.oep0;
import defpackage.pep0;
import defpackage.rrn;
import defpackage.v770;
import defpackage.yvf0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.deeplinks.DeeplinkSource;

/* loaded from: classes10.dex */
public final class b extends rrn {
    public final ru.yandex.taxi.settings.email.a b;
    public final com.yandex.go.lifecycle.a c;
    public final yvf0 d;

    public b(ru.yandex.taxi.settings.email.a aVar, com.yandex.go.lifecycle.a aVar2, yvf0 yvf0Var) {
        this.b = aVar;
        this.c = aVar2;
        this.d = yvf0Var;
    }

    @Override // com.yandex.go.deeplinks.typed.a
    public final boolean b() {
        return false;
    }

    @Override // com.yandex.go.deeplinks.typed.a
    public final /* bridge */ /* synthetic */ Object c(oep0 oep0Var, Object obj, v770 v770Var, DeeplinkSource deeplinkSource, Continuation continuation) {
        return d(oep0Var, (ContinuationImpl) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(oep0 oep0Var, ContinuationImpl continuationImpl) {
        EmailDeeplinkHandler$handleDeeplink$1 emailDeeplinkHandler$handleDeeplink$1;
        int i;
        if (continuationImpl instanceof EmailDeeplinkHandler$handleDeeplink$1) {
            emailDeeplinkHandler$handleDeeplink$1 = (EmailDeeplinkHandler$handleDeeplink$1) continuationImpl;
            int i2 = emailDeeplinkHandler$handleDeeplink$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                emailDeeplinkHandler$handleDeeplink$1.label = i2 - Integer.MIN_VALUE;
                Object obj = emailDeeplinkHandler$handleDeeplink$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = emailDeeplinkHandler$handleDeeplink$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    this.b.d();
                    emailDeeplinkHandler$handleDeeplink$1.L$0 = oep0Var;
                    emailDeeplinkHandler$handleDeeplink$1.L$1 = null;
                    emailDeeplinkHandler$handleDeeplink$1.L$2 = null;
                    emailDeeplinkHandler$handleDeeplink$1.L$3 = null;
                    emailDeeplinkHandler$handleDeeplink$1.label = 1;
                    if (this.c.a(emailDeeplinkHandler$handleDeeplink$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    oep0Var = (oep0) emailDeeplinkHandler$handleDeeplink$1.L$0;
                    kotlin.b.b(obj);
                }
                ((pep0) oep0Var).f((m950) this.d.get(), idr0.a, hxx.a);
                return zy11.a;
            }
        }
        emailDeeplinkHandler$handleDeeplink$1 = new EmailDeeplinkHandler$handleDeeplink$1(this, continuationImpl);
        Object obj2 = emailDeeplinkHandler$handleDeeplink$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = emailDeeplinkHandler$handleDeeplink$1.label;
        if (i != 0) {
        }
        ((pep0) oep0Var).f((m950) this.d.get(), idr0.a, hxx.a);
        return zy11.a;
    }
}
