package d8;

import android.content.SharedPreferences;
import android.text.Layout;
import android.text.TextUtils;
import android.util.Log;
import java.text.Bidi;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import m0.i0;
import m0.l1;
import m0.z0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class t implements h2.p, l7.c {

    /* renamed from: a, reason: collision with root package name */
    public final Object f1816a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1817b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f1818c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f1819d;

    /* renamed from: e, reason: collision with root package name */
    public Object f1820e;

    public t(Map map) {
        pc.j.e(map, "initialState");
        this.f1816a = bc.z.S(map);
        this.f1817b = new LinkedHashMap();
        this.f1818c = new LinkedHashMap();
        this.f1819d = new LinkedHashMap();
        this.f1820e = new d.i(1, this);
    }

    public static t i(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        t tVar = new t(sharedPreferences, scheduledThreadPoolExecutor);
        synchronized (((ArrayDeque) tVar.f1819d)) {
            try {
                ((ArrayDeque) tVar.f1819d).clear();
                String string = ((SharedPreferences) tVar.f1816a).getString((String) tVar.f1817b, "");
                if (!TextUtils.isEmpty(string) && string.contains((String) tVar.f1818c)) {
                    String[] split = string.split((String) tVar.f1818c, -1);
                    if (split.length == 0) {
                        Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                    }
                    for (String str : split) {
                        if (!TextUtils.isEmpty(str)) {
                            ((ArrayDeque) tVar.f1819d).add(str);
                        }
                    }
                    return tVar;
                }
                return tVar;
            } finally {
            }
        }
    }

    @Override // l7.c
    public Object a(Class cls) {
        if (!((Set) this.f1816a).contains(l7.r.a(cls))) {
            throw new ac.d("Attempting to request an undeclared dependency " + cls + ".");
        }
        Object a6 = ((l7.c) this.f1820e).a(cls);
        if (!cls.equals(t7.a.class)) {
            return a6;
        }
        return new l7.s();
    }

    @Override // l7.c
    public Object b(l7.r rVar) {
        if (((Set) this.f1816a).contains(rVar)) {
            return ((l7.c) this.f1820e).b(rVar);
        }
        throw new ac.d("Attempting to request an undeclared dependency " + rVar + ".");
    }

    @Override // h2.p
    public boolean c() {
        ArrayList arrayList = (ArrayList) this.f1820e;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((h2.o) arrayList.get(i10)).f2693a.c()) {
                return true;
            }
        }
        return false;
    }

    @Override // l7.c
    public w7.a d(Class cls) {
        return e(l7.r.a(cls));
    }

    @Override // l7.c
    public w7.a e(l7.r rVar) {
        if (((Set) this.f1817b).contains(rVar)) {
            return ((l7.c) this.f1820e).e(rVar);
        }
        throw new ac.d("Attempting to request an undeclared dependency Provider<" + rVar + ">.");
    }

    @Override // l7.c
    public w7.a f(l7.r rVar) {
        if (((Set) this.f1819d).contains(rVar)) {
            return ((l7.c) this.f1820e).f(rVar);
        }
        throw new ac.d("Attempting to request an undeclared dependency Provider<Set<" + rVar + ">>.");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ac.f, java.lang.Object] */
    @Override // h2.p
    public float g() {
        return ((Number) this.f1819d.getValue()).floatValue();
    }

    @Override // l7.c
    public Set h(l7.r rVar) {
        if (((Set) this.f1818c).contains(rVar)) {
            return ((l7.c) this.f1820e).h(rVar);
        }
        throw new ac.d("Attempting to request an undeclared dependency Set<" + rVar + ">.");
    }

    public boolean j() {
        return ((Boolean) ((i0) this.f1820e).getValue()).booleanValue();
    }

    public float k(int i10, boolean z10) {
        Layout layout = (Layout) this.f1816a;
        int lineEnd = layout.getLineEnd(layout.getLineForOffset(i10));
        if (i10 > lineEnd) {
            i10 = lineEnd;
        }
        return z10 ? layout.getPrimaryHorizontal(i10) : layout.getSecondaryHorizontal(i10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:202:0x003b, code lost:
    
        if (r31 != false) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0183  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public float l(int i10, boolean z10, boolean z11) {
        int lineForOffset;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z12;
        Bidi bidi;
        boolean z13;
        int i15 = i10;
        ArrayList arrayList = (ArrayList) this.f1817b;
        Layout layout = (Layout) this.f1816a;
        if (!z11) {
            return k(i10, z10);
        }
        if (i15 <= 0) {
            lineForOffset = 0;
        } else {
            if (i15 >= layout.getText().length()) {
                lineForOffset = layout.getLineCount();
            } else {
                lineForOffset = layout.getLineForOffset(i15);
                int lineStart = layout.getLineStart(lineForOffset);
                int lineEnd = layout.getLineEnd(lineForOffset);
                if (lineStart == i15 || lineEnd == i15) {
                    if (lineStart != i15) {
                        if (!z11) {
                            lineForOffset++;
                        }
                    }
                }
            }
            lineForOffset--;
        }
        int lineStart2 = layout.getLineStart(lineForOffset);
        int lineEnd2 = layout.getLineEnd(lineForOffset);
        if (i15 != lineStart2 && i15 != lineEnd2) {
            return k(i10, z10);
        }
        if (i15 == 0 || i15 == layout.getText().length()) {
            return k(i10, z10);
        }
        Integer valueOf = Integer.valueOf(i15);
        int size = arrayList.size();
        pc.j.e(arrayList, "<this>");
        int size2 = arrayList.size();
        if (size < 0) {
            throw new IllegalArgumentException(a4.d.h("fromIndex (0) is greater than toIndex (", size, ")."));
        }
        if (size > size2) {
            throw new IndexOutOfBoundsException("toIndex (" + size + ") is greater than size (" + size2 + ").");
        }
        int i16 = size - 1;
        int i17 = 0;
        while (true) {
            if (i17 > i16) {
                i11 = -(i17 + 1);
                break;
            }
            i11 = (i17 + i16) >>> 1;
            int p8 = a.a.p((Comparable) arrayList.get(i11), valueOf);
            if (p8 >= 0) {
                if (p8 <= 0) {
                    break;
                }
                i16 = i11 - 1;
            } else {
                i17 = i11 + 1;
            }
        }
        int i18 = i11 < 0 ? -(i11 + 1) : i11 + 1;
        if (z11 && i18 > 0) {
            int i19 = i18 - 1;
            if (i15 == ((Number) arrayList.get(i19)).intValue()) {
                i18 = i19;
            }
        }
        boolean z14 = layout.getParagraphDirection(layout.getLineForOffset(i18 == 0 ? 0 : ((Number) arrayList.get(i18 + (-1))).intValue())) == -1;
        int m10 = m(lineEnd2, lineStart2);
        int intValue = i18 == 0 ? 0 : ((Number) arrayList.get(i18 - 1)).intValue();
        int i20 = lineStart2 - intValue;
        int i21 = m10 - intValue;
        ArrayList arrayList2 = (ArrayList) this.f1818c;
        boolean[] zArr = (boolean[]) this.f1819d;
        if (zArr[i18]) {
            bidi = (Bidi) arrayList2.get(i18);
            i13 = lineForOffset;
            i12 = m10;
            i14 = -1;
        } else {
            int intValue2 = i18 == 0 ? 0 : ((Number) arrayList.get(i18 - 1)).intValue();
            int intValue3 = ((Number) arrayList.get(i18)).intValue();
            int i22 = intValue3 - intValue2;
            char[] cArr = (char[]) this.f1820e;
            i12 = m10;
            if (cArr == null || cArr.length < i22) {
                cArr = new char[i22];
            }
            i13 = lineForOffset;
            TextUtils.getChars(layout.getText(), intValue2, intValue3, cArr, 0);
            if (Bidi.requiresBidi(cArr, 0, i22)) {
                i14 = -1;
                Bidi bidi2 = new Bidi(cArr, 0, null, 0, i22, layout.getParagraphDirection(layout.getLineForOffset(i18 == 0 ? 0 : ((Number) arrayList.get(i18 + (-1))).intValue())) == -1 ? 1 : 0);
                z12 = true;
                if (bidi2.getRunCount() != 1) {
                    bidi = bidi2;
                    arrayList2.set(i18, bidi);
                    zArr[i18] = z12;
                    if (bidi != null) {
                        char[] cArr2 = (char[]) this.f1820e;
                        cArr = cArr == cArr2 ? null : cArr2;
                    }
                    this.f1820e = cArr;
                }
            } else {
                i14 = -1;
                z12 = true;
            }
            bidi = null;
            arrayList2.set(i18, bidi);
            zArr[i18] = z12;
            if (bidi != null) {
            }
            this.f1820e = cArr;
        }
        Bidi createLineBidi = bidi != null ? bidi.createLineBidi(i20, i21) : null;
        if (createLineBidi == null) {
            z13 = true;
        } else {
            if (createLineBidi.getRunCount() != 1) {
                int runCount = createLineBidi.getRunCount();
                i2.e[] eVarArr = new i2.e[runCount];
                for (int i23 = 0; i23 < runCount; i23++) {
                    eVarArr[i23] = new i2.e(createLineBidi.getRunStart(i23) + lineStart2, createLineBidi.getRunLimit(i23) + lineStart2, createLineBidi.getRunLevel(i23) % 2 == 1);
                }
                int runCount2 = createLineBidi.getRunCount();
                byte[] bArr = new byte[runCount2];
                for (int i24 = 0; i24 < runCount2; i24++) {
                    bArr[i24] = (byte) createLineBidi.getRunLevel(i24);
                }
                Bidi.reorderVisually(bArr, 0, eVarArr, 0, runCount);
                if (i15 == lineStart2) {
                    int i25 = 0;
                    while (true) {
                        if (i25 >= runCount) {
                            i25 = i14;
                            break;
                        }
                        if (eVarArr[i25].f3119a == i15) {
                            break;
                        }
                        i25++;
                    }
                    boolean z15 = (z10 || z14 == eVarArr[i25].f3121c) ? !z14 : z14;
                    if (i25 == 0 && z15) {
                        return layout.getLineLeft(i13);
                    }
                    return (i25 != runCount + (-1) || z15) ? z15 ? layout.getPrimaryHorizontal(eVarArr[i25 - 1].f3119a) : layout.getPrimaryHorizontal(eVarArr[i25 + 1].f3119a) : layout.getLineRight(i13);
                }
                int i26 = i13;
                if (i15 > i12) {
                    i15 = m(i15, lineStart2);
                }
                int i27 = 0;
                while (true) {
                    if (i27 >= runCount) {
                        i27 = i14;
                        break;
                    }
                    if (eVarArr[i27].f3120b == i15) {
                        break;
                    }
                    i27++;
                }
                boolean z16 = (z10 || z14 == eVarArr[i27].f3121c) ? z14 : !z14;
                return (i27 == 0 && z16) ? layout.getLineLeft(i26) : (i27 != runCount + (-1) || z16) ? z16 ? layout.getPrimaryHorizontal(eVarArr[i27 - 1].f3120b) : layout.getPrimaryHorizontal(eVarArr[i27 + 1].f3120b) : layout.getLineRight(i26);
            }
            z13 = true;
        }
        int i28 = i13;
        boolean isRtlCharAt = layout.isRtlCharAt(lineStart2);
        if (z10 || z14 == isRtlCharAt) {
            z14 = !z14 ? z13 : false;
        }
        if (i15 == lineStart2) {
            z13 = z14;
        } else if (z14) {
            z13 = false;
        }
        return z13 ? layout.getLineLeft(i28) : layout.getLineRight(i28);
    }

    public int m(int i10, int i11) {
        while (i10 > i11) {
            char charAt = ((Layout) this.f1816a).getText().charAt(i10 - 1);
            if (charAt != ' ' && charAt != '\n' && charAt != 5760 && ((pc.j.f(charAt, 8192) < 0 || pc.j.f(charAt, 8202) > 0 || charAt == 8199) && charAt != 8287 && charAt != 12288)) {
                return i10;
            }
            i10--;
        }
        return i10;
    }

    public void n(Object obj, String str) {
        dd.w wVar = cd.c.f1342b;
        pc.j.e(str, "key");
        ((LinkedHashMap) this.f1816a).put(str, obj);
        bd.p pVar = (bd.p) ((LinkedHashMap) this.f1818c).get(str);
        if (pVar != null) {
            ((bd.e0) pVar).h(null, obj == null ? wVar : obj);
        }
        bd.p pVar2 = (bd.p) ((LinkedHashMap) this.f1819d).get(str);
        if (pVar2 != null) {
            bd.e0 e0Var = (bd.e0) pVar2;
            if (obj == null) {
                obj = wVar;
            }
            e0Var.h(null, obj);
        }
    }

    public t(Layout layout) {
        this.f1816a = layout;
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        do {
            int r5 = xc.h.r(((Layout) this.f1816a).getText(), '\n', i10, 4);
            i10 = r5 < 0 ? ((Layout) this.f1816a).getText().length() : r5 + 1;
            arrayList.add(Integer.valueOf(i10));
        } while (i10 < ((Layout) this.f1816a).getText().length());
        this.f1817b = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i11 = 0; i11 < size; i11++) {
            arrayList2.add(null);
        }
        this.f1818c = arrayList2;
        this.f1819d = new boolean[((ArrayList) this.f1817b).size()];
        ((ArrayList) this.f1817b).size();
    }

    public t(l7.b bVar, l7.c cVar) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        Set<l7.j> set = bVar.f4215c;
        Set set2 = bVar.f4219g;
        for (l7.j jVar : set) {
            int i10 = jVar.f4238c;
            int i11 = jVar.f4237b;
            boolean z10 = i10 == 0;
            l7.r rVar = jVar.f4236a;
            if (z10) {
                if (i11 == 2) {
                    hashSet4.add(rVar);
                } else {
                    hashSet.add(rVar);
                }
            } else if (i10 == 2) {
                hashSet3.add(rVar);
            } else if (i11 == 2) {
                hashSet5.add(rVar);
            } else {
                hashSet2.add(rVar);
            }
        }
        if (!set2.isEmpty()) {
            hashSet.add(l7.r.a(t7.a.class));
        }
        this.f1816a = Collections.unmodifiableSet(hashSet);
        this.f1817b = Collections.unmodifiableSet(hashSet2);
        Collections.unmodifiableSet(hashSet3);
        this.f1818c = Collections.unmodifiableSet(hashSet4);
        this.f1819d = Collections.unmodifiableSet(hashSet5);
        this.f1820e = cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v19, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.util.ArrayList] */
    public t(h2.e eVar, h2.h0 h0Var, List list, s2.c cVar, k2.d dVar) {
        int i10;
        String str;
        List list2;
        ArrayList arrayList;
        ?? arrayList2;
        int i11;
        String str2;
        int i12;
        int i13;
        bc.v vVar;
        List list3;
        h2.e eVar2 = eVar;
        this.f1816a = eVar2;
        this.f1817b = list;
        final int i14 = 0;
        this.f1818c = bc.a0.x(new oc.a(this) { // from class: h2.l

            /* renamed from: h, reason: collision with root package name */
            public final /* synthetic */ d8.t f2684h;

            {
                this.f2684h = this;
            }

            @Override // oc.a
            public final Object invoke() {
                Object obj;
                Object obj2;
                switch (i14) {
                    case 0:
                        ArrayList arrayList3 = (ArrayList) this.f2684h.f1820e;
                        if (arrayList3.isEmpty()) {
                            obj = null;
                        } else {
                            Object obj3 = arrayList3.get(0);
                            float a6 = ((o) obj3).f2693a.a();
                            int K = bc.n.K(arrayList3);
                            int i15 = 1;
                            if (1 <= K) {
                                while (true) {
                                    Object obj4 = arrayList3.get(i15);
                                    float a8 = ((o) obj4).f2693a.a();
                                    if (Float.compare(a6, a8) < 0) {
                                        obj3 = obj4;
                                        a6 = a8;
                                    }
                                    if (i15 != K) {
                                        i15++;
                                    }
                                }
                            }
                            obj = obj3;
                        }
                        o oVar = (o) obj;
                        return Float.valueOf(oVar != null ? oVar.f2693a.a() : 0.0f);
                    default:
                        ArrayList arrayList4 = (ArrayList) this.f2684h.f1820e;
                        if (arrayList4.isEmpty()) {
                            obj2 = null;
                        } else {
                            Object obj5 = arrayList4.get(0);
                            float c3 = ((o) obj5).f2693a.f5161i.c();
                            int K2 = bc.n.K(arrayList4);
                            int i16 = 1;
                            if (1 <= K2) {
                                while (true) {
                                    Object obj6 = arrayList4.get(i16);
                                    float c7 = ((o) obj6).f2693a.f5161i.c();
                                    if (Float.compare(c3, c7) < 0) {
                                        obj5 = obj6;
                                        c3 = c7;
                                    }
                                    if (i16 != K2) {
                                        i16++;
                                    }
                                }
                            }
                            obj2 = obj5;
                        }
                        o oVar2 = (o) obj2;
                        return Float.valueOf(oVar2 != null ? oVar2.f2693a.f5161i.c() : 0.0f);
                }
            }
        });
        final int i15 = 1;
        this.f1819d = bc.a0.x(new oc.a(this) { // from class: h2.l

            /* renamed from: h, reason: collision with root package name */
            public final /* synthetic */ d8.t f2684h;

            {
                this.f2684h = this;
            }

            @Override // oc.a
            public final Object invoke() {
                Object obj;
                Object obj2;
                switch (i15) {
                    case 0:
                        ArrayList arrayList3 = (ArrayList) this.f2684h.f1820e;
                        if (arrayList3.isEmpty()) {
                            obj = null;
                        } else {
                            Object obj3 = arrayList3.get(0);
                            float a6 = ((o) obj3).f2693a.a();
                            int K = bc.n.K(arrayList3);
                            int i152 = 1;
                            if (1 <= K) {
                                while (true) {
                                    Object obj4 = arrayList3.get(i152);
                                    float a8 = ((o) obj4).f2693a.a();
                                    if (Float.compare(a6, a8) < 0) {
                                        obj3 = obj4;
                                        a6 = a8;
                                    }
                                    if (i152 != K) {
                                        i152++;
                                    }
                                }
                            }
                            obj = obj3;
                        }
                        o oVar = (o) obj;
                        return Float.valueOf(oVar != null ? oVar.f2693a.a() : 0.0f);
                    default:
                        ArrayList arrayList4 = (ArrayList) this.f2684h.f1820e;
                        if (arrayList4.isEmpty()) {
                            obj2 = null;
                        } else {
                            Object obj5 = arrayList4.get(0);
                            float c3 = ((o) obj5).f2693a.f5161i.c();
                            int K2 = bc.n.K(arrayList4);
                            int i16 = 1;
                            if (1 <= K2) {
                                while (true) {
                                    Object obj6 = arrayList4.get(i16);
                                    float c7 = ((o) obj6).f2693a.f5161i.c();
                                    if (Float.compare(c3, c7) < 0) {
                                        obj5 = obj6;
                                        c3 = c7;
                                    }
                                    if (i16 != K2) {
                                        i16++;
                                    }
                                }
                            }
                            obj2 = obj5;
                        }
                        o oVar2 = (o) obj2;
                        return Float.valueOf(oVar2 != null ? oVar2.f2693a.f5161i.c() : 0.0f);
                }
            }
        });
        h2.q qVar = h0Var.f2675b;
        int i16 = h2.f.f2657a;
        ArrayList arrayList3 = eVar2.f2650j;
        String str3 = eVar2.f2648h;
        bc.v vVar2 = bc.v.f1067g;
        List c02 = arrayList3 != null ? bc.m.c0(arrayList3, new h2.d(i15)) : vVar2;
        ArrayList arrayList4 = new ArrayList();
        bc.k kVar = new bc.k();
        int size = c02.size();
        int i17 = 0;
        int i18 = 0;
        while (i17 < size) {
            h2.c cVar2 = (h2.c) c02.get(i17);
            h2.q a6 = qVar.a((h2.q) cVar2.f2631a);
            int i19 = cVar2.f2632b;
            int i20 = cVar2.f2633c;
            if (i19 > i20) {
                m2.a.a("Reversed range is not supported");
            }
            while (i18 < i19 && !kVar.isEmpty()) {
                h2.c cVar3 = (h2.c) kVar.last();
                List list4 = c02;
                int i21 = cVar3.f2633c;
                bc.v vVar3 = vVar2;
                Object obj = cVar3.f2631a;
                if (i19 < i21) {
                    arrayList4.add(new h2.c(i18, i19, obj));
                    i18 = i19;
                    c02 = list4;
                    vVar2 = vVar3;
                } else {
                    int i22 = size;
                    arrayList4.add(new h2.c(i18, i21, obj));
                    i18 = cVar3.f2633c;
                    while (!kVar.isEmpty() && i18 == ((h2.c) kVar.last()).f2633c) {
                        kVar.removeLast();
                    }
                    c02 = list4;
                    vVar2 = vVar3;
                    size = i22;
                }
            }
            List list5 = c02;
            bc.v vVar4 = vVar2;
            int i23 = size;
            if (i18 < i19) {
                arrayList4.add(new h2.c(i18, i19, qVar));
                i18 = i19;
            }
            h2.c cVar4 = (h2.c) (kVar.isEmpty() ? null : kVar.f1062h[kVar.i(bc.n.K(kVar) + kVar.f1061g)]);
            if (cVar4 != null) {
                int i24 = cVar4.f2633c;
                Object obj2 = cVar4.f2631a;
                int i25 = cVar4.f2632b;
                if (i25 == i19 && i24 == i20) {
                    kVar.removeLast();
                    kVar.addLast(new h2.c(i19, i20, ((h2.q) obj2).a(a6)));
                } else if (i25 == i24) {
                    arrayList4.add(new h2.c(i25, i24, obj2));
                    kVar.removeLast();
                    kVar.addLast(new h2.c(i19, i20, a6));
                } else if (i24 >= i20) {
                    kVar.addLast(new h2.c(i19, i20, ((h2.q) obj2).a(a6)));
                } else {
                    throw new IllegalArgumentException();
                }
            } else {
                kVar.addLast(new h2.c(i19, i20, a6));
            }
            i17++;
            c02 = list5;
            vVar2 = vVar4;
            size = i23;
        }
        bc.v vVar5 = vVar2;
        while (i18 <= str3.length() && !kVar.isEmpty()) {
            h2.c cVar5 = (h2.c) kVar.last();
            Object obj3 = cVar5.f2631a;
            int i26 = cVar5.f2633c;
            arrayList4.add(new h2.c(i18, i26, obj3));
            while (!kVar.isEmpty() && i26 == ((h2.c) kVar.last()).f2633c) {
                kVar.removeLast();
            }
            i18 = i26;
        }
        if (i18 < str3.length()) {
            arrayList4.add(new h2.c(i18, str3.length(), qVar));
        }
        if (arrayList4.isEmpty()) {
            i10 = 0;
            arrayList4.add(new h2.c(0, 0, qVar));
        } else {
            i10 = 0;
        }
        ArrayList arrayList5 = new ArrayList(arrayList4.size());
        int size2 = arrayList4.size();
        int i27 = i10;
        while (i27 < size2) {
            h2.c cVar6 = (h2.c) arrayList4.get(i27);
            int i28 = cVar6.f2632b;
            int i29 = cVar6.f2633c;
            if (i28 != i29) {
                str = str3.substring(i28, i29);
                pc.j.d(str, "substring(...)");
            } else {
                str = "";
            }
            if (i28 == i29 || (list2 = eVar2.f2647g) == null) {
                arrayList = arrayList4;
                str2 = str3;
                i12 = size2;
                i13 = i27;
                vVar = null;
            } else {
                if (i28 == 0 && i29 >= str3.length()) {
                    arrayList2 = new ArrayList(list2.size());
                    int size3 = list2.size();
                    arrayList = arrayList4;
                    int i30 = 0;
                    while (i30 < size3) {
                        int i31 = size3;
                        Object obj4 = list2.get(i30);
                        int i32 = i30;
                        if (!(((h2.b) ((h2.c) obj4).f2631a) instanceof h2.q)) {
                            arrayList2.add(obj4);
                        }
                        i30 = i32 + 1;
                        size3 = i31;
                    }
                } else {
                    arrayList = arrayList4;
                    arrayList2 = new ArrayList(list2.size());
                    int size4 = list2.size();
                    int i33 = 0;
                    while (i33 < size4) {
                        int i34 = size4;
                        h2.c cVar7 = (h2.c) list2.get(i33);
                        int i35 = i33;
                        Object obj5 = cVar7.f2631a;
                        int i36 = cVar7.f2633c;
                        String str4 = str3;
                        int i37 = cVar7.f2632b;
                        int i38 = size2;
                        if ((((h2.b) obj5) instanceof h2.q) || !h2.f.a(i28, i29, i37, i36)) {
                            i11 = i27;
                        } else {
                            i11 = i27;
                            arrayList2.add(new h2.c((h2.b) cVar7.f2631a, uc.e.h(i37, i28, i29) - i28, uc.e.h(i36, i28, i29) - i28, cVar7.f2634d));
                        }
                        i33 = i35 + 1;
                        size4 = i34;
                        str3 = str4;
                        size2 = i38;
                        i27 = i11;
                    }
                }
                str2 = str3;
                i12 = size2;
                i13 = i27;
                vVar = arrayList2;
            }
            h2.e eVar3 = new h2.e(str, vVar == null ? vVar5 : vVar);
            h2.q qVar2 = (h2.q) cVar6.f2631a;
            h2.h0 h0Var2 = new h2.h0(h0Var.f2674a, qVar.a(qVar2.f2697b == Integer.MIN_VALUE ? new h2.q(qVar2.f2696a, qVar.f2697b, qVar2.f2698c, qVar2.f2699d, qVar2.f2700e, qVar2.f2701f, qVar2.f2702g, qVar2.f2703h, qVar2.f2704i) : qVar2));
            ?? r12 = eVar3.f2647g;
            bc.v vVar6 = r12 == 0 ? vVar5 : r12;
            List list6 = (List) this.f1817b;
            ArrayList arrayList6 = new ArrayList(list6.size());
            int size5 = list6.size();
            int i39 = 0;
            while (i39 < size5) {
                h2.c cVar8 = (h2.c) list6.get(i39);
                int i40 = cVar8.f2632b;
                int i41 = cVar8.f2633c;
                if (h2.f.a(i28, i29, i40, i41)) {
                    if (i28 > i40 || i41 > i29) {
                        m2.a.a("placeholder can not overlap with paragraph.");
                    }
                    list3 = list6;
                    arrayList6.add(new h2.c(i40 - i28, i41 - i28, cVar8.f2631a));
                } else {
                    list3 = list6;
                }
                i39++;
                list6 = list3;
            }
            arrayList5.add(new h2.o(new o2.d(str, h0Var2, vVar6, arrayList6, dVar, cVar), i28, i29));
            i27 = i13 + 1;
            eVar2 = eVar;
            arrayList4 = arrayList;
            str3 = str2;
            size2 = i12;
        }
        this.f1820e = arrayList5;
    }

    public t(List list) {
        pc.j.e(list, "items");
        if (list.size() >= 1) {
            w0.q qVar = new w0.q();
            qVar.addAll(list);
            this.f1816a = qVar;
            this.f1817b = new l1(l5.b.f4162j, z0.f4841i);
            this.f1818c = m0.z.n(new l5.a(this, 2));
            this.f1819d = m0.z.n(new l5.a(this, 3));
            m0.z.n(new l5.a(this, 4));
            m0.z.n(new l5.a(this, 1));
            this.f1820e = m0.z.n(new l5.a(this, 0));
            return;
        }
        throw new IllegalArgumentException(("Stack size " + list.size() + " is less than the min size 1").toString());
    }

    public t(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.f1819d = new ArrayDeque();
        this.f1816a = sharedPreferences;
        this.f1817b = "topic_operation_queue";
        this.f1818c = ",";
        this.f1820e = scheduledThreadPoolExecutor;
    }
}
