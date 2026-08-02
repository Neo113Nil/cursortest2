package defpackage;

import android.app.Application;
import android.content.ComponentCallbacks;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.os.Handler;
import android.os.Looper;
import androidx.compose.animation.c;
import androidx.compose.foundation.layout.a;
import androidx.compose.foundation.layout.b;
import androidx.compose.foundation.layout.d;
import androidx.fragment.app.o;
import androidx.fragment.app.t;
import androidx.fragment.app.y;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import ru.yandex.music.R;
import ru.yandex.music.data.stores.WebPath$Storage;

/* loaded from: classes5.dex */
public abstract class qld {
    public static final wn5 a = new wn5(new h3(6), 1957117374, false);
    public static final wn5 b;
    public static final wn5 c;
    public static final wn5 d;
    public static final wn5 e;
    public static final wn5 f;
    public static final wn5 g;
    public static final wn5 h;
    public static final wn5 i;
    public static final wn5 j;
    public static final wn5 k;
    public static final pmb l;
    public static final uh0 m;
    public static final uh0 n;
    public static final i6c[] o;

    static {
        new wn5(new h3(7), -713373438, false);
        b = new wn5(new go5(28), -1564588812, false);
        c = new wn5(new po5(10), 1099585787, false);
        d = new wn5(new rz3(18), 518085863, false);
        e = new wn5(new rz3(19), -88775347, false);
        f = new wn5(new rz3(20), -329410959, false);
        g = new wn5(new dp5(12), 1018506093, false);
        h = new wn5(new dp5(13), 882478796, false);
        i = new wn5(new dp5(14), 746451499, false);
        j = new wn5(new ap5(13), 1830883257, false);
        k = new wn5(new dp5(15), 66315014, false);
        l = new pmb();
        m = new uh0(1000);
        new uh0(1007);
        new uh0(1008);
        n = new uh0(1002);
        o = new i6c[]{new i6c("name_ulr_private", 1L), new i6c("name_sleep_segment_request", 1L), new i6c("support_context_feature_id", 1L), new i6c("get_current_location", 1L), new i6c("get_last_activity_feature_id", 1L)};
    }

