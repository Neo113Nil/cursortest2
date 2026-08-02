package ru.yandex.taxi.preorder.summary.tariffpage.data.holder;

import com.yandex.go.due.api.analytics.model.DueAnalyticDisplayContext;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import defpackage.en6;
import defpackage.evu0;
import defpackage.ff9;
import defpackage.gmw0;
import defpackage.hf9;
import defpackage.hxx;
import defpackage.jl40;
import defpackage.kb5;
import defpackage.lmw0;
import defpackage.ndj0;
import defpackage.pep0;
import defpackage.pex0;
import defpackage.pvm;
import defpackage.qvm;
import defpackage.rk6;
import defpackage.rwo0;
import defpackage.tkx0;
import defpackage.vm6;
import defpackage.w511;
import defpackage.wls;
import defpackage.xmw;
import defpackage.yjj0;
import defpackage.zy11;
import java.util.Collections;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.yandex.taxi.intercity.analytics.IntercityPhoneSelectOrigin;
import ru.yandex.taxi.requirements.analytics.RequirementRemoveSource;
import ru.yandex.taxi.requirements.interactor.ChangeRequirementCounterInteractor$RequirementChangeType;
import ru.yandex.taxi.requirements.models.domain.RequirementBubbleAction;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
final /* synthetic */ class TariffPagerViewHolder$setupBubbleContainer$1$1 extends FunctionReferenceImpl implements wls {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16, types: [java.lang.Object] */
    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ?? r7;
        ndj0 ndj0Var = (ndj0) obj;
        RequirementBubbleAction requirementBubbleAction = (RequirementBubbleAction) obj2;
        e eVar = (e) this.receiver;
        ff9 ff9Var = eVar.V;
        en6 en6Var = eVar.b0;
        eVar.S.c(ndj0Var, requirementBubbleAction);
        String str = ndj0Var.b;
        String str2 = ndj0Var.a;
        switch (tkx0.a[requirementBubbleAction.ordinal()]) {
            case 1:
            case 2:
                vm6 vm6Var = eVar.R;
                kb5 kb5Var = (kb5) eVar.Q.c.getValue();
                vm6Var.getClass();
                vm6Var.d.e(str2, evu0.J(str) ? EmptyList.a : Collections.singletonList(str), RequirementRemoveSource.BUBBLE, null);
                ((yjj0) vm6Var.c).a(str2, str, kb5Var.b, kb5Var.a);
                break;
            case 3:
                en6Var.getClass();
                ((pep0) en6Var.f).f(new rwo0(3, (pvm) en6Var.a.get(), new rk6(1, en6Var)), new qvm(DueAnalyticDisplayContext.SUMMARY), hxx.a);
                break;
            case 4:
                ((xmw) en6Var.b.get()).T(IntercityPhoneSelectOrigin.BUBBLE);
                break;
            case 5:
                pex0 m = ((k) en6Var.d).m();
                if (m != null) {
                    Iterator it = m.f().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            r7 = it.next();
                            lmw0 lmw0Var = (lmw0) r7;
                            if (!jl40.l(lmw0Var.getName(), str2) || !(lmw0Var instanceof gmw0)) {
                            }
                        } else {
                            r7 = 0;
                        }
                    }
                    r4 = r7 instanceof gmw0 ? r7 : null;
                }
                if (r4 != null) {
                    en6Var.e.a(r4, ndj0Var.d);
                    break;
                }
                break;
            case 6:
                ((hf9) ff9Var).a(str2, str, ChangeRequirementCounterInteractor$RequirementChangeType.INCREMENT);
                break;
            case 7:
                ((hf9) ff9Var).a(str2, str, ChangeRequirementCounterInteractor$RequirementChangeType.DECREMENT);
                break;
            default:
                w511.b();
                return null;
        }
        return zy11.a;
    }
}
