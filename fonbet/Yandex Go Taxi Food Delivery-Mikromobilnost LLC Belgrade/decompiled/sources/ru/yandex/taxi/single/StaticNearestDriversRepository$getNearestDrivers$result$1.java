package ru.yandex.taxi.single;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import defpackage.zzs;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.launch.c;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "Lkotlin/Result;", "Lcom/yandex/go/taxi/order/models/api/response/NearestDrivers;", "<anonymous>", "(Ltse;)Lkotlin/Result;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.single.StaticNearestDriversRepository$getNearestDrivers$result$1", f = "StaticNearestDriversRepository.kt", l = {27, 28}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class StaticNearestDriversRepository$getNearestDrivers$result$1 extends SuspendLambda implements wls {
    final /* synthetic */ List<String> $existingDriversId;
    final /* synthetic */ zzs $location;
    final /* synthetic */ Set<String> $tariffClasses;
    Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StaticNearestDriversRepository$getNearestDrivers$result$1(b bVar, zzs zzsVar, Set set, List list, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$location = zzsVar;
        this.$tariffClasses = set;
        this.$existingDriversId = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new StaticNearestDriversRepository$getNearestDrivers$result$1(this.this$0, this.$location, this.$tariffClasses, this.$existingDriversId, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((StaticNearestDriversRepository$getNearestDrivers$result$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004a, code lost:
    
        if (r9 == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004c, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
    
        if (r10 == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            c cVar = this.this$0.b;
            this.label = 1;
            obj = cVar.c(this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                a = ((Result) obj).getValue();
                return new Result(a);
            }
            kotlin.b.b(obj);
        }
        b bVar = this.this$0;
        zzs zzsVar = this.$location;
        Set<String> set = this.$tariffClasses;
        List<String> list = this.$existingDriversId;
        this.L$0 = null;
        this.label = 2;
        a = b.a(bVar, (String) obj, zzsVar, set, list, this);
    }
}
