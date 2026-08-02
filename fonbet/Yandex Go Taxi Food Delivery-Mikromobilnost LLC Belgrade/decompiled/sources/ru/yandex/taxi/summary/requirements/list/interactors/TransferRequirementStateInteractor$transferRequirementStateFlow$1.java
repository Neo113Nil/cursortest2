package ru.yandex.taxi.summary.requirements.list.interactors;

import com.yandex.go.transfer_requirement.experiment.TransferRequirementExperiment;
import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.ct01;
import defpackage.d6z;
import defpackage.dms;
import defpackage.dp01;
import defpackage.ejj0;
import defpackage.jl40;
import defpackage.jmw0;
import defpackage.lmw0;
import defpackage.mi31;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.vfx0;
import defpackage.vg70;
import defpackage.zy11;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lmi31;", "verticalTariff", "", BackendConfig.Restrictions.ENABLED, "", "title", "subtitle", "Lf6v;", "Lufx0;", "Lct01;", "<anonymous>", "(Lmi31;ZLjava/lang/String;Ljava/lang/String;)Lf6v;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.summary.requirements.list.interactors.TransferRequirementStateInteractor$transferRequirementStateFlow$1", f = "TransferRequirementStateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class TransferRequirementStateInteractor$transferRequirementStateFlow$1 extends SuspendLambda implements dms {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ u0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransferRequirementStateInteractor$transferRequirementStateFlow$1(u0 u0Var, Continuation continuation) {
        super(5, continuation);
        this.this$0 = u0Var;
    }

    @Override // defpackage.dms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        TransferRequirementStateInteractor$transferRequirementStateFlow$1 transferRequirementStateInteractor$transferRequirementStateFlow$1 = new TransferRequirementStateInteractor$transferRequirementStateFlow$1(this.this$0, (Continuation) obj5);
        transferRequirementStateInteractor$transferRequirementStateFlow$1.L$0 = (mi31) obj;
        transferRequirementStateInteractor$transferRequirementStateFlow$1.Z$0 = booleanValue;
        transferRequirementStateInteractor$transferRequirementStateFlow$1.L$1 = (String) obj3;
        transferRequirementStateInteractor$transferRequirementStateFlow$1.L$2 = (String) obj4;
        return transferRequirementStateInteractor$transferRequirementStateFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        ejj0 ejj0Var;
        String str;
        String str2;
        vg70 s;
        Object obj3;
        mi31 mi31Var = (mi31) this.L$0;
        boolean z = this.Z$0;
        String str3 = (String) this.L$1;
        String str4 = (String) this.L$2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        boolean z2 = ((dp01) this.this$0.d()).c.d().b;
        u0 u0Var = this.this$0;
        ct01 ct01Var = ct01.f;
        if (!z2) {
            u0Var.a.getClass();
            return ru.yandex.taxi.requirements.utils.c.b(ct01Var, vfx0.a(mi31Var));
        }
        String str5 = ((dp01) u0Var.d()).c.d().d;
        String str6 = ((dp01) this.this$0.d()).c.d().e;
        if (str5 == null || str5.length() == 0 || str6 == null || str6.length() == 0) {
            this.this$0.a.getClass();
            return ru.yandex.taxi.requirements.utils.c.b(ct01Var, vfx0.a(mi31Var));
        }
        Iterator it = mi31Var.a.f().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (jl40.l(((lmw0) obj2).getName(), str5)) {
                break;
            }
        }
        jmw0 jmw0Var = obj2 instanceof jmw0 ? (jmw0) obj2 : null;
        if (jmw0Var == null || (s = jmw0Var.s()) == null) {
            ejj0Var = null;
        } else {
            Iterator it2 = s.c.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj3 = null;
                    break;
                }
                obj3 = it2.next();
                if (jl40.l(((ejj0) obj3).a, str6)) {
                    break;
                }
            }
            ejj0Var = (ejj0) obj3;
        }
        if (jmw0Var == null || ejj0Var == null) {
            this.this$0.a.getClass();
            return ru.yandex.taxi.requirements.utils.c.b(ct01Var, vfx0.a(mi31Var));
        }
        String str7 = str3;
        if (str7 == null) {
            TransferRequirementExperiment d = ((dp01) this.this$0.d()).c.d();
            TransferRequirementExperiment.RequirementItemDto requirementItemDto = d.g;
            str7 = (requirementItemDto == null || (str2 = requirementItemDto.a) == null) ? null : d6z.Y(d, str2);
            if (str7 == null) {
                str7 = jmw0Var.getLabel();
            }
        }
        if (str4 == null) {
            TransferRequirementExperiment d2 = ((dp01) this.this$0.d()).c.d();
            TransferRequirementExperiment.RequirementItemDto requirementItemDto2 = d2.g;
            str4 = (requirementItemDto2 == null || (str = requirementItemDto2.b) == null) ? null : d6z.Y(d2, str);
        }
        String str8 = str4;
        TransferRequirementExperiment.RequirementItemDto requirementItemDto3 = ((dp01) this.this$0.d()).c.d().g;
        ct01 ct01Var2 = new ct01(str7, str8, requirementItemDto3 != null ? requirementItemDto3.c : null, true, z);
        this.this$0.a.getClass();
        return ru.yandex.taxi.requirements.utils.c.b(ct01Var2, vfx0.a(mi31Var));
    }
}
