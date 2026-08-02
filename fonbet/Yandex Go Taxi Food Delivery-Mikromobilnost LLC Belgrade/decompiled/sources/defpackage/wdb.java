package defpackage;

import android.app.NotificationManager;
import android.content.Context;
import android.os.Looper;
import androidx.room.util.a;
import com.squareup.moshi.Moshi;
import com.yandex.messaging.core.net.entities.Metadata;
import com.yandex.messaging.internal.entities.ChatFlags;
import com.yandex.messaging.internal.entities.ChatId;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes15.dex */
public final class wdb {
    public final Context a;
    public final at2 b;
    public final x22 c;
    public final ouf0 d;
    public final Moshi e;
    public final ogu f;
    public final at20 g;
    public final ch60 h;
    public final rz10 i;
    public final String j;

    public wdb(Context context, at2 at2Var, el21 el21Var, x22 x22Var, ouf0 ouf0Var, Moshi moshi, ogu oguVar, at20 at20Var, ch60 ch60Var, rz10 rz10Var) {
        this.a = context;
        this.b = at2Var;
        this.c = x22Var;
        this.d = ouf0Var;
        this.e = moshi;
        this.f = oguVar;
        this.g = at20Var;
        this.h = ch60Var;
        this.i = rz10Var;
        this.j = el21Var.c();
    }

    public final void a(long j, String str) {
        ch60 ch60Var;
        NotificationManager notificationManager;
        at2 at2Var = this.b;
        int intValue = ((Number) a.b(at2Var.c().a, false, true, new b5a(str, 27))).intValue();
        at2Var.O().a(str);
        if (intValue == 0 || (notificationManager = (ch60Var = this.h).g) == null) {
            return;
        }
        ch60Var.d(notificationManager, ch60Var.b(j), "removeChannel");
    }

