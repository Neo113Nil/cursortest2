package ru.yandex.taxi.communications;

import android.net.Uri;
import defpackage.jst;
import defpackage.mdh;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.plf;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.communications.TaxiCommunicationsWebViewStarter$startWebView$1", f = "TaxiCommunicationsWebViewStarter.kt", l = {54}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class TaxiCommunicationsWebViewStarter$startWebView$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $link;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ n this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaxiCommunicationsWebViewStarter$startWebView$1(n nVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = nVar;
        this.$link = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TaxiCommunicationsWebViewStarter$startWebView$1(this.this$0, this.$link, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TaxiCommunicationsWebViewStarter$startWebView$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        n nVar;
        String str;
        n nVar2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                nVar = this.this$0;
                String str2 = this.$link;
                try {
                    nVar.c.getClass();
                    sjh sjhVar = uyj.a;
                    mdh mdhVar = mdh.b;
                    TaxiCommunicationsWebViewStarter$startWebView$1$1$authorizationLink$1 taxiCommunicationsWebViewStarter$startWebView$1$1$authorizationLink$1 = new TaxiCommunicationsWebViewStarter$startWebView$1$1$authorizationLink$1(nVar, str2, null);
                    this.L$0 = nVar;
                    this.L$1 = nVar;
                    this.L$2 = str2;
                    this.label = 1;
                    Object k0 = tje.k0(mdhVar, taxiCommunicationsWebViewStarter$startWebView$1$1$authorizationLink$1, this);
                    if (k0 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    str = str2;
                    obj = k0;
                    nVar2 = nVar;
                } catch (Throwable unused) {
                    str = str2;
                    jst.e.getClass();
                    ((plf) nVar.h.get()).a(Uri.parse(str));
                    return zy11.a;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str = (String) this.L$2;
                nVar = (n) this.L$1;
                nVar2 = (n) this.L$0;
                try {
                    kotlin.b.b(obj);
                } catch (Throwable unused2) {
                    jst.e.getClass();
                    ((plf) nVar.h.get()).a(Uri.parse(str));
                    return zy11.a;
                }
            }
            n.a(nVar2, (String) obj);
            return zy11.a;
        } catch (CancellationException e) {
            throw e;
        }
    }
}
