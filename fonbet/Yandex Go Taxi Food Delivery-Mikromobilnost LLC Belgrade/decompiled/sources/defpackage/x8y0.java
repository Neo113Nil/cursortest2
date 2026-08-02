package defpackage;

import android.graphics.drawable.Drawable;
import kotlin.coroutines.Continuation;

/* loaded from: classes6.dex */
public final class x8y0 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ r8y0 b;

    public /* synthetic */ x8y0(r8y0 r8y0Var, int i) {
        this.a = i;
        this.b = r8y0Var;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        r8y0 r8y0Var = this.b;
        switch (i) {
            case 0:
                r8y0Var.applyButtonStyle((m37) obj);
                break;
            default:
                r8y0Var.Bf((Drawable) obj);
                break;
        }
        return zy11Var;
    }
}
