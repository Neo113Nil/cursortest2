package defpackage;

import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivAccessibility;
import com.yandex.div2.DivAlignmentHorizontal;
import com.yandex.div2.DivAlignmentVertical;
import com.yandex.div2.DivAppearanceTransition;
import com.yandex.div2.DivBorder;
import com.yandex.div2.DivChangeTransition;
import com.yandex.div2.DivEdgeInsets;
import com.yandex.div2.DivFocus;
import com.yandex.div2.DivFontWeight;
import com.yandex.div2.DivLayoutProvider;
import com.yandex.div2.DivSize;
import com.yandex.div2.DivSizeUnit;
import com.yandex.div2.DivTransform;
import com.yandex.div2.DivTransitionTrigger;
import com.yandex.div2.DivVisibility;
import com.yandex.div2.DivVisibilityAction;
import com.yandex.div2.c3;
import com.yandex.plus.home.feature.webviews.internal.container.ModalContentViewContainer;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class x7l implements c4x, egk {
    public final List A;
    public final DivEdgeInsets B;
    public final Expression C;
    public final Expression D;
    public final List E;
    public final Expression F;
    public final List G;
    public final DivTransform H;
    public final List I;
    public final DivChangeTransition J;
    public final DivAppearanceTransition K;
    public final DivAppearanceTransition L;
    public final List M;
    public final String N;
    public final List O;
    public final List P;
    public final Expression Q;
    public final DivVisibilityAction R;
    public final List S;
    public final DivSize T;
    public Integer U;
    public final DivAccessibility a;
    public final Expression b;
    public final Expression c;
    public final Expression d;
    public final List e;
    public final List f;
    public final DivBorder g;
    public final Expression h;
    public final List i;
    public final List j;
    public final DivFocus k;
    public final Expression l;
    public final Expression m;
    public final Expression n;
    public final Expression o;
    public final Expression p;
    public final Expression q;
    public final List r;
    public final DivSize s;
    public final Expression t;
    public final Expression u;
    public final String v;
    public final DivLayoutProvider w;
    public final Expression x;
    public final Expression y;
    public final DivEdgeInsets z;

    static {
        ngd0.m(Double.valueOf(1.0d));
        ngd0.m(12L);
        ngd0.m(DivSizeUnit.SP);
        ngd0.m(1929379840);
        ngd0.m(Double.valueOf(0.0d));
        ngd0.m(Integer.valueOf(ModalContentViewContainer.BASE_SHADOW_COLOR));
        ngd0.m(DivVisibility.VISIBLE);
    }

    public x7l(DivAccessibility divAccessibility, Expression expression, Expression expression2, Expression expression3, List list, List list2, DivBorder divBorder, Expression expression4, List list3, List list4, DivFocus divFocus, Expression expression5, Expression expression6, Expression expression7, Expression expression8, Expression expression9, Expression expression10, List list5, DivSize divSize, Expression expression11, Expression expression12, String str, DivLayoutProvider divLayoutProvider, Expression expression13, Expression expression14, DivEdgeInsets divEdgeInsets, List list6, DivEdgeInsets divEdgeInsets2, Expression expression15, Expression expression16, List list7, Expression expression17, List list8, DivTransform divTransform, List list9, DivChangeTransition divChangeTransition, DivAppearanceTransition divAppearanceTransition, DivAppearanceTransition divAppearanceTransition2, List list10, String str2, List list11, List list12, Expression expression18, DivVisibilityAction divVisibilityAction, List list13, DivSize divSize2) {
        this.a = divAccessibility;
        this.b = expression;
        this.c = expression2;
        this.d = expression3;
        this.e = list;
        this.f = list2;
        this.g = divBorder;
        this.h = expression4;
        this.i = list3;
        this.j = list4;
        this.k = divFocus;
        this.l = expression5;
        this.m = expression6;
        this.n = expression7;
        this.o = expression8;
        this.p = expression9;
        this.q = expression10;
        this.r = list5;
        this.s = divSize;
        this.t = expression11;
        this.u = expression12;
        this.v = str;
        this.w = divLayoutProvider;
        this.x = expression13;
        this.y = expression14;
        this.z = divEdgeInsets;
        this.A = list6;
        this.B = divEdgeInsets2;
        this.C = expression15;
        this.D = expression16;
        this.E = list7;
        this.F = expression17;
        this.G = list8;
        this.H = divTransform;
        this.I = list9;
        this.J = divChangeTransition;
        this.K = divAppearanceTransition;
        this.L = divAppearanceTransition2;
        this.M = list10;
        this.N = str2;
        this.O = list11;
        this.P = list12;
        this.Q = expression18;
        this.R = divVisibilityAction;
        this.S = list13;
        this.T = divSize2;
    }

    public static x7l B(x7l x7lVar, String str) {
        DivAccessibility divAccessibility = x7lVar.a;
        Expression expression = x7lVar.b;
        Expression expression2 = x7lVar.c;
        Expression expression3 = x7lVar.d;
        List list = x7lVar.e;
        List list2 = x7lVar.f;
        DivBorder divBorder = x7lVar.g;
        Expression expression4 = x7lVar.h;
        List list3 = x7lVar.i;
        List list4 = x7lVar.j;
        DivFocus divFocus = x7lVar.k;
        Expression expression5 = x7lVar.l;
        Expression expression6 = x7lVar.m;
        Expression expression7 = x7lVar.n;
        Expression expression8 = x7lVar.o;
        Expression expression9 = x7lVar.p;
        Expression expression10 = x7lVar.q;
        List list5 = x7lVar.r;
        DivSize divSize = x7lVar.s;
        Expression expression11 = x7lVar.t;
        Expression expression12 = x7lVar.u;
        DivLayoutProvider divLayoutProvider = x7lVar.w;
        Expression expression13 = x7lVar.x;
        Expression expression14 = x7lVar.y;
        DivEdgeInsets divEdgeInsets = x7lVar.z;
        List list6 = x7lVar.A;
        DivEdgeInsets divEdgeInsets2 = x7lVar.B;
        Expression expression15 = x7lVar.C;
        Expression expression16 = x7lVar.D;
        List list7 = x7lVar.E;
        Expression expression17 = x7lVar.F;
        List list8 = x7lVar.G;
        DivTransform divTransform = x7lVar.H;
        List list9 = x7lVar.I;
        DivChangeTransition divChangeTransition = x7lVar.J;
        DivAppearanceTransition divAppearanceTransition = x7lVar.K;
        DivAppearanceTransition divAppearanceTransition2 = x7lVar.L;
        List list10 = x7lVar.M;
        String str2 = x7lVar.N;
        List list11 = x7lVar.O;
        List list12 = x7lVar.P;
        Expression expression18 = x7lVar.Q;
        DivVisibilityAction divVisibilityAction = x7lVar.R;
        List list13 = x7lVar.S;
        DivSize divSize2 = x7lVar.T;
        x7lVar.getClass();
        return new x7l(divAccessibility, expression, expression2, expression3, list, list2, divBorder, expression4, list3, list4, divFocus, expression5, expression6, expression7, expression8, expression9, expression10, list5, divSize, expression11, expression12, str, divLayoutProvider, expression13, expression14, divEdgeInsets, list6, divEdgeInsets2, expression15, expression16, list7, expression17, list8, divTransform, list9, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, list10, str2, list11, list12, expression18, divVisibilityAction, list13, divSize2);
    }

    @Override // defpackage.egk
    public final DivBorder A() {
        return this.g;
    }

    /* JADX WARN: Code restructure failed: missing block: B:403:0x064f, code lost:
    
        if (r3 == null) goto L463;
     */
    /* JADX WARN: Code restructure failed: missing block: B:407:0x05ef, code lost:
    
        if (r3 == null) goto L435;
     */
    /* JADX WARN: Code restructure failed: missing block: B:408:0x05ac, code lost:
    
        if (r3 == null) goto L416;
     */
    /* JADX WARN: Code restructure failed: missing block: B:409:0x055f, code lost:
    
        if (r3 == null) goto L395;
     */
    /* JADX WARN: Code restructure failed: missing block: B:419:0x04ec, code lost:
    
        if (r3 == null) goto L356;
     */
    /* JADX WARN: Code restructure failed: missing block: B:423:0x0497, code lost:
    
        if (r3 == null) goto L330;
     */
    /* JADX WARN: Code restructure failed: missing block: B:424:0x043a, code lost:
    
        if (r3 == null) goto L309;
     */
    /* JADX WARN: Code restructure failed: missing block: B:442:0x0296, code lost:
    
        if (r3 == null) goto L194;
     */
    /* JADX WARN: Code restructure failed: missing block: B:454:0x01a3, code lost:
    
        if (r3 == null) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:455:0x0160, code lost:
    
        if (r3 == null) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:461:0x00ed, code lost:
    
        if (r3 == null) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:462:0x00aa, code lost:
    
        if (r3 == null) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean C(x7l x7lVar, rvo rvoVar, rvo rvoVar2) {
        if (x7lVar != null) {
            DivAccessibility divAccessibility = x7lVar.a;
            DivAccessibility divAccessibility2 = this.a;
            if (divAccessibility2 != null ? divAccessibility2.a(divAccessibility, rvoVar, rvoVar2) : divAccessibility == null) {
                Expression expression = this.b;
                DivAlignmentHorizontal divAlignmentHorizontal = expression != null ? (DivAlignmentHorizontal) expression.a(rvoVar) : null;
                Expression expression2 = x7lVar.b;
                if (divAlignmentHorizontal == (expression2 != null ? (DivAlignmentHorizontal) expression2.a(rvoVar2) : null)) {
                    Expression expression3 = this.c;
                    DivAlignmentVertical divAlignmentVertical = expression3 != null ? (DivAlignmentVertical) expression3.a(rvoVar) : null;
                    Expression expression4 = x7lVar.c;
                    if (divAlignmentVertical == (expression4 != null ? (DivAlignmentVertical) expression4.a(rvoVar2) : null) && ((Number) this.d.a(rvoVar)).doubleValue() == ((Number) x7lVar.d.a(rvoVar2)).doubleValue()) {
                        List list = x7lVar.e;
                        List list2 = this.e;
                        if (list2 != null) {
                            if (list != null && list2.size() == list.size()) {
                                int i = 0;
                                for (Object obj : list2) {
                                    int i2 = i + 1;
                                    if (i < 0) {
                                        scc.m();
                                        throw null;
                                    }
                                    if (!((ydk) obj).a((ydk) list.get(i), rvoVar, rvoVar2)) {
                                        break;
                                    }
                                    i = i2;
                                }
                                List list3 = x7lVar.f;
                                List list4 = this.f;
                                if (list4 != null) {
                                    if (list3 != null && list4.size() == list3.size()) {
                                        int i3 = 0;
                                        for (Object obj2 : list4) {
                                            int i4 = i3 + 1;
                                            if (i3 < 0) {
                                                scc.m();
                                                throw null;
                                            }
                                            if (!((kfk) obj2).a((kfk) list3.get(i3), rvoVar, rvoVar2)) {
                                                break;
                                            }
                                            i3 = i4;
                                        }
                                        DivBorder divBorder = x7lVar.g;
                                        DivBorder divBorder2 = this.g;
                                        if (divBorder2 != null ? divBorder2.a(divBorder, rvoVar, rvoVar2) : divBorder == null) {
                                            Expression expression5 = this.h;
                                            Long l = expression5 != null ? (Long) expression5.a(rvoVar) : null;
                                            Expression expression6 = x7lVar.h;
                                            if (jl40.l(l, expression6 != null ? (Long) expression6.a(rvoVar2) : null)) {
                                                List list5 = x7lVar.i;
                                                List list6 = this.i;
                                                if (list6 != null) {
                                                    if (list5 != null && list6.size() == list5.size()) {
                                                        int i5 = 0;
                                                        for (Object obj3 : list6) {
                                                            int i6 = i5 + 1;
                                                            if (i5 < 0) {
                                                                scc.m();
                                                                throw null;
                                                            }
                                                            if (!((nnk) obj3).f((nnk) list5.get(i5), rvoVar, rvoVar2)) {
                                                                break;
                                                            }
                                                            i5 = i6;
                                                        }
                                                        List list7 = x7lVar.j;
                                                        List list8 = this.j;
                                                        if (list8 != null) {
                                                            if (list7 != null && list8.size() == list7.size()) {
                                                                int i7 = 0;
                                                                for (Object obj4 : list8) {
                                                                    int i8 = i7 + 1;
                                                                    if (i7 < 0) {
                                                                        scc.m();
                                                                        throw null;
                                                                    }
                                                                    if (!((bpk) obj4).a((bpk) list7.get(i7))) {
                                                                        break;
                                                                    }
                                                                    i7 = i8;
                                                                }
                                                                DivFocus divFocus = x7lVar.k;
                                                                DivFocus divFocus2 = this.k;
                                                                if (divFocus2 != null ? divFocus2.a(divFocus, rvoVar, rvoVar2) : divFocus == null) {
                                                                    Expression expression7 = this.l;
                                                                    String str = expression7 != null ? (String) expression7.a(rvoVar) : null;
                                                                    Expression expression8 = x7lVar.l;
                                                                    if (jl40.l(str, expression8 != null ? (String) expression8.a(rvoVar2) : null) && ((Number) this.m.a(rvoVar)).longValue() == ((Number) x7lVar.m.a(rvoVar2)).longValue() && this.n.a(rvoVar) == x7lVar.n.a(rvoVar2)) {
                                                                        Expression expression9 = this.o;
                                                                        JSONObject jSONObject = expression9 != null ? (JSONObject) expression9.a(rvoVar) : null;
                                                                        Expression expression10 = x7lVar.o;
                                                                        if (jl40.l(jSONObject, expression10 != null ? (JSONObject) expression10.a(rvoVar2) : null)) {
                                                                            Expression expression11 = this.p;
                                                                            DivFontWeight divFontWeight = expression11 != null ? (DivFontWeight) expression11.a(rvoVar) : null;
                                                                            Expression expression12 = x7lVar.p;
                                                                            if (divFontWeight == (expression12 != null ? (DivFontWeight) expression12.a(rvoVar2) : null)) {
                                                                                Expression expression13 = this.q;
                                                                                Long l2 = expression13 != null ? (Long) expression13.a(rvoVar) : null;
                                                                                Expression expression14 = x7lVar.q;
                                                                                if (jl40.l(l2, expression14 != null ? (Long) expression14.a(rvoVar2) : null)) {
                                                                                    List list9 = x7lVar.r;
                                                                                    List list10 = this.r;
                                                                                    if (list10 != null) {
                                                                                        if (list9 != null && list10.size() == list9.size()) {
                                                                                            int i9 = 0;
                                                                                            for (Object obj5 : list10) {
                                                                                                int i10 = i9 + 1;
                                                                                                if (i9 < 0) {
                                                                                                    scc.m();
                                                                                                    throw null;
                                                                                                }
                                                                                                if (!((irk) obj5).a((irk) list9.get(i9))) {
                                                                                                    break;
                                                                                                }
                                                                                                i9 = i10;
                                                                                            }
                                                                                            if (this.s.a(x7lVar.s, rvoVar, rvoVar2) && ((Number) this.t.a(rvoVar)).intValue() == ((Number) x7lVar.t.a(rvoVar2)).intValue()) {
                                                                                                Expression expression15 = this.u;
                                                                                                String str2 = expression15 != null ? (String) expression15.a(rvoVar) : null;
                                                                                                Expression expression16 = x7lVar.u;
                                                                                                if (jl40.l(str2, expression16 != null ? (String) expression16.a(rvoVar2) : null) && jl40.l(this.v, x7lVar.v)) {
                                                                                                    DivLayoutProvider divLayoutProvider = x7lVar.w;
                                                                                                    DivLayoutProvider divLayoutProvider2 = this.w;
                                                                                                    if ((divLayoutProvider2 != null ? divLayoutProvider2.a(divLayoutProvider) : divLayoutProvider == null) && ((Number) this.x.a(rvoVar)).doubleValue() == ((Number) x7lVar.x.a(rvoVar2)).doubleValue()) {
                                                                                                        Expression expression17 = this.y;
                                                                                                        Long l3 = expression17 != null ? (Long) expression17.a(rvoVar) : null;
                                                                                                        Expression expression18 = x7lVar.y;
                                                                                                        if (jl40.l(l3, expression18 != null ? (Long) expression18.a(rvoVar2) : null)) {
                                                                                                            DivEdgeInsets divEdgeInsets = x7lVar.z;
                                                                                                            DivEdgeInsets divEdgeInsets2 = this.z;
                                                                                                            if (divEdgeInsets2 != null ? divEdgeInsets2.a(divEdgeInsets, rvoVar, rvoVar2) : divEdgeInsets == null) {
                                                                                                                List list11 = x7lVar.A;
                                                                                                                List list12 = this.A;
                                                                                                                if (list12.size() == list11.size()) {
                                                                                                                    Iterator it = list12.iterator();
                                                                                                                    int i11 = 0;
                                                                                                                    while (true) {
                                                                                                                        if (it.hasNext()) {
                                                                                                                            Object next = it.next();
                                                                                                                            int i12 = i11 + 1;
                                                                                                                            if (i11 < 0) {
                                                                                                                                scc.m();
                                                                                                                                throw null;
                                                                                                                            }
                                                                                                                            w7l w7lVar = (w7l) list11.get(i11);
                                                                                                                            w7l w7lVar2 = (w7l) next;
                                                                                                                            if (w7lVar == null) {
                                                                                                                                w7lVar2.getClass();
                                                                                                                                return false;
                                                                                                                            }
                                                                                                                            Expression expression19 = w7lVar2.a;
                                                                                                                            String str3 = expression19 != null ? (String) expression19.a(rvoVar) : null;
                                                                                                                            Expression expression20 = w7lVar.a;
                                                                                                                            if (!jl40.l(str3, expression20 != null ? (String) expression20.a(rvoVar2) : null) || !jl40.l(w7lVar2.b.a(rvoVar), w7lVar.b.a(rvoVar2))) {
                                                                                                                                break;
                                                                                                                            }
                                                                                                                            i11 = i12;
                                                                                                                        } else {
                                                                                                                            DivEdgeInsets divEdgeInsets3 = x7lVar.B;
                                                                                                                            DivEdgeInsets divEdgeInsets4 = this.B;
                                                                                                                            if (divEdgeInsets4 != null ? divEdgeInsets4.a(divEdgeInsets3, rvoVar, rvoVar2) : divEdgeInsets3 == null) {
                                                                                                                                Expression expression21 = this.C;
                                                                                                                                String str4 = expression21 != null ? (String) expression21.a(rvoVar) : null;
                                                                                                                                Expression expression22 = x7lVar.C;
                                                                                                                                if (jl40.l(str4, expression22 != null ? (String) expression22.a(rvoVar2) : null)) {
                                                                                                                                    Expression expression23 = this.D;
                                                                                                                                    Long l4 = expression23 != null ? (Long) expression23.a(rvoVar) : null;
                                                                                                                                    Expression expression24 = x7lVar.D;
                                                                                                                                    if (jl40.l(l4, expression24 != null ? (Long) expression24.a(rvoVar2) : null)) {
                                                                                                                                        List list13 = x7lVar.E;
                                                                                                                                        List list14 = this.E;
                                                                                                                                        if (list14 != null) {
                                                                                                                                            if (list13 != null && list14.size() == list13.size()) {
                                                                                                                                                int i13 = 0;
                                                                                                                                                for (Object obj6 : list14) {
                                                                                                                                                    int i14 = i13 + 1;
                                                                                                                                                    if (i13 < 0) {
                                                                                                                                                        scc.m();
                                                                                                                                                        throw null;
                                                                                                                                                    }
                                                                                                                                                    if (!((v3k) obj6).a((v3k) list13.get(i13), rvoVar, rvoVar2)) {
                                                                                                                                                        break;
                                                                                                                                                    }
                                                                                                                                                    i13 = i14;
                                                                                                                                                }
                                                                                                                                                if (((Number) this.F.a(rvoVar)).intValue() == ((Number) x7lVar.F.a(rvoVar2)).intValue()) {
                                                                                                                                                    List list15 = x7lVar.G;
                                                                                                                                                    List list16 = this.G;
                                                                                                                                                    if (list16 != null) {
                                                                                                                                                        if (list15 != null && list16.size() == list15.size()) {
                                                                                                                                                            int i15 = 0;
                                                                                                                                                            for (Object obj7 : list16) {
                                                                                                                                                                int i16 = i15 + 1;
                                                                                                                                                                if (i15 < 0) {
                                                                                                                                                                    scc.m();
                                                                                                                                                                    throw null;
                                                                                                                                                                }
                                                                                                                                                                if (!((gil) obj7).a((gil) list15.get(i15), rvoVar, rvoVar2)) {
                                                                                                                                                                    break;
                                                                                                                                                                }
                                                                                                                                                                i15 = i16;
                                                                                                                                                            }
                                                                                                                                                            DivTransform divTransform = x7lVar.H;
                                                                                                                                                            DivTransform divTransform2 = this.H;
                                                                                                                                                            if (divTransform2 != null ? divTransform2.a(divTransform, rvoVar, rvoVar2) : divTransform == null) {
                                                                                                                                                                List list17 = x7lVar.I;
                                                                                                                                                                List list18 = this.I;
                                                                                                                                                                if (list18 != null) {
                                                                                                                                                                    if (list17 != null && list18.size() == list17.size()) {
                                                                                                                                                                        int i17 = 0;
                                                                                                                                                                        for (Object obj8 : list18) {
                                                                                                                                                                            int i18 = i17 + 1;
                                                                                                                                                                            if (i17 < 0) {
                                                                                                                                                                                scc.m();
                                                                                                                                                                                throw null;
                                                                                                                                                                            }
                                                                                                                                                                            if (!((xjl) obj8).a((xjl) list17.get(i17), rvoVar, rvoVar2)) {
                                                                                                                                                                                break;
                                                                                                                                                                            }
                                                                                                                                                                            i17 = i18;
                                                                                                                                                                        }
                                                                                                                                                                        DivChangeTransition divChangeTransition = x7lVar.J;
                                                                                                                                                                        DivChangeTransition divChangeTransition2 = this.J;
                                                                                                                                                                        if (divChangeTransition2 != null ? divChangeTransition2.a(divChangeTransition, rvoVar, rvoVar2) : divChangeTransition == null) {
                                                                                                                                                                            DivAppearanceTransition divAppearanceTransition = x7lVar.K;
                                                                                                                                                                            DivAppearanceTransition divAppearanceTransition2 = this.K;
                                                                                                                                                                            if (divAppearanceTransition2 != null ? divAppearanceTransition2.a(divAppearanceTransition, rvoVar, rvoVar2) : divAppearanceTransition == null) {
                                                                                                                                                                                DivAppearanceTransition divAppearanceTransition3 = x7lVar.L;
                                                                                                                                                                                DivAppearanceTransition divAppearanceTransition4 = this.L;
                                                                                                                                                                                if (divAppearanceTransition4 != null ? divAppearanceTransition4.a(divAppearanceTransition3, rvoVar, rvoVar2) : divAppearanceTransition3 == null) {
                                                                                                                                                                                    List list19 = x7lVar.M;
                                                                                                                                                                                    List list20 = this.M;
                                                                                                                                                                                    if (list20 != null) {
                                                                                                                                                                                        if (list19 != null && list20.size() == list19.size()) {
                                                                                                                                                                                            int i19 = 0;
                                                                                                                                                                                            for (Object obj9 : list20) {
                                                                                                                                                                                                int i20 = i19 + 1;
                                                                                                                                                                                                if (i19 < 0) {
                                                                                                                                                                                                    scc.m();
                                                                                                                                                                                                    throw null;
                                                                                                                                                                                                }
                                                                                                                                                                                                if (((DivTransitionTrigger) obj9) != ((DivTransitionTrigger) list19.get(i19))) {
                                                                                                                                                                                                    break;
                                                                                                                                                                                                }
                                                                                                                                                                                                i19 = i20;
                                                                                                                                                                                            }
                                                                                                                                                                                            if (jl40.l(this.N, x7lVar.N)) {
                                                                                                                                                                                                List list21 = x7lVar.O;
                                                                                                                                                                                                List list22 = this.O;
                                                                                                                                                                                                if (list22 != null) {
                                                                                                                                                                                                    if (list21 != null && list22.size() == list21.size()) {
                                                                                                                                                                                                        int i21 = 0;
                                                                                                                                                                                                        for (Object obj10 : list22) {
                                                                                                                                                                                                            int i22 = i21 + 1;
                                                                                                                                                                                                            if (i21 < 0) {
                                                                                                                                                                                                                scc.m();
                                                                                                                                                                                                                throw null;
                                                                                                                                                                                                            }
                                                                                                                                                                                                            if (!((lll) obj10).a((lll) list21.get(i21), rvoVar, rvoVar2)) {
                                                                                                                                                                                                                break;
                                                                                                                                                                                                            }
                                                                                                                                                                                                            i21 = i22;
                                                                                                                                                                                                        }
                                                                                                                                                                                                        List list23 = x7lVar.P;
                                                                                                                                                                                                        List list24 = this.P;
                                                                                                                                                                                                        if (list24 != null) {
                                                                                                                                                                                                            if (list23 != null && list24.size() == list23.size()) {
                                                                                                                                                                                                                int i23 = 0;
                                                                                                                                                                                                                for (Object obj11 : list24) {
                                                                                                                                                                                                                    int i24 = i23 + 1;
                                                                                                                                                                                                                    if (i23 < 0) {
                                                                                                                                                                                                                        scc.m();
                                                                                                                                                                                                                        throw null;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    if (!((c3) obj11).a((c3) list23.get(i23), rvoVar, rvoVar2)) {
                                                                                                                                                                                                                        break;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    i23 = i24;
                                                                                                                                                                                                                }
                                                                                                                                                                                                                if (this.Q.a(rvoVar) == x7lVar.Q.a(rvoVar2)) {
                                                                                                                                                                                                                    DivVisibilityAction divVisibilityAction = x7lVar.R;
                                                                                                                                                                                                                    DivVisibilityAction divVisibilityAction2 = this.R;
                                                                                                                                                                                                                    if (divVisibilityAction2 != null ? divVisibilityAction2.f(divVisibilityAction, rvoVar, rvoVar2) : divVisibilityAction == null) {
                                                                                                                                                                                                                        List list25 = x7lVar.S;
                                                                                                                                                                                                                        List list26 = this.S;
                                                                                                                                                                                                                        if (list26 != null) {
                                                                                                                                                                                                                            if (list25 != null && list26.size() == list25.size()) {
                                                                                                                                                                                                                                int i25 = 0;
                                                                                                                                                                                                                                for (Object obj12 : list26) {
                                                                                                                                                                                                                                    int i26 = i25 + 1;
                                                                                                                                                                                                                                    if (i25 < 0) {
                                                                                                                                                                                                                                        scc.m();
                                                                                                                                                                                                                                        throw null;
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                    if (!((DivVisibilityAction) obj12).f((DivVisibilityAction) list25.get(i25), rvoVar, rvoVar2)) {
                                                                                                                                                                                                                                        break;
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                    i25 = i26;
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                if (this.T.a(x7lVar.T, rvoVar, rvoVar2)) {
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
        return false;
    }

    public final int D() {
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
        Integer num = this.U;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = qoi0.a(x7l.class).hashCode();
        int i12 = 0;
        DivAccessibility divAccessibility = this.a;
        int b = hashCode + (divAccessibility != null ? divAccessibility.b() : 0);
        Expression expression = this.b;
        int hashCode2 = b + (expression != null ? expression.hashCode() : 0);
        Expression expression2 = this.c;
        int hashCode3 = this.d.hashCode() + hashCode2 + (expression2 != null ? expression2.hashCode() : 0);
        List list = this.e;
        if (list != null) {
            Iterator it = list.iterator();
            i = 0;
            while (it.hasNext()) {
                i += ((ydk) it.next()).b();
            }
        } else {
            i = 0;
        }
        int i13 = hashCode3 + i;
        List list2 = this.f;
        if (list2 != null) {
            Iterator it2 = list2.iterator();
            i2 = 0;
            while (it2.hasNext()) {
                i2 += ((kfk) it2.next()).b();
            }
        } else {
            i2 = 0;
        }
        int i14 = i13 + i2;
        DivBorder divBorder = this.g;
        int b2 = i14 + (divBorder != null ? divBorder.b() : 0);
        Expression expression3 = this.h;
        int hashCode4 = b2 + (expression3 != null ? expression3.hashCode() : 0);
        List list3 = this.i;
        if (list3 != null) {
            Iterator it3 = list3.iterator();
            i3 = 0;
            while (it3.hasNext()) {
                i3 += ((nnk) it3.next()).g();
            }
        } else {
            i3 = 0;
        }
        int i15 = hashCode4 + i3;
        List list4 = this.j;
        if (list4 != null) {
            Iterator it4 = list4.iterator();
            i4 = 0;
            while (it4.hasNext()) {
                i4 += ((bpk) it4.next()).b();
            }
        } else {
            i4 = 0;
        }
        int i16 = i15 + i4;
        DivFocus divFocus = this.k;
        int b3 = i16 + (divFocus != null ? divFocus.b() : 0);
        Expression expression4 = this.l;
        int hashCode5 = this.n.hashCode() + this.m.hashCode() + b3 + (expression4 != null ? expression4.hashCode() : 0);
        Expression expression5 = this.o;
        int hashCode6 = hashCode5 + (expression5 != null ? expression5.hashCode() : 0);
        Expression expression6 = this.p;
        int hashCode7 = hashCode6 + (expression6 != null ? expression6.hashCode() : 0);
        Expression expression7 = this.q;
        int hashCode8 = hashCode7 + (expression7 != null ? expression7.hashCode() : 0);
        List list5 = this.r;
        if (list5 != null) {
            Iterator it5 = list5.iterator();
            i5 = 0;
            while (it5.hasNext()) {
                i5 += ((irk) it5.next()).b();
            }
        } else {
            i5 = 0;
        }
        int hashCode9 = this.t.hashCode() + this.s.b() + hashCode8 + i5;
        Expression expression8 = this.u;
        int hashCode10 = hashCode9 + (expression8 != null ? expression8.hashCode() : 0);
        String str = this.v;
        int hashCode11 = hashCode10 + (str != null ? str.hashCode() : 0);
        DivLayoutProvider divLayoutProvider = this.w;
        int hashCode12 = this.x.hashCode() + hashCode11 + (divLayoutProvider != null ? divLayoutProvider.b() : 0);
        Expression expression9 = this.y;
        int hashCode13 = hashCode12 + (expression9 != null ? expression9.hashCode() : 0);
        DivEdgeInsets divEdgeInsets = this.z;
        int b4 = hashCode13 + (divEdgeInsets != null ? divEdgeInsets.b() : 0);
        int i17 = 0;
        for (w7l w7lVar : this.A) {
            Integer num2 = w7lVar.c;
            if (num2 != null) {
                i11 = num2.intValue();
            } else {
                int hashCode14 = qoi0.a(w7l.class).hashCode();
                Expression expression10 = w7lVar.a;
                int hashCode15 = hashCode14 + (expression10 != null ? expression10.hashCode() : 0) + w7lVar.b.hashCode();
                w7lVar.c = Integer.valueOf(hashCode15);
                i11 = hashCode15;
            }
            i17 += i11;
        }
        int i18 = b4 + i17;
        DivEdgeInsets divEdgeInsets2 = this.B;
        int b5 = i18 + (divEdgeInsets2 != null ? divEdgeInsets2.b() : 0);
        Expression expression11 = this.C;
        int hashCode16 = b5 + (expression11 != null ? expression11.hashCode() : 0);
        Expression expression12 = this.D;
        int hashCode17 = hashCode16 + (expression12 != null ? expression12.hashCode() : 0);
        List list6 = this.E;
        if (list6 != null) {
            Iterator it6 = list6.iterator();
            i6 = 0;
            while (it6.hasNext()) {
                i6 += ((v3k) it6.next()).b();
            }
        } else {
            i6 = 0;
        }
        int hashCode18 = this.F.hashCode() + hashCode17 + i6;
        List list7 = this.G;
        if (list7 != null) {
            Iterator it7 = list7.iterator();
            i7 = 0;
            while (it7.hasNext()) {
                i7 += ((gil) it7.next()).b();
            }
        } else {
            i7 = 0;
        }
        int i19 = hashCode18 + i7;
        DivTransform divTransform = this.H;
        int b6 = i19 + (divTransform != null ? divTransform.b() : 0);
        List list8 = this.I;
        if (list8 != null) {
            Iterator it8 = list8.iterator();
            i8 = 0;
            while (it8.hasNext()) {
                i8 += ((xjl) it8.next()).b();
            }
        } else {
            i8 = 0;
        }
        int i20 = b6 + i8;
        DivChangeTransition divChangeTransition = this.J;
        int b7 = i20 + (divChangeTransition != null ? divChangeTransition.b() : 0);
        DivAppearanceTransition divAppearanceTransition = this.K;
        int b8 = b7 + (divAppearanceTransition != null ? divAppearanceTransition.b() : 0);
        DivAppearanceTransition divAppearanceTransition2 = this.L;
        int b9 = b8 + (divAppearanceTransition2 != null ? divAppearanceTransition2.b() : 0);
        List list9 = this.M;
        int hashCode19 = this.N.hashCode() + b9 + (list9 != null ? list9.hashCode() : 0);
        List list10 = this.O;
        if (list10 != null) {
            Iterator it9 = list10.iterator();
            i9 = 0;
            while (it9.hasNext()) {
                i9 += ((lll) it9.next()).b();
            }
        } else {
            i9 = 0;
        }
        int i21 = hashCode19 + i9;
        List list11 = this.P;
        if (list11 != null) {
            Iterator it10 = list11.iterator();
            i10 = 0;
            while (it10.hasNext()) {
                i10 += ((c3) it10.next()).b();
            }
        } else {
            i10 = 0;
        }
        int hashCode20 = this.Q.hashCode() + i21 + i10;
        DivVisibilityAction divVisibilityAction = this.R;
        int g = hashCode20 + (divVisibilityAction != null ? divVisibilityAction.g() : 0);
        List list12 = this.S;
        if (list12 != null) {
            Iterator it11 = list12.iterator();
            while (it11.hasNext()) {
                i12 += ((DivVisibilityAction) it11.next()).g();
            }
        }
        int b10 = this.T.b() + g + i12;
        this.U = Integer.valueOf(b10);
        return b10;
    }

    @Override // defpackage.egk
    public final Expression a() {
        return this.d;
    }

    @Override // defpackage.egk
    public final List b() {
        return this.S;
    }

    @Override // defpackage.egk
    public final Expression c() {
        return this.h;
    }

    @Override // defpackage.egk
    public final List d() {
        return this.P;
    }

    @Override // defpackage.egk
    public final DivEdgeInsets e() {
        return this.z;
    }

    @Override // defpackage.egk
    public final Expression f() {
        return this.D;
    }

    @Override // defpackage.egk
    public final Expression g() {
        return this.C;
    }

    @Override // defpackage.egk
    public final List getBackground() {
        return this.f;
    }

    @Override // defpackage.egk
    public final List getExtensions() {
        return this.j;
    }

    @Override // defpackage.egk
    public final DivSize getHeight() {
        return this.s;
    }

    @Override // defpackage.egk
    public final String getId() {
        return this.v;
    }

    @Override // defpackage.egk
    public final Expression getVisibility() {
        return this.Q;
    }

    @Override // defpackage.egk
    public final DivSize getWidth() {
        return this.T;
    }

    @Override // defpackage.egk
    public final Expression h() {
        return this.b;
    }

    @Override // defpackage.egk
    public final List i() {
        return this.G;
    }

    @Override // defpackage.egk
    public final DivAppearanceTransition j() {
        return this.L;
    }

    @Override // defpackage.egk
    public final DivChangeTransition k() {
        return this.J;
    }

    @Override // defpackage.egk
    public final List l() {
        return this.i;
    }

    @Override // defpackage.egk
    public final DivTransform m() {
        return this.H;
    }

    @Override // defpackage.egk
    public final List n() {
        return this.M;
    }

    @Override // defpackage.egk
    public final Expression o() {
        return this.c;
    }

    @Override // defpackage.egk
    public final DivFocus p() {
        return this.k;
    }

    @Override // defpackage.egk
    public final DivAccessibility q() {
        return this.a;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        return ((z7l) ft6.b.Q6.getValue()).b(ft6.a, this);
    }

    @Override // defpackage.egk
    public final DivEdgeInsets s() {
        return this.B;
    }

    @Override // defpackage.egk
    public final List t() {
        return this.E;
    }

    @Override // defpackage.egk
    public final DivLayoutProvider u() {
        return this.w;
    }

    @Override // defpackage.egk
    public final List v() {
        return this.O;
    }

    @Override // defpackage.egk
    public final DivVisibilityAction w() {
        return this.R;
    }

    @Override // defpackage.egk
    public final List x() {
        return this.r;
    }

    @Override // defpackage.egk
    public final DivAppearanceTransition y() {
        return this.K;
    }

    @Override // defpackage.egk
    public final List z() {
        return this.e;
    }
}
