package defpackage;

import androidx.compose.foundation.layout.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.IntRange;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public abstract class m3f {
    public static final Regex a = new Regex("\\W");

    /* JADX WARN: Removed duplicated region for block: B:20:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final List list, final yci yciVar, final long j, long j2, long j3, int i, long j4, final int i2, Function1 function1, final ges gesVar, hq5 hq5Var, int i3, int i4, int i5) {
        Function1 function12;
        int i6;
        long j5;
        long j6;
        long j7;
        oq5 oq5Var;
        Function1 function13;
        long j8;
        long j9;
        int i7;
        long j10;
        xmn r;
        list.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-1611261861);
        int i8 = i3 | (oq5Var2.f(list) ? 4 : 2) | (oq5Var2.e(j) ? 256 : 128) | 853240832;
        int i9 = i4 | 6;
        if ((i4 & 48) == 0) {
            i9 |= oq5Var2.d(i2) ? 32 : 16;
        }
        int i10 = i5 & 4096;
        if (i10 != 0) {
            i9 |= 384;
        } else if ((i4 & 384) == 0) {
            function12 = function1;
            i9 |= oq5Var2.h(function12) ? 256 : 128;
            if ((i4 & 3072) == 0) {
                i9 |= oq5Var2.f(gesVar) ? 2048 : 1024;
            }
            if ((i8 & 306783379) != 306783378 && (i9 & 1171) == 1170 && oq5Var2.z()) {
                oq5Var2.S();
                j8 = j2;
                j9 = j3;
                i7 = i;
                j10 = j4;
                oq5Var = oq5Var2;
                function13 = function12;
            } else {
                oq5Var2.U();
                if ((i3 & 1) != 0 || oq5Var2.y()) {
                    long j11 = kes.c;
                    if (i10 != 0) {
                        Object K = oq5Var2.K();
                        if (K == gq5.a) {
                            K = new mke(29);
                            oq5Var2.k0(K);
                        }
                        function12 = (Function1) K;
                    }
                    i6 = Integer.MIN_VALUE;
                    j5 = j11;
                    j6 = j5;
                    j7 = j6;
                } else {
                    oq5Var2.S();
                    j5 = j2;
                    j6 = j3;
                    i6 = i;
                    j7 = j4;
                }
                oq5Var2.q();
                int i11 = u5g.b;
                final int l = v5g.l(2, 4);
                final ges e = gesVar.e(new ges(0L, j5, null, null, null, null, null, j6, null, i6, j7, null, null, l, 14511953));
                final Function1 function14 = function12;
                final long j12 = j5;
                final long j13 = j6;
                final int i12 = i6;
                final long j14 = j7;
                oq5Var = oq5Var2;
                bg3.a(null, null, false, ild.C(182797509, new pyc() { // from class: l3f
                    @Override // defpackage.pyc
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        char c;
                        int i13;
                        Object vatVar;
                        c cVar = (c) obj;
                        hq5 hq5Var2 = (hq5) obj2;
                        int intValue = ((Integer) obj3).intValue();
                        cVar.getClass();
                        if ((intValue & 6) == 0) {
                            intValue |= ((oq5) hq5Var2).f(cVar) ? 4 : 2;
                        }
                        if ((intValue & 19) == 18) {
                            oq5 oq5Var3 = (oq5) hq5Var2;
                            if (oq5Var3.z()) {
                                oq5Var3.S();
                                return Unit.a;
                            }
                        }
                        oq5 oq5Var4 = (oq5) hq5Var2;
                        int L = ((jx7) oq5Var4.j(es5.h)).L(cVar.d());
                        List list2 = list;
                        boolean f = oq5Var4.f(list2);
                        Object K2 = oq5Var4.K();
                        Object obj4 = gq5.a;
                        if (f || K2 == obj4) {
                            K2 = CollectionsKt.X(list2, "\u200b ", null, "\u200b", null, 58);
                            oq5Var4.k0(K2);
                        }
                        String str = (String) K2;
                        ids O = o5g.O(0, 1, oq5Var4);
                        boolean f2 = oq5Var4.f(str);
                        ges gesVar2 = e;
                        boolean f3 = f2 | oq5Var4.f(gesVar2) | oq5Var4.d(L);
                        int i14 = i2;
                        boolean d = f3 | oq5Var4.d(i14);
                        Object K3 = oq5Var4.K();
                        if (d || K3 == obj4) {
                            if (L < 0) {
                                ume.a("width must be >= 0");
                            }
                            c = 8203;
                            ogi ogiVar = ids.a(O, str, gesVar2, 1, true, i14 + 1, ia6.h(L, L, 0, Integer.MAX_VALUE), 960).b;
                            int i15 = ogiVar.f;
                            int i16 = (i15 > i14 ? i14 : i15) - 1;
                            List g = m3f.a.g(0, mlr.K(ogiVar.d(i16, false), str));
                            ArrayList arrayList = new ArrayList();
                            for (Object obj5 : g) {
                                if (!StringsKt.U((String) obj5)) {
                                    arrayList.add(obj5);
                                }
                            }
                            IntRange intRange = new IntRange(0, i16, 1);
                            ArrayList arrayList2 = new ArrayList(v75.o(intRange, 10));
                            ype it = intRange.iterator();
                            while (it.c) {
                                int nextInt = it.nextInt();
                                arrayList2.add(mlr.E(nextInt == 0 ? 0 : ogiVar.d(nextInt - 1, false), mlr.K(ogiVar.d(nextInt, false), str)));
                            }
                            if (!arrayList.isEmpty()) {
                                Iterator it2 = arrayList.iterator();
                                loop3: while (it2.hasNext()) {
                                    String str2 = (String) it2.next();
                                    if (!arrayList2.isEmpty()) {
                                        Iterator it3 = arrayList2.iterator();
                                        while (it3.hasNext()) {
                                            if (StringsKt.M((String) it3.next(), str2, false)) {
                                                break;
                                            }
                                        }
                                    }
                                    i13 = 1;
                                }
                            }
                            i13 = i14;
                            if (i15 <= i13) {
                                vatVar = new vat(new ods(i13 == i14 ? 3 : 2), Integer.valueOf(i13), mlr.F(str));
                            } else {
                                String K4 = mlr.K(ogiVar.d(i13 - 1, false), str);
                                int length = K4.length() - 1;
                                if (length >= 0) {
                                    while (true) {
                                        int i17 = length - 1;
                                        if (K4.charAt(length) == 8203) {
                                            break;
                                        }
                                        if (i17 < 0) {
                                            break;
                                        }
                                        length = i17;
                                    }
                                }
                                length = -1;
                                if (length != -1) {
                                    K4 = mlr.K(length, K4);
                                }
                                String str3 = (String) CollectionsKt.Q(list2);
                                if (str3.length() < K4.length()) {
                                    K3 = new vat(new ods(1), Integer.valueOf(i13), K4);
                                    oq5Var4.k0(K3);
                                } else {
                                    vatVar = new vat(new ods(2), Integer.valueOf(i13), str3);
                                }
                            }
                            K3 = vatVar;
                            oq5Var4.k0(K3);
                        } else {
                            c = 8203;
                        }
                        vat vatVar2 = (vat) K3;
                        int i18 = ((ods) vatVar2.a).a;
                        int intValue2 = ((Number) vatVar2.b).intValue();
                        String s = kotlin.text.c.s(c, ',', (String) vatVar2.c);
                        CopyOnWriteArrayList copyOnWriteArrayList = ssg.a;
                        xv7.j(s, yciVar, j, j12, j13, i12, j14, i18, true, intValue2, 0, function14, gesVar.e(new ges(0L, 0L, null, null, null, null, null, 0L, null, 0, 0L, null, null, l, 14680063)), oq5Var4, 0, 384, 16384);
                        return Unit.a;
                    }
                }, oq5Var), oq5Var, 3072, 7);
                function13 = function14;
                j8 = j5;
                j9 = j6;
                i7 = i6;
                j10 = j7;
            }
            r = oq5Var.r();
            if (r == null) {
                r.d = new zh6(list, yciVar, j, j8, j9, i7, j10, i2, function13, gesVar, i3, i4, i5);
                return;
            }
            return;
        }
        function12 = function1;
        if ((i4 & 3072) == 0) {
        }
        if ((i8 & 306783379) != 306783378) {
        }
        oq5Var2.U();
        if ((i3 & 1) != 0) {
        }
        long j112 = kes.c;
        if (i10 != 0) {
        }
        i6 = Integer.MIN_VALUE;
        j5 = j112;
        j6 = j5;
        j7 = j6;
        oq5Var2.q();
        int i112 = u5g.b;
        final int l2 = v5g.l(2, 4);
        final ges e2 = gesVar.e(new ges(0L, j5, null, null, null, null, null, j6, null, i6, j7, null, null, l2, 14511953));
        final Function1 function142 = function12;
        final long j122 = j5;
        final long j132 = j6;
        final int i122 = i6;
        final long j142 = j7;
        oq5Var = oq5Var2;
        bg3.a(null, null, false, ild.C(182797509, new pyc() { // from class: l3f
            @Override // defpackage.pyc
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                char c;
                int i13;
                Object vatVar;
                c cVar = (c) obj;
                hq5 hq5Var2 = (hq5) obj2;
                int intValue = ((Integer) obj3).intValue();
                cVar.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((oq5) hq5Var2).f(cVar) ? 4 : 2;
                }
                if ((intValue & 19) == 18) {
                    oq5 oq5Var3 = (oq5) hq5Var2;
                    if (oq5Var3.z()) {
                        oq5Var3.S();
                        return Unit.a;
                    }
                }
                oq5 oq5Var4 = (oq5) hq5Var2;
                int L = ((jx7) oq5Var4.j(es5.h)).L(cVar.d());
                List list2 = list;
                boolean f = oq5Var4.f(list2);
                Object K2 = oq5Var4.K();
                Object obj4 = gq5.a;
                if (f || K2 == obj4) {
                    K2 = CollectionsKt.X(list2, "\u200b ", null, "\u200b", null, 58);
                    oq5Var4.k0(K2);
                }
                String str = (String) K2;
                ids O = o5g.O(0, 1, oq5Var4);
                boolean f2 = oq5Var4.f(str);
                ges gesVar2 = e2;
                boolean f3 = f2 | oq5Var4.f(gesVar2) | oq5Var4.d(L);
                int i14 = i2;
                boolean d = f3 | oq5Var4.d(i14);
                Object K3 = oq5Var4.K();
                if (d || K3 == obj4) {
                    if (L < 0) {
                        ume.a("width must be >= 0");
                    }
                    c = 8203;
                    ogi ogiVar = ids.a(O, str, gesVar2, 1, true, i14 + 1, ia6.h(L, L, 0, Integer.MAX_VALUE), 960).b;
                    int i15 = ogiVar.f;
                    int i16 = (i15 > i14 ? i14 : i15) - 1;
                    List g = m3f.a.g(0, mlr.K(ogiVar.d(i16, false), str));
                    ArrayList arrayList = new ArrayList();
                    for (Object obj5 : g) {
                        if (!StringsKt.U((String) obj5)) {
                            arrayList.add(obj5);
                        }
                    }
                    IntRange intRange = new IntRange(0, i16, 1);
                    ArrayList arrayList2 = new ArrayList(v75.o(intRange, 10));
                    ype it = intRange.iterator();
                    while (it.c) {
                        int nextInt = it.nextInt();
                        arrayList2.add(mlr.E(nextInt == 0 ? 0 : ogiVar.d(nextInt - 1, false), mlr.K(ogiVar.d(nextInt, false), str)));
                    }
                    if (!arrayList.isEmpty()) {
                        Iterator it2 = arrayList.iterator();
                        loop3: while (it2.hasNext()) {
                            String str2 = (String) it2.next();
                            if (!arrayList2.isEmpty()) {
                                Iterator it3 = arrayList2.iterator();
                                while (it3.hasNext()) {
                                    if (StringsKt.M((String) it3.next(), str2, false)) {
                                        break;
                                    }
                                }
                            }
                            i13 = 1;
                        }
                    }
                    i13 = i14;
                    if (i15 <= i13) {
                        vatVar = new vat(new ods(i13 == i14 ? 3 : 2), Integer.valueOf(i13), mlr.F(str));
                    } else {
                        String K4 = mlr.K(ogiVar.d(i13 - 1, false), str);
                        int length = K4.length() - 1;
                        if (length >= 0) {
                            while (true) {
                                int i17 = length - 1;
                                if (K4.charAt(length) == 8203) {
                                    break;
                                }
                                if (i17 < 0) {
                                    break;
                                }
                                length = i17;
                            }
                        }
                        length = -1;
                        if (length != -1) {
                            K4 = mlr.K(length, K4);
                        }
                        String str3 = (String) CollectionsKt.Q(list2);
                        if (str3.length() < K4.length()) {
                            K3 = new vat(new ods(1), Integer.valueOf(i13), K4);
                            oq5Var4.k0(K3);
                        } else {
                            vatVar = new vat(new ods(2), Integer.valueOf(i13), str3);
                        }
                    }
                    K3 = vatVar;
                    oq5Var4.k0(K3);
                } else {
                    c = 8203;
                }
                vat vatVar2 = (vat) K3;
                int i18 = ((ods) vatVar2.a).a;
                int intValue2 = ((Number) vatVar2.b).intValue();
                String s = kotlin.text.c.s(c, ',', (String) vatVar2.c);
                CopyOnWriteArrayList copyOnWriteArrayList = ssg.a;
                xv7.j(s, yciVar, j, j122, j132, i122, j142, i18, true, intValue2, 0, function142, gesVar.e(new ges(0L, 0L, null, null, null, null, null, 0L, null, 0, 0L, null, null, l2, 14680063)), oq5Var4, 0, 384, 16384);
                return Unit.a;
            }
        }, oq5Var), oq5Var, 3072, 7);
        function13 = function142;
        j8 = j5;
        j9 = j6;
        i7 = i6;
        j10 = j7;
        r = oq5Var.r();
        if (r == null) {
        }
    }
}
