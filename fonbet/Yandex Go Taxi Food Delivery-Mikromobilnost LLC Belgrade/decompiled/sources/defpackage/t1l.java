package defpackage;

import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivAccessibility;
import com.yandex.div2.DivAlignmentHorizontal;
import com.yandex.div2.DivAlignmentVertical;
import com.yandex.div2.DivAppearanceTransition;
import com.yandex.div2.DivBorder;
import com.yandex.div2.DivChangeTransition;
import com.yandex.div2.DivCollectionItemBuilder;
import com.yandex.div2.DivEdgeInsets;
import com.yandex.div2.DivFocus;
import com.yandex.div2.DivLayoutProvider;
import com.yandex.div2.DivPager$ItemAlignment;
import com.yandex.div2.DivPager$Orientation;
import com.yandex.div2.DivSize;
import com.yandex.div2.DivTransform;
import com.yandex.div2.DivVisibility;
import com.yandex.div2.DivVisibilityAction;
import com.yandex.div2.c3;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class t1l implements c4x, egk {
    public final Expression A;
    public final Expression B;
    public final Expression C;
    public final Expression D;
    public final List E;
    public final List F;
    public final DivTransform G;
    public final List H;
    public final DivChangeTransition I;
    public final DivAppearanceTransition J;
    public final DivAppearanceTransition K;
    public final List L;
    public final List M;
    public final List N;
    public final Expression O;
    public final DivVisibilityAction P;
    public final List Q;
    public final DivSize R;
    public Integer S;
    public Integer T;
    public final DivAccessibility a;
    public final Expression b;
    public final Expression c;
    public final Expression d;
    public final List e;
    public final List f;
    public final DivBorder g;
    public final Expression h;
    public final Expression i;
    public final Expression j;
    public final List k;
    public final List l;
    public final DivFocus m;
    public final List n;
    public final DivSize o;
    public final String p;
    public final Expression q;
    public final DivCollectionItemBuilder r;
    public final sqk s;
    public final List t;
    public final d2l u;
    public final DivLayoutProvider v;
    public final DivEdgeInsets w;
    public final Expression x;
    public final DivEdgeInsets y;
    public final a1l z;

    static {
        ngd0.m(Double.valueOf(1.0d));
        ngd0.m(DivPager$ItemAlignment.START);
        ngd0.m(0L);
        Boolean bool = Boolean.FALSE;
        ngd0.m(bool);
        ngd0.m(0L);
        ngd0.m(DivPager$Orientation.HORIZONTAL);
        ngd0.m(bool);
        ngd0.m(DivPager$ItemAlignment.CENTER);
        ngd0.m(DivVisibility.VISIBLE);
    }

    public t1l(DivAccessibility divAccessibility, Expression expression, Expression expression2, Expression expression3, List list, List list2, DivBorder divBorder, Expression expression4, Expression expression5, Expression expression6, List list3, List list4, DivFocus divFocus, List list5, DivSize divSize, String str, Expression expression7, DivCollectionItemBuilder divCollectionItemBuilder, sqk sqkVar, List list6, d2l d2lVar, DivLayoutProvider divLayoutProvider, DivEdgeInsets divEdgeInsets, Expression expression8, DivEdgeInsets divEdgeInsets2, a1l a1lVar, Expression expression9, Expression expression10, Expression expression11, Expression expression12, List list7, List list8, DivTransform divTransform, List list9, DivChangeTransition divChangeTransition, DivAppearanceTransition divAppearanceTransition, DivAppearanceTransition divAppearanceTransition2, List list10, List list11, List list12, Expression expression13, DivVisibilityAction divVisibilityAction, List list13, DivSize divSize2) {
        this.a = divAccessibility;
        this.b = expression;
        this.c = expression2;
        this.d = expression3;
        this.e = list;
        this.f = list2;
        this.g = divBorder;
        this.h = expression4;
        this.i = expression5;
        this.j = expression6;
        this.k = list3;
        this.l = list4;
        this.m = divFocus;
        this.n = list5;
        this.o = divSize;
        this.p = str;
        this.q = expression7;
        this.r = divCollectionItemBuilder;
        this.s = sqkVar;
        this.t = list6;
        this.u = d2lVar;
        this.v = divLayoutProvider;
        this.w = divEdgeInsets;
        this.x = expression8;
        this.y = divEdgeInsets2;
        this.z = a1lVar;
        this.A = expression9;
        this.B = expression10;
        this.C = expression11;
        this.D = expression12;
        this.E = list7;
        this.F = list8;
        this.G = divTransform;
        this.H = list9;
        this.I = divChangeTransition;
        this.J = divAppearanceTransition;
        this.K = divAppearanceTransition2;
        this.L = list10;
        this.M = list11;
        this.N = list12;
        this.O = expression13;
        this.P = divVisibilityAction;
        this.Q = list13;
        this.R = divSize2;
    }

    public static t1l B(t1l t1lVar, String str, List list, int i) {
        DivAccessibility divAccessibility;
        DivAccessibility divAccessibility2 = t1lVar.a;
        Expression expression = t1lVar.b;
        Expression expression2 = t1lVar.c;
        Expression expression3 = t1lVar.d;
        List list2 = t1lVar.e;
        List list3 = t1lVar.f;
        DivBorder divBorder = t1lVar.g;
        Expression expression4 = t1lVar.h;
        Expression expression5 = t1lVar.i;
        Expression expression6 = t1lVar.j;
        List list4 = t1lVar.k;
        List list5 = t1lVar.l;
        DivFocus divFocus = t1lVar.m;
        List list6 = t1lVar.n;
        DivSize divSize = t1lVar.o;
        if ((i & 32768) != 0) {
            divAccessibility = divAccessibility2;
            str = t1lVar.p;
        } else {
            divAccessibility = divAccessibility2;
        }
        Expression expression7 = t1lVar.q;
        DivCollectionItemBuilder divCollectionItemBuilder = t1lVar.r;
        sqk sqkVar = t1lVar.s;
        d2l d2lVar = t1lVar.u;
        DivLayoutProvider divLayoutProvider = t1lVar.v;
        DivEdgeInsets divEdgeInsets = t1lVar.w;
        Expression expression8 = t1lVar.x;
        DivEdgeInsets divEdgeInsets2 = t1lVar.y;
        a1l a1lVar = t1lVar.z;
        Expression expression9 = t1lVar.A;
        Expression expression10 = t1lVar.B;
        Expression expression11 = t1lVar.C;
        Expression expression12 = t1lVar.D;
        List list7 = t1lVar.E;
        List list8 = t1lVar.F;
        DivTransform divTransform = t1lVar.G;
        List list9 = t1lVar.H;
        DivChangeTransition divChangeTransition = t1lVar.I;
        DivAppearanceTransition divAppearanceTransition = t1lVar.J;
        DivAppearanceTransition divAppearanceTransition2 = t1lVar.K;
        List list10 = t1lVar.L;
        List list11 = t1lVar.M;
        List list12 = t1lVar.N;
        Expression expression13 = t1lVar.O;
        DivVisibilityAction divVisibilityAction = t1lVar.P;
        List list13 = t1lVar.Q;
        DivSize divSize2 = t1lVar.R;
        t1lVar.getClass();
        return new t1l(divAccessibility, expression, expression2, expression3, list2, list3, divBorder, expression4, expression5, expression6, list4, list5, divFocus, list6, divSize, str, expression7, divCollectionItemBuilder, sqkVar, list, d2lVar, divLayoutProvider, divEdgeInsets, expression8, divEdgeInsets2, a1lVar, expression9, expression10, expression11, expression12, list7, list8, divTransform, list9, divChangeTransition, divAppearanceTransition, divAppearanceTransition2, list10, list11, list12, expression13, divVisibilityAction, list13, divSize2);
    }

    @Override // defpackage.egk
    public final DivBorder A() {
        return this.g;
    }

    /* JADX WARN: Code restructure failed: missing block: B:200:0x040f, code lost:
    
        if (((java.lang.Number) r4.e.a(r11)).doubleValue() != ((java.lang.Number) r3.e.a(r12)).doubleValue()) goto L488;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x04e2, code lost:
    
        if (((java.lang.Boolean) r9.A.a(r11)).booleanValue() != ((java.lang.Boolean) r10.A.a(r12)).booleanValue()) goto L488;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x04e4, code lost:
    
        r3 = r9.B;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x04e6, code lost:
    
        if (r3 == null) goto L296;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x04e8, code lost:
    
        r3 = (java.lang.String) r3.a(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x04f0, code lost:
    
        r4 = r10.B;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x04f2, code lost:
    
        if (r4 == null) goto L300;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x04f4, code lost:
    
        r4 = (java.lang.String) r4.a(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x0500, code lost:
    
        if (defpackage.jl40.l(r3, r4) == false) goto L488;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x0502, code lost:
    
        r3 = r9.C;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x0504, code lost:
    
        if (r3 == null) goto L306;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x0506, code lost:
    
        r3 = (java.lang.Long) r3.a(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x050e, code lost:
    
        r4 = r10.C;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x0510, code lost:
    
        if (r4 == null) goto L310;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x0512, code lost:
    
        r4 = (java.lang.Long) r4.a(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x051e, code lost:
    
        if (defpackage.jl40.l(r3, r4) == false) goto L488;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x052c, code lost:
    
        if (r9.D.a(r11) != r10.D.a(r12)) goto L488;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x052e, code lost:
    
        r3 = r10.E;
        r4 = r9.E;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x0532, code lost:
    
        if (r4 == null) goto L333;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x0534, code lost:
    
        if (r3 != null) goto L319;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x0540, code lost:
    
        if (r4.size() == r3.size()) goto L322;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x0544, code lost:
    
        r4 = r4.iterator();
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x054f, code lost:
    
        if (r4.hasNext() == false) goto L509;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x0551, code lost:
    
        r6 = r4.next();
        r7 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x0557, code lost:
    
        if (r5 < 0) goto L508;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x0565, code lost:
    
        if (((defpackage.v3k) r6).a((defpackage.v3k) r3.get(r5), r11, r12) != false) goto L330;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x0569, code lost:
    
        r5 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x056b, code lost:
    
        defpackage.scc.m();
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x056e, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x0571, code lost:
    
        r3 = r10.F;
        r4 = r9.F;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x0575, code lost:
    
        if (r4 == null) goto L352;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x0577, code lost:
    
        if (r3 != null) goto L338;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x0583, code lost:
    
        if (r4.size() == r3.size()) goto L341;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x0587, code lost:
    
        r4 = r4.iterator();
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x0592, code lost:
    
        if (r4.hasNext() == false) goto L510;
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x0594, code lost:
    
        r6 = r4.next();
        r7 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x059a, code lost:
    
        if (r5 < 0) goto L512;
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x05a8, code lost:
    
        if (((defpackage.gil) r6).a((defpackage.gil) r3.get(r5), r11, r12) != false) goto L349;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x05ac, code lost:
    
        r5 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x05ae, code lost:
    
        defpackage.scc.m();
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x05b1, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x05b4, code lost:
    
        r3 = r10.G;
        r4 = r9.G;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x05b8, code lost:
    
        if (r4 == null) goto L356;
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x05ba, code lost:
    
        r3 = r4.a(r3, r11, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x05c4, code lost:
    
        if (r3 == false) goto L488;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x05c6, code lost:
    
        r3 = r10.H;
        r4 = r9.H;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x05ca, code lost:
    
        if (r4 == null) goto L378;
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x05cc, code lost:
    
        if (r3 != null) goto L364;
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x05d8, code lost:
    
        if (r4.size() == r3.size()) goto L367;
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x05dc, code lost:
    
        r4 = r4.iterator();
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x05e7, code lost:
    
        if (r4.hasNext() == false) goto L513;
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x05e9, code lost:
    
        r6 = r4.next();
        r7 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x05ef, code lost:
    
        if (r5 < 0) goto L515;
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x05fd, code lost:
    
        if (((defpackage.xjl) r6).a((defpackage.xjl) r3.get(r5), r11, r12) != false) goto L375;
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x0601, code lost:
    
        r5 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:276:0x0603, code lost:
    
        defpackage.scc.m();
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x0606, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x0609, code lost:
    
        r3 = r10.I;
        r4 = r9.I;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x060d, code lost:
    
        if (r4 == null) goto L382;
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x060f, code lost:
    
        r3 = r4.a(r3, r11, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x0619, code lost:
    
        if (r3 == false) goto L488;
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x061b, code lost:
    
        r3 = r10.J;
        r4 = r9.J;
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x061f, code lost:
    
        if (r4 == null) goto L389;
     */
    /* JADX WARN: Code restructure failed: missing block: B:285:0x0621, code lost:
    
        r3 = r4.a(r3, r11, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:286:0x062b, code lost:
    
        if (r3 == false) goto L488;
     */
    /* JADX WARN: Code restructure failed: missing block: B:287:0x062d, code lost:
    
        r3 = r10.K;
        r4 = r9.K;
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x0631, code lost:
    
        if (r4 == null) goto L396;
     */
    /* JADX WARN: Code restructure failed: missing block: B:289:0x0633, code lost:
    
        r3 = r4.a(r3, r11, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:290:0x063d, code lost:
    
        if (r3 == false) goto L488;
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x063f, code lost:
    
        r3 = r10.L;
        r4 = r9.L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:292:0x0643, code lost:
    
        if (r4 == null) goto L417;
     */
    /* JADX WARN: Code restructure failed: missing block: B:293:0x0645, code lost:
    
        if (r3 != null) goto L404;
     */
    /* JADX WARN: Code restructure failed: missing block: B:295:0x0651, code lost:
    
        if (r4.size() == r3.size()) goto L407;
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x0655, code lost:
    
        r4 = r4.iterator();
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:298:0x0660, code lost:
    
        if (r4.hasNext() == false) goto L516;
     */
    /* JADX WARN: Code restructure failed: missing block: B:299:0x0662, code lost:
    
        r6 = r4.next();
        r7 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:300:0x0668, code lost:
    
        if (r5 < 0) goto L518;
     */
    /* JADX WARN: Code restructure failed: missing block: B:302:0x0672, code lost:
    
        if (((com.yandex.div2.DivTransitionTrigger) r6) != ((com.yandex.div2.DivTransitionTrigger) r3.get(r5))) goto L517;
     */
    /* JADX WARN: Code restructure failed: missing block: B:303:0x0674, code lost:
    
        r5 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:306:0x0676, code lost:
    
        defpackage.scc.m();
     */
    /* JADX WARN: Code restructure failed: missing block: B:307:0x0679, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:309:0x067c, code lost:
    
        r3 = r10.M;
        r4 = r9.M;
     */
    /* JADX WARN: Code restructure failed: missing block: B:310:0x0680, code lost:
    
        if (r4 == null) goto L436;
     */
    /* JADX WARN: Code restructure failed: missing block: B:311:0x0682, code lost:
    
        if (r3 != null) goto L422;
     */
    /* JADX WARN: Code restructure failed: missing block: B:313:0x068e, code lost:
    
        if (r4.size() == r3.size()) goto L425;
     */
    /* JADX WARN: Code restructure failed: missing block: B:314:0x0692, code lost:
    
        r4 = r4.iterator();
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:316:0x069d, code lost:
    
        if (r4.hasNext() == false) goto L521;
     */
    /* JADX WARN: Code restructure failed: missing block: B:317:0x069f, code lost:
    
        r6 = r4.next();
        r7 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:318:0x06a5, code lost:
    
        if (r5 < 0) goto L520;
     */
    /* JADX WARN: Code restructure failed: missing block: B:320:0x06b3, code lost:
    
        if (((defpackage.lll) r6).a((defpackage.lll) r3.get(r5), r11, r12) != false) goto L433;
     */
    /* JADX WARN: Code restructure failed: missing block: B:321:0x06b7, code lost:
    
        r5 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:324:0x06b9, code lost:
    
        defpackage.scc.m();
     */
    /* JADX WARN: Code restructure failed: missing block: B:325:0x06bc, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:327:0x06bf, code lost:
    
        r3 = r10.N;
        r4 = r9.N;
     */
    /* JADX WARN: Code restructure failed: missing block: B:328:0x06c3, code lost:
    
        if (r4 == null) goto L455;
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:0x06c5, code lost:
    
        if (r3 != null) goto L441;
     */
    /* JADX WARN: Code restructure failed: missing block: B:331:0x06d1, code lost:
    
        if (r4.size() == r3.size()) goto L444;
     */
    /* JADX WARN: Code restructure failed: missing block: B:332:0x06d5, code lost:
    
        r4 = r4.iterator();
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:334:0x06e0, code lost:
    
        if (r4.hasNext() == false) goto L522;
     */
    /* JADX WARN: Code restructure failed: missing block: B:335:0x06e2, code lost:
    
        r6 = r4.next();
        r7 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:336:0x06e8, code lost:
    
        if (r5 < 0) goto L524;
     */
    /* JADX WARN: Code restructure failed: missing block: B:338:0x06f6, code lost:
    
        if (((com.yandex.div2.c3) r6).a((com.yandex.div2.c3) r3.get(r5), r11, r12) != false) goto L452;
     */
    /* JADX WARN: Code restructure failed: missing block: B:339:0x06fa, code lost:
    
        r5 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:342:0x06fc, code lost:
    
        defpackage.scc.m();
     */
    /* JADX WARN: Code restructure failed: missing block: B:343:0x06ff, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:346:0x070e, code lost:
    
        if (r9.O.a(r11) != r10.O.a(r12)) goto L488;
     */
    /* JADX WARN: Code restructure failed: missing block: B:347:0x0710, code lost:
    
        r3 = r10.P;
        r4 = r9.P;
     */
    /* JADX WARN: Code restructure failed: missing block: B:348:0x0714, code lost:
    
        if (r4 == null) goto L461;
     */
    /* JADX WARN: Code restructure failed: missing block: B:349:0x0716, code lost:
    
        r3 = r4.f(r3, r11, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:350:0x0720, code lost:
    
        if (r3 == false) goto L488;
     */
    /* JADX WARN: Code restructure failed: missing block: B:351:0x0722, code lost:
    
        r3 = r10.Q;
        r4 = r9.Q;
     */
    /* JADX WARN: Code restructure failed: missing block: B:352:0x0726, code lost:
    
        if (r4 == null) goto L483;
     */
    /* JADX WARN: Code restructure failed: missing block: B:353:0x0728, code lost:
    
        if (r3 != null) goto L469;
     */
    /* JADX WARN: Code restructure failed: missing block: B:355:0x0733, code lost:
    
        if (r4.size() == r3.size()) goto L472;
     */
    /* JADX WARN: Code restructure failed: missing block: B:356:0x0736, code lost:
    
        r4 = r4.iterator();
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:358:0x0741, code lost:
    
        if (r4.hasNext() == false) goto L525;
     */
    /* JADX WARN: Code restructure failed: missing block: B:359:0x0743, code lost:
    
        r6 = r4.next();
        r7 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:360:0x0749, code lost:
    
        if (r5 < 0) goto L527;
     */
    /* JADX WARN: Code restructure failed: missing block: B:362:0x0757, code lost:
    
        if (((com.yandex.div2.DivVisibilityAction) r6).f((com.yandex.div2.DivVisibilityAction) r3.get(r5), r11, r12) != false) goto L480;
     */
    /* JADX WARN: Code restructure failed: missing block: B:363:0x075a, code lost:
    
        r5 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:366:0x075c, code lost:
    
        defpackage.scc.m();
     */
    /* JADX WARN: Code restructure failed: missing block: B:367:0x075f, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:370:0x076a, code lost:
    
        if (r9.R.a(r10.R, r11, r12) == false) goto L488;
     */
    /* JADX WARN: Code restructure failed: missing block: B:371:0x076c, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:372:0x0760, code lost:
    
        if (r3 != null) goto L488;
     */
    /* JADX WARN: Code restructure failed: missing block: B:373:0x071b, code lost:
    
        if (r3 != null) goto L463;
     */
    /* JADX WARN: Code restructure failed: missing block: B:374:0x071d, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:375:0x071f, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:376:0x0700, code lost:
    
        if (r3 != null) goto L488;
     */
    /* JADX WARN: Code restructure failed: missing block: B:377:0x06bd, code lost:
    
        if (r3 != null) goto L488;
     */
    /* JADX WARN: Code restructure failed: missing block: B:378:0x067a, code lost:
    
        if (r3 != null) goto L488;
     */
    /* JADX WARN: Code restructure failed: missing block: B:379:0x0638, code lost:
    
        if (r3 != null) goto L398;
     */
    /* JADX WARN: Code restructure failed: missing block: B:380:0x063a, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:381:0x063c, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:382:0x0626, code lost:
    
        if (r3 != null) goto L391;
     */
    /* JADX WARN: Code restructure failed: missing block: B:383:0x0628, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:384:0x062a, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:385:0x0614, code lost:
    
        if (r3 != null) goto L384;
     */
    /* JADX WARN: Code restructure failed: missing block: B:386:0x0616, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:387:0x0618, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:388:0x0607, code lost:
    
        if (r3 != null) goto L488;
     */
    /* JADX WARN: Code restructure failed: missing block: B:389:0x05bf, code lost:
    
        if (r3 != null) goto L358;
     */
    /* JADX WARN: Code restructure failed: missing block: B:390:0x05c1, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:391:0x05c3, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:392:0x05b2, code lost:
    
        if (r3 != null) goto L488;
     */
    /* JADX WARN: Code restructure failed: missing block: B:393:0x056f, code lost:
    
        if (r3 != null) goto L488;
     */
    /* JADX WARN: Code restructure failed: missing block: B:394:0x0519, code lost:
    
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:395:0x050d, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:396:0x04fb, code lost:
    
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:397:0x04ef, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:416:0x04c1, code lost:
    
        if (((java.lang.Boolean) r4.f.a(r11)).booleanValue() != ((java.lang.Boolean) r3.f.a(r12)).booleanValue()) goto L488;
     */
    /* JADX WARN: Code restructure failed: missing block: B:420:0x04c8, code lost:
    
        if (r3 == null) goto L291;
     */
    /* JADX WARN: Code restructure failed: missing block: B:458:0x02af, code lost:
    
        if (r3 == null) goto L189;
     */
    /* JADX WARN: Code restructure failed: missing block: B:462:0x0222, code lost:
    
        if (r3 == null) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:466:0x01cd, code lost:
    
        if (r3 == null) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:467:0x018a, code lost:
    
        if (r3 == null) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:473:0x00ed, code lost:
    
        if (r3 == null) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:474:0x00aa, code lost:
    
        if (r3 == null) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:168:0x032b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean C(t1l t1lVar, rvo rvoVar, rvo rvoVar2) {
        boolean a;
        if (t1lVar != null) {
            DivAccessibility divAccessibility = t1lVar.a;
            DivAccessibility divAccessibility2 = this.a;
            if (divAccessibility2 != null ? divAccessibility2.a(divAccessibility, rvoVar, rvoVar2) : divAccessibility == null) {
                Expression expression = this.b;
                DivAlignmentHorizontal divAlignmentHorizontal = expression != null ? (DivAlignmentHorizontal) expression.a(rvoVar) : null;
                Expression expression2 = t1lVar.b;
                if (divAlignmentHorizontal == (expression2 != null ? (DivAlignmentHorizontal) expression2.a(rvoVar2) : null)) {
                    Expression expression3 = this.c;
                    DivAlignmentVertical divAlignmentVertical = expression3 != null ? (DivAlignmentVertical) expression3.a(rvoVar) : null;
                    Expression expression4 = t1lVar.c;
                    if (divAlignmentVertical == (expression4 != null ? (DivAlignmentVertical) expression4.a(rvoVar2) : null) && ((Number) this.d.a(rvoVar)).doubleValue() == ((Number) t1lVar.d.a(rvoVar2)).doubleValue()) {
                        List list = t1lVar.e;
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
                                List list3 = t1lVar.f;
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
                                        DivBorder divBorder = t1lVar.g;
                                        DivBorder divBorder2 = this.g;
                                        if (divBorder2 != null ? divBorder2.a(divBorder, rvoVar, rvoVar2) : divBorder == null) {
                                            Expression expression5 = this.h;
                                            Long l = expression5 != null ? (Long) expression5.a(rvoVar) : null;
                                            Expression expression6 = t1lVar.h;
                                            if (jl40.l(l, expression6 != null ? (Long) expression6.a(rvoVar2) : null) && this.i.a(rvoVar) == t1lVar.i.a(rvoVar2) && ((Number) this.j.a(rvoVar)).longValue() == ((Number) t1lVar.j.a(rvoVar2)).longValue()) {
                                                List list5 = t1lVar.k;
                                                List list6 = this.k;
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
                                                        List list7 = t1lVar.l;
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
                                                                    if (!((bpk) obj4).a((bpk) list7.get(i7))) {
                                                                        break;
                                                                    }
                                                                    i7 = i8;
                                                                }
                                                                DivFocus divFocus = t1lVar.m;
                                                                DivFocus divFocus2 = this.m;
                                                                if (divFocus2 != null ? divFocus2.a(divFocus, rvoVar, rvoVar2) : divFocus == null) {
                                                                    List list9 = t1lVar.n;
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
                                                                                if (!((irk) obj5).a((irk) list9.get(i9))) {
                                                                                    break;
                                                                                }
                                                                                i9 = i10;
                                                                            }
                                                                            if (this.o.a(t1lVar.o, rvoVar, rvoVar2) && jl40.l(this.p, t1lVar.p) && ((Boolean) this.q.a(rvoVar)).booleanValue() == ((Boolean) t1lVar.q.a(rvoVar2)).booleanValue()) {
                                                                                DivCollectionItemBuilder divCollectionItemBuilder = t1lVar.r;
                                                                                DivCollectionItemBuilder divCollectionItemBuilder2 = this.r;
                                                                                if ((divCollectionItemBuilder2 != null ? divCollectionItemBuilder2.a(divCollectionItemBuilder, rvoVar, rvoVar2) : divCollectionItemBuilder == null) && this.s.a(t1lVar.s, rvoVar, rvoVar2)) {
                                                                                    List list11 = t1lVar.t;
                                                                                    List list12 = this.t;
                                                                                    if (list12 != null) {
                                                                                        if (list11 != null && list12.size() == list11.size()) {
                                                                                            int i11 = 0;
                                                                                            for (Object obj6 : list12) {
                                                                                                int i12 = i11 + 1;
                                                                                                if (i11 < 0) {
                                                                                                    scc.m();
                                                                                                    throw null;
                                                                                                }
                                                                                                if (!((m3k) obj6).a((m3k) list11.get(i11), rvoVar, rvoVar2)) {
                                                                                                    break;
                                                                                                }
                                                                                                i11 = i12;
                                                                                            }
                                                                                            d2l d2lVar = t1lVar.u;
                                                                                            d2l d2lVar2 = this.u;
                                                                                            d2lVar2.getClass();
                                                                                            if (d2lVar != null) {
                                                                                                if (d2lVar2 instanceof c2l) {
                                                                                                    t0l t0lVar = ((c2l) d2lVar2).b;
                                                                                                    Object a2 = d2lVar.a();
                                                                                                    t0l t0lVar2 = a2 instanceof t0l ? (t0l) a2 : null;
                                                                                                    if (t0lVar2 != null) {
                                                                                                        j3l j3lVar = t0lVar.a;
                                                                                                        j3l j3lVar2 = t0lVar2.a;
                                                                                                        if (j3lVar2 == null) {
                                                                                                            j3lVar.getClass();
                                                                                                        } else if (((Number) j3lVar.a.a(rvoVar)).doubleValue() == ((Number) j3lVar2.a.a(rvoVar2)).doubleValue()) {
                                                                                                            a = true;
                                                                                                        }
                                                                                                    }
                                                                                                } else if (d2lVar2 instanceof a2l) {
                                                                                                    yzk yzkVar = ((a2l) d2lVar2).b;
                                                                                                    Object a3 = d2lVar.a();
                                                                                                    a = yzkVar.a(a3 instanceof yzk ? (yzk) a3 : null, rvoVar, rvoVar2);
                                                                                                } else if (d2lVar2 instanceof b2l) {
                                                                                                    Object a4 = d2lVar.a();
                                                                                                    a = o0l.a(a4 instanceof o0l ? (o0l) a4 : null);
                                                                                                } else {
                                                                                                    w511.b();
                                                                                                }
                                                                                                if (a) {
                                                                                                    DivLayoutProvider divLayoutProvider = t1lVar.v;
                                                                                                    DivLayoutProvider divLayoutProvider2 = this.v;
                                                                                                    if (divLayoutProvider2 != null ? divLayoutProvider2.a(divLayoutProvider) : divLayoutProvider == null) {
                                                                                                        DivEdgeInsets divEdgeInsets = t1lVar.w;
                                                                                                        DivEdgeInsets divEdgeInsets2 = this.w;
                                                                                                        if ((divEdgeInsets2 != null ? divEdgeInsets2.a(divEdgeInsets, rvoVar, rvoVar2) : divEdgeInsets == null) && this.x.a(rvoVar) == t1lVar.x.a(rvoVar2)) {
                                                                                                            DivEdgeInsets divEdgeInsets3 = t1lVar.y;
                                                                                                            DivEdgeInsets divEdgeInsets4 = this.y;
                                                                                                            if (divEdgeInsets4 != null ? divEdgeInsets4.a(divEdgeInsets3, rvoVar, rvoVar2) : divEdgeInsets3 == null) {
                                                                                                                a1l a1lVar = t1lVar.z;
                                                                                                                a1l a1lVar2 = this.z;
                                                                                                                if (a1lVar2 != null) {
                                                                                                                    if (a1lVar != null) {
                                                                                                                        if (a1lVar2 instanceof z0l) {
                                                                                                                            j1l b = ((z0l) a1lVar2).b();
                                                                                                                            Object a5 = a1lVar.a();
                                                                                                                            j1l j1lVar = a5 instanceof j1l ? (j1l) a5 : null;
                                                                                                                            if (j1lVar != null) {
                                                                                                                                if (b.a.a(rvoVar) == j1lVar.a.a(rvoVar2)) {
                                                                                                                                    if (((Number) b.b.a(rvoVar)).doubleValue() == ((Number) j1lVar.b.a(rvoVar2)).doubleValue()) {
                                                                                                                                        if (((Number) b.c.a(rvoVar)).doubleValue() == ((Number) j1lVar.c.a(rvoVar2)).doubleValue()) {
                                                                                                                                            if (((Number) b.d.a(rvoVar)).doubleValue() == ((Number) j1lVar.d.a(rvoVar2)).doubleValue()) {
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            if (!(a1lVar2 instanceof y0l)) {
                                                                                                                                w511.b();
                                                                                                                                return false;
                                                                                                                            }
                                                                                                                            e1l e1lVar = ((y0l) a1lVar2).b;
                                                                                                                            Object a6 = a1lVar.a();
                                                                                                                            e1l e1lVar2 = a6 instanceof e1l ? (e1l) a6 : null;
                                                                                                                            if (e1lVar2 != null) {
                                                                                                                                if (e1lVar.a.a(rvoVar) == e1lVar2.a.a(rvoVar2)) {
                                                                                                                                    if (((Number) e1lVar.b.a(rvoVar)).doubleValue() == ((Number) e1lVar2.b.a(rvoVar2)).doubleValue()) {
                                                                                                                                        if (((Number) e1lVar.c.a(rvoVar)).doubleValue() == ((Number) e1lVar2.c.a(rvoVar2)).doubleValue()) {
                                                                                                                                            if (((Number) e1lVar.d.a(rvoVar)).doubleValue() == ((Number) e1lVar2.d.a(rvoVar2)).doubleValue()) {
                                                                                                                                                if (((Number) e1lVar.e.a(rvoVar)).doubleValue() == ((Number) e1lVar2.e.a(rvoVar2)).doubleValue()) {
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
                                                                                            a = false;
                                                                                            if (a) {
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

    /* JADX WARN: Removed duplicated region for block: B:104:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int D() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int b;
        int i7;
        int i8;
        List list;
        int i9;
        List list2;
        int i10;
        List list3;
        int i11;
        List list4;
        int i12;
        List list5;
        int i13;
        List list6;
        int hashCode;
        int intValue;
        Integer num = this.S;
        if (num != null) {
            return num.intValue();
        }
        int hashCode2 = qoi0.a(t1l.class).hashCode();
        int i14 = 0;
        DivAccessibility divAccessibility = this.a;
        int b2 = hashCode2 + (divAccessibility != null ? divAccessibility.b() : 0);
        Expression expression = this.b;
        int hashCode3 = b2 + (expression != null ? expression.hashCode() : 0);
        Expression expression2 = this.c;
        int hashCode4 = this.d.hashCode() + hashCode3 + (expression2 != null ? expression2.hashCode() : 0);
        List list7 = this.e;
        if (list7 != null) {
            Iterator it = list7.iterator();
            i = 0;
            while (it.hasNext()) {
                i += ((ydk) it.next()).b();
            }
        } else {
            i = 0;
        }
        int i15 = hashCode4 + i;
        List list8 = this.f;
        if (list8 != null) {
            Iterator it2 = list8.iterator();
            i2 = 0;
            while (it2.hasNext()) {
                i2 += ((kfk) it2.next()).b();
            }
        } else {
            i2 = 0;
        }
        int i16 = i15 + i2;
        DivBorder divBorder = this.g;
        int b3 = i16 + (divBorder != null ? divBorder.b() : 0);
        Expression expression3 = this.h;
        int hashCode5 = this.j.hashCode() + this.i.hashCode() + b3 + (expression3 != null ? expression3.hashCode() : 0);
        List list9 = this.k;
        if (list9 != null) {
            Iterator it3 = list9.iterator();
            i3 = 0;
            while (it3.hasNext()) {
                i3 += ((nnk) it3.next()).g();
            }
        } else {
            i3 = 0;
        }
        int i17 = hashCode5 + i3;
        List list10 = this.l;
        if (list10 != null) {
            Iterator it4 = list10.iterator();
            i4 = 0;
            while (it4.hasNext()) {
                i4 += ((bpk) it4.next()).b();
            }
        } else {
            i4 = 0;
        }
        int i18 = i17 + i4;
        DivFocus divFocus = this.m;
        int b4 = i18 + (divFocus != null ? divFocus.b() : 0);
        List list11 = this.n;
        if (list11 != null) {
            Iterator it5 = list11.iterator();
            i5 = 0;
            while (it5.hasNext()) {
                i5 += ((irk) it5.next()).b();
            }
        } else {
            i5 = 0;
        }
        int b5 = this.o.b() + b4 + i5;
        String str = this.p;
        int hashCode6 = this.q.hashCode() + b5 + (str != null ? str.hashCode() : 0);
        DivCollectionItemBuilder divCollectionItemBuilder = this.r;
        int b6 = this.s.b() + hashCode6 + (divCollectionItemBuilder != null ? divCollectionItemBuilder.b() : 0);
        d2l d2lVar = this.u;
        Integer num2 = d2lVar.a;
        if (num2 != null) {
            i6 = num2.intValue();
        } else {
            int hashCode7 = qoi0.a(d2lVar.getClass()).hashCode();
            if (d2lVar instanceof c2l) {
                t0l t0lVar = ((c2l) d2lVar).b;
                Integer num3 = t0lVar.b;
                if (num3 != null) {
                    b = num3.intValue();
                } else {
                    int hashCode8 = qoi0.a(t0l.class).hashCode();
                    j3l j3lVar = t0lVar.a;
                    Integer num4 = j3lVar.b;
                    if (num4 != null) {
                        i7 = num4.intValue();
                    } else {
                        int hashCode9 = qoi0.a(j3l.class).hashCode() + j3lVar.a.hashCode();
                        j3lVar.b = Integer.valueOf(hashCode9);
                        i7 = hashCode9;
                    }
                    int i19 = hashCode8 + i7;
                    t0lVar.b = Integer.valueOf(i19);
                    b = i19;
                }
            } else if (d2lVar instanceof a2l) {
                b = ((a2l) d2lVar).b.b();
            } else if (d2lVar instanceof b2l) {
                b = ((b2l) d2lVar).b.b();
            } else {
                w511.b();
                i6 = 0;
            }
            int i20 = hashCode7 + b;
            d2lVar.a = Integer.valueOf(i20);
            i6 = i20;
        }
        int i21 = i6 + b6;
        DivLayoutProvider divLayoutProvider = this.v;
        int b7 = i21 + (divLayoutProvider != null ? divLayoutProvider.b() : 0);
        DivEdgeInsets divEdgeInsets = this.w;
        int hashCode10 = this.x.hashCode() + b7 + (divEdgeInsets != null ? divEdgeInsets.b() : 0);
        DivEdgeInsets divEdgeInsets2 = this.y;
        int b8 = hashCode10 + (divEdgeInsets2 != null ? divEdgeInsets2.b() : 0);
        a1l a1lVar = this.z;
        if (a1lVar != null) {
            Integer num5 = a1lVar.a;
            if (num5 != null) {
                i8 = num5.intValue();
            } else {
                int hashCode11 = qoi0.a(a1lVar.getClass()).hashCode();
                if (a1lVar instanceof z0l) {
                    j1l b9 = ((z0l) a1lVar).b();
                    Integer num6 = b9.f;
                    if (num6 != null) {
                        intValue = num6.intValue();
                        int i22 = hashCode11 + intValue;
                        a1lVar.a = Integer.valueOf(i22);
                        i8 = i22;
                    } else {
                        hashCode = b9.d.hashCode() + b9.c.hashCode() + b9.b.hashCode() + b9.a.hashCode() + qoi0.a(j1l.class).hashCode() + b9.e.hashCode();
                        b9.f = Integer.valueOf(hashCode);
                        intValue = hashCode;
                        int i222 = hashCode11 + intValue;
                        a1lVar.a = Integer.valueOf(i222);
                        i8 = i222;
                    }
                } else if (a1lVar instanceof y0l) {
                    e1l e1lVar = ((y0l) a1lVar).b;
                    Integer num7 = e1lVar.g;
                    if (num7 != null) {
                        intValue = num7.intValue();
                        int i2222 = hashCode11 + intValue;
                        a1lVar.a = Integer.valueOf(i2222);
                        i8 = i2222;
                    } else {
                        hashCode = e1lVar.f.hashCode() + e1lVar.e.hashCode() + e1lVar.d.hashCode() + e1lVar.c.hashCode() + e1lVar.b.hashCode() + e1lVar.a.hashCode() + qoi0.a(e1l.class).hashCode();
                        e1lVar.g = Integer.valueOf(hashCode);
                        intValue = hashCode;
                        int i22222 = hashCode11 + intValue;
                        a1lVar.a = Integer.valueOf(i22222);
                        i8 = i22222;
                    }
                } else {
                    w511.b();
                }
            }
            int hashCode12 = this.A.hashCode() + b8 + i8;
            Expression expression4 = this.B;
            int hashCode13 = hashCode12 + (expression4 == null ? expression4.hashCode() : 0);
            Expression expression5 = this.C;
            int hashCode14 = this.D.hashCode() + hashCode13 + (expression5 == null ? expression5.hashCode() : 0);
            list = this.E;
            if (list == null) {
                Iterator it6 = list.iterator();
                i9 = 0;
                while (it6.hasNext()) {
                    i9 += ((v3k) it6.next()).b();
                }
            } else {
                i9 = 0;
            }
            int i23 = hashCode14 + i9;
            list2 = this.F;
            if (list2 == null) {
                Iterator it7 = list2.iterator();
                i10 = 0;
                while (it7.hasNext()) {
                    i10 += ((gil) it7.next()).b();
                }
            } else {
                i10 = 0;
            }
            int i24 = i23 + i10;
            DivTransform divTransform = this.G;
            int b10 = i24 + (divTransform == null ? divTransform.b() : 0);
            list3 = this.H;
            if (list3 == null) {
                Iterator it8 = list3.iterator();
                i11 = 0;
                while (it8.hasNext()) {
                    i11 += ((xjl) it8.next()).b();
                }
            } else {
                i11 = 0;
            }
            int i25 = b10 + i11;
            DivChangeTransition divChangeTransition = this.I;
            int b11 = i25 + (divChangeTransition == null ? divChangeTransition.b() : 0);
            DivAppearanceTransition divAppearanceTransition = this.J;
            int b12 = b11 + (divAppearanceTransition == null ? divAppearanceTransition.b() : 0);
            DivAppearanceTransition divAppearanceTransition2 = this.K;
            int b13 = b12 + (divAppearanceTransition2 == null ? divAppearanceTransition2.b() : 0);
            List list12 = this.L;
            int hashCode15 = b13 + (list12 == null ? list12.hashCode() : 0);
            list4 = this.M;
            if (list4 == null) {
                Iterator it9 = list4.iterator();
                i12 = 0;
                while (it9.hasNext()) {
                    i12 += ((lll) it9.next()).b();
                }
            } else {
                i12 = 0;
            }
            int i26 = hashCode15 + i12;
            list5 = this.N;
            if (list5 == null) {
                Iterator it10 = list5.iterator();
                i13 = 0;
                while (it10.hasNext()) {
                    i13 += ((c3) it10.next()).b();
                }
            } else {
                i13 = 0;
            }
            int hashCode16 = this.O.hashCode() + i26 + i13;
            DivVisibilityAction divVisibilityAction = this.P;
            int g = hashCode16 + (divVisibilityAction == null ? divVisibilityAction.g() : 0);
            list6 = this.Q;
            if (list6 != null) {
                Iterator it11 = list6.iterator();
                while (it11.hasNext()) {
                    i14 += ((DivVisibilityAction) it11.next()).g();
                }
            }
            int b14 = this.R.b() + g + i14;
            this.S = Integer.valueOf(b14);
            return b14;
        }
        i8 = 0;
        int hashCode122 = this.A.hashCode() + b8 + i8;
        Expression expression42 = this.B;
        int hashCode132 = hashCode122 + (expression42 == null ? expression42.hashCode() : 0);
        Expression expression52 = this.C;
        int hashCode142 = this.D.hashCode() + hashCode132 + (expression52 == null ? expression52.hashCode() : 0);
        list = this.E;
        if (list == null) {
        }
        int i232 = hashCode142 + i9;
        list2 = this.F;
        if (list2 == null) {
        }
        int i242 = i232 + i10;
        DivTransform divTransform2 = this.G;
        int b102 = i242 + (divTransform2 == null ? divTransform2.b() : 0);
        list3 = this.H;
        if (list3 == null) {
        }
        int i252 = b102 + i11;
        DivChangeTransition divChangeTransition2 = this.I;
        int b112 = i252 + (divChangeTransition2 == null ? divChangeTransition2.b() : 0);
        DivAppearanceTransition divAppearanceTransition3 = this.J;
        int b122 = b112 + (divAppearanceTransition3 == null ? divAppearanceTransition3.b() : 0);
        DivAppearanceTransition divAppearanceTransition22 = this.K;
        int b132 = b122 + (divAppearanceTransition22 == null ? divAppearanceTransition22.b() : 0);
        List list122 = this.L;
        int hashCode152 = b132 + (list122 == null ? list122.hashCode() : 0);
        list4 = this.M;
        if (list4 == null) {
        }
        int i262 = hashCode152 + i12;
        list5 = this.N;
        if (list5 == null) {
        }
        int hashCode162 = this.O.hashCode() + i262 + i13;
        DivVisibilityAction divVisibilityAction2 = this.P;
        int g2 = hashCode162 + (divVisibilityAction2 == null ? divVisibilityAction2.g() : 0);
        list6 = this.Q;
        if (list6 != null) {
        }
        int b142 = this.R.b() + g2 + i14;
        this.S = Integer.valueOf(b142);
        return b142;
    }

    @Override // defpackage.egk
    public final Expression a() {
        return this.d;
    }

    @Override // defpackage.egk
    public final List b() {
        return this.Q;
    }

    @Override // defpackage.egk
    public final Expression c() {
        return this.h;
    }

    @Override // defpackage.egk
    public final List d() {
        return this.N;
    }

    @Override // defpackage.egk
    public final DivEdgeInsets e() {
        return this.w;
    }

    @Override // defpackage.egk
    public final Expression f() {
        return this.C;
    }

    @Override // defpackage.egk
    public final Expression g() {
        return this.B;
    }

    @Override // defpackage.egk
    public final List getBackground() {
        return this.f;
    }

    @Override // defpackage.egk
    public final List getExtensions() {
        return this.l;
    }

    @Override // defpackage.egk
    public final DivSize getHeight() {
        return this.o;
    }

    @Override // defpackage.egk
    public final String getId() {
        return this.p;
    }

    @Override // defpackage.egk
    public final Expression getVisibility() {
        return this.O;
    }

    @Override // defpackage.egk
    public final DivSize getWidth() {
        return this.R;
    }

    @Override // defpackage.egk
    public final Expression h() {
        return this.b;
    }

    @Override // defpackage.egk
    public final List i() {
        return this.F;
    }

    @Override // defpackage.egk
    public final DivAppearanceTransition j() {
        return this.K;
    }

    @Override // defpackage.egk
    public final DivChangeTransition k() {
        return this.I;
    }

    @Override // defpackage.egk
    public final List l() {
        return this.k;
    }

    @Override // defpackage.egk
    public final DivTransform m() {
        return this.G;
    }

    @Override // defpackage.egk
    public final List n() {
        return this.L;
    }

    @Override // defpackage.egk
    public final Expression o() {
        return this.c;
    }

    @Override // defpackage.egk
    public final DivFocus p() {
        return this.m;
    }

    @Override // defpackage.egk
    public final DivAccessibility q() {
        return this.a;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        return ((x1l) ft6.b.K5.getValue()).b(ft6.a, this);
    }

    @Override // defpackage.egk
    public final DivEdgeInsets s() {
        return this.y;
    }

    @Override // defpackage.egk
    public final List t() {
        return this.E;
    }

    @Override // defpackage.egk
    public final DivLayoutProvider u() {
        return this.v;
    }

    @Override // defpackage.egk
    public final List v() {
        return this.M;
    }

    @Override // defpackage.egk
    public final DivVisibilityAction w() {
        return this.P;
    }

    @Override // defpackage.egk
    public final List x() {
        return this.n;
    }

    @Override // defpackage.egk
    public final DivAppearanceTransition y() {
        return this.J;
    }

    @Override // defpackage.egk
    public final List z() {
        return this.e;
    }
}
