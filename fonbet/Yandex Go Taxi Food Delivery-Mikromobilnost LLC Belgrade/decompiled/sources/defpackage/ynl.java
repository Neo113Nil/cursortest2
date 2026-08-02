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
import com.yandex.div2.DivLayoutProvider;
import com.yandex.div2.DivSize;
import com.yandex.div2.DivTransform;
import com.yandex.div2.DivTransitionTrigger;
import com.yandex.div2.DivVideoScale;
import com.yandex.div2.DivVisibility;
import com.yandex.div2.DivVisibilityAction;
import com.yandex.div2.c3;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class ynl implements c4x, egk {
    public static final kvo Y;
    public static final kvo Z;
    public static final j9l a0;
    public static final kvo b0;
    public static final kvo c0;
    public static final kvo d0;
    public static final kvo e0;
    public static final kvo f0;
    public static final kvo g0;
    public static final i9l h0;
    public final Expression A;
    public final Expression B;
    public final Expression C;
    public final Expression D;
    public final List E;
    public final Expression F;
    public final Expression G;
    public final Expression H;
    public final List I;
    public final List J;
    public final DivTransform K;
    public final List L;
    public final DivChangeTransition M;
    public final DivAppearanceTransition N;
    public final DivAppearanceTransition O;
    public final List P;
    public final List Q;
    public final List R;
    public final List S;
    public final Expression T;
    public final DivVisibilityAction U;
    public final List V;
    public final DivSize W;
    public Integer X;
    public final DivAccessibility a;
    public final Expression b;
    public final Expression c;
    public final Expression d;
    public final List e;
    public final afk f;
    public final Expression g;
    public final List h;
    public final DivBorder i;
    public final List j;
    public final Expression k;
    public final List l;
    public final String m;
    public final List n;
    public final List o;
    public final List p;
    public final DivFocus q;
    public final List r;
    public final DivSize s;
    public final String t;
    public final DivLayoutProvider u;
    public final DivEdgeInsets v;
    public final Expression w;
    public final DivEdgeInsets x;
    public final List y;
    public final Expression z;

    static {
        Double valueOf = Double.valueOf(1.0d);
        Y = ngd0.m(valueOf);
        Boolean bool = Boolean.FALSE;
        Z = ngd0.m(bool);
        a0 = new j9l(new lql(null, null, null));
        b0 = ngd0.m(bool);
        c0 = ngd0.m(valueOf);
        d0 = ngd0.m(bool);
        e0 = ngd0.m(bool);
        f0 = ngd0.m(DivVideoScale.FIT);
        g0 = ngd0.m(DivVisibility.VISIBLE);
        h0 = new i9l(new nzk(null, null, null));
    }

    public ynl(DivAccessibility divAccessibility, Expression expression, Expression expression2, Expression expression3, List list, afk afkVar, Expression expression4, List list2, DivBorder divBorder, List list3, Expression expression5, List list4, String str, List list5, List list6, List list7, DivFocus divFocus, List list8, DivSize divSize, String str2, DivLayoutProvider divLayoutProvider, DivEdgeInsets divEdgeInsets, Expression expression6, DivEdgeInsets divEdgeInsets2, List list9, Expression expression7, Expression expression8, Expression expression9, Expression expression10, Expression expression11, List list10, Expression expression12, Expression expression13, Expression expression14, List list11, List list12, DivTransform divTransform, List list13, DivChangeTransition divChangeTransition, DivAppearanceTransition divAppearanceTransition, DivAppearanceTransition divAppearanceTransition2, List list14, List list15, List list16, List list17, Expression expression15, DivVisibilityAction divVisibilityAction, List list18, DivSize divSize2) {
        this.a = divAccessibility;
        this.b = expression;
        this.c = expression2;
        this.d = expression3;
        this.e = list;
        this.f = afkVar;
        this.g = expression4;
        this.h = list2;
        this.i = divBorder;
        this.j = list3;
        this.k = expression5;
        this.l = list4;
        this.m = str;
        this.n = list5;
        this.o = list6;
        this.p = list7;
        this.q = divFocus;
        this.r = list8;
        this.s = divSize;
        this.t = str2;
        this.u = divLayoutProvider;
        this.v = divEdgeInsets;
        this.w = expression6;
        this.x = divEdgeInsets2;
        this.y = list9;
        this.z = expression7;
        this.A = expression8;
        this.B = expression9;
        this.C = expression10;
        this.D = expression11;
        this.E = list10;
        this.F = expression12;
        this.G = expression13;
        this.H = expression14;
        this.I = list11;
        this.J = list12;
        this.K = divTransform;
        this.L = list13;
        this.M = divChangeTransition;
        this.N = divAppearanceTransition;
        this.O = divAppearanceTransition2;
        this.P = list14;
        this.Q = list15;
        this.R = list16;
        this.S = list17;
        this.T = expression15;
        this.U = divVisibilityAction;
        this.V = list18;
        this.W = divSize2;
    }

    public static ynl B(ynl ynlVar, String str) {
        DivAccessibility divAccessibility = ynlVar.a;
        Expression expression = ynlVar.b;
        Expression expression2 = ynlVar.c;
        Expression expression3 = ynlVar.d;
        List list = ynlVar.e;
        afk afkVar = ynlVar.f;
        Expression expression4 = ynlVar.g;
        List list2 = ynlVar.h;
        DivBorder divBorder = ynlVar.i;
        List list3 = ynlVar.j;
        Expression expression5 = ynlVar.k;
        List list4 = ynlVar.l;
        String str2 = ynlVar.m;
        List list5 = ynlVar.n;
        List list6 = ynlVar.o;
        List list7 = ynlVar.p;
        DivFocus divFocus = ynlVar.q;
        List list8 = ynlVar.r;
        DivSize divSize = ynlVar.s;
        DivLayoutProvider divLayoutProvider = ynlVar.u;
        DivEdgeInsets divEdgeInsets = ynlVar.v;
        Expression expression6 = ynlVar.w;
        DivEdgeInsets divEdgeInsets2 = ynlVar.x;
        List list9 = ynlVar.y;
        Expression expression7 = ynlVar.z;
        Expression expression8 = ynlVar.A;
        Expression expression9 = ynlVar.B;
        Expression expression10 = ynlVar.C;
        Expression expression11 = ynlVar.D;
        List list10 = ynlVar.E;
        Expression expression12 = ynlVar.F;
        Expression expression13 = ynlVar.G;
        Expression expression14 = ynlVar.H;
        List list11 = ynlVar.I;
        List list12 = ynlVar.J;
        DivTransform divTransform = ynlVar.K;
        List list13 = ynlVar.L;
        DivChangeTransition divChangeTransition = ynlVar.M;
        DivAppearanceTransition divAppearanceTransition = ynlVar.N;
        DivAppearanceTransition divAppearanceTransition2 = ynlVar.O;
        List list14 = ynlVar.P;
        List list15 = ynlVar.Q;
        List list16 = ynlVar.R;
        List list17 = ynlVar.S;
        Expression expression15 = ynlVar.T;
        DivVisibilityAction divVisibilityAction = ynlVar.U;
        List list18 = ynlVar.V;
        DivSize divSize2 = ynlVar.W;
        ynlVar.getClass();
        return new ynl(divAccessibility, expression, expression2, expression3, list, afkVar, expression4, list2, divBorder, list3, expression5, list4, str2, list5, list6, list7, divFocus, list8, divSize, str, divLayoutProvider, divEdgeInsets, expression6, divEdgeInsets2, list9, expression7, expression8, expression9, expression10, expression11, list10, expression12, expression13, expression14, list11, list12, divTransform, list13, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, list14, list15, list16, list17, expression15, divVisibilityAction, list18, divSize2);
    }

    @Override // defpackage.egk
    public final DivBorder A() {
        return this.i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:508:0x0693, code lost:
    
        if (r7 == null) goto L473;
     */
    /* JADX WARN: Code restructure failed: missing block: B:509:0x0650, code lost:
    
        if (r7 == null) goto L454;
     */
    /* JADX WARN: Code restructure failed: missing block: B:510:0x060d, code lost:
    
        if (r7 == null) goto L435;
     */
    /* JADX WARN: Code restructure failed: missing block: B:520:0x059a, code lost:
    
        if (r7 == null) goto L396;
     */
    /* JADX WARN: Code restructure failed: missing block: B:524:0x0545, code lost:
    
        if (r7 == null) goto L370;
     */
    /* JADX WARN: Code restructure failed: missing block: B:525:0x0502, code lost:
    
        if (r7 == null) goto L351;
     */
    /* JADX WARN: Code restructure failed: missing block: B:530:0x0475, code lost:
    
        if (r7 == null) goto L310;
     */
    /* JADX WARN: Code restructure failed: missing block: B:535:0x03a6, code lost:
    
        if (r7 == null) goto L265;
     */
    /* JADX WARN: Code restructure failed: missing block: B:545:0x02ff, code lost:
    
        if (r7 == null) goto L219;
     */
    /* JADX WARN: Code restructure failed: missing block: B:549:0x02aa, code lost:
    
        if (r7 == null) goto L193;
     */
    /* JADX WARN: Code restructure failed: missing block: B:550:0x0267, code lost:
    
        if (r7 == null) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:551:0x0224, code lost:
    
        if (r7 == null) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:552:0x01d7, code lost:
    
        if (r7 == null) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:555:0x0176, code lost:
    
        if (r7 == null) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:559:0x0121, code lost:
    
        if (r7 == null) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:563:0x00b2, code lost:
    
        if (r7 == null) goto L51;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v70 */
    /* JADX WARN: Type inference failed for: r8v71, types: [int] */
    /* JADX WARN: Type inference failed for: r8v75 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean C(ynl ynlVar, rvo rvoVar, rvo rvoVar2) {
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (ynlVar != null) {
            DivAccessibility divAccessibility = ynlVar.a;
            DivAccessibility divAccessibility2 = this.a;
            if (divAccessibility2 != null ? divAccessibility2.a(divAccessibility, rvoVar, rvoVar2) : divAccessibility == null) {
                Expression expression = this.b;
                DivAlignmentHorizontal divAlignmentHorizontal = expression != null ? (DivAlignmentHorizontal) expression.a(rvoVar) : null;
                Expression expression2 = ynlVar.b;
                if (divAlignmentHorizontal == (expression2 != null ? (DivAlignmentHorizontal) expression2.a(rvoVar2) : null)) {
                    Expression expression3 = this.c;
                    DivAlignmentVertical divAlignmentVertical = expression3 != null ? (DivAlignmentVertical) expression3.a(rvoVar) : null;
                    Expression expression4 = ynlVar.c;
                    if (divAlignmentVertical == (expression4 != null ? (DivAlignmentVertical) expression4.a(rvoVar2) : null) && ((Number) this.d.a(rvoVar)).doubleValue() == ((Number) ynlVar.d.a(rvoVar2)).doubleValue()) {
                        List list = ynlVar.e;
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
                                afk afkVar = ynlVar.f;
                                afk afkVar2 = this.f;
                                if ((afkVar2 != null ? afkVar2.a(afkVar, rvoVar, rvoVar2) : afkVar == null) && ((Boolean) this.g.a(rvoVar)).booleanValue() == ((Boolean) ynlVar.g.a(rvoVar2)).booleanValue()) {
                                    List list3 = ynlVar.h;
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
                                                if (!((kfk) obj2).a((kfk) list3.get(i3), rvoVar, rvoVar2)) {
                                                    break;
                                                }
                                                i3 = i4;
                                            }
                                            DivBorder divBorder = ynlVar.i;
                                            DivBorder divBorder2 = this.i;
                                            if (divBorder2 != null ? divBorder2.a(divBorder, rvoVar, rvoVar2) : divBorder == null) {
                                                List list5 = ynlVar.j;
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
                                                            if (!((v3k) obj3).a((v3k) list5.get(i5), rvoVar, rvoVar2)) {
                                                                break;
                                                            }
                                                            i5 = i6;
                                                        }
                                                        Expression expression5 = this.k;
                                                        Long l = expression5 != null ? (Long) expression5.a(rvoVar) : null;
                                                        Expression expression6 = ynlVar.k;
                                                        if (jl40.l(l, expression6 != null ? (Long) expression6.a(rvoVar2) : null)) {
                                                            List list7 = ynlVar.l;
                                                            List list8 = this.l;
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
                                                                    if (jl40.l(this.m, ynlVar.m)) {
                                                                        List list9 = ynlVar.n;
                                                                        List list10 = this.n;
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
                                                                                List list11 = ynlVar.o;
                                                                                List list12 = this.o;
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
                                                                                        List list13 = ynlVar.p;
                                                                                        List list14 = this.p;
                                                                                        if (list14 != null) {
                                                                                            if (list13 != null && list14.size() == list13.size()) {
                                                                                                int i13 = 0;
                                                                                                for (Object obj7 : list14) {
                                                                                                    int i14 = i13 + 1;
                                                                                                    if (i13 < 0) {
                                                                                                        scc.m();
                                                                                                        throw null;
                                                                                                    }
                                                                                                    if (!((v3k) obj7).a((v3k) list13.get(i13), rvoVar, rvoVar2)) {
                                                                                                        break;
                                                                                                    }
                                                                                                    i13 = i14;
                                                                                                }
                                                                                                DivFocus divFocus = ynlVar.q;
                                                                                                DivFocus divFocus2 = this.q;
                                                                                                if (divFocus2 != null ? divFocus2.a(divFocus, rvoVar, rvoVar2) : divFocus == null) {
                                                                                                    List list15 = ynlVar.r;
                                                                                                    List list16 = this.r;
                                                                                                    if (list16 != null) {
                                                                                                        if (list15 != null && list16.size() == list15.size()) {
                                                                                                            int i15 = 0;
                                                                                                            for (Object obj8 : list16) {
                                                                                                                int i16 = i15 + 1;
                                                                                                                if (i15 < 0) {
                                                                                                                    scc.m();
                                                                                                                    throw null;
                                                                                                                }
                                                                                                                if (!((irk) obj8).a((irk) list15.get(i15))) {
                                                                                                                    break;
                                                                                                                }
                                                                                                                i15 = i16;
                                                                                                            }
                                                                                                            if (this.s.a(ynlVar.s, rvoVar, rvoVar2) && jl40.l(this.t, ynlVar.t)) {
                                                                                                                DivLayoutProvider divLayoutProvider = ynlVar.u;
                                                                                                                DivLayoutProvider divLayoutProvider2 = this.u;
                                                                                                                if (divLayoutProvider2 != null ? divLayoutProvider2.a(divLayoutProvider) : divLayoutProvider == null) {
                                                                                                                    DivEdgeInsets divEdgeInsets = ynlVar.v;
                                                                                                                    DivEdgeInsets divEdgeInsets2 = this.v;
                                                                                                                    if ((divEdgeInsets2 != null ? divEdgeInsets2.a(divEdgeInsets, rvoVar, rvoVar2) : divEdgeInsets == null) && ((Boolean) this.w.a(rvoVar)).booleanValue() == ((Boolean) ynlVar.w.a(rvoVar2)).booleanValue()) {
                                                                                                                        DivEdgeInsets divEdgeInsets3 = ynlVar.x;
                                                                                                                        DivEdgeInsets divEdgeInsets4 = this.x;
                                                                                                                        if (divEdgeInsets4 != null ? divEdgeInsets4.a(divEdgeInsets3, rvoVar, rvoVar2) : divEdgeInsets3 == null) {
                                                                                                                            List list17 = ynlVar.y;
                                                                                                                            List list18 = this.y;
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
                                                                                                                                    if (((Number) this.z.a(rvoVar)).doubleValue() == ((Number) ynlVar.z.a(rvoVar2)).doubleValue()) {
                                                                                                                                        Expression expression7 = this.A;
                                                                                                                                        JSONObject jSONObject = expression7 != null ? (JSONObject) expression7.a(rvoVar) : null;
                                                                                                                                        Expression expression8 = ynlVar.A;
                                                                                                                                        if (jl40.l(jSONObject, expression8 != null ? (JSONObject) expression8.a(rvoVar2) : null) && ((Boolean) this.B.a(rvoVar)).booleanValue() == ((Boolean) ynlVar.B.a(rvoVar2)).booleanValue()) {
                                                                                                                                            Expression expression9 = this.C;
                                                                                                                                            String str = expression9 != null ? (String) expression9.a(rvoVar) : null;
                                                                                                                                            Expression expression10 = ynlVar.C;
                                                                                                                                            if (jl40.l(str, expression10 != null ? (String) expression10.a(rvoVar2) : null) && ((Boolean) this.D.a(rvoVar)).booleanValue() == ((Boolean) ynlVar.D.a(rvoVar2)).booleanValue()) {
                                                                                                                                                List list19 = ynlVar.E;
                                                                                                                                                List list20 = this.E;
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
                                                                                                                                                        Expression expression11 = this.F;
                                                                                                                                                        String str2 = expression11 != null ? (String) expression11.a(rvoVar) : null;
                                                                                                                                                        Expression expression12 = ynlVar.F;
                                                                                                                                                        if (jl40.l(str2, expression12 != null ? (String) expression12.a(rvoVar2) : null)) {
                                                                                                                                                            Expression expression13 = this.G;
                                                                                                                                                            Long l2 = expression13 != null ? (Long) expression13.a(rvoVar) : null;
                                                                                                                                                            Expression expression14 = ynlVar.G;
                                                                                                                                                            if (jl40.l(l2, expression14 != null ? (Long) expression14.a(rvoVar2) : null) && this.H.a(rvoVar) == ynlVar.H.a(rvoVar2)) {
                                                                                                                                                                List list21 = ynlVar.I;
                                                                                                                                                                List list22 = this.I;
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
                                                                                                                                                                        List list23 = ynlVar.J;
                                                                                                                                                                        List list24 = this.J;
                                                                                                                                                                        if (list24 != null) {
                                                                                                                                                                            if (list23 != null && list24.size() == list23.size()) {
                                                                                                                                                                                int i23 = 0;
                                                                                                                                                                                for (Object obj12 : list24) {
                                                                                                                                                                                    int i24 = i23 + 1;
                                                                                                                                                                                    if (i23 < 0) {
                                                                                                                                                                                        scc.m();
                                                                                                                                                                                        throw null;
                                                                                                                                                                                    }
                                                                                                                                                                                    if (!((gil) obj12).a((gil) list23.get(i23), rvoVar, rvoVar2)) {
                                                                                                                                                                                        break;
                                                                                                                                                                                    }
                                                                                                                                                                                    i23 = i24;
                                                                                                                                                                                }
                                                                                                                                                                                DivTransform divTransform = ynlVar.K;
                                                                                                                                                                                DivTransform divTransform2 = this.K;
                                                                                                                                                                                if (divTransform2 != null ? divTransform2.a(divTransform, rvoVar, rvoVar2) : divTransform == null) {
                                                                                                                                                                                    List list25 = ynlVar.L;
                                                                                                                                                                                    List list26 = this.L;
                                                                                                                                                                                    if (list26 != null) {
                                                                                                                                                                                        if (list25 != null && list26.size() == list25.size()) {
                                                                                                                                                                                            int i25 = 0;
                                                                                                                                                                                            for (Object obj13 : list26) {
                                                                                                                                                                                                int i26 = i25 + 1;
                                                                                                                                                                                                if (i25 < 0) {
                                                                                                                                                                                                    scc.m();
                                                                                                                                                                                                    throw null;
                                                                                                                                                                                                }
                                                                                                                                                                                                if (!((xjl) obj13).a((xjl) list25.get(i25), rvoVar, rvoVar2)) {
                                                                                                                                                                                                    break;
                                                                                                                                                                                                }
                                                                                                                                                                                                i25 = i26;
                                                                                                                                                                                            }
                                                                                                                                                                                            DivChangeTransition divChangeTransition = ynlVar.M;
                                                                                                                                                                                            DivChangeTransition divChangeTransition2 = this.M;
                                                                                                                                                                                            if (divChangeTransition2 != null ? divChangeTransition2.a(divChangeTransition, rvoVar, rvoVar2) : divChangeTransition == null) {
                                                                                                                                                                                                DivAppearanceTransition divAppearanceTransition = ynlVar.N;
                                                                                                                                                                                                DivAppearanceTransition divAppearanceTransition2 = this.N;
                                                                                                                                                                                                if (divAppearanceTransition2 != null ? divAppearanceTransition2.a(divAppearanceTransition, rvoVar, rvoVar2) : divAppearanceTransition == null) {
                                                                                                                                                                                                    DivAppearanceTransition divAppearanceTransition3 = ynlVar.O;
                                                                                                                                                                                                    DivAppearanceTransition divAppearanceTransition4 = this.O;
                                                                                                                                                                                                    if (divAppearanceTransition4 != null ? divAppearanceTransition4.a(divAppearanceTransition3, rvoVar, rvoVar2) : divAppearanceTransition3 == null) {
                                                                                                                                                                                                        List list27 = ynlVar.P;
                                                                                                                                                                                                        List list28 = this.P;
                                                                                                                                                                                                        if (list28 != null) {
                                                                                                                                                                                                            if (list27 != null && list28.size() == list27.size()) {
                                                                                                                                                                                                                int i27 = 0;
                                                                                                                                                                                                                for (Object obj14 : list28) {
                                                                                                                                                                                                                    int i28 = i27 + 1;
                                                                                                                                                                                                                    if (i27 < 0) {
                                                                                                                                                                                                                        scc.m();
                                                                                                                                                                                                                        throw null;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    if (((DivTransitionTrigger) obj14) != ((DivTransitionTrigger) list27.get(i27))) {
                                                                                                                                                                                                                        break;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    i27 = i28;
                                                                                                                                                                                                                }
                                                                                                                                                                                                                List list29 = ynlVar.Q;
                                                                                                                                                                                                                List list30 = this.Q;
                                                                                                                                                                                                                if (list30 != null) {
                                                                                                                                                                                                                    if (list29 != null && list30.size() == list29.size()) {
                                                                                                                                                                                                                        int i29 = 0;
                                                                                                                                                                                                                        for (Object obj15 : list30) {
                                                                                                                                                                                                                            int i30 = i29 + 1;
                                                                                                                                                                                                                            if (i29 < 0) {
                                                                                                                                                                                                                                scc.m();
                                                                                                                                                                                                                                throw null;
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            if (!((lll) obj15).a((lll) list29.get(i29), rvoVar, rvoVar2)) {
                                                                                                                                                                                                                                break;
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            i29 = i30;
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                        List list31 = ynlVar.R;
                                                                                                                                                                                                                        List list32 = this.R;
                                                                                                                                                                                                                        if (list32 != null) {
                                                                                                                                                                                                                            if (list31 != null && list32.size() == list31.size()) {
                                                                                                                                                                                                                                int i31 = 0;
                                                                                                                                                                                                                                for (Object obj16 : list32) {
                                                                                                                                                                                                                                    int i32 = i31 + 1;
                                                                                                                                                                                                                                    if (i31 < 0) {
                                                                                                                                                                                                                                        scc.m();
                                                                                                                                                                                                                                        throw null;
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                    if (!((c3) obj16).a((c3) list31.get(i31), rvoVar, rvoVar2)) {
                                                                                                                                                                                                                                        break;
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                    i31 = i32;
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                List list33 = ynlVar.S;
                                                                                                                                                                                                                                List list34 = this.S;
                                                                                                                                                                                                                                if (list34 == null) {
                                                                                                                                                                                                                                    z = false;
                                                                                                                                                                                                                                    if (list33 != null) {
                                                                                                                                                                                                                                        return false;
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                } else if (list33 != null && list34.size() == list33.size()) {
                                                                                                                                                                                                                                    int i33 = 0;
                                                                                                                                                                                                                                    for (Object obj17 : list34) {
                                                                                                                                                                                                                                        int i34 = i33 + 1;
                                                                                                                                                                                                                                        if (i33 < 0) {
                                                                                                                                                                                                                                            scc.m();
                                                                                                                                                                                                                                            throw null;
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                        iol iolVar = (iol) list33.get(i33);
                                                                                                                                                                                                                                        iol iolVar2 = (iol) obj17;
                                                                                                                                                                                                                                        if (iolVar == null) {
                                                                                                                                                                                                                                            iolVar2.getClass();
                                                                                                                                                                                                                                            return z3;
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                        Expression expression15 = iolVar2.a;
                                                                                                                                                                                                                                        Long l3 = expression15 != null ? (Long) expression15.a(rvoVar) : null;
                                                                                                                                                                                                                                        Expression expression16 = iolVar.a;
                                                                                                                                                                                                                                        if (jl40.l(l3, expression16 != null ? (Long) expression16.a(rvoVar2) : null) && jl40.l(iolVar2.b.a(rvoVar), iolVar.b.a(rvoVar2))) {
                                                                                                                                                                                                                                            hol holVar = iolVar2.c;
                                                                                                                                                                                                                                            hol holVar2 = iolVar.c;
                                                                                                                                                                                                                                            if (holVar == null) {
                                                                                                                                                                                                                                                z2 = z3;
                                                                                                                                                                                                                                                if (holVar2 != null) {
                                                                                                                                                                                                                                                    return z2;
                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                            } else if (holVar2 != null) {
                                                                                                                                                                                                                                                z2 = z3;
                                                                                                                                                                                                                                                if (((Number) holVar.a.a(rvoVar)).longValue() != ((Number) holVar2.a.a(rvoVar2)).longValue() || ((Number) holVar.b.a(rvoVar)).longValue() != ((Number) holVar2.b.a(rvoVar2)).longValue()) {
                                                                                                                                                                                                                                                    return z2;
                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                            if (!jl40.l(iolVar2.d.a(rvoVar), iolVar.d.a(rvoVar2))) {
                                                                                                                                                                                                                                                return z2;
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                            i33 = i34;
                                                                                                                                                                                                                                            z3 = z2;
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                    z = z3;
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                if (this.T.a(rvoVar) != ynlVar.T.a(rvoVar2)) {
                                                                                                                                                                                                                                    return z;
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                DivVisibilityAction divVisibilityAction = ynlVar.U;
                                                                                                                                                                                                                                DivVisibilityAction divVisibilityAction2 = this.U;
                                                                                                                                                                                                                                if (!(divVisibilityAction2 != null ? divVisibilityAction2.f(divVisibilityAction, rvoVar, rvoVar2) : divVisibilityAction == null ? true : z)) {
                                                                                                                                                                                                                                    return z;
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                ?? r4 = ynlVar.V;
                                                                                                                                                                                                                                List list35 = this.V;
                                                                                                                                                                                                                                if (list35 != null) {
                                                                                                                                                                                                                                    if (r4 == 0 || list35.size() != r4.size()) {
                                                                                                                                                                                                                                        return z;
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                    ?? r8 = z;
                                                                                                                                                                                                                                    for (Object obj18 : list35) {
                                                                                                                                                                                                                                        int i35 = r8 + 1;
                                                                                                                                                                                                                                        if (r8 < 0) {
                                                                                                                                                                                                                                            scc.m();
                                                                                                                                                                                                                                            throw null;
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                        if (!((DivVisibilityAction) obj18).f((DivVisibilityAction) r4.get(r8), rvoVar, rvoVar2)) {
                                                                                                                                                                                                                                            return z;
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                        r8 = i35;
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                } else if (r4 != 0) {
                                                                                                                                                                                                                                    return z;
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                if (this.W.a(ynlVar.W, rvoVar, rvoVar2)) {
                                                                                                                                                                                                                                    return true;
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                return z;
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
        return z3;
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
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        Integer num = this.X;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = qoi0.a(ynl.class).hashCode();
        int i19 = 0;
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
        int i20 = hashCode3 + i;
        afk afkVar = this.f;
        int hashCode4 = this.g.hashCode() + i20 + (afkVar != null ? afkVar.b() : 0);
        List list2 = this.h;
        if (list2 != null) {
            Iterator it2 = list2.iterator();
            i2 = 0;
            while (it2.hasNext()) {
                i2 += ((kfk) it2.next()).b();
            }
        } else {
            i2 = 0;
        }
        int i21 = hashCode4 + i2;
        DivBorder divBorder = this.i;
        int b2 = i21 + (divBorder != null ? divBorder.b() : 0);
        List list3 = this.j;
        if (list3 != null) {
            Iterator it3 = list3.iterator();
            i3 = 0;
            while (it3.hasNext()) {
                i3 += ((v3k) it3.next()).b();
            }
        } else {
            i3 = 0;
        }
        int i22 = b2 + i3;
        Expression expression3 = this.k;
        int hashCode5 = i22 + (expression3 != null ? expression3.hashCode() : 0);
        List list4 = this.l;
        if (list4 != null) {
            Iterator it4 = list4.iterator();
            i4 = 0;
            while (it4.hasNext()) {
                i4 += ((nnk) it4.next()).g();
            }
        } else {
            i4 = 0;
        }
        int i23 = hashCode5 + i4;
        String str = this.m;
        int hashCode6 = i23 + (str != null ? str.hashCode() : 0);
        List list5 = this.n;
        if (list5 != null) {
            Iterator it5 = list5.iterator();
            i5 = 0;
            while (it5.hasNext()) {
                i5 += ((v3k) it5.next()).b();
            }
        } else {
            i5 = 0;
        }
        int i24 = hashCode6 + i5;
        List list6 = this.o;
        if (list6 != null) {
            Iterator it6 = list6.iterator();
            i6 = 0;
            while (it6.hasNext()) {
                i6 += ((bpk) it6.next()).b();
            }
        } else {
            i6 = 0;
        }
        int i25 = i24 + i6;
        List list7 = this.p;
        if (list7 != null) {
            Iterator it7 = list7.iterator();
            i7 = 0;
            while (it7.hasNext()) {
                i7 += ((v3k) it7.next()).b();
            }
        } else {
            i7 = 0;
        }
        int i26 = i25 + i7;
        DivFocus divFocus = this.q;
        int b3 = i26 + (divFocus != null ? divFocus.b() : 0);
        List list8 = this.r;
        if (list8 != null) {
            Iterator it8 = list8.iterator();
            i8 = 0;
            while (it8.hasNext()) {
                i8 += ((irk) it8.next()).b();
            }
        } else {
            i8 = 0;
        }
        int b4 = this.s.b() + b3 + i8;
        String str2 = this.t;
        int hashCode7 = b4 + (str2 != null ? str2.hashCode() : 0);
        DivLayoutProvider divLayoutProvider = this.u;
        int b5 = hashCode7 + (divLayoutProvider != null ? divLayoutProvider.b() : 0);
        DivEdgeInsets divEdgeInsets = this.v;
        int hashCode8 = this.w.hashCode() + b5 + (divEdgeInsets != null ? divEdgeInsets.b() : 0);
        DivEdgeInsets divEdgeInsets2 = this.x;
        int b6 = hashCode8 + (divEdgeInsets2 != null ? divEdgeInsets2.b() : 0);
        List list9 = this.y;
        if (list9 != null) {
            Iterator it9 = list9.iterator();
            i9 = 0;
            while (it9.hasNext()) {
                i9 += ((v3k) it9.next()).b();
            }
        } else {
            i9 = 0;
        }
        int hashCode9 = this.z.hashCode() + b6 + i9;
        Expression expression4 = this.A;
        int hashCode10 = this.B.hashCode() + hashCode9 + (expression4 != null ? expression4.hashCode() : 0);
        Expression expression5 = this.C;
        int hashCode11 = this.D.hashCode() + hashCode10 + (expression5 != null ? expression5.hashCode() : 0);
        List list10 = this.E;
        if (list10 != null) {
            Iterator it10 = list10.iterator();
            i10 = 0;
            while (it10.hasNext()) {
                i10 += ((v3k) it10.next()).b();
            }
        } else {
            i10 = 0;
        }
        int i27 = hashCode11 + i10;
        Expression expression6 = this.F;
        int hashCode12 = i27 + (expression6 != null ? expression6.hashCode() : 0);
        Expression expression7 = this.G;
        int hashCode13 = this.H.hashCode() + hashCode12 + (expression7 != null ? expression7.hashCode() : 0);
        List list11 = this.I;
        if (list11 != null) {
            Iterator it11 = list11.iterator();
            i11 = 0;
            while (it11.hasNext()) {
                i11 += ((v3k) it11.next()).b();
            }
        } else {
            i11 = 0;
        }
        int i28 = hashCode13 + i11;
        List list12 = this.J;
        if (list12 != null) {
            Iterator it12 = list12.iterator();
            i12 = 0;
            while (it12.hasNext()) {
                i12 += ((gil) it12.next()).b();
            }
        } else {
            i12 = 0;
        }
        int i29 = i28 + i12;
        DivTransform divTransform = this.K;
        int b7 = i29 + (divTransform != null ? divTransform.b() : 0);
        List list13 = this.L;
        if (list13 != null) {
            Iterator it13 = list13.iterator();
            i13 = 0;
            while (it13.hasNext()) {
                i13 += ((xjl) it13.next()).b();
            }
        } else {
            i13 = 0;
        }
        int i30 = b7 + i13;
        DivChangeTransition divChangeTransition = this.M;
        int b8 = i30 + (divChangeTransition != null ? divChangeTransition.b() : 0);
        DivAppearanceTransition divAppearanceTransition = this.N;
        int b9 = b8 + (divAppearanceTransition != null ? divAppearanceTransition.b() : 0);
        DivAppearanceTransition divAppearanceTransition2 = this.O;
        int b10 = b9 + (divAppearanceTransition2 != null ? divAppearanceTransition2.b() : 0);
        List list14 = this.P;
        int hashCode14 = b10 + (list14 != null ? list14.hashCode() : 0);
        List list15 = this.Q;
        if (list15 != null) {
            Iterator it14 = list15.iterator();
            i14 = 0;
            while (it14.hasNext()) {
                i14 += ((lll) it14.next()).b();
            }
        } else {
            i14 = 0;
        }
        int i31 = hashCode14 + i14;
        List list16 = this.R;
        if (list16 != null) {
            Iterator it15 = list16.iterator();
            i15 = 0;
            while (it15.hasNext()) {
                i15 += ((c3) it15.next()).b();
            }
        } else {
            i15 = 0;
        }
        int i32 = i31 + i15;
        List<iol> list17 = this.S;
        if (list17 != null) {
            i16 = 0;
            for (iol iolVar : list17) {
                Integer num2 = iolVar.e;
                if (num2 != null) {
                    i18 = num2.intValue();
                } else {
                    int hashCode15 = qoi0.a(iol.class).hashCode();
                    Expression expression8 = iolVar.a;
                    int hashCode16 = iolVar.b.hashCode() + hashCode15 + (expression8 != null ? expression8.hashCode() : 0);
                    hol holVar = iolVar.c;
                    if (holVar != null) {
                        Integer num3 = holVar.c;
                        if (num3 != null) {
                            i17 = num3.intValue();
                        } else {
                            int hashCode17 = holVar.b.hashCode() + holVar.a.hashCode() + qoi0.a(hol.class).hashCode();
                            holVar.c = Integer.valueOf(hashCode17);
                            i17 = hashCode17;
                        }
                    } else {
                        i17 = 0;
                    }
                    int hashCode18 = iolVar.d.hashCode() + hashCode16 + i17;
                    iolVar.e = Integer.valueOf(hashCode18);
                    i18 = hashCode18;
                }
                i16 += i18;
            }
        } else {
            i16 = 0;
        }
        int hashCode19 = this.T.hashCode() + i32 + i16;
        DivVisibilityAction divVisibilityAction = this.U;
        int g = hashCode19 + (divVisibilityAction != null ? divVisibilityAction.g() : 0);
        List list18 = this.V;
        if (list18 != null) {
            Iterator it16 = list18.iterator();
            while (it16.hasNext()) {
                i19 += ((DivVisibilityAction) it16.next()).g();
            }
        }
        int b11 = this.W.b() + g + i19;
        this.X = Integer.valueOf(b11);
        return b11;
    }

    @Override // defpackage.egk
    public final Expression a() {
        return this.d;
    }

    @Override // defpackage.egk
    public final List b() {
        return this.V;
    }

    @Override // defpackage.egk
    public final Expression c() {
        return this.k;
    }

    @Override // defpackage.egk
    public final List d() {
        return this.R;
    }

    @Override // defpackage.egk
    public final DivEdgeInsets e() {
        return this.v;
    }

    @Override // defpackage.egk
    public final Expression f() {
        return this.G;
    }

    @Override // defpackage.egk
    public final Expression g() {
        return this.F;
    }

    @Override // defpackage.egk
    public final List getBackground() {
        return this.h;
    }

    @Override // defpackage.egk
    public final List getExtensions() {
        return this.o;
    }

    @Override // defpackage.egk
    public final DivSize getHeight() {
        return this.s;
    }

    @Override // defpackage.egk
    public final String getId() {
        return this.t;
    }

    @Override // defpackage.egk
    public final Expression getVisibility() {
        return this.T;
    }

    @Override // defpackage.egk
    public final DivSize getWidth() {
        return this.W;
    }

    @Override // defpackage.egk
    public final Expression h() {
        return this.b;
    }

    @Override // defpackage.egk
    public final List i() {
        return this.J;
    }

    @Override // defpackage.egk
    public final DivAppearanceTransition j() {
        return this.O;
    }

    @Override // defpackage.egk
    public final DivChangeTransition k() {
        return this.M;
    }

    @Override // defpackage.egk
    public final List l() {
        return this.l;
    }

    @Override // defpackage.egk
    public final DivTransform m() {
        return this.K;
    }

    @Override // defpackage.egk
    public final List n() {
        return this.P;
    }

    @Override // defpackage.egk
    public final Expression o() {
        return this.c;
    }

    @Override // defpackage.egk
    public final DivFocus p() {
        return this.q;
    }

    @Override // defpackage.egk
    public final DivAccessibility q() {
        return this.a;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        return ((col) ft6.b.O9.getValue()).b(ft6.a, this);
    }

    @Override // defpackage.egk
    public final DivEdgeInsets s() {
        return this.x;
    }

    @Override // defpackage.egk
    public final List t() {
        return this.I;
    }

    @Override // defpackage.egk
    public final DivLayoutProvider u() {
        return this.u;
    }

    @Override // defpackage.egk
    public final List v() {
        return this.Q;
    }

    @Override // defpackage.egk
    public final DivVisibilityAction w() {
        return this.U;
    }

    @Override // defpackage.egk
    public final List x() {
        return this.r;
    }

    @Override // defpackage.egk
    public final DivAppearanceTransition y() {
        return this.N;
    }

    @Override // defpackage.egk
    public final List z() {
        return this.e;
    }

    public ynl() {
        this(null, null, null, Y, null, null, Z, null, null, null, null, null, null, null, null, null, null, null, a0, null, null, null, b0, null, null, c0, null, d0, null, e0, null, null, null, f0, null, null, null, null, null, null, null, null, null, null, null, g0, null, null, h0);
    }
}
