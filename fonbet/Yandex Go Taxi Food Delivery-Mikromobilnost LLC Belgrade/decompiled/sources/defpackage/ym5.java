package defpackage;

import com.yandex.go.benefits_center.benefits.data.experiment.BenefitsCenterTitleExperiment;
import com.yandex.go.benefits_center.benefits.router.a;

/* loaded from: classes12.dex */
public final /* synthetic */ class ym5 implements nao {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ym5(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.nao
    public final mao a(l1o l1oVar) {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                hn5 hn5Var = (hn5) obj2;
                BenefitsCenterTitleExperiment benefitsCenterTitleExperiment = (BenefitsCenterTitleExperiment) ((a) obj).e.c();
                String str = benefitsCenterTitleExperiment.d;
                if (str != null) {
                    String str2 = (String) benefitsCenterTitleExperiment.b.get(str);
                    if (str2 != null) {
                        str = str2;
                    }
                } else {
                    str = null;
                }
                return new com.yandex.go.benefits_center.benefits.presentation.a(hn5Var, str);
            default:
                com.yandex.go.wallet.flex.a aVar = (com.yandex.go.wallet.flex.a) obj;
                return new g841((mj31) obj2, aVar.i, aVar.k.a);
        }
    }
}
