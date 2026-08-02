package defpackage;

import android.content.Context;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import com.monetization.ads.mediation.base.a;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import yads.zp1;

/* loaded from: classes7.dex */
public final class s1n implements t1n, e3q0, on61 {
    public int a;
    public final Object b;
    public final Object c;
    public final Object w;
    public Object x;

    public s1n(ur71 ur71Var, int i) {
        this.x = ur71Var;
        uh81 uh81Var = new uh81();
        uh81Var.a = new byte[5];
        uh81Var.d = 5;
        this.b = uh81Var;
        this.c = new SparseArray();
        this.w = new SparseIntArray();
        this.a = i;
    }

    @Override // defpackage.t1n
    public int a() {
        int i = this.a;
        zrm zrmVar = (zrm) this.w;
        return Math.max(i, Math.max(((yzh) zrmVar.b).o((String) zrmVar.c), ((u1n) this.c).e()));
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00c9  */
    @Override // defpackage.e3q0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b(ef90 ef90Var) {
        sez0 sez0Var;
        SparseArray sparseArray;
        int a;
        int size;
        int i;
        sez0 sez0Var2;
        SparseArray sparseArray2;
        int i2;
        int i3;
        char c;
        int i4;
        int i5;
        sez0 sez0Var3;
        SparseArray sparseArray3 = (SparseArray) this.c;
        SparseIntArray sparseIntArray = (SparseIntArray) this.w;
        df90 df90Var = (df90) this.b;
        vi11 vi11Var = (vi11) this.x;
        SparseArray sparseArray4 = vi11Var.i;
        SparseBooleanArray sparseBooleanArray = vi11Var.j;
        ymh ymhVar = vi11Var.g;
        List list = vi11Var.d;
        int i6 = vi11Var.a;
        if (ef90Var.y() != 2) {
            return;
        }
        int i7 = 0;
        if (i6 == 1 || i6 == 2 || vi11Var.o == 1) {
            sez0Var = (sez0) list.get(0);
        } else {
            sez0Var = new sez0(((sez0) list.get(0)).d());
            list.add(sez0Var);
        }
        if ((ef90Var.y() & 128) == 0) {
            return;
        }
        ef90Var.L(1);
        int E = ef90Var.E();
        ef90Var.L(3);
        ef90Var.i(0, 2, df90Var.a);
        df90Var.m(0);
        df90Var.o(3);
        vi11Var.u = df90Var.g(13);
        ef90Var.i(0, 2, df90Var.a);
        df90Var.m(0);
        df90Var.o(4);
        ef90Var.L(df90Var.g(12));
        if (i6 == 2 && vi11Var.s == null) {
            yi11 a2 = ymhVar.a(21, new lg(21, (String) null, 0, (ArrayList) null, tw21.c));
            vi11Var.s = a2;
            if (a2 != null) {
                sparseArray = sparseArray4;
                a2.c(sez0Var, vi11Var.n, new xi11(E, 21, 8192, 0));
                sparseArray3.clear();
                sparseIntArray.clear();
                a = ef90Var.a();
                while (a > 0) {
                    ef90Var.i(i7, 5, df90Var.a);
                    df90Var.m(i7);
                    int g = df90Var.g(8);
                    df90Var.o(3);
                    int g2 = df90Var.g(13);
                    df90Var.o(4);
                    int g3 = df90Var.g(12);
                    int i8 = ef90Var.b;
                    int i9 = i8 + g3;
                    int i10 = -1;
                    String str = null;
                    ArrayList arrayList = null;
                    int i11 = 0;
                    while (true) {
                        if (ef90Var.b >= i9) {
                            i3 = a;
                            break;
                        }
                        int y = ef90Var.y();
                        i3 = a;
                        int y2 = ef90Var.b + ef90Var.y();
                        if (y2 > i9) {
                            break;
                        }
                        df90 df90Var2 = df90Var;
                        if (y == 5) {
                            long A = ef90Var.A();
                            if (A == 1094921523) {
                                i10 = 129;
                            } else if (A == 1161904947) {
                                i10 = 135;
                            } else {
                                if (A != 1094921524) {
                                    if (A == 1212503619) {
                                        i10 = 36;
                                    }
                                }
                                i10 = 172;
                            }
                            i4 = y2;
                            i5 = E;
                            sez0Var3 = sez0Var;
                        } else if (y == 106) {
                            i4 = y2;
                            i5 = E;
                            sez0Var3 = sez0Var;
                            i10 = 129;
                        } else if (y == 122) {
                            i5 = E;
                            sez0Var3 = sez0Var;
                            i10 = 135;
                            i4 = y2;
                        } else if (y == 127) {
                            int y3 = ef90Var.y();
                            if (y3 != 21) {
                                if (y3 == 14) {
                                    i10 = HProv.PP_LCD_QUERY;
                                } else if (y3 == 33) {
                                    i10 = 139;
                                }
                                i4 = y2;
                                i5 = E;
                                sez0Var3 = sez0Var;
                            }
                            i10 = 172;
                            i4 = y2;
                            i5 = E;
                            sez0Var3 = sez0Var;
                        } else if (y == 123) {
                            i4 = y2;
                            i10 = 138;
                            i5 = E;
                            sez0Var3 = sez0Var;
                        } else if (y == 10) {
                            i4 = y2;
                            str = ef90Var.w(3, StandardCharsets.UTF_8).trim();
                            i5 = E;
                            sez0Var3 = sez0Var;
                            i11 = ef90Var.y();
                        } else {
                            if (y == 89) {
                                ArrayList arrayList2 = new ArrayList();
                                while (ef90Var.b < y2) {
                                    String trim = ef90Var.w(3, StandardCharsets.UTF_8).trim();
                                    ef90Var.y();
                                    sez0 sez0Var4 = sez0Var;
                                    byte[] bArr = new byte[4];
                                    ef90Var.i(0, 4, bArr);
                                    arrayList2.add(new wi11(trim, bArr));
                                    sez0Var = sez0Var4;
                                    y2 = y2;
                                    E = E;
                                }
                                i4 = y2;
                                i5 = E;
                                sez0Var3 = sez0Var;
                                arrayList = arrayList2;
                                i10 = 89;
                            } else {
                                i4 = y2;
                                i5 = E;
                                sez0Var3 = sez0Var;
                                if (y == 111) {
                                    i10 = 257;
                                }
                            }
                            ef90Var.L(i4 - ef90Var.b);
                            sez0Var = sez0Var3;
                            a = i3;
                            df90Var = df90Var2;
                            E = i5;
                        }
                        ef90Var.L(i4 - ef90Var.b);
                        sez0Var = sez0Var3;
                        a = i3;
                        df90Var = df90Var2;
                        E = i5;
                    }
                    df90 df90Var3 = df90Var;
                    int i12 = E;
                    sez0 sez0Var5 = sez0Var;
                    ef90Var.K(i9);
                    lg lgVar = new lg(i10, str, i11, arrayList, Arrays.copyOfRange(ef90Var.a, i8, i9));
                    if (g == 6 || g == 5) {
                        g = i10;
                    }
                    int i13 = i3 - (g3 + 5);
                    int i14 = i6 == 2 ? g : g2;
                    if (sparseBooleanArray.get(i14)) {
                        c = 21;
                    } else {
                        c = 21;
                        yi11 a3 = (i6 == 2 && g == 21) ? vi11Var.s : ymhVar.a(g, lgVar);
                        if (i6 != 2 || g2 < sparseIntArray.get(i14, 8192)) {
                            sparseIntArray.put(i14, g2);
                            sparseArray3.put(i14, a3);
                        }
                    }
                    a = i13;
                    sez0Var = sez0Var5;
                    df90Var = df90Var3;
                    E = i12;
                    i7 = 0;
                }
                int i15 = E;
                sez0 sez0Var6 = sez0Var;
                size = sparseIntArray.size();
                i = 0;
                while (i < size) {
                    int keyAt = sparseIntArray.keyAt(i);
                    int valueAt = sparseIntArray.valueAt(i);
                    sparseBooleanArray.put(keyAt, true);
                    vi11Var.k.put(valueAt, true);
                    yi11 yi11Var = (yi11) sparseArray3.valueAt(i);
                    if (yi11Var != null) {
                        if (yi11Var != vi11Var.s) {
                            i2 = i15;
                            sez0Var2 = sez0Var6;
                            yi11Var.c(sez0Var2, vi11Var.n, new xi11(i2, keyAt, 8192, 0));
                        } else {
                            sez0Var2 = sez0Var6;
                            i2 = i15;
                        }
                        sparseArray2 = sparseArray;
                        sparseArray2.put(valueAt, yi11Var);
                    } else {
                        sez0Var2 = sez0Var6;
                        sparseArray2 = sparseArray;
                        i2 = i15;
                    }
                    i++;
                    sparseArray = sparseArray2;
                    i15 = i2;
                    sez0Var6 = sez0Var2;
                }
                SparseArray sparseArray5 = sparseArray;
                if (i6 != 2) {
                    if (vi11Var.p) {
                        return;
                    }
                    vi11Var.n.A();
                    vi11Var.o = 0;
                    vi11Var.p = true;
                    return;
                }
                sparseArray5.remove(this.a);
                int i16 = i6 == 1 ? 0 : vi11Var.o - 1;
                vi11Var.o = i16;
                if (i16 == 0) {
                    vi11Var.n.A();
                    vi11Var.p = true;
                    return;
                }
                return;
            }
        }
        sparseArray = sparseArray4;
        sparseArray3.clear();
        sparseIntArray.clear();
        a = ef90Var.a();
        while (a > 0) {
        }
        int i152 = E;
        sez0 sez0Var62 = sez0Var;
        size = sparseIntArray.size();
        i = 0;
        while (i < size) {
        }
        SparseArray sparseArray52 = sparseArray;
        if (i6 != 2) {
        }
    }

