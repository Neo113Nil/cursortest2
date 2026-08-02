package defpackage;

import android.content.Context;
import android.view.ContextThemeWrapper;
import com.ybsdk.core.common.data.network.dto.ThemedParameter;
import com.ybsdk.core.common.domain.entities.ColoredTextEntity;
import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.core.utils.text.b;
import com.ybsdk.feature.dashboard.api.model.SupportState;
import com.ybsdk.feature.dashboard.internal.domain.model.TopButton$Alignment;
import com.ybsdk.feature.dashboard.internal.domain.model.TopButtonTag;
import com.ybsdk.feature.dashboard.internal.ui.dashboard3.DashboardV3ScreenParams;
import com.ybsdk.feature.divkit.api.domain.LocalVariableMutation;
import com.ybsdk.feature.divkit.api.domain.LocalVariableName;
import com.ybsdk.rconfig.configs.DashboardV3Product;
import com.ybsdk.rconfig.configs.DashboardV3Products;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.a;
import kotlin.collections.builders.ListBuilder;

/* loaded from: classes3.dex */
public final class xmg implements ev31 {
    public final psp0 a;
    public final dlg b;
    public final Context c;
    public final yig w;

    public xmg(psp0 psp0Var, dlg dlgVar, ha60 ha60Var, Context context, yig yigVar) {
        this.a = psp0Var;
        this.b = dlgVar;
        this.c = context;
        this.w = yigVar;
    }

    public static jmg c(nmg nmgVar) {
        mmg mmgVar = nmgVar.a;
        if (mmgVar instanceof lmg) {
            return new img(((lmg) mmgVar).a);
        }
        if (mmgVar instanceof kmg) {
            return new hmg(((kmg) mmgVar).a);
        }
        w511.b();
        return null;
    }

    public static qsz0 e(awz0 awz0Var, SupportState supportState) {
        b bVar;
        int i;
        TopButtonTag topButtonTag = awz0Var.c;
        String str = awz0Var.a;
        TopButtonTag topButtonTag2 = TopButtonTag.SUPPORT_URL;
        Text.Resource resource = null;
        if (topButtonTag == topButtonTag2 && supportState != null) {
            int i2 = wmg.b[supportState.ordinal()];
            if (i2 != 1 && i2 != 2) {
                w511.b();
                return null;
            }
            return new qsz0(topButtonTag2, str, skw0.b(supportState), skw0.c(supportState));
        }
        rbv f = job1.f(awz0Var.b, new suf(18));
        if (f == null) {
            x4c.h("Failed to create ImageModel for toolbar top button", new srp0[]{lrp0.g}, null, 12);
            f = null;
        }
        int i3 = wmg.a[awz0Var.c.ordinal()];
        if (i3 == 1) {
            bVar = Text.Companion;
            i = dzh0.ybsdk_dashboard_action_contact_support_title;
        } else {
            if (i3 != 2) {
                if (i3 != 3) {
                    w511.b();
                    return null;
                }
                return new qsz0(topButtonTag, str, f, resource);
            }
            bVar = Text.Companion;
            i = dzh0.ybsdk_dashboard_action_profile_title;
        }
        resource = unr0.h(bVar, i);
        return new qsz0(topButtonTag, str, f, resource);
    }

