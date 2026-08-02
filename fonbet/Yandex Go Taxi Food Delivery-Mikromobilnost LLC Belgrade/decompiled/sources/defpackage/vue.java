package defpackage;

import com.yandex.go.payments.shared.business.accountcreation.corp.experiment.CorpAccountFlowExperiment;
import com.yandex.go.payments.shared.business.accountcreation.corp.factory.CorpCreatingDraftModalView;
import com.yandex.go.payments.shared.y;

/* loaded from: classes13.dex */
public final /* synthetic */ class vue implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ CorpCreatingDraftModalView b;

    public /* synthetic */ vue(CorpCreatingDraftModalView corpCreatingDraftModalView, int i) {
        this.a = i;
        this.b = corpCreatingDraftModalView;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        zy11 zy11Var;
        d4f d4fVar;
        int i = this.a;
        CorpCreatingDraftModalView corpCreatingDraftModalView = this.b;
        switch (i) {
            case 0:
                zy11Var = CorpCreatingDraftModalView.setupCityLayoutInput$lambda$0(corpCreatingDraftModalView);
                return zy11Var;
            default:
                d4fVar = corpCreatingDraftModalView.pageInfo;
                bc bcVar = d4fVar.a;
                y yVar = (y) bcVar.b;
                Runnable runnable = (Runnable) bcVar.w;
                CorpAccountFlowExperiment corpAccountFlowExperiment = ((aue) bcVar.c).a;
                CorpAccountFlowExperiment.LimitExceededScreen limitExceededScreen = corpAccountFlowExperiment.f;
                CorpAccountFlowExperiment.LimitExceededScreen.Companion.getClass();
                boolean z = limitExceededScreen != CorpAccountFlowExperiment.LimitExceededScreen.d;
                t8f t8fVar = new t8f(z, d6z.Y(corpAccountFlowExperiment, limitExceededScreen.a), d6z.Y(corpAccountFlowExperiment, limitExceededScreen.b), d6z.Y(corpAccountFlowExperiment, limitExceededScreen.c));
                if (z) {
                    yVar.c.a().d(new s8f(new p1b(runnable, (y) ((zue) bcVar.a).d.b.get()), t8fVar));
                } else {
                    runnable.run();
                    yVar.c();
                }
                return zy11.a;
        }
    }
}
