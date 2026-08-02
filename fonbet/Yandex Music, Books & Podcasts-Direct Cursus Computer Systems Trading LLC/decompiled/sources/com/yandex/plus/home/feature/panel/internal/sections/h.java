package com.yandex.plus.home.feature.panel.internal.sections;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r1;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.u;
import com.yandex.plus.core.data.common.v;
import com.yandex.plus.core.data.common.y;
import com.yandex.plus.home.repository.api.model.panel.b0;
import com.yandex.plus.home.repository.api.model.panel.d0;
import com.yandex.plus.home.repository.api.model.panel.o;
import com.yandex.plus.home.repository.api.model.panel.p;
import com.yandex.plus.home.repository.api.model.panel.q;
import com.yandex.plus.home.repository.api.model.panel.r;
import com.yandex.plus.home.repository.api.model.panel.s;
import com.yandex.plus.home.repository.api.model.panel.t;
import com.yandex.plus.home.repository.api.model.panel.w;
import com.yandex.plus.home.repository.api.model.panel.x;
import com.yandex.plus.home.repository.api.model.panel.z;
import defpackage.b6e;
import defpackage.btf;
import defpackage.jj4;
import defpackage.jyr;
import defpackage.kcc;
import defpackage.la8;
import defpackage.lcc;
import defpackage.rj7;
import defpackage.s9f;
import defpackage.u75;
import defpackage.vdr;
import defpackage.wz0;
import defpackage.xz0;
import defpackage.z75;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import ru.yandex.music.R;

/* loaded from: classes5.dex */
public final class h extends l {
    public static final /* synthetic */ int B0 = 0;
    public com.yandex.plus.home.feature.panel.internal.shortcuts.lite.statusandfamily.c A0;
    public final com.yandex.plus.log.api.b K;
    public final Function1 L;
    public final Function2 v0;
    public final Function1 w0;
    public final int x0;
    public final jyr y0;
    public com.yandex.plus.home.feature.panel.internal.shortcuts.lite.family.f z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(@NotNull Context context, @NotNull com.yandex.plus.core.imageloader.b bVar, @NotNull com.yandex.plus.core.strings.a aVar, @NotNull vdr vdrVar, @NotNull com.yandex.plus.core.theme.e eVar, com.yandex.plus.home.feature.panel.internalapi.b bVar2, @NotNull com.yandex.plus.home.feature.panel.internalapi.c cVar, @NotNull kotlinx.coroutines.a aVar2, @NotNull com.yandex.plus.log.api.b bVar3, @NotNull Function1<? super d0, Unit> function1, @NotNull Function2<? super d0, ? super Boolean, Unit> function2, @NotNull Function1<? super com.yandex.plus.home.feature.panel.internalapi.analytics.f, Unit> function12) {
        super(context, bVar, vdrVar, eVar, aVar, bVar2, cVar, aVar2, function12);
        context.getClass();
        bVar.getClass();
        aVar.getClass();
        vdrVar.getClass();
        eVar.getClass();
        cVar.getClass();
        aVar2.getClass();
        bVar3.getClass();
        function1.getClass();
        function2.getClass();
        function12.getClass();
        this.K = bVar3;
        this.L = function1;
        this.v0 = function2;
        this.w0 = function12;
        this.x0 = getResources().getDimensionPixelSize(R.dimen.plus_sdk_panel_shortcut_height);
        this.y0 = btf.b(new com.yandex.plus.bdui.plus.checkout.h(29, this));
    }