    public final aq8 a(nmg nmgVar) {
        Object obj;
        Object obj2;
        rev revVar;
        DashboardV3ScreenParams dashboardV3ScreenParams;
        a9f0 a9f0Var;
        ColorModel e;
        dig digVar;
        rbv rbvVar;
        eh4 eh4Var;
        dyt dytVar;
        eh4 eh4Var2;
        fxy0 fxy0Var;
        eh4 eh4Var3;
        fxy0 fxy0Var2;
        List list;
        a9f0 a9f0Var2;
        String str;
        fxy0 c;
        String str2;
        fxy0 c2;
        fxy0 c3;
        String str3;
        fxy0 c4;
        ArrayList arrayList;
        List W;
        String productId;
        alg algVar;
        rev revVar2;
        jbv jbvVar;
        jbv jbvVar2;
        rev revVar3 = rev.f;
        mmg mmgVar = nmgVar.a;
        if (!(mmgVar instanceof lmg)) {
            if (mmgVar instanceof kmg) {
                return new zp8(false);
            }
            w511.b();
            return null;
        }
        lmg lmgVar = (lmg) mmgVar;
        List list2 = lmgVar.b;
        String str4 = lmgVar.a;
        Iterator it = list2.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (jl40.l(((DashboardV3ScreenParams) obj).getProductId(), str4)) {
                break;
            }
        }
        DashboardV3ScreenParams dashboardV3ScreenParams2 = (DashboardV3ScreenParams) obj;
        j0g j0gVar = (j0g) this.b;
        List<DashboardV3Product> products = ((DashboardV3Products) ((com.ybsdk.rconfig.b) j0gVar.a).d(kr51.a).getData()).getProducts();
        ContextThemeWrapper contextThemeWrapper = (ContextThemeWrapper) j0gVar.b;
        char c5 = '\n';
        ArrayList arrayList2 = new ArrayList(tcc.n(products, 10));
        for (DashboardV3Product dashboardV3Product : products) {
            String productId2 = dashboardV3Product.getProductId();
            alg algVar2 = new alg(dashboardV3Product.getTitle().getText(), new zkg(dashboardV3Product.getTitle().getTextColor().getLight(), dashboardV3Product.getTitle().getTextColor().getDark()));
            ThemedParameter<String> image = dashboardV3Product.getBackground().getImage();
            if (image != null) {
                String light = image.getLight();
                String dark = image.getDark();
                algVar = algVar2;
                revVar2 = revVar3;
                jbvVar = fob1.a(new pbv(light, (ccv) null, revVar2, (dcv) null, (vfv) null, 58), new pbv(dark, (ccv) null, revVar2, (dcv) null, (vfv) null, 58));
                v4b1.g(jbvVar, contextThemeWrapper);
            } else {
                algVar = algVar2;
                revVar2 = revVar3;
                jbvVar = null;
            }
            xkg xkgVar = new xkg(jbvVar, new zkg(dashboardV3Product.getBackground().getColor().getLight(), dashboardV3Product.getBackground().getColor().getDark()));
            String light2 = dashboardV3Product.getTitleLogo().getLight();
            String dark2 = dashboardV3Product.getTitleLogo().getDark();
            rev revVar4 = rev.k;
            jbv a = fob1.a(new pbv(light2, (ccv) null, revVar4, (dcv) null, (vfv) null, 58), new pbv(dark2, (ccv) null, revVar4, (dcv) null, (vfv) null, 58));
            if (dashboardV3Product.getIconAfterTitle() != null) {
                String light3 = dashboardV3Product.getIconAfterTitle().getLight();
                String dark3 = dashboardV3Product.getIconAfterTitle().getDark();
                rev revVar5 = rev.e;
                jbvVar2 = fob1.a(new pbv(light3, (ccv) null, revVar5, (dcv) null, (vfv) null, 58), new pbv(dark3, (ccv) null, revVar5, (dcv) null, (vfv) null, 58));
            } else {
                jbvVar2 = null;
            }
            arrayList2.add(new blg(productId2, algVar, xkgVar, a, new ykg(new zkg(dashboardV3Product.getBalance().getParticleColor().getLight(), dashboardV3Product.getBalance().getParticleColor().getDark()), new zkg(dashboardV3Product.getBalance().getBalanceColor().getLight(), dashboardV3Product.getBalance().getBalanceColor().getDark())), jbvVar2));
            revVar3 = revVar2;
            c5 = '\n';
        }
        rev revVar6 = revVar3;
        Iterator it2 = arrayList2.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it2.next();
            if (jl40.l(((blg) obj2).a, str4)) {
                break;
            }
        }
        blg blgVar = (blg) obj2;
        boolean z = (dashboardV3ScreenParams2 == null || (productId = dashboardV3ScreenParams2.getProductId()) == null || !productId.equals("corp_card")) ? false : true;
        if (dashboardV3ScreenParams2 != null && blgVar != null) {
            alg algVar3 = blgVar.b;
            if (!list2.isEmpty()) {
                Context context = this.c;
                if (!lia1.g(context)) {
                    String string = this.w.a.a.getString("product_skin_for_".concat(str4.toLowerCase(Locale.ROOT)), null);
                    if (string != null) {
                        List<String> M = evu0.M(string);
                        int d = gw00.d(tcc.n(M, 10));
                        if (d < 16) {
                            d = 16;
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap(d);
                        for (String str5 : M) {
                            Pair pair = new Pair(evu0.f0(':', str5, str5), evu0.c0(':', str5, str5));
                            linkedHashMap.put(pair.c(), pair.f());
                        }
                        String str6 = (String) linkedHashMap.get("mini_rays_gradient");
                        if (str6 != null) {
                            String d0 = evu0.d0(str6, "l:", str6);
                            list = evu0.W(evu0.g0(d0, ":d:", d0), new String[]{";"}, (r2 & 4) != 0 ? 0 : 2);
                        } else {
                            list = null;
                        }
                        String str7 = (String) linkedHashMap.get("mini_rays_gradient");
                        List W2 = str7 != null ? evu0.W(evu0.d0(str7, ":d:", str7), new String[]{";"}, (r2 & 4) != 0 ? 0 : 2) : null;
                        fxy0 fxy0Var3 = (W2 == null || list == null) ? null : new fxy0(W2, list);
                        String str8 = (String) linkedHashMap.get("id");
                        if (str8 != null && (str = (String) linkedHashMap.get("mini_background_color")) != null && (c = o3b1.c(str)) != null && (str2 = (String) linkedHashMap.get("mini_background_image")) != null && (c2 = o3b1.c(str2)) != null) {
                            String str9 = (String) linkedHashMap.get("mini_title_color");
                            fxy0 c6 = str9 != null ? o3b1.c(str9) : null;
                            String str10 = (String) linkedHashMap.get("mini_end_icon");
                            fxy0 c7 = str10 != null ? o3b1.c(str10) : null;
                            String str11 = (String) linkedHashMap.get("mini_selection_color");
                            fxy0 c8 = str11 != null ? o3b1.c(str11) : null;
                            String str12 = (String) linkedHashMap.get("mini_top_gradient_color");
                            fxy0 c9 = str12 != null ? o3b1.c(str12) : null;
                            String str13 = (String) linkedHashMap.get("mini_balance_shimmer");
                            fxy0 c10 = str13 != null ? o3b1.c(str13) : null;
                            String str14 = (String) linkedHashMap.get("mini_balance_skeleton");
                            b9f0 b9f0Var = new b9f0(c2, c, c6, c7, fxy0Var3, c8, c9, c10, str14 != null ? o3b1.c(str14) : null);
                            String str15 = (String) linkedHashMap.get("background_color");
                            if (str15 != null && (c3 = o3b1.c(str15)) != null && (str3 = (String) linkedHashMap.get("background_image")) != null && (c4 = o3b1.c(str3)) != null) {
                                String str16 = (String) linkedHashMap.get("background_gradient_colors");
                                if (str16 != null) {
                                    revVar = revVar6;
                                    dashboardV3ScreenParams = dashboardV3ScreenParams2;
                                    W = evu0.W(str16, new String[]{","}, (r2 & 4) != 0 ? 0 : 2);
                                    arrayList = new ArrayList();
                                    Iterator it3 = W.iterator();
                                    while (it3.hasNext()) {
                                        fxy0 c11 = o3b1.c((String) it3.next());
                                        if (c11 != null) {
                                            arrayList.add(c11);
                                        }
                                    }
                                } else {
                                    revVar = revVar6;
                                    dashboardV3ScreenParams = dashboardV3ScreenParams2;
                                    arrayList = null;
                                }
                                String str17 = (String) linkedHashMap.get("background_gradient_angle");
                                Integer valueOf = str17 != null ? Integer.valueOf(Integer.parseInt(str17)) : null;
                                a9f0Var2 = new a9f0(str8, b9f0Var, new eh4(c3, c4, (valueOf == null || arrayList == null || arrayList.isEmpty()) ? null : new dyt(arrayList, valueOf.intValue())));
                                a9f0Var = a9f0Var2;
                            }
                        }
                        revVar = revVar6;
                        dashboardV3ScreenParams = dashboardV3ScreenParams2;
                        a9f0Var2 = null;
                        a9f0Var = a9f0Var2;
                    } else {
                        revVar = revVar6;
                        dashboardV3ScreenParams = dashboardV3ScreenParams2;
                        a9f0Var = null;
                    }
                    boolean e2 = j0gVar.e(str4);
                    String productId3 = dashboardV3ScreenParams.getProductId();
                    b bVar = Text.Companion;
                    xkg xkgVar2 = blgVar.c;
                    ykg ykgVar = blgVar.e;
                    Text.Constant i = g8e.i(bVar, algVar3.a);
                    zkg zkgVar = algVar3.b;
                    ColorModel e3 = lvy0.e(zkgVar.a, zkgVar.b);
                    if (e3 == null) {
                        e3 = new ColorModel.Attr(ung0.ybColor_background_primary);
                    }
                    ColorModel colorModel = e3;
                    Text.Constant constant = new Text.Constant(dashboardV3ScreenParams.getBalance());
                    zkg zkgVar2 = ykgVar.b;
                    ColorModel e4 = lvy0.e(zkgVar2.a, zkgVar2.b);
                    if (e4 == null) {
                        e4 = new ColorModel.Attr(ung0.ybColor_background_primary);
                    }
                    dig digVar2 = new dig(constant, e4, null, null);
                    fig figVar = new fig(null, e2);
                    jbv jbvVar3 = blgVar.d;
                    zkg zkgVar3 = ykgVar.a;
                    ColorModel e5 = lvy0.e(zkgVar3.a, zkgVar3.b);
                    if (e5 == null) {
                        e5 = new ColorModel.Attr(ung0.ybColor_fill_default_300);
                    }
                    gig gigVar = new gig(e5, rje.d(vvg0.ybsdk_product_card_balance_spoiler_width, context), rje.d(vvg0.ybsdk_product_card_balance_spoiler_height, context));
                    if (a9f0Var == null || (eh4Var3 = a9f0Var.c) == null || (fxy0Var2 = eh4Var3.a) == null || (e = gxy0.a(fxy0Var2)) == null) {
                        zkg zkgVar4 = xkgVar2.b;
                        e = lvy0.e(zkgVar4.a, zkgVar4.b);
                        if (e == null) {
                            e = new ColorModel.Attr(ung0.ybColor_background_primary);
                        }
                    }
                    ColorModel colorModel2 = e;
                    if (a9f0Var == null || (eh4Var2 = a9f0Var.c) == null || (fxy0Var = eh4Var2.b) == null) {
                        digVar = digVar2;
                        rbvVar = xkgVar2.a;
                    } else {
                        rev revVar7 = revVar;
                        digVar = digVar2;
                        rbvVar = fob1.a(new pbv((String) fxy0Var.b, (ccv) null, revVar7, (dcv) null, (vfv) null, 58), new pbv((String) fxy0Var.a, (ccv) null, revVar7, (dcv) null, (vfv) null, 58));
                    }
                    return new yp8(new hig(productId3, i, colorModel, jbvVar3, blgVar.f, digVar, null, figVar, gigVar, rbvVar, colorModel2, (a9f0Var == null || (eh4Var = a9f0Var.c) == null || (dytVar = eh4Var.c) == null) ? null : pha1.c(dytVar, context, lrp0.g), null, new eig(new Text.Constant(dashboardV3ScreenParams.getBalance())), null, null, null), z);
                }
            }
        }
        return new zp8(z);
    }

    public final boolean b(nmg nmgVar) {
        mmg mmgVar = nmgVar.a;
        if (mmgVar instanceof lmg) {
            return (((lmg) mmgVar).b.isEmpty() || lia1.g(this.c)) ? false : true;
        }
        if (mmgVar instanceof kmg) {
            return false;
        }
        w511.b();
        return false;
    }

    public final dig d(go4 go4Var) {
        Text.Constant i = g8e.i(Text.Companion, go4Var.a);
        ColorModel colorModel = go4Var.b;
        ThemedImageUrlEntity themedImageUrlEntity = go4Var.c;
        y5i0 y5i0Var = null;
        rbv f = themedImageUrlEntity != null ? job1.f(themedImageUrlEntity, new suf(17)) : null;
        w5i0 w5i0Var = go4Var.e;
        if (w5i0Var != null) {
            float f2 = w5i0Var.a;
            float f3 = w5i0Var.b;
            float f4 = w5i0Var.c;
            ArrayList<n5i0> arrayList = w5i0Var.d;
            ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
            for (n5i0 n5i0Var : arrayList) {
                arrayList2.add(new x5i0(n5i0Var.a, n5i0Var.b.get(this.c)));
            }
            y5i0Var = new y5i0(f2, f3, f4, arrayList2);
        }
        return new dig(i, colorModel, f, y5i0Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:161:0x04d8, code lost:
    
        if (r5 == null) goto L176;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:148:0x04b0  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x04b8  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x04ed  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x04f4  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0528  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x04f0  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x04b4  */
    /* JADX WARN: Type inference failed for: r12v4, types: [kao] */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [lzz0] */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [yon] */
    /* JADX WARN: Type inference failed for: r15v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v11, types: [c5z] */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r22v0 */
    /* JADX WARN: Type inference failed for: r22v1, types: [rbv] */
    /* JADX WARN: Type inference failed for: r22v4 */
    /* JADX WARN: Type inference failed for: r23v0 */
    /* JADX WARN: Type inference failed for: r23v1, types: [rbv] */
    /* JADX WARN: Type inference failed for: r23v4 */
    /* JADX WARN: Type inference failed for: r28v0 */
    /* JADX WARN: Type inference failed for: r28v1, types: [rbv] */
    /* JADX WARN: Type inference failed for: r28v4 */
    /* JADX WARN: Type inference failed for: r30v0 */
    /* JADX WARN: Type inference failed for: r30v1, types: [qzt] */
    /* JADX WARN: Type inference failed for: r30v2 */
    /* JADX WARN: Type inference failed for: r34v0 */
    /* JADX WARN: Type inference failed for: r34v1 */
    /* JADX WARN: Type inference failed for: r34v2, types: [cig] */
    /* JADX WARN: Type inference failed for: r34v3 */
    /* JADX WARN: Type inference failed for: r3v3, types: [r8j0] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r5v12, types: [s8j0] */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15, types: [mzz0] */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v47 */
    /* JADX WARN: Type inference failed for: r5v48 */
    /* JADX WARN: Type inference failed for: r5v49 */
    /* JADX WARN: Type inference failed for: r7v52 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8, types: [com.ybsdk.core.utils.ColorModel] */
    @Override // defpackage.ev31
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object q(Object obj) {
        dig digVar;
        xtz0 wtz0Var;
        boolean z;
        jmg jmgVar;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        Object obj2;
        ?? r13;
        Object obj3;
        ?? r15;
        ez8 ez8Var;
        aso asoVar;
        List list;
        kpn kpnVar;
        Object obj4;
        ?? r5;
        ?? r22;
        ?? r28;
        Text constant;
        String str;
        rr51 rr51Var;
        ?? r34;
        Iterator it;
        rr51 rr51Var2;
        ctu0 ctu0Var;
        boolean z6;
        ?? r152;
        fxy0 fxy0Var;
        nmg nmgVar = (nmg) obj;
        boolean z7 = nmgVar.l;
        Object obj5 = nmgVar.b;
        boolean z8 = obj5 instanceof r8j0;
        SupportState supportState = nmgVar.c;
        int i = 16;
        if (z8) {
            ez8 ez8Var2 = (ez8) ((r8j0) obj5).a;
            List list2 = ez8Var2.c;
            ye8 ye8Var = ez8Var2.b;
            ArrayList arrayList = new ArrayList();
            for (Object obj6 : list2) {
                if (((awz0) obj6).e == TopButton$Alignment.LEFT) {
                    arrayList.add(obj6);
                }
            }
            digVar = null;
            ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(e((awz0) it2.next(), supportState));
            }
            List list3 = ez8Var2.c;
            ArrayList arrayList3 = new ArrayList();
            for (Object obj7 : list3) {
                if (((awz0) obj7).e == TopButton$Alignment.RIGHT) {
                    arrayList3.add(obj7);
                }
            }
            ArrayList arrayList4 = new ArrayList(tcc.n(arrayList3, 10));
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                arrayList4.add(e((awz0) it3.next(), supportState));
            }
            Text.Constant i2 = g8e.i(Text.Companion, ye8Var.e.getText());
            Text.Constant constant2 = new Text.Constant(ye8Var.h.a);
            ThemedImageUrlEntity themedImageUrlEntity = ye8Var.g;
            wtz0Var = new utz0(arrayList2, arrayList4, i2, constant2, themedImageUrlEntity != null ? job1.f(themedImageUrlEntity, new suf(i)) : null, arrayList2.isEmpty());
        } else {
            digVar = null;
            if (obj5 instanceof s8j0) {
                wtz0Var = new vtz0();
            } else {
                if (!(obj5 instanceof t8j0)) {
                    w511.b();
                    return null;
                }
                wtz0Var = new wtz0(((ejg) this.a).b.getShowAsSlidableView() && !((j0g) this.b).r());
            }
        }
        jmg c = c(nmgVar);
        boolean z9 = nmgVar.d;
        boolean z10 = obj5 instanceof t8j0;
        boolean z11 = !z10;
        List list4 = EmptyList.a;
        if (z8) {
            ListBuilder a = rcc.a();
            ez8 ez8Var3 = (ez8) ((r8j0) obj5).a;
            sms0 sms0Var = nmgVar.k;
            String str2 = ez8Var3.a;
            b bVar = Text.Companion;
            ye8 ye8Var2 = ez8Var3.b;
            z = z9;
            ColoredTextEntity coloredTextEntity = ye8Var2.e;
            go4 go4Var = ye8Var2.h;
            eh4 eh4Var = ye8Var2.b;
            jmgVar = c;
            Text.Constant i3 = g8e.i(bVar, coloredTextEntity.getText());
            ColorModel color = ye8Var2.e.getColor();
            ThemedImageUrlEntity themedImageUrlEntity2 = ye8Var2.f;
            if (themedImageUrlEntity2 != null) {
                z2 = z11;
                r22 = job1.f(themedImageUrlEntity2, new suf(14));
            } else {
                z2 = z11;
                r22 = digVar;
            }
            ThemedImageUrlEntity themedImageUrlEntity3 = ye8Var2.g;
            ?? f = themedImageUrlEntity3 != null ? job1.f(themedImageUrlEntity3, new suf(15)) : digVar;
            a9f0 a9f0Var = ye8Var2.m;
            fig figVar = new fig((a9f0Var == null || (fxy0Var = a9f0Var.b.h) == null) ? digVar : gxy0.a(fxy0Var), go4Var.d && !z7);
            dig d = d(go4Var);
            go4 go4Var2 = ye8Var2.i;
            dig d2 = go4Var2 != null ? d(go4Var2) : digVar;
            fxy0 fxy0Var2 = eh4Var.b;
            Context context = this.c;
            if (fxy0Var2 != null) {
                String str3 = (String) fxy0Var2.a;
                String str4 = (String) fxy0Var2.b;
                rev revVar = rev.f;
                jbv a2 = fob1.a(new pbv(str4, (ccv) null, revVar, (dcv) null, (vfv) null, 58), new pbv(str3, (ccv) null, revVar, (dcv) null, (vfv) null, 58));
                v4b1.g(a2, context);
                r28 = a2;
            } else {
                r28 = digVar;
            }
            fxy0 fxy0Var3 = eh4Var.a;
            lrp0 lrp0Var = lrp0.g;
            ColorModel b = gxy0.b(fxy0Var3, lrp0Var);
            dyt dytVar = eh4Var.c;
            ?? c2 = dytVar != null ? pha1.c(dytVar, context, lrp0Var) : digVar;
            svt0 svt0Var = ye8Var2.j;
            ColorModel colorModel = svt0Var.a;
            if (colorModel == null) {
                colorModel = new ColorModel.Attr(ung0.ybColor_fill_default_300);
            }
            Integer num = svt0Var.c;
            int r = num != null ? kp50.r(num.intValue()) : rje.d(vvg0.ybsdk_product_card_balance_spoiler_height, context);
            Integer num2 = svt0Var.b;
            gig gigVar = new gig(colorModel, num2 != null ? kp50.r(num2.intValue()) : rje.d(vvg0.ybsdk_product_card_balance_spoiler_width, context), r);
            rr51 rr51Var3 = ye8Var2.k;
            b98 b98Var = ye8Var2.l;
            String str5 = go4Var.a;
            if (b98Var == null || (constant = b98Var.a) == null) {
                constant = new Text.Constant(str5);
            }
            eig eigVar = new eig(constant);
            String str6 = ye8Var2.a;
            uw8 uw8Var = ye8Var2.d;
            if (uw8Var != null) {
                str = str6;
                rr51Var = rr51Var3;
                r34 = new aig(uw8Var.a, uw8Var.b);
            } else {
                str = str6;
                rr51Var = rr51Var3;
                tw8 tw8Var = ye8Var2.c;
                if (tw8Var != null) {
                    ColorModel colorModel2 = tw8Var.a;
                    ColoredTextEntity coloredTextEntity2 = tw8Var.b;
                    Text.Constant constant3 = new Text.Constant(coloredTextEntity2.getText());
                    ColorModel color2 = coloredTextEntity2.getColor();
                    ColoredTextEntity coloredTextEntity3 = tw8Var.c;
                    r34 = new big(colorModel2, constant3, color2, new Text.Constant(coloredTextEntity3.getText()), coloredTextEntity3.getColor(), tw8Var.d, tw8Var.e, tw8Var.f);
                } else {
                    r34 = digVar;
                }
            }
            a.add(new yp8(new hig(str2, i3, color, r22, f, d, d2, figVar, gigVar, r28, b, c2, rr51Var, eigVar, str, r34, sms0Var), false));
            v860 v860Var = ez8Var3.f;
            c(nmgVar);
            boolean z12 = v860Var.a;
            boolean z13 = nmgVar.e;
            List list5 = nmgVar.f;
            ListBuilder a3 = rcc.a();
            a3.add(new c5z(LocalVariableName.IS_NFC_BUTTON_AVAILABLE.getVarName(), String.valueOf(z13)));
            a3.add(new c5z(LocalVariableName.TOKENIZED_CARDS.getVarName(), a.X(list5, null, null, null, null, 63)));
            ListBuilder j = a3.j();
            List list6 = ez8Var3.d;
            ArrayList arrayList5 = new ArrayList();
            Iterator it4 = list6.iterator();
            while (it4.hasNext()) {
                elg elgVar = (elg) ((aso) it4.next()).a(z7);
                if (elgVar != null) {
                    arrayList5.add(elgVar);
                }
            }
            ArrayList arrayList6 = new ArrayList(tcc.n(arrayList5, 10));
            Iterator it5 = arrayList5.iterator();
            while (it5.hasNext()) {
                elg elgVar2 = (elg) it5.next();
                ctu0 ctu0Var2 = new ctu0(elgVar2.b);
                rr51 rr51Var4 = elgVar2.a;
                List singletonList = z7 ? Collections.singletonList(LocalVariableMutation.DISABLE_SHIMMER) : list4;
                List list7 = rr51Var4.d;
                ArrayList arrayList7 = new ArrayList();
                Iterator it6 = list7.iterator();
                while (it6.hasNext()) {
                    c5z c5zVar = (c5z) ((aso) it6.next()).a(z7);
                    if (c5zVar != null) {
                        it = it5;
                        ArrayList arrayList8 = new ArrayList();
                        for (Object obj8 : singletonList) {
                            rr51 rr51Var5 = rr51Var4;
                            ctu0 ctu0Var3 = ctu0Var2;
                            boolean z14 = z8;
                            if (c5zVar.c.contains((LocalVariableMutation) obj8)) {
                                arrayList8.add(obj8);
                            }
                            rr51Var4 = rr51Var5;
                            ctu0Var2 = ctu0Var3;
                            z8 = z14;
                        }
                        rr51Var2 = rr51Var4;
                        ctu0Var = ctu0Var2;
                        z6 = z8;
                        Iterator it7 = arrayList8.iterator();
                        r152 = c5zVar;
                        while (it7.hasNext()) {
                            if (b5z.a[((LocalVariableMutation) it7.next()).ordinal()] != 1) {
                                w511.b();
                                return digVar;
                            }
                            r152 = new c5z(r152.a, "false", r152.c);
                        }
                    } else {
                        it = it5;
                        rr51Var2 = rr51Var4;
                        ctu0Var = ctu0Var2;
                        z6 = z8;
                        r152 = digVar;
                    }
                    if (r152 != 0) {
                        arrayList7.add(r152);
                    }
                    rr51Var4 = rr51Var2;
                    ctu0Var2 = ctu0Var;
                    it5 = it;
                    z8 = z6;
                }
                arrayList6.add(new jpl(ctu0Var2, rr51Var4, null, a.m0(arrayList7, j), 12));
                it5 = it5;
            }
            z3 = z8;
            a.addAll(arrayList6);
            list4 = a.j();
        } else {
            z = z9;
            jmgVar = c;
            z2 = z11;
            z3 = z8;
            if (z10) {
                list4 = scc.g(a(nmgVar), k551.c);
            } else {
                if (!(obj5 instanceof s8j0)) {
                    w511.b();
                    return digVar;
                }
                if (b(nmgVar)) {
                    z4 = false;
                    z5 = true;
                    list4 = scc.g(a(nmgVar), new f990(6, "DASHBOARD_V3_PAGING_ERROR_ITEM_ID", ((s8j0) obj5).a, false));
                    Object a4 = (b(nmgVar) && (obj5 instanceof s8j0)) ? r501.a(((s8j0) obj5).a, null, null, null, null, null, null, null, null, null, null, null, null, 65534) : digVar;
                    boolean z15 = (b(nmgVar) || !(obj5 instanceof s8j0)) ? z4 : z5;
                    obj2 = !(obj5 instanceof s8j0) ? (s8j0) obj5 : digVar;
                    if (obj2 != null) {
                        ?? r52 = obj2;
                        if (!b(nmgVar)) {
                            r52 = digVar;
                        }
                        if (r52 != 0 && (obj4 = r52.a) != null) {
                            Text.Resource resource = gao.a;
                            ?? r53 = obj4 instanceof mzz0 ? (mzz0) obj4 : digVar;
                            if (r53 != 0) {
                                String traceId = r53.getTraceId();
                                r5 = traceId;
                            }
                            r5 = digVar;
                            if (r5 != 0) {
                                r13 = new lzz0(r5);
                                boolean b2 = b(nmgVar);
                                obj3 = z3 ? (r8j0) obj5 : digVar;
                                if (obj3 != null) {
                                    ?? r3 = obj3;
                                    if (!nmgVar.g) {
                                        r3 = digVar;
                                    }
                                    if (r3 != 0 && (ez8Var = (ez8) r3.a) != null && (asoVar = ez8Var.g) != null && (list = (List) asoVar.a(z7)) != null && (kpnVar = (kpn) a.R(list)) != null) {
                                        r15 = new yon(lfp0.b, kpnVar, nmgVar.h, 16);
                                        if (z3 || (!nmgVar.d && !nmgVar.i)) {
                                            z5 = z4;
                                        }
                                        return new vmg(wtz0Var, jmgVar, z, z2, z3, list4, z15, a4, r13, b2, r15, z5);
                                    }
                                }
                                r15 = digVar;
                                if (z3) {
                                }
                                z5 = z4;
                                return new vmg(wtz0Var, jmgVar, z, z2, z3, list4, z15, a4, r13, b2, r15, z5);
                            }
                        }
                    }
                    r13 = digVar;
                    boolean b22 = b(nmgVar);
                    if (z3) {
                    }
                    if (obj3 != null) {
                    }
                    r15 = digVar;
                    if (z3) {
                    }
                    z5 = z4;
                    return new vmg(wtz0Var, jmgVar, z, z2, z3, list4, z15, a4, r13, b22, r15, z5);
                }
            }
        }
        z4 = false;
        z5 = true;
        if (b(nmgVar)) {
        }
        if (b(nmgVar)) {
        }
        if (!(obj5 instanceof s8j0)) {
        }
        if (obj2 != null) {
        }
        r13 = digVar;
        boolean b222 = b(nmgVar);
        if (z3) {
        }
        if (obj3 != null) {
        }
        r15 = digVar;
        if (z3) {
        }
        z5 = z4;
        return new vmg(wtz0Var, jmgVar, z, z2, z3, list4, z15, a4, r13, b222, r15, z5);
    }
}
