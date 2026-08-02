package ru.yandex.taxi.summary.solid;

import com.yandex.go.due.api.analytics.model.DueAnalyticDisplayContext;
import defpackage.ff9;
import defpackage.gas0;
import defpackage.gmw0;
import defpackage.hf9;
import defpackage.hxx;
import defpackage.jl40;
import defpackage.l6t0;
import defpackage.lmw0;
import defpackage.ndj0;
import defpackage.oo6;
import defpackage.pep0;
import defpackage.pex0;
import defpackage.pvm;
import defpackage.qvm;
import defpackage.tje;
import defpackage.uva;
import defpackage.w511;
import defpackage.wls;
import defpackage.xmw;
import defpackage.zy11;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.yandex.taxi.intercity.analytics.IntercityPhoneSelectOrigin;
import ru.yandex.taxi.requirements.interactor.ChangeRequirementCounterInteractor$RequirementChangeType;
import ru.yandex.taxi.requirements.models.domain.RequirementBubbleAction;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
final /* synthetic */ class SolidSummaryCommunicationsDelegate$2 extends FunctionReferenceImpl implements wls {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    public final void i(ndj0 ndj0Var, RequirementBubbleAction requirementBubbleAction) {
        ?? r0;
        p pVar = (p) this.receiver;
        oo6 oo6Var = pVar.d;
        ff9 ff9Var = pVar.f;
        pVar.n.c(ndj0Var, requirementBubbleAction);
        String str = ndj0Var.b;
        String str2 = ndj0Var.a;
        switch (l6t0.a[requirementBubbleAction.ordinal()]) {
            case 1:
                oo6Var.a(ndj0Var);
                break;
            case 2:
                ((pep0) pVar.m).f(new uva(10, (pvm) pVar.l.get(), new gas0(10, pVar)), new qvm(DueAnalyticDisplayContext.SUMMARY), hxx.a);
                break;
            case 3:
                ((xmw) pVar.p.get()).T(IntercityPhoneSelectOrigin.BUBBLE);
                break;
            case 4:
                pex0 m = ((com.yandex.go.taxi.tariffs.internal.repository.k) pVar.j).m();
                if (m != null) {
                    Iterator it = m.f().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            r0 = it.next();
                            lmw0 lmw0Var = (lmw0) r0;
                            if (!jl40.l(lmw0Var.getName(), str2) || !(lmw0Var instanceof gmw0)) {
                            }
                        } else {
                            r0 = 0;
                        }
                    }
                    r4 = r0 instanceof gmw0 ? r0 : null;
                }
                if (r4 != null) {
                    pVar.o.a(r4, ndj0Var.d);
                    break;
                }
                break;
            case 5:
                oo6Var.a(ndj0Var);
                tje.N(pVar.a, null, null, new SolidSummaryCommunicationsDelegatePresenter$bubbleClick$2(null, pVar), 3);
                break;
            case 6:
                ((hf9) ff9Var).a(str2, str, ChangeRequirementCounterInteractor$RequirementChangeType.INCREMENT);
                break;
            case 7:
                ((hf9) ff9Var).a(str2, str, ChangeRequirementCounterInteractor$RequirementChangeType.DECREMENT);
                break;
            default:
                w511.b();
                break;
        }
    }

    @Override // defpackage.wls
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        i((ndj0) obj, (RequirementBubbleAction) obj2);
        return zy11.a;
    }
}
