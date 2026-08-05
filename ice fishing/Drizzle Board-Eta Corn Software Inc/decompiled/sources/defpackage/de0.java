package defpackage;

import android.database.SQLException;
import java.util.Set;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class de0 extends bb0 implements dl {
    public final /* synthetic */ int P7K7Inc8;
    public /* synthetic */ Object Qr9iLBAD;
    public int b2ZJblxo;
    public final /* synthetic */ ie0 jb9XjC4I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ de0(ie0 ie0Var, g9 g9Var, int i) {
        super(2, g9Var);
        this.P7K7Inc8 = i;
        this.jb9XjC4I = ie0Var;
    }

    @Override // defpackage.h9
    public final Object OxcuoDLp(Object obj) {
        md0 md0Var;
        int i = this.P7K7Inc8;
        ie0 ie0Var = this.jb9XjC4I;
        u9 u9Var = u9.NCTxEWno;
        g9 g9Var = null;
        switch (i) {
            case 0:
                int i2 = this.b2ZJblxo;
                if (i2 != 0) {
                    if (i2 == 1) {
                        fn.SgZGMMPL(obj);
                        return obj;
                    }
                    m1.Ey6iv0m0("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                fn.SgZGMMPL(obj);
                cz czVar = (cz) this.Qr9iLBAD;
                this.b2ZJblxo = 1;
                Object qoPGr6Ce = ie0Var.qoPGr6Ce(czVar, this);
                return qoPGr6Ce == u9Var ? u9Var : qoPGr6Ce;
            default:
                int i3 = this.b2ZJblxo;
                try {
                    if (i3 == 0) {
                        fn.SgZGMMPL(obj);
                        md0Var = (md0) this.Qr9iLBAD;
                        this.Qr9iLBAD = md0Var;
                        this.b2ZJblxo = 1;
                        obj = md0Var.MdtA4re8(this);
                        if (obj == u9Var) {
                            return u9Var;
                        }
                    } else {
                        if (i3 != 1) {
                            if (i3 == 2) {
                                fn.SgZGMMPL(obj);
                                return (Set) obj;
                            }
                            m1.Ey6iv0m0("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        md0Var = (md0) this.Qr9iLBAD;
                        fn.SgZGMMPL(obj);
                    }
                    if (!((Boolean) obj).booleanValue()) {
                        ld0 ld0Var = ld0.MdtA4re8;
                        de0 de0Var = new de0(ie0Var, g9Var, 0);
                        this.Qr9iLBAD = null;
                        this.b2ZJblxo = 2;
                        obj = md0Var.qoPGr6Ce(ld0Var, de0Var, this);
                        if (obj == u9Var) {
                            return u9Var;
                        }
                        return (Set) obj;
                    }
                } catch (SQLException unused) {
                }
                return zf.NCTxEWno;
        }
    }

    @Override // defpackage.dl
    public final Object Qr9iLBAD(Object obj, Object obj2) {
        int i = this.P7K7Inc8;
        xe0 xe0Var = xe0.qoPGr6Ce;
        switch (i) {
            case 0:
                return ((de0) lDXGDhIF((g9) obj2, (cz) obj)).OxcuoDLp(xe0Var);
            default:
                return ((de0) lDXGDhIF((g9) obj2, (md0) obj)).OxcuoDLp(xe0Var);
        }
    }

    @Override // defpackage.h9
    public final g9 lDXGDhIF(g9 g9Var, Object obj) {
        int i = this.P7K7Inc8;
        ie0 ie0Var = this.jb9XjC4I;
        switch (i) {
            case 0:
                de0 de0Var = new de0(ie0Var, g9Var, 0);
                de0Var.Qr9iLBAD = obj;
                return de0Var;
            default:
                de0 de0Var2 = new de0(ie0Var, g9Var, 1);
                de0Var2.Qr9iLBAD = obj;
                return de0Var2;
        }
    }
}
