package ru.yandex.taxi.superapp.chat;

import defpackage.bi41;
import defpackage.c2x0;
import defpackage.d2x0;
import defpackage.dp41;
import defpackage.ffe;
import defpackage.h1p;
import defpackage.h55;
import defpackage.id00;
import defpackage.jst;
import defpackage.lnv0;
import defpackage.ms41;
import defpackage.ny61;
import defpackage.psv0;
import defpackage.pzt0;
import defpackage.qoi0;
import defpackage.qu;
import defpackage.rsv0;
import defpackage.tje;
import defpackage.to41;
import defpackage.zm41;
import defpackage.zy11;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.activity.ContentContainer$ZOrder;
import ru.yandex.taxi.superapp.chat.view.SuperAppChatView;
import ru.yandex.taxi.superapp.chat.view.e;
import ru.yandex.taxi.web.UiWebViewConfig;

/* loaded from: classes6.dex */
public final class a extends h55 {
    public final ffe D;
    public final rsv0 E;
    public final e F;
    public final c2x0 G;
    public final zm41 H;
    public SuperAppChatView I;
    public pzt0 J;

    public a(ffe ffeVar, rsv0 rsv0Var, e eVar, c2x0 c2x0Var, zm41 zm41Var) {
        super(null);
        this.D = ffeVar;
        this.E = rsv0Var;
        this.F = eVar;
        this.G = c2x0Var;
        this.H = zm41Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object P(a aVar, h1p h1pVar, String str, ContinuationImpl continuationImpl) {
        SuperAppChatRouterImpl$openChat$1 superAppChatRouterImpl$openChat$1;
        int i;
        Object b;
        Throwable a;
        aVar.getClass();
        if (continuationImpl instanceof SuperAppChatRouterImpl$openChat$1) {
            superAppChatRouterImpl$openChat$1 = (SuperAppChatRouterImpl$openChat$1) continuationImpl;
            int i2 = superAppChatRouterImpl$openChat$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superAppChatRouterImpl$openChat$1.label = i2 - Integer.MIN_VALUE;
                Object obj = superAppChatRouterImpl$openChat$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superAppChatRouterImpl$openChat$1.label;
                int i3 = 1;
                if (i != 0) {
                    b.b(obj);
                    e eVar = aVar.F;
                    superAppChatRouterImpl$openChat$1.L$0 = null;
                    superAppChatRouterImpl$openChat$1.L$1 = null;
                    superAppChatRouterImpl$openChat$1.label = 1;
                    b = eVar.b(h1pVar, str, superAppChatRouterImpl$openChat$1);
                    if (b == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                    b = ((Result) obj).getValue();
                }
                a = Result.a(b);
                if (a != null) {
                    jst.e.k(a, "Can not open superapp chat");
                    aVar.r(new qu(9));
                }
                if (!(b instanceof Result.Failure)) {
                    SuperAppChatView superAppChatView = new SuperAppChatView(id00.e(aVar.H, (UiWebViewConfig) b, bi41.D4, dp41.a, to41.a, ms41.a).c(), aVar.E, new lnv0(i3, aVar));
                    aVar.I = superAppChatView;
                    ((d2x0) aVar.G).e(0, qoi0.a(a.class));
                    ffe ffeVar = aVar.D;
                    superAppChatView.show(ffeVar.a, 0.0f);
                    ffeVar.a(superAppChatView, ContentContainer$ZOrder.MOST_IMPORTANT);
                }
                return zy11.a;
            }
        }
        superAppChatRouterImpl$openChat$1 = new SuperAppChatRouterImpl$openChat$1(aVar, continuationImpl);
        Object obj2 = superAppChatRouterImpl$openChat$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superAppChatRouterImpl$openChat$1.label;
        int i32 = 1;
        if (i != 0) {
        }
        a = Result.a(b);
        if (a != null) {
        }
        if (!(b instanceof Result.Failure)) {
        }
        return zy11.a;
    }

    @Override // defpackage.h55
    public final void G(Object obj) {
        psv0 psv0Var = (psv0) obj;
        SuperAppChatView superAppChatView = this.I;
        if (superAppChatView == null) {
            this.J = tje.N(o(), null, null, new SuperAppChatRouterImpl$onAttach$2$1(this, psv0Var, null), 3);
            return;
        }
        ((d2x0) this.G).e(0, qoi0.a(a.class));
        ffe ffeVar = this.D;
        superAppChatView.show(ffeVar.a, 0.0f);
        ffeVar.a(superAppChatView, ContentContainer$ZOrder.MOST_IMPORTANT);
    }

    @Override // defpackage.h55
    public final void H(Object obj) {
        SuperAppChatView superAppChatView = this.I;
        if (superAppChatView != null) {
            this.D.a.removeView(superAppChatView);
        }
        pzt0 pzt0Var = this.J;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.J = null;
    }

    @Override // defpackage.h55
    public final void I(Object obj) {
        this.I = null;
    }
}
