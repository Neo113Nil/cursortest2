package ru.yandex.taxi.logistics.sdk.tracking.impl.domain;

import defpackage.msc;
import defpackage.mvg;
import defpackage.nsc;
import defpackage.ny61;
import defpackage.osc;
import defpackage.psc;
import defpackage.tje;
import defpackage.tse;
import defpackage.uy31;
import defpackage.vwa0;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.logistics.sdk.permissions.api.Permission;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.tracking.impl.domain.TrackingActionsHandler$onCall$1", f = "TrackingActionsHandler.kt", l = {331, 335}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class TrackingActionsHandler$onCall$1 extends SuspendLambda implements wls {
    final /* synthetic */ psc $communicationMethod;
    final /* synthetic */ vwa0 $performer;
    boolean Z$0;
    int label;
    final /* synthetic */ l this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrackingActionsHandler$onCall$1(l lVar, psc pscVar, vwa0 vwa0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = lVar;
        this.$communicationMethod = pscVar;
        this.$performer = vwa0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TrackingActionsHandler$onCall$1(this.this$0, this.$communicationMethod, this.$performer, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TrackingActionsHandler$onCall$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0079, code lost:
    
        if (r1.b(r5) == r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007b, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x002c, code lost:
    
        if (r6 == r0) goto L28;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            b bVar = this.this$0.h;
            this.label = 1;
            obj = bVar.c.a(Permission.CALL, this);
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        l lVar = this.this$0;
        if (booleanValue) {
            uy31 uy31Var = lVar.g;
            psc pscVar = this.$communicationMethod;
            vwa0 vwa0Var = this.$performer;
            if (pscVar instanceof msc) {
                uy31Var.e.a(((msc) pscVar).a.a);
            } else {
                uy31Var.getClass();
                if (pscVar instanceof osc) {
                    tje.N(uy31Var.g, null, null, new VoiceForwardingInteractor$callViaVoiceForwarding$1(uy31Var, ((osc) pscVar).a, vwa0Var, null), 3);
                } else if (!(pscVar instanceof nsc)) {
                    w511.b();
                    return null;
                }
            }
        } else {
            b bVar2 = lVar.h;
            this.Z$0 = booleanValue;
            this.label = 2;
        }
        return zy11.a;
    }
}
