package defpackage;

import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class nqd extends nwt {
    public float[] b;
    public nh0 h;
    public Function1 i;
    public float l;
    public float m;
    public float n;
    public float q;
    public float r;
    public final ArrayList c = new ArrayList();
    public boolean d = true;
    public long e = d85.n;
    public List f = nzt.a;
    public boolean g = true;
    public final kma j = new kma(18, this);
    public String k = "";
    public float o = 1.0f;
    public float p = 1.0f;
    public boolean s = true;

    @Override // defpackage.nwt
    public final void a(jpa jpaVar) {
        if (this.s) {
            float[] fArr = this.b;
            if (fArr == null) {
                fArr = feh.a();
                this.b = fArr;
            } else {
                feh.d(fArr);
            }
            feh.f(fArr, this.q + this.m, this.r + this.n);
            float f = this.l;
            if (fArr.length >= 16) {
                double d = f * 0.017453292519943295d;
                float sin = (float) Math.sin(d);
                float cos = (float) Math.cos(d);
                float f2 = fArr[0];
                float f3 = fArr[4];
                float f4 = (sin * f3) + (cos * f2);
                float f5 = -sin;
                float f6 = (f3 * cos) + (f2 * f5);
                float f7 = fArr[1];
                float f8 = fArr[5];
                float f9 = (sin * f8) + (cos * f7);
                float f10 = (f8 * cos) + (f7 * f5);
                float f11 = fArr[2];
                float f12 = fArr[6];
                float f13 = (sin * f12) + (cos * f11);
                float f14 = (f12 * cos) + (f11 * f5);
                float f15 = fArr[3];
                float f16 = fArr[7];
                fArr[0] = f4;
                fArr[1] = f9;
                fArr[2] = f13;
                fArr[3] = (sin * f16) + (cos * f15);
                fArr[4] = f6;
                fArr[5] = f10;
                fArr[6] = f14;
                fArr[7] = (cos * f16) + (f5 * f15);
            }
            float f17 = this.o;
            float f18 = this.p;
            if (fArr.length >= 16) {
                fArr[0] = fArr[0] * f17;
                fArr[1] = fArr[1] * f17;
                fArr[2] = fArr[2] * f17;
                fArr[3] = fArr[3] * f17;
                fArr[4] = fArr[4] * f18;
                fArr[5] = fArr[5] * f18;
                fArr[6] = fArr[6] * f18;
                fArr[7] = fArr[7] * f18;
                fArr[8] = fArr[8] * 1.0f;
                fArr[9] = fArr[9] * 1.0f;
                fArr[10] = fArr[10] * 1.0f;
                fArr[11] = fArr[11] * 1.0f;
            }
            feh.f(fArr, -this.m, -this.n);
            this.s = false;
        }
        if (this.g) {
            if (!this.f.isEmpty()) {
                nh0 nh0Var = this.h;
                if (nh0Var == null) {
                    nh0Var = ph0.a();
                    this.h = nh0Var;
                }
                o5g.Q(this.f, nh0Var);
            }
            this.g = false;
        }
        nsh q0 = jpaVar.q0();
        long B = q0.B();
        q0.s().r();
        try {
            nsh nshVar = (nsh) ((xzi) q0.b).a;
            float[] fArr2 = this.b;
            if (fArr2 != null) {
                nshVar.s().u(fArr2);
            }
            nh0 nh0Var2 = this.h;
            if (!this.f.isEmpty() && nh0Var2 != null) {
                nshVar.s().h(nh0Var2);
            }
            ArrayList arrayList = this.c;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((nwt) arrayList.get(i)).a(jpaVar);
            }
        } finally {
            vz1.A(q0, B);
        }
    }

    @Override // defpackage.nwt
    public final Function1 b() {
        return this.i;
    }

    @Override // defpackage.nwt
    public final void d(kma kmaVar) {
        this.i = kmaVar;
    }

    public final void e(int i, nwt nwtVar) {
        ArrayList arrayList = this.c;
        if (i < arrayList.size()) {
            arrayList.set(i, nwtVar);
        } else {
            arrayList.add(nwtVar);
        }
        g(nwtVar);
        nwtVar.d(this.j);
        c();
    }

    public final void f(long j) {
        if (this.d && j != 16) {
            long j2 = this.e;
            if (j2 == 16) {
                this.e = j;
                return;
            }
            c5b c5bVar = nzt.a;
            if (d85.h(j2) == d85.h(j) && d85.g(j2) == d85.g(j) && d85.e(j2) == d85.e(j)) {
                return;
            }
            this.d = false;
            this.e = d85.n;
        }
    }

    public final void g(nwt nwtVar) {
        if (!(nwtVar instanceof gak)) {
            if (nwtVar instanceof nqd) {
                nqd nqdVar = (nqd) nwtVar;
                if (nqdVar.d && this.d) {
                    f(nqdVar.e);
                    return;
                } else {
                    this.d = false;
                    this.e = d85.n;
                    return;
                }
            }
            return;
        }
        gak gakVar = (gak) nwtVar;
        ai3 ai3Var = gakVar.b;
        if (this.d && ai3Var != null) {
            if (ai3Var instanceof f3r) {
                f(((f3r) ai3Var).a);
            } else {
                this.d = false;
                this.e = d85.n;
            }
        }
        ai3 ai3Var2 = gakVar.g;
        if (this.d && ai3Var2 != null) {
            if (ai3Var2 instanceof f3r) {
                f(((f3r) ai3Var2).a);
            } else {
                this.d = false;
                this.e = d85.n;
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VGroup: ");
        sb.append(this.k);
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            nwt nwtVar = (nwt) arrayList.get(i);
            sb.append(StringUtil.TAB);
            sb.append(nwtVar.toString());
            sb.append(StringUtil.LF);
        }
        return sb.toString();
    }
}
