package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class hjt implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ njt b;
    public final /* synthetic */ int c;
    public final /* synthetic */ yit d;

    public /* synthetic */ hjt(int i, int i2, yit yitVar, njt njtVar) {
        this.a = i2;
        this.b = njtVar;
        this.c = i;
        this.d = yitVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        String str = (String) obj2;
        switch (i) {
            case 0:
                str.getClass();
                this.b.b(this.c, this.d, booleanValue, str);
                break;
            default:
                str.getClass();
                this.b.b(this.c, this.d, booleanValue, str);
                break;
        }
        return Unit.a;
    }
}
