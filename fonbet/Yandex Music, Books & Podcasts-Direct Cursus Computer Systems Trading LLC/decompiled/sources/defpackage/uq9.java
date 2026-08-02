package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class uq9 implements u1f {
    public final List a;
    public final szb b;
    public final cs9 c;
    public final szb d;
    public final js9 e;
    public final szb f;
    public final szb g;
    public final szb h;
    public final szb i;
    public final szb j;
    public final szb k;
    public final szb l;
    public final szb m;
    public final szb n;
    public final szb o;
    public final ts9 p;
    public final szb q;
    public final szb r;
    public final szb s;
    public final dj9 t;
    public final szb u;
    public final szb v;
    public Integer w;

    public uq9(List list, szb szbVar, cs9 cs9Var, szb szbVar2, js9 js9Var, szb szbVar3, szb szbVar4, szb szbVar5, szb szbVar6, szb szbVar7, szb szbVar8, szb szbVar9, szb szbVar10, szb szbVar11, szb szbVar12, ts9 ts9Var, szb szbVar13, szb szbVar14, szb szbVar15, dj9 dj9Var, szb szbVar16, szb szbVar17) {
        this.a = list;
        this.b = szbVar;
        this.c = cs9Var;
        this.d = szbVar2;
        this.e = js9Var;
        this.f = szbVar3;
        this.g = szbVar4;
        this.h = szbVar5;
        this.i = szbVar6;
        this.j = szbVar7;
        this.k = szbVar8;
        this.l = szbVar9;
        this.m = szbVar10;
        this.n = szbVar11;
        this.o = szbVar12;
        this.p = ts9Var;
        this.q = szbVar13;
        this.r = szbVar14;
        this.s = szbVar15;
        this.t = dj9Var;
        this.u = szbVar16;
        this.v = szbVar17;
    }

    /* JADX WARN: Code restructure failed: missing block: B:154:0x031c, code lost:
    
        if (r4.e.a(r1.e, r11, r12) == false) goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0372, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x0368, code lost:
    
        if (((java.lang.Boolean) r4.b.a(r11)).booleanValue() != ((java.lang.Boolean) r1.b.a(r12)).booleanValue()) goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x0370, code lost:
    
        if (r1 == null) goto L235;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x0169, code lost:
    
        if (r1 == null) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x00ff, code lost:
    
        if ((r4 != null ? r4.a(r1, r11, r12) : r1 == null) != false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x0107, code lost:
    
        if (r1 == null) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x0047, code lost:
    
        if (r1 == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x009e, code lost:
    
        if (((java.lang.Number) r4.a.a(r11)).intValue() != ((java.lang.Number) r1.a.a(r12)).intValue()) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0109, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0166, code lost:
    
        if ((r4 != null ? r4.a(r1, r11, r12) : r1 == null) != false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x016b, code lost:
    
        r1 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(uq9 uq9Var, xzb xzbVar, xzb xzbVar2) {
        boolean z;
        boolean z2;
        boolean z3;
        if (uq9Var != null) {
            List list = uq9Var.a;
            List list2 = this.a;
            if (list2 != null) {
                if (list != null && list2.size() == list.size()) {
                    int i = 0;
                    for (Object obj : list2) {
                        int i2 = i + 1;
                        if (i < 0) {
                            u75.n();
                            throw null;
                        }
                        if (!((bd8) obj).a((bd8) list.get(i), xzbVar, xzbVar2)) {
                            break;
                        }
                        i = i2;
                    }
                    szb szbVar = this.b;
                    yq9 yq9Var = szbVar != null ? (yq9) szbVar.a(xzbVar) : null;
                    szb szbVar2 = uq9Var.b;
                    if (yq9Var == (szbVar2 != null ? (yq9) szbVar2.a(xzbVar2) : null)) {
                        cs9 cs9Var = uq9Var.c;
                        cs9 cs9Var2 = this.c;
                        if (cs9Var2 != null) {
                            if (cs9Var != null) {
                                if (cs9Var2 instanceof bs9) {
                                    xl9 xl9Var = ((bs9) cs9Var2).b;
                                    Object a = cs9Var.a();
                                    xl9 xl9Var2 = a instanceof xl9 ? (xl9) a : null;
                                    if (xl9Var2 != null) {
                                    }
                                } else {
                                    if (!(cs9Var2 instanceof as9)) {
                                        b6e.s();
                                        return false;
                                    }
                                    fr8 fr8Var = ((as9) cs9Var2).b;
                                    Object a2 = cs9Var.a();
                                    fr8 fr8Var2 = a2 instanceof fr8 ? (fr8) a2 : null;
                                    if (fr8Var2 != null && ((Number) fr8Var.a.a(xzbVar)).intValue() == ((Number) fr8Var2.a.a(xzbVar2)).intValue() && ((Number) fr8Var.b.a(xzbVar)).longValue() == ((Number) fr8Var2.b.a(xzbVar2)).longValue()) {
                                        ix8 ix8Var = fr8Var.c;
                                        ix8 ix8Var2 = fr8Var2.c;
                                    }
                                }
                            }
                            z = false;
                        }
                        if (z) {
                            if (((Number) this.d.a(xzbVar)).doubleValue() == ((Number) uq9Var.d.a(xzbVar2)).doubleValue()) {
                                js9 js9Var = uq9Var.e;
                                js9 js9Var2 = this.e;
                                if (js9Var2 != null) {
                                    if (js9Var != null) {
                                        szb szbVar3 = js9Var2.a;
                                        Long l = szbVar3 != null ? (Long) szbVar3.a(xzbVar) : null;
                                        szb szbVar4 = js9Var.a;
                                        if (Intrinsics.d(l, szbVar4 != null ? (Long) szbVar4.a(xzbVar2) : null)) {
                                            ln9 ln9Var = js9Var2.b;
                                            ln9 ln9Var2 = js9Var.b;
                                        }
                                    }
                                    z2 = false;
                                }
                                if (z2) {
                                    szb szbVar5 = this.f;
                                    Long l2 = szbVar5 != null ? (Long) szbVar5.a(xzbVar) : null;
                                    szb szbVar6 = uq9Var.f;
                                    if (Intrinsics.d(l2, szbVar6 != null ? (Long) szbVar6.a(xzbVar2) : null)) {
                                        szb szbVar7 = this.g;
                                        String str = szbVar7 != null ? (String) szbVar7.a(xzbVar) : null;
                                        szb szbVar8 = uq9Var.g;
                                        if (Intrinsics.d(str, szbVar8 != null ? (String) szbVar8.a(xzbVar2) : null)) {
                                            szb szbVar9 = this.h;
                                            String str2 = szbVar9 != null ? (String) szbVar9.a(xzbVar) : null;
                                            szb szbVar10 = uq9Var.h;
                                            if (Intrinsics.d(str2, szbVar10 != null ? (String) szbVar10.a(xzbVar2) : null)) {
                                                szb szbVar11 = this.i;
                                                Long l3 = szbVar11 != null ? (Long) szbVar11.a(xzbVar) : null;
                                                szb szbVar12 = uq9Var.i;
                                                if (Intrinsics.d(l3, szbVar12 != null ? (Long) szbVar12.a(xzbVar2) : null) && this.j.a(xzbVar) == uq9Var.j.a(xzbVar2)) {
                                                    szb szbVar13 = this.k;
                                                    JSONObject jSONObject = szbVar13 != null ? (JSONObject) szbVar13.a(xzbVar) : null;
                                                    szb szbVar14 = uq9Var.k;
                                                    if (Intrinsics.d(jSONObject, szbVar14 != null ? (JSONObject) szbVar14.a(xzbVar2) : null)) {
                                                        szb szbVar15 = this.l;
                                                        e09 e09Var = szbVar15 != null ? (e09) szbVar15.a(xzbVar) : null;
                                                        szb szbVar16 = uq9Var.l;
                                                        if (e09Var == (szbVar16 != null ? (e09) szbVar16.a(xzbVar2) : null)) {
                                                            szb szbVar17 = this.m;
                                                            Long l4 = szbVar17 != null ? (Long) szbVar17.a(xzbVar) : null;
                                                            szb szbVar18 = uq9Var.m;
                                                            if (Intrinsics.d(l4, szbVar18 != null ? (Long) szbVar18.a(xzbVar2) : null)) {
                                                                szb szbVar19 = this.n;
                                                                Double d = szbVar19 != null ? (Double) szbVar19.a(xzbVar) : null;
                                                                szb szbVar20 = uq9Var.n;
                                                                if (Intrinsics.b(d, szbVar20 != null ? (Double) szbVar20.a(xzbVar2) : null)) {
                                                                    szb szbVar21 = this.o;
                                                                    Long l5 = szbVar21 != null ? (Long) szbVar21.a(xzbVar) : null;
                                                                    szb szbVar22 = uq9Var.o;
                                                                    if (Intrinsics.d(l5, szbVar22 != null ? (Long) szbVar22.a(xzbVar2) : null)) {
                                                                        ts9 ts9Var = uq9Var.p;
                                                                        ts9 ts9Var2 = this.p;
                                                                        if (ts9Var2 != null) {
                                                                            if (ts9Var != null) {
                                                                                if (ts9Var2 instanceof rs9) {
                                                                                    ct9 ct9Var = ((rs9) ts9Var2).b;
                                                                                    Object a3 = ts9Var.a();
                                                                                    ct9 ct9Var2 = a3 instanceof ct9 ? (ct9) a3 : null;
                                                                                    if (ct9Var2 != null) {
                                                                                        if (((Number) ct9Var.a.a(xzbVar)).intValue() == ((Number) ct9Var2.a.a(xzbVar2)).intValue()) {
                                                                                            if (((Number) ct9Var.b.a(xzbVar)).doubleValue() == ((Number) ct9Var2.b.a(xzbVar2)).doubleValue()) {
                                                                                                if (((Boolean) ct9Var.c.a(xzbVar)).booleanValue() == ((Boolean) ct9Var2.c.a(xzbVar2)).booleanValue()) {
                                                                                                    if (((Boolean) ct9Var.d.a(xzbVar)).booleanValue() == ((Boolean) ct9Var2.d.a(xzbVar2)).booleanValue()) {
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                } else {
                                                                                    if (!(ts9Var2 instanceof ss9)) {
                                                                                        b6e.s();
                                                                                        return false;
                                                                                    }
                                                                                    it9 it9Var = ((ss9) ts9Var2).b;
                                                                                    Object a4 = ts9Var.a();
                                                                                    it9 it9Var2 = a4 instanceof it9 ? (it9) a4 : null;
                                                                                    if (it9Var2 != null) {
                                                                                        if (((Number) it9Var.a.a(xzbVar)).intValue() == ((Number) it9Var2.a.a(xzbVar2)).intValue()) {
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                            z3 = false;
                                                                        }
                                                                        if (z3 && ((Number) this.q.a(xzbVar)).longValue() == ((Number) uq9Var.q.a(xzbVar2)).longValue()) {
                                                                            szb szbVar23 = this.r;
                                                                            e89 e89Var = szbVar23 != null ? (e89) szbVar23.a(xzbVar) : null;
                                                                            szb szbVar24 = uq9Var.r;
                                                                            if (e89Var == (szbVar24 != null ? (e89) szbVar24.a(xzbVar2) : null)) {
                                                                                szb szbVar25 = this.s;
                                                                                Integer num = szbVar25 != null ? (Integer) szbVar25.a(xzbVar) : null;
                                                                                szb szbVar26 = uq9Var.s;
                                                                                if (Intrinsics.d(num, szbVar26 != null ? (Integer) szbVar26.a(xzbVar2) : null)) {
                                                                                    dj9 dj9Var = uq9Var.t;
                                                                                    dj9 dj9Var2 = this.t;
                                                                                    if (dj9Var2 != null ? dj9Var2.a(dj9Var, xzbVar, xzbVar2) : dj9Var == null) {
                                                                                        szb szbVar27 = this.u;
                                                                                        Long l6 = szbVar27 != null ? (Long) szbVar27.a(xzbVar) : null;
                                                                                        szb szbVar28 = uq9Var.u;
                                                                                        if (Intrinsics.d(l6, szbVar28 != null ? (Long) szbVar28.a(xzbVar2) : null)) {
                                                                                            szb szbVar29 = this.v;
                                                                                            e89 e89Var2 = szbVar29 != null ? (e89) szbVar29.a(xzbVar) : null;
                                                                                            szb szbVar30 = uq9Var.v;
                                                                                            if (e89Var2 == (szbVar30 != null ? (e89) szbVar30.a(xzbVar2) : null)) {
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
        return false;
    }

    public final int b() {
        int i;
        int i2;
        int i3;
        int i4;
        int hashCode;
        int intValue;
        int i5;
        Integer num = this.w;
        if (num != null) {
            return num.intValue();
        }
        int hashCode2 = ern.a(uq9.class).hashCode();
        List list = this.a;
        if (list != null) {
            Iterator it = list.iterator();
            i = 0;
            while (it.hasNext()) {
                i += ((bd8) it.next()).b();
            }
        } else {
            i = 0;
        }
        int i6 = hashCode2 + i;
        szb szbVar = this.b;
        int hashCode3 = i6 + (szbVar != null ? szbVar.hashCode() : 0);
        cs9 cs9Var = this.c;
        if (cs9Var != null) {
            Integer num2 = cs9Var.a;
            if (num2 != null) {
                i2 = num2.intValue();
            } else {
                int hashCode4 = ern.a(cs9Var.getClass()).hashCode();
                if (cs9Var instanceof bs9) {
                    i5 = ((bs9) cs9Var).b.a();
                } else if (cs9Var instanceof as9) {
                    fr8 fr8Var = ((as9) cs9Var).b;
                    Integer num3 = fr8Var.d;
                    if (num3 != null) {
                        i5 = num3.intValue();
                    } else {
                        int hashCode5 = fr8Var.b.hashCode() + fr8Var.a.hashCode() + ern.a(fr8.class).hashCode();
                        ix8 ix8Var = fr8Var.c;
                        int b = hashCode5 + (ix8Var != null ? ix8Var.b() : 0);
                        fr8Var.d = Integer.valueOf(b);
                        i5 = b;
                    }
                } else {
                    b6e.s();
                    i2 = 0;
                }
                int i7 = hashCode4 + i5;
                cs9Var.a = Integer.valueOf(i7);
                i2 = i7;
            }
        } else {
            i2 = 0;
        }
        int hashCode6 = this.d.hashCode() + hashCode3 + i2;
        js9 js9Var = this.e;
        if (js9Var != null) {
            Integer num4 = js9Var.c;
            if (num4 != null) {
                i3 = num4.intValue();
            } else {
                int hashCode7 = ern.a(js9.class).hashCode();
                szb szbVar2 = js9Var.a;
                int hashCode8 = hashCode7 + (szbVar2 != null ? szbVar2.hashCode() : 0);
                ln9 ln9Var = js9Var.b;
                int b2 = hashCode8 + (ln9Var != null ? ln9Var.b() : 0);
                js9Var.c = Integer.valueOf(b2);
                i3 = b2;
            }
        } else {
            i3 = 0;
        }
        int i8 = hashCode6 + i3;
        szb szbVar3 = this.f;
        int hashCode9 = i8 + (szbVar3 != null ? szbVar3.hashCode() : 0);
        szb szbVar4 = this.g;
        int hashCode10 = hashCode9 + (szbVar4 != null ? szbVar4.hashCode() : 0);
        szb szbVar5 = this.h;
        int hashCode11 = hashCode10 + (szbVar5 != null ? szbVar5.hashCode() : 0);
        szb szbVar6 = this.i;
        int hashCode12 = this.j.hashCode() + hashCode11 + (szbVar6 != null ? szbVar6.hashCode() : 0);
        szb szbVar7 = this.k;
        int hashCode13 = hashCode12 + (szbVar7 != null ? szbVar7.hashCode() : 0);
        szb szbVar8 = this.l;
        int hashCode14 = hashCode13 + (szbVar8 != null ? szbVar8.hashCode() : 0);
        szb szbVar9 = this.m;
        int hashCode15 = hashCode14 + (szbVar9 != null ? szbVar9.hashCode() : 0);
        szb szbVar10 = this.n;
        int hashCode16 = hashCode15 + (szbVar10 != null ? szbVar10.hashCode() : 0);
        szb szbVar11 = this.o;
        int hashCode17 = hashCode16 + (szbVar11 != null ? szbVar11.hashCode() : 0);
        ts9 ts9Var = this.p;
        if (ts9Var != null) {
            Integer num5 = ts9Var.a;
            if (num5 != null) {
                i4 = num5.intValue();
            } else {
                int hashCode18 = ern.a(ts9Var.getClass()).hashCode();
                if (ts9Var instanceof rs9) {
                    ct9 ct9Var = ((rs9) ts9Var).b;
                    Integer num6 = ct9Var.f;
                    if (num6 != null) {
                        intValue = num6.intValue();
                        int i9 = hashCode18 + intValue;
                        ts9Var.a = Integer.valueOf(i9);
                        i4 = i9;
                    } else {
                        hashCode = ct9Var.d.hashCode() + ct9Var.c.hashCode() + ct9Var.b.hashCode() + ct9Var.a.hashCode() + ern.a(ct9.class).hashCode() + ct9Var.e.b();
                        ct9Var.f = Integer.valueOf(hashCode);
                        intValue = hashCode;
                        int i92 = hashCode18 + intValue;
                        ts9Var.a = Integer.valueOf(i92);
                        i4 = i92;
                    }
                } else if (ts9Var instanceof ss9) {
                    it9 it9Var = ((ss9) ts9Var).b;
                    Integer num7 = it9Var.c;
                    if (num7 != null) {
                        intValue = num7.intValue();
                        int i922 = hashCode18 + intValue;
                        ts9Var.a = Integer.valueOf(i922);
                        i4 = i922;
                    } else {
                        hashCode = it9Var.b.hashCode() + it9Var.a.hashCode() + ern.a(it9.class).hashCode();
                        it9Var.c = Integer.valueOf(hashCode);
                        intValue = hashCode;
                        int i9222 = hashCode18 + intValue;
                        ts9Var.a = Integer.valueOf(i9222);
                        i4 = i9222;
                    }
                } else {
                    b6e.s();
                    i4 = 0;
                }
            }
        } else {
            i4 = 0;
        }
        int hashCode19 = this.q.hashCode() + hashCode17 + i4;
        szb szbVar12 = this.r;
        int hashCode20 = hashCode19 + (szbVar12 != null ? szbVar12.hashCode() : 0);
        szb szbVar13 = this.s;
        int hashCode21 = hashCode20 + (szbVar13 != null ? szbVar13.hashCode() : 0);
        dj9 dj9Var = this.t;
        int b3 = hashCode21 + (dj9Var != null ? dj9Var.b() : 0);
        szb szbVar14 = this.u;
        int hashCode22 = b3 + (szbVar14 != null ? szbVar14.hashCode() : 0);
        szb szbVar15 = this.v;
        int hashCode23 = hashCode22 + (szbVar15 != null ? szbVar15.hashCode() : 0);
        this.w = Integer.valueOf(hashCode23);
        return hashCode23;
    }

    @Override // defpackage.u1f
    public final JSONObject r() {
        return ((os9) rj3.b.P8.getValue()).b(rj3.a, this);
    }
}
