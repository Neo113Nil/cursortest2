package com.gamericefishpro.space.j1;

import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import com.gamericefishpro.space.c3.n;
import com.gamericefishpro.space.f2.g0;
import com.gamericefishpro.space.h2.f1;
import com.gamericefishpro.space.i2.f0;
import com.gamericefishpro.space.i2.o;
import com.gamericefishpro.space.i2.s1;
import com.gamericefishpro.space.i2.t;
import com.gamericefishpro.space.o2.h;
import com.gamericefishpro.space.o2.p;
import com.gamericefishpro.space.o2.r;
import com.gamericefishpro.space.o2.v;
import com.gamericefishpro.space.oh.k;
import com.gamericefishpro.space.r2.e0;
import com.gamericefishpro.space.r2.i0;
import com.gamericefishpro.space.t.h0;
import com.gamericefishpro.space.t.l;
import com.gamericefishpro.space.t.m;
import com.gamericefishpro.space.t.w;
import com.gamericefishpro.space.u6.s;
import com.gamericefishpro.space.z4.u;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements com.gamericefishpro.space.z4.f, View.OnAttachStateChangeListener {
    public w C;
    public long D;
    public final w E;
    public s1 F;
    public boolean G;
    public final com.appsflyer.a H;
    public final t d;
    public final o e;
    public s i;
    public final ArrayList v = new ArrayList();
    public final long w = 100;
    public a y = a.d;
    public boolean z = true;
    public final com.gamericefishpro.space.ri.e A = com.gamericefishpro.space.hj.c.a(1, 6, null);
    public final Handler B = new Handler(Looper.getMainLooper());

    public d(t tVar, o oVar) {
        this.d = tVar;
        this.e = oVar;
        w wVar = m.a;
        Intrinsics.c(wVar, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.C = wVar;
        this.E = new w();
        com.gamericefishpro.space.o2.o oVarA = tVar.getSemanticsOwner().a();
        Intrinsics.c(wVar, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.F = new s1(oVarA, wVar);
        this.H = new com.appsflyer.a(7, this);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0047 A[PHI: r2
      0x0047: PHI (r2v3 com.gamericefishpro.space.ri.b) = (r2v1 com.gamericefishpro.space.ri.b), (r2v2 com.gamericefishpro.space.ri.b), (r2v5 com.gamericefishpro.space.ri.b) binds: [B:16:0x003a, B:29:0x007d, B:12:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x0052 A[PHI: r2 r8
      0x0052: PHI (r2v2 com.gamericefishpro.space.ri.b) = (r2v3 com.gamericefishpro.space.ri.b), (r2v4 com.gamericefishpro.space.ri.b) binds: [B:18:0x004f, B:15:0x0034] A[DONT_GENERATE, DONT_INLINE]
      0x0052: PHI (r8v3 java.lang.Object) = (r8v11 java.lang.Object), (r8v1 java.lang.Object) binds: [B:18:0x004f, B:15:0x0034] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:22:0x005a  */
    /* JADX WARN: Code duplicated, block: B:24:0x0063  */
    /* JADX WARN: Code duplicated, block: B:27:0x006a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x007d -> B:17:0x0047). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object a(com.gamericefishpro.space.vh.c r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.gamericefishpro.space.j1.b
            if (r0 == 0) goto L13
            r0 = r8
            com.gamericefishpro.space.j1.b r0 = (com.gamericefishpro.space.j1.b) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            com.gamericefishpro.space.j1.b r0 = new com.gamericefishpro.space.j1.b
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.e
            com.gamericefishpro.space.uh.a r1 = com.gamericefishpro.space.uh.a.d
            int r2 = r0.v
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            com.gamericefishpro.space.ri.b r2 = r0.d
            com.gamericefishpro.space.wa.b.P(r8)
            goto L47
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L34:
            com.gamericefishpro.space.ri.b r2 = r0.d
            com.gamericefishpro.space.wa.b.P(r8)
            goto L52
        L3a:
            com.gamericefishpro.space.wa.b.P(r8)
            com.gamericefishpro.space.ri.e r8 = r7.A
            r8.getClass()
            com.gamericefishpro.space.ri.b r2 = new com.gamericefishpro.space.ri.b
            r2.<init>(r8)
        L47:
            r0.d = r2
            r0.v = r4
            java.lang.Object r8 = r2.b(r0)
            if (r8 != r1) goto L52
            goto L7f
        L52:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L80
            r2.c()
            boolean r8 = r7.g()
            if (r8 == 0) goto L66
            r7.h()
        L66:
            boolean r8 = r7.G
            if (r8 != 0) goto L73
            r7.G = r4
            android.os.Handler r8 = r7.B
            com.appsflyer.a r5 = r7.H
            r8.post(r5)
        L73:
            r0.d = r2
            r0.v = r3
            long r5 = r7.w
            java.lang.Object r8 = com.gamericefishpro.space.pi.a0.i(r5, r0)
            if (r8 != r1) goto L47
        L7f:
            return r1
        L80:
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.gamericefishpro.space.j1.d.a(com.gamericefishpro.space.vh.c):java.lang.Object");
    }

    @Override // com.gamericefishpro.space.z4.f
    public final void c(u uVar) {
        this.i = (s) this.e.invoke();
        m(-1, this.d.getSemanticsOwner().a());
        h();
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00c7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x00c9 A[LOOP:2: B:21:0x006f->B:39:0x00c9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:91:0x00d2 A[EDGE_INSN: B:91:0x00d2->B:41:0x00d2 BREAK  A[LOOP:2: B:21:0x006f->B:39:0x00c9], SYNTHETIC] */
    public final void d(l lVar) {
        int[] iArr;
        long[] jArr;
        int[] iArr2;
        long j;
        char c;
        long j2;
        int i;
        long[] jArr2;
        long[] jArr3;
        long j3;
        long j4;
        l lVar2 = lVar;
        int[] iArr3 = lVar2.b;
        long[] jArr4 = lVar2.a;
        int length = jArr4.length - 2;
        if (length < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            long j5 = jArr4[i2];
            char c2 = 7;
            long j6 = -9187201950435737472L;
            if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8;
                int i4 = 8 - ((~(i2 - length)) >>> 31);
                int i5 = 0;
                while (i5 < i4) {
                    if ((j5 & 255) < 128) {
                        int i6 = iArr3[(i2 << 3) + i5];
                        c = c2;
                        s1 s1Var = (s1) this.E.b(i6);
                        p pVar = (p) lVar2.b(i6);
                        com.gamericefishpro.space.o2.o oVar = pVar != null ? pVar.a : null;
                        if (oVar == null) {
                            throw com.gamericefishpro.space.m5.a.e("no value for specified key");
                        }
                        j2 = j6;
                        int i7 = oVar.g;
                        com.gamericefishpro.space.o2.l lVar3 = oVar.d;
                        if (s1Var == null) {
                            h0 h0Var = lVar3.d;
                            Object[] objArr = h0Var.b;
                            long[] jArr5 = h0Var.a;
                            int length2 = jArr5.length - 2;
                            iArr2 = iArr3;
                            if (length2 >= 0) {
                                int i8 = i3;
                                int i9 = 0;
                                while (true) {
                                    long j7 = jArr5[i9];
                                    j = j5;
                                    if ((((~j7) << c) & j7 & j2) != j2) {
                                        int i10 = 8 - ((~(i9 - length2)) >>> 31);
                                        for (int i11 = 0; i11 < i10; i11++) {
                                            if ((j7 & 255) < 128) {
                                                j4 = j7;
                                                v vVar = (v) objArr[(i9 << 3) + i11];
                                                v vVar2 = com.gamericefishpro.space.o2.s.a;
                                                v vVar3 = com.gamericefishpro.space.o2.s.A;
                                                if (Intrinsics.a(vVar, vVar3)) {
                                                    List list = (List) r.d(lVar3, vVar3);
                                                    k(i7, String.valueOf(list != null ? (com.gamericefishpro.space.r2.e) CollectionsKt.firstOrNull(list) : null));
                                                }
                                            } else {
                                                j4 = j7;
                                            }
                                            j7 = j4 >> i8;
                                        }
                                        if (i10 != i8) {
                                            break;
                                        }
                                        if (i9 != length2) {
                                            break;
                                        }
                                        i9++;
                                        j5 = j;
                                        i8 = 8;
                                    } else if (i9 != length2) {
                                        break;
                                        break;
                                    } else {
                                        i9++;
                                        j5 = j;
                                        i8 = 8;
                                    }
                                }
                            } else {
                                j = j5;
                            }
                        } else {
                            iArr2 = iArr3;
                            j = j5;
                            h0 h0Var2 = lVar3.d;
                            Object[] objArr2 = h0Var2.b;
                            long[] jArr6 = h0Var2.a;
                            int length3 = jArr6.length - 2;
                            if (length3 >= 0) {
                                Object[] objArr3 = objArr2;
                                jArr4 = jArr4;
                                int i12 = 0;
                                while (true) {
                                    long j8 = jArr6[i12];
                                    Object[] objArr4 = objArr3;
                                    i = i5;
                                    if ((((~j8) << c) & j8 & j2) != j2) {
                                        int i13 = 8 - ((~(i12 - length3)) >>> 31);
                                        int i14 = 0;
                                        while (i14 < i13) {
                                            if ((j8 & 255) < 128) {
                                                jArr3 = jArr6;
                                                v vVar4 = (v) objArr4[(i12 << 3) + i14];
                                                v vVar5 = com.gamericefishpro.space.o2.s.a;
                                                j3 = j8;
                                                v vVar6 = com.gamericefishpro.space.o2.s.A;
                                                if (Intrinsics.a(vVar4, vVar6)) {
                                                    List list2 = (List) r.d(s1Var.a, vVar6);
                                                    com.gamericefishpro.space.r2.e eVar = list2 != null ? (com.gamericefishpro.space.r2.e) CollectionsKt.firstOrNull(list2) : null;
                                                    List list3 = (List) r.d(lVar3, vVar6);
                                                    com.gamericefishpro.space.r2.e eVar2 = list3 != null ? (com.gamericefishpro.space.r2.e) CollectionsKt.firstOrNull(list3) : null;
                                                    if (!Intrinsics.a(eVar, eVar2)) {
                                                        k(i7, String.valueOf(eVar2));
                                                    }
                                                }
                                            } else {
                                                jArr3 = jArr6;
                                                j3 = j8;
                                            }
                                            j8 = j3 >> 8;
                                            i14++;
                                            jArr6 = jArr3;
                                        }
                                        jArr2 = jArr6;
                                        if (i13 != 8) {
                                            break;
                                        }
                                    } else {
                                        jArr2 = jArr6;
                                    }
                                    if (i12 == length3) {
                                        break;
                                    }
                                    i12++;
                                    i5 = i;
                                    objArr3 = objArr4;
                                    jArr6 = jArr2;
                                }
                            }
                            j5 = j >> 8;
                            i5 = i + 1;
                            jArr4 = jArr4;
                            c2 = c;
                            j6 = j2;
                            iArr3 = iArr2;
                            i3 = 8;
                            lVar2 = lVar;
                        }
                    } else {
                        iArr2 = iArr3;
                        j = j5;
                        c = c2;
                        j2 = j6;
                    }
                    i = i5;
                    j5 = j >> 8;
                    i5 = i + 1;
                    jArr4 = jArr4;
                    c2 = c;
                    j6 = j2;
                    iArr3 = iArr2;
                    i3 = 8;
                    lVar2 = lVar;
                }
                iArr = iArr3;
                int i15 = i3;
                jArr = jArr4;
                if (i4 != i15) {
                    return;
                }
            } else {
                iArr = iArr3;
                jArr = jArr4;
            }
            if (i2 == length) {
                return;
            }
            i2++;
            lVar2 = lVar;
            jArr4 = jArr;
            iArr3 = iArr;
        }
    }

    public final void e(com.gamericefishpro.space.o2.o oVar, Function2 function2) {
        oVar.getClass();
        List listJ = com.gamericefishpro.space.o2.o.j(4, oVar);
        int size = listJ.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = listJ.get(i2);
            if (f().a(((com.gamericefishpro.space.o2.o) obj).g)) {
                function2.invoke(Integer.valueOf(i), obj);
                i++;
            }
        }
    }

    public final l f() {
        if (this.z) {
            this.z = false;
            this.C = r.b(this.d.getSemanticsOwner(), c.d);
            this.D = System.currentTimeMillis();
        }
        return this.C;
    }

    public final boolean g() {
        return this.i != null;
    }

    public final void h() {
        s sVar = this.i;
        if (sVar == null) {
            return;
        }
        Object obj = sVar.e;
        if (Build.VERSION.SDK_INT < 29) {
            return;
        }
        ArrayList arrayList = this.v;
        if (arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            e eVar = (e) arrayList.get(i);
            int iOrdinal = eVar.c.ordinal();
            if (iOrdinal == 0) {
                com.gamericefishpro.space.vb.c cVar = eVar.d;
                if (cVar != null) {
                    ViewStructure viewStructure = (ViewStructure) cVar.e;
                    if (Build.VERSION.SDK_INT >= 29) {
                        com.gamericefishpro.space.i6.w.e(com.gamericefishpro.space.k2.a.d(obj), viewStructure);
                    }
                }
            } else {
                if (iOrdinal != 1) {
                    throw new k();
                }
                AutofillId autofillIdK = sVar.k(eVar.a);
                if (autofillIdK != null && Build.VERSION.SDK_INT >= 29) {
                    com.gamericefishpro.space.i6.w.f(com.gamericefishpro.space.k2.a.d(obj), autofillIdK);
                }
            }
        }
        if (Build.VERSION.SDK_INT >= 29) {
            com.gamericefishpro.space.i6.w.h(com.gamericefishpro.space.k2.a.d(obj), ((View) sVar.i).getAutofillId(), new long[]{Long.MIN_VALUE});
        }
        arrayList.clear();
    }

    public final void i(com.gamericefishpro.space.o2.o oVar, s1 s1Var) {
        e(oVar, new g0(3, s1Var, this));
        List listJ = com.gamericefishpro.space.o2.o.j(4, oVar);
        int size = listJ.size();
        for (int i = 0; i < size; i++) {
            com.gamericefishpro.space.o2.o oVar2 = (com.gamericefishpro.space.o2.o) listJ.get(i);
            l lVarF = f();
            int i2 = oVar2.g;
            if (lVarF.a(i2)) {
                w wVar = this.E;
                if (wVar.a(i2)) {
                    Object objB = wVar.b(i2);
                    if (objB == null) {
                        throw com.gamericefishpro.space.m5.a.e("node not present in pruned tree before this change");
                    }
                    i(oVar2, (s1) objB);
                } else {
                    continue;
                }
            }
        }
    }

    public final void k(int i, String str) {
        s sVar;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29 && (sVar = this.i) != null) {
            AutofillId autofillIdK = sVar.k(i);
            if (autofillIdK == null) {
                throw com.gamericefishpro.space.m5.a.e("Invalid content capture ID");
            }
            if (i2 >= 29) {
                com.gamericefishpro.space.i6.w.g(com.gamericefishpro.space.k2.a.d(sVar.e), autofillIdK, str);
            }
        }
    }

    @Override // com.gamericefishpro.space.z4.f
    public final void l(u uVar) {
        n(this.d.getSemanticsOwner().a());
        h();
        this.i = null;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x018d  */
    /* JADX WARN: Code duplicated, block: B:34:0x0074  */
    public final void m(int i, com.gamericefishpro.space.o2.o oVar) {
        Function1 function1;
        int i2;
        com.gamericefishpro.space.n1.c cVarA;
        com.gamericefishpro.space.vb.c cVar;
        String strR;
        Function1 function2;
        if (g()) {
            h0 h0Var = oVar.d.d;
            Object objG = h0Var.g(com.gamericefishpro.space.o2.s.C);
            if (objG == null) {
                objG = null;
            }
            Boolean bool = (Boolean) objG;
            if (this.y == a.d && Intrinsics.a(bool, Boolean.TRUE)) {
                Object objG2 = h0Var.g(com.gamericefishpro.space.o2.k.m);
                if (objG2 == null) {
                    objG2 = null;
                }
                com.gamericefishpro.space.o2.a aVar = (com.gamericefishpro.space.o2.a) objG2;
                if (aVar != null && (function2 = (Function1) aVar.b) != null) {
                }
            } else if (this.y == a.e && Intrinsics.a(bool, Boolean.FALSE)) {
                Object objG3 = h0Var.g(com.gamericefishpro.space.o2.k.m);
                if (objG3 == null) {
                    objG3 = null;
                }
                com.gamericefishpro.space.o2.a aVar2 = (com.gamericefishpro.space.o2.a) objG3;
                if (aVar2 != null && (function1 = (Function1) aVar2.b) != null) {
                }
            }
            int i3 = oVar.g;
            s sVar = this.i;
            if (sVar != null && (i2 = Build.VERSION.SDK_INT) >= 29) {
                AutofillId autofillId = this.d.getAutofillId();
                com.gamericefishpro.space.o2.o oVarL = oVar.l();
                int i4 = oVar.g;
                if (oVarL == null || (autofillId = sVar.k(oVarL.g)) != null) {
                    com.gamericefishpro.space.vb.c cVar2 = i2 >= 29 ? new com.gamericefishpro.space.vb.c(26, com.gamericefishpro.space.i6.w.d(com.gamericefishpro.space.k2.a.d(sVar.e), autofillId, i4)) : null;
                    if (cVar2 == null) {
                        cVar = null;
                    } else {
                        ViewStructure viewStructure = (ViewStructure) cVar2.e;
                        com.gamericefishpro.space.o2.l lVar = oVar.d;
                        v vVar = com.gamericefishpro.space.o2.s.I;
                        h0 h0Var2 = lVar.d;
                        if (h0Var2.c(vVar)) {
                            cVar = null;
                        } else {
                            Bundle extras = viewStructure.getExtras();
                            if (extras != null) {
                                extras.putLong("android.view.contentcapture.EventTimestamp", this.D);
                                extras.putInt("android.view.ViewStructure.extra.EXTRA_VIEW_NODE_INDEX", i);
                            }
                            Object objG4 = h0Var2.g(com.gamericefishpro.space.o2.s.y);
                            if (objG4 == null) {
                                objG4 = null;
                            }
                            String str = (String) objG4;
                            if (str != null) {
                                viewStructure.setId(i4, null, null, str);
                            }
                            Object objG5 = h0Var2.g(com.gamericefishpro.space.o2.s.m);
                            if (objG5 == null) {
                                objG5 = null;
                            }
                            if (((Boolean) objG5) != null) {
                                viewStructure.setClassName("android.widget.ViewGroup");
                            }
                            Object objG6 = h0Var2.g(com.gamericefishpro.space.o2.s.A);
                            if (objG6 == null) {
                                objG6 = null;
                            }
                            List list = (List) objG6;
                            if (list != null) {
                                viewStructure.setClassName("android.widget.TextView");
                                viewStructure.setText(com.gamericefishpro.space.e3.a.a(list, "\n", null, 62));
                            }
                            Object objG7 = h0Var2.g(com.gamericefishpro.space.o2.s.E);
                            if (objG7 == null) {
                                objG7 = null;
                            }
                            com.gamericefishpro.space.r2.e eVar = (com.gamericefishpro.space.r2.e) objG7;
                            if (eVar != null) {
                                viewStructure.setClassName("android.widget.EditText");
                                viewStructure.setText(eVar);
                            }
                            Object objG8 = h0Var2.g(com.gamericefishpro.space.o2.s.a);
                            if (objG8 == null) {
                                objG8 = null;
                            }
                            List list2 = (List) objG8;
                            if (list2 != null) {
                                viewStructure.setContentDescription(com.gamericefishpro.space.e3.a.a(list2, "\n", null, 62));
                            }
                            Object objG9 = h0Var2.g(com.gamericefishpro.space.o2.s.x);
                            if (objG9 == null) {
                                objG9 = null;
                            }
                            h hVar = (h) objG9;
                            if (hVar != null && (strR = f0.r(hVar.a)) != null) {
                                viewStructure.setClassName(strR);
                            }
                            com.gamericefishpro.space.r2.f0 f0VarK = f0.k(lVar);
                            if (f0VarK != null) {
                                e0 e0Var = f0VarK.a;
                                i0 i0Var = e0Var.b;
                                com.gamericefishpro.space.c3.c cVar3 = e0Var.g;
                                viewStructure.setTextStyle(cVar3.g() * cVar3.b() * n.c(i0Var.a.b), 0, 0, 0);
                            }
                            f1 f1VarD = oVar.d();
                            if (f1VarD == null) {
                                cVarA = com.gamericefishpro.space.n1.c.e;
                            } else {
                                f1 f1Var = f1VarD.K0().G ? f1VarD : null;
                                if (f1Var != null) {
                                    cVarA = oVar.a(f1Var);
                                } else {
                                    cVarA = com.gamericefishpro.space.n1.c.e;
                                }
                            }
                            float f = cVarA.a;
                            float f2 = cVarA.b;
                            viewStructure.setDimens((int) f, (int) f2, 0, 0, (int) (cVarA.c - f), (int) (cVarA.d - f2));
                            cVar = cVar2;
                        }
                    }
                } else {
                    cVar = null;
                }
            } else {
                cVar = null;
            }
            if (cVar != null) {
                this.v.add(new e(i3, this.D, f.d, cVar));
            }
            e(oVar, new com.gamericefishpro.space.g3.e(5, this));
        }
    }

    public final void n(com.gamericefishpro.space.o2.o oVar) {
        if (g()) {
            this.v.add(new e(oVar.g, this.D, f.e, null));
            List listJ = com.gamericefishpro.space.o2.o.j(4, oVar);
            int size = listJ.size();
            for (int i = 0; i < size; i++) {
                n((com.gamericefishpro.space.o2.o) listJ.get(i));
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0059 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x005b A[LOOP:0: B:5:0x0017->B:15:0x005b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:19:0x005e A[EDGE_INSN: B:19:0x005e->B:16:0x005e BREAK  A[LOOP:0: B:5:0x0017->B:15:0x005b], SYNTHETIC] */
    public final void o() {
        w wVar = this.E;
        wVar.c();
        l lVarF = f();
        int[] iArr = lVarF.b;
        Object[] objArr = lVarF.c;
        long[] jArr = lVarF.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i != length) {
                        break;
                        break;
                    }
                    i++;
                } else {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            wVar.h(iArr[i4], new s1(((p) objArr[i4]).a, f()));
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    } else if (i != length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
        this.F = new s1(this.d.getSemanticsOwner().a(), f());
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.B.removeCallbacks(this.H);
        this.i = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
