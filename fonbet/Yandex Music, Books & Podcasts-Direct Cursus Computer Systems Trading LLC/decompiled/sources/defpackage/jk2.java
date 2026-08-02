package defpackage;

import android.os.SystemClock;
import android.view.MotionEvent;
import androidx.compose.ui.platform.AndroidComposeView;
import java.util.HashSet;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class jk2 extends xci implements epf, ipa, ofp, ofm, bdi, ddi, a7k, qof, amd, moc, xoc, zoc, vzj, nj3 {
    public wci o;
    public hk2 p;
    public HashSet q;

    @Override // defpackage.bdi
    public final tyf D() {
        hk2 hk2Var = this.p;
        return hk2Var != null ? hk2Var : f5b.a;
    }

    @Override // defpackage.epf
    public final int E(twg twgVar, ffh ffhVar, int i) {
        wci wciVar = this.o;
        wciVar.getClass();
        return ((cpf) wciVar).c(new sxe(twgVar, twgVar.getLayoutDirection()), new ln7(ffhVar, wfh.b, xfh.b, 1), ia6.b(i, 0, 13)).a();
    }

    @Override // defpackage.amd
    public final void G(f8j f8jVar) {
        wci wciVar = this.o;
        wciVar.getClass();
        ih2 ih2Var = (ih2) wciVar;
        if (ih2Var.a) {
            return;
        }
        ih2Var.a = true;
        zt3 zt3Var = ih2Var.b;
        if (zt3Var != null) {
            r7o r7oVar = z7o.b;
            zt3Var.resumeWith(Unit.a);
        }
        ih2Var.b = null;
    }

    @Override // defpackage.xci
    public final void K0() {
        S0(true);
    }

    @Override // defpackage.xci
    public final void L0() {
        T0();
    }

    @Override // defpackage.epf
    public final int M(twg twgVar, ffh ffhVar, int i) {
        wci wciVar = this.o;
        wciVar.getClass();
        return ((cpf) wciVar).c(new sxe(twgVar, twgVar.getLayoutDirection()), new ln7(ffhVar, wfh.a, xfh.a, 1), ia6.b(0, i, 7)).c();
    }

    public final void S0(boolean z) {
        if (!this.n) {
            sme.b("initializeModifier called on unattached node");
        }
        wci wciVar = this.o;
        if ((this.c & 32) != 0) {
            if (wciVar instanceof zci) {
                ik2 ik2Var = new ik2(this, 0);
                gpi gpiVar = ((AndroidComposeView) bcx.G(this)).a1;
                if (gpiVar.f(ik2Var) < 0) {
                    gpiVar.a(ik2Var);
                }
            }
            if (wciVar instanceof cdi) {
                cdi cdiVar = (cdi) wciVar;
                hk2 hk2Var = this.p;
                if (hk2Var == null || !hk2Var.o(cdiVar.getKey())) {
                    hk2 hk2Var2 = new hk2();
                    hk2Var2.a = cdiVar;
                    this.p = hk2Var2;
                    i4s i4sVar = (i4s) bcx.F(this).F.e;
                    i4sVar.getClass();
                    if (i4sVar.o) {
                        adi modifierLocalManager = bcx.G(this).getModifierLocalManager();
                        pzm key = cdiVar.getKey();
                        modifierLocalManager.b.d(this);
                        modifierLocalManager.c.d(key);
                        modifierLocalManager.a();
                    }
                } else {
                    hk2Var.a = cdiVar;
                    adi modifierLocalManager2 = bcx.G(this).getModifierLocalManager();
                    pzm key2 = cdiVar.getKey();
                    modifierLocalManager2.b.d(this);
                    modifierLocalManager2.c.d(key2);
                    modifierLocalManager2.a();
                }
            }
        }
        if ((this.c & 4) != 0 && !z) {
            bcx.D(this, 2).i1();
        }
        if ((this.c & 2) != 0) {
            i4s i4sVar2 = (i4s) bcx.F(this).F.e;
            i4sVar2.getClass();
            if (i4sVar2.o) {
                f8j f8jVar = this.h;
                f8jVar.getClass();
                ((gpf) f8jVar).B1(this);
                tzj tzjVar = f8jVar.F;
                if (tzjVar != null) {
                    tzjVar.invalidate();
                }
            }
            if (!z) {
                bcx.D(this, 2).i1();
                bcx.F(this).D();
            }
        }
        if (wciVar instanceof qsf) {
            qsf qsfVar = (qsf) wciVar;
            mpf F = bcx.F(this);
            switch (qsfVar.a) {
                case 0:
                    ((tsf) qsfVar.b).j = F;
                    break;
                case 1:
                    ((fvf) qsfVar.b).j = F;
                    break;
                default:
                    ((o3k) qsfVar.b).z.setValue(F);
                    break;
            }
        }
        if ((this.c & 256) != 0 && (wciVar instanceof ih2)) {
            i4s i4sVar3 = (i4s) bcx.F(this).F.e;
            i4sVar3.getClass();
            if (i4sVar3.o) {
                bcx.F(this).D();
            }
        }
        int i = this.c;
        if ((i & 16) != 0 && (wciVar instanceof tfm)) {
            ((tfm) wciVar).d.a = this.h;
        }
        if ((i & 8) != 0) {
            ((AndroidComposeView) bcx.G(this)).C();
        }
    }

    public final void T0() {
        if (!this.n) {
            sme.b("unInitializeModifier called on unattached node");
        }
        wci wciVar = this.o;
        if ((this.c & 32) != 0) {
            if (wciVar instanceof cdi) {
                adi modifierLocalManager = bcx.G(this).getModifierLocalManager();
                pzm key = ((cdi) wciVar).getKey();
                modifierLocalManager.d.d(bcx.F(this));
                modifierLocalManager.e.d(key);
                modifierLocalManager.a();
            }
            if (wciVar instanceof zci) {
                ((zci) wciVar).d(up6.a);
            }
        }
        if ((this.c & 8) != 0) {
            ((AndroidComposeView) bcx.G(this)).C();
        }
    }

    @Override // defpackage.vzj
    public final boolean U() {
        return this.n;
    }

    public final void U0() {
        if (this.n) {
            this.q.clear();
            bcx.G(this).getSnapshotObserver().a(this, rq1.x, new ik2(this, 1));
        }
    }

    @Override // defpackage.ofp
    public final void X(jfp jfpVar) {
        int i;
        wci wciVar = this.o;
        wciVar.getClass();
        jfp i2 = ((mfp) wciVar).i();
        jfpVar.getClass();
        tpi tpiVar = jfpVar.a;
        if (i2.c) {
            jfpVar.c = true;
        }
        if (i2.d) {
            jfpVar.d = true;
        }
        tpi tpiVar2 = i2.a;
        Object[] objArr = tpiVar2.b;
        Object[] objArr2 = tpiVar2.c;
        long[] jArr = tpiVar2.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i3 = 0;
        while (true) {
            long j = jArr[i3];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i4 = 8;
                int i5 = 8 - ((~(i3 - length)) >>> 31);
                int i6 = 0;
                while (i6 < i5) {
                    if ((255 & j) < 128) {
                        int i7 = (i3 << 3) + i6;
                        Object obj = objArr[i7];
                        Object obj2 = objArr2[i7];
                        xfp xfpVar = (xfp) obj;
                        if (!tpiVar.b(xfpVar)) {
                            tpiVar.m(xfpVar, obj2);
                        } else if (obj2 instanceof sa) {
                            Object g = tpiVar.g(xfpVar);
                            g.getClass();
                            sa saVar = (sa) g;
                            i = i4;
                            String str = saVar.a;
                            if (str == null) {
                                str = ((sa) obj2).a;
                            }
                            syc sycVar = saVar.b;
                            if (sycVar == null) {
                                sycVar = ((sa) obj2).b;
                            }
                            tpiVar.m(xfpVar, new sa(str, sycVar));
                            j >>= i;
                            i6++;
                            i4 = i;
                        }
                    }
                    i = i4;
                    j >>= i;
                    i6++;
                    i4 = i;
                }
                if (i5 != i4) {
                    return;
                }
            }
            if (i3 == length) {
                return;
            } else {
                i3++;
            }
        }
    }

    @Override // defpackage.ofm
    public final void Z() {
        wci wciVar = this.o;
        wciVar.getClass();
        sfm sfmVar = ((tfm) wciVar).d;
        qfm qfmVar = (qfm) sfmVar.b;
        tfm tfmVar = (tfm) sfmVar.c;
        if (qfmVar == qfm.b) {
            long uptimeMillis = SystemClock.uptimeMillis();
            rfm rfmVar = new rfm(tfmVar, 1);
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            obtain.setSource(0);
            rfmVar.invoke(obtain);
            obtain.recycle();
            sfmVar.b = qfm.a;
            tfmVar.c = false;
        }
    }

    @Override // defpackage.sv7, defpackage.ofm
    public final void a() {
        if (this.o instanceof tfm) {
            Z();
        }
    }

    @Override // defpackage.epf
    public final int b(twg twgVar, ffh ffhVar, int i) {
        wci wciVar = this.o;
        wciVar.getClass();
        return ((cpf) wciVar).c(new sxe(twgVar, twgVar.getLayoutDirection()), new ln7(ffhVar, wfh.b, xfh.a, 1), ia6.b(0, i, 7)).c();
    }

    @Override // defpackage.ipa
    public final void b0() {
        vq1.Z(this);
    }

    @Override // defpackage.epf
    public final lfh c(mfh mfhVar, ffh ffhVar, long j) {
        wci wciVar = this.o;
        wciVar.getClass();
        return ((cpf) wciVar).c(mfhVar, ffhVar, j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [kotlin.jvm.functions.Function0, uif] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11, types: [xci] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [xci] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [eqi] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [eqi] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // defpackage.bdi, defpackage.ddi
    public final Object d(pzm pzmVar) {
        cr crVar;
        this.q.add(pzmVar);
        if (!this.a.n) {
            sme.b("visitAncestors called on an unattached node");
        }
        xci xciVar = this.a.e;
        mpf F = bcx.F(this);
        while (F != null) {
            if ((((xci) F.F.f).d & 32) != 0) {
                while (xciVar != null) {
                    if ((xciVar.c & 32) != 0) {
                        cw7 cw7Var = xciVar;
                        ?? r4 = 0;
                        while (cw7Var != 0) {
                            if (cw7Var instanceof bdi) {
                                bdi bdiVar = (bdi) cw7Var;
                                if (bdiVar.D().o(pzmVar)) {
                                    return bdiVar.D().u(pzmVar);
                                }
                            } else if ((cw7Var.c & 32) != 0 && (cw7Var instanceof cw7)) {
                                xci xciVar2 = cw7Var.p;
                                int i = 0;
                                cw7Var = cw7Var;
                                r4 = r4;
                                while (xciVar2 != null) {
                                    if ((xciVar2.c & 32) != 0) {
                                        i++;
                                        r4 = r4;
                                        if (i == 1) {
                                            cw7Var = xciVar2;
                                        } else {
                                            if (r4 == 0) {
                                                r4 = new eqi(new xci[16]);
                                            }
                                            if (cw7Var != 0) {
                                                r4.d(cw7Var);
                                                cw7Var = 0;
                                            }
                                            r4.d(xciVar2);
                                        }
                                    }
                                    xciVar2 = xciVar2.f;
                                    cw7Var = cw7Var;
                                    r4 = r4;
                                }
                                if (i == 1) {
                                }
                            }
                            cw7Var = bcx.p(r4);
                        }
                    }
                    xciVar = xciVar.e;
                }
            }
            F = F.u();
            xciVar = (F == null || (crVar = F.F) == null) ? null : (i4s) crVar.e;
        }
        return pzmVar.a.invoke();
    }

    @Override // defpackage.nj3
    public final long e() {
        return nt0.Q(bcx.D(this, 128).c);
    }

    @Override // defpackage.nj3
    public final jx7 getDensity() {
        return bcx.F(this).y;
    }

    @Override // defpackage.nj3
    public final xof getLayoutDirection() {
        return bcx.F(this).z;
    }

    @Override // defpackage.a7k
    public final Object n(jx7 jx7Var, Object obj) {
        wci wciVar = this.o;
        wciVar.getClass();
        return ((z6k) wciVar).h();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.ofm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o(ffm ffmVar, gfm gfmVar, long j) {
        boolean z;
        wci wciVar = this.o;
        wciVar.getClass();
        sfm sfmVar = ((tfm) wciVar).d;
        sfmVar.getClass();
        List list = ffmVar.a;
        tfm tfmVar = (tfm) sfmVar.c;
        if (!tfmVar.c) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                lfm lfmVar = (lfm) list.get(i);
                if (!swf.z(lfmVar) && !swf.B(lfmVar)) {
                }
            }
            z = false;
            if (((qfm) sfmVar.b) != qfm.c) {
                if (gfmVar == gfm.a && z) {
                    sfmVar.p(ffmVar);
                }
                if (gfmVar == gfm.c && !z) {
                    sfmVar.p(ffmVar);
                }
            }
            if (gfmVar != gfm.c) {
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    if (!swf.B((lfm) list.get(i2))) {
                        return;
                    }
                }
                sfmVar.b = qfm.a;
                tfmVar.c = false;
                return;
            }
            return;
        }
        z = true;
        if (((qfm) sfmVar.b) != qfm.c) {
        }
        if (gfmVar != gfm.c) {
        }
    }

    @Override // defpackage.epf
    public final int p0(twg twgVar, ffh ffhVar, int i) {
        wci wciVar = this.o;
        wciVar.getClass();
        return ((cpf) wciVar).c(new sxe(twgVar, twgVar.getLayoutDirection()), new ln7(ffhVar, wfh.a, xfh.b, 1), ia6.b(i, 0, 13)).a();
    }

    @Override // defpackage.xoc
    public final void r(voc vocVar) {
        wci wciVar = this.o;
        sme.b("applyFocusProperties called on wrong node");
        wciVar.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.moc
    public final void t(bpc bpcVar) {
        wci wciVar = this.o;
        sme.b("onFocusEvent called on wrong node");
        wciVar.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.ipa
    public final void t0(opf opfVar) {
        wci wciVar = this.o;
        wciVar.getClass();
        ((aje) wciVar).a.a(opfVar);
    }

    public final String toString() {
        return this.o.toString();
    }

    @Override // defpackage.ofm
    public final void y() {
        wci wciVar = this.o;
        wciVar.getClass();
        ((tfm) wciVar).d.getClass();
    }

    @Override // defpackage.ofm
    public final boolean z0() {
        wci wciVar = this.o;
        wciVar.getClass();
        ((tfm) wciVar).d.getClass();
        return true;
    }

    @Override // defpackage.qof
    public final void R(wof wofVar) {
    }

    @Override // defpackage.qof
    public final void j(long j) {
    }
}
