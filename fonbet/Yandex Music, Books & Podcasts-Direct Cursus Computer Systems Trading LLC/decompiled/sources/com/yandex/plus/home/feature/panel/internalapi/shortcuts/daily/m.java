package com.yandex.plus.home.feature.panel.internalapi.shortcuts.daily;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.imageview.ShapeableImageView;
import com.yandex.passport.internal.methods.performer.v0;
import com.yandex.plus.bdui.flex.ui.s;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r1;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.u;
import com.yandex.plus.bdui.q;
import com.yandex.plus.home.feature.panel.internalapi.shortcuts.daily.progress.GiftProgressView;
import com.yandex.plus.home.feature.panel.internalapi.shortcuts.daily.services.DailyServicesView;
import defpackage.b6;
import defpackage.cg6;
import defpackage.ern;
import defpackage.f1d;
import defpackage.fq2;
import defpackage.jj4;
import defpackage.jk6;
import defpackage.jyr;
import defpackage.kcc;
import defpackage.lcc;
import defpackage.nm6;
import defpackage.pce;
import defpackage.pjt;
import defpackage.qgg;
import defpackage.s9f;
import defpackage.tf6;
import defpackage.u75;
import defpackage.vdr;
import defpackage.vzt;
import defpackage.wz0;
import defpackage.xq0;
import defpackage.yxm;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import ru.yandex.music.R;

