package com.yandex.plus.bdui.flex.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.yandex.passport.internal.report.we;
import com.yandex.passport.internal.ui.sloth.authsdk.h0;
import defpackage.bow;
import defpackage.btf;
import defpackage.dfi;
import defpackage.f9f;
import defpackage.gld;
import defpackage.i04;
import defpackage.pm6;
import defpackage.rar;
import defpackage.saf;
import defpackage.tf6;
import defpackage.vz1;
import defpackage.w2f;
import defpackage.x97;
import defpackage.xq0;
import java.util.LinkedHashMap;
import java.util.WeakHashMap;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class b {
    public final com.yandex.plus.bdui.m a;
    public final f9f b;
    public final com.yandex.plus.bdui.ui.c c;
    public final Function2 d;
    public final com.yandex.passport.internal.ui.bouncer.o e;
    public final o f;
    public final s g;
    public final Function1 h;
    public final Function1 i;
    public final Function1 j;
    public final Function1 k;
    public final Function1 l;
    public final kotlinx.coroutines.a m;
    public final tf6 n;
    public final com.yandex.plus.log.api.b o;
    public final String p;
    public tf6 q;
    public com.yandex.passport.internal.entities.j r;

    public b(com.yandex.plus.bdui.m mVar, f9f f9fVar, com.yandex.plus.bdui.ui.c cVar, Function2 function2, com.yandex.passport.internal.ui.bouncer.o oVar, o oVar2, s sVar, Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function1 function15, kotlinx.coroutines.a aVar, tf6 tf6Var, com.yandex.plus.log.api.b bVar, String str) {
        f9fVar.getClass();
        cVar.getClass();
        aVar.getClass();
        bVar.getClass();
        this.a = mVar;
        this.b = f9fVar;
        this.c = cVar;
        this.d = function2;
        this.e = oVar;
        this.f = oVar2;
        this.g = sVar;
        this.h = function1;
        this.i = function12;
        this.j = function13;
        this.k = function14;
        this.l = function15;
        this.m = aVar;
        this.n = tf6Var;
        this.o = bVar;
        this.p = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.yandex.plus.bdui.flex.utils.c a(ViewGroup viewGroup) {
        com.yandex.passport.internal.flags.experiments.p pVar;
        viewGroup.getClass();
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.c;
        com.yandex.plus.log.api.b bVar = this.o;
        if (bVar.b(aVar)) {
            bVar.c(aVar, this.p, "onCreateView()");
        }
        c();
        kotlinx.coroutines.a aVar2 = this.m;
        aVar2.getClass();
        CoroutineContext coroutineContext = this.n.a;
        this.q = gld.e(coroutineContext.plus(new w2f(saf.Q(coroutineContext))).plus(aVar2));
        Context context = viewGroup.getContext();
        context.getClass();
        com.yandex.plus.bdui.flex.utils.c cVar = new com.yandex.plus.bdui.flex.utils.c(context);
        cVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        com.yandex.plus.bdui.ui.c cVar2 = this.c;
        View b = cVar2.b(cVar);
        Continuation continuation = null;
        Function2 function2 = this.d;
        if (function2 != null) {
            com.yandex.plus.bdui.content.a aVar3 = (com.yandex.plus.bdui.content.a) function2.invoke(null, null);
            com.yandex.plus.bdui.ui.a aVar4 = (com.yandex.plus.bdui.ui.a) this.e.invoke(aVar3);
            if (aVar4 != null) {
                pVar = new com.yandex.passport.internal.flags.experiments.p(aVar3, aVar4, aVar4.b(viewGroup));
                if (pVar != null) {
                    cVar.addView((View) pVar.d);
                    x97.D(kotlin.coroutines.g.a, new com.yandex.plus.bdui.ui.b((com.yandex.plus.bdui.ui.a) pVar.c, new com.yandex.plus.bdui.content.d(null, (com.yandex.plus.bdui.content.a) pVar.b, com.yandex.plus.bdui.shared.b.a, false), continuation, 0));
                }
                b.getClass();
                cVar2.getClass();
                com.yandex.passport.internal.entities.j jVar = new com.yandex.passport.internal.entities.j();
                jVar.a = cVar;
                jVar.b = b;
                jVar.c = cVar2;
                jVar.d = pVar;
                jVar.e = btf.b(new h0(26, jVar));
                this.r = jVar;
                return cVar;
            }
        }
        pVar = null;
        if (pVar != null) {
        }
        b.getClass();
        cVar2.getClass();
        com.yandex.passport.internal.entities.j jVar2 = new com.yandex.passport.internal.entities.j();
        jVar2.a = cVar;
        jVar2.b = b;
        jVar2.c = cVar2;
        jVar2.d = pVar;
        jVar2.e = btf.b(new h0(26, jVar2));
        this.r = jVar2;
        return cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x013e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(Object obj) {
        com.yandex.plus.bdui.shared.b bVar;
        LinkedHashMap linkedHashMap;
        LinkedHashMap linkedHashMap2;
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.c;
        com.yandex.plus.log.api.b bVar2 = this.o;
        boolean b = bVar2.b(aVar);
        String str = this.p;
        if (b) {
            bVar2.c(aVar, str, "onUpdateState()");
        }
        tf6 tf6Var = this.q;
        if (tf6Var != null) {
            Continuation continuation = null;
            if (!gld.T(tf6Var)) {
                tf6Var = null;
            }
            if (tf6Var != null) {
                Object invoke = this.j.invoke(obj);
                if (invoke != null) {
                    f9f f9fVar = this.b;
                    f9fVar.getClass();
                    Object C = bow.C(f9fVar, invoke);
                    if (C != null) {
                        com.yandex.plus.bdui.shared.b bVar3 = (com.yandex.plus.bdui.shared.b) this.k.invoke(obj);
                        Object invoke2 = this.i.invoke(obj);
                        com.yandex.plus.bdui.query.e eVar = (com.yandex.plus.bdui.query.e) this.h.invoke(obj);
                        we weVar = new we(this, C, continuation, 18);
                        i04 i04Var = new i04(this, obj, C, null);
                        o oVar = this.f;
                        WeakHashMap weakHashMap = oVar.c;
                        LinkedHashMap linkedHashMap3 = oVar.d;
                        invoke2.getClass();
                        bVar3.getClass();
                        com.yandex.plus.log.api.b bVar4 = oVar.b;
                        if (bVar4.b(aVar)) {
                            StringBuilder sb = new StringBuilder("scheduleUpdate(); updateId=");
                            sb.append(invoke2);
                            sb.append(", previewContentFactory ");
                            bVar = bVar3;
                            bVar4.c(aVar, "PlusUiControllerUpdateSchedulerImpl", vz1.s(sb, this.d != null ? "is not null" : "is null", ", previewContentControllerFactory ", "is not null"));
                        } else {
                            bVar = bVar3;
                        }
                        n nVar = (n) linkedHashMap3.get(invoke2);
                        n nVar2 = (n) weakHashMap.get(this);
                        if (nVar != null && nVar.equals(nVar2)) {
                            if (bVar4.b(aVar)) {
                                bVar4.c(aVar, "PlusUiControllerUpdateSchedulerImpl", dfi.g("scheduleUpdate(); coordinator for update ID ", " and controller already exists", invoke2));
                                return;
                            }
                            return;
                        }
                        if (nVar == null) {
                            if (bVar4.b(aVar)) {
                                bVar4.c(aVar, "PlusUiControllerUpdateSchedulerImpl", dfi.g("scheduleUpdate(); coordinator for update ID ", " not found, create new", invoke2));
                            }
                            nVar = (n) oVar.a.invoke(invoke2, this.a, tf6Var);
                            linkedHashMap3.put(invoke2, nVar);
                        }
                        n nVar3 = nVar;
                        com.yandex.plus.log.api.b bVar5 = nVar3.i;
                        LinkedHashMap linkedHashMap4 = nVar3.k;
                        if (nVar2 != null) {
                            i iVar = nVar2.j;
                            LinkedHashMap linkedHashMap5 = nVar2.k;
                            if (n.f(iVar)) {
                                linkedHashMap = linkedHashMap4;
                                com.yandex.plus.log.api.a aVar2 = com.yandex.plus.log.api.a.d;
                                if (bVar4.b(aVar2)) {
                                    bVar4.c(aVar2, "PlusUiControllerUpdateSchedulerImpl", "removeController(); controller already add to coordinator and update already started -> cancel update and remove coordinator itself");
                                }
                                nVar2.d();
                                oVar.a(nVar2);
                            } else {
                                if (bVar4.b(aVar)) {
                                    bVar4.c(aVar, "PlusUiControllerUpdateSchedulerImpl", "removeController(); controller already add to coordinator, remove controller from coordinator");
                                }
                                com.yandex.plus.log.api.b bVar6 = nVar2.i;
                                if (bVar6.b(aVar)) {
                                    linkedHashMap = linkedHashMap4;
                                    bVar6.c(aVar, "PlusUiControllerUpdateCoordinatorImpl", "removeUpdateTask()");
                                } else {
                                    linkedHashMap = linkedHashMap4;
                                }
                                if (!linkedHashMap5.containsKey(this)) {
                                    com.yandex.plus.log.api.a aVar3 = com.yandex.plus.log.api.a.d;
                                    if (bVar6.b(aVar3)) {
                                        linkedHashMap2 = linkedHashMap5;
                                        bVar6.c(aVar3, "PlusUiControllerUpdateCoordinatorImpl", "removeUpdateTask(); controller not added!");
                                        if (linkedHashMap2.isEmpty()) {
                                            if (bVar4.b(aVar)) {
                                                bVar4.c(aVar, "PlusUiControllerUpdateSchedulerImpl", "removeController(); coordinator empty now -> remove coordinator");
                                            }
                                            oVar.a(nVar2);
                                        }
                                    }
                                } else {
                                    if (n.f(nVar2.j)) {
                                        xq0.q("Update already started!");
                                        return;
                                    }
                                    linkedHashMap5.remove(this);
                                }
                                linkedHashMap2 = linkedHashMap5;
                                if (linkedHashMap2.isEmpty()) {
                                }
                            }
                        } else {
                            linkedHashMap = linkedHashMap4;
                        }
                        weakHashMap.put(this, nVar3);
                        LinkedHashMap linkedHashMap6 = linkedHashMap;
                        p pVar = new p(this, eVar, bVar, weVar, i04Var);
                        if (bVar5.b(aVar)) {
                            bVar5.c(aVar, "PlusUiControllerUpdateCoordinatorImpl", "addUpdateTask()");
                        }
                        if (linkedHashMap6.containsKey(this)) {
                            com.yandex.plus.log.api.a aVar4 = com.yandex.plus.log.api.a.d;
                            if (bVar5.b(aVar4)) {
                                bVar5.c(aVar4, "PlusUiControllerUpdateCoordinatorImpl", "addUpdateTask(); controller already added!");
                            }
                        } else {
                            if (n.f(nVar3.j)) {
                                xq0.q("Update already started!");
                                return;
                            }
                            linkedHashMap6.put(this, pVar);
                        }
                        if (this.c instanceof com.yandex.plus.bdui.ui.a) {
                            if (bVar4.b(aVar)) {
                                bVar4.c(aVar, "PlusUiControllerUpdateSchedulerImpl", "scheduleUpdate(); controller is ContentController, start update");
                            }
                            if (bVar4.b(aVar)) {
                                bVar4.c(aVar, "PlusUiControllerUpdateSchedulerImpl", "startUpdate()");
                            }
                            if (n.f(nVar3.j)) {
                                com.yandex.plus.log.api.a aVar5 = com.yandex.plus.log.api.a.d;
                                if (bVar4.b(aVar5)) {
                                    bVar4.c(aVar5, "PlusUiControllerUpdateSchedulerImpl", "startUpdate(); coordinator already started, ignore start");
                                    return;
                                }
                                return;
                            }
                            com.yandex.passport.internal.ui.challenge.vpn.c cVar = new com.yandex.passport.internal.ui.challenge.vpn.c(1, oVar, o.class, "removeCoordinator", "removeCoordinator(Lcom/yandex/plus/bdui/flex/ui/PlusUiControllerUpdateCoordinator;)V", 0, 11);
                            if (bVar5.b(aVar)) {
                                bVar5.c(aVar, "PlusUiControllerUpdateCoordinatorImpl", "startUpdate()");
                            }
                            if (n.f(nVar3.j)) {
                                xq0.q("Update can only be started once!");
                                return;
                            }
                            if (linkedHashMap6.isEmpty()) {
                                com.yandex.plus.log.api.a aVar6 = com.yandex.plus.log.api.a.d;
                                if (bVar5.b(aVar6)) {
                                    bVar5.c(aVar6, "PlusUiControllerUpdateCoordinatorImpl", "startUpdate(); update tasks not found!");
                                }
                                if (bVar5.b(aVar)) {
                                    bVar5.c(aVar, "PlusUiControllerUpdateCoordinatorImpl", "finishUpdate()");
                                }
                                nVar3.j = g.b;
                                cVar.invoke(nVar3);
                                return;
                            }
                            if (bVar5.b(aVar)) {
                                bVar5.c(aVar, "PlusUiControllerUpdateCoordinatorImpl", "startUpdate(); start update");
                            }
                            rar x = x97.x(nVar3.h, nVar3.f, pm6.b, new com.yandex.passport.internal.ui.sloth.q(nVar3, null, 26));
                            x.R(new com.yandex.passport.internal.ui.bouncer.o(22, nVar3, cVar));
                            com.yandex.passport.internal.ui.challenge.vpn.c cVar2 = nVar3.l;
                            if (cVar2 != null) {
                                nVar3.i(x, cVar2);
                            }
                            nVar3.l = null;
                            nVar3.j = new h(x);
                            x.start();
                            return;
                        }
                        return;
                    }
                }
                com.yandex.plus.log.api.a aVar7 = com.yandex.plus.log.api.a.e;
                if (bVar2.b(aVar7)) {
                    bVar2.c(aVar7, str, "onUpdateState(); " + ((String) this.l.invoke(obj)));
                    return;
                }
                return;
            }
        }
        com.yandex.plus.log.api.a aVar8 = com.yandex.plus.log.api.a.e;
        if (bVar2.b(aVar8)) {
            bVar2.c(aVar8, str, "onUpdateState(); update scope is not active!");
        }
    }

    public final void c() {
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.c;
        com.yandex.plus.log.api.b bVar = this.o;
        if (bVar.b(aVar)) {
            bVar.c(aVar, this.p, "reset()");
        }
        o oVar = this.f;
        com.yandex.plus.log.api.b bVar2 = oVar.b;
        if (bVar2.b(aVar)) {
            bVar2.c(aVar, "PlusUiControllerUpdateSchedulerImpl", "cancelUpdate()");
        }
        n nVar = (n) oVar.c.get(this);
        if (nVar != null) {
            nVar.d();
            oVar.a(nVar);
        } else {
            com.yandex.plus.log.api.a aVar2 = com.yandex.plus.log.api.a.d;
            if (bVar2.b(aVar2)) {
                bVar2.c(aVar2, "PlusUiControllerUpdateSchedulerImpl", "cancelUpdate(); started coordinator for controller not found, ignore cancel");
            }
        }
        this.g.g = null;
        tf6 tf6Var = this.q;
        if (tf6Var != null) {
            gld.L(tf6Var, null);
        }
        this.q = null;
        com.yandex.passport.internal.entities.j jVar = this.r;
        if (jVar != null) {
            com.yandex.plus.bdui.ui.c cVar = (com.yandex.plus.bdui.ui.c) jVar.c;
            View view = (View) jVar.b;
            com.yandex.plus.bdui.flex.utils.c cVar2 = (com.yandex.plus.bdui.flex.utils.c) jVar.a;
            int indexOfChild = cVar2.indexOfChild(view);
            if (indexOfChild >= 0) {
                cVar.a(view);
                cVar2.removeViewAt(indexOfChild);
            }
            com.yandex.passport.internal.flags.experiments.p pVar = (com.yandex.passport.internal.flags.experiments.p) jVar.d;
            if (pVar != null) {
                com.yandex.plus.bdui.ui.a aVar3 = (com.yandex.plus.bdui.ui.a) pVar.c;
                View view2 = (View) pVar.d;
                int indexOfChild2 = cVar2.indexOfChild(view2);
                if (indexOfChild2 >= 0) {
                    aVar3.a(view2);
                    cVar2.removeViewAt(indexOfChild2);
                }
            }
        }
        this.r = null;
    }
}
