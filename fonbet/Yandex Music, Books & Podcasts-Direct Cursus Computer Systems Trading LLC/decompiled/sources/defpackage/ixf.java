package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.ComposeView;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import com.yandex.music.core.ui.compose.b;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.lang.reflect.Field;
import java.math.RoundingMode;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;
import ru.yandex.music.catalog.playlist.screen.PlaylistScreenActivity;
import ru.yandex.music.common.media.context.PlaybackScope;

/* loaded from: classes3.dex */
public abstract class ixf {
    public static boolean a = true;
    public static Field b;
    public static boolean c;

    public static final boolean A(String str) {
        return str == null || str.length() == 0;
    }

    public static long B(int i, byte[] bArr) {
        return (((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16)) & 4294967295L;
    }

    public static Intent E(Context context, cvl cvlVar, PlaybackScope playbackScope) {
        int i = PlaylistScreenActivity.B0;
        return dxl.f(context, cvlVar, false, null, nxl.a, playbackScope);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x01c9, code lost:
    
        if (r0.e(r3) != r4) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01b4, code lost:
    
        if (r2.l(r5, r3) == r4) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00a7, code lost:
    
        if (r5.c(r3) == r4) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00d6, code lost:
    
        if (r5 == r4) goto L81;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object F(vx6 vx6Var, aem aemVar, boolean z, cg6 cg6Var) {
        xvk xvkVar;
        int i;
        n7q n7qVar;
        aem aemVar2;
        Object f;
        Long l;
        vx6 vx6Var2 = vx6Var;
        boolean z2 = z;
        if (cg6Var instanceof xvk) {
            xvkVar = (xvk) cg6Var;
            int i2 = xvkVar.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                xvkVar.o = i2 - Integer.MIN_VALUE;
                Object obj = xvkVar.n;
                nm6 nm6Var = nm6.a;
                i = xvkVar.o;
                if (i != 0) {
                    qgg.h0(obj);
                    f7l f7lVar = (f7l) vx6Var2.b;
                    uol uolVar = (uol) vx6Var2.d;
                    if (p6g.C((e6l) f7lVar.c.getValue()) && !z2) {
                        return Boolean.TRUE;
                    }
                    if (!p6g.C((e6l) f7lVar.d.getValue())) {
                        if (!z2) {
                            Object value = f7lVar.c.getValue();
                            d6l d6lVar = value instanceof d6l ? (d6l) value : null;
                            n7qVar = d6lVar != null ? d6lVar.a : null;
                            if (n7qVar != null) {
                                xvkVar.j = vx6Var2;
                                aemVar2 = aemVar;
                                xvkVar.k = aemVar2;
                                xvkVar.l = n7qVar;
                                xvkVar.m = z2;
                                xvkVar.o = 2;
                                f = uolVar.f(xvkVar);
                            }
                            l = null;
                            if (l != null) {
                            }
                            if (l != null) {
                            }
                        }
                        uol uolVar2 = (uol) vx6Var2.d;
                        xvkVar.j = null;
                        xvkVar.k = null;
                        xvkVar.l = null;
                        xvkVar.m = z2;
                        xvkVar.o = 4;
                    } else {
                        if (z2) {
                            return Boolean.TRUE;
                        }
                        xvkVar.j = null;
                        xvkVar.k = null;
                        xvkVar.m = z2;
                        xvkVar.o = 1;
                    }
                    return nm6Var;
                }
                if (i == 1) {
                    qgg.h0(obj);
                    return Boolean.TRUE;
                }
                if (i == 2) {
                    boolean z3 = xvkVar.m;
                    n7q n7qVar2 = xvkVar.l;
                    aem aemVar3 = xvkVar.k;
                    vx6 vx6Var3 = xvkVar.j;
                    qgg.h0(obj);
                    aemVar2 = aemVar3;
                    f = obj;
                    n7qVar = n7qVar2;
                    z2 = z3;
                    vx6Var2 = vx6Var3;
                    long longValue = ((Number) f).longValue();
                    aemVar2.getClass();
                    n7qVar.getClass();
                    mwk b2 = n7qVar.b();
                    mqs a2 = b2.a();
                    if (a2 != null && a2.l && longValue > 0) {
                        e2l e2lVar = (e2l) aemVar2.b.getValue();
                        e2lVar.getClass();
                        String str = (String) dag.p(b2, kjn.f);
                        str.getClass();
                        d5l d5lVar = e2lVar.a.a;
                        d5lVar.getClass();
                        d5lVar.f.await();
                        l1l l1lVar = (l1l) d5lVar.d.get(str);
                        Long valueOf = l1lVar != null ? Long.valueOf(l1lVar.d) : null;
                        if ((valueOf != null ? valueOf.longValue() : Long.MAX_VALUE) < aemVar2.a.b() - 60000) {
                            CopyOnWriteArrayList copyOnWriteArrayList = w9l.a;
                            long max = Math.max(0L, longValue - 2000);
                            l = Long.valueOf(max);
                            mqs a3 = b2.a();
                            String str2 = a3 != null ? a3.a : null;
                            StringBuilder sb = new StringBuilder("getOverridePositionOrNull(");
                            sb.append(max);
                            sb.append(",trackId=");
                            sb.append(str2);
                            v3w.m(sb, ")", 3, "PodcastsOnPlaySeekPositionOverrider", null);
                            if (l != null) {
                                ssg.a(3, "PlayCommandsExecutorKt", "resumePlayer(overriddenPosition=" + l + ")", null);
                            }
                            if (l != null) {
                                if (l.longValue() < 0) {
                                    l = null;
                                }
                                if (l != null) {
                                    long longValue2 = l.longValue();
                                    uol uolVar3 = (uol) vx6Var2.d;
                                    xvkVar.j = vx6Var2;
                                    xvkVar.k = null;
                                    xvkVar.l = null;
                                    xvkVar.m = z2;
                                    xvkVar.o = 3;
                                }
                            }
                            uol uolVar22 = (uol) vx6Var2.d;
                            xvkVar.j = null;
                            xvkVar.k = null;
                            xvkVar.l = null;
                            xvkVar.m = z2;
                            xvkVar.o = 4;
                        }
                    }
                    l = null;
                    if (l != null) {
                    }
                    if (l != null) {
                    }
                    uol uolVar222 = (uol) vx6Var2.d;
                    xvkVar.j = null;
                    xvkVar.k = null;
                    xvkVar.l = null;
                    xvkVar.m = z2;
                    xvkVar.o = 4;
                } else if (i == 3) {
                    boolean z4 = xvkVar.m;
                    vx6 vx6Var4 = xvkVar.j;
                    qgg.h0(obj);
                    z2 = z4;
                    vx6Var2 = vx6Var4;
                    uol uolVar2222 = (uol) vx6Var2.d;
                    xvkVar.j = null;
                    xvkVar.k = null;
                    xvkVar.l = null;
                    xvkVar.m = z2;
                    xvkVar.o = 4;
                } else {
                    if (i != 4) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Boolean.TRUE;
            }
        }
        xvkVar = new xvk(cg6Var);
        Object obj2 = xvkVar.n;
        nm6 nm6Var2 = nm6.a;
        i = xvkVar.o;
        if (i != 0) {
        }
        return Boolean.TRUE;
    }

    public static final long G(long j) {
        return d85.b(j, 0.0f, yhn.c(d85.h(j) * 1.33f, 0.0f, 1.0f), yhn.c(d85.g(j) * 1.33f, 0.0f, 1.0f), yhn.c(d85.e(j) * 1.33f, 0.0f, 1.0f), 1);
    }

    public static final void I(ViewGroup viewGroup, jp0 jp0Var, boolean z, String str, wn5 wn5Var, wn5 wn5Var2) {
        Context context = viewGroup.getContext();
        context.getClass();
        ComposeView composeView = new ComposeView(context, null, 0, 6, null);
        jp0Var.getClass();
        jp0Var.e = viewGroup;
        jp0Var.f = composeView;
        osh oshVar = new osh();
        oshVar.a = viewGroup;
        oshVar.b = composeView;
        oshVar.c = new LinkedHashMap();
        jp0Var.g = oshVar;
        composeView.setContent(new wn5(new diq(str, jp0Var, z, wn5Var, wn5Var2), -116314621, true));
        viewGroup.addView(composeView);
        WeakHashMap weakHashMap = wdu.a;
        kqv a2 = odu.a(viewGroup);
        if (a2 != null) {
            wdu.c(composeView, a2);
        }
        viewGroup.setOnApplyWindowInsetsListener(new ciu(composeView, 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object J(frt frtVar, cg6 cg6Var) {
        zyq zyqVar;
        int i;
        yxc yxcVar;
        if (cg6Var instanceof zyq) {
            zyqVar = (zyq) cg6Var;
            int i2 = zyqVar.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zyqVar.k = i2 - Integer.MIN_VALUE;
                Object obj = zyqVar.j;
                Object obj2 = nm6.a;
                i = zyqVar.k;
                if (i != 0) {
                    qgg.h0(obj);
                    zyqVar.k = 1;
                    obj = frtVar.k(zyqVar);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                yxcVar = (yxc) obj;
                boolean z = false;
                if (yxcVar != null) {
                    z = yxcVar.a.d && yxcVar.g;
                }
                return Boolean.valueOf(z);
            }
        }
        zyqVar = new zyq(cg6Var);
        Object obj3 = zyqVar.j;
        Object obj22 = nm6.a;
        i = zyqVar.k;
        if (i != 0) {
        }
        yxcVar = (yxc) obj3;
        boolean z2 = false;
        if (yxcVar != null) {
        }
        return Boolean.valueOf(z2);
    }

    public static void K(int i, long j, byte[] bArr) {
        int i2 = 0;
        while (i2 < 4) {
            bArr[i + i2] = (byte) (255 & j);
            i2++;
            j >>= 8;
        }
    }

    public static pjp L(CoroutineContext coroutineContext, k3i k3iVar, Function2 function2) {
        coroutineContext.getClass();
        if (k3iVar.a == j3i.a) {
            return new pjp(k3iVar, new suh(coroutineContext, new gcp(k3iVar, function2)));
        }
        l1j.p(k3iVar, "Expected a unary method descriptor but got ");
        return null;
    }

    public static final boolean M(String str, Function0 function0) {
        try {
            boolean booleanValue = ((Boolean) function0.invoke()).booleanValue();
            if (!booleanValue) {
                Log.e("ReflectionGuard", str);
            }
            return booleanValue;
        } catch (ClassNotFoundException unused) {
            Log.e("ReflectionGuard", "ClassNotFound: ".concat(str));
            return false;
        } catch (NoSuchMethodException unused2) {
            Log.e("ReflectionGuard", "NoSuchMethod: ".concat(str));
            return false;
        }
    }

    public static int N(int i, int i2) {
        RoundingMode roundingMode = RoundingMode.CEILING;
        roundingMode.getClass();
        if (i2 == 0) {
            throw new ArithmeticException("/ by zero");
        }
        int i3 = i / i2;
        int i4 = i - (i2 * i3);
        if (i4 == 0) {
            return i3;
        }
        int i5 = ((i ^ i2) >> 31) | 1;
        switch (fbx.a[roundingMode.ordinal()]) {
            case 1:
                throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
            case 2:
                return i3;
            case 3:
                if (i5 >= 0) {
                    return i3;
                }
                break;
            case 4:
                break;
            case 5:
                if (i5 <= 0) {
                    return i3;
                }
                break;
            case 6:
            case 7:
            case 8:
                int abs = Math.abs(i4);
                int abs2 = abs - (Math.abs(i2) - abs);
                if (abs2 == 0) {
                    RoundingMode roundingMode2 = RoundingMode.HALF_UP;
                    RoundingMode roundingMode3 = RoundingMode.HALF_EVEN;
                    return i3;
                }
                if (abs2 <= 0) {
                    return i3;
                }
                break;
            default:
                wvs.b();
                return 0;
        }
        return i3 + i5;
    }

    public static final void a(wn5 wn5Var, hq5 hq5Var, int i) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(770082292);
        int i2 = (oq5Var.h(wn5Var) ? 4 : 2) | i | (oq5Var.g(true) ? 32 : 16);
        if (oq5Var.P(i2 & 1, (i2 & 19) != 18)) {
            qs5 qs5Var = AndroidCompositionLocals_androidKt.a;
            qs5Var.getClass();
            boolean I = asq.I((Configuration) oq5Var.j(qs5Var));
            oq5Var.Z(1314720270);
            vci vciVar = vci.a;
            yci f = gut.z(gut.p1(I ? gut.a0(vciVar) : vciVar)).f(y1g.d0(vciVar, 16, ((ivp) oq5Var.j(kvp.a)).c, false, 24));
            oq5Var.p(false);
            yci t = d.t(f, u7g.E(R.dimen.simple_bottom_sheet_max_width, oq5Var), 0.0f, 2);
            oq5Var.Z(1314732381);
            agr agrVar = eq0.a;
            long j = ((dq0) oq5Var.j(agrVar)).c.b;
            oq5Var.p(false);
            float f2 = 16;
            yci f3 = a.b(t, j, ugo.c(f2, f2)).f(!I ? gut.a0(vciVar) : vciVar);
            ta5 a2 = sa5.a(qx0.c, b2c.o, oq5Var, 48);
            int i3 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, f3);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            kb5 kb5Var = wp5.f;
            g0g.U(oq5Var, a2, kb5Var);
            kb5 kb5Var2 = wp5.e;
            g0g.U(oq5Var, l, kb5Var2);
            kb5 kb5Var3 = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var, i3, kb5Var3);
            }
            kb5 kb5Var4 = wp5.d;
            g0g.U(oq5Var, H, kb5Var4);
            yci d = d.d(vciVar, 1.0f);
            oq5Var.Z(1299727827);
            long j2 = ((dq0) oq5Var.j(agrVar)).c.b;
            oq5Var.p(false);
            ot0.e((i2 & 112) | 6, 8, j2, oq5Var, d, true);
            yci d2 = d.d(vciVar, 1.0f);
            oq5Var.Z(1299733779);
            long j3 = ((dq0) oq5Var.j(agrVar)).c.b;
            oq5Var.p(false);
            yci b2 = a.b(d2, j3, vnj.i);
            kfh d3 = ug3.d(b2c.b, false);
            int i4 = oq5Var.P;
            androidx.compose.runtime.internal.a l2 = oq5Var.l();
            yci H2 = vnj.H(oq5Var, b2);
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, d3, kb5Var);
            g0g.U(oq5Var, l2, kb5Var2);
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var, i4, kb5Var3);
            }
            g0g.U(oq5Var, H2, kb5Var4);
            wn5Var.invoke(oq5Var, Integer.valueOf(i2 & 14));
            oq5Var.p(true);
            oq5Var.p(true);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new ion(i, 9, wn5Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0128, code lost:
    
        if (r1 == r0) goto L56;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(Function0 function0, tbi tbiVar, fk0 fk0Var, wn5 wn5Var, hq5 hq5Var, int i) {
        int i2;
        tbi tbiVar2;
        kjn kjnVar;
        xof xofVar;
        oq5 oq5Var;
        Object obj;
        kjn kjnVar2;
        oq5 oq5Var2;
        oq5 oq5Var3 = (oq5) hq5Var;
        oq5Var3.b0(1254951810);
        if ((i & 6) == 0) {
            i2 = (oq5Var3.h(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            tbiVar2 = tbiVar;
            i2 |= oq5Var3.f(tbiVar2) ? 32 : 16;
        } else {
            tbiVar2 = tbiVar;
        }
        if ((i & 384) == 0) {
            i2 |= (i & RemoteCameraConfig.Mic.BUFFER_SIZE) == 0 ? oq5Var3.f(fk0Var) : oq5Var3.h(fk0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var3.h(wn5Var) ? 2048 : 1024;
        }
        int i3 = i2;
        if ((i3 & 1171) == 1170 && oq5Var3.z()) {
            oq5Var3.S();
            oq5Var2 = oq5Var3;
        } else {
            View view = (View) oq5Var3.j(AndroidCompositionLocals_androidKt.f);
            jx7 jx7Var = (jx7) oq5Var3.j(es5.h);
            xof xofVar2 = (xof) oq5Var3.j(es5.n);
            mq5 z = lxe.z(oq5Var3);
            aqi o0 = szf.o0(wn5Var, oq5Var3);
            UUID uuid = (UUID) o2g.g0(new Object[0], null, grb.z0, oq5Var3, 3072, 6);
            Object K = oq5Var3.K();
            kjn kjnVar3 = gq5.a;
            if (K == kjnVar3) {
                K = tlm.f(gld.R(g.a, oq5Var3), oq5Var3);
            }
            mm6 mm6Var = ((fs5) K).a;
            boolean B = xv7.B(oq5Var3);
            boolean f = oq5Var3.f(view) | oq5Var3.f(jx7Var);
            Object K2 = oq5Var3.K();
            if (f || K2 == kjnVar3) {
                oq5 oq5Var4 = oq5Var3;
                kjnVar = kjnVar3;
                xofVar = xofVar2;
                uai uaiVar = new uai(function0, tbiVar2, view, xofVar, jx7Var, uuid, fk0Var, mm6Var, B);
                wn5 wn5Var2 = new wn5(new jg0(o0, 1), -1560960657, true);
                rai raiVar = uaiVar.g;
                raiVar.setParentCompositionContext(z);
                raiVar.n.setValue(wn5Var2);
                raiVar.p = true;
                raiVar.l();
                oq5Var4.k0(uaiVar);
                obj = uaiVar;
                oq5Var = oq5Var4;
            } else {
                oq5Var = oq5Var3;
                kjnVar = kjnVar3;
                xofVar = xofVar2;
                obj = K2;
            }
            uai uaiVar2 = (uai) obj;
            boolean h = oq5Var.h(uaiVar2);
            Object K3 = oq5Var.K();
            if (h) {
                kjnVar2 = kjnVar;
            } else {
                kjnVar2 = kjnVar;
            }
            K3 = new tai(uaiVar2, 1);
            oq5Var.k0(K3);
            gld.k(uaiVar2, (Function1) K3, oq5Var);
            boolean h2 = oq5Var.h(uaiVar2) | ((i3 & 14) == 4) | ((i3 & 112) == 32) | oq5Var.f(xofVar);
            Object K4 = oq5Var.K();
            if (h2 || K4 == kjnVar2) {
                zg zgVar = new zg(uaiVar2, function0, tbiVar, xofVar, 15);
                oq5Var.k0(zgVar);
                K4 = zgVar;
            }
            gld.D((Function0) K4, oq5Var);
            oq5Var2 = oq5Var;
        }
        xmn r = oq5Var2.r();
        if (r != null) {
            r.d = new un5(function0, tbiVar, fk0Var, wn5Var, i, 5);
        }
    }

    public static final void c(final boolean z, hq5 hq5Var, int i) {
        int i2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1541660814);
        if ((i & 6) == 0) {
            i2 = (oq5Var.g(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (oq5Var.P(i2 & 1, (i2 & 3) != 2)) {
            Activity activity = (Activity) oq5Var.j(mhg.a);
            final Window window = activity != null ? activity.getWindow() : null;
            if (window == null) {
                xq0.x("Required value was null.");
                return;
            }
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (K == kjnVar) {
                K = Boolean.valueOf(c9g.q(window, vyr.NavigationBar));
                oq5Var.k0(K);
            }
            final boolean booleanValue = ((Boolean) K).booleanValue();
            Unit unit = Unit.a;
            boolean h = oq5Var.h(window) | ((i2 & 14) == 4);
            Object K2 = oq5Var.K();
            if (h || K2 == kjnVar) {
                K2 = new Function1() { // from class: fiq
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        ((oa8) obj).getClass();
                        vyr vyrVar = vyr.NavigationBar;
                        boolean z2 = !z;
                        Window window2 = window;
                        c9g.u(window2, vyrVar, z2);
                        return new giq(window2, booleanValue);
                    }
                };
                oq5Var.k0(K2);
            }
            gld.k(unit, (Function1) K2, oq5Var);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new vf4(i, 5, z, false);
        }
    }

    public static final void d(lvf lvfVar, boolean z, yci yciVar, hq5 hq5Var, int i) {
        yci yciVar2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-514475145);
        int i2 = (oq5Var.h(lvfVar) ? 4 : 2) | i | (oq5Var.g(z) ? 32 : 16) | 384;
        boolean z2 = true;
        if (oq5Var.P(i2 & 1, (i2 & 147) != 146)) {
            qu2 qu2Var = lvfVar.e().c;
            boolean d = Intrinsics.d(qu2Var, mfg.b);
            vci vciVar = vci.a;
            if (d) {
                oq5Var.Z(2009452909);
                tyf.c(vciVar, oq5Var, 6);
                oq5Var.p(false);
            } else {
                boolean z3 = qu2Var instanceof lfg;
                kjn kjnVar = gq5.a;
                if (z3) {
                    oq5Var.Z(2009549846);
                    if ((i2 & 14) != 4 && !oq5Var.h(lvfVar)) {
                        z2 = false;
                    }
                    Object K = oq5Var.K();
                    if (z2 || K == kjnVar) {
                        K = new ul1(lvfVar, 2);
                        oq5Var.k0(K);
                    }
                    bzf.d((Function0) K, androidx.compose.foundation.layout.a.m(d.d(vciVar, 1.0f), 16), oq5Var, 0);
                    oq5Var.p(false);
                } else {
                    if (!(qu2Var instanceof nfg)) {
                        throw vz1.i(oq5Var, -489369770, false);
                    }
                    oq5Var.Z(2009799179);
                    if (z) {
                        oq5Var.Z(2009832504);
                        if ((i2 & 14) != 4 && !oq5Var.h(lvfVar)) {
                            z2 = false;
                        }
                        Object K2 = oq5Var.K();
                        if (z2 || K2 == kjnVar) {
                            K2 = new ul1(lvfVar, 3);
                            oq5Var.k0(K2);
                        }
                        bzf.d((Function0) K2, androidx.compose.foundation.layout.a.m(d.d(vciVar, 1.0f), 16), oq5Var, 0);
                    } else {
                        oq5Var.Z(2008644491);
                    }
                    oq5Var.p(false);
                    oq5Var.p(false);
                }
            }
            yciVar2 = vciVar;
        } else {
            oq5Var.S();
            yciVar2 = yciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new oc1(lvfVar, z, yciVar2, i, 15);
        }
    }

    public static final void e(wn5 wn5Var, hq5 hq5Var, int i) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-2122869821);
        if (oq5Var.P(i & 1, (i & 3) != 2)) {
            etn.l(qrj.a.a(((Configuration) oq5Var.j(AndroidCompositionLocals_androidKt.a)).screenWidthDp <= 360 ? new prj(478, 0.94f, androidx.compose.foundation.layout.a.a(0.0f, 0.0f, 3), 18) : new prj(646, 0.69f, androidx.compose.foundation.layout.a.a(24, 0.0f, 2), 46)), ild.C(-933128445, new y61(wn5Var, 26), oq5Var), oq5Var, 56);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new y61(i, 27, wn5Var);
        }
    }

    public static final void f(bz2 bz2Var, boolean z, Function0 function0, boolean z2, Function0 function02, yci yciVar, Function0 function03, hq5 hq5Var, int i) {
        oq5 oq5Var;
        ges j;
        function0.getClass();
        function02.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(1557743207);
        int i2 = i | (oq5Var2.f(bz2Var) ? 4 : 2) | (oq5Var2.g(z) ? 32 : 16) | (oq5Var2.h(function0) ? 256 : 128) | (oq5Var2.g(z2) ? 2048 : 1024) | (oq5Var2.h(function02) ? 16384 : RemoteCameraConfig.Notification.ID) | (oq5Var2.f(yciVar) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX) | (oq5Var2.h(function03) ? 1048576 : 524288);
        if (oq5Var2.P(i2 & 1, (599187 & i2) != 599186)) {
            lwl lwlVar = (lwl) bz2Var.c;
            if (z) {
                oq5Var2.Z(-1952351497);
                j = nu0.g();
            } else {
                oq5Var2.Z(-1952350189);
                j = nu0.j();
            }
            oq5Var2.p(false);
            oq5Var = oq5Var2;
            wyf.h(lwlVar, function0, d.d(yciVar, 1.0f), 0L, j, ild.C(-272162244, new s43(bz2Var, function03, function02, z2, 19), oq5Var2), e9g.a, null, oq5Var, 1769472 | ((i2 >> 3) & 112), 136);
        } else {
            oq5Var = oq5Var2;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new hr6(bz2Var, z, function0, z2, function02, yciVar, function03, i, 3);
        }
    }

    public static final void g(String str, jp0 jp0Var, boolean z, wn5 wn5Var, wn5 wn5Var2, hq5 hq5Var, int i) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-788970598);
        int i2 = (oq5Var.f(str) ? 4 : 2) | i | (oq5Var.f(jp0Var) ? 32 : 16) | (oq5Var.g(z) ? 256 : 128) | (oq5Var.g(true) ? 2048 : 1024) | (oq5Var.h(wn5Var) ? 16384 : RemoteCameraConfig.Notification.ID) | (oq5Var.h(wn5Var2) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX);
        if (oq5Var.P(i2 & 1, (74899 & i2) != 74898)) {
            c(z, oq5Var, (i2 >> 6) & 14);
            int i3 = i2 & 112;
            boolean z2 = i3 == 32;
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (z2 || K == kjnVar) {
                K = new hv0(jp0Var, null, 29);
                oq5Var.k0(K);
            }
            bzf.c((Function1) K, oq5Var, 0);
            boolean z3 = i3 == 32;
            Object K2 = oq5Var.K();
            if (z3 || K2 == kjnVar) {
                K2 = new eiq(jp0Var, 0);
                oq5Var.k0(K2);
            }
            pd.c(0, 1, oq5Var, (Function0) K2, false);
            wn5Var.invoke(ild.C(-19412033, new t2n(13, str, jp0Var, wn5Var2), oq5Var), oq5Var, Integer.valueOf(((i2 >> 9) & 112) | 6));
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new diq(str, jp0Var, z, wn5Var, wn5Var2, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x019b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void h(y8p y8pVar, hq5 hq5Var, int i) {
        final y8p y8pVar2;
        oq5 oq5Var;
        rhs rhsVar;
        kjn kjnVar;
        boolean z;
        int i2;
        kjn kjnVar2;
        int i3;
        Object K;
        boolean z2;
        Object K2;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(1787094051);
        int i4 = i | (oq5Var2.f(y8pVar) ? 4 : 2);
        if (oq5Var2.P(i4 & 1, (i4 & 3) != 2)) {
            rhs rhsVar2 = (rhs) szf.Q((xdr) y8pVar.c, oq5Var2).getValue();
            gz2 gz2Var = b2c.o;
            vci vciVar = vci.a;
            float f = 32;
            yci n = androidx.compose.foundation.layout.a.n(androidx.compose.ui.platform.a.a(vciVar, "time_picker"), 20, f);
            ta5 a2 = sa5.a(qx0.c, gz2Var, oq5Var2, 48);
            int i5 = oq5Var2.P;
            androidx.compose.runtime.internal.a l = oq5Var2.l();
            yci H = vnj.H(oq5Var2, n);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var2.d0();
            if (oq5Var2.O) {
                oq5Var2.k(grbVar);
            } else {
                oq5Var2.n0();
            }
            kb5 kb5Var = wp5.f;
            g0g.U(oq5Var2, a2, kb5Var);
            kb5 kb5Var2 = wp5.e;
            g0g.U(oq5Var2, l, kb5Var2);
            kb5 kb5Var3 = wp5.g;
            if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i5))) {
                ouj.x(i5, oq5Var2, i5, kb5Var3);
            }
            kb5 kb5Var4 = wp5.d;
            g0g.U(oq5Var2, H, kb5Var4);
            Object K3 = oq5Var2.K();
            kjn kjnVar3 = gq5.a;
            if (K3 == kjnVar3) {
                K3 = new d5s(29);
                oq5Var2.k0(K3);
            }
            yci b2 = nfp.b(vciVar, false, (Function1) K3);
            String M = rvf.M(R.string.timer_title, oq5Var2);
            ges c2 = nu0.c();
            agr agrVar = eq0.a;
            xcs.b(M, b2, ((dq0) oq5Var2.j(agrVar)).b.a, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2, oq5Var2, 0, 0, 65528);
            oq5 oq5Var3 = oq5Var2;
            u1g.l(oq5Var3, d.e(vciVar, f));
            boolean z3 = rhsVar2.b;
            boolean z4 = rhsVar2.c;
            if (z3) {
                oq5Var3.Z(1568323110);
                yci d = d.d(vciVar, 1.0f);
                meo meoVar = new meo(2);
                int i6 = i4 & 14;
                boolean f2 = (i6 == 4) | oq5Var3.f(rhsVar2);
                Object K4 = oq5Var3.K();
                if (f2) {
                    kjnVar2 = kjnVar3;
                } else {
                    kjnVar2 = kjnVar3;
                    if (K4 != kjnVar2) {
                        yci q = vnj.q(d, new jdp(z4, meoVar, (Function1) K4, 3));
                        nho a3 = lho.a(qx0.g, b2c.l, oq5Var3, 54);
                        i3 = oq5Var3.P;
                        androidx.compose.runtime.internal.a l2 = oq5Var3.l();
                        yci H2 = vnj.H(oq5Var3, q);
                        oq5Var3.d0();
                        if (oq5Var3.O) {
                            oq5Var3.n0();
                        } else {
                            oq5Var3.k(grbVar);
                        }
                        g0g.U(oq5Var3, a3, kb5Var);
                        g0g.U(oq5Var3, l2, kb5Var2);
                        if (!oq5Var3.O || !Intrinsics.d(oq5Var3.K(), Integer.valueOf(i3))) {
                            ouj.x(i3, oq5Var3, i3, kb5Var3);
                        }
                        g0g.U(oq5Var3, H2, kb5Var4);
                        kjnVar = kjnVar2;
                        xcs.b(rvf.M(R.string.timer_end_of_entity, oq5Var3), null, ((dq0) oq5Var3.j(agrVar)).b.a, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, nu0.j(), oq5Var3, 0, 0, 65530);
                        yci c3 = b.c(androidx.compose.ui.platform.a.a(vciVar, "end_of_entity_switch"), "end_of_entity_switch_state", Boolean.valueOf(z4));
                        K = oq5Var3.K();
                        if (K != kjnVar) {
                            z = false;
                            K = new phs(0 == true ? 1 : 0);
                            oq5Var3.k0(K);
                        } else {
                            z = false;
                        }
                        yci b3 = nfp.b(c3, z, (Function1) K);
                        rhsVar = rhsVar2;
                        boolean z5 = rhsVar.c;
                        i2 = 4;
                        z2 = i6 == 4 ? z ? 1 : 0 : true;
                        K2 = oq5Var3.K();
                        if (!z2 || K2 == kjnVar) {
                            y8pVar2 = y8pVar;
                            final int i7 = z ? 1 : 0;
                            K2 = new Function1() { // from class: qhs
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    Object value;
                                    switch (i7) {
                                        case 0:
                                            y8pVar2.h(((Boolean) obj).booleanValue());
                                            break;
                                        default:
                                            long j = ((nsa) obj).a;
                                            bis bisVar = (bis) y8pVar2.b;
                                            xdr xdrVar = bisVar.d;
                                            do {
                                                value = xdrVar.getValue();
                                            } while (!xdrVar.k(value, rhs.a((rhs) value, j, false, false, false, 10)));
                                            if (bisVar.b().e.getValue() instanceof kjs) {
                                                bisVar.b().a(hyf.H(((rhs) bisVar.e.getValue()).a));
                                            }
                                            break;
                                    }
                                    return Unit.a;
                                }
                            };
                            oq5Var3.k0(K2);
                        } else {
                            y8pVar2 = y8pVar;
                        }
                        uvr.a(z5, (Function1) K2, b3, false, null, oq5Var3, 0, 56);
                        oq5Var3 = oq5Var3;
                        oq5Var3.p(true);
                    }
                }
                K4 = new wes(1, y8pVar, rhsVar2);
                oq5Var3.k0(K4);
                yci q2 = vnj.q(d, new jdp(z4, meoVar, (Function1) K4, 3));
                nho a32 = lho.a(qx0.g, b2c.l, oq5Var3, 54);
                i3 = oq5Var3.P;
                androidx.compose.runtime.internal.a l22 = oq5Var3.l();
                yci H22 = vnj.H(oq5Var3, q2);
                oq5Var3.d0();
                if (oq5Var3.O) {
                }
                g0g.U(oq5Var3, a32, kb5Var);
                g0g.U(oq5Var3, l22, kb5Var2);
                if (!oq5Var3.O) {
                }
                ouj.x(i3, oq5Var3, i3, kb5Var3);
                g0g.U(oq5Var3, H22, kb5Var4);
                kjnVar = kjnVar2;
                xcs.b(rvf.M(R.string.timer_end_of_entity, oq5Var3), null, ((dq0) oq5Var3.j(agrVar)).b.a, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, nu0.j(), oq5Var3, 0, 0, 65530);
                yci c32 = b.c(androidx.compose.ui.platform.a.a(vciVar, "end_of_entity_switch"), "end_of_entity_switch_state", Boolean.valueOf(z4));
                K = oq5Var3.K();
                if (K != kjnVar) {
                }
                yci b32 = nfp.b(c32, z, (Function1) K);
                rhsVar = rhsVar2;
                boolean z52 = rhsVar.c;
                i2 = 4;
                if (i6 == 4) {
                }
                K2 = oq5Var3.K();
                if (z2) {
                }
                y8pVar2 = y8pVar;
                final int i72 = z ? 1 : 0;
                K2 = new Function1() { // from class: qhs
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Object value;
                        switch (i72) {
                            case 0:
                                y8pVar2.h(((Boolean) obj).booleanValue());
                                break;
                            default:
                                long j = ((nsa) obj).a;
                                bis bisVar = (bis) y8pVar2.b;
                                xdr xdrVar = bisVar.d;
                                do {
                                    value = xdrVar.getValue();
                                } while (!xdrVar.k(value, rhs.a((rhs) value, j, false, false, false, 10)));
                                if (bisVar.b().e.getValue() instanceof kjs) {
                                    bisVar.b().a(hyf.H(((rhs) bisVar.e.getValue()).a));
                                }
                                break;
                        }
                        return Unit.a;
                    }
                };
                oq5Var3.k0(K2);
                uvr.a(z52, (Function1) K2, b32, false, null, oq5Var3, 0, 56);
                oq5Var3 = oq5Var3;
                oq5Var3.p(true);
            } else {
                y8pVar2 = y8pVar;
                rhsVar = rhsVar2;
                kjnVar = kjnVar3;
                z = false;
                i2 = 4;
                oq5Var3.Z(1565714677);
            }
            oq5Var3.p(z);
            long j = rhsVar.a;
            boolean z6 = rhsVar.c;
            boolean z7 = rhsVar.d;
            int i8 = i4 & 14;
            boolean z8 = i8 != i2 ? z ? 1 : 0 : true;
            Object K5 = oq5Var3.K();
            if (z8 || K5 == kjnVar) {
                final int i9 = 1;
                K5 = new Function1() { // from class: qhs
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Object value;
                        switch (i9) {
                            case 0:
                                y8pVar2.h(((Boolean) obj).booleanValue());
                                break;
                            default:
                                long j2 = ((nsa) obj).a;
                                bis bisVar = (bis) y8pVar2.b;
                                xdr xdrVar = bisVar.d;
                                do {
                                    value = xdrVar.getValue();
                                } while (!xdrVar.k(value, rhs.a((rhs) value, j2, false, false, false, 10)));
                                if (bisVar.b().e.getValue() instanceof kjs) {
                                    bisVar.b().a(hyf.H(((rhs) bisVar.e.getValue()).a));
                                }
                                break;
                        }
                        return Unit.a;
                    }
                };
                oq5Var3.k0(K5);
            }
            oq5 oq5Var4 = oq5Var3;
            hyf.k(j, z7, z6, (Function1) K5, oq5Var4, 0);
            oq5Var = oq5Var4;
            u1g.l(oq5Var, d.e(vciVar, 24));
            yci c4 = b.c(androidx.compose.ui.platform.a.a(vciVar, "time_picker_button"), "timer_on", Boolean.valueOf(rhsVar.d));
            if (i8 == i2) {
                z = true;
            }
            Object K6 = oq5Var.K();
            if (z || K6 == kjnVar) {
                K6 = new wfs(1, y8pVar2);
                oq5Var.k0(K6);
            }
            hdg.n(384, 0, ild.C(777374236, new tik(28, rhsVar), oq5Var), oq5Var, c4, (Function0) K6);
            WeakHashMap weakHashMap = rqv.w;
            u1g.l(oq5Var, s7g.F(z7l.h(oq5Var).e));
            oq5Var.p(true);
        } else {
            y8pVar2 = y8pVar;
            oq5Var = oq5Var2;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new f5r(y8pVar2, i, 8);
        }
    }

    public static final void i(b0t b0tVar, yci yciVar, long j, hq5 hq5Var, int i) {
        yci yciVar2;
        long j2;
        yci yciVar3;
        long j3;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(882934054);
        int i2 = i | (oq5Var.h(b0tVar) ? 4 : 2) | 176;
        if (oq5Var.P(i2 & 1, (i2 & 147) != 146)) {
            oq5Var.U();
            if ((i & 1) == 0 || oq5Var.y()) {
                long j4 = ((dq0) oq5Var.j(eq0.a)).a.f;
                yciVar3 = vci.a;
                j3 = j4;
            } else {
                oq5Var.S();
                yciVar3 = yciVar;
                j3 = j;
            }
            oq5Var.q();
            if (b0tVar instanceof a0t) {
                oq5Var.Z(1108950379);
                ocg.g(((a0t) b0tVar).a, androidx.compose.foundation.layout.a.m(d.m(yciVar3, ff7.P(v7g.z(16), oq5Var)), ff7.P(v7g.z(1), oq5Var)), ff7.P(v7g.z(2), oq5Var), oq5Var, 0, 0);
                oq5Var.p(false);
            } else {
                if (!b0tVar.equals(b3i.k)) {
                    throw vz1.i(oq5Var, -1903892070, false);
                }
                oq5Var.Z(1109330811);
                irf.r(a0g.E(R.drawable.ic_check_16, 0, oq5Var), null, d.m(yciVar3, ff7.P(v7g.z(16), oq5Var)), null, null, 0.0f, new d43(j3, 5), oq5Var, 48, 56);
                oq5Var = oq5Var;
                oq5Var.p(false);
            }
            yciVar2 = yciVar3;
            j2 = j3;
        } else {
            oq5Var.S();
            yciVar2 = yciVar;
            j2 = j;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new dj(b0tVar, yciVar2, j2, i, 4);
        }
    }

    public static final void j(String str, hq5 hq5Var, int i) {
        String str2;
        str.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1758459462);
        int i2 = (oq5Var.f(str) ? 4 : 2) | i;
        if (oq5Var.P(i2 & 1, (i2 & 3) != 2)) {
            String M = rvf.M(R.string.expand_more, oq5Var);
            ges j = nu0.j();
            agr agrVar = eq0.a;
            str2 = str;
            p0q.a(str2, j, ((dq0) oq5Var.j(agrVar)).b.a, ((dq0) oq5Var.j(agrVar)).b.d, M, M, androidx.compose.foundation.layout.a.o(vci.a, 16, 0.0f, 2), oq5Var, (i2 & 14) | 113246256, 0);
        } else {
            str2 = str;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new da1(str2, i, 18);
        }
    }

    public static final void k(cjt cjtVar, njt njtVar, tmb tmbVar, hq5 hq5Var, int i) {
        cjtVar.getClass();
        njtVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-144376607);
        int i2 = i | (oq5Var.h(cjtVar) ? 4 : 2) | (oq5Var.h(njtVar) ? 32 : 16) | (oq5Var.h(tmbVar) ? 256 : 128);
        if (oq5Var.P(i2 & 1, (i2 & 147) != 146)) {
            mxo a2 = hvf.a(0, 0, oq5Var, 0, 3);
            mxo a3 = wsf.a(oq5Var);
            mxo mxoVar = cjtVar.c == rht.a ? a2 : a3;
            qxo.c(mxoVar, "UniversalEntities", oq5Var, 48);
            pm0.a(null, ild.C(-1115632584, new fv(njtVar, tmbVar, (sjt) gld.M(njtVar.g, oq5Var).getValue(), mxoVar, cjtVar, a2, irv.i(oq5Var), (Object) null, a3, 2), oq5Var), oq5Var, 48, 1);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new kws(cjtVar, njtVar, tmbVar, i, 5);
        }
    }

    public static final void l(njt njtVar, tmb tmbVar, sjt sjtVar, mxo mxoVar, boolean z, wn5 wn5Var, hq5 hq5Var, int i) {
        String str;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1399399489);
        int i2 = i | (oq5Var.h(njtVar) ? 4 : 2) | (oq5Var.h(tmbVar) ? 32 : 16) | (oq5Var.h(sjtVar) ? 256 : 128) | (oq5Var.h(mxoVar) ? 2048 : 1024) | (oq5Var.g(z) ? 16384 : RemoteCameraConfig.Notification.ID);
        if (oq5Var.P(i2 & 1, (i2 & 74899) != 74898)) {
            boolean z2 = sjtVar instanceof qjt;
            String str2 = (!z2 || (str = ((qjt) sjtVar).a) == null) ? "" : str;
            ogp ogpVar = ogp.g;
            boolean z3 = sjtVar instanceof rjt;
            qjt qjtVar = z2 ? (qjt) sjtVar : null;
            Object obj = qjtVar != null ? qjtVar.b : null;
            ogpVar.e(z3, (obj instanceof djt ? (djt) obj : null) != null, null, oq5Var, 4096, 4);
            oq5Var = oq5Var;
            boolean h = oq5Var.h(njtVar);
            Object K = oq5Var.K();
            if (h || K == gq5.a) {
                zhs zhsVar = new zhs(0, njtVar, njt.class, "onBack", "onBack()V", 0, 20);
                oq5Var.k0(zhsVar);
                K = zhsVar;
            }
            xp3.d(str2, mxoVar, null, null, (Function0) ((h9f) K), null, !z, false, null, null, null, ild.C(175864823, new zv5(njtVar, z, sjtVar, tmbVar, wn5Var), oq5Var), oq5Var, (i2 >> 6) & 112, 48, 1964);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new k5b(njtVar, tmbVar, sjtVar, mxoVar, z, wn5Var, i);
        }
    }

    public static final void m(yci yciVar, hq5 hq5Var, int i) {
        int i2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-823290127);
        if ((i & 6) == 0) {
            i2 = (oq5Var.f(yciVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && oq5Var.z()) {
            oq5Var.S();
        } else {
            iz2 iz2Var = b2c.f;
            yci d = d.d(yciVar, 1.0f);
            kfh d2 = ug3.d(iz2Var, false);
            int i3 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, d);
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
            g0g.U(oq5Var, l, kb5Var2);
            kb5 kb5Var3 = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var, i3, kb5Var3);
            }
            kb5 kb5Var4 = wp5.d;
            g0g.U(oq5Var, H, kb5Var4);
            nho a2 = lho.a(qx0.e, b2c.l, oq5Var, 54);
            int i4 = oq5Var.P;
            androidx.compose.runtime.internal.a l2 = oq5Var.l();
            yci H2 = vnj.H(oq5Var, vci.a);
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a2, kb5Var);
            g0g.U(oq5Var, l2, kb5Var2);
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var, i4, kb5Var3);
            }
            g0g.U(oq5Var, H2, kb5Var4);
            yme ymeVar = new yme(new psk(4, v7g.z(16), v7g.z(16)), irf.e);
            yme ymeVar2 = new yme(new psk(4, v7g.z(8), v7g.z(16)), irf.f);
            oq5Var.Z(595243542);
            kn0 kn0Var = new kn0();
            u2x.s(kn0Var, "prefixIcon");
            u2x.s(kn0Var, "spacer");
            neg.l(oq5Var);
            neg.r(oq5Var);
            String M = rvf.M(R.string.informers_slow_network_with_offline_wave_playing_text, oq5Var);
            d85 d85Var = new d85(neg.m(oq5Var).b.b);
            M.getClass();
            oq5Var.Z(-492313982);
            mn0 m = o8g.m(M, d85Var.a, oq5Var, 0 & 126, 0);
            oq5Var.p(false);
            kn0Var.b(m);
            mn0 h = kn0Var.h();
            oq5Var.p(false);
            xv7.i(h, null, neg.m(oq5Var).b.a, 0L, 0L, 3, 0L, 2, false, 2, 0, uah.e(new Pair("prefixIcon", ymeVar), new Pair("spacer", ymeVar2)), null, ges.b(((zn2) oq5Var.j(ao2.a)).d.a, 0L, 0L, null, null, 0L, 0, 0L, null, new h6g(17, e6g.b), 0, 0, 15728639), null, null, oq5Var, 0, 3120, 874234);
            oq5Var = oq5Var;
            oq5Var.p(true);
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new jm0(yciVar, i, 17);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x026a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01eb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0238 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void n(final xcv xcvVar, final yci yciVar, final tdv tdvVar, long j, final xfv xfvVar, cgv cgvVar, zev zevVar, cev cevVar, g4n g4nVar, boolean z, hq5 hq5Var, final int i, final int i2, final int i3) {
        int i4;
        long j2;
        xfv xfvVar2;
        cgv cgvVar2;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        long j3;
        cev cevVar2;
        g4n g4nVar2;
        boolean z2;
        zev zevVar2;
        cgv cgvVar3;
        Object K;
        Object obj;
        boolean f;
        Object K2;
        Object K3;
        Object K4;
        boolean z3;
        Object K5;
        boolean f2;
        Object K6;
        final long j4;
        final cgv cgvVar4;
        final zev zevVar3;
        final cev cevVar3;
        final g4n g4nVar3;
        final boolean z4;
        xmn r;
        int i11;
        xcvVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(613405036);
        if ((i & 6) == 0) {
            i4 = (oq5Var.f(xcvVar) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= oq5Var.d(R.string.error_open_bank_application) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i4 |= oq5Var.f(yciVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i4 |= (i & 4096) == 0 ? oq5Var.f(tdvVar) : oq5Var.h(tdvVar) ? 2048 : 1024;
        }
        int i12 = i3 & 16;
        if (i12 != 0) {
            i4 |= 24576;
        } else if ((i & 24576) == 0) {
            j2 = j;
            i4 |= oq5Var.e(j2) ? 16384 : RemoteCameraConfig.Notification.ID;
            if ((196608 & i) != 0) {
                xfvVar2 = xfvVar;
                i4 |= oq5Var.f(xfvVar2) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
            } else {
                xfvVar2 = xfvVar;
            }
            if ((1572864 & i) != 0) {
                if ((i3 & 64) == 0) {
                    cgvVar2 = cgvVar;
                    if (oq5Var.f(cgvVar2)) {
                        i11 = 1048576;
                        i4 |= i11;
                    }
                } else {
                    cgvVar2 = cgvVar;
                }
                i11 = 524288;
                i4 |= i11;
            } else {
                cgvVar2 = cgvVar;
            }
            i5 = i3 & 128;
            int i13 = 12582912;
            if (i5 == 0) {
                if ((i & 12582912) == 0) {
                    i13 = (i & 16777216) == 0 ? oq5Var.f(zevVar) : oq5Var.h(zevVar) ? 8388608 : RemoteCameraConfig.Camera.BITRATE;
                }
                i6 = i3 & 256;
                if (i6 != 0) {
                    i4 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    i4 |= oq5Var.f(cevVar) ? 67108864 : 33554432;
                }
                i7 = i3 & RemoteCameraConfig.Mic.BUFFER_SIZE;
                int i14 = 805306368;
                if (i7 == 0) {
                    if ((i & 805306368) == 0) {
                        i14 = (i & 1073741824) == 0 ? oq5Var.f(g4nVar) : oq5Var.h(g4nVar) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
                    }
                    i8 = i3 & 1024;
                    if (i8 == 0) {
                        i10 = 6;
                        i9 = i8;
                    } else if ((i2 & 6) == 0) {
                        i9 = i8;
                        i10 = i2 | (oq5Var.g(z) ? 4 : 2);
                    } else {
                        i9 = i8;
                        i10 = i2;
                    }
                    if ((i4 & 306783379) != 306783378 && (i10 & 3) == 2 && oq5Var.z()) {
                        oq5Var.S();
                        zevVar3 = zevVar;
                        cevVar3 = cevVar;
                        g4nVar3 = g4nVar;
                        j4 = j2;
                        cgvVar4 = cgvVar2;
                        z4 = z;
                    } else {
                        oq5Var.U();
                        Continuation continuation = null;
                        if ((i & 1) != 0 || oq5Var.y()) {
                            j3 = i12 == 0 ? d85.m : j2;
                            if ((i3 & 64) != 0) {
                                i4 &= -3670017;
                                cgvVar2 = wyf.a0(oq5Var);
                            }
                            zev zevVar4 = i5 == 0 ? null : zevVar;
                            cevVar2 = i6 == 0 ? null : cevVar;
                            g4nVar2 = i7 == 0 ? null : g4nVar;
                            if (i9 == 0) {
                                zevVar2 = zevVar4;
                                cgvVar3 = cgvVar2;
                                z2 = false;
                            } else {
                                z2 = z;
                                zevVar2 = zevVar4;
                                cgvVar3 = cgvVar2;
                            }
                        } else {
                            oq5Var.S();
                            if ((i3 & 64) != 0) {
                                i4 &= -3670017;
                            }
                            zevVar2 = zevVar;
                            cevVar2 = cevVar;
                            g4nVar2 = g4nVar;
                            j3 = j2;
                            cgvVar3 = cgvVar2;
                            z2 = z;
                        }
                        oq5Var.q();
                        K = oq5Var.K();
                        obj = gq5.a;
                        if (K == obj) {
                            K = tlm.f(gld.R(g.a, oq5Var), oq5Var);
                        }
                        mm6 mm6Var = ((fs5) K).a;
                        f = oq5Var.f(mm6Var);
                        cev cevVar4 = cevVar2;
                        K2 = oq5Var.K();
                        if (!f || K2 == obj) {
                            K2 = new idv(mm6Var);
                            oq5Var.k0(K2);
                        }
                        idv idvVar = (idv) K2;
                        K3 = oq5Var.K();
                        if (K3 == obj) {
                            K3 = tah.b(new Pair("Accept-Language", xcvVar.c));
                            oq5Var.k0(K3);
                        }
                        Map map = (Map) K3;
                        Object[] objArr = {Unit.a};
                        K4 = oq5Var.K();
                        if (K4 == obj) {
                            K4 = new nev();
                            oq5Var.k0(K4);
                        }
                        nev nevVar = (nev) K4;
                        z3 = (i4 & 14) == 4;
                        K5 = oq5Var.K();
                        int i15 = 14;
                        if (!z3 || K5 == obj) {
                            K5 = new jvu(i15, xcvVar);
                            oq5Var.k0(K5);
                        }
                        Object obj2 = (String) o2g.g0(objArr, nevVar, (Function0) K5, oq5Var, 48, 4);
                        f2 = oq5Var.f(obj2) | oq5Var.f(idvVar);
                        K6 = oq5Var.K();
                        if (!f2 || K6 == obj) {
                            K6 = new l1p(obj2, idvVar, map, continuation, 6);
                            oq5Var.k0(K6);
                        }
                        gld.w(oq5Var, obj2, (Function2) K6);
                        long j5 = j3;
                        g4n g4nVar4 = g4nVar2;
                        o(idvVar, yciVar, tdvVar, j5, xfvVar2, cgvVar3, zevVar2, cevVar4, g4nVar4, z2, oq5Var, 2147483632 & i4, i10 & 14);
                        j4 = j5;
                        cgvVar4 = cgvVar3;
                        zevVar3 = zevVar2;
                        cevVar3 = cevVar4;
                        g4nVar3 = g4nVar4;
                        z4 = z2;
                    }
                    r = oq5Var.r();
                    if (r == null) {
                        r.d = new Function2() { // from class: dev
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                ((Integer) obj4).getClass();
                                int R = rvf.R(i | 1);
                                int R2 = rvf.R(i2);
                                ixf.n(xcv.this, yciVar, tdvVar, j4, xfvVar, cgvVar4, zevVar3, cevVar3, g4nVar3, z4, (hq5) obj3, R, R2, i3);
                                return Unit.a;
                            }
                        };
                        return;
                    }
                    return;
                }
                i4 |= i14;
                i8 = i3 & 1024;
                if (i8 == 0) {
                }
                if ((i4 & 306783379) != 306783378) {
                }
                oq5Var.U();
                Continuation continuation2 = null;
                if ((i & 1) != 0) {
                }
                if (i12 == 0) {
                }
                if ((i3 & 64) != 0) {
                }
                if (i5 == 0) {
                }
                if (i6 == 0) {
                }
                if (i7 == 0) {
                }
                if (i9 == 0) {
                }
                oq5Var.q();
                K = oq5Var.K();
                obj = gq5.a;
                if (K == obj) {
                }
                mm6 mm6Var2 = ((fs5) K).a;
                f = oq5Var.f(mm6Var2);
                cev cevVar42 = cevVar2;
                K2 = oq5Var.K();
                if (!f) {
                }
                K2 = new idv(mm6Var2);
                oq5Var.k0(K2);
                idv idvVar2 = (idv) K2;
                K3 = oq5Var.K();
                if (K3 == obj) {
                }
                Map map2 = (Map) K3;
                Object[] objArr2 = {Unit.a};
                K4 = oq5Var.K();
                if (K4 == obj) {
                }
                nev nevVar2 = (nev) K4;
                if ((i4 & 14) == 4) {
                }
                K5 = oq5Var.K();
                int i152 = 14;
                if (!z3) {
                }
                K5 = new jvu(i152, xcvVar);
                oq5Var.k0(K5);
                Object obj22 = (String) o2g.g0(objArr2, nevVar2, (Function0) K5, oq5Var, 48, 4);
                f2 = oq5Var.f(obj22) | oq5Var.f(idvVar2);
                K6 = oq5Var.K();
                if (!f2) {
                }
                K6 = new l1p(obj22, idvVar2, map2, continuation2, 6);
                oq5Var.k0(K6);
                gld.w(oq5Var, obj22, (Function2) K6);
                long j52 = j3;
                g4n g4nVar42 = g4nVar2;
                o(idvVar2, yciVar, tdvVar, j52, xfvVar2, cgvVar3, zevVar2, cevVar42, g4nVar42, z2, oq5Var, 2147483632 & i4, i10 & 14);
                j4 = j52;
                cgvVar4 = cgvVar3;
                zevVar3 = zevVar2;
                cevVar3 = cevVar42;
                g4nVar3 = g4nVar42;
                z4 = z2;
                r = oq5Var.r();
                if (r == null) {
                }
            }
            i4 |= i13;
            i6 = i3 & 256;
            if (i6 != 0) {
            }
            i7 = i3 & RemoteCameraConfig.Mic.BUFFER_SIZE;
            int i142 = 805306368;
            if (i7 == 0) {
            }
            i4 |= i142;
            i8 = i3 & 1024;
            if (i8 == 0) {
            }
            if ((i4 & 306783379) != 306783378) {
            }
            oq5Var.U();
            Continuation continuation22 = null;
            if ((i & 1) != 0) {
            }
            if (i12 == 0) {
            }
            if ((i3 & 64) != 0) {
            }
            if (i5 == 0) {
            }
            if (i6 == 0) {
            }
            if (i7 == 0) {
            }
            if (i9 == 0) {
            }
            oq5Var.q();
            K = oq5Var.K();
            obj = gq5.a;
            if (K == obj) {
            }
            mm6 mm6Var22 = ((fs5) K).a;
            f = oq5Var.f(mm6Var22);
            cev cevVar422 = cevVar2;
            K2 = oq5Var.K();
            if (!f) {
            }
            K2 = new idv(mm6Var22);
            oq5Var.k0(K2);
            idv idvVar22 = (idv) K2;
            K3 = oq5Var.K();
            if (K3 == obj) {
            }
            Map map22 = (Map) K3;
            Object[] objArr22 = {Unit.a};
            K4 = oq5Var.K();
            if (K4 == obj) {
            }
            nev nevVar22 = (nev) K4;
            if ((i4 & 14) == 4) {
            }
            K5 = oq5Var.K();
            int i1522 = 14;
            if (!z3) {
            }
            K5 = new jvu(i1522, xcvVar);
            oq5Var.k0(K5);
            Object obj222 = (String) o2g.g0(objArr22, nevVar22, (Function0) K5, oq5Var, 48, 4);
            f2 = oq5Var.f(obj222) | oq5Var.f(idvVar22);
            K6 = oq5Var.K();
            if (!f2) {
            }
            K6 = new l1p(obj222, idvVar22, map22, continuation22, 6);
            oq5Var.k0(K6);
            gld.w(oq5Var, obj222, (Function2) K6);
            long j522 = j3;
            g4n g4nVar422 = g4nVar2;
            o(idvVar22, yciVar, tdvVar, j522, xfvVar2, cgvVar3, zevVar2, cevVar422, g4nVar422, z2, oq5Var, 2147483632 & i4, i10 & 14);
            j4 = j522;
            cgvVar4 = cgvVar3;
            zevVar3 = zevVar2;
            cevVar3 = cevVar422;
            g4nVar3 = g4nVar422;
            z4 = z2;
            r = oq5Var.r();
            if (r == null) {
            }
        }
        j2 = j;
        if ((196608 & i) != 0) {
        }
        if ((1572864 & i) != 0) {
        }
        i5 = i3 & 128;
        int i132 = 12582912;
        if (i5 == 0) {
        }
        i4 |= i132;
        i6 = i3 & 256;
        if (i6 != 0) {
        }
        i7 = i3 & RemoteCameraConfig.Mic.BUFFER_SIZE;
        int i1422 = 805306368;
        if (i7 == 0) {
        }
        i4 |= i1422;
        i8 = i3 & 1024;
        if (i8 == 0) {
        }
        if ((i4 & 306783379) != 306783378) {
        }
        oq5Var.U();
        Continuation continuation222 = null;
        if ((i & 1) != 0) {
        }
        if (i12 == 0) {
        }
        if ((i3 & 64) != 0) {
        }
        if (i5 == 0) {
        }
        if (i6 == 0) {
        }
        if (i7 == 0) {
        }
        if (i9 == 0) {
        }
        oq5Var.q();
        K = oq5Var.K();
        obj = gq5.a;
        if (K == obj) {
        }
        mm6 mm6Var222 = ((fs5) K).a;
        f = oq5Var.f(mm6Var222);
        cev cevVar4222 = cevVar2;
        K2 = oq5Var.K();
        if (!f) {
        }
        K2 = new idv(mm6Var222);
        oq5Var.k0(K2);
        idv idvVar222 = (idv) K2;
        K3 = oq5Var.K();
        if (K3 == obj) {
        }
        Map map222 = (Map) K3;
        Object[] objArr222 = {Unit.a};
        K4 = oq5Var.K();
        if (K4 == obj) {
        }
        nev nevVar222 = (nev) K4;
        if ((i4 & 14) == 4) {
        }
        K5 = oq5Var.K();
        int i15222 = 14;
        if (!z3) {
        }
        K5 = new jvu(i15222, xcvVar);
        oq5Var.k0(K5);
        Object obj2222 = (String) o2g.g0(objArr222, nevVar222, (Function0) K5, oq5Var, 48, 4);
        f2 = oq5Var.f(obj2222) | oq5Var.f(idvVar222);
        K6 = oq5Var.K();
        if (!f2) {
        }
        K6 = new l1p(obj2222, idvVar222, map222, continuation222, 6);
        oq5Var.k0(K6);
        gld.w(oq5Var, obj2222, (Function2) K6);
        long j5222 = j3;
        g4n g4nVar4222 = g4nVar2;
        o(idvVar222, yciVar, tdvVar, j5222, xfvVar2, cgvVar3, zevVar2, cevVar4222, g4nVar4222, z2, oq5Var, 2147483632 & i4, i10 & 14);
        j4 = j5222;
        cgvVar4 = cgvVar3;
        zevVar3 = zevVar2;
        cevVar3 = cevVar4222;
        g4nVar3 = g4nVar4222;
        z4 = z2;
        r = oq5Var.r();
        if (r == null) {
        }
    }

    public static final void o(final idv idvVar, final yci yciVar, final tdv tdvVar, final long j, final xfv xfvVar, final cgv cgvVar, final zev zevVar, final cev cevVar, final g4n g4nVar, final boolean z, hq5 hq5Var, final int i, final int i2) {
        int i3;
        yci yciVar2;
        xfv xfvVar2;
        int i4;
        oq5 oq5Var;
        idvVar.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-999043787);
        if ((i & 6) == 0) {
            i3 = (oq5Var2.f(idvVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= oq5Var2.d(R.string.error_open_bank_application) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            yciVar2 = yciVar;
            i3 |= oq5Var2.f(yciVar2) ? 256 : 128;
        } else {
            yciVar2 = yciVar;
        }
        if ((i & 3072) == 0) {
            i3 |= (i & 4096) == 0 ? oq5Var2.f(tdvVar) : oq5Var2.h(tdvVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= oq5Var2.e(j) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((196608 & i) == 0) {
            xfvVar2 = xfvVar;
            i3 |= oq5Var2.f(xfvVar2) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        } else {
            xfvVar2 = xfvVar;
        }
        if ((i & ScreenMirroringConfig.Video.BITRATE_1_5MB) == 0) {
            i3 |= oq5Var2.f(cgvVar) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= (i & 16777216) == 0 ? oq5Var2.f(zevVar) : oq5Var2.h(zevVar) ? 8388608 : RemoteCameraConfig.Camera.BITRATE;
        }
        if ((i & 100663296) == 0) {
            i3 |= oq5Var2.f(cevVar) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= (i & 1073741824) == 0 ? oq5Var2.f(g4nVar) : oq5Var2.h(g4nVar) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (oq5Var2.g(z) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i3 & 306783379) == 306783378 && (i4 & 3) == 2 && oq5Var2.z()) {
            oq5Var2.S();
            oq5Var = oq5Var2;
        } else {
            oq5Var2.U();
            if ((i & 1) != 0 && !oq5Var2.y()) {
                oq5Var2.S();
            }
            oq5Var2.q();
            Context context = (Context) oq5Var2.j(AndroidCompositionLocals_androidKt.b);
            aqi o0 = szf.o0(tdvVar, oq5Var2);
            aqi o02 = szf.o0(zevVar, oq5Var2);
            int i5 = i3 & 234881024;
            boolean z2 = i5 == 67108864;
            Object K = oq5Var2.K();
            kjn kjnVar = gq5.a;
            if (z2 || K == kjnVar) {
                K = new lev(context, o02, cevVar, o0);
                oq5Var2.k0(K);
            }
            lev levVar = (lev) K;
            Object K2 = oq5Var2.K();
            if (K2 == kjnVar) {
                K2 = new kev();
                oq5Var2.k0(K2);
            }
            kev kevVar = (kev) K2;
            boolean z3 = ((1879048192 & i3) == 536870912 || ((i3 & 1073741824) != 0 && oq5Var2.h(g4nVar))) | ((57344 & i3) == 16384) | ((458752 & i3) == 131072) | (i5 == 67108864) | ((i4 & 14) == 4);
            Object K3 = oq5Var2.K();
            if (z3 || K3 == kjnVar) {
                final xfv xfvVar3 = xfvVar2;
                Function1 function1 = new Function1() { // from class: fev
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit unit;
                        WebView webView = (WebView) obj;
                        webView.getClass();
                        webView.setBackgroundColor(c3x.U(j));
                        g4n g4nVar2 = g4nVar;
                        if (g4nVar2 != null) {
                            webView.setDownloadListener(new jev(g4nVar2));
                        }
                        xfv xfvVar4 = xfvVar3;
                        xfvVar4.getClass();
                        boolean z4 = xfvVar4.a;
                        WebSettings settings = webView.getSettings();
                        settings.getClass();
                        settings.setJavaScriptEnabled(z4);
                        settings.setAllowContentAccess(xfvVar4.b);
                        settings.setAllowFileAccess(xfvVar4.c);
                        settings.setDomStorageEnabled(xfvVar4.d);
                        settings.setDatabaseEnabled(xfvVar4.e);
                        settings.setUserAgentString(xfvVar4.f);
                        settings.setBuiltInZoomControls(xfvVar4.g);
                        cev cevVar2 = cevVar;
                        if (cevVar2 != null) {
                            if (z4) {
                                unit = Unit.a;
                            } else {
                                unit = null;
                                su4.s(2, null, "java script must be enabled for Js Bridge", null);
                            }
                            if (unit != null) {
                                webView.addJavascriptInterface(cevVar2.c, cevVar2.a);
                            }
                        }
                        if (z) {
                            webView.getSettings().setSupportMultipleWindows(true);
                        }
                        return Unit.a;
                    }
                };
                oq5Var2.k0(function1);
                K3 = function1;
            }
            Function1 function12 = (Function1) K3;
            Object K4 = oq5Var2.K();
            if (K4 == kjnVar) {
                K4 = new t0v(20);
                oq5Var2.k0(K4);
            }
            Function1 function13 = (Function1) K4;
            Object K5 = oq5Var2.K();
            if (K5 == kjnVar) {
                K5 = new t0v(21);
                oq5Var2.k0(K5);
            }
            oq5Var = oq5Var2;
            ghh.c(cgvVar, idvVar, function12, function13, levVar, kevVar, (Function1) K5, yciVar2, oq5Var, ((i3 >> 18) & 14) | 102239232 | ((i3 << 3) & 112) | ((i3 << 15) & 29360128));
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new Function2() { // from class: gev
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ixf.o(idv.this, yciVar, tdvVar, j, xfvVar, cgvVar, zevVar, cevVar, g4nVar, z, (hq5) obj, rvf.R(i | 1), rvf.R(i2));
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0120 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void p(Object obj, yci yciVar, String str, Function1 function1, Function2 function2, wn5 wn5Var, hq5 hq5Var, int i, int i2) {
        int i3;
        yci yciVar2;
        int i4;
        String str2;
        int i5;
        Function1 function12;
        int i6;
        Function2 function22;
        wn5 wn5Var2;
        Function1 function13;
        int i7;
        boolean z;
        Object K;
        yci yciVar3;
        String str3;
        Function1 function14;
        xmn r;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(596389148);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? oq5Var.f(obj) : oq5Var.h(obj) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            yciVar2 = yciVar;
            i3 |= oq5Var.f(yciVar2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                str2 = str;
                i3 |= oq5Var.f(str2) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    function12 = function1;
                    i3 |= oq5Var.h(function12) ? 2048 : 1024;
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else if ((i & 24576) == 0) {
                        function22 = function2;
                        i3 |= oq5Var.h(function22) ? 16384 : RemoteCameraConfig.Notification.ID;
                        if ((196608 & i) == 0) {
                            wn5Var2 = wn5Var;
                            i3 |= oq5Var.h(wn5Var2) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
                        } else {
                            wn5Var2 = wn5Var;
                        }
                        if ((74899 & i3) == 74898 || !oq5Var.z()) {
                            yci yciVar4 = i8 != 0 ? vci.a : yciVar2;
                            String str4 = i4 != 0 ? "state transition animation" : str2;
                            kjn kjnVar = gq5.a;
                            if (i5 != 0) {
                                Object K2 = oq5Var.K();
                                if (K2 == kjnVar) {
                                    K2 = new jwv(18);
                                    oq5Var.k0(K2);
                                }
                                function13 = (Function1) K2;
                            } else {
                                function13 = function12;
                            }
                            if (i6 != 0) {
                                Object K3 = oq5Var.K();
                                if (K3 == kjnVar) {
                                    K3 = new rea(11);
                                    oq5Var.k0(K3);
                                }
                                function22 = (Function2) K3;
                            }
                            boolean z2 = false;
                            boolean z3 = (i3 & 57344) == 16384;
                            i7 = i3 & 14;
                            if (i7 != 4 || ((i3 & 8) != 0 && oq5Var.h(obj))) {
                                z2 = true;
                            }
                            z = z3 | z2;
                            K = oq5Var.K();
                            if (!z || K == kjnVar) {
                                K = new itv(6, function22, obj);
                                oq5Var.k0(K);
                            }
                            int i9 = i3 << 6;
                            int i10 = (57344 & i9) | (i3 & 8) | 3072 | i7 | (i3 & 112) | (458752 & i9) | ((i3 << 3) & 3670016);
                            yci yciVar5 = yciVar4;
                            androidx.compose.animation.a.b(obj, yciVar5, (Function1) K, b2c.f, str4, function13, wn5Var2, oq5Var, i10, 0);
                            yciVar3 = yciVar5;
                            str3 = str4;
                            function14 = function13;
                        } else {
                            oq5Var.S();
                            yciVar3 = yciVar2;
                            str3 = str2;
                            function14 = function12;
                        }
                        Function2 function23 = function22;
                        r = oq5Var.r();
                        if (r != null) {
                            r.d = new fd1(obj, yciVar3, str3, function14, function23, wn5Var, i, i2);
                            return;
                        }
                        return;
                    }
                    function22 = function2;
                    if ((196608 & i) == 0) {
                    }
                    if ((74899 & i3) == 74898) {
                    }
                    if (i8 != 0) {
                    }
                    if (i4 != 0) {
                    }
                    kjn kjnVar2 = gq5.a;
                    if (i5 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    boolean z22 = false;
                    if ((i3 & 57344) == 16384) {
                    }
                    i7 = i3 & 14;
                    if (i7 != 4) {
                    }
                    z22 = true;
                    z = z3 | z22;
                    K = oq5Var.K();
                    if (!z) {
                    }
                    K = new itv(6, function22, obj);
                    oq5Var.k0(K);
                    int i92 = i3 << 6;
                    int i102 = (57344 & i92) | (i3 & 8) | 3072 | i7 | (i3 & 112) | (458752 & i92) | ((i3 << 3) & 3670016);
                    yci yciVar52 = yciVar4;
                    androidx.compose.animation.a.b(obj, yciVar52, (Function1) K, b2c.f, str4, function13, wn5Var2, oq5Var, i102, 0);
                    yciVar3 = yciVar52;
                    str3 = str4;
                    function14 = function13;
                    Function2 function232 = function22;
                    r = oq5Var.r();
                    if (r != null) {
                    }
                }
                function12 = function1;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                function22 = function2;
                if ((196608 & i) == 0) {
                }
                if ((74899 & i3) == 74898) {
                }
                if (i8 != 0) {
                }
                if (i4 != 0) {
                }
                kjn kjnVar22 = gq5.a;
                if (i5 != 0) {
                }
                if (i6 != 0) {
                }
                boolean z222 = false;
                if ((i3 & 57344) == 16384) {
                }
                i7 = i3 & 14;
                if (i7 != 4) {
                }
                z222 = true;
                z = z3 | z222;
                K = oq5Var.K();
                if (!z) {
                }
                K = new itv(6, function22, obj);
                oq5Var.k0(K);
                int i922 = i3 << 6;
                int i1022 = (57344 & i922) | (i3 & 8) | 3072 | i7 | (i3 & 112) | (458752 & i922) | ((i3 << 3) & 3670016);
                yci yciVar522 = yciVar4;
                androidx.compose.animation.a.b(obj, yciVar522, (Function1) K, b2c.f, str4, function13, wn5Var2, oq5Var, i1022, 0);
                yciVar3 = yciVar522;
                str3 = str4;
                function14 = function13;
                Function2 function2322 = function22;
                r = oq5Var.r();
                if (r != null) {
                }
            }
            str2 = str;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            function12 = function1;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            function22 = function2;
            if ((196608 & i) == 0) {
            }
            if ((74899 & i3) == 74898) {
            }
            if (i8 != 0) {
            }
            if (i4 != 0) {
            }
            kjn kjnVar222 = gq5.a;
            if (i5 != 0) {
            }
            if (i6 != 0) {
            }
            boolean z2222 = false;
            if ((i3 & 57344) == 16384) {
            }
            i7 = i3 & 14;
            if (i7 != 4) {
            }
            z2222 = true;
            z = z3 | z2222;
            K = oq5Var.K();
            if (!z) {
            }
            K = new itv(6, function22, obj);
            oq5Var.k0(K);
            int i9222 = i3 << 6;
            int i10222 = (57344 & i9222) | (i3 & 8) | 3072 | i7 | (i3 & 112) | (458752 & i9222) | ((i3 << 3) & 3670016);
            yci yciVar5222 = yciVar4;
            androidx.compose.animation.a.b(obj, yciVar5222, (Function1) K, b2c.f, str4, function13, wn5Var2, oq5Var, i10222, 0);
            yciVar3 = yciVar5222;
            str3 = str4;
            function14 = function13;
            Function2 function23222 = function22;
            r = oq5Var.r();
            if (r != null) {
            }
        }
        yciVar2 = yciVar;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        str2 = str;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        function12 = function1;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        function22 = function2;
        if ((196608 & i) == 0) {
        }
        if ((74899 & i3) == 74898) {
        }
        if (i8 != 0) {
        }
        if (i4 != 0) {
        }
        kjn kjnVar2222 = gq5.a;
        if (i5 != 0) {
        }
        if (i6 != 0) {
        }
        boolean z22222 = false;
        if ((i3 & 57344) == 16384) {
        }
        i7 = i3 & 14;
        if (i7 != 4) {
        }
        z22222 = true;
        z = z3 | z22222;
        K = oq5Var.K();
        if (!z) {
        }
        K = new itv(6, function22, obj);
        oq5Var.k0(K);
        int i92222 = i3 << 6;
        int i102222 = (57344 & i92222) | (i3 & 8) | 3072 | i7 | (i3 & 112) | (458752 & i92222) | ((i3 << 3) & 3670016);
        yci yciVar52222 = yciVar4;
        androidx.compose.animation.a.b(obj, yciVar52222, (Function1) K, b2c.f, str4, function13, wn5Var2, oq5Var, i102222, 0);
        yciVar3 = yciVar52222;
        str3 = str4;
        function14 = function13;
        Function2 function232222 = function22;
        r = oq5Var.r();
        if (r != null) {
        }
    }

    public static final void q(int i, String str) {
        if (str.charAt(i) == '-') {
            return;
        }
        StringBuilder q = k5r.q(i, "Expected '-' (hyphen) at index ", ", but was '");
        q.append(str.charAt(i));
        q.append('\'');
        throw new IllegalArgumentException(q.toString().toString());
    }

    public static void r(long j, String str) {
        if (j >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " (" + j + ") must be >= 0");
    }

    public static void s(boolean z) {
        if (!z) {
            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
        }
    }

    public static byte[] t(byte[] bArr, byte[] bArr2) {
        if (bArr.length != 32) {
            xq0.x("The key length in bytes must be 32.");
            return null;
        }
        long B = B(0, bArr) & 67108863;
        int i = 3;
        long B2 = (B(3, bArr) >> 2) & 67108611;
        long B3 = (B(6, bArr) >> 4) & 67092735;
        long B4 = (B(9, bArr) >> 6) & 66076671;
        long B5 = (B(12, bArr) >> 8) & 1048575;
        long j = B2 * 5;
        long j2 = B3 * 5;
        long j3 = B4 * 5;
        long j4 = B5 * 5;
        byte[] bArr3 = new byte[17];
        long j5 = 0;
        long j6 = 0;
        long j7 = 0;
        long j8 = 0;
        long j9 = 0;
        int i2 = 0;
        while (i2 < bArr2.length) {
            int min = Math.min(16, bArr2.length - i2);
            System.arraycopy(bArr2, i2, bArr3, 0, min);
            bArr3[min] = 1;
            if (min != 16) {
                Arrays.fill(bArr3, min + 1, 17, (byte) 0);
            }
            long B6 = j9 + (B(0, bArr3) & 67108863);
            long B7 = j5 + ((B(i, bArr3) >> 2) & 67108863);
            long B8 = j6 + ((B(6, bArr3) >> 4) & 67108863);
            long B9 = j7 + ((B(9, bArr3) >> 6) & 67108863);
            long j10 = B2;
            long B10 = j8 + (((B(12, bArr3) >> 8) & 67108863) | (bArr3[16] << 24));
            long j11 = (B10 * j) + (B9 * j2) + (B8 * j3) + (B7 * j4) + (B6 * B);
            long j12 = (B10 * j2) + (B9 * j3) + (B8 * j4) + (B7 * B) + (B6 * j10);
            long j13 = (B10 * j3) + (B9 * j4) + (B8 * B) + (B7 * j10) + (B6 * B3);
            long j14 = (B10 * j4) + (B9 * B) + (B8 * j10) + (B7 * B3) + (B6 * B4);
            long j15 = B9 * j10;
            long j16 = B10 * B;
            long j17 = j12 + (j11 >> 26);
            long j18 = j13 + (j17 >> 26);
            long j19 = j14 + (j18 >> 26);
            long j20 = j16 + j15 + (B8 * B3) + (B7 * B4) + (B6 * B5) + (j19 >> 26);
            long j21 = j20 >> 26;
            j8 = j20 & 67108863;
            long j22 = (j21 * 5) + (j11 & 67108863);
            i2 += 16;
            j6 = j18 & 67108863;
            j7 = j19 & 67108863;
            j9 = j22 & 67108863;
            j5 = (j17 & 67108863) + (j22 >> 26);
            B2 = j10;
            i = 3;
        }
        long j23 = j6 + (j5 >> 26);
        long j24 = j23 & 67108863;
        long j25 = j7 + (j23 >> 26);
        long j26 = j25 & 67108863;
        long j27 = j8 + (j25 >> 26);
        long j28 = j27 & 67108863;
        long j29 = ((j27 >> 26) * 5) + j9;
        long j30 = j29 >> 26;
        long j31 = j29 & 67108863;
        long j32 = (j5 & 67108863) + j30;
        long j33 = j31 + 5;
        long j34 = j33 & 67108863;
        long j35 = j32 + (j33 >> 26);
        long j36 = j24 + (j35 >> 26);
        long j37 = j26 + (j36 >> 26);
        long j38 = j37 & 67108863;
        long j39 = (j28 + (j37 >> 26)) - 67108864;
        long j40 = j39 >> 63;
        long j41 = j31 & j40;
        long j42 = j32 & j40;
        long j43 = j24 & j40;
        long j44 = j26 & j40;
        long j45 = j28 & j40;
        long j46 = ~j40;
        long j47 = j42 | (j35 & 67108863 & j46);
        long j48 = j43 | (j36 & 67108863 & j46);
        long j49 = j44 | (j38 & j46);
        long j50 = (j41 | (j34 & j46) | (j47 << 26)) & 4294967295L;
        long j51 = ((j47 >> 6) | (j48 << 20)) & 4294967295L;
        long j52 = ((j48 >> 12) | (j49 << 14)) & 4294967295L;
        long j53 = ((j49 >> 18) | ((j45 | (j39 & j46)) << 8)) & 4294967295L;
        long B11 = B(16, bArr) + j50;
        long j54 = B11 & 4294967295L;
        long B12 = B(20, bArr) + j51 + (B11 >> 32);
        long B13 = B(24, bArr) + j52 + (B12 >> 32);
        long B14 = (B(28, bArr) + j53 + (B13 >> 32)) & 4294967295L;
        byte[] bArr4 = new byte[16];
        K(0, j54, bArr4);
        K(4, B12 & 4294967295L, bArr4);
        K(8, B13 & 4294967295L, bArr4);
        K(12, B14, bArr4);
        return bArr4;
    }

    public static final SSLSocketFactory u(X509TrustManager x509TrustManager) {
        x509TrustManager.getClass();
        x509TrustManager.getClass();
        try {
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            sSLContext.init(null, new X509TrustManager[]{x509TrustManager}, null);
            SSLSocketFactory socketFactory = sSLContext.getSocketFactory();
            socketFactory.getClass();
            return socketFactory;
        } catch (KeyManagementException e) {
            b6e.o("Failed to initialize SSLContext", e);
            return null;
        } catch (NoSuchAlgorithmException e2) {
            b6e.o("No system TLS", e2);
            return null;
        }
    }

    public static final jbw v(Context context) {
        context.getClass();
        return io0.e(xz0.w(new X509TrustManager[]{dag.t(context, new h88(context), new y9w(28), osg.k0), io0.f(new y21(context))}));
    }

    public static final void w(long j, byte[] bArr, int i, int i2, int i3) {
        int i4 = 7 - i2;
        int i5 = 8 - i3;
        if (i5 > i4) {
            return;
        }
        while (true) {
            int i6 = jxd.a[(int) ((j >> (i4 << 3)) & 255)];
            int i7 = i + 1;
            bArr[i] = (byte) (i6 >> 8);
            i += 2;
            bArr[i7] = (byte) i6;
            if (i4 == i5) {
                return;
            } else {
                i4--;
            }
        }
    }

    public static boolean x() {
        return ((Boolean) k3j.e.getValue()).booleanValue();
    }

    public static long y() {
        l18 l18Var = l18.b;
        bdt I = hag.I(byb.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        Long e = ((k3j) ((byb) qdcVar.C(I)).b(k3j.class)).a().e("loadTimeoutMs");
        if (e != null) {
            return e.longValue();
        }
        return 5000L;
    }

    public abstract void C(int i);

    public abstract void D(Typeface typeface, boolean z);

    public void H(View view, float f) {
        if (a) {
            try {
                mi.I(view, f);
                return;
            } catch (NoSuchMethodError unused) {
                a = false;
            }
        }
        view.setAlpha(f);
    }

    public float z(View view) {
        if (a) {
            try {
                return mi.u(view);
            } catch (NoSuchMethodError unused) {
                a = false;
            }
        }
        return view.getAlpha();
    }
}
