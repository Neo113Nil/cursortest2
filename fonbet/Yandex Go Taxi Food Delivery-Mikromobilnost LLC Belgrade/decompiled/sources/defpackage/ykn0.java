package defpackage;

import android.os.Looper;
import android.text.style.ClickableSpan;
import com.google.common.collect.ImmutableList;
import com.yandex.go.scooters.insurance.details.ScootersInsuranceDetailsModalView;
import com.yandex.go.service_catalog.router.b;
import com.yandex.messaging.core.net.entities.StickerPacksBucket;
import com.yandex.messaging.core.net.entities.StickerPacksData;
import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import com.ybsdk.core.stories.CloseButtonVisibility;
import com.ybsdk.core.stories.StoriesComponentView;
import com.ybsdk.core.stories.ui.CommunicationFullscreenTitlePaddingMode;
import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.card.internal.entities.CardProductTypeEntity;
import com.ybsdk.feature.settings.internal.view.SettingsThemeView;
import com.ybsdk.feature.stories.internal.screens.stories.c;
import com.ybsdk.rconfig.configs.NonYbProductDetailsFlags;
import com.ybsdk.widgets.common.checkbox.CheckBoxView;
import defpackage.hnn0;
import defpackage.rol0;
import defpackage.tpr;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.shortcuts.ui.shortcutview.ShortcutsView;
import ru.yandex.taxi.stories.presentation.story.StoryContentView;
import ru.yandex.taxi.superapp.shortcuts.a;

