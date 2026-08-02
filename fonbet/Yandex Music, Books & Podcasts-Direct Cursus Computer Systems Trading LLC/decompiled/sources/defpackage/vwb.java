package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.WithAlignmentLineElement;
import androidx.compose.foundation.layout.b;
import androidx.compose.foundation.layout.d;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import com.yandex.music.shared.dto.wave.recommendation.IconDto;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.locks.Lock;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;
import ru.yandex.music.data.wave.recommendations.Icon;
import ru.yandex.music.data.wave.recommendations.StationId;
import ru.yandex.video.m3.ui.debug.PreloadState;

/* loaded from: classes4.dex */
public abstract class vwb {
    public static final wu1 a = new wu1("internal:transport-authorization-state");
    public static final wn5 b = new wn5(new go5(24), 647235506, false);
    public static final wn5 c = new wn5(new go5(25), -168811724, false);
    public static final wn5 d = new wn5(new io5(1), 1133041831, false);
    public static final wn5 e = new wn5(new ro5(3), -791250783, false);
    public static final wn5 f;
    public static final wn5 g;
    public static final wn5 h;
    public static final rpa i;
    public static final os2 j;
    public static final i6c k;
    public static final i6c l;
    public static final i6c m;
    public static final i6c n;
    public static final i6c[] o;

    static {
        new wn5(new ro5(4), -1142790917, false);
        f = new wn5(new dp5(0), -1758510321, false);
        g = new wn5(new dp5(1), 360540654, false);
        h = new wn5(new dp5(2), -1929106359, false);
        i = new rpa(15);
        j = new os2(18);
        i6c i6cVar = new i6c("client_side_logging", 1L);
        i6c i6cVar2 = new i6c("cxless_client_minimal", 1L);
        k = i6cVar2;
        i6c i6cVar3 = new i6c("cxless_caf_control", 1L);
        i6c i6cVar4 = new i6c("module_flag_control", 1L);
        l = i6cVar4;
        i6c i6cVar5 = new i6c("discovery_hint_supply", 1L);
        i6c i6cVar6 = new i6c("relay_casting_set_active_account", 1L);
        i6c i6cVar7 = new i6c("analytics_proto_enum_translation", 1L);
        m = i6cVar7;
        i6c i6cVar8 = new i6c("integer_to_integer_map", 1L);
        n = i6cVar8;
        o = new i6c[]{i6cVar, i6cVar2, i6cVar3, i6cVar4, i6cVar5, i6cVar6, i6cVar7, i6cVar8, new i6c("relay_casting_set_remote_casting_mode", 1L), new i6c("get_relay_access_token", 1L), new i6c("get_cast_settings", 1L), new i6c("set_bundle_setting", 1L), new i6c("get_client_updated_info", 1L)};
    }

