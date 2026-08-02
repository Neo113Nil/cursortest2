package defpackage;

import android.content.Context;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class hrj implements rjc {
    public final /* synthetic */ Context a;
    public final /* synthetic */ xqn b;
    public final /* synthetic */ mm6 c;
    public final /* synthetic */ fvf d;
    public final /* synthetic */ int e;

    public hrj(Context context, xqn xqnVar, mm6 mm6Var, fvf fvfVar, int i) {
        this.a = context;
        this.b = xqnVar;
        this.c = mm6Var;
        this.d = fvfVar;
        this.e = i;
    }

    @Override // defpackage.rjc
    public final Object emit(Object obj, Continuation continuation) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        boolean u = bow.u(this.a);
        xqn xqnVar = this.b;
        if (!booleanValue || u) {
            r2f r2fVar = (r2f) xqnVar.a;
            if (r2fVar != null) {
                r2fVar.g(null);
            }
            xqnVar.a = null;
        } else {
            xqnVar.a = x97.y(this.c, null, null, new j50(this.d, this.e, (Continuation) null, 3), 3);
        }
        return Unit.a;
    }
}
