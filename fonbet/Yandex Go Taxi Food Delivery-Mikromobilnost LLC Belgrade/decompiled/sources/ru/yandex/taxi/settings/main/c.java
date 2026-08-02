package ru.yandex.taxi.settings.main;

import defpackage.f600;
import defpackage.ny61;
import defpackage.oep0;
import defpackage.s500;
import defpackage.v770;
import defpackage.yvf0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.deeplinks.DeeplinkSource;

/* loaded from: classes10.dex */
public final class c extends s500 {
    public final yvf0 b;
    public final com.yandex.go.lifecycle.a c;

    public c(yvf0 yvf0Var, com.yandex.go.lifecycle.a aVar) {
        this.b = yvf0Var;
        this.c = aVar;
    }

    @Override // com.yandex.go.deeplinks.typed.a
    public final boolean b() {
        return false;
    }

    @Override // com.yandex.go.deeplinks.typed.a
    public final /* bridge */ /* synthetic */ Object c(oep0 oep0Var, Object obj, v770 v770Var, DeeplinkSource deeplinkSource, Continuation continuation) {
        return d((ContinuationImpl) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(ContinuationImpl continuationImpl) {
        MainMenuTypedDeeplinkHandler$handleDeeplink$1 mainMenuTypedDeeplinkHandler$handleDeeplink$1;
        int i;
        f600 f600Var;
        if (continuationImpl instanceof MainMenuTypedDeeplinkHandler$handleDeeplink$1) {
            mainMenuTypedDeeplinkHandler$handleDeeplink$1 = (MainMenuTypedDeeplinkHandler$handleDeeplink$1) continuationImpl;
            int i2 = mainMenuTypedDeeplinkHandler$handleDeeplink$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mainMenuTypedDeeplinkHandler$handleDeeplink$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mainMenuTypedDeeplinkHandler$handleDeeplink$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mainMenuTypedDeeplinkHandler$handleDeeplink$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    mainMenuTypedDeeplinkHandler$handleDeeplink$1.L$0 = null;
                    mainMenuTypedDeeplinkHandler$handleDeeplink$1.L$1 = null;
                    mainMenuTypedDeeplinkHandler$handleDeeplink$1.L$2 = null;
                    mainMenuTypedDeeplinkHandler$handleDeeplink$1.L$3 = null;
                    mainMenuTypedDeeplinkHandler$handleDeeplink$1.label = 1;
                    if (this.c.a(mainMenuTypedDeeplinkHandler$handleDeeplink$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                f600Var = (f600) this.b.get();
                if (!f600Var.d()) {
                    f600Var.g();
                }
                return zy11.a;
            }
        }
        mainMenuTypedDeeplinkHandler$handleDeeplink$1 = new MainMenuTypedDeeplinkHandler$handleDeeplink$1(this, continuationImpl);
        Object obj2 = mainMenuTypedDeeplinkHandler$handleDeeplink$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mainMenuTypedDeeplinkHandler$handleDeeplink$1.label;
        if (i != 0) {
        }
        f600Var = (f600) this.b.get();
        if (!f600Var.d()) {
        }
        return zy11.a;
    }
}
