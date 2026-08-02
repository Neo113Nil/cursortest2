package defpackage;

import android.view.View;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.window.e;
import com.yandex.go.design.compose.slot.SlotSize;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class urb1 {
    public static final void a(ArrayList arrayList, tls tlsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1950393963);
        int i2 = 2;
        int i3 = (btsVar.e(arrayList) ? 4 : 2) | i | (btsVar.e(tlsVar) ? 32 : 16);
        if (btsVar.V(i3 & 1, (i3 & 19) != 18)) {
            yib1.c(ljs0.q(an91.o(c530.a, 0.0f, 8.0f, 0.0f, 0.0f, 13), 270.0f), cyk0.c(16.0f), ((el51) btsVar.m(gl51.a)).d(), 0L, wwg.S(794926801, true, new lob(arrayList, tlsVar), btsVar), btsVar, 1572870);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new lob(arrayList, tlsVar, i, i2);
        }
    }

    public static final void b(String str, wls wlsVar, String str2, tls tlsVar, fid fidVar, int i) {
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(2077495866);
        int i2 = i | (btsVar2.k(str) ? 4 : 2) | (btsVar2.e(wlsVar) ? 32 : 16) | (btsVar2.k(str2) ? 256 : 128) | (btsVar2.e(tlsVar) ? 2048 : 1024);
        if (btsVar2.V(i2 & 1, (i2 & 1171) != 1170)) {
            boolean z = ((i2 & 14) == 4) | ((i2 & 7168) == 2048) | ((i2 & 896) == 256);
            Object Q = btsVar2.Q();
            if (z || Q == did.a) {
                Q = new sb0(21, tlsVar, str, str2);
                btsVar2.o0(Q);
            }
            btsVar = btsVar2;
            web1.c(q791.d(c530.a, false, null, null, (sls) Q, 15), 56.0f, false, 0.0f, null, null, wwg.S(-1568557026, true, new q0(str, 12), btsVar2), null, null, wlsVar, null, null, false, btsVar, ((i2 << 24) & 1879048192) | 1572864, 0, 7612);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new rb0((Object) str, (Object) wlsVar, (Object) str2, tlsVar, i, 20);
        }
    }

    public static final void c(final ibp0 ibp0Var, final pvi0 pvi0Var, jt1 jt1Var, nhe nheVar, float f, int i, a aVar, fid fidVar, int i2) {
        int i3;
        final jt1 jt1Var2;
        final nhe nheVar2;
        final float f2;
        final int i4;
        final int i5;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-2005496799);
        if ((i2 & 6) == 0) {
            i3 = (btsVar.k(ibp0Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= btsVar.k(pvi0Var) ? 32 : 16;
        }
        int i6 = i2 & 384;
        c530 c530Var = c530.a;
        if (i6 == 0) {
            i3 |= btsVar.k(c530Var) ? 256 : 128;
        }
        int i7 = 14380032 | i3;
        if ((100663296 & i2) == 0) {
            i7 = 47934464 | i3;
        }
        if ((805306368 & i2) == 0) {
            i7 |= btsVar.e(aVar) ? 536870912 : SelfTester_JCP.IMITA;
        }
        if (btsVar.V(i7 & 1, (306783379 & i7) != 306783378)) {
            btsVar.a0();
            if ((i2 & 1) == 0 || btsVar.C()) {
                uo5 uo5Var = x4c.y;
                nheVar2 = mhe.b;
                i4 = 1;
                f2 = 1.0f;
                i5 = i7 & (-234881025);
                jt1Var2 = uo5Var;
            } else {
                btsVar.Y();
                int i8 = i7 & (-234881025);
                jt1Var2 = jt1Var;
                nheVar2 = nheVar;
                f2 = f;
                i4 = i;
                i5 = i8;
            }
            btsVar.u();
            zls zlsVar = new zls(pvi0Var, jt1Var2, nheVar2, f2, i4, i5) { // from class: v901
                public final /* synthetic */ jt1 b;
                public final /* synthetic */ nhe c;
                public final /* synthetic */ float w;
                public final /* synthetic */ int x;
                public final /* synthetic */ int y;

                {
                    this.b = jt1Var2;
                    this.c = nheVar2;
                    this.w = f2;
                    this.x = i4;
                    this.y = i5;
                }

                @Override // defpackage.zls
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    n8v n8vVar = (n8v) obj;
                    fid fidVar2 = (fid) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    SlotSize c = ibp0.this.c();
                    float size = c.getSize();
                    c530 c530Var2 = c530.a;
                    f530 b = ljs0.b(c530Var2, 0.0f, size, 1);
                    z910 d = pi6.d(x4c.y, false);
                    bts btsVar2 = (bts) fidVar2;
                    int hashCode = Long.hashCode(btsVar2.T);
                    r1b0 o = btsVar2.o();
                    f530 d2 = b.d(fidVar2, b);
                    ohd.G1.getClass();
                    sls slsVar = d.b;
                    bts btsVar3 = (bts) fidVar2;
                    if (btsVar3.a == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar3.i0();
                    if (btsVar3.S) {
                        btsVar3.n(slsVar);
                    } else {
                        btsVar3.r0();
                    }
                    qje.W(fidVar2, d.f, d);
                    qje.W(fidVar2, d.e, o);
                    qje.W(fidVar2, d.g, Integer.valueOf(hashCode));
                    qje.M(fidVar2, d.h);
                    qje.W(fidVar2, d.d, d2);
                    f530 o2 = an91.o(c530Var2, deb1.b(c) ? 8.0f : 16.0f, 0.0f, 0.0f, 0.0f, 14);
                    int i9 = this.y >> 3;
                    j4b1.c(n8vVar, o2, null, null, this.b, this.c, this.w, this.x, fidVar2, (intValue & 14) | (i9 & 7168) | (57344 & i9) | (458752 & i9) | (3670016 & i9) | (i9 & 29360128), 0);
                    btsVar3.t(true);
                    return zy11.a;
                }
            };
            int i9 = ((i5 >> 3) & 14) | ((i5 >> 18) & 7168);
            ywy ywyVar = (ywy) ffb1.f(pvi0Var, btsVar, i9 & 14).getValue();
            if (jl40.l(ywyVar, wwy.a)) {
                btsVar.e0(-576192361);
                com.yandex.go.design.compose.loading.b.a(ljs0.m(an91.o(c530Var, deb1.b(ibp0Var.c()) ? 8.0f : 16.0f, 0.0f, 0.0f, 0.0f, 14), 24.0f), null, false, null, null, null, false, btsVar, 0, 254);
                btsVar = btsVar;
                btsVar.t(false);
            } else if (ywyVar instanceof xwy) {
                btsVar.e0(-576123541);
                zlsVar.invoke(((xwy) ywyVar).a, btsVar, 0);
                btsVar.t(false);
            } else {
                if (!jl40.l(ywyVar, vwy.a)) {
                    throw unr0.y(1505431128, btsVar, false);
                }
                btsVar.e0(-576049575);
                nnm.p((i9 >> 9) & 14, aVar, btsVar, false);
            }
        } else {
            btsVar.Y();
            jt1Var2 = jt1Var;
            nheVar2 = nheVar;
            f2 = f;
            i4 = i;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new w901(ibp0Var, pvi0Var, jt1Var2, nheVar2, f2, i4, aVar, i2);
        }
    }

    public static final void d(long j, long j2, ArrayList arrayList, sls slsVar, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar;
        uo5 uo5Var = x4c.C;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-675275433);
        if ((i & 6) == 0) {
            i2 = (btsVar2.k(uo5Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar2.d(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar2.d(j2) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar2.e(arrayList) ? 2048 : 1024;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i2 |= btsVar2.e(slsVar) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= btsVar2.e(tlsVar) ? 131072 : 65536;
        }
        if (btsVar2.V(i2 & 1, (74899 & i2) != 74898)) {
            Object Q = btsVar2.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = new int[2];
                btsVar2.o0(Q);
            }
            int[] iArr = (int[]) Q;
            ((View) btsVar2.m(AndroidCompositionLocals_androidKt.f)).getLocationOnScreen(iArr);
            boolean k = ((i2 & 896) == 256) | btsVar2.k(iArr) | ((i2 & 14) == 4) | ((i2 & 112) == 32);
            Object Q2 = btsVar2.Q();
            if (k || Q2 == o430Var) {
                oif oifVar = new oif(j2, iArr, uo5Var, j);
                btsVar2.o0(oifVar);
                Q2 = oifVar;
            }
            btsVar = btsVar2;
            e.a((oif) Q2, slsVar, new eae0(true, false, 14), wwg.S(609894005, true, new j9a(17, arrayList, tlsVar, slsVar), btsVar2), btsVar, ((i2 >> 9) & 112) | 3456, 0);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new l57(j, j2, arrayList, slsVar, tlsVar, i);
        }
    }

    public static String e(Class cls) {
        LinkedHashMap linkedHashMap = ke50.b;
        String str = (String) linkedHashMap.get(cls);
        if (str == null) {
            oa50 oa50Var = (oa50) cls.getAnnotation(oa50.class);
            str = oa50Var != null ? oa50Var.value() : null;
            if (str == null || str.length() <= 0) {
                w511.f("No @Navigator.Name annotation found for ".concat(cls.getSimpleName()));
                return null;
            }
            linkedHashMap.put(cls, str);
        }
        return str;
    }
}
