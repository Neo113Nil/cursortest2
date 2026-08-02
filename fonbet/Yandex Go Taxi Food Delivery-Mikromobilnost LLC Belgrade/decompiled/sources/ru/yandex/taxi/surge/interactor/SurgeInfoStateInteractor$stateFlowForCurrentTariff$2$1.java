package ru.yandex.taxi.surge.interactor;

import defpackage.btw0;
import defpackage.dow0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.wls;
import defpackage.wsw0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Ljtw0;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.surge.interactor.SurgeInfoStateInteractor$stateFlowForCurrentTariff$2$1", f = "SurgeInfoStateInteractor.kt", l = {81, 83, HProv.ALG_SID_NO_HASH, HProv.ALG_SID_NO_HASH, HProv.ALG_SID_NO_HASH}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class SurgeInfoStateInteractor$stateFlowForCurrentTariff$2$1 extends SuspendLambda implements wls {
    final /* synthetic */ dow0 $dto;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ q this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SurgeInfoStateInteractor$stateFlowForCurrentTariff$2$1(dow0 dow0Var, q qVar, Continuation continuation) {
        super(2, continuation);
        this.$dto = dow0Var;
        this.this$0 = qVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SurgeInfoStateInteractor$stateFlowForCurrentTariff$2$1 surgeInfoStateInteractor$stateFlowForCurrentTariff$2$1 = new SurgeInfoStateInteractor$stateFlowForCurrentTariff$2$1(this.$dto, this.this$0, continuation);
        surgeInfoStateInteractor$stateFlowForCurrentTariff$2$1.L$0 = obj;
        return surgeInfoStateInteractor$stateFlowForCurrentTariff$2$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SurgeInfoStateInteractor$stateFlowForCurrentTariff$2$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x00aa, code lost:
    
        if (r0.emit(r10, r9) != r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006c, code lost:
    
        if (r10 == r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005b, code lost:
    
        if (r0.emit(defpackage.itw0.a, r9) == r1) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009d  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        vpr vprVar;
        ru.yandex.taxi.surge.mapper.a aVar;
        vpr vprVar2;
        vpr vprVar3 = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            this.L$0 = vprVar3;
            this.label = 1;
        } else if (i == 1) {
            kotlin.b.b(obj);
        } else {
            if (i == 2) {
                kotlin.b.b(obj);
                q qVar = this.this$0;
                ru.yandex.taxi.surge.mapper.a aVar2 = qVar.g;
                ru.yandex.taxi.surge.repository.b bVar = qVar.a;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = vprVar3;
                this.L$3 = aVar2;
                this.label = 3;
                obj = bVar.a((wsw0) obj, this);
                if (obj != coroutineSingletons) {
                    vprVar = vprVar3;
                    aVar = aVar2;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = vprVar;
                    this.L$3 = null;
                    this.label = 4;
                    obj = aVar.j((btw0) obj, this);
                    if (obj != coroutineSingletons) {
                    }
                }
                return coroutineSingletons;
            }
            if (i == 3) {
                aVar = (ru.yandex.taxi.surge.mapper.a) this.L$3;
                vprVar = (vpr) this.L$2;
                kotlin.b.b(obj);
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = vprVar;
                this.L$3 = null;
                this.label = 4;
                obj = aVar.j((btw0) obj, this);
                if (obj != coroutineSingletons) {
                    vprVar2 = vprVar;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 5;
                }
                return coroutineSingletons;
            }
            if (i != 4) {
                if (i != 5) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return zy11.a;
            }
            vprVar2 = (vpr) this.L$2;
            kotlin.b.b(obj);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 5;
        }
        dow0 dow0Var = this.$dto;
        if (dow0Var != null) {
            q qVar2 = this.this$0;
            this.L$0 = vprVar3;
            this.label = 2;
            obj = q.a(qVar2, dow0Var, this);
        }
        return zy11.a;
    }
}
