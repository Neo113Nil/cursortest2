package defpackage;

import android.graphics.Matrix;
import androidx.core.app.q;
import com.yandex.pulse.metrics.o;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class zwn extends uif implements Function2 {
    public static final zwn A;
    public static final zwn A0;
    public static final zwn B;
    public static final zwn B0;
    public static final zwn C;
    public static final zwn D;
    public static final zwn E;
    public static final zwn F;
    public static final zwn G;
    public static final zwn H;
    public static final zwn I;
    public static final zwn J;
    public static final zwn K;
    public static final zwn L;
    public static final zwn X;
    public static final zwn Y;
    public static final zwn Z;
    public static final zwn s;
    public static final zwn t;
    public static final zwn u;
    public static final zwn v;
    public static final zwn v0;
    public static final zwn w;
    public static final zwn w0;
    public static final zwn x;
    public static final zwn x0;
    public static final zwn y;
    public static final zwn y0;
    public static final zwn z;
    public static final zwn z0;
    public final /* synthetic */ int r;

    static {
        int i = 2;
        s = new zwn(i, 0);
        t = new zwn(i, 1);
        u = new zwn(i, 2);
        v = new zwn(i, 3);
        w = new zwn(i, 4);
        x = new zwn(i, 5);
        y = new zwn(i, 6);
        z = new zwn(i, 7);
        A = new zwn(i, 8);
        B = new zwn(i, 9);
        C = new zwn(i, 10);
        D = new zwn(i, 11);
        E = new zwn(i, 12);
        F = new zwn(i, 13);
        G = new zwn(i, 14);
        H = new zwn(i, 15);
        I = new zwn(i, 16);
        J = new zwn(i, 17);
        K = new zwn(i, 18);
        L = new zwn(i, 19);
        X = new zwn(i, 20);
        Y = new zwn(i, 21);
        Z = new zwn(i, 22);
        v0 = new zwn(i, 23);
        w0 = new zwn(i, 24);
        x0 = new zwn(i, 25);
        y0 = new zwn(i, 26);
        z0 = new zwn(i, 27);
        A0 = new zwn(i, 28);
        B0 = new zwn(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zwn(int i, int i2) {
        super(i);
        this.r = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        un0 un0Var;
        Object a;
        int i = 0;
        switch (this.r) {
            case 0:
                ((f18) obj).B((Matrix) obj2);
                return Unit.a;
            case 1:
                ynn ynnVar = (ynn) obj;
                ynn ynnVar2 = (ynn) obj2;
                ynnVar.getClass();
                ynnVar2.getClass();
                float f = ynnVar.b;
                float f2 = ynnVar.d;
                float f3 = enj.f(ynnVar2.c());
                return Boolean.valueOf(f3 >= f && f3 < f2);
            case 2:
                ynn ynnVar3 = (ynn) obj;
                ynn ynnVar4 = (ynn) obj2;
                ynnVar3.getClass();
                ynnVar4.getClass();
                float f4 = ynnVar3.a;
                float f5 = ynnVar3.c;
                float e = enj.e(ynnVar4.c());
                return Boolean.valueOf(e >= f4 && e < f5);
            case 3:
                ((j3b) obj).c = (ukd) obj2;
                return Unit.a;
            case 4:
                ((j3b) obj).e = ((e40) obj2).a;
                return Unit.a;
            case 5:
                ((j3b) obj).d = ((d40) obj2).a;
                return Unit.a;
            case 6:
                ioo iooVar = (ioo) obj2;
                Map map = iooVar.a;
                tpi tpiVar = iooVar.b;
                Object[] objArr = tpiVar.b;
                Object[] objArr2 = tpiVar.c;
                long[] jArr = tpiVar.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i2 = 0;
                    while (true) {
                        long j = jArr[i2];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i3 = 8 - ((~(i2 - length)) >>> 31);
                            for (int i4 = 0; i4 < i3; i4++) {
                                if ((255 & j) < 128) {
                                    int i5 = (i2 << 3) + i4;
                                    Object obj3 = objArr[i5];
                                    Map d = ((koo) objArr2[i5]).d();
                                    if (d.isEmpty()) {
                                        map.remove(obj3);
                                    } else {
                                        map.put(obj3, d);
                                    }
                                }
                                j >>= 8;
                            }
                            if (i3 != 8) {
                            }
                        }
                        if (i2 != length) {
                            i2++;
                        }
                    }
                }
                if (map.isEmpty()) {
                    return null;
                }
                return map;
            case 7:
                return obj2;
            case 8:
                mn0 mn0Var = (mn0) obj2;
                String str = mn0Var.b;
                apo apoVar = fpo.a;
                return u75.d(str, fpo.a(mn0Var.a, fpo.a, (goo) obj));
            case 9:
                goo gooVar = (goo) obj;
                List list = (List) obj2;
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                while (i < size) {
                    arrayList.add(fpo.a((ln0) list.get(i), fpo.b, gooVar));
                    i++;
                }
                return arrayList;
            case 10:
                goo gooVar2 = (goo) obj;
                ln0 ln0Var = (ln0) obj2;
                Object obj4 = ln0Var.a;
                if (obj4 instanceof x5k) {
                    un0Var = un0.a;
                } else if (obj4 instanceof c4r) {
                    un0Var = un0.b;
                } else if (obj4 instanceof e0u) {
                    un0Var = un0.c;
                } else if (obj4 instanceof ppt) {
                    un0Var = un0.d;
                } else if (obj4 instanceof o7g) {
                    un0Var = un0.e;
                } else if (obj4 instanceof n7g) {
                    un0Var = un0.f;
                } else {
                    if (!(obj4 instanceof dkr)) {
                        q.i();
                        return null;
                    }
                    un0Var = un0.g;
                }
                switch (un0Var.ordinal()) {
                    case 0:
                        obj4.getClass();
                        a = fpo.a((x5k) obj4, fpo.g, gooVar2);
                        break;
                    case 1:
                        obj4.getClass();
                        a = fpo.a((c4r) obj4, fpo.h, gooVar2);
                        break;
                    case 2:
                        obj4.getClass();
                        a = fpo.a((e0u) obj4, fpo.c, gooVar2);
                        break;
                    case 3:
                        obj4.getClass();
                        a = fpo.a((ppt) obj4, fpo.d, gooVar2);
                        break;
                    case 4:
                        obj4.getClass();
                        a = fpo.a((o7g) obj4, fpo.e, gooVar2);
                        break;
                    case 5:
                        obj4.getClass();
                        a = fpo.a((n7g) obj4, fpo.f, gooVar2);
                        break;
                    case 6:
                        obj4.getClass();
                        a = ((dkr) obj4).a;
                        apo apoVar2 = fpo.a;
                        break;
                    default:
                        b6e.s();
                        return null;
                }
                return u75.d(un0Var, a, Integer.valueOf(ln0Var.b), Integer.valueOf(ln0Var.c), ln0Var.d);
            case 11:
                return Float.valueOf(((wu2) obj2).a);
            case 12:
                n7g n7gVar = (n7g) obj2;
                String str2 = n7gVar.a;
                apo apoVar3 = fpo.a;
                return u75.d(str2, fpo.a(n7gVar.b, fpo.i, (goo) obj));
            case 13:
                long j2 = ((d85) obj2).a;
                return j2 == 16 ? Boolean.FALSE : Integer.valueOf(c3x.U(j2));
            case 14:
                return Integer.valueOf(((tqc) obj2).a);
            case 15:
                h6g h6gVar = (h6g) obj2;
                e6g e6gVar = new e6g(h6gVar.a);
                apo apoVar4 = fpo.a;
                return u75.d(e6gVar, new g6g(h6gVar.b), new f6g());
            case 16:
                o7g o7gVar = (o7g) obj2;
                String str3 = o7gVar.a;
                apo apoVar5 = fpo.a;
                return u75.d(str3, fpo.a(o7gVar.b, fpo.i, (goo) obj));
            case 17:
                goo gooVar3 = (goo) obj;
                List list2 = ((bqg) obj2).a;
                ArrayList arrayList2 = new ArrayList(list2.size());
                int size2 = list2.size();
                while (i < size2) {
                    arrayList2.add(fpo.a((zpg) list2.get(i), fpo.t, gooVar3));
                    i++;
                }
                return arrayList2;
            case 18:
                return ((zpg) obj2).a.toLanguageTag();
            case 19:
                long j3 = ((enj) obj2).a;
                if (enj.c(j3, 9205357640488583168L)) {
                    return Boolean.FALSE;
                }
                Float valueOf = Float.valueOf(Float.intBitsToFloat((int) (j3 >> 32)));
                apo apoVar6 = fpo.a;
                return u75.d(valueOf, Float.valueOf(Float.intBitsToFloat((int) (j3 & 4294967295L))));
            case 20:
                goo gooVar4 = (goo) obj;
                x5k x5kVar = (x5k) obj2;
                o9s o9sVar = new o9s(x5kVar.a);
                apo apoVar7 = fpo.a;
                fas fasVar = new fas(x5kVar.b);
                Object a2 = fpo.a(new kes(x5kVar.c), fpo.q, gooVar4);
                fcs fcsVar = x5kVar.d;
                fcs fcsVar2 = fcs.c;
                Object a3 = fpo.a(fcsVar, fpo.l, gooVar4);
                Object a4 = fpo.a(x5kVar.e, gpo.a, gooVar4);
                h6g h6gVar2 = x5kVar.f;
                h6g h6gVar3 = h6g.c;
                return u75.d(o9sVar, fasVar, a2, a3, a4, fpo.a(h6gVar2, fpo.u, gooVar4), fpo.a(new u5g(x5kVar.g), gpo.b, gooVar4), new f8e(x5kVar.h), fpo.a(x5kVar.i, gpo.c, gooVar4));
            case 21:
                goo gooVar5 = (goo) obj;
                otp otpVar = (otp) obj2;
                return u75.d(fpo.a(new d85(otpVar.a), fpo.p, gooVar5), fpo.a(new enj(otpVar.b), fpo.r, gooVar5), Float.valueOf(otpVar.c));
            case 22:
                goo gooVar6 = (goo) obj;
                c4r c4rVar = (c4r) obj2;
                d85 d85Var = new d85(c4rVar.a.a());
                cpo cpoVar = fpo.p;
                Object a5 = fpo.a(d85Var, cpoVar, gooVar6);
                kes kesVar = new kes(c4rVar.b);
                cpo cpoVar2 = fpo.q;
                Object a6 = fpo.a(kesVar, cpoVar2, gooVar6);
                tqc tqcVar = c4rVar.c;
                tqc tqcVar2 = tqc.b;
                Object a7 = fpo.a(tqcVar, fpo.m, gooVar6);
                oqc oqcVar = c4rVar.d;
                pqc pqcVar = c4rVar.e;
                String str4 = c4rVar.g;
                Object a8 = fpo.a(new kes(c4rVar.h), cpoVar2, gooVar6);
                Object a9 = fpo.a(c4rVar.i, fpo.n, gooVar6);
                Object a10 = fpo.a(c4rVar.j, fpo.k, gooVar6);
                bqg bqgVar = c4rVar.k;
                bqg bqgVar2 = bqg.c;
                Object a11 = fpo.a(bqgVar, fpo.s, gooVar6);
                Object a12 = fpo.a(new d85(c4rVar.l), cpoVar, gooVar6);
                Object a13 = fpo.a(c4rVar.m, fpo.j, gooVar6);
                otp otpVar2 = c4rVar.n;
                otp otpVar3 = otp.d;
                return u75.d(a5, a6, a7, oqcVar, pqcVar, -1, str4, a8, a9, a10, a11, a12, a13, fpo.a(otpVar2, fpo.o, gooVar6));
            case 23:
                return Integer.valueOf(((aas) obj2).a);
            case 24:
                ccs ccsVar = (ccs) obj2;
                return u75.d(Float.valueOf(ccsVar.a), Float.valueOf(ccsVar.b));
            case 25:
                goo gooVar7 = (goo) obj;
                fcs fcsVar3 = (fcs) obj2;
                kes kesVar2 = new kes(fcsVar3.a);
                cpo cpoVar3 = fpo.q;
                return u75.d(fpo.a(kesVar2, cpoVar3, gooVar7), fpo.a(new kes(fcsVar3.b), cpoVar3, gooVar7));
            case 26:
                goo gooVar8 = (goo) obj;
                hds hdsVar = (hds) obj2;
                c4r c4rVar2 = hdsVar.a;
                apo apoVar8 = fpo.h;
                return u75.d(fpo.a(c4rVar2, apoVar8, gooVar8), fpo.a(hdsVar.b, apoVar8, gooVar8), fpo.a(hdsVar.c, apoVar8, gooVar8), fpo.a(hdsVar.d, apoVar8, gooVar8));
            case 27:
                long j4 = ((rds) obj2).a;
                int i6 = rds.c;
                Integer valueOf2 = Integer.valueOf((int) (j4 >> 32));
                apo apoVar9 = fpo.a;
                return u75.d(valueOf2, Integer.valueOf((int) (4294967295L & j4)));
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                long j5 = ((kes) obj2).a;
                if (kes.a(j5, kes.c)) {
                    return Boolean.FALSE;
                }
                Float valueOf3 = Float.valueOf(kes.c(j5));
                apo apoVar10 = fpo.a;
                return u75.d(valueOf3, new les(kes.b(j5)));
            default:
                String str5 = ((ppt) obj2).a;
                apo apoVar11 = fpo.a;
                return str5;
        }
    }
}
