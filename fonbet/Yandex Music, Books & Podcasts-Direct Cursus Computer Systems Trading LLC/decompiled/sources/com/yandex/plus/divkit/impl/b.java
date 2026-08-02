package com.yandex.plus.divkit.impl;

import android.view.View;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r1;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.u;
import defpackage.bd8;
import defpackage.dfi;
import defpackage.eb9;
import defpackage.gc8;
import defpackage.hrg;
import defpackage.k5r;
import defpackage.l1a;
import defpackage.qr;
import defpackage.r7o;
import defpackage.s09;
import defpackage.t7o;
import defpackage.tw8;
import defpackage.xzb;
import defpackage.yb8;
import defpackage.z7o;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class b implements yb8 {
    public final com.yandex.plus.bdui.plus.content.controller.k b;
    public final com.yandex.plus.log.api.b c;

    public b(com.yandex.plus.bdui.plus.content.controller.k kVar, com.yandex.plus.log.api.b bVar) {
        bVar.getClass();
        this.b = kVar;
        this.c = bVar;
    }

    @Override // defpackage.yb8
    public final void a(gc8 gc8Var, xzb xzbVar, View view, bd8 bd8Var, String str) {
        xzbVar.getClass();
        view.getClass();
        str.getClass();
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.c;
        com.yandex.plus.log.api.b bVar = this.c;
        if (bVar.b(aVar)) {
            bVar.c(aVar, "Div2LoggerImpl", "logClick(action=" + r1.s(bd8Var, xzbVar) + ", actionUid=" + str + ')');
        }
        w(xzbVar, bd8Var, str, new a(xzbVar, this, view, gc8Var, 2));
    }

    @Override // defpackage.yb8
    public final void b(gc8 gc8Var, xzb xzbVar, View view, bd8 bd8Var) {
        xzbVar.getClass();
        view.getClass();
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.c;
        com.yandex.plus.log.api.b bVar = this.c;
        if (bVar.b(aVar)) {
            bVar.c(aVar, "Div2LoggerImpl", "logClick(action=" + r1.s(bd8Var, xzbVar) + ')');
        }
        w(xzbVar, bd8Var, null, new a(xzbVar, this, view, gc8Var, 6));
    }

    @Override // defpackage.yb8
    public final void c(int i) {
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.c;
        com.yandex.plus.log.api.b bVar = this.c;
        if (bVar.b(aVar)) {
            bVar.c(aVar, "Div2LoggerImpl", hrg.o("logTabPageChanged(selectedTab=", i, ')'));
        }
    }

    @Override // defpackage.yb8
    public final void d(gc8 gc8Var, xzb xzbVar, int i, String str, bd8 bd8Var) {
        xzbVar.getClass();
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.c;
        com.yandex.plus.log.api.b bVar = this.c;
        if (bVar.b(aVar)) {
            StringBuilder r = k5r.r(i, "logPopupMenuItemClick(position=", ", text=", str, ", action=");
            r.append(bd8Var);
            r.append(')');
            bVar.c(aVar, "Div2LoggerImpl", r.toString());
        }
    }

    @Override // defpackage.yb8
    public final void e(gc8 gc8Var, xzb xzbVar, View view, bd8 bd8Var) {
        xzbVar.getClass();
        view.getClass();
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.c;
        com.yandex.plus.log.api.b bVar = this.c;
        if (bVar.b(aVar)) {
            bVar.c(aVar, "Div2LoggerImpl", "logImeEnter(action=" + r1.s(bd8Var, xzbVar) + ')');
        }
        w(xzbVar, bd8Var, null, new a(xzbVar, this, view, gc8Var, 8));
    }

    @Override // defpackage.yb8
    public final void f(gc8 gc8Var, bd8 bd8Var) {
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.c;
        com.yandex.plus.log.api.b bVar = this.c;
        if (bVar.b(aVar)) {
            StringBuilder sb = new StringBuilder("logTrigger(action=");
            sb.append(r1.s(bd8Var, gc8Var != null ? gc8Var.getExpressionResolver() : null));
            sb.append(')');
            bVar.c(aVar, "Div2LoggerImpl", sb.toString());
        }
    }

    @Override // defpackage.yb8
    public final void g(gc8 gc8Var, xzb xzbVar, eb9 eb9Var, int i, String str) {
        xzbVar.getClass();
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.c;
        com.yandex.plus.log.api.b bVar = this.c;
        if (bVar.b(aVar)) {
            bVar.c(aVar, "Div2LoggerImpl", "logPagerChangePage(currentPageIndex=" + i + ", scrollDirection=" + str + ')');
        }
    }

    @Override // defpackage.yb8
    public final void h(gc8 gc8Var, xzb xzbVar, View view, bd8 bd8Var, boolean z) {
        xzbVar.getClass();
        view.getClass();
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.c;
        com.yandex.plus.log.api.b bVar = this.c;
        if (bVar.b(aVar)) {
            bVar.c(aVar, "Div2LoggerImpl", "logHoverChanged(action=" + r1.s(bd8Var, xzbVar) + ", hovered=" + z + ')');
        }
        w(xzbVar, bd8Var, null, new a(xzbVar, this, view, gc8Var, z, 1));
    }

    @Override // defpackage.yb8
    public final void i(gc8 gc8Var, xzb xzbVar, View view, bd8 bd8Var) {
        xzbVar.getClass();
        view.getClass();
        bd8Var.getClass();
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.c;
        com.yandex.plus.log.api.b bVar = this.c;
        if (bVar.b(aVar)) {
            bVar.c(aVar, "Div2LoggerImpl", "logLongClick(action=" + r1.s(bd8Var, xzbVar) + ')');
        }
        w(xzbVar, bd8Var, null, new a(xzbVar, this, view, gc8Var, 0));
    }

    @Override // defpackage.yb8
    public final void j(gc8 gc8Var, xzb xzbVar, int i, bd8 bd8Var) {
        xzbVar.getClass();
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.c;
        com.yandex.plus.log.api.b bVar = this.c;
        if (bVar.b(aVar)) {
            StringBuilder q = k5r.q(i, "logTabPageChanged(selectedTab=", ", action=");
            q.append(r1.s(bd8Var, xzbVar));
            q.append(')');
            bVar.c(aVar, "Div2LoggerImpl", q.toString());
        }
    }

    @Override // defpackage.yb8
    public final void k(gc8 gc8Var, xzb xzbVar, s09 s09Var, int i, int i2, String str) {
        xzbVar.getClass();
        str.getClass();
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.c;
        com.yandex.plus.log.api.b bVar = this.c;
        if (bVar.b(aVar)) {
            bVar.c(aVar, "Div2LoggerImpl", dfi.i(dfi.l("logGalleryCompleteScroll(firstVisibleItem=", i, i2, ", lastVisibleItem=", ", scrollDirection="), str, ')'));
        }
    }

    @Override // defpackage.yb8
    public final void l() {
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.c;
        com.yandex.plus.log.api.b bVar = this.c;
        if (bVar.b(aVar)) {
            bVar.c(aVar, "Div2LoggerImpl", "logTabTitlesScroll()");
        }
    }

    @Override // defpackage.yb8
    public final void m(gc8 gc8Var, xzb xzbVar, View view, bd8 bd8Var, boolean z) {
        xzbVar.getClass();
        view.getClass();
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.c;
        com.yandex.plus.log.api.b bVar = this.c;
        if (bVar.b(aVar)) {
            bVar.c(aVar, "Div2LoggerImpl", "logPressChanged(action=" + r1.s(bd8Var, xzbVar) + ", isPressed=" + z + ')');
        }
        w(xzbVar, bd8Var, null, new a(xzbVar, this, view, gc8Var, z, 4));
    }

    @Override // defpackage.yb8
    public final void n(gc8 gc8Var, xzb xzbVar, View view, bd8 bd8Var) {
        xzbVar.getClass();
        view.getClass();
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.c;
        com.yandex.plus.log.api.b bVar = this.c;
        if (bVar.b(aVar)) {
            bVar.c(aVar, "Div2LoggerImpl", "logSwipedAway(action=" + bd8Var + ')');
        }
    }

    @Override // defpackage.yb8
    public final void o(gc8 gc8Var, xzb xzbVar, View view, bd8 bd8Var) {
        xzbVar.getClass();
        view.getClass();
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.c;
        com.yandex.plus.log.api.b bVar = this.c;
        if (bVar.b(aVar)) {
            bVar.c(aVar, "Div2LoggerImpl", "logDoubleClick(action=" + r1.s(bd8Var, xzbVar) + ')');
        }
        w(xzbVar, bd8Var, null, new a(xzbVar, this, view, gc8Var, 7));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.yb8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void p(gc8 gc8Var, xzb xzbVar, View view, tw8 tw8Var) {
        xzb xzbVar2;
        Object t7oVar;
        gc8Var.getClass();
        xzbVar.getClass();
        view.getClass();
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.c;
        com.yandex.plus.log.api.b bVar = this.c;
        if (bVar.b(aVar)) {
            bVar.c(aVar, "Div2LoggerImpl", "logViewDisappeared(disappearAction=" + r1.t(tw8Var, xzbVar) + ')');
        }
        com.yandex.plus.bdui.plus.content.controller.k kVar = this.b;
        if (kVar == null) {
            return;
        }
        try {
            r7o r7oVar = z7o.b;
            xzbVar2 = xzbVar;
            try {
                t7oVar = r1.b(xzbVar2, tw8Var.getUrl(), tw8Var.c(), tw8Var.a(), null, false);
            } catch (Throwable th) {
                th = th;
                Throwable th2 = th;
                r7o r7oVar2 = z7o.b;
                t7oVar = new t7o(th2);
                if (t7oVar instanceof t7o) {
                }
                if (((com.yandex.plus.divkit.api.a) t7oVar) != null) {
                }
            }
        } catch (Throwable th3) {
            th = th3;
            xzbVar2 = xzbVar;
        }
        if (t7oVar instanceof t7o) {
            t7oVar = null;
        }
        if (((com.yandex.plus.divkit.api.a) t7oVar) != null) {
            return;
        }
        u.K(xzbVar2, bVar, "Div2LoggerImpl");
        String logId = gc8Var.getLogId();
        logId.getClass();
        kVar.a.invoke(new com.yandex.plus.bdui.flex.ui.content.c(23), logId);
    }

    @Override // defpackage.yb8
    public final void q(Float f) {
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.c;
        com.yandex.plus.log.api.b bVar = this.c;
        if (bVar.b(aVar)) {
            bVar.c(aVar, "Div2LoggerImpl", "logSliderDrag(value=" + f + ')');
        }
    }

    @Override // defpackage.yb8
    public final void r(gc8 gc8Var, xzb xzbVar, View view, bd8 bd8Var, String str) {
        xzbVar.getClass();
        view.getClass();
        bd8Var.getClass();
        str.getClass();
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.c;
        com.yandex.plus.log.api.b bVar = this.c;
        if (bVar.b(aVar)) {
            bVar.c(aVar, "Div2LoggerImpl", "logLongClick(action=" + r1.s(bd8Var, xzbVar) + ", actionUid=" + str + ')');
        }
        w(xzbVar, bd8Var, str, new a(xzbVar, this, view, gc8Var, 3));
    }

    @Override // defpackage.yb8
    public final void s(gc8 gc8Var, xzb xzbVar, View view, bd8 bd8Var, boolean z) {
        xzbVar.getClass();
        view.getClass();
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.c;
        com.yandex.plus.log.api.b bVar = this.c;
        if (bVar.b(aVar)) {
            bVar.c(aVar, "Div2LoggerImpl", "logFocusChanged(action=" + r1.s(bd8Var, xzbVar) + ", haveFocus=" + z + ')');
        }
        w(xzbVar, bd8Var, null, new qr(22, xzbVar, this, view, gc8Var, z));
    }

    @Override // defpackage.yb8
    public final void t(gc8 gc8Var, xzb xzbVar, View view, bd8 bd8Var, String str) {
        xzbVar.getClass();
        view.getClass();
        str.getClass();
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.c;
        com.yandex.plus.log.api.b bVar = this.c;
        if (bVar.b(aVar)) {
            bVar.c(aVar, "Div2LoggerImpl", "logDoubleClick(action=" + r1.s(bd8Var, xzbVar) + ", actionUid=" + str + ')');
        }
        w(xzbVar, bd8Var, str, new a(xzbVar, this, view, gc8Var, 5));
    }

    @Override // defpackage.yb8
    public final void u() {
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.c;
        com.yandex.plus.log.api.b bVar = this.c;
        if (bVar.b(aVar)) {
            bVar.c(aVar, "Div2LoggerImpl", "logGalleryScroll()");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.yb8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(gc8 gc8Var, xzb xzbVar, View view, l1a l1aVar) {
        xzb xzbVar2;
        Object t7oVar;
        gc8Var.getClass();
        xzbVar.getClass();
        view.getClass();
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.c;
        com.yandex.plus.log.api.b bVar = this.c;
        if (bVar.b(aVar)) {
            bVar.c(aVar, "Div2LoggerImpl", "logViewShown(visibilityAction=" + r1.t(l1aVar, xzbVar) + ')');
        }
        com.yandex.plus.bdui.plus.content.controller.k kVar = this.b;
        if (kVar == null) {
            return;
        }
        try {
            r7o r7oVar = z7o.b;
            xzbVar2 = xzbVar;
            try {
                t7oVar = r1.b(xzbVar2, l1aVar.getUrl(), l1aVar.c(), l1aVar.a(), null, false);
            } catch (Throwable th) {
                th = th;
                Throwable th2 = th;
                r7o r7oVar2 = z7o.b;
                t7oVar = new t7o(th2);
                if (t7oVar instanceof t7o) {
                }
                if (((com.yandex.plus.divkit.api.a) t7oVar) != null) {
                }
            }
        } catch (Throwable th3) {
            th = th3;
            xzbVar2 = xzbVar;
        }
        if (t7oVar instanceof t7o) {
            t7oVar = null;
        }
        if (((com.yandex.plus.divkit.api.a) t7oVar) != null) {
            return;
        }
        u.K(xzbVar2, bVar, "Div2LoggerImpl");
        String logId = gc8Var.getLogId();
        logId.getClass();
        kVar.a.invoke(new com.yandex.plus.bdui.flex.ui.content.c(22), logId);
    }

    public final void w(xzb xzbVar, bd8 bd8Var, String str, Function2 function2) {
        Object t7oVar;
        com.yandex.plus.bdui.plus.content.controller.k kVar = this.b;
        if (kVar == null) {
            return;
        }
        bd8Var.getClass();
        xzbVar.getClass();
        try {
            r7o r7oVar = z7o.b;
            t7oVar = r1.b(xzbVar, bd8Var.k, bd8Var.f, bd8Var.c, str, false);
        } catch (Throwable th) {
            r7o r7oVar2 = z7o.b;
            t7oVar = new t7o(th);
        }
        if (t7oVar instanceof t7o) {
            t7oVar = null;
        }
        com.yandex.plus.divkit.api.a aVar = (com.yandex.plus.divkit.api.a) t7oVar;
        if (aVar == null) {
            return;
        }
        function2.invoke(kVar, aVar);
    }
}
