package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.KSerializer;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.yandex.common.clid.ClidProvider;

/* loaded from: classes.dex */
public final /* synthetic */ class q2m0 implements tls {
    public final /* synthetic */ int a;

    public /* synthetic */ q2m0(int i) {
        this.a = i;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        try0 try0Var;
        int i;
        int i2;
        switch (this.a) {
            case 0:
                return new n2v(((Integer) obj).intValue());
            case 1:
                List list = (List) obj;
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                for (int i3 = 0; i3 < size; i3++) {
                    Object obj2 = list.get(i3);
                    arrayList.add((jl40.l(obj2, Boolean.FALSE) || obj2 == null) ? null : (ik2) ((tls) t2m0.b.b).invoke(obj2));
                }
                return arrayList;
            case 2:
                return new hzr(((Integer) obj).intValue());
            case 3:
                return new izr(((Integer) obj).intValue());
            case 4:
                Boolean bool = Boolean.FALSE;
                if (jl40.l(obj, bool)) {
                    return new sty0(sty0.c);
                }
                List list2 = (List) obj;
                Object obj3 = list2.get(0);
                float floatValue = (obj3 != null ? (Float) obj3 : null).floatValue();
                Object obj4 = list2.get(1);
                s2m0 s2m0Var = t2m0.w;
                jl40.l(obj4, bool);
                return new sty0(uh6.K(floatValue, (obj4 != null ? (tty0) s2m0Var.b.invoke(obj4) : null).a));
            case 5:
                return jl40.l(obj, 0) ? new tty0(8589934592L) : jl40.l(obj, 1) ? new tty0(4294967296L) : new tty0(0L);
            case 6:
                if (jl40.l(obj, Boolean.FALSE)) {
                    return new wu60(9205357640488583168L);
                }
                List list3 = (List) obj;
                Object obj5 = list3.get(0);
                float floatValue2 = (obj5 != null ? (Float) obj5 : null).floatValue();
                return new wu60((Float.floatToRawIntBits(floatValue2) << 32) | (Float.floatToRawIntBits((list3.get(1) != null ? (Float) r0 : null).floatValue()) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
            case 7:
                List list4 = (List) obj;
                ArrayList arrayList2 = new ArrayList(list4.size());
                int size2 = list4.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    Object obj6 = list4.get(i4);
                    arrayList2.add((jl40.l(obj6, Boolean.FALSE) || obj6 == null) ? null : (h5z) ((tls) t2m0.z.b).invoke(obj6));
                }
                return new k5z(arrayList2);
            case 8:
                return new h5z(cgb1.b((String) obj));
            case 9:
                List list5 = (List) obj;
                Object obj7 = list5.get(0);
                String str = obj7 != null ? (String) obj7 : null;
                Object obj8 = list5.get(1);
                return new iky(str, (jl40.l(obj8, Boolean.FALSE) || obj8 == null) ? null : (hry0) ((tls) t2m0.i.b).invoke(obj8), null);
            case 10:
                List list6 = (List) obj;
                Object obj9 = list6.get(0);
                float f = bhy.b;
                s2m0 s2m0Var2 = t2m0.B;
                Boolean bool2 = Boolean.FALSE;
                jl40.l(obj9, bool2);
                float f2 = (obj9 != null ? (bhy) s2m0Var2.b.invoke(obj9) : null).a;
                Object obj10 = list6.get(1);
                s2m0 s2m0Var3 = t2m0.C;
                jl40.l(obj10, bool2);
                int i5 = (obj10 != null ? (dhy) s2m0Var3.b.invoke(obj10) : null).a;
                Object obj11 = list6.get(2);
                s2m0 s2m0Var4 = t2m0.D;
                jl40.l(obj11, bool2);
                return new ehy(f2, i5, (obj11 != null ? (chy) s2m0Var4.b.invoke(obj11) : null).a);
            case 11:
                float floatValue3 = ((Float) obj).floatValue();
                bhy.a(floatValue3);
                return new bhy(floatValue3);
            case 12:
                return new dhy(((Integer) obj).intValue());
            case 13:
                return new chy(((Integer) obj).intValue());
            case 14:
                return new e731(obj != null ? (String) obj : null);
            case 15:
                return new sg21(obj != null ? (String) obj : null);
            case 16:
                List list7 = (List) obj;
                Object obj12 = list7.get(0);
                s2m0 s2m0Var5 = t2m0.q;
                Boolean bool3 = Boolean.FALSE;
                jl40.l(obj12, bool3);
                int i6 = (obj12 != null ? (sjy0) s2m0Var5.b.invoke(obj12) : null).a;
                Object obj13 = list7.get(1);
                s2m0 s2m0Var6 = t2m0.r;
                jl40.l(obj13, bool3);
                int i7 = (obj13 != null ? (vly0) s2m0Var6.b.invoke(obj13) : null).a;
                Object obj14 = list7.get(2);
                tty0[] tty0VarArr = sty0.b;
                s2m0 s2m0Var7 = t2m0.v;
                jl40.l(obj14, bool3);
                long j = (obj14 != null ? (sty0) s2m0Var7.b.invoke(obj14) : null).a;
                Object obj15 = list7.get(3);
                apy0 apy0Var = apy0.c;
                apy0 apy0Var2 = (jl40.l(obj15, bool3) || obj15 == null) ? null : (apy0) ((tls) t2m0.l.b).invoke(obj15);
                Object obj16 = list7.get(4);
                tvc0 tvc0Var = tvc0.c;
                tvc0 tvc0Var2 = (jl40.l(obj16, bool3) || obj16 == null) ? null : (tvc0) ((tls) gu91.a.b).invoke(obj16);
                Object obj17 = list7.get(5);
                ehy ehyVar = ehy.d;
                ehy ehyVar2 = (jl40.l(obj17, bool3) || obj17 == null) ? null : (ehy) ((tls) t2m0.A.b).invoke(obj17);
                Object obj18 = list7.get(6);
                int i8 = ((jl40.l(obj18, bool3) || obj18 == null) ? null : (kgy) ((tls) gu91.c.b).invoke(obj18)).a;
                Object obj19 = list7.get(7);
                s2m0 s2m0Var8 = t2m0.s;
                jl40.l(obj19, bool3);
                int i9 = (obj19 != null ? (n2v) s2m0Var8.b.invoke(obj19) : null).a;
                Object obj20 = list7.get(8);
                tig0 tig0Var = gu91.d;
                if (jl40.l(obj20, bool3) || obj20 == null) {
                    i = i8;
                    i2 = i9;
                    try0Var = null;
                } else {
                    try0Var = (try0) ((tls) tig0Var.b).invoke(obj20);
                    i = i8;
                    i2 = i9;
                }
                return new gc90(i6, i7, j, apy0Var2, tvc0Var2, ehyVar2, i, i2, try0Var);
            case 17:
                List list8 = (List) obj;
                Object obj21 = list8.get(0);
                int i10 = ldc.n;
                Boolean bool4 = Boolean.FALSE;
                jl40.l(obj21, bool4);
                long j2 = (obj21 != null ? obj21.equals(bool4) ? new ldc(ldc.m) : new ldc(rzo.d(((Integer) obj21).intValue())) : null).a;
                Object obj22 = list8.get(1);
                tty0[] tty0VarArr2 = sty0.b;
                tls tlsVar = t2m0.v.b;
                jl40.l(obj22, bool4);
                long j3 = (obj22 != null ? (sty0) tlsVar.invoke(obj22) : null).a;
                Object obj23 = list8.get(2);
                lzr lzrVar = lzr.b;
                lzr lzrVar2 = (jl40.l(obj23, bool4) || obj23 == null) ? null : (lzr) ((tls) t2m0.m.b).invoke(obj23);
                Object obj24 = list8.get(3);
                hzr hzrVar = (jl40.l(obj24, bool4) || obj24 == null) ? null : (hzr) ((tls) t2m0.t.b).invoke(obj24);
                Object obj25 = list8.get(4);
                izr izrVar = (jl40.l(obj25, bool4) || obj25 == null) ? null : (izr) ((tls) t2m0.u.b).invoke(obj25);
                Object obj26 = list8.get(6);
                String str2 = obj26 != null ? (String) obj26 : null;
                Object obj27 = list8.get(7);
                jl40.l(obj27, bool4);
                long j4 = (obj27 != null ? (sty0) tlsVar.invoke(obj27) : null).a;
                Object obj28 = list8.get(8);
                td5 td5Var = (jl40.l(obj28, bool4) || obj28 == null) ? null : (td5) ((tls) t2m0.n.b).invoke(obj28);
                Object obj29 = list8.get(9);
                soy0 soy0Var = (jl40.l(obj29, bool4) || obj29 == null) ? null : (soy0) ((tls) t2m0.k.b).invoke(obj29);
                Object obj30 = list8.get(10);
                k5z k5zVar = k5z.c;
                k5z k5zVar2 = (jl40.l(obj30, bool4) || obj30 == null) ? null : (k5z) ((tls) t2m0.y.b).invoke(obj30);
                Object obj31 = list8.get(11);
                jl40.l(obj31, bool4);
                long j5 = (obj31 != null ? obj31.equals(bool4) ? new ldc(ldc.m) : new ldc(rzo.d(((Integer) obj31).intValue())) : null).a;
                Object obj32 = list8.get(12);
                rly0 rly0Var = (jl40.l(obj32, bool4) || obj32 == null) ? null : (rly0) ((tls) t2m0.j.b).invoke(obj32);
                Object obj33 = list8.get(13);
                bgr0 bgr0Var = bgr0.d;
                return new bmt0(j2, j3, lzrVar2, hzrVar, izrVar, (eyr) null, str2, j4, td5Var, soy0Var, k5zVar2, j5, rly0Var, (jl40.l(obj33, bool4) || obj33 == null) ? null : (bgr0) ((tls) t2m0.o.b).invoke(obj33), 49184);
            case 18:
                return ClidProvider.APP_ACTIVE;
            case 19:
                return Boolean.valueOf(((pyp0) obj).getF());
            case 20:
                return ((pyp0) obj).getA();
            case 21:
                return ((qrq0) obj).iterator();
            case 22:
                return Boolean.valueOf(obj == null);
            case 23:
                lfx lfxVar = (lfx) obj;
                KSerializer K = gtq0.K(lfxVar);
                if (K != null) {
                    return K;
                }
                if (y5e.w(lfxVar)) {
                    return new v5e0(lfxVar);
                }
                return null;
            case 24:
                lfx lfxVar2 = (lfx) obj;
                KSerializer K2 = gtq0.K(lfxVar2);
                if (K2 == null) {
                    K2 = y5e.w(lfxVar2) ? new v5e0(lfxVar2) : null;
                }
                if (K2 != null) {
                    return qke.n(K2);
                }
                return null;
            case 25:
                j5z0 j5z0Var = j5z0.b;
                amr amrVar = amr.c;
                amrVar.a.put(qoi0.a(wjr.class), j5z0Var);
                wjr.a.getClass();
                wjr wjrVar = vjr.b;
                if (wjrVar != j5z0Var) {
                    synchronized (wjrVar) {
                        if (vjr.b != j5z0Var) {
                            vjr.b = j5z0Var;
                        }
                    }
                }
                amrVar.a.put(qoi0.a(m3q0.class), new m3q0(new k801(25)));
                return zy11.a;
            case 26:
                return kp50.i();
            case 27:
                q2m0 q2m0Var = q2t0.a;
                return zy11.a;
            case 28:
                h0c h0cVar = (h0c) obj;
                h0cVar.a("regular", g4t0.INSTANCE.serializer().getDescriptor(), (r3 & 8) == 0);
                v4t0 v4t0Var = w4t0.Companion;
                h0cVar.a("stickyForDocument", v4t0Var.serializer().getDescriptor(), (r3 & 8) == 0);
                h0cVar.a("stickyForDocumentStart", v4t0Var.serializer().getDescriptor(), (r3 & 8) == 0);
                h0cVar.a("stickyForDocumentEnd", t4t0.Companion.serializer().getDescriptor(), (r3 & 8) == 0);
                h0cVar.a("snapping", l4t0.Companion.serializer().getDescriptor(), (r3 & 8) == 0);
                return zy11.a;
            default:
                acx acxVar = (acx) obj;
                acxVar.c = true;
                acxVar.d = true;
                return zy11.a;
        }
    }
}
