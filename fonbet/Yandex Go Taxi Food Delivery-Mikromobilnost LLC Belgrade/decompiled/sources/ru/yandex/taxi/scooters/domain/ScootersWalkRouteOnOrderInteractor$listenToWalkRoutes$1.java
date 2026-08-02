package ru.yandex.taxi.scooters.domain;

import defpackage.d641;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import defpackage.zzs;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lzzs;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.scooters.domain.ScootersWalkRouteOnOrderInteractor$listenToWalkRoutes$1", f = "ScootersWalkRouteOnOrderInteractor.kt", l = {33, 33}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class ScootersWalkRouteOnOrderInteractor$listenToWalkRoutes$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $objectId;
    final /* synthetic */ zzs $objectPosition;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ s this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersWalkRouteOnOrderInteractor$listenToWalkRoutes$1(zzs zzsVar, String str, Continuation continuation, s sVar) {
        super(2, continuation);
        this.this$0 = sVar;
        this.$objectId = str;
        this.$objectPosition = zzsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        s sVar = this.this$0;
        ScootersWalkRouteOnOrderInteractor$listenToWalkRoutes$1 scootersWalkRouteOnOrderInteractor$listenToWalkRoutes$1 = new ScootersWalkRouteOnOrderInteractor$listenToWalkRoutes$1(this.$objectPosition, this.$objectId, continuation, sVar);
        scootersWalkRouteOnOrderInteractor$listenToWalkRoutes$1.L$0 = obj;
        return scootersWalkRouteOnOrderInteractor$listenToWalkRoutes$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersWalkRouteOnOrderInteractor$listenToWalkRoutes$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0054, code lost:
    
        if (r0.emit(r8, r7) == r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0056, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0047, code lost:
    
        if (r8 == r1) goto L22;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            s sVar = this.this$0;
            String str = this.$objectId;
            zzs zzsVar = this.$objectPosition;
            this.L$0 = null;
            this.L$1 = vprVar;
            this.label = 1;
            if (zzsVar == null) {
                d641 d641Var = sVar.c;
                if (d641Var == null) {
                    d641Var = null;
                }
                obj = kotlinx.coroutines.flow.e.y(d641Var.a(str), this);
            } else {
                sVar.getClass();
                obj = zzsVar;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            vprVar = (vpr) this.L$1;
            kotlin.b.b(obj);
        }
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
    }
}
