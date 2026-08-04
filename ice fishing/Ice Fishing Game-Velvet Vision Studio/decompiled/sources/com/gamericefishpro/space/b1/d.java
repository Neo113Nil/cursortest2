package com.gamericefishpro.space.b1;

import android.content.SharedPreferences;
import android.text.Layout;
import android.text.TextUtils;
import android.util.Log;
import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.bb.v;
import com.gamericefishpro.space.d0.q0;
import com.gamericefishpro.space.d0.w;
import com.gamericefishpro.space.ei.b0;
import com.gamericefishpro.space.ei.y;
import com.gamericefishpro.space.ph.g0;
import com.gamericefishpro.space.ph.m0;
import com.gamericefishpro.space.ph.r;
import com.gamericefishpro.space.ph.x;
import com.gamericefishpro.space.r2.i0;
import com.gamericefishpro.space.si.n0;
import com.gamericefishpro.space.si.z;
import com.gamericefishpro.space.t.d0;
import com.gamericefishpro.space.t0.y0;
import com.gamericefishpro.space.u6.s;
import com.gamericefishpro.space.w.m1;
import java.text.Bidi;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements com.gamericefishpro.space.bb.c, com.gamericefishpro.space.e8.b, com.gamericefishpro.space.r2.o {
    public Object d;
    public Object e;
    public final Object i;
    public Object v;
    public Object w;

    public d(com.gamericefishpro.space.a5.b onProgress, w onFileChooser, com.gamericefishpro.space.l7.a onCreateWindow, q0 onCloseWindow, m1 onConsoleMessage) {
        Intrinsics.checkNotNullParameter(onProgress, "onProgress");
        Intrinsics.checkNotNullParameter(onFileChooser, "onFileChooser");
        Intrinsics.checkNotNullParameter(onCreateWindow, "onCreateWindow");
        Intrinsics.checkNotNullParameter(onCloseWindow, "onCloseWindow");
        Intrinsics.checkNotNullParameter(onConsoleMessage, "onConsoleMessage");
        this.d = onProgress;
        this.e = onFileChooser;
        this.i = onCreateWindow;
        this.v = onCloseWindow;
        this.w = onConsoleMessage;
    }

    public static d l(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        d dVar = new d(sharedPreferences, scheduledThreadPoolExecutor);
        synchronized (((ArrayDeque) dVar.v)) {
            try {
                ((ArrayDeque) dVar.v).clear();
                String string = ((SharedPreferences) dVar.d).getString((String) dVar.e, "");
                if (!TextUtils.isEmpty(string) && string.contains((String) dVar.i)) {
                    String[] strArrSplit = string.split((String) dVar.i, -1);
                    if (strArrSplit.length == 0) {
                        Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                    }
                    for (String str : strArrSplit) {
                        if (!TextUtils.isEmpty(str)) {
                            ((ArrayDeque) dVar.v).add(str);
                        }
                    }
                    return dVar;
                }
                return dVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.gamericefishpro.space.oh.h, java.lang.Object] */
    @Override // com.gamericefishpro.space.r2.o
    public float a() {
        return ((Number) this.d.getValue()).floatValue();
    }

    @Override // com.gamericefishpro.space.bb.c
    public Object b(Class cls) {
        if (!((Set) this.d).contains(v.a(cls))) {
            throw new com.gamericefishpro.space.bb.n("Attempting to request an undeclared dependency " + cls + ".");
        }
        Object objB = ((com.gamericefishpro.space.bb.c) this.w).b(cls);
        if (!cls.equals(com.gamericefishpro.space.kb.b.class)) {
            return objB;
        }
        return new com.gamericefishpro.space.bb.w();
    }

    @Override // com.gamericefishpro.space.r2.o
    public boolean c() {
        ArrayList arrayList = (ArrayList) this.w;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((com.gamericefishpro.space.r2.n) arrayList.get(i)).a.c()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.gamericefishpro.space.bb.c
    public com.gamericefishpro.space.nb.a d(v vVar) {
        if (((Set) this.e).contains(vVar)) {
            return ((com.gamericefishpro.space.bb.c) this.w).d(vVar);
        }
        throw new com.gamericefishpro.space.bb.n("Attempting to request an undeclared dependency Provider<" + vVar + ">.");
    }

    @Override // com.gamericefishpro.space.bb.c
    public com.gamericefishpro.space.nb.a e(Class cls) {
        return d(v.a(cls));
    }

    @Override // com.gamericefishpro.space.bb.c
    public Object f(v vVar) {
        if (((Set) this.d).contains(vVar)) {
            return ((com.gamericefishpro.space.bb.c) this.w).f(vVar);
        }
        throw new com.gamericefishpro.space.bb.n("Attempting to request an undeclared dependency " + vVar + ".");
    }

    @Override // com.gamericefishpro.space.bb.c
    public com.gamericefishpro.space.nb.a g(v vVar) {
        if (((Set) this.v).contains(vVar)) {
            return ((com.gamericefishpro.space.bb.c) this.w).g(vVar);
        }
        throw new com.gamericefishpro.space.bb.n("Attempting to request an undeclared dependency Provider<Set<" + vVar + ">>.");
    }

    @Override // com.gamericefishpro.space.nh.a
    public Object get() {
        return new com.gamericefishpro.space.h8.b((Executor) ((com.gamericefishpro.space.nh.a) this.d).get(), (com.gamericefishpro.space.d8.d) ((com.gamericefishpro.space.nh.a) this.e).get(), (com.gamericefishpro.space.a8.c) ((com.gamericefishpro.space.a8.c) this.i).get(), (com.gamericefishpro.space.j8.d) ((com.gamericefishpro.space.nh.a) this.v).get(), (com.gamericefishpro.space.k8.c) ((com.gamericefishpro.space.nh.a) this.w).get());
    }

    @Override // com.gamericefishpro.space.bb.c
    public Set h(v vVar) {
        if (((Set) this.i).contains(vVar)) {
            return ((com.gamericefishpro.space.bb.c) this.w).h(vVar);
        }
        throw new com.gamericefishpro.space.bb.n("Attempting to request an undeclared dependency Set<" + vVar + ">.");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.gamericefishpro.space.oh.h, java.lang.Object] */
    @Override // com.gamericefishpro.space.r2.o
    public float i() {
        return ((Number) this.v.getValue()).floatValue();
    }

    public com.gamericefishpro.space.t0.g j(c cVar, Function0 function0) {
        int i;
        int i2;
        int i3;
        y yVar = new y();
        yVar.d = -1;
        synchronized (this.d) {
            Throwable th = (Throwable) this.e;
            if (th != null) {
                cVar.b(th);
                return com.gamericefishpro.space.t0.f.e;
            }
            a aVar = (a) this.i;
            do {
                i = aVar.get();
                i2 = i + 1;
            } while (!aVar.compareAndSet(i, i2));
            int i4 = 0;
            boolean z = (134217727 & i2) == 1;
            yVar.d = (i2 >>> 27) & 15;
            ((d0) this.v).a(cVar);
            if (z && function0 != null) {
                try {
                    function0.invoke();
                } catch (Throwable th2) {
                    synchronized (this.d) {
                        try {
                            if (((Throwable) this.e) == null) {
                                this.e = th2;
                                d0 d0Var = (d0) this.v;
                                Object[] objArr = d0Var.a;
                                int i5 = d0Var.b;
                                for (int i6 = 0; i6 < i5; i6++) {
                                    ((c) objArr[i6]).b(th2);
                                }
                                ((d0) this.v).d();
                                a aVar2 = (a) this.i;
                                do {
                                    i3 = aVar2.get();
                                } while (!aVar2.compareAndSet(i3, ((((i3 >>> 27) & 15) + 1) & 15) << 27));
                                Unit unit = Unit.a;
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                }
            }
            return new s(new b(cVar, this, yVar, i4));
        }
    }

    public void k() {
        ((com.gamericefishpro.space.g1.b) this.d).i("Create eager instances ...");
        com.gamericefishpro.space.ni.h.a.getClass();
        com.gamericefishpro.space.ni.f.a.getClass();
        long jA = com.gamericefishpro.space.ni.f.a();
        com.gamericefishpro.space.a8.c cVar = (com.gamericefishpro.space.a8.c) this.v;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) cVar.v;
        int i = 0;
        com.gamericefishpro.space.hj.d[] dVarArr = (com.gamericefishpro.space.hj.d[]) concurrentHashMap.values().toArray(new com.gamericefishpro.space.hj.d[0]);
        ArrayList arrayListD = x.d(Arrays.copyOf(dVarArr, dVarArr.length));
        concurrentHashMap.clear();
        d dVar = (d) cVar.e;
        d dVar2 = new d((com.gamericefishpro.space.g1.b) dVar.d, ((com.gamericefishpro.space.nj.a) dVar.i).d, b0.a(com.gamericefishpro.space.hj.c.class), null);
        int size = arrayListD.size();
        while (i < size) {
            Object obj = arrayListD.get(i);
            i++;
            ((com.gamericefishpro.space.hj.d) obj).b(dVar2);
        }
        long jA2 = com.gamericefishpro.space.ni.g.a(jA);
        com.gamericefishpro.space.g1.b bVar = (com.gamericefishpro.space.g1.b) this.d;
        StringBuilder sb = new StringBuilder("Created eager instances in ");
        com.gamericefishpro.space.ni.a aVar = com.gamericefishpro.space.ni.b.d;
        sb.append(com.gamericefishpro.space.ni.b.e(jA2, com.gamericefishpro.space.ni.d.MICROSECONDS) / 1000.0d);
        sb.append(" ms");
        bVar.i(sb.toString());
    }

    public void m(Function1 function1) {
        int i;
        synchronized (this.d) {
            try {
                d0 d0Var = (d0) this.v;
                this.v = (d0) this.w;
                this.w = d0Var;
                a aVar = (a) this.i;
                do {
                    i = aVar.get();
                } while (!aVar.compareAndSet(i, ((((i >>> 27) & 15) + 1) & 15) << 27));
                int i2 = d0Var.b;
                for (int i3 = 0; i3 < i2; i3++) {
                    function1.invoke(d0Var.f(i3));
                }
                d0Var.d();
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public float n(int i, boolean z) {
        Layout layout = (Layout) this.d;
        int lineEnd = layout.getLineEnd(layout.getLineForOffset(i));
        if (i > lineEnd) {
            i = lineEnd;
        }
        return z ? layout.getPrimaryHorizontal(i) : layout.getSecondaryHorizontal(i);
    }

    /* JADX WARN: Code duplicated, block: B:88:0x0187  */
    /* JADX WARN: Code duplicated, block: B:90:0x018d  */
    /* JADX WARN: Code duplicated, block: B:91:0x0190  */
    public float o(int i, boolean z, boolean z2) {
        int lineForOffset;
        int i2;
        int i3;
        boolean z3;
        Bidi bidi;
        char[] cArr;
        boolean z4;
        int i4;
        int i5;
        int iP = i;
        ArrayList arrayList = (ArrayList) this.e;
        Layout layout = (Layout) this.d;
        if (!z2) {
            return n(i, z);
        }
        if (iP <= 0) {
            lineForOffset = 0;
        } else {
            if (iP >= layout.getText().length()) {
                lineForOffset = layout.getLineCount();
            } else {
                lineForOffset = layout.getLineForOffset(iP);
                int lineStart = layout.getLineStart(lineForOffset);
                int lineEnd = layout.getLineEnd(lineForOffset);
                if (lineStart == iP || lineEnd == iP) {
                    if (lineStart == iP) {
                        if (z2) {
                        }
                    } else if (!z2) {
                        lineForOffset++;
                    }
                }
            }
            lineForOffset--;
        }
        int lineStart2 = layout.getLineStart(lineForOffset);
        int lineEnd2 = layout.getLineEnd(lineForOffset);
        if (iP != lineStart2 && iP != lineEnd2) {
            return n(i, z);
        }
        if (iP == 0 || iP == layout.getText().length()) {
            return n(i, z);
        }
        Integer numValueOf = Integer.valueOf(iP);
        int size = arrayList.size();
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        int size2 = arrayList.size();
        if (size < 0) {
            throw new IllegalArgumentException(y0.f(size, "fromIndex (0) is greater than toIndex (", ")."));
        }
        if (size > size2) {
            throw new IndexOutOfBoundsException("toIndex (" + size + ") is greater than size (" + size2 + ").");
        }
        int i6 = size - 1;
        int i7 = 0;
        while (true) {
            if (i7 > i6) {
                i2 = -(i7 + 1);
                break;
            }
            i2 = (i7 + i6) >>> 1;
            int iA = com.gamericefishpro.space.rh.a.a((Comparable) arrayList.get(i2), numValueOf);
            if (iA >= 0) {
                if (iA <= 0) {
                    break;
                }
                i6 = i2 - 1;
            } else {
                i7 = i2 + 1;
            }
        }
        int i8 = i2 < 0 ? -(i2 + 1) : i2 + 1;
        if (z2 && i8 > 0) {
            int i9 = i8 - 1;
            if (iP == ((Number) arrayList.get(i9)).intValue()) {
                i8 = i9;
            }
        }
        boolean z5 = layout.getParagraphDirection(layout.getLineForOffset(i8 == 0 ? 0 : ((Number) arrayList.get(i8 + (-1))).intValue())) == -1;
        int iP2 = p(lineEnd2, lineStart2);
        int iIntValue = i8 == 0 ? 0 : ((Number) arrayList.get(i8 - 1)).intValue();
        int i10 = lineStart2 - iIntValue;
        int i11 = iP2 - iIntValue;
        ArrayList arrayList2 = (ArrayList) this.i;
        boolean[] zArr = (boolean[]) this.v;
        if (zArr[i8]) {
            bidi = (Bidi) arrayList2.get(i8);
            i3 = -1;
        } else {
            int iIntValue2 = i8 == 0 ? 0 : ((Number) arrayList.get(i8 - 1)).intValue();
            int iIntValue3 = ((Number) arrayList.get(i8)).intValue();
            int i12 = iIntValue3 - iIntValue2;
            char[] cArr2 = (char[]) this.w;
            if (cArr2 == null || cArr2.length < i12) {
                cArr2 = new char[i12];
            }
            TextUtils.getChars(layout.getText(), iIntValue2, iIntValue3, cArr2, 0);
            if (Bidi.requiresBidi(cArr2, 0, i12)) {
                i3 = -1;
                Bidi bidi2 = new Bidi(cArr2, 0, null, 0, i12, layout.getParagraphDirection(layout.getLineForOffset(i8 == 0 ? 0 : ((Number) arrayList.get(i8 + (-1))).intValue())) == -1 ? 1 : 0);
                z3 = true;
                if (bidi2.getRunCount() != 1) {
                    bidi = bidi2;
                }
                arrayList2.set(i8, bidi);
                zArr[i8] = z3;
                if (bidi != null) {
                    cArr = (char[]) this.w;
                    if (cArr2 == cArr) {
                        cArr2 = null;
                    } else {
                        cArr2 = cArr;
                    }
                }
                this.w = cArr2;
            } else {
                i3 = -1;
                z3 = true;
            }
            bidi = null;
            arrayList2.set(i8, bidi);
            zArr[i8] = z3;
            if (bidi != null) {
                cArr = (char[]) this.w;
                if (cArr2 == cArr) {
                    cArr2 = null;
                } else {
                    cArr2 = cArr;
                }
            }
            this.w = cArr2;
        }
        Bidi bidiCreateLineBidi = bidi != null ? bidi.createLineBidi(i10, i11) : null;
        if (bidiCreateLineBidi == null) {
            z4 = true;
        } else {
            if (bidiCreateLineBidi.getRunCount() != 1) {
                int runCount = bidiCreateLineBidi.getRunCount();
                com.gamericefishpro.space.s2.c[] cVarArr = new com.gamericefishpro.space.s2.c[runCount];
                for (int i13 = 0; i13 < runCount; i13++) {
                    cVarArr[i13] = new com.gamericefishpro.space.s2.c(bidiCreateLineBidi.getRunStart(i13) + lineStart2, bidiCreateLineBidi.getRunLimit(i13) + lineStart2, bidiCreateLineBidi.getRunLevel(i13) % 2 == 1);
                }
                int runCount2 = bidiCreateLineBidi.getRunCount();
                byte[] bArr = new byte[runCount2];
                for (int i14 = 0; i14 < runCount2; i14++) {
                    bArr[i14] = (byte) bidiCreateLineBidi.getRunLevel(i14);
                }
                boolean z6 = false;
                Bidi.reorderVisually(bArr, 0, cVarArr, 0, runCount);
                if (iP == lineStart2) {
                    int i15 = 0;
                    while (true) {
                        if (i15 >= runCount) {
                            i5 = i3;
                            break;
                        }
                        if (cVarArr[i15].a == iP) {
                            i5 = i15;
                            break;
                        }
                        i15++;
                    }
                    com.gamericefishpro.space.s2.c cVar = cVarArr[i5];
                    if (!z && z5 != cVar.c) {
                        z6 = z5;
                    } else if (!z5) {
                        z6 = true;
                    }
                    if (i5 == 0 && z6) {
                        return layout.getLineLeft(lineForOffset);
                    }
                    int i16 = lineForOffset;
                    Intrinsics.checkNotNullParameter(cVarArr, "<this>");
                    if (i5 != runCount - 1 || z6) {
                        return z6 ? layout.getPrimaryHorizontal(cVarArr[i5 - 1].a) : layout.getPrimaryHorizontal(cVarArr[i5 + 1].a);
                    }
                    return layout.getLineRight(i16);
                }
                int i17 = lineForOffset;
                if (iP > iP2) {
                    iP = p(iP, lineStart2);
                }
                int i18 = 0;
                while (true) {
                    if (i18 >= runCount) {
                        i4 = i3;
                        break;
                    }
                    if (cVarArr[i18].b == iP) {
                        i4 = i18;
                        break;
                    }
                    i18++;
                }
                com.gamericefishpro.space.s2.c cVar2 = cVarArr[i4];
                if (z || z5 == cVar2.c) {
                    z6 = z5;
                } else if (!z5) {
                    z6 = true;
                }
                if (i4 == 0 && z6) {
                    return layout.getLineLeft(i17);
                }
                Intrinsics.checkNotNullParameter(cVarArr, "<this>");
                if (i4 != runCount - 1 || z6) {
                    return z6 ? layout.getPrimaryHorizontal(cVarArr[i4 - 1].b) : layout.getPrimaryHorizontal(cVarArr[i4 + 1].b);
                }
                return layout.getLineRight(i17);
            }
            z4 = true;
        }
        int i19 = lineForOffset;
        boolean zIsRtlCharAt = layout.isRtlCharAt(lineStart2);
        if (z || z5 == zIsRtlCharAt) {
            z5 = !z5 ? z4 : false;
        }
        return iP == lineStart2 ? z5 : !z5 ? z4 : false ? layout.getLineLeft(i19) : layout.getLineRight(i19);
    }

    public int p(int i, int i2) {
        while (i > i2) {
            char cCharAt = ((Layout) this.d).getText().charAt(i - 1);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != 5760 && ((Intrinsics.d(cCharAt, 8192) < 0 || Intrinsics.d(cCharAt, 8202) > 0 || cCharAt == 8199) && cCharAt != 8287 && cCharAt != 12288)) {
                return i;
            }
            i--;
        }
        return i;
    }

    public void q(List modules, boolean z) throws com.gamericefishpro.space.f1.h {
        com.gamericefishpro.space.a8.c cVar;
        Iterator it;
        Object next;
        Intrinsics.checkNotNullParameter(modules, "modules");
        Intrinsics.checkNotNullParameter(modules, "modules");
        LinkedHashSet modules2 = new LinkedHashSet();
        r rVar = new r(com.gamericefishpro.space.ph.d0.o(modules));
        while (!rVar.isEmpty()) {
            com.gamericefishpro.space.jj.a aVar = (com.gamericefishpro.space.jj.a) rVar.removeLast();
            if (modules2.add(aVar)) {
                ArrayList arrayList = aVar.e;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    com.gamericefishpro.space.jj.a aVar2 = (com.gamericefishpro.space.jj.a) obj;
                    if (!modules2.contains(aVar2)) {
                        rVar.addLast(aVar2);
                    }
                }
            }
        }
        com.gamericefishpro.space.a8.c cVar2 = (com.gamericefishpro.space.a8.c) this.v;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) cVar2.v;
        Intrinsics.checkNotNullParameter(modules2, "modules");
        Iterator it2 = modules2.iterator();
        while (it2.hasNext()) {
            com.gamericefishpro.space.jj.a aVar3 = (com.gamericefishpro.space.jj.a) it2.next();
            for (Map.Entry entry : aVar3.c.entrySet()) {
                String mapping = (String) entry.getKey();
                com.gamericefishpro.space.hj.b factory = (com.gamericefishpro.space.hj.b) entry.getValue();
                d dVar = (d) cVar2.e;
                Intrinsics.checkNotNullParameter(mapping, "mapping");
                Intrinsics.checkNotNullParameter(factory, "factory");
                ConcurrentHashMap concurrentHashMap2 = (ConcurrentHashMap) cVar2.i;
                if (((com.gamericefishpro.space.hj.b) concurrentHashMap2.get(mapping)) == null) {
                    cVar = cVar2;
                    it = it2;
                } else {
                    if (!z) {
                        Intrinsics.checkNotNullParameter(factory, "factory");
                        Intrinsics.checkNotNullParameter(mapping, "mapping");
                        String msg = "Already existing definition for " + factory.a + " at " + mapping;
                        Intrinsics.checkNotNullParameter(msg, "msg");
                        throw new com.gamericefishpro.space.f1.h(msg);
                    }
                    com.gamericefishpro.space.g1.b bVar = (com.gamericefishpro.space.g1.b) dVar.d;
                    StringBuilder sbL = com.gamericefishpro.space.m5.a.l("(+) override index '", mapping, "' -> '");
                    cVar = cVar2;
                    com.gamericefishpro.space.fj.a aVar4 = factory.a;
                    sbL.append(aVar4);
                    it = it2;
                    sbL.append('\'');
                    String msg2 = sbL.toString();
                    bVar.getClass();
                    Intrinsics.checkNotNullParameter(msg2, "msg");
                    bVar.m(com.gamericefishpro.space.ij.a.i, msg2);
                    Iterator it3 = concurrentHashMap.values().iterator();
                    do {
                        if (!it3.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it3.next();
                    } while (!((com.gamericefishpro.space.hj.d) next).a.equals(aVar4));
                    if (((com.gamericefishpro.space.hj.d) next) != null) {
                        concurrentHashMap.remove(Integer.valueOf(aVar4.hashCode()));
                    }
                }
                com.gamericefishpro.space.g1.b bVar2 = (com.gamericefishpro.space.g1.b) dVar.d;
                StringBuilder sbL2 = com.gamericefishpro.space.m5.a.l("(+) index '", mapping, "' -> '");
                sbL2.append(factory.a);
                sbL2.append('\'');
                bVar2.i(sbL2.toString());
                concurrentHashMap2.put(mapping, factory);
                cVar2 = cVar;
                it2 = it;
            }
            com.gamericefishpro.space.a8.c cVar3 = cVar2;
            Iterator it4 = it2;
            for (com.gamericefishpro.space.hj.d dVar2 : aVar3.b) {
                concurrentHashMap.put(Integer.valueOf(dVar2.a.hashCode()), dVar2);
            }
            cVar2 = cVar3;
            it2 = it4;
        }
        com.gamericefishpro.space.nj.a aVar5 = (com.gamericefishpro.space.nj.a) this.i;
        aVar5.getClass();
        Intrinsics.checkNotNullParameter(modules2, "modules");
        Iterator it5 = modules2.iterator();
        while (it5.hasNext()) {
            aVar5.b.addAll(((com.gamericefishpro.space.jj.a) it5.next()).d);
        }
    }

    public void r(Object obj, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        ((LinkedHashMap) this.d).put(key, obj);
        z zVar = (z) ((LinkedHashMap) this.i).get(key);
        if (zVar != null) {
            ((n0) zVar).i(obj);
        }
        z zVar2 = (z) ((LinkedHashMap) this.v).get(key);
        if (zVar2 != null) {
            ((n0) zVar2).i(obj);
        }
    }

    public d(Map initialState) {
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        this.d = m0.i(initialState);
        this.e = new LinkedHashMap();
        this.i = new LinkedHashMap();
        this.v = new LinkedHashMap();
        this.w = new com.gamericefishpro.space.b5.a(0, this);
    }

    public d(com.gamericefishpro.space.nh.a aVar, com.gamericefishpro.space.nh.a aVar2, com.gamericefishpro.space.a8.c cVar, com.gamericefishpro.space.nh.a aVar3, com.gamericefishpro.space.nh.a aVar4) {
        this.d = aVar;
        this.e = aVar2;
        this.i = cVar;
        this.v = aVar3;
        this.w = aVar4;
    }

    public d(com.gamericefishpro.space.g1.b logger, com.gamericefishpro.space.pj.a scope, com.gamericefishpro.space.ei.g clazz, com.gamericefishpro.space.lj.a aVar) {
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        this.d = logger;
        this.e = scope;
        this.i = clazz;
        this.v = aVar;
        this.w = "t:'" + com.gamericefishpro.space.qj.a.a(clazz) + "' - q:'null'";
    }

    public d(int i) {
        switch (i) {
            case 3:
                this.d = new com.gamericefishpro.space.bj.a(com.gamericefishpro.space.ij.a.w, 1);
                Intrinsics.checkNotNullParameter(this, "_koin");
                com.gamericefishpro.space.u6.l lVar = new com.gamericefishpro.space.u6.l();
                lVar.d = this;
                lVar.e = new ArrayList();
                this.e = lVar;
                this.i = new com.gamericefishpro.space.nj.a(this);
                this.v = new com.gamericefishpro.space.a8.c(this);
                Intrinsics.checkNotNullParameter(this, "_koin");
                new ConcurrentHashMap();
                Intrinsics.checkNotNullParameter(this, "_koin");
                new HashMap();
                this.w = new com.gamericefishpro.space.l6.f(1);
                break;
            default:
                this.d = new Object();
                this.i = new a(0);
                this.v = new d0();
                this.w = new d0();
                break;
        }
    }

    public d(Layout layout) {
        this.d = layout;
        ArrayList arrayList = new ArrayList();
        int length = 0;
        do {
            int iT = StringsKt.t(((Layout) this.d).getText(), '\n', length, 4);
            length = iT < 0 ? ((Layout) this.d).getText().length() : iT + 1;
            arrayList.add(Integer.valueOf(length));
        } while (length < ((Layout) this.d).getText().length());
        this.e = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList2.add(null);
        }
        this.i = arrayList2;
        this.v = new boolean[((ArrayList) this.e).size()];
        ((ArrayList) this.e).size();
    }

    public d(com.gamericefishpro.space.bb.b bVar, com.gamericefishpro.space.bb.c cVar) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        Set<com.gamericefishpro.space.bb.l> set = bVar.c;
        Set set2 = bVar.g;
        for (com.gamericefishpro.space.bb.l lVar : set) {
            int i = lVar.c;
            int i2 = lVar.b;
            boolean z = i == 0;
            v vVar = lVar.a;
            if (z) {
                if (i2 == 2) {
                    hashSet4.add(vVar);
                } else {
                    hashSet.add(vVar);
                }
            } else if (i == 2) {
                hashSet3.add(vVar);
            } else if (i2 == 2) {
                hashSet5.add(vVar);
            } else {
                hashSet2.add(vVar);
            }
        }
        if (!set2.isEmpty()) {
            hashSet.add(v.a(com.gamericefishpro.space.kb.b.class));
        }
        this.d = Collections.unmodifiableSet(hashSet);
        this.e = Collections.unmodifiableSet(hashSet2);
        Collections.unmodifiableSet(hashSet3);
        this.i = Collections.unmodifiableSet(hashSet4);
        this.v = Collections.unmodifiableSet(hashSet5);
        this.w = cVar;
    }

    public d(com.gamericefishpro.space.r2.e eVar, i0 i0Var, List list, com.gamericefishpro.space.c3.c cVar, com.gamericefishpro.space.u2.d dVar) {
        int i;
        String strSubstring;
        List list2;
        com.gamericefishpro.space.r2.e eVar2 = eVar;
        i0 i0Var2 = i0Var;
        this.e = eVar2;
        this.i = list;
        com.gamericefishpro.space.oh.j jVar = com.gamericefishpro.space.oh.j.e;
        final int i2 = 0;
        this.d = com.gamericefishpro.space.oh.i.a(jVar, new Function0(this) { // from class: com.gamericefishpro.space.r2.l
            public final /* synthetic */ com.gamericefishpro.space.b1.d e;

            {
                this.e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Object obj;
                Object obj2;
                switch (i2) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        ArrayList arrayList = (ArrayList) this.e.w;
                        if (arrayList.isEmpty()) {
                            obj = null;
                        } else {
                            Object obj3 = arrayList.get(0);
                            float fA = ((n) obj3).a.a();
                            int iE = com.gamericefishpro.space.ph.x.e(arrayList);
                            int i3 = 1;
                            if (1 <= iE) {
                                while (true) {
                                    Object obj4 = arrayList.get(i3);
                                    float fA2 = ((n) obj4).a.a();
                                    if (Float.compare(fA, fA2) < 0) {
                                        obj3 = obj4;
                                        fA = fA2;
                                    }
                                    if (i3 != iE) {
                                        i3++;
                                    }
                                }
                            }
                            obj = obj3;
                        }
                        n nVar = (n) obj;
                        return Float.valueOf(nVar != null ? nVar.a.a() : 0.0f);
                    default:
                        ArrayList arrayList2 = (ArrayList) this.e.w;
                        if (arrayList2.isEmpty()) {
                            obj2 = null;
                        } else {
                            Object obj5 = arrayList2.get(0);
                            float fC = ((n) obj5).a.B.c();
                            int iE2 = com.gamericefishpro.space.ph.x.e(arrayList2);
                            int i4 = 1;
                            if (1 <= iE2) {
                                while (true) {
                                    Object obj6 = arrayList2.get(i4);
                                    float fC2 = ((n) obj6).a.B.c();
                                    if (Float.compare(fC, fC2) < 0) {
                                        obj5 = obj6;
                                        fC = fC2;
                                    }
                                    if (i4 != iE2) {
                                        i4++;
                                    }
                                }
                            }
                            obj2 = obj5;
                        }
                        n nVar2 = (n) obj2;
                        return Float.valueOf(nVar2 != null ? nVar2.a.B.c() : 0.0f);
                }
            }
        });
        final int i3 = 1;
        this.v = com.gamericefishpro.space.oh.i.a(jVar, new Function0(this) { // from class: com.gamericefishpro.space.r2.l
            public final /* synthetic */ com.gamericefishpro.space.b1.d e;

            {
                this.e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Object obj;
                Object obj2;
                switch (i3) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        ArrayList arrayList = (ArrayList) this.e.w;
                        if (arrayList.isEmpty()) {
                            obj = null;
                        } else {
                            Object obj3 = arrayList.get(0);
                            float fA = ((n) obj3).a.a();
                            int iE = com.gamericefishpro.space.ph.x.e(arrayList);
                            int i4 = 1;
                            if (1 <= iE) {
                                while (true) {
                                    Object obj4 = arrayList.get(i4);
                                    float fA2 = ((n) obj4).a.a();
                                    if (Float.compare(fA, fA2) < 0) {
                                        obj3 = obj4;
                                        fA = fA2;
                                    }
                                    if (i4 != iE) {
                                        i4++;
                                    }
                                }
                            }
                            obj = obj3;
                        }
                        n nVar = (n) obj;
                        return Float.valueOf(nVar != null ? nVar.a.a() : 0.0f);
                    default:
                        ArrayList arrayList2 = (ArrayList) this.e.w;
                        if (arrayList2.isEmpty()) {
                            obj2 = null;
                        } else {
                            Object obj5 = arrayList2.get(0);
                            float fC = ((n) obj5).a.B.c();
                            int iE2 = com.gamericefishpro.space.ph.x.e(arrayList2);
                            int i5 = 1;
                            if (1 <= iE2) {
                                while (true) {
                                    Object obj6 = arrayList2.get(i5);
                                    float fC2 = ((n) obj6).a.B.c();
                                    if (Float.compare(fC, fC2) < 0) {
                                        obj5 = obj6;
                                        fC = fC2;
                                    }
                                    if (i5 != iE2) {
                                        i5++;
                                    }
                                }
                            }
                            obj2 = obj5;
                        }
                        n nVar2 = (n) obj2;
                        return Float.valueOf(nVar2 != null ? nVar2.a.B.c() : 0.0f);
                }
            }
        });
        com.gamericefishpro.space.r2.p pVar = i0Var2.b;
        int i4 = com.gamericefishpro.space.r2.f.a;
        ArrayList arrayList = eVar2.v;
        String str = eVar2.e;
        List listI = (arrayList == null || (listI = CollectionsKt.I(arrayList, new com.gamericefishpro.space.r2.d(1))) == null) ? g0.d : listI;
        ArrayList arrayList2 = new ArrayList();
        r rVar = new r();
        int size = listI.size();
        int i5 = 0;
        int i6 = 0;
        while (i5 < size) {
            com.gamericefishpro.space.r2.c cVar2 = (com.gamericefishpro.space.r2.c) listI.get(i5);
            com.gamericefishpro.space.r2.p pVarA = pVar.a((com.gamericefishpro.space.r2.p) cVar2.a);
            int i7 = cVar2.b;
            int i8 = cVar2.c;
            if (i7 > i8) {
                com.gamericefishpro.space.w2.a.a("Reversed range is not supported");
            }
            while (i6 < i7 && !rVar.isEmpty()) {
                com.gamericefishpro.space.r2.c cVar3 = (com.gamericefishpro.space.r2.c) rVar.last();
                int i9 = cVar3.c;
                listI = listI;
                Object obj = cVar3.a;
                if (i7 < i9) {
                    arrayList2.add(new com.gamericefishpro.space.r2.c(i6, i7, obj));
                    i6 = i7;
                } else {
                    int i10 = size;
                    arrayList2.add(new com.gamericefishpro.space.r2.c(i6, i9, obj));
                    i6 = cVar3.c;
                    while (!rVar.isEmpty() && i6 == ((com.gamericefishpro.space.r2.c) rVar.last()).c) {
                        rVar.removeLast();
                    }
                    size = i10;
                }
            }
            List list3 = listI;
            int i11 = size;
            if (i6 < i7) {
                arrayList2.add(new com.gamericefishpro.space.r2.c(i6, i7, pVar));
                i6 = i7;
            }
            com.gamericefishpro.space.r2.c cVar4 = (com.gamericefishpro.space.r2.c) rVar.l();
            if (cVar4 != null) {
                int i12 = cVar4.c;
                Object obj2 = cVar4.a;
                int i13 = cVar4.b;
                if (i13 == i7 && i12 == i8) {
                    rVar.removeLast();
                    rVar.addLast(new com.gamericefishpro.space.r2.c(i7, i8, ((com.gamericefishpro.space.r2.p) obj2).a(pVarA)));
                } else if (i13 == i12) {
                    arrayList2.add(new com.gamericefishpro.space.r2.c(i13, i12, obj2));
                    rVar.removeLast();
                    rVar.addLast(new com.gamericefishpro.space.r2.c(i7, i8, pVarA));
                } else if (i12 >= i8) {
                    rVar.addLast(new com.gamericefishpro.space.r2.c(i7, i8, ((com.gamericefishpro.space.r2.p) obj2).a(pVarA)));
                } else {
                    throw new IllegalArgumentException();
                }
            } else {
                rVar.addLast(new com.gamericefishpro.space.r2.c(i7, i8, pVarA));
            }
            i5++;
            listI = list3;
            size = i11;
        }
        while (i6 <= str.length() && !rVar.isEmpty()) {
            com.gamericefishpro.space.r2.c cVar5 = (com.gamericefishpro.space.r2.c) rVar.last();
            Object obj3 = cVar5.a;
            int i14 = cVar5.c;
            arrayList2.add(new com.gamericefishpro.space.r2.c(i6, i14, obj3));
            while (!rVar.isEmpty() && i14 == ((com.gamericefishpro.space.r2.c) rVar.last()).c) {
                rVar.removeLast();
            }
            i6 = i14;
        }
        if (i6 < str.length()) {
            arrayList2.add(new com.gamericefishpro.space.r2.c(i6, str.length(), pVar));
        }
        if (arrayList2.isEmpty()) {
            i = 0;
            arrayList2.add(new com.gamericefishpro.space.r2.c(0, 0, pVar));
        } else {
            i = 0;
        }
        ArrayList arrayList3 = new ArrayList(arrayList2.size());
        int size2 = arrayList2.size();
        int i15 = i;
        while (i15 < size2) {
            com.gamericefishpro.space.r2.c cVar6 = (com.gamericefishpro.space.r2.c) arrayList2.get(i15);
            int i16 = cVar6.b;
            int i17 = cVar6.c;
            if (i16 != i17) {
                strSubstring = str.substring(i16, i17);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            } else {
                strSubstring = "";
            }
            ArrayList arrayList4 = null;
            if (i16 != i17 && (list2 = eVar2.d) != null) {
                if (i16 == 0 && i17 >= str.length()) {
                    arrayList4 = new ArrayList(list2.size());
                    int size3 = list2.size();
                    int i18 = 0;
                    while (i18 < size3) {
                        int i19 = size3;
                        Object obj4 = list2.get(i18);
                        int i20 = i18;
                        if (!(((com.gamericefishpro.space.r2.b) ((com.gamericefishpro.space.r2.c) obj4).a) instanceof com.gamericefishpro.space.r2.p)) {
                            arrayList4.add(obj4);
                        }
                        i18 = i20 + 1;
                        size3 = i19;
                    }
                } else {
                    arrayList4 = new ArrayList(list2.size());
                    int size4 = list2.size();
                    int i21 = 0;
                    while (i21 < size4) {
                        int i22 = size4;
                        com.gamericefishpro.space.r2.c cVar7 = (com.gamericefishpro.space.r2.c) list2.get(i21);
                        List list4 = list2;
                        Object obj5 = cVar7.a;
                        int i23 = cVar7.c;
                        int i24 = i21;
                        int i25 = cVar7.b;
                        String str2 = str;
                        if (!(((com.gamericefishpro.space.r2.b) obj5) instanceof com.gamericefishpro.space.r2.p) && com.gamericefishpro.space.r2.f.a(i16, i17, i25, i23)) {
                            arrayList4.add(new com.gamericefishpro.space.r2.c((com.gamericefishpro.space.r2.b) cVar7.a, com.gamericefishpro.space.ji.f.c(i25, i16, i17) - i16, com.gamericefishpro.space.ji.f.c(i23, i16, i17) - i16, cVar7.d));
                        }
                        i21 = i24 + 1;
                        list2 = list4;
                        size4 = i22;
                        str = str2;
                        size2 = size2;
                    }
                }
            }
            String str3 = str;
            int i26 = size2;
            com.gamericefishpro.space.r2.e eVar3 = new com.gamericefishpro.space.r2.e(strSubstring, arrayList4 == null ? g0.d : arrayList4);
            com.gamericefishpro.space.r2.p pVar2 = (com.gamericefishpro.space.r2.p) cVar6.a;
            i0 i0Var3 = new i0(i0Var2.a, pVar.a(pVar2.b == 0 ? new com.gamericefishpro.space.r2.p(pVar2.a, pVar.b, pVar2.c, pVar2.d, pVar2.e, pVar2.f, pVar2.g, pVar2.h, pVar2.i) : pVar2));
            List list5 = eVar3.d;
            List list6 = list5 == null ? g0.d : list5;
            List list7 = (List) this.i;
            ArrayList arrayList5 = new ArrayList(list7.size());
            int size5 = list7.size();
            int i27 = 0;
            while (i27 < size5) {
                com.gamericefishpro.space.r2.c cVar8 = (com.gamericefishpro.space.r2.c) list7.get(i27);
                int i28 = cVar8.b;
                List list8 = list7;
                int i29 = cVar8.c;
                if (com.gamericefishpro.space.r2.f.a(i16, i17, i28, i29)) {
                    if (i16 > i28 || i29 > i17) {
                        com.gamericefishpro.space.w2.a.a("placeholder can not overlap with paragraph.");
                    }
                    arrayList5.add(new com.gamericefishpro.space.r2.c(i28 - i16, i29 - i16, cVar8.a));
                }
                i27++;
                list7 = list8;
            }
            arrayList3.add(new com.gamericefishpro.space.r2.n(new com.gamericefishpro.space.y2.c(strSubstring, i0Var3, list6, arrayList5, dVar, cVar), i16, i17));
            i15++;
            eVar2 = eVar;
            i0Var2 = i0Var;
            arrayList2 = arrayList2;
            str = str3;
            size2 = i26;
        }
        this.w = arrayList3;
    }

    public d(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.v = new ArrayDeque();
        this.d = sharedPreferences;
        this.e = "topic_operation_queue";
        this.i = ",";
        this.w = scheduledThreadPoolExecutor;
    }
}
