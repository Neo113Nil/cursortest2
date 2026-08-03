package h2;

import android.util.Log;
import com.onesignal.core.activities.PermissionsActivity;
import com.onesignal.inAppMessages.internal.display.impl.a;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final /* synthetic */ class m implements oc.c {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f2685g;

    public /* synthetic */ m(int i10) {
        this.f2685g = i10;
    }

    @Override // oc.c
    public final Object invoke(Object obj) {
        int i10;
        int i11;
        int i12;
        int i13;
        long j3;
        r2.s sVar;
        int i14 = this.f2685g;
        ac.o oVar = ac.o.f277a;
        int i15 = 0;
        switch (i14) {
            case 0:
                n nVar = (n) obj;
                StringBuilder sb = new StringBuilder("[");
                sb.append(nVar.f2687b);
                sb.append(", ");
                return a4.d.l(sb, nVar.f2688c, ')');
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                pc.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list = (List) obj;
                Object obj2 = list.get(0);
                oc.c cVar = y.f2721h.f7049b;
                Boolean bool = Boolean.FALSE;
                a0 a0Var = (pc.j.a(obj2, bool) || obj2 == null) ? null : (a0) cVar.invoke(obj2);
                Object obj3 = list.get(1);
                a0 a0Var2 = (pc.j.a(obj3, bool) || obj3 == null) ? null : (a0) cVar.invoke(obj3);
                Object obj4 = list.get(2);
                a0 a0Var3 = (pc.j.a(obj4, bool) || obj4 == null) ? null : (a0) cVar.invoke(obj4);
                Object obj5 = list.get(3);
                return new f0(a0Var, a0Var2, a0Var3, (pc.j.a(obj5, bool) || obj5 == null) ? null : (a0) cVar.invoke(obj5));
            case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                pc.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list2 = (List) obj;
                Object obj6 = list2.get(1);
                List list3 = (pc.j.a(obj6, Boolean.FALSE) || obj6 == null) ? null : (List) y.f2714a.f7049b.invoke(obj6);
                Object obj7 = list2.get(0);
                String str = obj7 != null ? (String) obj7 : null;
                pc.j.b(str);
                return new e(list3, str);
            case 3:
                pc.j.c(obj, "null cannot be cast to non-null type kotlin.Int");
                return new r2.l(((Integer) obj).intValue());
            case 4:
                pc.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Float>");
                List list4 = (List) obj;
                return new r2.p(((Number) list4.get(0)).floatValue(), ((Number) list4.get(1)).floatValue());
            case 5:
                pc.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list5 = (List) obj;
                Object obj8 = list5.get(0);
                s2.o[] oVarArr = s2.n.f6400b;
                oc.c cVar2 = y.f2730q.f2713b;
                Boolean bool2 = Boolean.FALSE;
                pc.j.a(obj8, bool2);
                s2.n nVar2 = obj8 != null ? (s2.n) cVar2.invoke(obj8) : null;
                pc.j.b(nVar2);
                long j6 = nVar2.f6402a;
                Object obj9 = list5.get(1);
                pc.j.a(obj9, bool2);
                s2.n nVar3 = obj9 != null ? (s2.n) cVar2.invoke(obj9) : null;
                pc.j.b(nVar3);
                return new r2.q(j6, nVar3.f6402a);
            case 6:
                pc.j.c(obj, "null cannot be cast to non-null type kotlin.Int");
                return new k2.l(((Integer) obj).intValue());
            case 7:
                pc.j.c(obj, "null cannot be cast to non-null type kotlin.Float");
                return new r2.a(((Float) obj).floatValue());
            case 8:
                pc.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list6 = (List) obj;
                Object obj10 = list6.get(0);
                Integer num = obj10 != null ? (Integer) obj10 : null;
                pc.j.b(num);
                int intValue = num.intValue();
                Object obj11 = list6.get(1);
                Integer num2 = obj11 != null ? (Integer) obj11 : null;
                pc.j.b(num2);
                return new g0(z.b(intValue, num2.intValue()));
            case 9:
                pc.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list7 = (List) obj;
                Object obj12 = list7.get(0);
                int i16 = f1.q.f2284i;
                Boolean bool3 = Boolean.FALSE;
                pc.j.a(obj12, bool3);
                f1.q qVar = obj12 != null ? pc.j.a(obj12, Boolean.FALSE) ? new f1.q(f1.q.f2283h) : new f1.q(f1.d0.b(((Integer) obj12).intValue())) : null;
                pc.j.b(qVar);
                long j10 = qVar.f2285a;
                Object obj13 = list7.get(1);
                x xVar = y.f2731r;
                pc.j.a(obj13, bool3);
                e1.b bVar = obj13 != null ? (e1.b) xVar.f2713b.invoke(obj13) : null;
                pc.j.b(bVar);
                long j11 = bVar.f1929a;
                Object obj14 = list7.get(2);
                Float f10 = obj14 != null ? (Float) obj14 : null;
                pc.j.b(f10);
                return new f1.f0(j10, j11, f10.floatValue());
            case com.onesignal.core.internal.config.d.DEFAULT_NOTIFICATION_LIMIT /* 10 */:
                if (pc.j.a(obj, Boolean.FALSE)) {
                    return new s2.n(s2.n.f6401c);
                }
                pc.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list8 = (List) obj;
                Object obj15 = list8.get(0);
                Float f11 = obj15 != null ? (Float) obj15 : null;
                pc.j.b(f11);
                float floatValue = f11.floatValue();
                Object obj16 = list8.get(1);
                s2.o oVar2 = obj16 != null ? (s2.o) obj16 : null;
                pc.j.b(oVar2);
                return new s2.n(bc.a0.E(oVar2.f6403a, floatValue));
            case 11:
                pc.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list9 = (List) obj;
                Object obj17 = list9.get(0);
                String str2 = obj17 != null ? (String) obj17 : null;
                pc.j.b(str2);
                Object obj18 = list9.get(1);
                return new j(str2, (pc.j.a(obj18, Boolean.FALSE) || obj18 == null) ? null : (f0) y.f2722i.f7049b.invoke(obj18));
            case 12:
                if (pc.j.a(obj, Boolean.FALSE)) {
                    return new e1.b(9205357640488583168L);
                }
                pc.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list10 = (List) obj;
                Object obj19 = list10.get(0);
                Float f12 = obj19 != null ? (Float) obj19 : null;
                pc.j.b(f12);
                float floatValue2 = f12.floatValue();
                Object obj20 = list10.get(1);
                pc.j.b(obj20 != null ? (Float) obj20 : null);
                return new e1.b((Float.floatToRawIntBits(floatValue2) << 32) | (Float.floatToRawIntBits(r15.floatValue()) & 4294967295L));
            case 13:
                pc.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list11 = (List) obj;
                ArrayList arrayList = new ArrayList(list11.size());
                int size = list11.size();
                while (i15 < size) {
                    Object obj21 = list11.get(i15);
                    n2.a aVar = (pc.j.a(obj21, Boolean.FALSE) || obj21 == null) ? null : (n2.a) y.f2733t.f7049b.invoke(obj21);
                    pc.j.b(aVar);
                    arrayList.add(aVar);
                    i15++;
                }
                return new n2.b(arrayList);
            case 14:
                pc.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list12 = (List) obj;
                ArrayList arrayList2 = new ArrayList(list12.size());
                int size2 = list12.size();
                while (i15 < size2) {
                    Object obj22 = list12.get(i15);
                    c cVar3 = (pc.j.a(obj22, Boolean.FALSE) || obj22 == null) ? null : (c) y.f2715b.f7049b.invoke(obj22);
                    pc.j.b(cVar3);
                    arrayList2.add(cVar3);
                    i15++;
                }
                return arrayList2;
            case 15:
                pc.j.c(obj, "null cannot be cast to non-null type kotlin.String");
                String str3 = (String) obj;
                n2.c.f5044a.getClass();
                Locale forLanguageTag = Locale.forLanguageTag(str3);
                if (pc.j.a(forLanguageTag.toLanguageTag(), "und")) {
                    Log.e("Locale", "The language tag " + str3 + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
                }
                return new n2.a(forLanguageTag);
            case 16:
                pc.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list13 = (List) obj;
                Object obj23 = list13.get(0);
                r2.f fVar = obj23 != null ? (r2.f) obj23 : null;
                pc.j.b(fVar);
                float f13 = fVar.f6023a;
                Object obj24 = list13.get(1);
                r2.h hVar = obj24 != null ? (r2.h) obj24 : null;
                pc.j.b(hVar);
                int i17 = hVar.f6024a;
                Object obj25 = list13.get(2);
                pc.j.b(obj25 != null ? (r2.g) obj25 : null);
                return new r2.i(i17, f13);
            case 17:
                pc.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list14 = (List) obj;
                Object obj26 = list14.get(0);
                g gVar = obj26 != null ? (g) obj26 : null;
                pc.j.b(gVar);
                Object obj27 = list14.get(2);
                Integer num3 = obj27 != null ? (Integer) obj27 : null;
                pc.j.b(num3);
                int intValue2 = num3.intValue();
                Object obj28 = list14.get(3);
                Integer num4 = obj28 != null ? (Integer) obj28 : null;
                pc.j.b(num4);
                int intValue3 = num4.intValue();
                Object obj29 = list14.get(4);
                String str4 = obj29 != null ? (String) obj29 : null;
                pc.j.b(str4);
                switch (gVar.ordinal()) {
                    case 0:
                        Object obj30 = list14.get(1);
                        q qVar2 = (pc.j.a(obj30, Boolean.FALSE) || obj30 == null) ? null : (q) y.f2720g.f7049b.invoke(obj30);
                        pc.j.b(qVar2);
                        return new c(qVar2, intValue2, intValue3, str4);
                    case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                        Object obj31 = list14.get(1);
                        a0 a0Var4 = (pc.j.a(obj31, Boolean.FALSE) || obj31 == null) ? null : (a0) y.f2721h.f7049b.invoke(obj31);
                        pc.j.b(a0Var4);
                        return new c(a0Var4, intValue2, intValue3, str4);
                    case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                        Object obj32 = list14.get(1);
                        j0 j0Var = (pc.j.a(obj32, Boolean.FALSE) || obj32 == null) ? null : (j0) y.f2716c.f7049b.invoke(obj32);
                        pc.j.b(j0Var);
                        return new c(j0Var, intValue2, intValue3, str4);
                    case 3:
                        Object obj33 = list14.get(1);
                        i0 i0Var = (pc.j.a(obj33, Boolean.FALSE) || obj33 == null) ? null : (i0) y.f2717d.f7049b.invoke(obj33);
                        pc.j.b(i0Var);
                        return new c(i0Var, intValue2, intValue3, str4);
                    case 4:
                        Object obj34 = list14.get(1);
                        j jVar = (pc.j.a(obj34, Boolean.FALSE) || obj34 == null) ? null : (j) y.f2718e.f7049b.invoke(obj34);
                        pc.j.b(jVar);
                        return new c(jVar, intValue2, intValue3, str4);
                    case 5:
                        Object obj35 = list14.get(1);
                        i iVar = (pc.j.a(obj35, Boolean.FALSE) || obj35 == null) ? null : (i) y.f2719f.f7049b.invoke(obj35);
                        pc.j.b(iVar);
                        return new c(iVar, intValue2, intValue3, str4);
                    case 6:
                        Object obj36 = list14.get(1);
                        String str5 = obj36 != null ? (String) obj36 : null;
                        pc.j.b(str5);
                        return new c(new c0(str5), intValue2, intValue3, str4);
                    default:
                        throw new ac.d();
                }
            case 18:
                String str6 = obj != null ? (String) obj : null;
                pc.j.b(str6);
                return new j0(str6);
            case 19:
                String str7 = obj != null ? (String) obj : null;
                pc.j.b(str7);
                return new i0(str7);
            case 20:
                pc.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list15 = (List) obj;
                Object obj37 = list15.get(0);
                String str8 = obj37 != null ? (String) obj37 : null;
                pc.j.b(str8);
                Object obj38 = list15.get(1);
                return new i(str8, (pc.j.a(obj38, Boolean.FALSE) || obj38 == null) ? null : (f0) y.f2722i.f7049b.invoke(obj38));
            case 21:
                pc.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list16 = (List) obj;
                Object obj39 = list16.get(0);
                r2.k kVar = obj39 != null ? (r2.k) obj39 : null;
                pc.j.b(kVar);
                int i18 = kVar.f6031a;
                Object obj40 = list16.get(1);
                r2.m mVar = obj40 != null ? (r2.m) obj40 : null;
                pc.j.b(mVar);
                int i19 = mVar.f6035a;
                Object obj41 = list16.get(2);
                s2.o[] oVarArr2 = s2.n.f6400b;
                x xVar2 = y.f2730q;
                Boolean bool4 = Boolean.FALSE;
                pc.j.a(obj41, bool4);
                s2.n nVar4 = obj41 != null ? (s2.n) xVar2.f2713b.invoke(obj41) : null;
                pc.j.b(nVar4);
                long j12 = nVar4.f6402a;
                Object obj42 = list16.get(3);
                r2.q qVar3 = r2.q.f6040c;
                r2.q qVar4 = (pc.j.a(obj42, bool4) || obj42 == null) ? null : (r2.q) y.f2725l.f7049b.invoke(obj42);
                Object obj43 = list16.get(4);
                s sVar2 = (pc.j.a(obj43, bool4) || obj43 == null) ? null : (s) z.f2735a.f7049b.invoke(obj43);
                Object obj44 = list16.get(5);
                r2.i iVar2 = r2.i.f6025c;
                r2.i iVar3 = (pc.j.a(obj44, bool4) || obj44 == null) ? null : (r2.i) y.f2734u.f7049b.invoke(obj44);
                Object obj45 = list16.get(6);
                r2.e eVar = (pc.j.a(obj45, bool4) || obj45 == null) ? null : (r2.e) z.f2736b.f7049b.invoke(obj45);
                pc.j.b(eVar);
                int i20 = eVar.f6019a;
                Object obj46 = list16.get(7);
                r2.d dVar = obj46 != null ? (r2.d) obj46 : null;
                pc.j.b(dVar);
                int i21 = dVar.f6017a;
                Object obj47 = list16.get(8);
                boolean a6 = pc.j.a(obj47, bool4);
                v0.j jVar2 = z.f2737c;
                if (a6 || obj47 == null) {
                    i10 = i18;
                    i11 = i21;
                    i12 = i20;
                    i13 = i19;
                    j3 = j12;
                    sVar = null;
                } else {
                    i10 = i18;
                    i11 = i21;
                    i12 = i20;
                    i13 = i19;
                    j3 = j12;
                    sVar = (r2.s) jVar2.f7049b.invoke(obj47);
                }
                return new q(i10, i13, j3, qVar4, sVar2, iVar3, i12, i11, sVar);
            case 22:
                pc.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list17 = (List) obj;
                Object obj48 = list17.get(0);
                int i22 = f1.q.f2284i;
                Boolean bool5 = Boolean.FALSE;
                pc.j.a(obj48, bool5);
                f1.q qVar5 = obj48 != null ? obj48.equals(bool5) ? new f1.q(f1.q.f2283h) : new f1.q(f1.d0.b(((Integer) obj48).intValue())) : null;
                pc.j.b(qVar5);
                long j13 = qVar5.f2285a;
                Object obj49 = list17.get(1);
                s2.o[] oVarArr3 = s2.n.f6400b;
                oc.c cVar4 = y.f2730q.f2713b;
                pc.j.a(obj49, bool5);
                s2.n nVar5 = obj49 != null ? (s2.n) cVar4.invoke(obj49) : null;
                pc.j.b(nVar5);
                long j14 = nVar5.f6402a;
                Object obj50 = list17.get(2);
                k2.l lVar = k2.l.f3611h;
                k2.l lVar2 = (pc.j.a(obj50, bool5) || obj50 == null) ? null : (k2.l) y.f2726m.f7049b.invoke(obj50);
                Object obj51 = list17.get(3);
                k2.j jVar3 = obj51 != null ? (k2.j) obj51 : null;
                Object obj52 = list17.get(4);
                k2.k kVar2 = obj52 != null ? (k2.k) obj52 : null;
                Object obj53 = list17.get(6);
                String str9 = obj53 != null ? (String) obj53 : null;
                Object obj54 = list17.get(7);
                pc.j.a(obj54, bool5);
                s2.n nVar6 = obj54 != null ? (s2.n) cVar4.invoke(obj54) : null;
                pc.j.b(nVar6);
                long j15 = nVar6.f6402a;
                Object obj55 = list17.get(8);
                r2.a aVar2 = (pc.j.a(obj55, bool5) || obj55 == null) ? null : (r2.a) y.f2727n.f7049b.invoke(obj55);
                Object obj56 = list17.get(9);
                r2.p pVar = (pc.j.a(obj56, bool5) || obj56 == null) ? null : (r2.p) y.f2724k.f7049b.invoke(obj56);
                Object obj57 = list17.get(10);
                n2.b bVar2 = n2.b.f5041i;
                n2.b bVar3 = (pc.j.a(obj57, bool5) || obj57 == null) ? null : (n2.b) y.f2732s.f7049b.invoke(obj57);
                Object obj58 = list17.get(11);
                pc.j.a(obj58, bool5);
                f1.q qVar6 = obj58 != null ? obj58.equals(bool5) ? new f1.q(f1.q.f2283h) : new f1.q(f1.d0.b(((Integer) obj58).intValue())) : null;
                pc.j.b(qVar6);
                long j16 = qVar6.f2285a;
                Object obj59 = list17.get(12);
                r2.l lVar3 = (pc.j.a(obj59, bool5) || obj59 == null) ? null : (r2.l) y.f2723j.f7049b.invoke(obj59);
                Object obj60 = list17.get(13);
                f1.f0 f0Var = f1.f0.f2248d;
                return new a0(j13, j14, lVar2, jVar3, kVar2, (k2.r) null, str9, j15, aVar2, pVar, bVar3, j16, lVar3, (pc.j.a(obj60, bool5) || obj60 == null) ? null : (f1.f0) y.f2728o.f7049b.invoke(obj60), 49184);
            case 23:
                pc.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list18 = (List) obj;
                Object obj61 = list18.get(0);
                Boolean bool6 = obj61 != null ? (Boolean) obj61 : null;
                pc.j.b(bool6);
                boolean booleanValue = bool6.booleanValue();
                Object obj62 = list18.get(1);
                pc.j.b(obj62 != null ? (h) obj62 : null);
                return new s(booleanValue);
            case 24:
                pc.j.c(obj, "null cannot be cast to non-null type kotlin.Int");
                return new r2.e(((Integer) obj).intValue());
            case 25:
                pc.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list19 = (List) obj;
                Object obj63 = list19.get(0);
                r2.r rVar = obj63 != null ? (r2.r) obj63 : null;
                pc.j.b(rVar);
                int i23 = rVar.f6043a;
                Object obj64 = list19.get(1);
                Boolean bool7 = obj64 != null ? (Boolean) obj64 : null;
                pc.j.b(bool7);
                return new r2.s(i23, bool7.booleanValue());
            case 26:
                ac.i iVar4 = (ac.i) obj;
                pc.j.e(iVar4, "slot");
                return iVar4.f270g + "=" + iVar4.f271h;
            case 27:
                g5.a aVar3 = (g5.a) obj;
                pc.j.e(aVar3, "cursor");
                String b2 = aVar3.b(0);
                pc.j.b(b2);
                return b2;
            case 28:
                oc.c cVar5 = (oc.c) obj;
                pc.j.e(cVar5, "emit");
                cVar5.invoke("card_skins");
                return oVar;
            default:
                oc.c cVar6 = (oc.c) obj;
                pc.j.e(cVar6, "emit");
                cVar6.invoke("player_data");
                return oVar;
        }
    }
}
