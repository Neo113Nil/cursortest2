package ru.yandex.taxi.summary.requirements.list.interactors;

import defpackage.b580;
import defpackage.ejj0;
import defpackage.g580;
import defpackage.jl40;
import defpackage.jmw0;
import defpackage.kf70;
import defpackage.lmw0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pex0;
import defpackage.q5z;
import defpackage.wls;
import defpackage.x8;
import defpackage.zy11;
import java.util.Collections;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "transferEnabled", "Lzy11;", "<anonymous>", "(Z)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.summary.requirements.list.interactors.TransferRequirementStateInteractor$subscribeTransferFeatureUpdates$2", f = "TransferRequirementStateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class TransferRequirementStateInteractor$subscribeTransferFeatureUpdates$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $optionName;
    final /* synthetic */ String $requirementName;
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ u0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransferRequirementStateInteractor$subscribeTransferFeatureUpdates$2(u0 u0Var, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = u0Var;
        this.$requirementName = str;
        this.$optionName = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TransferRequirementStateInteractor$subscribeTransferFeatureUpdates$2 transferRequirementStateInteractor$subscribeTransferFeatureUpdates$2 = new TransferRequirementStateInteractor$subscribeTransferFeatureUpdates$2(this.this$0, this.$requirementName, this.$optionName, continuation);
        transferRequirementStateInteractor$subscribeTransferFeatureUpdates$2.Z$0 = ((Boolean) obj).booleanValue();
        return transferRequirementStateInteractor$subscribeTransferFeatureUpdates$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        TransferRequirementStateInteractor$subscribeTransferFeatureUpdates$2 transferRequirementStateInteractor$subscribeTransferFeatureUpdates$2 = (TransferRequirementStateInteractor$subscribeTransferFeatureUpdates$2) create(bool, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        transferRequirementStateInteractor$subscribeTransferFeatureUpdates$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object obj3;
        kf70 kf70Var;
        boolean z = this.Z$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        b580 b580Var = null;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        boolean a = u0.a(this.this$0, this.$requirementName);
        if (z && !a) {
            u0 u0Var = this.this$0;
            String str = this.$requirementName;
            String str2 = this.$optionName;
            g580 g580Var = u0Var.e;
            pex0 a2 = u0Var.c.a();
            if (a2 != null) {
                Iterator it = a2.f().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it.next();
                    if (jl40.l(((lmw0) obj2).getName(), str)) {
                        break;
                    }
                }
                jmw0 jmw0Var = obj2 instanceof jmw0 ? (jmw0) obj2 : null;
                if (jmw0Var != null) {
                    Iterator it2 = jmw0Var.s().c.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj3 = null;
                            break;
                        }
                        obj3 = it2.next();
                        if (jl40.l(((ejj0) obj3).a, str2)) {
                            break;
                        }
                    }
                    ejj0 ejj0Var = (ejj0) obj3;
                    if (ejj0Var != null && (kf70Var = ejj0Var.l) != null) {
                        b580Var = new b580(jmw0Var.getName(), "select", jmw0Var.getLabel(), q5z.h0(kf70Var), Collections.singletonList(ejj0Var.a), 32);
                    }
                }
            }
            if (b580Var != null) {
                x8 x8Var = (x8) g580Var;
                x8Var.c(b580Var, true);
                x8Var.a();
            }
        } else if (!z && a) {
            u0 u0Var2 = this.this$0;
            String str3 = this.$requirementName;
            x8 x8Var2 = (x8) u0Var2.e;
            x8Var2.d(str3);
            x8Var2.a();
            this.this$0.b.f();
        }
        return zy11.a;
    }
}
