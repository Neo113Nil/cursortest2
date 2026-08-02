package ru.kinopoisk.sdk.easylogin.internal.impl;

import defpackage.aur;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.rjc;
import defpackage.we7;
import defpackage.xq0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import ru.kinopoisk.sdk.easylogin.internal.D1;

@we7(c = "ru.kinopoisk.sdk.easylogin.internal.impl.ConfigProviderImpl$getValueFlow$1", f = "ConfigProviderImpl.kt", l = {}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lrjc;", "Lru/kinopoisk/sdk/easylogin/internal/K1;", "", "<anonymous>", "(Lrjc;)V"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class ConfigProviderImpl$getValueFlow$1 extends aur implements Function2<rjc, Continuation<? super Unit>, Object> {
    final /* synthetic */ D1<T> $descriptor;
    int label;
    final /* synthetic */ ConfigProviderImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfigProviderImpl$getValueFlow$1(ConfigProviderImpl configProviderImpl, D1<T> d1, Continuation<? super ConfigProviderImpl$getValueFlow$1> continuation) {
        super(2, continuation);
        this.this$0 = configProviderImpl;
        this.$descriptor = d1;
    }

    @Override // defpackage.kq2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ConfigProviderImpl$getValueFlow$1(this.this$0, this.$descriptor, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(rjc rjcVar, Continuation<? super Unit> continuation) {
        return ((ConfigProviderImpl$getValueFlow$1) create(rjcVar, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        nm6 nm6Var = nm6.a;
        if (this.label != 0) {
            xq0.q("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        qgg.h0(obj);
        this.this$0.getValue(this.$descriptor);
        return Unit.a;
    }
}
