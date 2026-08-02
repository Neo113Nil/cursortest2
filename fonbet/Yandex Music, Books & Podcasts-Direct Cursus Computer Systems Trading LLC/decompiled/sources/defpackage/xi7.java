package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class xi7 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ iwm b;
    public final /* synthetic */ qw c;

    public /* synthetic */ xi7(iwm iwmVar, qw qwVar, int i) {
        this.a = i;
        this.b = iwmVar;
        this.c = qwVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        String str = (String) obj2;
        str.getClass();
        switch (i) {
            case 0:
                ow owVar = this.c.a.a;
                iwm iwmVar = this.b;
                iwmVar.getClass();
                weo.H(iwmVar.c, c3x.w(owVar.a, 0, 0), booleanValue, str, null);
                break;
            default:
                ow owVar2 = this.c.a.a;
                iwm iwmVar2 = this.b;
                iwmVar2.getClass();
                weo.H(iwmVar2.c, c3x.w(owVar2.a, 0, 0), booleanValue, str, null);
                break;
        }
        return Unit.a;
    }
}
