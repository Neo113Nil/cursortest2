package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class dle implements yke {
    public final mm6 a;
    public final fle b;
    public final vdr c;

    public dle(mm6 mm6Var, fle fleVar, vdr vdrVar) {
        fleVar.getClass();
        vdrVar.getClass();
        this.a = mm6Var;
        this.b = fleVar;
        this.c = vdrVar;
    }

    @Override // defpackage.yke
    public final pjc a(jx7 jx7Var) {
        jx7Var.getClass();
        return zsd.b0(zsd.M0(this.c, new cle((Continuation) null, jx7Var, 0)));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(cg6 cg6Var) {
        ble bleVar;
        int i;
        if (cg6Var instanceof ble) {
            bleVar = (ble) cg6Var;
            int i2 = bleVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bleVar.l = i2 - Integer.MIN_VALUE;
                Object obj = bleVar.j;
                nm6 nm6Var = nm6.a;
                i = bleVar.l;
                vdr vdrVar = this.c;
                if (i != 0) {
                    qgg.h0(obj);
                    lke lkeVar = (lke) vdrVar.getValue();
                    bleVar.l = 1;
                    if (this.b.b(lkeVar, false, bleVar) == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                ox6.B(vdrVar, this.a, new otd(6, this));
                return Unit.a;
            }
        }
        bleVar = new ble(this, cg6Var);
        Object obj2 = bleVar.j;
        nm6 nm6Var2 = nm6.a;
        i = bleVar.l;
        vdr vdrVar2 = this.c;
        if (i != 0) {
        }
        ox6.B(vdrVar2, this.a, new otd(6, this));
        return Unit.a;
    }

    @Override // defpackage.yke
    public final fle m() {
        return this.b;
    }
}
