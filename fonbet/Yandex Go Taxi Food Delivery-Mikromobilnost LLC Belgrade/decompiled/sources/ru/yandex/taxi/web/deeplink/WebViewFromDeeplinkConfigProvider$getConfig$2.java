package ru.yandex.taxi.web.deeplink;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.web.CoreWebViewConfig;
import ru.yandex.taxi.web.UiWebViewConfig;
import ru.yandex.taxi.web.deeplink.WebViewFromDeeplinkExperiment;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lru/yandex/taxi/web/UiWebViewConfig;", "<anonymous>", "(Ltse;)Lru/yandex/taxi/web/UiWebViewConfig;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.web.deeplink.WebViewFromDeeplinkConfigProvider$getConfig$2", f = "WebViewFromDeeplinkConfigProvider.kt", l = {25}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class WebViewFromDeeplinkConfigProvider$getConfig$2 extends SuspendLambda implements wls {
    final /* synthetic */ WebViewFromDeeplinkExperiment.a $urlWithId;
    Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebViewFromDeeplinkConfigProvider$getConfig$2(b bVar, WebViewFromDeeplinkExperiment.a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$urlWithId = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new WebViewFromDeeplinkConfigProvider$getConfig$2(this.this$0, this.$urlWithId, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((WebViewFromDeeplinkConfigProvider$getConfig$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoreWebViewConfig.a aVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            CoreWebViewConfig.a aVar2 = new CoreWebViewConfig.a();
            aVar2.e = false;
            aVar2.f = true;
            aVar2.h = true;
            b bVar = this.this$0;
            aVar2.k = bVar.c;
            a aVar3 = bVar.b;
            WebViewFromDeeplinkExperiment.a aVar4 = this.$urlWithId;
            this.L$0 = aVar2;
            this.label = 1;
            if (aVar3.a(this, aVar2, aVar4) == coroutineSingletons) {
                return coroutineSingletons;
            }
            aVar = aVar2;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            aVar = (CoreWebViewConfig.a) this.L$0;
            kotlin.b.b(obj);
        }
        UiWebViewConfig uiWebViewConfig = new UiWebViewConfig(aVar.a(), null, false, false, false, false, null, false, false, null, false, false, null, null, null, 0, 0, false, false, null, false, false, 4194302, null);
        WebViewFromDeeplinkExperiment.a aVar5 = this.$urlWithId;
        uiWebViewConfig.setShouldShowToolbar(true);
        uiWebViewConfig.setBackStackAware(true);
        uiWebViewConfig.setHasTitleFromWeb(true);
        uiWebViewConfig.setModalViewMode(UiWebViewConfig.Fullscreen.INSTANCE);
        uiWebViewConfig.setAnimateOnAppearing(false);
        uiWebViewConfig.setSignalForLoaded(aVar5.f ? UiWebViewConfig.SignalForLoaded.OnCommitVisible.INSTANCE : UiWebViewConfig.SignalForLoaded.Default.INSTANCE);
        return uiWebViewConfig;
    }
}
