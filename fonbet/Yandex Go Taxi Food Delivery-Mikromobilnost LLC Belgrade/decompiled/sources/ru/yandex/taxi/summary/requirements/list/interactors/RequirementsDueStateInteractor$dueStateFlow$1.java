package ru.yandex.taxi.summary.requirements.list.interactors;

import com.yandex.go.zone.model.Zone;
import defpackage.avj0;
import defpackage.b580;
import defpackage.bms;
import defpackage.d6z;
import defpackage.dwh0;
import defpackage.g8e;
import defpackage.hoj0;
import defpackage.ioj0;
import defpackage.iom0;
import defpackage.jbn;
import defpackage.jl40;
import defpackage.kyh0;
import defpackage.kzo;
import defpackage.mi31;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pex0;
import defpackage.vfx0;
import defpackage.zuj0;
import defpackage.zy11;
import java.util.Calendar;
import java.util.Iterator;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.requirements.experiments.TariffCardPreorderCellCustomizationExperiment;
import ru.yandex.taxi.summary.requirements.list.models.RequirementsDueViewPosition;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lhoj0;", "availability", "Lzy11;", "<unused var>", "Lmi31;", "verticalTariff", "Lf6v;", "Lufx0;", "Lioj0;", "<anonymous>", "(Lru/yandex/taxi/summary/requirements/list/interactors/RequirementsDueStateInteractor$DueAvailability;VLru/yandex/taxi/tariffs/model/verticals/VerticalTariff;)Lru/yandex/taxi/requirements/utils/Identifiable;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.summary.requirements.list.interactors.RequirementsDueStateInteractor$dueStateFlow$1", f = "RequirementsDueStateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class RequirementsDueStateInteractor$dueStateFlow$1 extends SuspendLambda implements bms {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ y this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RequirementsDueStateInteractor$dueStateFlow$1(y yVar, Continuation continuation) {
        super(4, continuation);
        this.this$0 = yVar;
    }

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        RequirementsDueStateInteractor$dueStateFlow$1 requirementsDueStateInteractor$dueStateFlow$1 = new RequirementsDueStateInteractor$dueStateFlow$1(this.this$0, (Continuation) obj4);
        requirementsDueStateInteractor$dueStateFlow$1.L$0 = (hoj0) obj;
        requirementsDueStateInteractor$dueStateFlow$1.L$1 = (mi31) obj3;
        return requirementsDueStateInteractor$dueStateFlow$1.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x017d  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        kzo kzoVar;
        String h;
        Object obj2;
        String str;
        ioj0 ioj0Var;
        Zone c;
        hoj0 hoj0Var = (hoj0) this.L$0;
        mi31 mi31Var = (mi31) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        y yVar = this.this$0;
        pex0 pex0Var = mi31Var.a;
        yVar.getClass();
        if (hoj0Var.a) {
            ioj0Var = new ioj0("", "", false, false, false, null, RequirementsDueViewPosition.DEFAULT, "");
        } else {
            boolean c2 = yVar.d.c();
            boolean z = hoj0Var.b;
            String str2 = pex0Var.b;
            TariffCardPreorderCellCustomizationExperiment tariffCardPreorderCellCustomizationExperiment = (TariffCardPreorderCellCustomizationExperiment) yVar.k.a.b();
            TariffCardPreorderCellCustomizationExperiment.PreorderCardTariffParametersDto preorderCardTariffParametersDto = (TariffCardPreorderCellCustomizationExperiment.PreorderCardTariffParametersDto) tariffCardPreorderCellCustomizationExperiment.c.get(str2);
            if (preorderCardTariffParametersDto != null) {
                String str3 = preorderCardTariffParametersDto.a;
                String str4 = preorderCardTariffParametersDto.b;
                String Y = str4 != null ? d6z.Y(tariffCardPreorderCellCustomizationExperiment, str4) : null;
                String str5 = preorderCardTariffParametersDto.c;
                String Y2 = str5 != null ? d6z.Y(tariffCardPreorderCellCustomizationExperiment, str5) : null;
                TariffCardPreorderCellCustomizationExperiment.PreorderCardTariffParametersDto.PreorderCardPosition preorderCardPosition = preorderCardTariffParametersDto.d;
                kzoVar = new kzo(str3, Y, Y2, (preorderCardPosition != null ? preorderCardPosition.a : null) == TariffCardPreorderCellCustomizationExperiment.PreorderCardTariffParametersDto.PreorderCardPosition.CardPositionSection.GLUED, 10);
            } else {
                kzoVar = null;
            }
            boolean z2 = hoj0Var.c;
            zuj0 zuj0Var = yVar.i;
            int[] a = yVar.c.a();
            if (!z2 && a.length == 1 && ((c = yVar.b.c()) == null || !c.e)) {
                avj0 avj0Var = (avj0) zuj0Var;
                h = g8e.p(avj0Var.h(kyh0.pickup), " ", avj0Var.g(dwh0.due_additional, kyh0.due_additional_fallback, a[0]));
            } else if (c2) {
                h = ((avj0) zuj0Var).h(kyh0.summary_due_title);
            } else if (kzoVar == null || (h = (String) kzoVar.w) == null) {
                h = ((avj0) zuj0Var).h(kyh0.summary_due_title);
            }
            String str6 = h;
            if (hoj0Var.b) {
                str = hoj0Var.e;
                Calendar b = yVar.d.b();
                if (str.length() == 0 && b != null) {
                    str = yVar.g.a(b, yVar.b.d());
                }
            } else {
                String c3 = ((jbn) yVar.l).c();
                Iterator it = yVar.b.a.x.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it.next();
                    if (jl40.l(((b580) obj2).a, c3)) {
                        break;
                    }
                }
                b580 b580Var = (b580) obj2;
                if (b580Var == null || yVar.d.b() == null) {
                    iom0 iom0Var = yVar.g;
                    Calendar b2 = yVar.d.b();
                    int i = yVar.d.a.a.S.d;
                    TimeZone d = yVar.b.d();
                    if (i > 0) {
                        str = ((avj0) iom0Var.a).f(dwh0.due_additional, i);
                    } else if (b2 != null) {
                        str = iom0Var.a(b2, d);
                    } else {
                        iom0Var.getClass();
                        str = null;
                    }
                } else {
                    str = b580Var.c;
                    String str7 = str;
                    RequirementsDueViewPosition requirementsDueViewPosition = !jl40.l(kzoVar == null ? Boolean.valueOf(kzoVar.b) : null, Boolean.TRUE) ? RequirementsDueViewPosition.GLUED : RequirementsDueViewPosition.DEFAULT;
                    String str8 = kzoVar != null ? (String) kzoVar.c : null;
                    if (c2) {
                        boolean z3 = hoj0Var.d;
                        zuj0 zuj0Var2 = yVar.i;
                        ioj0Var = z3 ? new ioj0(str6, str7, false, true, z, str8, requirementsDueViewPosition, ((avj0) zuj0Var2).h(kyh0.common_remove)) : new ioj0(str6, str7, false, false, z, str8, requirementsDueViewPosition, ((avj0) zuj0Var2).h(kyh0.common_remove));
                    } else {
                        ioj0Var = new ioj0(str6, str7, true, false, z, str8, requirementsDueViewPosition, ((avj0) yVar.i).h(kyh0.common_remove));
                    }
                }
            }
            if (str == null) {
                str = kzoVar != null ? (String) kzoVar.x : null;
                if (str == null) {
                    str = "";
                }
            }
            String str72 = str;
            RequirementsDueViewPosition requirementsDueViewPosition2 = !jl40.l(kzoVar == null ? Boolean.valueOf(kzoVar.b) : null, Boolean.TRUE) ? RequirementsDueViewPosition.GLUED : RequirementsDueViewPosition.DEFAULT;
            String str82 = kzoVar != null ? (String) kzoVar.c : null;
            if (c2) {
            }
        }
        this.this$0.m.getClass();
        return ru.yandex.taxi.requirements.utils.c.b(ioj0Var, vfx0.a(mi31Var));
    }
}
