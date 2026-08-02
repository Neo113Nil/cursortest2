package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class w2n implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ q2n b;

    public /* synthetic */ w2n(q2n q2nVar, int i) {
        this.a = i;
        this.b = q2nVar;
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
                this.b.e.invoke(bool);
                break;
            default:
                str.getClass();
                this.b.e.invoke(bool);
                break;
        }
        return Unit.a;
    }
}
