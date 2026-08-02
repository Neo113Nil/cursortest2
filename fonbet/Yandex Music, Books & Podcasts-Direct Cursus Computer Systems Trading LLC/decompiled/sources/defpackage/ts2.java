package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.view.View;
import com.connectsdk.service.webos.lgcast.remotecamera.service.CameraProperty;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public abstract class ts2 {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public Object e;
    public Object f;

    public ts2(jrp jrpVar, qrp qrpVar, int i) {
        jrpVar.getClass();
        this.a = jrpVar;
        this.b = qrpVar;
        xdr a = ydr.a(new nrp(i));
        this.c = a;
        this.d = new fkn(a);
        this.e = new ybl();
        this.f = btf.b(new oxo(10, this));
    }

    public AnimatorSet b() {
        zei zeiVar = (zei) this.f;
        if (zeiVar == null) {
            if (((zei) this.e) == null) {
                this.e = zei.b((Context) this.a, k());
            }
            zeiVar = (zei) this.e;
            zeiVar.getClass();
        }
        return h(zeiVar);
    }

    public AnimatorSet h(zei zeiVar) {
        ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) this.b;
        ArrayList arrayList = new ArrayList();
        if (zeiVar.g("opacity")) {
            arrayList.add(zeiVar.d("opacity", extendedFloatingActionButton, View.ALPHA));
        }
        if (zeiVar.g("scale")) {
            arrayList.add(zeiVar.d("scale", extendedFloatingActionButton, View.SCALE_Y));
            arrayList.add(zeiVar.d("scale", extendedFloatingActionButton, View.SCALE_X));
        }
        if (zeiVar.g(CameraProperty.WIDTH)) {
            arrayList.add(zeiVar.d(CameraProperty.WIDTH, extendedFloatingActionButton, ExtendedFloatingActionButton.H0));
        }
        if (zeiVar.g(CameraProperty.HEIGHT)) {
            arrayList.add(zeiVar.d(CameraProperty.HEIGHT, extendedFloatingActionButton, ExtendedFloatingActionButton.I0));
        }
        if (zeiVar.g("paddingStart")) {
            arrayList.add(zeiVar.d("paddingStart", extendedFloatingActionButton, ExtendedFloatingActionButton.J0));
        }
        if (zeiVar.g("paddingEnd")) {
            arrayList.add(zeiVar.d("paddingEnd", extendedFloatingActionButton, ExtendedFloatingActionButton.K0));
        }
        if (zeiVar.g("labelOpacity")) {
            arrayList.add(zeiVar.d("labelOpacity", extendedFloatingActionButton, new ss2(this)));
        }
        AnimatorSet animatorSet = new AnimatorSet();
        fgq.C(animatorSet, arrayList);
        return animatorSet;
    }

    public abstract int k();

    public vdr l() {
        return (fkn) this.d;
    }

    public void m() {
        ((jzi) this.d).a = null;
    }

    public abstract void n();

    public abstract void o(Animator animator);

    public abstract void p();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r6v1, types: [fs] */
    /* JADX WARN: Type inference failed for: r6v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v11, types: [p6o] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v2, types: [fs] */
    /* JADX WARN: Type inference failed for: r6v3, types: [p6o] */
    /* JADX WARN: Type inference failed for: r6v5, types: [njf] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [fs] */
    /* JADX WARN: Type inference failed for: r6v9, types: [u21] */
    public csp q(n7q n7qVar) {
        vqp vqpVar;
        wqp wqpVar;
        n7qVar.getClass();
        ybl yblVar = (ybl) this.e;
        qrp qrpVar = (qrp) this.b;
        yblVar.getClass();
        List e = ybl.e(n7qVar, qrpVar);
        if (e.isEmpty()) {
            return asp.a;
        }
        fpp fppVar = (fpp) ((jyr) this.f).getValue();
        fppVar.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = e.iterator();
        while (it.hasNext()) {
            ?? r6 = 0;
            r6 = 0;
            switch (((zop) it.next()).ordinal()) {
                case 0:
                    nyn nynVar = (nyn) wdg.A(n7qVar, bcn.a);
                    if (nynVar != null) {
                        int ordinal = nynVar.ordinal();
                        if (ordinal == 0) {
                            vqpVar = vqp.b;
                        } else if (ordinal == 1) {
                            vqpVar = vqp.c;
                        } else {
                            if (ordinal != 2) {
                                b6e.s();
                                return null;
                            }
                            vqpVar = vqp.d;
                        }
                    } else {
                        vqpVar = vqp.a;
                    }
                    r6 = new fs(15, vqpVar);
                    break;
                case 1:
                    yml ymlVar = (yml) wdg.A(n7qVar, ccn.a);
                    if (ymlVar != null) {
                        int ordinal2 = ymlVar.ordinal();
                        if (ordinal2 == 0) {
                            wqpVar = wqp.a;
                        } else {
                            if (ordinal2 != 1) {
                                b6e.s();
                                return null;
                            }
                            wqpVar = wqp.b;
                        }
                    } else {
                        wqpVar = null;
                    }
                    if (wqpVar != null) {
                        r6 = new fs(15, wqpVar);
                        break;
                    }
                    break;
                case 2:
                    r6 = new p6o((vdr) fppVar.d.a.getValue(), 5);
                    break;
                case 3:
                    mwk b = n7qVar.b();
                    irp irpVar = fppVar.a;
                    b.getClass();
                    irpVar.getClass();
                    if (!((Boolean) dag.p(b, bxk.a)).booleanValue()) {
                        r6 = new fs(15, zqp.a);
                        break;
                    } else {
                        r6 = new njf(irpVar.a, irpVar, 24);
                        break;
                    }
                case 4:
                    mwk b2 = n7qVar.b();
                    b2.getClass();
                    r6 = new fs(15, ((Boolean) dag.p(b2, q5n.a)).booleanValue() ? uqp.b : uqp.a);
                    break;
                case 5:
                    mqs a = n7qVar.b().a();
                    if (a != null) {
                        grp grpVar = fppVar.b;
                        z66 z66Var = fppVar.e;
                        grpVar.getClass();
                        z66Var.getClass();
                        r6 = new u21(10, z66Var.c(), zsd.b0(new u21(10, ((e6q) ((uaa) grpVar.a.getValue())).e, ((kij) grpVar.b.getValue()).c, new mf5(a, r6, 1))), new laq(3, 4, (Continuation) r6));
                        break;
                    }
                    break;
                case 6:
                    r6 = new p6o(fppVar.c, 6);
                    break;
                default:
                    b6e.s();
                    return null;
            }
            if (r6 != 0) {
                arrayList.add(r6);
            }
        }
        return new bsp(new ail(21, (pjc[]) CollectionsKt.w0(arrayList).toArray(new pjc[0]), n7qVar));
    }

    public abstract boolean r();

    public ts2(ExtendedFloatingActionButton extendedFloatingActionButton, jzi jziVar) {
        this.c = new ArrayList();
        this.b = extendedFloatingActionButton;
        this.a = extendedFloatingActionButton.getContext();
        this.d = jziVar;
    }
}
