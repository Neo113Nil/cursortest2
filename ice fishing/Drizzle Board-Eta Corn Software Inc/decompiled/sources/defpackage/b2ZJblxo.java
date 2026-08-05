package defpackage;

import android.util.Log;
import com.kolosta.rejin.jilosa.presentation.ui.PairingCardFragment;
import com.kolosta.rejin.jilosa.presentation.ui.SprintRoundFragment;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final /* synthetic */ class b2ZJblxo implements zk {
    public final /* synthetic */ Object MdtA4re8;
    public final /* synthetic */ int NCTxEWno;

    public /* synthetic */ b2ZJblxo(qt qtVar, pt ptVar) {
        this.NCTxEWno = 3;
        this.MdtA4re8 = qtVar;
    }

    @Override // defpackage.zk
    public final Object ow5vqvCr(Object obj) {
        int i;
        int i2 = this.NCTxEWno;
        xe0 xe0Var = xe0.qoPGr6Ce;
        Object obj2 = this.MdtA4re8;
        switch (i2) {
            case 0:
                return obj == ((Qr9iLBAD) obj2) ? "(this Collection)" : String.valueOf(obj);
            case 1:
                final nj njVar = (nj) obj2;
                final ut utVar = (ut) obj;
                utVar.getClass();
                return new to() { // from class: jj
                    @Override // defpackage.to
                    public final void P7K7Inc8(vo voVar, oo ooVar) {
                        oo ooVar2 = oo.ON_RESUME;
                        nj njVar2 = nj.this;
                        ut utVar2 = utVar;
                        if (ooVar == ooVar2 && ((List) njVar2.NCTxEWno().VgvYg0wo.NCTxEWno.Qr9iLBAD()).contains(utVar2)) {
                            if (nj.ygLcUYwZ()) {
                                Log.v("FragmentNavigator", "Marking transition complete for entry " + utVar2 + " due to fragment " + voVar + " view lifecycle reaching RESUMED");
                            }
                            njVar2.NCTxEWno().MdtA4re8(utVar2);
                        }
                        if (ooVar == oo.ON_DESTROY) {
                            if (nj.ygLcUYwZ()) {
                                Log.v("FragmentNavigator", "Marking transition complete for entry " + utVar2 + " due to fragment " + voVar + " view lifecycle reaching DESTROYED");
                            }
                            njVar2.NCTxEWno().MdtA4re8(utVar2);
                        }
                    }
                };
            case 2:
                return ((br) obj2).NCTxEWno(((Integer) obj).intValue());
            case 3:
                ((qt) obj2).VgvYg0wo(null);
                return xe0Var;
            case 4:
                py pyVar = (py) obj;
                pyVar.getClass();
                iy FXJmAAN1 = ((PairingCardFragment) obj2).FXJmAAN1();
                long j = pyVar.qoPGr6Ce;
                xx xxVar = ((fy) FXJmAAN1.P7K7Inc8.NCTxEWno.Qr9iLBAD()).qoPGr6Ce;
                if (xxVar != null) {
                    fn.Ey6iv0m0(le0.FySoLYna(FXJmAAN1), null, new gy(FXJmAAN1, j, xxVar, null), 3);
                }
                return xe0Var;
            case 5:
                fk fkVar = (fk) obj;
                fkVar.getClass();
                ((zb) obj2).Qr9iLBAD = fkVar;
                return xe0Var;
            case 6:
                t70 t70Var = (t70) obj;
                t70Var.getClass();
                h90 h90Var = (h90) ((SprintRoundFragment) obj2).tef3qNMP.getValue();
                long j2 = t70Var.qoPGr6Ce;
                Long l = h90Var.k3x7lurq;
                if (l == null) {
                    h90Var.k3x7lurq = Long.valueOf(j2);
                } else if (l.longValue() == j2) {
                    h90Var.k3x7lurq = null;
                } else {
                    int indexOf = h90Var.eVhOlqcC.indexOf(l);
                    int indexOf2 = h90Var.eVhOlqcC.indexOf(Long.valueOf(j2));
                    if (indexOf >= 0 && indexOf2 >= 0) {
                        ArrayList X1t0wlBd = x5.X1t0wlBd(h90Var.eVhOlqcC);
                        X1t0wlBd.set(indexOf, Long.valueOf(j2));
                        X1t0wlBd.set(indexOf2, l);
                        h90Var.eVhOlqcC = X1t0wlBd;
                    }
                    h90Var.k3x7lurq = null;
                }
                h90Var.VgvYg0wo();
                return xe0Var;
            default:
                xx xxVar2 = (xx) obj;
                xxVar2.getClass();
                i90 i90Var = ((h90) obj2).wxUZMvaN;
                i90Var.getClass();
                int ordinal = i90Var.ordinal();
                if (ordinal == 0) {
                    i = xxVar2.jb9XjC4I;
                } else if (ordinal == 1) {
                    i = xxVar2.Qr9iLBAD;
                } else {
                    if (ordinal != 2) {
                        throw new d7();
                    }
                    i = xxVar2.lDXGDhIF;
                }
                return Integer.valueOf(i);
        }
    }

    public /* synthetic */ b2ZJblxo(int i, Object obj) {
        this.NCTxEWno = i;
        this.MdtA4re8 = obj;
    }
}
