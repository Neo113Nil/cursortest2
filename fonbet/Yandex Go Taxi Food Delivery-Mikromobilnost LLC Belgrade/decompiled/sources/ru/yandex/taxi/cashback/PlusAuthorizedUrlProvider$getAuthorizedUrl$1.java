package ru.yandex.taxi.cashback;

import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import java.util.function.Consumer;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.cashback.PlusAuthorizedUrlProvider$getAuthorizedUrl$1", f = "PlusAuthorizedUrlProvider.kt", l = {54}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class PlusAuthorizedUrlProvider$getAuthorizedUrl$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $baseUrl;
    final /* synthetic */ Consumer<Throwable> $onFail;
    final /* synthetic */ Consumer<String> $onSuccess;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlusAuthorizedUrlProvider$getAuthorizedUrl$1(g gVar, String str, Consumer consumer, Consumer consumer2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = gVar;
        this.$baseUrl = str;
        this.$onSuccess = consumer;
        this.$onFail = consumer2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PlusAuthorizedUrlProvider$getAuthorizedUrl$1(this.this$0, this.$baseUrl, this.$onSuccess, this.$onFail, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PlusAuthorizedUrlProvider$getAuthorizedUrl$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0049  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Consumer<Throwable> consumer;
        Consumer<String> consumer2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                g gVar = this.this$0;
                String str = this.$baseUrl;
                Consumer<String> consumer3 = this.$onSuccess;
                Consumer<Throwable> consumer4 = this.$onFail;
                try {
                    ru.yandex.taxi.yaplus.b bVar = gVar.c;
                    this.L$0 = consumer3;
                    this.L$1 = consumer4;
                    this.label = 1;
                    obj = bVar.a(str, this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    consumer2 = consumer3;
                    consumer = consumer4;
                } catch (Throwable th) {
                    th = th;
                    consumer = consumer4;
                    jst.e.j(th);
                    if (consumer != null) {
                        consumer.accept(th);
                    }
                    return zy11.a;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                consumer = (Consumer) this.L$1;
                consumer2 = (Consumer) this.L$0;
                try {
                    kotlin.b.b(obj);
                } catch (Throwable th2) {
                    th = th2;
                    jst.e.j(th);
                    if (consumer != null) {
                    }
                    return zy11.a;
                }
            }
            consumer2.accept((String) obj);
            return zy11.a;
        } catch (CancellationException e) {
            throw e;
        }
    }
}
