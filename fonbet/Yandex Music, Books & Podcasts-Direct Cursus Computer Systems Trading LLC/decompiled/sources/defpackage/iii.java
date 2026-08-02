package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class iii implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ iii(int i, int i2) {
        this.a = i2;
        this.b = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                jfp jfpVar = (jfp) obj;
                jfpVar.getClass();
                wfp.j(jfpVar, new my4(1, 1, this.b, 1));
                break;
            default:
                jfp jfpVar2 = (jfp) obj;
                jfpVar2.getClass();
                wfp.j(jfpVar2, new my4(0, 1, this.b, 1));
                break;
        }
        return Unit.a;
    }
}
