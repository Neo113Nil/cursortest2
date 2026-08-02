package ru.yandex.taxi.layers.domain;

import defpackage.hst;
import defpackage.jst;
import defpackage.mvg;
import defpackage.nm00;
import defpackage.ny61;
import defpackage.pm00;
import defpackage.sfu0;
import defpackage.vpr;
import defpackage.wls;
import defpackage.ysd0;
import defpackage.z2e0;
import defpackage.zy11;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.CryptoPro.JCSP.MSCAPI.MSException;
import ru.yandex.taxi.common_models.net.map_object.i0;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lfxe0;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.layers.domain.PolygonActionsInteractor$handleAction$2", f = "PolygonActionsInteractor.kt", l = {MSException.ERROR_INVALID_PASSWORD, HProv.ALG_SID_KECCAK_224, HProv.ALG_SID_KECCAK_256, 90, 91}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class PolygonActionsInteractor$handleAction$2 extends SuspendLambda implements wls {
    final /* synthetic */ pm00 $actionInfo;
    final /* synthetic */ nm00 $newEvent;
    final /* synthetic */ ru.yandex.taxi.common_models.net.map_object.z $pointAction;
    final /* synthetic */ nm00 $prevEvent;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ z2e0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PolygonActionsInteractor$handleAction$2(ru.yandex.taxi.common_models.net.map_object.z zVar, z2e0 z2e0Var, nm00 nm00Var, nm00 nm00Var2, pm00 pm00Var, Continuation continuation) {
        super(2, continuation);
        this.$pointAction = zVar;
        this.this$0 = z2e0Var;
        this.$prevEvent = nm00Var;
        this.$newEvent = nm00Var2;
        this.$actionInfo = pm00Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PolygonActionsInteractor$handleAction$2 polygonActionsInteractor$handleAction$2 = new PolygonActionsInteractor$handleAction$2(this.$pointAction, this.this$0, this.$prevEvent, this.$newEvent, this.$actionInfo, continuation);
        polygonActionsInteractor$handleAction$2.L$0 = obj;
        return polygonActionsInteractor$handleAction$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PolygonActionsInteractor$handleAction$2) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0095, code lost:
    
        if (defpackage.z2e0.a(r10, r0, r2, r9) == r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0097, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0086, code lost:
    
        if (((ru.yandex.taxi.map_common.b) r10).d(r2, r9) == r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0073, code lost:
    
        if (r0.emit(new defpackage.tdq0(r2.a), r9) == r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0047, code lost:
    
        if (defpackage.z2e0.a(r10, r0, r2, r9) == r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005a, code lost:
    
        if (defpackage.z2e0.a(r10, r0, r2, r9) == r1) goto L34;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    kotlin.b.b(obj);
                    z2e0 z2e0Var = this.this$0;
                    nm00 nm00Var = this.$newEvent;
                    this.L$0 = vprVar;
                    this.label = 3;
                    z2e0Var.getClass();
                } else if (i == 3) {
                    kotlin.b.b(obj);
                    ysd0 ysd0Var = this.this$0.a;
                    pm00 pm00Var = this.$actionInfo;
                    this.L$0 = vprVar;
                    this.label = 4;
                } else if (i == 4) {
                    kotlin.b.b(obj);
                    z2e0 z2e0Var2 = this.this$0;
                    nm00 nm00Var2 = this.$newEvent;
                    this.L$0 = null;
                    this.label = 5;
                } else if (i != 5) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            }
            kotlin.b.b(obj);
        } else {
            kotlin.b.b(obj);
            ru.yandex.taxi.common_models.net.map_object.z zVar = this.$pointAction;
            if (zVar instanceof sfu0) {
                z2e0 z2e0Var3 = this.this$0;
                nm00 nm00Var3 = this.$prevEvent;
                this.L$0 = null;
                this.label = 1;
            } else if (zVar instanceof i0) {
                z2e0 z2e0Var4 = this.this$0;
                nm00 nm00Var4 = this.$prevEvent;
                this.L$0 = vprVar;
                this.label = 2;
            } else {
                hst hstVar = jst.e;
                Objects.toString(zVar);
                hstVar.getClass();
            }
        }
        return zy11.a;
    }
}
