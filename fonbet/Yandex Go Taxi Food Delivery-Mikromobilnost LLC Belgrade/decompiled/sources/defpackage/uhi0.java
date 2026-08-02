package defpackage;

import androidx.compose.runtime.internal.a;
import com.yandex.go.pickup_from_photo.navigation.d;

/* loaded from: classes13.dex */
public final /* synthetic */ class uhi0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ d b;

    public /* synthetic */ uhi0(d dVar, int i) {
        this.a = i;
        this.b = dVar;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        d dVar = this.b;
        switch (i) {
            case 0:
                yfd yfdVar = (yfd) obj;
                o8g0 o8g0Var = new o8g0(dVar, (thi0) ((agd) yfdVar).a, false);
                agd agdVar = (agd) yfdVar;
                agdVar.e = new ugd0(24, dVar, o8g0Var);
                agdVar.c = dVar.H.a();
                agdVar.g = new a(1609042759, new alb0(20, dVar), true);
                break;
            default:
                int intValue = ((Integer) obj).intValue();
                if (dVar.u()) {
                    tnb0 tnb0Var = dVar.Q;
                    tnb0Var.a.Td(intValue, tnb0Var);
                    break;
                }
                break;
        }
        return zy11Var;
    }
}
