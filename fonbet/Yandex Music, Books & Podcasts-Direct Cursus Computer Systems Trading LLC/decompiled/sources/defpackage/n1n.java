package defpackage;

import android.widget.Toast;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final /* synthetic */ class n1n implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ j2n b;

    public /* synthetic */ n1n(j2n j2nVar, int i) {
        this.a = i;
        this.b = j2nVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                j2n j2nVar = this.b;
                Toast toast = (Toast) obj;
                toast.getClass();
                Toast toast2 = j2nVar.B;
                if (toast2 != null) {
                    toast2.cancel();
                }
                j2nVar.B = toast;
                break;
            default:
                j2n j2nVar2 = this.b;
                Throwable th = (Throwable) obj;
                if (!j2nVar2.f.d.a()) {
                    break;
                } else {
                    j2nVar2.d();
                    if (th != null) {
                        new lum(j2nVar2.a).Q(th);
                    }
                    break;
                }
        }
        return Unit.a;
    }
}
