package defpackage;

import androidx.compose.foundation.layout.d;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public abstract class k8a {
    public static final float a;
    public static final float b;
    public static final float c;
    public static final float d;

    static {
        float f = 8;
        a = f;
        float f2 = 12;
        b = f2;
        c = f;
        d = (((f * 2) + f2) * 4) - f2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00b0, code lost:
    
        if (r6 == defpackage.gq5.a) goto L19;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(yci yciVar, hq5 hq5Var, int i) {
        Object obj;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-222205711);
        int i2 = 4;
        if ((((oq5Var.f(yciVar) ? 4 : 2) | i) & 3) == 2 && oq5Var.z()) {
            oq5Var.S();
        } else {
            xje D = fgq.D(null, oq5Var, 1);
            float f = 360.0f / 10;
            oq5Var.Z(1208683463);
            ArrayList arrayList = new ArrayList(10);
            int i3 = 0;
            int i4 = 0;
            while (i4 < 10) {
                float f2 = i4 * f;
                arrayList.add(fgq.s(D, f2, f2 + 360.0f, weo.C(weo.S(6000, i3, nya.d, 2), jyn.a, 0L, i2), null, oq5Var, 4104, 8));
                i4++;
                i3 = 0;
                i2 = 4;
            }
            boolean z = i3;
            oq5Var.p(z);
            long b2 = d85.b(((dq0) oq5Var.j(eq0.a)).a.c, 0.3f, 0.0f, 0.0f, 0.0f, 14);
            yci m = d.m(yciVar, d);
            boolean f3 = oq5Var.f(arrayList) | oq5Var.e(b2);
            Object K = oq5Var.K();
            if (!f3) {
                obj = K;
            }
            Object nk6Var = new nk6(arrayList, b2, 1);
            oq5Var.k0(nk6Var);
            obj = nk6Var;
            ksw.j(z ? 1 : 0, oq5Var, m, (Function1) obj);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new u71(yciVar, i, 25);
        }
    }

    public static final void b(yci yciVar, hq5 hq5Var, int i) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(764362370);
        if ((((oq5Var.f(yciVar) ? 4 : 2) | i) & 3) == 2 && oq5Var.z()) {
            oq5Var.S();
        } else {
            long j = ((dq0) oq5Var.j(eq0.a)).a.c;
            wje s = fgq.s(fgq.D(null, oq5Var, 1), 0.0f, 2.0f, weo.C(weo.S(2000, 0, nya.d, 2), null, 0L, 6), null, oq5Var, 4536, 8);
            yci o = d.o(yciVar, d, a + c);
            boolean f = oq5Var.f(s) | oq5Var.e(j);
            Object K = oq5Var.K();
            if (f || K == gq5.a) {
                K = new j8a(j, s, 0);
                oq5Var.k0(K);
            }
            ksw.j(0, oq5Var, o, (Function1) K);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new u71(yciVar, i, 26);
        }
    }
}
