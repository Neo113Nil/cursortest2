package ru.yandex.taxi.settings.domain.factory;

import defpackage.l5g0;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.qoh;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Ll5g0;", "<anonymous>", "(Ltse;)Ll5g0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.settings.domain.factory.SubscribeParamFactory$pushTokensParams$2", f = "SubscribeParamFactory.kt", l = {27, 27}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class SubscribeParamFactory$pushTokensParams$2 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubscribeParamFactory$pushTokensParams$2(b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SubscribeParamFactory$pushTokensParams$2 subscribeParamFactory$pushTokensParams$2 = new SubscribeParamFactory$pushTokensParams$2(this.this$0, continuation);
        subscribeParamFactory$pushTokensParams$2.L$0 = obj;
        return subscribeParamFactory$pushTokensParams$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SubscribeParamFactory$pushTokensParams$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0059, code lost:
    
        if (r9 == r1) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        noh h;
        String str;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            qoh h2 = tje.h(tseVar, null, null, new SubscribeParamFactory$pushTokensParams$2$fcmToken$1(this.this$0, null), 3);
            h = tje.h(tseVar, null, null, new SubscribeParamFactory$pushTokensParams$2$hmsToken$1(this.this$0, null), 3);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = h;
            this.label = 1;
            obj = h2.s(this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str = (String) this.L$3;
                kotlin.b.b(obj);
                return new l5g0(str, (String) obj);
            }
            h = (noh) this.L$2;
            kotlin.b.b(obj);
        }
        String str2 = (String) obj;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = str2;
        this.label = 2;
        Object k = h.k(this);
        if (k != coroutineSingletons) {
            str = str2;
            obj = k;
            return new l5g0(str, (String) obj);
        }
        return coroutineSingletons;
    }
}
