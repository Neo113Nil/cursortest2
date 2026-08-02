package defpackage;

import android.os.Build;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.EdgeEffect;
import androidx.compose.foundation.gestures.a;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class lxo extends hoa implements waf, ofp, yr5 {
    public final cyi A;
    public final bxo B;
    public final om7 C;
    public final iyo D;
    public final gxo E;
    public final dc6 F;
    public y5 G;
    public ixo H;
    public d18 I;
    public qg0 y;
    public jic z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [jic] */
    /* JADX WARN: Type inference failed for: r9v0, types: [cw7, java.lang.Object, lxo] */
    public lxo(qg0 qg0Var, sh3 sh3Var, jic jicVar, uoi uoiVar, bxj bxjVar, mxo mxoVar, boolean z, boolean z2) {
        super(dpo.F, z, uoiVar, bxjVar);
        this.y = qg0Var;
        this.z = jicVar;
        cyi cyiVar = new cyi();
        this.A = cyiVar;
        bxo bxoVar = new bxo();
        bxoVar.o = z;
        S0(bxoVar);
        this.B = bxoVar;
        om7 om7Var = new om7(new uf7(new gao((jx7) a.c)));
        this.C = om7Var;
        qg0 qg0Var2 = this.y;
        ?? r1 = this.z;
        iyo iyoVar = new iyo(mxoVar, qg0Var2, r1 == 0 ? om7Var : r1, bxjVar, z2, cyiVar, new kgk(15, this));
        this.D = iyoVar;
        gxo gxoVar = new gxo(iyoVar, z);
        this.E = gxoVar;
        dc6 dc6Var = new dc6(bxjVar, iyoVar, z2, sh3Var);
        S0(dc6Var);
        this.F = dc6Var;
        S0(new gyi(gxoVar, cyiVar));
        S0(new dpc(2, 4, null));
        ph3 ph3Var = new ph3();
        ph3Var.o = dc6Var;
        S0(ph3Var);
        hxo hxoVar = new hxo(0, this);
        gpc gpcVar = new gpc();
        gpcVar.o = hxoVar;
        S0(gpcVar);
    }

    @Override // defpackage.xci
    public final boolean H0() {
        return false;
    }

    @Override // defpackage.xci
    public final void K0() {
        if (this.n) {
            jx7 jx7Var = bcx.F(this).y;
            om7 om7Var = this.C;
            om7Var.getClass();
            om7Var.a = new uf7(new gao(jx7Var));
        }
        d18 d18Var = this.I;
        if (d18Var != null) {
            d18Var.e = bcx.F(this).y;
        }
    }

    @Override // defpackage.waf
    public final boolean Q(KeyEvent keyEvent) {
        return false;
    }

    @Override // defpackage.ofp
    public final void X(jfp jfpVar) {
        if (this.s && (this.G == null || this.H == null)) {
            this.G = new y5(28, this);
            this.H = new ixo(this, null);
        }
        y5 y5Var = this.G;
        if (y5Var != null) {
            s9f[] s9fVarArr = wfp.a;
            jfpVar.o(hfp.d, new sa(null, y5Var));
        }
        ixo ixoVar = this.H;
        if (ixoVar != null) {
            s9f[] s9fVarArr2 = wfp.a;
            jfpVar.o(hfp.e, ixoVar);
        }
    }

    @Override // defpackage.waf
    public final boolean Y(KeyEvent keyEvent) {
        long floatToRawIntBits;
        if (!this.s || ((!faf.a(saf.R(keyEvent), faf.l) && !faf.a(y2x.h(keyEvent.getKeyCode()), faf.k)) || saf.U(keyEvent) != 2 || keyEvent.isCtrlPressed())) {
            return false;
        }
        boolean z = this.D.d == bxj.a;
        dc6 dc6Var = this.F;
        if (z) {
            int i = (int) (dc6Var.w & 4294967295L);
            floatToRawIntBits = (Float.floatToRawIntBits(0.0f) << 32) | (4294967295L & Float.floatToRawIntBits(faf.a(y2x.h(keyEvent.getKeyCode()), faf.k) ? i : -i));
        } else {
            int i2 = (int) (dc6Var.w >> 32);
            floatToRawIntBits = (Float.floatToRawIntBits(0.0f) & 4294967295L) | (Float.floatToRawIntBits(faf.a(y2x.h(keyEvent.getKeyCode()), faf.k) ? i2 : -i2) << 32);
        }
        x97.y(G0(), null, null, new ixo(this, floatToRawIntBits, null, 1), 3);
        return true;
    }

    @Override // defpackage.hoa
    public final Object Z0(Function2 function2, Continuation continuation) {
        hqi hqiVar = hqi.b;
        iyo iyoVar = this.D;
        Object e = iyoVar.e(hqiVar, new kun((goa) function2, iyoVar, null, 10), (cg6) continuation);
        return e == nm6.a ? e : Unit.a;
    }

    @Override // defpackage.sv7, defpackage.ofm
    public final void a() {
        Z();
        if (this.n) {
            jx7 jx7Var = bcx.F(this).y;
            om7 om7Var = this.C;
            om7Var.getClass();
            om7Var.a = new uf7(new gao(jx7Var));
        }
        d18 d18Var = this.I;
        if (d18Var != null) {
            d18Var.e = bcx.F(this).y;
        }
    }

    @Override // defpackage.hoa
    public final void b1(long j) {
        x97.y(this.A.c(), null, null, new ixo(this, j, null, 0), 3);
    }

    @Override // defpackage.hoa
    public final boolean c1() {
        iyo iyoVar = this.D;
        if (iyoVar.a.b()) {
            return true;
        }
        qg0 qg0Var = iyoVar.b;
        if (qg0Var == null) {
            return false;
        }
        a1b a1bVar = qg0Var.c;
        EdgeEffect edgeEffect = a1bVar.d;
        if (edgeEffect != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? rf0.l(edgeEffect) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect2 = a1bVar.e;
        if (edgeEffect2 != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? rf0.l(edgeEffect2) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect3 = a1bVar.f;
        if (edgeEffect3 != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? rf0.l(edgeEffect3) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect4 = a1bVar.g;
        if (edgeEffect4 != null) {
            return (Build.VERSION.SDK_INT >= 31 ? rf0.l(edgeEffect4) : 0.0f) != 0.0f;
        }
        return false;
    }

    public final void e1(qg0 qg0Var, sh3 sh3Var, jic jicVar, uoi uoiVar, bxj bxjVar, mxo mxoVar, boolean z, boolean z2) {
        boolean z3;
        boolean z4 = true;
        boolean z5 = false;
        if (this.s != z) {
            this.E.b = z;
            this.B.o = z;
            z3 = true;
        } else {
            z3 = false;
        }
        jic jicVar2 = jicVar == null ? this.C : jicVar;
        iyo iyoVar = this.D;
        if (!Intrinsics.d(iyoVar.a, mxoVar)) {
            iyoVar.a = mxoVar;
            z5 = true;
        }
        iyoVar.b = qg0Var;
        if (iyoVar.d != bxjVar) {
            iyoVar.d = bxjVar;
            z5 = true;
        }
        if (iyoVar.e != z2) {
            iyoVar.e = z2;
        } else {
            z4 = z5;
        }
        iyoVar.c = jicVar2;
        iyoVar.f = this.A;
        dc6 dc6Var = this.F;
        dc6Var.o = bxjVar;
        dc6Var.q = z2;
        dc6Var.r = sh3Var;
        this.y = qg0Var;
        this.z = jicVar;
        dpo dpoVar = dpo.F;
        bxj bxjVar2 = iyoVar.d;
        bxj bxjVar3 = bxj.a;
        if (bxjVar2 != bxjVar3) {
            bxjVar3 = bxj.b;
        }
        d1(dpoVar, z, uoiVar, bxjVar3, z4);
        if (z3) {
            this.G = null;
            this.H = null;
            neg.w(this);
        }
    }

    /* JADX WARN: Type inference failed for: r5v16, types: [kotlin.jvm.functions.Function1, uif] */
    @Override // defpackage.hoa, defpackage.ofm
    public final void o(ffm ffmVar, gfm gfmVar, long j) {
        long j2;
        boolean d;
        List list = ffmVar.a;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            if (((Boolean) this.r.invoke((lfm) list.get(i))).booleanValue()) {
                super.o(ffmVar, gfmVar, j);
                break;
            }
            i++;
        }
        if (this.s) {
            if (gfmVar == gfm.a && ffmVar.d == 6) {
                if (this.I == null) {
                    this.I = new d18(this.D, new ozw(4, ViewConfiguration.get(kg5.I(this).getContext())), new tn5(2, this, lxo.class, "onWheelScrollStopped", "onWheelScrollStopped-TH1AsA0(J)V", 4, 2), bcx.F(this).y);
                }
                d18 d18Var = this.I;
                if (d18Var != null) {
                    mm6 G0 = G0();
                    if (((rar) d18Var.g) == null) {
                        d18Var.g = x97.y(G0, null, null, new zig(d18Var, (Continuation) null, 22), 3);
                    }
                }
            }
            d18 d18Var2 = this.I;
            if (d18Var2 == null || gfmVar != gfm.b) {
                return;
            }
            int i2 = ffmVar.d;
            List list2 = ffmVar.a;
            if (i2 == 6) {
                List list3 = list2;
                int size2 = list3.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    if (((lfm) list2.get(i3)).b()) {
                        return;
                    }
                }
                ozw ozwVar = (ozw) d18Var2.c;
                jx7 jx7Var = (jx7) d18Var2.e;
                ViewConfiguration viewConfiguration = (ViewConfiguration) ozwVar.b;
                int i4 = Build.VERSION.SDK_INT;
                float f = -(i4 > 26 ? woe.n(viewConfiguration) : jx7Var.n0(64));
                float f2 = -(i4 > 26 ? woe.l(viewConfiguration) : jx7Var.n0(64));
                enj enjVar = new enj(0L);
                int size3 = list3.size();
                int i5 = 0;
                while (true) {
                    j2 = enjVar.a;
                    if (i5 >= size3) {
                        break;
                    }
                    enjVar = new enj(enj.h(j2, ((lfm) list2.get(i5)).j));
                    i5++;
                }
                long floatToRawIntBits = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 >> 32)) * f2) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L)) * f) & 4294967295L);
                iyo iyoVar = (iyo) d18Var2.b;
                float f3 = iyoVar.f(iyoVar.d(floatToRawIntBits));
                if (f3 == 0.0f) {
                    d = false;
                } else {
                    mxo mxoVar = iyoVar.a;
                    d = f3 > 0.0f ? mxoVar.d() : mxoVar.c();
                }
                if (d ? !(((zi3) d18Var2.f).c(new efi(false, floatToRawIntBits, ((lfm) CollectionsKt.Q(list2)).b)) instanceof fd4) : d18Var2.a) {
                    int size4 = list3.size();
                    for (int i6 = 0; i6 < size4; i6++) {
                        ((lfm) list2.get(i6)).a();
                    }
                }
            }
        }
    }

    @Override // defpackage.hoa
    public final void a1(long j) {
    }
}
