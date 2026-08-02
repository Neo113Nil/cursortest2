package ru.yandex.taxi.linked_order.provider;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.mvg;
import defpackage.nly;
import defpackage.ny61;
import defpackage.sly;
import defpackage.sny;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lsly;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.linked_order.provider.LinkedOrderRemoteProvider$pollOrderInfo$1", f = "LinkedOrderRemoteProvider.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.TRANSLATE_KIT_VALUE, 69, HProv.ALG_SID_GR3410_12_256}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class LinkedOrderRemoteProvider$pollOrderInfo$1 extends SuspendLambda implements wls {
    final /* synthetic */ sny $orderKey;
    int I$0;
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ i this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkedOrderRemoteProvider$pollOrderInfo$1(i iVar, sny snyVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = iVar;
        this.$orderKey = snyVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        LinkedOrderRemoteProvider$pollOrderInfo$1 linkedOrderRemoteProvider$pollOrderInfo$1 = new LinkedOrderRemoteProvider$pollOrderInfo$1(this.this$0, this.$orderKey, continuation);
        linkedOrderRemoteProvider$pollOrderInfo$1.L$0 = obj;
        return linkedOrderRemoteProvider$pollOrderInfo$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((LinkedOrderRemoteProvider$pollOrderInfo$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0036, code lost:
    
        r2 = r10 ? 1 : 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x004f, code lost:
    
        if (r10 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0068  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i;
        sly slyVar;
        boolean z;
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            kotlin.b.b(obj);
            i = 1;
        } else {
            if (i2 == 1) {
                i = this.I$0;
                kotlin.b.b(obj);
                sly slyVar2 = (sly) obj;
                this.L$0 = vprVar;
                this.L$1 = slyVar2;
                this.I$0 = i;
                this.label = 2;
                if (vprVar.emit(slyVar2, this) != coroutineSingletons) {
                    slyVar = slyVar2;
                    z = slyVar instanceof nly;
                    if (z) {
                    }
                    i = z ? 1 : 0;
                }
                return coroutineSingletons;
            }
            if (i2 == 2) {
                slyVar = (sly) this.L$1;
                kotlin.b.b(obj);
                z = slyVar instanceof nly;
                if (z) {
                    long j = ((nly) slyVar).a.a;
                    this.L$0 = vprVar;
                    this.L$1 = null;
                    this.I$0 = z ? 1 : 0;
                    this.J$0 = j;
                    this.label = 3;
                    if (kotlinx.coroutines.a.i(j, this) != coroutineSingletons) {
                    }
                    return coroutineSingletons;
                }
                i = z ? 1 : 0;
            } else {
                if (i2 != 3) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i = this.I$0;
                kotlin.b.b(obj);
            }
        }
        if (i == 0) {
            return zy11.a;
        }
        kotlinx.coroutines.a.k(get_context());
        i iVar = this.this$0;
        sny snyVar = this.$orderKey;
        this.L$0 = vprVar;
        this.L$1 = null;
        this.I$0 = i;
        this.label = 1;
        obj = iVar.a(snyVar, this);
    }
}
