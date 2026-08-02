package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class ibs implements PointerInputEventHandler {
    public final /* synthetic */ mm6 a;
    public final /* synthetic */ aqi b;
    public final /* synthetic */ uoi c;
    public final /* synthetic */ aqi d;

    public ibs(mm6 mm6Var, aqi aqiVar, uoi uoiVar, aqi aqiVar2) {
        this.a = mm6Var;
        this.b = aqiVar;
        this.c = uoiVar;
        this.d = aqiVar2;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(pfm pfmVar, Continuation continuation) {
        hbs hbsVar = new hbs(this.a, this.b, this.c, null);
        kf0 kf0Var = new kf0(this.d, 9);
        kr3 kr3Var = g6s.a;
        Object Q = gld.Q(new inr(pfmVar, hbsVar, kf0Var, new pqm(pfmVar), (Continuation) null), continuation);
        nm6 nm6Var = nm6.a;
        if (Q != nm6Var) {
            Q = Unit.a;
        }
        return Q == nm6Var ? Q : Unit.a;
    }
}
