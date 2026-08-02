package defpackage;

import com.yandex.music.databases.main.MainDatabase;
import com.yandex.music.databases.user.UserDatabase;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class ct extends aur implements Function1 {
    public final /* synthetic */ int j;
    public int k;
    public ueo l;
    public Object m;
    public Object n;
    public Object o;
    public int p;
    public int q;
    public Object r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ct(ueo ueoVar, Continuation continuation, Collection collection, b4u b4uVar) {
        super(1, continuation);
        this.j = 6;
        this.n = ueoVar;
        this.m = collection;
        this.r = b4uVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Continuation continuation) {
        switch (this.j) {
            case 0:
                return new ct((MainDatabase) this.l, continuation, (Iterable) this.m, (z20) this.r, 0);
            case 1:
                return new ct((MainDatabase) this.l, continuation, (Iterable) this.m, (lm1) this.r, 1);
            case 2:
                return new ct(this.l, continuation, (Set) this.n);
            case 3:
                return new ct((ueo) this.n, continuation, (Set) this.m, 3);
            case 4:
                return new ct(this.l, continuation, (List) this.n, (List) this.m, 4);
            case 5:
                return new ct((ueo) this.n, continuation, (List) this.m, 5);
            case 6:
                return new ct((ueo) this.n, continuation, (Collection) this.m, (b4u) this.r);
            default:
                return new ct(this.l, continuation, (List) this.n, (String) this.m, 7);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Continuation continuation = (Continuation) obj;
        switch (this.j) {
        }
        return ((ct) create(continuation)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:97:0x02ad, code lost:
    
        if (r2 == r1) goto L88;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:117:0x036d A[LOOP:4: B:115:0x0367->B:117:0x036d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0408 A[LOOP:5: B:135:0x0402->B:137:0x0408, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x016b  */
    /* JADX WARN: Type inference failed for: r5v26, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r5v30, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r6v14, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:115:0x03ef -> B:107:0x03f3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x01a4 -> B:46:0x01a8). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:98:0x0358 -> B:90:0x035c). Please report as a decompilation issue!!! */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        MainDatabase mainDatabase;
        Iterator it;
        int i;
        int i2;
        MainDatabase mainDatabase2;
        Iterator it2;
        int i3;
        int i4;
        j20 j20Var;
        HashSet hashSet;
        int i5;
        int i6;
        Iterator it3;
        MainDatabase mainDatabase3;
        HashSet hashSet2;
        int i7;
        Iterator it4;
        int i8;
        bok H;
        bok bokVar;
        int i9;
        int i10;
        MainDatabase mainDatabase4;
        LinkedHashSet linkedHashSet;
        int i11;
        Iterator it5;
        MainDatabase mainDatabase5;
        Iterator it6;
        int i12;
        int i13;
        UserDatabase userDatabase;
        Iterator it7;
        int i14;
        int i15;
        int i16 = 10;
        int i17 = 0;
        switch (this.j) {
            case 0:
                Object obj2 = nm6.a;
                int i18 = this.k;
                if (i18 == 0) {
                    qgg.h0(obj);
                    mainDatabase = (MainDatabase) this.l;
                    it = ((Iterable) this.m).iterator();
                    i = 0;
                    i2 = 0;
                } else if (i18 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    int i19 = this.q;
                    int i20 = this.p;
                    it = (Iterator) this.o;
                    mainDatabase = (MainDatabase) this.n;
                    qgg.h0(obj);
                    i2 = i19;
                    i = i20;
                }
                while (it.hasNext()) {
                    au auVar = (au) it.next();
                    tfs tfsVar = wc7.a;
                    Date date = auVar.c;
                    if (date == null) {
                        date = new Date(0L);
                    }
                    String a = wc7.a(date);
                    z20 z20Var = (z20) this.r;
                    String str = auVar.a;
                    boolean z = auVar.b;
                    this.n = mainDatabase;
                    this.o = it;
                    this.p = i;
                    this.q = i2;
                    this.k = 1;
                    Object G = up6.G(z20Var.a, false, true, new y20(z, a, str, 0), this);
                    if (G != nm6.a) {
                        G = Unit.a;
                    }
                    if (G == obj2) {
                        break;
                    }
                }
                mainDatabase.F("album");
                break;
            case 1:
                Object obj3 = nm6.a;
                int i21 = this.k;
                if (i21 == 0) {
                    qgg.h0(obj);
                    mainDatabase2 = (MainDatabase) this.l;
                    it2 = ((Iterable) this.m).iterator();
                    i3 = 0;
                    i4 = 0;
                } else if (i21 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    int i22 = this.q;
                    int i23 = this.p;
                    it2 = (Iterator) this.o;
                    mainDatabase2 = (MainDatabase) this.n;
                    qgg.h0(obj);
                    i4 = i22;
                    i3 = i23;
                }
                while (it2.hasNext()) {
                    ac1 ac1Var = (ac1) it2.next();
                    tfs tfsVar2 = wc7.a;
                    Date date2 = ac1Var.c;
                    if (date2 == null) {
                        date2 = new Date(0L);
                    }
                    final String a2 = wc7.a(date2);
                    lm1 lm1Var = (lm1) this.r;
                    final String str2 = ac1Var.a;
                    j1g j1gVar = ac1Var.b;
                    final boolean z2 = j1gVar == j1g.a;
                    final boolean z3 = j1gVar == j1g.c;
                    this.n = mainDatabase2;
                    this.o = it2;
                    this.p = i3;
                    this.q = i4;
                    this.k = 1;
                    Object G2 = up6.G(lm1Var.a, false, true, new Function1() { // from class: km1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj4) {
                            boolean z4 = z2;
                            boolean z5 = z3;
                            String str3 = a2;
                            String str4 = str2;
                            xjo xjoVar = (xjo) obj4;
                            xjoVar.getClass();
                            cko D0 = xjoVar.D0("UPDATE artist SET liked = ?, disliked = ?, timestamp = ? WHERE original_id = ?");
                            try {
                                D0.bindLong(1, z4 ? 1L : 0L);
                                D0.bindLong(2, z5 ? 1L : 0L);
                                D0.E(3, str3);
                                D0.E(4, str4);
                                D0.q();
                                D0.close();
                                return Unit.a;
                            } catch (Throwable th) {
                                D0.close();
                                throw th;
                            }
                        }
                    }, this);
                    if (G2 != nm6.a) {
                        G2 = Unit.a;
                    }
                    if (G2 == obj3) {
                        break;
                    }
                }
                mainDatabase2.F("artist");
                break;
            case 2:
                nm6 nm6Var = nm6.a;
                int i24 = this.k;
                if (i24 == 0) {
                    qgg.h0(obj);
                    j20 x = ((MainDatabase) this.l).x();
                    ArrayList H2 = CollectionsKt.H((Set) this.n, 950);
                    j20Var = x;
                    hashSet = new HashSet();
                    i5 = 0;
                    i6 = 0;
                    it3 = H2.iterator();
                    if (it3.hasNext()) {
                    }
                } else if (i24 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    i5 = this.q;
                    int i25 = this.p;
                    it3 = (Iterator) this.o;
                    Collection collection = (Collection) this.r;
                    j20Var = (j20) this.m;
                    qgg.h0(obj);
                    i6 = i25;
                    hashSet = collection;
                    Object b = obj;
                    Iterable iterable = (Iterable) b;
                    ArrayList arrayList = new ArrayList(v75.o(iterable, 10));
                    Iterator it8 = iterable.iterator();
                    while (it8.hasNext()) {
                        arrayList.add(((l10) it8.next()).a);
                    }
                    z75.t(hashSet, arrayList);
                    if (it3.hasNext()) {
                        List list = (List) it3.next();
                        this.m = j20Var;
                        this.r = hashSet;
                        this.o = it3;
                        this.p = i6;
                        this.q = i5;
                        this.k = 1;
                        b = j20Var.b(list, this);
                        if (b == nm6Var) {
                            break;
                        }
                        Iterable iterable2 = (Iterable) b;
                        ArrayList arrayList2 = new ArrayList(v75.o(iterable2, 10));
                        Iterator it82 = iterable2.iterator();
                        while (it82.hasNext()) {
                        }
                        z75.t(hashSet, arrayList2);
                        if (it3.hasNext()) {
                        }
                    }
                }
                break;
            case 3:
                nm6 nm6Var2 = nm6.a;
                int i26 = this.k;
                if (i26 == 0) {
                    qgg.h0(obj);
                    MainDatabase mainDatabase6 = (MainDatabase) ((ueo) this.n);
                    ArrayList H3 = CollectionsKt.H((Set) this.m, 950);
                    mainDatabase3 = mainDatabase6;
                    hashSet2 = new HashSet();
                    i7 = 0;
                    it4 = H3.iterator();
                    i8 = 0;
                    if (it4.hasNext()) {
                    }
                } else if (i26 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    int i27 = this.q;
                    int i28 = this.p;
                    it4 = (Iterator) this.o;
                    Collection collection2 = (Collection) this.r;
                    mainDatabase3 = (MainDatabase) this.l;
                    qgg.h0(obj);
                    i8 = i27;
                    i7 = i28;
                    Object G3 = obj;
                    hashSet2 = collection2;
                    HashSet hashSet3 = new HashSet();
                    Iterator it9 = ((Iterable) G3).iterator();
                    while (it9.hasNext()) {
                        hashSet3.add(new Long(((j2m) it9.next()).b));
                    }
                    z75.t(hashSet2, hashSet3);
                    if (it4.hasNext()) {
                        List list2 = (List) it4.next();
                        q1m K = mainDatabase3.K();
                        ysr ysrVar = new ysr("playlist_track");
                        um4 um4Var = new um4(pgp.c);
                        um4Var.e("track_id", list2);
                        tt0.K(ysrVar, um4Var);
                        atn a3 = ysrVar.a();
                        this.l = mainDatabase3;
                        this.r = hashSet2;
                        this.o = it4;
                        this.p = i7;
                        this.q = i8;
                        this.k = 1;
                        K.getClass();
                        TreeMap treeMap = afo.h;
                        j6e a4 = wyf.x(a3).a();
                        G3 = up6.G(K.a, true, false, new g20((String) a4.a, a4, K, 7), this);
                        if (G3 == nm6Var2) {
                            break;
                        }
                        HashSet hashSet32 = new HashSet();
                        Iterator it92 = ((Iterable) G3).iterator();
                        while (it92.hasNext()) {
                        }
                        z75.t(hashSet2, hashSet32);
                        if (it4.hasNext()) {
                        }
                    }
                }
                break;
            case 4:
                Object obj4 = nm6.a;
                int i29 = this.k;
                if (i29 != 0) {
                    if (i29 != 1) {
                        if (i29 == 2) {
                            qgg.h0(obj);
                            break;
                        } else {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        }
                    } else {
                        i9 = this.q;
                        i10 = this.p;
                        H = (bok) this.o;
                        bokVar = (bok) this.r;
                        qgg.h0(obj);
                    }
                } else {
                    qgg.h0(obj);
                    H = ((MainDatabase) this.l).H();
                    List list3 = (List) this.n;
                    HashSet hashSet4 = new HashSet();
                    Iterator it10 = list3.iterator();
                    while (it10.hasNext()) {
                        hashSet4.add(new Integer(v5g.Q((lxs) it10.next())));
                    }
                    this.r = H;
                    this.o = H;
                    this.p = 0;
                    this.q = 0;
                    this.k = 1;
                    H.getClass();
                    StringBuilder sb = new StringBuilder();
                    sb.append("DELETE FROM phonotekaSyncSavedTrack WHERE track_list_type IN (");
                    swf.x(hashSet4.size(), sb);
                    sb.append(")");
                    Object G4 = up6.G(H.a, false, true, new avi(9, sb.toString(), hashSet4), this);
                    if (G4 != nm6.a) {
                        G4 = Unit.a;
                    }
                    if (G4 != obj4) {
                        bokVar = H;
                        i9 = 0;
                        i10 = 0;
                    }
                    break;
                }
                List<unk> list4 = (List) this.m;
                ArrayList arrayList3 = new ArrayList(v75.o(list4, 10));
                for (unk unkVar : list4) {
                    rr5 rr5Var = unkVar.a;
                    String str3 = rr5Var.a;
                    String str4 = rr5Var.b;
                    Date date3 = unkVar.b;
                    arrayList3.add(new drk(v5g.Q(unkVar.c), 0L, str3, str4, date3 != null ? wc7.a(date3) : null));
                }
                this.r = bokVar;
                this.o = null;
                this.p = i10;
                this.q = i9;
                this.k = 2;
                Object G5 = up6.G(H.a, false, true, new avi(i16, H, arrayList3), this);
                if (G5 != nm6.a) {
                    G5 = Unit.a;
                    break;
                }
                break;
            case 5:
                nm6 nm6Var3 = nm6.a;
                int i30 = this.k;
                if (i30 == 0) {
                    qgg.h0(obj);
                    MainDatabase mainDatabase7 = (MainDatabase) ((ueo) this.n);
                    ArrayList H4 = CollectionsKt.H((List) this.m, 950);
                    mainDatabase4 = mainDatabase7;
                    linkedHashSet = new LinkedHashSet();
                    i11 = 0;
                    it5 = H4.iterator();
                    if (it5.hasNext()) {
                    }
                } else if (i30 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    i11 = this.q;
                    int i31 = this.p;
                    it5 = (Iterator) this.o;
                    Collection collection3 = (Collection) this.r;
                    mainDatabase4 = (MainDatabase) this.l;
                    qgg.h0(obj);
                    i17 = i31;
                    linkedHashSet = collection3;
                    Object b2 = obj;
                    z75.t(linkedHashSet, (Iterable) b2);
                    if (it5.hasNext()) {
                        List list5 = (List) it5.next();
                        uxs Q = mainDatabase4.Q();
                        ysr ysrVar2 = new ysr("track_mview");
                        um4 um4Var2 = new um4(pgp.c);
                        um4Var2.e("original_id", list5);
                        tt0.K(ysrVar2, um4Var2);
                        atn a5 = ysrVar2.a();
                        this.l = mainDatabase4;
                        this.r = linkedHashSet;
                        this.o = it5;
                        this.p = i17;
                        this.q = i11;
                        this.k = 1;
                        b2 = Q.b(a5, this);
                        if (b2 == nm6Var3) {
                            break;
                        }
                        z75.t(linkedHashSet, (Iterable) b2);
                        if (it5.hasNext()) {
                        }
                    }
                }
                break;
            case 6:
                Object obj5 = nm6.a;
                int i32 = this.k;
                if (i32 == 0) {
                    qgg.h0(obj);
                    mainDatabase5 = (MainDatabase) ((ueo) this.n);
                    it6 = ((Collection) this.m).iterator();
                    i12 = 0;
                    i13 = 0;
                } else if (i32 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    i12 = this.q;
                    i13 = this.p;
                    it6 = (Iterator) this.o;
                    mainDatabase5 = (MainDatabase) this.l;
                    qgg.h0(obj);
                }
                while (it6.hasNext()) {
                    r4u r4uVar = (r4u) it6.next();
                    Date date4 = r4uVar.c;
                    String a6 = date4 != null ? wc7.a(date4) : null;
                    n3u V = mainDatabase5.V();
                    String str5 = r4uVar.a;
                    j1g j1gVar2 = r4uVar.b;
                    Integer num = j1gVar2 != null ? new Integer(b4u.j(j1gVar2)) : null;
                    this.l = mainDatabase5;
                    this.o = it6;
                    this.p = i13;
                    this.q = i12;
                    this.k = 1;
                    Object G6 = up6.G(V.a, false, true, new zzq(12, num, a6, str5), this);
                    if (G6 != nm6.a) {
                        G6 = Unit.a;
                    }
                    if (G6 == obj5) {
                        break;
                    }
                }
                break;
            default:
                Object obj6 = nm6.a;
                int i33 = this.k;
                if (i33 == 0) {
                    qgg.h0(obj);
                    userDatabase = (UserDatabase) this.l;
                    it7 = CollectionsKt.H((List) this.n, 950).iterator();
                    i14 = 0;
                    i15 = 0;
                } else if (i33 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    i14 = this.q;
                    i15 = this.p;
                    it7 = (Iterator) this.o;
                    userDatabase = (UserDatabase) this.r;
                    qgg.h0(obj);
                }
                while (it7.hasNext()) {
                    List list6 = (List) it7.next();
                    lou C = userDatabase.C();
                    String str6 = (String) this.m;
                    this.r = userDatabase;
                    this.o = it7;
                    this.p = i15;
                    this.q = i14;
                    this.k = 1;
                    C.getClass();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("DELETE FROM wave_feedback WHERE rotor_session_id = ? AND id IN (");
                    swf.x(list6.size(), sb2);
                    sb2.append(")");
                    Object G7 = up6.G(C.a, false, true, new u3t(1, sb2.toString(), str6, list6), this);
                    if (G7 != nm6.a) {
                        G7 = Unit.a;
                    }
                    if (G7 == obj6) {
                        break;
                    }
                }
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ct(ueo ueoVar, Continuation continuation, Collection collection, int i) {
        super(1, continuation);
        this.j = i;
        this.n = ueoVar;
        this.m = collection;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ct(ueo ueoVar, Continuation continuation, List list, Object obj, int i) {
        super(1, continuation);
        this.j = i;
        this.l = ueoVar;
        this.n = list;
        this.m = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ct(ueo ueoVar, Continuation continuation, Set set) {
        super(1, continuation);
        this.j = 2;
        this.l = ueoVar;
        this.n = set;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ct(MainDatabase mainDatabase, Continuation continuation, Iterable iterable, Object obj, int i) {
        super(1, continuation);
        this.j = i;
        this.l = mainDatabase;
        this.m = iterable;
        this.r = obj;
    }
}
