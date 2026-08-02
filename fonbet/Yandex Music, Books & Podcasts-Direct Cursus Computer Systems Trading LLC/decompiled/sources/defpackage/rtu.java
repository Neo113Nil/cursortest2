package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final /* synthetic */ class rtu implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ b4v b;
    public final /* synthetic */ List c;

    public /* synthetic */ rtu(b4v b4vVar, List list, int i) {
        this.a = i;
        this.b = b4vVar;
        this.c = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        jfp jfpVar = (jfp) obj;
        jfpVar.getClass();
        switch (i) {
            case 0:
                wfp.k(jfpVar, this.b.a.b.a.a.getTitle());
                wfp.l(jfpVar, this.c);
                break;
            default:
                wfp.k(jfpVar, this.b.a.b.a.a.getTitle());
                wfp.l(jfpVar, this.c);
                break;
        }
        return Unit.a;
    }
}