    public static final void A(rnl rnlVar, v7l v7lVar, qan qanVar, Function0 function0, Function0 function02, Function1 function1, yci yciVar, hq5 hq5Var, int i2) {
        yci yciVar2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-394588294);
        int i3 = (oq5Var.h(function1) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX) | i2 | (oq5Var.f(rnlVar) ? 4 : 2) | (oq5Var.f(v7lVar) ? 32 : 16) | (oq5Var.f(qanVar) ? 256 : 128) | (oq5Var.h(function0) ? 2048 : 1024) | (oq5Var.h(function02) ? 16384 : RemoteCameraConfig.Notification.ID);
        if (oq5Var.P(i3 & 1, (599187 & i3) != 599186)) {
            yciVar2 = yciVar;
            yci d2 = d.d(yciVar2, 1.0f);
            ta5 a2 = sa5.a(qx0.c, b2c.n, oq5Var, 0);
            int i4 = oq5Var.P;
            a l2 = oq5Var.l();
            yci H = vnj.H(oq5Var, d2);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a2, wp5.f);
            g0g.U(oq5Var, l2, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var, i4, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            poi n2 = up6.n(v7lVar.b, oq5Var);
            qan qanVar2 = rnlVar.b;
            p14 p14Var = new p14(qanVar2.a, qanVar2.b, qanVar2.c);
            float f2 = 16;
            float f3 = 8;
            yci g2 = d.g(vci.a, 56, 0.0f, 2);
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (K == kjnVar) {
                K = new s2(28);
                oq5Var.k0(K);
            }
            Function0 function03 = (Function0) K;
            Object K2 = oq5Var.K();
            if (K2 == kjnVar) {
                K2 = new s2(28);
                oq5Var.k0(K2);
            }
            yd5.g(p14Var, function1, g2, function03, (Function0) K2, f2, f3, true, ild.C(375244827, new kt4(qanVar, rnlVar, v7lVar, n2, function02, function0, 0), oq5Var), oq5Var, ((i3 >> 12) & 112) | 115043712, 0);
            oq5Var.p(true);
        } else {
            yciVar2 = yciVar;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new vl1(rnlVar, v7lVar, qanVar, function0, function02, function1, yciVar2, i2, 1);
        }
    }

    public static final void B(yci yciVar, hq5 hq5Var, int i2) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1987011242);
        int i3 = i2 | 6;
        if (oq5Var.P(i3 & 1, (i3 & 3) != 2)) {
            vci vciVar = vci.a;
            u1g.l(oq5Var, androidx.compose.foundation.a.b(d.e(d.d(vciVar, 1.0f), 1), ((dq0) oq5Var.j(eq0.a)).c.b, vnj.i));
            yciVar = vciVar;
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new u71(yciVar, i2, 9);
        }
    }

    public static final void C(dh3 dh3Var, lrp lrpVar, long j2, lkv lkvVar, yci yciVar, hq5 hq5Var, int i2) {
        int i3;
        yci f2;
        oq5 oq5Var;
        yci yciVar2;
        dh3Var.getClass();
        lrpVar.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-1544527172);
        int i4 = 2;
        if ((i2 & 6) == 0) {
            i3 = (oq5Var2.f(dh3Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        int i5 = i3 | (oq5Var2.h(lrpVar) ? 32 : 16);
        if ((i2 & 384) == 0) {
            i5 |= oq5Var2.e(j2) ? 256 : 128;
        }
        int i6 = i5 | (oq5Var2.f(lkvVar) ? 2048 : 1024) | 24576;
        if ((i6 & 9363) == 9362 && oq5Var2.z()) {
            oq5Var2.S();
            yciVar2 = yciVar;
            oq5Var = oq5Var2;
        } else {
            iz2 iz2Var = b2c.i;
            vci vciVar = vci.a;
            yci b2 = androidx.compose.foundation.a.b(d.d(dh3Var.a(vciVar, iz2Var), 1.0f), d85.b(j2, 0.95f, 0.0f, 0.0f, 0.0f, 14), vnj.i);
            b2.getClass();
            f2 = b2.f(new SuspendPointerInputElement(Unit.a, null, null, new dur(new db(i4, 0, null)), 6));
            yci o2 = androidx.compose.foundation.layout.a.o(d.e(gut.a0(nfp.b(f2, false, new u4(5))), h6h.b), lkvVar.a() - v0k.b, 0.0f, 2);
            kfh d2 = ug3.d(b2c.b, false);
            int i7 = oq5Var2.P;
            a l2 = oq5Var2.l();
            yci H = vnj.H(oq5Var2, o2);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var2.d0();
            if (oq5Var2.O) {
                oq5Var2.k(grbVar);
            } else {
                oq5Var2.n0();
            }
            g0g.U(oq5Var2, d2, wp5.f);
            g0g.U(oq5Var2, l2, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i7))) {
                ouj.x(i7, oq5Var2, i7, kb5Var);
            }
            g0g.U(oq5Var2, H, wp5.d);
            oq5Var = oq5Var2;
            trp.i(lrpVar, b.a.a(vciVar, b2c.f), new d85(j2), oq5Var, ((i6 >> 3) & 14) | (i6 & 896), 0);
            oq5Var.p(true);
            yciVar2 = vciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new pb1(dh3Var, lrpVar, j2, lkvVar, yciVar2, i2);
        }
    }

    public static final void D(aqi aqiVar, fvf fvfVar, jub jubVar, Function1 function1, hq5 hq5Var, int i2) {
        int i3;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(658336651);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var.f(aqiVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var.f(fvfVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= oq5Var.h(jubVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= oq5Var.h(function1) ? 2048 : 1024;
        }
        if ((i3 & 1171) == 1170 && oq5Var.z()) {
            oq5Var.S();
        } else {
            Object[] objArr = {aqiVar, fvfVar, jubVar, function1};
            boolean h2 = ((i3 & 14) == 4) | oq5Var.h(jubVar) | ((i3 & 112) == 32) | ((i3 & 7168) == 2048);
            Object K = oq5Var.K();
            if (h2 || K == gq5.a) {
                swb swbVar = new swb(aqiVar, jubVar, fvfVar, function1, null, 0);
                oq5Var.k0(swbVar);
                K = swbVar;
            }
            gld.z(objArr, (Function2) K, oq5Var);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new kvb(aqiVar, fvfVar, jubVar, function1, i2, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void E(klu kluVar, owu owuVar, yci yciVar, e9g e9gVar, hq5 hq5Var, int i2, int i3) {
        int i4;
        yci yciVar2;
        int i5;
        yci yciVar3;
        e9g e9gVar2;
        boolean h2;
        Object K;
        oq5 oq5Var;
        xmn r;
        kluVar.getClass();
        owuVar.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-1582104636);
        if ((i2 & 6) == 0) {
            i4 = (oq5Var2.h(kluVar) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= oq5Var2.h(owuVar) ? 32 : 16;
        }
        int i6 = i3 & 4;
        if (i6 != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            yciVar2 = yciVar;
            i4 |= oq5Var2.f(yciVar2) ? 256 : 128;
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else if ((i2 & 3072) == 0) {
                i4 |= oq5Var2.d(e9gVar == null ? -1 : e9gVar.ordinal()) ? 2048 : 1024;
            }
            if ((i4 & 1171) == 1170 || !oq5Var2.z()) {
                yciVar3 = i6 == 0 ? vci.a : yciVar2;
                e9gVar2 = i5 == 0 ? e9g.b : e9gVar;
                aqi M = gld.M(owuVar.c(), oq5Var2);
                float f2 = 6;
                yci a2 = androidx.compose.ui.platform.a.a(yciVar3, "wave_list_item");
                h2 = oq5Var2.h(owuVar) | oq5Var2.f(M);
                K = oq5Var2.K();
                if (!h2 || K == gq5.a) {
                    K = new zp(owuVar, M, 1);
                    oq5Var2.k0(K);
                }
                oq5Var = oq5Var2;
                ngg.i((Function0) K, a2, ild.C(990029446, new x3(4, e9gVar2, kluVar, M), oq5Var2), false, 0L, null, null, f2, null, ild.C(-1184726113, new q2(3, kluVar), oq5Var2), oq5Var, 819462528, 312);
            } else {
                oq5Var2.S();
                e9gVar2 = e9gVar;
                oq5Var = oq5Var2;
                yciVar3 = yciVar2;
            }
            r = oq5Var.r();
            if (r == null) {
                r.d = new hq(kluVar, owuVar, yciVar3, e9gVar2, i2, i3, 0);
                return;
            }
            return;
        }
        yciVar2 = yciVar;
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        if ((i4 & 1171) == 1170) {
        }
        if (i6 == 0) {
        }
        if (i5 == 0) {
        }
        aqi M2 = gld.M(owuVar.c(), oq5Var2);
        float f22 = 6;
        yci a22 = androidx.compose.ui.platform.a.a(yciVar3, "wave_list_item");
        h2 = oq5Var2.h(owuVar) | oq5Var2.f(M2);
        K = oq5Var2.K();
        if (!h2) {
        }
        K = new zp(owuVar, M2, 1);
        oq5Var2.k0(K);
        oq5Var = oq5Var2;
        ngg.i((Function0) K, a22, ild.C(990029446, new x3(4, e9gVar2, kluVar, M2), oq5Var2), false, 0L, null, null, f22, null, ild.C(-1184726113, new q2(3, kluVar), oq5Var2), oq5Var, 819462528, 312);
        r = oq5Var.r();
        if (r == null) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|23|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object F(fvf fvfVar, Continuation continuation) {
        uwb uwbVar;
        int i2;
        if (continuation instanceof uwb) {
            uwbVar = (uwb) continuation;
            int i3 = uwbVar.k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                uwbVar.k = i3 - Integer.MIN_VALUE;
                Object obj = uwbVar.j;
                Object obj2 = nm6.a;
                i2 = uwbVar.k;
                if (i2 != 0) {
                    qgg.h0(obj);
                    uwbVar.k = 1;
                    apo apoVar = fvf.w;
                    if (fvfVar.f(0, 0, uwbVar) == obj2) {
                        return obj2;
                    }
                } else {
                    if (i2 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            }
        }
        uwbVar = new uwb(continuation);
        Object obj3 = uwbVar.j;
        Object obj22 = nm6.a;
        i2 = uwbVar.k;
        if (i2 != 0) {
        }
        return Unit.a;
    }

    public static final tdk G(sdk sdkVar) {
        sdkVar.getClass();
        tdk tdkVar = sdkVar instanceof tdk ? (tdk) sdkVar : null;
        if (tdkVar != null) {
            return tdkVar;
        }
        wvs.p("Incorrect PaymentApi provided");
        return null;
    }

    public static nb7 H(a0o a0oVar, whn whnVar) {
        return I(a0oVar, ((mu2) a0oVar.b.get(0)).a, whnVar, 0);
    }

    public static nb7 I(a0o a0oVar, String str, whn whnVar, int i2) {
        Map map = Collections.EMPTY_MAP;
        Uri N = p1g.N(str, whnVar.c);
        long j2 = whnVar.a;
        long j3 = whnVar.b;
        String a2 = a0oVar.a();
        if (a2 == null) {
            a2 = p1g.N(((mu2) a0oVar.b.get(0)).a, whnVar.c).toString();
        }
        String str2 = a2;
        vq1.C(N, "The uri must be set.");
        return new nb7(N, 0L, 1, null, vsn.g, j2, j3, str2, i2);
    }

    public static String J(String str) {
        if (str != null) {
            return dxr.j(new dxr(str, (Object) null));
        }
        xq0.x("applicationId cannot be null");
        return null;
    }

    public static void K(boolean z) {
        if (z) {
            return;
        }
        e7o.e();
    }

    public static s33 L(r33 r33Var, Drawable drawable, int i2, int i3) {
        Bitmap bitmap;
        Drawable current = drawable.getCurrent();
        boolean z = false;
        if (current instanceof BitmapDrawable) {
            bitmap = ((BitmapDrawable) current).getBitmap();
        } else if (current instanceof Animatable) {
            bitmap = null;
        } else {
            if (i2 != Integer.MIN_VALUE || current.getIntrinsicWidth() > 0) {
                if (i3 != Integer.MIN_VALUE || current.getIntrinsicHeight() > 0) {
                    if (current.getIntrinsicWidth() > 0) {
                        i2 = current.getIntrinsicWidth();
                    }
                    if (current.getIntrinsicHeight() > 0) {
                        i3 = current.getIntrinsicHeight();
                    }
                    Lock lock = i7t.b;
                    lock.lock();
                    Bitmap t = r33Var.t(i2, i3, Bitmap.Config.ARGB_8888);
                    try {
                        Canvas canvas = new Canvas(t);
                        current.setBounds(0, 0, i2, i3);
                        current.draw(canvas);
                        canvas.setBitmap(null);
                        lock.unlock();
                        bitmap = t;
                        z = true;
                    } catch (Throwable th) {
                        lock.unlock();
                        throw th;
                    }
                } else if (Log.isLoggable("DrawableToBitmap", 5)) {
                    Log.w("DrawableToBitmap", "Unable to draw " + current + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic height");
                }
            } else if (Log.isLoggable("DrawableToBitmap", 5)) {
                Log.w("DrawableToBitmap", "Unable to draw " + current + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic width");
            }
            bitmap = null;
            z = true;
        }
        if (!z) {
            r33Var = i;
        }
        return s33.b(r33Var, bitmap);
    }

    public static Object M(int i2) {
        if (i2 >= 2 && i2 <= 1073741824 && Integer.highestOneBit(i2) == i2) {
            return i2 <= 256 ? new byte[i2] : i2 <= 65536 ? new short[i2] : new int[i2];
        }
        xq0.x(k5r.i(i2, "must be power of 2 between 2^1 and 2^30: "));
        return null;
    }

    public static final int N(tqc tqcVar, int i2) {
        boolean z = tqcVar.compareTo(tqc.g) >= 0;
        boolean z2 = i2 == 1;
        if (z2 && z) {
            return 3;
        }
        if (z) {
            return 1;
        }
        return z2 ? 2 : 0;
    }

    public static Object O(Bundle bundle, Class cls, String str) {
        if (Build.VERSION.SDK_INT >= 34) {
            return rb.v(bundle, cls, str);
        }
        Parcelable parcelable = bundle.getParcelable(str);
        if (cls.isInstance(parcelable)) {
            return parcelable;
        }
        return null;
    }

    public static final void P(Throwable th, CoroutineContext coroutineContext) {
        Throwable runtimeException;
        Iterator it = gm6.a.iterator();
        while (it.hasNext()) {
            try {
                ((fm6) it.next()).N(th);
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    fob.a(runtimeException, th);
                }
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, runtimeException);
            }
        }
        try {
            fob.a(th, new q18(coroutineContext));
        } catch (Throwable unused) {
        }
        Thread currentThread2 = Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }

    public static tk4 Q(jp3 jp3Var, int i2, a0o a0oVar) {
        jp3 jp3Var2;
        yde ydeVar = a0oVar.b;
        whn whnVar = a0oVar.e;
        if (whnVar == null) {
            return null;
        }
        dsc dscVar = a0oVar.a;
        String str = dscVar.m;
        o6m o6mVar = spr.p0;
        r2c jvcVar = (str == null || !(str.startsWith("video/webm") || str.startsWith("audio/webm"))) ? new jvc(o6mVar, 32) : new reh(o6mVar, 2);
        xk3 xk3Var = new xk3(jvcVar, i2, dscVar);
        try {
            whnVar.getClass();
            whn d2 = a0oVar.d();
            if (d2 != null) {
                whn a2 = whnVar.a(d2, ((mu2) ydeVar.get(0)).a);
                if (a2 == null) {
                    jp3Var2 = jp3Var;
                    new hme(jp3Var2, I(a0oVar, ((mu2) ydeVar.get(0)).a, whnVar, 0), a0oVar.a, 0, null, xk3Var).a();
                } else {
                    jp3Var2 = jp3Var;
                    d2 = a2;
                }
                new hme(jp3Var2, I(a0oVar, ((mu2) ydeVar.get(0)).a, d2, 0), a0oVar.a, 0, null, xk3Var).a();
            }
            jvcVar.a();
            return xk3Var.a();
        } catch (Throwable th) {
            xk3Var.a.a();
            throw th;
        }
    }

    public static int R(int i2, int i3, int i4) {
        return (i2 & (~i4)) | (i3 & i4);
    }

    public static final y01 S(String str, mm1 mm1Var, Object obj) {
        str.getClass();
        y01 y01Var = new y01();
        y01Var.setArguments(cxb.K(new Pair("arg.artist_id", str), new Pair("arg.type", mm1Var), new Pair("arg.playback_scope", obj)));
        return y01Var;
    }

    public static final fl1 T(nm1 nm1Var, u51 u51Var, Object obj) {
        fl1 fl1Var = new fl1();
        fl1Var.setArguments(cxb.K(new Pair("arg.tracks_source", nm1Var), new Pair("arg.artist", u51Var), new Pair("arg.playback_scope", obj)));
        return fl1Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
    
        r9 = r6 & r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002d, code lost:
    
        if (r5 != (-1)) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
    
        Y(r1, r9, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        r13[r5] = R(r13[r5], r9, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003b, code lost:
    
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int U(Object obj, Object obj2, int i2, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int J = ltg.J(obj);
        int i3 = J & i2;
        int X = X(i3, obj3);
        if (X != 0) {
            int i4 = ~i2;
            int i5 = J & i4;
            int i6 = -1;
            while (true) {
                int i7 = X - 1;
                int i8 = iArr[i7];
                if ((i8 & i4) != i5 || !hdg.S(obj, objArr[i7]) || (objArr2 != null && !hdg.S(obj2, objArr2[i7]))) {
                    int i9 = i8 & i2;
                    if (i9 == 0) {
                        break;
                    }
                    i6 = i7;
                    X = i9;
                }
            }
        }
        return -1;
    }

    public static final boolean V(xxk xxkVar, qan qanVar) {
        return xxk.a(xxkVar).equals(xxk.a(qanVar.b));
    }

    public static final void W(View view) {
        view.requestFocus();
        view.post(new hd3(view, 1));
    }

    public static int X(int i2, Object obj) {
        return obj instanceof byte[] ? ((byte[]) obj)[i2] & 255 : obj instanceof short[] ? ((short[]) obj)[i2] & 65535 : ((int[]) obj)[i2];
    }

    public static void Y(int i2, int i3, Object obj) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i2] = (byte) i3;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i2] = (short) i3;
        } else {
            ((int[]) obj)[i2] = i3;
        }
    }

    public static final d70 Z(f0f f0fVar, int i2, String str) {
        str.getClass();
        if (f0fVar instanceof yze) {
            String str2 = ((yze) f0fVar).a;
            return new d70(str2, c70.f, str2, i2, str);
        }
        if (f0fVar instanceof wze) {
            u51 u51Var = ((wze) f0fVar).a;
            return new d70(u51Var.a, c70.b, u51Var.b, i2, str);
        }
        if (f0fVar instanceof vze) {
            lt ltVar = ((vze) f0fVar).a;
            return new d70(ltVar.a, c70.a, ltVar.c, i2, str);
        }
        if (f0fVar instanceof xze) {
            zo4 zo4Var = ((xze) f0fVar).a;
            return new d70(zo4Var.a, c70.i, zo4Var.b, i2, str);
        }
        if (f0fVar instanceof zze) {
            lt ltVar2 = ((zze) f0fVar).a;
            return new d70(ltVar2.a, c70.a, ltVar2.c, i2, str);
        }
        if (f0fVar instanceof a0f) {
            eul eulVar = ((a0f) f0fVar).a;
            return new d70(eulVar.f, c70.d, eulVar.c, i2, str);
        }
        if (f0fVar instanceof c0f) {
            mqs mqsVar = ((c0f) f0fVar).a;
            return new d70(mqsVar.a, c70.g, mqsVar.c, i2, str);
        }
        if (f0fVar instanceof d0f) {
            dou douVar = ((d0f) f0fVar).a;
            return new d70(douVar.a, c70.e, douVar.c, i2, str);
        }
        if (f0fVar instanceof e0f) {
            yku ykuVar = ((e0f) f0fVar).a;
            return new d70(StationId.e(ykuVar.a).toString(), c70.e, ykuVar.c, i2, str);
        }
        if (f0fVar instanceof b0f) {
            n7n n7nVar = ((b0f) f0fVar).a;
            return new d70(CollectionsKt.X(n7nVar.c, StringUtils.COMMA, null, null, new mke(24), 30), c70.e, n7nVar.a, i2, str);
        }
        b6e.s();
        return null;
    }

    public static final void a(yci yciVar, hq5 hq5Var, int i2) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(766380554);
        int i3 = (oq5Var.f(yciVar) ? 4 : 2) | i2;
        if (oq5Var.P(i3 & 1, (i3 & 3) != 2)) {
            pm0.a(null, ild.C(778575393, new u71(yciVar, 10), oq5Var), oq5Var, 48, 1);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new u71(yciVar, i2, 11);
        }
    }

    public static final Icon a0(IconDto iconDto) {
        String backgroundColor;
        String imageUrl = iconDto.getImageUrl();
        if (imageUrl != null && (backgroundColor = iconDto.getBackgroundColor()) != null) {
            return new Icon(imageUrl, backgroundColor);
        }
        Icon icon = Icon.a;
        icon.getClass();
        return icon;
    }

    public static final void b(k4k k4kVar, lvf lvfVar, mm1 mm1Var, tmb tmbVar, dib dibVar, Function0 function0, Function0 function02, Function0 function03, Function1 function1, Function1 function12, hq5 hq5Var, int i2) {
        boolean z;
        boolean z2;
        int i3;
        k4kVar.getClass();
        lvfVar.getClass();
        dibVar.getClass();
        function0.getClass();
        function02.getClass();
        function03.getClass();
        function1.getClass();
        function12.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1484002425);
        int i4 = i2 | (oq5Var.f(k4kVar) ? 4 : 2) | (oq5Var.h(lvfVar) ? 32 : 16) | (oq5Var.d(mm1Var.ordinal()) ? 256 : 128) | (oq5Var.h(tmbVar) ? 2048 : 1024) | (oq5Var.h(dibVar) ? 16384 : RemoteCameraConfig.Notification.ID) | (oq5Var.h(function0) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX) | (oq5Var.h(function02) ? 1048576 : 524288) | (oq5Var.h(function03) ? 8388608 : RemoteCameraConfig.Camera.BITRATE) | (oq5Var.h(function1) ? 67108864 : 33554432) | (oq5Var.h(function12) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456);
        if (oq5Var.P(i4 & 1, (i4 & 306783379) != 306783378)) {
            ogp ogpVar = ogp.g;
            boolean z3 = k4kVar.c;
            if (k4kVar.b != null) {
                z2 = false;
                z = true;
            } else {
                z = false;
                z2 = false;
            }
            ogpVar.e(z3, z, null, oq5Var, 4096, 4);
            int ordinal = mm1Var.ordinal();
            if (ordinal == 0) {
                i3 = R.string.all_albums;
            } else if (ordinal == 1) {
                i3 = R.string.all_compilations;
            } else {
                if (ordinal != 2) {
                    b6e.s();
                    return;
                }
                i3 = R.string.discography;
            }
            String M = rvf.M(i3, oq5Var);
            vm C = ghh.C(zs4.g(oq5Var), ogp.A(oq5Var));
            yci c2 = com.yandex.music.core.ui.compose.b.c(androidx.compose.ui.platform.a.a(vci.a, "artist_generic_albums"), "album_type", mm1Var);
            Object K = oq5Var.K();
            if (K == gq5.a) {
                K = new zb0(16);
                oq5Var.k0(K);
            }
            wn5 C2 = ild.C(1259496494, new h11(function1, function12, 0), oq5Var);
            int i5 = lvf.f;
            int i6 = i4 << 3;
            ezf.g(k4kVar, lvfVar, M, dibVar, function0, (Function0) K, function02, function03, tmbVar, c2, C, C2, oq5Var, (i4 & 14) | 1576000 | (i4 & 112) | (i4 & 57344) | (i4 & 458752) | (i6 & 29360128) | (i6 & 234881024) | 1073741824 | ((i4 << 18) & 1879048192), 384);
            oq5Var = oq5Var;
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new i11(k4kVar, lvfVar, mm1Var, tmbVar, dibVar, function0, function02, function03, function1, function12, i2);
        }
    }

    public static final void c(con conVar, xnv xnvVar, vov vovVar, boolean z, hq5 hq5Var, int i2) {
        int i3;
        xnvVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1550950660);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var.h(conVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var.h(xnvVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= oq5Var.h(vovVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= oq5Var.g(z) ? 2048 : 1024;
        }
        if (oq5Var.P(i3 & 1, (i3 & 1171) != 1170)) {
            e(conVar, xnvVar, vovVar.f, ild.C(-634235522, new oc1(conVar, vovVar, z, 6), oq5Var), oq5Var, (i3 & 14) | 3072 | (i3 & 112));
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new pp(conVar, xnvVar, vovVar, z, i2, 5);
        }
    }

    public static final void d(con conVar, xnv xnvVar, uov uovVar, boolean z, hq5 hq5Var, int i2) {
        int i3;
        xnvVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-719514991);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var.h(conVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var.h(xnvVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= (i2 & RemoteCameraConfig.Mic.BUFFER_SIZE) == 0 ? oq5Var.f(uovVar) : oq5Var.h(uovVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= oq5Var.g(z) ? 2048 : 1024;
        }
        if (oq5Var.P(i3 & 1, (i3 & 1171) != 1170)) {
            e(conVar, xnvVar, uovVar.b, ild.C(1501998347, new oc1(conVar, uovVar, z, 7), oq5Var), oq5Var, (i3 & 14) | 3072 | (i3 & 112));
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new pp(conVar, xnvVar, uovVar, z, i2, 6);
        }
    }

    public static final void e(con conVar, xnv xnvVar, plv plvVar, wn5 wn5Var, hq5 hq5Var, int i2) {
        int i3;
        oq5 oq5Var;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-1732653486);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var2.h(conVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var2.h(xnvVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= (i2 & RemoteCameraConfig.Mic.BUFFER_SIZE) == 0 ? oq5Var2.f(plvVar) : oq5Var2.h(plvVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= oq5Var2.h(wn5Var) ? 2048 : 1024;
        }
        int i4 = i3;
        if (oq5Var2.P(i4 & 1, (i4 & 1171) != 1170)) {
            oq5Var = oq5Var2;
            p1g.k(xee.x(conVar.getContext()), o2g.j0(conVar.b), plvVar, false, ild.C(1584695479, new wl(wn5Var, conVar, plvVar, xnvVar, 20), oq5Var2), oq5Var, (i4 & 896) | 24576, 8);
        } else {
            oq5Var = oq5Var2;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new uu(conVar, xnvVar, false, plvVar, wn5Var, i2, 11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void f(tt4 tt4Var, yke ykeVar, yci yciVar, hq5 hq5Var, int i2, int i3) {
        int i4;
        yci yciVar2;
        int i5;
        oq5 oq5Var;
        yci yciVar3;
        xmn r;
        int i6;
        yci yciVar4;
        int i7;
        boolean z;
        tt4Var.getClass();
        ykeVar.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(2105996066);
        if ((i2 & 6) == 0) {
            i4 = ((i2 & 8) == 0 ? oq5Var2.f(tt4Var) : oq5Var2.h(tt4Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= oq5Var2.h(ykeVar) ? 32 : 16;
        }
        int i8 = i3 & 4;
        if (i8 != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            yciVar2 = yciVar;
            i4 |= oq5Var2.f(yciVar2) ? 256 : 128;
            i5 = i4;
            if (oq5Var2.P(i5 & 1, (i5 & 147) == 146)) {
                oq5Var = oq5Var2;
                oq5Var.S();
                yciVar3 = yciVar2;
            } else {
                vci vciVar = vci.a;
                yci yciVar5 = i8 != 0 ? vciVar : yciVar2;
                aqi O = gld.O(tt4Var.c(), oq5Var2);
                jx7 jx7Var = (jx7) oq5Var2.j(es5.h);
                yci d2 = d.d(yciVar5, 1.0f);
                boolean h2 = oq5Var2.h(ykeVar) | oq5Var2.f(jx7Var);
                Object K = oq5Var2.K();
                kjn kjnVar = gq5.a;
                if (h2 || K == kjnVar) {
                    K = new ny2(3, ykeVar, jx7Var);
                    oq5Var2.k0(K);
                }
                Function1 function1 = (Function1) K;
                d2.getClass();
                function1.getClass();
                yci b2 = androidx.compose.ui.layout.a.b(d2, new fdi(0, function1));
                ta5 a2 = sa5.a(qx0.c, b2c.n, oq5Var2, 0);
                int i9 = oq5Var2.P;
                a l2 = oq5Var2.l();
                yci H = vnj.H(oq5Var2, b2);
                xp5.T.getClass();
                grb grbVar = wp5.b;
                oq5Var2.d0();
                if (oq5Var2.O) {
                    oq5Var2.k(grbVar);
                } else {
                    oq5Var2.n0();
                }
                g0g.U(oq5Var2, a2, wp5.f);
                g0g.U(oq5Var2, l2, wp5.e);
                kb5 kb5Var = wp5.g;
                if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i9))) {
                    ouj.x(i9, oq5Var2, i9, kb5Var);
                }
                g0g.U(oq5Var2, H, wp5.d);
                Continuation continuation = null;
                i4w.l(ykeVar, wke.a, null, oq5Var2, (i5 >> 3) & 14);
                vnl vnlVar = (vnl) gld.O(tt4Var.getState(), oq5Var2).getValue();
                if (Intrinsics.d(vnlVar, qnl.a)) {
                    oq5Var2.Z(-78841731);
                    float f2 = 16;
                    a(androidx.compose.foundation.layout.a.q(vciVar, f2, 8, f2, 0.0f, 8), oq5Var2, 0);
                    oq5Var2.p(false);
                    yciVar4 = yciVar5;
                    oq5Var = oq5Var2;
                    z = true;
                } else {
                    if (!(vnlVar instanceof rnl)) {
                        throw vz1.i(oq5Var2, -1388019527, false);
                    }
                    oq5Var2.Z(-78608828);
                    Unit unit = Unit.a;
                    int i10 = i5 & 14;
                    boolean z2 = i10 == 4 || ((i5 & 8) != 0 && oq5Var2.h(tt4Var));
                    Object K2 = oq5Var2.K();
                    if (z2 || K2 == kjnVar) {
                        K2 = new ox1(tt4Var, continuation, 6);
                        oq5Var2.k0(K2);
                    }
                    gld.w(oq5Var2, unit, (Function2) K2);
                    rnl rnlVar = (rnl) vnlVar;
                    v7l v7lVar = (v7l) O.getValue();
                    qan qanVar = rnlVar.b;
                    boolean z3 = i10 == 4 || ((i5 & 8) != 0 && oq5Var2.h(tt4Var));
                    Object K3 = oq5Var2.K();
                    if (z3 || K3 == kjnVar) {
                        i6 = 8;
                        yciVar4 = yciVar5;
                        i7 = i10;
                        ub4 ub4Var = new ub4(0, tt4Var, tt4.class, "onLikeClick", "onLikeClick()V", 0, 8);
                        oq5Var2.k0(ub4Var);
                        K3 = ub4Var;
                    } else {
                        yciVar4 = yciVar5;
                        i6 = 8;
                        i7 = i10;
                    }
                    h9f h9fVar = (h9f) K3;
                    boolean z4 = i7 == 4 || ((i5 & 8) != 0 && oq5Var2.h(tt4Var));
                    Object K4 = oq5Var2.K();
                    if (z4 || K4 == kjnVar) {
                        ub4 ub4Var2 = new ub4(0, tt4Var, tt4.class, "onPlayClick", "onPlayClick()V", 0, 9);
                        oq5Var2.k0(ub4Var2);
                        K4 = ub4Var2;
                    }
                    h9f h9fVar2 = (h9f) K4;
                    boolean z5 = i7 == 4 || ((i5 & 8) != 0 && oq5Var2.h(tt4Var));
                    Object K5 = oq5Var2.K();
                    if (z5 || K5 == kjnVar) {
                        m5 m5Var = new m5(1, tt4Var, tt4.class, "onSwipe", "onSwipe(Lcom/yandex/music/screen/player/ui/components/SwipeDirection;)V", 0, 27);
                        oq5Var2.k0(m5Var);
                        K5 = m5Var;
                    }
                    z = true;
                    A(rnlVar, v7lVar, qanVar, (Function0) h9fVar2, (Function0) h9fVar, (Function1) ((h9f) K5), androidx.compose.foundation.layout.a.q(vciVar, 0.0f, i6, 0.0f, 0.0f, 13), oq5Var2, ScreenMirroringConfig.Video.BITRATE_1_5MB);
                    oq5Var = oq5Var2;
                    oq5Var.p(false);
                }
                oq5Var.p(z);
                yciVar3 = yciVar4;
            }
            r = oq5Var.r();
            if (r == null) {
                r.d = new lx(tt4Var, ykeVar, yciVar3, i2, i3, 3);
                return;
            }
            return;
        }
        yciVar2 = yciVar;
        i5 = i4;
        if (oq5Var2.P(i5 & 1, (i5 & 147) == 146)) {
        }
        r = oq5Var.r();
        if (r == null) {
        }
    }

    public static final void g(int i2, hq5 hq5Var, yci yciVar, String str) {
        String str2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(271592607);
        int i3 = (oq5Var.f(str) ? 4 : 2) | i2 | (oq5Var.f(yciVar) ? 32 : 16);
        if (oq5Var.P(i3 & 1, (i3 & 19) != 18)) {
            yci D = ksw.D(androidx.compose.ui.platform.a.a(d.m(yciVar, 40), "track_cover"), null, null);
            kfh d2 = ug3.d(b2c.f, false);
            int i4 = oq5Var.P;
            a l2 = oq5Var.l();
            yci H = vnj.H(oq5Var, D);
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
            str2 = str;
            irf.y(str2, qo6.a, b.a.b(vci.a), false, false, null, null, null, oq5Var, (i3 & 14) | 48, 248);
            oq5Var.p(true);
        } else {
            str2 = str;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new cb1(str2, yciVar, i2, 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void h(String str, int i2, yci yciVar, hq5 hq5Var, int i3, int i4) {
        yci yciVar2;
        yci yciVar3;
        int i5;
        xmn r;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1462121044);
        int i6 = (oq5Var.f(str) ? 4 : 2) | i3 | (oq5Var.d(i2) ? 32 : 16);
        int i7 = i4 & 4;
        if (i7 != 0) {
            i6 |= 384;
        } else if ((i3 & 384) == 0) {
            yciVar2 = yciVar;
            i6 |= oq5Var.f(yciVar2) ? 256 : 128;
            if ((i6 & 147) == 146 || !oq5Var.z()) {
                vci vciVar = vci.a;
                yciVar3 = i7 == 0 ? vciVar : yciVar2;
                yci z = d.z(yciVar3, 3);
                nho a2 = lho.a(qx0.a, b2c.l, oq5Var, 48);
                i5 = oq5Var.P;
                a l2 = oq5Var.l();
                yci H = vnj.H(oq5Var, z);
                xp5.T.getClass();
                grb grbVar = wp5.b;
                oq5Var.d0();
                if (oq5Var.O) {
                    oq5Var.n0();
                } else {
                    oq5Var.k(grbVar);
                }
                g0g.U(oq5Var, a2, wp5.f);
                g0g.U(oq5Var, l2, wp5.e);
                kb5 kb5Var = wp5.g;
                if (!oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i5))) {
                    ouj.x(i5, oq5Var, i5, kb5Var);
                }
                g0g.U(oq5Var, H, wp5.d);
                w4k E = a0g.E(i2, (i6 >> 3) & 14, oq5Var);
                agr agrVar = eq0.a;
                gae.b(E, null, null, ((dq0) oq5Var.j(agrVar)).d.a, oq5Var, 48, 4);
                xcs.b(str, androidx.compose.foundation.layout.a.q(vciVar, 16, 0.0f, 0.0f, 0.0f, 14), ((dq0) oq5Var.j(agrVar)).b.a, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, nu0.j(), oq5Var, (i6 & 14) | 48, 0, 65528);
                oq5Var = oq5Var;
                oq5Var.p(true);
            } else {
                oq5Var.S();
                yciVar3 = yciVar2;
            }
            r = oq5Var.r();
            if (r == null) {
                r.d = new c56(str, i2, yciVar3, i3, i4);
                return;
            }
            return;
        }
        yciVar2 = yciVar;
        if ((i6 & 147) == 146) {
        }
        vci vciVar2 = vci.a;
        if (i7 == 0) {
        }
        yci z2 = d.z(yciVar3, 3);
        nho a22 = lho.a(qx0.a, b2c.l, oq5Var, 48);
        i5 = oq5Var.P;
        a l22 = oq5Var.l();
        yci H2 = vnj.H(oq5Var, z2);
        xp5.T.getClass();
        grb grbVar2 = wp5.b;
        oq5Var.d0();
        if (oq5Var.O) {
        }
        g0g.U(oq5Var, a22, wp5.f);
        g0g.U(oq5Var, l22, wp5.e);
        kb5 kb5Var2 = wp5.g;
        if (!oq5Var.O) {
        }
        ouj.x(i5, oq5Var, i5, kb5Var2);
        g0g.U(oq5Var, H2, wp5.d);
        w4k E2 = a0g.E(i2, (i6 >> 3) & 14, oq5Var);
        agr agrVar2 = eq0.a;
        gae.b(E2, null, null, ((dq0) oq5Var.j(agrVar2)).d.a, oq5Var, 48, 4);
        xcs.b(str, androidx.compose.foundation.layout.a.q(vciVar2, 16, 0.0f, 0.0f, 0.0f, 14), ((dq0) oq5Var.j(agrVar2)).b.a, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, nu0.j(), oq5Var, (i6 & 14) | 48, 0, 65528);
        oq5Var = oq5Var;
        oq5Var.p(true);
        r = oq5Var.r();
        if (r == null) {
        }
    }

    public static final void i(yci yciVar, hq5 hq5Var, int i2) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1601354151);
        if (((i2 | (oq5Var.f(yciVar) ? 4 : 2)) & 3) == 2 && oq5Var.z()) {
            oq5Var.S();
        } else {
            yci Q = bfg.Q(yciVar, bfg.C(oq5Var), false, 14);
            ta5 a2 = sa5.a(qx0.c, b2c.n, oq5Var, 0);
            int i3 = oq5Var.P;
            a l2 = oq5Var.l();
            yci H = vnj.H(oq5Var, Q);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a2, wp5.f);
            g0g.U(oq5Var, l2, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var, i3, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            vci vciVar = vci.a;
            yci p1 = gut.p1(vciVar);
            gz2 gz2Var = b2c.o;
            irf.r(a0g.E(2131231910, 0, oq5Var), null, p1.f(new HorizontalAlignElement(gz2Var)), null, null, 0.0f, null, oq5Var, 48, 120);
            yci q = androidx.compose.foundation.layout.a.q(new HorizontalAlignElement(gz2Var), 0.0f, 12, 0.0f, 0.0f, 13);
            String M = rvf.M(R.string.payment_succeed_title, oq5Var);
            ges j2 = nu0.j();
            agr agrVar = eq0.a;
            xcs.b(M, q, ((dq0) oq5Var.j(agrVar)).b.a, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, j2, oq5Var, 0, 0, 65528);
            float f2 = 16;
            xcs.b(rvf.M(R.string.payment_succeed_msg, oq5Var), androidx.compose.foundation.layout.a.q(androidx.compose.foundation.layout.a.o(new HorizontalAlignElement(gz2Var), f2, 0.0f, 2), 0.0f, 8, 0.0f, 0.0f, 13), ((dq0) oq5Var.j(agrVar)).b.a, 0L, null, 0L, null, new o9s(3), 0L, 0, false, 0, 0, null, nu0.i(), oq5Var, 0, 0, 65016);
            xv7.k(androidx.compose.foundation.layout.a.o(d.d(vciVar, 1.0f), 0.0f, f2, 1), ((dq0) oq5Var.j(agrVar)).c.c, 1, 0.0f, oq5Var, 390, 8);
            oq5Var = oq5Var;
            h(rvf.M(R.string.with_subscription_phonoteka, oq5Var), R.drawable.ic_benefits_any_track_40, null, oq5Var, 0, 4);
            h(rvf.M(R.string.with_subscription_offline, oq5Var), R.drawable.ic_benefits_downloading_40, androidx.compose.foundation.layout.a.q(vciVar, 0.0f, f2, 0.0f, 0.0f, 13), oq5Var, 384, 0);
            h(rvf.M(R.string.with_subscription_hq, oq5Var), R.drawable.ic_benefits_hq_40, androidx.compose.foundation.layout.a.q(vciVar, 0.0f, f2, 0.0f, 0.0f, 13), oq5Var, 384, 0);
            h(rvf.M(R.string.with_subscription_no_ad, oq5Var), R.drawable.ic_benefits_no_ad_40, androidx.compose.foundation.layout.a.q(vciVar, 0.0f, f2, 0.0f, 0.0f, 13), oq5Var, 384, 0);
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new u71(yciVar, i2, 20);
        }
    }

    public static final void j(final xnv xnvVar, final con conVar, final float f2, final float f3, final ukd ukdVar, final plv plvVar, hq5 hq5Var, final int i2) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1257205863);
        int i3 = i2 | (oq5Var.h(xnvVar) ? 4 : 2) | (oq5Var.h(conVar) ? 32 : 16) | (oq5Var.c(f2) ? 256 : 128) | (oq5Var.c(f3) ? 2048 : 1024) | (oq5Var.f(ukdVar) ? 16384 : RemoteCameraConfig.Notification.ID) | (oq5Var.f(plvVar) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX);
        if (oq5Var.P(i3 & 1, (74899 & i3) != 74898)) {
            final int min = Math.min((int) (f3 / f2), 5);
            y1g.l(ukdVar, 0, 0, ild.C(-360697859, new pyc() { // from class: nz2
                @Override // defpackage.pyc
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    oq5 oq5Var2;
                    hq5 hq5Var2 = (hq5) obj2;
                    ((Integer) obj3).getClass();
                    ((pho) obj).getClass();
                    int i4 = 0;
                    while (true) {
                        int i5 = min;
                        if (i4 >= i5) {
                            return Unit.a;
                        }
                        wnv wnvVar = (wnv) CollectionsKt.S(xnvVar.a, i4);
                        float f4 = f2;
                        vwb.l(i4, wnvVar, conVar, o5g.I(new yov(new n38(f4)), f4), plvVar, hq5Var2, 0);
                        if (i4 != i5 - 1) {
                            oq5Var2 = (oq5) hq5Var2;
                            oq5Var2.Z(1482945796);
                            p1g.o(pho.a(), oq5Var2, 0);
                        } else {
                            oq5Var2 = (oq5) hq5Var2;
                            oq5Var2.Z(1477430741);
                        }
                        oq5Var2.p(false);
                        i4++;
                    }
                }
            }, oq5Var), oq5Var, ((i3 >> 12) & 14) | 3072, 6);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new Function2(conVar, f2, f3, ukdVar, plvVar, i2) { // from class: oz2
                public final /* synthetic */ con b;
                public final /* synthetic */ float c;
                public final /* synthetic */ float d;
                public final /* synthetic */ ukd e;
                public final /* synthetic */ plv f;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int R = rvf.R(1);
                    vwb.j(xnv.this, this.b, this.c, this.d, this.e, this.f, (hq5) obj, R);
                    return Unit.a;
                }
            };
        }
    }

    public static final void k(boolean z, Function0 function0, Function0 function02, Function0 function03, hq5 hq5Var, int i2) {
        oq5 oq5Var;
        boolean z2;
        function0.getClass();
        function02.getClass();
        function03.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(792002134);
        int i3 = i2 | (oq5Var2.g(z) ? 4 : 2) | (oq5Var2.h(function0) ? 32 : 16) | (oq5Var2.h(function02) ? 256 : 128) | (oq5Var2.h(function03) ? 2048 : 1024);
        if (oq5Var2.P(i3 & 1, (i3 & 1171) != 1170)) {
            if (z) {
                oq5Var2.Z(-2014553998);
                yci a2 = androidx.compose.ui.platform.a.a(vci.a, "disable_auto_cache_dialog");
                boolean z3 = (i3 & 7168) == 2048;
                Object K = oq5Var2.K();
                if (z3 || K == gq5.a) {
                    K = new or(15, function03);
                    oq5Var2.k0(K);
                }
                z2 = false;
                up6.b((Function0) K, ild.C(-1529831005, new zk(16, function0), oq5Var2), a2, ild.C(1949089061, new zk(17, function02), oq5Var2), d, null, 0L, 0L, null, oq5Var2, 200112, 976);
                oq5Var = oq5Var2;
            } else {
                oq5Var = oq5Var2;
                z2 = false;
                oq5Var.Z(-2015182740);
            }
            oq5Var.p(z2);
        } else {
            oq5Var = oq5Var2;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new s43(z, function0, function02, function03, i2, 10);
        }
    }

    public static final void l(int i2, wnv wnvVar, con conVar, ukd ukdVar, plv plvVar, hq5 hq5Var, int i3) {
        plv plvVar2;
        ukd ukdVar2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-619407394);
        int i4 = (oq5Var.d(i2) ? 4 : 2) | i3 | (oq5Var.h(wnvVar) ? 32 : 16) | (oq5Var.h(conVar) ? 256 : 128) | (oq5Var.f(ukdVar) ? 2048 : 1024) | (oq5Var.f(plvVar) ? 16384 : RemoteCameraConfig.Notification.ID);
        if (oq5Var.P(i4 & 1, (i4 & 9363) != 9362)) {
            int i5 = i4 >> 6;
            p1g.j(conVar.b() / 2, ukdVar, plvVar, false, ild.C(243628958, new z2(wnvVar, i2, plvVar, 8), oq5Var), oq5Var, (i5 & 112) | 24576 | (i5 & 896));
            ukdVar2 = ukdVar;
            plvVar2 = plvVar;
        } else {
            plvVar2 = plvVar;
            ukdVar2 = ukdVar;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new uu(i2, wnvVar, conVar, ukdVar2, plvVar2, i3);
        }
    }

    public static final void m(e2o e2oVar, yci yciVar, hq5 hq5Var, int i2) {
        e2oVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1543535555);
        int i3 = i2 | (oq5Var.f(e2oVar) ? 4 : 2) | (oq5Var.f(yciVar) ? 32 : 16);
        if ((i3 & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
        } else {
            Object K = oq5Var.K();
            Object obj = gq5.a;
            if (K == obj) {
                K = tlm.f(gld.R(g.a, oq5Var), oq5Var);
            }
            mm6 mm6Var = ((fs5) K).a;
            int i4 = 6;
            sdr b2 = pk0.b(e2oVar.g.e() > 0.01f ? 0.0f : 1.0f, weo.S(200, 0, null, 6), "learn_more_alpha", null, oq5Var, 3120, 20);
            hz2 hz2Var = b2c.l;
            boolean f2 = oq5Var.f(b2);
            Object K2 = oq5Var.K();
            if (f2 || K2 == obj) {
                K2 = new xp(b2, i4);
                oq5Var.k0(K2);
            }
            yci a2 = androidx.compose.ui.graphics.a.a(yciVar, (Function1) K2);
            boolean z = ((Number) b2.getValue()).floatValue() > 0.01f;
            boolean h2 = oq5Var.h(mm6Var) | ((i3 & 14) == 4);
            Object K3 = oq5Var.K();
            if (h2 || K3 == obj) {
                K3 = new aw5(28, mm6Var, e2oVar);
                oq5Var.k0(K3);
            }
            yci e2 = androidx.compose.foundation.a.e(a2, z, null, null, (Function0) K3, 6);
            nho a3 = lho.a(qx0.a, hz2Var, oq5Var, 48);
            int i5 = oq5Var.P;
            a l2 = oq5Var.l();
            yci H = vnj.H(oq5Var, e2);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a3, wp5.f);
            g0g.U(oq5Var, l2, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i5))) {
                ouj.x(i5, oq5Var, i5, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            qs5 qs5Var = ywa.a;
            lwa lwaVar = ((xwa) oq5Var.j(qs5Var)).c;
            String M = rvf.M(R.string.dynamic_overlay_learn_more, oq5Var);
            ges gesVar = gdg.F(oq5Var).f;
            agr agrVar = eq0.a;
            xcs.b(M, null, ((dq0) oq5Var.j(agrVar)).b.b, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, gesVar, oq5Var, 0, 0, 65530);
            rva rvaVar = ((xwa) oq5Var.j(qs5Var)).b;
            gae.b(a0g.E(R.drawable.ic_arrow_mid_up_24, 0, oq5Var), null, d.m(androidx.compose.foundation.layout.a.q(vci.a, 5, 0.0f, 0.0f, 0.0f, 14), 16), ((dq0) oq5Var.j(agrVar)).b.b, oq5Var, 432, 0);
            oq5Var = oq5Var;
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new kw5(e2oVar, yciVar, i2, 25);
        }
    }

    public static final void n(String str, Integer num, Integer num2, PreloadState preloadState, mmq mmqVar, pi3 pi3Var, boolean z, List list, yci yciVar, hq5 hq5Var, int i2) {
        yci yciVar2;
        list.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1823947856);
        int i3 = i2 | (oq5Var.f(str) ? 4 : 2) | (oq5Var.f(num) ? 32 : 16) | (oq5Var.f(num2) ? 256 : 128) | (oq5Var.f(preloadState) ? 2048 : 1024) | (oq5Var.f(mmqVar) ? 16384 : RemoteCameraConfig.Notification.ID) | (oq5Var.f(pi3Var) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX) | (oq5Var.g(z) ? 1048576 : 524288) | (oq5Var.h(list) ? 8388608 : RemoteCameraConfig.Camera.BITRATE) | 100663296;
        if ((38347923 & i3) == 38347922 && oq5Var.z()) {
            oq5Var.S();
            yciVar2 = yciVar;
        } else {
            x2i x2iVar = qx0.a;
            oq5Var.a0(-862651793);
            u3r u3rVar = (u3r) oq5Var.j(bfs.c);
            oq5Var.p(false);
            nx0 g2 = qx0.g(u3rVar.b);
            oq5Var.a0(693286680);
            nho a2 = lho.a(g2, b2c.k, oq5Var, 0);
            oq5Var.a0(-1323940314);
            int i4 = oq5Var.P;
            a l2 = oq5Var.l();
            xp5.T.getClass();
            grb grbVar = wp5.b;
            vci vciVar = vci.a;
            wn5 A = ghh.A(vciVar);
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a2, wp5.f);
            g0g.U(oq5Var, l2, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var, i4, kb5Var);
            }
            A.invoke(new lrq(oq5Var), oq5Var, 0);
            oq5Var.a0(2058660585);
            int i5 = (i3 << 3) & 112;
            int i6 = i3 >> 9;
            int i7 = i6 & 7168;
            h4a.i(Integer.valueOf(R.string.epsilonUuid), str, d.r(vciVar, ((cma) list.get(0)).a), z, vut.I(oq5Var).b, vut.I(oq5Var).c, oq5Var, i5 | i7, 0);
            h4a.i(Integer.valueOf(R.string.epsilonPlayerIndex), num, d.r(vciVar, ((cma) list.get(1)).a), z, vut.I(oq5Var).d, vut.I(oq5Var).e, oq5Var, (i3 & 112) | i7, 0);
            h4a.i(Integer.valueOf(R.string.epsilonEngineIndex), num2, d.r(vciVar, ((cma) list.get(2)).a), z, vut.I(oq5Var).f, vut.I(oq5Var).g, oq5Var, ((i3 >> 3) & 112) | i7, 0);
            h4a.i(Integer.valueOf(R.string.epsilonPreloadState), preloadState, d.r(vciVar, ((cma) list.get(3)).a), z, vut.I(oq5Var).h, vut.I(oq5Var).i, oq5Var, ((i3 >> 6) & 112) | i7, 0);
            h4a.i(Integer.valueOf(R.string.epsilonCurrentQuality), mmqVar, d.r(vciVar, ((cma) list.get(4)).a), z, vut.I(oq5Var).j, vut.I(oq5Var).k, oq5Var, i6 & 7280, 0);
            h4a.i(Integer.valueOf(R.string.epsilonCurrentBufferSize), pi3Var != null ? String.format(Locale.US, "%.1f", Arrays.copyOf(new Object[]{Float.valueOf(pi3Var.b / 1000.0f)}, 1)).concat("s") : null, d.r(vciVar, ((cma) list.get(5)).a), z, vut.I(oq5Var).l, vut.I(oq5Var).m, oq5Var, i7, 0);
            k5r.s(oq5Var, false, true, false, false);
            yciVar2 = vciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new neb(str, num, num2, preloadState, mmqVar, pi3Var, z, list, yciVar2, i2);
        }
    }

    public static final void o(ptb ptbVar, jub jubVar, hq5 hq5Var, int i2) {
        boolean z;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1307494368);
        if ((((oq5Var.d(ptbVar.ordinal()) ? 4 : 2) | i2 | (oq5Var.h(jubVar) ? 32 : 16)) & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
        } else {
            int ordinal = ptbVar.ordinal();
            if (ordinal != 0) {
                z = true;
                if (ordinal != 1) {
                    b6e.s();
                    return;
                }
            } else {
                z = false;
            }
            boolean h2 = oq5Var.h(jubVar);
            Object K = oq5Var.K();
            if (h2 || K == gq5.a) {
                K = new dub(jubVar, 2);
                oq5Var.k0(K);
            }
            pd.c(0, 0, oq5Var, (Function0) K, z);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new svb(ptbVar, jubVar, i2, 0);
        }
    }

    public static final void p(final fvf fvfVar, final xit xitVar, sdr sdrVar, final aqi aqiVar, final ab0 ab0Var, final c6h c6hVar, final sdr sdrVar2, final hvb hvbVar, final pcu pcuVar, final sdr sdrVar3, jub jubVar, final List list, Function1 function1, final wn5 wn5Var, yci yciVar, hq5 hq5Var, int i2) {
        hvb hvbVar2;
        jub jubVar2;
        boolean z;
        yci yciVar2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1024578015);
        int i3 = i2 | (oq5Var.f(fvfVar) ? 4 : 2) | (oq5Var.f(xitVar) ? 32 : 16) | (oq5Var.f(sdrVar) ? 256 : 128) | (oq5Var.f(aqiVar) ? 2048 : 1024) | (oq5Var.h(ab0Var) ? 16384 : RemoteCameraConfig.Notification.ID) | (oq5Var.h(c6hVar) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX) | (oq5Var.f(sdrVar2) ? 1048576 : 524288) | (oq5Var.f(hvbVar) ? 8388608 : RemoteCameraConfig.Camera.BITRATE) | (oq5Var.f(pcuVar) ? 67108864 : 33554432) | (oq5Var.f(sdrVar3) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456);
        int i4 = (oq5Var.h(jubVar) ? 4 : 2) | (oq5Var.f(list) ? 32 : 16) | (oq5Var.h(function1) ? 256 : 128) | (oq5Var.h(wn5Var) ? 2048 : 1024) | 24576;
        if ((i3 & 306783379) == 306783378 && (i4 & 9363) == 9362 && oq5Var.z()) {
            oq5Var.S();
            yciVar2 = yciVar;
            jubVar2 = jubVar;
            hvbVar2 = hvbVar;
        } else {
            final aqi O = gld.O(jubVar.n, oq5Var);
            boolean h2 = oq5Var.h(jubVar);
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (h2 || K == kjnVar) {
                K = new jvb(jubVar, 0);
                oq5Var.k0(K);
            }
            int i5 = i3 & 14;
            nt0.o(fvfVar, O, (Function1) K, oq5Var, i5);
            D(O, fvfVar, jubVar, function1, oq5Var, ((i4 << 6) & 896) | ((i3 << 3) & 112) | ((i4 << 3) & 7168));
            int i6 = i3 >> 21;
            t(fvfVar, pcuVar, sdrVar3, aqiVar, jubVar, oq5Var, (i6 & 896) | (i6 & 112) | i5 | (i3 & 7168) | ((i4 << 12) & 57344));
            boolean h3 = (i5 == 4) | oq5Var.h(jubVar);
            Object K2 = oq5Var.K();
            Continuation continuation = null;
            if (h3 || K2 == kjnVar) {
                K2 = new awb(fvfVar, jubVar, continuation, 0);
                oq5Var.k0(K2);
            }
            gld.w(oq5Var, fvfVar, (Function2) K2);
            final List list2 = ((mtb) O.getValue()).a;
            final boolean z2 = ((mtb) O.getValue()).b;
            Object K3 = oq5Var.K();
            if (K3 == kjnVar) {
                K3 = szf.U(new pvb(hvbVar, sdrVar, 0));
                oq5Var.k0(K3);
            }
            final sdr sdrVar4 = (sdr) K3;
            boolean z3 = ((1879048192 & i3) == 536870912) | (i5 == 4);
            Object K4 = oq5Var.K();
            if (z3 || K4 == kjnVar) {
                K4 = new cwb(sdrVar3, fvfVar, null, 0);
                oq5Var.k0(K4);
            }
            gld.w(oq5Var, sdrVar3, (Function2) K4);
            Object K5 = oq5Var.K();
            if (K5 == kjnVar) {
                K5 = szf.U(new xtb(sdrVar3, 1));
                oq5Var.k0(K5);
            }
            final sdr sdrVar5 = (sdr) K5;
            boolean z4 = ((Boolean) sdrVar5.getValue()).booleanValue() && (hvbVar instanceof gvb);
            vci vciVar = vci.a;
            yci c2 = d.c(vciVar, 1.0f);
            kfh d2 = ug3.d(b2c.b, false);
            int i7 = oq5Var.P;
            a l2 = oq5Var.l();
            yci H = vnj.H(oq5Var, c2);
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
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i7))) {
                ouj.x(i7, oq5Var, i7, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            Boolean valueOf = Boolean.valueOf(z4);
            Object K6 = oq5Var.K();
            if (K6 == kjnVar) {
                K6 = new dcb(25);
                oq5Var.k0(K6);
            }
            hvbVar2 = hvbVar;
            ot0.l(valueOf, (Function1) K6, null, p6h.a, null, false, ild.C(-970647518, new pyc() { // from class: uvb
                @Override // defpackage.pyc
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    Object wvbVar;
                    boolean z5;
                    float f2;
                    boolean booleanValue = ((Boolean) obj).booleanValue();
                    hq5 hq5Var2 = (hq5) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    if ((intValue & 6) == 0) {
                        intValue |= ((oq5) hq5Var2).g(booleanValue) ? 4 : 2;
                    }
                    if ((intValue & 19) == 18) {
                        oq5 oq5Var2 = (oq5) hq5Var2;
                        if (oq5Var2.z()) {
                            oq5Var2.S();
                            return Unit.a;
                        }
                    }
                    vci vciVar2 = vci.a;
                    hvb hvbVar3 = hvb.this;
                    aqi aqiVar2 = aqiVar;
                    sdr sdrVar6 = sdrVar3;
                    c6h c6hVar2 = c6hVar;
                    if (booleanValue && (hvbVar3 instanceof gvb)) {
                        oq5 oq5Var3 = (oq5) hq5Var2;
                        oq5Var3.Z(1454747907);
                        b2h b2 = d2h.b((gvb) hvbVar3, tt0.F(oq5Var3), oq5Var3);
                        yci c3 = d.c(vciVar2, 1.0f);
                        float f3 = ivb.a;
                        if (hvbVar3 instanceof fvb) {
                            oq5Var3.Z(-784339612);
                            oq5Var3.p(false);
                            f2 = 0;
                        } else {
                            oq5Var3.Z(-784341017);
                            float j2 = qt4.j(oq5Var3);
                            WeakHashMap weakHashMap = rqv.w;
                            f2 = p6g.n(z7l.h(oq5Var3).e, oq5Var3).a() + j2;
                            oq5Var3.p(false);
                        }
                        y2h.e(aqiVar2, sdrVar6, b2, c6hVar2, androidx.compose.foundation.layout.a.q(c3, 0.0f, ivb.a(hvbVar3) + tt0.F(oq5Var3), 0.0f, f2, 5), oq5Var3, 0);
                        oq5Var3.p(false);
                    } else {
                        oq5 oq5Var4 = (oq5) hq5Var2;
                        oq5Var4.Z(1455585868);
                        gvb gvbVar = hvbVar3 instanceof gvb ? (gvb) hvbVar3 : null;
                        cma cmaVar = gvbVar != null ? new cma(gvbVar.c()) : null;
                        ox0 ox0Var = (ox0) sdrVar4.getValue();
                        gz2 gz2Var = b2c.o;
                        boolean z6 = !((Boolean) sdrVar5.getValue()).booleanValue();
                        yci c4 = d.c(vciVar2, 1.0f);
                        boolean f4 = oq5Var4.f(sdrVar6) | oq5Var4.f(aqiVar2) | oq5Var4.h(c6hVar2);
                        pcu pcuVar2 = pcuVar;
                        boolean h4 = f4 | oq5Var4.h(pcuVar2);
                        sdr sdrVar7 = sdrVar2;
                        boolean f5 = h4 | oq5Var4.f(sdrVar7);
                        ab0 ab0Var2 = ab0Var;
                        boolean h5 = f5 | oq5Var4.h(ab0Var2) | oq5Var4.f(hvbVar3);
                        List list3 = list2;
                        boolean f6 = h5 | oq5Var4.f(list3);
                        List list4 = list;
                        boolean f7 = f6 | oq5Var4.f(list4) | oq5Var4.f(cmaVar);
                        boolean z7 = z2;
                        boolean g2 = f7 | oq5Var4.g(z7);
                        wn5 wn5Var2 = wn5Var;
                        boolean f8 = g2 | oq5Var4.f(wn5Var2);
                        aqi aqiVar3 = O;
                        boolean f9 = f8 | oq5Var4.f(aqiVar3);
                        Object K7 = oq5Var4.K();
                        if (f9 || K7 == gq5.a) {
                            z5 = false;
                            wvbVar = new wvb(list3, sdrVar6, aqiVar2, c6hVar2, pcuVar2, sdrVar7, ab0Var2, hvbVar3, list4, cmaVar, z7, wn5Var2, aqiVar3, 0);
                            oq5Var4.k0(wvbVar);
                        } else {
                            wvbVar = K7;
                            z5 = false;
                        }
                        weo.g(c4, fvfVar, xitVar, ox0Var, gz2Var, null, z6, (Function1) wvbVar, oq5Var4, 196614, 72);
                        oq5Var4.p(z5);
                    }
                    return Unit.a;
                }
            }, oq5Var), oq5Var, 1575984, 52);
            oq5Var = oq5Var;
            if (hvbVar2 instanceof fvb) {
                oq5Var.Z(2020070284);
                jubVar2 = jubVar;
                boolean f2 = oq5Var.f(jubVar2);
                Object K7 = oq5Var.K();
                if (f2 || K7 == kjnVar) {
                    K7 = (lrp) jubVar2.p.getValue();
                    oq5Var.k0(K7);
                }
                C(b.a, (lrp) K7, ((d85) sdrVar2.getValue()).a, ((fvb) hvbVar2).e, null, oq5Var, 6);
                oq5Var = oq5Var;
                z = false;
            } else {
                jubVar2 = jubVar;
                z = false;
                oq5Var.Z(1994227165);
            }
            oq5Var.p(z);
            oq5Var.p(true);
            yciVar2 = vciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new vvb(fvfVar, xitVar, sdrVar, aqiVar, ab0Var, c6hVar, sdrVar2, hvbVar2, pcuVar, sdrVar3, jubVar2, list, function1, wn5Var, yciVar2, i2, 0);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x0267, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r5.K(), java.lang.Integer.valueOf(r6)) == false) goto L91;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r13v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void q(sdr sdrVar, jub jubVar, st4 st4Var, float f2, hvb hvbVar, ab0 ab0Var, f83 f83Var, List list, Function1 function1, wn5 wn5Var, yci yciVar, hq5 hq5Var, int i2) {
        aqi aqiVar;
        boolean z;
        kb5 kb5Var;
        boolean z2;
        Object obj;
        q0k a2;
        float a3;
        pcu pcuVar;
        Object obj2;
        aqi aqiVar2;
        aqi aqiVar3;
        int i3;
        vci vciVar;
        pj2 pj2Var;
        e6h e6hVar;
        float f3;
        ?? r11;
        ?? r13;
        oq5 oq5Var;
        yci yciVar2;
        oq5 oq5Var2;
        wn5 wn5Var2 = ff7.c;
        sdrVar.getClass();
        jubVar.getClass();
        st4Var.getClass();
        hvbVar.getClass();
        ab0Var.getClass();
        f83Var.getClass();
        list.getClass();
        function1.getClass();
        oq5 oq5Var3 = (oq5) hq5Var;
        oq5Var3.b0(448526061);
        int i4 = i2 | (oq5Var3.f(sdrVar) ? 4 : 2) | (oq5Var3.h(jubVar) ? 32 : 16) | (oq5Var3.h(st4Var) ? 256 : 128) | (oq5Var3.c(f2) ? 2048 : 1024) | (oq5Var3.f(hvbVar) ? 16384 : RemoteCameraConfig.Notification.ID) | (oq5Var3.h(ab0Var) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX) | (oq5Var3.h(f83Var) ? 1048576 : 524288) | (oq5Var3.h(function1) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456);
        if ((i4 & 306783379) == 306783378 && oq5Var3.z()) {
            oq5Var3.S();
            f3 = f2;
            oq5Var2 = oq5Var3;
        } else {
            fvf a4 = hvf.a(0, 0, oq5Var3, 0, 3);
            boolean f4 = oq5Var3.f(jubVar);
            Object K = oq5Var3.K();
            Object obj3 = gq5.a;
            Object obj4 = K;
            if (f4 || K == obj3) {
                Object a5 = jubVar.a();
                oq5Var3.k0(a5);
                obj4 = a5;
            }
            e6h e6hVar2 = (c6h) obj4;
            aqi O = gld.O(e6hVar2.n(), oq5Var3);
            Boolean bool = Boolean.FALSE;
            boolean f5 = oq5Var3.f(O);
            Object K2 = oq5Var3.K();
            Continuation continuation = null;
            Object obj5 = K2;
            if (f5 || K2 == obj3) {
                Object jwbVar = new jwb(O, continuation, 0);
                oq5Var3.k0(jwbVar);
                obj5 = jwbVar;
            }
            aqi l0 = szf.l0(bool, O, (Function2) obj5, oq5Var3);
            aqi M = gld.M(jubVar.j, oq5Var3);
            Boolean bool2 = (Boolean) l0.getValue();
            boolean booleanValue = bool2.booleanValue();
            float f6 = ivb.a;
            boolean z3 = hvbVar instanceof fvb;
            Object[] objArr = {a4, bool2, M, Boolean.valueOf(z3)};
            boolean f7 = oq5Var3.f(M) | oq5Var3.g(booleanValue) | oq5Var3.f(a4) | oq5Var3.g(z3);
            Object K3 = oq5Var3.K();
            if (f7 || K3 == obj3) {
                aqiVar = M;
                z = z3;
                K3 = new oz6(aqiVar, booleanValue, a4, z, null);
                oq5Var3.k0(K3);
            } else {
                aqiVar = M;
                z = z3;
            }
            aqi m0 = szf.m0(bool, objArr, (Function2) K3, oq5Var3);
            cma cmaVar = new cma(qt4.j(oq5Var3));
            if (!((Boolean) m0.getValue()).booleanValue()) {
                cmaVar = null;
            }
            float f8 = cmaVar != null ? cmaVar.a : 0;
            WeakHashMap weakHashMap = rqv.w;
            eoe n2 = p6g.n(z7l.h(oq5Var3).l, oq5Var3);
            float f9 = 8;
            q0k c2 = androidx.compose.foundation.layout.a.c(0.0f, n2.d(), 0.0f, n2.a() + f8 + f9, 5);
            q0k c3 = androidx.compose.foundation.layout.a.c(0.0f, f2, 0.0f, z ? h6h.b : 0, 5);
            Boolean bool3 = (Boolean) l0.getValue();
            bool3.getClass();
            boolean f10 = oq5Var3.f(l0) | oq5Var3.f(a4);
            Object K4 = oq5Var3.K();
            Object obj6 = K4;
            if (f10 || K4 == obj3) {
                Object gwbVar = new gwb(a4, l0, null, 0);
                oq5Var3.k0(gwbVar);
                obj6 = gwbVar;
            }
            gld.w(oq5Var3, bool3, (Function2) obj6);
            boolean h2 = oq5Var3.h(jubVar);
            Object K5 = oq5Var3.K();
            int i5 = 1;
            Object obj7 = K5;
            if (h2 || K5 == obj3) {
                Object jvbVar = new jvb(jubVar, i5);
                oq5Var3.k0(jvbVar);
                obj7 = jvbVar;
            }
            gld.k(jubVar, (Function1) obj7, oq5Var3);
            Boolean valueOf = Boolean.valueOf(z);
            boolean h3 = oq5Var3.h(jubVar) | ((i4 & 57344) == 16384);
            Object K6 = oq5Var3.K();
            Object obj8 = K6;
            if (h3 || K6 == obj3) {
                Object nz5Var = new nz5(jubVar, hvbVar, (Continuation) null, 15);
                oq5Var3.k0(nz5Var);
                obj8 = nz5Var;
            }
            gld.y(jubVar, valueOf, (Function2) obj8, oq5Var3);
            aqi M2 = gld.M(e6hVar2.c(), oq5Var3);
            o((ptb) aqiVar.getValue(), jubVar, oq5Var3, i4 & 112);
            iz2 iz2Var = b2c.b;
            kfh d2 = ug3.d(iz2Var, false);
            int i6 = oq5Var3.P;
            a l2 = oq5Var3.l();
            yci H = vnj.H(oq5Var3, yciVar);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var3.d0();
            if (oq5Var3.O) {
                oq5Var3.k(grbVar);
            } else {
                oq5Var3.n0();
            }
            kb5 kb5Var2 = wp5.f;
            g0g.U(oq5Var3, d2, kb5Var2);
            kb5 kb5Var3 = wp5.e;
            g0g.U(oq5Var3, l2, kb5Var3);
            kb5 kb5Var4 = wp5.g;
            if (oq5Var3.O) {
                kb5Var = kb5Var3;
            } else {
                kb5Var = kb5Var3;
            }
            ouj.x(i6, oq5Var3, i6, kb5Var4);
            kb5 kb5Var5 = wp5.d;
            g0g.U(oq5Var3, H, kb5Var5);
            pj2 P = xv.P(sdrVar, oq5Var3);
            int i7 = i4 << 3;
            kb5 kb5Var6 = kb5Var;
            pcu M3 = asq.M(xpg.a(oq5Var3), sdrVar, M2, gld.O(jubVar.o, oq5Var3), a4, oq5Var3, i7 & 112);
            boolean f11 = oq5Var3.f(P);
            Object K7 = oq5Var3.K();
            if (f11 || K7 == obj3) {
                z2 = false;
                Object hwbVar = new hwb(P, false ? 1 : 0);
                oq5Var3.k0(hwbVar);
                obj = hwbVar;
            } else {
                z2 = false;
                obj = K7;
            }
            vci vciVar2 = vci.a;
            yci t = wyf.t(vciVar2, (Function0) obj);
            t.getClass();
            yci c4 = d.c(f83Var.b(t), 1.0f);
            kfh d3 = ug3.d(iz2Var, z2);
            int i8 = oq5Var3.P;
            a l3 = oq5Var3.l();
            yci H2 = vnj.H(oq5Var3, c4);
            oq5Var3.d0();
            if (oq5Var3.O) {
                oq5Var3.k(grbVar);
            } else {
                oq5Var3.n0();
            }
            g0g.U(oq5Var3, d3, kb5Var2);
            g0g.U(oq5Var3, l3, kb5Var6);
            if (oq5Var3.O || !Intrinsics.d(oq5Var3.K(), Integer.valueOf(i8))) {
                ouj.x(i8, oq5Var3, i8, kb5Var4);
            }
            g0g.U(oq5Var3, H2, kb5Var5);
            o8g.f(M3, ((Boolean) l0.getValue()).booleanValue() || aqiVar.getValue() == ptb.b, oq5Var3, 0);
            int ordinal = ((ptb) aqiVar.getValue()).ordinal();
            if (ordinal != 0) {
                r13 = 1;
                if (ordinal != 1) {
                    throw vz1.i(oq5Var3, 514530863, false);
                }
                oq5Var3.Z(-1226610587);
                boolean f12 = oq5Var3.f(jubVar);
                Object K8 = oq5Var3.K();
                Object obj9 = K8;
                if (f12 || K8 == obj3) {
                    Object subVar = new sub(jubVar.a.b, jubVar.b);
                    oq5Var3.k0(subVar);
                    obj9 = subVar;
                }
                wn5Var2.invoke((sub) obj9, oq5Var3, 48);
                oq5Var3.p(false);
                oq5Var = oq5Var3;
                r11 = 0;
                obj2 = obj3;
                pj2Var = P;
                e6hVar = e6hVar2;
                aqiVar2 = aqiVar;
                aqiVar3 = M2;
                i3 = i7;
                vciVar = vciVar2;
                f3 = f2;
                pcuVar = M3;
            } else {
                oq5Var3.Z(-1229342586);
                dvb dvbVar = dvb.a;
                if (hvbVar.equals(dvbVar)) {
                    a2 = androidx.compose.foundation.layout.a.a(v0k.a, 0.0f, 2);
                } else if (hvbVar instanceof evb) {
                    evb evbVar = (evb) hvbVar;
                    a2 = androidx.compose.foundation.layout.a.a((evbVar.b - evbVar.a) / 2, 0.0f, 2);
                } else {
                    if (!z) {
                        b6e.s();
                        return;
                    }
                    a2 = androidx.compose.foundation.layout.a.a(((fvb) hvbVar).e.a(), 0.0f, 2);
                }
                if (hvbVar.equals(dvbVar)) {
                    a3 = 0;
                } else if (!(hvbVar instanceof gvb)) {
                    b6e.s();
                    return;
                } else {
                    gvb gvbVar = (gvb) hvbVar;
                    a3 = ((gvbVar.a() - gvbVar.c()) / 2) - v0k.a;
                }
                float Q = ff7.Q(a3, oq5Var3);
                qzm[] qzmVarArr = {lkg.a.a(a2), lkg.b.a(new cma(f9)), ivb.b.a(hvbVar), glg.a.a(jubVar.e)};
                pcuVar = M3;
                obj2 = obj3;
                aqiVar2 = aqiVar;
                aqiVar3 = M2;
                i3 = i7;
                vciVar = vciVar2;
                pj2Var = P;
                e6hVar = e6hVar2;
                f3 = f2;
                oq5 oq5Var4 = oq5Var3;
                etn.m(qzmVarArr, ild.C(1590086825, new nvb(f2, Q, c3, c2, P, a4, sdrVar, aqiVar3, ab0Var, e6hVar2, hvbVar, pcuVar, O, jubVar, list, function1, wn5Var, 0), oq5Var4), oq5Var4, 56);
                r11 = 0;
                oq5Var4.p(false);
                r13 = 1;
                oq5Var = oq5Var4;
            }
            oq5Var.p(r13);
            vci vciVar3 = vciVar;
            yci d4 = d.d(d.e(vciVar3, f3), 1.0f);
            boolean e2 = pcuVar.e();
            boolean h4 = oq5Var.h(pcuVar);
            Object K9 = oq5Var.K();
            Object obj10 = obj2;
            Object obj11 = K9;
            if (h4 || K9 == obj10) {
                Object at4Var = new at4(pcuVar, r13);
                oq5Var.k0(at4Var);
                obj11 = at4Var;
            }
            Function0 function0 = (Function0) obj11;
            aqi aqiVar4 = aqiVar2;
            boolean f13 = oq5Var.f(aqiVar4) | oq5Var.h(pcuVar);
            Object K10 = oq5Var.K();
            Object obj12 = K10;
            if (f13 || K10 == obj10) {
                Object ovbVar = new ovb(aqiVar4, pcuVar, r11);
                oq5Var.k0(ovbVar);
                obj12 = ovbVar;
            }
            pj2 pj2Var2 = pj2Var;
            yci A = tt0.A(d4, pj2Var2, function0, (Function0) obj12, e2, true, f83Var);
            iz2 iz2Var2 = b2c.c;
            b bVar = b.a;
            u1g.l(oq5Var, bVar.a(A, iz2Var2));
            oq5Var.Z(-655387058);
            yci a6 = bVar.a(vciVar3, b2c.i);
            if (((Boolean) l0.getValue()).booleanValue()) {
                boolean booleanValue2 = ((Boolean) l0.getValue()).booleanValue();
                Object K11 = oq5Var.K();
                Object obj13 = K11;
                if (K11 == obj10) {
                    obj13 = vz1.h(oq5Var);
                }
                uoi uoiVar = (uoi) obj13;
                boolean h5 = oq5Var.h(e6hVar);
                Object K12 = oq5Var.K();
                Object obj14 = K12;
                if (h5 || K12 == obj10) {
                    Object qvbVar = new qvb(e6hVar, r11);
                    oq5Var.k0(qvbVar);
                    obj14 = qvbVar;
                }
                yciVar2 = androidx.compose.foundation.a.d(vciVar3, uoiVar, null, booleanValue2, null, null, (Function0) obj14, 24);
            } else {
                yciVar2 = vciVar3;
            }
            yci f14 = a6.f(yciVar2);
            oq5Var.p(r11);
            aqi aqiVar5 = aqiVar3;
            hq5 hq5Var2 = oq5Var;
            xv7.g(m0, ab0Var, aqiVar5, st4Var, pj2Var2, pcuVar, f83Var, f14, hq5Var2, ((i4 >> 12) & 112) | (i3 & 7168) | (i4 & 3670016));
            oq5 oq5Var5 = hq5Var2;
            oq5Var5.p(r13);
            oq5Var2 = oq5Var5;
        }
        xmn r = oq5Var2.r();
        if (r != null) {
            r.d = new rvb(sdrVar, jubVar, st4Var, f3, hvbVar, ab0Var, f83Var, list, function1, wn5Var, yciVar, i2, 0);
        }
    }

    public static final void r(Integer num, yci yciVar, hq5 hq5Var, int i2) {
        Integer num2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-828299476);
        int i3 = (oq5Var.f(num) ? 4 : 2) | i2 | 48;
        if ((i3 & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
            num2 = num;
        } else {
            Integer valueOf = Integer.valueOf(R.string.numOfFatals);
            oq5Var.a0(-2115993395);
            qs5 qs5Var = r8g.a;
            iag iagVar = (iag) oq5Var.j(qs5Var);
            oq5Var.p(false);
            boolean z = iagVar.J;
            oq5Var.a0(-2115993395);
            iag iagVar2 = (iag) oq5Var.j(qs5Var);
            oq5Var.p(false);
            vci vciVar = vci.a;
            num2 = num;
            h4a.i(valueOf, num2, vciVar, false, z, iagVar2.K, oq5Var, (i3 << 3) & 1008, 8);
            yciVar = vciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new s30(num2, yciVar, i2, 22);
        }
    }

    public static final vpc s(t2o... t2oVarArr) {
        List asList = Arrays.asList(t2oVarArr);
        asList.getClass();
        return new vpc(asList);
    }

    public static final void t(fvf fvfVar, pcu pcuVar, sdr sdrVar, aqi aqiVar, jub jubVar, hq5 hq5Var, int i2) {
        sdr sdrVar2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-2030056882);
        int i3 = (oq5Var.f(fvfVar) ? 4 : 2) | i2;
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? oq5Var.f(pcuVar) : oq5Var.h(pcuVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            sdrVar2 = sdrVar;
            i3 |= oq5Var.f(sdrVar2) ? 256 : 128;
        } else {
            sdrVar2 = sdrVar;
        }
        int i4 = i3 | (oq5Var.f(aqiVar) ? 2048 : 1024);
        if ((i2 & 24576) == 0) {
            i4 |= oq5Var.h(jubVar) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((i4 & 9363) == 9362 && oq5Var.z()) {
            oq5Var.S();
        } else {
            View view = (View) oq5Var.j(AndroidCompositionLocals_androidKt.f);
            boolean h2 = oq5Var.h(view);
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (h2 || K == kjnVar) {
                K = new xvb(view, 0);
                oq5Var.k0(K);
            }
            gld.k(view, (Function1) K, oq5Var);
            Object[] objArr = {fvfVar, pcuVar, aqiVar, jubVar};
            boolean h3 = ((i4 & 14) == 4) | ((i4 & 112) == 32 || ((i4 & 64) != 0 && oq5Var.h(pcuVar))) | ((i4 & 7168) == 2048) | ((i4 & 896) == 256) | oq5Var.h(jubVar) | oq5Var.h(view);
            Object K2 = oq5Var.K();
            if (h3 || K2 == kjnVar) {
                nwb nwbVar = new nwb(fvfVar, pcuVar, aqiVar, sdrVar2, jubVar, view, null, 0);
                oq5Var.k0(nwbVar);
                K2 = nwbVar;
            }
            gld.z(objArr, (Function2) K2, oq5Var);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new yvb(fvfVar, pcuVar, sdrVar, aqiVar, jubVar, i2, 0);
        }
    }

    public static final void u(jkf jkfVar, wn5 wn5Var, yci yciVar, hq5 hq5Var, int i2) {
        yci e2;
        yci q;
        kjn kjnVar;
        uqn uqnVar;
        jkf jkfVar2;
        oq5 oq5Var;
        jkfVar.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-694688037);
        int i3 = i2 | (oq5Var2.h(wn5Var) ? 32 : 16);
        if ((i3 & 147) == 146 && oq5Var2.z()) {
            oq5Var2.S();
            oq5Var = oq5Var2;
        } else {
            b2c b2cVar = ujf.a;
            bff bffVar = jkfVar.j;
            boolean booleanValue = ((Boolean) bffVar.invoke()).booleanValue();
            b2cVar.getClass();
            ujf ujfVar = Float.compare(b2c.v(booleanValue, oq5Var2), (float) 316) < 0 ? ujf.c : ujf.b;
            int ordinal = ujfVar.ordinal();
            vci vciVar = vci.a;
            if (ordinal == 0) {
                oq5Var2.Z(-1875261730);
                e2 = d.e(vciVar, b2c.v(((Boolean) bffVar.invoke()).booleanValue(), oq5Var2));
                oq5Var2.p(false);
            } else {
                if (ordinal != 1) {
                    throw vz1.i(oq5Var2, -1875263725, false);
                }
                oq5Var2.Z(-1875256818);
                oq5Var2.p(false);
                e2 = d.u(vciVar, b2c.l, (r2 & 2) == 0);
            }
            int ordinal2 = ujfVar.ordinal();
            if (ordinal2 == 0) {
                q = androidx.compose.foundation.layout.a.q(vciVar, 0.0f, 24, 0.0f, 0.0f, 13);
            } else {
                if (ordinal2 != 1) {
                    b6e.s();
                    return;
                }
                q = androidx.compose.foundation.layout.a.q(vciVar, 0.0f, 0.0f, 0.0f, 24, 7);
            }
            yci yciVar2 = q;
            vqn vqnVar = new vqn();
            uqn uqnVar2 = new uqn();
            yci f2 = androidx.compose.foundation.layout.a.q(d.d(yciVar, 1.0f), 0.0f, 0.0f, 0.0f, ((Boolean) bffVar.invoke()).booleanValue() ? 170 : 130, 7).f(e2);
            Object K = oq5Var2.K();
            kjn kjnVar2 = gq5.a;
            if (K == kjnVar2) {
                K = vz1.h(oq5Var2);
            }
            uoi uoiVar = (uoi) K;
            Object K2 = oq5Var2.K();
            if (K2 == kjnVar2) {
                uqnVar = uqnVar2;
                kjnVar = kjnVar2;
                K2 = new pef(0, jkfVar, jkf.class, "onDoubleTap", "onDoubleTap()V", 0, 10);
                oq5Var2.k0(K2);
            } else {
                kjnVar = kjnVar2;
                uqnVar = uqnVar2;
            }
            h9f h9fVar = (h9f) K2;
            Object K3 = oq5Var2.K();
            if (K3 == kjnVar) {
                jkfVar2 = jkfVar;
                K3 = new pef(0, jkfVar2, jkf.class, "onLongPress", "onLongPress()V", 0, 11);
                oq5Var2.k0(K3);
            } else {
                jkfVar2 = jkfVar;
            }
            Function0 S = irf.S((Function0) ((h9f) K3), oq5Var2, 0);
            Function0 function0 = (Function0) h9fVar;
            Object K4 = oq5Var2.K();
            if (K4 == kjnVar) {
                K4 = new bff(8);
                oq5Var2.k0(K4);
            }
            yci f3 = androidx.compose.foundation.a.f(f2, uoiVar, null, false, null, S, function0, (Function0) K4, 60);
            v48 v48Var = new v48(24, uqnVar, jkfVar2, vqnVar);
            ov6 ov6Var = yvt.a;
            f3.getClass();
            yci f4 = androidx.compose.foundation.layout.a.q(androidx.compose.ui.layout.a.d(f3, new r3s(16, v48Var)), 0.0f, ild.v(oq5Var2), 0.0f, 0.0f, 13).f(yciVar2);
            kfh d2 = ug3.d(b2c.b, false);
            int i4 = oq5Var2.P;
            a l2 = oq5Var2.l();
            yci H = vnj.H(oq5Var2, f4);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var2.d0();
            if (oq5Var2.O) {
                oq5Var2.k(grbVar);
            } else {
                oq5Var2.n0();
            }
            g0g.U(oq5Var2, d2, wp5.f);
            g0g.U(oq5Var2, l2, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var2, i4, kb5Var);
            }
            g0g.U(oq5Var2, H, wp5.d);
            oq5Var = oq5Var2;
            v(ujfVar, jkfVar2, wn5Var, d.c(vciVar, 1.0f), oq5Var, 3120 | ((i3 << 3) & 896));
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new v48(i2, 25, yciVar, jkfVar, wn5Var);
        }
    }

    public static final void v(ujf ujfVar, jkf jkfVar, wn5 wn5Var, yci yciVar, hq5 hq5Var, int i2) {
        int i3;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1797198357);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var.d(ujfVar.ordinal()) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var.f(jkfVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= oq5Var.h(wn5Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= oq5Var.f(yciVar) ? 2048 : 1024;
        }
        int i4 = i3;
        if ((i4 & 1171) == 1170 && oq5Var.z()) {
            oq5Var.S();
        } else {
            aqi Q = szf.Q(jkfVar.g, oq5Var);
            aqi Q2 = szf.Q(jkfVar.h, oq5Var);
            int ordinal = ujfVar.ordinal();
            yci yciVar2 = vci.a;
            if (ordinal != 0) {
                if (ordinal != 1) {
                    b6e.s();
                    return;
                }
                yciVar2 = androidx.compose.foundation.layout.a.q(yciVar2, 0.0f, 40, 0.0f, 0.0f, 13);
            }
            yci yciVar3 = yciVar2;
            vlf vlfVar = (vlf) Q.getValue();
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (K == kjnVar) {
                K = new s3f(23);
                oq5Var.k0(K);
            }
            Function1 function1 = (Function1) K;
            Object K2 = oq5Var.K();
            if (K2 == kjnVar) {
                K2 = new s3f(24);
                oq5Var.k0(K2);
            }
            androidx.compose.animation.a.b(vlfVar, yciVar, function1, null, "animate wave landing", (Function1) K2, ild.C(387154193, new ln1(jkfVar, yciVar3, Q2, wn5Var, 4), oq5Var), oq5Var, ((i4 >> 6) & 112) | 1794432, 8);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new wda(i2, 18, ujfVar, jkfVar, wn5Var, yciVar);
        }
    }

    public static final float w(sdr sdrVar) {
        return ((Number) sdrVar.getValue()).floatValue();
    }

    public static final void x(yci yciVar, xxk xxkVar, hq5 hq5Var, int i2) {
        int i3;
        yci u;
        String str;
        boolean z;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(482787324);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var.f(yciVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var.f(xxkVar) ? 32 : 16;
        }
        if (oq5Var.P(i3 & 1, (i3 & 19) != 18)) {
            u = d.u(yciVar, b2c.l, (r2 & 2) == 0);
            yci o2 = androidx.compose.foundation.layout.a.o(u, 0.0f, zs4.a, 1);
            ta5 a2 = sa5.a(qx0.e, b2c.n, oq5Var, 54);
            int i4 = oq5Var.P;
            a l2 = oq5Var.l();
            yci H = vnj.H(oq5Var, o2);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a2, wp5.f);
            g0g.U(oq5Var, l2, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var, i4, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            y(xxkVar.n, xxkVar.b.toString(), xxkVar.j, null, oq5Var, 0);
            CharSequence charSequence = xxkVar.c;
            if (charSequence == null || (str = charSequence.toString()) == null || str.length() <= 0) {
                str = null;
            }
            if (str == null) {
                oq5Var.Z(1889697271);
                oq5Var.p(false);
                z = true;
            } else {
                oq5Var.Z(1889697272);
                vci vciVar = vci.a;
                u1g.l(oq5Var, d.e(vciVar, 2));
                z = true;
                xv7.j(str, androidx.compose.ui.platform.a.a(vciVar, "artist_name"), ((dq0) oq5Var.j(eq0.a)).b.b, 0L, 0L, 0, 0L, 2, false, 1, 0, null, nu0.i(), oq5Var, 48, 3120, 55288);
                oq5Var = oq5Var;
                oq5Var.p(false);
            }
            oq5Var.p(z);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new z2(i2, 16, yciVar, xxkVar);
        }
    }

    public static final void y(boolean z, String str, jzb jzbVar, yci yciVar, hq5 hq5Var, int i2) {
        oq5 oq5Var;
        yci yciVar2;
        oq5 oq5Var2;
        boolean z2;
        oq5 oq5Var3 = (oq5) hq5Var;
        oq5Var3.b0(-1010238987);
        int i3 = i2 | (oq5Var3.g(z) ? 4 : 2) | (oq5Var3.f(str) ? 32 : 16) | (oq5Var3.d(jzbVar == null ? -1 : jzbVar.ordinal()) ? 256 : 128) | 3072;
        if (oq5Var3.P(i3 & 1, (i3 & 1171) != 1170)) {
            yme ymeVar = new yme(new psk(1, v7g.z(16), v7g.z(16)), ot0.c);
            yme ymeVar2 = new yme(new psk(4, v7g.z(5), v7g.z(3)), ot0.d);
            nho a2 = lho.a(qx0.a, b2c.m, oq5Var3, 48);
            int i4 = oq5Var3.P;
            a l2 = oq5Var3.l();
            vci vciVar = vci.a;
            yci H = vnj.H(oq5Var3, vciVar);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var3.d0();
            if (oq5Var3.O) {
                oq5Var3.k(grbVar);
            } else {
                oq5Var3.n0();
            }
            g0g.U(oq5Var3, a2, wp5.f);
            g0g.U(oq5Var3, l2, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var3.O || !Intrinsics.d(oq5Var3.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var3, i4, kb5Var);
            }
            g0g.U(oq5Var3, H, wp5.d);
            Object K = oq5Var3.K();
            kjn kjnVar = gq5.a;
            if (K == kjnVar) {
                K = tlm.h(0.0f, oq5Var3);
            }
            poi poiVar = (poi) K;
            if (1.0f <= 0.0d) {
                qme.a("invalid weight; must be greater than zero");
            }
            yci f2 = androidx.compose.ui.platform.a.a(new LayoutWeightElement(false, 1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f), "track_name").f(new WithAlignmentLineElement(j40.a));
            kn0 kn0Var = new kn0();
            if (z) {
                u2x.s(kn0Var, "videoclip");
                u2x.s(kn0Var, "spacer");
            }
            kn0Var.d(str);
            mn0 h2 = kn0Var.h();
            ges j2 = nu0.j();
            agr agrVar = eq0.a;
            long j3 = ((dq0) oq5Var3.j(agrVar)).a.a;
            Map e2 = uah.e(new Pair("videoclip", ymeVar), new Pair("spacer", ymeVar2));
            Object K2 = oq5Var3.K();
            if (K2 == kjnVar) {
                K2 = new pv(poiVar, 3);
                oq5Var2 = oq5Var3;
                oq5Var2.k0(K2);
            } else {
                oq5Var2 = oq5Var3;
            }
            oq5 oq5Var4 = oq5Var2;
            yciVar2 = vciVar;
            xv7.i(h2, f2, j3, 0L, 0L, 0, 0L, 2, false, 1, 0, e2, (Function2) K2, j2, null, null, oq5Var4, 0, 1575984, 808952);
            oq5Var = oq5Var4;
            u1g.l(oq5Var, d.r(yciVar2, 4));
            if (jzbVar != null) {
                oq5Var.Z(-1829806435);
                lg3.c(jzbVar, d.m(yciVar2, ff7.P(v7g.z(16), oq5Var)), ((dq0) oq5Var.j(agrVar)).b.a, oq5Var, 6 | ((i3 >> 3) & 112));
                oq5Var = oq5Var;
                z2 = false;
            } else {
                z2 = false;
                oq5Var.Z(-1848280823);
            }
            oq5Var.p(z2);
            oq5Var.p(true);
        } else {
            oq5Var = oq5Var3;
            oq5Var.S();
            yciVar2 = yciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new s43(z, str, jzbVar, yciVar2, i2, 2);
        }
    }

    public static final void z(int i2, int i3, hq5 hq5Var, yci yciVar) {
        yci yciVar2;
        int i4;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(424935597);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
            yciVar2 = yciVar;
        } else {
            yciVar2 = yciVar;
            i4 = (oq5Var.f(yciVar2) ? 4 : 2) | i2;
        }
        if (oq5Var.P(i4 & 1, (i4 & 3) != 2)) {
            vci vciVar = vci.a;
            if (i5 != 0) {
                yciVar2 = vciVar;
            }
            dma dmaVar = new dma(12);
            tgo tgoVar = ugo.a;
            yci u = xp3.u(yciVar2, new tgo(dmaVar, dmaVar, dmaVar, dmaVar));
            agr agrVar = eq0.a;
            yci b2 = androidx.compose.foundation.a.b(u, c3x.D(((dq0) oq5Var.j(agrVar)).c.c, ((dq0) oq5Var.j(agrVar)).c.a), vnj.i);
            iz2 iz2Var = b2c.b;
            kfh d2 = ug3.d(iz2Var, false);
            int i6 = oq5Var.P;
            a l2 = oq5Var.l();
            yci H = vnj.H(oq5Var, b2);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            kb5 kb5Var = wp5.f;
            g0g.U(oq5Var, d2, kb5Var);
            kb5 kb5Var2 = wp5.e;
            g0g.U(oq5Var, l2, kb5Var2);
            kb5 kb5Var3 = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i6))) {
                ouj.x(i6, oq5Var, i6, kb5Var3);
            }
            kb5 kb5Var4 = wp5.d;
            g0g.U(oq5Var, H, kb5Var4);
            B(null, oq5Var, 0);
            iz2 iz2Var2 = b2c.f;
            b bVar = b.a;
            yci a2 = bVar.a(vciVar, iz2Var2);
            nho a3 = lho.a(qx0.a, b2c.l, oq5Var, 48);
            int i7 = oq5Var.P;
            a l3 = oq5Var.l();
            yci H2 = vnj.H(oq5Var, a2);
            oq5Var.d0();
            yci yciVar3 = yciVar2;
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a3, kb5Var);
            g0g.U(oq5Var, l3, kb5Var2);
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i7))) {
                ouj.x(i7, oq5Var, i7, kb5Var3);
            }
            g0g.U(oq5Var, H2, kb5Var4);
            yci m2 = d.m(androidx.compose.foundation.layout.a.m(vciVar, 8), 40);
            kfh d3 = ug3.d(iz2Var, false);
            int i8 = oq5Var.P;
            a l4 = oq5Var.l();
            yci H3 = vnj.H(oq5Var, m2);
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, d3, kb5Var);
            g0g.U(oq5Var, l4, kb5Var2);
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i8))) {
                ouj.x(i8, oq5Var, i8, kb5Var3);
            }
            g0g.U(oq5Var, H3, kb5Var4);
            pm0.c(bVar.b(xp3.u(vciVar, irf.R(qo6.a, oq5Var))), oq5Var, 0);
            oq5Var.p(true);
            if (1.0f <= 0.0d) {
                qme.a("invalid weight; must be greater than zero");
            }
            yci o2 = androidx.compose.foundation.layout.a.o(new LayoutWeightElement(true, 1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f), 0.0f, zs4.a, 1);
            ta5 a4 = sa5.a(qx0.e, b2c.n, oq5Var, 6);
            int i9 = oq5Var.P;
            a l5 = oq5Var.l();
            yci H4 = vnj.H(oq5Var, o2);
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a4, kb5Var);
            g0g.U(oq5Var, l5, kb5Var2);
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i9))) {
                ouj.x(i9, oq5Var, i9, kb5Var3);
            }
            g0g.U(oq5Var, H4, kb5Var4);
            pm0.d(d.d(vciVar, 1.0f), nu0.j(), oq5Var, 6);
            u1g.l(oq5Var, d.e(vciVar, mu0.a));
            pm0.d(d.d(vciVar, 0.75f), nu0.i(), oq5Var, 6);
            oq5Var.p(true);
            if (2.0f <= 0.0d) {
                qme.a("invalid weight; must be greater than zero");
            }
            u1g.l(oq5Var, new LayoutWeightElement(true, 2.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 2.0f));
            oq5Var.p(true);
            oq5Var.p(true);
            yciVar2 = yciVar3;
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new jm0(yciVar2, i2, i3, 2);
        }
    }
}