    /* JADX WARN: Code restructure failed: missing block: B:127:0x0336, code lost:
    
        if ((r5.c != null) == false) goto L189;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0258, code lost:
    
        if ((r5.c != null) == false) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x025a, code lost:
    
        if (r19 == false) goto L103;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0325 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x03a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(long j) {
        at2 at2Var;
        String str;
        boolean z;
        int i;
        Long l;
        int i2;
        String str2;
        long j2;
        String str3;
        boolean z2;
        y8b y8bVar;
        boolean z3;
        boolean e;
        long j3;
        long j4;
        boolean a;
        boolean a2;
        boolean z4;
        Long d;
        boolean z5;
        Metadata a3;
        Metadata a4;
        Metadata.CallsSettings callsSettings;
        boolean z6;
        s8b s8bVar;
        boolean z7;
        long round;
        String str4;
        long j5;
        boolean z8;
        at2 at2Var2 = this.b;
        ugs ugsVar = (ugs) a.b(at2Var2.g0().a, true, false, new hcb(j, 28));
        if (ugsVar == null) {
            ny61.r("Record in chats table must exist before");
            return;
        }
        long j6 = ugsVar.j;
        long j7 = ugsVar.g;
        int i3 = ugsVar.B;
        boolean z9 = ugsVar.H;
        String str5 = ugsVar.b;
        ChatId a5 = ChatId.Companion.a(str5);
        if (a5 instanceof ChatId.ThreadId) {
            int i4 = (((ChatId.ThreadId) a5).d > 0L ? 1 : (((ChatId.ThreadId) a5).d == 0L ? 0 : -1));
        }
        z83.i();
        long j8 = ugsVar.G;
        at2Var2.Y().g(j);
        Long r = at2Var2.B().r(j);
        long longValue = r != null ? r.longValue() : 0L;
        String str6 = ugsVar.v;
        if (z9) {
            int i5 = ugsVar.h;
            if (j7 < 0) {
                at2Var = at2Var2;
                str = str6;
                z = z9;
            } else if (j7 == 0) {
                at2Var = at2Var2;
                str = str6;
                z = z9;
                i = i3;
            } else {
                at2Var = at2Var2;
                int i6 = i3 - i5;
                str = str6;
                if (i6 < 0) {
                    HashMap hashMap = new HashMap(4);
                    z = z9;
                    b64.B(i6, hashMap, "unseen", i3, "seq_no");
                    hashMap.put("last_seen_seq_no", Integer.valueOf(i5));
                    hashMap.put("chat_id", str5);
                    this.c.reportEvent("negative unseen", hashMap);
                } else {
                    z = z9;
                }
                if (i6 >= 0) {
                    i = i6;
                }
            }
            i = 0;
        } else {
            at2Var = at2Var2;
            str = str6;
            i = 0;
            z = z9;
        }
        String str7 = ugsVar.d;
        Long l2 = ugsVar.w;
        boolean z10 = ugsVar.I;
        long j9 = ugsVar.a;
        Integer num = null;
        if (z10) {
            l = l2;
            i2 = i;
            str2 = str5;
        } else {
            l = l2;
            i2 = i;
            str2 = str5;
            Long l3 = (Long) a.b(at2Var.b().a, true, false, new j2b(19, j9, j7));
            if (l3 != null) {
                int k = at2Var.B().k(j9, l3.longValue()) - 1;
                if (k < 0) {
                    k = 0;
                }
                num = Integer.valueOf(k);
            } else {
                num = null;
            }
        }
        Boolean bool = ugsVar.x;
        Boolean bool2 = Boolean.TRUE;
        if (jl40.l(bool, bool2)) {
            j2 = j6 | 4;
            if (jl40.l(ugsVar.y, bool2)) {
                j2 = 132 | j6;
            }
        } else {
            j2 = j6;
        }
        boolean a6 = ChatFlags.a(j6, 8L);
        Context context = this.a;
        if (a6) {
            str3 = context.getString(oyh0.messaging_saved_messages_chat);
        } else {
            str3 = ugsVar.e;
            if (str3 == null && (str3 = ugsVar.t) == null) {
                str3 = context.getString(oyh0.chat_list_default_name);
            }
        }
        long j10 = ugsVar.C;
        long j11 = ugsVar.D;
        y8b a7 = at2Var.V().a(j);
        wbz0 wbz0Var = s8b.c;
        String str8 = str3;
        int i7 = a7 != null ? a7.d : 0;
        wbz0Var.getClass();
        s8b s8bVar2 = new s8b(i7);
        Integer valueOf = a7 != null ? Integer.valueOf(a7.c) : null;
        boolean z11 = (valueOf != null && valueOf.intValue() == 1) || (valueOf != null && valueOf.intValue() == 2) || ChatFlags.a(j2, 1L) || ChatFlags.a(j2, 8L);
        if (a7 != null) {
            y8bVar = a7;
            z2 = z11;
            if (y8bVar.c == 2) {
                z3 = true;
                boolean z12 = z3;
                boolean z13 = y8bVar == null && y8bVar.c == 0;
                Integer num2 = num;
                String str9 = (String) a.b(at2Var.c().a, true, false, new hcb(j, 21));
                e = str9 != null ? false : at2Var.C().e(str9);
                String str10 = ugsVar.A;
                boolean z14 = str10 == null && str10.equals(this.j);
                Long a8 = at2Var.s0().a(j);
                long longValue2 = a8 == null ? a8.longValue() : 0L;
                j3 = i3;
                boolean z15 = ugsVar.o;
                rz10 rz10Var = this.i;
                if (!z2 || z13) {
                    j4 = j3;
                    a = ChatFlags.a(j2, 8L);
                    if (!ChatFlags.a(j2, 16L) && ((str7 == null || !at2Var.C().e(str7)) && ((str7 == null || (d = at2Var.l0().d(str7)) == null || d.longValue() < longValue) && ((!(a2 = ChatFlags.a(j2, 4L)) || z) && !z15 && (!a || rz10Var.c == null))))) {
                        if (!a) {
                            if (!ChatFlags.a(j2, 1L)) {
                            }
                        }
                        if (j4 <= 0 || !z || !a2 || z14) {
                            z4 = !this.f.a(str2);
                            String str11 = ugsVar.d;
                            kp21 y = at2Var.y();
                            Moshi moshi = this.e;
                            z5 = z4;
                            ouf0 ouf0Var = this.d;
                            a3 = str11 == null ? y.a(str11, ouf0Var, moshi) : null;
                            a4 = at2Var.m0().a(j, ouf0Var, moshi);
                            if (a4 != null || (callsSettings = a4.callsSettings) == null) {
                                callsSettings = a3 == null ? a3.callsSettings : null;
                            }
                            z6 = callsSettings == null ? callsSettings.canCall : false;
                            if (!ChatFlags.a(j2, 8L) || ChatFlags.a(j2, 4L)) {
                                s8bVar = s8bVar2;
                                z7 = false;
                            } else {
                                at20 at20Var = this.g;
                                s8bVar = s8bVar2;
                                z83.g(null, (Looper) at20Var.a, Looper.myLooper());
                                z7 = !((at2) at20Var.b).G().b(ChatId.Companion.b(str2));
                            }
                            round = ((!z5 || ChatFlags.a(j2, 8L)) && j8 == -1) ? Math.round(ugsVar.c * 1000000.0d) : j8;
                            boolean z16 = ((Long) a.b(at2Var.L().a, true, false, new my30(str2, 27))) == null;
                            if (!z5) {
                                a(j, str2);
                            }
                            if (s8bVar.l() || !z5) {
                                if (ChatFlags.a(j2, 8L)) {
                                }
                                str4 = str8;
                                j5 = round;
                                at2Var.O().a(str2);
                                w2b w2bVar = (w2b) a.b(at2Var.f().a, true, false, new cs0(j, 17));
                                wly0 wly0Var = u2b.b;
                                long j12 = w2bVar != null ? w2bVar.b : 0L;
                                wly0Var.getClass();
                                new u2b(j12);
                                ueb c = at2Var.c();
                                boolean z17 = z16;
                                boolean z18 = true;
                                Integer c2 = ChatId.Companion.c(str2);
                                long j13 = j12;
                                boolean z19 = j10 == 1;
                                if (j11 == 1) {
                                    z8 = true;
                                } else {
                                    z8 = true;
                                    z18 = false;
                                }
                                long j14 = j2;
                                boolean z20 = z18;
                                boolean z21 = e == z8 ? z8 : false;
                                int i8 = (int) longValue2;
                                boolean z22 = z6 == z8 ? z8 : false;
                                boolean z23 = z7 == z8 ? z8 : false;
                                int i9 = i2;
                                boolean z24 = z22;
                                a.b(c.a, false, true, new a7b(11, c, new udb(j, str2, c2, str, i9, str7, l, num2, j14, s8bVar.b, z19, z20, z2, z21, z13, i8, z24, z12, z23, ugsVar.n, ugsVar.o, j5, str4, z17, !z5, ugsVar.s, j4, ugsVar.G, j13, ugsVar.F)));
                            }
                            List a9 = at2Var.a0().a(j);
                            if (a9.isEmpty()) {
                                a9 = Collections.singletonList(0L);
                            }
                            Iterator it = a9.iterator();
                            while (it.hasNext()) {
                                long longValue3 = ((Number) it.next()).longValue();
                                fqr0 O = at2Var.O();
                                O.getClass();
                                String str12 = str8;
                                long j15 = round;
                                O.d(new iqr0(str2, str7, longValue3, str12, j15, 1));
                                round = j15;
                                str8 = str12;
                            }
                            str4 = str8;
                            j5 = round;
                            w2b w2bVar2 = (w2b) a.b(at2Var.f().a, true, false, new cs0(j, 17));
                            wly0 wly0Var2 = u2b.b;
                            if (w2bVar2 != null) {
                            }
                            wly0Var2.getClass();
                            new u2b(j12);
                            ueb c3 = at2Var.c();
                            boolean z172 = z16;
                            boolean z182 = true;
                            Integer c22 = ChatId.Companion.c(str2);
                            long j132 = j12;
                            if (j10 == 1) {
                            }
                            if (j11 == 1) {
                            }
                            long j142 = j2;
                            boolean z202 = z182;
                            if (e == z8) {
                            }
                            int i82 = (int) longValue2;
                            if (z6 == z8) {
                            }
                            if (z7 == z8) {
                            }
                            int i92 = i2;
                            boolean z242 = z22;
                            a.b(c3.a, false, true, new a7b(11, c3, new udb(j, str2, c22, str, i92, str7, l, num2, j142, s8bVar.b, z19, z202, z2, z21, z13, i82, z242, z12, z23, ugsVar.n, ugsVar.o, j5, str4, z172, !z5, ugsVar.s, j4, ugsVar.G, j132, ugsVar.F)));
                        }
                    }
                } else {
                    j4 = j3;
                }
                z4 = false;
                String str112 = ugsVar.d;
                kp21 y2 = at2Var.y();
                Moshi moshi2 = this.e;
                z5 = z4;
                ouf0 ouf0Var2 = this.d;
                if (str112 == null) {
                }
                a4 = at2Var.m0().a(j, ouf0Var2, moshi2);
                if (a4 != null) {
                }
                if (a3 == null) {
                }
                if (callsSettings == null) {
                }
                if (ChatFlags.a(j2, 8L)) {
                }
                s8bVar = s8bVar2;
                z7 = false;
                round = ((!z5 || ChatFlags.a(j2, 8L)) && j8 == -1) ? Math.round(ugsVar.c * 1000000.0d) : j8;
                if (((Long) a.b(at2Var.L().a, true, false, new my30(str2, 27))) == null) {
                }
                if (!z5) {
                }
                if (s8bVar.l()) {
                }
                if (ChatFlags.a(j2, 8L)) {
                }
                str4 = str8;
                j5 = round;
                at2Var.O().a(str2);
                w2b w2bVar22 = (w2b) a.b(at2Var.f().a, true, false, new cs0(j, 17));
                wly0 wly0Var22 = u2b.b;
                if (w2bVar22 != null) {
                }
                wly0Var22.getClass();
                new u2b(j12);
                ueb c32 = at2Var.c();
                boolean z1722 = z16;
                boolean z1822 = true;
                Integer c222 = ChatId.Companion.c(str2);
                long j1322 = j12;
                if (j10 == 1) {
                }
                if (j11 == 1) {
                }
                long j1422 = j2;
                boolean z2022 = z1822;
                if (e == z8) {
                }
                int i822 = (int) longValue2;
                if (z6 == z8) {
                }
                if (z7 == z8) {
                }
                int i922 = i2;
                boolean z2422 = z22;
                a.b(c32.a, false, true, new a7b(11, c32, new udb(j, str2, c222, str, i922, str7, l, num2, j1422, s8bVar.b, z19, z2022, z2, z21, z13, i822, z2422, z12, z23, ugsVar.n, ugsVar.o, j5, str4, z1722, !z5, ugsVar.s, j4, ugsVar.G, j1322, ugsVar.F)));
            }
        } else {
            z2 = z11;
            y8bVar = a7;
        }
        z3 = false;
        boolean z122 = z3;
        boolean z132 = y8bVar == null && y8bVar.c == 0;
        Integer num22 = num;
        String str92 = (String) a.b(at2Var.c().a, true, false, new hcb(j, 21));
        if (str92 != null) {
        }
        String str102 = ugsVar.A;
        if (str102 == null) {
        }
        Long a82 = at2Var.s0().a(j);
        if (a82 == null) {
        }
        j3 = i3;
        boolean z152 = ugsVar.o;
        rz10 rz10Var2 = this.i;
        if (z2) {
        }
        j4 = j3;
        a = ChatFlags.a(j2, 8L);
        if (!ChatFlags.a(j2, 16L)) {
            if (!a) {
            }
            if (j4 <= 0) {
            }
            z4 = !this.f.a(str2);
            String str1122 = ugsVar.d;
            kp21 y22 = at2Var.y();
            Moshi moshi22 = this.e;
            z5 = z4;
            ouf0 ouf0Var22 = this.d;
            if (str1122 == null) {
            }
            a4 = at2Var.m0().a(j, ouf0Var22, moshi22);
            if (a4 != null) {
            }
            if (a3 == null) {
            }
            if (callsSettings == null) {
            }
            if (ChatFlags.a(j2, 8L)) {
            }
            s8bVar = s8bVar2;
            z7 = false;
            round = ((!z5 || ChatFlags.a(j2, 8L)) && j8 == -1) ? Math.round(ugsVar.c * 1000000.0d) : j8;
            if (((Long) a.b(at2Var.L().a, true, false, new my30(str2, 27))) == null) {
            }
            if (!z5) {
            }
            if (s8bVar.l()) {
            }
            if (ChatFlags.a(j2, 8L)) {
            }
            str4 = str8;
            j5 = round;
            at2Var.O().a(str2);
            w2b w2bVar222 = (w2b) a.b(at2Var.f().a, true, false, new cs0(j, 17));
            wly0 wly0Var222 = u2b.b;
            if (w2bVar222 != null) {
            }
            wly0Var222.getClass();
            new u2b(j12);
            ueb c322 = at2Var.c();
            boolean z17222 = z16;
            boolean z18222 = true;
            Integer c2222 = ChatId.Companion.c(str2);
            long j13222 = j12;
            if (j10 == 1) {
            }
            if (j11 == 1) {
            }
            long j14222 = j2;
            boolean z20222 = z18222;
            if (e == z8) {
            }
            int i8222 = (int) longValue2;
            if (z6 == z8) {
            }
            if (z7 == z8) {
            }
            int i9222 = i2;
            boolean z24222 = z22;
            a.b(c322.a, false, true, new a7b(11, c322, new udb(j, str2, c2222, str, i9222, str7, l, num22, j14222, s8bVar.b, z19, z20222, z2, z21, z132, i8222, z24222, z122, z23, ugsVar.n, ugsVar.o, j5, str4, z17222, !z5, ugsVar.s, j4, ugsVar.G, j13222, ugsVar.F)));
        }
        z4 = false;
        String str11222 = ugsVar.d;
        kp21 y222 = at2Var.y();
        Moshi moshi222 = this.e;
        z5 = z4;
        ouf0 ouf0Var222 = this.d;
        if (str11222 == null) {
        }
        a4 = at2Var.m0().a(j, ouf0Var222, moshi222);
        if (a4 != null) {
        }
        if (a3 == null) {
        }
        if (callsSettings == null) {
        }
        if (ChatFlags.a(j2, 8L)) {
        }
        s8bVar = s8bVar2;
        z7 = false;
        round = ((!z5 || ChatFlags.a(j2, 8L)) && j8 == -1) ? Math.round(ugsVar.c * 1000000.0d) : j8;
        if (((Long) a.b(at2Var.L().a, true, false, new my30(str2, 27))) == null) {
        }
        if (!z5) {
        }
        if (s8bVar.l()) {
        }
        if (ChatFlags.a(j2, 8L)) {
        }
        str4 = str8;
        j5 = round;
        at2Var.O().a(str2);
        w2b w2bVar2222 = (w2b) a.b(at2Var.f().a, true, false, new cs0(j, 17));
        wly0 wly0Var2222 = u2b.b;
        if (w2bVar2222 != null) {
        }
        wly0Var2222.getClass();
        new u2b(j12);
        ueb c3222 = at2Var.c();
        boolean z172222 = z16;
        boolean z182222 = true;
        Integer c22222 = ChatId.Companion.c(str2);
        long j132222 = j12;
        if (j10 == 1) {
        }
        if (j11 == 1) {
        }
        long j142222 = j2;
        boolean z202222 = z182222;
        if (e == z8) {
        }
        int i82222 = (int) longValue2;
        if (z6 == z8) {
        }
        if (z7 == z8) {
        }
        int i92222 = i2;
        boolean z242222 = z22;
        a.b(c3222.a, false, true, new a7b(11, c3222, new udb(j, str2, c22222, str, i92222, str7, l, num22, j142222, s8bVar.b, z19, z202222, z2, z21, z132, i82222, z242222, z122, z23, ugsVar.n, ugsVar.o, j5, str4, z172222, !z5, ugsVar.s, j4, ugsVar.G, j132222, ugsVar.F)));
    }
}
