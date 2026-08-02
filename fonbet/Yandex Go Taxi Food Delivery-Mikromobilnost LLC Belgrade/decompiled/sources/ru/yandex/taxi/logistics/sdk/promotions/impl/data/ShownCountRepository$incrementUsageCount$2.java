package ru.yandex.taxi.logistics.sdk.promotions.impl.data;

import defpackage.ez40;
import defpackage.kme0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lez40;", "it", "Lzy11;", "<anonymous>", "(Lez40;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.promotions.impl.data.ShownCountRepository$incrementUsageCount$2", f = "ShownCountRepository.kt", l = {50}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class ShownCountRepository$incrementUsageCount$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $id;
    /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShownCountRepository$incrementUsageCount$2(e eVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
        this.$id = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ShownCountRepository$incrementUsageCount$2 shownCountRepository$incrementUsageCount$2 = new ShownCountRepository$incrementUsageCount$2(this.this$0, this.$id, continuation);
        shownCountRepository$incrementUsageCount$2.L$0 = obj;
        return shownCountRepository$incrementUsageCount$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ShownCountRepository$incrementUsageCount$2) create((ez40) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        kme0 kme0Var;
        ez40 ez40Var = (ez40) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            e eVar = this.this$0;
            String str = this.$id;
            eVar.getClass();
            kme0Var = new kme0("pref_usage_count" + str);
            e eVar2 = this.this$0;
            String str2 = this.$id;
            this.L$0 = null;
            this.L$1 = ez40Var;
            this.L$2 = kme0Var;
            this.label = 1;
            obj = e.c(eVar2, str2, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kme0 kme0Var2 = (kme0) this.L$2;
            ez40 ez40Var2 = (ez40) this.L$1;
            kotlin.b.b(obj);
            kme0Var = kme0Var2;
            ez40Var = ez40Var2;
        }
        ez40Var.g(kme0Var, new Integer(((Number) obj).intValue() + 1));
        return zy11.a;
    }
}
