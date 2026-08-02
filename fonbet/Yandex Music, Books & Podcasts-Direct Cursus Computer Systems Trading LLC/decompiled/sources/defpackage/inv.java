package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final /* synthetic */ class inv implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ knv b;

    public /* synthetic */ inv(knv knvVar, int i) {
        this.a = i;
        this.b = knvVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        rkd rkdVar = (rkd) obj;
        switch (this.a) {
            case 0:
                rkdVar.getClass();
                return new fma(a4g.x(this.b.a, rkdVar, 1.0f));
            default:
                rkdVar.getClass();
                pov a = this.b.a();
                a.getClass();
                eps epsVar = a.i;
                epsVar.getClass();
                Object obj2 = ((ConcurrentHashMap) epsVar.g).get(rkdVar);
                if (obj2 == null) {
                    obj2 = null;
                }
                return (qov) obj2;
        }
    }
}
