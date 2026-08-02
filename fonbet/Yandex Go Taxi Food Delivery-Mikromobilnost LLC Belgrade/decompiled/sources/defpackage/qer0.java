package defpackage;

import com.ybsdk.feature.settings.internal.screens.settings.presentation.a;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes3.dex */
public final class qer0 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ a b;

    public /* synthetic */ qer0(a aVar, int i) {
        this.a = i;
        this.b = aVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        r0 r0Var;
        Object value;
        r0 r0Var2;
        Object value2;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        a aVar = this.b;
        switch (i) {
            case 0:
                pz40 Y = aVar.Y();
                do {
                    r0Var = (r0) Y;
                    value = r0Var.getValue();
                    aVar.B.a();
                } while (!r0Var.k(value, wdr0.a((wdr0) value, null, null, null, null, false, null, null, null, null, false, 4063)));
            default:
                ((Boolean) obj).getClass();
                pz40 Y2 = aVar.Y();
                do {
                    r0Var2 = (r0) Y2;
                    value2 = r0Var2.getValue();
                    aVar.B.a();
                } while (!r0Var2.k(value2, wdr0.a((wdr0) value2, null, null, null, null, false, null, null, null, null, false, 4063)));
        }
        return zy11Var;
    }
}
