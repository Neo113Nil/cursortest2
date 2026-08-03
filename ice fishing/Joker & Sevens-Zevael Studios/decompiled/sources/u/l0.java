package u;

import android.net.Uri;
import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.compose.ui.semantics.AppendedSemanticsElement;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import m0.r1;
import m0.x1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class l0 {
    /* JADX WARN: Removed duplicated region for block: B:17:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(k1.b bVar, String str, y0.n nVar, y0.f fVar, v1.i iVar, float f10, m0.r rVar, int i10, int i11) {
        y0.n nVar2;
        int i12;
        v1.i iVar2;
        int i13;
        y0.f fVar2;
        int hashCode;
        y0.n nVar3;
        v1.i iVar3;
        float f11;
        x1 s10;
        rVar.Z(1142754848);
        int i14 = 2;
        int i15 = (rVar.h(bVar) ? 4 : 2) | i10;
        if ((i10 & 48) == 0) {
            i15 |= rVar.f(str) ? 32 : 16;
        }
        int i16 = i11 & 4;
        if (i16 != 0) {
            i15 |= 384;
        } else if ((i10 & 384) == 0) {
            nVar2 = nVar;
            i15 |= rVar.f(nVar2) ? 256 : 128;
            int i17 = i15 | 3072;
            i12 = i11 & 16;
            if (i12 == 0) {
                i17 = i15 | 27648;
            } else if ((i10 & 24576) == 0) {
                iVar2 = iVar;
                i17 |= rVar.f(iVar2) ? 16384 : 8192;
                i13 = i17 | 1769472;
                if ((599187 & i13) == 599186 || !rVar.B()) {
                    y0.n nVar4 = y0.k.f8442a;
                    if (i16 != 0) {
                        nVar2 = nVar4;
                    }
                    fVar2 = y0.c.f8423k;
                    if (i12 != 0) {
                        iVar2 = v1.j.f7083b;
                    }
                    v1.i iVar4 = iVar2;
                    if (str != null) {
                        rVar.X(1040258775);
                        boolean z10 = (i13 & 112) == 32;
                        Object M = rVar.M();
                        if (z10 || M == m0.l.f4646a) {
                            M = new e2.l(str, i14);
                            rVar.i0(M);
                        }
                        AtomicInteger atomicInteger = e2.k.f1989a;
                        nVar4 = new AppendedSemanticsElement((oc.c) M, false);
                        rVar.q(false);
                    } else {
                        rVar.X(1040398089);
                        rVar.q(false);
                    }
                    y0.n b2 = androidx.compose.ui.draw.a.b(x4.f.C(nVar2.d(nVar4)), bVar, iVar4, 1.0f, null, 2);
                    hashCode = Long.hashCode(rVar.T);
                    y0.n o7 = uc.e.o(rVar, b2);
                    r1 l10 = rVar.l();
                    x1.j.f8084f.getClass();
                    x1.z zVar = x1.i.f8076b;
                    rVar.b0();
                    if (rVar.S) {
                        rVar.k(zVar);
                    } else {
                        rVar.l0();
                    }
                    m0.z.w(w.g0.f7426a, rVar, x1.i.f8079e);
                    m0.z.w(l10, rVar, x1.i.f8078d);
                    m0.z.w(o7, rVar, x1.i.f8077c);
                    x1.h hVar = x1.i.f8080f;
                    if (!rVar.S || !pc.j.a(rVar.M(), Integer.valueOf(hashCode))) {
                        a4.d.p(hashCode, rVar, hashCode, hVar);
                    }
                    rVar.q(true);
                    nVar3 = nVar2;
                    iVar3 = iVar4;
                    f11 = 1.0f;
                } else {
                    rVar.S();
                    fVar2 = fVar;
                    iVar3 = iVar2;
                    nVar3 = nVar2;
                    f11 = f10;
                }
                s10 = rVar.s();
                if (s10 != null) {
                    s10.f4809d = new w.h0(bVar, str, nVar3, fVar2, iVar3, f11, i10, i11);
                    return;
                }
                return;
            }
            iVar2 = iVar;
            i13 = i17 | 1769472;
            if ((599187 & i13) == 599186) {
            }
            y0.n nVar42 = y0.k.f8442a;
            if (i16 != 0) {
            }
            fVar2 = y0.c.f8423k;
            if (i12 != 0) {
            }
            v1.i iVar42 = iVar2;
            if (str != null) {
            }
            y0.n b22 = androidx.compose.ui.draw.a.b(x4.f.C(nVar2.d(nVar42)), bVar, iVar42, 1.0f, null, 2);
            hashCode = Long.hashCode(rVar.T);
            y0.n o72 = uc.e.o(rVar, b22);
            r1 l102 = rVar.l();
            x1.j.f8084f.getClass();
            x1.z zVar2 = x1.i.f8076b;
            rVar.b0();
            if (rVar.S) {
            }
            m0.z.w(w.g0.f7426a, rVar, x1.i.f8079e);
            m0.z.w(l102, rVar, x1.i.f8078d);
            m0.z.w(o72, rVar, x1.i.f8077c);
            x1.h hVar2 = x1.i.f8080f;
            if (!rVar.S) {
            }
            a4.d.p(hashCode, rVar, hashCode, hVar2);
            rVar.q(true);
            nVar3 = nVar2;
            iVar3 = iVar42;
            f11 = 1.0f;
            s10 = rVar.s();
            if (s10 != null) {
            }
        }
        nVar2 = nVar;
        int i172 = i15 | 3072;
        i12 = i11 & 16;
        if (i12 == 0) {
        }
        iVar2 = iVar;
        i13 = i172 | 1769472;
        if ((599187 & i13) == 599186) {
        }
        y0.n nVar422 = y0.k.f8442a;
        if (i16 != 0) {
        }
        fVar2 = y0.c.f8423k;
        if (i12 != 0) {
        }
        v1.i iVar422 = iVar2;
        if (str != null) {
        }
        y0.n b222 = androidx.compose.ui.draw.a.b(x4.f.C(nVar2.d(nVar422)), bVar, iVar422, 1.0f, null, 2);
        hashCode = Long.hashCode(rVar.T);
        y0.n o722 = uc.e.o(rVar, b222);
        r1 l1022 = rVar.l();
        x1.j.f8084f.getClass();
        x1.z zVar22 = x1.i.f8076b;
        rVar.b0();
        if (rVar.S) {
        }
        m0.z.w(w.g0.f7426a, rVar, x1.i.f8079e);
        m0.z.w(l1022, rVar, x1.i.f8078d);
        m0.z.w(o722, rVar, x1.i.f8077c);
        x1.h hVar22 = x1.i.f8080f;
        if (!rVar.S) {
        }
        a4.d.p(hashCode, rVar, hashCode, hVar22);
        rVar.q(true);
        nVar3 = nVar2;
        iVar3 = iVar422;
        f11 = 1.0f;
        s10 = rVar.s();
        if (s10 != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0056 -> B:10:0x0059). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(r1.y yVar, hc.a aVar) {
        x.c0 c0Var;
        int i10;
        gc.a aVar2;
        int size;
        int i11;
        if (aVar instanceof x.c0) {
            c0Var = (x.c0) aVar;
            int i12 = c0Var.f7755i;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                c0Var.f7755i = i12 - Integer.MIN_VALUE;
                Object obj = c0Var.f7754h;
                i10 = c0Var.f7755i;
                if (i10 != 0) {
                    v6.a.W(obj);
                    ?? r72 = yVar.f6006l.f6012z.f5954a;
                    int size2 = r72.size();
                    for (int i13 = 0; i13 < size2; i13++) {
                        if (((r1.n) r72.get(i13)).f5966d) {
                            c0Var.f7753g = yVar;
                            c0Var.f7755i = 1;
                            obj = yVar.a(r1.h.f5958i, c0Var);
                            aVar2 = gc.a.f2559g;
                            if (obj == aVar2) {
                            }
                            ?? r73 = ((r1.g) obj).f5954a;
                            size = r73.size();
                            i11 = 0;
                            while (i11 < size) {
                            }
                            return ac.o.f277a;
                        }
                    }
                    return ac.o.f277a;
                }
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yVar = c0Var.f7753g;
                v6.a.W(obj);
                ?? r732 = ((r1.g) obj).f5954a;
                size = r732.size();
                i11 = 0;
                while (i11 < size) {
                    if (((r1.n) r732.get(i11)).f5966d) {
                        c0Var.f7753g = yVar;
                        c0Var.f7755i = 1;
                        obj = yVar.a(r1.h.f5958i, c0Var);
                        aVar2 = gc.a.f2559g;
                        if (obj == aVar2) {
                            return aVar2;
                        }
                        ?? r7322 = ((r1.g) obj).f5954a;
                        size = r7322.size();
                        i11 = 0;
                        while (i11 < size) {
                        }
                    } else {
                        i11++;
                    }
                }
                return ac.o.f277a;
            }
        }
        c0Var = new x.c0(aVar);
        Object obj2 = c0Var.f7754h;
        i10 = c0Var.f7755i;
        if (i10 != 0) {
        }
    }

    public static final Object c(r1.r rVar, oc.e eVar, hc.j jVar) {
        gc.a aVar;
        ac.o oVar;
        x.d0 d0Var = new x.d0(jVar.getContext(), eVar, null);
        r1.z zVar = (r1.z) rVar;
        zVar.getClass();
        yc.g gVar = new yc.g(1, bc.a0.w(jVar));
        gVar.q();
        r1.y yVar = new r1.y(zVar, gVar);
        synchronized (zVar.B) {
            zVar.A.b(yVar);
            fc.d w3 = bc.a0.w(bc.a0.h(yVar, yVar, d0Var));
            aVar = gc.a.f2559g;
            fc.k kVar = new fc.k(w3, aVar);
            oVar = ac.o.f277a;
            kVar.resumeWith(oVar);
        }
        gVar.s(new a0.a0(19, yVar));
        Object p8 = gVar.p();
        return p8 == aVar ? p8 : oVar;
    }

    public static final LinkedHashSet d(byte[] bArr) {
        ObjectInputStream objectInputStream;
        pc.j.e(bArr, "bytes");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (bArr.length == 0) {
            return linkedHashSet;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            try {
                objectInputStream = new ObjectInputStream(byteArrayInputStream);
            } finally {
            }
        } catch (IOException e10) {
            e10.printStackTrace();
        }
        try {
            int readInt = objectInputStream.readInt();
            for (int i10 = 0; i10 < readInt; i10++) {
                Uri parse = Uri.parse(objectInputStream.readUTF());
                boolean readBoolean = objectInputStream.readBoolean();
                pc.j.d(parse, "uri");
                linkedHashSet.add(new o4.c(readBoolean, parse));
            }
            objectInputStream.close();
            byteArrayInputStream.close();
            return linkedHashSet;
        } finally {
        }
    }

    public static final boolean e(ArrayList arrayList) {
        List list;
        long j3;
        if (arrayList.size() >= 2) {
            if (arrayList.size() <= 1) {
                list = bc.v.f1067g;
            } else {
                ArrayList arrayList2 = new ArrayList();
                Object obj = arrayList.get(0);
                int K = bc.n.K(arrayList);
                int i10 = 0;
                while (i10 < K) {
                    i10++;
                    Object obj2 = arrayList.get(i10);
                    e2.n nVar = (e2.n) obj2;
                    e2.n nVar2 = (e2.n) obj;
                    float abs = Math.abs(Float.intBitsToFloat((int) (nVar2.g().a() >> 32)) - Float.intBitsToFloat((int) (nVar.g().a() >> 32)));
                    float abs2 = Math.abs(Float.intBitsToFloat((int) (nVar2.g().a() & 4294967295L)) - Float.intBitsToFloat((int) (nVar.g().a() & 4294967295L)));
                    arrayList2.add(new e1.b((Float.floatToRawIntBits(abs) << 32) | (Float.floatToRawIntBits(abs2) & 4294967295L)));
                    obj = obj2;
                }
                list = arrayList2;
            }
            if (list.size() == 1) {
                j3 = ((e1.b) bc.m.T(list)).f1929a;
            } else {
                if (list.isEmpty()) {
                    u2.a.b("Empty collection can't be reduced.");
                }
                Object T = bc.m.T(list);
                int K2 = bc.n.K(list);
                if (1 <= K2) {
                    int i11 = 1;
                    while (true) {
                        T = new e1.b(e1.b.g(((e1.b) T).f1929a, ((e1.b) list.get(i11)).f1929a));
                        if (i11 == K2) {
                            break;
                        }
                        i11++;
                    }
                }
                j3 = ((e1.b) T).f1929a;
            }
            if (Float.intBitsToFloat((int) (4294967295L & j3)) >= Float.intBitsToFloat((int) (j3 >> 32))) {
                return false;
            }
        }
        return true;
    }

    public static final int i(int i10) {
        if (i10 == 0) {
            return 1;
        }
        if (i10 == 1) {
            return 2;
        }
        throw new IllegalArgumentException(a4.d.h("Could not convert ", i10, " to BackoffPolicy"));
    }

    public static final int j(int i10) {
        if (i10 == 0) {
            return 1;
        }
        if (i10 == 1) {
            return 2;
        }
        if (i10 == 2) {
            return 3;
        }
        if (i10 == 3) {
            return 4;
        }
        if (i10 == 4) {
            return 5;
        }
        if (Build.VERSION.SDK_INT < 30 || i10 != 5) {
            throw new IllegalArgumentException(a4.d.h("Could not convert ", i10, " to NetworkType"));
        }
        return 6;
    }

    public static final int k(int i10) {
        if (i10 == 0) {
            return 1;
        }
        if (i10 == 1) {
            return 2;
        }
        throw new IllegalArgumentException(a4.d.h("Could not convert ", i10, " to OutOfQuotaPolicy"));
    }

    public static final int l(int i10) {
        if (i10 == 0) {
            return 1;
        }
        if (i10 == 1) {
            return 2;
        }
        if (i10 == 2) {
            return 3;
        }
        if (i10 == 3) {
            return 4;
        }
        if (i10 == 4) {
            return 5;
        }
        if (i10 == 5) {
            return 6;
        }
        throw new IllegalArgumentException(a4.d.h("Could not convert ", i10, " to State"));
    }

    public static v1.f0 m(z.e0 e0Var, int i10, int i11, int i12, int i13, int i14, x1.o0 o0Var, List list, v1.j0[] j0VarArr, int i15) {
        int[] iArr;
        String str;
        float f10;
        String str2;
        long j3;
        String str3;
        long j6;
        int i16;
        z.e0 e0Var2;
        int i17;
        int h10;
        int i18;
        String str4;
        int i19;
        String str5;
        int i20;
        float f11;
        boolean z10;
        int i21;
        float f12;
        int i22;
        List list2 = list;
        int i23 = i15;
        long j10 = i14;
        int[] iArr2 = new int[i23];
        float f13 = 0.0f;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        int i28 = 0;
        while (true) {
            if (i24 >= i23) {
                break;
            }
            v1.d0 d0Var = (v1.d0) list2.get(i24);
            int i29 = i24;
            Object g8 = d0Var.g();
            int i30 = i27;
            z.f0 f0Var = g8 instanceof z.f0 ? (z.f0) g8 : null;
            float f14 = f0Var != null ? f0Var.f8951a : 0.0f;
            if (f14 > 0.0f) {
                f13 += f14;
                i25++;
                i27 = i30;
            } else {
                int i31 = i12 - i26;
                v1.j0 j0Var = j0VarArr[i29];
                if (j0Var == null) {
                    i22 = i31;
                    f12 = f13;
                    j0Var = d0Var.e(e0Var.b(0, i12 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i22 < 0 ? 0 : i22, i13, false));
                } else {
                    f12 = f13;
                    i22 = i31;
                }
                int c3 = e0Var.c(j0Var);
                int e10 = e0Var.e(j0Var);
                iArr2[i29] = c3;
                int i32 = i22 - c3;
                if (i32 < 0) {
                    i32 = 0;
                }
                int min = Math.min(i14, i32);
                i26 += c3 + min;
                i28 = Math.max(i28, e10);
                j0VarArr[i29] = j0Var;
                i27 = min;
                f13 = f12;
            }
            i24 = i29 + 1;
        }
        float f15 = f13;
        int i33 = i27;
        int i34 = i28;
        if (i25 == 0) {
            i26 -= i33;
            e0Var2 = e0Var;
            iArr = iArr2;
            i16 = i34;
            h10 = 0;
            i17 = 0;
        } else {
            int i35 = i12 != Integer.MAX_VALUE ? i12 : i10;
            long j11 = (i25 - 1) * j10;
            iArr = iArr2;
            long j12 = (i35 - i26) - j11;
            if (j12 < 0) {
                j12 = 0;
            }
            float f16 = j12 / f15;
            long j13 = j12;
            int i36 = 0;
            while (true) {
                str = "weightedSize ";
                f10 = f16;
                str2 = "arrangementSpacingTotal ";
                j3 = j12;
                str3 = "fixedSpace ";
                j6 = j11;
                if (i36 >= i23) {
                    break;
                }
                int i37 = i36;
                Object g10 = ((v1.d0) list2.get(i36)).g();
                z.f0 f0Var2 = g10 instanceof z.f0 ? (z.f0) g10 : null;
                float f17 = f0Var2 != null ? f0Var2.f8951a : 0.0f;
                float f18 = f10 * f17;
                try {
                    j13 -= Math.round(f18);
                    i36 = i37 + 1;
                    list2 = list;
                    i23 = i15;
                    f16 = f10;
                    j12 = j3;
                    j11 = j6;
                } catch (IllegalArgumentException e11) {
                    throw new IllegalArgumentException("This log indicates a hard-to-reproduce Compose issue, modified with additional debugging details. Please help us by adding your experiences to the bug link provided. Thank you for helping us improve Compose. https://issuetracker.google.com/issues/297974033 mainAxisMax " + i12 + "mainAxisMin " + i10 + "targetSpace " + i35 + "arrangementSpacingPx " + j10 + "weightChildrenCount " + i25 + "fixedSpace " + i26 + "arrangementSpacingTotal " + j6 + "remainingToTarget " + j3 + "totalWeight " + f15 + "weightUnitSpace " + f10 + "itemWeight " + f17 + str + f18).initCause(e11);
                }
            }
            i16 = i34;
            int i38 = 0;
            int i39 = 0;
            while (i38 < i15) {
                if (j0VarArr[i38] == null) {
                    i18 = i38;
                    v1.d0 d0Var2 = (v1.d0) list.get(i38);
                    Object g11 = d0Var2.g();
                    str5 = str2;
                    z.f0 f0Var3 = g11 instanceof z.f0 ? (z.f0) g11 : null;
                    float f19 = f0Var3 != null ? f0Var3.f8951a : 0.0f;
                    if (f19 <= 0.0f) {
                        throw new IllegalStateException("All weights <= 0 should have placeables");
                    }
                    float f20 = f19;
                    int signum = Long.signum(j13);
                    int i40 = i25;
                    i19 = i26;
                    j13 -= signum;
                    float f21 = f10 * f20;
                    int max = Math.max(0, Math.round(f21) + signum);
                    if (f0Var3 != null) {
                        try {
                            z10 = f0Var3.f8952b;
                        } catch (IllegalArgumentException e12) {
                            e = e12;
                            str4 = str3;
                            f11 = f21;
                            throw new IllegalArgumentException("This log indicates a hard-to-reproduce Compose issue, modified with additional debugging details. Please help us by adding your experiences to the bug link provided. Thank you for helping us improve Compose. https://issuetracker.google.com/issues/300280216 mainAxisMax " + i12 + "mainAxisMin " + i10 + "targetSpace " + i35 + "arrangementSpacingPx " + j10 + "weightChildrenCount " + i40 + str4 + i19 + str5 + j6 + "remainingToTarget " + j3 + "totalWeight " + f15 + "weightUnitSpace " + f10 + "weight " + f20 + str + f11 + "crossAxisDesiredSize nullremainderUnit " + signum + "childMainAxisSize " + max).initCause(e);
                        }
                    } else {
                        z10 = true;
                    }
                    try {
                        if (z10 && max != Integer.MAX_VALUE) {
                            i21 = max;
                            str4 = str3;
                            f11 = f21;
                            v1.j0 e13 = d0Var2.e(e0Var.b(i21, max, i13, true));
                            int c7 = e0Var.c(e13);
                            int e14 = e0Var.e(e13);
                            iArr[i18] = c7;
                            i39 += c7;
                            int max2 = Math.max(i16, e14);
                            j0VarArr[i18] = e13;
                            i16 = max2;
                            i20 = i40;
                        }
                        v1.j0 e132 = d0Var2.e(e0Var.b(i21, max, i13, true));
                        int c72 = e0Var.c(e132);
                        int e142 = e0Var.e(e132);
                        iArr[i18] = c72;
                        i39 += c72;
                        int max22 = Math.max(i16, e142);
                        j0VarArr[i18] = e132;
                        i16 = max22;
                        i20 = i40;
                    } catch (IllegalArgumentException e15) {
                        e = e15;
                        throw new IllegalArgumentException("This log indicates a hard-to-reproduce Compose issue, modified with additional debugging details. Please help us by adding your experiences to the bug link provided. Thank you for helping us improve Compose. https://issuetracker.google.com/issues/300280216 mainAxisMax " + i12 + "mainAxisMin " + i10 + "targetSpace " + i35 + "arrangementSpacingPx " + j10 + "weightChildrenCount " + i40 + str4 + i19 + str5 + j6 + "remainingToTarget " + j3 + "totalWeight " + f15 + "weightUnitSpace " + f10 + "weight " + f20 + str + f11 + "crossAxisDesiredSize nullremainderUnit " + signum + "childMainAxisSize " + max).initCause(e);
                    }
                    i21 = 0;
                    str4 = str3;
                    f11 = f21;
                } else {
                    i18 = i38;
                    str4 = str3;
                    i19 = i26;
                    str5 = str2;
                    i20 = i25;
                }
                i38 = i18 + 1;
                str = str;
                i25 = i20;
                str2 = str5;
                i26 = i19;
                str3 = str4;
            }
            e0Var2 = e0Var;
            i17 = 0;
            h10 = uc.e.h((int) (i39 + j6), 0, i12 - i26);
        }
        int i41 = h10 + i26;
        if (i41 < 0) {
            i41 = i17;
        }
        int max3 = Math.max(i41, i10);
        int max4 = Math.max(i16, Math.max(i11, i17));
        int[] iArr3 = new int[i15];
        for (int i42 = i17; i42 < i15; i42++) {
            iArr3[i42] = i17;
        }
        e0Var2.d(max3, iArr, iArr3, o0Var);
        return e0Var2.f(j0VarArr, o0Var, iArr3, max3, max4);
    }

    public static final void p(e2.n nVar, i3.d dVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = dVar.f3164a;
        Object g8 = nVar.k().f1985g.g(e2.s.f2030f);
        if (g8 == null) {
            g8 = null;
        }
        e2.b bVar = (e2.b) g8;
        if (bVar != null) {
            accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(bVar.f1946a, bVar.f1947b, false, 0));
            return;
        }
        ArrayList arrayList = new ArrayList();
        Object g10 = nVar.k().f1985g.g(e2.s.f2029e);
        if ((g10 != null ? g10 : null) != null) {
            List j3 = e2.n.j(4, nVar);
            int size = j3.size();
            for (int i10 = 0; i10 < size; i10++) {
                e2.n nVar2 = (e2.n) j3.get(i10);
                if (nVar2.k().f1985g.c(e2.s.E)) {
                    arrayList.add(nVar2);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        boolean e10 = e(arrayList);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(e10 ? 1 : arrayList.size(), e10 ? arrayList.size() : 1, false, 0));
    }

    public static final void q(e2.n nVar, i3.d dVar) {
        Object g8 = nVar.k().f1985g.g(e2.s.f2031g);
        if (g8 == null) {
            g8 = null;
        }
        if (g8 != null) {
            throw new ClassCastException();
        }
        e2.n l10 = nVar.l();
        if (l10 == null) {
            return;
        }
        Object g10 = l10.k().f1985g.g(e2.s.f2029e);
        if (g10 == null) {
            g10 = null;
        }
        if (g10 != null) {
            Object g11 = l10.k().f1985g.g(e2.s.f2030f);
            e2.b bVar = (e2.b) (g11 != null ? g11 : null);
            if (bVar == null || (bVar.f1946a >= 0 && bVar.f1947b >= 0)) {
                if (nVar.k().f1985g.c(e2.s.E)) {
                    ArrayList arrayList = new ArrayList();
                    List j3 = e2.n.j(4, l10);
                    int size = j3.size();
                    int i10 = 0;
                    for (int i11 = 0; i11 < size; i11++) {
                        e2.n nVar2 = (e2.n) j3.get(i11);
                        if (nVar2.k().f1985g.c(e2.s.E)) {
                            arrayList.add(nVar2);
                            if (nVar2.f1995c.t() < nVar.f1995c.t()) {
                                i10++;
                            }
                        }
                    }
                    if (arrayList.isEmpty()) {
                        return;
                    }
                    boolean e10 = e(arrayList);
                    int i12 = e10 ? 0 : i10;
                    int i13 = e10 ? i10 : 0;
                    Object g12 = nVar.k().f1985g.g(e2.s.E);
                    if (g12 == null) {
                        g12 = Boolean.FALSE;
                    }
                    dVar.f3164a.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(i12, 1, i13, 1, false, ((Boolean) g12).booleanValue()));
                }
            }
        }
    }

    public static final int r(int i10) {
        a4.d.t("state", i10);
        int d10 = v.f.d(i10);
        if (d10 == 0) {
            return 0;
        }
        int i11 = 1;
        if (d10 != 1) {
            i11 = 2;
            if (d10 != 2) {
                i11 = 3;
                if (d10 != 3) {
                    i11 = 4;
                    if (d10 != 4) {
                        if (d10 == 5) {
                            return 5;
                        }
                        throw new ac.d();
                    }
                }
            }
        }
        return i11;
    }

    public abstract boolean f(v2.h hVar, v2.d dVar, v2.d dVar2);

    public abstract boolean g(v2.h hVar, Object obj, Object obj2);

    public abstract boolean h(v2.h hVar, v2.g gVar, v2.g gVar2);

    public abstract void n(v2.g gVar, v2.g gVar2);

    public abstract void o(v2.g gVar, Thread thread);
}
