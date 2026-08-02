package ru.yandex.taxi.web.deeplink;

import android.net.Uri;
import com.adjust.sdk.Constants;
import defpackage.gq41;
import defpackage.gw00;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lru/yandex/taxi/web/deeplink/WebViewFromDeeplinkExperiment$a;", "<anonymous>", "(Ltse;)Lru/yandex/taxi/web/deeplink/WebViewFromDeeplinkExperiment$a;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.web.deeplink.WebViewFromDeeplinkInteractor$getUrlByDeeplink$2", f = "WebViewFromDeeplinkInteractor.kt", l = {29}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class WebViewFromDeeplinkInteractor$getUrlByDeeplink$2 extends SuspendLambda implements wls {
    final /* synthetic */ Uri $deeplink;
    Object L$0;
    int label;
    final /* synthetic */ i this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebViewFromDeeplinkInteractor$getUrlByDeeplink$2(Uri uri, i iVar, Continuation continuation) {
        super(2, continuation);
        this.$deeplink = uri;
        this.this$0 = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new WebViewFromDeeplinkInteractor$getUrlByDeeplink$2(this.$deeplink, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((WebViewFromDeeplinkInteractor$getUrlByDeeplink$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            String queryParameter = this.$deeplink.getQueryParameter("id");
            i iVar = this.this$0;
            if (queryParameter == null) {
                gq41 gq41Var = iVar.b;
                String uri = this.$deeplink.toString();
                gq41Var.getClass();
                gq41Var.a("OpenExternalWebViewUrl.IdMissingInDeeplink", gw00.e(new Pair(Constants.DEEPLINK, uri)));
                ny61.g("Id missing in deeplink");
                return null;
            }
            gq41 gq41Var2 = iVar.b;
            gq41Var2.getClass();
            gq41Var2.a("OpenExternalWebViewUrl.Started", gw00.e(new Pair("url_id", queryParameter)));
            h hVar = new h(this.this$0.c.a.a());
            this.L$0 = queryParameter;
            this.label = 1;
            Object y = kotlinx.coroutines.flow.e.y(hVar, this);
            if (y == coroutineSingletons) {
                return coroutineSingletons;
            }
            str = queryParameter;
            obj = y;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = (String) this.L$0;
            kotlin.b.b(obj);
        }
        return this.this$0.a(((WebViewFromDeeplinkExperiment) obj).a(str), str, this.$deeplink);
    }
}
