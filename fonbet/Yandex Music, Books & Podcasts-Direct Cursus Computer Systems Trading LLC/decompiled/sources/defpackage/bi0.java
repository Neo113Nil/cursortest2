package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.compose.ui.layout.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import java.util.UUID;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class bi0 {
    public static final qs5 a = new qs5(e1.E);

    /* JADX WARN: Code restructure failed: missing block: B:45:0x013f, code lost:
    
        if (r7 == r0) goto L63;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(ohm ohmVar, Function0 function0, phm phmVar, wn5 wn5Var, hq5 hq5Var, int i, int i2) {
        int i3;
        Function0 function02;
        oq5 oq5Var;
        Function0 function03;
        xmn r;
        int i4;
        kjn kjnVar;
        boolean z;
        xof xofVar;
        String str;
        boolean z2;
        kjn kjnVar2;
        ohm ohmVar2 = ohmVar;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-830247068);
        if ((i & 6) == 0) {
            i3 = (oq5Var2.f(ohmVar2) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            function02 = function0;
            i3 |= oq5Var2.h(function02) ? 32 : 16;
            if ((i & 384) == 0) {
                i3 |= oq5Var2.f(phmVar) ? 256 : 128;
            }
            if ((i & 3072) == 0) {
                i3 |= oq5Var2.h(wn5Var) ? 2048 : 1024;
            }
            if (oq5Var2.P(i3 & 1, (i3 & 1171) == 1170)) {
                oq5Var = oq5Var2;
                oq5Var.S();
                function03 = function02;
            } else {
                Function0 function04 = i5 != 0 ? null : function02;
                View view = (View) oq5Var2.j(AndroidCompositionLocals_androidKt.f);
                jx7 jx7Var = (jx7) oq5Var2.j(es5.h);
                String str2 = (String) oq5Var2.j(a);
                xof xofVar2 = (xof) oq5Var2.j(es5.n);
                mq5 z3 = lxe.z(oq5Var2);
                aqi o0 = szf.o0(wn5Var, oq5Var2);
                UUID uuid = (UUID) o2g.g0(new Object[0], null, e1.F, oq5Var2, 3072, 6);
                Object K = oq5Var2.K();
                kjn kjnVar3 = gq5.a;
                if (K == kjnVar3) {
                    z = false;
                    kjnVar = kjnVar3;
                    i4 = i3;
                    oq5Var = oq5Var2;
                    xofVar = xofVar2;
                    str = str2;
                    z2 = true;
                    jhm jhmVar = new jhm(function04, phmVar, str, view, jx7Var, ohmVar2, uuid, null, 128, null);
                    ohmVar2 = ohmVar2;
                    jhmVar.s(z3, new wn5(new s30(5, jhmVar, o0), 1302892335, true));
                    oq5Var.k0(jhmVar);
                    K = jhmVar;
                } else {
                    i4 = i3;
                    kjnVar = kjnVar3;
                    oq5Var = oq5Var2;
                    z = false;
                    xofVar = xofVar2;
                    str = str2;
                    z2 = true;
                }
                jhm jhmVar2 = (jhm) K;
                int i6 = i4 & 112;
                int i7 = i4 & 896;
                xof xofVar3 = xofVar;
                boolean h = oq5Var.h(jhmVar2) | (i6 == 32 ? z2 : z) | (i7 == 256 ? z2 : z) | oq5Var.f(str) | oq5Var.f(xofVar3);
                Object K2 = oq5Var.K();
                if (h) {
                    kjnVar2 = kjnVar;
                } else {
                    kjnVar2 = kjnVar;
                }
                K2 = new ii(jhmVar2, function04, phmVar, str, xofVar3);
                oq5Var.k0(K2);
                gld.k(jhmVar2, (Function1) K2, oq5Var);
                boolean h2 = oq5Var.h(jhmVar2) | (i6 == 32 ? z2 : z) | (i7 == 256 ? z2 : z) | oq5Var.f(str) | oq5Var.f(xofVar3);
                Object K3 = oq5Var.K();
                if (h2 || K3 == kjnVar2) {
                    K3 = new vh0(jhmVar2, function04, phmVar, str, xofVar3, 0);
                    oq5Var.k0(K3);
                }
                gld.D((Function0) K3, oq5Var);
                boolean h3 = oq5Var.h(jhmVar2) | ((i4 & 14) == 4 ? z2 : z);
                Object K4 = oq5Var.K();
                if (h3 || K4 == kjnVar2) {
                    K4 = new al(7, jhmVar2, ohmVar2);
                    oq5Var.k0(K4);
                }
                gld.k(ohmVar2, (Function1) K4, oq5Var);
                boolean h4 = oq5Var.h(jhmVar2);
                Object K5 = oq5Var.K();
                if (h4 || K5 == kjnVar2) {
                    K5 = new l5(jhmVar2, (Continuation) null, 20);
                    oq5Var.k0(K5);
                }
                gld.w(oq5Var, jhmVar2, (Function2) K5);
                boolean h5 = oq5Var.h(jhmVar2);
                Object K6 = oq5Var.K();
                if (h5 || K6 == kjnVar2) {
                    K6 = new xh0(jhmVar2, 0);
                    oq5Var.k0(K6);
                }
                yci d = a.d(vci.a, (Function1) K6);
                boolean h6 = oq5Var.h(jhmVar2) | oq5Var.f(xofVar3);
                Object K7 = oq5Var.K();
                if (h6 || K7 == kjnVar2) {
                    K7 = new yh0(0, jhmVar2, xofVar3);
                    oq5Var.k0(K7);
                }
                kfh kfhVar = (kfh) K7;
                int i8 = oq5Var.P;
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
                g0g.U(oq5Var, kfhVar, wp5.f);
                g0g.U(oq5Var, l, wp5.e);
                kb5 kb5Var = wp5.g;
                if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i8))) {
                    ouj.x(i8, oq5Var, i8, kb5Var);
                }
                g0g.U(oq5Var, H, wp5.d);
                oq5Var.p(z2);
                function03 = function04;
            }
            r = oq5Var.r();
            if (r == null) {
                r.d = new zh0(ohmVar2, function03, phmVar, wn5Var, i, i2, 0);
                return;
            }
            return;
        }
        function02 = function0;
        if ((i & 384) == 0) {
        }
        if ((i & 3072) == 0) {
        }
        if (oq5Var2.P(i3 & 1, (i3 & 1171) == 1170)) {
        }
        r = oq5Var.r();
        if (r == null) {
        }
    }

    public static final boolean b(View view) {
        ViewGroup.LayoutParams layoutParams = view.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        return (layoutParams2 == null || (layoutParams2.flags & RemoteCameraConfig.Notification.ID) == 0) ? false : true;
    }
}
