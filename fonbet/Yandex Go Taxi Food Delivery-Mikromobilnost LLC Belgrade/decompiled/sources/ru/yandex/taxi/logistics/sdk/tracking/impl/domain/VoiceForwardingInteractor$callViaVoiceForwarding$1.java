package ru.yandex.taxi.logistics.sdk.tracking.impl.domain;

import com.yandex.delivery.mapper.model.ForwardingId;
import defpackage.hh31;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.py31;
import defpackage.qej;
import defpackage.qy31;
import defpackage.ry31;
import defpackage.rzh0;
import defpackage.sy31;
import defpackage.tse;
import defpackage.uy31;
import defpackage.uzh0;
import defpackage.viv;
import defpackage.vwa0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.tracking.impl.domain.VoiceForwardingInteractor$callViaVoiceForwarding$1", f = "VoiceForwardingInteractor.kt", l = {67}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class VoiceForwardingInteractor$callViaVoiceForwarding$1 extends SuspendLambda implements wls {
    final /* synthetic */ ForwardingId $forwardingId;
    final /* synthetic */ vwa0 $performer;
    int label;
    final /* synthetic */ uy31 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceForwardingInteractor$callViaVoiceForwarding$1(uy31 uy31Var, ForwardingId forwardingId, vwa0 vwa0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = uy31Var;
        this.$forwardingId = forwardingId;
        this.$performer = vwa0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new VoiceForwardingInteractor$callViaVoiceForwarding$1(this.this$0, this.$forwardingId, this.$performer, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((VoiceForwardingInteractor$callViaVoiceForwarding$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                if (((Boolean) this.this$0.h.getValue()).booleanValue()) {
                    return zy11Var;
                }
                r0 r0Var = this.this$0.h;
                Boolean bool = Boolean.TRUE;
                r0Var.getClass();
                r0Var.m(null, bool);
                uy31 uy31Var = this.this$0;
                ru.yandex.taxi.logistics.sdk.voiceforwarding.impl.c cVar = uy31Var.b;
                String str = uy31Var.d.a;
                ForwardingId forwardingId = this.$forwardingId;
                this.label = 1;
                a = cVar.a(str, forwardingId, this);
                if (a == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                a = obj;
            }
            sy31 sy31Var = (sy31) a;
            if (sy31Var instanceof ry31) {
                String str2 = ((ry31) sy31Var).a.a + "," + ((ry31) sy31Var).c;
                viv vivVar = ((ry31) sy31Var).b;
                uy31 uy31Var2 = this.this$0;
                if (vivVar != null) {
                    uy31Var2.f.a(this.$performer, str2, vivVar, new hh31(9, uy31Var2, str2));
                } else {
                    uy31Var2.e.a(str2);
                }
            } else if (sy31Var instanceof qy31) {
                this.this$0.c.b(new qej(null, this.this$0.a.a(uzh0.logistics_voice_forwarding_request_error, new Object[0]), this.this$0.a.a(rzh0.logistics_ok_button, new Object[0]), null, null, false, null, null, 249));
            } else if (!jl40.l(sy31Var, py31.a)) {
                throw new NoWhenBranchMatchedException();
            }
            return zy11Var;
        } finally {
            r0 r0Var2 = this.this$0.h;
            Boolean bool2 = Boolean.FALSE;
            r0Var2.getClass();
            r0Var2.m(null, bool2);
        }
    }
}
