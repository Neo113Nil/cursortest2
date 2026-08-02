package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.ai_widget.ui.a;
import com.yandex.go.design.view.GoConstraintLayout;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.go.masstransit.design.snippet.MtSnippetView;
import ru.yandex.taxi.design.utils.TopRoundRectBackgroundHelper$makeViewRounded$1;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes12.dex */
public final /* synthetic */ class sg0 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ tls b;

    public /* synthetic */ sg0(int i, int i2, tls tlsVar) {
        this.a = i2;
        this.b = tlsVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = 16;
        int i3 = 15;
        int i4 = 4;
        int i5 = 9;
        int i6 = 10;
        int i7 = 25;
        int i8 = 23;
        c530 c530Var = c530.a;
        o430 o430Var = did.a;
        Object[] objArr = 0;
        int i9 = 1;
        zy11 zy11Var = zy11.a;
        tls tlsVar = this.b;
        switch (i) {
            case 0:
                fid fidVar = (fid) obj;
                int intValue = ((Integer) obj2).intValue();
                bts btsVar = (bts) fidVar;
                if (btsVar.V(intValue & 1, (intValue & 3) != 2)) {
                    boolean k = btsVar.k(tlsVar);
                    Object Q = btsVar.Q();
                    if (k || Q == o430Var) {
                        Q = new o0(i5, tlsVar);
                        btsVar.o0(Q);
                    }
                    xqb1.b(null, (sls) Q, btsVar, 0, 1);
                } else {
                    btsVar.Y();
                }
                return zy11Var;
            case 1:
                fid fidVar2 = (fid) obj;
                int intValue2 = ((Integer) obj2).intValue();
                bts btsVar2 = (bts) fidVar2;
                if (btsVar2.V(intValue2 & 1, (intValue2 & 3) != 2)) {
                    Object Q2 = btsVar2.Q();
                    if (Q2 == o430Var) {
                        Q2 = new j01(i4);
                        btsVar2.o0(Q2);
                    }
                    f530 b = fnq0.b(c530Var, false, (tls) Q2);
                    z910 d = pi6.d(x4c.b, false);
                    int hashCode = Long.hashCode(btsVar2.T);
                    r1b0 o = btsVar2.o();
                    f530 d2 = b.d(btsVar2, b);
                    ohd.G1.getClass();
                    sls slsVar = d.b;
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
                    qje.W(btsVar2, d.f, d);
                    qje.W(btsVar2, d.e, o);
                    qje.W(btsVar2, d.g, Integer.valueOf(hashCode));
                    qje.M(btsVar2, d.h);
                    qje.W(btsVar2, d.d, d2);
                    boolean k2 = btsVar2.k(tlsVar);
                    Object Q3 = btsVar2.Q();
                    if (k2 || Q3 == o430Var) {
                        Q3 = new o0(i3, tlsVar);
                        btsVar2.o0(Q3);
                    }
                    iab1.b(null, (sls) Q3, btsVar2, 0, 1);
                    btsVar2.t(true);
                } else {
                    btsVar2.Y();
                }
                return zy11Var;
            case 2:
                ((Integer) obj2).getClass();
                a.j(tlsVar, (fid) obj, vng.O(1));
                return zy11Var;
            case 3:
                View inflate = ((LayoutInflater) obj).inflate(fuh0.alt_select_view_holder, (ViewGroup) obj2, false);
                int i10 = z5h0.distance;
                RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i10, inflate);
                if (robotoTextView != null) {
                    i10 = z5h0.duration;
                    RobotoTextView robotoTextView2 = (RobotoTextView) cma1.O(i10, inflate);
                    if (robotoTextView2 != null) {
                        i10 = z5h0.event;
                        GoImageView goImageView = (GoImageView) cma1.O(i10, inflate);
                        if (goImageView != null) {
                            i10 = z5h0.snippets;
                            if (((GoLinearLayout) cma1.O(i10, inflate)) != null) {
                                xv1 xv1Var = new xv1(new zv1((GoConstraintLayout) inflate, goImageView, robotoTextView, robotoTextView2), tlsVar, objArr == true ? 1 : 0);
                                GoConstraintLayout goConstraintLayout = ((zv1) ((zo31) xv1Var.R)).a;
                                goConstraintLayout.setOutlineProvider(new TopRoundRectBackgroundHelper$makeViewRounded$1(c.h(16, goConstraintLayout)));
                                goConstraintLayout.setClipToOutline(true);
                                return xv1Var;
                            }
                        }
                    }
                }
                ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i10)));
                return null;
            case 4:
                tlsVar.invoke(new evx0((z611) obj, ((Integer) obj2).intValue()));
                return zy11Var;
            case 5:
                ((Integer) obj2).getClass();
                gcb1.a(tlsVar, (fid) obj, vng.O(1));
                return zy11Var;
            case 6:
                fid fidVar3 = (fid) obj;
                int intValue3 = ((Integer) obj2).intValue();
                bts btsVar3 = (bts) fidVar3;
                if (btsVar3.V(intValue3 & 1, (intValue3 & 3) != 2)) {
                    boolean k3 = btsVar3.k(tlsVar);
                    Object Q4 = btsVar3.Q();
                    if (k3 || Q4 == o430Var) {
                        Q4 = new fv9(i7, tlsVar);
                        btsVar3.o0(Q4);
                    }
                    iab1.b(null, (sls) Q4, btsVar3, 0, 1);
                } else {
                    btsVar3.Y();
                }
                return zy11Var;
            case 7:
                fid fidVar4 = (fid) obj;
                int intValue4 = ((Integer) obj2).intValue();
                bts btsVar4 = (bts) fidVar4;
                if (btsVar4.V(intValue4 & 1, (intValue4 & 3) != 2)) {
                    au2 b2 = hgb1.b();
                    String e = ohb1.e(btsVar4, kyh0.select_current_geolocation_description);
                    boolean k4 = btsVar4.k(tlsVar);
                    Object Q5 = btsVar4.Q();
                    if (k4 || Q5 == o430Var) {
                        Q5 = new fv9(21, tlsVar);
                        btsVar4.o0(Q5);
                    }
                    nab1.a(b2, e, (sls) Q5, null, btsVar4, 0, 8);
                } else {
                    btsVar4.Y();
                }
                return zy11Var;
            case 8:
                fid fidVar5 = (fid) obj;
                int intValue5 = ((Integer) obj2).intValue();
                bts btsVar5 = (bts) fidVar5;
                if (btsVar5.V(intValue5 & 1, (intValue5 & 3) != 2)) {
                    Object Q6 = btsVar5.Q();
                    if (Q6 == o430Var) {
                        Q6 = new c0m(i2);
                        btsVar5.o0(Q6);
                    }
                    f530 b3 = fnq0.b(c530Var, false, (tls) Q6);
                    z910 d3 = pi6.d(x4c.b, false);
                    int hashCode2 = Long.hashCode(btsVar5.T);
                    r1b0 o2 = btsVar5.o();
                    f530 d4 = b.d(btsVar5, b3);
                    ohd.G1.getClass();
                    sls slsVar2 = d.b;
                    if (btsVar5.a == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar5.i0();
                    if (btsVar5.S) {
                        btsVar5.n(slsVar2);
                    } else {
                        btsVar5.r0();
                    }
                    qje.W(btsVar5, d.f, d3);
                    qje.W(btsVar5, d.e, o2);
                    qje.W(btsVar5, d.g, Integer.valueOf(hashCode2));
                    qje.M(btsVar5, d.h);
                    qje.W(btsVar5, d.d, d4);
                    boolean k5 = btsVar5.k(tlsVar);
                    Object Q7 = btsVar5.Q();
                    if (k5 || Q7 == o430Var) {
                        Q7 = new azd(11, tlsVar);
                        btsVar5.o0(Q7);
                    }
                    iab1.b(null, (sls) Q7, btsVar5, 0, 1);
                    btsVar5.t(true);
                } else {
                    btsVar5.Y();
                }
                return zy11Var;
            case 9:
                fid fidVar6 = (fid) obj;
                int intValue6 = ((Integer) obj2).intValue();
                bts btsVar6 = (bts) fidVar6;
                if (btsVar6.V(intValue6 & 1, (intValue6 & 3) != 2)) {
                    Object Q8 = btsVar6.Q();
                    if (Q8 == o430Var) {
                        Q8 = new c0m(i3);
                        btsVar6.o0(Q8);
                    }
                    f530 b4 = fnq0.b(c530Var, false, (tls) Q8);
                    z910 d5 = pi6.d(x4c.b, false);
                    int hashCode3 = Long.hashCode(btsVar6.T);
                    r1b0 o3 = btsVar6.o();
                    f530 d6 = b.d(btsVar6, b4);
                    ohd.G1.getClass();
                    sls slsVar3 = d.b;
                    if (btsVar6.a == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar6.i0();
                    if (btsVar6.S) {
                        btsVar6.n(slsVar3);
                    } else {
                        btsVar6.r0();
                    }
                    qje.W(btsVar6, d.f, d5);
                    qje.W(btsVar6, d.e, o3);
                    qje.W(btsVar6, d.g, Integer.valueOf(hashCode3));
                    qje.M(btsVar6, d.h);
                    qje.W(btsVar6, d.d, d6);
                    au2 b5 = hgb1.b();
                    String e2 = ohb1.e(btsVar6, kyh0.select_current_geolocation_description);
                    boolean k6 = btsVar6.k(tlsVar);
                    Object Q9 = btsVar6.Q();
                    if (k6 || Q9 == o430Var) {
                        Q9 = new azd(i6, tlsVar);
                        btsVar6.o0(Q9);
                    }
                    nab1.a(b5, e2, (sls) Q9, null, btsVar6, 0, 8);
                    btsVar6.t(true);
                } else {
                    btsVar6.Y();
                }
                return zy11Var;
            case 10:
                ((Integer) obj2).getClass();
                ru.yandex.taxi.favorites.address.impl.ui.a.c(tlsVar, (fid) obj, vng.O(1));
                return zy11Var;
            case 11:
                View inflate2 = ((LayoutInflater) obj).inflate(yrh0.surge_info_content_header_item, (ViewGroup) obj2, false);
                int i11 = zfh0.surge_info_content_description;
                RobotoTextView robotoTextView3 = (RobotoTextView) cma1.O(i11, inflate2);
                if (robotoTextView3 != null) {
                    i11 = zfh0.surge_info_content_details;
                    RobotoTextView robotoTextView4 = (RobotoTextView) cma1.O(i11, inflate2);
                    if (robotoTextView4 != null) {
                        i11 = zfh0.surge_info_content_icon;
                        AppCompatImageView appCompatImageView = (AppCompatImageView) cma1.O(i11, inflate2);
                        if (appCompatImageView != null) {
                            i11 = zfh0.surge_info_content_title;
                            RobotoTextView robotoTextView5 = (RobotoTextView) cma1.O(i11, inflate2);
                            if (robotoTextView5 != null) {
                                return new xv1(new oqw0((ConstraintLayout) inflate2, robotoTextView3, robotoTextView4, appCompatImageView, robotoTextView5), tlsVar);
                            }
                        }
                    }
                }
                ny61.t("Missing required view with ID: ".concat(inflate2.getResources().getResourceName(i11)));
                return null;
            case 12:
                View inflate3 = ((LayoutInflater) obj).inflate(yrh0.surge_info_content_horizontal_shortcuts, (ViewGroup) obj2, false);
                int i12 = zfh0.scrollable_container;
                RecyclerView recyclerView = (RecyclerView) cma1.O(i12, inflate3);
                if (recyclerView != null) {
                    i12 = zfh0.title;
                    RobotoTextView robotoTextView6 = (RobotoTextView) cma1.O(i12, inflate3);
                    if (robotoTextView6 != null) {
                        return new hru(new pqw0((LinearLayout) inflate3, recyclerView, robotoTextView6), tlsVar);
                    }
                }
                ny61.t("Missing required view with ID: ".concat(inflate3.getResources().getResourceName(i12)));
                return null;
            case 13:
                tlsVar.invoke(new zd31((String) obj, (String) obj2));
                return zy11Var;
            case 14:
                ((Integer) obj2).getClass();
                tob1.a(tlsVar, (fid) obj, vng.O(1));
                return zy11Var;
            case 15:
                fid fidVar7 = (fid) obj;
                int intValue7 = ((Integer) obj2).intValue();
                bts btsVar7 = (bts) fidVar7;
                if (btsVar7.V(intValue7 & 1, (intValue7 & 3) != 2)) {
                    boolean k7 = btsVar7.k(tlsVar);
                    Object Q10 = btsVar7.Q();
                    if (k7 || Q10 == o430Var) {
                        Q10 = new kiu(27, tlsVar);
                        btsVar7.o0(Q10);
                    }
                    iab1.b(null, (sls) Q10, btsVar7, 0, 1);
                } else {
                    btsVar7.Y();
                }
                return zy11Var;
            case 16:
                tlsVar.invoke(new iv30((String) obj, (String) obj2));
                return zy11Var;
            case 17:
                View inflate4 = ((LayoutInflater) obj).inflate(uqh0.mt_route_view_holder, (ViewGroup) obj2, false);
                int i13 = reh0.duration;
                RobotoTextView robotoTextView7 = (RobotoTextView) cma1.O(i13, inflate4);
                if (robotoTextView7 != null) {
                    i13 = reh0.fade;
                    GoImageView goImageView2 = (GoImageView) cma1.O(i13, inflate4);
                    if (goImageView2 != null) {
                        i13 = reh0.snippets;
                        MtSnippetView mtSnippetView = (MtSnippetView) cma1.O(i13, inflate4);
                        if (mtSnippetView != null) {
                            return new y57(new vw30((GoConstraintLayout) inflate4, robotoTextView7, goImageView2, mtSnippetView), tlsVar);
                        }
                    }
                }
                ny61.t("Missing required view with ID: ".concat(inflate4.getResources().getResourceName(i13)));
                return null;
            case 18:
                fid fidVar8 = (fid) obj;
                int intValue8 = ((Integer) obj2).intValue();
                bts btsVar8 = (bts) fidVar8;
                if (btsVar8.V(intValue8 & 1, (intValue8 & 3) != 2)) {
                    boolean k8 = btsVar8.k(tlsVar);
                    Object Q11 = btsVar8.Q();
                    if (k8 || Q11 == o430Var) {
                        Q11 = new kiu(29, tlsVar);
                        btsVar8.o0(Q11);
                    }
                    iab1.b(null, (sls) Q11, btsVar8, 0, 1);
                } else {
                    btsVar8.Y();
                }
                return zy11Var;
            case 19:
                fid fidVar9 = (fid) obj;
                int intValue9 = ((Integer) obj2).intValue();
                bts btsVar9 = (bts) fidVar9;
                if (btsVar9.V(intValue9 & 1, (intValue9 & 3) != 2)) {
                    boolean k9 = btsVar9.k(tlsVar);
                    Object Q12 = btsVar9.Q();
                    if (k9 || Q12 == o430Var) {
                        Q12 = new s140(i9, tlsVar);
                        btsVar9.o0(Q12);
                    }
                    iab1.b(null, (sls) Q12, btsVar9, 0, 1);
                } else {
                    btsVar9.Y();
                }
                return zy11Var;
            case 20:
                fid fidVar10 = (fid) obj;
                int intValue10 = ((Integer) obj2).intValue();
                bts btsVar10 = (bts) fidVar10;
                if (btsVar10.V(intValue10 & 1, (intValue10 & 3) != 2)) {
                    boolean k10 = btsVar10.k(tlsVar);
                    Object Q13 = btsVar10.Q();
                    if (k10 || Q13 == o430Var) {
                        Q13 = new s140(i4, tlsVar);
                        btsVar10.o0(Q13);
                    }
                    iab1.b(null, (sls) Q13, btsVar10, 0, 1);
                } else {
                    btsVar10.Y();
                }
                return zy11Var;
            case 21:
                fid fidVar11 = (fid) obj;
                int intValue11 = ((Integer) obj2).intValue();
                bts btsVar11 = (bts) fidVar11;
                if (btsVar11.V(intValue11 & 1, (intValue11 & 3) != 2)) {
                    boolean k11 = btsVar11.k(tlsVar);
                    Object Q14 = btsVar11.Q();
                    if (k11 || Q14 == o430Var) {
                        Q14 = new s140(7, tlsVar);
                        btsVar11.o0(Q14);
                    }
                    iab1.b(null, (sls) Q14, btsVar11, 0, 1);
                } else {
                    btsVar11.Y();
                }
                return zy11Var;
            case 22:
                fid fidVar12 = (fid) obj;
                int intValue12 = ((Integer) obj2).intValue();
                bts btsVar12 = (bts) fidVar12;
                if (btsVar12.V(intValue12 & 1, (intValue12 & 3) != 2)) {
                    boolean k12 = btsVar12.k(tlsVar);
                    Object Q15 = btsVar12.Q();
                    if (k12 || Q15 == o430Var) {
                        Q15 = new s140(i5, tlsVar);
                        btsVar12.o0(Q15);
                    }
                    xqb1.b(null, (sls) Q15, btsVar12, 0, 1);
                } else {
                    btsVar12.Y();
                }
                return zy11Var;
            case 23:
                fid fidVar13 = (fid) obj;
                int intValue13 = ((Integer) obj2).intValue();
                bts btsVar13 = (bts) fidVar13;
                if (btsVar13.V(intValue13 & 1, (intValue13 & 3) != 2)) {
                    boolean k13 = btsVar13.k(tlsVar);
                    Object Q16 = btsVar13.Q();
                    if (k13 || Q16 == o430Var) {
                        Q16 = new s140(i6, tlsVar);
                        btsVar13.o0(Q16);
                    }
                    xqb1.b(null, (sls) Q16, btsVar13, 0, 1);
                } else {
                    btsVar13.Y();
                }
                return zy11Var;
            case 24:
                fid fidVar14 = (fid) obj;
                int intValue14 = ((Integer) obj2).intValue();
                bts btsVar14 = (bts) fidVar14;
                if (btsVar14.V(intValue14 & 1, (intValue14 & 3) != 2)) {
                    boolean k14 = btsVar14.k(tlsVar);
                    Object Q17 = btsVar14.Q();
                    if (k14 || Q17 == o430Var) {
                        Q17 = new s140(17, tlsVar);
                        btsVar14.o0(Q17);
                    }
                    xqb1.b(null, (sls) Q17, btsVar14, 0, 1);
                } else {
                    btsVar14.Y();
                }
                return zy11Var;
            case 25:
                fid fidVar15 = (fid) obj;
                int intValue15 = ((Integer) obj2).intValue();
                bts btsVar15 = (bts) fidVar15;
                if (btsVar15.V(intValue15 & 1, (intValue15 & 3) != 2)) {
                    boolean k15 = btsVar15.k(tlsVar);
                    Object Q18 = btsVar15.Q();
                    if (k15 || Q18 == o430Var) {
                        Q18 = new s140(18, tlsVar);
                        btsVar15.o0(Q18);
                    }
                    xqb1.b(null, (sls) Q18, btsVar15, 0, 1);
                } else {
                    btsVar15.Y();
                }
                return zy11Var;
            case 26:
                fid fidVar16 = (fid) obj;
                int intValue16 = ((Integer) obj2).intValue();
                bts btsVar16 = (bts) fidVar16;
                if (btsVar16.V(intValue16 & 1, (intValue16 & 3) != 2)) {
                    boolean k16 = btsVar16.k(tlsVar);
                    Object Q19 = btsVar16.Q();
                    if (k16 || Q19 == o430Var) {
                        Q19 = new s140(i8, tlsVar);
                        btsVar16.o0(Q19);
                    }
                    iab1.b(null, (sls) Q19, btsVar16, 0, 1);
                } else {
                    btsVar16.Y();
                }
                return zy11Var;
            case 27:
                fid fidVar17 = (fid) obj;
                int intValue17 = ((Integer) obj2).intValue();
                bts btsVar17 = (bts) fidVar17;
                if (btsVar17.V(intValue17 & 1, (intValue17 & 3) != 2)) {
                    boolean k17 = btsVar17.k(tlsVar);
                    Object Q20 = btsVar17.Q();
                    if (k17 || Q20 == o430Var) {
                        Q20 = new ukb0(12, tlsVar);
                        btsVar17.o0(Q20);
                    }
                    mab1.b(0, btsVar17, (sls) Q20, null);
                } else {
                    btsVar17.Y();
                }
                return zy11Var;
            case 28:
                fid fidVar18 = (fid) obj;
                int intValue18 = ((Integer) obj2).intValue();
                bts btsVar18 = (bts) fidVar18;
                if (btsVar18.V(intValue18 & 1, (intValue18 & 3) != 2)) {
                    Object Q21 = btsVar18.Q();
                    if (Q21 == o430Var) {
                        Q21 = new cbg0(i7);
                        btsVar18.o0(Q21);
                    }
                    f530 b6 = fnq0.b(c530Var, false, (tls) Q21);
                    z910 d7 = pi6.d(x4c.b, false);
                    int hashCode4 = Long.hashCode(btsVar18.T);
                    r1b0 o4 = btsVar18.o();
                    f530 d8 = b.d(btsVar18, b6);
                    ohd.G1.getClass();
                    sls slsVar4 = d.b;
                    if (btsVar18.a == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar18.i0();
                    if (btsVar18.S) {
                        btsVar18.n(slsVar4);
                    } else {
                        btsVar18.r0();
                    }
                    qje.W(btsVar18, d.f, d7);
                    qje.W(btsVar18, d.e, o4);
                    qje.W(btsVar18, d.g, Integer.valueOf(hashCode4));
                    qje.M(btsVar18, d.h);
                    qje.W(btsVar18, d.d, d8);
                    boolean k18 = btsVar18.k(tlsVar);
                    Object Q22 = btsVar18.Q();
                    if (k18 || Q22 == o430Var) {
                        Q22 = new ukb0(14, tlsVar);
                        btsVar18.o0(Q22);
                    }
                    iab1.b(null, (sls) Q22, btsVar18, 0, 1);
                    btsVar18.t(true);
                } else {
                    btsVar18.Y();
                }
                return zy11Var;
            default:
                fid fidVar19 = (fid) obj;
                int intValue19 = ((Integer) obj2).intValue();
                bts btsVar19 = (bts) fidVar19;
                if (btsVar19.V(intValue19 & 1, (intValue19 & 3) != 2)) {
                    boolean k19 = btsVar19.k(tlsVar);
                    Object Q23 = btsVar19.Q();
                    if (k19 || Q23 == o430Var) {
                        Q23 = new ukb0(i8, tlsVar);
                        btsVar19.o0(Q23);
                    }
                    iab1.b(null, (sls) Q23, btsVar19, 0, 1);
                } else {
                    btsVar19.Y();
                }
                return zy11Var;
        }
    }

    public /* synthetic */ sg0(int i, tls tlsVar) {
        this.a = i;
        this.b = tlsVar;
    }
}
