package ru.yandex.taxi.logistics.sdk.tracking.impl.ui.dynamic_content;

import defpackage.fo;
import defpackage.gv90;
import defpackage.jw40;
import defpackage.kcz0;
import defpackage.kw40;
import defpackage.mu90;
import defpackage.mvg;
import defpackage.nn;
import defpackage.nr;
import defpackage.ny61;
import defpackage.pn;
import defpackage.rn;
import defpackage.sn;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.logistics.sdk.tracking.domain.api.models.ClickSource;
import ru.yandex.taxi.logistics.sdk.tracking.impl.domain.j;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.tracking.impl.ui.dynamic_content.DynamicContentListener$onListItemClick$1", f = "DynamicContentListener.kt", l = {65}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class DynamicContentListener$onListItemClick$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $metricaLabel;
    final /* synthetic */ gv90 $payload;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DynamicContentListener$onListItemClick$1(gv90 gv90Var, String str, Continuation continuation, c cVar) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$payload = gv90Var;
        this.$metricaLabel = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DynamicContentListener$onListItemClick$1(this.$payload, this.$metricaLabel, continuation, this.this$0);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DynamicContentListener$onListItemClick$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x004e, code lost:
    
        if (((r7 != null ? r7.c : null) instanceof defpackage.nn) != false) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a1  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        fo foVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            c cVar = this.this$0;
            gv90 gv90Var = this.$payload;
            String str = this.$metricaLabel;
            kcz0 kcz0Var = cVar.c;
            boolean z = gv90Var instanceof mu90;
            if (z) {
                nr nrVar = ((mu90) gv90Var).a;
                if (!(nrVar instanceof rn) && !(nrVar instanceof nn)) {
                    if (nrVar instanceof pn) {
                        jw40 jw40Var = ((pn) nrVar).d;
                        if (!(jw40Var.c.c instanceof nn)) {
                            kw40 kw40Var = jw40Var.d;
                        }
                    }
                }
                kcz0Var.x(str != null ? str.concat(".Tapped") : "SuperApp.Delivery.ExtNDD.RecipientInformation.ReschedulingDelivery", null);
                gv90 gv90Var2 = this.$payload;
                mu90 mu90Var = !(gv90Var2 instanceof mu90) ? (mu90) gv90Var2 : null;
                Object obj2 = mu90Var == null ? mu90Var.a : null;
                foVar = obj2 instanceof fo ? (fo) obj2 : null;
                c cVar2 = this.this$0;
                if (foVar == null) {
                    cVar2.y.L(foVar);
                } else {
                    j jVar = cVar2.b;
                    ClickSource clickSource = ClickSource.DYNAMIC_CONTENT_BLOCK;
                    this.label = 1;
                    if (jVar.b(gv90Var2, clickSource, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            }
            if (z && (((mu90) gv90Var).a instanceof sn)) {
                kcz0Var.x(str != null ? str.concat(".Tapped") : "SharedOrderCard.Tapped", kotlin.collections.b.i(new Pair("button_name", "extend_delivery_expiration_date"), new Pair("action_source", "content_item_button")));
            } else if (str != null) {
                kcz0Var.x(str.concat(".Tapped"), null);
            }
            gv90 gv90Var22 = this.$payload;
            if (!(gv90Var22 instanceof mu90)) {
            }
            if (mu90Var == null) {
            }
            if (obj2 instanceof fo) {
            }
            c cVar22 = this.this$0;
            if (foVar == null) {
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
