package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.ar.core.ImageMetadata;
import com.yandex.go.design.compose.modal.bottomsheet.c;
import com.yandex.go.design.view.GoImageView;
import defpackage.an91;
import defpackage.bpl0;
import defpackage.bts;
import defpackage.c530;
import defpackage.cma1;
import defpackage.did;
import defpackage.dtr0;
import defpackage.f530;
import defpackage.fid;
import defpackage.gxv;
import defpackage.iyu;
import defpackage.j690;
import defpackage.je31;
import defpackage.ljs0;
import defpackage.lr20;
import defpackage.ohd;
import defpackage.oz40;
import defpackage.qic;
import defpackage.qje;
import defpackage.r1b0;
import defpackage.rfb1;
import defpackage.sic;
import defpackage.sls;
import defpackage.tje;
import defpackage.tls;
import defpackage.tse;
import defpackage.u7a1;
import defpackage.wg6;
import defpackage.wls;
import defpackage.x2y;
import defpackage.x4c;
import defpackage.y9o;
import defpackage.zpn;
import defpackage.zy11;
import java.util.WeakHashMap;
import ru.yandex.taxi.delivery.extracted_delivery_form.interactors.f;
import ru.yandex.taxi.delivery.ui.photocomment.AddPhotocommentButtonView;
import ru.yandex.taxi.delivery.ui.recycler.a;
import ru.yandex.taxi.design.AnimatedListItemInputComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.bubble.BubbleTextComponent;
import ru.yandex.taxi.logistics.sdk.photocomments.PhotocommentsView;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes5.dex */
public final /* synthetic */ class yvh implements wls {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ Object E;
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ yvh(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.w = obj3;
        this.x = obj4;
        this.y = obj5;
        this.z = obj6;
        this.A = obj7;
        this.B = obj8;
        this.C = obj9;
        this.D = obj10;
        this.E = obj11;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        View O;
        View O2;
        int i = this.a;
        Object obj3 = this.E;
        Object obj4 = this.D;
        Object obj5 = this.C;
        Object obj6 = this.B;
        Object obj7 = this.A;
        Object obj8 = this.z;
        Object obj9 = this.y;
        Object obj10 = this.x;
        Object obj11 = this.w;
        Object obj12 = this.c;
        Object obj13 = this.b;
        switch (i) {
            case 0:
                tt2 tt2Var = (tt2) obj13;
                qwh qwhVar = (qwh) obj12;
                s0i s0iVar = (s0i) obj11;
                f fVar = (f) obj10;
                gbi gbiVar = (gbi) obj9;
                xjg xjgVar = (xjg) obj8;
                qnh qnhVar = (qnh) obj7;
                mai maiVar = (mai) obj6;
                vsi vsiVar = (vsi) obj5;
                zii ziiVar = (zii) obj4;
                dci dciVar = (dci) obj3;
                View inflate = ((LayoutInflater) obj).inflate(hqh0.item_delivery_block_address_extended, (ViewGroup) obj2, false);
                int i2 = deh0.address_row;
                if (((FrameLayout) cma1.O(i2, inflate)) != null) {
                    i2 = deh0.call_icon_extended;
                    if (((GoImageView) cma1.O(i2, inflate)) != null) {
                        i2 = deh0.contact_group_extended;
                        FrameLayout frameLayout = (FrameLayout) cma1.O(i2, inflate);
                        if (frameLayout != null && (O = cma1.O((i2 = deh0.delivery_bubble_anchor_extended), inflate)) != null) {
                            i2 = deh0.delivery_contact_autofill_bubble_extended;
                            BubbleTextComponent bubbleTextComponent = (BubbleTextComponent) cma1.O(i2, inflate);
                            if (bubbleTextComponent != null) {
                                i2 = deh0.delivery_phone_select_extended;
                                RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i2, inflate);
                                if (robotoTextView != null) {
                                    i2 = deh0.delivery_phone_subtitle_text_extended;
                                    RobotoTextView robotoTextView2 = (RobotoTextView) cma1.O(i2, inflate);
                                    if (robotoTextView2 != null) {
                                        i2 = deh0.delivery_photocomments_extended;
                                        PhotocommentsView photocommentsView = (PhotocommentsView) cma1.O(i2, inflate);
                                        if (photocommentsView != null) {
                                            i2 = deh0.delivery_point_address_extended;
                                            ListItemComponent listItemComponent = (ListItemComponent) cma1.O(i2, inflate);
                                            if (listItemComponent != null) {
                                                i2 = deh0.delivery_point_apartment_extended;
                                                AnimatedListItemInputComponent animatedListItemInputComponent = (AnimatedListItemInputComponent) cma1.O(i2, inflate);
                                                if (animatedListItemInputComponent != null) {
                                                    i2 = deh0.delivery_point_bubble_extended;
                                                    BubbleTextComponent bubbleTextComponent2 = (BubbleTextComponent) cma1.O(i2, inflate);
                                                    if (bubbleTextComponent2 != null) {
                                                        i2 = deh0.delivery_point_comment_extended;
                                                        AnimatedListItemInputComponent animatedListItemInputComponent2 = (AnimatedListItemInputComponent) cma1.O(i2, inflate);
                                                        if (animatedListItemInputComponent2 != null && (O2 = cma1.O((i2 = deh0.delivery_point_comment_extended_divider), inflate)) != null) {
                                                            ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                                                            i2 = deh0.delivery_point_door_phone_extended;
                                                            AnimatedListItemInputComponent animatedListItemInputComponent3 = (AnimatedListItemInputComponent) cma1.O(i2, inflate);
                                                            if (animatedListItemInputComponent3 != null) {
                                                                i2 = deh0.delivery_point_floor_extended;
                                                                AnimatedListItemInputComponent animatedListItemInputComponent4 = (AnimatedListItemInputComponent) cma1.O(i2, inflate);
                                                                if (animatedListItemInputComponent4 != null) {
                                                                    i2 = deh0.delivery_point_porch_extended;
                                                                    AnimatedListItemInputComponent animatedListItemInputComponent5 = (AnimatedListItemInputComponent) cma1.O(i2, inflate);
                                                                    if (animatedListItemInputComponent5 != null) {
                                                                        i2 = deh0.delivery_point_title_extended;
                                                                        RobotoTextView robotoTextView3 = (RobotoTextView) cma1.O(i2, inflate);
                                                                        if (robotoTextView3 != null) {
                                                                            i2 = deh0.delivery_upload_photocomment_button_extended;
                                                                            AddPhotocommentButtonView addPhotocommentButtonView = (AddPhotocommentButtonView) cma1.O(i2, inflate);
                                                                            if (addPhotocommentButtonView != null) {
                                                                                return new a(new d1x(constraintLayout, frameLayout, O, bubbleTextComponent, robotoTextView, robotoTextView2, photocommentsView, listItemComponent, animatedListItemInputComponent, bubbleTextComponent2, animatedListItemInputComponent2, O2, constraintLayout, animatedListItemInputComponent3, animatedListItemInputComponent4, animatedListItemInputComponent5, robotoTextView3, addPhotocommentButtonView), tt2Var, qwhVar, s0iVar, fVar, gbiVar, xjgVar, qnhVar, maiVar, vsiVar, ziiVar, dciVar);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
                return null;
            default:
                final je31 je31Var = (je31) obj13;
                w49 w49Var = (w49) obj12;
                frv0 frv0Var = (frv0) obj11;
                tls tlsVar = (tls) obj10;
                final wg6 wg6Var = (wg6) obj9;
                lg6 lg6Var = (lg6) obj8;
                z0a0 z0a0Var = (z0a0) obj7;
                final yur yurVar = (yur) obj6;
                final tls tlsVar2 = (tls) obj5;
                final lk31 lk31Var = (lk31) obj4;
                final tse tseVar = (tse) obj3;
                fid fidVar = (fid) obj;
                int intValue = ((Integer) obj2).intValue();
                bts btsVar = (bts) fidVar;
                if (btsVar.V(intValue & 1, (intValue & 3) != 2)) {
                    if (je31Var.g.equals(gxu.a)) {
                        btsVar.e0(-587209898);
                        btsVar.t(false);
                    } else {
                        btsVar.e0(-587553936);
                        WeakHashMap weakHashMap = androidx.compose.foundation.layout.a.w;
                        xe91.e(an91.o(c530.a, 0.0f, w8a1.f(vuz.o(btsVar).g, btsVar).d(), 0.0f, 0.0f, 13), je31Var.g, w49Var, frv0Var, tlsVar, btsVar, 0);
                        tlsVar = tlsVar;
                        btsVar.t(false);
                    }
                    androidx.compose.runtime.internal.a S = wwg.S(1169099327, true, new ays0(21, je31Var, tlsVar), btsVar);
                    androidx.compose.runtime.internal.a S2 = wwg.S(296234048, true, new vg0(je31Var, tlsVar, wg6Var, z0a0Var, yurVar, 17), btsVar);
                    final tls tlsVar3 = tlsVar;
                    c.a(null, wg6Var, lg6Var, false, false, null, null, null, S, null, S2, wwg.S(-1222154900, true, new bms() { // from class: com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.d
                        @Override // defpackage.bms
                        public final Object invoke(Object obj14, Object obj15, Object obj16, Object obj17) {
                            boolean z;
                            final wg6 wg6Var2 = wg6Var;
                            oz40 oz40Var = wg6Var2.g;
                            j690 j690Var = (j690) obj15;
                            fid fidVar2 = (fid) obj16;
                            int intValue2 = ((Integer) obj17).intValue();
                            if ((intValue2 & 48) == 0) {
                                intValue2 |= ((bts) fidVar2).k(j690Var) ? 32 : 16;
                            }
                            bts btsVar2 = (bts) fidVar2;
                            boolean V = btsVar2.V(intValue2 & 1, (intValue2 & 145) != 144);
                            zy11 zy11Var = zy11.a;
                            if (!V) {
                                btsVar2.Y();
                                return zy11Var;
                            }
                            f530 f530Var = c530.a;
                            f530 c = ljs0.c(f530Var, 1.0f);
                            sic a = qic.a(lr20.c, x4c.G, btsVar2, 0);
                            int hashCode = Long.hashCode(btsVar2.T);
                            r1b0 o = btsVar2.o();
                            f530 d = androidx.compose.ui.b.d(btsVar2, c);
                            ohd.G1.getClass();
                            sls slsVar = androidx.compose.ui.node.d.b;
                            if (btsVar2.a == null) {
                                cma1.b0();
                                throw null;
                            }
                            btsVar2.i0();
                            if (btsVar2.S) {
                                btsVar2.n(slsVar);
                            } else {
                                btsVar2.r0();
                            }
                            qje.W(btsVar2, androidx.compose.ui.node.d.f, a);
                            qje.W(btsVar2, androidx.compose.ui.node.d.e, o);
                            qje.W(btsVar2, androidx.compose.ui.node.d.g, Integer.valueOf(hashCode));
                            qje.M(btsVar2, androidx.compose.ui.node.d.h);
                            qje.W(btsVar2, androidx.compose.ui.node.d.d, d);
                            je31 je31Var2 = je31Var;
                            y9o y9oVar = je31Var2.d;
                            if (y9oVar == null) {
                                if (1.0f <= 0.0d) {
                                    gxv.a("invalid weight; must be greater than zero");
                                }
                                f530Var = new x2y(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                            }
                            bpl0 bpl0Var = je31Var2.b;
                            boolean z2 = y9oVar != null;
                            boolean z3 = ((dtr0) oz40Var.getValue()).a == -2;
                            iyu iyuVar = je31Var2.c;
                            if (iyuVar != null) {
                                r13 = iyuVar.b != null ? 66.0f : 0.0f;
                                if (!iyuVar.a.isEmpty()) {
                                    r13 += 64.0f;
                                }
                            }
                            String str = je31Var2.h;
                            boolean z4 = je31Var2.f;
                            boolean g = rfb1.g(wg6Var2);
                            float intValue3 = wg6Var2.A.getIntValue() - (-wg6Var2.h.getFloatValue());
                            boolean k = btsVar2.k(wg6Var2);
                            final tse tseVar2 = tseVar;
                            boolean e = k | btsVar2.e(tseVar2);
                            Object Q = btsVar2.Q();
                            Object obj18 = did.a;
                            if (e || Q == obj18) {
                                Q = new sls() { // from class: com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.e
                                    @Override // defpackage.sls
                                    public final Object invoke() {
                                        wg6 wg6Var3 = wg6.this;
                                        if (((dtr0) wg6Var3.g.getValue()).a != -2) {
                                            tje.N(tseVar2, null, null, new VerticalHubV2ScreenKt$VerticalHubV2Screen$1$2$3$1$1$1$1(wg6Var3, null), 3);
                                        }
                                        return zy11.a;
                                    }
                                };
                                btsVar2.o0(Q);
                            }
                            tls tlsVar4 = tls.this;
                            com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.ui.b.a(f530Var, bpl0Var, tlsVar4, lk31Var, r13, yurVar, z2, z3, str, z4, g, (sls) Q, intValue3, btsVar2, ImageMetadata.EDGE_MODE);
                            if (y9oVar != null) {
                                btsVar2.e0(1206581604);
                                y9o y9oVar2 = je31Var2.d;
                                float e2 = rfb1.e(wg6Var2);
                                if (1.0f <= 0.0d) {
                                    gxv.a("invalid weight; must be greater than zero");
                                }
                                z = true;
                                u7a1.d(an91.j(new x2y(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), j690Var), y9oVar2, e2, null, btsVar2, 0);
                                btsVar2.t(false);
                            } else {
                                z = true;
                                btsVar2.e0(1206847212);
                                btsVar2.t(false);
                            }
                            btsVar2.t(z);
                            boolean k2 = btsVar2.k(tlsVar4) | btsVar2.k(wg6Var2);
                            tls tlsVar5 = tlsVar2;
                            boolean k3 = k2 | btsVar2.k(tlsVar5);
                            Object Q2 = btsVar2.Q();
                            if (k3 || Q2 == obj18) {
                                Q2 = new VerticalHubV2ScreenKt$VerticalHubV2Screen$1$2$3$2$1(tlsVar4, wg6Var2, tlsVar5, null);
                                btsVar2.o0(Q2);
                            }
                            zpn.e(btsVar2, (wls) Q2, zy11Var);
                            dtr0 dtr0Var = new dtr0(((dtr0) oz40Var.getValue()).a);
                            boolean k4 = btsVar2.k(tlsVar4) | btsVar2.k(je31Var2) | btsVar2.k(wg6Var2);
                            Object Q3 = btsVar2.Q();
                            if (k4 || Q3 == obj18) {
                                Q3 = new VerticalHubV2ScreenKt$VerticalHubV2Screen$1$2$3$3$1(tlsVar4, je31Var2, wg6Var2, null);
                                btsVar2.o0(Q3);
                            }
                            zpn.e(btsVar2, (wls) Q3, dtr0Var);
                            return zy11Var;
                        }
                    }, btsVar), btsVar, 100663296, 54, 761);
                } else {
                    btsVar.Y();
                }
                return zy11.a;
        }
    }
}
