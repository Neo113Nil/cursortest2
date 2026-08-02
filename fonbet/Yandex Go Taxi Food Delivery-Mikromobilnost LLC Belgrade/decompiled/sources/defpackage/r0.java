package defpackage;

import androidx.compose.ui.graphics.d;
import androidx.compose.ui.layout.k;
import androidx.compose.ui.layout.o;
import kotlin.collections.b;

/* loaded from: classes11.dex */
public final /* synthetic */ class r0 implements zls {
    public final /* synthetic */ int a;
    public final /* synthetic */ qor b;

    public /* synthetic */ r0(qor qorVar, int i) {
        this.a = i;
        this.b = qorVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        aa10 w;
        aa10 w2;
        int i = this.a;
        qor qorVar = this.b;
        switch (i) {
            case 0:
                fid fidVar = (fid) obj2;
                int intValue = ((Integer) obj3).intValue();
                bts btsVar = (bts) fidVar;
                if (btsVar.V(intValue & 1, (intValue & 17) != 16)) {
                    boolean k = btsVar.k(qorVar);
                    Object Q = btsVar.Q();
                    if (k || Q == did.a) {
                        Q = new f0(qorVar, 0);
                        btsVar.o0(Q);
                    }
                    yrl.c(d.a(c530.a, (tls) Q), null, btsVar, 0, 6);
                } else {
                    btsVar.Y();
                }
                return zy11.a;
            case 1:
                o l0 = ((x910) obj2).l0(((n8e) obj3).a);
                w = ((k) obj).w(l0.a, m810.b(qorVar.getFloatValue() * l0.b), b.f(), new q83(l0, 2));
                return w;
            default:
                o l02 = ((x910) obj2).l0(((n8e) obj3).a);
                w2 = ((k) obj).w(l02.a, m810.b(qorVar.getFloatValue() * l02.b), b.f(), new q83(l02, 9));
                return w2;
        }
    }
}
