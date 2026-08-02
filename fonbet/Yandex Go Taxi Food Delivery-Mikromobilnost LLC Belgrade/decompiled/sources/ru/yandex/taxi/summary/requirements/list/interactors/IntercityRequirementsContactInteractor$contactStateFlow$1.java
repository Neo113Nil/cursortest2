package ru.yandex.taxi.summary.requirements.list.interactors;

import defpackage.bgq0;
import defpackage.evu0;
import defpackage.f6v;
import defpackage.f9w;
import defpackage.g9w;
import defpackage.h6v;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lbgq0;", "contact", "Lf6v;", "Lufx0;", "Lf9w;", "configWithTariffIdentifiable", "Lg9w;", "<anonymous>", "(Lbgq0;Lf6v;)Lf6v;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.summary.requirements.list.interactors.IntercityRequirementsContactInteractor$contactStateFlow$1", f = "IntercityRequirementsContactInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class IntercityRequirementsContactInteractor$contactStateFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ o this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntercityRequirementsContactInteractor$contactStateFlow$1(o oVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = oVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        IntercityRequirementsContactInteractor$contactStateFlow$1 intercityRequirementsContactInteractor$contactStateFlow$1 = new IntercityRequirementsContactInteractor$contactStateFlow$1(this.this$0, (Continuation) obj3);
        intercityRequirementsContactInteractor$contactStateFlow$1.L$0 = (bgq0) obj;
        intercityRequirementsContactInteractor$contactStateFlow$1.L$1 = (f6v) obj2;
        return intercityRequirementsContactInteractor$contactStateFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        bgq0 bgq0Var = (bgq0) this.L$0;
        f6v f6vVar = (f6v) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        g9w g9wVar = null;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        o oVar = this.this$0;
        h6v h6vVar = f6vVar.a;
        f9w f9wVar = (f9w) f6vVar.b;
        if (f9wVar != null) {
            String str2 = f9wVar.b;
            oVar.getClass();
            if (bgq0Var == null) {
                str = f9wVar.c;
            } else {
                str = bgq0Var.a;
                if (evu0.J(str)) {
                    str = bgq0Var.b;
                }
            }
            g9wVar = new g9w(str2, str, f9wVar.a, bgq0Var != null);
        }
        return new f6v(h6vVar, g9wVar);
    }
}
