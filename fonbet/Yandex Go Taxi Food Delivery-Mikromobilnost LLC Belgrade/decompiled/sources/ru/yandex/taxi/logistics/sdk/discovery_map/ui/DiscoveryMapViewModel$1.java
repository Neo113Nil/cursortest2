package ru.yandex.taxi.logistics.sdk.discovery_map.ui;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.utj;
import defpackage.wls;
import defpackage.wtj;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.discovery_map.ui.DiscoveryMapViewModel$1", f = "DiscoveryMapViewModel.kt", l = {30}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class DiscoveryMapViewModel$1 extends SuspendLambda implements wls {
    final /* synthetic */ utj $args;
    final /* synthetic */ ru.yandex.taxi.logistics.sdk.discovery_map.data.a $discoveryMapMapper;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiscoveryMapViewModel$1(ru.yandex.taxi.logistics.sdk.discovery_map.data.a aVar, utj utjVar, a aVar2, Continuation continuation) {
        super(2, continuation);
        this.$discoveryMapMapper = aVar;
        this.$args = utjVar;
        this.this$0 = aVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DiscoveryMapViewModel$1(this.$discoveryMapMapper, this.$args, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DiscoveryMapViewModel$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            ru.yandex.taxi.logistics.sdk.discovery_map.data.a aVar = this.$discoveryMapMapper;
            utj utjVar = this.$args;
            this.label = 1;
            obj = aVar.a(utjVar, this);
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
        this.this$0.c.l((wtj) obj);
        return zy11.a;
    }
}
