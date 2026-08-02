package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.collections.a;

/* loaded from: classes11.dex */
public abstract class ysa1 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9, types: [boolean, int] */
    public static final void a(String str, String str2, f530 f530Var, boolean z, fid fidVar, int i) {
        f530 f530Var2;
        boolean z2;
        bts btsVar;
        ?? r6;
        bts btsVar2;
        bts btsVar3 = (bts) fidVar;
        btsVar3.g0(2030181187);
        dmw0 dmw0Var = btsVar3.a;
        int i2 = i | (btsVar3.k(str) ? 4 : 2);
        if ((i & 48) == 0) {
            i2 |= btsVar3.k(str2) ? 32 : 16;
        }
        int i3 = i2 | 3456;
        if (btsVar3.V(i3 & 1, (i3 & 1171) != 1170)) {
            int i4 = i3 & 14;
            boolean z3 = (i4 == 4) | ((i3 & 112) == 32);
            Object Q = btsVar3.Q();
            o430 o430Var = did.a;
            if (z3 || Q == o430Var) {
                List g = scc.g(str, str2);
                ArrayList arrayList = new ArrayList();
                for (Object obj : g) {
                    if (((String) obj).length() > 0) {
                        arrayList.add(obj);
                    }
                }
                Q = a.X(arrayList, ". ", null, null, null, 62);
                btsVar3.o0(Q);
            }
            String str3 = (String) Q;
            c530 c530Var = c530.a;
            f530 c = ljs0.c(c530Var, 1.0f);
            so5 so5Var = x4c.G;
            g43 g43Var = lr20.c;
            sic a = qic.a(g43Var, so5Var, btsVar3, 0);
            int hashCode = Long.hashCode(btsVar3.T);
            r1b0 o = btsVar3.o();
            f530 d = b.d(btsVar3, c);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (dmw0Var == null) {
                cma1.b0();
                throw null;
            }
            btsVar3.i0();
            if (btsVar3.S) {
                btsVar3.n(slsVar);
            } else {
                btsVar3.r0();
            }
            wls wlsVar = d.f;
            qje.W(btsVar3, wlsVar, a);
            wls wlsVar2 = d.e;
            qje.W(btsVar3, wlsVar2, o);
            Integer valueOf = Integer.valueOf(hashCode);
            wls wlsVar3 = d.g;
            qje.W(btsVar3, wlsVar3, valueOf);
            tls tlsVar = d.h;
            qje.M(btsVar3, tlsVar);
            wls wlsVar4 = d.d;
            qje.W(btsVar3, wlsVar4, d);
            f530 m = an91.m(ljs0.c(c530Var, 1.0f), yrl.b, 0.0f, 2);
            boolean k = btsVar3.k(str3);
            Object Q2 = btsVar3.Q();
            if (k || Q2 == o430Var) {
                Q2 = new dcc0(str3, 19);
                btsVar3.o0(Q2);
            }
            f530 a2 = fnq0.a(m, (tls) Q2);
            sic a3 = qic.a(g43Var, so5Var, btsVar3, 0);
            int hashCode2 = Long.hashCode(btsVar3.T);
            r1b0 o2 = btsVar3.o();
            f530 d2 = b.d(btsVar3, a2);
            btsVar3.i0();
            if (btsVar3.S) {
                btsVar3.n(slsVar);
            } else {
                btsVar3.r0();
            }
            qje.W(btsVar3, wlsVar, a3);
            qje.W(btsVar3, wlsVar2, o2);
            vfc.v(hashCode2, btsVar3, wlsVar3, btsVar3, tlsVar);
            qje.W(btsVar3, wlsVar4, d2);
            jeb1.f(str, null, AppColor$Palette.Text, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.d(btsVar3).f.c, btsVar3, i4 | 384, 0, 16378);
            bts btsVar4 = btsVar3;
            if (str2.length() > 0) {
                btsVar4.e0(-1379811288);
                jeb1.f(str2, null, AppColor$Palette.TextMinor, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar4).h.a, btsVar4, ((i3 >> 3) & 14) | 384, 0, 16378);
                bts btsVar5 = btsVar4;
                r6 = 0;
                btsVar5.t(false);
                btsVar2 = btsVar5;
            } else {
                r6 = 0;
                btsVar4.e0(-1379677461);
                btsVar4.t(false);
                btsVar2 = btsVar4;
            }
            btsVar2.t(true);
            btsVar2.e0(-1110000253);
            oeb1.c(btsVar2, ljs0.e(c530Var, 16.0f));
            yrl.c(null, null, btsVar2, r6, 7);
            btsVar2.t(r6);
            btsVar2.t(true);
            z2 = true;
            f530Var2 = c530Var;
            btsVar = btsVar2;
        } else {
            btsVar3.Y();
            f530Var2 = f530Var;
            z2 = z;
            btsVar = btsVar3;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new gi0(str, str2, f530Var2, z2, i, 19);
        }
    }

    public static nzr b(Context context, pyr pyrVar) {
        ArrayList arrayList = new ArrayList(1);
        Object obj = new Object[]{pyrVar}[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        return nyr.a(context, Collections.unmodifiableList(arrayList));
    }

    public static final Map c(puh puhVar) {
        Object obj = puhVar.n;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    public static Typeface d(Context context, ArrayList arrayList, int i, boolean z, int i2, Handler handler, dp11 dp11Var) {
        py5 py5Var = new py5(handler);
        c06 c06Var = new c06(dp11Var, py5Var);
        int i3 = 0;
        int i4 = 1;
        if (!z) {
            String a = xyr.a(i, arrayList);
            Typeface typeface = (Typeface) xyr.a.c(a);
            if (typeface != null) {
                py5Var.execute(new uqs(i4, dp11Var, typeface));
                return typeface;
            }
            vyr vyrVar = new vyr(i3, c06Var);
            synchronized (xyr.c) {
                try {
                    ycs0 ycs0Var = xyr.d;
                    ArrayList arrayList2 = (ArrayList) ycs0Var.get(a);
                    if (arrayList2 != null) {
                        arrayList2.add(vyrVar);
                        return null;
                    }
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(vyrVar);
                    ycs0Var.put(a, arrayList3);
                    uyr uyrVar = new uyr(a, context, arrayList, i, 1);
                    ThreadPoolExecutor threadPoolExecutor = xyr.b;
                    vyr vyrVar2 = new vyr(i4, a);
                    Handler handler2 = Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
                    lz lzVar = new lz();
                    lzVar.b = uyrVar;
                    lzVar.c = vyrVar2;
                    lzVar.w = handler2;
                    threadPoolExecutor.execute(lzVar);
                    return null;
                } finally {
                }
            }
        }
        if (arrayList.size() > 1) {
            ny61.g("Fallbacks with blocking fetches are not supported for performance reasons");
            return null;
        }
        pyr pyrVar = (pyr) arrayList.get(0);
        mzz mzzVar = xyr.a;
        ArrayList arrayList4 = new ArrayList(1);
        Object obj = new Object[]{pyrVar}[0];
        Objects.requireNonNull(obj);
        arrayList4.add(obj);
        String a2 = xyr.a(i, Collections.unmodifiableList(arrayList4));
        Typeface typeface2 = (Typeface) xyr.a.c(a2);
        if (typeface2 != null) {
            py5Var.execute(new uqs(i4, dp11Var, typeface2));
            return typeface2;
        }
        if (i2 == -1) {
            ArrayList arrayList5 = new ArrayList(1);
            Object obj2 = new Object[]{pyrVar}[0];
            Objects.requireNonNull(obj2);
            arrayList5.add(obj2);
            wyr b = xyr.b(a2, context, Collections.unmodifiableList(arrayList5), i);
            c06Var.r(b);
            return b.a;
        }
        try {
            try {
                try {
                    try {
                        wyr wyrVar = (wyr) xyr.b.submit(new uyr(a2, context, pyrVar, i, 0)).get(i2, TimeUnit.MILLISECONDS);
                        c06Var.r(wyrVar);
                        return wyrVar.a;
                    } catch (TimeoutException unused) {
                        throw new InterruptedException("timeout");
                    }
                } catch (InterruptedException e) {
                    throw e;
                }
            } catch (ExecutionException e2) {
                throw new RuntimeException(e2);
            }
        } catch (InterruptedException unused2) {
            ((py5) c06Var.b).execute(new hl7((dp11) c06Var.a, -3, i3));
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002a, code lost:
    
        if (r5 != (-1)) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
    
        h(r1, r7, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
    
        r12[r5] = (r12[r5] & r4) | (r7 & r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0038, code lost:
    
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int e(Object obj, Object obj2, int i, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int e = dta1.e(obj);
        int i2 = e & i;
        int f = f(i2, obj3);
        if (f != 0) {
            int i3 = ~i;
            int i4 = e & i3;
            int i5 = -1;
            while (true) {
                int i6 = f - 1;
                int i7 = iArr[i6];
                int i8 = i7 & i;
                if ((i7 & i3) != i4 || !epa1.d(obj, objArr[i6]) || (objArr2 != null && !epa1.d(obj2, objArr2[i6]))) {
                    if (i8 == 0) {
                        break;
                    }
                    i5 = i6;
                    f = i8;
                }
            }
        }
        return -1;
    }

    public static int f(int i, Object obj) {
        return obj instanceof byte[] ? ((byte[]) obj)[i] & 255 : obj instanceof short[] ? (char) ((short[]) obj)[i] : ((int[]) obj)[i];
    }

    public static Object g(int i) {
        if (i >= 2 && i <= 1073741824 && Integer.highestOneBit(i) == i) {
            return i <= 256 ? new byte[i] : i <= 65536 ? new short[i] : new int[i];
        }
        ny61.g(oyr.i(i, "must be power of 2 between 2^1 and 2^30: "));
        return null;
    }

    public static void h(int i, int i2, Object obj) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i] = (byte) i2;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i] = (short) i2;
        } else {
            ((int[]) obj)[i] = i2;
        }
    }
}
