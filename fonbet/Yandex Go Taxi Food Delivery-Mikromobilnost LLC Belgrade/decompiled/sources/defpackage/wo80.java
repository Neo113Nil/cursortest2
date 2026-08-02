package defpackage;

import android.graphics.drawable.Drawable;
import kotlin.coroutines.Continuation;

/* loaded from: classes13.dex */
public final class wo80 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ qo80 b;

    public /* synthetic */ wo80(qo80 qo80Var, int i) {
        this.a = i;
        this.b = qo80Var;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        qo80 qo80Var = this.b;
        switch (i) {
            case 0:
                qo80Var.l((Drawable) obj);
                break;
            default:
                qo80Var.render((mp80) obj);
                break;
        }
        return zy11Var;
    }
}