/* loaded from: classes5.dex */
public final class m extends b6 {
    public static final /* synthetic */ s9f[] s = {new yxm(m.class, "topLayout", "getTopLayout()Landroid/view/ViewGroup;", 0), f1d.c(ern.a, m.class, "bottomLayout", "getBottomLayout()Landroid/view/ViewGroup;", 0)};
    public final vdr d;
    public final com.yandex.plus.core.theme.e e;
    public final com.yandex.plus.core.imageloader.b f;
    public final com.yandex.plus.home.feature.panel.internalapi.analytics.b g;
    public final com.yandex.plus.home.feature.panel.internalapi.c h;
    public final boolean i;
    public final kotlinx.coroutines.a j;
    public final com.yandex.plus.log.api.b k;
    public final com.yandex.plus.bdui.plus.content.controller.f l;
    public final com.yandex.plus.bdui.plus.content.controller.f m;
    public com.yandex.plus.home.feature.panel.internal.shortcuts.daily.top.b n;
    public com.yandex.plus.home.feature.panel.internal.shortcuts.daily.bottom.d o;
    public Context p;
    public final vzt q;
    public h r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n nVar, vdr vdrVar, com.yandex.plus.core.theme.e eVar, com.yandex.plus.core.imageloader.b bVar, com.yandex.plus.home.feature.panel.internalapi.analytics.b bVar2, com.yandex.plus.home.feature.panel.internalapi.c cVar, boolean z, kotlinx.coroutines.a aVar, kotlinx.coroutines.a aVar2, com.yandex.plus.log.api.b bVar3) {
        super(nVar, aVar);
        vdrVar.getClass();
        eVar.getClass();
        bVar.getClass();
        bVar2.getClass();
        cVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        bVar3.getClass();
        this.d = vdrVar;
        this.e = eVar;
        this.f = bVar;
        this.g = bVar2;
        this.h = cVar;
        this.i = z;
        this.j = aVar;
        this.k = bVar3;
        this.l = new com.yandex.plus.bdui.plus.content.controller.f(new l(nVar, 0));
        this.m = new com.yandex.plus.bdui.plus.content.controller.f(new l(nVar, 1));
        Context context = nVar.getContext();
        context.getClass();
        this.p = eVar.a(context, (com.yandex.plus.ui.core.theme.a) vdrVar.getValue());
        this.q = new vzt(nVar.getResources().getDimension(R.dimen.plus_sdk_panel_daily_corner_radius), new jk6(0, 11, m.class, this, "rippleColor", "getRippleColor()I"), bVar2, bVar, aVar2);
        com.yandex.plus.bdui.flex.ui.a.l(vdrVar, (tf6) this.c, new q(2, this, m.class, "onThemeChanged", "onThemeChanged(Lcom/yandex/plus/ui/core/theme/PlusTheme;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 24));
    }

    @Override // defpackage.b6
    public final void B() {
        com.yandex.plus.ui.core.theme.a aVar = (com.yandex.plus.ui.core.theme.a) this.d.getValue();
        View view = (View) this.b;
        Context context = view.getContext();
        context.getClass();
        this.p = this.e.a(context, aVar);
        com.yandex.plus.home.feature.panel.internal.shortcuts.daily.top.b bVar = this.n;
        s9f[] s9fVarArr = s;
        if (bVar == null) {
            this.n = new com.yandex.plus.home.feature.panel.internal.shortcuts.daily.top.b((ViewGroup) this.l.g(s9fVarArr[0]), this.f, this.i, this.h, this.j);
        }
        if (this.o == null) {
            this.o = new com.yandex.plus.home.feature.panel.internal.shortcuts.daily.bottom.d((ViewGroup) this.m.g(s9fVarArr[1]), this.f, this.i, this.j);
        }
        com.yandex.plus.bdui.flex.ui.a.j(((s) this.h).y(view, false), (tf6) this.c, new pjt(this, null, 27));
    }

    @Override // defpackage.b6
    public final void C() {
        this.n = null;
        this.o = null;
        com.yandex.plus.bdui.plus.analytics.b.d((tf6) this.c);
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.b;
        com.yandex.plus.log.api.b bVar = this.k;
        if (bVar.b(aVar)) {
            bVar.c(aVar, "PlusDailyViewController", "onViewDetachedToWindow() daily view detached");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object O(c cVar, com.yandex.plus.home.feature.panel.internal.shortcuts.daily.analytics.a aVar, cg6 cg6Var) {
        i iVar;
        int i;
        com.yandex.plus.home.feature.panel.internal.shortcuts.daily.bottom.d dVar;
        com.yandex.plus.home.feature.panel.internal.shortcuts.daily.bottom.d dVar2;
        com.yandex.plus.home.feature.panel.internal.shortcuts.daily.animation.b bVar;
        com.yandex.plus.home.feature.panel.internal.shortcuts.daily.d dVar3;
        if (cg6Var instanceof i) {
            iVar = (i) cg6Var;
            int i2 = iVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                iVar.m = i2 - Integer.MIN_VALUE;
                Object obj = iVar.k;
                nm6 nm6Var = nm6.a;
                i = iVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    ((ViewGroup) this.m.g(s[1])).setVisibility(cVar != null ? 0 : 8);
                    if (cVar != null && (dVar = this.o) != null) {
                        iVar.j = dVar;
                        iVar.m = 1;
                        Object b = this.q.b(cVar, aVar, iVar);
                        if (b == nm6Var) {
                            return nm6Var;
                        }
                        obj = b;
                        dVar2 = dVar;
                    }
                    return Unit.a;
                }
                if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dVar2 = iVar.j;
                qgg.h0(obj);
                com.yandex.plus.home.feature.panel.internal.shortcuts.daily.bottom.a aVar2 = (com.yandex.plus.home.feature.panel.internal.shortcuts.daily.bottom.a) obj;
                dVar2.getClass();
                bVar = dVar2.f;
                com.yandex.plus.bdui.plus.content.controller.f fVar = dVar2.m;
                com.yandex.plus.bdui.plus.content.controller.f fVar2 = dVar2.l;
                com.yandex.plus.bdui.plus.content.controller.f fVar3 = dVar2.g;
                View view = (View) dVar2.b;
                s9f[] s9fVarArr = com.yandex.plus.home.feature.panel.internal.shortcuts.daily.bottom.d.o;
                aVar2.getClass();
                View.OnClickListener onClickListener = aVar2.d;
                r1.E(view, onClickListener);
                view.setBackground(aVar2.a);
                u.C((TextView) fVar3.g(s9fVarArr[0]), onClickListener == null);
                com.yandex.plus.home.feature.panel.internal.shortcuts.daily.c.Q(aVar2.b, (TextView) fVar3.g(s9fVarArr[0]), new com.yandex.passport.internal.ui.bouncer.roundabout.k(21, dVar2));
                com.yandex.plus.home.feature.panel.internal.shortcuts.daily.c.Q(aVar2.c, (TextView) dVar2.h.g(s9fVarArr[1]), new com.yandex.plus.bdui.plus.webview.navigation.a(21));
                dVar3 = aVar2.g;
                dVar2.O(dVar3, (TextView) dVar2.k.g(s9fVarArr[4]));
                if (dVar3 == null) {
                    List list = aVar2.f;
                    DailyServicesView dailyServicesView = (DailyServicesView) dVar2.i.g(s9fVarArr[2]);
                    dailyServicesView.setVisibility(list != null ? 0 : 8);
                    if (list != null) {
                        dailyServicesView.setImagesCount(list.size());
                        kcc kccVar = new kcc(new lcc(new wz0(8, dailyServicesView), true, com.yandex.plus.home.feature.panel.internal.shortcuts.daily.bottom.b.a));
                        int i3 = 0;
                        while (kccVar.hasNext()) {
                            Object next = kccVar.next();
                            int i4 = i3 + 1;
                            if (i3 < 0) {
                                u75.n();
                                throw null;
                            }
                            com.yandex.plus.bdui.plus.content.controller.f b2 = ((com.yandex.plus.coil.b) dVar2.d).b((String) list.get(i3));
                            Drawable drawable = dVar2.n;
                            pce pceVar = (pce) b2.c;
                            pceVar.w = drawable;
                            pceVar.v = 0;
                            b2.i((ImageView) next);
                            i3 = i4;
                        }
                    }
                    if (list == null) {
                        com.yandex.plus.home.feature.panel.internal.shortcuts.daily.c.Q(aVar2.e, (TextView) dVar2.j.g(s9fVarArr[3]), new com.yandex.plus.bdui.plus.webview.navigation.a(21));
                    }
                }
                view.setContentDescription(aVar2.h);
                com.yandex.plus.home.feature.panel.internal.shortcuts.daily.e eVar = aVar2.i;
                s9f[] s9fVarArr2 = com.yandex.plus.home.feature.panel.internal.shortcuts.daily.bottom.d.o;
                dVar2.P(eVar, (ShapeableImageView) fVar2.g(s9fVarArr2[5]));
                dVar2.P(aVar2.j, (ShapeableImageView) fVar.g(s9fVarArr2[6]));
                jyr jyrVar = bVar.d;
                if (bVar.a) {
                    ((ValueAnimator) jyrVar.getValue()).removeAllUpdateListeners();
                    ((ValueAnimator) jyrVar.getValue()).cancel();
                }
                dVar2.S((ShapeableImageView) fVar2.g(s9fVarArr2[5]), new v0(13));
                dVar2.S((ShapeableImageView) fVar.g(s9fVarArr2[6]), new v0(14));
                if (bVar.a) {
                    ((ValueAnimator) bVar.d.getValue()).start();
                }
                return Unit.a;
            }
        }
        iVar = new i(this, cg6Var);
        Object obj2 = iVar.k;
        nm6 nm6Var2 = nm6.a;
        i = iVar.m;
        if (i != 0) {
        }
        com.yandex.plus.home.feature.panel.internal.shortcuts.daily.bottom.a aVar22 = (com.yandex.plus.home.feature.panel.internal.shortcuts.daily.bottom.a) obj2;
        dVar2.getClass();
        bVar = dVar2.f;
        com.yandex.plus.bdui.plus.content.controller.f fVar4 = dVar2.m;
        com.yandex.plus.bdui.plus.content.controller.f fVar22 = dVar2.l;
        com.yandex.plus.bdui.plus.content.controller.f fVar32 = dVar2.g;
        View view2 = (View) dVar2.b;
        s9f[] s9fVarArr3 = com.yandex.plus.home.feature.panel.internal.shortcuts.daily.bottom.d.o;
        aVar22.getClass();
        View.OnClickListener onClickListener2 = aVar22.d;
        r1.E(view2, onClickListener2);
        view2.setBackground(aVar22.a);
        u.C((TextView) fVar32.g(s9fVarArr3[0]), onClickListener2 == null);
        com.yandex.plus.home.feature.panel.internal.shortcuts.daily.c.Q(aVar22.b, (TextView) fVar32.g(s9fVarArr3[0]), new com.yandex.passport.internal.ui.bouncer.roundabout.k(21, dVar2));
        com.yandex.plus.home.feature.panel.internal.shortcuts.daily.c.Q(aVar22.c, (TextView) dVar2.h.g(s9fVarArr3[1]), new com.yandex.plus.bdui.plus.webview.navigation.a(21));
        dVar3 = aVar22.g;
        dVar2.O(dVar3, (TextView) dVar2.k.g(s9fVarArr3[4]));
        if (dVar3 == null) {
        }
        view2.setContentDescription(aVar22.h);
        com.yandex.plus.home.feature.panel.internal.shortcuts.daily.e eVar2 = aVar22.i;
        s9f[] s9fVarArr22 = com.yandex.plus.home.feature.panel.internal.shortcuts.daily.bottom.d.o;
        dVar2.P(eVar2, (ShapeableImageView) fVar22.g(s9fVarArr22[5]));
        dVar2.P(aVar22.j, (ShapeableImageView) fVar4.g(s9fVarArr22[6]));
        jyr jyrVar2 = bVar.d;
        if (bVar.a) {
        }
        dVar2.S((ShapeableImageView) fVar22.g(s9fVarArr22[5]), new v0(13));
        dVar2.S((ShapeableImageView) fVar4.g(s9fVarArr22[6]), new v0(14));
        if (bVar.a) {
        }
        return Unit.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object P(g gVar, boolean z, cg6 cg6Var) {
        j jVar;
        int i;
        com.yandex.plus.home.feature.panel.internal.shortcuts.daily.top.b bVar;
        boolean z2;
        ViewGroup.LayoutParams layoutParams;
        if (cg6Var instanceof j) {
            jVar = (j) cg6Var;
            int i2 = jVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jVar.m = i2 - Integer.MIN_VALUE;
                Object obj = jVar.k;
                nm6 nm6Var = nm6.a;
                i = jVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    com.yandex.plus.home.feature.panel.internal.shortcuts.daily.top.b bVar2 = this.n;
                    if (bVar2 != null) {
                        jVar.j = bVar2;
                        jVar.m = 1;
                        Object c = this.q.c(gVar, z, jVar);
                        if (c == nm6Var) {
                            return nm6Var;
                        }
                        bVar = bVar2;
                        obj = c;
                    }
                    return Unit.a;
                }
                if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                bVar = jVar.j;
                qgg.h0(obj);
                com.yandex.plus.home.feature.panel.internal.shortcuts.daily.top.a aVar = (com.yandex.plus.home.feature.panel.internal.shortcuts.daily.top.a) obj;
                bVar.getClass();
                com.yandex.plus.home.feature.panel.internal.shortcuts.daily.animation.b bVar3 = bVar.f;
                com.yandex.plus.bdui.plus.content.controller.f fVar = bVar.q;
                com.yandex.plus.bdui.plus.content.controller.f fVar2 = bVar.p;
                com.yandex.plus.bdui.plus.content.controller.f fVar3 = bVar.m;
                com.yandex.plus.bdui.plus.content.controller.f fVar4 = bVar.i;
                com.yandex.plus.bdui.plus.content.controller.f fVar5 = bVar.l;
                View view = (View) bVar.b;
                aVar.getClass();
                z2 = aVar.n;
                int k = r1.k(R.dimen.plus_sdk_panel_daily_top_layout_height, view);
                View.OnClickListener onClickListener = aVar.f;
                if (z2) {
                    k += r1.k(R.dimen.plus_sdk_panel_daily_bottom_layout_height, view);
                }
                layoutParams = view.getLayoutParams();
                if (layoutParams != null) {
                    jj4.j("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    return null;
                }
                layoutParams.height = k;
                view.setLayoutParams(layoutParams);
                int k2 = r1.k(z2 ? R.dimen.plus_sdk_panel_daily_button_big_height : R.dimen.plus_sdk_panel_daily_button_min_height, view);
                s9f[] s9fVarArr = com.yandex.plus.home.feature.panel.internal.shortcuts.daily.top.b.s;
                TextView textView = (TextView) fVar5.g(s9fVarArr[3]);
                ViewGroup.LayoutParams layoutParams2 = textView.getLayoutParams();
                if (layoutParams2 == null) {
                    jj4.j("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    return null;
                }
                layoutParams2.height = k2;
                textView.setLayoutParams(layoutParams2);
                r1.E(view, onClickListener != null ? new fq2(15, bVar, onClickListener) : null);
                view.setBackground(aVar.d);
                u.C((TextView) fVar4.g(s9fVarArr[0]), onClickListener != null);
                ((View) bVar.r.g(s9fVarArr[9])).setVisibility(aVar.e ? 0 : 8);
                com.yandex.plus.home.feature.panel.internal.shortcuts.daily.c.Q(aVar.a, (TextView) fVar4.g(s9fVarArr[0]), new com.yandex.passport.internal.ui.bouncer.roundabout.k(24, bVar));
                com.yandex.plus.home.feature.panel.internal.shortcuts.daily.c.Q(aVar.b, (TextView) bVar.j.g(s9fVarArr[1]), new com.yandex.plus.bdui.plus.webview.navigation.a(21));
                com.yandex.plus.home.feature.panel.internal.shortcuts.daily.c.Q(aVar.c, (TextView) bVar.k.g(s9fVarArr[2]), new com.yandex.plus.bdui.plus.webview.navigation.a(21));
                com.yandex.plus.home.feature.panel.internal.shortcuts.daily.d dVar = aVar.g;
                bVar.O(dVar, (TextView) fVar5.g(s9fVarArr[3]));
                if (dVar == null) {
                    com.yandex.plus.home.feature.panel.internalapi.shortcuts.daily.progress.d dVar2 = aVar.h;
                    ((GiftProgressView) fVar3.g(s9fVarArr[4])).setVisibility(dVar2 != null ? 0 : 8);
                    if (dVar2 != null) {
                        GiftProgressView giftProgressView = (GiftProgressView) fVar3.g(s9fVarArr[4]);
                        boolean z3 = bVar.g;
                        com.yandex.plus.home.feature.panel.internalapi.c cVar = bVar.h;
                        tf6 tf6Var = (tf6) bVar.c;
                        giftProgressView.getClass();
                        cVar.getClass();
                        tf6Var.getClass();
                        if (!giftProgressView.isLaidOut() || giftProgressView.isLayoutRequested()) {
                            giftProgressView.addOnLayoutChangeListener(new com.yandex.plus.home.feature.panel.internalapi.shortcuts.daily.progress.e(giftProgressView, z3, dVar2, cVar, tf6Var));
                        } else {
                            giftProgressView.l = z3;
                            GiftProgressView.p(giftProgressView, dVar2);
                            if (z3) {
                                com.yandex.plus.bdui.flex.ui.a.j(((s) cVar).y(giftProgressView, true), tf6Var, new pjt(giftProgressView, null, 28));
                            } else {
                                giftProgressView.invalidate();
                            }
                        }
                    }
                }
                com.yandex.plus.home.feature.panel.internal.shortcuts.daily.a aVar2 = aVar.i;
                bVar.T().setVisibility(aVar2 != null ? 0 : 8);
                if (aVar2 != null) {
                    bVar.T().setBackgroundTintList(ColorStateList.valueOf(aVar2.a.b));
                    bVar.T().setText(aVar2.b);
                }
                view.setContentDescription(aVar.k);
                bVar.P(aVar.j, (ShapeableImageView) bVar.o.g(s9fVarArr[6]));
                bVar.P(aVar.l, (ShapeableImageView) fVar2.g(s9fVarArr[7]));
                bVar.P(aVar.m, (ShapeableImageView) fVar.g(s9fVarArr[8]));
                jyr jyrVar = bVar3.d;
                if (bVar3.a) {
                    ((ValueAnimator) jyrVar.getValue()).removeAllUpdateListeners();
                    ((ValueAnimator) jyrVar.getValue()).cancel();
                }
                bVar.S((ShapeableImageView) fVar2.g(s9fVarArr[7]), new v0(15));
                bVar.S((ShapeableImageView) fVar.g(s9fVarArr[8]), new v0(16));
                if (bVar3.a) {
                    ((ValueAnimator) bVar3.d.getValue()).start();
                }
                return Unit.a;
            }
        }
        jVar = new j(this, cg6Var);
        Object obj2 = jVar.k;
        nm6 nm6Var2 = nm6.a;
        i = jVar.m;
        if (i != 0) {
        }
        com.yandex.plus.home.feature.panel.internal.shortcuts.daily.top.a aVar3 = (com.yandex.plus.home.feature.panel.internal.shortcuts.daily.top.a) obj2;
        bVar.getClass();
        com.yandex.plus.home.feature.panel.internal.shortcuts.daily.animation.b bVar32 = bVar.f;
        com.yandex.plus.bdui.plus.content.controller.f fVar6 = bVar.q;
        com.yandex.plus.bdui.plus.content.controller.f fVar22 = bVar.p;
        com.yandex.plus.bdui.plus.content.controller.f fVar32 = bVar.m;
        com.yandex.plus.bdui.plus.content.controller.f fVar42 = bVar.i;
        com.yandex.plus.bdui.plus.content.controller.f fVar52 = bVar.l;
        View view2 = (View) bVar.b;
        aVar3.getClass();
        z2 = aVar3.n;
        int k3 = r1.k(R.dimen.plus_sdk_panel_daily_top_layout_height, view2);
        View.OnClickListener onClickListener2 = aVar3.f;
        if (z2) {
        }
        layoutParams = view2.getLayoutParams();
        if (layoutParams != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00d6, code lost:
    
        if (O(r11, r6, r0) != r1) goto L50;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object Q(Continuation continuation) {
        k kVar;
        int i;
        h hVar;
        com.yandex.plus.home.feature.panel.internal.shortcuts.daily.analytics.a aVar;
        int i2;
        int i3;
        if (continuation instanceof k) {
            kVar = (k) continuation;
            int i4 = kVar.p;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                kVar.p = i4 - Integer.MIN_VALUE;
                Object obj = kVar.n;
                nm6 nm6Var = nm6.a;
                i = kVar.p;
                if (i != 0) {
                    qgg.h0(obj);
                    com.yandex.plus.log.api.a aVar2 = com.yandex.plus.log.api.a.b;
                    com.yandex.plus.log.api.b bVar = this.k;
                    if (bVar.b(aVar2)) {
                        bVar.c(aVar2, "PlusDailyViewController", "onStateChanged() data=" + this.r);
                    }
                    s9f[] s9fVarArr = s;
                    ViewGroup viewGroup = (ViewGroup) this.l.g(s9fVarArr[0]);
                    h hVar2 = this.r;
                    viewGroup.setVisibility((hVar2 != null ? hVar2.a : null) != null ? 0 : 8);
                    ViewGroup viewGroup2 = (ViewGroup) this.m.g(s9fVarArr[1]);
                    h hVar3 = this.r;
                    viewGroup2.setVisibility((hVar3 != null ? hVar3.b : null) != null ? 0 : 8);
                    hVar = this.r;
                    if (hVar != null) {
                        ?? r11 = hVar.b != null ? 1 : 0;
                        g gVar = hVar.a;
                        b bVar2 = gVar.i;
                        aVar = new com.yandex.plus.home.feature.panel.internal.shortcuts.daily.analytics.a(bVar2 != null ? bVar2.b : null);
                        kVar.j = hVar;
                        kVar.k = aVar;
                        kVar.l = 0;
                        kVar.m = r11;
                        kVar.p = 1;
                        if (P(gVar, r11, kVar) != nm6Var) {
                            i2 = 0;
                            i3 = r11;
                            c cVar = hVar.b;
                            kVar.j = null;
                            kVar.k = null;
                            kVar.l = i2;
                            kVar.m = i3;
                            kVar.p = 2;
                        }
                        return nm6Var;
                    }
                    return Unit.a;
                }
                if (i != 1) {
                    if (i == 2) {
                        qgg.h0(obj);
                        return Unit.a;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i3 = kVar.m;
                i2 = kVar.l;
                aVar = kVar.k;
                hVar = kVar.j;
                qgg.h0(obj);
                c cVar2 = hVar.b;
                kVar.j = null;
                kVar.k = null;
                kVar.l = i2;
                kVar.m = i3;
                kVar.p = 2;
            }
        }
        kVar = new k(this, continuation);
        Object obj2 = kVar.n;
        nm6 nm6Var2 = nm6.a;
        i = kVar.p;
        if (i != 0) {
        }
    }
}
