package ru.yandex.taxi.history;

import android.net.Uri;
import defpackage.cmu;
import defpackage.gx70;
import defpackage.hx70;
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
import ru.yandex.taxi.deeplinks.DeeplinkSource;

/* loaded from: classes9.dex */
public final class a extends hx70 {
    public final yvf0 b;
    public final com.yandex.go.lifecycle.a c;

    public a(yvf0 yvf0Var, com.yandex.go.lifecycle.a aVar) {
        this.b = yvf0Var;
        this.c = aVar;
    }

    @Override // com.yandex.go.deeplinks.typed.a
    public final boolean b() {
        return false;
    }

    @Override // com.yandex.go.deeplinks.typed.a
    public final /* bridge */ /* synthetic */ Object c(oep0 oep0Var, Object obj, v770 v770Var, DeeplinkSource deeplinkSource, Continuation continuation) {
        return d(oep0Var, (gx70) obj, (ContinuationImpl) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(oep0 oep0Var, gx70 gx70Var, ContinuationImpl continuationImpl) {
        HistoryDeeplinkHandler$handleDeeplink$1 historyDeeplinkHandler$handleDeeplink$1;
        int i;
        Uri a;
        if (continuationImpl instanceof HistoryDeeplinkHandler$handleDeeplink$1) {
            historyDeeplinkHandler$handleDeeplink$1 = (HistoryDeeplinkHandler$handleDeeplink$1) continuationImpl;
            int i2 = historyDeeplinkHandler$handleDeeplink$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                historyDeeplinkHandler$handleDeeplink$1.label = i2 - Integer.MIN_VALUE;
                Object obj = historyDeeplinkHandler$handleDeeplink$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = historyDeeplinkHandler$handleDeeplink$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    a = gx70Var.a();
                    historyDeeplinkHandler$handleDeeplink$1.L$0 = oep0Var;
                    historyDeeplinkHandler$handleDeeplink$1.L$1 = null;
                    historyDeeplinkHandler$handleDeeplink$1.L$2 = null;
                    historyDeeplinkHandler$handleDeeplink$1.L$3 = null;
                    historyDeeplinkHandler$handleDeeplink$1.L$4 = a;
                    historyDeeplinkHandler$handleDeeplink$1.label = 1;
                    if (this.c.a(historyDeeplinkHandler$handleDeeplink$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Uri uri = (Uri) historyDeeplinkHandler$handleDeeplink$1.L$4;
                    oep0 oep0Var2 = (oep0) historyDeeplinkHandler$handleDeeplink$1.L$0;
                    kotlin.b.b(obj);
                    a = uri;
                    oep0Var = oep0Var2;
                }
                ((pep0) oep0Var).f((m950) this.b.get(), new cmu(a), hxx.a);
                return zy11.a;
            }
        }
        historyDeeplinkHandler$handleDeeplink$1 = new HistoryDeeplinkHandler$handleDeeplink$1(this, continuationImpl);
        Object obj2 = historyDeeplinkHandler$handleDeeplink$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = historyDeeplinkHandler$handleDeeplink$1.label;
        if (i != 0) {
        }
        ((pep0) oep0Var).f((m950) this.b.get(), new cmu(a), hxx.a);
        return zy11.a;
    }
}
