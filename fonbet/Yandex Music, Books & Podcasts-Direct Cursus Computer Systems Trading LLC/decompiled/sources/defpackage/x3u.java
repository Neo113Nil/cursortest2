package defpackage;

import com.yandex.music.databases.main.MainDatabase;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class x3u extends aur implements Function1 {
    public int A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ int j = 1;
    public int k;
    public final /* synthetic */ ueo l;
    public final /* synthetic */ Collection m;
    public final /* synthetic */ b4u n;
    public MainDatabase o;
    public Collection p;
    public Collection q;
    public Iterator r;
    public c4u s;
    public c4u t;
    public b4u u;
    public List v;
    public lm1 w;
    public int x;
    public int y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x3u(ueo ueoVar, b4u b4uVar, String str, Collection collection, Continuation continuation) {
        super(1, continuation);
        this.l = ueoVar;
        this.B = str;
        this.m = collection;
        this.n = b4uVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Continuation continuation) {
        switch (this.j) {
            case 0:
                return new x3u(this.l, continuation, this.m, (Integer) this.B, this.n);
            default:
                String str = (String) this.B;
                Collection collection = this.m;
                return new x3u(this.l, this.n, str, collection, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Continuation continuation = (Continuation) obj;
        switch (this.j) {
        }
        return ((x3u) create(continuation)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0275 A[LOOP:0: B:11:0x026f->B:13:0x0275, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01a1 A[LOOP:1: B:22:0x019b->B:24:0x01a1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0219 A[LOOP:2: B:30:0x0213->B:32:0x0219, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0512 A[LOOP:4: B:66:0x050c->B:68:0x0512, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x043e A[LOOP:5: B:77:0x0438->B:79:0x043e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x04b6 A[LOOP:6: B:85:0x04b0->B:87:0x04b6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x04f2  */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x052e  */
    /* JADX WARN: Type inference failed for: r12v17, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r12v40, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r13v16, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r13v37, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r15v19, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r15v8, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r3v18, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r3v38, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r4v26, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r4v48, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v15, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r9v10, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r9v28, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0255 -> B:10:0x025e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:79:0x04f2 -> B:56:0x04fb). Please report as a decompilation issue!!! */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object G;
        MainDatabase mainDatabase;
        int i;
        Iterator it;
        MainDatabase mainDatabase2;
        ArrayList arrayList;
        int i2;
        int i3;
        int i4;
        ArrayList arrayList2;
        ArrayList arrayList3;
        b4u b4uVar;
        List list;
        lm1 lm1Var;
        c4u c4uVar;
        int i5;
        Object obj2;
        int i6;
        MainDatabase mainDatabase3;
        int i7;
        Iterator it2;
        Iterator it3;
        Object a;
        MainDatabase mainDatabase4;
        ArrayList arrayList4;
        Iterator it4;
        c4u c4uVar2;
        b4u b4uVar2;
        int i8;
        int i9;
        int i10;
        int i11;
        Object obj3;
        Iterator it5;
        Object G2;
        MainDatabase mainDatabase5;
        int i12;
        Iterator it6;
        MainDatabase mainDatabase6;
        ArrayList arrayList5;
        int i13;
        int i14;
        int i15;
        ArrayList arrayList6;
        ArrayList arrayList7;
        b4u b4uVar3;
        List list2;
        lm1 lm1Var2;
        c4u c4uVar3;
        int i16;
        Object obj4;
        int i17;
        MainDatabase mainDatabase7;
        int i18;
        Iterator it7;
        Iterator it8;
        Object a2;
        MainDatabase mainDatabase8;
        ArrayList arrayList8;
        Iterator it9;
        c4u c4uVar4;
        b4u b4uVar4;
        int i19;
        int i20;
        int i21;
        int i22;
        Object obj5;
        Iterator it10;
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i23 = this.k;
                int i24 = 10;
                ?? r8 = 0;
                if (i23 == 0) {
                    qgg.h0(obj);
                    MainDatabase mainDatabase9 = (MainDatabase) this.l;
                    n3u V = mainDatabase9.V();
                    Collection collection = this.m;
                    final ArrayList arrayList9 = new ArrayList(v75.o(collection, 10));
                    Iterator it11 = collection.iterator();
                    while (it11.hasNext()) {
                        arrayList9.add(new Integer(b4u.j((j1g) it11.next())));
                    }
                    Integer num = (Integer) this.B;
                    final int intValue = num != null ? num.intValue() : Integer.MAX_VALUE;
                    this.o = mainDatabase9;
                    this.x = 0;
                    this.k = 1;
                    V.getClass();
                    StringBuilder sb = new StringBuilder();
                    sb.append("SELECT * FROM video_clip WHERE like_status IN (");
                    final int size = arrayList9.size();
                    swf.x(size, sb);
                    sb.append(") ORDER BY timestamp DESC LIMIT ");
                    sb.append("?");
                    final String sb2 = sb.toString();
                    G = up6.G(V.a, true, false, new Function1() { // from class: l3u
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            String str;
                            Integer valueOf;
                            ArrayList arrayList10 = arrayList9;
                            int i25 = size;
                            int i26 = intValue;
                            xjo xjoVar = (xjo) obj6;
                            xjoVar.getClass();
                            cko D0 = xjoVar.D0(sb2);
                            try {
                                Iterator it12 = arrayList10.iterator();
                                int i27 = 1;
                                while (it12.hasNext()) {
                                    D0.bindLong(i27, ((Number) it12.next()).intValue());
                                    i27++;
                                }
                                D0.bindLong(i25 + 1, i26);
                                int v = s7g.v(D0, "video_clip_id");
                                int v2 = s7g.v(D0, "title");
                                int v3 = s7g.v(D0, "name_surrogate");
                                int v4 = s7g.v(D0, "playerId");
                                int v5 = s7g.v(D0, "thumbnail");
                                int v6 = s7g.v(D0, "previewUrl");
                                int v7 = s7g.v(D0, "duration");
                                int v8 = s7g.v(D0, "disclaimers");
                                int v9 = s7g.v(D0, "like_status");
                                int v10 = s7g.v(D0, "timestamp");
                                ArrayList arrayList11 = new ArrayList();
                                while (D0.q()) {
                                    String x0 = D0.x0(v);
                                    String x02 = D0.x0(v2);
                                    String x03 = D0.x0(v3);
                                    String x04 = D0.x0(v4);
                                    String x05 = D0.x0(v5);
                                    String x06 = D0.isNull(v6) ? null : D0.x0(v6);
                                    long j = D0.getLong(v7);
                                    String x07 = D0.x0(v8);
                                    if (D0.isNull(v9)) {
                                        str = x0;
                                        valueOf = null;
                                    } else {
                                        str = x0;
                                        valueOf = Integer.valueOf((int) D0.getLong(v9));
                                    }
                                    arrayList11.add(new c4u(str, x02, x03, x04, x05, x06, j, x07, valueOf, D0.isNull(v10) ? null : D0.x0(v10)));
                                }
                                D0.close();
                                return arrayList11;
                            } catch (Throwable th) {
                                D0.close();
                                throw th;
                            }
                        }
                    }, this);
                    if (G == nm6Var) {
                        return nm6Var;
                    }
                    mainDatabase = mainDatabase9;
                    i = 0;
                } else if (i23 == 1) {
                    int i25 = this.x;
                    MainDatabase mainDatabase10 = this.o;
                    qgg.h0(obj);
                    mainDatabase = mainDatabase10;
                    i = i25;
                    G = obj;
                } else if (i23 == 2) {
                    int i26 = this.A;
                    int i27 = this.z;
                    int i28 = this.y;
                    int i29 = this.x;
                    b4u b4uVar5 = this.u;
                    c4uVar = this.t;
                    c4u c4uVar5 = this.s;
                    Iterator it12 = this.r;
                    Collection collection2 = this.q;
                    Collection collection3 = this.p;
                    MainDatabase mainDatabase11 = this.o;
                    qgg.h0(obj);
                    mainDatabase4 = mainDatabase11;
                    arrayList3 = collection3;
                    arrayList4 = collection2;
                    it4 = it12;
                    c4uVar2 = c4uVar5;
                    b4uVar2 = b4uVar5;
                    i8 = i29;
                    i9 = i28;
                    i10 = i27;
                    i11 = i26;
                    obj3 = obj;
                    Iterable iterable = (Iterable) obj3;
                    ArrayList arrayList10 = arrayList4;
                    ArrayList arrayList11 = new ArrayList(v75.o(iterable, i24));
                    it5 = iterable.iterator();
                    while (it5.hasNext()) {
                    }
                    lm1 B = mainDatabase4.B();
                    u2u U = mainDatabase4.U();
                    String str = c4uVar2.a;
                    this.o = mainDatabase4;
                    this.p = arrayList3;
                    this.q = arrayList10;
                    this.r = it4;
                    this.s = null;
                    this.t = c4uVar;
                    this.u = b4uVar2;
                    this.v = arrayList11;
                    this.w = B;
                    this.x = i8;
                    this.y = i9;
                    this.z = i10;
                    this.A = i11;
                    this.k = 3;
                    obj2 = up6.G(U.a, true, false, new srp(str, 14), this);
                    if (obj2 != nm6Var) {
                    }
                } else if (i23 == 3) {
                    int i30 = this.A;
                    i4 = this.z;
                    int i31 = this.y;
                    int i32 = this.x;
                    lm1Var = this.w;
                    List list3 = this.v;
                    b4u b4uVar6 = this.u;
                    c4u c4uVar6 = this.t;
                    Iterator it13 = this.r;
                    Collection collection4 = this.q;
                    Collection collection5 = this.p;
                    MainDatabase mainDatabase12 = this.o;
                    qgg.h0(obj);
                    i7 = i30;
                    it2 = it13;
                    arrayList3 = collection5;
                    c4uVar = c4uVar6;
                    b4uVar = b4uVar6;
                    list = list3;
                    i5 = i32;
                    mainDatabase3 = mainDatabase12;
                    i6 = i31;
                    obj2 = obj;
                    arrayList2 = collection4;
                    Iterable iterable2 = (Iterable) obj2;
                    List list4 = list;
                    ArrayList arrayList12 = arrayList3;
                    ArrayList arrayList13 = new ArrayList(v75.o(iterable2, 10));
                    it3 = iterable2.iterator();
                    while (it3.hasNext()) {
                    }
                    this.o = mainDatabase3;
                    this.p = arrayList12;
                    this.q = arrayList2;
                    this.r = it2;
                    this.s = null;
                    this.t = c4uVar;
                    this.u = b4uVar;
                    this.v = list4;
                    this.w = null;
                    this.x = i5;
                    this.y = i6;
                    this.z = i4;
                    this.A = i7;
                    this.k = 4;
                    a = lm1Var.a(arrayList13, this);
                    if (a != nm6Var) {
                    }
                } else {
                    if (i23 != 4) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i33 = this.z;
                    int i34 = this.y;
                    int i35 = this.x;
                    List list5 = this.v;
                    b4uVar = this.u;
                    c4u c4uVar7 = this.t;
                    Iterator it14 = this.r;
                    Collection collection6 = this.q;
                    Collection collection7 = this.p;
                    MainDatabase mainDatabase13 = this.o;
                    qgg.h0(obj);
                    MainDatabase mainDatabase14 = mainDatabase13;
                    i6 = i34;
                    i3 = i35;
                    it = it14;
                    a = obj;
                    ArrayList arrayList14 = collection6;
                    i4 = i33;
                    ArrayList arrayList15 = collection7;
                    Iterable iterable3 = (Iterable) a;
                    ArrayList arrayList16 = new ArrayList(v75.o(iterable3, 10));
                    Iterator it15 = iterable3.iterator();
                    while (it15.hasNext()) {
                        arrayList16.add(saf.m0((q51) it15.next()));
                    }
                    arrayList15.add(b4u.a(b4uVar, c4uVar7, list5, arrayList16));
                    i24 = 10;
                    i2 = i6;
                    mainDatabase2 = mainDatabase14;
                    arrayList = arrayList14;
                    r8 = 0;
                    if (it.hasNext()) {
                        c4uVar = (c4u) it.next();
                        s9u W = mainDatabase2.W();
                        String str2 = c4uVar.a;
                        this.o = mainDatabase2;
                        ArrayList arrayList17 = arrayList;
                        this.p = arrayList17;
                        this.q = arrayList17;
                        this.r = it;
                        this.s = c4uVar;
                        this.t = c4uVar;
                        b4uVar2 = this.n;
                        this.u = b4uVar2;
                        this.v = null;
                        this.x = i3;
                        this.y = i2;
                        this.z = i4;
                        this.A = r8;
                        this.k = 2;
                        obj3 = up6.G(W.a, true, r8, new srp(str2, 16), this);
                        if (obj3 == nm6Var) {
                            return nm6Var;
                        }
                        i8 = i3;
                        arrayList4 = arrayList;
                        mainDatabase4 = mainDatabase2;
                        i9 = i2;
                        it4 = it;
                        arrayList3 = arrayList4;
                        i10 = i4;
                        i11 = r8;
                        c4uVar2 = c4uVar;
                        Iterable iterable4 = (Iterable) obj3;
                        ArrayList arrayList102 = arrayList4;
                        ArrayList arrayList112 = new ArrayList(v75.o(iterable4, i24));
                        it5 = iterable4.iterator();
                        while (it5.hasNext()) {
                            arrayList112.add(((t9u) it5.next()).b);
                        }
                        lm1 B2 = mainDatabase4.B();
                        u2u U2 = mainDatabase4.U();
                        String str3 = c4uVar2.a;
                        this.o = mainDatabase4;
                        this.p = arrayList3;
                        this.q = arrayList102;
                        this.r = it4;
                        this.s = null;
                        this.t = c4uVar;
                        this.u = b4uVar2;
                        this.v = arrayList112;
                        this.w = B2;
                        this.x = i8;
                        this.y = i9;
                        this.z = i10;
                        this.A = i11;
                        this.k = 3;
                        obj2 = up6.G(U2.a, true, false, new srp(str3, 14), this);
                        if (obj2 != nm6Var) {
                            return nm6Var;
                        }
                        int i36 = i10;
                        i7 = i11;
                        i4 = i36;
                        b4uVar = b4uVar2;
                        it2 = it4;
                        lm1Var = B2;
                        list = arrayList112;
                        i5 = i8;
                        i6 = i9;
                        mainDatabase3 = mainDatabase4;
                        arrayList2 = arrayList102;
                        Iterable iterable22 = (Iterable) obj2;
                        List list42 = list;
                        ArrayList arrayList122 = arrayList3;
                        ArrayList arrayList132 = new ArrayList(v75.o(iterable22, 10));
                        it3 = iterable22.iterator();
                        while (it3.hasNext()) {
                            arrayList132.add(((v2u) it3.next()).b);
                        }
                        this.o = mainDatabase3;
                        this.p = arrayList122;
                        this.q = arrayList2;
                        this.r = it2;
                        this.s = null;
                        this.t = c4uVar;
                        this.u = b4uVar;
                        this.v = list42;
                        this.w = null;
                        this.x = i5;
                        this.y = i6;
                        this.z = i4;
                        this.A = i7;
                        this.k = 4;
                        a = lm1Var.a(arrayList132, this);
                        if (a != nm6Var) {
                            return nm6Var;
                        }
                        int i37 = i5;
                        mainDatabase14 = mainDatabase3;
                        i3 = i37;
                        list5 = list42;
                        it = it2;
                        c4uVar7 = c4uVar;
                        arrayList15 = arrayList122;
                        arrayList14 = arrayList2;
                        Iterable iterable32 = (Iterable) a;
                        ArrayList arrayList162 = new ArrayList(v75.o(iterable32, 10));
                        Iterator it152 = iterable32.iterator();
                        while (it152.hasNext()) {
                        }
                        arrayList15.add(b4u.a(b4uVar, c4uVar7, list5, arrayList162));
                        i24 = 10;
                        i2 = i6;
                        mainDatabase2 = mainDatabase14;
                        arrayList = arrayList14;
                        r8 = 0;
                        if (it.hasNext()) {
                            return arrayList;
                        }
                    }
                }
                Iterable iterable5 = (Iterable) G;
                ArrayList arrayList18 = new ArrayList(v75.o(iterable5, 10));
                it = iterable5.iterator();
                mainDatabase2 = mainDatabase;
                arrayList = arrayList18;
                i2 = 0;
                i3 = i;
                i4 = 0;
                if (it.hasNext()) {
                }
            default:
                nm6 nm6Var2 = nm6.a;
                int i38 = this.k;
                int i39 = 10;
                ?? r82 = 0;
                if (i38 == 0) {
                    qgg.h0(obj);
                    MainDatabase mainDatabase15 = (MainDatabase) this.l;
                    n3u V2 = mainDatabase15.V();
                    String str4 = (String) this.B;
                    Collection collection8 = this.m;
                    ArrayList arrayList19 = new ArrayList(v75.o(collection8, 10));
                    Iterator it16 = collection8.iterator();
                    while (it16.hasNext()) {
                        arrayList19.add(new Integer(b4u.j((j1g) it16.next())));
                    }
                    this.o = mainDatabase15;
                    this.x = 0;
                    this.k = 1;
                    V2.getClass();
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("SELECT * FROM video_clip WHERE name_surrogate LIKE ? AND like_status IN (");
                    swf.x(arrayList19.size(), sb3);
                    sb3.append(") ORDER BY timestamp DESC");
                    G2 = up6.G(V2.a, true, false, new t2u(1, sb3.toString(), str4, arrayList19), this);
                    if (G2 == nm6Var2) {
                        return nm6Var2;
                    }
                    mainDatabase5 = mainDatabase15;
                    i12 = 0;
                } else if (i38 == 1) {
                    int i40 = this.x;
                    MainDatabase mainDatabase16 = this.o;
                    qgg.h0(obj);
                    mainDatabase5 = mainDatabase16;
                    i12 = i40;
                    G2 = obj;
                } else if (i38 == 2) {
                    int i41 = this.A;
                    int i42 = this.z;
                    int i43 = this.y;
                    int i44 = this.x;
                    b4u b4uVar7 = this.u;
                    c4uVar3 = this.t;
                    c4u c4uVar8 = this.s;
                    Iterator it17 = this.r;
                    Collection collection9 = this.q;
                    Collection collection10 = this.p;
                    MainDatabase mainDatabase17 = this.o;
                    qgg.h0(obj);
                    mainDatabase8 = mainDatabase17;
                    arrayList7 = collection10;
                    arrayList8 = collection9;
                    it9 = it17;
                    c4uVar4 = c4uVar8;
                    b4uVar4 = b4uVar7;
                    i19 = i44;
                    i20 = i43;
                    i21 = i42;
                    i22 = i41;
                    obj5 = obj;
                    Iterable iterable6 = (Iterable) obj5;
                    ArrayList arrayList20 = arrayList8;
                    ArrayList arrayList21 = new ArrayList(v75.o(iterable6, i39));
                    it10 = iterable6.iterator();
                    while (it10.hasNext()) {
                    }
                    lm1 B3 = mainDatabase8.B();
                    u2u U3 = mainDatabase8.U();
                    String str5 = c4uVar4.a;
                    this.o = mainDatabase8;
                    this.p = arrayList7;
                    this.q = arrayList20;
                    this.r = it9;
                    this.s = null;
                    this.t = c4uVar3;
                    this.u = b4uVar4;
                    this.v = arrayList21;
                    this.w = B3;
                    this.x = i19;
                    this.y = i20;
                    this.z = i21;
                    this.A = i22;
                    this.k = 3;
                    obj4 = up6.G(U3.a, true, false, new srp(str5, 14), this);
                    if (obj4 != nm6Var2) {
                    }
                } else if (i38 == 3) {
                    int i45 = this.A;
                    i15 = this.z;
                    int i46 = this.y;
                    int i47 = this.x;
                    lm1Var2 = this.w;
                    List list6 = this.v;
                    b4u b4uVar8 = this.u;
                    c4u c4uVar9 = this.t;
                    Iterator it18 = this.r;
                    Collection collection11 = this.q;
                    Collection collection12 = this.p;
                    MainDatabase mainDatabase18 = this.o;
                    qgg.h0(obj);
                    i18 = i45;
                    it7 = it18;
                    arrayList7 = collection12;
                    c4uVar3 = c4uVar9;
                    b4uVar3 = b4uVar8;
                    list2 = list6;
                    i16 = i47;
                    mainDatabase7 = mainDatabase18;
                    i17 = i46;
                    obj4 = obj;
                    arrayList6 = collection11;
                    Iterable iterable7 = (Iterable) obj4;
                    List list7 = list2;
                    ArrayList arrayList22 = arrayList7;
                    ArrayList arrayList23 = new ArrayList(v75.o(iterable7, 10));
                    it8 = iterable7.iterator();
                    while (it8.hasNext()) {
                    }
                    this.o = mainDatabase7;
                    this.p = arrayList22;
                    this.q = arrayList6;
                    this.r = it7;
                    this.s = null;
                    this.t = c4uVar3;
                    this.u = b4uVar3;
                    this.v = list7;
                    this.w = null;
                    this.x = i16;
                    this.y = i17;
                    this.z = i15;
                    this.A = i18;
                    this.k = 4;
                    a2 = lm1Var2.a(arrayList23, this);
                    if (a2 != nm6Var2) {
                    }
                } else {
                    if (i38 != 4) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i48 = this.z;
                    int i49 = this.y;
                    int i50 = this.x;
                    List list8 = this.v;
                    b4uVar3 = this.u;
                    c4u c4uVar10 = this.t;
                    Iterator it19 = this.r;
                    Collection collection13 = this.q;
                    Collection collection14 = this.p;
                    MainDatabase mainDatabase19 = this.o;
                    qgg.h0(obj);
                    MainDatabase mainDatabase20 = mainDatabase19;
                    i17 = i49;
                    i14 = i50;
                    it6 = it19;
                    a2 = obj;
                    ArrayList arrayList24 = collection13;
                    i15 = i48;
                    ArrayList arrayList25 = collection14;
                    Iterable iterable8 = (Iterable) a2;
                    ArrayList arrayList26 = new ArrayList(v75.o(iterable8, 10));
                    Iterator it20 = iterable8.iterator();
                    while (it20.hasNext()) {
                        arrayList26.add(saf.m0((q51) it20.next()));
                    }
                    arrayList25.add(b4u.a(b4uVar3, c4uVar10, list8, arrayList26));
                    i39 = 10;
                    i13 = i17;
                    mainDatabase6 = mainDatabase20;
                    arrayList5 = arrayList24;
                    r82 = 0;
                    if (it6.hasNext()) {
                        c4uVar3 = (c4u) it6.next();
                        s9u W2 = mainDatabase6.W();
                        String str6 = c4uVar3.a;
                        this.o = mainDatabase6;
                        ArrayList arrayList27 = arrayList5;
                        this.p = arrayList27;
                        this.q = arrayList27;
                        this.r = it6;
                        this.s = c4uVar3;
                        this.t = c4uVar3;
                        b4uVar4 = this.n;
                        this.u = b4uVar4;
                        this.v = null;
                        this.x = i14;
                        this.y = i13;
                        this.z = i15;
                        this.A = r82;
                        this.k = 2;
                        obj5 = up6.G(W2.a, true, r82, new srp(str6, 16), this);
                        if (obj5 == nm6Var2) {
                            return nm6Var2;
                        }
                        i19 = i14;
                        arrayList8 = arrayList5;
                        mainDatabase8 = mainDatabase6;
                        i20 = i13;
                        it9 = it6;
                        arrayList7 = arrayList8;
                        i21 = i15;
                        i22 = r82;
                        c4uVar4 = c4uVar3;
                        Iterable iterable62 = (Iterable) obj5;
                        ArrayList arrayList202 = arrayList8;
                        ArrayList arrayList212 = new ArrayList(v75.o(iterable62, i39));
                        it10 = iterable62.iterator();
                        while (it10.hasNext()) {
                            arrayList212.add(((t9u) it10.next()).b);
                        }
                        lm1 B32 = mainDatabase8.B();
                        u2u U32 = mainDatabase8.U();
                        String str52 = c4uVar4.a;
                        this.o = mainDatabase8;
                        this.p = arrayList7;
                        this.q = arrayList202;
                        this.r = it9;
                        this.s = null;
                        this.t = c4uVar3;
                        this.u = b4uVar4;
                        this.v = arrayList212;
                        this.w = B32;
                        this.x = i19;
                        this.y = i20;
                        this.z = i21;
                        this.A = i22;
                        this.k = 3;
                        obj4 = up6.G(U32.a, true, false, new srp(str52, 14), this);
                        if (obj4 != nm6Var2) {
                            return nm6Var2;
                        }
                        int i51 = i21;
                        i18 = i22;
                        i15 = i51;
                        b4uVar3 = b4uVar4;
                        it7 = it9;
                        lm1Var2 = B32;
                        list2 = arrayList212;
                        i16 = i19;
                        i17 = i20;
                        mainDatabase7 = mainDatabase8;
                        arrayList6 = arrayList202;
                        Iterable iterable72 = (Iterable) obj4;
                        List list72 = list2;
                        ArrayList arrayList222 = arrayList7;
                        ArrayList arrayList232 = new ArrayList(v75.o(iterable72, 10));
                        it8 = iterable72.iterator();
                        while (it8.hasNext()) {
                            arrayList232.add(((v2u) it8.next()).b);
                        }
                        this.o = mainDatabase7;
                        this.p = arrayList222;
                        this.q = arrayList6;
                        this.r = it7;
                        this.s = null;
                        this.t = c4uVar3;
                        this.u = b4uVar3;
                        this.v = list72;
                        this.w = null;
                        this.x = i16;
                        this.y = i17;
                        this.z = i15;
                        this.A = i18;
                        this.k = 4;
                        a2 = lm1Var2.a(arrayList232, this);
                        if (a2 != nm6Var2) {
                            return nm6Var2;
                        }
                        int i52 = i16;
                        mainDatabase20 = mainDatabase7;
                        i14 = i52;
                        list8 = list72;
                        it6 = it7;
                        c4uVar10 = c4uVar3;
                        arrayList25 = arrayList222;
                        arrayList24 = arrayList6;
                        Iterable iterable82 = (Iterable) a2;
                        ArrayList arrayList262 = new ArrayList(v75.o(iterable82, 10));
                        Iterator it202 = iterable82.iterator();
                        while (it202.hasNext()) {
                        }
                        arrayList25.add(b4u.a(b4uVar3, c4uVar10, list8, arrayList262));
                        i39 = 10;
                        i13 = i17;
                        mainDatabase6 = mainDatabase20;
                        arrayList5 = arrayList24;
                        r82 = 0;
                        if (it6.hasNext()) {
                            return arrayList5;
                        }
                    }
                }
                Iterable iterable9 = (Iterable) G2;
                ArrayList arrayList28 = new ArrayList(v75.o(iterable9, 10));
                it6 = iterable9.iterator();
                mainDatabase6 = mainDatabase5;
                arrayList5 = arrayList28;
                i13 = 0;
                i14 = i12;
                i15 = 0;
                if (it6.hasNext()) {
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x3u(ueo ueoVar, Continuation continuation, Collection collection, Integer num, b4u b4uVar) {
        super(1, continuation);
        this.l = ueoVar;
        this.m = collection;
        this.B = num;
        this.n = b4uVar;
    }
}
