package defpackage;

import androidx.compose.runtime.internal.a;
import com.yandex.go.pickup_from_photo.analytics.PhotoPickUpAnalytics$ErrorModalButtonName;

/* loaded from: classes13.dex */
public final /* synthetic */ class xgi0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ ygi0 b;

    public /* synthetic */ xgi0(ygi0 ygi0Var, int i) {
        this.a = i;
        this.b = ygi0Var;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        ygi0 ygi0Var = this.b;
        switch (i) {
            case 0:
                yfd yfdVar = (yfd) obj;
                ((agd) yfdVar).e = new xgi0(ygi0Var, 1);
                agd agdVar = (agd) yfdVar;
                agdVar.c = ((ahi0) ygi0Var.J).a();
                agdVar.g = new a(222486204, new l0(26, ygi0Var, yfdVar), true);
                return zy11Var;
            default:
                vgi0 vgi0Var = (vgi0) obj;
                sue0 sue0Var = (sue0) ygi0Var.K;
                aye0 aye0Var = (aye0) ygi0Var.N;
                umb0 umb0Var = (umb0) sue0Var.b;
                int i2 = 22;
                if (jl40.l(vgi0Var, ugi0.a)) {
                    umb0Var.c(PhotoPickUpAnalytics$ErrorModalButtonName.Retry);
                    ((ygi0) aye0Var.b).r(new cbg0(i2));
                    return zy11Var;
                }
                if (jl40.l(vgi0Var, sgi0.a)) {
                    umb0Var.c(PhotoPickUpAnalytics$ErrorModalButtonName.Close);
                    ((ygi0) aye0Var.b).r(new qu(9));
                    return zy11Var;
                }
                if (jl40.l(vgi0Var, rgi0.a)) {
                    umb0Var.c(PhotoPickUpAnalytics$ErrorModalButtonName.Back);
                    ((ygi0) aye0Var.b).r(new cbg0(i2));
                    return zy11Var;
                }
                if (jl40.l(vgi0Var, tgi0.a)) {
                    ((ygi0) aye0Var.b).r(new cbg0(23));
                    return zy11Var;
                }
                w511.b();
                return null;
        }
    }
}