/* loaded from: classes3.dex */
public final /* synthetic */ class ykn0 implements lln0, mep0, dly, u1d0, dx4, qhk, o0j0, q3l0, ffb, zxw0, shw0, ev31, uhw0, eps0, go3, zqx, c9e {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ykn0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.go3
    public void D(Object obj) {
        int i = this.a;
        int i2 = 22;
        Object obj2 = this.b;
        switch (i) {
            case 19:
                vbu0 vbu0Var = (vbu0) obj2;
                StickerPacksData.PackData[] packDataArr = (StickerPacksData.PackData[]) obj;
                if (vbu0Var.b != null) {
                    for (StickerPacksData.PackData packData : packDataArr) {
                        if (packData.coverId == null) {
                            StickerPacksData.StickerData[] stickerDataArr = packData.stickers;
                            packData.coverId = (stickerDataArr == null || stickerDataArr.length == 0) ? null : stickerDataArr[0].stickerId;
                        }
                    }
                    r3k0 r3k0Var = vbu0Var.b;
                    jdu0 jdu0Var = (jdu0) r3k0Var.b;
                    String[] strArr = (String[]) r3k0Var.c;
                    jdu0Var.c = null;
                    pcu0 pcu0Var = jdu0Var.b;
                    odu0 odu0Var = pcu0Var.b;
                    odu0Var.a.P(new scs0(i2, packDataArr, odu0Var));
                    pcu0Var.a(strArr);
                    break;
                }
                break;
            case 23:
                bdu0 bdu0Var = (bdu0) obj2;
                bdu0Var.f = null;
                bdu0Var.b((StickerPacksBucket) obj);
                break;
            default:
                kdu0 kdu0Var = (kdu0) obj2;
                StickerPacksData.PackData packData2 = ((StickerPacksData.PackData[]) obj)[0];
                ldu0 ldu0Var = kdu0Var.y;
                z83.g(null, ldu0Var.a, Looper.myLooper());
                odu0 odu0Var2 = ldu0Var.c.b;
                odu0Var2.a.P(new scs0(i2, new StickerPacksData.PackData[]{packData2}, odu0Var2));
                kdu0Var.b.post(new tpt0(7, kdu0Var, packData2));
                break;
        }
    }

    @Override // defpackage.zqx
    public void a(List list) {
        StoryContentView.setDataWithoutButtons$lambda$0((StoryContentView) this.b, list);
    }

    @Override // defpackage.c9e
    public void accept(Object obj) {
        j2v0 j2v0Var = (j2v0) this.b;
        tdf tdfVar = (tdf) obj;
        long j = tdfVar.b;
        qdf qdfVar = j2v0Var.b;
        ImmutableList immutableList = tdfVar.a;
        long j2 = tdfVar.c;
        qdfVar.getClass();
        i2v0 i2v0Var = new i2v0(j, qdf.a(j2, immutableList));
        j2v0Var.d.add(i2v0Var);
        long j3 = j2v0Var.k;
        if (j3 == -9223372036854775807L || tdfVar.b >= j3) {
            j2v0Var.b(i2v0Var);
        }
    }

    @Override // defpackage.ffb
    public void b(CheckBoxView checkBoxView, boolean z) {
        SettingsThemeView._init_$lambda$3((SettingsThemeView) this.b, checkBoxView, z);
    }

    @Override // defpackage.o0j0
    public void d(long j, ef90 ef90Var) {
        sgb1.b(j, ef90Var, (g001[]) ((amp0) this.b).b);
    }

    @Override // defpackage.q3l0
    public o3l0 e(ou ouVar) {
        return (b) this.b;
    }

    @Override // defpackage.u1d0
    public void h(w7o w7oVar) {
        ((epo0) this.b).run();
    }

    @Override // defpackage.mep0
    public a k(dgp0 dgp0Var) {
        final hnn0 hnn0Var = (hnn0) this.b;
        tse tseVar = hnn0Var.b;
        faf0 faf0Var = new faf0() { // from class: ru.yandex.taxi.scooters.presentation.finish_info.shortcuts.a
            @Override // defpackage.faf0
            public final tpr a() {
                return new rol0(new ScootersFinishInfoShortcutGridViewFactory$createRideFinishShortcutGridView$9$1$1(hnn0.this, null));
            }
        };
        inn0 inn0Var = hnn0Var.h;
        lnn0 lnn0Var = hnn0Var.g;
        dgp0Var.getClass();
        return new a(tseVar, dgp0Var.a, inn0Var, lnn0Var, faf0Var);
    }

    @Override // defpackage.dly
    public boolean n(ClickableSpan clickableSpan) {
        boolean linkMovementMethod_delegate$lambda$0$0;
        linkMovementMethod_delegate$lambda$0$0 = ScootersInsuranceDetailsModalView.linkMovementMethod_delegate$lambda$0$0((lg21) this.b, clickableSpan);
        return linkMovementMethod_delegate$lambda$0$0;
    }

    @Override // defpackage.dx4
    public void o(ru.yandex.taxi.search.view.a aVar, pv0 pv0Var) {
        ((ehn0) this.b).invoke();
    }

    @Override // defpackage.zxw0
    public void onRefresh() {
        ShortcutsView.setPullToRefreshListener$lambda$0((tfx) this.b);
    }

    @Override // defpackage.eps0
    public void p(int i, long j) {
        int i2 = this.a;
        Object obj = this.b;
        switch (i2) {
            case 15:
                ((f9e0) ((mps0) obj).T.a).b(i, j);
                break;
            default:
                ((g760) obj).T.invoke();
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02ae A[LOOP:1: B:104:0x02a8->B:106:0x02ae, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02db A[LOOP:2: B:109:0x02d5->B:111:0x02db, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0271  */
    /* JADX WARN: Type inference failed for: r8v4, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v27, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v28, types: [ylu0] */
    @Override // defpackage.ev31
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object q(Object obj) {
        rbv rbvVar;
        rbv rbvVar2;
        pgs0 pgs0Var;
        dn8 dn8Var;
        List list;
        aq51 aq51Var;
        com.ybsdk.rconfig.b bVar;
        dfr dfrVar;
        Text.Constant i;
        com.ybsdk.core.utils.text.b bVar2;
        String str;
        Text.Constant constant;
        dn8 dn8Var2;
        pgs0 pgs0Var2;
        ?? r8;
        ColorModel attr;
        List list2;
        ?? xlu0Var;
        int i2 = this.a;
        Object obj2 = this.b;
        ArrayList arrayList = null;
        switch (i2) {
            case 13:
                sgs0 sgs0Var = (sgs0) obj2;
                rgs0 rgs0Var = (rgs0) obj;
                sgs0Var.getClass();
                CardProductTypeEntity cardProductTypeEntity = rgs0Var.h;
                e7r0 e7r0Var = rgs0Var.f;
                boolean z = rgs0Var.d;
                u8j0 u8j0Var = rgs0Var.a;
                u8j0Var.getClass();
                if (u8j0Var instanceof t8j0) {
                    return new bhs0(cardProductTypeEntity);
                }
                hgs0 hgs0Var = (hgs0) u8j0Var.a();
                boolean z2 = u8j0Var instanceof s8j0;
                if (z2 || hgs0Var == null) {
                    s8j0 s8j0Var = z2 ? (s8j0) u8j0Var : null;
                    return new ahs0(r501.a(s8j0Var != null ? s8j0Var.a : null, null, null, null, null, null, null, null, null, null, null, null, null, 65534));
                }
                ThemedImageUrlEntity themedImageUrlEntity = hgs0Var.a.e.a;
                rbv c = fob1.c(themedImageUrlEntity.getLightUrl(), themedImageUrlEntity.getDarkUrl(), new ukr0(20));
                if (c == null) {
                    c = new nbv(zxg0.ybsdk_card_skeleton, null);
                }
                rbv rbvVar3 = c;
                hgs0 hgs0Var2 = (hgs0) u8j0Var.a();
                if (((hgs0Var2 == null || (pgs0Var2 = hgs0Var2.a) == null) ? null : pgs0Var2.g) != null) {
                    rbvVar = hgs0Var2.a.g;
                } else {
                    rbvVar = (hgs0Var2 == null || (pgs0Var = hgs0Var2.a) == null) ? null : pgs0Var.f;
                    if (!rgs0Var.b) {
                        rbvVar2 = null;
                        if (hgs0Var.m) {
                            dn8Var = null;
                        } else {
                            wm8 wm8Var = sgs0Var.a;
                            u8j0 u8j0Var2 = rgs0Var.c;
                            boolean z3 = u8j0Var2 instanceof t8j0;
                            r8j0 r8j0Var = u8j0Var2 instanceof r8j0 ? (r8j0) u8j0Var2 : null;
                            if (r8j0Var != null) {
                                if (!z) {
                                    r8j0Var = null;
                                }
                                if (r8j0Var != null) {
                                    aq51Var = (aq51) r8j0Var.a;
                                    qgs0 qgs0Var = hgs0Var.b;
                                    if8 if8Var = (if8) wm8Var;
                                    bVar = if8Var.a;
                                    dfrVar = oe60.a;
                                    if (!(((NonYbProductDetailsFlags) bVar.d(dfrVar).getData()).getNonYbProductsEnabled() && cardProductTypeEntity == CardProductTypeEntity.SPLIT) && (((NonYbProductDetailsFlags) if8Var.a.d(dfrVar).getData()).getAdvancedRequisitesEnabled() || !(qgs0Var.b == null || qgs0Var.a == null))) {
                                        Text.Resource resource = new Text.Resource(dzh0.ybsdk_card_card_pan_title);
                                        if (aq51Var != null) {
                                            String str2 = qgs0Var.a;
                                            i = str2 != null ? new Text.Constant("•••• •••• •••• ".concat(str2)) : new Text.Constant("•••• •••• •••• ••••");
                                        } else {
                                            com.ybsdk.core.utils.text.b bVar3 = Text.Companion;
                                            String str3 = aq51Var.a;
                                            l9s l9sVar = new l9s(bpu.c, false, false);
                                            l9sVar.d(0, str3);
                                            i = g8e.i(bVar3, l9sVar.b());
                                        }
                                        yqj0 yqj0Var = new yqj0(i, resource, z3);
                                        Text.Resource resource2 = new Text.Resource(dzh0.ybsdk_card_card_cvv_title);
                                        if (aq51Var != null) {
                                            bVar2 = Text.Companion;
                                            str = "•••";
                                        } else {
                                            bVar2 = Text.Companion;
                                            str = aq51Var.b;
                                        }
                                        yqj0 yqj0Var2 = new yqj0(g8e.i(bVar2, str), resource2, z3);
                                        Text.Resource resource3 = new Text.Resource(dzh0.ybsdk_card_card_expiratio_date_title);
                                        if (aq51Var != null) {
                                            constant = g8e.i(Text.Companion, "••/••");
                                        } else {
                                            String str4 = qgs0Var.b;
                                            constant = new Text.Constant(str4 != null ? str4 : "••/••");
                                        }
                                        dn8Var2 = new dn8(yqj0Var2, new yqj0(constant, resource3, z3), yqj0Var);
                                    } else {
                                        dn8Var2 = null;
                                    }
                                    dn8Var = dn8Var2;
                                }
                            }
                            aq51Var = null;
                            qgs0 qgs0Var2 = hgs0Var.b;
                            if8 if8Var2 = (if8) wm8Var;
                            bVar = if8Var2.a;
                            dfrVar = oe60.a;
                            if (((NonYbProductDetailsFlags) bVar.d(dfrVar).getData()).getNonYbProductsEnabled()) {
                            }
                            Text.Resource resource4 = new Text.Resource(dzh0.ybsdk_card_card_pan_title);
                            if (aq51Var != null) {
                            }
                            yqj0 yqj0Var3 = new yqj0(i, resource4, z3);
                            Text.Resource resource22 = new Text.Resource(dzh0.ybsdk_card_card_cvv_title);
                            if (aq51Var != null) {
                            }
                            yqj0 yqj0Var22 = new yqj0(g8e.i(bVar2, str), resource22, z3);
                            Text.Resource resource32 = new Text.Resource(dzh0.ybsdk_card_card_expiratio_date_title);
                            if (aq51Var != null) {
                            }
                            dn8Var2 = new dn8(yqj0Var22, new yqj0(constant, resource32, z3), yqj0Var3);
                            dn8Var = dn8Var2;
                        }
                        nbv nbvVar = !z ? new nbv(zxg0.ybsdk_ic_eye_crossed_outline, null) : new nbv(zxg0.ybsdk_ic_eye_outline, null);
                        Text.Resource resource5 = !z ? new Text.Resource(dzh0.ybsdk_card_accessibility_details_hide_requisites_description) : new Text.Resource(dzh0.ybsdk_card_accessibility_details_show_requisites_description);
                        List<o8r0> list3 = hgs0Var.e;
                        ArrayList arrayList2 = new ArrayList(tcc.n(list3, 10));
                        for (o8r0 o8r0Var : list3) {
                            arrayList2.add(j9r0.b(o8r0Var, jl40.l(o8r0Var.a, e7r0Var.b), true));
                        }
                        List<o8r0> list4 = hgs0Var.f;
                        ArrayList arrayList3 = new ArrayList(tcc.n(list4, 10));
                        for (o8r0 o8r0Var2 : list4) {
                            arrayList3.add(j9r0.b(o8r0Var2, jl40.l(o8r0Var2.a, e7r0Var.b), true));
                        }
                        list = hgs0Var.l;
                        if (list != null) {
                            List<o8r0> list5 = list;
                            arrayList = new ArrayList(tcc.n(list5, 10));
                            for (o8r0 o8r0Var3 : list5) {
                                arrayList.add(j9r0.b(o8r0Var3, jl40.l(o8r0Var3.a, e7r0Var.b), true));
                            }
                        }
                        return new zgs0(hgs0Var, arrayList2, arrayList3, arrayList, rbvVar3, rbvVar2, dn8Var, nbvVar, resource5);
                    }
                }
                rbvVar2 = rbvVar;
                if (hgs0Var.m) {
                }
                nbv nbvVar2 = !z ? new nbv(zxg0.ybsdk_ic_eye_crossed_outline, null) : new nbv(zxg0.ybsdk_ic_eye_outline, null);
                Text.Resource resource52 = !z ? new Text.Resource(dzh0.ybsdk_card_accessibility_details_hide_requisites_description) : new Text.Resource(dzh0.ybsdk_card_accessibility_details_show_requisites_description);
                List<o8r0> list32 = hgs0Var.e;
                ArrayList arrayList22 = new ArrayList(tcc.n(list32, 10));
                while (r0.hasNext()) {
                }
                List<o8r0> list42 = hgs0Var.f;
                ArrayList arrayList32 = new ArrayList(tcc.n(list42, 10));
                while (r0.hasNext()) {
                }
                list = hgs0Var.l;
                if (list != null) {
                }
                return new zgs0(hgs0Var, arrayList22, arrayList32, arrayList, rbvVar3, rbvVar2, dn8Var, nbvVar2, resource52);
            default:
                com.ybsdk.feature.stories.internal.screens.stories.b bVar4 = (com.ybsdk.feature.stories.internal.screens.stories.b) obj2;
                c cVar = (c) obj;
                bVar4.getClass();
                boolean z4 = cVar.c;
                u8j0 u8j0Var3 = cVar.a;
                hmu0 hmu0Var = (hmu0) u8j0Var3.a();
                if (u8j0Var3 instanceof t8j0) {
                    return xnu0.a;
                }
                boolean z5 = u8j0Var3 instanceof s8j0;
                if (z5) {
                    s8j0 s8j0Var2 = z5 ? (s8j0) u8j0Var3 : null;
                    Throwable th = s8j0Var2 != null ? s8j0Var2.a : null;
                    x4c.g("Stories loading error", th, null, null, 12);
                    return new wnu0(r501.a(th, null, null, null, null, null, null, null, null, null, null, null, null, 49150));
                }
                boolean z6 = (hmu0Var != null ? hmu0Var.d : null) != null;
                if (hmu0Var == null || (list2 = hmu0Var.a) == null) {
                    r8 = EmptyList.a;
                } else {
                    List<wou0> list6 = list2;
                    r8 = new ArrayList(tcc.n(list6, 10));
                    for (wou0 wou0Var : list6) {
                        if (wou0Var instanceof tou0) {
                            tou0 tou0Var = (tou0) wou0Var;
                            xlu0Var = new ylu0(tou0Var.d, tou0Var.g, tou0Var.e, tou0Var.c);
                        } else {
                            if (!(wou0Var instanceof vou0)) {
                                w511.b();
                                return null;
                            }
                            vou0 vou0Var = (vou0) wou0Var;
                            xlu0Var = new xlu0(dsc.b(vou0Var, bVar4.a, (list2.size() > 1 || z6) ? CommunicationFullscreenTitlePaddingMode.MULTIPLE : CommunicationFullscreenTitlePaddingMode.EMPTY_TOOLBAR, null, 28), vou0Var.f, vou0Var.k, vou0Var.c);
                        }
                        r8.add(xlu0Var);
                    }
                }
                List list7 = r8;
                int i3 = cVar.b;
                CloseButtonVisibility closeButtonVisibility = (!cVar.d || z4) ? CloseButtonVisibility.GONE : CloseButtonVisibility.VISIBLE;
                c.a aVar = cVar.e;
                StoriesComponentView.a aVar2 = new StoriesComponentView.a(i3, list7, new StoriesComponentView.a.C0090a(aVar.b, aVar.a), closeButtonVisibility, z6, false, (StoriesComponentView.a.b) null, 224);
                zlu0 zlu0Var = (zlu0) kotlin.collections.a.S(cVar.b, aVar2.b);
                if (zlu0Var == null || (attr = zlu0Var.b) == null) {
                    attr = new ColorModel.Attr(ung0.ybColor_background_primary);
                }
                return new vnu0(aVar2, attr, z4);
        }
    }
}
