package androidx.compose.ui.viewinterop;

import android.content.Context;
import android.view.View;
import androidx.compose.ui.focus.FocusTargetNode$FocusTargetElement;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import defpackage.af0;
import defpackage.d5;
import defpackage.dzf;
import defpackage.es5;
import defpackage.g0g;
import defpackage.gft;
import defpackage.gq5;
import defpackage.hq5;
import defpackage.j5;
import defpackage.jx7;
import defpackage.kb5;
import defpackage.keu;
import defpackage.koo;
import defpackage.lxe;
import defpackage.moo;
import defpackage.mpf;
import defpackage.mq5;
import defpackage.oj0;
import defpackage.oq5;
import defpackage.ouj;
import defpackage.rj0;
import defpackage.sj0;
import defpackage.syc;
import defpackage.tj0;
import defpackage.vci;
import defpackage.vnj;
import defpackage.woo;
import defpackage.wp5;
import defpackage.xmn;
import defpackage.xof;
import defpackage.xp5;
import defpackage.yci;
import defpackage.ykg;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class a {
    /* JADX WARN: Removed duplicated region for block: B:13:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(int i, int i2, hq5 hq5Var, yci yciVar, Function1 function1, Function1 function12) {
        int i3;
        yci yciVar2;
        int i4;
        Function1 function13;
        yci yciVar3;
        Function1 function14;
        xmn r;
        d5 d5Var = d5.L;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1783766393);
        if ((i & 6) == 0) {
            i3 = (oq5Var.h(function1) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            yciVar2 = yciVar;
            i3 |= oq5Var.f(yciVar2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                function13 = function12;
                i3 |= oq5Var.h(function13) ? 256 : 128;
                if (oq5Var.P(i3 & 1, (i3 & 147) != 146)) {
                    yci yciVar4 = i5 != 0 ? vci.a : yciVar2;
                    Function1 function15 = i4 != 0 ? d5Var : function13;
                    b(function1, yciVar4, null, d5Var, function15, oq5Var, (i3 & 14) | 3072 | (i3 & 112) | ((i3 << 6) & 57344), 4);
                    yciVar3 = yciVar4;
                    function14 = function15;
                } else {
                    oq5Var.S();
                    yciVar3 = yciVar2;
                    function14 = function13;
                }
                r = oq5Var.r();
                if (r != null) {
                    r.d = new rj0((Object) function1, yciVar3, (syc) function14, i, i2, 0);
                    return;
                }
                return;
            }
            function13 = function12;
            if (oq5Var.P(i3 & 1, (i3 & 147) != 146)) {
            }
            r = oq5Var.r();
            if (r != null) {
            }
        }
        yciVar2 = yciVar;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        function13 = function12;
        if (oq5Var.P(i3 & 1, (i3 & 147) != 146)) {
        }
        r = oq5Var.r();
        if (r != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(Function1 function1, yci yciVar, Function1 function12, Function1 function13, Function1 function14, hq5 hq5Var, int i, int i2) {
        int i3;
        yci yciVar2;
        int i4;
        Function1 function15;
        yci yciVar3;
        Function1 function16;
        xmn r;
        Function1 function17;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-180024211);
        j5 j5Var = oq5Var.a;
        if ((i & 6) == 0) {
            i3 = (oq5Var.h(function1) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            yciVar2 = yciVar;
            i3 |= oq5Var.f(yciVar2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                function15 = function12;
                i3 |= oq5Var.h(function15) ? 256 : 128;
                if ((i & 3072) == 0) {
                    i3 |= oq5Var.h(function13) ? 2048 : 1024;
                }
                if ((i & 24576) == 0) {
                    i3 |= oq5Var.h(function14) ? 16384 : RemoteCameraConfig.Notification.ID;
                }
                if (oq5Var.P(i3 & 1, (i3 & 9363) != 9362)) {
                    yci yciVar4 = i5 != 0 ? vci.a : yciVar2;
                    if (i4 != 0) {
                        function15 = null;
                    }
                    int i6 = oq5Var.P;
                    yci f = yciVar4.f(FocusGroupPropertiesElement.a);
                    FocusTargetNode$FocusTargetElement focusTargetNode$FocusTargetElement = FocusTargetNode$FocusTargetElement.a;
                    yci H = vnj.H(oq5Var, f.f(focusTargetNode$FocusTargetElement).f(FocusTargetPropertiesElement.a).f(focusTargetNode$FocusTargetElement));
                    jx7 jx7Var = (jx7) oq5Var.j(es5.h);
                    xof xofVar = (xof) oq5Var.j(es5.n);
                    androidx.compose.runtime.internal.a l = oq5Var.l();
                    dzf dzfVar = (dzf) oq5Var.j(ykg.a);
                    woo wooVar = (woo) oq5Var.j(AndroidCompositionLocals_androidKt.e);
                    if (function15 != null) {
                        oq5Var.Z(607780130);
                        Function0 d = d(function1, oq5Var, i3 & 14);
                        if (!(j5Var instanceof gft)) {
                            lxe.v();
                            throw null;
                        }
                        oq5Var.d0();
                        if (oq5Var.O) {
                            oq5Var.k(d);
                        } else {
                            oq5Var.n0();
                        }
                        function17 = function15;
                        e(oq5Var, H, i6, jx7Var, dzfVar, wooVar, xofVar, l);
                        g0g.U(oq5Var, function17, af0.w);
                        g0g.U(oq5Var, function14, af0.x);
                        g0g.U(oq5Var, function13, af0.y);
                        oq5Var.p(true);
                        oq5Var.p(false);
                    } else {
                        int i7 = i3;
                        function17 = function15;
                        oq5Var.Z(608635513);
                        Function0 d2 = d(function1, oq5Var, i7 & 14);
                        if (!(j5Var instanceof gft)) {
                            lxe.v();
                            throw null;
                        }
                        oq5Var.X();
                        if (oq5Var.O) {
                            oq5Var.k(d2);
                        } else {
                            oq5Var.n0();
                        }
                        e(oq5Var, H, i6, jx7Var, dzfVar, wooVar, xofVar, l);
                        g0g.U(oq5Var, function14, af0.z);
                        g0g.U(oq5Var, function13, af0.A);
                        oq5Var.p(true);
                        oq5Var.p(false);
                    }
                    yci yciVar5 = yciVar4;
                    function16 = function17;
                    yciVar3 = yciVar5;
                } else {
                    oq5Var.S();
                    yciVar3 = yciVar2;
                    function16 = function15;
                }
                r = oq5Var.r();
                if (r != null) {
                    r.d = new sj0(function1, yciVar3, function16, function13, function14, i, i2, 0);
                    return;
                }
                return;
            }
            function15 = function12;
            if ((i & 3072) == 0) {
            }
            if ((i & 24576) == 0) {
            }
            if (oq5Var.P(i3 & 1, (i3 & 9363) != 9362)) {
            }
            r = oq5Var.r();
            if (r != null) {
            }
        }
        yciVar2 = yciVar;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        function15 = function12;
        if ((i & 3072) == 0) {
        }
        if ((i & 24576) == 0) {
        }
        if (oq5Var.P(i3 & 1, (i3 & 9363) != 9362)) {
        }
        r = oq5Var.r();
        if (r != null) {
        }
    }

    public static final keu c(mpf mpfVar) {
        oj0 oj0Var = mpfVar.o;
        if (oj0Var != null) {
            return (keu) oj0Var;
        }
        throw ouj.f("Required value was null.");
    }

    public static final Function0 d(Function1 function1, hq5 hq5Var, int i) {
        oq5 oq5Var = (oq5) hq5Var;
        int i2 = oq5Var.P;
        Context context = (Context) oq5Var.j(AndroidCompositionLocals_androidKt.b);
        mq5 z = lxe.z(oq5Var);
        koo kooVar = (koo) oq5Var.j(moo.a);
        View view = (View) oq5Var.j(AndroidCompositionLocals_androidKt.f);
        boolean h = ((((i & 14) ^ 6) > 4 && oq5Var.f(function1)) || (i & 6) == 4) | oq5Var.h(context) | oq5Var.h(z) | oq5Var.h(kooVar) | oq5Var.d(i2) | oq5Var.h(view);
        Object K = oq5Var.K();
        if (h || K == gq5.a) {
            K = new tj0(i2, 0, context, function1, z, kooVar, view);
            oq5Var.k0(K);
        }
        return (Function0) K;
    }

    public static final void e(hq5 hq5Var, yci yciVar, int i, jx7 jx7Var, dzf dzfVar, woo wooVar, xof xofVar, androidx.compose.runtime.internal.a aVar) {
        xp5.T.getClass();
        g0g.U(hq5Var, aVar, wp5.e);
        g0g.U(hq5Var, yciVar, af0.B);
        g0g.U(hq5Var, jx7Var, af0.C);
        g0g.U(hq5Var, dzfVar, af0.D);
        g0g.U(hq5Var, wooVar, af0.E);
        g0g.U(hq5Var, xofVar, af0.F);
        kb5 kb5Var = wp5.g;
        oq5 oq5Var = (oq5) hq5Var;
        if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i))) {
            ouj.x(i, oq5Var, i, kb5Var);
        }
    }
}
