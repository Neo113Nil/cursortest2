package com.onesignal.common.consistency.impl;

import S7.AbstractC0410y;
import S7.C0399m;
import S7.InterfaceC0398l;
import S7.V;
import S7.h0;
import a8.InterfaceC0451a;
import a8.d;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.h;
import q4.C4875b;
import s4.InterfaceC4974a;
import s4.c;
import u7.C5081g;
import u7.v;
import z7.InterfaceC5240d;
import z7.InterfaceC5245i;

/* loaded from: classes2.dex */
public final class a implements c {
    private final InterfaceC0451a mutex = new d();
    private final Map<String, Map<s4.b, C4875b>> indexedTokens = new LinkedHashMap();
    private final List<C5081g> conditions = new ArrayList();

    /* renamed from: com.onesignal.common.consistency.impl.a$a, reason: collision with other inner class name */
    public static final class C0175a extends B7.c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C0175a(InterfaceC5240d interfaceC5240d) {
            super(interfaceC5240d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.getRywDataFromAwaitableCondition(null, this);
        }
    }

    public static final class b extends B7.c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        public b(InterfaceC5240d interfaceC5240d) {
            super(interfaceC5240d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.setRywData(null, null, null, this);
        }
    }

    private final void checkConditionsAndComplete() {
        ArrayList arrayList = new ArrayList();
        for (C5081g c5081g : this.conditions) {
            InterfaceC4974a interfaceC4974a = (InterfaceC4974a) c5081g.f41052n;
            InterfaceC5245i interfaceC5245i = (InterfaceC0398l) c5081g.f41053u;
            if (interfaceC4974a.isMet(this.indexedTokens)) {
                C4875b rywData = interfaceC4974a.getRywData(this.indexedTokens);
                if (((h0) interfaceC5245i).C() instanceof V) {
                    ((C0399m) interfaceC5245i).J(rywData);
                }
                arrayList.add(new C5081g(interfaceC4974a, interfaceC5245i));
            }
        }
        this.conditions.removeAll(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r5v6, types: [a8.a] */
    @Override // s4.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getRywDataFromAwaitableCondition(InterfaceC4974a interfaceC4974a, InterfaceC5240d interfaceC5240d) {
        C0175a c0175a;
        int i;
        d dVar;
        a aVar;
        try {
            if (interfaceC5240d instanceof C0175a) {
                c0175a = (C0175a) interfaceC5240d;
                int i4 = c0175a.label;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    c0175a.label = i4 - Integer.MIN_VALUE;
                    Object obj = c0175a.result;
                    A7.a aVar2 = A7.a.f215n;
                    i = c0175a.label;
                    if (i != 0) {
                        Q3.b.s(obj);
                        InterfaceC0451a interfaceC0451a = this.mutex;
                        c0175a.L$0 = this;
                        c0175a.L$1 = interfaceC4974a;
                        c0175a.L$2 = interfaceC0451a;
                        c0175a.label = 1;
                        dVar = (d) interfaceC0451a;
                        if (dVar.c(c0175a) == aVar2) {
                            return aVar2;
                        }
                        aVar = this;
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ?? r52 = (InterfaceC0451a) c0175a.L$2;
                        InterfaceC4974a interfaceC4974a2 = (InterfaceC4974a) c0175a.L$1;
                        aVar = (a) c0175a.L$0;
                        Q3.b.s(obj);
                        dVar = r52;
                        interfaceC4974a = interfaceC4974a2;
                    }
                    C0399m a9 = AbstractC0410y.a();
                    aVar.conditions.add(new C5081g(interfaceC4974a, a9));
                    aVar.checkConditionsAndComplete();
                    return a9;
                }
            }
            C0399m a92 = AbstractC0410y.a();
            aVar.conditions.add(new C5081g(interfaceC4974a, a92));
            aVar.checkConditionsAndComplete();
            return a92;
        } finally {
            dVar.d(null);
        }
        c0175a = new C0175a(interfaceC5240d);
        Object obj2 = c0175a.result;
        A7.a aVar22 = A7.a.f215n;
        i = c0175a.label;
        if (i != 0) {
        }
    }

    @Override // s4.c
    public Object resolveConditionsWithID(String str, InterfaceC5240d interfaceC5240d) {
        ArrayList arrayList = new ArrayList();
        for (C5081g c5081g : this.conditions) {
            InterfaceC4974a interfaceC4974a = (InterfaceC4974a) c5081g.f41052n;
            InterfaceC5245i interfaceC5245i = (InterfaceC0398l) c5081g.f41053u;
            if (h.a(interfaceC4974a.getId(), str) && (((h0) interfaceC5245i).C() instanceof V)) {
                ((C0399m) interfaceC5245i).J(null);
            }
            arrayList.add(new C5081g(interfaceC4974a, interfaceC5245i));
        }
        this.conditions.removeAll(arrayList);
        return v.f41073a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006a A[Catch: all -> 0x0073, TryCatch #0 {all -> 0x0073, blocks: (B:12:0x0062, B:14:0x006a, B:15:0x0075), top: B:11:0x0062 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r5v6, types: [a8.a] */
    @Override // s4.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object setRywData(String str, s4.b bVar, C4875b c4875b, InterfaceC5240d interfaceC5240d) {
        b bVar2;
        int i;
        d dVar;
        a aVar;
        Map<s4.b, C4875b> map;
        try {
            if (interfaceC5240d instanceof b) {
                bVar2 = (b) interfaceC5240d;
                int i4 = bVar2.label;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    bVar2.label = i4 - Integer.MIN_VALUE;
                    Object obj = bVar2.result;
                    A7.a aVar2 = A7.a.f215n;
                    i = bVar2.label;
                    if (i != 0) {
                        Q3.b.s(obj);
                        InterfaceC0451a interfaceC0451a = this.mutex;
                        bVar2.L$0 = this;
                        bVar2.L$1 = str;
                        bVar2.L$2 = bVar;
                        bVar2.L$3 = c4875b;
                        bVar2.L$4 = interfaceC0451a;
                        bVar2.label = 1;
                        dVar = (d) interfaceC0451a;
                        if (dVar.c(bVar2) == aVar2) {
                            return aVar2;
                        }
                        aVar = this;
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ?? r52 = (InterfaceC0451a) bVar2.L$4;
                        c4875b = (C4875b) bVar2.L$3;
                        bVar = (s4.b) bVar2.L$2;
                        String str2 = (String) bVar2.L$1;
                        aVar = (a) bVar2.L$0;
                        Q3.b.s(obj);
                        dVar = r52;
                        str = str2;
                    }
                    Map<String, Map<s4.b, C4875b>> map2 = aVar.indexedTokens;
                    map = map2.get(str);
                    if (map == null) {
                        map = new LinkedHashMap<>();
                        map2.put(str, map);
                    }
                    map.put(bVar, c4875b);
                    aVar.checkConditionsAndComplete();
                    dVar.d(null);
                    return v.f41073a;
                }
            }
            Map<String, Map<s4.b, C4875b>> map22 = aVar.indexedTokens;
            map = map22.get(str);
            if (map == null) {
            }
            map.put(bVar, c4875b);
            aVar.checkConditionsAndComplete();
            dVar.d(null);
            return v.f41073a;
        } catch (Throwable th) {
            dVar.d(null);
            throw th;
        }
        bVar2 = new b(interfaceC5240d);
        Object obj2 = bVar2.result;
        A7.a aVar22 = A7.a.f215n;
        i = bVar2.label;
        if (i != 0) {
        }
    }
}
