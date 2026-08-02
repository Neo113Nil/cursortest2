package ru.yandex.taxi.deeplinks;

import android.content.Intent;
import android.net.Uri;
import defpackage.ac20;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.tse;
import defpackage.wls;
import defpackage.zf;
import defpackage.zy11;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.analytics.q;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.deeplinks.DeferredDeeplinkInteractor$requestDeferredIntent$1", f = "DeferredDeeplinkInteractor.kt", l = {25}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class DeferredDeeplinkInteractor$requestDeferredIntent$1 extends SuspendLambda implements wls {
    final /* synthetic */ Intent $baseIntent;
    final /* synthetic */ tls $processIntent;
    int label;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeferredDeeplinkInteractor$requestDeferredIntent$1(g gVar, Intent intent, tls tlsVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = gVar;
        this.$baseIntent = intent;
        this.$processIntent = tlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DeferredDeeplinkInteractor$requestDeferredIntent$1(this.this$0, this.$baseIntent, this.$processIntent, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DeferredDeeplinkInteractor$requestDeferredIntent$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            ac20 ac20Var = this.this$0.c;
            this.label = 1;
            obj = ((q) ac20Var).j(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        String str = (String) obj;
        if (str != null) {
            Intent intent = this.$baseIntent;
            tls tlsVar = this.$processIntent;
            g gVar = this.this$0;
            Intent intent2 = intent != null ? new Intent(intent) : new Intent();
            intent2.setData(Uri.parse(str));
            intent2.setAction("android.intent.action.VIEW");
            tlsVar.invoke(intent2);
            zf zfVar = gVar.b;
            zfVar.getClass();
            HashMap hashMap = new HashMap();
            hashMap.put("deferred_deeplink_value", str);
            zfVar.a.a("DeferredDeeplink.Received", hashMap, 1, new HashMap());
        }
        this.this$0.a.e("FIELD_DEFERRED_DEEPLINK_HANDLED", true);
        return zy11.a;
    }
}
