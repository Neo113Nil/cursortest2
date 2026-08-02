package defpackage;

import androidx.fragment.app.t;
import androidx.fragment.app.y;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class zs8 extends ovn {
    public final /* synthetic */ int o;
    public final /* synthetic */ Object p;

    public /* synthetic */ zs8(int i, Object obj) {
        this.o = i;
        this.p = obj;
    }

    @Override // defpackage.ovn
    public void N(String str) {
        switch (this.o) {
            case 0:
                g06 g06Var = (g06) this.p;
                z0j z0jVar = (z0j) g06Var.b;
                ((bt8) z0jVar.c).a(str);
                ((fs8) z0jVar.d).a.finish();
                ((lhk) ((t1f) g06Var.c).b).H();
                break;
            case 1:
                ((rvj) this.p).a();
                break;
            case 2:
                ((e7r) this.p).a().M();
                break;
            case 4:
                ((p7s) this.p).b();
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ovn
    public void O(String str, String str2) {
        int i = this.o;
        int i2 = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object obj = this.p;
        switch (i) {
            case 0:
                z0j z0jVar = (z0j) ((g06) obj).b;
                bt8 bt8Var = (bt8) z0jVar.c;
                bt8Var.getClass();
                Object value = bt8Var.p.a.getValue();
                ts8 ts8Var = value instanceof ts8 ? (ts8) value : null;
                if (ts8Var != null) {
                    rs8 rs8Var = ts8Var.a;
                    wx2 wx2Var = bt8Var.n;
                    ys8 ys8Var = rs8Var.d;
                    String str3 = rs8Var.a;
                    wx2Var.getClass();
                    str3.getClass();
                    nmb nmbVar = (nmb) wx2Var.a.getValue();
                    kkb a = wx2.a(ys8Var);
                    lkb[] lkbVarArr = lkb.a;
                    nmbVar.e(a, str3);
                    if (str2.length() > 0) {
                        bt8Var.l.a(bt8Var.k, rs8Var.b, str2);
                    }
                }
                fs8 fs8Var = (fs8) z0jVar.d;
                fs8Var.getClass();
                t tVar = fs8Var.a;
                tVar.finish();
                w1g.y(tVar, str, true);
                break;
            case 1:
                cwj cwjVar = ((rvj) obj).a;
                cwjVar.getClass();
                x97.y(ot0.F(cwjVar), null, null, new awj(cwjVar, str, objArr == true ? 1 : 0, i2), 3);
                break;
            case 3:
                qne.v((qne) obj, new kfr(str), null, 6);
                break;
            case 4:
                e8s e8sVar = ((p7s) obj).a;
                e8sVar.getClass();
                x97.y(ot0.F(e8sVar), null, null, new d8s(e8sVar, str, objArr2 == true ? 1 : 0, i2), 3);
                break;
        }
    }

    @Override // defpackage.ovn
    public void P(String str) {
        switch (this.o) {
            case 0:
                z0j z0jVar = (z0j) ((g06) this.p).b;
                fs8 fs8Var = (fs8) z0jVar.d;
                boolean z = z0jVar.b;
                fs8Var.getClass();
                y supportFragmentManager = fs8Var.a.getSupportFragmentManager();
                supportFragmentManager.getClass();
                pu0 t = pd.t(new qzm[0]);
                if (z) {
                    t = jf0.C(t, ru0.DARK);
                }
                x2i.a0(supportFragmentManager, t, new teb(str));
                break;
            case 1:
                cwj cwjVar = ((rvj) this.p).a;
                cwjVar.getClass();
                x97.y(ot0.F(cwjVar), null, null, new awj(cwjVar, str, null, 1), 3);
                break;
            case 3:
                qne.v((qne) this.p, new lfr(str), null, 6);
                break;
            case 4:
                e8s e8sVar = ((p7s) this.p).a;
                e8sVar.getClass();
                x97.y(ot0.F(e8sVar), null, null, new d8s(e8sVar, str, null, 1), 3);
                break;
        }
    }

    public void S(boolean z) {
        bve G;
        t1f t1fVar = (t1f) ((g06) this.p).c;
        boolean a = ((os8) t1fVar.d).a();
        lhk lhkVar = (lhk) t1fVar.b;
        boolean z2 = z && a;
        ukj ukjVar = (ukj) lhkVar.v.getValue();
        if (ukjVar == null || (G = lhk.G(ukjVar)) == null) {
            return;
        }
        x97.y(ot0.F(lhkVar), null, null, new cg1(lhkVar, G, z2, (Continuation) null, 12), 3);
    }
}
