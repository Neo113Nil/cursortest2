package com.yandex.plus.home.feature.panel.internal.sections;

import android.content.Context;
import android.view.View;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r1;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.u;
import com.yandex.plus.core.data.common.v;
import com.yandex.plus.core.data.common.y;
import com.yandex.plus.home.feature.panel.internalapi.shortcuts.daily.n;
import com.yandex.plus.home.repository.api.model.panel.b0;
import com.yandex.plus.home.repository.api.model.panel.d0;
import defpackage.b6e;
import defpackage.c5b;
import defpackage.e5b;
import defpackage.omb;
import defpackage.r90;
import defpackage.t75;
import defpackage.tf6;
import defpackage.u75;
import defpackage.vdr;
import defpackage.x97;
import defpackage.z75;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import ru.yandex.music.R;

/* loaded from: classes5.dex */
public abstract class a extends l {
    public static final /* synthetic */ int E0 = 0;
    public final int A0;
    public final int B0;
    public final com.yandex.passport.data.network.l C0;
    public com.yandex.plus.home.feature.panel.internalapi.shortcuts.daily.m D0;
    public final com.yandex.plus.home.feature.panel.internalapi.analytics.b K;
    public final boolean L;
    public final kotlinx.coroutines.a v0;
    public final kotlinx.coroutines.a w0;
    public final com.yandex.plus.log.api.b x0;
    public final Function1 y0;
    public final Function1 z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(@NotNull Context context, @NotNull com.yandex.plus.core.imageloader.b bVar, @NotNull com.yandex.plus.core.strings.a aVar, @NotNull vdr vdrVar, @NotNull com.yandex.plus.core.theme.e eVar, @NotNull com.yandex.plus.home.feature.panel.internalapi.c cVar, @NotNull com.yandex.plus.home.feature.panel.internalapi.analytics.b bVar2, com.yandex.plus.home.feature.panel.internalapi.b bVar3, boolean z, @NotNull kotlinx.coroutines.a aVar2, @NotNull kotlinx.coroutines.a aVar3, @NotNull com.yandex.plus.log.api.b bVar4, @NotNull Function1<? super d0, Unit> function1, @NotNull Function1<? super com.yandex.plus.home.feature.panel.internalapi.analytics.f, Unit> function12) {
        super(context, bVar, vdrVar, eVar, aVar, bVar3, cVar, aVar2, function12);
        context.getClass();
        bVar.getClass();
        aVar.getClass();
        vdrVar.getClass();
        eVar.getClass();
        cVar.getClass();
        bVar2.getClass();
        aVar2.getClass();
        aVar3.getClass();
        bVar4.getClass();
        function1.getClass();
        function12.getClass();
        this.K = bVar2;
        this.L = z;
        this.v0 = aVar2;
        this.w0 = aVar3;
        this.x0 = bVar4;
        this.y0 = function1;
        this.z0 = function12;
        this.A0 = context.getColor(R.color.plus_sdk_daily_progress_default_color);
        this.B0 = context.getColor(R.color.plus_sdk_daily_badge_default_background_color);
        com.yandex.plus.home.feature.panel.internal.a themeResolver = getThemeResolver();
        themeResolver.getClass();
        com.yandex.passport.data.network.l lVar = new com.yandex.passport.data.network.l();
        lVar.a = themeResolver;
        this.C0 = lVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x024b, code lost:
    
        if (r11 != null) goto L127;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x026e  */
    /* JADX WARN: Type inference failed for: r13v17, types: [com.yandex.plus.home.feature.panel.internal.mapper.a] */
    /* JADX WARN: Type inference failed for: r14v5, types: [com.yandex.plus.home.feature.panel.internal.mapper.a] */
    @Override // com.yandex.plus.home.feature.panel.internal.sections.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(com.yandex.plus.home.repository.api.model.panel.i iVar, b0 b0Var, Map map) {
        n nVar;
        com.yandex.plus.home.feature.panel.internalapi.shortcuts.daily.f fVar;
        com.yandex.plus.home.feature.panel.internalapi.shortcuts.daily.f fVar2;
        com.yandex.plus.home.feature.panel.internal.mapper.a aVar;
        ArrayList arrayList;
        d0 d0Var;
        com.yandex.plus.home.repository.api.model.panel.g gVar;
        String str;
        com.yandex.plus.home.feature.panel.internalapi.shortcuts.daily.d dVar;
        com.yandex.plus.home.feature.panel.internalapi.shortcuts.daily.c cVar;
        boolean z;
        com.yandex.plus.home.feature.panel.internalapi.shortcuts.daily.b bVar;
        com.yandex.plus.home.feature.panel.internal.mapper.a aVar2;
        com.yandex.plus.home.feature.panel.internalapi.shortcuts.daily.d dVar2;
        com.yandex.plus.home.feature.panel.internalapi.shortcuts.daily.e eVar;
        List c;
        Integer intOrNull;
        String str2;
        com.yandex.plus.core.data.common.k fVar3;
        boolean z2;
        com.yandex.plus.core.data.common.f fVar4;
        iVar.getClass();
        b0Var.getClass();
        map.getClass();
        List list = b0Var.e;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof com.yandex.plus.home.repository.api.model.panel.g) {
                arrayList2.add(obj);
            }
        }
        com.yandex.plus.home.repository.api.model.panel.g gVar2 = (com.yandex.plus.home.repository.api.model.panel.g) CollectionsKt.firstOrNull(arrayList2);
        if (gVar2 == null) {
            this.D0 = null;
            return;
        }
        com.yandex.plus.log.api.a aVar3 = com.yandex.plus.log.api.a.b;
        com.yandex.plus.log.api.b bVar2 = this.x0;
        if (bVar2.b(aVar3)) {
            bVar2.c(aVar3, "PlusPanelDailySectionView", "addShortcuts() parsed daily shortcut: id =" + gVar2.getId());
        }
        List list2 = (List) map.get(n.class);
        View view = list2 != null ? (View) z75.B(list2) : null;
        if (!(view instanceof n)) {
            view = null;
        }
        n nVar2 = (n) view;
        if (nVar2 == null) {
            n nVar3 = new n(getThemedContext());
            this.D0 = new com.yandex.plus.home.feature.panel.internalapi.shortcuts.daily.m(nVar3, getThemeStateFlow(), getThemeContextConverter(), getImageLoader(), this.K, getShortcutViewAwarenessDetector(), this.L, this.v0, this.w0, this.x0);
            nVar = nVar3;
        } else {
            nVar = nVar2;
        }
        final r90 r90Var = new r90(this, iVar, b0Var, gVar2, nVar, 17);
        com.yandex.passport.data.network.l lVar = this.C0;
        com.yandex.plus.home.feature.panel.internal.a aVar4 = (com.yandex.plus.home.feature.panel.internal.a) lVar.a;
        com.yandex.plus.home.feature.panel.internal.a aVar5 = (com.yandex.plus.home.feature.panel.internal.a) lVar.a;
        if (gVar2 instanceof com.yandex.plus.home.repository.api.model.panel.b) {
            gVar = gVar2;
            cVar = null;
            z = true;
        } else {
            if (gVar2 instanceof com.yandex.plus.home.repository.api.model.panel.d) {
                gVar = gVar2;
                cVar = null;
            } else {
                if (!(gVar2 instanceof com.yandex.plus.home.repository.api.model.panel.f)) {
                    b6e.s();
                    return;
                }
                com.yandex.plus.home.repository.api.model.panel.e eVar2 = ((com.yandex.plus.home.repository.api.model.panel.f) gVar2).x;
                String str3 = eVar2.h;
                if (str3 != null) {
                    v vVar = eVar2.k;
                    com.yandex.plus.core.theme.c e = vVar != null ? aVar4.e(vVar) : new com.yandex.plus.core.theme.a(com.yandex.plus.home.common.utils.a.b(aVar4.b, R.attr.plus_sdk_panelDefaultTextColor));
                    List list3 = eVar2.o;
                    List Q = list3 != null ? com.yandex.passport.data.network.l.Q(list3) : c5b.a;
                    List list4 = eVar2.m;
                    fVar = new com.yandex.plus.home.feature.panel.internalapi.shortcuts.daily.f(str3, e, Q, list4 != null ? lVar.P(list4) : c5b.a);
                } else {
                    fVar = null;
                }
                String str4 = eVar2.g;
                if (str4 != null) {
                    v vVar2 = eVar2.j;
                    com.yandex.plus.core.theme.c e2 = vVar2 != null ? aVar4.e(vVar2) : new com.yandex.plus.core.theme.a(com.yandex.plus.home.common.utils.a.b(aVar4.b, R.attr.plus_sdk_panelDefaultTextColor));
                    List list5 = eVar2.n;
                    List Q2 = list5 != null ? com.yandex.passport.data.network.l.Q(list5) : c5b.a;
                    List list6 = eVar2.l;
                    fVar2 = new com.yandex.plus.home.feature.panel.internalapi.shortcuts.daily.f(str4, e2, Q2, list6 != null ? lVar.P(list6) : c5b.a);
                } else {
                    fVar2 = null;
                }
                String str5 = eVar2.a;
                com.yandex.plus.home.feature.panel.internalapi.shortcuts.daily.a aVar6 = new com.yandex.plus.home.feature.panel.internalapi.shortcuts.daily.a(aVar4.c(eVar2.b), aVar4.a());
                String str6 = eVar2.f;
                com.yandex.plus.core.theme.c e3 = aVar4.e(eVar2.i);
                c5b c5bVar = c5b.a;
                com.yandex.plus.home.feature.panel.internalapi.shortcuts.daily.f fVar5 = new com.yandex.plus.home.feature.panel.internalapi.shortcuts.daily.f(str6, e3, c5bVar, c5bVar);
                final d0 d0Var2 = eVar2.e;
                if (d0Var2 != null) {
                    final int i = 0;
                    aVar = new Function0() { // from class: com.yandex.plus.home.feature.panel.internal.mapper.a
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            switch (i) {
                                case 0:
                                    r90Var.invoke(d0Var2);
                                    break;
                                default:
                                    r90Var.invoke(d0Var2);
                                    break;
                            }
                            return Unit.a;
                        }
                    };
                } else {
                    aVar = null;
                }
                List list7 = eVar2.q;
                if (list7 != null) {
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it = list7.iterator();
                    while (it.hasNext()) {
                        String b = aVar4.b((y) it.next());
                        if (b != null) {
                            arrayList3.add(b);
                        }
                    }
                    if (!arrayList3.isEmpty()) {
                        arrayList = arrayList3;
                        d0Var = eVar2.p;
                        if (d0Var == null) {
                            String str7 = d0Var.a;
                            gVar = gVar2;
                            com.yandex.plus.core.theme.c e4 = aVar5.e(d0Var.b);
                            v vVar3 = d0Var.f;
                            vVar3.getClass();
                            com.yandex.plus.core.data.common.k c2 = aVar5.c(vVar3);
                            if (c2 == null) {
                                str = str5;
                                c2 = new com.yandex.plus.core.data.common.f(aVar5.a());
                            } else {
                                str = str5;
                            }
                            dVar = new com.yandex.plus.home.feature.panel.internalapi.shortcuts.daily.d(str7, e4, c2);
                        } else {
                            gVar = gVar2;
                            str = str5;
                            dVar = null;
                        }
                        y yVar = eVar2.c;
                        String b2 = yVar == null ? aVar4.b(yVar) : null;
                        y yVar2 = eVar2.d;
                        cVar = new com.yandex.plus.home.feature.panel.internalapi.shortcuts.daily.c(str, aVar6, fVar5, fVar2, aVar, fVar, arrayList, dVar, b2, yVar2 == null ? aVar4.b(yVar2) : null);
                    }
                }
                arrayList = null;
                d0Var = eVar2.p;
                if (d0Var == null) {
                }
                y yVar3 = eVar2.c;
                if (yVar3 == null) {
                }
                y yVar22 = eVar2.d;
                cVar = new com.yandex.plus.home.feature.panel.internalapi.shortcuts.daily.c(str, aVar6, fVar5, fVar2, aVar, fVar, arrayList, dVar, b2, yVar22 == null ? aVar4.b(yVar22) : null);
            }
            z = false;
        }
        String e5 = gVar.e();
        if (e5 != null) {
            v d = gVar.d();
            aVar4.getClass();
            com.yandex.plus.core.data.common.f fVar6 = new com.yandex.plus.core.data.common.f(this.B0);
            com.yandex.plus.core.data.common.k kVar = d != null ? d.a : null;
            if (kVar == null ? true : kVar instanceof com.yandex.plus.core.data.common.f) {
                com.yandex.plus.core.data.common.k kVar2 = d != null ? d.b : null;
                if (kVar2 == null ? true : kVar2 instanceof com.yandex.plus.core.data.common.f) {
                    z2 = true;
                    if ((!z2 ? d : null) != null) {
                        if (d == null) {
                            d = null;
                        }
                    }
                    d = new v(fVar6, fVar6);
                    fVar4 = (com.yandex.plus.core.data.common.f) (!u.r(aVar4.b, aVar4.a) ? d.b : d.a);
                    if (fVar4 != null) {
                        fVar6 = fVar4;
                    }
                    v f = gVar.f();
                    bVar = new com.yandex.plus.home.feature.panel.internalapi.shortcuts.daily.b(fVar6, e5, f == null ? aVar4.e(f) : null);
                }
            }
            z2 = false;
            if ((!z2 ? d : null) != null) {
            }
            d = new v(fVar6, fVar6);
            fVar4 = (com.yandex.plus.core.data.common.f) (!u.r(aVar4.b, aVar4.a) ? d.b : d.a);
            if (fVar4 != null) {
            }
            v f2 = gVar.f();
            bVar = new com.yandex.plus.home.feature.panel.internalapi.shortcuts.daily.b(fVar6, e5, f2 == null ? aVar4.e(f2) : null);
        } else {
            bVar = null;
        }
        String id = gVar.getId();
        String title = gVar.getTitle();
        com.yandex.plus.core.theme.c e6 = aVar4.e(gVar.L());
        List list8 = c5b.a;
        com.yandex.plus.home.feature.panel.internalapi.shortcuts.daily.f fVar7 = new com.yandex.plus.home.feature.panel.internalapi.shortcuts.daily.f(title, e6, list8, list8);
        com.yandex.plus.home.feature.panel.internalapi.shortcuts.daily.f fVar8 = new com.yandex.plus.home.feature.panel.internalapi.shortcuts.daily.f(gVar.getSubtitle(), aVar4.e(gVar.K()), com.yandex.passport.data.network.l.Q(gVar.C()), lVar.P(gVar.p()));
        String h = gVar.h();
        if (h == null) {
            h = "";
        }
        v j = gVar.j();
        com.yandex.plus.core.theme.c e7 = j != null ? aVar4.e(j) : new com.yandex.plus.core.theme.a(com.yandex.plus.home.common.utils.a.b(aVar4.b, R.attr.plus_sdk_panelDefaultTextColor));
        List k = gVar.k();
        List Q3 = k != null ? com.yandex.passport.data.network.l.Q(k) : null;
        if (Q3 == null) {
            Q3 = list8;
        }
        List i2 = gVar.i();
        List P = i2 != null ? lVar.P(i2) : null;
        if (P != null) {
            list8 = P;
        }
        com.yandex.plus.home.feature.panel.internalapi.shortcuts.daily.f fVar9 = new com.yandex.plus.home.feature.panel.internalapi.shortcuts.daily.f(h, e7, Q3, list8);
        com.yandex.plus.home.feature.panel.internalapi.shortcuts.daily.a aVar7 = new com.yandex.plus.home.feature.panel.internalapi.shortcuts.daily.a(aVar4.c(gVar.getBackgroundColor()), aVar4.a());
        final d0 q = gVar.q();
        if (q != null) {
            final int i3 = 1;
            aVar2 = new Function0() { // from class: com.yandex.plus.home.feature.panel.internal.mapper.a
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i3) {
                        case 0:
                            r90Var.invoke(q);
                            break;
                        default:
                            r90Var.invoke(q);
                            break;
                    }
                    return Unit.a;
                }
            };
        } else {
            aVar2 = null;
        }
        d0 g = gVar.g();
        if (g != null) {
            String str8 = g.a;
            com.yandex.plus.core.theme.c e8 = aVar5.e(g.b);
            v vVar4 = g.f;
            vVar4.getClass();
            com.yandex.plus.core.data.common.k c3 = aVar5.c(vVar4);
            if (c3 == null) {
                c3 = new com.yandex.plus.core.data.common.f(aVar5.a());
            }
            dVar2 = new com.yandex.plus.home.feature.panel.internalapi.shortcuts.daily.d(str8, e8, c3);
        } else {
            dVar2 = null;
        }
        com.yandex.plus.home.repository.api.model.panel.h n = gVar.n();
        if (n != null) {
            v vVar5 = n.f;
            vVar5.getClass();
            com.yandex.plus.core.data.common.k c4 = aVar4.c(vVar5);
            if (c4 == null) {
                c4 = new com.yandex.plus.core.data.common.f(aVar4.a());
            }
            com.yandex.plus.core.data.common.k kVar3 = c4;
            String str9 = n.a;
            ArrayList P2 = lVar.P(n.d);
            ArrayList Q4 = com.yandex.passport.data.network.l.Q(n.e);
            com.yandex.plus.core.data.common.k d2 = aVar4.d(n.b);
            com.yandex.plus.core.data.common.k d3 = aVar4.d(n.c);
            v vVar6 = n.h;
            if (vVar6 == null || (fVar3 = aVar4.c(vVar6)) == null) {
                fVar3 = new com.yandex.plus.core.data.common.f(this.A0);
            }
            eVar = new com.yandex.plus.home.feature.panel.internalapi.shortcuts.daily.e(kVar3, str9, Q4, P2, d2, d3, fVar3, (float) n.g);
        } else {
            eVar = null;
        }
        String b3 = aVar4.b(gVar.m());
        y l = gVar.l();
        String b4 = l != null ? aVar4.b(l) : null;
        y o = gVar.o();
        com.yandex.plus.home.feature.panel.internalapi.shortcuts.daily.b bVar3 = bVar;
        com.yandex.plus.home.feature.panel.internalapi.shortcuts.daily.h hVar = new com.yandex.plus.home.feature.panel.internalapi.shortcuts.daily.h(new com.yandex.plus.home.feature.panel.internalapi.shortcuts.daily.g(id, fVar7, fVar8, fVar9, aVar7, aVar2, dVar2, eVar, bVar, b3, b4, o != null ? aVar4.b(o) : null, z), cVar);
        com.yandex.plus.log.api.a aVar8 = com.yandex.plus.log.api.a.b;
        if (bVar2.b(aVar8)) {
            bVar2.c(aVar8, "PlusPanelDailySectionView", "extractView() added content " + hVar);
        }
        com.yandex.plus.home.feature.panel.internalapi.shortcuts.daily.m mVar = this.D0;
        if (mVar != null) {
            com.yandex.plus.home.feature.panel.internalapi.analytics.b bVar4 = mVar.g;
            String str10 = bVar3 != null ? bVar3.b : null;
            if (cVar == null || (str2 = cVar.a) == null || (c = u75.h(id, str2)) == null) {
                c = t75.c(id);
            }
            com.yandex.plus.home.analytics.b bVar5 = (com.yandex.plus.home.analytics.b) bVar4;
            bVar5.getClass();
            c.getClass();
            omb ombVar = bVar5.a;
            int intValue = (str10 == null || (intOrNull = StringsKt.toIntOrNull(str10)) == null) ? -1 : intOrNull.intValue();
            e5b e5bVar = e5b.a;
            e5bVar.getClass();
            ombVar.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("counter_val", String.valueOf(intValue));
            linkedHashMap.put("origin", e5bVar);
            linkedHashMap.put("shortcut_ids", c);
            linkedHashMap.put("_meta", omb.a(1, new HashMap()));
            ombVar.d("PlusPult.DailyWidget.Loaded", linkedHashMap);
            if (!Intrinsics.d(mVar.r, hVar)) {
                mVar.r = hVar;
                x97.y((tf6) mVar.c, null, null, new com.yandex.passport.internal.ui.social.i(mVar, null, 13), 3);
            }
        }
        r1.G(nVar);
        nVar.setLayoutParams(new com.yandex.plus.home.feature.panel.internal.base.a(-2));
        addView(nVar);
    }
}
