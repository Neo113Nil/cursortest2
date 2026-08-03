package com.onesignal.common.consistency.impl;

import ac.i;
import ac.o;
import gd.d;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import k8.c;
import pc.j;
import yc.b1;
import yc.k1;
import yc.l;
import yc.m;
import yc.w0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a implements c {
    private final gd.a mutex = new d();
    private final Map<String, Map<k8.b, i8.b>> indexedTokens = new LinkedHashMap();
    private final List<i> conditions = new ArrayList();

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    /* renamed from: com.onesignal.common.consistency.impl.a$a, reason: collision with other inner class name */
    public static final class C0001a extends hc.c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C0001a(fc.d dVar) {
            super(dVar);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.getRywDataFromAwaitableCondition(null, this);
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class b extends hc.c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        public b(fc.d dVar) {
            super(dVar);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.setRywData(null, null, null, this);
        }
    }

    private final void checkConditionsAndComplete() {
        ArrayList arrayList = new ArrayList();
        for (i iVar : this.conditions) {
            k8.a aVar = (k8.a) iVar.f270g;
            b1 b1Var = (l) iVar.f271h;
            if (aVar.isMet(this.indexedTokens)) {
                i8.b rywData = aVar.getRywData(this.indexedTokens);
                if (((k1) b1Var).M() instanceof w0) {
                    ((m) b1Var).S(rywData);
                }
                arrayList.add(new i(aVar, b1Var));
            }
        }
        this.conditions.removeAll(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Type inference failed for: r5v6, types: [gd.a] */
    @Override // k8.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getRywDataFromAwaitableCondition(k8.a aVar, fc.d dVar) {
        C0001a c0001a;
        int i10;
        d dVar2;
        a aVar2;
        try {
            if (dVar instanceof C0001a) {
                c0001a = (C0001a) dVar;
                int i11 = c0001a.label;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    c0001a.label = i11 - Integer.MIN_VALUE;
                    Object obj = c0001a.result;
                    i10 = c0001a.label;
                    if (i10 != 0) {
                        v6.a.W(obj);
                        gd.a aVar3 = this.mutex;
                        c0001a.L$0 = this;
                        c0001a.L$1 = aVar;
                        c0001a.L$2 = aVar3;
                        c0001a.label = 1;
                        dVar2 = (d) aVar3;
                        Object c3 = dVar2.c(c0001a);
                        gc.a aVar4 = gc.a.f2559g;
                        if (c3 == aVar4) {
                            return aVar4;
                        }
                        aVar2 = this;
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ?? r5 = (gd.a) c0001a.L$2;
                        k8.a aVar5 = (k8.a) c0001a.L$1;
                        aVar2 = (a) c0001a.L$0;
                        v6.a.W(obj);
                        dVar2 = r5;
                        aVar = aVar5;
                    }
                    m mVar = new m(true);
                    mVar.P(null);
                    aVar2.conditions.add(new i(aVar, mVar));
                    aVar2.checkConditionsAndComplete();
                    return mVar;
                }
            }
            m mVar2 = new m(true);
            mVar2.P(null);
            aVar2.conditions.add(new i(aVar, mVar2));
            aVar2.checkConditionsAndComplete();
            return mVar2;
        } finally {
            dVar2.d(null);
        }
        c0001a = new C0001a(dVar);
        Object obj2 = c0001a.result;
        i10 = c0001a.label;
        if (i10 != 0) {
        }
    }

    @Override // k8.c
    public Object resolveConditionsWithID(String str, fc.d dVar) {
        ArrayList arrayList = new ArrayList();
        for (i iVar : this.conditions) {
            k8.a aVar = (k8.a) iVar.f270g;
            b1 b1Var = (l) iVar.f271h;
            if (j.a(aVar.getId(), str) && (((k1) b1Var).M() instanceof w0)) {
                ((m) b1Var).S(null);
            }
            arrayList.add(new i(aVar, b1Var));
        }
        this.conditions.removeAll(arrayList);
        return o.f277a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006a A[Catch: all -> 0x0073, TryCatch #0 {all -> 0x0073, blocks: (B:12:0x0062, B:14:0x006a, B:15:0x0075), top: B:11:0x0062 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Type inference failed for: r5v6, types: [gd.a] */
    @Override // k8.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object setRywData(String str, k8.b bVar, i8.b bVar2, fc.d dVar) {
        b bVar3;
        int i10;
        d dVar2;
        a aVar;
        Map<k8.b, i8.b> map;
        try {
            if (dVar instanceof b) {
                bVar3 = (b) dVar;
                int i11 = bVar3.label;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    bVar3.label = i11 - Integer.MIN_VALUE;
                    Object obj = bVar3.result;
                    i10 = bVar3.label;
                    if (i10 != 0) {
                        v6.a.W(obj);
                        gd.a aVar2 = this.mutex;
                        bVar3.L$0 = this;
                        bVar3.L$1 = str;
                        bVar3.L$2 = bVar;
                        bVar3.L$3 = bVar2;
                        bVar3.L$4 = aVar2;
                        bVar3.label = 1;
                        dVar2 = (d) aVar2;
                        Object c3 = dVar2.c(bVar3);
                        gc.a aVar3 = gc.a.f2559g;
                        if (c3 == aVar3) {
                            return aVar3;
                        }
                        aVar = this;
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ?? r5 = (gd.a) bVar3.L$4;
                        bVar2 = (i8.b) bVar3.L$3;
                        bVar = (k8.b) bVar3.L$2;
                        String str2 = (String) bVar3.L$1;
                        aVar = (a) bVar3.L$0;
                        v6.a.W(obj);
                        dVar2 = r5;
                        str = str2;
                    }
                    Map<String, Map<k8.b, i8.b>> map2 = aVar.indexedTokens;
                    map = map2.get(str);
                    if (map == null) {
                        map = new LinkedHashMap<>();
                        map2.put(str, map);
                    }
                    map.put(bVar, bVar2);
                    aVar.checkConditionsAndComplete();
                    dVar2.d(null);
                    return o.f277a;
                }
            }
            Map<String, Map<k8.b, i8.b>> map22 = aVar.indexedTokens;
            map = map22.get(str);
            if (map == null) {
            }
            map.put(bVar, bVar2);
            aVar.checkConditionsAndComplete();
            dVar2.d(null);
            return o.f277a;
        } catch (Throwable th) {
            dVar2.d(null);
            throw th;
        }
        bVar3 = new b(dVar);
        Object obj2 = bVar3.result;
        i10 = bVar3.label;
        if (i10 != 0) {
        }
    }
}
