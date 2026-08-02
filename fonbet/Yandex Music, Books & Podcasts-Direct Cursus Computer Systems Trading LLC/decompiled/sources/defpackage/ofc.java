package defpackage;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.ByteArrayOutputStream;
import java.security.Provider;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Mac;
import kotlin.Unit;
import kotlin.ranges.a;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public final class ofc implements b9l, xwt, p7q, mx0, lci, k8b, ehc, vzn, jkp, mnj {
    public static final ofc b = new ofc(0);
    public static final ofc c = new ofc(1);
    public static final ofc d = new ofc(2);
    public static final ofc e = new ofc(3);
    public static final ofc f = new ofc(4);
    public static final ofc g = new ofc(5);
    public static final ofc h = new ofc(6);
    public static final ofc i = new ofc(7);
    public static final /* synthetic */ ofc j = new ofc(8);
    public static final ofc k = new ofc(9);
    public static final ofc l = new ofc(10);
    public static final ofc m = new ofc(11);
    public static final ofc n = new ofc(12);
    public final /* synthetic */ int a;

    public /* synthetic */ ofc(int i2) {
        this.a = i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static rzf F(X509Certificate x509Certificate, LinkedHashMap linkedHashMap) {
        pp7 pp7Var;
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(x509Certificate.getNotBefore());
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(x509Certificate.getNotAfter());
        int i2 = 2;
        int i3 = 0;
        if (calendar2.compareTo(calendar) < 0) {
            pp7Var = new pp7(0, false);
        } else {
            pp7Var = new pp7(((calendar2.get(2) - calendar.get(2)) + ((calendar2.get(1) - calendar.get(1)) * 12)) - (calendar2.get(5) < calendar.get(5) ? 1 : 0), calendar2.get(5) != calendar.get(5));
        }
        int i4 = pp7Var.a;
        if (i4 <= 39) {
            boolean z = pp7Var.b;
            if (i4 != 39 || !z) {
                if (i4 > 27 || (i4 == 27 && z)) {
                    i2 = 4;
                } else if (i4 >= 15) {
                    i2 = 3;
                }
                if (!linkedHashMap.isEmpty()) {
                    Iterator it = linkedHashMap.entrySet().iterator();
                    while (it.hasNext()) {
                        if (((Map.Entry) it.next()).getValue() instanceof ryo) {
                            i3++;
                        }
                    }
                }
                return i3 >= i2 ? new h0u(linkedHashMap, i2) : new k0u(linkedHashMap);
            }
        }
        i2 = 5;
        if (!linkedHashMap.isEmpty()) {
        }
        if (i3 >= i2) {
        }
    }

    public static ArrayList G(String str) {
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (i2 <= str.length()) {
            int S = StringsKt.S(str, '&', i2, 4);
            if (S == -1) {
                S = str.length();
            }
            int S2 = StringsKt.S(str, '=', i2, 4);
            if (S2 == -1 || S2 > S) {
                arrayList.add(str.substring(i2, S));
                arrayList.add(null);
            } else {
                arrayList.add(str.substring(i2, S2));
                arrayList.add(str.substring(S2 + 1, S));
            }
            i2 = S + 1;
        }
        return arrayList;
    }

    public static void I(List list, StringBuilder sb) {
        list.getClass();
        a l2 = yhn.l(2, yhn.m(0, list.size()));
        int i2 = l2.a;
        int i3 = l2.b;
        int i4 = l2.c;
        if ((i4 <= 0 || i2 > i3) && (i4 >= 0 || i3 > i2)) {
            return;
        }
        while (true) {
            String str = (String) list.get(i2);
            String str2 = (String) list.get(i2 + 1);
            if (i2 > 0) {
                sb.append('&');
            }
            sb.append(str);
            if (str2 != null) {
                sb.append('=');
                sb.append(str2);
            }
            if (i2 == i3) {
                return;
            } else {
                i2 += i4;
            }
        }
    }

    public static String g(String str, boolean z, String str2, int i2, int i3, int i4) {
        int i5 = (i4 & 1) != 0 ? 0 : i2;
        int length = (i4 & 2) != 0 ? str.length() : i3;
        boolean z2 = (i4 & 8) != 0 ? false : z;
        boolean z3 = (i4 & 16) == 0;
        boolean z4 = (i4 & 32) == 0;
        boolean z5 = (i4 & 64) == 0;
        str.getClass();
        int i6 = i5;
        while (i6 < length) {
            int codePointAt = str.codePointAt(i6);
            int i7 = 128;
            int i8 = 32;
            if (codePointAt < 32 || codePointAt == 127 || ((codePointAt >= 128 && !z5) || StringsKt.N(str2, (char) codePointAt) || ((codePointAt == 37 && (!z2 || (z3 && !v(i6, length, str)))) || (codePointAt == 43 && z4)))) {
                hi3 hi3Var = new hi3();
                hi3Var.R0(i5, i6, str);
                hi3 hi3Var2 = null;
                while (i6 < length) {
                    int codePointAt2 = str.codePointAt(i6);
                    if (!z2 || (codePointAt2 != 9 && codePointAt2 != 10 && codePointAt2 != 12 && codePointAt2 != 13)) {
                        if (codePointAt2 == 43 && z4) {
                            hi3Var.S0(z2 ? "+" : "%2B");
                        } else if (codePointAt2 < i8 || codePointAt2 == 127 || ((codePointAt2 >= i7 && !z5) || StringsKt.N(str2, (char) codePointAt2) || (codePointAt2 == 37 && (!z2 || (z3 && !v(i6, length, str)))))) {
                            if (hi3Var2 == null) {
                                hi3Var2 = new hi3();
                            }
                            hi3Var2.T0(codePointAt2);
                            while (!hi3Var2.N()) {
                                byte readByte = hi3Var2.readByte();
                                hi3Var.M0(37);
                                char[] cArr = u7e.k;
                                hi3Var.M0(cArr[((readByte & 255) >> 4) & 15]);
                                hi3Var.M0(cArr[readByte & 15]);
                            }
                        } else {
                            hi3Var.T0(codePointAt2);
                        }
                    }
                    i6 += Character.charCount(codePointAt2);
                    i7 = 128;
                    i8 = 32;
                }
                return hi3Var.G0();
            }
            i6 += Character.charCount(codePointAt);
        }
        return str.substring(i5, length);
    }

    public static byte[] s(long j2, yde ydeVar) {
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(ydeVar.size());
        Iterator<E> it = ydeVar.iterator();
        while (it.hasNext()) {
            rv6 rv6Var = (rv6) it.next();
            Bundle c2 = rv6Var.c();
            Bitmap bitmap = rv6Var.d;
            if (bitmap != null) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                vq1.A(bitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream));
                c2.putByteArray(rv6.w, byteArrayOutputStream.toByteArray());
            }
            arrayList.add(c2);
        }
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("c", arrayList);
        bundle.putLong("d", j2);
        Parcel obtain = Parcel.obtain();
        obtain.writeBundle(bundle);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }

    public static boolean v(int i2, int i3, String str) {
        int i4 = i2 + 2;
        return i4 < i3 && str.charAt(i2) == '%' && cvt.r(str.charAt(i2 + 1)) != -1 && cvt.r(str.charAt(i4)) != -1;
    }

    public static String x(String str, int i2, int i3, int i4) {
        int i5;
        if ((i4 & 1) != 0) {
            i2 = 0;
        }
        if ((i4 & 2) != 0) {
            i3 = str.length();
        }
        boolean z = (i4 & 4) == 0;
        str.getClass();
        int i6 = i2;
        while (i6 < i3) {
            char charAt = str.charAt(i6);
            if (charAt == '%' || (charAt == '+' && z)) {
                hi3 hi3Var = new hi3();
                hi3Var.R0(i2, i6, str);
                while (i6 < i3) {
                    int codePointAt = str.codePointAt(i6);
                    if (codePointAt != 37 || (i5 = i6 + 2) >= i3) {
                        if (codePointAt == 43 && z) {
                            hi3Var.M0(32);
                            i6++;
                        }
                        hi3Var.T0(codePointAt);
                        i6 += Character.charCount(codePointAt);
                    } else {
                        int r = cvt.r(str.charAt(i6 + 1));
                        int r2 = cvt.r(str.charAt(i5));
                        if (r != -1 && r2 != -1) {
                            hi3Var.M0((r << 4) + r2);
                            i6 = Character.charCount(codePointAt) + i5;
                        }
                        hi3Var.T0(codePointAt);
                        i6 += Character.charCount(codePointAt);
                    }
                }
                return hi3Var.G0();
            }
            i6++;
        }
        return str.substring(i2, i3);
    }

    @Override // defpackage.b9l
    public Object A(long j2, kdl kdlVar, iol iolVar) {
        return Unit.a;
    }

    @Override // defpackage.b9l
    public Object B(h4q h4qVar, lol lolVar) {
        return Unit.a;
    }

    @Override // defpackage.b9l
    public Object C(long j2, mpl mplVar, w8l w8lVar) {
        return Unit.a;
    }

    @Override // defpackage.b9l
    public Object D(z11 z11Var) {
        return Unit.a;
    }

    @Override // defpackage.jkp
    public boolean E(Object obj) {
        ((nwi) obj).getClass();
        return true;
    }

    @Override // defpackage.jkp
    public int H(Object obj) {
        ((nwi) obj).getClass();
        return 5;
    }

    public List J(jc8 jc8Var) {
        ArrayList arrayList;
        List list;
        if (jc8Var instanceof ob8) {
            dm9 dm9Var = ((ob8) jc8Var).c;
            String str = dm9Var.p;
            if ("restore_purchase_state".equals(str)) {
                list = t75.c("restore_purchase_state");
            } else {
                List list2 = dm9Var.I;
                ArrayList arrayList2 = new ArrayList();
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    jc8 jc8Var2 = ((cm9) it.next()).c;
                    if (jc8Var2 != null) {
                        arrayList2.add(jc8Var2);
                    }
                }
                ArrayList K = K(arrayList2);
                arrayList = new ArrayList(v75.o(K, 10));
                Iterator it2 = K.iterator();
                while (it2.hasNext()) {
                    arrayList.add(str + ((String) it2.next()));
                }
                list = arrayList;
            }
        } else {
            arrayList = null;
            if (jc8Var instanceof cb8) {
                List list3 = ((cb8) jc8Var).c.B;
                if (list3 != null) {
                    list = K(list3);
                }
                list = arrayList;
            } else if (jc8Var instanceof gb8) {
                List list4 = ((gb8) jc8Var).c.y;
                if (list4 != null) {
                    list = K(list4);
                }
                list = arrayList;
            } else if (jc8Var instanceof eb8) {
                List list5 = ((eb8) jc8Var).c.u;
                if (list5 != null) {
                    list = K(list5);
                }
                list = arrayList;
            } else if (jc8Var instanceof kb8) {
                List list6 = ((kb8) jc8Var).c.t;
                if (list6 != null) {
                    list = K(list6);
                }
                list = arrayList;
            } else if (jc8Var instanceof qb8) {
                List list7 = ((qb8) jc8Var).c.q;
                ArrayList arrayList3 = new ArrayList(v75.o(list7, 10));
                Iterator it3 = list7.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(((ro9) it3.next()).a);
                }
                list = K(arrayList3);
            } else {
                list = c5b.a;
            }
        }
        return list == null ? c5b.a : list;
    }

    public ArrayList K(List list) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(v75.o(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(J((jc8) it.next()));
        }
        return v75.p(arrayList);
    }

    @Override // defpackage.k8b
    public Object a(String str, Provider provider) {
        return provider == null ? Mac.getInstance(str) : Mac.getInstance(str, provider);
    }

    @Override // defpackage.ehc
    public Object b(b6 b6Var, boolean z) {
        return b6Var.c;
    }

    @Override // defpackage.b9l
    public Object e(long j2, long j3, kol kolVar) {
        return Unit.a;
    }

    @Override // defpackage.b9l
    public Object f(long j2, col colVar) {
        return Unit.a;
    }

    @Override // defpackage.vzn
    public void h(String str, long j2, int i2, long j3, long j4) {
        str.getClass();
        ssg.a(2, "PerfMetricsLogReporter", "name: " + str + ", value: " + j4, null);
    }

    @Override // defpackage.vzn
    public void i(String str, float f2) {
        ssg.a(2, "PerfMetricsLogReporter", "name: " + str + ", value: " + f2, null);
    }

    @Override // defpackage.b9l
    public Object j(long j2, v8l v8lVar) {
        return Unit.a;
    }

    @Override // defpackage.b9l
    public Object k(eol eolVar) {
        return Unit.a;
    }

    @Override // defpackage.b9l
    public Object l(n4q n4qVar, mol molVar) {
        return Unit.a;
    }

    @Override // defpackage.p7q
    public Object m(ioc iocVar) {
        switch (this.a) {
            case 7:
                iocVar.getClass();
                return Boolean.FALSE;
            case 8:
            default:
                iocVar.getClass();
                throw null;
            case 9:
                iocVar.getClass();
                return new ybn(0, t75.c(null), false);
        }
    }

    @Override // defpackage.p7q
    public Object n(szu szuVar) {
        switch (this.a) {
            case 7:
                szuVar.getClass();
                return Boolean.valueOf(szuVar.n);
            case 8:
            default:
                szuVar.getClass();
                return neg.J(szuVar.a.getId());
            case 9:
                szuVar.getClass();
                return new ybn(szuVar.i(), szuVar.k(), true);
        }
    }

    @Override // defpackage.b9l
    public Object p(zgl zglVar, cg6 cg6Var) {
        return Unit.a;
    }

    @Override // defpackage.p7q
    public Object q(y4d y4dVar) {
        switch (this.a) {
            case 7:
                y4dVar.getClass();
                return Boolean.FALSE;
            case 8:
            default:
                y4dVar.getClass();
                return new caq(y4dVar.a.a.a.a());
            case 9:
                y4dVar.getClass();
                return new ybn(0, t75.c(y4dVar.b), false);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0067, code lost:
    
        if (((defpackage.vaq) r6).p() != null) goto L38;
     */
    @Override // defpackage.p7q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object q0(maq maqVar) {
        boolean z;
        switch (this.a) {
            case 7:
                maqVar.getClass();
                boolean z2 = true;
                if (!(maqVar instanceof jbq)) {
                    if (maqVar instanceof vaq) {
                        break;
                    } else if (!(maqVar instanceof eaq) && !(maqVar instanceof raq)) {
                        b6e.s();
                        return null;
                    }
                    z2 = false;
                }
                return Boolean.valueOf(z2);
            case 8:
            default:
                maqVar.getClass();
                String id = maqVar.k().getId().getId();
                if (id == null) {
                    id = "";
                }
                return new paq(id);
            case 9:
                maqVar.getClass();
                List E = bzf.E(maqVar);
                int indexOf = bzf.E(maqVar).indexOf(maqVar.b());
                if (maqVar instanceof jbq) {
                    z = true;
                } else {
                    if (!(maqVar instanceof vaq) && !(maqVar instanceof eaq) && !(maqVar instanceof raq)) {
                        b6e.s();
                        return null;
                    }
                    z = false;
                }
                return new ybn(indexOf, E, z);
        }
    }

    @Override // defpackage.xwt
    public Object r(b7f b7fVar, float f2) {
        return p7f.b(b7fVar, f2);
    }

    @Override // defpackage.p7q
    public Object t(t1q t1qVar) {
        switch (this.a) {
            case 7:
                t1qVar.getClass();
                return Boolean.valueOf(t1qVar.b != null);
            case 8:
            default:
                t1qVar.getClass();
                String id = t1qVar.a.getId().getId();
                if (id == null) {
                    id = "";
                }
                return new paq(id);
            case 9:
                t1qVar.getClass();
                List list = t1qVar.e;
                return new ybn(list.indexOf(t1qVar.c), list, false);
        }
    }

    public String toString() {
        switch (this.a) {
            case 14:
                return "AbsoluteArrangement#Left";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.p7q
    public Object u(u7u u7uVar) {
        switch (this.a) {
            case 7:
                u7uVar.getClass();
                return Boolean.valueOf(u7uVar.j);
            case 8:
            default:
                u7uVar.getClass();
                return new uaq(u7uVar.a.a.a);
            case 9:
                u7uVar.getClass();
                return new ybn(u7uVar.i, u7uVar.h, false);
        }
    }

    @Override // defpackage.mx0
    public void w(jx7 jx7Var, int i2, int[] iArr, xof xofVar, int[] iArr2) {
        qx0.b(iArr, iArr2, false);
    }

    @Override // defpackage.lci
    public kci y(kkp kkpVar) {
        return new uit(1);
    }

    @Override // defpackage.b9l
    public Object z(long j2, col colVar) {
        return Unit.a;
    }

    @Override // defpackage.mnj
    public int c(int i2) {
        return i2;
    }

    @Override // defpackage.mnj
    public int d(int i2) {
        return i2;
    }
}
