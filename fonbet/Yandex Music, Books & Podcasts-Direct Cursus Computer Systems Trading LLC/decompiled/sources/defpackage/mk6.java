package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class mk6 extends h7o implements Function2 {
    public lfm k;
    public wqn l;
    public float m;
    public float n;
    public float o;
    public long p;
    public int q;
    public int r;
    public /* synthetic */ Object s;
    public final /* synthetic */ mt4 t;
    public final /* synthetic */ lk6 u;
    public final /* synthetic */ mt4 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mk6(mt4 mt4Var, lk6 lk6Var, mt4 mt4Var2, Continuation continuation) {
        super(2, continuation);
        gfm gfmVar = gfm.a;
        this.t = mt4Var;
        this.u = lk6Var;
        this.v = mt4Var2;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        gfm gfmVar = gfm.a;
        mk6 mk6Var = new mk6(this.t, this.u, this.v, continuation);
        mk6Var.s = obj;
        return mk6Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((mk6) create((hur) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:143:0x00d7, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0287, code lost:
    
        if (defpackage.enj.c(r3, 0) == false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x00a8, code lost:
    
        if (r7 != r3) goto L18;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:84:0x00a8 -> B:6:0x00ab). Please report as a decompilation issue!!! */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        float f;
        Object b;
        long j;
        float f2;
        float f3;
        int i;
        lfm lfmVar;
        float f4;
        float f5;
        float f6;
        float f7;
        int i2;
        long j2;
        wqn wqnVar;
        Object a;
        gfm gfmVar;
        hur hurVar;
        nm6 nm6Var;
        float f8;
        boolean z;
        List list;
        float f9;
        Object obj2;
        float f10;
        List<lfm> list2;
        float f11;
        float f12;
        boolean z2;
        List list3;
        float f13;
        int i3;
        float f14;
        float f15;
        gfm gfmVar2 = gfm.a;
        hur hurVar2 = (hur) this.s;
        nm6 nm6Var2 = nm6.a;
        int i4 = this.r;
        if (i4 == 0) {
            qgg.h0(obj);
            f = hurVar2.c().f();
            this.s = hurVar2;
            this.m = 0.0f;
            this.n = 1.0f;
            this.p = 0L;
            this.q = 0;
            this.o = f;
            this.r = 1;
            b = g6s.b(hurVar2, false, gfmVar2, this);
            if (b != nm6Var2) {
                j = 0;
                f2 = 1.0f;
                f3 = 0.0f;
                i = 0;
            }
            return nm6Var2;
        }
        if (i4 != 1) {
            if (i4 != 2) {
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            f = this.o;
            i2 = this.q;
            j2 = this.p;
            f6 = this.n;
            f7 = this.m;
            wqnVar = this.l;
            lfmVar = this.k;
            qgg.h0(obj);
            f4 = 1.0f;
            f5 = 0.0f;
            a = obj;
            ffm ffmVar = (ffm) a;
            List list4 = ffmVar.a;
            List list5 = list4;
            if (!(list5 instanceof Collection) || !list5.isEmpty()) {
                Iterator it = list5.iterator();
                while (it.hasNext()) {
                    if (((lfm) it.next()).b()) {
                        break;
                    }
                }
            }
            boolean z3 = false;
            if (z3) {
                gfmVar = gfmVar2;
                hurVar = hurVar2;
                nm6Var = nm6Var2;
                f8 = f;
                z = z3;
                list = list4;
                f9 = f7;
            } else {
                List list6 = list4;
                Iterator it2 = list6.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        gfmVar = gfmVar2;
                        hurVar = hurVar2;
                        nm6Var = nm6Var2;
                        f8 = f;
                        obj2 = null;
                        break;
                    }
                    obj2 = it2.next();
                    gfmVar = gfmVar2;
                    hurVar = hurVar2;
                    nm6Var = nm6Var2;
                    f8 = f;
                    if (ywf.u(((lfm) obj2).a, wqnVar.a)) {
                        break;
                    }
                    hurVar2 = hurVar;
                    gfmVar2 = gfmVar;
                    nm6Var2 = nm6Var;
                    f = f8;
                }
                lfm lfmVar2 = (lfm) obj2;
                if (lfmVar2 == null) {
                    lfmVar2 = (lfm) CollectionsKt.Q(list4);
                }
                lfm lfmVar3 = lfmVar2;
                wqnVar.a = lfmVar3.a;
                List list7 = list4;
                int size = list7.size();
                int i5 = 0;
                int i6 = 0;
                while (i5 < size) {
                    lfm lfmVar4 = lfmVar3;
                    lfm lfmVar5 = (lfm) list4.get(i5);
                    List list8 = list7;
                    i6 += (lfmVar5.h && lfmVar5.d) ? 1 : 0;
                    i5++;
                    list7 = list8;
                    lfmVar3 = lfmVar4;
                }
                lfm lfmVar6 = lfmVar3;
                List list9 = list7;
                if (i6 < 2) {
                    z = z3;
                    list2 = list6;
                    list = list4;
                    f11 = f7;
                    f12 = f5;
                    z2 = true;
                    f10 = 180.0f;
                } else {
                    long y = q5g.y(ffmVar, true);
                    f10 = 180.0f;
                    long y2 = q5g.y(ffmVar, false);
                    int size2 = list9.size();
                    z = z3;
                    float f16 = f5;
                    float f17 = f16;
                    int i7 = 0;
                    while (i7 < size2) {
                        int i8 = i7;
                        lfm lfmVar7 = (lfm) list4.get(i7);
                        List list10 = list6;
                        if (lfmVar7.d && lfmVar7.h) {
                            list3 = list4;
                            long j3 = lfmVar7.c;
                            f13 = f7;
                            long g = enj.g(lfmVar7.g, y2);
                            long g2 = enj.g(j3, y);
                            float v = q5g.v(g2) - q5g.v(g);
                            float d = enj.d(enj.h(g2, g)) / 2.0f;
                            if (v > 180.0f) {
                                v -= 360.0f;
                            } else if (v < -180.0f) {
                                v += 360.0f;
                            }
                            f17 = (v * d) + f17;
                            f16 += d;
                        } else {
                            list3 = list4;
                            f13 = f7;
                        }
                        i7 = i8 + 1;
                        f7 = f13;
                        list6 = list10;
                        list4 = list3;
                    }
                    list2 = list6;
                    list = list4;
                    f11 = f7;
                    f12 = f16 == f5 ? f5 : f17 / f16;
                    z2 = true;
                }
                float z4 = q5g.z(ffmVar, z2);
                float z5 = q5g.z(ffmVar, false);
                float f18 = (z4 == f5 || z5 == f5) ? f4 : z4 / z5;
                long A = q5g.A(ffmVar);
                if (i2 == 0) {
                    f14 = f11 + f12;
                    f6 *= f18;
                    j2 = enj.h(j2, A);
                    float z6 = q5g.z(ffmVar, false);
                    i3 = (Math.abs(((float) 1) - f6) * z6 > f8 || Math.abs(((3.1415927f * f14) * z6) / f10) > f8 || enj.d(j2) > f8) ? 1 : i2;
                } else {
                    i3 = i2;
                    f14 = f11;
                }
                if (i3 != 0) {
                    long y3 = q5g.y(ffmVar, false);
                    ArrayList arrayList = new ArrayList();
                    Iterator it3 = list2.iterator();
                    while (it3.hasNext()) {
                        Object next = it3.next();
                        Iterator it4 = it3;
                        if (((lfm) next).d) {
                            arrayList.add(next);
                        }
                        it3 = it4;
                    }
                    boolean z7 = arrayList.size() > 1;
                    if (f12 == f5 && f18 == f4) {
                        f15 = f14;
                    } else {
                        f15 = f14;
                    }
                    this.u.b(lfmVar6, new enj(A), Boolean.valueOf(z7), new enj(y3), new Float(f18), new Float(f12));
                    for (lfm lfmVar8 : list2) {
                        if (!enj.c(swf.f0(lfmVar8, false), 0L)) {
                            lfmVar8.a();
                        }
                    }
                } else {
                    f15 = f14;
                }
                f9 = f15;
                i2 = i3;
                lfmVar = lfmVar6;
            }
            if (!z) {
                List list11 = list;
                if (!(list11 instanceof Collection) || !list11.isEmpty()) {
                    Iterator it5 = list11.iterator();
                    while (it5.hasNext()) {
                        if (((lfm) it5.next()).d) {
                            hurVar2 = hurVar;
                            gfmVar2 = gfmVar;
                            nm6Var2 = nm6Var;
                            f = f8;
                            f7 = f9;
                            this.s = hurVar2;
                            this.k = lfmVar;
                            this.l = wqnVar;
                            this.m = f7;
                            this.n = f6;
                            this.p = j2;
                            this.q = i2;
                            this.o = f;
                            this.r = 2;
                            a = hurVar2.a(gfmVar2, this);
                        }
                    }
                }
            }
            this.v.invoke(lfmVar);
            return Unit.a;
        }
        f = this.o;
        int i9 = this.q;
        long j4 = this.p;
        float f19 = this.n;
        f3 = this.m;
        qgg.h0(obj);
        i = i9;
        f2 = f19;
        j = j4;
        b = obj;
        lfmVar = (lfm) b;
        this.t.invoke(lfmVar);
        wqn wqnVar2 = new wqn();
        f4 = 1.0f;
        f5 = 0.0f;
        wqnVar2.a = lfmVar.a;
        f6 = f2;
        f7 = f3;
        i2 = i;
        j2 = j;
        wqnVar = wqnVar2;
        this.s = hurVar2;
        this.k = lfmVar;
        this.l = wqnVar;
        this.m = f7;
        this.n = f6;
        this.p = j2;
        this.q = i2;
        this.o = f;
        this.r = 2;
        a = hurVar2.a(gfmVar2, this);
    }
}