    @Override // defpackage.e3q0
    public void c(sez0 sez0Var, d5p d5pVar, xi11 xi11Var) {
    }

    @Override // defpackage.t1n
    public int d() {
        return Math.max(this.a, ((mum) this.x).a(((u1n) this.c).e(), (String) this.b));
    }

    @Override // defpackage.t1n
    public int e(String str) {
        return Math.max(this.a, ((mum) this.x).a(((u1n) this.c).e(), str));
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0168, code lost:
    
        if (r30.s() == 21) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00d2  */
    @Override // defpackage.on61
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void f(dl81 dl81Var) {
        int i;
        lo61 lo61Var;
        SparseArray sparseArray;
        int i2;
        int size;
        int i3;
        lo61 lo61Var2;
        SparseArray sparseArray2;
        int i4;
        int i5;
        uh81 uh81Var;
        char c;
        int i6;
        int i7;
        lo61 lo61Var3;
        int i8;
        SparseArray sparseArray3 = (SparseArray) this.c;
        SparseIntArray sparseIntArray = (SparseIntArray) this.w;
        uh81 uh81Var2 = (uh81) this.b;
        ur71 ur71Var = (ur71) this.x;
        SparseArray sparseArray4 = ur71Var.g;
        SparseBooleanArray sparseBooleanArray = ur71Var.h;
        zc71 zc71Var = ur71Var.f;
        List list = ur71Var.c;
        int i9 = ur71Var.a;
        if (dl81Var.s() != 2) {
            return;
        }
        if (i9 == 1 || i9 == 2 || ur71Var.m == 1) {
            i = 1;
            lo61Var = (lo61) list.get(0);
        } else {
            i = 1;
            lo61Var = new lo61(((lo61) list.get(0)).a());
            list.add(lo61Var);
        }
        if ((dl81Var.s() & 128) == 0) {
            return;
        }
        dl81Var.m(dl81Var.b + 1);
        int x = dl81Var.x();
        dl81Var.m(dl81Var.b + 3);
        dl81Var.d(0, 2, uh81Var2.a);
        uh81Var2.f(0);
        uh81Var2.h(3);
        ur71Var.s = uh81Var2.a(13);
        dl81Var.d(0, 2, uh81Var2.a);
        uh81Var2.f(0);
        uh81Var2.h(4);
        dl81Var.m(dl81Var.b + uh81Var2.a(12));
        if (i9 == 2 && ur71Var.q == null) {
            w481 b = zc71Var.b(21, new vi71((String) null, (ArrayList) null, rf71.f));
            ur71Var.q = b;
            if (b != null) {
                sparseArray = sparseArray4;
                b.g(lo61Var, ur71Var.l, new xi11(x, 21, 8192, i));
                sparseArray3.clear();
                sparseIntArray.clear();
                i2 = dl81Var.c - dl81Var.b;
                while (i2 > 0) {
                    dl81Var.d(0, 5, uh81Var2.a);
                    uh81Var2.f(0);
                    int a = uh81Var2.a(8);
                    uh81Var2.h(3);
                    int a2 = uh81Var2.a(13);
                    uh81Var2.h(4);
                    int a3 = uh81Var2.a(12);
                    int i10 = dl81Var.b;
                    int i11 = i10 + a3;
                    int i12 = -1;
                    String str = null;
                    ArrayList arrayList = null;
                    while (true) {
                        if (dl81Var.b >= i11) {
                            i5 = i2;
                            uh81Var = uh81Var2;
                            break;
                        }
                        int s = dl81Var.s();
                        i5 = i2;
                        int s2 = dl81Var.b + dl81Var.s();
                        uh81Var = uh81Var2;
                        if (s2 > i11) {
                            break;
                        }
                        if (s == 5) {
                            long t = dl81Var.t();
                            if (t != 1094921523) {
                                if (t != 1161904947) {
                                    if (t != 1094921524) {
                                        if (t == 1212503619) {
                                            i8 = 36;
                                            i6 = s2;
                                            i12 = i8;
                                            i7 = x;
                                            lo61Var3 = lo61Var;
                                        }
                                        i6 = s2;
                                        i7 = x;
                                        lo61Var3 = lo61Var;
                                    }
                                    i8 = HProv.PP_EXPORT_CSP;
                                    i6 = s2;
                                    i12 = i8;
                                    i7 = x;
                                    lo61Var3 = lo61Var;
                                }
                                i8 = HProv.PP_CONTAINER_DEFAULT;
                                i6 = s2;
                                i12 = i8;
                                i7 = x;
                                lo61Var3 = lo61Var;
                            }
                            i8 = HProv.PP_SECURITY_LEVEL;
                            i6 = s2;
                            i12 = i8;
                            i7 = x;
                            lo61Var3 = lo61Var;
                        } else {
                            if (s != 106) {
                                if (s != 122) {
                                    if (s != 127) {
                                        if (s == 123) {
                                            i8 = HProv.PP_VERSION_EX;
                                            i6 = s2;
                                            i12 = i8;
                                            i7 = x;
                                            lo61Var3 = lo61Var;
                                        } else if (s == 10) {
                                            str = dl81Var.b(3, md81.c).trim();
                                        } else if (s == 89) {
                                            ArrayList arrayList2 = new ArrayList();
                                            while (dl81Var.b < s2) {
                                                String trim = dl81Var.b(3, md81.c).trim();
                                                dl81Var.s();
                                                lo61 lo61Var4 = lo61Var;
                                                byte[] bArr = new byte[4];
                                                dl81Var.d(0, 4, bArr);
                                                arrayList2.add(new xu71(trim, bArr));
                                                lo61Var = lo61Var4;
                                                s2 = s2;
                                                x = x;
                                            }
                                            i6 = s2;
                                            i7 = x;
                                            lo61Var3 = lo61Var;
                                            arrayList = arrayList2;
                                            i12 = 89;
                                        } else {
                                            i6 = s2;
                                            i7 = x;
                                            lo61Var3 = lo61Var;
                                            if (s == 111) {
                                                i12 = 257;
                                            }
                                        }
                                    }
                                    i6 = s2;
                                    i7 = x;
                                    lo61Var3 = lo61Var;
                                }
                                i8 = HProv.PP_CONTAINER_DEFAULT;
                                i6 = s2;
                                i12 = i8;
                                i7 = x;
                                lo61Var3 = lo61Var;
                            }
                            i8 = HProv.PP_SECURITY_LEVEL;
                            i6 = s2;
                            i12 = i8;
                            i7 = x;
                            lo61Var3 = lo61Var;
                        }
                        int i13 = dl81Var.b;
                        dl81Var.m((i6 - i13) + i13);
                        lo61Var = lo61Var3;
                        uh81Var2 = uh81Var;
                        i2 = i5;
                        x = i7;
                    }
                    int i14 = x;
                    lo61 lo61Var5 = lo61Var;
                    dl81Var.m(i11);
                    vi71 vi71Var = new vi71(str, arrayList, Arrays.copyOfRange(dl81Var.a, i10, i11));
                    if (a == 6 || a == 5) {
                        a = i12;
                    }
                    int i15 = i5 - (a3 + 5);
                    int i16 = i9 == 2 ? a : a2;
                    if (sparseBooleanArray.get(i16)) {
                        c = 21;
                    } else {
                        c = 21;
                        w481 b2 = (i9 == 2 && a == 21) ? ur71Var.q : zc71Var.b(a, vi71Var);
                        if (i9 != 2 || a2 < sparseIntArray.get(i16, 8192)) {
                            sparseIntArray.put(i16, a2);
                            sparseArray3.put(i16, b2);
                        }
                    }
                    i2 = i15;
                    lo61Var = lo61Var5;
                    uh81Var2 = uh81Var;
                    x = i14;
                }
                int i17 = x;
                lo61 lo61Var6 = lo61Var;
                size = sparseIntArray.size();
                i3 = 0;
                while (i3 < size) {
                    int keyAt = sparseIntArray.keyAt(i3);
                    int valueAt = sparseIntArray.valueAt(i3);
                    sparseBooleanArray.put(keyAt, true);
                    ur71Var.i.put(valueAt, true);
                    w481 w481Var = (w481) sparseArray3.valueAt(i3);
                    if (w481Var != null) {
                        if (w481Var != ur71Var.q) {
                            yg71 yg71Var = ur71Var.l;
                            i4 = i17;
                            xi11 xi11Var = new xi11(i4, keyAt, 8192, 1);
                            lo61Var2 = lo61Var6;
                            w481Var.g(lo61Var2, yg71Var, xi11Var);
                        } else {
                            lo61Var2 = lo61Var6;
                            i4 = i17;
                        }
                        sparseArray2 = sparseArray;
                        sparseArray2.put(valueAt, w481Var);
                    } else {
                        lo61Var2 = lo61Var6;
                        sparseArray2 = sparseArray;
                        i4 = i17;
                    }
                    i3++;
                    lo61Var6 = lo61Var2;
                    sparseArray = sparseArray2;
                    i17 = i4;
                }
                SparseArray sparseArray5 = sparseArray;
                if (i9 != 2) {
                    if (ur71Var.n) {
                        return;
                    }
                    ur71Var.l.mo495a();
                    ur71Var.m = 0;
                    ur71Var.n = true;
                    return;
                }
                sparseArray5.remove(this.a);
                int i18 = i9 == 1 ? 0 : ur71Var.m - 1;
                ur71Var.m = i18;
                if (i18 == 0) {
                    ur71Var.l.mo495a();
                    ur71Var.n = true;
                    return;
                }
                return;
            }
        }
        sparseArray = sparseArray4;
        sparseArray3.clear();
        sparseIntArray.clear();
        i2 = dl81Var.c - dl81Var.b;
        while (i2 > 0) {
        }
        int i172 = x;
        lo61 lo61Var62 = lo61Var;
        size = sparseIntArray.size();
        i3 = 0;
        while (i3 < size) {
        }
        SparseArray sparseArray52 = sparseArray;
        if (i9 != 2) {
        }
    }

    @Override // defpackage.on61
    public void g(lo61 lo61Var, yg71 yg71Var, xi11 xi11Var) {
    }

    public cr71 h(Context context, Class cls) {
        ArrayList arrayList = (ArrayList) this.b;
        while (this.a < arrayList.size()) {
            int i = this.a;
            this.a = i + 1;
            zp1 zp1Var = (zp1) arrayList.get(i);
            cf71 cf71Var = (cf71) this.w;
            jm81 jm81Var = (jm81) cf71Var.c;
            a i2 = (jm81Var == null || !jm81Var.p(zp1Var, cls)) ? ((rr41) cf71Var.b).i(context, zp1Var, cls) : ((jm81) cf71Var.c).q(context, zp1Var);
            a aVar = i2 == null ? null : i2;
            if (aVar != null) {
                ((xs81) this.x).getClass();
                return new cr71(aVar, zp1Var, new sp81(aVar), (gr81) this.c, 9);
            }
        }
        return null;
    }

    public nzr i(int i) {
        List list;
        int i2 = this.a;
        int i3 = i * i2;
        int p = p() - i3;
        if (i2 > p) {
            i2 = p;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        if (i2 == ((List) this.x).size()) {
            list = (List) this.x;
        } else {
            ArrayList arrayList = new ArrayList(i2);
            for (int i4 = 0; i4 < i2; i4++) {
                arrayList.add(new a1u(1L));
            }
            this.x = arrayList;
            list = arrayList;
        }
        return new nzr(i3, list);
    }

    public int j(int i) {
        if (p() <= 0) {
            return 0;
        }
        if (i >= p()) {
            lxv.a("ItemIndex > total count");
        }
        return i / this.a;
    }

    public Runnable k() {
        return (b7) this.c;
    }

    public Runnable l() {
        return (r94) this.w;
    }

    public Runnable m() {
        return (iy2) this.b;
    }

    public Runnable n() {
        return (gvt) this.x;
    }

    public int o() {
        return this.a;
    }

    public int p() {
        return ((z3y) this.b).b.b;
    }

    public int q(int i) {
        suw b = ((z3y) this.b).b.b(i);
        int i2 = i - b.a;
        return (int) ((a1u) ((y3y) b.c).a.invoke(m4y.a, Integer.valueOf(i2))).a;
    }

    public s1n(Context context, e971 e971Var, i971 i971Var, wo71 wo71Var, v981 v981Var, fe81 fe81Var) {
        hlx0 hlx0Var = new hlx0(context, fe81Var, v981Var, wo71Var, i971Var);
        this.b = e971Var;
        this.c = hlx0Var;
        this.w = new ArrayList();
    }

    public s1n(ArrayList arrayList, gr81 gr81Var, z581 z581Var, cf71 cf71Var, int i) {
        cf71Var = (i & 8) != 0 ? new cf71(new rr41(z581Var)) : cf71Var;
        xs81 xs81Var = new xs81();
        this.b = arrayList;
        this.c = gr81Var;
        this.w = cf71Var;
        this.x = xs81Var;
    }

    public /* synthetic */ s1n(Object obj, Object obj2, byte[] bArr, Object[] objArr, int i) {
        this.b = obj;
        this.c = obj2;
        this.w = bArr;
        this.x = objArr;
        this.a = i;
    }

    public s1n(int i, iy2 iy2Var, b7 b7Var, r94 r94Var, gvt gvtVar) {
        this.a = i;
        this.b = iy2Var;
        this.c = b7Var;
        this.w = r94Var;
        this.x = gvtVar;
    }

    public s1n(Context context, String str, String str2, int i) {
        this.a = i;
        this.b = str2;
        yzh yzhVar = new yzh(context);
        this.c = new u1n(yzhVar);
        this.w = new zrm(3, yzhVar, str);
        this.x = new mum(yzhVar);
    }

    public s1n(z3y z3yVar) {
        this.b = z3yVar;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        arrayList.add(new o501(i, i, 29));
        this.c = arrayList;
        this.w = new ArrayList();
        this.x = EmptyList.a;
    }

    public s1n(vi11 vi11Var, int i) {
        this.x = vi11Var;
        this.b = new df90(new byte[5], 5);
        this.c = new SparseArray();
        this.w = new SparseIntArray();
        this.a = i;
    }
}
