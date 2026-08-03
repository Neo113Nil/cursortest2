package v0;

import bc.n;
import bc.w;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import s.g0;
import s.o0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class f implements e {

    /* renamed from: g, reason: collision with root package name */
    public final oc.c f7040g;

    /* renamed from: h, reason: collision with root package name */
    public final g0 f7041h;

    /* renamed from: i, reason: collision with root package name */
    public g0 f7042i;

    public f(Map map, oc.c cVar) {
        g0 g0Var;
        this.f7040g = cVar;
        if (map == null || map.isEmpty()) {
            g0Var = null;
        } else {
            g0Var = new g0(map.size());
            for (Map.Entry entry : map.entrySet()) {
                g0Var.m(entry.getKey(), entry.getValue());
            }
        }
        this.f7041h = g0Var;
    }

    @Override // v0.e
    public final boolean c(Object obj) {
        return ((Boolean) this.f7040g.invoke(obj)).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x009a  */
    @Override // v0.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Map d() {
        char c3;
        long j3;
        long j6;
        long j10;
        g0 g0Var;
        long[] jArr;
        int i10;
        long[] jArr2;
        int i11;
        char c7;
        long j11;
        g0 g0Var2 = this.f7041h;
        if (g0Var2 == null && this.f7042i == null) {
            return w.f1068g;
        }
        int i12 = 0;
        int i13 = g0Var2 != null ? g0Var2.f6270e : 0;
        g0 g0Var3 = this.f7042i;
        HashMap hashMap = new HashMap(i13 + (g0Var3 != null ? g0Var3.f6270e : 0));
        char c10 = 7;
        long j12 = -9187201950435737472L;
        int i14 = 8;
        if (g0Var2 != null) {
            Object[] objArr = g0Var2.f6267b;
            Object[] objArr2 = g0Var2.f6268c;
            long[] jArr3 = g0Var2.f6266a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i15 = 0;
                j6 = 128;
                while (true) {
                    long j13 = jArr3[i15];
                    j10 = 255;
                    if ((((~j13) << c10) & j13 & j12) != j12) {
                        int i16 = 8 - ((~(i15 - length)) >>> 31);
                        int i17 = 0;
                        while (i17 < i16) {
                            if ((j13 & 255) < 128) {
                                int i18 = (i15 << 3) + i17;
                                c7 = c10;
                                j11 = j12;
                                hashMap.put((String) objArr[i18], (List) objArr2[i18]);
                            } else {
                                c7 = c10;
                                j11 = j12;
                            }
                            j13 >>= 8;
                            i17++;
                            c10 = c7;
                            j12 = j11;
                        }
                        c3 = c10;
                        j3 = j12;
                        if (i16 != 8) {
                            break;
                        }
                    } else {
                        c3 = c10;
                        j3 = j12;
                    }
                    if (i15 == length) {
                        break;
                    }
                    i15++;
                    c10 = c3;
                    j12 = j3;
                }
                g0Var = this.f7042i;
                if (g0Var != null) {
                    Object[] objArr3 = g0Var.f6267b;
                    Object[] objArr4 = g0Var.f6268c;
                    long[] jArr4 = g0Var.f6266a;
                    int length2 = jArr4.length - 2;
                    if (length2 >= 0) {
                        int i19 = 0;
                        while (true) {
                            long j14 = jArr4[i19];
                            if ((((~j14) << c3) & j14 & j3) != j3) {
                                int i20 = 8 - ((~(i19 - length2)) >>> 31);
                                int i21 = i12;
                                while (i21 < i20) {
                                    if ((j14 & j10) < j6) {
                                        int i22 = (i19 << 3) + i21;
                                        Object obj = objArr3[i22];
                                        List list = (List) objArr4[i22];
                                        String str = (String) obj;
                                        i11 = i14;
                                        if (list.size() == 1) {
                                            Object invoke = ((oc.a) list.get(i12)).invoke();
                                            if (invoke != null) {
                                                if (!c(invoke)) {
                                                    throw new IllegalStateException(k.a(invoke).toString());
                                                }
                                                hashMap.put(str, n.J(invoke));
                                            }
                                            jArr2 = jArr4;
                                        } else {
                                            int size = list.size();
                                            ArrayList arrayList = new ArrayList(size);
                                            while (i12 < size) {
                                                long[] jArr5 = jArr4;
                                                Object invoke2 = ((oc.a) list.get(i12)).invoke();
                                                if (invoke2 != null && !c(invoke2)) {
                                                    throw new IllegalStateException(k.a(invoke2).toString());
                                                }
                                                arrayList.add(invoke2);
                                                i12++;
                                                jArr4 = jArr5;
                                            }
                                            jArr2 = jArr4;
                                            hashMap.put(str, arrayList);
                                        }
                                    } else {
                                        jArr2 = jArr4;
                                        i11 = i14;
                                    }
                                    j14 >>= i11;
                                    i21++;
                                    i14 = i11;
                                    jArr4 = jArr2;
                                    i12 = 0;
                                }
                                jArr = jArr4;
                                i10 = i14;
                                if (i20 != i10) {
                                    break;
                                }
                            } else {
                                jArr = jArr4;
                                i10 = i14;
                            }
                            if (i19 == length2) {
                                break;
                            }
                            i19++;
                            i14 = i10;
                            jArr4 = jArr;
                            i12 = 0;
                        }
                    }
                }
                return hashMap;
            }
        }
        c3 = 7;
        j3 = -9187201950435737472L;
        j6 = 128;
        j10 = 255;
        g0Var = this.f7042i;
        if (g0Var != null) {
        }
        return hashMap;
    }

    @Override // v0.e
    public final Object e(String str) {
        g0 g0Var = this.f7041h;
        List list = g0Var != null ? (List) g0Var.k(str) : null;
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (list.size() > 1 && g0Var != null) {
            List subList = list.subList(1, list.size());
            int f10 = g0Var.f(str);
            if (f10 < 0) {
                f10 = ~f10;
            }
            Object[] objArr = g0Var.f6268c;
            Object obj = objArr[f10];
            g0Var.f6267b[f10] = str;
            objArr[f10] = subList;
        }
        return list.get(0);
    }

    @Override // v0.e
    public final a5.c f(String str, oc.a aVar) {
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (!u2.b.m(str.charAt(i10))) {
                g0 g0Var = this.f7042i;
                if (g0Var == null) {
                    long[] jArr = o0.f6312a;
                    g0Var = new g0();
                    this.f7042i = g0Var;
                }
                Object g8 = g0Var.g(str);
                if (g8 == null) {
                    g8 = new ArrayList();
                    g0Var.m(str, g8);
                }
                ((List) g8).add(aVar);
                return new a5.c(g0Var, str, aVar);
            }
        }
        throw new IllegalArgumentException("Registered key is empty or blank");
    }
}
