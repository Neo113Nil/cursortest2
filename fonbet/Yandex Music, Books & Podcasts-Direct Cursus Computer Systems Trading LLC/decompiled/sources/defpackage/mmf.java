package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final /* synthetic */ class mmf implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ xqn b;

    public /* synthetic */ mmf(xqn xqnVar, int i) {
        this.a = i;
        this.b = xqnVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((lwu) obj).getClass();
                break;
            case 1:
                w4f w4fVar = (w4f) obj;
                w4fVar.getClass();
                this.b.a = w4fVar;
                break;
            default:
                ((kpj) obj).getClass();
                Function0 function0 = (Function0) this.b.a;
                if (function0 != null) {
                    ((Boolean) function0.invoke()).getClass();
                }
                break;
        }
        return Unit.a;
    }
}
