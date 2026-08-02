package ru.yandex.taxi.sdc.router;

import android.content.Context;
import defpackage.a4t;
import defpackage.bd;
import defpackage.dd;
import defpackage.ed;
import defpackage.ely;
import defpackage.fc;
import defpackage.lc;
import defpackage.m2v;
import defpackage.mc;
import defpackage.ml50;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qco;
import defpackage.rco;
import defpackage.rut;
import defpackage.s0g;
import defpackage.t0g;
import defpackage.t1b0;
import defpackage.tse;
import defpackage.u45;
import defpackage.wls;
import defpackage.y4;
import defpackage.zy11;
import java.util.function.Consumer;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.preorder.AcceptEulaDialog;
import ru.yandex.taxi.sdc.presentation.AcceptEulaDialogV2;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.sdc.router.AcceptEulaDialogRouter$showAcceptEulaDialog$1", f = "AcceptEulaDialogRouter.kt", l = {46}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class AcceptEulaDialogRouter$showAcceptEulaDialog$1 extends SuspendLambda implements wls {
    final /* synthetic */ dd $acceptance;
    final /* synthetic */ Consumer<dd> $eulaAccepted;
    final /* synthetic */ Runnable $onCancel;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AcceptEulaDialogRouter$showAcceptEulaDialog$1(a aVar, dd ddVar, Consumer consumer, Runnable runnable, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$acceptance = ddVar;
        this.$eulaAccepted = consumer;
        this.$onCancel = runnable;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AcceptEulaDialogRouter$showAcceptEulaDialog$1(this.this$0, this.$acceptance, this.$eulaAccepted, this.$onCancel, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AcceptEulaDialogRouter$showAcceptEulaDialog$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        u45 acceptEulaDialogV2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            t1b0 t1b0Var = this.this$0.i;
            this.label = 1;
            obj = t1b0Var.b(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        ml50 ml50Var = (ml50) obj;
        a aVar = this.this$0;
        dd ddVar = this.$acceptance;
        Consumer<dd> consumer = this.$eulaAccepted;
        Runnable runnable = this.$onCancel;
        if (ddVar instanceof bd) {
            rco rcoVar = aVar.d;
            bd bdVar = (bd) ddVar;
            String str = bdVar.a;
            rcoVar.getClass();
            qco a = rco.a(str, ml50Var);
            fc fcVar = new fc(consumer, ddVar, runnable);
            if (a == null) {
                m2v m2vVar = aVar.b.a;
                acceptEulaDialogV2 = new AcceptEulaDialog((Context) ((t0g) m2vVar.a).get(), (ed) ((s0g) m2vVar.b).get(), (ru.yandex.taxi.utils.c) ((a4t) m2vVar.c).get(), bdVar, (ely) ((rut) m2vVar.w).get()).withCallback(fcVar);
            } else {
                lc lcVar = aVar.c;
                y4 y4Var = new y4(6, aVar);
                mc mcVar = lcVar.a;
                acceptEulaDialogV2 = new AcceptEulaDialogV2((Context) mcVar.a.get(), (ed) mcVar.b.get(), bdVar, a, fcVar, y4Var);
            }
            aVar.a.a().k(acceptEulaDialogV2, 2.0f, true);
        } else {
            aVar.getClass();
        }
        return zy11.a;
    }
}
