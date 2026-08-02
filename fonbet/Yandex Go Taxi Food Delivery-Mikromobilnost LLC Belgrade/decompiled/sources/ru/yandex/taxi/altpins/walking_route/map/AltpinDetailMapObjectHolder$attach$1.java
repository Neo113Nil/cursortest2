package ru.yandex.taxi.altpins.walking_route.map;

import com.yandex.go.taxi.order.domain.repositories.e0;
import defpackage.kz1;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.p2y0;
import defpackage.tpr;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.o;
import ru.cprocsp.NGate.tools.Constants;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.altpins.walking_route.map.AltpinDetailMapObjectHolder$attach$1", f = "AltpinDetailMapObjectHolder.kt", l = {53, Constants.VPN_TRAFFIC}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class AltpinDetailMapObjectHolder$attach$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $orderId;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AltpinDetailMapObjectHolder$attach$1(a aVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$orderId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AltpinDetailMapObjectHolder$attach$1(this.this$0, this.$orderId, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AltpinDetailMapObjectHolder$attach$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003e, code lost:
    
        if (r8 == r0) goto L19;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            b.b(obj);
            p2y0 p2y0Var = this.this$0.b;
            String str = this.$orderId;
            this.label = 1;
            obj = ((e0) p2y0Var).p(str, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                return zy11Var;
            }
            b.b(obj);
        }
        o2y0 o2y0Var = (o2y0) obj;
        if (o2y0Var != null) {
            tpr b = this.this$0.c.b(o2y0Var);
            a aVar = this.this$0;
            o oVar = new o(b, new AltpinDetailMapObjectHolder$attach$1$invokeSuspend$$inlined$safeCollect$1(com.yandex.go.coroutines.b.e(), null));
            kz1 kz1Var = new kz1(aVar, 0);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.label = 2;
            if (oVar.collect(kz1Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return zy11Var;
    }
}
