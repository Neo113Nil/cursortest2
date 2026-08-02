package ru.yandex.taxi.search.deeplink;

import android.net.Uri;
import defpackage.fx60;
import defpackage.jc00;
import defpackage.mzb;
import defpackage.ny61;
import defpackage.oep0;
import defpackage.u4v0;
import defpackage.ure0;
import defpackage.v4v0;
import defpackage.v770;
import defpackage.xw8;
import defpackage.yv0;
import defpackage.yvf0;
import defpackage.zy11;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.analytics.Events$Zalogin$LoginContext;
import ru.yandex.taxi.deeplinks.DeeplinkSource;

/* loaded from: classes10.dex */
public final class a extends v4v0 {
    public final jc00 b;
    public final yv0 c;
    public final fx60 d;
    public final yvf0 e;
    public final yvf0 f;
    public final mzb g;

    public a(jc00 jc00Var, yv0 yv0Var, fx60 fx60Var, yvf0 yvf0Var, ure0 ure0Var, mzb mzbVar) {
        this.b = jc00Var;
        this.c = yv0Var;
        this.d = fx60Var;
        this.e = yvf0Var;
        this.f = ure0Var;
        this.g = mzbVar;
    }

    @Override // com.yandex.go.deeplinks.typed.a
    public final boolean b() {
        return false;
    }

    @Override // com.yandex.go.deeplinks.typed.a
    public final /* bridge */ /* synthetic */ Object c(oep0 oep0Var, Object obj, v770 v770Var, DeeplinkSource deeplinkSource, Continuation continuation) {
        return d(oep0Var, (u4v0) obj, (ContinuationImpl) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(oep0 oep0Var, u4v0 u4v0Var, ContinuationImpl continuationImpl) {
        SuggestDeeplinkHandler$handleDeeplink$1 suggestDeeplinkHandler$handleDeeplink$1;
        int i;
        oep0 oep0Var2;
        Uri uri;
        if (continuationImpl instanceof SuggestDeeplinkHandler$handleDeeplink$1) {
            suggestDeeplinkHandler$handleDeeplink$1 = (SuggestDeeplinkHandler$handleDeeplink$1) continuationImpl;
            int i2 = suggestDeeplinkHandler$handleDeeplink$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                suggestDeeplinkHandler$handleDeeplink$1.label = i2 - Integer.MIN_VALUE;
                Object obj = suggestDeeplinkHandler$handleDeeplink$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = suggestDeeplinkHandler$handleDeeplink$1.label;
                if (i != 0) {
                    b.b(obj);
                    Uri a = u4v0Var.a();
                    suggestDeeplinkHandler$handleDeeplink$1.L$0 = oep0Var;
                    suggestDeeplinkHandler$handleDeeplink$1.L$1 = null;
                    suggestDeeplinkHandler$handleDeeplink$1.L$2 = null;
                    suggestDeeplinkHandler$handleDeeplink$1.L$3 = null;
                    suggestDeeplinkHandler$handleDeeplink$1.L$4 = a;
                    suggestDeeplinkHandler$handleDeeplink$1.label = 1;
                    obj = ((com.yandex.go.clarify_address.before_order.a) this.g).g(suggestDeeplinkHandler$handleDeeplink$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    oep0Var2 = oep0Var;
                    uri = a;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Uri uri2 = (Uri) suggestDeeplinkHandler$handleDeeplink$1.L$4;
                    oep0 oep0Var3 = (oep0) suggestDeeplinkHandler$handleDeeplink$1.L$0;
                    b.b(obj);
                    uri = uri2;
                    oep0Var2 = oep0Var3;
                }
                boolean booleanValue = ((Boolean) obj).booleanValue();
                this.d.a(Events$Zalogin$LoginContext.DEEPLINK, new xw8(this, uri, booleanValue, oep0Var2, 8));
                return zy11.a;
            }
        }
        suggestDeeplinkHandler$handleDeeplink$1 = new SuggestDeeplinkHandler$handleDeeplink$1(this, continuationImpl);
        Object obj2 = suggestDeeplinkHandler$handleDeeplink$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = suggestDeeplinkHandler$handleDeeplink$1.label;
        if (i != 0) {
        }
        boolean booleanValue2 = ((Boolean) obj2).booleanValue();
        this.d.a(Events$Zalogin$LoginContext.DEEPLINK, new xw8(this, uri, booleanValue2, oep0Var2, 8));
        return zy11.a;
    }
}
