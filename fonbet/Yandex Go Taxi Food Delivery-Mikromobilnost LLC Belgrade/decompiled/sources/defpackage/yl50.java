package defpackage;

import com.yandex.messaging.core.ui.utils.a;

/* loaded from: classes15.dex */
public final /* synthetic */ class yl50 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ tse b;
    public final /* synthetic */ qrm c;
    public final /* synthetic */ sls w;

    public /* synthetic */ yl50(tse tseVar, qrm qrmVar, sls slsVar, int i) {
        this.a = i;
        this.b = tseVar;
        this.c = qrmVar;
        this.w = slsVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        sls slsVar = this.w;
        qrm qrmVar = this.c;
        tse tseVar = this.b;
        switch (i) {
            case 0:
                a.a(tseVar, qrmVar, new zvr(12, slsVar));
                break;
            case 1:
                a.a(tseVar, qrmVar, new zvr(13, slsVar));
                break;
            default:
                a.a(tseVar, qrmVar, new n7l0(23, slsVar));
                break;
        }
        return zy11Var;
    }
}
