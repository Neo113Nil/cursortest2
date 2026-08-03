package x;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class k1 {

    /* renamed from: a, reason: collision with root package name */
    public static final a0 f7836a = new a0(3, 2, null);

    /* JADX WARN: Removed duplicated region for block: B:12:0x004d A[LOOP:0: B:11:0x004b->B:12:0x004d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0040 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x003e -> B:10:0x0041). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(r1.y yVar, hc.a aVar) {
        b1 b1Var;
        int i10;
        gc.a aVar2;
        int size;
        int i11;
        int i12;
        int size2;
        if (aVar instanceof b1) {
            b1Var = (b1) aVar;
            int i13 = b1Var.f7749i;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                b1Var.f7749i = i13 - Integer.MIN_VALUE;
                Object obj = b1Var.f7748h;
                i10 = b1Var.f7749i;
                if (i10 != 0) {
                    v6.a.W(obj);
                    b1Var.f7747g = yVar;
                    b1Var.f7749i = 1;
                    obj = yVar.a(r1.h.f5957h, b1Var);
                    aVar2 = gc.a.f2559g;
                    if (obj == aVar2) {
                    }
                    r1.g gVar = (r1.g) obj;
                    ?? r12 = gVar.f5954a;
                    size = r12.size();
                    i11 = 0;
                    while (i12 < size) {
                    }
                    ?? r82 = gVar.f5954a;
                    size2 = r82.size();
                    while (i11 < size2) {
                    }
                    return ac.o.f277a;
                }
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yVar = b1Var.f7747g;
                v6.a.W(obj);
                r1.g gVar2 = (r1.g) obj;
                ?? r122 = gVar2.f5954a;
                size = r122.size();
                i11 = 0;
                for (i12 = 0; i12 < size; i12++) {
                    ((r1.n) r122.get(i12)).a();
                }
                ?? r822 = gVar2.f5954a;
                size2 = r822.size();
                while (i11 < size2) {
                    if (((r1.n) r822.get(i11)).f5966d) {
                        b1Var.f7747g = yVar;
                        b1Var.f7749i = 1;
                        obj = yVar.a(r1.h.f5957h, b1Var);
                        aVar2 = gc.a.f2559g;
                        if (obj == aVar2) {
                            return aVar2;
                        }
                        r1.g gVar22 = (r1.g) obj;
                        ?? r1222 = gVar22.f5954a;
                        size = r1222.size();
                        i11 = 0;
                        while (i12 < size) {
                        }
                        ?? r8222 = gVar22.f5954a;
                        size2 = r8222.size();
                        while (i11 < size2) {
                        }
                    } else {
                        i11++;
                    }
                }
                return ac.o.f277a;
            }
        }
        b1Var = new b1(aVar);
        Object obj2 = b1Var.f7748h;
        i10 = b1Var.f7749i;
        if (i10 != 0) {
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007c A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0048 -> B:10:0x004b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object b(r1.y r9, boolean r10, r1.h r11, hc.a r12) {
        /*
            boolean r0 = r12 instanceof x.a1
            if (r0 == 0) goto L13
            r0 = r12
            x.a1 r0 = (x.a1) r0
            int r1 = r0.f7745k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7745k = r1
            goto L18
        L13:
            x.a1 r0 = new x.a1
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f7744j
            int r1 = r0.f7745k
            r2 = 1
            if (r1 == 0) goto L37
            if (r1 != r2) goto L2f
            boolean r9 = r0.f7743i
            r1.h r10 = r0.f7742h
            r1.y r11 = r0.f7741g
            v6.a.W(r12)
            r8 = r10
            r10 = r9
            r9 = r11
            r11 = r8
            goto L4b
        L2f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L37:
            v6.a.W(r12)
        L3a:
            r0.f7741g = r9
            r0.f7742h = r11
            r0.f7743i = r10
            r0.f7745k = r2
            java.lang.Object r12 = r9.a(r11, r0)
            gc.a r1 = gc.a.f2559g
            if (r12 != r1) goto L4b
            return r1
        L4b:
            r1.g r12 = (r1.g) r12
            java.lang.Object r1 = r12.f5954a
            int r3 = r1.size()
            r4 = 0
            r5 = r4
        L55:
            if (r5 >= r3) goto L7c
            java.lang.Object r6 = r1.get(r5)
            r1.n r6 = (r1.n) r6
            if (r10 == 0) goto L71
            boolean r7 = r6.b()
            if (r7 != 0) goto L6f
            boolean r7 = r6.f5970h
            if (r7 != 0) goto L6f
            boolean r6 = r6.f5966d
            if (r6 == 0) goto L6f
            r6 = r2
            goto L75
        L6f:
            r6 = r4
            goto L75
        L71:
            boolean r6 = r1.v.a(r6)
        L75:
            if (r6 != 0) goto L79
            r1 = r4
            goto L7d
        L79:
            int r5 = r5 + 1
            goto L55
        L7c:
            r1 = r2
        L7d:
            if (r1 == 0) goto L3a
            java.lang.Object r9 = r12.f5954a
            java.lang.Object r9 = r9.get(r4)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: x.k1.b(r1.y, boolean, r1.h, hc.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x016d -> B:11:0x0172). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(r1.y yVar, r1.h hVar, hc.a aVar) {
        j1 j1Var;
        int i10;
        r1.y yVar2;
        j1 j1Var2;
        r1.h hVar2;
        r1.y yVar3;
        r1.h hVar3;
        int size;
        int i11;
        Object a6;
        if (aVar instanceof j1) {
            j1Var = (j1) aVar;
            int i12 = j1Var.f7833j;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                j1Var.f7833j = i12 - Integer.MIN_VALUE;
                Object obj = j1Var.f7832i;
                i10 = j1Var.f7833j;
                int i13 = 1;
                gc.a aVar2 = gc.a.f2559g;
                if (i10 != 0) {
                    v6.a.W(obj);
                    yVar2 = yVar;
                    j1Var2 = j1Var;
                    hVar2 = hVar;
                    j1Var2.f7830g = yVar2;
                    j1Var2.f7831h = hVar2;
                    j1Var2.f7833j = i13;
                    a6 = yVar2.a(hVar2, j1Var2);
                    if (a6 != aVar2) {
                    }
                    return aVar2;
                }
                if (i10 == 1) {
                    hVar3 = j1Var.f7831h;
                    yVar3 = j1Var.f7830g;
                    v6.a.W(obj);
                    ?? r02 = ((r1.g) obj).f5954a;
                    size = r02.size();
                    while (i11 < size) {
                    }
                    return r02.get(0);
                }
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r1.h hVar4 = j1Var.f7831h;
                yVar3 = j1Var.f7830g;
                v6.a.W(obj);
                j1Var2 = j1Var;
                hVar2 = hVar4;
                char c3 = 2;
                ?? r03 = ((r1.g) obj).f5954a;
                int size2 = r03.size();
                for (int i14 = 0; i14 < size2; i14++) {
                    if (((r1.n) r03.get(i14)).b()) {
                        return null;
                    }
                }
                yVar2 = yVar3;
                i13 = 1;
                j1Var2.f7830g = yVar2;
                j1Var2.f7831h = hVar2;
                j1Var2.f7833j = i13;
                a6 = yVar2.a(hVar2, j1Var2);
                if (a6 != aVar2) {
                    yVar3 = yVar2;
                    obj = a6;
                    j1 j1Var3 = j1Var2;
                    hVar3 = hVar2;
                    j1Var = j1Var3;
                    ?? r022 = ((r1.g) obj).f5954a;
                    size = r022.size();
                    for (i11 = 0; i11 < size; i11++) {
                        r1.n nVar = (r1.n) r022.get(i11);
                        if (nVar.b() || !nVar.f5970h || nVar.f5966d) {
                            int size3 = r022.size();
                            for (int i15 = 0; i15 < size3; i15++) {
                                r1.n nVar2 = (r1.n) r022.get(i15);
                                if (nVar2.b()) {
                                    return null;
                                }
                                long j3 = yVar3.f6006l.E;
                                r1.z zVar = yVar3.f6006l;
                                zVar.getClass();
                                long L = zVar.L(x1.f.v(zVar).D.c());
                                long j6 = zVar.E;
                                long floatToRawIntBits = (Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (L >> 32)) - ((int) (j6 >> 32))) / 2.0f) << 32) | (Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (L & 4294967295L)) - ((int) (j6 & 4294967295L))) / 2.0f) & 4294967295L);
                                int i16 = nVar2.f5971i == 1 ? 1 : 0;
                                long j10 = nVar2.f5965c;
                                float intBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32));
                                float intBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L));
                                float f10 = i16;
                                float intBitsToFloat3 = Float.intBitsToFloat((int) (floatToRawIntBits >> 32)) * f10;
                                float f11 = ((int) (j3 >> 32)) + intBitsToFloat3;
                                float intBitsToFloat4 = Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L)) * f10;
                                if (((intBitsToFloat2 < (-intBitsToFloat4)) | (intBitsToFloat < (-intBitsToFloat3)) | (intBitsToFloat > f11)) || (intBitsToFloat2 > ((int) (j3 & 4294967295L)) + intBitsToFloat4)) {
                                    return null;
                                }
                            }
                            j1Var.f7830g = yVar3;
                            j1Var.f7831h = hVar3;
                            c3 = 2;
                            j1Var.f7833j = 2;
                            obj = yVar3.a(r1.h.f5958i, j1Var);
                            if (obj != aVar2) {
                                r1.h hVar5 = hVar3;
                                j1Var2 = j1Var;
                                hVar2 = hVar5;
                                ?? r032 = ((r1.g) obj).f5954a;
                                int size22 = r032.size();
                                while (i14 < size22) {
                                }
                                yVar2 = yVar3;
                                i13 = 1;
                                j1Var2.f7830g = yVar2;
                                j1Var2.f7831h = hVar2;
                                j1Var2.f7833j = i13;
                                a6 = yVar2.a(hVar2, j1Var2);
                                if (a6 != aVar2) {
                                }
                            }
                        }
                    }
                    return r022.get(0);
                }
                return aVar2;
            }
        }
        j1Var = new j1(aVar);
        Object obj2 = j1Var.f7832i;
        i10 = j1Var.f7833j;
        int i132 = 1;
        gc.a aVar22 = gc.a.f2559g;
        if (i10 != 0) {
        }
    }
}
