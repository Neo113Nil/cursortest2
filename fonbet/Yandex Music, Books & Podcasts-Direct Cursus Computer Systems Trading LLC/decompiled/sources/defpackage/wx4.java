package defpackage;

import com.yandex.music.databases.main.MainDatabase;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public final class wx4 extends aur implements Function1 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ ueo l;
    public int m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object o;
    public Object p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wx4(ueo ueoVar, Continuation continuation, String str, btl btlVar, String str2) {
        super(1, continuation);
        this.j = 1;
        this.l = ueoVar;
        this.n = str;
        this.o = btlVar;
        this.p = str2;
    }

    @Override // defpackage.kq2
    public final Continuation create(Continuation continuation) {
        switch (this.j) {
            case 0:
                return new wx4(this.l, continuation, (um4) this.n, (yx4) this.o, 0);
            case 1:
                return new wx4(this.l, continuation, (String) this.n, (btl) this.o, (String) this.p);
            default:
                return new wx4(this.l, continuation, (nvl) this.n, (tn6) this.o, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Continuation continuation = (Continuation) obj;
        switch (this.j) {
        }
        return ((wx4) create(continuation)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:182:0x016f, code lost:
    
        if (r3 == r1) goto L58;
     */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        MainDatabase mainDatabase;
        int i;
        Object G;
        List list;
        List list2;
        List list3;
        List list4;
        List list5;
        List list6;
        String str;
        Integer intOrNull;
        Object G2;
        MainDatabase mainDatabase2;
        Object b;
        int i2;
        MainDatabase mainDatabase3;
        int i3 = this.j;
        Object obj2 = this.o;
        Object obj3 = this.n;
        ueo ueoVar = this.l;
        int i4 = 2;
        int i5 = 0;
        int i6 = 1;
        switch (i3) {
            case 0:
                um4 um4Var = (um4) obj3;
                nm6 nm6Var = nm6.a;
                int i7 = this.k;
                if (i7 == 0) {
                    qgg.h0(obj);
                    mainDatabase = (MainDatabase) ueoVar;
                    uxs Q = mainDatabase.Q();
                    this.p = mainDatabase;
                    this.m = 0;
                    this.k = 1;
                    Object a = Q.b.a.a(Q.a, this);
                    if (a != nm6Var) {
                        a = Unit.a;
                    }
                    if (a != nm6Var) {
                        i = 0;
                    }
                    return nm6Var;
                }
                if (i7 != 1) {
                    if (i7 != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    G = obj;
                    List list7 = (List) G;
                    ArrayList arrayList = new ArrayList(v75.o(list7, 10));
                    Iterator it = list7.iterator();
                    while (it.hasNext()) {
                        z1t z1tVar = (z1t) it.next();
                        yx4 yx4Var = (yx4) obj2;
                        uaa uaaVar = yx4Var.a;
                        aaa aaaVar = yx4Var.b;
                        cba cbaVar = yx4Var.c;
                        z1tVar.getClass();
                        uaaVar.getClass();
                        aaaVar.getClass();
                        cbaVar.getClass();
                        Map map = ((yca) aaaVar.e.getValue()).a;
                        Map map2 = ((vga) cbaVar.e.getValue()).a;
                        Map map3 = ((lja) ((e6q) uaaVar).e.getValue()).b;
                        String str2 = z1tVar.f;
                        if (str2 != null) {
                            char[] cArr = new char[i6];
                            cArr[i5] = ',';
                            list = StringsKt.e0(str2, cArr, 6);
                        } else {
                            list = null;
                        }
                        String str3 = z1tVar.g;
                        if (str3 != null) {
                            char[] cArr2 = new char[i6];
                            cArr2[i5] = ',';
                            list2 = StringsKt.e0(str3, cArr2, 6);
                        } else {
                            list2 = null;
                        }
                        String str4 = z1tVar.h;
                        int i8 = i4;
                        if (str4 != null) {
                            char[] cArr3 = new char[i6];
                            cArr3[i5] = ',';
                            list3 = StringsKt.e0(str4, cArr3, 6);
                        } else {
                            list3 = null;
                        }
                        String str5 = z1tVar.i;
                        int i9 = i5;
                        if (str5 != null) {
                            char[] cArr4 = new char[i6];
                            cArr4[i9] = ',';
                            list4 = StringsKt.e0(str5, cArr4, 6);
                        } else {
                            list4 = null;
                        }
                        String str6 = z1tVar.j;
                        if (str6 != null) {
                            char[] cArr5 = new char[i6];
                            cArr5[i9] = ',';
                            list5 = StringsKt.e0(str6, cArr5, 6);
                        } else {
                            list5 = null;
                        }
                        List[] listArr = new List[4];
                        listArr[i9] = list2;
                        listArr[i6] = list3;
                        listArr[i8] = list4;
                        listArr[3] = list5;
                        List h = u75.h(listArr);
                        if (h.isEmpty()) {
                            list6 = c5b.a;
                        } else {
                            List<List> list8 = h;
                            Iterator it2 = list8.iterator();
                            if (!it2.hasNext()) {
                                wvs.n();
                                return null;
                            }
                            List list9 = (List) it2.next();
                            int size = list9 != null ? list9.size() : i9;
                            while (it2.hasNext()) {
                                List list10 = (List) it2.next();
                                int size2 = list10 != null ? list10.size() : i9;
                                if (size < size2) {
                                    size = size2;
                                }
                            }
                            ArrayList arrayList2 = new ArrayList();
                            int i10 = i9;
                            while (i10 < size) {
                                ArrayList arrayList3 = new ArrayList(v75.o(list8, 10));
                                for (List list11 : list8) {
                                    arrayList3.add(list11 != null ? CollectionsKt.S(list11, i10) : null);
                                }
                                String str7 = (String) arrayList3.get(i9);
                                String str8 = str7 == null ? "" : str7;
                                Object obj4 = obj2;
                                String str9 = (String) arrayList3.get(1);
                                int i11 = i8;
                                Iterator it3 = it;
                                uga ugaVar = new uga(str8, str9 == null ? "" : str9, (String) arrayList3.get(i11));
                                String str10 = (String) arrayList3.get(3);
                                if (str10 == null) {
                                    str10 = "";
                                }
                                arrayList2.add(new ega(ugaVar, str10));
                                i10++;
                                it = it3;
                                obj2 = obj4;
                                i8 = 2;
                                i9 = 0;
                            }
                            list6 = arrayList2;
                        }
                        Object obj5 = obj2;
                        Iterator it4 = it;
                        String str11 = z1tVar.c;
                        boolean z = z1tVar.b;
                        String str12 = z1tVar.a;
                        nq3 nq3Var = (nq3) map3.get(str12);
                        boolean a2 = nq3Var != null ? nq3Var.c.a() : false;
                        boolean z2 = map.get(z1tVar.d) != null;
                        int size3 = list6.size();
                        boolean z3 = false;
                        boolean z4 = false;
                        for (int i12 = 0; i12 < size3; i12++) {
                            ega egaVar = (ega) list6.get(i12);
                            boolean z5 = ((list == null || (str = (String) CollectionsKt.S(list, i12)) == null || (intOrNull = StringsKt.toIntOrNull(str)) == null) ? 0 : intOrNull.intValue()) > 0;
                            if (map2.get(egaVar) != null) {
                                if (z5) {
                                    z4 = true;
                                } else {
                                    z3 = true;
                                }
                            }
                            if (z4 && z3) {
                                boolean z6 = z3;
                                boolean z7 = z4;
                                String str13 = z1tVar.d;
                                v1t.a.getClass();
                                arrayList.add(new y1t(str12, str13, l3l.c(str11, z), z1tVar.e, a2, z2, z6, z7));
                                it = it4;
                                obj2 = obj5;
                                i4 = 2;
                                i5 = 0;
                                i6 = 1;
                            }
                        }
                        boolean z62 = z3;
                        boolean z72 = z4;
                        String str132 = z1tVar.d;
                        v1t.a.getClass();
                        arrayList.add(new y1t(str12, str132, l3l.c(str11, z), z1tVar.e, a2, z2, z62, z72));
                        it = it4;
                        obj2 = obj5;
                        i4 = 2;
                        i5 = 0;
                        i6 = 1;
                    }
                    HashSet hashSet = new HashSet();
                    ArrayList arrayList4 = new ArrayList();
                    Iterator it5 = arrayList.iterator();
                    while (it5.hasNext()) {
                        Object next = it5.next();
                        if (hashSet.add(((y1t) next).a)) {
                            arrayList4.add(next);
                        }
                    }
                    return arrayList4;
                }
                i = this.m;
                mainDatabase = (MainDatabase) this.p;
                qgg.h0(obj);
                pw4 C = mainDatabase.C();
                atn atnVar = new atn(hlr.e("SELECT\n                        |  track_type,\n                        |  track_mview.original_id AS track_mview_column_original_id,\n                        |  track_for_kids,\n                        |  track_mview.album_id AS track_mview_column_album_id,\n                        |  duration,\n                        |  GROUP_CONCAT (COALESCE(playlist_for_kids, \"playlist_null_value\")) AS GC_playlist_for_kids,\n                        |  GROUP_CONCAT (COALESCE(uid, \"playlist_null_value\")) AS GC_playlist_user_id,\n                        |  GROUP_CONCAT (COALESCE(login, \"playlist_null_value\")) AS GC_playlist_user_login,\n                        |  GROUP_CONCAT (COALESCE(user_full_name, \"playlist_null_value\")) AS GC_playlist_user_full_name,\n                        |  GROUP_CONCAT (COALESCE(playlist.original_id, \"playlist_null_value\")) AS GC_playlist_kind\n                        |FROM\n                        |  track_mview\n                        |LEFT JOIN playlist_track\n                        |  ON track_mview.original_id = track_id\n                        |LEFT JOIN playlist\n                        |  ON playlist_id = playlist._id\n                        |WHERE\n                        |  " + um4Var.l() + "\n                        |GROUP BY\n                        |  track_mview.original_id\n                    "), um4Var.j());
                this.p = null;
                this.m = i;
                this.k = 2;
                C.getClass();
                TreeMap treeMap = afo.h;
                j6e a3 = wyf.x(atnVar).a();
                G = up6.G(C.a, true, false, new g20((String) a3.a, a3, i6), this);
                break;
            case 1:
                nm6 nm6Var2 = nm6.a;
                int i13 = this.k;
                if (i13 == 0) {
                    qgg.h0(obj);
                    q1m K = ((MainDatabase) ueoVar).K();
                    this.m = 0;
                    this.k = 1;
                    G2 = up6.G(K.a, true, false, new q1h((String) obj3, 15), this);
                    if (G2 == nm6Var2) {
                        return nm6Var2;
                    }
                } else {
                    if (i13 != 1) {
                        if (i13 == 2) {
                            qgg.h0(obj);
                            return obj;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i5 = this.m;
                    qgg.h0(obj);
                    G2 = obj;
                }
                String str14 = (String) this.p;
                this.m = i5;
                this.k = 2;
                Object c = btl.c((btl) obj2, str14, (List) G2, this);
                return c == nm6Var2 ? nm6Var2 : c;
            default:
                nm6 nm6Var3 = nm6.a;
                int i14 = this.k;
                if (i14 == 0) {
                    qgg.h0(obj);
                    mainDatabase2 = (MainDatabase) ueoVar;
                    r4m I = mainDatabase2.I();
                    nvl nvlVar = (nvl) obj3;
                    String str15 = nvlVar.a;
                    String str16 = nvlVar.b;
                    this.p = mainDatabase2;
                    this.m = 0;
                    this.k = 1;
                    b = I.b(str15, str16, this);
                    if (b != nm6Var3) {
                        i2 = 0;
                    }
                    return nm6Var3;
                }
                if (i14 != 1) {
                    if (i14 != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    mainDatabase3 = (MainDatabase) this.p;
                    qgg.h0(obj);
                    mainDatabase3.F("playlist");
                    return Unit.a;
                }
                int i15 = this.m;
                mainDatabase2 = (MainDatabase) this.p;
                qgg.h0(obj);
                i2 = i15;
                b = obj;
                Long l = (Long) b;
                if (l == null) {
                    return Unit.a;
                }
                long longValue = l.longValue();
                r4m I2 = mainDatabase2.I();
                String S = vnj.S((tn6) obj2);
                this.p = mainDatabase2;
                this.m = i2;
                this.k = 2;
                Object G3 = up6.G(I2.a, false, true, new l1m(S, longValue), this);
                if (G3 != nm6Var3) {
                    G3 = Unit.a;
                }
                if (G3 != nm6Var3) {
                    mainDatabase3 = mainDatabase2;
                    mainDatabase3.F("playlist");
                    return Unit.a;
                }
                return nm6Var3;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wx4(ueo ueoVar, Continuation continuation, Object obj, Object obj2, int i) {
        super(1, continuation);
        this.j = i;
        this.l = ueoVar;
        this.n = obj;
        this.o = obj2;
    }
}
