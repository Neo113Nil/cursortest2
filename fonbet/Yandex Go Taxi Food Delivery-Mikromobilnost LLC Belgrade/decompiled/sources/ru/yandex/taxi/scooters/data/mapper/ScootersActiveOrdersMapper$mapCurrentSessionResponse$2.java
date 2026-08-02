package ru.yandex.taxi.scooters.data.mapper;

import com.yandex.go.scooters.api.domain.model.ScootersInsuranceType;
import com.yandex.go.scooters.api.domain.model.ScootersSessionType;
import com.yandex.go.scooters.api.domain.model.ScootersVehicleType;
import defpackage.a1r0;
import defpackage.avj0;
import defpackage.d1r0;
import defpackage.ea7;
import defpackage.ea90;
import defpackage.evu0;
import defpackage.fdy0;
import defpackage.fef;
import defpackage.g1r0;
import defpackage.gwk0;
import defpackage.ha7;
import defpackage.ief;
import defpackage.j1r0;
import defpackage.j48;
import defpackage.ja7;
import defpackage.jl40;
import defpackage.kqm0;
import defpackage.kyh0;
import defpackage.l2o0;
import defpackage.lrj0;
import defpackage.m1r0;
import defpackage.mvg;
import defpackage.nrk0;
import defpackage.ny61;
import defpackage.odz;
import defpackage.oqm0;
import defpackage.p1r0;
import defpackage.pdz;
import defpackage.qqm0;
import defpackage.qv10;
import defpackage.r7p0;
import defpackage.rhf;
import defpackage.rqm0;
import defpackage.s1r0;
import defpackage.se90;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.xmp;
import defpackage.yxq0;
import defpackage.zuo0;
import defpackage.zy11;
import defpackage.zzs;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lsqm0;", "<anonymous>", "(Ltse;)Lsqm0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.scooters.data.mapper.ScootersActiveOrdersMapper$mapCurrentSessionResponse$2", f = "ScootersActiveOrdersMapper.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class ScootersActiveOrdersMapper$mapCurrentSessionResponse$2 extends SuspendLambda implements wls {
    final /* synthetic */ rhf $response;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersActiveOrdersMapper$mapCurrentSessionResponse$2(a aVar, rhf rhfVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$response = rhfVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersActiveOrdersMapper$mapCurrentSessionResponse$2(this.this$0, this.$response, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersActiveOrdersMapper$mapCurrentSessionResponse$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r28v15, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v21, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v40, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v69, types: [java.util.List] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List list;
        Object obj2;
        Iterator it;
        zuo0 zuo0Var;
        String str;
        int i;
        Long c;
        p1r0 a;
        Integer b;
        p1r0 a2;
        Integer c2;
        String d;
        ?? c3;
        fdy0 d2;
        fdy0 d3;
        fdy0 d4;
        p1r0 a3;
        Integer a4;
        p1r0 a5;
        Integer c4;
        String d5;
        ?? c5;
        fdy0 d6;
        fdy0 d7;
        fdy0 d8;
        p1r0 a6;
        Integer b2;
        Long a7;
        p1r0 a8;
        Integer c6;
        String d9;
        ?? c7;
        fdy0 d10;
        fdy0 d11;
        fdy0 d12;
        String str2;
        Long b3;
        p1r0 a9;
        Integer c8;
        String d13;
        ?? c9;
        fdy0 d14;
        fdy0 d15;
        fdy0 d16;
        xmp f;
        ja7 a10;
        s1r0 a11;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        a aVar = this.this$0;
        rhf rhfVar = this.$response;
        aVar.getClass();
        List list2 = rhfVar.a;
        List list3 = rhfVar.b;
        List list4 = list2;
        if (list4 != null && !list4.isEmpty() && (list = list3) != null && !list.isEmpty()) {
            List list5 = rhfVar.a;
            ArrayList arrayList = new ArrayList();
            Iterator it2 = list5.iterator();
            while (it2.hasNext()) {
                yxq0 yxq0Var = (yxq0) it2.next();
                Iterator it3 = list3.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it3.next();
                    j48 j48Var = (j48) obj2;
                    a1r0 a12 = yxq0Var.getA();
                    if (jl40.l(a12 != null ? a12.getC() : null, j48Var.getA())) {
                        break;
                    }
                }
                j48 j48Var2 = (j48) obj2;
                ief b4 = yxq0Var.getB();
                kqm0 kqm0Var = aVar.e;
                a1r0 a13 = yxq0Var.getA();
                if ((a13 == null || (a11 = a13.getA()) == null) ? false : jl40.l(a11.getC(), Boolean.FALSE)) {
                    d1r0 e = yxq0Var.getA().getE();
                    if ((e != null ? e.getA() : null) != null) {
                        g1r0 b5 = yxq0Var.getA().getE().getB();
                        if ((b5 != null ? b5.getD() : null) != null) {
                            ArrayList arrayList2 = new ArrayList();
                            if (j48Var2 != null && (f = j48Var2.getF()) != null && (a10 = f.getA()) != null && !jl40.l(a10.getA(), Boolean.FALSE)) {
                                ha7 b6 = a10.getB();
                                if (b6 == null) {
                                    arrayList2.add(odz.a);
                                } else if (b6 instanceof ea7) {
                                    arrayList2.add(new pdz(((ea7) b6).getA()));
                                }
                            }
                            m1r0 f2 = qv10.f(yxq0Var);
                            String b7 = f2 != null ? f2.getB() : null;
                            String str3 = b7 == null ? "" : b7;
                            ScootersInsuranceType a14 = aVar.d.a().b().a();
                            fef h = b4 != null ? gwk0.h(b4) : null;
                            int i2 = qqm0.a[yxq0Var.getA().getE().getA().ordinal()];
                            fef fefVar = fef.e;
                            EmptyList emptyList = EmptyList.a;
                            long j = 0;
                            if (i2 == 1) {
                                it = it2;
                                if (yxq0Var.getA().getE().getB().getD().intValue() > 0) {
                                    Long a15 = yxq0Var.getA().getA().getA();
                                    long longValue = a15 != null ? a15.longValue() : 0L;
                                    String b8 = yxq0Var.getA().getA().getB();
                                    if (b8 == null) {
                                        b8 = "";
                                    }
                                    String b9 = j48Var2 != null ? j48Var2.getB() : null;
                                    if (b9 == null) {
                                        b9 = "";
                                    }
                                    String c10 = j48Var2 != null ? j48Var2.getC() : null;
                                    if (c10 == null) {
                                        c10 = "";
                                    }
                                    r7p0 r7p0Var = new r7p0(b9, c10);
                                    String a16 = j48Var2 != null ? j48Var2.getA() : null;
                                    if (a16 == null) {
                                        a16 = "";
                                    }
                                    String g = j48Var2 != null ? j48Var2.getG() : null;
                                    if (g == null) {
                                        g = "";
                                    }
                                    ScootersVehicleType g2 = a.g(j48Var2 != null ? j48Var2.getJ() : null);
                                    String h2 = j48Var2 != null ? j48Var2.getH() : null;
                                    if (h2 == null) {
                                        h2 = "";
                                    }
                                    String i3 = j48Var2 != null ? j48Var2.getI() : null;
                                    if (i3 == null) {
                                        i3 = "";
                                    }
                                    int b10 = (j48Var2 == null || (d8 = j48Var2.getD()) == null) ? 0 : (int) d8.getB();
                                    int a17 = (j48Var2 == null || (d7 = j48Var2.getD()) == null) ? 0 : d7.getA();
                                    if (j48Var2 != null && (d6 = j48Var2.getD()) != null) {
                                        j = d6.getC();
                                    }
                                    long j2 = j;
                                    zzs c11 = a.c(j48Var2 != null ? j48Var2.getE() : null);
                                    m1r0 f3 = qv10.f(yxq0Var);
                                    EmptyList emptyList2 = (f3 == null || (c5 = f3.getC()) == 0) ? emptyList : c5;
                                    m1r0 f4 = qv10.f(yxq0Var);
                                    zzs d17 = (f4 == null || (d5 = f4.getD()) == null) ? null : a.d(d5);
                                    boolean booleanValue = ((Boolean) kqm0Var.b(str3)).booleanValue();
                                    m1r0 f5 = qv10.f(yxq0Var);
                                    int intValue = (f5 == null || (a5 = f5.getA()) == null || (c4 = a5.getC()) == null) ? 0 : c4.intValue();
                                    m1r0 f6 = qv10.f(yxq0Var);
                                    ScootersSessionType e2 = a.e(f6 != null ? f6.getE() : null);
                                    int intValue2 = yxq0Var.getA().getE().getB().getD().intValue();
                                    m1r0 f7 = qv10.f(yxq0Var);
                                    zuo0Var = new lrj0(longValue, b8, str3, r7p0Var, g, a16, g2, h2, i3, b10, a17, j2, c11, emptyList2, d17, arrayList2, booleanValue, intValue, e2, a14, a.f(yxq0Var.getA().getD()), h == null ? fefVar : h, intValue2, (f7 == null || (a3 = f7.getA()) == null || (a4 = a3.getA()) == null) ? 0 : a4.intValue());
                                } else {
                                    Long a18 = yxq0Var.getA().getA().getA();
                                    long longValue2 = a18 != null ? a18.longValue() : 0L;
                                    String b11 = yxq0Var.getA().getA().getB();
                                    if (b11 == null) {
                                        b11 = "";
                                    }
                                    String b12 = j48Var2 != null ? j48Var2.getB() : null;
                                    if (b12 == null) {
                                        b12 = "";
                                    }
                                    String c12 = j48Var2 != null ? j48Var2.getC() : null;
                                    if (c12 == null) {
                                        c12 = "";
                                    }
                                    r7p0 r7p0Var2 = new r7p0(b12, c12);
                                    String a19 = j48Var2 != null ? j48Var2.getA() : null;
                                    if (a19 == null) {
                                        a19 = "";
                                    }
                                    String g3 = j48Var2 != null ? j48Var2.getG() : null;
                                    if (g3 == null) {
                                        g3 = "";
                                    }
                                    ScootersVehicleType g4 = a.g(j48Var2 != null ? j48Var2.getJ() : null);
                                    String h3 = j48Var2 != null ? j48Var2.getH() : null;
                                    if (h3 == null) {
                                        h3 = "";
                                    }
                                    String i4 = j48Var2 != null ? j48Var2.getI() : null;
                                    if (i4 == null) {
                                        i4 = "";
                                    }
                                    if (j48Var2 == null || (d4 = j48Var2.getD()) == null) {
                                        str = b11;
                                        i = 0;
                                    } else {
                                        str = b11;
                                        i = (int) d4.getB();
                                    }
                                    int a20 = (j48Var2 == null || (d3 = j48Var2.getD()) == null) ? 0 : d3.getA();
                                    long c13 = (j48Var2 == null || (d2 = j48Var2.getD()) == null) ? 0L : d2.getC();
                                    zzs c14 = a.c(j48Var2 != null ? j48Var2.getE() : null);
                                    m1r0 f8 = qv10.f(yxq0Var);
                                    EmptyList emptyList3 = (f8 == null || (c3 = f8.getC()) == 0) ? emptyList : c3;
                                    m1r0 f9 = qv10.f(yxq0Var);
                                    zzs d18 = (f9 == null || (d = f9.getD()) == null) ? null : a.d(d);
                                    boolean booleanValue2 = ((Boolean) kqm0Var.b(str3)).booleanValue();
                                    m1r0 f10 = qv10.f(yxq0Var);
                                    int intValue3 = (f10 == null || (a2 = f10.getA()) == null || (c2 = a2.getC()) == null) ? 0 : c2.intValue();
                                    m1r0 f11 = qv10.f(yxq0Var);
                                    ScootersSessionType e3 = a.e(f11 != null ? f11.getE() : null);
                                    Integer a21 = yxq0Var.getA().getE().getB().getA();
                                    String b13 = yxq0Var.getA().getE().getB().getB();
                                    String b14 = aVar.b(h, a21, b13 != null ? b13 : "");
                                    m1r0 f12 = qv10.f(yxq0Var);
                                    int intValue4 = (f12 == null || (a = f12.getA()) == null || (b = a.getB()) == null) ? 0 : b.intValue();
                                    j1r0 f13 = yxq0Var.getA().getE().getB().getF();
                                    if (f13 != null && (c = f13.getC()) != null) {
                                        j = c.longValue();
                                    }
                                    zuo0Var = new ea90(longValue2, str, str3, r7p0Var2, g3, a19, g4, h3, i4, i, a20, c13, c14, emptyList3, d18, arrayList2, booleanValue2, intValue3, e3, a14, a.f(yxq0Var.getA().getD()), h == null ? fefVar : h, b14, intValue4, j);
                                }
                            } else if (i2 == 2) {
                                it = it2;
                                Long a22 = yxq0Var.getA().getA().getA();
                                long longValue3 = a22 != null ? a22.longValue() : 0L;
                                String b15 = yxq0Var.getA().getA().getB();
                                if (b15 == null) {
                                    b15 = "";
                                }
                                String b16 = j48Var2 != null ? j48Var2.getB() : null;
                                if (b16 == null) {
                                    b16 = "";
                                }
                                String c15 = j48Var2 != null ? j48Var2.getC() : null;
                                if (c15 == null) {
                                    c15 = "";
                                }
                                r7p0 r7p0Var3 = new r7p0(b16, c15);
                                String a23 = j48Var2 != null ? j48Var2.getA() : null;
                                if (a23 == null) {
                                    a23 = "";
                                }
                                String g5 = j48Var2 != null ? j48Var2.getG() : null;
                                if (g5 == null) {
                                    g5 = "";
                                }
                                ScootersVehicleType g6 = a.g(j48Var2 != null ? j48Var2.getJ() : null);
                                String h4 = j48Var2 != null ? j48Var2.getH() : null;
                                String str4 = h4 == null ? "" : h4;
                                String i5 = j48Var2 != null ? j48Var2.getI() : null;
                                String str5 = i5 == null ? "" : i5;
                                int b17 = (j48Var2 == null || (d12 = j48Var2.getD()) == null) ? 0 : (int) d12.getB();
                                int a24 = (j48Var2 == null || (d11 = j48Var2.getD()) == null) ? 0 : d11.getA();
                                long c16 = (j48Var2 == null || (d10 = j48Var2.getD()) == null) ? 0L : d10.getC();
                                zzs c17 = a.c(j48Var2 != null ? j48Var2.getE() : null);
                                m1r0 f14 = qv10.f(yxq0Var);
                                EmptyList emptyList4 = (f14 == null || (c7 = f14.getC()) == 0) ? emptyList : c7;
                                m1r0 f15 = qv10.f(yxq0Var);
                                zzs d19 = (f15 == null || (d9 = f15.getD()) == null) ? null : a.d(d9);
                                m1r0 f16 = qv10.f(yxq0Var);
                                int intValue5 = (f16 == null || (a8 = f16.getA()) == null || (c6 = a8.getC()) == null) ? 0 : c6.intValue();
                                m1r0 f17 = qv10.f(yxq0Var);
                                ScootersSessionType e4 = a.e(f17 != null ? f17.getE() : null);
                                Integer a25 = yxq0Var.getA().getE().getB().getA();
                                String b18 = yxq0Var.getA().getE().getB().getB();
                                String b19 = aVar.b(h, a25, b18 != null ? b18 : "");
                                j1r0 f18 = yxq0Var.getA().getE().getB().getF();
                                if (f18 != null && (a7 = f18.getA()) != null) {
                                    j = a7.longValue();
                                }
                                long j3 = j;
                                m1r0 f19 = qv10.f(yxq0Var);
                                zuo0Var = new se90(longValue3, b15, str3, r7p0Var3, g5, a23, g6, str4, str5, b17, a24, c16, c17, emptyList4, d19, arrayList2, intValue5, e4, a14, a.f(yxq0Var.getA().getD()), h == null ? fefVar : h, b19, j3, (f19 == null || (a6 = f19.getA()) == null || (b2 = a6.getB()) == null) ? 0 : b2.intValue());
                            } else {
                                if (i2 != 3) {
                                    w511.b();
                                    return null;
                                }
                                Long a26 = yxq0Var.getA().getA().getA();
                                long longValue4 = a26 != null ? a26.longValue() : 0L;
                                String b20 = yxq0Var.getA().getA().getB();
                                if (b20 == null) {
                                    b20 = "";
                                }
                                String b21 = j48Var2 != null ? j48Var2.getB() : null;
                                if (b21 == null) {
                                    b21 = "";
                                }
                                String c18 = j48Var2 != null ? j48Var2.getC() : null;
                                r7p0 r7p0Var4 = new r7p0(b21, c18 == null ? "" : c18);
                                String a27 = j48Var2 != null ? j48Var2.getA() : null;
                                if (a27 == null) {
                                    a27 = "";
                                }
                                String g7 = j48Var2 != null ? j48Var2.getG() : null;
                                if (g7 == null) {
                                    g7 = "";
                                }
                                ScootersVehicleType g8 = a.g(j48Var2 != null ? j48Var2.getJ() : null);
                                String h5 = j48Var2 != null ? j48Var2.getH() : null;
                                if (h5 == null) {
                                    h5 = "";
                                }
                                String i6 = j48Var2 != null ? j48Var2.getI() : null;
                                if (i6 == null) {
                                    i6 = "";
                                }
                                int b22 = (j48Var2 == null || (d16 = j48Var2.getD()) == null) ? 0 : (int) d16.getB();
                                int a28 = (j48Var2 == null || (d15 = j48Var2.getD()) == null) ? 0 : d15.getA();
                                long c19 = (j48Var2 == null || (d14 = j48Var2.getD()) == null) ? 0L : d14.getC();
                                zzs c20 = a.c(j48Var2 != null ? j48Var2.getE() : null);
                                m1r0 f20 = qv10.f(yxq0Var);
                                if (f20 != null && (c9 = f20.getC()) != 0) {
                                    emptyList = c9;
                                }
                                m1r0 f21 = qv10.f(yxq0Var);
                                zzs d20 = (f21 == null || (d13 = f21.getD()) == null) ? null : a.d(d13);
                                m1r0 f22 = qv10.f(yxq0Var);
                                int intValue6 = (f22 == null || (a9 = f22.getA()) == null || (c8 = a9.getC()) == null) ? 0 : c8.intValue();
                                m1r0 f23 = qv10.f(yxq0Var);
                                ScootersSessionType e5 = a.e(f23 != null ? f23.getE() : null);
                                String b23 = j48Var2 != null ? j48Var2.getB() : null;
                                String str6 = b23 == null ? "" : b23;
                                Long g9 = yxq0Var.getA().getE().getB().getG();
                                it = it2;
                                Integer a29 = yxq0Var.getA().getE().getB().getA();
                                String b24 = yxq0Var.getA().getE().getB().getB();
                                String obj3 = evu0.k0(aVar.b(h, a29, b24 != null ? b24 : "")).toString();
                                if (g9 == null || g9.longValue() <= 0) {
                                    str2 = a27;
                                } else {
                                    str2 = a27;
                                    obj3 = ((avj0) aVar.b).i(kyh0.scooters_remaining_pass_minutes, obj3, g9);
                                }
                                String str7 = obj3;
                                Integer c21 = yxq0Var.getA().getE().getB().getC();
                                int intValue7 = c21 != null ? c21.intValue() : 0;
                                j1r0 f24 = yxq0Var.getA().getE().getB().getF();
                                if (f24 != null && (b3 = f24.getB()) != null) {
                                    j = b3.longValue();
                                }
                                zuo0Var = new nrk0(longValue4, b20, str3, r7p0Var4, g7, str2, g8, h5, i6, b22, a28, c19, c20, emptyList, d20, arrayList2, intValue6, e5, a14, a.f(yxq0Var.getA().getD()), h == null ? fefVar : h, str6, str7, intValue7, j);
                            }
                        }
                    }
                    it = it2;
                    zuo0Var = null;
                } else {
                    it = it2;
                    zuo0Var = null;
                }
                if (zuo0Var != null) {
                    arrayList.add(zuo0Var);
                }
                it2 = it;
            }
            List x0 = kotlin.collections.a.x0(arrayList, new rqm0());
            if (!x0.isEmpty()) {
                return new oqm0(x0);
            }
        }
        return l2o0.a;
    }
}
