package defpackage;

import com.yandex.music.databases.main.MainDatabase;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public final class b4m {
    public final i5h a;

    public b4m(i5h i5hVar) {
        this.a = i5hVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(b4m b4mVar, MainDatabase mainDatabase, cvl cvlVar, boolean z, cg6 cg6Var) {
        z3m z3mVar;
        int i;
        long j;
        r4m I;
        long j2;
        MainDatabase mainDatabase2;
        cvl cvlVar2;
        boolean z2;
        boolean z3;
        int i2;
        Date date;
        final String str;
        final String str2;
        String a;
        String str3;
        String str4;
        Date date2;
        String c;
        u4h u4hVar;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        int i3;
        String str10;
        MainDatabase mainDatabase3;
        long j3;
        r54 r54Var;
        String str11;
        drt drtVar;
        drt drtVar2;
        long longValue;
        if (cg6Var instanceof z3m) {
            z3mVar = (z3m) cg6Var;
            int i4 = z3mVar.q;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                z3mVar.q = i4 - Integer.MIN_VALUE;
                Object obj = z3mVar.o;
                nm6 nm6Var = nm6.a;
                i = z3mVar.q;
                if (i != 0) {
                    j = 0;
                    qgg.h0(obj);
                    if (new cvl("-1", "unknown", drt.f, 0, 0, false, 0, 0, 0, 0L, 0L, null, 0L, null, null, null, null, null, 0, null, null, null, false, null, false, null, null, 134217720).equals(cvlVar)) {
                        return new t3m(-1L, false);
                    }
                    if (cvlVar.c.b.length() == 0) {
                        dfi.r("Trying to save playlist without user.login " + cvlVar.g(), "PlaylistUpdateHelper");
                    }
                    I = mainDatabase.I();
                    j2 = cvlVar.k;
                    if (j2 < 0 && cvlVar.h()) {
                        String str12 = cvlVar.c.a;
                        String str13 = cvlVar.a;
                        mainDatabase2 = mainDatabase;
                        z3mVar.j = mainDatabase2;
                        z3mVar.k = cvlVar;
                        z3mVar.l = I;
                        z3mVar.m = z;
                        z3mVar.n = j2;
                        z3mVar.q = 1;
                        obj = I.b(str12, str13, z3mVar);
                        if (obj != nm6Var) {
                            cvlVar2 = cvlVar;
                            z3 = z;
                        }
                        return nm6Var;
                    }
                    mainDatabase2 = mainDatabase;
                    cvlVar2 = cvlVar;
                    z2 = z;
                    if (j2 >= j && Intrinsics.d(cvlVar2.l, xxr.b)) {
                        ssg.a(5, "PlaylistUpdateHelper", "Attempt to delete an already deleted playlist: " + cvlVar2, null);
                        return new t3m(j2, false);
                    }
                    final String str14 = cvlVar2.w;
                    final String str15 = cvlVar2.a;
                    drt drtVar3 = cvlVar2.c;
                    String str16 = drtVar3.a;
                    final String str17 = drtVar3.b;
                    String str18 = drtVar3.c;
                    String str19 = cvlVar2.b;
                    final String obj2 = StringsKt.t0(str19).toString();
                    final String R = q7g.R(StringsKt.t0(str19).toString());
                    R.getClass();
                    int i5 = cvlVar2.e;
                    int i6 = cvlVar2.d;
                    final String str20 = cvlVar2.r;
                    final boolean z4 = cvlVar2.v;
                    final String str21 = cvlVar2.s;
                    final String str22 = cvlVar2.t;
                    i2 = cvlVar2.h;
                    int i7 = cvlVar2.g;
                    final int i8 = cvlVar2.l.a;
                    final String S = vnj.S(cvlVar2.p);
                    long j4 = cvlVar2.m;
                    final Long valueOf = j4 >= j ? Long.valueOf(j4) : null;
                    tfs tfsVar = wc7.a;
                    date = cvlVar2.n;
                    if (date == null) {
                        str = str18;
                        str2 = str16;
                        date = new Date(System.currentTimeMillis());
                    } else {
                        str = str18;
                        str2 = str16;
                    }
                    final String a2 = wc7.a(date);
                    Date date3 = cvlVar2.o;
                    a = date3 != null ? wc7.a(date3) : null;
                    str3 = cvlVar2.q;
                    if (str3 != null) {
                        String obj3 = StringsKt.t0(str3).toString();
                        if (obj3.length() > 2000) {
                            obj3 = obj3.substring(0, 1999).concat("…");
                        }
                        str4 = obj3;
                    } else {
                        str4 = null;
                    }
                    date2 = cvlVar2.A;
                    if (date2 != null || date2.getTime() <= j) {
                        date2 = null;
                    }
                    String a3 = date2 != null ? wc7.a(date2) : null;
                    int i9 = cvlVar2.B;
                    c = i9 != 0 ? vz1.c(i9) : null;
                    u4hVar = cvlVar2.u;
                    str5 = (u4hVar != null || (drtVar2 = u4hVar.a) == null) ? null : drtVar2.a;
                    if (u4hVar != null || (drtVar = u4hVar.a) == null) {
                        str6 = a;
                        str7 = c;
                        str8 = str5;
                        str9 = null;
                    } else {
                        str6 = a;
                        str7 = c;
                        str8 = str5;
                        str9 = drtVar.b;
                    }
                    if (u4hVar != null || (r54Var = u4hVar.b) == null || (str11 = r54Var.b) == null || str11.length() <= 0) {
                        i3 = i2;
                        str10 = null;
                    } else {
                        str10 = str11;
                        i3 = i2;
                    }
                    final Integer valueOf2 = Integer.valueOf(i5);
                    final Integer valueOf3 = Integer.valueOf(i6);
                    final Integer valueOf4 = Integer.valueOf(i7);
                    final Integer valueOf5 = Integer.valueOf(i3);
                    ytl ytlVar = new ytl(i8, 0L, valueOf2, valueOf3, valueOf4, valueOf5, valueOf, str14, str15, str2, str17, str, obj2, R, str4, a2, str20, S, a3, str7, str6, str10, str8, str9, str21, str22, z2, z4);
                    final String str23 = str4;
                    final boolean z5 = z2;
                    if (j2 < j) {
                        z3mVar.j = mainDatabase2;
                        z3mVar.k = null;
                        z3mVar.l = null;
                        z3mVar.m = z5;
                        z3mVar.n = j2;
                        z3mVar.q = 2;
                        obj = up6.G(I.a, false, true, new avi(21, I, ytlVar), z3mVar);
                        if (obj != nm6Var) {
                            mainDatabase3 = mainDatabase2;
                            longValue = ((Number) obj).longValue();
                            mainDatabase3.F("playlist");
                            return new t3m(longValue, true);
                        }
                    } else {
                        z3mVar.j = mainDatabase2;
                        z3mVar.k = null;
                        z3mVar.l = null;
                        z3mVar.m = z5;
                        z3mVar.n = j2;
                        z3mVar.q = 3;
                        final long j5 = j2;
                        final String str24 = str10;
                        final String str25 = a3;
                        final String str26 = str9;
                        final String str27 = str8;
                        final String str28 = str7;
                        final String str29 = str6;
                        Object G = up6.G(I.a, false, true, new Function1() { // from class: p4m
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                String str30 = str15;
                                String str31 = str2;
                                String str32 = str17;
                                boolean z6 = z5;
                                String str33 = obj2;
                                String str34 = R;
                                String str35 = str20;
                                boolean z7 = z4;
                                int i10 = i8;
                                String str36 = a2;
                                long j6 = j5;
                                xjo xjoVar = (xjo) obj4;
                                xjoVar.getClass();
                                cko D0 = xjoVar.D0("UPDATE playlist SET original_id = ?,uuid = ?,uid = ?,login = ?,liked = ?,user_full_name = ?,name = ?,name_surrogate = ?,revision = ?,snapshot = ?,visibility = ?,playlist_for_kids = ?,bg_image_url = ?,bg_video_url = ?,likes_count = ?,tracks = ?,sync = ?,cover_info = ?,created = ?,modified = ?,description = ?,position = COALESCE(?, position),liked_timestamp = COALESCE(?, liked_timestamp),auto_generated_type = COALESCE(?, auto_generated_type),target_uid = COALESCE(?, target_uid),target_login = COALESCE(?, target_login),made_for_genitive = COALESCE(?, made_for_genitive) WHERE _id = ?");
                                try {
                                    D0.E(1, str30);
                                    String str37 = str14;
                                    if (str37 == null) {
                                        D0.bindNull(2);
                                    } else {
                                        D0.E(2, str37);
                                    }
                                    D0.E(3, str31);
                                    D0.E(4, str32);
                                    D0.bindLong(5, z6 ? 1L : 0L);
                                    String str38 = str;
                                    if (str38 == null) {
                                        D0.bindNull(6);
                                    } else {
                                        D0.E(6, str38);
                                    }
                                    D0.E(7, str33);
                                    D0.E(8, str34);
                                    if (valueOf2 == null) {
                                        D0.bindNull(9);
                                    } else {
                                        D0.bindLong(9, r0.intValue());
                                    }
                                    if (valueOf3 == null) {
                                        D0.bindNull(10);
                                    } else {
                                        D0.bindLong(10, r0.intValue());
                                    }
                                    D0.E(11, str35);
                                    D0.bindLong(12, z7 ? 1L : 0L);
                                    String str39 = str21;
                                    if (str39 == null) {
                                        D0.bindNull(13);
                                    } else {
                                        D0.E(13, str39);
                                    }
                                    String str40 = str22;
                                    if (str40 == null) {
                                        D0.bindNull(14);
                                    } else {
                                        D0.E(14, str40);
                                    }
                                    if (valueOf5 == null) {
                                        D0.bindNull(15);
                                    } else {
                                        D0.bindLong(15, r0.intValue());
                                    }
                                    if (valueOf4 == null) {
                                        D0.bindNull(16);
                                    } else {
                                        D0.bindLong(16, r0.intValue());
                                    }
                                    D0.bindLong(17, i10);
                                    String str41 = S;
                                    if (str41 == null) {
                                        D0.bindNull(18);
                                    } else {
                                        D0.E(18, str41);
                                    }
                                    D0.E(19, str36);
                                    String str42 = str29;
                                    if (str42 == null) {
                                        D0.bindNull(20);
                                    } else {
                                        D0.E(20, str42);
                                    }
                                    String str43 = str23;
                                    if (str43 == null) {
                                        D0.bindNull(21);
                                    } else {
                                        D0.E(21, str43);
                                    }
                                    Long l = valueOf;
                                    if (l == null) {
                                        D0.bindNull(22);
                                    } else {
                                        D0.bindLong(22, l.longValue());
                                    }
                                    String str44 = str25;
                                    if (str44 == null) {
                                        D0.bindNull(23);
                                    } else {
                                        D0.E(23, str44);
                                    }
                                    String str45 = str28;
                                    if (str45 == null) {
                                        D0.bindNull(24);
                                    } else {
                                        D0.E(24, str45);
                                    }
                                    String str46 = str27;
                                    if (str46 == null) {
                                        D0.bindNull(25);
                                    } else {
                                        D0.E(25, str46);
                                    }
                                    String str47 = str26;
                                    if (str47 == null) {
                                        D0.bindNull(26);
                                    } else {
                                        D0.E(26, str47);
                                    }
                                    String str48 = str24;
                                    if (str48 == null) {
                                        D0.bindNull(27);
                                    } else {
                                        D0.E(27, str48);
                                    }
                                    D0.bindLong(28, j6);
                                    D0.q();
                                    D0.close();
                                    return Unit.a;
                                } catch (Throwable th) {
                                    D0.close();
                                    throw th;
                                }
                            }
                        }, z3mVar);
                        if (G != nm6Var) {
                            G = Unit.a;
                        }
                        if (G != nm6Var) {
                            G = Unit.a;
                        }
                        if (G != nm6Var) {
                            mainDatabase3 = mainDatabase2;
                            j3 = j5;
                            longValue = j3;
                            mainDatabase3.F("playlist");
                            return new t3m(longValue, true);
                        }
                    }
                    return nm6Var;
                }
                if (i != 1) {
                    if (i == 2) {
                        mainDatabase3 = z3mVar.j;
                        qgg.h0(obj);
                        longValue = ((Number) obj).longValue();
                        mainDatabase3.F("playlist");
                        return new t3m(longValue, true);
                    }
                    if (i != 3) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j3 = z3mVar.n;
                    mainDatabase3 = z3mVar.j;
                    qgg.h0(obj);
                    longValue = j3;
                    mainDatabase3.F("playlist");
                    return new t3m(longValue, true);
                }
                z3 = z3mVar.m;
                I = z3mVar.l;
                cvlVar2 = z3mVar.k;
                j = 0;
                MainDatabase mainDatabase4 = z3mVar.j;
                qgg.h0(obj);
                mainDatabase2 = mainDatabase4;
                Long l = (Long) obj;
                z2 = z3;
                j2 = l == null ? l.longValue() : -1L;
                if (j2 >= j) {
                }
                final String str142 = cvlVar2.w;
                final String str152 = cvlVar2.a;
                drt drtVar32 = cvlVar2.c;
                String str162 = drtVar32.a;
                final String str172 = drtVar32.b;
                String str182 = drtVar32.c;
                String str192 = cvlVar2.b;
                final String obj22 = StringsKt.t0(str192).toString();
                final String R2 = q7g.R(StringsKt.t0(str192).toString());
                R2.getClass();
                int i52 = cvlVar2.e;
                int i62 = cvlVar2.d;
                final String str202 = cvlVar2.r;
                final boolean z42 = cvlVar2.v;
                final String str212 = cvlVar2.s;
                final String str222 = cvlVar2.t;
                i2 = cvlVar2.h;
                int i72 = cvlVar2.g;
                final int i82 = cvlVar2.l.a;
                final String S2 = vnj.S(cvlVar2.p);
                long j42 = cvlVar2.m;
                if (j42 >= j) {
                }
                tfs tfsVar2 = wc7.a;
                date = cvlVar2.n;
                if (date == null) {
                }
                final String a22 = wc7.a(date);
                Date date32 = cvlVar2.o;
                if (date32 != null) {
                }
                str3 = cvlVar2.q;
                if (str3 != null) {
                }
                date2 = cvlVar2.A;
                if (date2 != null) {
                }
                date2 = null;
                if (date2 != null) {
                }
                int i92 = cvlVar2.B;
                if (i92 != 0) {
                }
                u4hVar = cvlVar2.u;
                if (u4hVar != null) {
                }
                if (u4hVar != null) {
                }
                str6 = a;
                str7 = c;
                str8 = str5;
                str9 = null;
                if (u4hVar != null) {
                }
                i3 = i2;
                str10 = null;
                final Integer valueOf22 = Integer.valueOf(i52);
                final Integer valueOf32 = Integer.valueOf(i62);
                final Integer valueOf42 = Integer.valueOf(i72);
                final Integer valueOf52 = Integer.valueOf(i3);
                ytl ytlVar2 = new ytl(i82, 0L, valueOf22, valueOf32, valueOf42, valueOf52, valueOf, str142, str152, str2, str172, str, obj22, R2, str4, a22, str202, S2, a3, str7, str6, str10, str8, str9, str212, str222, z2, z42);
                final String str232 = str4;
                final boolean z52 = z2;
                if (j2 < j) {
                }
                return nm6Var;
            }
        }
        z3mVar = new z3m(b4mVar, cg6Var);
        Object obj4 = z3mVar.o;
        nm6 nm6Var2 = nm6.a;
        i = z3mVar.q;
        if (i != 0) {
        }
        Long l2 = (Long) obj4;
        z2 = z3;
        j2 = l2 == null ? l2.longValue() : -1L;
        if (j2 >= j) {
        }
        final String str1422 = cvlVar2.w;
        final String str1522 = cvlVar2.a;
        drt drtVar322 = cvlVar2.c;
        String str1622 = drtVar322.a;
        final String str1722 = drtVar322.b;
        String str1822 = drtVar322.c;
        String str1922 = cvlVar2.b;
        final String obj222 = StringsKt.t0(str1922).toString();
        final String R22 = q7g.R(StringsKt.t0(str1922).toString());
        R22.getClass();
        int i522 = cvlVar2.e;
        int i622 = cvlVar2.d;
        final String str2022 = cvlVar2.r;
        final boolean z422 = cvlVar2.v;
        final String str2122 = cvlVar2.s;
        final String str2222 = cvlVar2.t;
        i2 = cvlVar2.h;
        int i722 = cvlVar2.g;
        final int i822 = cvlVar2.l.a;
        final String S22 = vnj.S(cvlVar2.p);
        long j422 = cvlVar2.m;
        if (j422 >= j) {
        }
        tfs tfsVar22 = wc7.a;
        date = cvlVar2.n;
        if (date == null) {
        }
        final String a222 = wc7.a(date);
        Date date322 = cvlVar2.o;
        if (date322 != null) {
        }
        str3 = cvlVar2.q;
        if (str3 != null) {
        }
        date2 = cvlVar2.A;
        if (date2 != null) {
        }
        date2 = null;
        if (date2 != null) {
        }
        int i922 = cvlVar2.B;
        if (i922 != 0) {
        }
        u4hVar = cvlVar2.u;
        if (u4hVar != null) {
        }
        if (u4hVar != null) {
        }
        str6 = a;
        str7 = c;
        str8 = str5;
        str9 = null;
        if (u4hVar != null) {
        }
        i3 = i2;
        str10 = null;
        final Integer valueOf222 = Integer.valueOf(i522);
        final Integer valueOf322 = Integer.valueOf(i622);
        final Integer valueOf422 = Integer.valueOf(i722);
        final Integer valueOf522 = Integer.valueOf(i3);
        ytl ytlVar22 = new ytl(i822, 0L, valueOf222, valueOf322, valueOf422, valueOf522, valueOf, str1422, str1522, str2, str1722, str, obj222, R22, str4, a222, str2022, S22, a3, str7, str6, str10, str8, str9, str2122, str2222, z2, z422);
        final String str2322 = str4;
        final boolean z522 = z2;
        if (j2 < j) {
        }
        return nm6Var2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00b3, code lost:
    
        if (r8 != r13) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00b5, code lost:
    
        return r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0090, code lost:
    
        if (r12.b(r10, r0) == r13) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(b4m b4mVar, MainDatabase mainDatabase, long j, List list, cg6 cg6Var) {
        a4m a4mVar;
        int i;
        ArrayList arrayList;
        Object G;
        if (cg6Var instanceof a4m) {
            a4mVar = (a4m) cg6Var;
            int i2 = a4mVar.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                a4mVar.o = i2 - Integer.MIN_VALUE;
                Object obj = a4mVar.m;
                Object obj2 = nm6.a;
                i = a4mVar.o;
                if (i != 0) {
                    qgg.h0(obj);
                    List list2 = list;
                    arrayList = new ArrayList(v75.o(list2, 10));
                    int i3 = 0;
                    for (Object obj3 : list2) {
                        int i4 = i3 + 1;
                        if (i3 < 0) {
                            u75.n();
                            throw null;
                        }
                        arrayList.add(q5g.M((t2m) obj3, i3, j));
                        i3 = i4;
                    }
                    ssg.a(3, "PlaylistUpdateHelper", dfi.d(j, "replace tracks for playlist _id = "), null);
                    q1m K = mainDatabase.K();
                    a4mVar.j = mainDatabase;
                    a4mVar.k = arrayList;
                    a4mVar.l = j;
                    a4mVar.o = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        mainDatabase = a4mVar.j;
                        qgg.h0(obj);
                        mainDatabase.F("playlist_track");
                        return Unit.a;
                    }
                    j = a4mVar.l;
                    ArrayList arrayList2 = a4mVar.k;
                    MainDatabase mainDatabase2 = a4mVar.j;
                    qgg.h0(obj);
                    arrayList = arrayList2;
                    mainDatabase = mainDatabase2;
                }
                q1m K2 = mainDatabase.K();
                a4mVar.j = mainDatabase;
                a4mVar.k = null;
                a4mVar.l = j;
                a4mVar.o = 2;
                G = up6.G(K2.a, false, true, new avi(20, K2, arrayList), a4mVar);
                if (G != nm6.a) {
                    G = Unit.a;
                }
            }
        }
        a4mVar = new a4m(b4mVar, cg6Var);
        Object obj4 = a4mVar.m;
        Object obj22 = nm6.a;
        i = a4mVar.o;
        if (i != 0) {
        }
        q1m K22 = mainDatabase.K();
        a4mVar.j = mainDatabase;
        a4mVar.k = null;
        a4mVar.l = j;
        a4mVar.o = 2;
        G = up6.G(K22.a, false, true, new avi(20, K22, arrayList), a4mVar);
        if (G != nm6.a) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0088, code lost:
    
        if (defpackage.tyf.N(r8, r6, r0) != r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x008a, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0074, code lost:
    
        if (r8 == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, nvl nvlVar, cg6 cg6Var) {
        u3m u3mVar;
        int i;
        if (cg6Var instanceof u3m) {
            u3mVar = (u3m) cg6Var;
            int i2 = u3mVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                u3mVar.m = i2 - Integer.MIN_VALUE;
                Object obj = u3mVar.k;
                nm6 nm6Var = nm6.a;
                i = u3mVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    String str2 = nvlVar.a;
                    String str3 = nvlVar.b;
                    if (Intrinsics.d(str2, str) && (Intrinsics.d(str3, "3") || Intrinsics.d(str3, "-14"))) {
                        dfi.r("Trying to delete pregenerated playlist " + nvlVar, "PlaylistUpdateHelper");
                        return Unit.a;
                    }
                    u3mVar.j = nvlVar;
                    u3mVar.m = 1;
                    obj = this.a.b(str, u3mVar);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    nvlVar = u3mVar.j;
                    qgg.h0(obj);
                }
                ueo ueoVar = (ueo) obj;
                yw4 yw4Var = new yw4(ueoVar, (Continuation) null, nvlVar, 3);
                u3mVar.j = null;
                u3mVar.m = 2;
            }
        }
        u3mVar = new u3m(this, cg6Var);
        Object obj2 = u3mVar.k;
        nm6 nm6Var2 = nm6.a;
        i = u3mVar.m;
        if (i != 0) {
        }
        ueo ueoVar2 = (ueo) obj2;
        yw4 yw4Var2 = new yw4(ueoVar2, (Continuation) null, nvlVar, 3);
        u3mVar.j = null;
        u3mVar.m = 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0089 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable d(String str, cvl cvlVar, boolean z, cg6 cg6Var) {
        v3m v3mVar;
        Object obj;
        nm6 nm6Var;
        int i;
        cvl cvlVar2;
        boolean z2;
        String str2;
        cvl cvlVar3;
        if (cg6Var instanceof v3m) {
            v3mVar = (v3m) cg6Var;
            int i2 = v3mVar.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                v3mVar.o = i2 - Integer.MIN_VALUE;
                v3m v3mVar2 = v3mVar;
                obj = v3mVar2.m;
                nm6Var = nm6.a;
                i = v3mVar2.o;
                if (i != 0) {
                    qgg.h0(obj);
                    v3mVar2.j = str;
                    v3mVar2.k = cvlVar;
                    v3mVar2.l = z;
                    v3mVar2.o = 1;
                    Object b = this.a.b(str, v3mVar2);
                    if (b != nm6Var) {
                        cvlVar2 = cvlVar;
                        z2 = z;
                        obj = b;
                        str2 = str;
                    }
                    return nm6Var;
                }
                if (i != 1) {
                    if (i != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    cvl cvlVar4 = v3mVar2.k;
                    qgg.h0(obj);
                    cvlVar3 = cvlVar4;
                    long longValue = ((Number) obj).longValue();
                    return cvlVar3.k != longValue ? cvlVar3 : cvl.a(cvlVar3, null, null, 0, 0, longValue, null, null, null, null, null, null, null, null, null, null, 134216703);
                }
                boolean z3 = v3mVar2.l;
                cvl cvlVar5 = v3mVar2.k;
                str2 = v3mVar2.j;
                qgg.h0(obj);
                z2 = z3;
                cvlVar2 = cvlVar5;
                ueo ueoVar = (ueo) obj;
                gx4 gx4Var = new gx4(ueoVar, null, this, str2, cvlVar2, z2, 2);
                v3mVar2.j = null;
                v3mVar2.k = cvlVar2;
                v3mVar2.l = z2;
                v3mVar2.o = 2;
                obj = tyf.N(ueoVar, gx4Var, v3mVar2);
                if (obj != nm6Var) {
                    cvlVar3 = cvlVar2;
                    long longValue2 = ((Number) obj).longValue();
                    if (cvlVar3.k != longValue2) {
                    }
                }
                return nm6Var;
            }
        }
        v3mVar = new v3m(this, cg6Var);
        v3m v3mVar22 = v3mVar;
        obj = v3mVar22.m;
        nm6Var = nm6.a;
        i = v3mVar22.o;
        if (i != 0) {
        }
        ueo ueoVar2 = (ueo) obj;
        gx4 gx4Var2 = new gx4(ueoVar2, null, this, str2, cvlVar2, z2, 2);
        v3mVar22.j = null;
        v3mVar22.k = cvlVar2;
        v3mVar22.l = z2;
        v3mVar22.o = 2;
        obj = tyf.N(ueoVar2, gx4Var2, v3mVar22);
        if (obj != nm6Var) {
        }
        return nm6Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0091 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable e(String str, cvl cvlVar, List list, cg6 cg6Var) {
        w3m w3mVar;
        Object obj;
        nm6 nm6Var;
        int i;
        List list2;
        String str2;
        cvl cvlVar2;
        cvl cvlVar3;
        if (cg6Var instanceof w3m) {
            w3mVar = (w3m) cg6Var;
            int i2 = w3mVar.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                w3mVar.o = i2 - Integer.MIN_VALUE;
                w3m w3mVar2 = w3mVar;
                obj = w3mVar2.m;
                nm6Var = nm6.a;
                i = w3mVar2.o;
                if (i != 0) {
                    qgg.h0(obj);
                    w3mVar2.j = str;
                    w3mVar2.k = cvlVar;
                    w3mVar2.l = list;
                    w3mVar2.o = 1;
                    Object b = this.a.b(str, w3mVar2);
                    if (b != nm6Var) {
                        list2 = list;
                        str2 = str;
                        cvlVar2 = cvlVar;
                        obj = b;
                    }
                    return nm6Var;
                }
                if (i != 1) {
                    if (i != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    List list3 = w3mVar2.l;
                    cvl cvlVar4 = w3mVar2.k;
                    qgg.h0(obj);
                    cvlVar3 = cvlVar4;
                    long longValue = ((Number) obj).longValue();
                    return cvlVar3.k != longValue ? cvlVar3 : cvl.a(cvlVar3, null, null, 0, 0, longValue, null, null, null, null, null, null, null, null, null, null, 134216703);
                }
                List list4 = w3mVar2.l;
                cvl cvlVar5 = w3mVar2.k;
                str2 = w3mVar2.j;
                qgg.h0(obj);
                list2 = list4;
                cvlVar2 = cvlVar5;
                ueo ueoVar = (ueo) obj;
                wlg wlgVar = new wlg(ueoVar, (Continuation) null, this, str2, cvlVar2, list2);
                w3mVar2.j = null;
                w3mVar2.k = cvlVar2;
                w3mVar2.l = null;
                w3mVar2.o = 2;
                obj = tyf.N(ueoVar, wlgVar, w3mVar2);
                if (obj != nm6Var) {
                    cvlVar3 = cvlVar2;
                    long longValue2 = ((Number) obj).longValue();
                    if (cvlVar3.k != longValue2) {
                    }
                }
                return nm6Var;
            }
        }
        w3mVar = new w3m(this, cg6Var);
        w3m w3mVar22 = w3mVar;
        obj = w3mVar22.m;
        nm6Var = nm6.a;
        i = w3mVar22.o;
        if (i != 0) {
        }
        ueo ueoVar2 = (ueo) obj;
        wlg wlgVar2 = new wlg(ueoVar2, (Continuation) null, this, str2, cvlVar2, list2);
        w3mVar22.j = null;
        w3mVar22.k = cvlVar2;
        w3mVar22.l = null;
        w3mVar22.o = 2;
        obj = tyf.N(ueoVar2, wlgVar2, w3mVar22);
        if (obj != nm6Var) {
        }
        return nm6Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0054, code lost:
    
        if (r11 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(cg6 cg6Var, String str, List list) {
        x3m x3mVar;
        int i;
        if (cg6Var instanceof x3m) {
            x3mVar = (x3m) cg6Var;
            int i2 = x3mVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                x3mVar.n = i2 - Integer.MIN_VALUE;
                Object obj = x3mVar.l;
                nm6 nm6Var = nm6.a;
                i = x3mVar.n;
                if (i != 0) {
                    qgg.h0(obj);
                    x3mVar.j = str;
                    x3mVar.k = list;
                    x3mVar.n = 1;
                    obj = this.a.b(str, x3mVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        List list2 = x3mVar.k;
                        qgg.h0(obj);
                        return obj;
                    }
                    list = x3mVar.k;
                    str = x3mVar.j;
                    qgg.h0(obj);
                }
                ueo ueoVar = (ueo) obj;
                y3m y3mVar = new y3m(ueoVar, null, list, this, str);
                x3mVar.j = null;
                x3mVar.k = null;
                x3mVar.n = 2;
                Object N = tyf.N(ueoVar, y3mVar, x3mVar);
                return N != nm6Var ? nm6Var : N;
            }
        }
        x3mVar = new x3m(this, cg6Var);
        Object obj2 = x3mVar.l;
        nm6 nm6Var2 = nm6.a;
        i = x3mVar.n;
        if (i != 0) {
        }
        ueo ueoVar2 = (ueo) obj2;
        y3m y3mVar2 = new y3m(ueoVar2, null, list, this, str);
        x3mVar.j = null;
        x3mVar.k = null;
        x3mVar.n = 2;
        Object N2 = tyf.N(ueoVar2, y3mVar2, x3mVar);
        if (N2 != nm6Var2) {
        }
    }
}
