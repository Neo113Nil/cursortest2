package ru.yandex.taxi.intercity.deeplink;

import android.net.Uri;
import defpackage.bcw;
import defpackage.ccw;
import defpackage.dcw;
import defpackage.fx60;
import defpackage.hxx;
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
import ru.yandex.taxi.analytics.Events$Zalogin$LoginContext;
import ru.yandex.taxi.deeplinks.DeeplinkSource;

/* loaded from: classes9.dex */
public final class b extends ccw {
    public final fx60 b;
    public final dcw c;
    public final yvf0 d;

    public b(fx60 fx60Var, dcw dcwVar, yvf0 yvf0Var) {
        this.b = fx60Var;
        this.c = dcwVar;
        this.d = yvf0Var;
    }

    @Override // com.yandex.go.deeplinks.typed.a
    public final boolean b() {
        return false;
    }

    @Override // com.yandex.go.deeplinks.typed.a
    public final /* bridge */ /* synthetic */ Object c(oep0 oep0Var, Object obj, v770 v770Var, DeeplinkSource deeplinkSource, Continuation continuation) {
        return d(oep0Var, (bcw) obj, (ContinuationImpl) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(oep0 oep0Var, bcw bcwVar, ContinuationImpl continuationImpl) {
        IntercityMainTypedDeeplinkHandler$handleDeeplink$1 intercityMainTypedDeeplinkHandler$handleDeeplink$1;
        Object obj;
        int i;
        if (continuationImpl instanceof IntercityMainTypedDeeplinkHandler$handleDeeplink$1) {
            intercityMainTypedDeeplinkHandler$handleDeeplink$1 = (IntercityMainTypedDeeplinkHandler$handleDeeplink$1) continuationImpl;
            int i2 = intercityMainTypedDeeplinkHandler$handleDeeplink$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                intercityMainTypedDeeplinkHandler$handleDeeplink$1.label = i2 - Integer.MIN_VALUE;
                obj = intercityMainTypedDeeplinkHandler$handleDeeplink$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = intercityMainTypedDeeplinkHandler$handleDeeplink$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    Events$Zalogin$LoginContext events$Zalogin$LoginContext = Events$Zalogin$LoginContext.DEEPLINK;
                    intercityMainTypedDeeplinkHandler$handleDeeplink$1.L$0 = oep0Var;
                    intercityMainTypedDeeplinkHandler$handleDeeplink$1.L$1 = bcwVar;
                    intercityMainTypedDeeplinkHandler$handleDeeplink$1.L$2 = null;
                    intercityMainTypedDeeplinkHandler$handleDeeplink$1.L$3 = null;
                    intercityMainTypedDeeplinkHandler$handleDeeplink$1.label = 1;
                    obj = this.b.c(events$Zalogin$LoginContext, intercityMainTypedDeeplinkHandler$handleDeeplink$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    bcwVar = (bcw) intercityMainTypedDeeplinkHandler$handleDeeplink$1.L$1;
                    oep0Var = (oep0) intercityMainTypedDeeplinkHandler$handleDeeplink$1.L$0;
                    kotlin.b.b(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    Uri a = bcwVar.a();
                    this.c.getClass();
                    ((pep0) oep0Var).f((m950) this.d.get(), dcw.a(a), hxx.a);
                }
                return zy11.a;
            }
        }
        intercityMainTypedDeeplinkHandler$handleDeeplink$1 = new IntercityMainTypedDeeplinkHandler$handleDeeplink$1(this, continuationImpl);
        obj = intercityMainTypedDeeplinkHandler$handleDeeplink$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = intercityMainTypedDeeplinkHandler$handleDeeplink$1.label;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
        return zy11.a;
    }
}
