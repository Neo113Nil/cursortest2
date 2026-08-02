package defpackage;

import android.graphics.Paint;
import android.graphics.Shader;
import android.text.TextPaint;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class yi0 extends TextPaint {
    public gh0 a;
    public aas b;
    public int c;
    public otp d;
    public d85 e;
    public ai3 f;
    public zx7 g;
    public nmq h;
    public kpa i;

    public final gh0 a() {
        gh0 gh0Var = this.a;
        if (gh0Var != null) {
            return gh0Var;
        }
        gh0 gh0Var2 = new gh0(this);
        this.a = gh0Var2;
        return gh0Var2;
    }

    public final void b(int i) {
        if (i == this.c) {
            return;
        }
        a().d(i);
        this.c = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0036, code lost:
    
        if ((r1 == null ? false : defpackage.nmq.a(r1.a, r7)) == false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(ai3 ai3Var, long j, float f) {
        if (ai3Var == null) {
            this.g = null;
            this.f = null;
            this.h = null;
            setShader(null);
            return;
        }
        if (ai3Var instanceof f3r) {
            d(tyf.D(f, ((f3r) ai3Var).a));
            return;
        }
        if (ai3Var instanceof ltp) {
            if (Intrinsics.d(this.f, ai3Var)) {
                nmq nmqVar = this.h;
            }
            if (j != 9205357640488583168L) {
                this.f = ai3Var;
                this.h = new nmq(j);
                this.g = szf.U(new xi0(ai3Var, j, 0));
            }
            gh0 a = a();
            zx7 zx7Var = this.g;
            a.h(zx7Var != null ? (Shader) zx7Var.getValue() : null);
            this.e = null;
            lxe.A(this, f);
        }
    }

    public final void d(long j) {
        d85 d85Var = this.e;
        if (d85Var == null ? false : d85.c(d85Var.a, j)) {
            return;
        }
        if (j != 16) {
            this.e = new d85(j);
            setColor(c3x.U(j));
            this.g = null;
            this.f = null;
            this.h = null;
            setShader(null);
        }
    }

    public final void e(kpa kpaVar) {
        if (kpaVar == null || Intrinsics.d(this.i, kpaVar)) {
            return;
        }
        this.i = kpaVar;
        if (kpaVar.equals(dbc.a)) {
            setStyle(Paint.Style.FILL);
            return;
        }
        if (kpaVar instanceof amr) {
            a().l(1);
            amr amrVar = (amr) kpaVar;
            a().k(amrVar.a);
            gh0 a = a();
            a.a.setStrokeMiter(amrVar.b);
            a().j(amrVar.d);
            a().i(amrVar.c);
            a().a.setPathEffect(null);
        }
    }

    public final void f(otp otpVar) {
        if (otpVar == null || Intrinsics.d(this.d, otpVar)) {
            return;
        }
        this.d = otpVar;
        if (otpVar.equals(otp.d)) {
            clearShadowLayer();
            return;
        }
        otp otpVar2 = this.d;
        float f = otpVar2.c;
        if (f == 0.0f) {
            f = Float.MIN_VALUE;
        }
        setShadowLayer(f, Float.intBitsToFloat((int) (otpVar2.b >> 32)), Float.intBitsToFloat((int) (this.d.b & 4294967295L)), c3x.U(this.d.a));
    }

    public final void g(aas aasVar) {
        if (aasVar == null || Intrinsics.d(this.b, aasVar)) {
            return;
        }
        this.b = aasVar;
        int i = aasVar.a;
        setUnderlineText((i | 1) == i);
        int i2 = this.b.a;
        setStrikeThruText((i2 | 2) == i2);
    }
}
