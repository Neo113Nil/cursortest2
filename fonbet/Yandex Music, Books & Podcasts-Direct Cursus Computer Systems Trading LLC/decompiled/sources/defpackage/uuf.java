package defpackage;

import androidx.compose.foundation.lazy.a;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class uuf extends uif implements pyc {
    public final /* synthetic */ wn5 r;
    public final /* synthetic */ int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uuf(wn5 wn5Var, int i) {
        super(3);
        this.r = wn5Var;
        this.s = i;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        a aVar = (a) obj;
        hq5 hq5Var = (hq5) obj2;
        int intValue = ((Number) obj3).intValue();
        if ((intValue & 6) == 0) {
            intValue |= ((oq5) hq5Var).f(aVar) ? 4 : 2;
        }
        oq5 oq5Var = (oq5) hq5Var;
        if (oq5Var.P(intValue & 1, (intValue & 19) != 18)) {
            this.r.invoke(aVar, Integer.valueOf(this.s), oq5Var, Integer.valueOf(intValue & 14));
        } else {
            oq5Var.S();
        }
        return Unit.a;
    }
}
