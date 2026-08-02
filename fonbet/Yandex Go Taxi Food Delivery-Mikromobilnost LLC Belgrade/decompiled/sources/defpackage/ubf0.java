package defpackage;

import com.ybsdk.feature.main.internal.screens.products.a;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes3.dex */
public final class ubf0 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ a b;

    public /* synthetic */ ubf0(a aVar, int i) {
        this.a = i;
        this.b = aVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        a aVar = this.b;
        switch (i) {
            case 0:
                pzt0 pzt0Var = aVar.M;
                if (pzt0Var == null || !pzt0Var.isActive()) {
                    aVar.d0(false);
                    break;
                }
                break;
            default:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                pz40 Y = aVar.Y();
                while (true) {
                    r0 r0Var = (r0) Y;
                    Object value = r0Var.getValue();
                    pz40 pz40Var = Y;
                    if (r0Var.k(value, dbf0.a((dbf0) value, null, false, false, null, null, false, null, false, false, booleanValue, false, 6143))) {
                        break;
                    } else {
                        Y = pz40Var;
                    }
                }
        }
        return zy11Var;
    }
}
