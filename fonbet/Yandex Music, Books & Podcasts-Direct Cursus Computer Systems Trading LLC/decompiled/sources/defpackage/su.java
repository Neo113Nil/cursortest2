package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class su implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ pyc b;
    public final /* synthetic */ thj c;

    public /* synthetic */ su(pyc pycVar, thj thjVar, int i) {
        this.a = i;
        this.b = pycVar;
        this.c = thjVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Boolean bool = (Boolean) obj;
        bool.getClass();
        String str = (String) obj2;
        switch (i) {
            case 0:
                str.getClass();
                this.b.invoke(this.c, str, bool);
                break;
            default:
                str.getClass();
                this.b.invoke(this.c, bool, str);
                break;
        }
        return Unit.a;
    }
}
