package ru.yandex.taxi.masstransit.geopayment.linkcard;

import defpackage.ag41;
import defpackage.dg41;
import defpackage.ff0;
import defpackage.ff41;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.scg;
import defpackage.tse;
import defpackage.wls;
import defpackage.wui;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.web.CoreWebViewConfig;
import ru.yandex.taxi.web.UiWebViewConfig;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.geopayment.linkcard.MtLinkCardWebViewRouter$onLaunch$1", f = "MtLinkCardWebViewRouter.kt", l = {122}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MtLinkCardWebViewRouter$onLaunch$1 extends SuspendLambda implements wls {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtLinkCardWebViewRouter$onLaunch$1(b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MtLinkCardWebViewRouter$onLaunch$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MtLinkCardWebViewRouter$onLaunch$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ff41 ff41Var;
        UiWebViewConfig uiWebViewConfig;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            scg a = this.this$0.D.a();
            UiWebViewConfig.Fullscreen fullscreen = UiWebViewConfig.Fullscreen.INSTANCE;
            this.this$0.A(a.b(), new dg41(new UiWebViewConfig(null, null, true, false, false, false, null, false, false, null, false, false, null, null, null, 0, 0, true, false, fullscreen, false, false, 3538675, null), null, null, null, new ff0(1, this.this$0), null, null, 222), new wui(this.this$0, 29));
            CoreWebViewConfig.Companion.getClass();
            CoreWebViewConfig.a aVar = new CoreWebViewConfig.a();
            aVar.b = this.this$0.E;
            aVar.e = false;
            aVar.f = true;
            aVar.h = true;
            UiWebViewConfig uiWebViewConfig2 = new UiWebViewConfig(aVar.a(), null, false, false, false, false, null, false, false, null, false, false, null, null, null, 0, 0, false, false, null, false, false, 4194302, null);
            uiWebViewConfig2.setShouldShowCloseButton(true);
            uiWebViewConfig2.setAnimateOnAppearing(true);
            uiWebViewConfig2.setArrowHidden(false);
            uiWebViewConfig2.setModalViewMode(fullscreen);
            uiWebViewConfig2.setShouldShowToolbar(false);
            uiWebViewConfig2.setHasTitleFromWeb(false);
            this.L$0 = a;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = uiWebViewConfig2;
            this.label = 1;
            if (kotlinx.coroutines.a.i(1L, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            ff41Var = a;
            uiWebViewConfig = uiWebViewConfig2;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uiWebViewConfig = (UiWebViewConfig) this.L$3;
            ff41Var = (ff41) this.L$0;
            kotlin.b.b(obj);
        }
        ((ag41) ((scg) ff41Var).a()).a(uiWebViewConfig);
        return zy11.a;
    }
}
