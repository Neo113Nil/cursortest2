package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final /* synthetic */ class g0j implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ evj b;

    public /* synthetic */ g0j(evj evjVar, int i) {
        this.a = i;
        this.b = evjVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str = (String) obj;
        switch (this.a) {
            case 0:
                str.getClass();
                ssg.a(2, "OkHttpLog:" + ((String) this.b.b), str, null);
                break;
            default:
                str.getClass();
                ssg.a(2, "OkHttpLog:" + ((String) this.b.b), str, null);
                break;
        }
        return Unit.a;
    }
}
