package ru.yandex.taxi.summary.solid.modal_on_order.domain;

import com.yandex.go.taxi.tariffs.internal.repository.k;
import defpackage.dmv0;
import defpackage.fnx0;
import defpackage.ilv0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pex0;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.wu1;
import defpackage.x880;
import defpackage.y880;
import defpackage.zkv0;
import defpackage.zy11;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.communications.model.ConfigurationType;
import ru.yandex.taxi.summary.promotions.models.SummaryPromotionsResponse;
import ru.yandex.taxi.summary.promotions.repository.e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.summary.solid.modal_on_order.domain.SummaryPromotionsOrderPart$execute$1", f = "SummaryPromotionsOrderPart.kt", l = {42, 53}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class SummaryPromotionsOrderPart$execute$1 extends SuspendLambda implements wls {
    final /* synthetic */ x880 $chainCallback;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SummaryPromotionsOrderPart$execute$1(c cVar, x880 x880Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$chainCallback = x880Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SummaryPromotionsOrderPart$execute$1(this.this$0, this.$chainCallback, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SummaryPromotionsOrderPart$execute$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00e8, code lost:
    
        if (r1.a(r15, r14) == r0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ea, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0064, code lost:
    
        if (r15 == r0) goto L34;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        d dVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        List<zkv0> list = EmptyList.a;
        final int i2 = 1;
        if (i == 0) {
            kotlin.b.b(obj);
            dVar = new d();
            dmv0 dmv0Var = this.this$0.b;
            this.L$0 = dVar;
            this.label = 1;
            fnx0 n = ((k) dmv0Var.a).n();
            if (n == null) {
                obj = list;
            } else {
                e eVar = dmv0Var.b;
                pex0 pex0Var = n.c;
                String str = pex0Var.b;
                wu1 wu1Var = pex0Var.O;
                obj = eVar.i(str, wu1Var != null ? wu1Var.a() : null, Collections.singletonList(SummaryPromotionsResponse.DisplayOnType.ORDER_BUTTON), this);
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return zy11.a;
            }
            dVar = (d) this.L$0;
            kotlin.b.b(obj);
        }
        List<ilv0> list2 = (List) obj;
        dmv0 dmv0Var2 = this.this$0.b;
        fnx0 n2 = ((k) dmv0Var2.a).n();
        if (n2 != null) {
            list = dmv0Var2.b.j(n2.c.b, n2.d, !r2.g(), Collections.singletonList(SummaryPromotionsResponse.DisplayOnType.ORDER_BUTTON), Collections.singletonList(ConfigurationType.MODAL_WINDOW)).a;
        }
        for (final ilv0 ilv0Var : list2) {
            final c cVar = this.this$0;
            cVar.getClass();
            final int i3 = 0;
            dVar.a.add(new y880() { // from class: ru.yandex.taxi.summary.solid.modal_on_order.domain.b
                @Override // defpackage.y880
                public final void a(x880 x880Var) {
                    int i4 = i3;
                    Object obj2 = ilv0Var;
                    c cVar2 = cVar;
                    switch (i4) {
                        case 0:
                            tje.N(cVar2.a, null, null, new SummaryPromotionsOrderPart$modalWindowPromotionsPart$1$1((ilv0) obj2, cVar2, x880Var, null), 3);
                            break;
                        default:
                            tje.N(cVar2.a, null, null, new SummaryPromotionsOrderPart$promotionPart$1$1(cVar2, (zkv0) obj2, x880Var, null), 3);
                            break;
                    }
                }
            });
        }
        for (final zkv0 zkv0Var : list) {
            final c cVar2 = this.this$0;
            cVar2.getClass();
            dVar.a.add(new y880() { // from class: ru.yandex.taxi.summary.solid.modal_on_order.domain.b
                @Override // defpackage.y880
                public final void a(x880 x880Var) {
                    int i4 = i2;
                    Object obj2 = zkv0Var;
                    c cVar22 = cVar2;
                    switch (i4) {
                        case 0:
                            tje.N(cVar22.a, null, null, new SummaryPromotionsOrderPart$modalWindowPromotionsPart$1$1((ilv0) obj2, cVar22, x880Var, null), 3);
                            break;
                        default:
                            tje.N(cVar22.a, null, null, new SummaryPromotionsOrderPart$promotionPart$1$1(cVar22, (zkv0) obj2, x880Var, null), 3);
                            break;
                    }
                }
            });
        }
        x880 x880Var = this.$chainCallback;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.label = 2;
    }
}