    public static long A(int i2, int i3, int i4, int i5) {
        int i6 = 262142;
        int min = Math.min(i2, 262142);
        int min2 = i3 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i3, 262142);
        int i7 = min2 == Integer.MAX_VALUE ? min : min2;
        if (i7 >= 8191) {
            if (i7 < 32767) {
                i6 = 65534;
            } else if (i7 < 65535) {
                i6 = 32766;
            } else {
                if (i7 >= 262143) {
                    ia6.k(i7);
                    rj7.f();
                    return 0L;
                }
                i6 = 8190;
            }
        }
        return ia6.a(min, min2, Math.min(i6, i4), i5 != Integer.MAX_VALUE ? Math.min(i6, i5) : Integer.MAX_VALUE);
    }

    public static v6c B(int i2) {
        for (v6c v6cVar : v6c.values()) {
            if (v6cVar.a == i2) {
                return v6cVar;
            }
        }
        return v6c.Unknown;
    }

    public static tqc C() {
        return tqc.p;
    }

    public static tqc D() {
        return tqc.n;
    }

    public static tqc E() {
        return tqc.m;
    }

    public static tqc F() {
        return tqc.o;
    }

    public static String G(int i2) {
        switch (i2) {
            case -1:
                return "SUCCESS_CACHE";
            case 0:
                return "SUCCESS";
            case 1:
            case 9:
            case 11:
            case 12:
            default:
                return k5r.i(i2, "unknown status code: ");
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 10:
                return "DEVELOPER_ERROR";
            case 13:
                return "ERROR";
            case 14:
                return "INTERRUPTED";
            case 15:
                return "TIMEOUT";
            case 16:
                return "CANCELED";
            case 17:
                return "API_NOT_CONNECTED";
            case 18:
                return "DEAD_CLIENT";
            case 19:
                return "REMOTE_EXCEPTION";
            case 20:
                return "CONNECTION_SUSPENDED_DURING_CALL";
            case 21:
                return "RECONNECTION_TIMED_OUT_DURING_UPDATE";
            case 22:
                return "RECONNECTION_TIMED_OUT";
        }
    }

    public static final boolean H(Iterable iterable) {
        iterable.getClass();
        return iterable instanceof Collection ? ((Collection) iterable).isEmpty() : !iterable.iterator().hasNext();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [arf, java.lang.Object] */
    public static final void I(long j2, Function0 function0) {
        function0.getClass();
        ((Handler) pld.a.getValue()).postDelayed(new ti(4, function0), j2);
    }

    public static final void J(Function0 function0) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            function0.invoke();
        } else {
            pld.a(function0);
        }
    }

    public static final boolean K(c3b c3bVar) {
        if (c3bVar instanceof h3b) {
            return true;
        }
        if (!(c3bVar instanceof n3b)) {
            return false;
        }
        ArrayList arrayList = ((n3b) c3bVar).b;
        if (arrayList != null && arrayList.isEmpty()) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (K((c3b) it.next())) {
                return true;
            }
        }
        return false;
    }

    public static void L(oq oqVar, dy7 dy7Var, kxi kxiVar, pu0 pu0Var, y yVar) {
        oqVar.getClass();
        dy7Var.getClass();
        kxiVar.getClass();
        yVar.getClass();
        sai saiVar = new sai(false);
        cvo cvoVar = cvo.i;
        e3s.X(o6m.b(wjb.SummaryScreen, new avo(pkb.Album, oqVar.a), 2), yVar, "ALBUM_DESCRIPTION_DIALOG_TAG", saiVar, null, new wn5(new lc(dy7Var, oqVar, kxiVar, pu0Var, saiVar, 1), -300027376, true), 48);
    }

    public static final Calendar M(vc7 vc7Var) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(vc7Var.b);
        calendar.setTimeInMillis(vc7Var.a);
        return calendar;
    }

    public static final void a(final d41 d41Var, yci yciVar, hq5 hq5Var, final int i2, final int i3) {
        final yci yciVar2;
        xmn r;
        Function2 function2;
        d41Var.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-603908634);
        int i4 = i2 | (oq5Var.f(d41Var) ? 4 : 2);
        int i5 = i3 & 2;
        if (i5 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= oq5Var.f(yciVar) ? 32 : 16;
        }
        if (oq5Var.P(i4 & 1, (i4 & 19) != 18)) {
            yci yciVar3 = i5 != 0 ? vci.a : yciVar;
            aqi O = gld.O(d41Var.getState(), oq5Var);
            ogp.g.e(((t41) O.getValue()) instanceof q41, ((t41) O.getValue()) instanceof s41, null, oq5Var, 4096, 4);
            if (!d41Var.b()) {
                oq5Var.Z(576264660);
                b((t41) O.getValue(), d41Var, yciVar3, oq5Var, (i4 << 3) & 1008);
                oq5Var.p(false);
                r = oq5Var.r();
                if (r != null) {
                    final int i6 = 0;
                    final yci yciVar4 = yciVar3;
                    function2 = new Function2() { // from class: p41
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i7 = i6;
                            hq5 hq5Var2 = (hq5) obj;
                            ((Integer) obj2).getClass();
                            switch (i7) {
                                case 0:
                                    qld.a(d41Var, yciVar4, hq5Var2, rvf.R(i2 | 1), i3);
                                    break;
                                default:
                                    qld.a(d41Var, yciVar4, hq5Var2, rvf.R(i2 | 1), i3);
                                    break;
                            }
                            return Unit.a;
                        }
                    };
                    r.d = function2;
                }
                return;
            }
            yciVar2 = yciVar3;
            oq5Var.Z(573891548);
            oq5Var.p(false);
            pm0.a(null, ild.C(778185583, new x3(13, yciVar2, d41Var, O), oq5Var), oq5Var, 48, 1);
        } else {
            oq5Var.S();
            yciVar2 = yciVar;
        }
        r = oq5Var.r();
        if (r != null) {
            final int i7 = 1;
            function2 = new Function2() { // from class: p41
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i72 = i7;
                    hq5 hq5Var2 = (hq5) obj;
                    ((Integer) obj2).getClass();
                    switch (i72) {
                        case 0:
                            qld.a(d41Var, yciVar2, hq5Var2, rvf.R(i2 | 1), i3);
                            break;
                        default:
                            qld.a(d41Var, yciVar2, hq5Var2, rvf.R(i2 | 1), i3);
                            break;
                    }
                    return Unit.a;
                }
            };
            r.d = function2;
        }
    }

    public static final void b(t41 t41Var, d41 d41Var, yci yciVar, hq5 hq5Var, int i2) {
        int i3;
        Object zyVar;
        d41 d41Var2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(887927781);
        int i4 = 4;
        if ((i2 & 6) == 0) {
            i3 = (oq5Var.f(t41Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? oq5Var.f(d41Var) : oq5Var.h(d41Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= oq5Var.f(yciVar) ? 256 : 128;
        }
        int i5 = i3;
        boolean z = true;
        if (oq5Var.P(i5 & 1, (i5 & 147) != 146)) {
            fvf a2 = hvf.a(0, 0, oq5Var, 0, 3);
            String M = rvf.M(R.string.concerts, oq5Var);
            vm C = ghh.C(zs4.g(oq5Var), ogp.A(oq5Var));
            if ((i5 & 112) != 32 && ((i5 & 64) == 0 || !oq5Var.h(d41Var))) {
                z = false;
            }
            Object K = oq5Var.K();
            if (z || K == gq5.a) {
                zyVar = new zy(0, d41Var, d41.class, "onBackClick", "onBackClick()V", 0, 25);
                d41Var2 = d41Var;
                oq5Var.k0(zyVar);
            } else {
                d41Var2 = d41Var;
                zyVar = K;
            }
            xp3.d(M, a2, yciVar, C, (Function0) ((h9f) zyVar), null, false, false, null, null, null, ild.C(1195707375, new xk(i4, t41Var, d41Var2, a2), oq5Var), oq5Var, i5 & 896, 48, 2016);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new b3(t41Var, d41Var, yciVar, i2, 7);
        }
    }

    public static final void c(ck1 ck1Var, hvq hvqVar, um0 um0Var, d85 d85Var, yci yciVar, zsq zsqVar, hq5 hq5Var, int i2, int i3) {
        int i4;
        oq5 oq5Var;
        yci yciVar2;
        zsq zsqVar2;
        zsq zsqVar3 = zsqVar;
        pas pasVar = ck1Var.a;
        hvqVar.getClass();
        um0Var.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(2120762535);
        if ((i2 & 6) == 0) {
            i4 = ((i2 & 8) == 0 ? oq5Var2.f(ck1Var) : oq5Var2.h(ck1Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= oq5Var2.h(hvqVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= oq5Var2.d(um0Var.ordinal()) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= oq5Var2.f(d85Var) ? 2048 : 1024;
        }
        int i5 = i4 | 24576;
        int i6 = i3 & 32;
        if (i6 != 0) {
            i5 = 221184 | i4;
        } else if ((196608 & i2) == 0) {
            i5 |= (i2 & SQLiteDatabase.OPEN_PRIVATECACHE) == 0 ? oq5Var2.f(zsqVar3) : oq5Var2.h(zsqVar3) ? 131072 : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        if ((74899 & i5) == 74898 && oq5Var2.z()) {
            oq5Var2.S();
            yciVar2 = yciVar;
            zsqVar2 = zsqVar3;
            oq5Var = oq5Var2;
        } else {
            if (i6 != 0) {
                zsqVar3 = null;
            }
            vci vciVar = vci.a;
            yci o2 = a.o(d.c(vciVar, 1.0f), 16, 0.0f, 2);
            boolean h2 = ((458752 & i5) == 131072 || ((i5 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 && oq5Var2.h(zsqVar3))) | oq5Var2.h(hvqVar);
            Object K = oq5Var2.K();
            kjn kjnVar = gq5.a;
            if (h2 || K == kjnVar) {
                K = new ko1(zsqVar3, hvqVar, 0);
                oq5Var2.k0(K);
            }
            yci b2 = com.yandex.music.core.ui.compose.a.b(o2, null, 0L, 0.0f, null, (Function2) K, 15);
            gz2 gz2Var = b2c.o;
            dtq dtqVar = ck1Var.c;
            List list = ck1Var.b;
            ta5 a2 = sa5.a(dtqVar.a, gz2Var, oq5Var2, 48);
            int i7 = oq5Var2.P;
            androidx.compose.runtime.internal.a l2 = oq5Var2.l();
            yci H = vnj.H(oq5Var2, b2);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var2.d0();
            zsq zsqVar4 = zsqVar3;
            if (oq5Var2.O) {
                oq5Var2.k(grbVar);
            } else {
                oq5Var2.n0();
            }
            g0g.U(oq5Var2, a2, wp5.f);
            g0g.U(oq5Var2, l2, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i7))) {
                ouj.x(i7, oq5Var2, i7, kb5Var);
            }
            g0g.U(oq5Var2, H, wp5.d);
            oq5Var = oq5Var2;
            wyf.n(pasVar, um0Var, hvqVar.a(), d85Var, null, 0, oq5Var, ((i5 >> 3) & 112) | (i5 & 7168), 48);
            u1g.l(oq5Var, d.e(vciVar, 40));
            if ((!list.isEmpty() ? list : null) == null) {
                oq5Var.Z(-1937773062);
            } else {
                oq5Var.Z(-1937773061);
                vm0 b3 = fn0.b(((ArrayList) xz0.w(new Object[]{pasVar.a, pasVar.b, pasVar.d, list})).size(), 0.0f, um0Var, oq5Var, i5 & 896, 2);
                List q0 = CollectionsKt.q0(list, 3);
                float f2 = 80;
                float f3 = 64;
                float f4 = (float) 2.5d;
                gar garVar = gar.b;
                boolean f5 = oq5Var.f(b3);
                Object K2 = oq5Var.K();
                if (f5 || K2 == kjnVar) {
                    K2 = new la1(b3, 3);
                    oq5Var.k0(K2);
                }
                xee.c(q0, f2, f3, wyf.s(vciVar, (Function0) K2), f4, garVar, wct.a, oq5Var, 1794480, 0);
                oq5Var = oq5Var;
            }
            oq5Var.p(false);
            oq5Var.p(true);
            yciVar2 = vciVar;
            zsqVar2 = zsqVar4;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new fd1((Object) ck1Var, (Object) hvqVar, (Object) um0Var, d85Var, yciVar2, zsqVar2, i2, i3, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void d(Function0 function0, yci yciVar, boolean z, dup dupVar, zk3 zk3Var, fl3 fl3Var, o0k o0kVar, wn5 wn5Var, hq5 hq5Var, int i2, int i3) {
        int i4;
        boolean z2;
        dup dupVar2;
        zk3 zk3Var2;
        fl3 fl3Var2;
        int i5;
        o0k o0kVar2;
        Object K;
        kjn kjnVar;
        zk3 zk3Var3;
        long j2;
        uoi uoiVar;
        boolean z3;
        fl3 fl3Var3;
        vm0 vm0Var;
        zk3 zk3Var4;
        o0k o0kVar3;
        dup dupVar3;
        boolean z4;
        fl3 fl3Var4;
        xmn r;
        int i6;
        int i7;
        int i8;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(650121315);
        if ((i2 & 6) == 0) {
            i4 = (oq5Var.h(function0) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= oq5Var.f(yciVar) ? 32 : 16;
        }
        int i9 = i3 & 4;
        if (i9 != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            z2 = z;
            i4 |= oq5Var.g(z2) ? 256 : 128;
            if ((i2 & 3072) != 0) {
                if ((i3 & 8) == 0) {
                    dupVar2 = dupVar;
                    if (oq5Var.f(dupVar2)) {
                        i8 = 2048;
                        i4 |= i8;
                    }
                } else {
                    dupVar2 = dupVar;
                }
                i8 = 1024;
                i4 |= i8;
            } else {
                dupVar2 = dupVar;
            }
            if ((i2 & 24576) != 0) {
                if ((i3 & 16) == 0) {
                    zk3Var2 = zk3Var;
                    if (oq5Var.f(zk3Var2)) {
                        i7 = 16384;
                        i4 |= i7;
                    }
                } else {
                    zk3Var2 = zk3Var;
                }
                i7 = RemoteCameraConfig.Notification.ID;
                i4 |= i7;
            } else {
                zk3Var2 = zk3Var;
            }
            if ((196608 & i2) != 0) {
                if ((i3 & 32) == 0) {
                    fl3Var2 = fl3Var;
                    if (oq5Var.f(fl3Var2)) {
                        i6 = SQLiteDatabase.OPEN_SHAREDCACHE;
                        i4 |= i6;
                    }
                } else {
                    fl3Var2 = fl3Var;
                }
                i6 = SQLiteDatabase.OPEN_FULLMUTEX;
                i4 |= i6;
            } else {
                fl3Var2 = fl3Var;
            }
            if ((i3 & 64) == 0) {
                i4 |= ScreenMirroringConfig.Video.BITRATE_1_5MB;
            } else if ((i2 & ScreenMirroringConfig.Video.BITRATE_1_5MB) == 0) {
                i4 |= oq5Var.f(null) ? 1048576 : 524288;
            }
            i5 = i3 & 128;
            if (i5 == 0) {
                i4 |= 12582912;
            } else if ((12582912 & i2) == 0) {
                o0kVar2 = o0kVar;
                i4 |= oq5Var.f(o0kVar2) ? 8388608 : RemoteCameraConfig.Camera.BITRATE;
                if ((i3 & 256) != 0) {
                    i4 |= 100663296;
                } else if ((i2 & 100663296) == 0) {
                    i4 |= oq5Var.f(null) ? 67108864 : 33554432;
                }
                if ((805306368 & i2) == 0) {
                    i4 |= oq5Var.h(wn5Var) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
                }
                if ((i4 & 306783379) == 306783378 || !oq5Var.z()) {
                    oq5Var.U();
                    if ((i2 & 1) != 0 || oq5Var.y()) {
                        if (i9 != 0) {
                            z2 = true;
                        }
                        if ((i3 & 8) != 0) {
                            q0k q0kVar = al3.a;
                            i4 &= -7169;
                            dupVar2 = jvp.a(gbc.b, oq5Var);
                        }
                        if ((i3 & 16) != 0) {
                            q0k q0kVar2 = al3.a;
                            i4 &= -57345;
                            zk3Var2 = al3.b((i95) oq5Var.j(j95.a));
                        }
                        if ((i3 & 32) != 0) {
                            q0k q0kVar3 = al3.a;
                            i4 &= -458753;
                            fl3Var2 = new fl3(gbc.a, gbc.i, gbc.f, gbc.g, gbc.d);
                        }
                        if (i5 != 0) {
                            o0kVar2 = al3.a;
                        }
                    } else {
                        oq5Var.S();
                        if ((i3 & 8) != 0) {
                            i4 &= -7169;
                        }
                        if ((i3 & 16) != 0) {
                            i4 &= -57345;
                        }
                        if ((i3 & 32) != 0) {
                            i4 &= -458753;
                        }
                    }
                    dup dupVar4 = dupVar2;
                    zk3 zk3Var5 = zk3Var2;
                    o0k o0kVar4 = o0kVar2;
                    oq5Var.q();
                    oq5Var.Z(-239156623);
                    K = oq5Var.K();
                    kjnVar = gq5.a;
                    if (K == kjnVar) {
                        K = vz1.h(oq5Var);
                    }
                    uoi uoiVar2 = (uoi) K;
                    oq5Var.p(false);
                    long j3 = z2 ? zk3Var5.a : zk3Var5.c;
                    long j4 = z2 ? zk3Var5.b : zk3Var5.d;
                    oq5Var.Z(-239150048);
                    if (fl3Var2 == null) {
                        zk3Var3 = zk3Var5;
                        j2 = j3;
                        z3 = z2;
                        uoiVar = uoiVar2;
                        fl3Var3 = fl3Var2;
                        vm0Var = null;
                    } else {
                        int i10 = ((i4 >> 6) & 14) | ((i4 >> 9) & 896);
                        Object K2 = oq5Var.K();
                        if (K2 == kjnVar) {
                            K2 = new s2r();
                            oq5Var.k0(K2);
                        }
                        s2r s2rVar = (s2r) K2;
                        boolean f2 = oq5Var.f(uoiVar2);
                        zk3Var3 = zk3Var5;
                        Object K3 = oq5Var.K();
                        if (f2 || K3 == kjnVar) {
                            j2 = j3;
                            K3 = new dl3(uoiVar2, s2rVar, null, 0);
                            oq5Var.k0(K3);
                        } else {
                            j2 = j3;
                        }
                        gld.w(oq5Var, uoiVar2, (Function2) K3);
                        tre treVar = (tre) CollectionsKt.Z(s2rVar);
                        float f3 = !z2 ? fl3Var2.e : treVar instanceof rqm ? fl3Var2.b : treVar instanceof k4e ? fl3Var2.d : treVar instanceof poc ? fl3Var2.c : fl3Var2.a;
                        Object K4 = oq5Var.K();
                        if (K4 == kjnVar) {
                            uoiVar = uoiVar2;
                            K4 = new fk0(new cma(f3), azt.c, null, 12);
                            oq5Var.k0(K4);
                        } else {
                            uoiVar = uoiVar2;
                        }
                        fk0 fk0Var = (fk0) K4;
                        cma cmaVar = new cma(f3);
                        boolean h2 = ((((i10 & 896) ^ 384) > 256 && oq5Var.f(fl3Var2)) || (i10 & 384) == 256) | oq5Var.h(fk0Var) | oq5Var.c(f3) | ((((i10 & 14) ^ 6) > 4 && oq5Var.g(z2)) || (i10 & 6) == 4) | oq5Var.h(treVar);
                        Object K5 = oq5Var.K();
                        if (h2 || K5 == kjnVar) {
                            z3 = z2;
                            fl3Var3 = fl3Var2;
                            K5 = new el3(fk0Var, f3, z3, fl3Var3, treVar, null, 0);
                            oq5Var.k0(K5);
                        } else {
                            z3 = z2;
                            fl3Var3 = fl3Var2;
                        }
                        gld.w(oq5Var, cmaVar, (Function2) K5);
                        vm0Var = fk0Var.c;
                    }
                    oq5Var.p(false);
                    float f4 = vm0Var != null ? ((cma) vm0Var.b.getValue()).a : 0;
                    yci b2 = nfp.b(yciVar, false, rq1.y0);
                    long j5 = j4;
                    wn5 C = ild.C(956488494, new wf0(1, j5, o0kVar4, wn5Var), oq5Var);
                    qs5 qs5Var = qtr.a;
                    float f5 = ((cma) oq5Var.j(qs5Var)).a + 0;
                    etn.m(new qzm[]{rb6.a.a(new d85(j5)), qs5Var.a(new cma(f5))}, ild.C(1279702876, new ntr(b2, dupVar4, j2, f5, uoiVar, z3, function0, f4, C), oq5Var), oq5Var, 56);
                    zk3Var4 = zk3Var3;
                    o0kVar3 = o0kVar4;
                    dupVar3 = dupVar4;
                    z4 = z3;
                    fl3Var4 = fl3Var3;
                } else {
                    oq5Var.S();
                    z4 = z2;
                    dupVar3 = dupVar2;
                    zk3Var4 = zk3Var2;
                    fl3Var4 = fl3Var2;
                    o0kVar3 = o0kVar2;
                }
                r = oq5Var.r();
                if (r != null) {
                    r.d = new hl3(function0, yciVar, z4, dupVar3, zk3Var4, fl3Var4, o0kVar3, wn5Var, i2, i3);
                    return;
                }
                return;
            }
            o0kVar2 = o0kVar;
            if ((i3 & 256) != 0) {
            }
            if ((805306368 & i2) == 0) {
            }
            if ((i4 & 306783379) == 306783378) {
            }
            oq5Var.U();
            if ((i2 & 1) != 0) {
            }
            if (i9 != 0) {
            }
            if ((i3 & 8) != 0) {
            }
            if ((i3 & 16) != 0) {
            }
            if ((i3 & 32) != 0) {
            }
            if (i5 != 0) {
            }
            dup dupVar42 = dupVar2;
            zk3 zk3Var52 = zk3Var2;
            o0k o0kVar42 = o0kVar2;
            oq5Var.q();
            oq5Var.Z(-239156623);
            K = oq5Var.K();
            kjnVar = gq5.a;
            if (K == kjnVar) {
            }
            uoi uoiVar22 = (uoi) K;
            oq5Var.p(false);
            if (z2) {
            }
            if (z2) {
            }
            oq5Var.Z(-239150048);
            if (fl3Var2 == null) {
            }
            oq5Var.p(false);
            if (vm0Var != null) {
            }
            yci b22 = nfp.b(yciVar, false, rq1.y0);
            long j52 = j4;
            wn5 C2 = ild.C(956488494, new wf0(1, j52, o0kVar42, wn5Var), oq5Var);
            qs5 qs5Var2 = qtr.a;
            float f52 = ((cma) oq5Var.j(qs5Var2)).a + 0;
            etn.m(new qzm[]{rb6.a.a(new d85(j52)), qs5Var2.a(new cma(f52))}, ild.C(1279702876, new ntr(b22, dupVar42, j2, f52, uoiVar, z3, function0, f4, C2), oq5Var), oq5Var, 56);
            zk3Var4 = zk3Var3;
            o0kVar3 = o0kVar42;
            dupVar3 = dupVar42;
            z4 = z3;
            fl3Var4 = fl3Var3;
            r = oq5Var.r();
            if (r != null) {
            }
        }
        z2 = z;
        if ((i2 & 3072) != 0) {
        }
        if ((i2 & 24576) != 0) {
        }
        if ((196608 & i2) != 0) {
        }
        if ((i3 & 64) == 0) {
        }
        i5 = i3 & 128;
        if (i5 == 0) {
        }
        o0kVar2 = o0kVar;
        if ((i3 & 256) != 0) {
        }
        if ((805306368 & i2) == 0) {
        }
        if ((i4 & 306783379) == 306783378) {
        }
        oq5Var.U();
        if ((i2 & 1) != 0) {
        }
        if (i9 != 0) {
        }
        if ((i3 & 8) != 0) {
        }
        if ((i3 & 16) != 0) {
        }
        if ((i3 & 32) != 0) {
        }
        if (i5 != 0) {
        }
        dup dupVar422 = dupVar2;
        zk3 zk3Var522 = zk3Var2;
        o0k o0kVar422 = o0kVar2;
        oq5Var.q();
        oq5Var.Z(-239156623);
        K = oq5Var.K();
        kjnVar = gq5.a;
        if (K == kjnVar) {
        }
        uoi uoiVar222 = (uoi) K;
        oq5Var.p(false);
        if (z2) {
        }
        if (z2) {
        }
        oq5Var.Z(-239150048);
        if (fl3Var2 == null) {
        }
        oq5Var.p(false);
        if (vm0Var != null) {
        }
        yci b222 = nfp.b(yciVar, false, rq1.y0);
        long j522 = j4;
        wn5 C22 = ild.C(956488494, new wf0(1, j522, o0kVar422, wn5Var), oq5Var);
        qs5 qs5Var22 = qtr.a;
        float f522 = ((cma) oq5Var.j(qs5Var22)).a + 0;
        etn.m(new qzm[]{rb6.a.a(new d85(j522)), qs5Var22.a(new cma(f522))}, ild.C(1279702876, new ntr(b222, dupVar422, j2, f522, uoiVar, z3, function0, f4, C22), oq5Var), oq5Var, 56);
        zk3Var4 = zk3Var3;
        o0kVar3 = o0kVar422;
        dupVar3 = dupVar422;
        z4 = z3;
        fl3Var4 = fl3Var3;
        r = oq5Var.r();
        if (r != null) {
        }
    }

    public static final void e(pu4 pu4Var, hq5 hq5Var, int i2) {
        fvf fvfVar;
        xu4 xu4Var;
        pu4Var.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-65901293);
        int i3 = (oq5Var.h(pu4Var) ? 4 : 2) | i2;
        if (oq5Var.P(i3 & 1, (i3 & 3) != 2)) {
            xu4 xu4Var2 = (xu4) szf.Q(pu4Var.e, oq5Var).getValue();
            fvf a2 = hvf.a(0, 0, oq5Var, 0, 3);
            ogp.g.e(false, xu4Var2 instanceof vu4, null, oq5Var, 4096, 5);
            String M = rvf.M(R.string.albums, oq5Var);
            boolean h2 = oq5Var.h(pu4Var);
            Object K = oq5Var.K();
            if (h2 || K == gq5.a) {
                fvfVar = a2;
                xu4Var = xu4Var2;
                ub4 ub4Var = new ub4(0, pu4Var, pu4.class, "onBackClick", "onBackClick()V", 0, 11);
                oq5Var.k0(ub4Var);
                K = ub4Var;
            } else {
                xu4Var = xu4Var2;
                fvfVar = a2;
            }
            xp3.d(M, fvfVar, null, ghh.C(zs4.g(oq5Var), ogp.A(oq5Var)), (Function0) ((h9f) K), ild.C(-1053592943, new u2(22, pu4Var), oq5Var), false, false, null, null, null, ild.C(-633292983, new xk(18, xu4Var, fvfVar, pu4Var), oq5Var), oq5Var, 196608, 48, 1988);
            oq5Var = oq5Var;
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new q2(pu4Var, i2, 29);
        }
    }

    public static final void f(boolean z, mcu mcuVar, iil iilVar, ab0 ab0Var, float f2, c6h c6hVar, yci yciVar, hq5 hq5Var, int i2) {
        float f3;
        o14 o14Var;
        h24 h24Var;
        kjn kjnVar;
        oq5 oq5Var;
        mcuVar.getClass();
        ab0Var.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-731766358);
        int i3 = i2 | (oq5Var2.g(z) ? 4 : 2) | (oq5Var2.f(mcuVar) ? 32 : 16) | (oq5Var2.f(iilVar) ? 256 : 128) | (oq5Var2.h(ab0Var) ? 2048 : 1024) | (oq5Var2.c(f2) ? 16384 : RemoteCameraConfig.Notification.ID) | (oq5Var2.h(c6hVar) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX) | (oq5Var2.f(yciVar) ? 1048576 : 524288);
        if ((599187 & i3) == 599186 && oq5Var2.z()) {
            oq5Var2.S();
            oq5Var = oq5Var2;
        } else {
            sdr b2 = pk0.b(z ? 1.0f : 0.89f, null, "center item", null, oq5Var2, 3072, 22);
            kml kmlVar = iilVar.a;
            cml cmlVar = kmlVar.a;
            wxk wxkVar = cmlVar != null ? (wxk) cmlVar.a : null;
            Object obj = kmlVar.b.a;
            cml cmlVar2 = kmlVar.c;
            o14 o14Var2 = new o14(wxkVar, obj, cmlVar2 != null ? (wxk) cmlVar2.a : null);
            h24 h24Var2 = new h24(f2);
            float f4 = 16;
            boolean h2 = oq5Var2.h(c6hVar);
            Object K = oq5Var2.K();
            kjn kjnVar2 = gq5.a;
            if (h2 || K == kjnVar2) {
                f3 = f4;
                o14Var = o14Var2;
                h24Var = h24Var2;
                kjnVar = kjnVar2;
                mt4 mt4Var = new mt4(1, c6hVar, c6h.class, "onSwipe", "onSwipe(Lcom/yandex/music/shared/design/api/components/SwipeDirection;)V", 0, 26);
                oq5Var2.k0(mt4Var);
                K = mt4Var;
            } else {
                f3 = f4;
                o14Var = o14Var2;
                h24Var = h24Var2;
                kjnVar = kjnVar2;
            }
            yci e2 = d.e(d.d(yciVar, 1.0f), f2);
            Function1 function1 = (Function1) ((h9f) K);
            Object K2 = oq5Var2.K();
            if (K2 == kjnVar) {
                K2 = new cp5(19);
                oq5Var2.k0(K2);
            }
            Function0 function0 = (Function0) K2;
            boolean f5 = oq5Var2.f(b2);
            Object K3 = oq5Var2.K();
            if (f5 || K3 == kjnVar) {
                K3 = new la1(b2, 20);
                oq5Var2.k0(K3);
            }
            oq5Var = oq5Var2;
            zc4.a(ab0Var, o14Var, function1, h24Var, e2, null, function0, (Function0) K3, true, false, 0.0f, false, f3, true, 0.0f, ild.C(-1295968747, new tt5(3, mcuVar), oq5Var2), oq5Var, ((i3 >> 9) & 14) | 102236160, 200064, 20000);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new fn6(z, mcuVar, iilVar, ab0Var, f2, c6hVar, yciVar, i2);
        }
    }

    public static final void g(un6 un6Var, mcu mcuVar, boolean z, yci yciVar, hq5 hq5Var, int i2) {
        float f2;
        mcu mcuVar2;
        aqi aqiVar;
        fk0 fk0Var;
        boolean z2;
        un6Var.getClass();
        mcuVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1869230721);
        int i3 = i2 | (oq5Var.f(un6Var) ? 4 : 2) | (oq5Var.f(mcuVar) ? 32 : 16) | (oq5Var.g(z) ? 256 : 128) | (oq5Var.f(yciVar) ? 2048 : 1024);
        if ((i3 & 1171) == 1170 && oq5Var.z()) {
            oq5Var.S();
            mcuVar2 = mcuVar;
        } else {
            int i4 = i3 & 896;
            int i5 = i3 & 112;
            boolean z3 = (i4 == 256) | (i5 == 32);
            Object K = oq5Var.K();
            Object obj = gq5.a;
            if (z3 || K == obj) {
                int ordinal = v(mcuVar.b(), z).ordinal();
                if (ordinal == 0 || ordinal == 1) {
                    f2 = 1.0f;
                } else {
                    if (ordinal != 2) {
                        b6e.s();
                        return;
                    }
                    f2 = 0.0f;
                }
                K = vq2.a(f2);
                oq5Var.k0(K);
            }
            fk0 fk0Var2 = (fk0) K;
            Object K2 = oq5Var.K();
            if (K2 == obj) {
                K2 = szf.g0(jn6.a);
                oq5Var.k0(K2);
            }
            aqi aqiVar2 = (aqi) K2;
            if (z) {
                oq5Var.Z(2002216132);
                boolean h2 = (i4 == 256) | (i5 == 32) | oq5Var.h(fk0Var2);
                Object K3 = oq5Var.K();
                if (h2 || K3 == obj) {
                    Object ak1Var = new ak1(2, mcuVar, aqiVar2, fk0Var2, null, z);
                    mcuVar2 = mcuVar;
                    aqiVar = aqiVar2;
                    fk0Var = fk0Var2;
                    oq5Var.k0(ak1Var);
                    K3 = ak1Var;
                } else {
                    mcuVar2 = mcuVar;
                    aqiVar = aqiVar2;
                    fk0Var = fk0Var2;
                }
                gld.y(fk0Var, mcuVar2, (Function2) K3, oq5Var);
                z2 = false;
            } else {
                mcuVar2 = mcuVar;
                aqiVar = aqiVar2;
                fk0Var = fk0Var2;
                z2 = false;
                oq5Var.Z(1996971521);
            }
            oq5Var.p(z2);
            kfh d2 = ug3.d(b2c.b, z2);
            int i6 = oq5Var.P;
            androidx.compose.runtime.internal.a l2 = oq5Var.l();
            yci H = vnj.H(oq5Var, yciVar);
            xp5.T.getClass();
            Function0 function0 = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(function0);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, d2, wp5.f);
            g0g.U(oq5Var, l2, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i6))) {
                ouj.x(i6, oq5Var, i6, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            boolean h3 = oq5Var.h(fk0Var);
            Object K4 = oq5Var.K();
            if (h3 || K4 == obj) {
                K4 = new gn6(fk0Var, 0);
                oq5Var.k0(K4);
            }
            vci vciVar = vci.a;
            h4a.g(un6Var, xp3.u(a.d(d.d(wyf.s(vciVar, (Function0) K4), 1.0f), 1.0f), o5g.G(oq5Var)), ild.C(-477240879, new hn6(un6Var, 0), oq5Var), null, oq5Var, (i3 & 14) | 384, 8);
            etn.f(aqiVar.getValue() == jn6.b, b.a.a(a.m(vciVar, 8), b2c.j), c.e(null, 3), c.f(null, 3), null, ild.C(855098207, new in6(fk0Var, 0), oq5Var), oq5Var, 200064, 16);
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new s43((Object) un6Var, (Object) mcuVar2, z, yciVar, i2, 9);
        }
    }

    public static void h(n9b n9bVar, List list) {
        yci n2 = a.n(vci.a, 16, 8);
        n9bVar.getClass();
        n2.getClass();
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return;
        }
        n9bVar.a.a(new wn5(new o68(n2, list), 1117681705, true));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    public static final void i(s7a s7aVar, float f2, Function0 function0, yci yciVar, Function0 function02, hq5 hq5Var, int i2) {
        int i3;
        u9b b0;
        boolean z;
        String str;
        kb5 kb5Var;
        kjn kjnVar;
        kb5 kb5Var2;
        int i4;
        grb grbVar;
        boolean z2;
        kb5 kb5Var3;
        vci vciVar;
        grb grbVar2;
        kb5 kb5Var4;
        kjn kjnVar2;
        int i5;
        ?? r0;
        s7a s7aVar2;
        oq5 oq5Var;
        oq5 oq5Var2;
        Function0 function03 = function0;
        s7aVar.getClass();
        function03.getClass();
        oq5 oq5Var3 = (oq5) hq5Var;
        oq5Var3.b0(-1304923727);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var3.h(s7aVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var3.c(f2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= oq5Var3.h(function03) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= oq5Var3.f(yciVar) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= oq5Var3.h(function02) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        int i6 = i3;
        if ((i6 & 9363) == 9362 && oq5Var3.z()) {
            oq5Var3.S();
            s7aVar2 = s7aVar;
            oq5Var2 = oq5Var3;
        } else {
            yci u = xp3.u(androidx.compose.ui.platform.a.a(yciVar, "donation_card"), o5g.C(oq5Var3));
            Object K = oq5Var3.K();
            int i7 = 13;
            kjn kjnVar3 = gq5.a;
            if (K == kjnVar3) {
                K = new c68(i7);
                oq5Var3.k0(K);
            }
            yci b2 = nfp.b(u, false, (Function1) K);
            nho a2 = lho.a(qx0.a, b2c.l, oq5Var3, 48);
            int i8 = oq5Var3.P;
            androidx.compose.runtime.internal.a l2 = oq5Var3.l();
            yci H = vnj.H(oq5Var3, b2);
            xp5.T.getClass();
            grb grbVar3 = wp5.b;
            oq5Var3.d0();
            if (oq5Var3.O) {
                oq5Var3.k(grbVar3);
            } else {
                oq5Var3.n0();
            }
            kb5 kb5Var5 = wp5.f;
            g0g.U(oq5Var3, a2, kb5Var5);
            kb5 kb5Var6 = wp5.e;
            g0g.U(oq5Var3, l2, kb5Var6);
            kb5 kb5Var7 = wp5.g;
            if (oq5Var3.O || !Intrinsics.d(oq5Var3.K(), Integer.valueOf(i8))) {
                ouj.x(i8, oq5Var3, i8, kb5Var7);
            }
            kb5 kb5Var8 = wp5.d;
            g0g.U(oq5Var3, H, kb5Var8);
            boolean booleanValue = ((Boolean) oq5Var3.j(koe.a)).booleanValue();
            vci vciVar2 = vci.a;
            if (booleanValue) {
                oq5Var3.Z(-900962077);
                ug3.a(androidx.compose.foundation.a.b(d.m(xp3.u(vciVar2, ugo.a), f2), d85.l, vnj.i), oq5Var3, 0);
                oq5Var3.p(false);
                kb5Var3 = kb5Var8;
                vciVar = vciVar2;
                kb5Var2 = kb5Var6;
                r0 = 0;
                grbVar2 = grbVar3;
                kb5Var4 = kb5Var5;
                i5 = i6;
                kjnVar2 = kjnVar3;
            } else {
                oq5Var3.Z(-900736366);
                Integer intOrNull = StringsKt.toIntOrNull(s7aVar.a);
                int intValue = intOrNull != null ? intOrNull.intValue() : 0;
                u9b u9bVar = s7aVar.d;
                if (u9bVar == null) {
                    oq5Var3.Z(-900641445);
                    oq5Var3.p(false);
                    b0 = null;
                } else {
                    oq5Var3.Z(-167600282);
                    b0 = bg3.b0(u9bVar, intValue, !((ma5) oq5Var3.j(pa5.a)).g());
                    oq5Var3.p(false);
                }
                if (b0 == null) {
                    oq5Var3.Z(-167598069);
                    b0 = bg3.W(intValue, "#000000", !((ma5) oq5Var3.j(pa5.a)).g());
                    z = false;
                    oq5Var3.p(false);
                } else {
                    z = false;
                    oq5Var3.Z(-167601138);
                    oq5Var3.p(false);
                }
                String e2 = b0.e(wct.s(), WebPath$Storage.AVATARS);
                String M = rvf.M(R.string.artist, oq5Var3);
                yci m2 = d.m(xp3.u(vciVar2, ugo.a), f2);
                if (function02 == null) {
                    kb5Var2 = kb5Var6;
                    str = e2;
                    kb5Var = kb5Var5;
                    kjnVar = kjnVar3;
                    i4 = 14;
                    grbVar = grbVar3;
                    z2 = z;
                } else {
                    str = e2;
                    kb5Var = kb5Var5;
                    kjnVar = kjnVar3;
                    kb5Var2 = kb5Var6;
                    i4 = 14;
                    grbVar = grbVar3;
                    z2 = z;
                    m2 = m2.f(androidx.compose.foundation.a.e(vciVar2, false, null, null, function02, 7));
                }
                yci a3 = androidx.compose.ui.platform.a.a(m2, "donation_image");
                Object K2 = oq5Var3.K();
                if (K2 == kjnVar) {
                    K2 = new c68(i4);
                    oq5Var3.k0(K2);
                }
                yci b3 = nfp.b(a3, z2, (Function1) K2);
                kb5Var3 = kb5Var8;
                vciVar = vciVar2;
                grbVar2 = grbVar;
                kb5Var4 = kb5Var;
                boolean z3 = z2;
                kjnVar2 = kjnVar;
                i5 = i6;
                p1g.a(str, M, b3, null, null, null, null, 0.0f, null, 0, oq5Var3, 0, 1016);
                oq5Var3.p(z3);
                r0 = z3;
            }
            float f3 = 12;
            u1g.l(oq5Var3, d.r(vciVar, f3));
            Object K3 = oq5Var3.K();
            if (K3 == kjnVar2) {
                K3 = szf.g0(Boolean.FALSE);
                oq5Var3.k0(K3);
            }
            aqi aqiVar = (aqi) K3;
            ta5 a4 = sa5.a(qx0.c, b2c.n, oq5Var3, r0);
            int i9 = oq5Var3.P;
            androidx.compose.runtime.internal.a l3 = oq5Var3.l();
            yci H2 = vnj.H(oq5Var3, vciVar);
            oq5Var3.d0();
            if (oq5Var3.O) {
                oq5Var3.k(grbVar2);
            } else {
                oq5Var3.n0();
            }
            g0g.U(oq5Var3, a4, kb5Var4);
            g0g.U(oq5Var3, l3, kb5Var2);
            if (oq5Var3.O || !Intrinsics.d(oq5Var3.K(), Integer.valueOf(i9))) {
                ouj.x(i9, oq5Var3, i9, kb5Var7);
            }
            g0g.U(oq5Var3, H2, kb5Var3);
            s7aVar2 = s7aVar;
            String str2 = s7aVar2.b;
            ges b4 = nu0.b();
            agr agrVar = eq0.a;
            long j2 = ((dq0) oq5Var3.j(agrVar)).b.a;
            float f4 = 4;
            yci q = a.q(androidx.compose.ui.platform.a.a(vciVar, "donation_artist_name"), f4, 0.0f, 0.0f, 0.0f, 14);
            Object K4 = oq5Var3.K();
            if (K4 == kjnVar2) {
                K4 = new c68(15);
                oq5Var3.k0(K4);
            }
            yci b5 = nfp.b(q, r0, (Function1) K4);
            Object K5 = oq5Var3.K();
            if (K5 == kjnVar2) {
                K5 = new x80(aqiVar, 13);
                oq5Var3.k0(K5);
            }
            xcs.b(str2, b5, j2, 0L, null, 0L, null, null, 0L, 2, false, 2, 0, (Function1) K5, b4, oq5Var3, 0, 199728, 22520);
            oq5 oq5Var4 = oq5Var3;
            String str3 = s7aVar2.c;
            if (str3 == null) {
                oq5Var4.Z(-594464018);
                oq5Var = oq5Var4;
            } else {
                oq5Var4.Z(-594464017);
                u1g.l(oq5Var4, d.e(vciVar, f4));
                ges j3 = nu0.j();
                long j4 = ((dq0) oq5Var4.j(agrVar)).b.b;
                int i10 = ((Boolean) aqiVar.getValue()).booleanValue() ? 2 : 3;
                yci q2 = a.q(androidx.compose.ui.platform.a.a(vciVar, "donation_goal"), f4, 0.0f, 0.0f, 0.0f, 14);
                Object K6 = oq5Var4.K();
                if (K6 == kjnVar2) {
                    K6 = new c68(16);
                    oq5Var4.k0(K6);
                }
                xcs.b(str3, nfp.b(q2, r0, (Function1) K6), j4, 0L, null, 0L, null, null, 0L, 2, false, i10, 0, null, j3, oq5Var4, 0, 48, 55288);
                oq5Var = oq5Var4;
            }
            oq5Var.p(r0);
            u1g.l(oq5Var, d.e(vciVar, f3));
            yci g2 = d.g(androidx.compose.ui.platform.a.a(vciVar, "donation_button"), 30, 0.0f, 2);
            Object K7 = oq5Var.K();
            if (K7 == kjnVar2) {
                K7 = new c68(17);
                oq5Var.k0(K7);
            }
            function03 = function0;
            ild.i(function03, nfp.b(g2, r0, (Function1) K7), oq5Var, (i5 >> 6) & 14);
            oq5Var.p(true);
            oq5Var.p(true);
            oq5Var2 = oq5Var;
        }
        xmn r = oq5Var2.r();
        if (r != null) {
            r.d = new o7a(s7aVar2, f2, function03, yciVar, function02, i2);
        }
    }

    public static final void j(int i2, int i3, hq5 hq5Var, yci yciVar, boolean z) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(82570835);
        int i4 = (oq5Var.g(z) ? 4 : 2) | i2;
        int i5 = i3 & 2;
        if (i5 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= oq5Var.f(yciVar) ? 32 : 16;
        }
        if ((i4 & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
        } else {
            if (i5 != 0) {
                yciVar = vci.a;
            }
            pm0.a(null, ild.C(868228842, new q10(yciVar, z), oq5Var), oq5Var, 48, 1);
        }
        yci yciVar2 = yciVar;
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new n10(z, yciVar2, i2, i3, 3);
        }
    }

    public static final void k(uxa uxaVar, sxa sxaVar, yci yciVar, hq5 hq5Var, int i2) {
        int i3;
        sxaVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1229735058);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var.f(uxaVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? oq5Var.f(sxaVar) : oq5Var.h(sxaVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= oq5Var.f(yciVar) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
        } else {
            oq5Var.Z(659404757);
            float f2 = 12;
            float f3 = 8;
            float f4 = 16;
            yci u = xp3.u(d.g(d.d(y1g.d0(a.n(androidx.compose.ui.platform.a.a(yciVar, "dynamic_toast"), f2, f3), 4, ugo.a(f4), false, 24), 1.0f), 68, 0.0f, 2), ugo.a(f4));
            boolean z = uxaVar.d != null;
            yci yciVar2 = vci.a;
            if (z) {
                boolean z2 = ((i3 & 14) == 4) | ((i3 & 112) == 32 || ((i3 & 64) != 0 && oq5Var.h(sxaVar)));
                Object K = oq5Var.K();
                if (z2 || K == gq5.a) {
                    K = new aw5(29, sxaVar, uxaVar);
                    oq5Var.k0(K);
                }
                yciVar2 = androidx.compose.foundation.a.e(yciVar2, false, null, null, (Function0) K, 7);
            }
            yci f5 = u.f(yciVar2);
            oq5Var.p(false);
            agr agrVar = eq0.a;
            long j2 = ((dq0) oq5Var.j(agrVar)).c.b;
            jzk jzkVar = vnj.i;
            yci p = a.p(c3x.y((float) 0.5d, ((dq0) oq5Var.j(agrVar)).c.c, androidx.compose.foundation.a.b(androidx.compose.foundation.a.b(f5, j2, jzkVar), ((dq0) oq5Var.j(agrVar)).c.c, jzkVar), jzkVar), f3, f3, f2, f3);
            kfh d2 = ug3.d(b2c.e, false);
            int i4 = oq5Var.P;
            androidx.compose.runtime.internal.a l2 = oq5Var.l();
            yci H = vnj.H(oq5Var, p);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, d2, wp5.f);
            g0g.U(oq5Var, l2, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var, i4, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            l(uxaVar.a, uxaVar.b, uxaVar.c, oq5Var, 0);
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new yja(uxaVar, sxaVar, yciVar, i2, 4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void l(String str, String str2, String str3, hq5 hq5Var, int i2) {
        int i3;
        int i4;
        vci vciVar;
        kb5 kb5Var;
        kb5 kb5Var2;
        kb5 kb5Var3;
        grb grbVar;
        kb5 kb5Var4;
        boolean z;
        boolean z2;
        str.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-525509827);
        int i5 = i2 | (oq5Var.f(str) ? 4 : 2) | (oq5Var.f(str2) ? 32 : 16) | (oq5Var.f(str3) ? 256 : 128);
        if ((i5 & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
        } else {
            vci vciVar2 = vci.a;
            yci d2 = d.d(vciVar2, 1.0f);
            nho a2 = lho.a(qx0.a, b2c.l, oq5Var, 48);
            int i6 = oq5Var.P;
            androidx.compose.runtime.internal.a l2 = oq5Var.l();
            yci H = vnj.H(oq5Var, d2);
            xp5.T.getClass();
            grb grbVar2 = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar2);
            } else {
                oq5Var.n0();
            }
            kb5 kb5Var5 = wp5.f;
            g0g.U(oq5Var, a2, kb5Var5);
            kb5 kb5Var6 = wp5.e;
            g0g.U(oq5Var, l2, kb5Var6);
            kb5 kb5Var7 = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i6))) {
                ouj.x(i6, oq5Var, i6, kb5Var7);
            }
            kb5 kb5Var8 = wp5.d;
            g0g.U(oq5Var, H, kb5Var8);
            if (str3 != null) {
                oq5Var.Z(-316483384);
                if (((Boolean) oq5Var.j(koe.a)).booleanValue()) {
                    oq5Var.Z(-316469961);
                    q(0, oq5Var);
                    oq5Var.p(false);
                    i3 = i5;
                    z2 = 0;
                    vciVar = vciVar2;
                    kb5Var = kb5Var6;
                    kb5Var2 = kb5Var8;
                    kb5Var3 = kb5Var7;
                    grbVar = grbVar2;
                    kb5Var4 = kb5Var5;
                } else {
                    oq5Var.Z(-316387284);
                    kb5Var4 = kb5Var5;
                    i3 = i5;
                    grbVar = grbVar2;
                    z2 = 0;
                    vciVar = vciVar2;
                    kb5Var = kb5Var6;
                    kb5Var2 = kb5Var8;
                    kb5Var3 = kb5Var7;
                    w1g.j(str3, null, d.m(vciVar2, 52), null, null, null, null, 0.0f, null, 0, saf.b, oq5Var, ((i5 >> 6) & 14) | 432, 1016);
                    oq5Var.p(false);
                }
                vz1.B(vciVar, 8, oq5Var, z2);
                i4 = z2;
            } else {
                i3 = i5;
                i4 = 0;
                vciVar = vciVar2;
                kb5Var = kb5Var6;
                kb5Var2 = kb5Var8;
                kb5Var3 = kb5Var7;
                grbVar = grbVar2;
                kb5Var4 = kb5Var5;
                oq5Var.Z(-319930615);
                oq5Var.p(false);
            }
            ta5 a3 = sa5.a(qx0.c, b2c.n, oq5Var, i4);
            int i7 = oq5Var.P;
            androidx.compose.runtime.internal.a l3 = oq5Var.l();
            yci H2 = vnj.H(oq5Var, vciVar);
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a3, kb5Var4);
            g0g.U(oq5Var, l3, kb5Var);
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i7))) {
                ouj.x(i7, oq5Var, i7, kb5Var3);
            }
            g0g.U(oq5Var, H2, kb5Var2);
            ges i8 = nu0.i();
            agr agrVar = eq0.a;
            vci vciVar3 = vciVar;
            xcs.b(str, null, ((dq0) oq5Var.j(agrVar)).b.a, 0L, null, 0L, null, null, 0L, 2, false, str2 == null ? 2 : 1, 0, null, i8, oq5Var, i3 & 14, 48, 55290);
            oq5Var = oq5Var;
            if (str2 != null) {
                oq5Var.Z(808596801);
                xcs.b(str2, a.q(vciVar3, 0.0f, 2, 0.0f, 0.0f, 13), ((dq0) oq5Var.j(agrVar)).b.b, 0L, null, 0L, null, null, 0L, 2, false, 2, 0, null, nu0.i(), oq5Var, ((i3 >> 3) & 14) | 48, 3120, 55288);
                oq5Var = oq5Var;
                z = false;
            } else {
                z = false;
                oq5Var.Z(803585279);
            }
            oq5Var.p(z);
            oq5Var.p(true);
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new v48(str, str2, str3, i2, 7);
        }
    }

    public static nmb m() {
        return new nmb(l, new ovn(), new ogp());
    }

    public static final void n(Function0 function0, yci yciVar, boolean z, dup dupVar, zk3 zk3Var, fl3 fl3Var, o0k o0kVar, wn5 wn5Var, hq5 hq5Var, int i2) {
        int i3;
        fl3 fl3Var2;
        int i4;
        o0k o0kVar2;
        oq5 oq5Var;
        fl3 fl3Var3;
        o0k o0kVar3;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-1717924381);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var2.h(function0) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var2.f(yciVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= oq5Var2.g(z) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= oq5Var2.f(dupVar) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= oq5Var2.f(zk3Var) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((196608 & i2) == 0) {
            i3 |= SQLiteDatabase.OPEN_FULLMUTEX;
        }
        int i5 = i3 | 114819072;
        if ((805306368 & i2) == 0) {
            i5 |= oq5Var2.h(wn5Var) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
        }
        if ((306783379 & i5) == 306783378 && oq5Var2.z()) {
            oq5Var2.S();
            fl3Var3 = fl3Var;
            o0kVar3 = o0kVar;
            oq5Var = oq5Var2;
        } else {
            oq5Var2.U();
            if ((i2 & 1) == 0 || oq5Var2.y()) {
                q0k q0kVar = al3.a;
                fl3Var2 = new fl3(hbc.a, hbc.d, hbc.b, hbc.c, 0);
                i4 = i5 & (-458753);
                o0kVar2 = al3.a;
            } else {
                oq5Var2.S();
                i4 = i5 & (-458753);
                fl3Var2 = fl3Var;
                o0kVar2 = o0kVar;
            }
            oq5Var2.q();
            oq5Var = oq5Var2;
            d(function0, yciVar, z, dupVar, zk3Var, fl3Var2, o0kVar2, wn5Var, oq5Var, i4 & 2147483646, 0);
            fl3Var3 = fl3Var2;
            o0kVar3 = o0kVar2;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new il3(function0, yciVar, z, dupVar, zk3Var, fl3Var3, o0kVar3, wn5Var, i2);
        }
    }

    public static final void o(onj onjVar, g40 g40Var, wn5 wn5Var, hq5 hq5Var, int i2) {
        int i3;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(476043083);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? oq5Var.f(onjVar) : oq5Var.h(onjVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var.f(g40Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= oq5Var.h(wn5Var) ? 256 : 128;
        }
        boolean z = false;
        if (oq5Var.P(i3 & 1, (i3 & 147) != 146)) {
            boolean z2 = (i3 & 112) == 32;
            if ((i3 & 14) == 4 || ((i3 & 8) != 0 && oq5Var.f(onjVar))) {
                z = true;
            }
            boolean z3 = z2 | z;
            Object K = oq5Var.K();
            if (z3 || K == gq5.a) {
                K = new yrd(g40Var, onjVar);
                oq5Var.k0(K);
            }
            bi0.a((yrd) K, null, new phm(false, true, true, a9p.a, false), wn5Var, oq5Var, ((i3 << 3) & 7168) | 384, 2);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new ig0(onjVar, g40Var, wn5Var, i2, 1);
        }
    }

    public static final void p(int i2, hq5 hq5Var) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1257244356);
        if (i2 == 0 && oq5Var.z()) {
            oq5Var.S();
        } else {
            int i3 = zae.a;
            oq5Var.a0(-1115894518);
            oq5Var.a0(1886828752);
            if (!(oq5Var.a instanceof mw0)) {
                lxe.v();
                throw null;
            }
            oq5Var.X();
            int i4 = 0;
            if (oq5Var.O) {
                oq5Var.k(new b8w(i4, 13));
            } else {
                oq5Var.n0();
            }
            f1d.u(oq5Var, true, false, false);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new ucs(i2);
        }
    }

    public static final void q(int i2, hq5 hq5Var) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(488683127);
        if (i2 == 0 && oq5Var.z()) {
            oq5Var.S();
        } else {
            pm0.a(null, saf.c, oq5Var, 48, 1);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new rea(i2, 6);
        }
    }

    public static final void r(int i2, xsq xsqVar, hvq hvqVar, ml4 ml4Var, zsq zsqVar, o3k o3kVar, int i3, Function1 function1, hq5 hq5Var, int i4) {
        Object unfVar;
        int i5;
        kjn kjnVar;
        aqi aqiVar;
        int i6;
        boolean z;
        Integer num;
        xsqVar.getClass();
        hvqVar.getClass();
        ml4Var.getClass();
        o3kVar.getClass();
        function1.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-255428782);
        int i7 = i4 | (oq5Var.d(i2) ? 4 : 2) | (oq5Var.f(xsqVar) ? 32 : 16) | (oq5Var.h(hvqVar) ? 256 : 128) | (oq5Var.f(ml4Var) ? 2048 : 1024) | (oq5Var.f(zsqVar) ? 16384 : RemoteCameraConfig.Notification.ID) | (oq5Var.f(o3kVar) ? 131072 : SQLiteDatabase.OPEN_FULLMUTEX) | (oq5Var.d(i3) ? 1048576 : 524288) | (oq5Var.h(function1) ? 8388608 : RemoteCameraConfig.Camera.BITRATE);
        if ((4793491 & i7) == 4793490 && oq5Var.z()) {
            oq5Var.S();
        } else {
            boolean z2 = ((i7 & 14) == 4) | ((i7 & 7168) == 2048);
            Object K = oq5Var.K();
            kjn kjnVar2 = gq5.a;
            if (z2 || K == kjnVar2) {
                K = szf.U(new as7(ml4Var, i2, 2));
                oq5Var.k0(K);
            }
            Boolean bool = (Boolean) ((sdr) K).getValue();
            boolean booleanValue = bool.booleanValue();
            Object K2 = oq5Var.K();
            if (K2 == kjnVar2) {
                K2 = szf.g0(Boolean.FALSE);
                oq5Var.k0(K2);
            }
            aqi aqiVar2 = (aqi) K2;
            Integer valueOf = Integer.valueOf(i3);
            int i8 = i7 & 458752;
            boolean g2 = oq5Var.g(booleanValue) | (i8 == 131072) | ((i7 & 3670016) == 1048576);
            Object K3 = oq5Var.K();
            if (g2 || K3 == kjnVar2) {
                i5 = i8;
                kjnVar = kjnVar2;
                aqiVar = aqiVar2;
                i6 = 8388608;
                z = booleanValue;
                num = valueOf;
                unfVar = new unf(z, o3kVar, i3, aqiVar, null);
                oq5Var.k0(unfVar);
            } else {
                z = booleanValue;
                kjnVar = kjnVar2;
                unfVar = K3;
                aqiVar = aqiVar2;
                num = valueOf;
                i6 = 8388608;
                i5 = i8;
            }
            gld.y(num, bool, (Function2) unfVar, oq5Var);
            Integer valueOf2 = Integer.valueOf(o3kVar.j());
            boolean g3 = ((29360128 & i7) == i6) | oq5Var.g(z) | (i5 == 131072);
            Object K4 = oq5Var.K();
            if (g3 || K4 == kjnVar) {
                boolean z3 = z;
                K4 = new tnf(1, function1, o3kVar, aqiVar, null, z3);
                z = z3;
                oq5Var.k0(K4);
            }
            gld.w(oq5Var, valueOf2, (Function2) K4);
            boolean g4 = oq5Var.g(z);
            Object K5 = oq5Var.K();
            if (g4 || K5 == kjnVar) {
                K5 = new vnf(z, aqiVar, null);
                oq5Var.k0(K5);
            }
            gld.w(oq5Var, bool, (Function2) K5);
            ild.l(i2, xsqVar, hvqVar, zsqVar, ml4Var, bool, oq5Var, (i7 & 1022) | ((i7 >> 3) & 7168) | ((i7 << 3) & 57344), 0);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new fd1(i2, xsqVar, hvqVar, ml4Var, zsqVar, o3kVar, i3, function1, i4);
        }
    }

    public static final void s(onj onjVar, boolean z, i2o i2oVar, boolean z2, long j2, float f2, yci yciVar, hq5 hq5Var, int i2) {
        int i3;
        long j3;
        int i4;
        long j4;
        boolean z3;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-466280168);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? oq5Var.f(onjVar) : oq5Var.h(onjVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var.g(z) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= oq5Var.f(i2oVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= oq5Var.g(z2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= RemoteCameraConfig.Notification.ID;
        }
        if ((1572864 & i2) == 0) {
            i3 |= oq5Var.f(yciVar) ? 1048576 : 524288;
        }
        if (oq5Var.P(i3 & 1, (533651 & i3) != 533650)) {
            oq5Var.U();
            if ((i2 & 1) == 0 || oq5Var.y()) {
                i4 = i3 & (-57345);
                j4 = 9205357640488583168L;
            } else {
                oq5Var.S();
                i4 = i3 & (-57345);
                j4 = j2;
            }
            oq5Var.q();
            if (z) {
                float f3 = pep.a;
                z3 = (i2oVar == i2o.a && !z2) || (i2oVar == i2o.b && z2);
            } else {
                float f4 = pep.a;
                z3 = !((i2oVar == i2o.a && !z2) || (i2oVar == i2o.b && z2));
            }
            fz2 fz2Var = z3 ? pd.b : pd.a;
            int i5 = i4 & 14;
            boolean g2 = ((i4 & 112) == 32) | (i5 == 4 || ((i4 & 8) != 0 && oq5Var.h(onjVar))) | oq5Var.g(z3);
            Object K = oq5Var.K();
            if (g2 || K == gq5.a) {
                K = new ri0(onjVar, z, z3);
                oq5Var.k0(K);
            }
            long j5 = j4;
            fz2 fz2Var2 = fz2Var;
            j3 = j5;
            o(onjVar, fz2Var2, ild.C(1365123137, new pi0((aeu) oq5Var.j(es5.s), j3, z3, nfp.b(yciVar, false, (Function1) K), onjVar), oq5Var), oq5Var, i5 | 384);
        } else {
            oq5Var.S();
            j3 = j2;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new qi0(onjVar, z, i2oVar, z2, j3, f2, yciVar, i2);
        }
    }

    public static final void t(int i2, hq5 hq5Var, yci yciVar, Function0 function0, boolean z) {
        int i3;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(2111672474);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var.f(yciVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        int i4 = i3 | (oq5Var.h(function0) ? 32 : 16) | (oq5Var.g(z) ? 256 : 128);
        if (oq5Var.P(i4 & 1, (i4 & 147) != 146)) {
            u1g.l(oq5Var, vnj.q(d.o(yciVar, pep.a, pep.b), new vi0(function0, z)));
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new si0(function0, yciVar, z, i2);
        }
    }

    public static final void u(Function0 function0, yci yciVar, boolean z, dup dupVar, zk3 zk3Var, o0k o0kVar, wn5 wn5Var, hq5 hq5Var, int i2) {
        zk3 zk3Var2;
        int i3;
        o0k o0kVar2;
        boolean z2;
        dup dupVar2;
        yci yciVar2;
        zk3 zk3Var3;
        yci yciVar3;
        boolean z3;
        dup dupVar3;
        zk3 zk3Var4;
        o0k o0kVar3;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-2106428362);
        int i4 = i2 | (oq5Var.h(function0) ? 4 : 2) | 115025328;
        if ((306783379 & i4) == 306783378 && oq5Var.z()) {
            oq5Var.S();
            yciVar3 = yciVar;
            z3 = z;
            dupVar3 = dupVar;
            zk3Var4 = zk3Var;
            o0kVar3 = o0kVar;
        } else {
            oq5Var.U();
            if ((i2 & 1) == 0 || oq5Var.y()) {
                q0k q0kVar = al3.a;
                dup a2 = jvp.a(5, oq5Var);
                i95 i95Var = (i95) oq5Var.j(j95.a);
                zk3 zk3Var5 = i95Var.L;
                if (zk3Var5 == null) {
                    long j2 = d85.m;
                    zk3Var2 = new zk3(j2, j95.b(i95Var, 26), j2, d85.b(j95.b(i95Var, 18), 0.38f, 0.0f, 0.0f, 0.0f, 14));
                    i95Var.L = zk3Var2;
                } else {
                    zk3Var2 = zk3Var5;
                }
                i3 = i4 & (-64513);
                o0kVar2 = al3.b;
                z2 = true;
                dupVar2 = a2;
                yciVar2 = vci.a;
                zk3Var3 = zk3Var2;
            } else {
                oq5Var.S();
                i3 = i4 & (-64513);
                yciVar2 = yciVar;
                z2 = z;
                dupVar2 = dupVar;
                zk3Var3 = zk3Var;
                o0kVar2 = o0kVar;
            }
            oq5Var.q();
            d(function0, yciVar2, z2, dupVar2, zk3Var3, null, o0kVar2, wn5Var, oq5Var, i3 & 2147483646, 0);
            yciVar3 = yciVar2;
            z3 = z2;
            dupVar3 = dupVar2;
            zk3Var4 = zk3Var3;
            o0kVar3 = o0kVar2;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new jl3(function0, yciVar3, z3, dupVar3, zk3Var4, o0kVar3, wn5Var, i2);
        }
    }

    public static final jn6 v(kcu kcuVar, boolean z) {
        if (!z) {
            return jn6.c;
        }
        int ordinal = kcuVar.ordinal();
        if (ordinal == 0) {
            return jn6.a;
        }
        if (ordinal == 1) {
            return jn6.c;
        }
        if (ordinal == 2) {
            return jn6.b;
        }
        b6e.s();
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0023, code lost:
    
        if (r1 <= r6.getHeight()) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final yg0 w(np3 np3Var, float f2) {
        int ceil = ((int) Math.ceil(f2)) * 2;
        yg0 yg0Var = hld.l;
        ud0 ud0Var = hld.m;
        ou3 ou3Var = hld.n;
        if (yg0Var != null && ud0Var != null) {
            Bitmap bitmap = yg0Var.a;
            if (ceil <= bitmap.getWidth()) {
            }
        }
        yg0Var = xee.o(ceil, ceil, 1);
        hld.l = yg0Var;
        ud0Var = bow.d(yg0Var);
        hld.m = ud0Var;
        yg0 yg0Var2 = yg0Var;
        ud0 ud0Var2 = ud0Var;
        if (ou3Var == null) {
            ou3Var = new ou3();
            hld.n = ou3Var;
        }
        ou3 ou3Var2 = ou3Var;
        nu3 nu3Var = ou3Var2.a;
        xof layoutDirection = np3Var.a.getLayoutDirection();
        Bitmap bitmap2 = yg0Var2.a;
        float width = bitmap2.getWidth();
        float height = bitmap2.getHeight();
        jx7 jx7Var = nu3Var.a;
        xof xofVar = nu3Var.b;
        mu3 mu3Var = nu3Var.c;
        long j2 = nu3Var.d;
        nu3Var.a = np3Var;
        nu3Var.b = layoutDirection;
        nu3Var.c = ud0Var2;
        nu3Var.d = (Float.floatToRawIntBits(width) << 32) | (Float.floatToRawIntBits(height) & 4294967295L);
        ud0Var2.r();
        jpa.B(ou3Var2, d85.b, 0L, ou3Var2.e(), 0.0f, null, 0, 58);
        jpa.B(ou3Var2, c3x.h(4278190080L), 0L, (Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L), 0.0f, null, 0, 120);
        jpa.D0(ou3Var2, c3x.h(4278190080L), f2, (Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L), 0.0f, null, 0, 120);
        ud0Var2.k();
        nu3Var.a = jx7Var;
        nu3Var.b = xofVar;
        nu3Var.c = mu3Var;
        nu3Var.d = j2;
        return yg0Var2;
    }

    public static Bitmap x(byte[] bArr, int i2, int i3) {
        BitmapFactory.Options options;
        int i4 = 0;
        if (i3 != -1) {
            options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr, 0, i2, options);
            options.inJustDecodeBounds = false;
            options.inSampleSize = 1;
            for (int max = Math.max(options.outWidth, options.outHeight); max > i3; max /= 2) {
                options.inSampleSize *= 2;
            }
        } else {
            options = null;
        }
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, i2, options);
        if (options != null) {
            options.inSampleSize = 1;
        }
        if (decodeByteArray == null) {
            throw r7k.a(new IllegalStateException(), "Could not decode image data");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            epb epbVar = new epb(byteArrayInputStream);
            byteArrayInputStream.close();
            switch (epbVar.c()) {
                case 3:
                case 4:
                    i4 = 180;
                    break;
                case 5:
                case 8:
                    i4 = 270;
                    break;
                case 6:
                case 7:
                    i4 = 90;
                    break;
            }
            if (i4 == 0) {
                return decodeByteArray;
            }
            Matrix matrix = new Matrix();
            matrix.postRotate(i4);
            return Bitmap.createBitmap(decodeByteArray, 0, 0, decodeByteArray.getWidth(), decodeByteArray.getHeight(), matrix, false);
        } finally {
        }
    }

    public static final ComponentCallbacks y(o oVar) {
        oVar.getClass();
        o oVar2 = oVar;
        do {
            oVar2 = oVar2.getParentFragment();
            if (oVar2 == null) {
                t l2 = oVar.l();
                if (rsd.class.isInstance(l2)) {
                    l2.getClass();
                    return l2;
                }
                Application application = l2 != null ? l2.getApplication() : null;
                if (rsd.class.isInstance(application)) {
                    application.getClass();
                    return application;
                }
                xq0.x(hrg.r("No ", rsd.class.getSimpleName(), " was found for ", oVar.getClass().getCanonicalName()));
                return null;
            }
        } while (!rsd.class.isInstance(oVar2));
        return oVar2;
    }

    public static long z(int i2, int i3, int i4, int i5) {
        int i6 = 262142;
        int min = Math.min(i4, 262142);
        int min2 = i5 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i5, 262142);
        int i7 = min2 == Integer.MAX_VALUE ? min : min2;
        if (i7 >= 8191) {
            if (i7 < 32767) {
                i6 = 65534;
            } else if (i7 < 65535) {
                i6 = 32766;
            } else {
                if (i7 >= 262143) {
                    ia6.k(i7);
                    rj7.f();
                    return 0L;
                }
                i6 = 8190;
            }
        }
        return ia6.a(Math.min(i6, i2), i3 != Integer.MAX_VALUE ? Math.min(i6, i3) : Integer.MAX_VALUE, min, min2);
    }
}
