package ru.yandex.taxi.intercity.deeplink;

import defpackage.fx60;
import defpackage.hxx;
import defpackage.m950;
import defpackage.ny61;
import defpackage.oep0;
import defpackage.pep0;
import defpackage.plw;
import defpackage.qlw;
import defpackage.snw;
import defpackage.v770;
import defpackage.yvf0;
import defpackage.zow;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.analytics.Events$Zalogin$LoginContext;
import ru.yandex.taxi.deeplinks.DeeplinkSource;

/* loaded from: classes9.dex */
public final class a extends qlw {
    public final fx60 b;
    public final yvf0 c;

    public a(fx60 fx60Var, yvf0 yvf0Var) {
        this.b = fx60Var;
        this.c = yvf0Var;
    }

    @Override // com.yandex.go.deeplinks.typed.a
    public final boolean b() {
        return false;
    }

    @Override // com.yandex.go.deeplinks.typed.a
    public final /* bridge */ /* synthetic */ Object c(oep0 oep0Var, Object obj, v770 v770Var, DeeplinkSource deeplinkSource, Continuation continuation) {
        return d(oep0Var, (plw) obj, (ContinuationImpl) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(oep0 oep0Var, plw plwVar, ContinuationImpl continuationImpl) {
        CityModeTypedDeeplinkHandler$handleDeeplink$1 cityModeTypedDeeplinkHandler$handleDeeplink$1;
        Object obj;
        int i;
        if (continuationImpl instanceof CityModeTypedDeeplinkHandler$handleDeeplink$1) {
            cityModeTypedDeeplinkHandler$handleDeeplink$1 = (CityModeTypedDeeplinkHandler$handleDeeplink$1) continuationImpl;
            int i2 = cityModeTypedDeeplinkHandler$handleDeeplink$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cityModeTypedDeeplinkHandler$handleDeeplink$1.label = i2 - Integer.MIN_VALUE;
                obj = cityModeTypedDeeplinkHandler$handleDeeplink$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cityModeTypedDeeplinkHandler$handleDeeplink$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    Events$Zalogin$LoginContext events$Zalogin$LoginContext = Events$Zalogin$LoginContext.DEEPLINK;
                    cityModeTypedDeeplinkHandler$handleDeeplink$1.L$0 = oep0Var;
                    cityModeTypedDeeplinkHandler$handleDeeplink$1.L$1 = plwVar;
                    cityModeTypedDeeplinkHandler$handleDeeplink$1.L$2 = null;
                    cityModeTypedDeeplinkHandler$handleDeeplink$1.L$3 = null;
                    cityModeTypedDeeplinkHandler$handleDeeplink$1.label = 1;
                    obj = this.b.c(events$Zalogin$LoginContext, cityModeTypedDeeplinkHandler$handleDeeplink$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    plwVar = (plw) cityModeTypedDeeplinkHandler$handleDeeplink$1.L$1;
                    oep0Var = (oep0) cityModeTypedDeeplinkHandler$handleDeeplink$1.L$0;
                    kotlin.b.b(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    ((pep0) oep0Var).f((m950) this.c.get(), new zow(new snw(plwVar.a()), true), hxx.a);
                }
                return zy11.a;
            }
        }
        cityModeTypedDeeplinkHandler$handleDeeplink$1 = new CityModeTypedDeeplinkHandler$handleDeeplink$1(this, continuationImpl);
        obj = cityModeTypedDeeplinkHandler$handleDeeplink$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cityModeTypedDeeplinkHandler$handleDeeplink$1.label;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
        return zy11.a;
    }
}
