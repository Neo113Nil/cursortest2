package defpackage;

import com.yandex.media.ynison.service.f;
import com.yandex.media.ynison.service.r;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public final class qjw extends aur implements Function2 {
    public final /* synthetic */ wab A;
    public final /* synthetic */ z4q B;
    public final /* synthetic */ Map C;
    public ArrayList j;
    public ArrayList k;
    public z4q l;
    public Object m;
    public wab n;
    public z4q o;
    public Collection p;
    public Iterator q;
    public Collection r;
    public boolean s;
    public int t;
    public int u;
    public int v;
    public int w;
    public /* synthetic */ Object x;
    public final /* synthetic */ akw y;
    public final /* synthetic */ List z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qjw(akw akwVar, List list, wab wabVar, z4q z4qVar, Map map, Continuation continuation) {
        super(2, continuation);
        this.y = akwVar;
        this.z = list;
        this.A = wabVar;
        this.B = z4qVar;
        this.C = map;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        qjw qjwVar = new qjw(this.y, this.z, this.A, this.B, this.C, continuation);
        qjwVar.x = obj;
        return qjwVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((qjw) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:138:0x0238, code lost:
    
        if (r2 == r6) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x02e1, code lost:
    
        if (r4 != null) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x02fb, code lost:
    
        if (r6 != null) goto L103;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0219  */
    /* JADX WARN: Type inference failed for: r10v16, types: [kotlin.coroutines.CoroutineContext, pm6] */
    /* JADX WARN: Type inference failed for: r12v18, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r14v21 */
    /* JADX WARN: Type inference failed for: r14v22 */
    /* JADX WARN: Type inference failed for: r14v9, types: [java.lang.Object, java.util.ArrayList, java.util.Collection, java.util.Iterator, wab, z4q] */
    /* JADX WARN: Type inference failed for: r4v13, types: [java.lang.Object, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v32 */
    /* JADX WARN: Type inference failed for: r4v33, types: [dlr] */
    /* JADX WARN: Type inference failed for: r4v35, types: [dlr] */
    /* JADX WARN: Type inference failed for: r4v49 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [kotlin.coroutines.CoroutineContext, pm6] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17, types: [com.yandex.media.ynison.service.f] */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v24, types: [r3q] */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v26, types: [fa7] */
    /* JADX WARN: Type inference failed for: r9v27, types: [fa7] */
    /* JADX WARN: Type inference failed for: r9v29, types: [r3q] */
    /* JADX WARN: Type inference failed for: r9v32 */
    /* JADX WARN: Type inference failed for: r9v33, types: [dlr] */
    /* JADX WARN: Type inference failed for: r9v34, types: [dlr] */
    /* JADX WARN: Type inference failed for: r9v35, types: [com.yandex.media.ynison.service.f] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:113:0x01f8 -> B:108:0x01fe). Please report as a decompilation issue!!! */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ArrayList arrayList;
        List list;
        ArrayList arrayList2;
        int i;
        Object H;
        ArrayList arrayList3;
        List list2;
        ArrayList arrayList4;
        List list3;
        ?? r4;
        akw akwVar;
        z4q z4qVar;
        z4q z4qVar2;
        z4q z4qVar3;
        int i2;
        z4q z4qVar4;
        Iterator it;
        int i3;
        z4q z4qVar5;
        z4q z4qVar6;
        wab wabVar;
        boolean z;
        int i4;
        int i5;
        ArrayList arrayList5;
        akw akwVar2;
        int i6;
        z4q z4qVar7;
        List<iou> list4;
        z4q z4qVar8;
        ?? r14;
        Object v;
        ?? r42;
        String str;
        String H2;
        String t;
        String str2;
        String g;
        mm6 mm6Var = (mm6) this.x;
        nm6 nm6Var = nm6.a;
        int i7 = this.w;
        wab wabVar2 = this.A;
        akw akwVar3 = this.y;
        List list5 = this.z;
        int i8 = 1;
        int i9 = 2;
        if (i7 == 0) {
            z4q z4qVar9 = null;
            xqn i10 = hrg.i(obj);
            arrayList = new ArrayList();
            ArrayList arrayList6 = new ArrayList();
            String str3 = akw.j;
            List k = jhp.k(new o7t(new lcc(new o7t(CollectionsKt.F(list5), new d9w(28)), true, san.o), new d9w(29)));
            for (r rVar : wabVar2.b) {
                int k2 = rVar.k();
                int i11 = k2 == 0 ? -1 : pjw.a[ouj.D(k2)];
                if (i11 != -1) {
                    if (i11 == i8) {
                        akwVar = akwVar3;
                        ArrayList arrayList7 = arrayList6;
                        list3 = k;
                        z4q z4qVar10 = z4qVar9;
                        arrayList.add(rVar);
                        if (i10.a == null) {
                            akwVar3 = akwVar;
                            list2 = list5;
                            arrayList4 = arrayList7;
                            r4 = z4qVar10;
                            i10.a = x97.p(mm6Var, r4, r4, new ocu(akwVar3, rVar, this.B, wabVar2, (Continuation) null, 11), 3);
                            z4qVar9 = r4;
                            k = list3;
                            arrayList6 = arrayList4;
                            list5 = list2;
                            i8 = 1;
                            i9 = 2;
                        } else {
                            list2 = list5;
                            r4 = z4qVar10;
                            arrayList4 = arrayList7;
                        }
                    } else if (i11 == i9) {
                        akwVar = akwVar3;
                        ocu ocuVar = new ocu(akwVar, rVar, this.C, k, (Continuation) null, 12);
                        list3 = k;
                        ?? r10 = z4qVar9;
                        arrayList6.add(x97.p(mm6Var, r10, r10, ocuVar, 3));
                        list2 = list5;
                        arrayList4 = arrayList6;
                        r4 = r10;
                    } else {
                        if (i11 != 3) {
                            b6e.s();
                            return z4qVar9;
                        }
                        list2 = list5;
                    }
                    akwVar3 = akwVar;
                    z4qVar9 = r4;
                    k = list3;
                    arrayList6 = arrayList4;
                    list5 = list2;
                    i8 = 1;
                    i9 = 2;
                } else {
                    list2 = list5;
                }
                arrayList4 = arrayList6;
                list3 = k;
                r4 = z4qVar9;
                arrayList4.add(hld.i(new jd5(new r9q(iow.a, list3), rVar.i())));
                z4qVar9 = r4;
                k = list3;
                arrayList6 = arrayList4;
                list5 = list2;
                i8 = 1;
                i9 = 2;
            }
            list = list5;
            arrayList2 = arrayList6;
            z4q z4qVar11 = z4qVar9;
            i = 3;
            mu7 mu7Var = (mu7) i10.a;
            z4qVar = z4qVar11;
            if (mu7Var != null) {
                this.x = z4qVar11;
                this.j = arrayList;
                this.k = arrayList2;
                this.w = 1;
                H = mu7Var.H(this);
                if (H != nm6Var) {
                    arrayList3 = arrayList;
                    z4qVar7 = z4qVar11;
                }
                return nm6Var;
            }
            arrayList3 = arrayList;
            arrayList2 = arrayList2;
            z4qVar2 = z4qVar;
            z4qVar3 = z4qVar;
            if (z4qVar2 != null) {
                ArrayList arrayList8 = new ArrayList(v75.o(arrayList3, 10));
                it = arrayList3.iterator();
                i3 = i;
                z4qVar5 = z4qVar2;
                z4qVar6 = z4qVar5;
                wabVar = wabVar2;
                z = false;
                i4 = 0;
                i5 = 0;
                arrayList5 = arrayList8;
                akwVar2 = akwVar3;
                i6 = 0;
                r42 = z4qVar3;
                if (it.hasNext()) {
                }
            } else {
                i2 = i;
                z4qVar4 = z4qVar3;
                list4 = c5b.a;
                z4qVar8 = z4qVar2;
                r14 = z4qVar4;
                this.x = r14;
                this.j = r14;
                this.k = r14;
                this.l = z4qVar8;
                this.m = list4;
                this.n = r14;
                this.o = r14;
                this.p = r14;
                this.q = r14;
                this.r = r14;
                this.w = i2;
                v = ox6.v(arrayList2, this);
                str = r14;
            }
        } else if (i7 == 1) {
            ArrayList arrayList9 = this.k;
            arrayList3 = this.j;
            qgg.h0(obj);
            arrayList2 = arrayList9;
            list = list5;
            z4qVar7 = null;
            i = 3;
            H = obj;
        } else {
            if (i7 != 2) {
                if (i7 != 3) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                list4 = (List) this.m;
                z4qVar8 = this.l;
                qgg.h0(obj);
                list = list5;
                str = null;
                v = obj;
                List<jd5> list6 = (List) v;
                list4.getClass();
                list6.getClass();
                HashMap hashMap = new HashMap();
                for (iou iouVar : list4) {
                    d6v d6vVar = iouVar.a;
                    int i12 = iouVar.b;
                    if (((d6v) hashMap.get(Integer.valueOf(i12))) == null) {
                        hashMap.put(Integer.valueOf(i12), d6vVar);
                    } else {
                        su4.s(2, str, dfi.c(i12, "Should have only one wave entity with key ", ". Skipping new one"), str);
                    }
                }
                HashMap hashMap2 = new HashMap();
                for (jd5 jd5Var : list6) {
                    b6v b6vVar = jd5Var.a;
                    int i13 = jd5Var.b;
                    if (((b6v) hashMap2.get(Integer.valueOf(i13))) == null) {
                        hashMap2.put(Integer.valueOf(i13), b6vVar);
                    } else {
                        su4.s(2, str, dfi.c(i13, "Should have only one phonoteka entity with key ", ". Skipping new one"), str);
                    }
                }
                asw aswVar = new asw(hashMap, hashMap2);
                t9n t9nVar = (t9n) CollectionsKt.Z(list);
                ?? r9 = t9nVar != null ? t9nVar.b : str;
                if (r9 != null) {
                    ?? s = r9.z() ? r9.s() : str;
                    if (s != null) {
                        H2 = s.g();
                    }
                }
                H2 = avf.H();
                if (r9 != null) {
                    ?? v2 = r9.A() ? r9.v() : str;
                    if (v2 != null) {
                        t = v2.g();
                    }
                }
                t = weo.t();
                gxc gxcVar = new gxc(H2, t);
                if (z4qVar8 == null) {
                    Iterator it2 = list.iterator();
                    int i14 = 0;
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        f fVar = ((t9n) it2.next()).b;
                        if (gut.F(fVar) != null) {
                            i14 = 0;
                            break;
                        }
                        int i15 = i14 * 31;
                        String str4 = (String) avf.Q(fVar.t());
                        if (str4 == null) {
                            str4 = "";
                        }
                        int c = k5r.c(i15, 31, str4);
                        dlr p = fVar.p();
                        if (p == null || (g = p.g()) == null || (str2 = (String) avf.Q(g)) == null || StringsKt.N(str2, ':')) {
                            str2 = str;
                        }
                        int hashCode = (c + (str2 != null ? str2.hashCode() : 0)) * 31;
                        u3q entity = y7g.w(fVar, aswVar).getEntity();
                        ?? r92 = entity instanceof r3q ? (r3q) entity : str;
                        ?? a = r92 != null ? vr3.a(r92) : str;
                        i14 = hashCode + (a != null ? a.hashCode() : 0);
                    }
                    return new xaq(new cbq(i14), aswVar, gxcVar);
                }
                Set keySet = hashMap.keySet();
                Set keySet2 = hashMap2.keySet();
                if (!(keySet2 instanceof Collection) || !keySet2.isEmpty()) {
                    Iterator it3 = keySet2.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        if (keySet.contains(new Integer(((Number) it3.next()).intValue()))) {
                            dfi.r("Wave entity key should not be in phonoteka sources keys", akw.j);
                            break;
                        }
                    }
                }
                if (z4qVar8 instanceof u4q) {
                    u4q u4qVar = (u4q) z4qVar8;
                    tnu tnuVar = u4qVar.a;
                    ebq ebqVar = new ebq(tnuVar.a, tnuVar.b);
                    o4q o4qVar = u4qVar.d;
                    s4v s4vVar = u4qVar.c;
                    zaq zaqVar = new zaq(s4vVar.a, s4vVar.b);
                    t4q t4qVar = u4qVar.b;
                    return new abq(ebqVar, o4qVar, zaqVar, new yaq(t4qVar.a, t4qVar.b, t4qVar.c), u4qVar.e, aswVar);
                }
                if (z4qVar8 instanceof s4q) {
                    s4q s4qVar = (s4q) z4qVar8;
                    tnu tnuVar2 = s4qVar.a;
                    ebq ebqVar2 = new ebq(tnuVar2.a, tnuVar2.b);
                    o4q o4qVar2 = s4qVar.d;
                    s4v s4vVar2 = s4qVar.c;
                    zaq zaqVar2 = new zaq(s4vVar2.a, s4vVar2.b);
                    r4q r4qVar = s4qVar.b;
                    return new abq(ebqVar2, o4qVar2, zaqVar2, new yaq(r4qVar.a, r4qVar.b, r4qVar.c), s4qVar.e, aswVar);
                }
                if (!(z4qVar8 instanceof w4q)) {
                    b6e.s();
                    return str;
                }
                w4q w4qVar = (w4q) z4qVar8;
                unu unuVar = w4qVar.a;
                fbq fbqVar = new fbq(unuVar.a, unuVar.b);
                o4q o4qVar3 = w4qVar.d;
                s4v s4vVar3 = w4qVar.c;
                zaq zaqVar3 = new zaq(s4vVar3.a, s4vVar3.b);
                v4q v4qVar = w4qVar.b;
                return new abq(fbqVar, o4qVar3, zaqVar3, new yaq(v4qVar.a, v4qVar.b, v4qVar.c), w4qVar.e, aswVar);
            }
            int i16 = this.v;
            int i17 = this.u;
            int i18 = this.t;
            boolean z2 = this.s;
            Collection collection = this.r;
            Iterator it4 = this.q;
            Collection collection2 = this.p;
            z4q z4qVar12 = this.o;
            wab wabVar3 = this.n;
            akw akwVar4 = (akw) this.m;
            z4q z4qVar13 = this.l;
            ArrayList arrayList10 = this.k;
            qgg.h0(obj);
            i4 = i16;
            list = list5;
            ArrayList arrayList11 = arrayList10;
            z4qVar5 = z4qVar12;
            wabVar = wabVar3;
            akwVar2 = akwVar4;
            Object obj2 = null;
            int i19 = 3;
            Iterator it5 = it4;
            z4q z4qVar14 = z4qVar13;
            i5 = i18;
            boolean z3 = z2;
            i6 = i17;
            Object b = obj;
            ArrayList arrayList12 = collection2;
            collection.add((iou) b);
            z = z3;
            z4qVar6 = z4qVar14;
            arrayList5 = arrayList12;
            i3 = i19;
            r42 = obj2;
            it = it5;
            arrayList2 = arrayList11;
            if (it.hasNext()) {
                r rVar2 = (r) it.next();
                this.x = r42;
                this.j = r42;
                this.k = arrayList2;
                this.l = z4qVar6;
                this.m = akwVar2;
                this.n = wabVar;
                this.o = z4qVar5;
                ArrayList arrayList13 = arrayList5;
                this.p = arrayList13;
                this.q = it;
                this.r = arrayList13;
                this.s = z;
                this.t = i5;
                this.u = i6;
                this.v = i4;
                this.w = 2;
                obj2 = r42;
                z3 = z;
                i19 = i3;
                b = akw.b(akwVar2, rVar2, z4qVar5, wabVar, z3, this);
                if (b != nm6Var) {
                    arrayList11 = arrayList2;
                    it5 = it;
                    ArrayList arrayList14 = arrayList5;
                    z4qVar14 = z4qVar6;
                    collection = arrayList14;
                    arrayList12 = arrayList14;
                    collection.add((iou) b);
                    z = z3;
                    z4qVar6 = z4qVar14;
                    arrayList5 = arrayList12;
                    i3 = i19;
                    r42 = obj2;
                    it = it5;
                    arrayList2 = arrayList11;
                    if (it.hasNext()) {
                        z4q z4qVar15 = r42;
                        i2 = i3;
                        ArrayList arrayList15 = arrayList5;
                        if (arrayList15 != null) {
                            z4qVar8 = z4qVar6;
                            list4 = arrayList15;
                            r14 = z4qVar15;
                            this.x = r14;
                            this.j = r14;
                            this.k = r14;
                            this.l = z4qVar8;
                            this.m = list4;
                            this.n = r14;
                            this.o = r14;
                            this.p = r14;
                            this.q = r14;
                            this.r = r14;
                            this.w = i2;
                            v = ox6.v(arrayList2, this);
                            str = r14;
                        } else {
                            z4qVar2 = z4qVar6;
                            z4qVar4 = z4qVar15;
                            list4 = c5b.a;
                            z4qVar8 = z4qVar2;
                            r14 = z4qVar4;
                            this.x = r14;
                            this.j = r14;
                            this.k = r14;
                            this.l = z4qVar8;
                            this.m = list4;
                            this.n = r14;
                            this.o = r14;
                            this.p = r14;
                            this.q = r14;
                            this.r = r14;
                            this.w = i2;
                            v = ox6.v(arrayList2, this);
                            str = r14;
                        }
                    }
                }
                return nm6Var;
            }
        }
        iou iouVar2 = (iou) H;
        if (iouVar2 != null) {
            z4qVar2 = iouVar2.a.a;
            z4qVar3 = z4qVar7;
            if (z4qVar2 != null) {
            }
        } else {
            arrayList = arrayList3;
            z4qVar = z4qVar7;
            arrayList3 = arrayList;
            arrayList2 = arrayList2;
            z4qVar2 = z4qVar;
            z4qVar3 = z4qVar;
            if (z4qVar2 != null) {
            }
        }
    }
}
