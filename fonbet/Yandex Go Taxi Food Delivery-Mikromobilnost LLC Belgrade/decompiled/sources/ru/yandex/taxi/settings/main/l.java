package ru.yandex.taxi.settings.main;

import com.adjust.sdk.Constants;
import defpackage.hxx;
import defpackage.ldr0;
import defpackage.m7r0;
import defpackage.m950;
import defpackage.ny61;
import defpackage.oep0;
import defpackage.pep0;
import defpackage.v770;
import defpackage.yvf0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.deeplinks.DeeplinkSource;

/* loaded from: classes10.dex */
public final class l extends m7r0 {
    public final com.yandex.go.lifecycle.a b;
    public final yvf0 c;

    public l(yvf0 yvf0Var, com.yandex.go.lifecycle.a aVar) {
        this.b = aVar;
        this.c = yvf0Var;
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
        SettingsDeeplinkHandler$handleDeeplink$1 settingsDeeplinkHandler$handleDeeplink$1;
        int i;
        if (continuationImpl instanceof SettingsDeeplinkHandler$handleDeeplink$1) {
            settingsDeeplinkHandler$handleDeeplink$1 = (SettingsDeeplinkHandler$handleDeeplink$1) continuationImpl;
            int i2 = settingsDeeplinkHandler$handleDeeplink$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                settingsDeeplinkHandler$handleDeeplink$1.label = i2 - Integer.MIN_VALUE;
                Object obj = settingsDeeplinkHandler$handleDeeplink$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = settingsDeeplinkHandler$handleDeeplink$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    settingsDeeplinkHandler$handleDeeplink$1.L$0 = oep0Var;
                    settingsDeeplinkHandler$handleDeeplink$1.L$1 = null;
                    settingsDeeplinkHandler$handleDeeplink$1.L$2 = null;
                    settingsDeeplinkHandler$handleDeeplink$1.L$3 = null;
                    settingsDeeplinkHandler$handleDeeplink$1.label = 1;
                    if (this.b.a(settingsDeeplinkHandler$handleDeeplink$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    oep0Var = (oep0) settingsDeeplinkHandler$handleDeeplink$1.L$0;
                    kotlin.b.b(obj);
                }
                ((pep0) oep0Var).f((m950) this.c.get(), new ldr0(Constants.DEEPLINK), hxx.a);
                return zy11.a;
            }
        }
        settingsDeeplinkHandler$handleDeeplink$1 = new SettingsDeeplinkHandler$handleDeeplink$1(this, continuationImpl);
        Object obj2 = settingsDeeplinkHandler$handleDeeplink$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = settingsDeeplinkHandler$handleDeeplink$1.label;
        if (i != 0) {
        }
        ((pep0) oep0Var).f((m950) this.c.get(), new ldr0(Constants.DEEPLINK), hxx.a);
        return zy11.a;
    }
}
