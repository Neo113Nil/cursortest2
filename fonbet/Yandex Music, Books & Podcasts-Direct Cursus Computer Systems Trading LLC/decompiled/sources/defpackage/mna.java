package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class mna extends h7o implements Function2 {
    public final /* synthetic */ uif A;
    public Object k;
    public Object l;
    public Object m;
    public wqn n;
    public yps o;
    public lfm p;
    public boolean q;
    public float r;
    public int s;
    public /* synthetic */ Object t;
    public final /* synthetic */ uif u;
    public final /* synthetic */ wqn v;
    public final /* synthetic */ bxj w;
    public final /* synthetic */ uif x;
    public final /* synthetic */ Function2 y;
    public final /* synthetic */ Function0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public mna(Function0 function0, wqn wqnVar, bxj bxjVar, pyc pycVar, Function2 function2, Function0 function02, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.u = (uif) function0;
        this.v = wqnVar;
        this.w = bxjVar;
        this.x = (uif) pycVar;
        this.y = function2;
        this.z = function02;
        this.A = (uif) function1;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.jvm.functions.Function0, uif] */
    /* JADX WARN: Type inference failed for: r4v0, types: [pyc, uif] */
    /* JADX WARN: Type inference failed for: r7v0, types: [kotlin.jvm.functions.Function1, uif] */
    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        mna mnaVar = new mna(this.u, this.v, this.w, this.x, this.y, this.z, this.A, continuation);
        mnaVar.t = obj;
        return mnaVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((mna) create((hur) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:146:0x042c, code lost:
    
        if (r4.a(r7, r24) == r1) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x01c5, code lost:
    
        if (r15 != r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x0182, code lost:
    
        if (r2 != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x017a, code lost:
    
        if (r5 == r1) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x0156, code lost:
    
        if (r3 == r1) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x04a1, code lost:
    
        if (r4 == r1) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0526, code lost:
    
        if (r9 == 0.0f) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x036d, code lost:
    
        if (r9 == r1) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x02c7, code lost:
    
        if (r5 == r1) goto L168;
     */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0455  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x053e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0544  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0293  */
    /* JADX WARN: Type inference failed for: r1v2, types: [kotlin.jvm.functions.Function1, uif] */
    /* JADX WARN: Type inference failed for: r2v4, types: [kotlin.jvm.functions.Function0, uif] */
    /* JADX WARN: Type inference failed for: r6v27, types: [pyc, uif] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:102:0x0445 -> B:71:0x0291). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:121:0x03e2 -> B:58:0x040d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:128:0x0409 -> B:58:0x040d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:130:0x042c -> B:56:0x0430). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:146:0x0190 -> B:140:0x0192). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:157:0x0200 -> B:140:0x0192). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:170:0x0250 -> B:148:0x01ab). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:176:0x024a -> B:141:0x027e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:180:0x0273 -> B:137:0x0275). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x04a1 -> B:7:0x04a4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:86:0x02f7 -> B:77:0x02af). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:98:0x0335 -> B:70:0x0439). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:99:0x033d -> B:59:0x0353). Please report as a decompilation issue!!! */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        long j;
        long j2;
        hur hurVar;
        Object b;
        hur hurVar2;
        lfm lfmVar;
        boolean booleanValue;
        Object c;
        lfm lfmVar2;
        float f;
        yps ypsVar;
        wqn wqnVar;
        wqn wqnVar2;
        Object obj2;
        hur hurVar3;
        lfm lfmVar3;
        Object obj3;
        lfm lfmVar4;
        lfm lfmVar5;
        Object obj4;
        float f2;
        Object obj5;
        yps ypsVar2;
        wqn wqnVar3;
        wqn wqnVar4;
        hur hurVar4;
        bxj bxjVar;
        Function2 function2;
        long j3;
        bxj bxjVar2;
        lfm lfmVar6;
        Object obj6;
        lfm lfmVar7;
        Object obj7;
        hur hurVar5;
        hur hurVar6;
        wqn wqnVar5;
        lfm lfmVar8;
        Object a;
        Object obj8;
        Object obj9;
        nm6 nm6Var = nm6.a;
        int i = this.s;
        bxj bxjVar3 = this.w;
        long j4 = 0;
        wqn wqnVar6 = this.v;
        switch (i) {
            case 0:
                j = 9205357640488583168L;
                j2 = 9223372034707292159L;
                qgg.h0(obj);
                hurVar = (hur) this.t;
                gfm gfmVar = gfm.a;
                this.t = hurVar;
                this.s = 1;
                b = g6s.b(hurVar, false, gfmVar, this);
                break;
            case 1:
                j = 9205357640488583168L;
                j2 = 9223372034707292159L;
                hurVar = (hur) this.t;
                qgg.h0(obj);
                b = obj;
                hurVar2 = hurVar;
                lfmVar = (lfm) b;
                booleanValue = ((Boolean) this.u.invoke()).booleanValue();
                if (!booleanValue) {
                    lfmVar.a();
                }
                this.t = hurVar2;
                this.k = lfmVar;
                this.q = booleanValue;
                this.s = 2;
                c = g6s.c(hurVar2, false, this, 2);
                break;
            case 2:
                j = 9205357640488583168L;
                j2 = 9223372034707292159L;
                booleanValue = this.q;
                lfmVar = (lfm) this.k;
                hurVar2 = (hur) this.t;
                qgg.h0(obj);
                c = obj;
                lfmVar2 = (lfm) c;
                wqnVar6.a = 0L;
                break;
            case 3:
                j = 9205357640488583168L;
                j2 = 9223372034707292159L;
                float f3 = this.r;
                yps ypsVar3 = this.o;
                wqn wqnVar7 = this.n;
                wqn wqnVar8 = (wqn) this.m;
                hur hurVar7 = (hur) this.l;
                lfm lfmVar9 = (lfm) this.k;
                hur hurVar8 = (hur) this.t;
                qgg.h0(obj);
                f = f3;
                ypsVar = ypsVar3;
                hur hurVar9 = hurVar8;
                wqnVar = wqnVar8;
                lfmVar2 = lfmVar9;
                wqnVar2 = wqnVar7;
                hurVar2 = hurVar7;
                Object obj10 = obj;
                ffm ffmVar = (ffm) obj10;
                List list = ffmVar.a;
                int size = list.size();
                int i2 = 0;
                while (true) {
                    if (i2 < size) {
                        Object obj11 = list.get(i2);
                        int i3 = i2;
                        int i4 = size;
                        List list2 = list;
                        if (ywf.u(((lfm) obj11).a, wqnVar2.a)) {
                            obj2 = obj11;
                        } else {
                            i2 = i3 + 1;
                            list = list2;
                            size = i4;
                        }
                    } else {
                        obj2 = null;
                    }
                }
                lfm lfmVar10 = (lfm) obj2;
                if (lfmVar10 != null && !lfmVar10.b()) {
                    if (swf.B(lfmVar10)) {
                        List list3 = ffmVar.a;
                        int size2 = list3.size();
                        int i5 = 0;
                        while (true) {
                            if (i5 < size2) {
                                obj3 = list3.get(i5);
                                if (!((lfm) obj3).d) {
                                    i5++;
                                }
                            } else {
                                obj3 = null;
                            }
                        }
                        lfm lfmVar11 = (lfm) obj3;
                        if (lfmVar11 != null) {
                            wqnVar2.a = lfmVar11.a;
                        }
                    } else {
                        long a2 = ypsVar.a(lfmVar10, f);
                        if ((a2 & j2) == j) {
                            gfm gfmVar2 = gfm.c;
                            this.t = hurVar9;
                            this.k = lfmVar2;
                            this.l = hurVar2;
                            this.m = wqnVar;
                            this.n = wqnVar2;
                            this.o = ypsVar;
                            this.p = lfmVar10;
                            this.r = f;
                            this.s = 4;
                            if (hurVar2.a(gfmVar2, this) != nm6Var) {
                                hurVar3 = hurVar9;
                                lfmVar3 = lfmVar10;
                                if (!lfmVar3.b()) {
                                    hurVar2 = hurVar3;
                                    lfmVar10 = null;
                                    if (lfmVar10 == null) {
                                    }
                                    lfmVar = lfmVar10;
                                    if (lfmVar == null) {
                                    }
                                    bxj bxjVar4 = bxjVar3;
                                    if (lfmVar != null) {
                                    }
                                    return Unit.a;
                                }
                                hurVar9 = hurVar3;
                            }
                            return nm6Var;
                        }
                        lfmVar10.a();
                        wqnVar.a = a2;
                        if (lfmVar10.b()) {
                            hurVar2 = hurVar9;
                            if (lfmVar10 == null && !lfmVar10.b()) {
                                j4 = 0;
                                long j5 = lfmVar2.a;
                                int i6 = lfmVar2.i;
                                if (!wna.k(hurVar2.f.t, j5)) {
                                    f = wna.l(hurVar2.c(), i6);
                                    wqnVar2 = new wqn();
                                    wqnVar2.a = j5;
                                    ypsVar = new yps(j4, bxjVar3);
                                    hurVar9 = hurVar2;
                                    wqnVar = wqnVar6;
                                    this.t = hurVar9;
                                    this.k = lfmVar2;
                                    this.l = hurVar2;
                                    this.m = wqnVar;
                                    this.n = wqnVar2;
                                    this.o = ypsVar;
                                    this.p = null;
                                    this.r = f;
                                    this.s = 3;
                                    obj10 = hurVar2.a(gfm.b, this);
                                    break;
                                }
                                lfmVar10 = null;
                                if (lfmVar10 == null) {
                                }
                                lfmVar = lfmVar10;
                                if (lfmVar == null) {
                                }
                                bxj bxjVar42 = bxjVar3;
                                if (lfmVar != null) {
                                }
                                return Unit.a;
                            }
                            lfmVar = lfmVar10;
                            if (lfmVar == null) {
                                List list4 = hurVar2.f.t.a;
                                int size3 = list4.size();
                                for (int i7 = 0; i7 < size3; i7++) {
                                    if (((lfm) list4.get(i7)).d) {
                                        lfmVar4 = lfmVar;
                                        lfmVar5 = lfmVar2;
                                        gfm gfmVar3 = gfm.c;
                                        this.t = hurVar2;
                                        this.k = lfmVar5;
                                        this.l = lfmVar4;
                                        this.m = null;
                                        this.n = null;
                                        this.o = null;
                                        this.p = null;
                                        this.s = 5;
                                        obj4 = hurVar2.a(gfmVar3, this);
                                        break;
                                    }
                                }
                            }
                            bxj bxjVar422 = bxjVar3;
                            if (lfmVar != null) {
                                this.x.invoke(lfmVar2, lfmVar, new enj(wqnVar6.a));
                                enj enjVar = new enj(wqnVar6.a);
                                function2 = this.y;
                                function2.invoke(lfmVar, enjVar);
                                j3 = lfmVar.a;
                                if (!wna.k(hurVar2.f.t, j3)) {
                                    bxjVar2 = bxjVar422;
                                    wqn wqnVar9 = new wqn();
                                    wqnVar9.a = j3;
                                    hurVar6 = hurVar2;
                                    wqnVar5 = wqnVar9;
                                    hurVar5 = hurVar6;
                                    this.t = hurVar5;
                                    this.k = function2;
                                    this.l = bxjVar2;
                                    this.m = hurVar6;
                                    this.n = wqnVar5;
                                    lfmVar8 = null;
                                    this.o = null;
                                    this.p = null;
                                    this.s = 8;
                                    a = hurVar6.a(gfm.b, this);
                                    break;
                                } else {
                                    lfmVar6 = null;
                                    if (lfmVar6 != null) {
                                        this.z.invoke();
                                    } else {
                                        this.A.invoke(lfmVar6);
                                    }
                                }
                            }
                            return Unit.a;
                        }
                        ypsVar.b = 0L;
                    }
                    this.t = hurVar9;
                    this.k = lfmVar2;
                    this.l = hurVar2;
                    this.m = wqnVar;
                    this.n = wqnVar2;
                    this.o = ypsVar;
                    this.p = null;
                    this.r = f;
                    this.s = 3;
                    obj10 = hurVar2.a(gfm.b, this);
                }
                hurVar2 = hurVar9;
                lfmVar10 = null;
                if (lfmVar10 == null) {
                }
                lfmVar = lfmVar10;
                if (lfmVar == null) {
                }
                bxj bxjVar4222 = bxjVar3;
                if (lfmVar != null) {
                }
                return Unit.a;
            case 4:
                j = 9205357640488583168L;
                j2 = 9223372034707292159L;
                float f4 = this.r;
                lfmVar3 = this.p;
                yps ypsVar4 = this.o;
                wqn wqnVar10 = this.n;
                wqn wqnVar11 = (wqn) this.m;
                hur hurVar10 = (hur) this.l;
                lfm lfmVar12 = (lfm) this.k;
                hurVar3 = (hur) this.t;
                qgg.h0(obj);
                f = f4;
                ypsVar = ypsVar4;
                hurVar2 = hurVar10;
                wqnVar2 = wqnVar10;
                lfmVar2 = lfmVar12;
                wqnVar = wqnVar11;
                if (!lfmVar3.b()) {
                }
                break;
            case 5:
                j = 9205357640488583168L;
                j2 = 9223372034707292159L;
                lfmVar4 = (lfm) this.l;
                lfmVar5 = (lfm) this.k;
                hurVar2 = (hur) this.t;
                qgg.h0(obj);
                obj4 = obj;
                List list5 = ((ffm) obj4).a;
                int size4 = list5.size();
                int i8 = 0;
                while (true) {
                    if (i8 < size4) {
                        if (((lfm) list5.get(i8)).b()) {
                            int size5 = list5.size();
                            for (int i9 = 0; i9 < size5; i9++) {
                                if (((lfm) list5.get(i9)).d) {
                                    break;
                                }
                            }
                        } else {
                            i8++;
                        }
                    }
                }
                int size6 = list5.size();
                for (int i10 = 0; i10 < size6; i10++) {
                    if (((lfm) list5.get(i10)).d) {
                        lfm lfmVar13 = (lfm) CollectionsKt.firstOrNull(list5);
                        long g = enj.g(lfmVar13 != null ? lfmVar13.c : 0L, lfmVar5.c);
                        long j6 = lfmVar5.a;
                        int i11 = lfmVar5.i;
                        if (wna.k(hurVar2.f.t, j6)) {
                            lfmVar2 = lfmVar5;
                            bxjVar = bxjVar3;
                            lfmVar = null;
                            bxjVar3 = bxjVar;
                            if (lfmVar == null) {
                            }
                            bxj bxjVar42222 = bxjVar3;
                            if (lfmVar != null) {
                            }
                            return Unit.a;
                        }
                        f2 = wna.l(hurVar2.c(), i11);
                        wqnVar3 = new wqn();
                        wqnVar3.a = j6;
                        ypsVar2 = new yps(g, bxjVar3);
                        hurVar4 = hurVar2;
                        wqnVar4 = wqnVar6;
                        this.t = hurVar4;
                        this.k = lfmVar5;
                        this.l = hurVar2;
                        this.m = wqnVar4;
                        this.n = wqnVar3;
                        this.o = ypsVar2;
                        this.p = null;
                        this.r = f2;
                        this.s = 6;
                        obj5 = hurVar2.a(gfm.b, this);
                        break;
                    }
                }
                lfmVar2 = lfmVar5;
                lfmVar = lfmVar4;
                if (lfmVar == null) {
                }
                bxj bxjVar422222 = bxjVar3;
                if (lfmVar != null) {
                }
                return Unit.a;
            case 6:
                j = 9205357640488583168L;
                j2 = 9223372034707292159L;
                f2 = this.r;
                yps ypsVar5 = this.o;
                wqn wqnVar12 = this.n;
                wqn wqnVar13 = (wqn) this.m;
                hur hurVar11 = (hur) this.l;
                lfm lfmVar14 = (lfm) this.k;
                hur hurVar12 = (hur) this.t;
                qgg.h0(obj);
                obj5 = obj;
                ypsVar2 = ypsVar5;
                wqnVar3 = wqnVar12;
                hurVar2 = hurVar11;
                lfmVar5 = lfmVar14;
                wqnVar4 = wqnVar13;
                hurVar4 = hurVar12;
                ffm ffmVar2 = (ffm) obj5;
                List list6 = ffmVar2.a;
                int size7 = list6.size();
                int i12 = 0;
                while (true) {
                    if (i12 < size7) {
                        Object obj12 = list6.get(i12);
                        bxjVar = bxjVar3;
                        List list7 = list6;
                        int i13 = size7;
                        int i14 = i12;
                        if (ywf.u(((lfm) obj12).a, wqnVar3.a)) {
                            obj6 = obj12;
                        } else {
                            i12 = i14 + 1;
                            size7 = i13;
                            bxjVar3 = bxjVar;
                            list6 = list7;
                        }
                    } else {
                        bxjVar = bxjVar3;
                        obj6 = null;
                    }
                }
                lfmVar7 = (lfm) obj6;
                if (lfmVar7 != null && !lfmVar7.b()) {
                    if (swf.B(lfmVar7)) {
                        List list8 = ffmVar2.a;
                        int size8 = list8.size();
                        int i15 = 0;
                        while (true) {
                            if (i15 < size8) {
                                obj7 = list8.get(i15);
                                if (!((lfm) obj7).d) {
                                    i15++;
                                }
                            } else {
                                obj7 = null;
                            }
                        }
                        lfm lfmVar15 = (lfm) obj7;
                        if (lfmVar15 != null) {
                            wqnVar3.a = lfmVar15.a;
                        }
                    } else if ((ypsVar2.a(lfmVar7, f2) & j2) == j) {
                        gfm gfmVar4 = gfm.c;
                        this.t = hurVar4;
                        this.k = lfmVar5;
                        this.l = hurVar2;
                        this.m = wqnVar4;
                        this.n = wqnVar3;
                        this.o = ypsVar2;
                        this.p = lfmVar7;
                        this.r = f2;
                        this.s = 7;
                        break;
                    } else {
                        lfmVar7.a();
                        wqnVar4.a = swf.f0(lfmVar7, false);
                        if (lfmVar7.b()) {
                            hurVar2 = hurVar4;
                            lfmVar2 = lfmVar5;
                            lfmVar = lfmVar7;
                            bxjVar3 = bxjVar;
                            if (lfmVar == null) {
                            }
                            bxj bxjVar4222222 = bxjVar3;
                            if (lfmVar != null) {
                            }
                            return Unit.a;
                        }
                        ypsVar2.b = 0L;
                    }
                    bxjVar3 = bxjVar;
                    this.t = hurVar4;
                    this.k = lfmVar5;
                    this.l = hurVar2;
                    this.m = wqnVar4;
                    this.n = wqnVar3;
                    this.o = ypsVar2;
                    this.p = null;
                    this.r = f2;
                    this.s = 6;
                    obj5 = hurVar2.a(gfm.b, this);
                    break;
                }
                hurVar2 = hurVar4;
                lfmVar2 = lfmVar5;
                lfmVar = null;
                bxjVar3 = bxjVar;
                if (lfmVar == null) {
                }
                bxj bxjVar42222222 = bxjVar3;
                if (lfmVar != null) {
                }
                return Unit.a;
            case 7:
                f2 = this.r;
                lfmVar7 = this.p;
                yps ypsVar6 = this.o;
                j = 9205357640488583168L;
                wqn wqnVar14 = this.n;
                wqn wqnVar15 = (wqn) this.m;
                j2 = 9223372034707292159L;
                hur hurVar13 = (hur) this.l;
                lfm lfmVar16 = (lfm) this.k;
                hur hurVar14 = (hur) this.t;
                qgg.h0(obj);
                wqnVar3 = wqnVar14;
                lfmVar5 = lfmVar16;
                bxjVar = bxjVar3;
                wqnVar4 = wqnVar15;
                hurVar2 = hurVar13;
                hurVar4 = hurVar14;
                ypsVar2 = ypsVar6;
                if (lfmVar7.b()) {
                    hurVar2 = hurVar4;
                    lfmVar2 = lfmVar5;
                    lfmVar = null;
                    bxjVar3 = bxjVar;
                    if (lfmVar == null) {
                    }
                    bxj bxjVar422222222 = bxjVar3;
                    if (lfmVar != null) {
                    }
                    return Unit.a;
                }
                bxjVar3 = bxjVar;
                this.t = hurVar4;
                this.k = lfmVar5;
                this.l = hurVar2;
                this.m = wqnVar4;
                this.n = wqnVar3;
                this.o = ypsVar2;
                this.p = null;
                this.r = f2;
                this.s = 6;
                obj5 = hurVar2.a(gfm.b, this);
                break;
            case 8:
                wqnVar5 = this.n;
                hurVar6 = (hur) this.m;
                bxj bxjVar5 = (bxj) this.l;
                function2 = (Function2) this.k;
                hurVar5 = (hur) this.t;
                qgg.h0(obj);
                bxjVar2 = bxjVar5;
                lfmVar8 = null;
                a = obj;
                ffm ffmVar3 = (ffm) a;
                List list9 = ffmVar3.a;
                int size9 = list9.size();
                int i16 = 0;
                while (true) {
                    if (i16 < size9) {
                        obj8 = list9.get(i16);
                        List list10 = list9;
                        int i17 = size9;
                        if (!ywf.u(((lfm) obj8).a, wqnVar5.a)) {
                            i16++;
                            size9 = i17;
                            list9 = list10;
                        }
                    } else {
                        obj8 = lfmVar8;
                    }
                }
                lfm lfmVar17 = (lfm) obj8;
                if (lfmVar17 != null) {
                    if (!swf.B(lfmVar17)) {
                        long f0 = swf.f0(lfmVar17, true);
                        break;
                    } else {
                        List list11 = ffmVar3.a;
                        int size10 = list11.size();
                        int i18 = 0;
                        while (true) {
                            if (i18 < size10) {
                                obj9 = list11.get(i18);
                                if (!((lfm) obj9).d) {
                                    i18++;
                                }
                            } else {
                                obj9 = lfmVar8;
                            }
                        }
                        lfm lfmVar18 = (lfm) obj9;
                        if (lfmVar18 != null) {
                            wqnVar5.a = lfmVar18.a;
                        }
                    }
                    this.t = hurVar5;
                    this.k = function2;
                    this.l = bxjVar2;
                    this.m = hurVar6;
                    this.n = wqnVar5;
                    lfmVar8 = null;
                    this.o = null;
                    this.p = null;
                    this.s = 8;
                    a = hurVar6.a(gfm.b, this);
                    break;
                } else {
                    lfmVar17 = lfmVar8;
                }
                if (lfmVar17 == null || lfmVar17.b()) {
                    lfmVar6 = lfmVar8;
                } else if (swf.B(lfmVar17)) {
                    lfmVar6 = lfmVar17;
                } else {
                    function2.invoke(lfmVar17, new enj(swf.f0(lfmVar17, false)));
                    lfmVar17.a();
                    hurVar2 = hurVar5;
                    j3 = lfmVar17.a;
                    wqn wqnVar92 = new wqn();
                    wqnVar92.a = j3;
                    hurVar6 = hurVar2;
                    wqnVar5 = wqnVar92;
                    hurVar5 = hurVar6;
                    this.t = hurVar5;
                    this.k = function2;
                    this.l = bxjVar2;
                    this.m = hurVar6;
                    this.n = wqnVar5;
                    lfmVar8 = null;
                    this.o = null;
                    this.p = null;
                    this.s = 8;
                    a = hurVar6.a(gfm.b, this);
                }
                if (lfmVar6 != null) {
                }
                return Unit.a;
            default:
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
