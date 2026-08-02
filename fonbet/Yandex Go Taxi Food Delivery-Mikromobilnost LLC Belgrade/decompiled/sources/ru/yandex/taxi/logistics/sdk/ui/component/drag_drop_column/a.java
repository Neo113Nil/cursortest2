package ru.yandex.taxi.logistics.sdk.ui.component.drag_drop_column;

import android.view.View;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.b;
import androidx.compose.runtime.f;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.j;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.ar.core.ImageMetadata;
import defpackage.a7y;
import defpackage.adb1;
import defpackage.aii0;
import defpackage.an91;
import defpackage.bms;
import defpackage.bts;
import defpackage.c530;
import defpackage.did;
import defpackage.f530;
import defpackage.fid;
import defpackage.fwi;
import defpackage.g990;
import defpackage.k0j0;
import defpackage.l690;
import defpackage.ljs0;
import defpackage.m0j0;
import defpackage.m3u0;
import defpackage.oz40;
import defpackage.rsm;
import defpackage.s07;
import defpackage.scc;
import defpackage.sls;
import defpackage.sue0;
import defpackage.t6;
import defpackage.tcc;
import defpackage.tls;
import defpackage.tse;
import defpackage.vs9;
import defpackage.w511;
import defpackage.wls;
import defpackage.y7m;
import defpackage.yx40;
import defpackage.z8m;
import defpackage.zpn;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.EmptyCoroutineContext;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.logistics.sdk.ui.component.drag_drop_column.utils.g;

/* loaded from: classes5.dex */
public abstract class a {
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0439, code lost:
    
