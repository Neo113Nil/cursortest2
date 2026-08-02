package defpackage;

import android.net.Uri;
import com.yandex.div.core.view2.divs.widgets.DivSeparatorView;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivAccessibility;
import com.yandex.div2.DivAlignmentHorizontal;
import com.yandex.div2.DivAlignmentVertical;
import com.yandex.div2.DivAnimation$Name;
import com.yandex.div2.DivAppearanceTransition;
import com.yandex.div2.DivBorder;
import com.yandex.div2.DivChangeTransition;
import com.yandex.div2.DivEdgeInsets;
import com.yandex.div2.DivFocus;
import com.yandex.div2.DivImageScale;
import com.yandex.div2.DivLayoutProvider;
import com.yandex.div2.DivSize;
import com.yandex.div2.DivTransform;
import com.yandex.div2.DivTransitionTrigger;
import com.yandex.div2.DivVisibility;
import com.yandex.div2.DivVisibilityAction;
import com.yandex.div2.c3;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class xrk implements c4x, egk {
    public static final /* synthetic */ int b0 = 0;
    public final List A;
    public final DivEdgeInsets B;
    public final DivEdgeInsets C;
    public final Expression D;
    public final Expression E;
    public final List F;
    public final List G;
    public final Expression H;
    public final Expression I;
    public final Expression J;
    public final Expression K;
    public final Expression L;
    public final List M;
    public final List N;
    public final DivTransform O;
    public final List P;
    public final DivChangeTransition Q;
    public final DivAppearanceTransition R;
    public final DivAppearanceTransition S;
    public final List T;
    public final List U;
    public final List V;
    public final Expression W;
    public final DivVisibilityAction X;
    public final List Y;
    public final DivSize Z;
    public final DivAccessibility a;
    public Integer a0;
    public final v3k b;
    public final pdk c;
    public final List d;
    public final Expression e;
    public final Expression f;
    public final Expression g;
    public final List h;
    public final afk i;
    public final List j;
    public final DivBorder k;
    public final Expression l;
    public final Expression m;
    public final Expression n;
    public final Expression o;
    public final List p;
    public final List q;
    public final List r;
    public final DivFocus s;
    public final List t;
    public final Expression u;
    public final DivSize v;
    public final List w;
    public final List x;
    public final String y;
    public final DivLayoutProvider z;

    static {
        ngd0.m(100L);
        ngd0.m(Double.valueOf(0.6d));
        ngd0.m(DivAnimation$Name.FADE);
        Double valueOf = Double.valueOf(1.0d);
        ngd0.m(valueOf);
        ngd0.m(valueOf);
        ngd0.m(Boolean.TRUE);
        ngd0.m(DivAlignmentHorizontal.CENTER);
        ngd0.m(DivAlignmentVertical.CENTER);
        ngd0.m(Integer.valueOf(DivSeparatorView.DEFAULT_DIVIDER_COLOR));
        ngd0.m(Boolean.FALSE);
        ngd0.m(DivImageScale.FILL);
        ngd0.m(DivVisibility.VISIBLE);
    }

    public xrk(DivAccessibility divAccessibility, v3k v3kVar, pdk pdkVar, List list, Expression expression, Expression expression2, Expression expression3, List list2, afk afkVar, List list3, DivBorder divBorder, Expression expression4, Expression expression5, Expression expression6, Expression expression7, List list4, List list5, List list6, DivFocus divFocus, List list7, Expression expression8, DivSize divSize, List list8, List list9, String str, DivLayoutProvider divLayoutProvider, List list10, DivEdgeInsets divEdgeInsets, DivEdgeInsets divEdgeInsets2, Expression expression9, Expression expression10, List list11, List list12, Expression expression11, Expression expression12, Expression expression13, Expression expression14, Expression expression15, List list13, List list14, DivTransform divTransform, List list15, DivChangeTransition divChangeTransition, DivAppearanceTransition divAppearanceTransition, DivAppearanceTransition divAppearanceTransition2, List list16, List list17, List list18, Expression expression16, DivVisibilityAction divVisibilityAction, List list19, DivSize divSize2) {
        this.a = divAccessibility;
        this.b = v3kVar;
        this.c = pdkVar;
        this.d = list;
        this.e = expression;
        this.f = expression2;
        this.g = expression3;
        this.h = list2;
        this.i = afkVar;
        this.j = list3;
        this.k = divBorder;
        this.l = expression4;
        this.m = expression5;
        this.n = expression6;
        this.o = expression7;
        this.p = list4;
        this.q = list5;
        this.r = list6;
        this.s = divFocus;
        this.t = list7;
        this.u = expression8;
        this.v = divSize;
        this.w = list8;
        this.x = list9;
        this.y = str;
        this.z = divLayoutProvider;
        this.A = list10;
        this.B = divEdgeInsets;
        this.C = divEdgeInsets2;
        this.D = expression9;
        this.E = expression10;
        this.F = list11;
        this.G = list12;
        this.H = expression11;
        this.I = expression12;
        this.J = expression13;
        this.K = expression14;
        this.L = expression15;
        this.M = list13;
        this.N = list14;
        this.O = divTransform;
        this.P = list15;
        this.Q = divChangeTransition;
        this.R = divAppearanceTransition;
        this.S = divAppearanceTransition2;
        this.T = list16;
        this.U = list17;
        this.V = list18;
        this.W = expression16;
        this.X = divVisibilityAction;
        this.Y = list19;
        this.Z = divSize2;
    }

    @Override // defpackage.egk
    public final DivBorder A() {
        return this.k;
    }

    /* JADX WARN: Code restructure failed: missing block: B:479:0x077b, code lost:
    
        if (r1 == null) goto L548;
     */
    /* JADX WARN: Code restructure failed: missing block: B:483:0x071b, code lost:
    
        if (r1 == null) goto L520;
     */
    /* JADX WARN: Code restructure failed: missing block: B:484:0x06d8, code lost:
    
        if (r1 == null) goto L501;
     */
    /* JADX WARN: Code restructure failed: missing block: B:485:0x0695, code lost:
    
        if (r1 == null) goto L482;
     */
    /* JADX WARN: Code restructure failed: missing block: B:495:0x0622, code lost:
    
        if (r1 == null) goto L443;
     */
    /* JADX WARN: Code restructure failed: missing block: B:499:0x05cd, code lost:
    
        if (r1 == null) goto L417;
     */
    /* JADX WARN: Code restructure failed: missing block: B:500:0x058a, code lost:
    
        if (r1 == null) goto L398;
     */
    /* JADX WARN: Code restructure failed: missing block: B:509:0x04c1, code lost:
    
        if (r1 == null) goto L337;
     */
    /* JADX WARN: Code restructure failed: missing block: B:510:0x047e, code lost:
    
        if (r1 == null) goto L318;
     */
    /* JADX WARN: Code restructure failed: missing block: B:517:0x03e3, code lost:
    
        if (r1 == null) goto L281;
     */
    /* JADX WARN: Code restructure failed: missing block: B:521:0x0384, code lost:
    
        if (r1 == null) goto L253;
     */
    /* JADX WARN: Code restructure failed: missing block: B:522:0x0341, code lost:
    
        if (r1 == null) goto L234;
     */
    /* JADX WARN: Code restructure failed: missing block: B:523:0x02e2, code lost:
    
        if (r1 == null) goto L211;
     */
    /* JADX WARN: Code restructure failed: missing block: B:527:0x028d, code lost:
    
        if (r1 == null) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:528:0x024a, code lost:
    
        if (r1 == null) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:529:0x0207, code lost:
    
        if (r1 == null) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:535:0x015e, code lost:
    
        if (r1 == null) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:539:0x0109, code lost:
    
        if (r1 == null) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:544:0x0076, code lost:
    
        if (r1 == null) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean B(xrk xrkVar, rvo rvoVar, rvo rvoVar2) {
        if (xrkVar != null) {
            DivAccessibility divAccessibility = xrkVar.a;
            DivAccessibility divAccessibility2 = this.a;
            if (divAccessibility2 != null ? divAccessibility2.a(divAccessibility, rvoVar, rvoVar2) : divAccessibility == null) {
                v3k v3kVar = xrkVar.b;
                v3k v3kVar2 = this.b;
                if ((v3kVar2 != null ? v3kVar2.a(v3kVar, rvoVar, rvoVar2) : v3kVar == null) && this.c.a(xrkVar.c, rvoVar, rvoVar2)) {
                    List list = xrkVar.d;
                    List list2 = this.d;
                    if (list2 != null) {
                        if (list != null && list2.size() == list.size()) {
                            int i = 0;
                            for (Object obj : list2) {
                                int i2 = i + 1;
                                if (i < 0) {
                                    scc.m();
                                    throw null;
                                }
                                if (!((v3k) obj).a((v3k) list.get(i), rvoVar, rvoVar2)) {
                                    break;
                                }
                                i = i2;
                            }
                            Expression expression = this.e;
                            DivAlignmentHorizontal divAlignmentHorizontal = expression != null ? (DivAlignmentHorizontal) expression.a(rvoVar) : null;
                            Expression expression2 = xrkVar.e;
                            if (divAlignmentHorizontal == (expression2 != null ? (DivAlignmentHorizontal) expression2.a(rvoVar2) : null)) {
                                Expression expression3 = this.f;
                                DivAlignmentVertical divAlignmentVertical = expression3 != null ? (DivAlignmentVertical) expression3.a(rvoVar) : null;
                                Expression expression4 = xrkVar.f;
                                if (divAlignmentVertical == (expression4 != null ? (DivAlignmentVertical) expression4.a(rvoVar2) : null) && ((Number) this.g.a(rvoVar)).doubleValue() == ((Number) xrkVar.g.a(rvoVar2)).doubleValue()) {
                                    List list3 = xrkVar.h;
                                    List list4 = this.h;
                                    if (list4 != null) {
                                        if (list3 != null && list4.size() == list3.size()) {
                                            int i3 = 0;
                                            for (Object obj2 : list4) {
                                                int i4 = i3 + 1;
                                                if (i3 < 0) {
                                                    scc.m();
                                                    throw null;
                                                }
                                                if (!((ydk) obj2).a((ydk) list3.get(i3), rvoVar, rvoVar2)) {
                                                    break;
                                                }
                                                i3 = i4;
                                            }
                                            afk afkVar = xrkVar.i;
                                            afk afkVar2 = this.i;
                                            if (afkVar2 != null ? afkVar2.a(afkVar, rvoVar, rvoVar2) : afkVar == null) {
                                                List list5 = xrkVar.j;
                                                List list6 = this.j;
                                                if (list6 != null) {
                                                    if (list5 != null && list6.size() == list5.size()) {
                                                        int i5 = 0;
                                                        for (Object obj3 : list6) {
                                                            int i6 = i5 + 1;
                                                            if (i5 < 0) {
                                                                scc.m();
                                                                throw null;
                                                            }
                                                            if (!((kfk) obj3).a((kfk) list5.get(i5), rvoVar, rvoVar2)) {
                                                                break;
                                                            }
                                                            i5 = i6;
                                                        }
                                                        DivBorder divBorder = xrkVar.k;
                                                        DivBorder divBorder2 = this.k;
                                                        if ((divBorder2 != null ? divBorder2.a(divBorder, rvoVar, rvoVar2) : divBorder == null) && ((Boolean) this.l.a(rvoVar)).booleanValue() == ((Boolean) xrkVar.l.a(rvoVar2)).booleanValue()) {
                                                            Expression expression5 = this.m;
                                                            Long l = expression5 != null ? (Long) expression5.a(rvoVar) : null;
                                                            Expression expression6 = xrkVar.m;
                                                            if (jl40.l(l, expression6 != null ? (Long) expression6.a(rvoVar2) : null) && this.n.a(rvoVar) == xrkVar.n.a(rvoVar2) && this.o.a(rvoVar) == xrkVar.o.a(rvoVar2)) {
                                                                List list7 = xrkVar.p;
                                                                List list8 = this.p;
                                                                if (list8 != null) {
                                                                    if (list7 != null && list8.size() == list7.size()) {
                                                                        int i7 = 0;
                                                                        for (Object obj4 : list8) {
                                                                            int i8 = i7 + 1;
                                                                            if (i7 < 0) {
                                                                                scc.m();
                                                                                throw null;
                                                                            }
                                                                            if (!((nnk) obj4).f((nnk) list7.get(i7), rvoVar, rvoVar2)) {
                                                                                break;
                                                                            }
                                                                            i7 = i8;
                                                                        }
                                                                        List list9 = xrkVar.q;
                                                                        List list10 = this.q;
                                                                        if (list10 != null) {
                                                                            if (list9 != null && list10.size() == list9.size()) {
                                                                                int i9 = 0;
                                                                                for (Object obj5 : list10) {
                                                                                    int i10 = i9 + 1;
                                                                                    if (i9 < 0) {
                                                                                        scc.m();
                                                                                        throw null;
                                                                                    }
                                                                                    if (!((v3k) obj5).a((v3k) list9.get(i9), rvoVar, rvoVar2)) {
                                                                                        break;
                                                                                    }
                                                                                    i9 = i10;
                                                                                }
                                                                                List list11 = xrkVar.r;
                                                                                List list12 = this.r;
                                                                                if (list12 != null) {
                                                                                    if (list11 != null && list12.size() == list11.size()) {
                                                                                        int i11 = 0;
                                                                                        for (Object obj6 : list12) {
                                                                                            int i12 = i11 + 1;
                                                                                            if (i11 < 0) {
                                                                                                scc.m();
                                                                                                throw null;
                                                                                            }
                                                                                            if (!((bpk) obj6).a((bpk) list11.get(i11))) {
                                                                                                break;
                                                                                            }
                                                                                            i11 = i12;
                                                                                        }
                                                                                        DivFocus divFocus = xrkVar.s;
                                                                                        DivFocus divFocus2 = this.s;
                                                                                        if (divFocus2 != null ? divFocus2.a(divFocus, rvoVar, rvoVar2) : divFocus == null) {
                                                                                            List list13 = xrkVar.t;
                                                                                            List list14 = this.t;
                                                                                            if (list14 != null) {
                                                                                                if (list13 != null && list14.size() == list13.size()) {
                                                                                                    int i13 = 0;
                                                                                                    for (Object obj7 : list14) {
                                                                                                        int i14 = i13 + 1;
                                                                                                        if (i13 < 0) {
                                                                                                            scc.m();
                                                                                                            throw null;
                                                                                                        }
                                                                                                        if (!((irk) obj7).a((irk) list13.get(i13))) {
                                                                                                            break;
                                                                                                        }
                                                                                                        i13 = i14;
                                                                                                    }
                                                                                                    if (jl40.l(this.u.a(rvoVar), xrkVar.u.a(rvoVar2)) && this.v.a(xrkVar.v, rvoVar, rvoVar2)) {
                                                                                                        List list15 = xrkVar.w;
                                                                                                        List list16 = this.w;
                                                                                                        if (list16 != null) {
                                                                                                            if (list15 != null && list16.size() == list15.size()) {
                                                                                                                int i15 = 0;
                                                                                                                for (Object obj8 : list16) {
                                                                                                                    int i16 = i15 + 1;
                                                                                                                    if (i15 < 0) {
                                                                                                                        scc.m();
                                                                                                                        throw null;
                                                                                                                    }
                                                                                                                    if (!((v3k) obj8).a((v3k) list15.get(i15), rvoVar, rvoVar2)) {
                                                                                                                        break;
                                                                                                                    }
                                                                                                                    i15 = i16;
                                                                                                                }
                                                                                                                List list17 = xrkVar.x;
                                                                                                                List list18 = this.x;
                                                                                                                if (list18 != null) {
                                                                                                                    if (list17 != null && list18.size() == list17.size()) {
                                                                                                                        int i17 = 0;
                                                                                                                        for (Object obj9 : list18) {
                                                                                                                            int i18 = i17 + 1;
                                                                                                                            if (i17 < 0) {
                                                                                                                                scc.m();
                                                                                                                                throw null;
                                                                                                                            }
                                                                                                                            if (!((v3k) obj9).a((v3k) list17.get(i17), rvoVar, rvoVar2)) {
                                                                                                                                break;
                                                                                                                            }
                                                                                                                            i17 = i18;
                                                                                                                        }
                                                                                                                        if (jl40.l(this.y, xrkVar.y)) {
                                                                                                                            DivLayoutProvider divLayoutProvider = xrkVar.z;
                                                                                                                            DivLayoutProvider divLayoutProvider2 = this.z;
                                                                                                                            if (divLayoutProvider2 != null ? divLayoutProvider2.a(divLayoutProvider) : divLayoutProvider == null) {
                                                                                                                                List list19 = xrkVar.A;
                                                                                                                                List list20 = this.A;
                                                                                                                                if (list20 != null) {
                                                                                                                                    if (list19 != null && list20.size() == list19.size()) {
                                                                                                                                        int i19 = 0;
                                                                                                                                        for (Object obj10 : list20) {
                                                                                                                                            int i20 = i19 + 1;
                                                                                                                                            if (i19 < 0) {
                                                                                                                                                scc.m();
                                                                                                                                                throw null;
                                                                                                                                            }
                                                                                                                                            if (!((v3k) obj10).a((v3k) list19.get(i19), rvoVar, rvoVar2)) {
                                                                                                                                                break;
                                                                                                                                            }
                                                                                                                                            i19 = i20;
                                                                                                                                        }
                                                                                                                                        DivEdgeInsets divEdgeInsets = xrkVar.B;
                                                                                                                                        DivEdgeInsets divEdgeInsets2 = this.B;
                                                                                                                                        if (divEdgeInsets2 != null ? divEdgeInsets2.a(divEdgeInsets, rvoVar, rvoVar2) : divEdgeInsets == null) {
                                                                                                                                            DivEdgeInsets divEdgeInsets3 = xrkVar.C;
                                                                                                                                            DivEdgeInsets divEdgeInsets4 = this.C;
                                                                                                                                            if ((divEdgeInsets4 != null ? divEdgeInsets4.a(divEdgeInsets3, rvoVar, rvoVar2) : divEdgeInsets3 == null) && ((Number) this.D.a(rvoVar)).intValue() == ((Number) xrkVar.D.a(rvoVar2)).intValue() && ((Boolean) this.E.a(rvoVar)).booleanValue() == ((Boolean) xrkVar.E.a(rvoVar2)).booleanValue()) {
                                                                                                                                                List list21 = xrkVar.F;
                                                                                                                                                List list22 = this.F;
                                                                                                                                                if (list22 != null) {
                                                                                                                                                    if (list21 != null && list22.size() == list21.size()) {
                                                                                                                                                        int i21 = 0;
                                                                                                                                                        for (Object obj11 : list22) {
                                                                                                                                                            int i22 = i21 + 1;
                                                                                                                                                            if (i21 < 0) {
                                                                                                                                                                scc.m();
                                                                                                                                                                throw null;
                                                                                                                                                            }
                                                                                                                                                            if (!((v3k) obj11).a((v3k) list21.get(i21), rvoVar, rvoVar2)) {
                                                                                                                                                                break;
                                                                                                                                                            }
                                                                                                                                                            i21 = i22;
                                                                                                                                                        }
                                                                                                                                                        List list23 = xrkVar.G;
                                                                                                                                                        List list24 = this.G;
                                                                                                                                                        if (list24 != null) {
                                                                                                                                                            if (list23 != null && list24.size() == list23.size()) {
                                                                                                                                                                int i23 = 0;
                                                                                                                                                                for (Object obj12 : list24) {
                                                                                                                                                                    int i24 = i23 + 1;
                                                                                                                                                                    if (i23 < 0) {
                                                                                                                                                                        scc.m();
                                                                                                                                                                        throw null;
                                                                                                                                                                    }
                                                                                                                                                                    if (!((v3k) obj12).a((v3k) list23.get(i23), rvoVar, rvoVar2)) {
                                                                                                                                                                        break;
                                                                                                                                                                    }
                                                                                                                                                                    i23 = i24;
                                                                                                                                                                }
                                                                                                                                                                Expression expression7 = this.H;
                                                                                                                                                                String str = expression7 != null ? (String) expression7.a(rvoVar) : null;
                                                                                                                                                                Expression expression8 = xrkVar.H;
                                                                                                                                                                if (jl40.l(str, expression8 != null ? (String) expression8.a(rvoVar2) : null)) {
                                                                                                                                                                    Expression expression9 = this.I;
                                                                                                                                                                    Uri uri = expression9 != null ? (Uri) expression9.a(rvoVar) : null;
                                                                                                                                                                    Expression expression10 = xrkVar.I;
                                                                                                                                                                    if (jl40.l(uri, expression10 != null ? (Uri) expression10.a(rvoVar2) : null)) {
                                                                                                                                                                        Expression expression11 = this.J;
                                                                                                                                                                        String str2 = expression11 != null ? (String) expression11.a(rvoVar) : null;
                                                                                                                                                                        Expression expression12 = xrkVar.J;
                                                                                                                                                                        if (jl40.l(str2, expression12 != null ? (String) expression12.a(rvoVar2) : null)) {
                                                                                                                                                                            Expression expression13 = this.K;
                                                                                                                                                                            Long l2 = expression13 != null ? (Long) expression13.a(rvoVar) : null;
                                                                                                                                                                            Expression expression14 = xrkVar.K;
                                                                                                                                                                            if (jl40.l(l2, expression14 != null ? (Long) expression14.a(rvoVar2) : null) && this.L.a(rvoVar) == xrkVar.L.a(rvoVar2)) {
                                                                                                                                                                                List list25 = xrkVar.M;
                                                                                                                                                                                List list26 = this.M;
                                                                                                                                                                                if (list26 != null) {
                                                                                                                                                                                    if (list25 != null && list26.size() == list25.size()) {
                                                                                                                                                                                        int i25 = 0;
                                                                                                                                                                                        for (Object obj13 : list26) {
                                                                                                                                                                                            int i26 = i25 + 1;
                                                                                                                                                                                            if (i25 < 0) {
                                                                                                                                                                                                scc.m();
                                                                                                                                                                                                throw null;
                                                                                                                                                                                            }
                                                                                                                                                                                            if (!((v3k) obj13).a((v3k) list25.get(i25), rvoVar, rvoVar2)) {
                                                                                                                                                                                                break;
                                                                                                                                                                                            }
                                                                                                                                                                                            i25 = i26;
                                                                                                                                                                                        }
                                                                                                                                                                                        List list27 = xrkVar.N;
                                                                                                                                                                                        List list28 = this.N;
                                                                                                                                                                                        if (list28 != null) {
                                                                                                                                                                                            if (list27 != null && list28.size() == list27.size()) {
                                                                                                                                                                                                int i27 = 0;
                                                                                                                                                                                                for (Object obj14 : list28) {
                                                                                                                                                                                                    int i28 = i27 + 1;
                                                                                                                                                                                                    if (i27 < 0) {
                                                                                                                                                                                                        scc.m();
                                                                                                                                                                                                        throw null;
                                                                                                                                                                                                    }
                                                                                                                                                                                                    if (!((gil) obj14).a((gil) list27.get(i27), rvoVar, rvoVar2)) {
                                                                                                                                                                                                        break;
                                                                                                                                                                                                    }
                                                                                                                                                                                                    i27 = i28;
                                                                                                                                                                                                }
                                                                                                                                                                                                DivTransform divTransform = xrkVar.O;
                                                                                                                                                                                                DivTransform divTransform2 = this.O;
                                                                                                                                                                                                if (divTransform2 != null ? divTransform2.a(divTransform, rvoVar, rvoVar2) : divTransform == null) {
                                                                                                                                                                                                    List list29 = xrkVar.P;
                                                                                                                                                                                                    List list30 = this.P;
                                                                                                                                                                                                    if (list30 != null) {
                                                                                                                                                                                                        if (list29 != null && list30.size() == list29.size()) {
                                                                                                                                                                                                            int i29 = 0;
                                                                                                                                                                                                            for (Object obj15 : list30) {
                                                                                                                                                                                                                int i30 = i29 + 1;
                                                                                                                                                                                                                if (i29 < 0) {
                                                                                                                                                                                                                    scc.m();
                                                                                                                                                                                                                    throw null;
                                                                                                                                                                                                                }
                                                                                                                                                                                                                if (!((xjl) obj15).a((xjl) list29.get(i29), rvoVar, rvoVar2)) {
                                                                                                                                                                                                                    break;
                                                                                                                                                                                                                }
                                                                                                                                                                                                                i29 = i30;
                                                                                                                                                                                                            }
                                                                                                                                                                                                            DivChangeTransition divChangeTransition = xrkVar.Q;
                                                                                                                                                                                                            DivChangeTransition divChangeTransition2 = this.Q;
                                                                                                                                                                                                            if (divChangeTransition2 != null ? divChangeTransition2.a(divChangeTransition, rvoVar, rvoVar2) : divChangeTransition == null) {
                                                                                                                                                                                                                DivAppearanceTransition divAppearanceTransition = xrkVar.R;
                                                                                                                                                                                                                DivAppearanceTransition divAppearanceTransition2 = this.R;
                                                                                                                                                                                                                if (divAppearanceTransition2 != null ? divAppearanceTransition2.a(divAppearanceTransition, rvoVar, rvoVar2) : divAppearanceTransition == null) {
                                                                                                                                                                                                                    DivAppearanceTransition divAppearanceTransition3 = xrkVar.S;
                                                                                                                                                                                                                    DivAppearanceTransition divAppearanceTransition4 = this.S;
                                                                                                                                                                                                                    if (divAppearanceTransition4 != null ? divAppearanceTransition4.a(divAppearanceTransition3, rvoVar, rvoVar2) : divAppearanceTransition3 == null) {
                                                                                                                                                                                                                        List list31 = xrkVar.T;
                                                                                                                                                                                                                        List list32 = this.T;
                                                                                                                                                                                                                        if (list32 != null) {
                                                                                                                                                                                                                            if (list31 != null && list32.size() == list31.size()) {
                                                                                                                                                                                                                                int i31 = 0;
                                                                                                                                                                                                                                for (Object obj16 : list32) {
                                                                                                                                                                                                                                    int i32 = i31 + 1;
                                                                                                                                                                                                                                    if (i31 < 0) {
                                                                                                                                                                                                                                        scc.m();
                                                                                                                                                                                                                                        throw null;
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                    if (((DivTransitionTrigger) obj16) != ((DivTransitionTrigger) list31.get(i31))) {
                                                                                                                                                                                                                                        break;
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                    i31 = i32;
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                List list33 = xrkVar.U;
                                                                                                                                                                                                                                List list34 = this.U;
                                                                                                                                                                                                                                if (list34 != null) {
                                                                                                                                                                                                                                    if (list33 != null && list34.size() == list33.size()) {
                                                                                                                                                                                                                                        int i33 = 0;
                                                                                                                                                                                                                                        for (Object obj17 : list34) {
                                                                                                                                                                                                                                            int i34 = i33 + 1;
                                                                                                                                                                                                                                            if (i33 < 0) {
                                                                                                                                                                                                                                                scc.m();
                                                                                                                                                                                                                                                throw null;
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                            if (!((lll) obj17).a((lll) list33.get(i33), rvoVar, rvoVar2)) {
                                                                                                                                                                                                                                                break;
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                            i33 = i34;
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                        List list35 = xrkVar.V;
                                                                                                                                                                                                                                        List list36 = this.V;
                                                                                                                                                                                                                                        if (list36 != null) {
                                                                                                                                                                                                                                            if (list35 != null && list36.size() == list35.size()) {
                                                                                                                                                                                                                                                int i35 = 0;
                                                                                                                                                                                                                                                for (Object obj18 : list36) {
                                                                                                                                                                                                                                                    int i36 = i35 + 1;
                                                                                                                                                                                                                                                    if (i35 < 0) {
                                                                                                                                                                                                                                                        scc.m();
                                                                                                                                                                                                                                                        throw null;
                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                    if (!((c3) obj18).a((c3) list35.get(i35), rvoVar, rvoVar2)) {
                                                                                                                                                                                                                                                        break;
                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                    i35 = i36;
                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                if (this.W.a(rvoVar) == xrkVar.W.a(rvoVar2)) {
                                                                                                                                                                                                                                                    DivVisibilityAction divVisibilityAction = xrkVar.X;
                                                                                                                                                                                                                                                    DivVisibilityAction divVisibilityAction2 = this.X;
                                                                                                                                                                                                                                                    if (divVisibilityAction2 != null ? divVisibilityAction2.f(divVisibilityAction, rvoVar, rvoVar2) : divVisibilityAction == null) {
                                                                                                                                                                                                                                                        List list37 = xrkVar.Y;
                                                                                                                                                                                                                                                        List list38 = this.Y;
                                                                                                                                                                                                                                                        if (list38 != null) {
                                                                                                                                                                                                                                                            if (list37 != null && list38.size() == list37.size()) {
                                                                                                                                                                                                                                                                int i37 = 0;
                                                                                                                                                                                                                                                                for (Object obj19 : list38) {
                                                                                                                                                                                                                                                                    int i38 = i37 + 1;
                                                                                                                                                                                                                                                                    if (i37 < 0) {
                                                                                                                                                                                                                                                                        scc.m();
                                                                                                                                                                                                                                                                        throw null;
                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                    if (!((DivVisibilityAction) obj19).f((DivVisibilityAction) list37.get(i37), rvoVar, rvoVar2)) {
                                                                                                                                                                                                                                                                        break;
                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                    i37 = i38;
                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                if (this.Z.a(xrkVar.Z, rvoVar, rvoVar2)) {
                                                                                                                                                                                                                                                                    return true;
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
        return false;
    }

    public final int C() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        Integer num = this.a0;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = qoi0.a(xrk.class).hashCode();
        int i18 = 0;
        DivAccessibility divAccessibility = this.a;
        int b = hashCode + (divAccessibility != null ? divAccessibility.b() : 0);
        v3k v3kVar = this.b;
        int b2 = this.c.b() + b + (v3kVar != null ? v3kVar.b() : 0);
        List list = this.d;
        if (list != null) {
            Iterator it = list.iterator();
            i = 0;
            while (it.hasNext()) {
                i += ((v3k) it.next()).b();
            }
        } else {
            i = 0;
        }
        int i19 = b2 + i;
        Expression expression = this.e;
        int hashCode2 = i19 + (expression != null ? expression.hashCode() : 0);
        Expression expression2 = this.f;
        int hashCode3 = this.g.hashCode() + hashCode2 + (expression2 != null ? expression2.hashCode() : 0);
        List list2 = this.h;
        if (list2 != null) {
            Iterator it2 = list2.iterator();
            i2 = 0;
            while (it2.hasNext()) {
                i2 += ((ydk) it2.next()).b();
            }
        } else {
            i2 = 0;
        }
        int i20 = hashCode3 + i2;
        afk afkVar = this.i;
        int b3 = i20 + (afkVar != null ? afkVar.b() : 0);
        List list3 = this.j;
        if (list3 != null) {
            Iterator it3 = list3.iterator();
            i3 = 0;
            while (it3.hasNext()) {
                i3 += ((kfk) it3.next()).b();
            }
        } else {
            i3 = 0;
        }
        int i21 = b3 + i3;
        DivBorder divBorder = this.k;
        int hashCode4 = this.l.hashCode() + i21 + (divBorder != null ? divBorder.b() : 0);
        Expression expression3 = this.m;
        int hashCode5 = this.o.hashCode() + this.n.hashCode() + hashCode4 + (expression3 != null ? expression3.hashCode() : 0);
        List list4 = this.p;
        if (list4 != null) {
            Iterator it4 = list4.iterator();
            i4 = 0;
            while (it4.hasNext()) {
                i4 += ((nnk) it4.next()).g();
            }
        } else {
            i4 = 0;
        }
        int i22 = hashCode5 + i4;
        List list5 = this.q;
        if (list5 != null) {
            Iterator it5 = list5.iterator();
            i5 = 0;
            while (it5.hasNext()) {
                i5 += ((v3k) it5.next()).b();
            }
        } else {
            i5 = 0;
        }
        int i23 = i22 + i5;
        List list6 = this.r;
        if (list6 != null) {
            Iterator it6 = list6.iterator();
            i6 = 0;
            while (it6.hasNext()) {
                i6 += ((bpk) it6.next()).b();
            }
        } else {
            i6 = 0;
        }
        int i24 = i23 + i6;
        DivFocus divFocus = this.s;
        int b4 = i24 + (divFocus != null ? divFocus.b() : 0);
        List list7 = this.t;
        if (list7 != null) {
            Iterator it7 = list7.iterator();
            i7 = 0;
            while (it7.hasNext()) {
                i7 += ((irk) it7.next()).b();
            }
        } else {
            i7 = 0;
        }
        int b5 = this.v.b() + this.u.hashCode() + b4 + i7;
        List list8 = this.w;
        if (list8 != null) {
            Iterator it8 = list8.iterator();
            i8 = 0;
            while (it8.hasNext()) {
                i8 += ((v3k) it8.next()).b();
            }
        } else {
            i8 = 0;
        }
        int i25 = b5 + i8;
        List list9 = this.x;
        if (list9 != null) {
            Iterator it9 = list9.iterator();
            i9 = 0;
            while (it9.hasNext()) {
                i9 += ((v3k) it9.next()).b();
            }
        } else {
            i9 = 0;
        }
        int i26 = i25 + i9;
        String str = this.y;
        int hashCode6 = i26 + (str != null ? str.hashCode() : 0);
        DivLayoutProvider divLayoutProvider = this.z;
        int b6 = hashCode6 + (divLayoutProvider != null ? divLayoutProvider.b() : 0);
        List list10 = this.A;
        if (list10 != null) {
            Iterator it10 = list10.iterator();
            i10 = 0;
            while (it10.hasNext()) {
                i10 += ((v3k) it10.next()).b();
            }
        } else {
            i10 = 0;
        }
        int i27 = b6 + i10;
        DivEdgeInsets divEdgeInsets = this.B;
        int b7 = i27 + (divEdgeInsets != null ? divEdgeInsets.b() : 0);
        DivEdgeInsets divEdgeInsets2 = this.C;
        int hashCode7 = this.E.hashCode() + this.D.hashCode() + b7 + (divEdgeInsets2 != null ? divEdgeInsets2.b() : 0);
        List list11 = this.F;
        if (list11 != null) {
            Iterator it11 = list11.iterator();
            i11 = 0;
            while (it11.hasNext()) {
                i11 += ((v3k) it11.next()).b();
            }
        } else {
            i11 = 0;
        }
        int i28 = hashCode7 + i11;
        List list12 = this.G;
        if (list12 != null) {
            Iterator it12 = list12.iterator();
            i12 = 0;
            while (it12.hasNext()) {
                i12 += ((v3k) it12.next()).b();
            }
        } else {
            i12 = 0;
        }
        int i29 = i28 + i12;
        Expression expression4 = this.H;
        int hashCode8 = i29 + (expression4 != null ? expression4.hashCode() : 0);
        Expression expression5 = this.I;
        int hashCode9 = hashCode8 + (expression5 != null ? expression5.hashCode() : 0);
        Expression expression6 = this.J;
        int hashCode10 = hashCode9 + (expression6 != null ? expression6.hashCode() : 0);
        Expression expression7 = this.K;
        int hashCode11 = this.L.hashCode() + hashCode10 + (expression7 != null ? expression7.hashCode() : 0);
        List list13 = this.M;
        if (list13 != null) {
            Iterator it13 = list13.iterator();
            i13 = 0;
            while (it13.hasNext()) {
                i13 += ((v3k) it13.next()).b();
            }
        } else {
            i13 = 0;
        }
        int i30 = hashCode11 + i13;
        List list14 = this.N;
        if (list14 != null) {
            Iterator it14 = list14.iterator();
            i14 = 0;
            while (it14.hasNext()) {
                i14 += ((gil) it14.next()).b();
            }
        } else {
            i14 = 0;
        }
        int i31 = i30 + i14;
        DivTransform divTransform = this.O;
        int b8 = i31 + (divTransform != null ? divTransform.b() : 0);
        List list15 = this.P;
        if (list15 != null) {
            Iterator it15 = list15.iterator();
            i15 = 0;
            while (it15.hasNext()) {
                i15 += ((xjl) it15.next()).b();
            }
        } else {
            i15 = 0;
        }
        int i32 = b8 + i15;
        DivChangeTransition divChangeTransition = this.Q;
        int b9 = i32 + (divChangeTransition != null ? divChangeTransition.b() : 0);
        DivAppearanceTransition divAppearanceTransition = this.R;
        int b10 = b9 + (divAppearanceTransition != null ? divAppearanceTransition.b() : 0);
        DivAppearanceTransition divAppearanceTransition2 = this.S;
        int b11 = b10 + (divAppearanceTransition2 != null ? divAppearanceTransition2.b() : 0);
        List list16 = this.T;
        int hashCode12 = b11 + (list16 != null ? list16.hashCode() : 0);
        List list17 = this.U;
        if (list17 != null) {
            Iterator it16 = list17.iterator();
            i16 = 0;
            while (it16.hasNext()) {
                i16 += ((lll) it16.next()).b();
            }
        } else {
            i16 = 0;
        }
        int i33 = hashCode12 + i16;
        List list18 = this.V;
        if (list18 != null) {
            Iterator it17 = list18.iterator();
            i17 = 0;
            while (it17.hasNext()) {
                i17 += ((c3) it17.next()).b();
            }
        } else {
            i17 = 0;
        }
        int hashCode13 = this.W.hashCode() + i33 + i17;
        DivVisibilityAction divVisibilityAction = this.X;
        int g = hashCode13 + (divVisibilityAction != null ? divVisibilityAction.g() : 0);
        List list19 = this.Y;
        if (list19 != null) {
            Iterator it18 = list19.iterator();
            while (it18.hasNext()) {
                i18 += ((DivVisibilityAction) it18.next()).g();
            }
        }
        int b12 = this.Z.b() + g + i18;
        this.a0 = Integer.valueOf(b12);
        return b12;
    }

    @Override // defpackage.egk
    public final Expression a() {
        return this.g;
    }

    @Override // defpackage.egk
    public final List b() {
        return this.Y;
    }

    @Override // defpackage.egk
    public final Expression c() {
        return this.m;
    }

    @Override // defpackage.egk
    public final List d() {
        return this.V;
    }

    @Override // defpackage.egk
    public final DivEdgeInsets e() {
        return this.B;
    }

    @Override // defpackage.egk
    public final Expression f() {
        return this.K;
    }

    @Override // defpackage.egk
    public final Expression g() {
        return this.J;
    }

    @Override // defpackage.egk
    public final List getBackground() {
        return this.j;
    }

    @Override // defpackage.egk
    public final List getExtensions() {
        return this.r;
    }

    @Override // defpackage.egk
    public final DivSize getHeight() {
        return this.v;
    }

    @Override // defpackage.egk
    public final String getId() {
        return this.y;
    }

    @Override // defpackage.egk
    public final Expression getVisibility() {
        return this.W;
    }

    @Override // defpackage.egk
    public final DivSize getWidth() {
        return this.Z;
    }

    @Override // defpackage.egk
    public final Expression h() {
        return this.e;
    }

    @Override // defpackage.egk
    public final List i() {
        return this.N;
    }

    @Override // defpackage.egk
    public final DivAppearanceTransition j() {
        return this.S;
    }

    @Override // defpackage.egk
    public final DivChangeTransition k() {
        return this.Q;
    }

    @Override // defpackage.egk
    public final List l() {
        return this.p;
    }

    @Override // defpackage.egk
    public final DivTransform m() {
        return this.O;
    }

    @Override // defpackage.egk
    public final List n() {
        return this.T;
    }

    @Override // defpackage.egk
    public final Expression o() {
        return this.f;
    }

    @Override // defpackage.egk
    public final DivFocus p() {
        return this.s;
    }

    @Override // defpackage.egk
    public final DivAccessibility q() {
        return this.a;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        return ((ask) ft6.b.Z3.getValue()).b(ft6.a, this);
    }

    @Override // defpackage.egk
    public final DivEdgeInsets s() {
        return this.C;
    }

    @Override // defpackage.egk
    public final List t() {
        return this.M;
    }

    @Override // defpackage.egk
    public final DivLayoutProvider u() {
        return this.z;
    }

    @Override // defpackage.egk
    public final List v() {
        return this.U;
    }

    @Override // defpackage.egk
    public final DivVisibilityAction w() {
        return this.X;
    }

    @Override // defpackage.egk
    public final List x() {
        return this.t;
    }

    @Override // defpackage.egk
    public final DivAppearanceTransition y() {
        return this.R;
    }

    @Override // defpackage.egk
    public final List z() {
        return this.h;
    }
}