    private final void setHeightBasedOnPosition(com.yandex.plus.home.feature.panel.internalapi.shortcuts.lite.minipromo.c cVar) {
        ViewGroup.LayoutParams layoutParams = cVar.getLayoutParams();
        com.yandex.plus.home.feature.panel.internal.base.a aVar = layoutParams instanceof com.yandex.plus.home.feature.panel.internal.base.a ? (com.yandex.plus.home.feature.panel.internal.base.a) layoutParams : null;
        if (aVar != null) {
            ViewGroup.LayoutParams layoutParams2 = cVar.getLayoutParams();
            if (layoutParams2 == null) {
                jj4.j("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                return;
            }
            boolean z = aVar.t == 0 && aVar.v == 0;
            layoutParams2.height = z ? -2 : this.x0;
            cVar.setIsLong(z);
            cVar.setLayoutParams(layoutParams2);
        }
    }

    public final com.yandex.plus.home.feature.panel.internal.shortcuts.lite.family.b A(o oVar) {
        String str = oVar.c;
        String str2 = oVar.d;
        com.yandex.plus.core.theme.c e = getThemeResolver().e(oVar.e);
        com.yandex.plus.home.feature.panel.internal.a themeResolver = getThemeResolver();
        v vVar = oVar.f;
        com.yandex.plus.core.theme.c e2 = themeResolver.e(vVar);
        com.yandex.plus.core.data.common.k c = getThemeResolver().c(vVar);
        d0 d0Var = oVar.g;
        if (d0Var == null) {
            c = null;
        }
        return new com.yandex.plus.home.feature.panel.internal.shortcuts.lite.family.b(str, str2, e, e2, c, getThemeResolver().c(oVar.i), getThemeResolver().a(), z(d0Var), oVar.j);
    }

    @Override // com.yandex.plus.home.feature.panel.internal.sections.l
    @NotNull
    public com.yandex.plus.home.feature.panel.internal.stub.a getStubConfig() {
        return (com.yandex.plus.home.feature.panel.internal.stub.a) this.y0.getValue();
    }

    public final void setBalance(@NotNull com.yandex.plus.home.feature.panel.internalapi.model.c cVar) {
        String str;
        cVar.getClass();
        kcc kccVar = new kcc(new lcc(new wz0(8, this), true, f.a));
        while (kccVar.hasNext()) {
            com.yandex.plus.home.feature.panel.internalapi.shortcuts.lite.pluspoints.b bVar = (com.yandex.plus.home.feature.panel.internalapi.shortcuts.lite.pluspoints.b) kccVar.next();
            if (cVar instanceof com.yandex.plus.home.feature.panel.internalapi.model.a) {
                str = null;
            } else {
                if (!(cVar instanceof com.yandex.plus.home.feature.panel.internalapi.model.b)) {
                    b6e.s();
                    return;
                }
                str = ((com.yandex.plus.home.feature.panel.internalapi.model.b) cVar).a;
            }
            bVar.setBalance(cVar);
            bVar.setBalanceContentDescription(str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v59, types: [com.yandex.plus.bdui.plus.content.controller.f] */
    /* JADX WARN: Type inference failed for: r4v32, types: [java.util.WeakHashMap] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11, types: [com.yandex.plus.home.feature.panel.internal.base.b] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r6v0, types: [android.view.View, android.view.ViewGroup, com.yandex.plus.home.feature.panel.internalapi.shortcuts.lite.buyplus.b] */
    /* JADX WARN: Type inference failed for: r6v12, types: [android.view.View, com.yandex.plus.core.imageloader.a, com.yandex.plus.home.feature.panel.internalapi.shortcuts.lite.promo.f, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v14, types: [android.view.View, com.yandex.plus.home.feature.panel.internalapi.shortcuts.lite.status.b] */
    /* JADX WARN: Type inference failed for: r6v17, types: [com.yandex.plus.home.feature.panel.internalapi.shortcuts.lite.pluspoints.b] */
    /* JADX WARN: Type inference failed for: r6v22, types: [android.view.View, com.yandex.plus.home.feature.panel.internalapi.shortcuts.lite.redalert.b] */
    /* JADX WARN: Type inference failed for: r6v6, types: [android.view.View, android.view.ViewGroup, com.yandex.plus.home.feature.panel.internalapi.shortcuts.lite.family.a] */
    @Override // com.yandex.plus.home.feature.panel.internal.sections.l
    public final void v(com.yandex.plus.home.repository.api.model.panel.i iVar, b0 b0Var, Map map) {
        View view;
        View view2;
        ArrayList arrayList;
        d0 d0Var;
        d0 d0Var2;
        h hVar;
        e eVar;
        com.yandex.plus.home.feature.panel.internalapi.shortcuts.lite.statusandfamily.b bVar;
        com.yandex.plus.home.feature.panel.internalapi.shortcuts.lite.statusandfamily.b bVar2;
        v vVar;
        int i;
        d dVar;
        com.yandex.plus.home.feature.panel.internalapi.shortcuts.lite.minipromo.c cVar;
        boolean z;
        ViewGroup viewGroup;
        ?? r5;
        z zVar;
        d dVar2;
        v vVar2;
        v vVar3;
        h hVar2 = this;
        iVar.getClass();
        b0Var.getClass();
        map.getClass();
        ArrayList arrayList2 = new ArrayList();
        b0 b0Var2 = b0Var;
        List list = b0Var2.e;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof z) {
                arrayList3.add(obj);
            }
        }
        Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            z zVar2 = (z) it.next();
            com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.b;
            com.yandex.plus.log.api.b bVar3 = hVar2.K;
            if (bVar3.b(aVar)) {
                bVar3.c(aVar, "PlusPanelPlusCardSectionView", "addedShortcuts() added " + zVar2);
            }
            int i2 = -2;
            if (zVar2 instanceof w) {
                w wVar = (w) zVar2;
                String str = wVar.c;
                List list2 = (List) map.get(com.yandex.plus.home.feature.panel.internalapi.shortcuts.lite.redalert.b.class);
                View view3 = list2 != null ? (View) z75.B(list2) : null;
                if (!(view3 instanceof com.yandex.plus.home.feature.panel.internalapi.shortcuts.lite.redalert.b)) {
                    view3 = null;
                }
                com.yandex.plus.home.feature.panel.internalapi.shortcuts.lite.redalert.b bVar4 = (com.yandex.plus.home.feature.panel.internalapi.shortcuts.lite.redalert.b) view3;
                if (bVar4 == null) {
                    bVar4 = new com.yandex.plus.home.feature.panel.internalapi.shortcuts.lite.redalert.b(hVar2.getThemedContext());
                }
                ?? r6 = bVar4;
                Context themedContext = hVar2.getThemedContext();
                themedContext.getClass();
                r6.x = themedContext;
                r6.setTitle(str);
                String str2 = wVar.d;
                r6.setSubtitle(str2);
                r6.setContentDescription(CollectionsKt.X(xz0.w(new String[]{str, str2}), null, null, null, null, 63));
                r6.setTitleTextDrawable(hVar2.getThemeResolver().e(wVar.e));
                r6.setSubtitleTextDrawable(hVar2.getThemeResolver().e(wVar.f));
                com.yandex.plus.core.data.common.k c = hVar2.getThemeResolver().c(wVar.g);
                int a = hVar2.getThemeResolver().a();
                float f = r6.v;
                Drawable C = com.yandex.plus.bdui.plus.analytics.b.C(c, a, f, f, f, f);
                int b = com.yandex.plus.home.common.utils.a.b(r6.x, R.attr.plus_sdk_panelDefaultRippleColor);
                float f2 = r6.v;
                r6.setBackground(u.I(C, b, f2, f2, f2, f2));
                y yVar = wVar.j;
                r6.x(yVar != null ? hVar2.getThemeResolver().b(yVar) : null, hVar2.getImageLoader());
                d0 d0Var3 = wVar.h;
                r6.A(d0Var3 != null);
                r6.setMainActionText(d0Var3 != null ? d0Var3.a : null);
                r6.setMainActionContentDescription(d0Var3 != null ? d0Var3.a : null);
                if (d0Var3 != null) {
                    r6.setMainActionTextDrawable(hVar2.getThemeResolver().e(d0Var3.b));
                }
                r6.y((d0Var3 == null || (vVar3 = d0Var3.f) == null) ? null : hVar2.getThemeResolver().c(vVar3), hVar2.getThemeResolver().a());
                r6.setMainActionOnClickListener(d0Var3 != null ? new g(d0Var3, iVar, b0Var2, wVar, hVar2, r6, 0) : null);
                d0 d0Var4 = wVar.k;
                r6.z(d0Var4 != null);
                r6.setAdditionalActionText(d0Var4 != null ? d0Var4.a : null);
                r6.setAdditionalActionContentDescription(d0Var4 != null ? d0Var4.a : null);
                if (d0Var4 != null) {
                    r6.setAdditionalActionTextDrawable(getThemeResolver().e(d0Var4.b));
                }
                r6.w((d0Var4 == null || (vVar2 = d0Var4.f) == null) ? null : getThemeResolver().c(vVar2), getThemeResolver().a());
                r6.setAdditionalActionOnClickListener(d0Var4 != null ? new g(d0Var4, iVar, b0Var, wVar, this, r6, 1) : null);
                arrayList = arrayList2;
                bVar2 = r6;
            } else {
                boolean z2 = zVar2 instanceof t;
                int i3 = hVar2.x0;
                if (z2) {
                    t tVar = (t) zVar2;
                    String str3 = tVar.c;
                    List list3 = (List) map.get(com.yandex.plus.home.feature.panel.internalapi.shortcuts.lite.pluspoints.b.class);
                    View view4 = list3 != null ? (View) z75.B(list3) : null;
                    if (!(view4 instanceof com.yandex.plus.home.feature.panel.internalapi.shortcuts.lite.pluspoints.b)) {
                        view4 = null;
                    }
                    com.yandex.plus.home.feature.panel.internalapi.shortcuts.lite.pluspoints.b bVar5 = (com.yandex.plus.home.feature.panel.internalapi.shortcuts.lite.pluspoints.b) view4;
                    if (bVar5 == null) {
                        bVar5 = new com.yandex.plus.home.feature.panel.internalapi.shortcuts.lite.pluspoints.b(hVar2.getThemedContext(), hVar2.getBrandType());
                    }
                    ?? r62 = bVar5;
                    Context themedContext2 = hVar2.getThemedContext();
                    themedContext2.getClass();
                    r62.A = themedContext2;
                    r62.setTitle(str3);
                    String str4 = tVar.d;
                    r62.setSubtitle(str4);
                    d0 d0Var5 = tVar.h;
                    r62.setGeneralContentDescription(CollectionsKt.X(xz0.w(new String[]{str3, str4, d0Var5 != null ? d0Var5.a : null}), null, null, null, null, 63));
                    r62.setTitleTextDrawable(hVar2.getThemeResolver().e(tVar.e));
                    r62.setSubtitleTextDrawable(hVar2.getThemeResolver().e(tVar.f));
                    r62.setBackground(hVar2.getThemeResolver().c(tVar.g));
                    r62.setActionEnabled(d0Var5 != null);
                    s sVar = tVar.j;
                    if (sVar instanceof r) {
                        r62.x = hVar2.getThemeResolver().e(((r) sVar).a);
                        r62.v = null;
                        r62.w = null;
                        cVar = r62;
                    } else {
                        if (!(sVar instanceof q)) {
                            b6e.s();
                            return;
                        }
                        q qVar = (q) sVar;
                        com.yandex.plus.core.theme.c e = hVar2.getThemeResolver().e(qVar.a);
                        com.yandex.plus.core.theme.c e2 = hVar2.getThemeResolver().e(qVar.b);
                        r62.v = e;
                        r62.w = e2;
                        r62.x = null;
                        cVar = r62;
                    }
                } else if (zVar2 instanceof x) {
                    x xVar = (x) zVar2;
                    String str5 = xVar.c;
                    List list4 = (List) map.get(com.yandex.plus.home.feature.panel.internalapi.shortcuts.lite.status.b.class);
                    View view5 = list4 != null ? (View) z75.B(list4) : null;
                    if (!(view5 instanceof com.yandex.plus.home.feature.panel.internalapi.shortcuts.lite.status.b)) {
                        view5 = null;
                    }
                    com.yandex.plus.home.feature.panel.internalapi.shortcuts.lite.status.b bVar6 = (com.yandex.plus.home.feature.panel.internalapi.shortcuts.lite.status.b) view5;
                    if (bVar6 == null) {
                        bVar6 = new com.yandex.plus.home.feature.panel.internalapi.shortcuts.lite.status.b(hVar2.getThemedContext());
                    }
                    ?? r63 = bVar6;
                    Context themedContext3 = hVar2.getThemedContext();
                    themedContext3.getClass();
                    r63.v = themedContext3;
                    r63.setTitle(str5);
                    String str6 = xVar.d;
                    r63.setSubtitle(str6);
                    d0 d0Var6 = xVar.h;
                    r63.setContentDescription(CollectionsKt.X(xz0.w(new String[]{str5, str6, d0Var6 != null ? d0Var6.a : null}), null, null, null, null, 63));
                    r63.setTitleTextDrawable(hVar2.getThemeResolver().e(xVar.e));
                    r63.setSubtitleTextDrawable(hVar2.getThemeResolver().e(xVar.f));
                    com.yandex.plus.core.data.common.k c2 = hVar2.getThemeResolver().c(xVar.g);
                    int a2 = hVar2.getThemeResolver().a();
                    float f3 = r63.u;
                    Drawable C2 = com.yandex.plus.bdui.plus.analytics.b.C(c2, a2, f3, f3, f3, f3);
                    int b2 = com.yandex.plus.home.common.utils.a.b(r63.v, R.attr.plus_sdk_panelDefaultRippleColor);
                    float f4 = r63.u;
                    r63.setBackground(u.I(C2, b2, f4, f4, f4, f4));
                    r63.setActionEnabled(d0Var6 != null);
                    r63.setActionText(d0Var6 != null ? d0Var6.a : null);
                    if (d0Var6 != null) {
                        r63.setActionTextDrawable(hVar2.getThemeResolver().e(d0Var6.b));
                    }
                    r63.u(hVar2.getThemeResolver().b(xVar.j), hVar2.getImageLoader());
                    cVar = r63;
                } else if (zVar2 instanceof com.yandex.plus.home.repository.api.model.panel.u) {
                    com.yandex.plus.home.repository.api.model.panel.u uVar = (com.yandex.plus.home.repository.api.model.panel.u) zVar2;
                    String str7 = uVar.c;
                    List list5 = (List) map.get(com.yandex.plus.home.feature.panel.internalapi.shortcuts.lite.promo.f.class);
                    View view6 = list5 != null ? (View) z75.B(list5) : null;
                    if (!(view6 instanceof com.yandex.plus.home.feature.panel.internalapi.shortcuts.lite.promo.f)) {
                        view6 = null;
                    }
                    com.yandex.plus.home.feature.panel.internalapi.shortcuts.lite.promo.f fVar = (com.yandex.plus.home.feature.panel.internalapi.shortcuts.lite.promo.f) view6;
                    if (fVar == null) {
                        fVar = new com.yandex.plus.home.feature.panel.internalapi.shortcuts.lite.promo.f(hVar2.getThemedContext());
                    }
                    ?? r64 = fVar;
                    Context themedContext4 = hVar2.getThemedContext();
                    themedContext4.getClass();
                    r64.y = themedContext4;
                    r64.setTitle(str7);
                    String str8 = uVar.d;
                    r64.setSubtitle(str8);
                    d0 d0Var7 = uVar.h;
                    r64.setContentDescription(CollectionsKt.X(xz0.w(new String[]{str7, str8, d0Var7 != null ? d0Var7.a : null}), null, null, null, null, 63));
                    r64.setTitleTextDrawable(hVar2.getThemeResolver().e(uVar.e));
                    r64.setSubtitleTextDrawable(hVar2.getThemeResolver().e(uVar.f));
                    r64.setActionEnabled(d0Var7 != null);
                    r64.setActionText(d0Var7 != null ? d0Var7.a : null);
                    if (d0Var7 != null) {
                        r64.setActionTextDrawable(hVar2.getThemeResolver().e(d0Var7.b));
                    }
                    String b3 = hVar2.getThemeResolver().b(uVar.j);
                    if (b3 != null) {
                        com.yandex.plus.core.imageloader.b imageLoader = hVar2.getImageLoader();
                        imageLoader.getClass();
                        if (!r64.isLaidOut() || r64.isLayoutRequested()) {
                            r64.addOnLayoutChangeListener(new com.yandex.plus.home.feature.panel.internal.shortcuts.lite.family.d(imageLoader, r64, b3));
                        } else {
                            com.yandex.plus.coil.b bVar7 = (com.yandex.plus.coil.b) imageLoader;
                            la8 la8Var = (la8) bVar7.c.remove(r64);
                            if (la8Var != null) {
                                la8Var.a();
                            }
                            bVar7.b(b3).j(r64);
                        }
                    } else {
                        r64.v(hVar2.getThemeResolver().c(uVar.g), hVar2.getThemeResolver().a());
                    }
                    String b4 = hVar2.getThemeResolver().b(uVar.k);
                    String b5 = hVar2.getThemeResolver().b(uVar.l);
                    com.yandex.plus.core.imageloader.b imageLoader2 = hVar2.getImageLoader();
                    imageLoader2.getClass();
                    if (!r64.isLaidOut() || r64.isLayoutRequested()) {
                        r64.addOnLayoutChangeListener(new com.yandex.plus.home.feature.panel.internalapi.shortcuts.lite.promo.e(r64, imageLoader2, b4, b5));
                        cVar = r64;
                    } else {
                        ImageView imageView = r64.u;
                        if (imageView != null) {
                            ((com.yandex.plus.coil.b) imageLoader2).b(b4).i(imageView);
                        }
                        ImageView imageView2 = r64.v;
                        cVar = r64;
                        if (imageView2 != null) {
                            ((com.yandex.plus.coil.b) imageLoader2).b(b5).i(imageView2);
                            cVar = r64;
                        }
                    }
                } else if (zVar2 instanceof com.yandex.plus.home.repository.api.model.panel.v) {
                    com.yandex.plus.home.repository.api.model.panel.v vVar4 = (com.yandex.plus.home.repository.api.model.panel.v) zVar2;
                    String str9 = vVar4.c;
                    List list6 = (List) map.get(com.yandex.plus.home.feature.panel.internalapi.shortcuts.lite.minipromo.c.class);
                    View view7 = list6 != null ? (View) z75.B(list6) : null;
                    if (!(view7 instanceof com.yandex.plus.home.feature.panel.internalapi.shortcuts.lite.minipromo.c)) {
                        view7 = null;
                    }
                    com.yandex.plus.home.feature.panel.internalapi.shortcuts.lite.minipromo.c cVar2 = (com.yandex.plus.home.feature.panel.internalapi.shortcuts.lite.minipromo.c) view7;
                    if (cVar2 == null) {
                        cVar2 = new com.yandex.plus.home.feature.panel.internalapi.shortcuts.lite.minipromo.c(hVar2.getThemedContext());
                    }
                    com.yandex.plus.home.feature.panel.internalapi.shortcuts.lite.minipromo.c cVar3 = cVar2;
                    Context themedContext5 = hVar2.getThemedContext();
                    themedContext5.getClass();
                    cVar3.w = themedContext5;
                    v vVar5 = vVar4.e;
                    String str10 = vVar4.d;
                    cVar3.w(str9, str10);
                    d0 d0Var8 = vVar4.h;
                    cVar3.setContentDescription(CollectionsKt.X(xz0.w(new String[]{str9, str10, d0Var8 != null ? d0Var8.a : null}), null, null, null, null, 63));
                    cVar3.setTitleTextDrawable(hVar2.getThemeResolver().e(vVar5));
                    cVar3.setSubtitleTextDrawable(hVar2.getThemeResolver().e(vVar4.f));
                    com.yandex.plus.core.data.common.k c3 = hVar2.getThemeResolver().c(vVar4.g);
                    int a3 = hVar2.getThemeResolver().a();
                    float f5 = cVar3.v;
                    Drawable C3 = com.yandex.plus.bdui.plus.analytics.b.C(c3, a3, f5, f5, f5, f5);
                    int b6 = com.yandex.plus.home.common.utils.a.b(cVar3.w, R.attr.plus_sdk_panelDefaultRippleColor);
                    float f6 = cVar3.v;
                    cVar3.setBackground(u.I(C3, b6, f6, f6, f6, f6));
                    cVar3.setActionEnabled(d0Var8 != null);
                    if (d0Var8 != null) {
                        cVar3.setActionIconDrawable(hVar2.getThemeResolver().e(vVar5));
                    }
                    cVar3.v(hVar2.getThemeResolver().b(vVar4.j), hVar2.getImageLoader());
                    arrayList2.add(cVar3);
                    cVar = cVar3;
                } else {
                    boolean z3 = zVar2 instanceof o;
                    jyr jyrVar = hVar2.H;
                    if (z3) {
                        o oVar = (o) zVar2;
                        List list7 = (List) map.get(com.yandex.plus.home.feature.panel.internalapi.shortcuts.lite.family.a.class);
                        View view8 = list7 != null ? (View) z75.B(list7) : null;
                        if (!(view8 instanceof com.yandex.plus.home.feature.panel.internalapi.shortcuts.lite.family.a)) {
                            view8 = null;
                        }
                        com.yandex.plus.home.feature.panel.internalapi.shortcuts.lite.family.a aVar2 = (com.yandex.plus.home.feature.panel.internalapi.shortcuts.lite.family.a) view8;
                        if (aVar2 != null) {
                            com.yandex.plus.home.feature.panel.internal.shortcuts.lite.family.f fVar2 = hVar2.z0;
                            if (fVar2 != null) {
                                com.yandex.plus.home.feature.panel.internal.shortcuts.lite.family.b A = hVar2.A(oVar);
                                fVar2.d = new com.yandex.plus.home.feature.panel.internal.shortcuts.lite.family.g(A.b, A.d, A.i);
                                fVar2.e = A.h;
                                fVar2.e(A);
                            }
                        } else {
                            aVar2 = new com.yandex.plus.home.feature.panel.internalapi.shortcuts.lite.family.a(hVar2.getThemedContext());
                            Function0 function0 = (Function0) jyrVar.getValue();
                            Context context = hVar2.getContext();
                            context.getClass();
                            context.getClass();
                            com.yandex.passport.data.network.l lVar = new com.yandex.passport.data.network.l();
                            lVar.a = context.getResources();
                            hVar2.z0 = new com.yandex.plus.home.feature.panel.internal.shortcuts.lite.family.f(aVar2, function0, lVar, hVar2.A(oVar));
                        }
                        ?? r65 = aVar2;
                        Context themedContext6 = hVar2.getThemedContext();
                        themedContext6.getClass();
                        r65.t = themedContext6;
                        d0 d0Var9 = oVar.g;
                        if (d0Var9 != null) {
                            i = i3;
                            dVar = new d(d0Var9, iVar, b0Var, oVar, hVar2, r65, 1);
                        } else {
                            i = i3;
                            dVar = null;
                        }
                        r65.setOnClickListener(dVar);
                        arrayList = arrayList2;
                        i2 = i;
                        bVar2 = r65;
                    } else if (zVar2 instanceof com.yandex.plus.home.repository.api.model.panel.y) {
                        com.yandex.plus.home.repository.api.model.panel.y yVar2 = (com.yandex.plus.home.repository.api.model.panel.y) zVar2;
                        d0 d0Var10 = yVar2.g;
                        List list8 = (List) map.get(com.yandex.plus.home.feature.panel.internalapi.shortcuts.lite.statusandfamily.b.class);
                        View view9 = list8 != null ? (View) z75.B(list8) : null;
                        if (!(view9 instanceof com.yandex.plus.home.feature.panel.internalapi.shortcuts.lite.statusandfamily.b)) {
                            view9 = null;
                        }
                        com.yandex.plus.home.feature.panel.internalapi.shortcuts.lite.statusandfamily.b bVar8 = (com.yandex.plus.home.feature.panel.internalapi.shortcuts.lite.statusandfamily.b) view9;
                        if (bVar8 == null) {
                            bVar8 = new com.yandex.plus.home.feature.panel.internalapi.shortcuts.lite.statusandfamily.b(hVar2.getThemedContext());
                            hVar2.A0 = new com.yandex.plus.home.feature.panel.internal.shortcuts.lite.statusandfamily.c(bVar8, (Function0) jyrVar.getValue());
                        }
                        com.yandex.plus.home.feature.panel.internalapi.shortcuts.lite.statusandfamily.b bVar9 = bVar8;
                        Context themedContext7 = hVar2.getThemedContext();
                        themedContext7.getClass();
                        bVar9.n = themedContext7;
                        d0 d0Var11 = yVar2.j;
                        bVar9.setOnStatusClickListener(d0Var10 != null ? new e(d0Var10, iVar, b0Var, yVar2, hVar2, bVar9, 0) : null);
                        if (d0Var11 != null) {
                            d0Var = d0Var10;
                            d0Var2 = d0Var11;
                            hVar = this;
                            eVar = new e(d0Var2, iVar, b0Var, yVar2, hVar, bVar9, 1);
                        } else {
                            d0Var = d0Var10;
                            d0Var2 = d0Var11;
                            hVar = this;
                            eVar = null;
                        }
                        bVar9.setOnFamilyClickListener(eVar);
                        com.yandex.plus.home.feature.panel.internal.shortcuts.lite.statusandfamily.c cVar4 = hVar.A0;
                        if (cVar4 != null) {
                            com.yandex.plus.bdui.plus.content.controller.f fVar3 = cVar4.e;
                            String str11 = yVar2.c;
                            com.yandex.plus.core.theme.c e3 = hVar.getThemeResolver().e(yVar2.e);
                            com.yandex.plus.core.data.common.k c4 = (d0Var == null || (vVar = d0Var.b) == null) ? null : hVar.getThemeResolver().c(vVar);
                            com.yandex.plus.core.data.common.k c5 = hVar.getThemeResolver().c(yVar2.i);
                            int a4 = hVar.getThemeResolver().a();
                            com.yandex.plus.home.feature.panel.internal.shortcuts.lite.family.a z4 = hVar.z(d0Var2);
                            String X = CollectionsKt.X(xz0.w(new String[]{yVar2.c, yVar2.d, d0Var != null ? d0Var.a : null}), null, null, null, null, 63);
                            String X2 = CollectionsKt.X(u75.i(d0Var2 != null ? d0Var2.a : null), null, null, null, null, 63);
                            com.yandex.plus.home.feature.panel.internal.shortcuts.lite.statusandfamily.d dVar3 = new com.yandex.plus.home.feature.panel.internal.shortcuts.lite.statusandfamily.d(str11, e3, c4, c5, a4, z4, X, X2);
                            com.yandex.plus.core.data.common.k kVar = c4;
                            cVar4.o = dVar3;
                            bVar = bVar9;
                            com.yandex.plus.home.feature.panel.internalapi.shortcuts.lite.statusandfamily.b bVar10 = cVar4.a;
                            arrayList = arrayList2;
                            int i4 = 2;
                            if (!bVar10.isLaidOut() || bVar10.isLayoutRequested()) {
                                bVar10.addOnLayoutChangeListener(new com.yandex.plus.home.feature.panel.internal.shortcuts.daily.b(i4, cVar4, dVar3));
                            } else {
                                com.yandex.plus.home.feature.panel.internal.shortcuts.lite.statusandfamily.c.b(cVar4, X, X2);
                                s9f[] s9fVarArr = com.yandex.plus.home.feature.panel.internal.shortcuts.lite.statusandfamily.c.q;
                                ((TextView) fVar3.g(s9fVarArr[2])).setText(str11);
                                com.yandex.plus.bdui.flex.ui.a.D((TextView) fVar3.g(s9fVarArr[2]), e3, new com.yandex.plus.bdui.plus.webview.navigation.a(15));
                                com.yandex.plus.home.feature.panel.internal.shortcuts.lite.statusandfamily.c.d(cVar4, c5, a4);
                                com.yandex.plus.home.feature.panel.internal.shortcuts.lite.statusandfamily.c.c(cVar4, kVar);
                                com.yandex.plus.home.repository.api.model.user.d dVar4 = cVar4.p;
                                if (dVar4 != null) {
                                    cVar4.h(com.yandex.plus.home.feature.panel.internal.shortcuts.lite.statusandfamily.c.g(dVar4), dVar3);
                                    cVar4.i(com.yandex.plus.home.feature.panel.internal.shortcuts.lite.statusandfamily.c.g(dVar4), dVar4);
                                }
                            }
                        } else {
                            bVar = bVar9;
                            arrayList = arrayList2;
                        }
                        i2 = i3;
                        bVar2 = bVar;
                    } else {
                        arrayList = arrayList2;
                        if (!(zVar2 instanceof p)) {
                            b6e.s();
                            return;
                        }
                        p pVar = (p) zVar2;
                        String str12 = pVar.c;
                        List list9 = (List) map.get(com.yandex.plus.home.feature.panel.internalapi.shortcuts.lite.buyplus.b.class);
                        View view10 = list9 != null ? (View) z75.B(list9) : null;
                        if (!(view10 instanceof com.yandex.plus.home.feature.panel.internalapi.shortcuts.lite.buyplus.b)) {
                            view10 = null;
                        }
                        com.yandex.plus.home.feature.panel.internalapi.shortcuts.lite.buyplus.b bVar11 = (com.yandex.plus.home.feature.panel.internalapi.shortcuts.lite.buyplus.b) view10;
                        if (bVar11 == null) {
                            bVar11 = new com.yandex.plus.home.feature.panel.internalapi.shortcuts.lite.buyplus.b(getThemedContext(), getBrandType());
                        }
                        ?? r66 = bVar11;
                        r66.a(getThemedContext());
                        r66.setTitle(str12);
                        String str13 = pVar.d;
                        r66.setSubtitle(str13);
                        r66.setContentDescription(CollectionsKt.X(xz0.w(new String[]{str12, str13}), null, null, null, null, 63));
                        r66.setTitleTextDrawable(getThemeResolver().e(pVar.e));
                        r66.setSubtitleTextDrawable(getThemeResolver().e(pVar.f));
                        com.yandex.plus.core.data.common.k c6 = getThemeResolver().c(pVar.g);
                        int a5 = getThemeResolver().a();
                        float f7 = r66.e;
                        Drawable C4 = com.yandex.plus.bdui.plus.analytics.b.C(c6, a5, f7, f7, f7, f7);
                        int b7 = com.yandex.plus.home.common.utils.a.b(r66.g, R.attr.plus_sdk_panelDefaultRippleColor);
                        float f8 = r66.e;
                        r66.setBackground(u.I(C4, b7, f8, f8, f8, f8));
                        d0 d0Var12 = pVar.h;
                        r66.setActionButtonText(d0Var12 != null ? d0Var12.a : null);
                        r66.setActionButtonContentDescription(d0Var12 != null ? d0Var12.a : null);
                        if (d0Var12 != null) {
                            r66.setActionButtonTextDrawable(getThemeResolver().e(d0Var12.b));
                        }
                        r66.setActionButtonClickListener(d0Var12 != null ? new d(d0Var12, iVar, b0Var, pVar, this, r66, 2) : null);
                        bVar2 = r66;
                    }
                }
                i2 = i3;
                arrayList = arrayList2;
                z = true;
                viewGroup = cVar;
                r1.G(viewGroup);
                if (z || zVar2.q() == null) {
                    r5 = this;
                    zVar = zVar2;
                } else {
                    d0 q = zVar2.q();
                    if (q != null) {
                        h hVar3 = this;
                        zVar = zVar2;
                        dVar2 = new d(q, iVar, b0Var, zVar, hVar3, viewGroup, 0);
                        r5 = hVar3;
                    } else {
                        r5 = this;
                        zVar = zVar2;
                        dVar2 = null;
                    }
                    r1.E(viewGroup, dVar2);
                }
                com.yandex.plus.home.feature.panel.internal.base.a aVar3 = new com.yandex.plus.home.feature.panel.internal.base.a(i2);
                aVar3.r0 = zVar.A();
                viewGroup.setLayoutParams(aVar3);
                r5.addView(viewGroup);
                b0Var2 = b0Var;
                arrayList2 = arrayList;
                hVar2 = r5;
            }
            z = false;
            viewGroup = bVar2;
            r1.G(viewGroup);
            if (z) {
            }
            r5 = this;
            zVar = zVar2;
            com.yandex.plus.home.feature.panel.internal.base.a aVar32 = new com.yandex.plus.home.feature.panel.internal.base.a(i2);
            aVar32.r0 = zVar.A();
            viewGroup.setLayoutParams(aVar32);
            r5.addView(viewGroup);
            b0Var2 = b0Var;
            arrayList2 = arrayList;
            hVar2 = r5;
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            hVar2.setHeightBasedOnPosition((com.yandex.plus.home.feature.panel.internalapi.shortcuts.lite.minipromo.c) it2.next());
        }
        int i5 = 0;
        while (true) {
            if (!(i5 < hVar2.getChildCount())) {
                view = null;
                break;
            }
            int i6 = i5 + 1;
            view = hVar2.getChildAt(i5);
            if (view == null) {
                rj7.m();
                return;
            } else if (view instanceof com.yandex.plus.home.feature.panel.internalapi.shortcuts.lite.family.a) {
                break;
            } else {
                i5 = i6;
            }
        }
        if (view == null) {
            hVar2.z0 = null;
        }
        int i7 = 0;
        while (true) {
            if (!(i7 < hVar2.getChildCount())) {
                view2 = null;
                break;
            }
            int i8 = i7 + 1;
            view2 = hVar2.getChildAt(i7);
            if (view2 == null) {
                rj7.m();
                return;
            } else if (view2 instanceof com.yandex.plus.home.feature.panel.internalapi.shortcuts.lite.statusandfamily.b) {
                break;
            } else {
                i7 = i8;
            }
        }
        if (view2 == null) {
            hVar2.A0 = null;
        }
    }

    public final com.yandex.plus.home.feature.panel.internal.shortcuts.lite.family.a z(d0 d0Var) {
        if (d0Var == null) {
            return null;
        }
        v vVar = d0Var.b;
        return new com.yandex.plus.home.feature.panel.internal.shortcuts.lite.family.a(d0Var.a, getThemeResolver().e(vVar), getThemeResolver().c(d0Var.f), getThemeResolver().c(vVar), getThemeResolver().a());
    }
}
