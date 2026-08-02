package ru.yandex.taxi.delivery.interactors;

import com.ybsdk.widgets.common.BlendingGradientView;
import defpackage.kyh0;
import defpackage.m4f;
import defpackage.mvg;
import defpackage.n4f;
import defpackage.n6i;
import defpackage.ny61;
import defpackage.p1a0;
import defpackage.qbi;
import defpackage.rbi;
import defpackage.sbi;
import defpackage.t8i;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.ybi;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.delivery.interactors.CreateDeliveryDraftInteractor$launchCreateDelivery$1", f = "CreateDeliveryDraftInteractor.kt", l = {BlendingGradientView.BASE_ALPHA}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class CreateDeliveryDraftInteractor$launchCreateDelivery$1 extends SuspendLambda implements wls {
    final /* synthetic */ m4f $draftSnapshot;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateDeliveryDraftInteractor$launchCreateDelivery$1(m4f m4fVar, a aVar, Continuation continuation) {
        super(2, continuation);
        this.$draftSnapshot = m4fVar;
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CreateDeliveryDraftInteractor$launchCreateDelivery$1(this.$draftSnapshot, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CreateDeliveryDraftInteractor$launchCreateDelivery$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List list;
        UUID uuid;
        PaymentMethod$Type paymentMethod$Type;
        UUID uuid2;
        p1a0 p1a0Var;
        r0 r0Var;
        Object value;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            m4f m4fVar = this.$draftSnapshot;
            n4f n4fVar = m4fVar.f;
            PaymentMethod$Type paymentMethod$Type2 = n4fVar.a;
            String str = n4fVar.b;
            list = n4fVar.c;
            UUID uuid3 = m4fVar.b;
            if (paymentMethod$Type2 != PaymentMethod$Type.GOOGLE_PAY) {
                p1a0 p1a0Var2 = new p1a0(paymentMethod$Type2.getCode(), str, list);
                uuid2 = uuid3;
                p1a0Var = p1a0Var2;
                ArrayList m0 = kotlin.collections.a.m0(this.$draftSnapshot.e, Collections.singletonList(this.$draftSnapshot.d));
                List singletonList = Collections.singletonList(this.$draftSnapshot.a);
                m4f m4fVar2 = this.$draftSnapshot;
                n6i n6iVar = new n6i(singletonList, m4fVar2.i, m4fVar2.c, p1a0Var, m4fVar2.g, m0, m4fVar2.h);
                t8i t8iVar = this.this$0.i;
                r0Var = t8iVar.a;
                do {
                    value = r0Var.getValue();
                } while (!r0Var.k(value, t8i.a.b));
                t8iVar.c = null;
                this.this$0.d.c(n6iVar, Collections.singletonList(uuid2), false);
                return zy11Var;
            }
            this.this$0.d.a.g(uuid3);
            ybi ybiVar = this.this$0.c;
            this.L$0 = paymentMethod$Type2;
            this.L$1 = null;
            this.L$2 = list;
            this.L$3 = uuid3;
            this.label = 1;
            Object y = kotlinx.coroutines.flow.e.y(new kotlinx.coroutines.flow.o(new j(((com.yandex.go.payments.googlepay.domain.e) ybiVar.c).l()), new DeliveryGooglePayInteractor$getGooglePayCardId$3(3, null)), this);
            if (y == coroutineSingletons) {
                return coroutineSingletons;
            }
            uuid = uuid3;
            obj = y;
            paymentMethod$Type = paymentMethod$Type2;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uuid = (UUID) this.L$3;
            list = (List) this.L$2;
            paymentMethod$Type = (PaymentMethod$Type) this.L$0;
            kotlin.b.b(obj);
        }
        sbi sbiVar = (sbi) obj;
        if (!(sbiVar instanceof rbi)) {
            if (!(sbiVar instanceof qbi)) {
                w511.b();
                return null;
            }
            this.this$0.d.a.l(uuid);
            this.this$0.c.b.a().setMessage(kyh0.common_unknown_error).setPositiveButton(kyh0.common_ok).show();
            return zy11Var;
        }
        p1a0 p1a0Var3 = new p1a0(paymentMethod$Type.getCode(), ((rbi) sbiVar).a, list);
        uuid2 = uuid;
        p1a0Var = p1a0Var3;
        ArrayList m02 = kotlin.collections.a.m0(this.$draftSnapshot.e, Collections.singletonList(this.$draftSnapshot.d));
        List singletonList2 = Collections.singletonList(this.$draftSnapshot.a);
        m4f m4fVar22 = this.$draftSnapshot;
        n6i n6iVar2 = new n6i(singletonList2, m4fVar22.i, m4fVar22.c, p1a0Var, m4fVar22.g, m02, m4fVar22.h);
        t8i t8iVar2 = this.this$0.i;
        r0Var = t8iVar2.a;
        do {
            value = r0Var.getValue();
        } while (!r0Var.k(value, t8i.a.b));
        t8iVar2.c = null;
        this.this$0.d.c(n6iVar2, Collections.singletonList(uuid2), false);
        return zy11Var;
    }
}
