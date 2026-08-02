package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.platform.m;
import com.yandex.go.summary.ui.compose.common.animation.a;

/* loaded from: classes11.dex */
public final /* synthetic */ class w1c implements zls {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ awk0 c;
    public final /* synthetic */ sls w;

    public /* synthetic */ w1c(boolean z, awk0 awk0Var, sls slsVar, int i) {
        this.a = i;
        this.b = z;
        this.c = awk0Var;
        this.w = slsVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        f530 a;
        zx40 zx40Var;
        int i = this.a;
        o430 o430Var = did.a;
        switch (i) {
            case 0:
                f530 f530Var = (f530) obj;
                ((Integer) obj3).getClass();
                bts btsVar = (bts) ((fid) obj2);
                btsVar.e0(896421257);
                btsVar.e0(-820922478);
                Object Q = btsVar.Q();
                if (Q == o430Var) {
                    Q = ly3.i(btsVar);
                }
                zx40 zx40Var2 = (zx40) Q;
                btsVar.t(false);
                a = b.a(q791.b(f530Var, zx40Var2, null, this.b, null, this.c, this.w, 8), m.a(), new a(zx40Var2));
                btsVar.t(false);
                return a;
            default:
                ((Integer) obj3).getClass();
                bts btsVar2 = (bts) ((fid) obj2);
                btsVar2.e0(-2124609672);
                jrv jrvVar = (jrv) btsVar2.m(lrv.a);
                if (jrvVar instanceof prv) {
                    btsVar2.e0(686451247);
                    btsVar2.t(false);
                    zx40Var = null;
                } else {
                    btsVar2.e0(686583865);
                    Object Q2 = btsVar2.Q();
                    if (Q2 == o430Var) {
                        Q2 = ly3.i(btsVar2);
                    }
                    zx40Var = (zx40) Q2;
                    btsVar2.t(false);
                }
                f530 i2 = kx91.i(c530.a, this.b, zx40Var, jrvVar, true, this.c, this.w);
                btsVar2.t(false);
                return i2;
        }
    }
}
