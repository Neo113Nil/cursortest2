package defpackage;

import android.os.Parcelable;
import androidx.compose.animation.c;
import androidx.compose.foundation.e;
import androidx.compose.foundation.layout.d;
import androidx.compose.runtime.internal.a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* loaded from: classes.dex */
public final class zl0 extends uif implements pyc {
    public final /* synthetic */ int r;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object t;
    public final /* synthetic */ Object u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zl0(int i, Object obj, Object obj2, Object obj3) {
        super(3);
        this.r = i;
        this.s = obj;
        this.t = obj2;
        this.u = obj3;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        double d;
        int i = this.r;
        uoi uoiVar = null;
        int i2 = 1;
        Object obj4 = this.u;
        Object obj5 = this.t;
        Object obj6 = this.s;
        int i3 = 0;
        switch (i) {
            case 0:
                ((Number) obj3).intValue();
                oq5 oq5Var = (oq5) ((hq5) obj2);
                oq5Var.Z(1840112047);
                yci f = ((yci) obj).f(c.a(((am0) obj6).a(), (e9b) obj5, (vpb) obj4, "animateEnterExit", oq5Var, 0));
                oq5Var.p(false);
                return f;
            case 1:
                oho ohoVar = (oho) obj;
                hq5 hq5Var = (hq5) obj2;
                int intValue = ((Number) obj3).intValue();
                hz2 hz2Var = b2c.l;
                Function2 function2 = (Function2) obj6;
                if ((intValue & 6) == 0) {
                    intValue |= ((oq5) hq5Var).f(ohoVar) ? 4 : 2;
                }
                oq5 oq5Var2 = (oq5) hq5Var;
                if (oq5Var2.P(intValue & 1, (intValue & 19) != 18)) {
                    if (function2 == null) {
                        oq5Var2.Z(1108917613);
                        u1g.l(oq5Var2, sp0.c);
                        oq5Var2.p(false);
                        d = 0.5d;
                    } else {
                        oq5Var2.Z(1108983209);
                        yci yciVar = sp0.d;
                        nho a = lho.a(qx0.a, hz2Var, oq5Var2, 48);
                        d = 0.5d;
                        int i4 = oq5Var2.P;
                        a l = oq5Var2.l();
                        yci H = vnj.H(oq5Var2, yciVar);
                        xp5.T.getClass();
                        grb grbVar = wp5.b;
                        oq5Var2.d0();
                        if (oq5Var2.O) {
                            oq5Var2.k(grbVar);
                        } else {
                            oq5Var2.n0();
                        }
                        g0g.U(oq5Var2, a, wp5.f);
                        g0g.U(oq5Var2, l, wp5.e);
                        kb5 kb5Var = wp5.g;
                        if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i4))) {
                            ouj.x(i4, oq5Var2, i4, kb5Var);
                        }
                        g0g.U(oq5Var2, H, wp5.d);
                        qs5 qs5Var = mb6.a;
                        long j = ((d85) oq5Var2.j(sb6.a)).a;
                        etn.l(qs5Var.a(Float.valueOf((!((ma5) oq5Var2.j(pa5.a)).g() ? ((double) c3x.N(j)) < 0.5d : ((double) c3x.N(j)) > 0.5d) ? 0.87f : 1.0f)), function2, oq5Var2, 8);
                        oq5Var2.p(true);
                        oq5Var2.p(false);
                    }
                    yci a2 = ohoVar.a(1.0f, d.b(vci.a, 1.0f), true);
                    wn5 wn5Var = (wn5) obj5;
                    nho a3 = lho.a(qx0.a, hz2Var, oq5Var2, 48);
                    int i5 = oq5Var2.P;
                    a l2 = oq5Var2.l();
                    yci H2 = vnj.H(oq5Var2, a2);
                    xp5.T.getClass();
                    grb grbVar2 = wp5.b;
                    oq5Var2.d0();
                    if (oq5Var2.O) {
                        oq5Var2.k(grbVar2);
                    } else {
                        oq5Var2.n0();
                    }
                    g0g.U(oq5Var2, a3, wp5.f);
                    g0g.U(oq5Var2, l2, wp5.e);
                    kb5 kb5Var2 = wp5.g;
                    if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i5))) {
                        ouj.x(i5, oq5Var2, i5, kb5Var2);
                    }
                    g0g.U(oq5Var2, H2, wp5.d);
                    xcs.a(((udt) oq5Var2.j(wdt.b)).f, ild.C(-1654084516, new pp0(wn5Var, i3), oq5Var2), oq5Var2, 48);
                    oq5Var2.p(true);
                    qs5 qs5Var2 = mb6.a;
                    long j2 = ((d85) oq5Var2.j(sb6.a)).a;
                    etn.l(qs5Var2.a(Float.valueOf((!((ma5) oq5Var2.j(pa5.a)).g() ? ((double) c3x.N(j2)) < d : ((double) c3x.N(j2)) > d) ? 0.6f : 0.74f)), ild.C(2129753671, new y5(4, (pyc) obj4), oq5Var2), oq5Var2, 56);
                } else {
                    oq5Var2.S();
                }
                return Unit.a;
            case 2:
                Function1 function1 = (Function1) obj2;
                Function1 function12 = (Function1) obj3;
                ((mif) obj).getClass();
                function1.getClass();
                function12.getClass();
                try {
                    jyr jyrVar = s9k.a;
                    s9k.a(((dj2) obj6).a, (e9k) obj5, (String) obj4);
                    function1.invoke(Boolean.TRUE);
                } catch (Throwable th) {
                    String message = th.getMessage();
                    if (message == null) {
                        message = th.getClass().getName();
                    }
                    function12.invoke(new r7w(message, th));
                }
                return Unit.a;
            case 3:
                ((Number) obj3).intValue();
                oq5 oq5Var3 = (oq5) ((hq5) obj2);
                oq5Var3.Z(1969174843);
                yie yieVar = (yie) oq5Var3.j(e.a);
                if (yieVar instanceof cje) {
                    oq5Var3.Z(-1724200443);
                    oq5Var3.p(false);
                } else {
                    oq5Var3.Z(-1724067825);
                    Object K = oq5Var3.K();
                    if (K == gq5.a) {
                        K = vz1.h(oq5Var3);
                    }
                    uoiVar = (uoi) K;
                    oq5Var3.p(false);
                }
                yci g = androidx.compose.foundation.a.g(vci.a, uoiVar, yieVar, true, null, null, (String) obj6, (Function0) obj5, null, (Function0) obj4);
                oq5Var3.p(false);
                return g;
            case 4:
                mif mifVar = (mif) obj;
                Function1 function13 = (Function1) obj2;
                Function1 function14 = (Function1) obj3;
                mifVar.getClass();
                function13.getClass();
                function14.getClass();
                List list = (List) obj6;
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) obj4;
                CountDownLatch countDownLatch = (CountDownLatch) obj5;
                int i6 = 0;
                for (Object obj7 : list) {
                    int i7 = i6 + 1;
                    if (i6 < 0) {
                        u75.n();
                        throw null;
                    }
                    mif mifVar2 = (mif) obj7;
                    mifVar2.getClass();
                    yx7 yx7Var = new yx7(concurrentHashMap, i6, function14, countDownLatch);
                    mif.b(mifVar2, new lif(yx7Var, i3), new lif(yx7Var, i2), 1);
                    i6 = i7;
                }
                countDownLatch.await();
                if (!((s8) mifVar).d.isDone()) {
                    IntRange f2 = u75.f(list);
                    ArrayList arrayList = new ArrayList(v75.o(f2, 10));
                    ype it = f2.iterator();
                    while (it.c) {
                        Object obj8 = concurrentHashMap.get(Integer.valueOf(it.nextInt()));
                        obj8.getClass();
                        arrayList.add(((jif) obj8).a);
                    }
                    function13.invoke(new ArrayList(arrayList));
                }
                return Unit.a;
            case 5:
                Function1 function15 = (Function1) obj2;
                Function1 function16 = (Function1) obj3;
                ((mif) obj).getClass();
                function15.getClass();
                function16.getClass();
                try {
                    function15.invoke((String) ((f9k) obj6).invoke(Long.valueOf(Long.parseLong((String) obj5)), (pz1) obj4));
                } catch (d9k e) {
                    Parcelable.Creator<bfk> creator = bfk.CREATOR;
                    q1c q1cVar = q1c.w;
                    r1c r1cVar = r1c.e;
                    String str = e.a;
                    if (str == null) {
                        str = "PassportAccountNotAuthorizedException";
                    }
                    function16.invoke(new p1c(q1cVar, r1cVar, null, null, str));
                } catch (NoSuchMethodError e2) {
                    function16.invoke(new r7w("Token exchange capabilities are missing in \"passport\". Please, make sure that your host application is configured with \"passport:7.17.0\" or any higher version", e2));
                } catch (Throwable th2) {
                    String message2 = th2.getMessage();
                    if (message2 == null) {
                        message2 = th2.getClass().getName();
                    }
                    function16.invoke(new r7w(message2, th2));
                }
                return Unit.a;
            default:
                zkn zknVar = (zkn) obj;
                hq5 hq5Var2 = (hq5) obj2;
                int intValue2 = ((Number) obj3).intValue();
                if ((intValue2 & 14) == 0) {
                    intValue2 |= ((oq5) hq5Var2).f(zknVar) ? 4 : 2;
                }
                if ((intValue2 & 91) == 18) {
                    oq5 oq5Var4 = (oq5) hq5Var2;
                    if (oq5Var4.z()) {
                        oq5Var4.S();
                        return Unit.a;
                    }
                }
                bs1 k = zknVar.b.k();
                if (k instanceof zr1) {
                    oq5 oq5Var5 = (oq5) hq5Var2;
                    oq5Var5.a0(-418317557);
                    ryc rycVar = (ryc) obj6;
                    if (rycVar != null) {
                        rycVar.invoke(zknVar, k, oq5Var5, Integer.valueOf((intValue2 & 14) | 64));
                        i2 = 0;
                    }
                    oq5Var5.p(false);
                } else if (k instanceof as1) {
                    oq5 oq5Var6 = (oq5) hq5Var2;
                    oq5Var6.a0(-418317557);
                    ryc rycVar2 = (ryc) obj5;
                    if (rycVar2 != null) {
                        rycVar2.invoke(zknVar, k, oq5Var6, Integer.valueOf((intValue2 & 14) | 64));
                        i2 = 0;
                    }
                    oq5Var6.p(false);
                } else if (k instanceof yr1) {
                    oq5 oq5Var7 = (oq5) hq5Var2;
                    oq5Var7.a0(-418317557);
                    ryc rycVar3 = (ryc) obj4;
                    if (rycVar3 != null) {
                        rycVar3.invoke(zknVar, k, oq5Var7, Integer.valueOf((intValue2 & 14) | 64));
                        i2 = 0;
                    }
                    oq5Var7.p(false);
                } else if (k instanceof xr1) {
                    oq5 oq5Var8 = (oq5) hq5Var2;
                    oq5Var8.a0(-418301399);
                    oq5Var8.p(false);
                } else {
                    oq5 oq5Var9 = (oq5) hq5Var2;
                    oq5Var9.a0(-418301339);
                    oq5Var9.p(false);
                }
                if (i2 != 0) {
                    bzf.o(zknVar, null, null, null, null, null, 0.0f, null, false, hq5Var2, intValue2 & 14);
                }
                return Unit.a;
        }
    }
}
