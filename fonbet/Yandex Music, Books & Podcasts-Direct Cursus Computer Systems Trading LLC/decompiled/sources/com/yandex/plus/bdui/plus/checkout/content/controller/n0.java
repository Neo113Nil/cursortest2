package com.yandex.plus.bdui.plus.checkout.content.controller;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import defpackage.b6e;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.xq0;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class n0 extends c {
    public final /* synthetic */ int c;
    public final String d;
    public final com.yandex.plus.paymentsdk.internal.method.e e;
    public final com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.j f;
    public final com.yandex.plus.bdui.plus.checkout.utils.a g;
    public final com.yandex.plus.log.api.b h;
    public Context i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(com.yandex.plus.bdui.m mVar, Context context, String str, int i, com.yandex.plus.paymentsdk.internal.method.e eVar, com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.j jVar, com.yandex.plus.log.api.b bVar, int i2) {
        super(mVar, i);
        this.c = i2;
        mVar.getClass();
        eVar.getClass();
        bVar.getClass();
        switch (i2) {
            case 1:
                super(mVar, i);
                this.d = str;
                this.e = eVar;
                this.f = jVar;
                this.g = com.yandex.plus.bdui.plus.checkout.utils.a.a;
                this.h = bVar;
                this.i = context;
                break;
            default:
                this.d = str;
                this.e = eVar;
                this.f = jVar;
                this.g = com.yandex.plus.bdui.plus.checkout.utils.a.a;
                this.h = bVar;
                this.i = context;
                break;
        }
    }

    public static String d(String str, com.yandex.plus.bdui.action.a aVar, Map map) {
        return "onUpdateStateAsync(); dispatch " + str + " action = " + aVar + " with payload = " + map;
    }

    public static String e(String str, com.yandex.plus.bdui.action.a aVar, Map map) {
        return "onUpdateStateAsync(); dispatch " + str + " action = " + aVar + " with payload = " + map;
    }

    @Override // com.yandex.plus.bdui.plus.checkout.content.controller.c, com.yandex.plus.bdui.ui.c
    public final View b(ViewGroup viewGroup) {
        int i = this.c;
        viewGroup.getClass();
        switch (i) {
            case 0:
                Context context = viewGroup.getContext();
                context.getClass();
                this.i = context;
                break;
            default:
                Context context2 = viewGroup.getContext();
                context2.getClass();
                this.i = context2;
                break;
        }
        return super.b(viewGroup);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0197  */
    @Override // com.yandex.plus.bdui.ui.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(com.yandex.plus.bdui.content.d dVar, com.yandex.plus.bdui.flex.ui.t tVar, Continuation continuation) {
        m0 m0Var;
        int i;
        com.yandex.plus.log.api.a aVar;
        com.yandex.plus.log.api.b bVar;
        boolean z;
        o0 o0Var;
        int i2;
        com.yandex.plus.log.api.a aVar2;
        com.yandex.plus.log.api.b bVar2;
        boolean z2;
        com.yandex.plus.bdui.content.d dVar2 = dVar;
        switch (this.c) {
            case 0:
                if (continuation instanceof m0) {
                    m0Var = (m0) continuation;
                    int i3 = m0Var.m;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        m0Var.m = i3 - Integer.MIN_VALUE;
                        Object obj = m0Var.k;
                        nm6 nm6Var = nm6.a;
                        i = m0Var.m;
                        if (i != 0) {
                            qgg.h0(obj);
                            if (!dVar2.d) {
                                com.yandex.plus.bdui.plus.auth.b bVar3 = (com.yandex.plus.bdui.plus.auth.b) this.f.get();
                                com.yandex.plus.core.data.pay.d dVar3 = new com.yandex.plus.core.data.pay.d(bVar3 != null ? bVar3.b : null, bVar3 != null ? new Long(bVar3.a) : null, bVar3 != null ? bVar3.c : null);
                                Context context = this.i;
                                com.yandex.plus.bdui.plus.checkout.content.r rVar = (com.yandex.plus.bdui.plus.checkout.content.r) dVar2.b;
                                String str = rVar.c;
                                if (str == null) {
                                    str = this.d;
                                }
                                String str2 = rVar.a;
                                String str3 = rVar.b;
                                com.yandex.plus.paymentsdk.internal.method.e eVar = this.e;
                                eVar.getClass();
                                context.getClass();
                                com.yandex.passport.sloth.ui.dependencies.m mVar = new com.yandex.passport.sloth.ui.dependencies.m(eVar.a, context, dVar3, str, str2, str3, eVar.b, eVar.c);
                                com.yandex.passport.internal.ui.bouncer.roundabout.k kVar = new com.yandex.passport.internal.ui.bouncer.roundabout.k(16, this);
                                m0Var.j = dVar2;
                                m0Var.m = 1;
                                obj = com.yandex.plus.bdui.flex.ui.a.g(mVar, kVar, m0Var);
                                if (obj == nm6Var) {
                                }
                            }
                            break;
                        } else if (i != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            dVar2 = m0Var.j;
                            qgg.h0(obj);
                        }
                        com.yandex.plus.core.data.pay.t tVar2 = (com.yandex.plus.core.data.pay.t) obj;
                        aVar = com.yandex.plus.log.api.a.c;
                        bVar = this.h;
                        if (bVar.b(aVar)) {
                            bVar.c(aVar, "PlusPayUserAddNewCardContentController", "bindNewCard(); terminal state - ".concat(com.yandex.plus.bdui.plus.analytics.b.M(tVar2)));
                        }
                        z = tVar2 instanceof com.yandex.plus.core.data.pay.s;
                        com.yandex.plus.bdui.m mVar2 = this.a;
                        if (!z) {
                            String id = ((com.yandex.plus.core.data.pay.s) tVar2).b.getId();
                            this.g.getClass();
                            Map b = com.yandex.plus.bdui.plus.checkout.utils.a.b(id);
                            if (bVar.b(aVar)) {
                                bVar.c(aVar, "PlusPayUserAddNewCardContentController", d("next", ((com.yandex.plus.bdui.plus.checkout.content.r) dVar2.b).d, b));
                            }
                            mVar2.a.a(((com.yandex.plus.bdui.plus.checkout.content.r) dVar2.b).d, new com.yandex.plus.bdui.action.h(dVar2.c), b);
                        } else if (!Intrinsics.d(tVar2, com.yandex.plus.core.data.pay.h.INSTANCE)) {
                            if (!(tVar2 instanceof com.yandex.plus.core.data.pay.k)) {
                                b6e.s();
                                break;
                            } else {
                                if (bVar.b(aVar)) {
                                    bVar.c(aVar, "PlusPayUserAddNewCardContentController", d("fail", ((com.yandex.plus.bdui.plus.checkout.content.r) dVar2.b).f, null));
                                }
                                mVar2.a.a(((com.yandex.plus.bdui.plus.checkout.content.r) dVar2.b).f, new com.yandex.plus.bdui.action.h(dVar2.c), null);
                            }
                        } else {
                            if (bVar.b(aVar)) {
                                bVar.c(aVar, "PlusPayUserAddNewCardContentController", d("cancel", ((com.yandex.plus.bdui.plus.checkout.content.r) dVar2.b).e, null));
                            }
                            mVar2.a.a(((com.yandex.plus.bdui.plus.checkout.content.r) dVar2.b).e, new com.yandex.plus.bdui.action.h(dVar2.c), null);
                        }
                    }
                }
                m0Var = new m0(this, continuation);
                Object obj2 = m0Var.k;
                nm6 nm6Var2 = nm6.a;
                i = m0Var.m;
                if (i != 0) {
                }
                com.yandex.plus.core.data.pay.t tVar22 = (com.yandex.plus.core.data.pay.t) obj2;
                aVar = com.yandex.plus.log.api.a.c;
                bVar = this.h;
                if (bVar.b(aVar)) {
                }
                z = tVar22 instanceof com.yandex.plus.core.data.pay.s;
                com.yandex.plus.bdui.m mVar22 = this.a;
                if (!z) {
                }
                break;
            default:
                if (continuation instanceof o0) {
                    o0Var = (o0) continuation;
                    int i4 = o0Var.m;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        o0Var.m = i4 - Integer.MIN_VALUE;
                        Object obj3 = o0Var.k;
                        nm6 nm6Var3 = nm6.a;
                        i2 = o0Var.m;
                        if (i2 != 0) {
                            qgg.h0(obj3);
                            if (!dVar2.d) {
                                com.yandex.plus.bdui.plus.auth.b bVar4 = (com.yandex.plus.bdui.plus.auth.b) this.f.get();
                                com.yandex.plus.core.data.pay.d dVar4 = new com.yandex.plus.core.data.pay.d(bVar4 != null ? bVar4.b : null, bVar4 != null ? new Long(bVar4.a) : null, bVar4 != null ? bVar4.c : null);
                                Context context2 = this.i;
                                com.yandex.plus.bdui.plus.checkout.content.s sVar = (com.yandex.plus.bdui.plus.checkout.content.s) dVar2.b;
                                String str4 = sVar.c;
                                if (str4 == null) {
                                    str4 = this.d;
                                }
                                String str5 = sVar.a;
                                String str6 = sVar.b;
                                com.yandex.plus.paymentsdk.internal.method.e eVar2 = this.e;
                                eVar2.getClass();
                                context2.getClass();
                                com.yandex.passport.sloth.ui.dependencies.m mVar3 = new com.yandex.passport.sloth.ui.dependencies.m(eVar2.a, new com.yandex.plus.core.debug.panel.internal.utils.resource.a(context2, 1), context2, dVar4, str4, str5, str6, eVar2.c);
                                com.yandex.passport.internal.ui.bouncer.roundabout.k kVar2 = new com.yandex.passport.internal.ui.bouncer.roundabout.k(17, this);
                                o0Var.j = dVar2;
                                o0Var.m = 1;
                                obj3 = com.yandex.plus.bdui.flex.ui.a.g(mVar3, kVar2, o0Var);
                                if (obj3 == nm6Var3) {
                                }
                            }
                            break;
                        } else if (i2 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            dVar2 = o0Var.j;
                            qgg.h0(obj3);
                        }
                        com.yandex.plus.core.data.pay.t tVar3 = (com.yandex.plus.core.data.pay.t) obj3;
                        aVar2 = com.yandex.plus.log.api.a.c;
                        bVar2 = this.h;
                        if (bVar2.b(aVar2)) {
                            bVar2.c(aVar2, "PlusPayUserAddNewSbpContentController", "bindNewSbpToken(); terminal state - ".concat(com.yandex.plus.bdui.plus.analytics.b.M(tVar3)));
                        }
                        z2 = tVar3 instanceof com.yandex.plus.core.data.pay.s;
                        com.yandex.plus.bdui.m mVar4 = this.a;
                        if (!z2) {
                            String id2 = ((com.yandex.plus.core.data.pay.s) tVar3).b.getId();
                            this.g.getClass();
                            Map b2 = com.yandex.plus.bdui.plus.checkout.utils.a.b(id2);
                            if (bVar2.b(aVar2)) {
                                bVar2.c(aVar2, "PlusPayUserAddNewSbpContentController", e("next", ((com.yandex.plus.bdui.plus.checkout.content.s) dVar2.b).d, b2));
                            }
                            mVar4.a.a(((com.yandex.plus.bdui.plus.checkout.content.s) dVar2.b).d, new com.yandex.plus.bdui.action.h(dVar2.c), b2);
                        } else if (!Intrinsics.d(tVar3, com.yandex.plus.core.data.pay.h.INSTANCE)) {
                            if (!(tVar3 instanceof com.yandex.plus.core.data.pay.k)) {
                                b6e.s();
                                break;
                            } else {
                                if (bVar2.b(aVar2)) {
                                    bVar2.c(aVar2, "PlusPayUserAddNewSbpContentController", e("fail", ((com.yandex.plus.bdui.plus.checkout.content.s) dVar2.b).f, null));
                                }
                                mVar4.a.a(((com.yandex.plus.bdui.plus.checkout.content.s) dVar2.b).f, new com.yandex.plus.bdui.action.h(dVar2.c), null);
                            }
                        } else {
                            if (bVar2.b(aVar2)) {
                                bVar2.c(aVar2, "PlusPayUserAddNewSbpContentController", e("cancel", ((com.yandex.plus.bdui.plus.checkout.content.s) dVar2.b).e, null));
                            }
                            mVar4.a.a(((com.yandex.plus.bdui.plus.checkout.content.s) dVar2.b).e, new com.yandex.plus.bdui.action.h(dVar2.c), null);
                        }
                    }
                }
                o0Var = new o0(this, continuation);
                Object obj32 = o0Var.k;
                nm6 nm6Var32 = nm6.a;
                i2 = o0Var.m;
                if (i2 != 0) {
                }
                com.yandex.plus.core.data.pay.t tVar32 = (com.yandex.plus.core.data.pay.t) obj32;
                aVar2 = com.yandex.plus.log.api.a.c;
                bVar2 = this.h;
                if (bVar2.b(aVar2)) {
                }
                z2 = tVar32 instanceof com.yandex.plus.core.data.pay.s;
                com.yandex.plus.bdui.m mVar42 = this.a;
                if (!z2) {
                }
                break;
        }
        return Unit.a;
    }
}
