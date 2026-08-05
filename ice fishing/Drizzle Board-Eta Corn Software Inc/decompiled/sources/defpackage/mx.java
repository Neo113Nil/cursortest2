package defpackage;

import android.view.ViewPropertyAnimator;
import com.kolosta.rejin.jilosa.presentation.ui.PairShelfFragment;
import java.util.List;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class mx extends bb0 implements dl {
    public final /* synthetic */ int P7K7Inc8;
    public final /* synthetic */ PairShelfFragment Qr9iLBAD;
    public int b2ZJblxo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mx(PairShelfFragment pairShelfFragment, g9 g9Var, int i) {
        super(2, g9Var);
        this.P7K7Inc8 = i;
        this.Qr9iLBAD = pairShelfFragment;
    }

    @Override // defpackage.h9
    public final Object OxcuoDLp(Object obj) {
        ViewPropertyAnimator animate;
        ViewPropertyAnimator alpha;
        ViewPropertyAnimator duration;
        int i = this.P7K7Inc8;
        int i2 = 0;
        xe0 xe0Var = xe0.qoPGr6Ce;
        PairShelfFragment pairShelfFragment = this.Qr9iLBAD;
        u9 u9Var = u9.NCTxEWno;
        g9 g9Var = null;
        switch (i) {
            case 0:
                int i3 = this.b2ZJblxo;
                if (i3 != 0) {
                    if (i3 != 1) {
                        m1.Ey6iv0m0("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fn.SgZGMMPL(obj);
                    throw new d7();
                }
                fn.SgZGMMPL(obj);
                List list = PairShelfFragment.f7oeun2L;
                e10 e10Var = pairShelfFragment.nSmgoSB5().b2ZJblxo;
                lx lxVar = new lx(i2, pairShelfFragment);
                this.b2ZJblxo = 1;
                e10Var.NCTxEWno.NCTxEWno(lxVar, this);
                return u9Var;
            case 1:
                int i4 = this.b2ZJblxo;
                if (i4 != 0) {
                    if (i4 == 1) {
                        fn.SgZGMMPL(obj);
                        return xe0Var;
                    }
                    m1.Ey6iv0m0("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                fn.SgZGMMPL(obj);
                bk lDXGDhIF = pairShelfFragment.lDXGDhIF();
                mx mxVar = new mx(pairShelfFragment, g9Var, i2);
                this.b2ZJblxo = 1;
                return le0.VhgXwMj9(lDXGDhIF, mxVar, this) == u9Var ? u9Var : xe0Var;
            default:
                int i5 = this.b2ZJblxo;
                if (i5 == 0) {
                    fn.SgZGMMPL(obj);
                    re reVar = ge.NCTxEWno;
                    long FXJmAAN1 = le0.FXJmAAN1(1000L, ie.MILLISECONDS);
                    this.b2ZJblxo = 1;
                    Object OnDfzHZD = ej0.OnDfzHZD(ej0.N8VPGzVC(FXJmAAN1), this);
                    if (OnDfzHZD != u9Var) {
                        OnDfzHZD = xe0Var;
                    }
                    if (OnDfzHZD == u9Var) {
                        return u9Var;
                    }
                } else {
                    if (i5 != 1) {
                        m1.Ey6iv0m0("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fn.SgZGMMPL(obj);
                }
                sj sjVar = pairShelfFragment.pP9Y2m6O;
                if (sjVar == null || (animate = sjVar.OnDfzHZD.animate()) == null || (alpha = animate.alpha(0.0f)) == null || (duration = alpha.setDuration(200L)) == null) {
                    return xe0Var;
                }
                duration.start();
                return xe0Var;
        }
    }

    @Override // defpackage.dl
    public final Object Qr9iLBAD(Object obj, Object obj2) {
        int i = this.P7K7Inc8;
        xe0 xe0Var = xe0.qoPGr6Ce;
        t9 t9Var = (t9) obj;
        g9 g9Var = (g9) obj2;
        switch (i) {
            case 0:
                ((mx) lDXGDhIF(g9Var, t9Var)).OxcuoDLp(xe0Var);
                break;
        }
        return ((mx) lDXGDhIF(g9Var, t9Var)).OxcuoDLp(xe0Var);
    }

    @Override // defpackage.h9
    public final g9 lDXGDhIF(g9 g9Var, Object obj) {
        int i = this.P7K7Inc8;
        PairShelfFragment pairShelfFragment = this.Qr9iLBAD;
        switch (i) {
            case 0:
                return new mx(pairShelfFragment, g9Var, 0);
            case 1:
                return new mx(pairShelfFragment, g9Var, 1);
            default:
                return new mx(pairShelfFragment, g9Var, 2);
        }
    }
}