        if (r4 == null) goto L225;
     */
    /* JADX WARN: Removed duplicated region for block: B:182:0x04df  */
    /* JADX WARN: Removed duplicated region for block: B:184:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:226:0x04d0  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(f530 f530Var, Integer num, ArrayList arrayList, boolean z, final wls wlsVar, final tls tlsVar, tls tlsVar2, b bVar, fid fidVar, int i, int i2) {
        f530 f530Var2;
        int i3;
        ArrayList arrayList2;
        boolean z2;
        int i4;
        tls tlsVar3;
        b bVar2;
        bts btsVar;
        b bVar3;
        f530 f530Var3;
        boolean z3;
        tls tlsVar4;
        aii0 v;
        f530 f530Var4;
        int i5;
        b bVar4;
        final boolean z4;
        ArrayList arrayList3;
        boolean z5;
        g990 g990Var;
        Object m0j0Var;
        f530 f530Var5;
        f530 f530Var6;
        boolean z6;
        tls tlsVar5;
        int i6;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(1656952274);
        int i7 = i2 & 1;
        if (i7 != 0) {
            i3 = i | 6;
            f530Var2 = f530Var;
        } else if ((i & 6) == 0) {
            f530Var2 = f530Var;
            i3 = (btsVar2.k(f530Var2) ? 4 : 2) | i;
        } else {
            f530Var2 = f530Var;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= btsVar2.k(num) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            arrayList2 = arrayList;
            i3 |= btsVar2.e(arrayList2) ? 256 : 128;
        } else {
            arrayList2 = arrayList;
        }
        int i8 = i2 & 8;
        if (i8 != 0) {
            i3 |= HProv.ALG_TYPE_SECURECHANNEL;
        } else if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            z2 = z;
            i3 |= btsVar2.a(z2) ? 2048 : 1024;
            if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
                i3 |= btsVar2.e(wlsVar) ? 16384 : 8192;
            }
            if ((i & ImageMetadata.EDGE_MODE) == 0) {
                i3 |= btsVar2.e(tlsVar) ? 131072 : 65536;
            }
            i4 = i2 & 64;
            if (i4 == 0) {
                i3 |= 1572864;
                tlsVar3 = tlsVar2;
            } else {
                tlsVar3 = tlsVar2;
                if ((i & 1572864) == 0) {
                    i3 |= btsVar2.e(tlsVar3) ? 1048576 : 524288;
                }
            }
            if ((i & 12582912) != 0) {
                if ((i2 & 128) == 0) {
                    bVar2 = bVar;
                    if (btsVar2.k(bVar2)) {
                        i6 = SelfTester_JCP.ENCRYPT_CNT;
                        i3 |= i6;
                    }
                } else {
                    bVar2 = bVar;
                }
                i6 = SelfTester_JCP.ENCRYPT_CBC;
                i3 |= i6;
            } else {
                bVar2 = bVar;
            }
            if (btsVar2.V(i3 & 1, (i3 & 4793491) == 4793490)) {
                btsVar = btsVar2;
                btsVar.Y();
                bVar3 = bVar2;
                f530Var3 = f530Var2;
                z3 = z2;
                tlsVar4 = tlsVar3;
            } else {
                btsVar2.a0();
                if ((i & 1) == 0 || btsVar2.C()) {
                    f530Var4 = i7 != 0 ? c530.a : f530Var2;
                    if (i8 != 0) {
                        z2 = true;
                    }
                    if (i4 != 0) {
                        tlsVar3 = null;
                    }
                    if ((i2 & 128) != 0) {
                        i5 = 0;
                        bVar2 = a7y.a(0, 3, btsVar2);
                        i3 &= -29360129;
                    } else {
                        i5 = 0;
                    }
                    bVar4 = bVar2;
                    z4 = z2;
                } else {
                    btsVar2.Y();
                    if ((i2 & 128) != 0) {
                        i3 &= -29360129;
                    }
                    bVar4 = bVar2;
                    f530Var4 = f530Var2;
                    z4 = z2;
                    i5 = 0;
                }
                btsVar2.u();
                final View view = (View) btsVar2.m(AndroidCompositionLocals_androidKt.f);
                Object Q = btsVar2.Q();
                Object obj = did.a;
                if (Q == obj) {
                    Q = f.g(i5);
                    btsVar2.o0(Q);
                }
                final yx40 yx40Var = (yx40) Q;
                Object Q2 = btsVar2.Q();
                if (Q2 == obj) {
                    Q2 = f.g(i5);
                    btsVar2.o0(Q2);
                }
                final yx40 yx40Var2 = (yx40) Q2;
                Object Q3 = btsVar2.Q();
                if (Q3 == obj) {
                    Q3 = f.j(Boolean.TRUE);
                    btsVar2.o0(Q3);
                }
                final oz40 oz40Var = (oz40) Q3;
                Object Q4 = btsVar2.Q();
                if (Q4 == obj) {
                    Q4 = f.j(null);
                    btsVar2.o0(Q4);
                }
                oz40 oz40Var2 = (oz40) Q4;
                boolean z7 = (i3 & 112) == 32;
                Object Q5 = btsVar2.Q();
                if (z7 || Q5 == obj) {
                    Q5 = f.j(arrayList2);
                    btsVar2.o0(Q5);
                }
                final oz40 oz40Var3 = (oz40) Q5;
                ArrayList arrayList4 = new ArrayList();
                for (Object obj2 : arrayList2) {
                    if (((z8m) obj2).g) {
                        arrayList4.add(obj2);
                    }
                }
                ArrayList arrayList5 = new ArrayList(tcc.n(arrayList4, 10));
                Iterator it = arrayList4.iterator();
                while (it.hasNext()) {
                    arrayList5.add(Integer.valueOf(((z8m) it.next()).e));
                }
                ArrayList arrayList6 = new ArrayList(arrayList5);
                boolean e = btsVar2.e(arrayList6) | btsVar2.k(oz40Var3) | btsVar2.e(view);
                Object Q6 = btsVar2.Q();
                if (e || Q6 == obj) {
                    Q6 = new DragDropLazyColumnKt$DragDropLazyColumn$reorderableLazyColumnState$1$1(arrayList6, yx40Var, oz40Var, yx40Var2, view, oz40Var3, null);
                    arrayList3 = arrayList6;
                    btsVar2.o0(Q6);
                } else {
                    arrayList3 = arrayList6;
                }
                bms bmsVar = (bms) Q6;
                int i9 = i3 >> 21;
                l690 l690Var = new l690(0.0f, 0.0f, 0.0f, 0.0f);
                int i10 = (i9 & 14) ^ 6;
                boolean z8 = (i10 > 4 && btsVar2.k(bVar4)) || (i9 & 6) == 4;
                Object Q7 = btsVar2.Q();
                if (z8 || Q7 == obj) {
                    Q7 = new vs9(bVar4, 14);
                    btsVar2.o0(Q7);
                }
                sls slsVar = (sls) Q7;
                Object Q8 = btsVar2.Q();
                EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.a;
                if (Q8 == obj) {
                    Q8 = zpn.j(emptyCoroutineContext, btsVar2);
                    btsVar2.o0(Q8);
                }
                tse tseVar = (tse) Q8;
                oz40 n = f.n(slsVar, btsVar2);
                final ArrayList arrayList7 = arrayList3;
                f530 f530Var7 = f530Var4;
                oz40 n2 = f.n(100L, btsVar2);
                boolean k = btsVar2.k(bVar4) | btsVar2.k(tseVar) | btsVar2.d(100L);
                Object Q9 = btsVar2.Q();
                if (k || Q9 == obj) {
                    Q9 = new g(bVar4, tseVar, new rsm(n, n2, 1));
                    btsVar2.o0(Q9);
                }
                g gVar = (g) Q9;
                fwi fwiVar = (fwi) btsVar2.m(j.h);
                float w0 = fwiVar.w0(48.0f);
                Object Q10 = btsVar2.Q();
                if (Q10 == obj) {
                    Q10 = zpn.j(emptyCoroutineContext, btsVar2);
                    btsVar2.o0(Q10);
                }
                tse tseVar2 = (tse) Q10;
                oz40 n3 = f.n(bmsVar, btsVar2);
                LayoutDirection layoutDirection = (LayoutDirection) btsVar2.m(j.n);
                t6 t6Var = new t6(fwiVar.w0(an91.f(l690Var, layoutDirection)), fwiVar.w0(an91.e(l690Var, layoutDirection)), fwiVar.w0(0.0f), fwiVar.w0(0.0f));
                Object Q11 = btsVar2.Q();
                if (Q11 == obj) {
                    Q11 = f.d(new vs9(bVar4, 15));
                    btsVar2.o0(Q11);
                }
                m3u0 m3u0Var = (m3u0) Q11;
                boolean k2 = ((i10 > 4 && btsVar2.k(bVar4)) || (i9 & 6) == 4) | btsVar2.k(tseVar2) | btsVar2.b(48.0f) | btsVar2.k(l690Var) | btsVar2.k(gVar) | btsVar2.c(((Orientation) m3u0Var.getValue()).ordinal());
                Object Q12 = btsVar2.Q();
                if (k2 || Q12 == obj) {
                    int i11 = k0j0.a[((Orientation) m3u0Var.getValue()).ordinal()];
                    z5 = true;
                    if (i11 == 1) {
                        g990Var = new g990(26);
                    } else {
                        if (i11 != 2) {
                            w511.b();
                            return;
                        }
                        g990Var = new g990(27);
                    }
                    m0j0Var = new m0j0(new sue0(21, bVar4), tseVar2, n3, w0, t6Var, gVar, layoutDirection, g990Var);
                    btsVar2.o0(m0j0Var);
                } else {
                    m0j0Var = Q12;
                    z5 = true;
                }
                final m0j0 m0j0Var2 = (m0j0) m0j0Var;
                oz40Var2.setValue(null);
                int i12 = 0;
                for (Object obj3 : (List) oz40Var3.getValue()) {
                    int i13 = i12 + 1;
                    if (i12 < 0) {
                        scc.m();
                        throw null;
                    }
                    z8m z8mVar = (z8m) obj3;
                    y7m y7mVar = z8mVar.c;
                    if (y7mVar != null) {
                        float f = y7mVar.a;
                        y7m y7mVar2 = (y7m) oz40Var2.getValue();
                        oz40Var2.setValue(y7mVar2 != null ? new y7m(y7mVar2.a + f) : new y7m(f));
                    }
                    y7m y7mVar3 = z8mVar.d;
                    if (y7mVar3 != null) {
                        float f2 = y7mVar3.a;
                        if (i12 != scc.f((List) oz40Var3.getValue())) {
                            y7m y7mVar4 = (y7m) oz40Var2.getValue();
                            oz40Var2.setValue(y7mVar4 != null ? new y7m(y7mVar4.a + f2) : new y7m(f2));
                        }
                    }
                    i12 = i13;
                }
                if (((List) oz40Var3.getValue()).isEmpty()) {
                    oz40Var2.setValue(new y7m(0.1f));
                }
                boolean k3 = btsVar2.k(oz40Var3);
                Object Q13 = btsVar2.Q();
                if (k3 || Q13 == obj) {
                    Q13 = new DragDropLazyColumnKt$DragDropLazyColumn$2$1(oz40Var3, null);
                    btsVar2.o0(Q13);
                }
                zpn.e(btsVar2, (wls) Q13, zy11.a);
                y7m y7mVar5 = (y7m) oz40Var2.getValue();
                if (y7mVar5 != null) {
                    f530Var5 = f530Var7;
                    f530Var6 = ljs0.e(f530Var5, y7mVar5.a);
                } else {
                    f530Var5 = f530Var7;
                }
                f530Var6 = f530Var5;
                boolean k4 = btsVar2.k(oz40Var3) | btsVar2.e(arrayList7) | btsVar2.k(m0j0Var2) | btsVar2.e(view) | ((57344 & i3) == 16384 ? z5 : false) | ((i3 & 7168) == 2048 ? z5 : false) | ((458752 & i3) == 131072 ? z5 : false) | ((3670016 & i3) == 1048576 ? z5 : false);
                Object Q14 = btsVar2.Q();
                if (k4 || Q14 == obj) {
                    final tls tlsVar6 = tlsVar3;
                    Q14 = new tls() { // from class: a9m
                        @Override // defpackage.tls
                        public final Object invoke(Object obj4) {
                            oz40 oz40Var4 = oz40.this;
                            List list = (List) oz40Var4.getValue();
                            txk txkVar = new txk(4);
                            ((m6y) ((u6y) obj4)).f(list.size(), new tj(11, txkVar, list), new qc0(list, 10), new a(2039820996, new i9m(list, arrayList7, m0j0Var2, z4, oz40Var4, tlsVar, tlsVar6, view, wlsVar, oz40Var, yx40Var, yx40Var2), true));
                            return zy11.a;
                        }
                    };
                    z6 = z4;
                    tlsVar5 = tlsVar6;
                    btsVar2.o0(Q14);
                } else {
                    tlsVar5 = tlsVar3;
                    z6 = z4;
                }
                btsVar = btsVar2;
                adb1.a(f530Var6, bVar4, null, null, null, null, false, null, (tls) Q14, btsVar, (i3 >> 18) & 112, 508);
                z3 = z6;
                tlsVar4 = tlsVar5;
                f530Var3 = f530Var5;
                bVar3 = bVar4;
            }
            v = btsVar.v();
            if (v == null) {
                v.d = new s07(f530Var3, num, arrayList, z3, wlsVar, tlsVar, tlsVar4, bVar3, i, i2);
                return;
            }
            return;
        }
        z2 = z;
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
        }
        if ((i & ImageMetadata.EDGE_MODE) == 0) {
        }
        i4 = i2 & 64;
        if (i4 == 0) {
        }
        if ((i & 12582912) != 0) {
        }
        if (btsVar2.V(i3 & 1, (i3 & 4793491) == 4793490)) {
        }
        v = btsVar.v();
        if (v == null) {
        }
    }
}
