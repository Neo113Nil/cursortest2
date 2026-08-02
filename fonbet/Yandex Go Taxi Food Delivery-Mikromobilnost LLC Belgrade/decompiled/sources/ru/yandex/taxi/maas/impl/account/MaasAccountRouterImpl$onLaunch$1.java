package ru.yandex.taxi.maas.impl.account;

import android.net.Uri;
import defpackage.d200;
import defpackage.evu0;
import defpackage.j000;
import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qzj0;
import defpackage.tse;
import defpackage.um3;
import defpackage.vmz;
import defpackage.wls;
import defpackage.xby;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.analytics.Events$Zalogin$LoginContext;
import ru.yandex.taxi.maas.api.analytics.MultiTransportChooseStationCardAnalytics$OpenReasonV2;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.maas.impl.account.MaasAccountRouterImpl$onLaunch$1", f = "MaasAccountRouterImpl.kt", l = {37}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class MaasAccountRouterImpl$onLaunch$1 extends SuspendLambda implements wls {
    final /* synthetic */ j000 $payload;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MaasAccountRouterImpl$onLaunch$1(a aVar, j000 j000Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$payload = j000Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MaasAccountRouterImpl$onLaunch$1(this.this$0, this.$payload, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MaasAccountRouterImpl$onLaunch$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Uri parse;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            a aVar = this.this$0;
            d200 d200Var = aVar.D;
            this.label = 1;
            obj = a.P(aVar, d200Var, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        String str = (String) obj;
        zy11 zy11Var = zy11.a;
        if (str == null) {
            xby.l(jst.e, "MAAS:ACCOUNT:MissingUrl", null, null, "Couldn't get maas webview url to open", 6);
            return zy11Var;
        }
        MultiTransportChooseStationCardAnalytics$OpenReasonV2 multiTransportChooseStationCardAnalytics$OpenReasonV2 = this.$payload.a;
        if (!evu0.J(str) && (parse = Uri.parse(str)) != null) {
            if (parse.getQueryParameter("open_reason") != null) {
                jst.e.getClass();
            } else {
                parse = parse.buildUpon().appendQueryParameter("open_reason", multiTransportChooseStationCardAnalytics$OpenReasonV2.getEventValue()).build();
            }
            str = parse.toString();
        }
        a aVar2 = this.this$0;
        aVar2.G.c(new um3(Events$Zalogin$LoginContext.MAAS, new qzj0(null, new vmz(3, aVar2, str)), false, false, 28));
        return zy11Var;
    }
}
