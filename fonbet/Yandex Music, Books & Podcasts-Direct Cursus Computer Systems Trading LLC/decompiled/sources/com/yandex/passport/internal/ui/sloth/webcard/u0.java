package com.yandex.passport.internal.ui.sloth.webcard;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import com.yandex.passport.R;
import com.yandex.passport.api.y1;
import com.yandex.passport.internal.report.ff;
import com.yandex.passport.internal.report.reporters.n1;
import com.yandex.passport.internal.report.reporters.r1;
import com.yandex.passport.internal.report.yd;
import com.yandex.passport.internal.ui.webview.WebViewActivity;
import defpackage.aur;
import defpackage.b6e;
import defpackage.g4i;
import defpackage.ldg;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.z7o;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class u0 extends aur implements Function2 {
    public final /* synthetic */ int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ WebCardSlothActivity l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u0(WebCardSlothActivity webCardSlothActivity, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = webCardSlothActivity;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                u0 u0Var = new u0(this.l, continuation, 0);
                u0Var.k = obj;
                return u0Var;
            case 1:
                u0 u0Var2 = new u0(this.l, continuation, 1);
                u0Var2.k = obj;
                return u0Var2;
            case 2:
                u0 u0Var3 = new u0(this.l, continuation, 2);
                u0Var3.k = obj;
                return u0Var3;
            default:
                u0 u0Var4 = new u0(this.l, continuation, 3);
                u0Var4.k = obj;
                return u0Var4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.j) {
            case 0:
                return ((u0) create((com.yandex.passport.sloth.ui.t0) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 1:
                return ((u0) create((com.yandex.passport.sloth.h0) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 2:
                return ((u0) create((com.yandex.passport.sloth.b1) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            default:
                return ((u0) create((com.yandex.passport.internal.sloth.performers.webcard.f) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ca  */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        c1 c1Var;
        c1 c1Var2;
        int i = this.j;
        WebCardSlothActivity webCardSlothActivity = this.l;
        switch (i) {
            case 0:
                com.yandex.passport.sloth.ui.t0 t0Var = (com.yandex.passport.sloth.ui.t0) this.k;
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                int i2 = WebCardSlothActivity.e;
                e1 ui = webCardSlothActivity.k().getUi();
                ui.getClass();
                t0Var.getClass();
                ((com.yandex.passport.sloth.ui.b0) ui.e.d.getValue()).e(t0Var);
                return Unit.a;
            case 1:
                com.yandex.passport.sloth.h0 h0Var = (com.yandex.passport.sloth.h0) this.k;
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                if (Intrinsics.d(h0Var, com.yandex.passport.sloth.x.a)) {
                    com.yandex.passport.internal.ui.a.r(webCardSlothActivity, com.yandex.plus.core.locale.b.w(n0.a));
                } else if (h0Var instanceof com.yandex.passport.sloth.c0) {
                    com.yandex.passport.internal.ui.a.r(webCardSlothActivity, com.yandex.plus.core.locale.b.w(new r0(((com.yandex.passport.sloth.c0) h0Var).a)));
                } else {
                    int i3 = WebCardSlothActivity.e;
                    webCardSlothActivity.k().getWebAmReporter().u(h0Var.toString(), n1.WEB_CARD);
                }
                return Unit.a;
            case 2:
                n0 n0Var = n0.b;
                com.yandex.passport.sloth.b1 b1Var = (com.yandex.passport.sloth.b1) this.k;
                nm6 nm6Var3 = nm6.a;
                qgg.h0(obj);
                if (Intrinsics.d(b1Var, com.yandex.passport.sloth.e.a)) {
                    com.yandex.passport.internal.ui.a.r(webCardSlothActivity, com.yandex.plus.core.locale.b.w(n0Var));
                } else if (b1Var instanceof com.yandex.passport.sloth.m0) {
                    com.yandex.passport.internal.ui.a.r(webCardSlothActivity, com.yandex.plus.core.locale.b.w(n0Var));
                } else if (Intrinsics.d(b1Var, com.yandex.passport.sloth.c.a)) {
                    int i4 = WebCardSlothActivity.e;
                    webCardSlothActivity.j();
                } else if (b1Var instanceof com.yandex.passport.sloth.m) {
                    List list = ((com.yandex.passport.sloth.m) b1Var).a;
                    int i5 = WebCardSlothActivity.e;
                    r1 webCardReporter = webCardSlothActivity.k().getWebCardReporter();
                    com.yandex.passport.api.exception.n nVar = com.yandex.passport.api.exception.o.Companion;
                    nVar.getClass();
                    com.yandex.passport.api.exception.o a = com.yandex.passport.api.exception.n.a(list);
                    webCardReporter.getClass();
                    webCardReporter.n(yd.d, new ff(a));
                    nVar.getClass();
                    com.yandex.passport.internal.ui.a.r(webCardSlothActivity, com.yandex.plus.core.locale.b.w(new p0(com.yandex.passport.api.exception.n.a(list))));
                } else if (b1Var instanceof com.yandex.passport.sloth.y0) {
                    com.yandex.passport.sloth.y0 y0Var = (com.yandex.passport.sloth.y0) b1Var;
                    com.yandex.passport.internal.ui.a.r(webCardSlothActivity, com.yandex.plus.core.locale.b.w(new q0(y0Var.a, y0Var.b)));
                } else if (b1Var instanceof com.yandex.passport.sloth.w) {
                    com.yandex.passport.internal.ui.a.r(webCardSlothActivity, com.yandex.plus.core.locale.b.w(new o0(((com.yandex.passport.sloth.w) b1Var).a)));
                } else {
                    int i6 = WebCardSlothActivity.e;
                    webCardSlothActivity.k().getWebAmReporter().u(com.yandex.passport.sloth.g.a(b1Var), n1.WEB_CARD);
                }
                return Unit.a;
            default:
                com.yandex.passport.internal.sloth.performers.webcard.f fVar = (com.yandex.passport.internal.sloth.performers.webcard.f) this.k;
                nm6 nm6Var4 = nm6.a;
                qgg.h0(obj);
                if (fVar instanceof com.yandex.passport.internal.sloth.performers.webcard.d) {
                    int i7 = WebCardSlothActivity.e;
                    e1 ui2 = webCardSlothActivity.k().getUi();
                    com.yandex.passport.internal.sloth.performers.webcard.d dVar = (com.yandex.passport.internal.sloth.performers.webcard.d) fVar;
                    String str = dVar.a;
                    ui2.getClass();
                    if (Intrinsics.d(str, "fullscreen")) {
                        ui2.O(Float.valueOf(0.0f), 0, 0, 0, c1.b, ui2.j);
                        View e = ui2.e();
                        int color = ui2.d.getColor(R.color.passport_roundabout_background);
                        e.getClass();
                        e.setBackgroundColor(color);
                    } else {
                        ldg.I(R.drawable.passport_bg_webcard, ui2.e());
                        if (str != null) {
                            int hashCode = str.hashCode();
                            if (hashCode != -1383228885) {
                                if (hashCode != -1364013995) {
                                    if (hashCode == 115029 && str.equals("top")) {
                                        c1Var2 = c1.a;
                                        c1Var = c1Var2;
                                    }
                                } else if (str.equals("center")) {
                                    c1Var2 = c1.b;
                                    c1Var = c1Var2;
                                }
                            } else if (str.equals("bottom")) {
                                c1Var2 = c1.c;
                                c1Var = c1Var2;
                            }
                            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "position " + c1Var, 8);
                            }
                            Float f = dVar.b;
                            Float valueOf = f == null ? Float.valueOf(f.floatValue() * g4i.a.density) : null;
                            Float f2 = dVar.d;
                            Integer valueOf2 = f2 == null ? Integer.valueOf((int) (f2.floatValue() * g4i.a.density)) : null;
                            Float f3 = dVar.c;
                            Integer valueOf3 = f3 == null ? Integer.valueOf((int) (f3.floatValue() * g4i.a.density)) : null;
                            Float f4 = dVar.e;
                            ui2.O(valueOf, valueOf2, valueOf3, f4 != null ? Integer.valueOf((int) (f4.floatValue() * g4i.a.density)) : null, c1Var, ui2.j);
                        }
                        c1Var = null;
                        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        }
                        Float f5 = dVar.b;
                        if (f5 == null) {
                        }
                        Float f22 = dVar.d;
                        if (f22 == null) {
                        }
                        Float f32 = dVar.c;
                        if (f32 == null) {
                        }
                        Float f42 = dVar.e;
                        ui2.O(valueOf, valueOf2, valueOf3, f42 != null ? Integer.valueOf((int) (f42.floatValue() * g4i.a.density)) : null, c1Var, ui2.j);
                    }
                } else if (fVar instanceof com.yandex.passport.internal.sloth.performers.webcard.c) {
                    Object obj2 = ((com.yandex.passport.internal.sloth.performers.webcard.c) fVar).a;
                    int i8 = WebCardSlothActivity.e;
                    r7o r7oVar = z7o.b;
                    if (!(obj2 instanceof t7o)) {
                        com.yandex.passport.internal.ui.d dVar2 = (com.yandex.passport.internal.ui.d) obj2;
                        int i9 = WebViewActivity.h;
                        com.yandex.passport.api.impl.b P = com.yandex.plus.core.network.api.utils.a.P(dVar2.c);
                        y1 y1Var = y1.a;
                        com.yandex.passport.internal.ui.webview.webcases.a0 a0Var = com.yandex.passport.internal.ui.webview.webcases.a0.CHANGE_PASSWORD;
                        String str2 = dVar2.a;
                        Uri uri = dVar2.b;
                        str2.getClass();
                        uri.getClass();
                        Bundle bundle = new Bundle();
                        bundle.putString("url", str2);
                        bundle.putParcelable("return_url", uri);
                        webCardSlothActivity.startActivity(com.yandex.passport.data.network.token.i.e(P, webCardSlothActivity, y1Var, a0Var, bundle));
                        webCardSlothActivity.finish();
                    }
                    if (z7o.a(obj2) != null) {
                        webCardSlothActivity.j();
                    }
                } else {
                    if (!(fVar instanceof com.yandex.passport.internal.sloth.performers.webcard.e)) {
                        b6e.s();
                        return null;
                    }
                    int i10 = WebCardSlothActivity.e;
                    webCardSlothActivity.j();
                }
                return Unit.a;
        }
    }
}
