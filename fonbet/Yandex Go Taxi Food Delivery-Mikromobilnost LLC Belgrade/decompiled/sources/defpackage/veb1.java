package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import java.util.List;
import kotlin.collections.a;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes5.dex */
public abstract class veb1 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v24 */
    public static final void a(final f530 f530Var, int i, int i2, final float f, final float f2, final float f3, final Object obj, final tls tlsVar, fid fidVar, final int i3, final int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        final int i9;
        aii0 aii0Var;
        wls wlsVar;
        int i10;
        int i11;
        Object jmt0Var;
        lmt0 lmt0Var;
        ?? r2;
        boolean z;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1666819758);
        int i12 = i3 | (btsVar.k(f530Var) ? 4 : 2);
        int i13 = i4 & 2;
        if (i13 != 0) {
            i6 = i12 | 48;
            i5 = i;
        } else {
            i5 = i;
            i6 = i12 | (btsVar.c(i5) ? 32 : 16);
        }
        int i14 = i4 & 4;
        if (i14 != 0) {
            i8 = i6 | 384;
            i7 = i2;
        } else {
            i7 = i2;
            i8 = i6 | (btsVar.c(i7) ? 256 : 128);
        }
        int i15 = i8 | (btsVar.b(f) ? 2048 : 1024) | (btsVar.b(f2) ? 16384 : 8192) | (btsVar.b(f3) ? 131072 : 65536) | (btsVar.e(obj) ? 1048576 : 524288) | (btsVar.e(tlsVar) ? SelfTester_JCP.ENCRYPT_CNT : SelfTester_JCP.ENCRYPT_CBC);
        if (btsVar.V(i15 & 1, (4793491 & i15) != 4793490)) {
            if (i13 != 0) {
                i5 = 0;
            }
            int i16 = i14 != 0 ? 0 : i7;
            boolean k = btsVar.k(obj);
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (k || Q == o430Var) {
                Q = new lmt0();
                tlsVar.invoke(Q);
                btsVar.o0(Q);
            }
            lmt0 lmt0Var2 = (lmt0) Q;
            if (i5 != 0) {
                i10 = i5;
            } else {
                int size = lmt0Var2.a.size();
                i10 = 0;
                int i17 = 0;
                while (i17 < size) {
                    jlt0 jlt0Var = ((gmt0) lmt0Var2.a.get(i17)).a;
                    i10 = Math.max(i10, jlt0Var.a + jlt0Var.c);
                    i17++;
                    i16 = i16;
                }
            }
            final int i18 = i16;
            if (i18 != 0) {
                i11 = i18;
            } else {
                int i19 = 0;
                i11 = 0;
                for (int size2 = lmt0Var2.a.size(); i19 < size2; size2 = size2) {
                    jlt0 jlt0Var2 = ((gmt0) lmt0Var2.a.get(i19)).a;
                    i11 = Math.max(i11, jlt0Var2.b + jlt0Var2.d);
                    i19++;
                }
            }
            if (i11 == 0 || i10 == 0) {
                aii0Var = btsVar.v();
                if (aii0Var != null) {
                    final int i20 = 0;
                    final int i21 = i5;
                    wlsVar = new wls(f530Var, i21, i18, f, f2, f3, obj, tlsVar, i3, i4, i20) { // from class: hmt0
                        public final /* synthetic */ Object A;
                        public final /* synthetic */ tls B;
                        public final /* synthetic */ int C;
                        public final /* synthetic */ int a;
                        public final /* synthetic */ f530 b;
                        public final /* synthetic */ int c;
                        public final /* synthetic */ int w;
                        public final /* synthetic */ float x;
                        public final /* synthetic */ float y;
                        public final /* synthetic */ float z;

                        {
                            this.a = i20;
                            this.C = i4;
                        }

                        @Override // defpackage.wls
                        public final Object invoke(Object obj2, Object obj3) {
                            int i22 = this.a;
                            zy11 zy11Var = zy11.a;
                            switch (i22) {
                                case 0:
                                    ((Integer) obj3).getClass();
                                    int O = vng.O(1);
                                    veb1.a(this.b, this.c, this.w, this.x, this.y, this.z, this.A, this.B, (fid) obj2, O, this.C);
                                    break;
                                default:
                                    ((Integer) obj3).getClass();
                                    int O2 = vng.O(1);
                                    veb1.a(this.b, this.c, this.w, this.x, this.y, this.z, this.A, this.B, (fid) obj2, O2, this.C);
                                    break;
                            }
                            return zy11Var;
                        }
                    };
                    aii0Var.d = wlsVar;
                }
                return;
            }
            boolean c = ((i15 & HProv.ALG_CLASS_ALL) == 16384) | ((i15 & 7168) == 2048) | btsVar.c(i10) | ((458752 & i15) == 131072) | btsVar.c(i11) | btsVar.e(lmt0Var2);
            Object Q2 = btsVar.Q();
            if (c || Q2 == o430Var) {
                lmt0Var = lmt0Var2;
                r2 = 0;
                z = true;
                jmt0Var = new jmt0(f, i10, f3, f2, i11, lmt0Var);
                btsVar.o0(jmt0Var);
            } else {
                jmt0Var = Q2;
                lmt0Var = lmt0Var2;
                r2 = 0;
                z = true;
            }
            z910 z910Var = (z910) jmt0Var;
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, f530Var);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, d.f, z910Var);
            qje.W(btsVar, d.e, o);
            wls wlsVar2 = d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar2);
            }
            qje.W(btsVar, d.d, d);
            btsVar.e0(-1753345039);
            int size3 = lmt0Var.a.size();
            for (int i22 = r2; i22 < size3; i22++) {
                ((gmt0) lmt0Var.a.get(i22)).b.invoke(btsVar, Integer.valueOf((int) r2));
            }
            btsVar.t(r2);
            btsVar.t(z);
            i9 = i18;
        } else {
            btsVar.Y();
            i9 = i7;
        }
        final int i23 = i5;
        aii0Var = btsVar.v();
        if (aii0Var != null) {
            final int i24 = 1;
            wlsVar = new wls(f530Var, i23, i9, f, f2, f3, obj, tlsVar, i3, i4, i24) { // from class: hmt0
                public final /* synthetic */ Object A;
                public final /* synthetic */ tls B;
                public final /* synthetic */ int C;
                public final /* synthetic */ int a;
                public final /* synthetic */ f530 b;
                public final /* synthetic */ int c;
                public final /* synthetic */ int w;
                public final /* synthetic */ float x;
                public final /* synthetic */ float y;
                public final /* synthetic */ float z;

                {
                    this.a = i24;
                    this.C = i4;
                }

                @Override // defpackage.wls
                public final Object invoke(Object obj2, Object obj3) {
                    int i222 = this.a;
                    zy11 zy11Var = zy11.a;
                    switch (i222) {
                        case 0:
                            ((Integer) obj3).getClass();
                            int O = vng.O(1);
                            veb1.a(this.b, this.c, this.w, this.x, this.y, this.z, this.A, this.B, (fid) obj2, O, this.C);
                            break;
                        default:
                            ((Integer) obj3).getClass();
                            int O2 = vng.O(1);
                            veb1.a(this.b, this.c, this.w, this.x, this.y, this.z, this.A, this.B, (fid) obj2, O2, this.C);
                            break;
                    }
                    return zy11Var;
                }
            };
            aii0Var.d = wlsVar;
        }
    }

    public static p48 b() {
        return new p48();
    }

    public static final String c(List list) {
        if (list.isEmpty()) {
            list = null;
        }
        if (list != null) {
            return a.X(list, ",", null, null, null, 62);
        }
        return null;
    }
}
