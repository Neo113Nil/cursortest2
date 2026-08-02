package com.yandex.plus.bdui.plus.scaffold.controller;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.yandex.plus.bdui.flex.ui.t;
import com.yandex.plus.bdui.m;
import com.yandex.plus.bdui.s;
import com.yandex.plus.core.insets.j;
import defpackage.btf;
import defpackage.cg6;
import defpackage.ern;
import defpackage.jyr;
import defpackage.l1p;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.tf6;
import defpackage.v75;
import defpackage.x97;
import defpackage.xq0;
import defpackage.zga;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class e implements com.yandex.plus.bdui.ui.c {
    public final s a;
    public final m b;
    public final tf6 c;
    public final com.yandex.plus.log.api.b d;
    public final jyr e;
    public b f;

    public e(s sVar, m mVar, List list, tf6 tf6Var, com.yandex.plus.log.api.b bVar) {
        sVar.getClass();
        mVar.getClass();
        list.getClass();
        bVar.getClass();
        this.a = sVar;
        this.b = mVar;
        this.c = tf6Var;
        this.d = bVar;
        this.e = btf.b(new zga(list, 8));
    }

    @Override // com.yandex.plus.bdui.ui.c
    public final void a(View view) {
        view.getClass();
        b bVar = this.f;
        if (bVar != null) {
            for (Pair pair : bVar.c) {
                ((com.yandex.plus.bdui.ui.a) pair.a).a((View) pair.b);
            }
            for (Pair pair2 : bVar.d) {
                ((com.yandex.plus.bdui.ui.a) pair2.a).a((View) pair2.b);
            }
        }
        this.f = null;
    }

    @Override // com.yandex.plus.bdui.ui.c
    public final View b(ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        context.getClass();
        a aVar = new a(context);
        aVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        aVar.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        aVar.addView(frameLayout, new LinearLayout.LayoutParams(-1, 0, 1.0f));
        this.f = new b(aVar, frameLayout);
        j jVar = j.c;
        com.yandex.plus.core.insets.d dVar = new com.yandex.plus.core.insets.d(0);
        com.yandex.plus.core.insets.a aVar2 = new com.yandex.plus.core.insets.a();
        aVar2.b = new LinkedHashSet(2);
        aVar2.d();
        aVar2.c();
        dVar.b.put(jVar, aVar2);
        dVar.b(aVar);
        return aVar;
    }

    public final Pair d(com.yandex.plus.bdui.content.a aVar) {
        Function2 function2;
        com.yandex.plus.log.api.b bVar = this.d;
        try {
            Pair a = ((com.yandex.plus.core.reflect.c) this.e.getValue()).a(aVar);
            if (a == null || (function2 = (Function2) a.b) == null) {
                throw new IllegalArgumentException("Unknown content class " + ern.a(aVar.getClass()).h());
            }
            com.yandex.plus.bdui.ui.a aVar2 = (com.yandex.plus.bdui.ui.a) function2.invoke(this.a, this.b);
            com.yandex.plus.log.api.a aVar3 = com.yandex.plus.log.api.a.c;
            if (bVar.b(aVar3)) {
                bVar.c(aVar3, "PlusTopBottomScaffoldController", "createController(): create controller for " + ern.a(aVar.getClass()).h() + " succeeded");
            }
            return new Pair(aVar, aVar2);
        } catch (Throwable th) {
            com.yandex.plus.log.api.a aVar4 = com.yandex.plus.log.api.a.e;
            if (bVar.b(aVar4)) {
                bVar.a(aVar4, "PlusTopBottomScaffoldController", "createController(): create controller for " + ern.a(aVar.getClass()).h() + " failed!", th);
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x01a5, code lost:
    
        if (f(r5, r8, r7, r3) != r4) goto L61;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /* JADX WARN: Type inference failed for: r15v10, types: [com.yandex.plus.bdui.flex.ui.t, com.yandex.plus.bdui.scaffold.b, java.util.ArrayList, java.util.List] */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r17v0, types: [com.yandex.plus.bdui.plus.scaffold.controller.e] */
    /* JADX WARN: Type inference failed for: r5v12, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(com.yandex.plus.bdui.scaffold.b bVar, t tVar, Continuation continuation) {
        c cVar;
        int i;
        ArrayList arrayList;
        ArrayList arrayList2;
        t tVar2;
        com.yandex.plus.bdui.scaffold.b bVar2;
        int i2;
        ArrayList arrayList3;
        com.yandex.plus.log.api.a aVar;
        t tVar3;
        com.yandex.plus.bdui.scaffold.b bVar3;
        List list;
        ?? r15;
        com.yandex.plus.log.api.a aVar2;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i3 = cVar.q;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                cVar.q = i3 - Integer.MIN_VALUE;
                Object obj = cVar.o;
                nm6 nm6Var = nm6.a;
                i = cVar.q;
                com.yandex.plus.log.api.b bVar4 = this.d;
                if (i != 0) {
                    qgg.h0(obj);
                    boolean z = bVar.d;
                    com.yandex.plus.bdui.plus.scaffold.a aVar3 = bVar.b;
                    if (!z) {
                        b bVar5 = this.f;
                        if (bVar5 != null) {
                            com.yandex.plus.log.api.a aVar4 = com.yandex.plus.log.api.a.c;
                            if (bVar4.b(aVar4)) {
                                StringBuilder sb = new StringBuilder("onUpdateStateAsync(): try to render headers = ");
                                List list2 = aVar3.a;
                                ArrayList arrayList4 = new ArrayList(v75.o(list2, 10));
                                Iterator it = list2.iterator();
                                while (it.hasNext()) {
                                    arrayList4.add(ern.a(((com.yandex.plus.bdui.content.a) it.next()).getClass()).h());
                                }
                                sb.append(arrayList4);
                                sb.append(" and footers = ");
                                List list3 = aVar3.b;
                                ArrayList arrayList5 = new ArrayList(v75.o(list3, 10));
                                Iterator it2 = list3.iterator();
                                while (it2.hasNext()) {
                                    arrayList5.add(ern.a(((com.yandex.plus.bdui.content.a) it2.next()).getClass()).h());
                                }
                                sb.append(arrayList5);
                                bVar4.c(aVar4, "PlusTopBottomScaffoldController", sb.toString());
                            }
                            List list4 = aVar3.a;
                            ArrayList arrayList6 = new ArrayList(v75.o(list4, 10));
                            Iterator it3 = list4.iterator();
                            while (it3.hasNext()) {
                                arrayList6.add(d((com.yandex.plus.bdui.content.a) it3.next()));
                            }
                            List list5 = aVar3.b;
                            arrayList = new ArrayList(v75.o(list5, 10));
                            Iterator it4 = list5.iterator();
                            while (it4.hasNext()) {
                                arrayList.add(d((com.yandex.plus.bdui.content.a) it4.next()));
                            }
                            CoroutineContext coroutineContext = this.c.a;
                            arrayList2 = null;
                            l1p l1pVar = new l1p(bVar5, arrayList6, arrayList, false ? 1 : 0, 28);
                            cVar.j = bVar;
                            tVar2 = tVar;
                            cVar.k = tVar2;
                            cVar.l = arrayList6;
                            cVar.m = arrayList;
                            cVar.n = 0;
                            cVar.q = 1;
                            if (x97.V(coroutineContext, l1pVar, cVar) != nm6Var) {
                                bVar2 = bVar;
                                i2 = 0;
                                arrayList3 = arrayList6;
                                aVar = com.yandex.plus.log.api.a.c;
                                if (bVar4.b(aVar)) {
                                }
                                cVar.j = bVar2;
                                cVar.k = tVar2;
                                cVar.l = arrayList2;
                                cVar.m = arrayList;
                                cVar.n = i2;
                                cVar.q = 2;
                                if (f(arrayList3, bVar2, tVar2, cVar) != nm6Var) {
                                }
                            }
                            return nm6Var;
                        }
                        com.yandex.plus.log.api.a aVar5 = com.yandex.plus.log.api.a.d;
                        if (bVar4.b(aVar5)) {
                            bVar4.c(aVar5, "PlusTopBottomScaffoldController", "onUpdateStateAsync(); holder not found!");
                        }
                    }
                } else {
                    if (i == 1) {
                        i2 = cVar.n;
                        List list6 = cVar.m;
                        arrayList3 = cVar.l;
                        t tVar4 = cVar.k;
                        bVar2 = cVar.j;
                        qgg.h0(obj);
                        arrayList = list6;
                        tVar2 = tVar4;
                        arrayList2 = null;
                        aVar = com.yandex.plus.log.api.a.c;
                        if (bVar4.b(aVar)) {
                            bVar4.c(aVar, "PlusTopBottomScaffoldController", "onUpdateStateAsync(); update headers...");
                        }
                        cVar.j = bVar2;
                        cVar.k = tVar2;
                        cVar.l = arrayList2;
                        cVar.m = arrayList;
                        cVar.n = i2;
                        cVar.q = 2;
                        if (f(arrayList3, bVar2, tVar2, cVar) != nm6Var) {
                            tVar3 = tVar2;
                            bVar3 = bVar2;
                            list = arrayList;
                            r15 = arrayList2;
                            aVar2 = com.yandex.plus.log.api.a.c;
                            if (bVar4.b(aVar2)) {
                            }
                            cVar.j = r15;
                            cVar.k = r15;
                            cVar.l = r15;
                            cVar.m = r15;
                            cVar.n = i2;
                            cVar.q = 3;
                        }
                        return nm6Var;
                    }
                    if (i == 2) {
                        i2 = cVar.n;
                        list = cVar.m;
                        tVar3 = cVar.k;
                        bVar3 = cVar.j;
                        qgg.h0(obj);
                        r15 = 0;
                        aVar2 = com.yandex.plus.log.api.a.c;
                        if (bVar4.b(aVar2)) {
                            bVar4.c(aVar2, "PlusTopBottomScaffoldController", "onUpdateStateAsync(); update footers...");
                        }
                        cVar.j = r15;
                        cVar.k = r15;
                        cVar.l = r15;
                        cVar.m = r15;
                        cVar.n = i2;
                        cVar.q = 3;
                    } else {
                        if (i != 3) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        List list7 = cVar.m;
                        qgg.h0(obj);
                    }
                }
                return Unit.a;
            }
        }
        cVar = new c(this, continuation);
        Object obj2 = cVar.o;
        nm6 nm6Var2 = nm6.a;
        i = cVar.q;
        com.yandex.plus.log.api.b bVar42 = this.d;
        if (i != 0) {
        }
        return Unit.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(List list, com.yandex.plus.bdui.scaffold.b bVar, t tVar, cg6 cg6Var) {
        d dVar;
        int i;
        Iterator it;
        int i2;
        t tVar2;
        com.yandex.plus.bdui.scaffold.b bVar2;
        if (cg6Var instanceof d) {
            dVar = (d) cg6Var;
            int i3 = dVar.p;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                dVar.p = i3 - Integer.MIN_VALUE;
                Object obj = dVar.n;
                nm6 nm6Var = nm6.a;
                i = dVar.p;
                if (i != 0) {
                    qgg.h0(obj);
                    it = list.iterator();
                    i2 = 0;
                    tVar2 = tVar;
                    bVar2 = bVar;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i2 = dVar.m;
                    it = dVar.l;
                    t tVar3 = dVar.k;
                    com.yandex.plus.bdui.scaffold.b bVar3 = dVar.j;
                    qgg.h0(obj);
                    tVar2 = tVar3;
                    bVar2 = bVar3;
                }
                while (it.hasNext()) {
                    Pair pair = (Pair) it.next();
                    com.yandex.plus.bdui.content.a aVar = (com.yandex.plus.bdui.content.a) pair.a;
                    com.yandex.plus.bdui.ui.a aVar2 = (com.yandex.plus.bdui.ui.a) pair.b;
                    com.yandex.plus.bdui.content.d dVar2 = new com.yandex.plus.bdui.content.d(bVar2.a, aVar, bVar2.c, bVar2.d);
                    aVar2.getClass();
                    dVar.j = bVar2;
                    dVar.k = tVar2;
                    dVar.l = it;
                    dVar.m = i2;
                    dVar.p = 1;
                    if (aVar2.c(dVar2, tVar2, dVar) == nm6Var) {
                        return nm6Var;
                    }
                }
                return Unit.a;
            }
        }
        dVar = new d(this, cg6Var);
        Object obj2 = dVar.n;
        nm6 nm6Var2 = nm6.a;
        i = dVar.p;
        if (i != 0) {
        }
        while (it.hasNext()) {
        }
        return Unit.a;
    }
}
