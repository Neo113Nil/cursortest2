package com.gamericefishpro.space.s5;

import com.gamericefishpro.space.h0.z0;
import com.gamericefishpro.space.ph.m0;
import com.gamericefishpro.space.pi.g1;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class k0 {
    public static final String[] l = {"INSERT", "UPDATE", "DELETE"};
    public final t a;
    public final HashMap b;
    public final HashMap c;
    public final boolean d;
    public final g1 e;
    public final LinkedHashMap f;
    public final String[] g;
    public final z0 h;
    public final com.gamericefishpro.space.l4.d0 i;
    public final AtomicBoolean j;
    public Function0 k;

    public k0(t database, HashMap shadowTablesMap, HashMap viewTables, String[] tableNames, boolean z, g1 onInvalidatedTablesIds) {
        String lowerCase;
        Intrinsics.checkNotNullParameter(database, "database");
        Intrinsics.checkNotNullParameter(shadowTablesMap, "shadowTablesMap");
        Intrinsics.checkNotNullParameter(viewTables, "viewTables");
        Intrinsics.checkNotNullParameter(tableNames, "tableNames");
        Intrinsics.checkNotNullParameter(onInvalidatedTablesIds, "onInvalidatedTablesIds");
        this.a = database;
        this.b = shadowTablesMap;
        this.c = viewTables;
        this.d = z;
        this.e = onInvalidatedTablesIds;
        this.j = new AtomicBoolean(false);
        this.k = new com.gamericefishpro.space.q0.n(7);
        this.f = new LinkedHashMap();
        int length = tableNames.length;
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            String str = tableNames[i];
            Locale locale = Locale.ROOT;
            String lowerCase2 = str.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
            this.f.put(lowerCase2, Integer.valueOf(i));
            String str2 = (String) this.b.get(tableNames[i]);
            if (str2 != null) {
                lowerCase = str2.toLowerCase(locale);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            } else {
                lowerCase = null;
            }
            if (lowerCase != null) {
                lowerCase2 = lowerCase;
            }
            strArr[i] = lowerCase2;
        }
        this.g = strArr;
        for (Map.Entry entry : this.b.entrySet()) {
            String str3 = (String) entry.getValue();
            Locale locale2 = Locale.ROOT;
            String lowerCase3 = str3.toLowerCase(locale2);
            Intrinsics.checkNotNullExpressionValue(lowerCase3, "toLowerCase(...)");
            if (this.f.containsKey(lowerCase3)) {
                String lowerCase4 = ((String) entry.getKey()).toLowerCase(locale2);
                Intrinsics.checkNotNullExpressionValue(lowerCase4, "toLowerCase(...)");
                LinkedHashMap linkedHashMap = this.f;
                linkedHashMap.put(lowerCase4, m0.d(linkedHashMap, lowerCase3));
            }
        }
        this.h = new z0(this.g.length);
        this.i = new com.gamericefishpro.space.l4.d0(this.g.length);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(k0 k0Var, m mVar, com.gamericefishpro.space.vh.c cVar) {
        b0 b0Var;
        if (cVar instanceof b0) {
            b0Var = (b0) cVar;
            int i = b0Var.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                b0Var.v = i - Integer.MIN_VALUE;
            } else {
                b0Var = new b0(k0Var, cVar);
            }
        } else {
            b0Var = new b0(k0Var, cVar);
        }
        Object objC = b0Var.e;
        com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
        int i2 = b0Var.v;
        if (i2 == 0) {
            com.gamericefishpro.space.wa.b.P(objC);
            com.gamericefishpro.space.r2.z zVar = new com.gamericefishpro.space.r2.z(6);
            b0Var.d = mVar;
            b0Var.v = 1;
            objC = mVar.c("SELECT * FROM room_table_modification_log WHERE invalidated = 1", zVar, b0Var);
            if (objC != aVar) {
            }
            return aVar;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Set set = (Set) b0Var.d;
            com.gamericefishpro.space.wa.b.P(objC);
            return set;
        }
        mVar = (m) b0Var.d;
        com.gamericefishpro.space.wa.b.P(objC);
        Set set2 = (Set) objC;
        if (!set2.isEmpty()) {
            b0Var.d = set2;
            b0Var.v = 2;
            if (com.gamericefishpro.space.d9.h.t(mVar, "UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1", b0Var) == aVar) {
                return aVar;
            }
        }
        return set2;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x008d A[Catch: all -> 0x0055, TRY_LEAVE, TryCatch #1 {all -> 0x0055, blocks: (B:35:0x0082, B:37:0x008d, B:20:0x0046, B:22:0x004f, B:27:0x005a, B:29:0x0068, B:32:0x006e), top: B:46:0x0046 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final Object b(k0 k0Var, com.gamericefishpro.space.vh.c cVar) throws Throwable {
        e0 e0Var;
        com.gamericefishpro.space.u6.e eVar;
        Throwable th;
        com.gamericefishpro.space.u6.e eVar2;
        Object objV;
        Set set;
        t tVar = k0Var.a;
        if (cVar instanceof e0) {
            e0Var = (e0) cVar;
            int i = e0Var.w;
            if ((i & Integer.MIN_VALUE) != 0) {
                e0Var.w = i - Integer.MIN_VALUE;
            } else {
                e0Var = new e0(k0Var, cVar);
            }
        } else {
            e0Var = new e0(k0Var, cVar);
        }
        Object obj = e0Var.i;
        com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
        int i2 = e0Var.w;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            eVar2 = e0Var.e;
            k0 k0Var2 = e0Var.d;
            try {
                com.gamericefishpro.space.wa.b.P(obj);
                eVar = eVar2;
                k0Var = k0Var2;
                objV = obj;
                set = (Set) objV;
                if (!set.isEmpty()) {
                    k0Var.i.c(set);
                    k0Var.e.invoke(set);
                }
                eVar.m();
                return set;
            } catch (Throwable th2) {
                th = th2;
                eVar2.m();
                throw th;
            }
        }
        com.gamericefishpro.space.wa.b.P(obj);
        eVar = tVar.g;
        if (!eVar.c()) {
            return com.gamericefishpro.space.ph.i0.d;
        }
        try {
            if (!k0Var.j.compareAndSet(true, false)) {
                com.gamericefishpro.space.ph.i0 i0Var = com.gamericefishpro.space.ph.i0.d;
                eVar.m();
                return i0Var;
            }
            if (!((Boolean) k0Var.k.invoke()).booleanValue()) {
                com.gamericefishpro.space.ph.i0 i0Var2 = com.gamericefishpro.space.ph.i0.d;
                eVar.m();
                return i0Var2;
            }
            f0 f0Var = new f0(k0Var, null, 1);
            e0Var.d = k0Var;
            e0Var.e = eVar;
            e0Var.w = 1;
            objV = tVar.v(false, f0Var, e0Var);
            if (objV == aVar) {
                return aVar;
            }
            set = (Set) objV;
            if (!set.isEmpty()) {
                k0Var.i.c(set);
                k0Var.e.invoke(set);
            }
            eVar.m();
            return set;
        } catch (Throwable th3) {
            th = th3;
            eVar2 = eVar;
            eVar2.m();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0083  */
    /* JADX WARN: Code duplicated, block: B:23:0x0089  */
    /* JADX WARN: Code duplicated, block: B:24:0x008c  */
    /* JADX WARN: Code duplicated, block: B:29:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0070, code lost:
    
        if (com.gamericefishpro.space.d9.h.t(r13, r15, r0) == r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00eb, code lost:
    
        if (r15 == r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ed, code lost:
    
        r13 = r13;
        return r1;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00eb -> B:28:0x00ee). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(k0 k0Var, a0 a0Var, int i, com.gamericefishpro.space.vh.c cVar) {
        g0 g0Var;
        m mVar;
        String[] strArr;
        k0 k0Var2;
        int i2;
        m mVar2;
        int i3;
        String str;
        String str2;
        m mVar3;
        k0Var.getClass();
        if (cVar instanceof g0) {
            g0Var = (g0) cVar;
            int i4 = g0Var.C;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                g0Var.C = i4 - Integer.MIN_VALUE;
            } else {
                g0Var = new g0(k0Var, cVar);
            }
        } else {
            g0Var = new g0(k0Var, cVar);
        }
        Object obj = g0Var.A;
        com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
        int i5 = g0Var.C;
        if (i5 != 0) {
            if (i5 == 1) {
                i = g0Var.w;
                m mVar4 = g0Var.e;
                k0Var = g0Var.d;
                com.gamericefishpro.space.wa.b.P(obj);
                mVar = mVar4;
            } else {
                if (i5 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i2 = g0Var.z;
                i3 = g0Var.y;
                i = g0Var.w;
                strArr = g0Var.v;
                str = g0Var.i;
                m mVar5 = g0Var.e;
                k0Var2 = g0Var.d;
                com.gamericefishpro.space.wa.b.P(obj);
                mVar3 = mVar5;
            }
            i3++;
            mVar2 = mVar3;
            if (i3 < i2) {
                return Unit.a;
            }
            String str3 = strArr[i3];
            if (k0Var2.d) {
                str2 = "TEMP";
            } else {
                str2 = "";
            }
            g0Var.d = k0Var2;
            g0Var.e = mVar2;
            g0Var.i = str;
            g0Var.v = strArr;
            g0Var.w = i;
            g0Var.y = i3;
            g0Var.z = i2;
            g0Var.C = 2;
            Object objT = com.gamericefishpro.space.d9.h.t(mVar2, "CREATE " + str2 + " TRIGGER IF NOT EXISTS `" + ("room_table_modification_trigger_" + str + '_' + str3) + "` AFTER " + str3 + " ON `" + str + "` BEGIN UPDATE room_table_modification_log SET invalidated = 1 WHERE table_id = " + i + " AND invalidated = 0; END", g0Var);
            mVar3 = mVar2;
        } else {
            com.gamericefishpro.space.wa.b.P(obj);
            String str4 = "INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i + ", 0)";
            g0Var.d = k0Var;
            g0Var.e = a0Var;
            g0Var.w = i;
            g0Var.C = 1;
        }
        mVar = a0Var;
        String str5 = k0Var.g[i];
        strArr = l;
        k0Var2 = k0Var;
        i2 = 3;
        mVar2 = mVar;
        i3 = 0;
        str = str5;
        if (i3 < i2) {
            return Unit.a;
        }
        String str6 = strArr[i3];
        if (k0Var2.d) {
            str2 = "TEMP";
        } else {
            str2 = "";
        }
        g0Var.d = k0Var2;
        g0Var.e = mVar2;
        g0Var.i = str;
        g0Var.v = strArr;
        g0Var.w = i;
        g0Var.y = i3;
        g0Var.z = i2;
        g0Var.C = 2;
        Object objT2 = com.gamericefishpro.space.d9.h.t(mVar2, "CREATE " + str2 + " TRIGGER IF NOT EXISTS `" + ("room_table_modification_trigger_" + str + '_' + str6) + "` AFTER " + str6 + " ON `" + str + "` BEGIN UPDATE room_table_modification_log SET invalidated = 1 WHERE table_id = " + i + " AND invalidated = 0; END", g0Var);
        mVar3 = mVar2;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0052  */
    /* JADX WARN: Code duplicated, block: B:18:0x008f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x008d -> B:19:0x0090). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object d(com.gamericefishpro.space.s5.k0 r8, com.gamericefishpro.space.s5.a0 r9, int r10, com.gamericefishpro.space.vh.c r11) {
        /*
            r8.getClass()
            boolean r0 = r11 instanceof com.gamericefishpro.space.s5.h0
            if (r0 == 0) goto L16
            r0 = r11
            com.gamericefishpro.space.s5.h0 r0 = (com.gamericefishpro.space.s5.h0) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.A = r1
            goto L1b
        L16:
            com.gamericefishpro.space.s5.h0 r0 = new com.gamericefishpro.space.s5.h0
            r0.<init>(r8, r11)
        L1b:
            java.lang.Object r11 = r0.y
            com.gamericefishpro.space.uh.a r1 = com.gamericefishpro.space.uh.a.d
            int r2 = r0.A
            r3 = 1
            if (r2 == 0) goto L3e
            if (r2 != r3) goto L36
            int r8 = r0.w
            int r9 = r0.v
            java.lang.String[] r10 = r0.i
            java.lang.String r2 = r0.e
            com.gamericefishpro.space.s5.m r4 = r0.d
            com.gamericefishpro.space.wa.b.P(r11)
            r11 = r10
            r10 = r4
            goto L90
        L36:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3e:
            com.gamericefishpro.space.wa.b.P(r11)
            java.lang.String[] r8 = r8.g
            r8 = r8[r10]
            java.lang.String[] r10 = com.gamericefishpro.space.s5.k0.l
            r11 = 0
            r2 = 3
            r7 = r2
            r2 = r8
            r8 = r7
            r7 = r10
            r10 = r9
            r9 = r11
            r11 = r7
        L50:
            if (r9 >= r8) goto L92
            r4 = r11[r9]
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "room_table_modification_trigger_"
            r5.<init>(r6)
            r5.append(r2)
            r6 = 95
            r5.append(r6)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "DROP TRIGGER IF EXISTS `"
            r5.<init>(r6)
            r5.append(r4)
            r4 = 96
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            r0.d = r10
            r0.e = r2
            r0.i = r11
            r0.v = r9
            r0.w = r8
            r0.A = r3
            java.lang.Object r4 = com.gamericefishpro.space.d9.h.t(r10, r4, r0)
            if (r4 != r1) goto L90
            return r1
        L90:
            int r9 = r9 + r3
            goto L50
        L92:
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.gamericefishpro.space.s5.k0.d(com.gamericefishpro.space.s5.k0, com.gamericefishpro.space.s5.a0, int, com.gamericefishpro.space.vh.c):java.lang.Object");
    }

    public final void e(Function0 onRefreshScheduled, Function0 onRefreshCompleted) {
        Intrinsics.checkNotNullParameter(onRefreshScheduled, "onRefreshScheduled");
        Intrinsics.checkNotNullParameter(onRefreshCompleted, "onRefreshCompleted");
        if (this.j.compareAndSet(false, true)) {
            onRefreshScheduled.invoke();
            com.gamericefishpro.space.ui.c cVar = this.a.a;
            com.gamericefishpro.space.th.a aVar = null;
            if (cVar != null) {
                com.gamericefishpro.space.pi.a0.u(cVar, new com.gamericefishpro.space.pi.w(), new com.gamericefishpro.space.b0.o(this, onRefreshCompleted, aVar, 19), 2);
            } else {
                Intrinsics.h("coroutineScope");
                throw null;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(com.gamericefishpro.space.vh.c cVar) throws Throwable {
        i0 i0Var;
        com.gamericefishpro.space.u6.e eVar;
        if (cVar instanceof i0) {
            i0Var = (i0) cVar;
            int i = i0Var.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                i0Var.v = i - Integer.MIN_VALUE;
            } else {
                i0Var = new i0(this, cVar);
            }
        } else {
            i0Var = new i0(this, cVar);
        }
        Object obj = i0Var.e;
        com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
        int i2 = i0Var.v;
        if (i2 == 0) {
            com.gamericefishpro.space.wa.b.P(obj);
            t tVar = this.a;
            com.gamericefishpro.space.u6.e eVar2 = tVar.g;
            if (eVar2.c()) {
                try {
                    f0 f0Var = new f0(this, null, 2);
                    i0Var.d = eVar2;
                    i0Var.v = 1;
                    if (tVar.v(false, f0Var, i0Var) == aVar) {
                        return aVar;
                    }
                    eVar = eVar2;
                    eVar.m();
                } catch (Throwable th) {
                    th = th;
                    eVar = eVar2;
                    eVar.m();
                    throw th;
                }
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            eVar = i0Var.d;
            try {
                com.gamericefishpro.space.wa.b.P(obj);
                eVar.m();
            } catch (Throwable th2) {
                th = th2;
                eVar.m();
                throw th;
            }
        }
        return Unit.a;
    }
}
