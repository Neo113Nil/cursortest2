package defpackage;

import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.core.utils.text.b;
import com.ybsdk.feature.card.api.entities.YbCardStatusEntity;
import com.ybsdk.feature.card.internal.samsungpay.SamsungPayState;
import com.ybsdk.widgets.common.YbButtonView;
import com.ybsdk.widgets.common.YbButtonViewGroup;
import com.ybsdk.widgets.common.communication.CommunicationFullScreenView$State$Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import kotlin.collections.a;

/* loaded from: classes3.dex */
public final class re8 implements ev31 {
    public final nbv a = new nbv(zxg0.ybsdk_card_skeleton, null);
    public final ptz0 b = new ptz0(new nbv(zxg0.ybsdk_ic_add_card, null));

    public static YbButtonView.a a(fq51 fq51Var, boolean z) {
        Text.Constant i = g8e.i(Text.Companion, fq51Var.a);
        String str = fq51Var.b;
        return new YbButtonView.a(i, str != null ? new Text.Constant(str) : null, null, null, null, null, null, false, z, null, 3068);
    }

    /* JADX WARN: Code restructure failed: missing block: B:243:0x0316, code lost:
    
        if (r4.b(r11, r0) == false) goto L138;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x06e4  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x06ee  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0709  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0710  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x06f5  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x06eb  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x06cd  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x06b1  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x05cf  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0651  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0672  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0677  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0665  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0636  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x06c3  */
    /* JADX WARN: Type inference failed for: r5v39 */
    /* JADX WARN: Type inference failed for: r5v40, types: [int] */
    /* JADX WARN: Type inference failed for: r5v52 */
    /* JADX WARN: Type inference failed for: r9v15, types: [rbv] */
    @Override // defpackage.ev31
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object q(Object obj) {
        List list;
        boolean z;
        boolean z2;
        bq8 bq8Var;
        nhq0 nhq0Var;
        ae8 ae8Var;
        Map map;
        int i;
        boolean z3;
        gf91 p9jVar;
        aq51 aq51Var;
        vp51 vp51Var;
        Text.Constant i2;
        List list2;
        String str;
        List list3;
        YbButtonView.a aVar;
        YbButtonView.a aVar2;
        YbButtonView.a aVar3;
        List<ae8> list4;
        Iterator it;
        ae8 ae8Var2;
        boolean z4;
        int i3;
        String str2;
        String str3;
        nbv nbvVar;
        boolean z5;
        boolean b;
        jq51 c;
        j5x0 j5x0Var;
        bq8 bq8Var2 = (bq8) obj;
        nhq0 nhq0Var2 = bq8Var2.e;
        u8j0 u8j0Var = bq8Var2.a;
        if (u8j0Var == null || (u8j0Var instanceof t8j0)) {
            return oe8.a;
        }
        if (u8j0Var instanceof s8j0) {
            return new ne8(r501.a(((s8j0) u8j0Var).a, null, null, null, null, null, null, null, null, null, null, null, null, 65534));
        }
        if (!(u8j0Var instanceof r8j0)) {
            w511.b();
            return null;
        }
        List list5 = (List) ((r8j0) u8j0Var).a;
        SamsungPayState samsungPayState = bq8Var2.j;
        Map map2 = bq8Var2.d;
        boolean z6 = bq8Var2.c;
        ae8 ae8Var3 = (ae8) list5.get(nhq0Var2.a);
        Map map3 = bq8Var2.i;
        Integer num = (Integer) map3.get(mfb1.a(ae8Var3));
        int intValue = num != null ? num.intValue() : 0;
        boolean z7 = ae8Var3 instanceof zd8;
        if (z7) {
            ArrayList arrayList = ((zd8) ae8Var3).b;
            gq51 gq51Var = (gq51) arrayList.get(intValue);
            boolean z8 = gq51Var.k != null;
            if (arrayList.size() > 1) {
                list = list5;
                ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((gq51) it2.next()).h);
                }
                ArrayList arrayList3 = new ArrayList(tcc.n(arrayList2, 10));
                Iterator it3 = arrayList2.iterator();
                int i4 = 0;
                while (it3.hasNext()) {
                    Object next = it3.next();
                    int i5 = i4 + 1;
                    if (i4 < 0) {
                        scc.m();
                        throw null;
                    }
                    arrayList3.add(new k5x0(g8e.i(Text.Companion, (String) next), i4));
                    i4 = i5;
                    z6 = z6;
                    z7 = z7;
                }
                z = z6;
                z2 = z7;
                j5x0Var = new j5x0(arrayList3, Integer.valueOf(intValue));
            } else {
                list = list5;
                z = z6;
                z2 = z7;
                j5x0Var = null;
            }
            ArrayList arrayList4 = gq51Var.g;
            ArrayList arrayList5 = new ArrayList(tcc.n(arrayList4, 10));
            for (Iterator it4 = arrayList4.iterator(); it4.hasNext(); it4 = it4) {
                hq51 hq51Var = (hq51) it4.next();
                arrayList5.add(new snf0(g8e.i(Text.Companion, hq51Var.a), job1.f(hq51Var.b, new sd8(9))));
            }
            fq51 fq51Var = gq51Var.j;
            YbButtonView.a a = fq51Var != null ? a(fq51Var, false) : null;
            fq51 fq51Var2 = gq51Var.i;
            gf91 q9jVar = new q9j(j5x0Var, arrayList5, z8, fq51Var2 != null ? a(fq51Var2, z8) : null, a, gq51Var.l);
            bq8Var = bq8Var2;
            nhq0Var = nhq0Var2;
            ae8Var = ae8Var3;
            map = map3;
            i = intValue;
            p9jVar = q9jVar;
        } else {
            list = list5;
            z = z6;
            z2 = z7;
            if (!(ae8Var3 instanceof yd8)) {
                w511.b();
                return null;
            }
            bq51 bq51Var = ((yd8) ae8Var3).a;
            YbCardStatusEntity ybCardStatusEntity = bq51Var.e;
            String str4 = bq51Var.j;
            int i6 = qe8.a[ybCardStatusEntity.ordinal()];
            if (i6 == 1) {
                bq8Var = bq8Var2;
                nhq0Var = nhq0Var2;
                ae8Var = ae8Var3;
                map = map3;
                i = intValue;
                CommunicationFullScreenView$State$Type communicationFullScreenView$State$Type = CommunicationFullScreenView$State$Type.GRAPHIC;
                b bVar = Text.Companion;
                int i7 = dzh0.ybsdk_card_locked_by_bank_title;
                Text.Formatted.Arg.Companion.getClass();
                z3 = false;
                Text.Formatted.Arg[] argArr = {new Text.Formatted.Arg.StringArg(str4)};
                bVar.getClass();
                Text.Formatted b2 = b.b(i7, argArr);
                String str5 = bq51Var.i;
                p9jVar = new p9j(new vrc(communicationFullScreenView$State$Type, b2, null, null, str5 != null ? new Text.Constant(str5) : new Text.Resource(dzh0.ybsdk_card_locked_by_bank_subtitle), null, null, null, null, null, null, bq51Var.h != null ? new YbButtonViewGroup.b(YbButtonViewGroup.Orientation.VERTICAL_REVERSE, null, new YbButtonView.a(new Text.Resource(dzh0.ybsdk_card_locked_by_bank_main_action), null, null, null, null, null, null, false, false, null, 4094), null, 10) : null, null, 0, 0, null, null, null, 0, false, null, null, null, null, null, null, -4116, 3));
                list4 = list;
                ArrayList arrayList6 = new ArrayList(tcc.n(list4, 10));
                for (ae8 ae8Var4 : list4) {
                    Map map4 = map;
                    Integer num2 = (Integer) map4.get(mfb1.a(ae8Var4));
                    ?? intValue2 = num2 != null ? num2.intValue() : z3;
                    String a2 = mfb1.a(ae8Var4);
                    jq51 c2 = mfb1.c(ae8Var4, intValue2);
                    if (c2 != null) {
                        ThemedImageUrlEntity themedImageUrlEntity = c2.a;
                        ?? c3 = fob1.c(themedImageUrlEntity.getLightUrl(), themedImageUrlEntity.getDarkUrl(), new sd8(7));
                        if (c3 != 0) {
                            nbvVar = c3;
                            z5 = ae8Var4 instanceof yd8;
                            if (z5 || samsungPayState.c != null) {
                                if (z5) {
                                    bq51 bq51Var2 = ((yd8) ae8Var4).a;
                                    b = samsungPayState.b(bq51Var2.d, bq51Var2.f);
                                }
                                b = z3;
                            } else {
                                Boolean bool = (Boolean) samsungPayState.f.get(((yd8) ae8Var4).a.d);
                                if (bool != null) {
                                    b = bool.booleanValue();
                                }
                                b = z3;
                            }
                            ThemedImageUrlEntity themedImageUrlEntity2 = (b || (c = mfb1.c(ae8Var4, intValue2)) == null) ? null : c.b;
                            rbv c4 = themedImageUrlEntity2 == null ? fob1.c(themedImageUrlEntity2.getLightUrl(), themedImageUrlEntity2.getDarkUrl(), new sd8(8)) : null;
                            Boolean bool2 = (Boolean) map2.get(mfb1.a(ae8Var4));
                            arrayList6.add(new ld8(a2, new dp8(nbvVar, c4, bool2 == null ? bool2.booleanValue() : z3)));
                            map = map4;
                        }
                    }
                    nbvVar = this.a;
                    z5 = ae8Var4 instanceof yd8;
                    if (z5) {
                    }
                    if (z5) {
                    }
                    b = z3;
                    if (b) {
                    }
                    if (themedImageUrlEntity2 == null) {
                    }
                    Boolean bool22 = (Boolean) map2.get(mfb1.a(ae8Var4));
                    arrayList6.add(new ld8(a2, new dp8(nbvVar, c4, bool22 == null ? bool22.booleanValue() : z3)));
                    map = map4;
                }
                cp8 cp8Var = new cp8(arrayList6, nhq0Var, bq8Var.g);
                if ((list4 instanceof Collection) || !list4.isEmpty()) {
                    it = list4.iterator();
                    while (it.hasNext()) {
                        if (((ae8) it.next()) instanceof zd8) {
                            ae8Var2 = ae8Var;
                            z3 = true;
                            break;
                        }
                    }
                }
                ae8Var2 = ae8Var;
                z4 = ae8Var2 instanceof yd8;
                if (!z4) {
                    str2 = ((yd8) ae8Var2).a.b;
                    i3 = i;
                } else {
                    if (!z2) {
                        w511.b();
                        return null;
                    }
                    i3 = i;
                    gq51 gq51Var2 = (gq51) a.S(i3, ((zd8) ae8Var2).b);
                    str2 = gq51Var2 != null ? gq51Var2.e : null;
                }
                Text.Constant i8 = str2 == null ? g8e.i(Text.Companion, str2) : null;
                if (!z4) {
                    str3 = ((yd8) ae8Var2).a.c;
                } else {
                    if (!z2) {
                        w511.b();
                        return null;
                    }
                    gq51 gq51Var3 = (gq51) a.S(i3, ((zd8) ae8Var2).b);
                    str3 = gq51Var3 != null ? gq51Var3.h : null;
                }
                return new me8(i8, str3 == null ? g8e.i(Text.Companion, str3) : null, (z3 || (p9jVar instanceof q9j)) ? qtz0.a : this.b, cp8Var, p9jVar, !z);
            }
            if (i6 != 2) {
                Map map5 = bq8Var2.b;
                e7r0 e7r0Var = bq8Var2.h;
                String str6 = e7r0Var.b;
                String str7 = e7r0Var.a;
                wp51 wp51Var = bq51Var.o;
                vp51 vp51Var2 = wp51Var.a;
                vp51 vp51Var3 = wp51Var.b;
                boolean z9 = bq8Var2.l;
                o0p o0pVar = dab1.F;
                String str8 = bq51Var.d;
                i = intValue;
                YbCardStatusEntity ybCardStatusEntity2 = bq51Var.e;
                u8j0 u8j0Var2 = (u8j0) map5.get(str8);
                ae8Var = ae8Var3;
                boolean z10 = u8j0Var2 instanceof t8j0;
                nhq0Var = nhq0Var2;
                r8j0 r8j0Var = u8j0Var2 instanceof r8j0 ? (r8j0) u8j0Var2 : null;
                if (r8j0Var != null) {
                    if (!z) {
                        r8j0Var = null;
                    }
                    if (r8j0Var != null) {
                        aq51Var = (aq51) r8j0Var.a;
                        bq8Var = bq8Var2;
                        Text.Resource resource = new Text.Resource(dzh0.ybsdk_card_card_pan_title);
                        if (aq51Var != null) {
                            Text.Companion.getClass();
                            i2 = new Text.Constant("•••• •••• •••• " + str4);
                            map = map3;
                            vp51Var = vp51Var2;
                        } else {
                            b bVar2 = Text.Companion;
                            String str9 = aq51Var.a;
                            map = map3;
                            vp51Var = vp51Var2;
                            l9s l9sVar = new l9s(bpu.c, false, false);
                            l9sVar.d(0, str9);
                            i2 = g8e.i(bVar2, l9sVar.b());
                        }
                        dn8 dn8Var = new dn8(new yqj0(aq51Var != null ? g8e.i(Text.Companion, "•••") : g8e.i(Text.Companion, aq51Var.b), new Text.Resource(dzh0.ybsdk_card_card_cvv_title), z10), new yqj0(aq51Var != null ? g8e.i(Text.Companion, "••/••") : g8e.i(Text.Companion, bq51Var.l), new Text.Resource(dzh0.ybsdk_card_card_expiratio_date_title), z10), new yqj0(i2, resource, z10));
                        String str10 = bq51Var.d;
                        boolean z11 = bq51Var.g;
                        list2 = bq51Var.n;
                        if (list2.isEmpty()) {
                            list2 = null;
                        }
                        if (list2 == null) {
                            List singletonList = Collections.singletonList(new l8r0("card_settings_category", new Text.Resource(dzh0.ybsdk_settings_card_settings_header)));
                            List<o8r0> list6 = list2;
                            ArrayList arrayList7 = new ArrayList(tcc.n(list6, 10));
                            for (o8r0 o8r0Var : list6) {
                                String str11 = str10;
                                arrayList7.add(j9r0.b(o8r0Var, jl40.l(o8r0Var.a, str6) && jl40.l(str7, str8), str6 == null));
                                str10 = str11;
                            }
                            str = str10;
                            list3 = a.m0(arrayList7, singletonList);
                        } else {
                            str = str10;
                            list3 = EmptyList.a;
                        }
                        List list7 = list3;
                        if (!samsungPayState.d) {
                            o0pVar = h2b1.F;
                        } else if (ybCardStatusEntity2 == YbCardStatusEntity.ACTIVE) {
                            List list8 = bq51Var.f;
                            SamsungPayState.InitializationResult initializationResult = samsungPayState.a;
                            int i9 = initializationResult == null ? -1 : qe8.b[initializationResult.ordinal()];
                            if (i9 != -1) {
                                if (i9 != 1 && i9 != 2) {
                                    if (i9 == 3) {
                                        gzl0 gzl0Var = samsungPayState.b;
                                        if (!(gzl0Var instanceof ezl0) && gzl0Var != null) {
                                            if (!(gzl0Var instanceof fzl0)) {
                                                w511.b();
                                                return null;
                                            }
                                        }
                                    } else if (i9 != 4) {
                                        w511.b();
                                        return null;
                                    }
                                }
                                o0pVar = wfz.E;
                            }
                        }
                        o0p o0pVar2 = o0pVar;
                        if (map2.get(str8) == null || ybCardStatusEntity2 == YbCardStatusEntity.REISSUE) {
                            if (ybCardStatusEntity2 != YbCardStatusEntity.FROZEN) {
                                aVar2 = new YbButtonView.a(new Text.Resource(dzh0.ybsdk_card_card_unfreeze_action), null, new nbv(zxg0.ybsdk_ic_card_details_unfreeze_card, null), null, null, null, null, false, true, null, 3066);
                                aVar3 = aVar2;
                            } else {
                                aVar = new YbButtonView.a(new Text.Resource(dzh0.ybsdk_card_card_freeze_action), null, new nbv(zxg0.ybsdk_ic_card_details_freeze_card, null), null, null, null, null, false, true, null, 3066);
                                aVar3 = aVar;
                            }
                        } else if (ybCardStatusEntity2 == YbCardStatusEntity.FROZEN) {
                            aVar2 = new YbButtonView.a(new Text.Resource(dzh0.ybsdk_card_card_unfreeze_action), null, new nbv(zxg0.ybsdk_ic_card_details_unfreeze_card, null), null, null, null, null, false, false, null, 4090);
                            aVar3 = aVar2;
                        } else {
                            aVar = new YbButtonView.a(new Text.Resource(dzh0.ybsdk_card_card_freeze_action), null, new nbv(zxg0.ybsdk_ic_card_details_freeze_card, null), null, null, null, null, false, false, null, 4090);
                            aVar3 = aVar;
                        }
                        p9jVar = new r9j(str, dn8Var, z ? new nbv(zxg0.ybsdk_ic_eye_crossed_outline, null) : new nbv(zxg0.ybsdk_ic_eye_outline, null), z ? new Text.Resource(dzh0.ybsdk_card_accessibility_details_hide_requisites_description) : new Text.Resource(dzh0.ybsdk_card_accessibility_details_show_requisites_description), z11, list7, o0pVar2, aVar3, vp51Var3 != null ? new YbButtonView.a(g8e.i(Text.Companion, vp51Var3.a), null, new nbv(zxg0.ybsdk_ic_card_details_reissue_card, null), null, null, null, null, false, false, null, 4090) : null, vp51Var != null ? new YbButtonView.a(g8e.i(Text.Companion, vp51Var.a), null, new nbv(zxg0.ybsdk_ic_card_details_delete_card, null), null, null, null, null, false, false, null, 4090) : new YbButtonView.a(new Text.Resource(dzh0.ybsdk_card_deletion_delete_button_title), null, new nbv(zxg0.ybsdk_ic_card_details_delete_card, null), null, null, null, null, false, false, null, 4090), z9);
                    }
                }
                aq51Var = null;
                bq8Var = bq8Var2;
                Text.Resource resource2 = new Text.Resource(dzh0.ybsdk_card_card_pan_title);
                if (aq51Var != null) {
                }
                dn8 dn8Var2 = new dn8(new yqj0(aq51Var != null ? g8e.i(Text.Companion, "•••") : g8e.i(Text.Companion, aq51Var.b), new Text.Resource(dzh0.ybsdk_card_card_cvv_title), z10), new yqj0(aq51Var != null ? g8e.i(Text.Companion, "••/••") : g8e.i(Text.Companion, bq51Var.l), new Text.Resource(dzh0.ybsdk_card_card_expiratio_date_title), z10), new yqj0(i2, resource2, z10));
                String str102 = bq51Var.d;
                boolean z112 = bq51Var.g;
                list2 = bq51Var.n;
                if (list2.isEmpty()) {
                }
                if (list2 == null) {
                }
                List list72 = list3;
                if (!samsungPayState.d) {
                }
                o0p o0pVar22 = o0pVar;
                if (map2.get(str8) == null) {
                }
                if (ybCardStatusEntity2 != YbCardStatusEntity.FROZEN) {
                }
            } else {
                bq8Var = bq8Var2;
                nhq0Var = nhq0Var2;
                ae8Var = ae8Var3;
                map = map3;
                i = intValue;
                p9jVar = new p9j(new vrc(CommunicationFullScreenView$State$Type.GRAPHIC, unr0.h(Text.Companion, dzh0.ybsdk_card_reissue_screen_title), null, null, new Text.Resource(dzh0.ybsdk_card_reissue_screen_subtitle), null, null, null, null, null, null, null, null, 0, 0, null, null, null, 0, false, null, null, null, null, null, null, -20, 3));
            }
        }
        z3 = false;
        list4 = list;
        ArrayList arrayList62 = new ArrayList(tcc.n(list4, 10));
        while (r1.hasNext()) {
        }
        cp8 cp8Var2 = new cp8(arrayList62, nhq0Var, bq8Var.g);
        if (list4 instanceof Collection) {
        }
        it = list4.iterator();
        while (it.hasNext()) {
        }
        ae8Var2 = ae8Var;
        z4 = ae8Var2 instanceof yd8;
        if (!z4) {
        }
        if (str2 == null) {
        }
        if (!z4) {
        }
        return new me8(i8, str3 == null ? g8e.i(Text.Companion, str3) : null, (z3 || (p9jVar instanceof q9j)) ? qtz0.a : this.b, cp8Var2, p9jVar, !z);
    }
}
