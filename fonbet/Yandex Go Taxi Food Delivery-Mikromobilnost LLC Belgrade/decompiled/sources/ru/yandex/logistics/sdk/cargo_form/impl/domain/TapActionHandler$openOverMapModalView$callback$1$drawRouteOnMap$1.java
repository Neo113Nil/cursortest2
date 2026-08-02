package ru.yandex.logistics.sdk.cargo_form.impl.domain;

import com.google.android.gms.location.DeviceOrientationRequest;
import defpackage.c9x0;
import defpackage.f5s;
import defpackage.gci0;
import defpackage.gp00;
import defpackage.h5s;
import defpackage.hp00;
import defpackage.ip00;
import defpackage.j5s;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qoi0;
import defpackage.ryh;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.logistics.sdk.cargo_form.impl.domain.TapActionHandler$openOverMapModalView$callback$1$drawRouteOnMap$1", f = "TapActionHandler.kt", l = {288}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class TapActionHandler$openOverMapModalView$callback$1$drawRouteOnMap$1 extends SuspendLambda implements wls {
    final /* synthetic */ c9x0 $action;
    int label;
    final /* synthetic */ c this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 3, 0})
    @mvg(c = "ru.yandex.logistics.sdk.cargo_form.impl.domain.TapActionHandler$openOverMapModalView$callback$1$drawRouteOnMap$1$1", f = "TapActionHandler.kt", l = {289}, m = "invokeSuspend", v = 2)
    /* renamed from: ru.yandex.logistics.sdk.cargo_form.impl.domain.TapActionHandler$openOverMapModalView$callback$1$drawRouteOnMap$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ c9x0 $action;
        int label;
        final /* synthetic */ c this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(c cVar, c9x0 c9x0Var, Continuation continuation) {
            super(2, continuation);
            this.this$0 = cVar;
            this.$action = c9x0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.this$0, this.$action, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object obj2;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            List list = null;
            if (i == 0) {
                kotlin.b.b(obj);
                gci0 gci0Var = this.this$0.m.c;
                TapActionHandler$openOverMapModalView$callback$1$drawRouteOnMap$1$1$override$1 tapActionHandler$openOverMapModalView$callback$1$drawRouteOnMap$1$1$override$1 = new TapActionHandler$openOverMapModalView$callback$1$drawRouteOnMap$1$1$override$1(this.$action, null);
                this.label = 1;
                obj = e.x(gci0Var, tapActionHandler$openOverMapModalView$callback$1$drawRouteOnMap$1$1$override$1, this);
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
            j5s j5sVar = (j5s) obj;
            if (j5sVar != null) {
                ArrayList arrayList = j5sVar.e;
                c9x0 c9x0Var = this.$action;
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it.next();
                    if (jl40.l(((h5s) obj2).getId(), c9x0Var.a)) {
                        break;
                    }
                }
                h5s h5sVar = (h5s) obj2;
                if (h5sVar != null) {
                    c cVar = this.this$0;
                    if (h5sVar instanceof f5s) {
                        ryh ryhVar = cVar.b.a;
                        ryhVar.getClass();
                        ip00 ip00Var = ((f5s) h5sVar).c;
                        if (ip00Var instanceof gp00) {
                            list = ((gp00) ip00Var).a;
                        } else if (!(ip00Var instanceof hp00)) {
                            w511.b();
                            return null;
                        }
                        ((com.yandex.go.logistics.cargo_flow.a) ryhVar.b).e0.a(qoi0.a(ryh.class), list, false);
                    }
                    return zy11.a;
                }
            }
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TapActionHandler$openOverMapModalView$callback$1$drawRouteOnMap$1(c cVar, c9x0 c9x0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$action = c9x0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TapActionHandler$openOverMapModalView$callback$1$drawRouteOnMap$1(this.this$0, this.$action, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TapActionHandler$openOverMapModalView$callback$1$drawRouteOnMap$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$action, null);
            this.label = 1;
            if (kotlinx.coroutines.a.w(DeviceOrientationRequest.OUTPUT_PERIOD_DEFAULT, anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
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
