package com.gamericefishpro.space.bc;

import com.gamericefishpro.space.cc.c;
import com.gamericefishpro.space.pi.a0;
import com.gamericefishpro.space.pi.l1;
import com.gamericefishpro.space.pi.m;
import com.gamericefishpro.space.pi.n;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements c {
    private final com.gamericefishpro.space.xi.a mutex = new com.gamericefishpro.space.xi.c();
    private final Map<String, Map<com.gamericefishpro.space.cc.b, com.gamericefishpro.space.zb.b>> indexedTokens = new LinkedHashMap();
    private final List<Pair<com.gamericefishpro.space.cc.a, m>> conditions = new ArrayList();

    /* JADX INFO: renamed from: com.gamericefishpro.space.bc.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class C0003a extends com.gamericefishpro.space.vh.c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C0003a(com.gamericefishpro.space.th.a aVar) {
            super(aVar);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.getRywDataFromAwaitableCondition(null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class b extends com.gamericefishpro.space.vh.c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        public b(com.gamericefishpro.space.th.a aVar) {
            super(aVar);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.setRywData(null, null, null, this);
        }
    }

    private final void checkConditionsAndComplete() {
        ArrayList arrayList = new ArrayList();
        for (Pair<com.gamericefishpro.space.cc.a, m> pair : this.conditions) {
            com.gamericefishpro.space.cc.a aVar = (com.gamericefishpro.space.cc.a) pair.d;
            CoroutineContext.Element element = (m) pair.e;
            if (aVar.isMet(this.indexedTokens)) {
                com.gamericefishpro.space.zb.b rywData = aVar.getRywData(this.indexedTokens);
                if (!((l1) element).U()) {
                    ((n) element).W(rywData);
                }
                arrayList.add(new Pair(aVar, element));
            }
        }
        this.conditions.removeAll(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.gamericefishpro.space.cc.c
    public Object getRywDataFromAwaitableCondition(com.gamericefishpro.space.cc.a aVar, com.gamericefishpro.space.th.a aVar2) {
        C0003a c0003a;
        com.gamericefishpro.space.xi.a aVar3;
        a aVar4;
        if (aVar2 instanceof C0003a) {
            c0003a = (C0003a) aVar2;
            int i = c0003a.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0003a.label = i - Integer.MIN_VALUE;
            } else {
                c0003a = new C0003a(aVar2);
            }
        } else {
            c0003a = new C0003a(aVar2);
        }
        Object obj = c0003a.result;
        com.gamericefishpro.space.uh.a aVar5 = com.gamericefishpro.space.uh.a.d;
        int i2 = c0003a.label;
        if (i2 == 0) {
            com.gamericefishpro.space.wa.b.P(obj);
            aVar3 = this.mutex;
            c0003a.L$0 = this;
            c0003a.L$1 = aVar;
            c0003a.L$2 = aVar3;
            c0003a.label = 1;
            if (aVar3.c(c0003a) == aVar5) {
                return aVar5;
            }
            aVar4 = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.gamericefishpro.space.xi.a aVar6 = (com.gamericefishpro.space.xi.a) c0003a.L$2;
            com.gamericefishpro.space.cc.a aVar7 = (com.gamericefishpro.space.cc.a) c0003a.L$1;
            aVar4 = (a) c0003a.L$0;
            com.gamericefishpro.space.wa.b.P(obj);
            aVar3 = aVar6;
            aVar = aVar7;
        }
        try {
            n nVarA = a0.a();
            aVar4.conditions.add(new Pair<>(aVar, nVarA));
            aVar4.checkConditionsAndComplete();
            return nVarA;
        } finally {
            aVar3.b(null);
        }
    }

    @Override // com.gamericefishpro.space.cc.c
    public Object resolveConditionsWithID(String str, com.gamericefishpro.space.th.a aVar) {
        ArrayList arrayList = new ArrayList();
        for (Pair<com.gamericefishpro.space.cc.a, m> pair : this.conditions) {
            com.gamericefishpro.space.cc.a aVar2 = (com.gamericefishpro.space.cc.a) pair.d;
            CoroutineContext.Element element = (m) pair.e;
            if (Intrinsics.a(aVar2.getId(), str) && !((l1) element).U()) {
                ((n) element).W(null);
            }
            arrayList.add(new Pair(aVar2, element));
        }
        this.conditions.removeAll(arrayList);
        return Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.gamericefishpro.space.cc.c
    public Object setRywData(String str, com.gamericefishpro.space.cc.b bVar, com.gamericefishpro.space.zb.b bVar2, com.gamericefishpro.space.th.a aVar) {
        b bVar3;
        com.gamericefishpro.space.xi.a aVar2;
        a aVar3;
        if (aVar instanceof b) {
            bVar3 = (b) aVar;
            int i = bVar3.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                bVar3.label = i - Integer.MIN_VALUE;
            } else {
                bVar3 = new b(aVar);
            }
        } else {
            bVar3 = new b(aVar);
        }
        Object obj = bVar3.result;
        com.gamericefishpro.space.uh.a aVar4 = com.gamericefishpro.space.uh.a.d;
        int i2 = bVar3.label;
        if (i2 == 0) {
            com.gamericefishpro.space.wa.b.P(obj);
            aVar2 = this.mutex;
            bVar3.L$0 = this;
            bVar3.L$1 = str;
            bVar3.L$2 = bVar;
            bVar3.L$3 = bVar2;
            bVar3.L$4 = aVar2;
            bVar3.label = 1;
            if (aVar2.c(bVar3) == aVar4) {
                return aVar4;
            }
            aVar3 = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.gamericefishpro.space.xi.a aVar5 = (com.gamericefishpro.space.xi.a) bVar3.L$4;
            bVar2 = (com.gamericefishpro.space.zb.b) bVar3.L$3;
            bVar = (com.gamericefishpro.space.cc.b) bVar3.L$2;
            String str2 = (String) bVar3.L$1;
            aVar3 = (a) bVar3.L$0;
            com.gamericefishpro.space.wa.b.P(obj);
            aVar2 = aVar5;
            str = str2;
        }
        try {
            Map<String, Map<com.gamericefishpro.space.cc.b, com.gamericefishpro.space.zb.b>> map = aVar3.indexedTokens;
            Map<com.gamericefishpro.space.cc.b, com.gamericefishpro.space.zb.b> linkedHashMap = map.get(str);
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap<>();
                map.put(str, linkedHashMap);
            }
            linkedHashMap.put(bVar, bVar2);
            aVar3.checkConditionsAndComplete();
            Unit unit = Unit.a;
            return Unit.a;
        } finally {
            aVar2.b(null);
        }
    }
}
