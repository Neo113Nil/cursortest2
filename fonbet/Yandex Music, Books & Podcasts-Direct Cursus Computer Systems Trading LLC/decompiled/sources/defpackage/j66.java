package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Environment;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.foundation.e;
import androidx.compose.foundation.layout.a;
import androidx.compose.foundation.layout.b;
import androidx.compose.foundation.layout.d;
import androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifier;
import androidx.compose.foundation.text.modifiers.SelectableTextAnnotatedStringElement;
import androidx.compose.foundation.text.modifiers.TextAnnotatedStringElement;
import androidx.compose.foundation.text.modifiers.TextStringSimpleElement;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.yandex.music.shared.utils.assertions.Assertions;
import com.yandex.music.shared.utils.assertions.FailedAssertionException;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import ru.yandex.music.R;
import ru.yandex.music.data.audio.WarningContent;
import ru.yandex.music.data.stores.CoverPath;
import ru.yandex.music.data.stores.WebPath$Storage;
import timber.log.Timber;

/* loaded from: classes3.dex */
public abstract class j66 {
    public static final pz1 a = new pz1("3RG+HIeU586EDZPuhy2N/3TNfUTcqDmt8d9FnPsIUyEKAHqMWG3f6izV3+JaKz6r", "iR7kStfGsZmDC5Gxh32JrHWddbWDGndwaM36N1Oq5AxUYW/VrUZfgHMlTFzjDENf");
    public static final pz1 b = new pz1("3BvkGoLGv8jSC8bth3+JrSRloyBpQU17tp/+IZm5Fw4INwzn0cC5WS6i95aEhSha", "2x3iGtec4JyGXJS7hyvar3XEa3lpfwtq9WIIzKX5tWovl06+zun9qMVLxppp/7le");
    public static final wn5 c = new wn5(new fo5(27), 1514175618, false);
    public static final wn5 d = new wn5(new po5(2), 1145404604, false);
    public static final wn5 e = new wn5(new bp5(15), 1734407680, false);
    public static final wn5 f = new wn5(new bp5(16), 697397279, false);
    public static final wn5 g = new wn5(new bp5(17), -339613122, false);
    public static final mb9 h = new mb9(5);
    public static final imp i = new imp();
    public static final i6c j;
    public static final i6c k;
    public static final i6c l;
    public static final i6c[] m;

    static {
        i6c i6cVar = new i6c("auth_api_credentials_begin_sign_in", 9L);
        i6c i6cVar2 = new i6c("auth_api_credentials_sign_out", 2L);
        i6c i6cVar3 = new i6c("auth_api_credentials_authorize", 1L);
        i6c i6cVar4 = new i6c("auth_api_credentials_revoke_access", 1L);
        i6c i6cVar5 = new i6c("auth_api_credentials_save_password", 4L);
        j = i6cVar5;
        i6c i6cVar6 = new i6c("auth_api_credentials_get_sign_in_intent", 6L);
        k = i6cVar6;
        i6c i6cVar7 = new i6c("auth_api_credentials_save_account_linking_token", 3L);
        i6c i6cVar8 = new i6c("auth_api_credentials_get_phone_number_hint_intent", 3L);
        l = i6cVar8;
        m = new i6c[]{i6cVar, i6cVar2, i6cVar3, i6cVar4, i6cVar5, i6cVar6, i6cVar7, i6cVar8};
    }

    public static final void A(bxl bxlVar, Function1 function1, hq5 hq5Var, int i2) {
        int i3;
        boolean z;
        w4k E;
        String n;
        long j2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-512478366);
        int i4 = 2;
        int i5 = i2 | (oq5Var.f(bxlVar) ? 4 : 2) | (oq5Var.h(function1) ? 32 : 16);
        if ((i5 & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
            i3 = 1;
        } else {
            hz2 hz2Var = b2c.l;
            vci vciVar = vci.a;
            yci d2 = d.d(vciVar, 1.0f);
            boolean z2 = ((i5 & 14) == 4) | ((i5 & 112) == 32);
            Object K = oq5Var.K();
            if (z2 || K == gq5.a) {
                K = new hb(i4, function1, bxlVar);
                oq5Var.k0(K);
            }
            yci n2 = a.n(androidx.compose.foundation.a.e(d2, false, null, null, (Function0) K, 7), 16, 8);
            nho a2 = lho.a(qx0.a, hz2Var, oq5Var, 48);
            int i6 = oq5Var.P;
            androidx.compose.runtime.internal.a l2 = oq5Var.l();
            yci H = vnj.H(oq5Var, n2);
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
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i6))) {
                ouj.x(i6, oq5Var, i6, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            String str = bxlVar.c;
            boolean z3 = bxlVar.d;
            irf.y(str, qo6.e, d.m(vciVar, 48), false, false, null, null, null, oq5Var, 432, 248);
            String str2 = bxlVar.b;
            ges j3 = nu0.j();
            agr agrVar = eq0.a;
            long j4 = ((dq0) oq5Var.j(agrVar)).b.a;
            yci o = a.o(vciVar, 12, 0.0f, 2);
            if (1.0f <= 0.0d) {
                qme.a("invalid weight; must be greater than zero");
            }
            i3 = 1;
            xcs.b(str2, vz1.g(1.0f, o, true), j4, 0L, null, 0L, null, null, 0L, 0, false, 1, 0, null, j3, oq5Var, 0, 3072, 57336);
            oq5Var = oq5Var;
            if (z3) {
                oq5Var.Z(1341896913);
                z = false;
                E = a0g.E(R.drawable.ic_check_fill_28, 0, oq5Var);
                oq5Var.p(false);
            } else {
                z = false;
                if (z3) {
                    throw vz1.i(oq5Var, 1341895385, false);
                }
                oq5Var.Z(1341899370);
                E = a0g.E(R.drawable.ic_add_24, 0, oq5Var);
                oq5Var.p(false);
            }
            if (z3) {
                n = vz1.n(oq5Var, 1341904041, R.string.add_remove_button_added_content_description, oq5Var, z);
            } else {
                if (z3) {
                    throw vz1.i(oq5Var, 1341902548, z);
                }
                n = vz1.n(oq5Var, 1341907277, R.string.add_remove_button_not_added_content_description, oq5Var, z);
            }
            if (z3) {
                oq5Var.Z(1341912261);
                j2 = ((dq0) oq5Var.j(agrVar)).a.f;
            } else {
                oq5Var.Z(1341913319);
                j2 = ((dq0) oq5Var.j(agrVar)).a.c;
            }
            oq5Var.p(z);
            gae.b(E, n, d.m(vciVar, 24), j2, oq5Var, 384, 0);
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new a3(bxlVar, function1, i2, i3);
        }
    }

    public static final void B(qbs qbsVar, hq5 hq5Var, int i2) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1436003720);
        int i3 = (oq5Var.h(qbsVar) ? 4 : 2) | i2;
        int i4 = 1;
        int i5 = 0;
        if (oq5Var.P(i3 & 1, (i3 & 3) != 2)) {
            axf axfVar = qbsVar.d;
            if (axfVar != null && ((Boolean) axfVar.o.getValue()).booleanValue()) {
                axf axfVar2 = qbsVar.d;
                mn0 mn0Var = axfVar2 != null ? axfVar2.a.a : null;
                if (mn0Var != null && mn0Var.b.length() > 0) {
                    oq5Var.Z(-289940723);
                    boolean f2 = oq5Var.f(qbsVar);
                    Object K = oq5Var.K();
                    kjn kjnVar = gq5.a;
                    if (f2 || K == kjnVar) {
                        K = new mbs(qbsVar, i5);
                        oq5Var.k0(K);
                    }
                    has hasVar = (has) K;
                    jx7 jx7Var = (jx7) oq5Var.j(es5.h);
                    mnj mnjVar = qbsVar.b;
                    long j2 = qbsVar.k().b;
                    int i6 = rds.c;
                    int d2 = mnjVar.d((int) (j2 >> 32));
                    axf axfVar3 = qbsVar.d;
                    dds d3 = axfVar3 != null ? axfVar3.d() : null;
                    d3.getClass();
                    cds cdsVar = d3.a;
                    float n0 = (jx7Var.n0(ras.a) / 2) + cdsVar.b.b(yhn.d(d2, 0, cdsVar.a.a.b.length())).a;
                    long floatToRawIntBits = (Float.floatToRawIntBits(r1.d) & 4294967295L) | (Float.floatToRawIntBits(n0) << 32);
                    boolean e2 = oq5Var.e(floatToRawIntBits);
                    Object K2 = oq5Var.K();
                    if (e2 || K2 == kjnVar) {
                        K2 = new sl6(floatToRawIntBits);
                        oq5Var.k0(K2);
                    }
                    onj onjVar = (onj) K2;
                    boolean h2 = oq5Var.h(hasVar) | oq5Var.h(qbsVar);
                    Object K3 = oq5Var.K();
                    if (h2 || K3 == kjnVar) {
                        K3 = new ul6(i5, hasVar, qbsVar);
                        oq5Var.k0(K3);
                    }
                    yci a2 = eur.a(vci.a, hasVar, (PointerInputEventHandler) K3);
                    boolean e3 = oq5Var.e(floatToRawIntBits);
                    Object K4 = oq5Var.K();
                    if (e3 || K4 == kjnVar) {
                        K4 = new zf0(floatToRawIntBits, i4);
                        oq5Var.k0(K4);
                    }
                    bg0.a(onjVar, nfp.b(a2, false, (Function1) K4), 0L, oq5Var, 0);
                    oq5Var.p(false);
                }
            }
            oq5Var.Z(-288632802);
            oq5Var.p(false);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new y5(qbsVar, i2, 8);
        }
    }

    public static Object C(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }

    public static void D(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
        }
    }

    public static final void E(qbs qbsVar, boolean z, hq5 hq5Var, int i2) {
        int i3;
        dds d2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(626339208);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var.h(qbsVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var.g(z) ? 32 : 16;
        }
        if (!oq5Var.P(i3 & 1, (i3 & 19) != 18)) {
            oq5Var.S();
        } else if (z) {
            oq5Var.Z(-1290924834);
            axf axfVar = qbsVar.d;
            cds cdsVar = null;
            if (axfVar != null && (d2 = axfVar.d()) != null) {
                cds cdsVar2 = d2.a;
                axf axfVar2 = qbsVar.d;
                if (!(axfVar2 != null ? axfVar2.p : true)) {
                    cdsVar = cdsVar2;
                }
            }
            if (cdsVar == null) {
                oq5Var.Z(-1290601288);
            } else {
                oq5Var.Z(-1290601287);
                if (rds.b(qbsVar.k().b)) {
                    oq5Var.Z(-1684179174);
                    oq5Var.p(false);
                } else {
                    oq5Var.Z(-1685230508);
                    int d3 = qbsVar.b.d((int) (qbsVar.k().b >> 32));
                    int d4 = qbsVar.b.d((int) (qbsVar.k().b & 4294967295L));
                    i2o a2 = cdsVar.a(d3);
                    i2o a3 = cdsVar.a(Math.max(d4 - 1, 0));
                    axf axfVar3 = qbsVar.d;
                    if (axfVar3 == null || !((Boolean) axfVar3.m.getValue()).booleanValue()) {
                        oq5Var.Z(-1684548198);
                        oq5Var.p(false);
                    } else {
                        oq5Var.Z(-1684812473);
                        a0g.u(true, a2, qbsVar, oq5Var, ((i3 << 6) & 896) | 6);
                        oq5Var.p(false);
                    }
                    axf axfVar4 = qbsVar.d;
                    if (axfVar4 == null || !((Boolean) axfVar4.n.getValue()).booleanValue()) {
                        oq5Var.Z(-1684200998);
                        oq5Var.p(false);
                    } else {
                        oq5Var.Z(-1684464312);
                        a0g.u(false, a3, qbsVar, oq5Var, ((i3 << 6) & 896) | 6);
                        oq5Var.p(false);
                    }
                    oq5Var.p(false);
                }
                axf axfVar5 = qbsVar.d;
                if (axfVar5 != null) {
                    x6k x6kVar = axfVar5.l;
                    if (!Intrinsics.d(qbsVar.u.a.b, qbsVar.k().a.b)) {
                        x6kVar.setValue(Boolean.FALSE);
                    }
                    if (axfVar5.b()) {
                        if (((Boolean) x6kVar.getValue()).booleanValue()) {
                            qbsVar.p();
                        } else {
                            qbsVar.l();
                        }
                    }
                }
            }
            oq5Var.p(false);
            oq5Var.p(false);
        } else {
            oq5Var.Z(651160447);
            oq5Var.p(false);
            qbsVar.l();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new rl6(qbsVar, z, i2, 0);
        }
    }

    public static final void F(axf axfVar) {
        pcs pcsVar = axfVar.e;
        if (pcsVar != null) {
            axfVar.v.invoke(ybs.a((ybs) axfVar.d.a, null, 0L, 3));
            lcs lcsVar = pcsVar.a;
            AtomicReference atomicReference = lcsVar.b;
            while (true) {
                if (atomicReference.compareAndSet(pcsVar, null)) {
                    lcsVar.a.b();
                    break;
                } else if (atomicReference.get() != pcsVar) {
                    break;
                }
            }
        }
        axfVar.e = null;
    }

    public static final ArrayList G(List list, Function0 function0) {
        rnj rnjVar;
        if (!((Boolean) function0.invoke()).booleanValue()) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            ffh ffhVar = (ffh) list.get(i2);
            Object n = ffhVar.n();
            n.getClass();
            suh suhVar = ((sds) n).a;
            gds gdsVar = (gds) suhVar.b;
            ln0 ln0Var = (ln0) suhVar.c;
            cds cdsVar = (cds) gdsVar.a.getValue();
            if (cdsVar == null) {
                rnjVar = new rnj(wjp.C, 0, 0);
            } else {
                ln0 c2 = gds.c(ln0Var, cdsVar);
                if (c2 == null) {
                    rnjVar = new rnj(wjp.D, 0, 0);
                } else {
                    aqe W = jf0.W(cdsVar.g(c2.b, c2.c).d());
                    rnjVar = new rnj(new ncs(1, W), W.c - W.a, W.d - W.b);
                }
            }
            int i3 = rnjVar.b;
            int i4 = rnjVar.c;
            arrayList.add(new Pair(ffhVar.M(qld.A(i3, i3, i4, i4)), (uif) rnjVar.d));
        }
        return arrayList;
    }

    public static final void H(lcs lcsVar, axf axfVar, ybs ybsVar, ide ideVar, mnj mnjVar) {
        pt0 pt0Var = axfVar.d;
        nl6 nl6Var = axfVar.v;
        nl6 nl6Var2 = axfVar.w;
        xqn xqnVar = new xqn();
        lma lmaVar = new lma(pt0Var, nl6Var, xqnVar);
        muk mukVar = lcsVar.a;
        mukVar.f(ybsVar, ideVar, lmaVar, nl6Var2);
        pcs pcsVar = new pcs(lcsVar, mukVar);
        lcsVar.b.set(pcsVar);
        xqnVar.a = pcsVar;
        axfVar.e = pcsVar;
        l0(axfVar, ybsVar, mnjVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
    
        if (r9.bottom <= r11.top) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0041, code lost:
    
        if (r8 == 17) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
    
        if (r8 != 66) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0046, code lost:
    
        r10 = g0(r8, r9, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004a, code lost:
    
        if (r8 == 17) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004c, code lost:
    
        if (r8 == 33) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004e, code lost:
    
        if (r8 == 66) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0050, code lost:
    
        if (r8 != 130) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0052, code lost:
    
        r8 = r11.bottom;
        r9 = r9.bottom;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006f, code lost:
    
        if (r10 >= java.lang.Math.max(1, r8 - r9)) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:?, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0058, code lost:
    
        defpackage.xq0.x("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:?, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005c, code lost:
    
        r8 = r11.right;
        r9 = r9.right;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0061, code lost:
    
        r8 = r9.top;
        r9 = r11.top;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0066, code lost:
    
        r8 = r9.left;
        r9 = r11.left;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0031, code lost:
    
        if (r9.right <= r11.left) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0038, code lost:
    
        if (r9.top >= r11.bottom) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x003f, code lost:
    
        if (r9.left >= r11.right) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean K(int i2, Rect rect, Rect rect2, Rect rect3) {
        boolean L = L(i2, rect, rect2);
        if (L(i2, rect, rect3) || !L) {
            return false;
        }
        if (i2 != 17) {
            if (i2 != 33) {
                if (i2 != 66) {
                    if (i2 != 130) {
                        xq0.x("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static boolean L(int i2, Rect rect, Rect rect2) {
        if (i2 != 17) {
            if (i2 != 33) {
                if (i2 != 66) {
                    if (i2 != 130) {
                        xq0.x("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                        return false;
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
    }

    public static final float M(zpd zpdVar, hq5 hq5Var) {
        float f2;
        float f3;
        zpdVar.getClass();
        float f4 = upd.a;
        h6g h6gVar = nu0.a;
        h6g h6gVar2 = h6g.c;
        ges j2 = nu0.j();
        int i2 = zpdVar.a;
        int i3 = zpdVar.c;
        float p = w1g.p(j2, i2, hq5Var, 0, 0);
        int i4 = zpdVar.b;
        if (i4 > 0) {
            oq5 oq5Var = (oq5) hq5Var;
            oq5Var.Z(-336192471);
            f2 = w1g.p(upd.a(), i4, oq5Var, 0, 0) + upd.a;
            oq5Var.p(false);
        } else {
            oq5 oq5Var2 = (oq5) hq5Var;
            oq5Var2.Z(-336016267);
            oq5Var2.p(false);
            f2 = 0;
        }
        float f5 = p + f2;
        if (i3 > 0) {
            oq5 oq5Var3 = (oq5) hq5Var;
            oq5Var3.Z(-335932567);
            f3 = w1g.p(upd.a(), i3, oq5Var3, 0, 0) + upd.a;
            oq5Var3.p(false);
        } else {
            oq5 oq5Var4 = (oq5) hq5Var;
            oq5Var4.Z(-335756363);
            oq5Var4.p(false);
            f3 = 0;
        }
        return f5 + f3;
    }

    public static byte[] N(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return (byte[]) bArr.clone();
    }

    public static void O(Closeable closeable) {
        closeable.getClass();
        try {
            closeable.close();
        } catch (IOException e2) {
            CopyOnWriteArrayList copyOnWriteArrayList = ssg.a;
            Timber.INSTANCE.wtf(e2);
        }
    }

    public static void P(ArrayList arrayList) {
        HashMap hashMap = new HashMap(arrayList.size());
        Iterator it = arrayList.iterator();
        while (true) {
            int i2 = 0;
            if (!it.hasNext()) {
                Iterator it2 = hashMap.values().iterator();
                while (it2.hasNext()) {
                    for (jz6 jz6Var : (Set) it2.next()) {
                        for (ox7 ox7Var : jz6Var.a.c) {
                            if (ox7Var.c == 0) {
                                Set<jz6> set = (Set) hashMap.get(new kz6(ox7Var.a, ox7Var.b == 2));
                                if (set != null) {
                                    for (jz6 jz6Var2 : set) {
                                        jz6Var.b.add(jz6Var2);
                                        jz6Var2.c.add(jz6Var);
                                    }
                                }
                            }
                        }
                    }
                }
                HashSet hashSet = new HashSet();
                Iterator it3 = hashMap.values().iterator();
                while (it3.hasNext()) {
                    hashSet.addAll((Set) it3.next());
                }
                HashSet hashSet2 = new HashSet();
                Iterator it4 = hashSet.iterator();
                while (it4.hasNext()) {
                    jz6 jz6Var3 = (jz6) it4.next();
                    if (jz6Var3.c.isEmpty()) {
                        hashSet2.add(jz6Var3);
                    }
                }
                while (!hashSet2.isEmpty()) {
                    jz6 jz6Var4 = (jz6) hashSet2.iterator().next();
                    hashSet2.remove(jz6Var4);
                    i2++;
                    Iterator it5 = jz6Var4.b.iterator();
                    while (it5.hasNext()) {
                        jz6 jz6Var5 = (jz6) it5.next();
                        jz6Var5.c.remove(jz6Var4);
                        if (jz6Var5.c.isEmpty()) {
                            hashSet2.add(jz6Var5);
                        }
                    }
                }
                if (i2 == arrayList.size()) {
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it6 = hashSet.iterator();
                while (it6.hasNext()) {
                    jz6 jz6Var6 = (jz6) it6.next();
                    if (!jz6Var6.c.isEmpty() && !jz6Var6.b.isEmpty()) {
                        arrayList2.add(jz6Var6.a);
                    }
                }
                throw new qx7("Dependency cycle detected: " + Arrays.toString(arrayList2.toArray()));
            }
            vm5 vm5Var = (vm5) it.next();
            jz6 jz6Var7 = new jz6(vm5Var);
            for (m5n m5nVar : vm5Var.b) {
                boolean z = vm5Var.e == 0;
                kz6 kz6Var = new kz6(m5nVar, !z);
                if (!hashMap.containsKey(kz6Var)) {
                    hashMap.put(kz6Var, new HashSet());
                }
                Set set2 = (Set) hashMap.get(kz6Var);
                if (!set2.isEmpty() && z) {
                    wvs.g(m5nVar, ".", "Multiple components provide ");
                    return;
                }
                set2.add(jz6Var7);
            }
        }
    }

    public static final rdb Q(Enum[] enumArr) {
        enumArr.getClass();
        return new rdb(enumArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00cd, code lost:
    
        if (r8.getClass().getSimpleName().equals((java.lang.String) r11.get(r11.size() - 1)) == false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00fb, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r11, r4) == false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0129, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r11, r5) == false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0149, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r11, r5) == false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0173, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r11, r1) == false) goto L81;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList R(View view, List list, int i2, int i3, String str) {
        List split$default;
        list.getClass();
        str.getClass();
        String str2 = str + '.' + i3;
        ArrayList arrayList = new ArrayList();
        if (view != null) {
            int i4 = 0;
            if (i2 >= list.size()) {
                arrayList.add(new es4(view, str2));
            } else {
                fak fakVar = (fak) list.get(i2);
                String str3 = fakVar.a;
                if (Intrinsics.d(str3, "..")) {
                    ViewParent parent = view.getParent();
                    if (parent instanceof ViewGroup) {
                        ArrayList S = S((ViewGroup) parent);
                        int size = S.size();
                        while (i4 < size) {
                            arrayList.addAll(R((View) S.get(i4), list, i2 + 1, i4, str2));
                            i4++;
                        }
                    }
                } else {
                    if (Intrinsics.d(str3, ".")) {
                        arrayList.add(new es4(view, str2));
                        return arrayList;
                    }
                    int i5 = fakVar.b;
                    int i6 = fakVar.h;
                    if (i5 == -1 || i3 == i5) {
                        if (!Intrinsics.d(view.getClass().getCanonicalName(), str3)) {
                            if (new Regex(".*android\\..*").e(str3)) {
                                split$default = StringsKt__StringsKt.split$default(fakVar.a, new String[]{"."}, false, 0, 6, null);
                                if (!split$default.isEmpty()) {
                                }
                            }
                        }
                        if ((i6 & 1) <= 0 || fakVar.c == view.getId()) {
                            if ((i6 & 2) > 0) {
                                String str4 = fakVar.d;
                                String j2 = qeu.j(view);
                                String e2 = gvt.e(gvt.Y(j2));
                                if (!Intrinsics.d(str4, j2)) {
                                }
                            }
                            if ((i6 & 8) > 0) {
                                String str5 = fakVar.f;
                                String obj = view.getContentDescription() == null ? "" : view.getContentDescription().toString();
                                String e3 = gvt.e(gvt.Y(obj));
                                if (!Intrinsics.d(str5, obj)) {
                                }
                            }
                            if ((i6 & 16) > 0) {
                                String str6 = fakVar.g;
                                String h2 = qeu.h(view);
                                String e4 = gvt.e(gvt.Y(h2));
                                if (!Intrinsics.d(str6, h2)) {
                                }
                            }
                            if ((i6 & 4) > 0) {
                                String str7 = fakVar.e;
                                String obj2 = view.getTag() != null ? view.getTag().toString() : "";
                                String e5 = gvt.e(gvt.Y(obj2));
                                if (!Intrinsics.d(str7, obj2)) {
                                }
                            }
                            if (i2 == list.size() - 1) {
                                arrayList.add(new es4(view, str2));
                            }
                        }
                    }
                }
            }
            if (view instanceof ViewGroup) {
                ArrayList S2 = S((ViewGroup) view);
                int size2 = S2.size();
                while (i4 < size2) {
                    arrayList.addAll(R((View) S2.get(i4), list, i2 + 1, i4, str2));
                    i4++;
                }
            }
        }
        return arrayList;
    }

    public static ArrayList S(ViewGroup viewGroup) {
        ArrayList arrayList = new ArrayList();
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            childAt.getClass();
            if (childAt.getVisibility() == 0) {
                arrayList.add(childAt);
            }
        }
        return arrayList;
    }

    public static ArrayList V(Context context) {
        File[] fileArr;
        lhr lhrVar;
        context.getClass();
        try {
            fileArr = context.getExternalFilesDirs(null);
            fileArr.getClass();
        } catch (Exception e2) {
            ssg.a(7, "ExternalStorageLocations", "exception in getFilesLocations", e2);
            fileArr = new File[0];
        }
        ArrayList arrayList = new ArrayList();
        for (File file : fileArr) {
            if (file != null) {
                String externalStorageState = Environment.getExternalStorageState(file);
                boolean z = true;
                try {
                    z = Environment.isExternalStorageRemovable(file);
                } catch (IllegalArgumentException e3) {
                    ssg.a(7, "ExternalStorageLocations", "exception in addStorageInfo", e3);
                } catch (Exception e4) {
                    ssg.a(7, "ExternalStorageLocations", "exception in addStorageInfo", e4);
                }
                boolean equals = "mounted_ro".equals(externalStorageState);
                ssg.a(3, "ExternalStorageLocations", "getStorageInfo: " + file + ", exist=" + file.exists() + ", state=" + externalStorageState + ", removable=" + z, null);
                lhrVar = new lhr(file, equals, z);
            } else {
                lhrVar = null;
            }
            if (lhrVar != null) {
                arrayList.add(lhrVar);
            }
        }
        return arrayList;
    }

    public static final void a(bci bciVar, ml mlVar, il ilVar, hq5 hq5Var, int i2) {
        il ilVar2;
        oq5 oq5Var;
        bciVar.getClass();
        mlVar.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(1931529407);
        int i3 = i2 | (oq5Var2.h(bciVar) ? 4 : 2) | (oq5Var2.h(mlVar) ? 32 : 16) | (oq5Var2.h(ilVar) ? 256 : 128);
        if ((i3 & 147) == 146 && oq5Var2.z()) {
            oq5Var2.S();
            oq5Var = oq5Var2;
        } else {
            fvf a2 = hvf.a(0, 0, oq5Var2, 0, 3);
            boolean h2 = oq5Var2.h(ilVar);
            Object K = oq5Var2.K();
            if (h2 || K == gq5.a) {
                c3 c3Var = new c3(0, ilVar, il.class, "onDismissed", "onDismissed()V", 0, 6);
                ilVar2 = ilVar;
                oq5Var2.k0(c3Var);
                K = c3Var;
            } else {
                ilVar2 = ilVar;
            }
            oq5Var = oq5Var2;
            yd5.f(null, xee.a, bciVar, a2, (Function0) ((h9f) K), false, false, false, 0L, 0L, 0.0f, ild.C(-748412258, new xk(1, mlVar, a2, ilVar2), oq5Var2), oq5Var, 4480 | ((i3 << 9) & 7168), 4035);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new x3(bciVar, mlVar, ilVar, i2, 3);
        }
    }

    public static final void b(int i2, hq5 hq5Var) {
        oq5 oq5Var;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(1082224428);
        if (i2 == 0 && oq5Var2.z()) {
            oq5Var2.S();
            oq5Var = oq5Var2;
        } else {
            oq5Var = oq5Var2;
            xcs.b(rvf.M(R.string.add_tracks_to_playlist, oq5Var2), androidx.compose.foundation.a.k(d.x(a.n(d.d(vci.a, 1.0f), 16, 20), b2c.f, 2), true, null), ((dq0) oq5Var2.j(eq0.a)).b.a, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, nu0.c(), oq5Var, 48, 0, 65528);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new j3(i2, 3);
        }
    }

    public static final void c(int i2, hq5 hq5Var) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1084706486);
        if (i2 == 0 && oq5Var.z()) {
            oq5Var.S();
        } else {
            iz2 iz2Var = b2c.f;
            vci vciVar = vci.a;
            yci o = a.o(d.d(vciVar, 1.0f), 0.0f, 56, 1);
            kfh d2 = ug3.d(iz2Var, false);
            int i3 = oq5Var.P;
            androidx.compose.runtime.internal.a l2 = oq5Var.l();
            yci H = vnj.H(oq5Var, o);
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
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var, i3, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            pd.g(6, 0, oq5Var, d.m(vciVar, 40));
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new j3(i2, 4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void d(yi1 yi1Var, yci yciVar, hq5 hq5Var, int i2) {
        yci yciVar2;
        ka1 ka1Var;
        List list;
        yi1 yi1Var2;
        yi1 yi1Var3 = yi1Var;
        fkn fknVar = yi1Var3.j;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1386380348);
        if ((((oq5Var.h(yi1Var3) ? 4 : 2) | i2 | 48) & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
            yciVar2 = yciVar;
        } else {
            j0q j0qVar = yi1Var3.o;
            aqi M = gld.M(fknVar, oq5Var);
            mud O = vnj.O(bcb.a(oq5Var), yi1Var3.f, oq5Var);
            ogp.g.e(((fj1) M.getValue()) instanceof zi1, ((fj1) M.getValue()) instanceof bj1, null, oq5Var, 4096, 4);
            fj1 fj1Var = (fj1) M.getValue();
            boolean d2 = Intrinsics.d(fj1Var, bj1.a);
            kjn kjnVar = gq5.a;
            vci vciVar = vci.a;
            if (d2) {
                oq5Var.Z(1252082135);
                yci c2 = d.c(a.q(vciVar, 0.0f, 0.0f, 0.0f, zs4.e(oq5Var), 7), 1.0f);
                kfh d3 = ug3.d(b2c.b, false);
                int i3 = oq5Var.P;
                androidx.compose.runtime.internal.a l2 = oq5Var.l();
                yci H = vnj.H(oq5Var, c2);
                xp5.T.getClass();
                grb grbVar = wp5.b;
                oq5Var.d0();
                if (oq5Var.O) {
                    oq5Var.k(grbVar);
                } else {
                    oq5Var.n0();
                }
                g0g.U(oq5Var, d3, wp5.f);
                g0g.U(oq5Var, l2, wp5.e);
                kb5 kb5Var = wp5.g;
                if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                    ouj.x(i3, oq5Var, i3, kb5Var);
                }
                g0g.U(oq5Var, H, wp5.d);
                String str = yi1Var3.c.D.b;
                boolean h2 = oq5Var.h(yi1Var3);
                Object K = oq5Var.K();
                if (h2 || K == kjnVar) {
                    m71 m71Var = new m71(0, yi1Var3, yi1.class, "onBackClick", "onBackClick()V", 0, 17);
                    oq5Var.k0(m71Var);
                    K = m71Var;
                }
                Function0 function0 = (Function0) ((h9f) K);
                boolean h3 = oq5Var.h(yi1Var3);
                Object K2 = oq5Var.K();
                if (h3 || K2 == kjnVar) {
                    m71 m71Var2 = new m71(0, yi1Var3, yi1.class, "onSearchClick", "onSearchClick()V", 0, 18);
                    oq5Var.k0(m71Var2);
                    K2 = m71Var2;
                }
                Function0 function02 = (Function0) ((h9f) K2);
                boolean h4 = oq5Var.h(yi1Var3);
                Object K3 = oq5Var.K();
                if (h4 || K3 == kjnVar) {
                    m71 m71Var3 = new m71(0, yi1Var3, yi1.class, "onOverflowClick", "onOverflowClick()V", 0, 19);
                    yi1Var2 = yi1Var3;
                    oq5Var.k0(m71Var3);
                    K3 = m71Var3;
                } else {
                    yi1Var2 = yi1Var3;
                }
                yci d4 = d.d(vciVar, 1.0f);
                vciVar = vciVar;
                ot0.a(str, O, function0, function02, (Function0) ((h9f) K3), d4, oq5Var, 196608);
                oq5Var = oq5Var;
                oq5Var.p(true);
                oq5Var.p(false);
                yi1Var3 = yi1Var2;
            } else {
                q0d q0dVar = null;
                Object[] objArr = 0;
                if (fj1Var instanceof aj1) {
                    oq5Var.Z(1252752665);
                    Object value = fknVar.a.getValue();
                    aj1 aj1Var = value instanceof aj1 ? (aj1) value : null;
                    if (aj1Var == null || (ka1Var = aj1Var.a) == null || (list = ka1Var.f) == null || !(!list.isEmpty())) {
                        oq5Var.Z(1252900194);
                        oq5Var.p(false);
                    } else {
                        oq5Var.Z(1252798948);
                        Object K4 = oq5Var.K();
                        if (K4 == kjnVar) {
                            ka1 ka1Var2 = ((aj1) fj1Var).a;
                            ka1Var2.getClass();
                            he1 he1Var = (he1) yi1Var3.h.getValue();
                            h1d h1dVar = (h1d) he1Var.c.getValue();
                            sml smlVar = new sml(new f0d(ka1Var2.f, ka1Var2.e));
                            e0d e0dVar = new e0d(c0d.a, true, false);
                            jfu jfuVar = yi1Var3.b;
                            arf arfVar = (arf) he1Var.b.getValue();
                            arf arfVar2 = (arf) he1Var.d.getValue();
                            qne qneVar = new qne(yi1Var3, ka1Var2);
                            h1dVar.getClass();
                            jfuVar.getClass();
                            arfVar.getClass();
                            arfVar2.getClass();
                            j0qVar.getClass();
                            ye yeVar = new ye(smlVar, e0dVar, arfVar, arfVar2, 19);
                            lm4 a2 = ern.a(c1d.class);
                            wz wzVar = new wz(29, yeVar);
                            gs6 gs6Var = gs6.b;
                            gs6Var.getClass();
                            bjt bjtVar = new bjt(jfuVar, wzVar, gs6Var);
                            String f2 = a2.f();
                            if (f2 == null) {
                                xq0.x("Local and anonymous classes can not be ViewModels");
                                return;
                            } else {
                                r0d r0dVar = new r0d((c1d) bjtVar.j(a2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(f2)), qneVar, j0qVar);
                                oq5Var.k0(r0dVar);
                                K4 = r0dVar;
                            }
                        }
                        q0dVar = (q0d) K4;
                        oq5Var.p(false);
                    }
                    aj1 aj1Var2 = (aj1) fj1Var;
                    ivd f0 = etn.f0(aj1Var2.a.c, O, j0qVar, oq5Var, 0, 8);
                    boolean booleanValue = ((Boolean) gld.M(yi1Var3.n, oq5Var).getValue()).booleanValue();
                    boolean h5 = oq5Var.h(yi1Var3);
                    Object K5 = oq5Var.K();
                    if (h5 || K5 == kjnVar) {
                        yi1Var3 = yi1Var;
                        m71 m71Var4 = new m71(0, yi1Var3, yi1.class, "onRefresh", "onRefresh()V", 0, 20);
                        oq5Var.k0(m71Var4);
                        K5 = m71Var4;
                    } else {
                        yi1Var3 = yi1Var3;
                    }
                    bcx.j(booleanValue, (Function0) ((h9f) K5), ild.C(123847530, new md1(aj1Var2, f0, yi1Var3, q0dVar), oq5Var), oq5Var, 384);
                    oq5Var.p(false);
                    oq5Var = oq5Var;
                } else {
                    yi1Var3 = yi1Var3;
                    if (fj1Var instanceof cj1) {
                        oq5Var.Z(1253804340);
                        yciVar2 = vciVar;
                        q5g.k(d.c(a.q(vciVar, 0.0f, 0.0f, 0.0f, zs4.e(oq5Var), 7), 1.0f), null, 0L, 0L, null, 0.0f, ild.C(327646144, new sh1(1, (cj1) fj1Var, yi1Var3, O), oq5Var), oq5Var, ScreenMirroringConfig.Video.BITRATE_1_5MB, 62);
                        oq5Var = oq5Var;
                        oq5Var.p(false);
                    } else {
                        oq5Var = oq5Var;
                        yciVar2 = vciVar;
                        if (fj1Var instanceof dj1) {
                            oq5Var.Z(1254975613);
                            Unit unit = Unit.a;
                            boolean h6 = oq5Var.h(yi1Var3) | oq5Var.h(fj1Var);
                            Object K6 = oq5Var.K();
                            if (h6 || K6 == kjnVar) {
                                K6 = new qi((Object) yi1Var3, fj1Var, (Continuation) (objArr == true ? 1 : 0), 8);
                                oq5Var.k0(K6);
                            }
                            gld.w(oq5Var, unit, (Function2) K6);
                            oq5Var.p(false);
                        } else if (Intrinsics.d(fj1Var, ej1.a)) {
                            oq5Var.Z(1255178632);
                            q5g.k(null, null, 0L, 0L, null, 0.0f, ild.C(1726599746, new mi1(yi1Var3, 1), oq5Var), oq5Var, ScreenMirroringConfig.Video.BITRATE_1_5MB, 63);
                            oq5Var = oq5Var;
                            oq5Var.p(false);
                        } else {
                            if (!(fj1Var instanceof zi1)) {
                                throw vz1.i(oq5Var, 871675773, false);
                            }
                            oq5Var.Z(1256132192);
                            q5g.k(null, null, 0L, 0L, null, 0.0f, ild.C(278592899, new mi1(yi1Var3, 2), oq5Var), oq5Var, ScreenMirroringConfig.Video.BITRATE_1_5MB, 63);
                            oq5Var = oq5Var;
                            oq5Var.p(false);
                        }
                    }
                }
            }
            yciVar2 = vciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new a3(yi1Var3, yciVar2, i2, 22);
        }
    }

    public static String d0(su5 su5Var, hq5 hq5Var) {
        oq5 oq5Var;
        int i2;
        int i3;
        su5Var.getClass();
        int ordinal = su5Var.ordinal();
        if (ordinal == 0) {
            oq5Var = (oq5) hq5Var;
            i2 = R.string.concert_event_type_concert;
            i3 = 1832466061;
        } else if (ordinal == 1) {
            oq5Var = (oq5) hq5Var;
            i2 = R.string.concert_event_type_festival;
            i3 = 1832469262;
        } else if (ordinal == 2) {
            oq5Var = (oq5) hq5Var;
            i2 = R.string.concert_event_type_tribute;
            i3 = 1832475629;
        } else if (ordinal != 3) {
            oq5Var = (oq5) hq5Var;
            i2 = R.string.concert_event_type_unspecified;
            i3 = 1832478161;
        } else {
            oq5Var = (oq5) hq5Var;
            i2 = R.string.concert_event_type_musical;
            i3 = 1832472461;
        }
        return vz1.n(oq5Var, i3, i2, oq5Var, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0109  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void e(mn0 mn0Var, yci yciVar, ges gesVar, Function1 function1, int i2, boolean z, int i3, int i4, Map map, a95 a95Var, hq5 hq5Var, int i5, int i6) {
        Function1 function12;
        int i7;
        int i8;
        Map map2;
        int i9;
        int i10;
        oq5 oq5Var;
        a95 a95Var2;
        int i11;
        Map map3;
        xmn r;
        Map map4;
        int i12;
        Object obj;
        oq5 oq5Var2;
        boolean z2;
        boolean z3;
        a95 a95Var3;
        Map map5;
        int i13;
        oq5 oq5Var3 = (oq5) hq5Var;
        oq5Var3.b0(-1343466571);
        int i14 = (i5 & 6) == 0 ? (oq5Var3.f(mn0Var) ? 4 : 2) | i5 : i5;
        if ((i5 & 48) == 0) {
            i14 |= oq5Var3.f(yciVar) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i14 |= oq5Var3.f(gesVar) ? 256 : 128;
        }
        if ((i5 & 3072) == 0) {
            function12 = function1;
            i14 |= oq5Var3.h(function12) ? 2048 : 1024;
        } else {
            function12 = function1;
        }
        if ((i5 & 24576) == 0) {
            i14 |= oq5Var3.d(i2) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((196608 & i5) == 0) {
            i14 |= oq5Var3.g(z) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        if ((1572864 & i5) == 0) {
            i14 |= oq5Var3.d(i3) ? 1048576 : 524288;
        }
        int i15 = i6 & 128;
        if (i15 != 0) {
            i14 |= 12582912;
        } else if ((12582912 & i5) == 0) {
            i7 = i4;
            i14 |= oq5Var3.d(i7) ? 8388608 : RemoteCameraConfig.Camera.BITRATE;
            i8 = i6 & 256;
            if (i8 == 0) {
                i14 |= 100663296;
            } else if ((100663296 & i5) == 0) {
                map2 = map;
                i14 |= oq5Var3.h(map2) ? 67108864 : 33554432;
                i9 = i6 & RemoteCameraConfig.Mic.BUFFER_SIZE;
                if (i9 != 0) {
                    i14 |= 805306368;
                } else if ((i5 & 805306368) == 0) {
                    i10 = i14 | (oq5Var3.h(a95Var) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456);
                    if (oq5Var3.P(i10 & 1, (i10 & 306783379) == 306783378)) {
                        oq5Var = oq5Var3;
                        oq5Var.S();
                        a95Var2 = a95Var;
                        i11 = i7;
                        map3 = map2;
                    } else {
                        int i16 = i15 != 0 ? 1 : i7;
                        if (i8 != 0) {
                            e5b e5bVar = e5b.a;
                            e5bVar.getClass();
                            map4 = e5bVar;
                        } else {
                            map4 = map2;
                        }
                        iep iepVar = null;
                        a95 a95Var4 = i9 != 0 ? null : a95Var;
                        fgq.J(i16, i3);
                        bfp bfpVar = (bfp) oq5Var3.j(cfp.a);
                        Object obj2 = gq5.a;
                        if (bfpVar != null) {
                            oq5Var3.Z(-1584170794);
                            long j2 = ((xds) oq5Var3.j(yds.a)).b;
                            Object[] objArr = {bfpVar};
                            y5 y5Var = new y5(5, bfpVar);
                            rq1 rq1Var = rq1.C;
                            apo apoVar = bpo.a;
                            i12 = i16;
                            apo apoVar2 = new apo(0, y5Var, rq1Var);
                            boolean h2 = oq5Var3.h(bfpVar);
                            Object K = oq5Var3.K();
                            if (h2 || K == obj2) {
                                K = new rv2(bfpVar, 1);
                                oq5Var3.k0(K);
                            }
                            Function0 function0 = (Function0) K;
                            obj = obj2;
                            oq5 oq5Var4 = oq5Var3;
                            long longValue = ((Number) o2g.g0(objArr, apoVar2, function0, oq5Var3, 0, 4)).longValue();
                            boolean e2 = oq5Var4.e(longValue) | oq5Var4.f(bfpVar) | oq5Var4.e(j2);
                            Object K2 = oq5Var4.K();
                            Object obj3 = K2;
                            if (e2 || K2 == obj) {
                                Object iepVar2 = new iep(longValue, bfpVar, j2);
                                oq5Var4.k0(iepVar2);
                                obj3 = iepVar2;
                            }
                            iepVar = (iep) obj3;
                            oq5Var4.p(false);
                            oq5Var2 = oq5Var4;
                        } else {
                            i12 = i16;
                            obj = obj2;
                            oq5 oq5Var5 = oq5Var3;
                            oq5Var5.Z(-1583679630);
                            oq5Var5.p(false);
                            oq5Var2 = oq5Var5;
                        }
                        iep iepVar3 = iepVar;
                        Pair pair = qn0.a;
                        int length = mn0Var.b.length();
                        List list = mn0Var.a;
                        if (list != null) {
                            int size = list.size();
                            for (int i17 = 0; i17 < size; i17++) {
                                ln0 ln0Var = (ln0) list.get(i17);
                                if ((ln0Var.a instanceof dkr) && "androidx.compose.foundation.text.inlineContent".equals(ln0Var.d)) {
                                    z2 = false;
                                    if (nn0.c(0, length, ln0Var.b, ln0Var.c)) {
                                        z3 = true;
                                        break;
                                    }
                                }
                            }
                        }
                        z2 = false;
                        z3 = false;
                        boolean C = fxf.C(mn0Var);
                        if (z3 || C) {
                            int i18 = i12;
                            oq5Var = oq5Var2;
                            a95Var3 = a95Var4;
                            int i19 = 1;
                            oq5Var.Z(-1582650709);
                            boolean z4 = (i10 & 14) == 4 ? true : z2;
                            Object K3 = oq5Var.K();
                            if (z4 || K3 == obj) {
                                K3 = szf.g0(mn0Var);
                                oq5Var.k0(K3);
                            }
                            aqi aqiVar = (aqi) K3;
                            mn0 mn0Var2 = (mn0) aqiVar.getValue();
                            ppc ppcVar = (ppc) oq5Var.j(es5.k);
                            boolean f2 = oq5Var.f(aqiVar);
                            Object K4 = oq5Var.K();
                            if (f2 || K4 == obj) {
                                K4 = new kf0(aqiVar, i19);
                                oq5Var.k0(K4);
                            }
                            int i20 = i10 << 6;
                            map5 = map4;
                            t(yciVar, mn0Var2, function1, z3, map5, gesVar, i2, z, i3, i18, ppcVar, iepVar3, a95Var3, (Function1) K4, oq5Var, ((i10 >> 3) & 910) | ((i10 >> 12) & 57344) | ((i10 << 9) & 458752) | (3670016 & i20) | (29360128 & i20) | (234881024 & i20) | (i20 & 1879048192), ((i10 >> 21) & 896) | 24576);
                            i13 = i18;
                            oq5Var.p(false);
                        } else {
                            oq5Var2.Z(-1583500636);
                            i13 = i12;
                            oq5Var = oq5Var2;
                            a95Var3 = a95Var4;
                            yci s0 = s0(yciVar, mn0Var, gesVar, function12, i2, z, i3, i13, (ppc) oq5Var2.j(es5.k), null, null, iepVar3, a95Var3, null);
                            r30 r30Var = r30.i;
                            int i21 = oq5Var.P;
                            yci H = vnj.H(oq5Var, s0);
                            androidx.compose.runtime.internal.a l2 = oq5Var.l();
                            xp5.T.getClass();
                            grb grbVar = wp5.b;
                            oq5Var.d0();
                            if (oq5Var.O) {
                                oq5Var.k(grbVar);
                            } else {
                                oq5Var.n0();
                            }
                            g0g.U(oq5Var, r30Var, wp5.f);
                            g0g.U(oq5Var, l2, wp5.e);
                            g0g.U(oq5Var, H, wp5.d);
                            kb5 kb5Var = wp5.g;
                            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i21))) {
                                ouj.x(i21, oq5Var, i21, kb5Var);
                            }
                            oq5Var.p(true);
                            oq5Var.p(false);
                            map5 = map4;
                        }
                        map3 = map5;
                        i11 = i13;
                        a95Var2 = a95Var3;
                    }
                    r = oq5Var.r();
                    if (r == null) {
                        r.d = new pv2(mn0Var, yciVar, gesVar, function1, i2, z, i3, i11, map3, a95Var2, i5, i6);
                        return;
                    }
                    return;
                }
                i10 = i14;
                if (oq5Var3.P(i10 & 1, (i10 & 306783379) == 306783378)) {
                }
                r = oq5Var.r();
                if (r == null) {
                }
            }
            map2 = map;
            i9 = i6 & RemoteCameraConfig.Mic.BUFFER_SIZE;
            if (i9 != 0) {
            }
            i10 = i14;
            if (oq5Var3.P(i10 & 1, (i10 & 306783379) == 306783378)) {
            }
            r = oq5Var.r();
            if (r == null) {
            }
        }
        i7 = i4;
        i8 = i6 & 256;
        if (i8 == 0) {
        }
        map2 = map;
        i9 = i6 & RemoteCameraConfig.Mic.BUFFER_SIZE;
        if (i9 != 0) {
        }
        i10 = i14;
        if (oq5Var3.P(i10 & 1, (i10 & 306783379) == 306783378)) {
        }
        r = oq5Var.r();
        if (r == null) {
        }
    }

    public static int e0(byte[] bArr) {
        if (bArr == null) {
            return 0;
        }
        int length = bArr.length;
        int i2 = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i2;
            }
            i2 = (i2 * 257) ^ bArr[length];
        }
    }

    public static final void f(mn0 mn0Var, yci yciVar, ges gesVar, Function1 function1, int i2, boolean z, int i3, int i4, Map map, a95 a95Var, hq5 hq5Var, int i5) {
        int i6;
        oq5 oq5Var;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-1064305212);
        if ((i5 & 6) == 0) {
            i6 = (oq5Var2.f(mn0Var) ? 4 : 2) | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 48) == 0) {
            i6 |= oq5Var2.f(yciVar) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i6 |= oq5Var2.f(gesVar) ? 256 : 128;
        }
        if ((i5 & 3072) == 0) {
            i6 |= oq5Var2.h(function1) ? 2048 : 1024;
        }
        if ((i5 & 24576) == 0) {
            i6 |= oq5Var2.d(i2) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((196608 & i5) == 0) {
            i6 |= oq5Var2.g(z) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        if ((1572864 & i5) == 0) {
            i6 |= oq5Var2.d(i3) ? 1048576 : 524288;
        }
        if ((12582912 & i5) == 0) {
            i6 |= oq5Var2.d(i4) ? 8388608 : RemoteCameraConfig.Camera.BITRATE;
        }
        if ((100663296 & i5) == 0) {
            i6 |= oq5Var2.h(map) ? 67108864 : 33554432;
        }
        if ((805306368 & i5) == 0) {
            i6 |= oq5Var2.h(a95Var) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
        }
        if (oq5Var2.P(i6 & 1, (306783379 & i6) != 306783378)) {
            oq5Var = oq5Var2;
            e(mn0Var, yciVar, gesVar, function1, i2, z, i3, i4, map, a95Var, oq5Var, i6 & 2147483646, 1024);
        } else {
            oq5Var = oq5Var2;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new qv2(mn0Var, yciVar, gesVar, function1, i2, z, i3, i4, map, a95Var, i5);
        }
    }

    public static boolean f0(int i2, Rect rect, Rect rect2) {
        if (i2 == 17) {
            int i3 = rect.right;
            int i4 = rect2.right;
            return (i3 > i4 || rect.left >= i4) && rect.left > rect2.left;
        }
        if (i2 == 33) {
            int i5 = rect.bottom;
            int i6 = rect2.bottom;
            return (i5 > i6 || rect.top >= i6) && rect.top > rect2.top;
        }
        if (i2 == 66) {
            int i7 = rect.left;
            int i8 = rect2.left;
            return (i7 < i8 || rect.right <= i8) && rect.right < rect2.right;
        }
        if (i2 != 130) {
            xq0.x("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            return false;
        }
        int i9 = rect.top;
        int i10 = rect2.top;
        return (i9 < i10 || rect.bottom <= i10) && rect.bottom < rect2.bottom;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void g(String str, yci yciVar, ges gesVar, Function1 function1, int i2, boolean z, int i3, int i4, a95 a95Var, hq5 hq5Var, int i5, int i6) {
        int i7;
        Function1 function12;
        int i8;
        int i9;
        int i10;
        boolean z2;
        int i11;
        int i12;
        int i13;
        int i14;
        oq5 oq5Var;
        a95 a95Var2;
        Function1 function13;
        int i15;
        boolean z3;
        int i16;
        xmn r;
        oq5 oq5Var2;
        Function1 function14;
        yci s0;
        oq5 oq5Var3 = (oq5) hq5Var;
        oq5Var3.b0(-1040751001);
        if ((i5 & 6) == 0) {
            i7 = (oq5Var3.f(str) ? 4 : 2) | i5;
        } else {
            i7 = i5;
        }
        if ((i5 & 48) == 0) {
            i7 |= oq5Var3.f(yciVar) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i7 |= oq5Var3.f(gesVar) ? 256 : 128;
        }
        int i17 = i6 & 8;
        if (i17 != 0) {
            i7 |= 3072;
        } else if ((i5 & 3072) == 0) {
            function12 = function1;
            i7 |= oq5Var3.h(function12) ? 2048 : 1024;
            i8 = i6 & 16;
            if (i8 == 0) {
                i7 |= 24576;
            } else if ((i5 & 24576) == 0) {
                i9 = i2;
                i7 |= oq5Var3.d(i9) ? 16384 : RemoteCameraConfig.Notification.ID;
                i10 = i6 & 32;
                if (i10 != 0) {
                    i7 |= 196608;
                } else if ((196608 & i5) == 0) {
                    z2 = z;
                    i7 |= oq5Var3.g(z2) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
                    if ((1572864 & i5) == 0) {
                        i7 |= oq5Var3.d(i3) ? 1048576 : 524288;
                    }
                    i11 = i6 & 128;
                    if (i11 == 0) {
                        i7 |= 12582912;
                    } else if ((12582912 & i5) == 0) {
                        i7 |= oq5Var3.d(i4) ? 8388608 : RemoteCameraConfig.Camera.BITRATE;
                        i12 = i6 & 256;
                        if (i12 != 0) {
                            i7 |= 100663296;
                        } else if ((i5 & 100663296) == 0) {
                            i13 = i12;
                            i7 |= oq5Var3.h(a95Var) ? 67108864 : 33554432;
                            i14 = i7 | 805306368;
                            int i18 = 0;
                            if (oq5Var3.P(i14 & 1, (i14 & 306783379) == 306783378)) {
                                oq5Var = oq5Var3;
                                oq5Var.S();
                                a95Var2 = a95Var;
                                function13 = function12;
                                i15 = i9;
                                z3 = z2;
                                i16 = i4;
                            } else {
                                iep iepVar = null;
                                Function1 function15 = i17 != 0 ? null : function12;
                                int i19 = i8 != 0 ? 1 : i9;
                                boolean z4 = i10 != 0 ? true : z2;
                                int i20 = i11 != 0 ? 1 : i4;
                                a95 a95Var3 = i13 != 0 ? null : a95Var;
                                fgq.J(i20, i3);
                                bfp bfpVar = (bfp) oq5Var3.j(cfp.a);
                                if (bfpVar != null) {
                                    oq5Var3.Z(-1588802442);
                                    long j2 = ((xds) oq5Var3.j(yds.a)).b;
                                    Object[] objArr = {bfpVar};
                                    y5 y5Var = new y5(5, bfpVar);
                                    rq1 rq1Var = rq1.C;
                                    apo apoVar = bpo.a;
                                    apo apoVar2 = new apo(i18, y5Var, rq1Var);
                                    boolean h2 = oq5Var3.h(bfpVar);
                                    Object K = oq5Var3.K();
                                    Object obj = gq5.a;
                                    if (h2 || K == obj) {
                                        K = new rv2(bfpVar, 0);
                                        oq5Var3.k0(K);
                                    }
                                    Object g0 = o2g.g0(objArr, apoVar2, (Function0) K, oq5Var3, 0, 4);
                                    oq5Var2 = oq5Var3;
                                    long longValue = ((Number) g0).longValue();
                                    boolean e2 = oq5Var2.e(longValue) | oq5Var2.f(bfpVar) | oq5Var2.e(j2);
                                    Object K2 = oq5Var2.K();
                                    if (e2 || K2 == obj) {
                                        K2 = new iep(longValue, bfpVar, j2);
                                        oq5Var2.k0(K2);
                                    }
                                    iepVar = (iep) K2;
                                    oq5Var2.p(false);
                                } else {
                                    oq5Var2 = oq5Var3;
                                    oq5Var2.Z(-1588311278);
                                    oq5Var2.p(false);
                                }
                                iep iepVar2 = iepVar;
                                if (iepVar2 == null && function15 == null) {
                                    oq5Var2.Z(-1587511974);
                                    s0 = yciVar.f(new TextStringSimpleElement(str, gesVar, (ppc) oq5Var2.j(es5.k), i19, z4, i3, i20, a95Var3));
                                    oq5Var2.p(false);
                                    oq5Var = oq5Var2;
                                    function14 = function15;
                                } else {
                                    oq5Var2.Z(-1588155131);
                                    a95 a95Var4 = a95Var3;
                                    oq5Var = oq5Var2;
                                    function14 = function15;
                                    s0 = s0(yciVar, new mn0(str), gesVar, function14, i19, z4, i3, i20, (ppc) oq5Var2.j(es5.k), null, null, iepVar2, a95Var4, null);
                                    a95Var3 = a95Var4;
                                    oq5Var.p(false);
                                }
                                r30 r30Var = r30.i;
                                int i21 = oq5Var.P;
                                yci H = vnj.H(oq5Var, s0);
                                androidx.compose.runtime.internal.a l2 = oq5Var.l();
                                xp5.T.getClass();
                                grb grbVar = wp5.b;
                                oq5Var.d0();
                                if (oq5Var.O) {
                                    oq5Var.k(grbVar);
                                } else {
                                    oq5Var.n0();
                                }
                                g0g.U(oq5Var, r30Var, wp5.f);
                                g0g.U(oq5Var, l2, wp5.e);
                                g0g.U(oq5Var, H, wp5.d);
                                kb5 kb5Var = wp5.g;
                                if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i21))) {
                                    ouj.x(i21, oq5Var, i21, kb5Var);
                                }
                                oq5Var.p(true);
                                z3 = z4;
                                a95Var2 = a95Var3;
                                i15 = i19;
                                i16 = i20;
                                function13 = function14;
                            }
                            r = oq5Var.r();
                            if (r == null) {
                                r.d = new ov2(str, yciVar, gesVar, function13, i15, z3, i3, i16, a95Var2, i5, i6, 0);
                                return;
                            }
                            return;
                        }
                        i13 = i12;
                        i14 = i7 | 805306368;
                        int i182 = 0;
                        if (oq5Var3.P(i14 & 1, (i14 & 306783379) == 306783378)) {
                        }
                        r = oq5Var.r();
                        if (r == null) {
                        }
                    }
                    i12 = i6 & 256;
                    if (i12 != 0) {
                    }
                    i13 = i12;
                    i14 = i7 | 805306368;
                    int i1822 = 0;
                    if (oq5Var3.P(i14 & 1, (i14 & 306783379) == 306783378)) {
                    }
                    r = oq5Var.r();
                    if (r == null) {
                    }
                }
                z2 = z;
                if ((1572864 & i5) == 0) {
                }
                i11 = i6 & 128;
                if (i11 == 0) {
                }
                i12 = i6 & 256;
                if (i12 != 0) {
                }
                i13 = i12;
                i14 = i7 | 805306368;
                int i18222 = 0;
                if (oq5Var3.P(i14 & 1, (i14 & 306783379) == 306783378)) {
                }
                r = oq5Var.r();
                if (r == null) {
                }
            }
            i9 = i2;
            i10 = i6 & 32;
            if (i10 != 0) {
            }
            z2 = z;
            if ((1572864 & i5) == 0) {
            }
            i11 = i6 & 128;
            if (i11 == 0) {
            }
            i12 = i6 & 256;
            if (i12 != 0) {
            }
            i13 = i12;
            i14 = i7 | 805306368;
            int i182222 = 0;
            if (oq5Var3.P(i14 & 1, (i14 & 306783379) == 306783378)) {
            }
            r = oq5Var.r();
            if (r == null) {
            }
        }
        function12 = function1;
        i8 = i6 & 16;
        if (i8 == 0) {
        }
        i9 = i2;
        i10 = i6 & 32;
        if (i10 != 0) {
        }
        z2 = z;
        if ((1572864 & i5) == 0) {
        }
        i11 = i6 & 128;
        if (i11 == 0) {
        }
        i12 = i6 & 256;
        if (i12 != 0) {
        }
        i13 = i12;
        i14 = i7 | 805306368;
        int i1822222 = 0;
        if (oq5Var3.P(i14 & 1, (i14 & 306783379) == 306783378)) {
        }
        r = oq5Var.r();
        if (r == null) {
        }
    }

    public static int g0(int i2, Rect rect, Rect rect2) {
        int i3;
        int i4;
        if (i2 == 17) {
            i3 = rect.left;
            i4 = rect2.right;
        } else if (i2 == 33) {
            i3 = rect.top;
            i4 = rect2.bottom;
        } else if (i2 == 66) {
            i3 = rect2.left;
            i4 = rect.right;
        } else {
            if (i2 != 130) {
                xq0.x("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                return 0;
            }
            i3 = rect2.top;
            i4 = rect.bottom;
        }
        return Math.max(0, i3 - i4);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void h(String str, yci yciVar, ges gesVar, Function1 function1, int i2, boolean z, int i3, int i4, a95 a95Var, hq5 hq5Var, int i5, int i6) {
        int i7;
        Function1 function12;
        int i8;
        int i9;
        int i10;
        boolean z2;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        oq5 oq5Var;
        int i17;
        Function1 function13;
        boolean z3;
        int i18;
        a95 a95Var2;
        xmn r;
        int i19;
        int i20;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-1186827822);
        if ((i5 & 6) == 0) {
            i7 = (oq5Var2.f(str) ? 4 : 2) | i5;
        } else {
            i7 = i5;
        }
        if ((i5 & 48) == 0) {
            i7 |= oq5Var2.f(yciVar) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i7 |= oq5Var2.f(gesVar) ? 256 : 128;
        }
        int i21 = i6 & 8;
        if (i21 != 0) {
            i7 |= 3072;
        } else if ((i5 & 3072) == 0) {
            function12 = function1;
            i7 |= oq5Var2.h(function12) ? 2048 : 1024;
            i8 = i6 & 16;
            if (i8 == 0) {
                i7 |= 24576;
            } else if ((i5 & 24576) == 0) {
                i9 = i2;
                i7 |= oq5Var2.d(i9) ? 16384 : RemoteCameraConfig.Notification.ID;
                i10 = i6 & 32;
                if (i10 != 0) {
                    i7 |= 196608;
                } else if ((196608 & i5) == 0) {
                    z2 = z;
                    i7 |= oq5Var2.g(z2) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
                    i11 = i6 & 64;
                    if (i11 == 0) {
                        i7 |= ScreenMirroringConfig.Video.BITRATE_1_5MB;
                    } else if ((1572864 & i5) == 0) {
                        i12 = i3;
                        i7 |= oq5Var2.d(i12) ? 1048576 : 524288;
                        i13 = i6 & 128;
                        if (i13 != 0) {
                            i14 = i7 | 12582912;
                        } else {
                            int i22 = i7;
                            if ((i5 & 12582912) == 0) {
                                i14 = i22 | (oq5Var2.d(i4) ? 8388608 : RemoteCameraConfig.Camera.BITRATE);
                            } else {
                                i14 = i22;
                            }
                        }
                        i15 = i6 & 256;
                        if (i15 != 0) {
                            i14 |= 100663296;
                        } else if ((i5 & 100663296) == 0) {
                            i16 = i15;
                            i14 |= oq5Var2.h(a95Var) ? 67108864 : 33554432;
                            if (oq5Var2.P(i14 & 1, (i14 & 38347923) == 38347922)) {
                                oq5Var = oq5Var2;
                                oq5Var.S();
                                i17 = i4;
                                function13 = function12;
                                z3 = z2;
                                i18 = i12;
                                a95Var2 = a95Var;
                            } else {
                                Function1 function14 = i21 != 0 ? null : function12;
                                int i23 = i14;
                                int i24 = i8 != 0 ? 1 : i9;
                                int i25 = i16;
                                boolean z4 = i10 != 0 ? true : z2;
                                if (i11 != 0) {
                                    i20 = Integer.MAX_VALUE;
                                    i19 = 1;
                                } else {
                                    i19 = 1;
                                    i20 = i12;
                                }
                                int i26 = i13 != 0 ? i19 : i4;
                                a95 a95Var3 = i25 != 0 ? null : a95Var;
                                oq5Var = oq5Var2;
                                g(str, yciVar, gesVar, function14, i24, z4, i20, i26, a95Var3, oq5Var, i23 & 268435454, RemoteCameraConfig.Mic.BUFFER_SIZE);
                                function13 = function14;
                                i9 = i24;
                                z3 = z4;
                                i18 = i20;
                                i17 = i26;
                                a95Var2 = a95Var3;
                            }
                            r = oq5Var.r();
                            if (r == null) {
                                r.d = new ov2(str, yciVar, gesVar, function13, i9, z3, i18, i17, a95Var2, i5, i6, 1);
                                return;
                            }
                            return;
                        }
                        i16 = i15;
                        if (oq5Var2.P(i14 & 1, (i14 & 38347923) == 38347922)) {
                        }
                        r = oq5Var.r();
                        if (r == null) {
                        }
                    }
                    i12 = i3;
                    i13 = i6 & 128;
                    if (i13 != 0) {
                    }
                    i15 = i6 & 256;
                    if (i15 != 0) {
                    }
                    i16 = i15;
                    if (oq5Var2.P(i14 & 1, (i14 & 38347923) == 38347922)) {
                    }
                    r = oq5Var.r();
                    if (r == null) {
                    }
                }
                z2 = z;
                i11 = i6 & 64;
                if (i11 == 0) {
                }
                i12 = i3;
                i13 = i6 & 128;
                if (i13 != 0) {
                }
                i15 = i6 & 256;
                if (i15 != 0) {
                }
                i16 = i15;
                if (oq5Var2.P(i14 & 1, (i14 & 38347923) == 38347922)) {
                }
                r = oq5Var.r();
                if (r == null) {
                }
            }
            i9 = i2;
            i10 = i6 & 32;
            if (i10 != 0) {
            }
            z2 = z;
            i11 = i6 & 64;
            if (i11 == 0) {
            }
            i12 = i3;
            i13 = i6 & 128;
            if (i13 != 0) {
            }
            i15 = i6 & 256;
            if (i15 != 0) {
            }
            i16 = i15;
            if (oq5Var2.P(i14 & 1, (i14 & 38347923) == 38347922)) {
            }
            r = oq5Var.r();
            if (r == null) {
            }
        }
        function12 = function1;
        i8 = i6 & 16;
        if (i8 == 0) {
        }
        i9 = i2;
        i10 = i6 & 32;
        if (i10 != 0) {
        }
        z2 = z;
        i11 = i6 & 64;
        if (i11 == 0) {
        }
        i12 = i3;
        i13 = i6 & 128;
        if (i13 != 0) {
        }
        i15 = i6 & 256;
        if (i15 != 0) {
        }
        i16 = i15;
        if (oq5Var2.P(i14 & 1, (i14 & 38347923) == 38347922)) {
        }
        r = oq5Var.r();
        if (r == null) {
        }
    }

    public static final void h0(IOException iOException) {
        if (Thread.interrupted()) {
            b6e.h();
            return;
        }
        for (IOException iOException2 = iOException; iOException2 != null; iOException2 = iOException2.getCause()) {
            if (iOException2.getClass().equals(InterruptedIOException.class)) {
                b6e.h();
                return;
            }
        }
    }

    public static final void i(u44 u44Var, hq5 hq5Var, int i2) {
        u44Var.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-878191804);
        int i3 = (oq5Var.f(u44Var) ? 4 : 2) | i2;
        if (oq5Var.P(i3 & 1, (i3 & 3) != 2)) {
            x44 x44Var = (x44) gld.O(u44Var.c, oq5Var).getValue();
            if (x44Var instanceof w44) {
                oq5Var.Z(-2128726858);
                x97.d(((w44) x44Var).a, u44Var, oq5Var, (i3 << 3) & 112);
                oq5Var.p(false);
            } else {
                if (!(x44Var instanceof v44)) {
                    throw vz1.i(oq5Var, -2128730726, false);
                }
                oq5Var.Z(-2128723664);
                up6.f(((v44) x44Var).b, oq5Var, 0);
                oq5Var.p(false);
            }
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new q2(u44Var, i2, 22);
        }
    }

    public static int i0(int i2, Rect rect, Rect rect2) {
        if (i2 != 17) {
            if (i2 != 33) {
                if (i2 != 66) {
                    if (i2 != 130) {
                        xq0.x("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                        return 0;
                    }
                }
            }
            return Math.abs(((rect.width() / 2) + rect.left) - ((rect2.width() / 2) + rect2.left));
        }
        return Math.abs(((rect.height() / 2) + rect.top) - ((rect2.height() / 2) + rect2.top));
    }

    /* JADX WARN: Code restructure failed: missing block: B:207:0x048a, code lost:
    
        if (r6 > ((r2 != null ? r2.longValue() : 0) + com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig.Test.pcVideoUdpPort)) goto L240;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:189:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0460  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x049b  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x04ac  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x04bd  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0520  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x052c  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0542  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0553  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0588 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0616  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0631 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0675 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:252:0x069d  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x06a7  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x06bb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:262:0x06d2  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x070a  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x071b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0733  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0746  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0755 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:281:0x078a  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x07c2  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x07e9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0805  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x080f  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0823 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0844  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0868  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x088a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:319:0x08b8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:322:0x091c  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x0945  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x0846  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x0807  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x07da  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x0748  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x0735  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x070c  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x06a9  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x069f  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x0628  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x056b  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x055f  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x0545  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x052e  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x0522  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x0427  */
    /* JADX WARN: Type inference failed for: r15v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v130, types: [yci] */
    /* JADX WARN: Type inference failed for: r9v1, types: [hq5, oq5] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void j(ybs ybsVar, Function1 function1, yci yciVar, ges gesVar, tiu tiuVar, Function1 function12, uoi uoiVar, f3r f3rVar, boolean z, int i2, int i3, ide ideVar, pbf pbfVar, boolean z2, pyc pycVar, hq5 hq5Var, int i4, int i5) {
        int i6;
        int i7;
        oq5 oq5Var;
        yoc yocVar;
        int i8;
        Object axfVar;
        boolean z3;
        l7t l7tVar;
        Object obj;
        int i9;
        ges gesVar2;
        mnj mnjVar;
        int i10;
        mn0 mn0Var;
        jx7 jx7Var;
        ppc ppcVar;
        jx7 jx7Var2;
        boolean z4;
        boolean z5;
        ybs a2;
        Object K;
        mit mitVar;
        Object K2;
        Object K3;
        Object K4;
        int i11;
        int i12;
        ide ideVar2;
        int i13;
        boolean z6;
        boolean h2;
        Object pl6Var;
        toc tocVar;
        int i14;
        ide ideVar3;
        lbs lbsVar;
        int i15;
        ch0 ch0Var;
        lcs lcsVar;
        kpv kpvVar;
        uoi uoiVar2;
        Object obj2;
        int i16;
        axf axfVar2;
        l7t l7tVar2;
        oq5 oq5Var2;
        yoc yocVar2;
        ybs ybsVar2;
        lh3 lh3Var;
        boolean z7;
        axf axfVar3;
        boolean z8;
        boolean z9;
        Object ovVar;
        yci yciVar2;
        int i17;
        yoc yocVar3;
        vci vciVar;
        mnj mnjVar2;
        Unit unit;
        axf axfVar4;
        aqi aqiVar;
        lcs lcsVar2;
        boolean h3;
        Object K5;
        int i18;
        boolean h4;
        Object K6;
        mnj mnjVar3;
        boolean h5;
        Object K7;
        kpv kpvVar2;
        boolean h6;
        Object K8;
        mnj mnjVar4;
        kpv kpvVar3;
        axf axfVar5;
        mnj mnjVar5;
        CoreTextFieldSemanticsModifier coreTextFieldSemanticsModifier;
        vci vciVar2;
        boolean h7;
        Object K9;
        boolean h8;
        Object K10;
        ide ideVar4;
        boolean z10;
        boolean g2;
        Object K11;
        boolean h9;
        Object K12;
        int i19;
        ?? r9 = (oq5) hq5Var;
        r9.b0(-244533042);
        if ((i4 & 6) == 0) {
            i6 = i4 | (r9.f(ybsVar) ? 4 : 2);
        } else {
            i6 = i4;
        }
        if ((i4 & 48) == 0) {
            i6 |= r9.h(function1) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i6 |= r9.f(yciVar) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i6 |= r9.f(gesVar) ? 2048 : 1024;
        }
        int i20 = i4 & 24576;
        int i21 = RemoteCameraConfig.Notification.ID;
        if (i20 == 0) {
            i6 |= r9.f(tiuVar) ? 16384 : 8192;
        }
        int i22 = i4 & 196608;
        int i23 = SQLiteDatabase.OPEN_SHAREDCACHE;
        if (i22 == 0) {
            i6 |= r9.h(function12) ? 131072 : 65536;
        }
        if ((i4 & ScreenMirroringConfig.Video.BITRATE_1_5MB) == 0) {
            i6 |= r9.f(uoiVar) ? 1048576 : 524288;
        }
        if ((i4 & 12582912) == 0) {
            i6 |= r9.f(f3rVar) ? 8388608 : RemoteCameraConfig.Camera.BITRATE;
        }
        if ((i4 & 100663296) == 0) {
            i6 |= r9.g(z) ? 67108864 : 33554432;
        }
        if ((i4 & 805306368) == 0) {
            i6 |= r9.d(i2) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
        }
        int i24 = i6;
        if ((i5 & 6) == 0) {
            i7 = i5 | (r9.d(i3) ? 4 : 2);
        } else {
            i7 = i5;
        }
        if ((i5 & 48) == 0) {
            i7 |= r9.f(ideVar) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i7 |= r9.f(pbfVar) ? 256 : 128;
        }
        if ((i5 & 3072) == 0) {
            i7 |= r9.g(z2) ? 2048 : 1024;
        }
        if ((i5 & 24576) == 0) {
            if (r9.g(false)) {
                i21 = 16384;
            }
            i7 |= i21;
        }
        if ((i5 & 196608) == 0) {
            if (!r9.h(pycVar)) {
                i23 = 65536;
            }
            i7 |= i23;
        }
        int i25 = i7 | ScreenMirroringConfig.Video.BITRATE_1_5MB;
        if (r9.P(i24 & 1, ((i24 & 306783379) == 306783378 && (599187 & i25) == 599186) ? false : true)) {
            r9.U();
            if ((i4 & 1) != 0 && !r9.y()) {
                r9.S();
            }
            r9.q();
            Object K13 = r9.K();
            Object obj3 = gq5.a;
            if (K13 == obj3) {
                K13 = new yoc();
                r9.k0(K13);
            }
            yoc yocVar4 = (yoc) K13;
            Object K14 = r9.K();
            if (K14 == obj3) {
                vwf vwfVar = wwf.a;
                K14 = new ch0();
                r9.k0(K14);
            }
            ch0 ch0Var2 = (ch0) K14;
            Object K15 = r9.K();
            if (K15 == obj3) {
                K15 = new lcs(ch0Var2);
                r9.k0(K15);
            }
            lcs lcsVar3 = (lcs) K15;
            jx7 jx7Var3 = (jx7) r9.j(es5.h);
            ppc ppcVar2 = (ppc) r9.j(es5.k);
            long j2 = ((xds) r9.j(yds.a)).b;
            toc tocVar2 = (toc) r9.j(es5.i);
            kpv kpvVar4 = (kpv) r9.j(es5.t);
            c3r c3rVar = (c3r) r9.j(es5.p);
            bxj bxjVar = (i2 == 1 && !z && ideVar.a) ? bxj.b : bxj.a;
            r9.Z(-1705353356);
            Object[] objArr = {bxjVar};
            apo apoVar = lbs.g;
            boolean f2 = r9.f(bxjVar);
            Object K16 = r9.K();
            if (f2 || K16 == obj3) {
                K16 = new k5(29, bxjVar);
                r9.k0(K16);
            }
            lbs lbsVar2 = (lbs) o2g.g0(objArr, apoVar, (Function0) K16, r9, 0, 4);
            r9.p(false);
            if (((bxj) lbsVar2.f.getValue()) != bxjVar) {
                throw new IllegalArgumentException("Mismatching scroller orientation; ".concat(bxjVar == bxj.a ? "only single-line, non-wrap text fields can scroll horizontally" : "single-line, non-wrap text fields can only scroll horizontally"));
            }
            int i26 = i24 & 14;
            boolean z11 = (i26 == 4) | ((i24 & 57344) == 16384);
            Object K17 = r9.K();
            if (z11 || K17 == obj3) {
                l7t B = nt0.B(tiuVar, ybsVar.a);
                rds rdsVar = ybsVar.c;
                if (rdsVar != null) {
                    i8 = i26;
                    long j3 = rdsVar.a;
                    mnj mnjVar6 = B.b;
                    int i27 = rds.c;
                    yocVar = yocVar4;
                    int d2 = mnjVar6.d((int) (j3 >> 32));
                    int d3 = mnjVar6.d((int) (j3 & 4294967295L));
                    int min = Math.min(d2, d3);
                    int max = Math.max(d2, d3);
                    kn0 kn0Var = new kn0(B.a);
                    kn0Var.a(new c4r(0L, 0L, (tqc) null, (oqc) null, (pqc) null, (qpc) null, (String) null, 0L, (wu2) null, (ccs) null, (bqg) null, 0L, aas.c, (otp) null, 61439), min, max);
                    K17 = new l7t(kn0Var.h(), mnjVar6);
                } else {
                    yocVar = yocVar4;
                    i8 = i26;
                    K17 = B;
                }
                r9.k0(K17);
            } else {
                yocVar = yocVar4;
                i8 = i26;
            }
            l7t l7tVar3 = (l7t) K17;
            mn0 mn0Var2 = l7tVar3.a;
            mnj mnjVar7 = l7tVar3.b;
            xmn x = r9.x();
            if (x == null) {
                xq0.q("no recompose scope found");
                return;
            }
            x.a |= 1;
            boolean f3 = r9.f(c3rVar);
            Object K18 = r9.K();
            if (f3 || K18 == obj3) {
                z3 = z;
                l7tVar = l7tVar3;
                obj = obj3;
                i9 = i8;
                gesVar2 = gesVar;
                mnjVar = mnjVar7;
                i10 = i25;
                mn0Var = mn0Var2;
                jx7Var = jx7Var3;
                ppcVar = ppcVar2;
                axfVar = new axf(new das(mn0Var2, gesVar2, z3, jx7Var3, ppcVar2, c5b.a), x, c3rVar);
                r9.k0(axfVar);
            } else {
                z3 = z;
                l7tVar = l7tVar3;
                mnjVar = mnjVar7;
                i10 = i25;
                obj = obj3;
                axfVar = K18;
                i9 = i8;
                jx7Var = jx7Var3;
                ppcVar = ppcVar2;
                gesVar2 = gesVar;
                mn0Var = mn0Var2;
            }
            axf axfVar6 = (axf) axfVar;
            mn0 mn0Var3 = ybsVar.a;
            axfVar6.u = function1;
            axfVar6.y = j2;
            obf obfVar = axfVar6.r;
            obfVar.b = pbfVar;
            obfVar.c = tocVar2;
            axfVar6.j = mn0Var3;
            das dasVar = axfVar6.a;
            c5b c5bVar = c5b.a;
            if (Intrinsics.d(dasVar.a, mn0Var) && Intrinsics.d(dasVar.b, gesVar2) && dasVar.e == z3 && dasVar.f == 1 && dasVar.c == Integer.MAX_VALUE && dasVar.d == 1 && Intrinsics.d(dasVar.g, jx7Var) && Intrinsics.d(dasVar.i, c5bVar) && dasVar.h == ppcVar) {
                jx7Var2 = jx7Var;
            } else {
                jx7Var2 = jx7Var;
                dasVar = new das(mn0Var, gesVar2, z3, jx7Var2, ppcVar, c5bVar);
            }
            if (axfVar6.a != dasVar) {
                axfVar6.p = true;
            }
            axfVar6.a = dasVar;
            pt0 pt0Var = axfVar6.d;
            pcs pcsVar = axfVar6.e;
            pt0Var.getClass();
            rds rdsVar2 = ybsVar.c;
            long j4 = ybsVar.b;
            boolean d4 = Intrinsics.d(rdsVar2, ((bh3) pt0Var.b).e());
            String str = ((ybs) pt0Var.a).a.b;
            mn0 mn0Var4 = ybsVar.a;
            if (!Intrinsics.d(str, mn0Var4.b)) {
                pt0Var.b = new bh3(mn0Var4, j4);
                z4 = true;
            } else if (rds.a(((ybs) pt0Var.a).b, j4)) {
                z4 = false;
            } else {
                ((bh3) pt0Var.b).l(rds.e(j4), rds.d(j4));
                z4 = false;
                z5 = true;
                if (rdsVar2 != null) {
                    bh3 bh3Var = (bh3) pt0Var.b;
                    bh3Var.d = -1;
                    bh3Var.e = -1;
                } else {
                    long j5 = rdsVar2.a;
                    if (!rds.b(j5)) {
                        ((bh3) pt0Var.b).j(rds.e(j5), rds.d(j5));
                    }
                }
                if (z4 && (z5 || d4)) {
                    a2 = ybsVar;
                } else {
                    bh3 bh3Var2 = (bh3) pt0Var.b;
                    bh3Var2.d = -1;
                    bh3Var2.e = -1;
                    a2 = ybs.a(ybsVar, null, 0L, 3);
                }
                ybs ybsVar3 = (ybs) pt0Var.a;
                pt0Var.a = a2;
                if (pcsVar != null) {
                    pcsVar.a(ybsVar3, a2);
                }
                K = r9.K();
                if (K == obj) {
                    K = new mit();
                    r9.k0(K);
                }
                mitVar = (mit) K;
                long currentTimeMillis = System.currentTimeMillis();
                if (!mitVar.e) {
                    Long l2 = mitVar.d;
                }
                mitVar.d = Long.valueOf(currentTimeMillis);
                mitVar.a(ybsVar);
                K2 = r9.K();
                if (K2 == obj) {
                    K2 = gld.R(g.a, r9);
                    r9.k0(K2);
                }
                mm6 mm6Var = (mm6) K2;
                K3 = r9.K();
                if (K3 == obj) {
                    K3 = new lh3();
                    r9.k0(K3);
                }
                lh3 lh3Var2 = (lh3) K3;
                K4 = r9.K();
                if (K4 == obj) {
                    K4 = new qbs(mitVar);
                    r9.k0(K4);
                }
                qbs qbsVar = (qbs) K4;
                mnj mnjVar8 = mnjVar;
                qbsVar.b = mnjVar8;
                qbsVar.f = tiuVar;
                qbsVar.c = axfVar6.v;
                qbsVar.d = axfVar6;
                qbsVar.e.setValue(ybsVar);
                qbsVar.h = (kp4) r9.j(es5.f);
                qbsVar.i = mm6Var;
                qbsVar.j = (hes) r9.j(es5.q);
                qbsVar.k = (msd) r9.j(es5.l);
                yoc yocVar5 = yocVar;
                qbsVar.l = yocVar5;
                qbsVar.m.setValue(true);
                qbsVar.n.setValue(Boolean.valueOf(z2));
                i11 = i10;
                int i28 = i11 & 7168;
                int i29 = i11 & 57344;
                boolean h10 = (i28 != 2048) | r9.h(axfVar6) | (i29 != 16384) | r9.h(lcsVar3);
                int i30 = i9;
                boolean z12 = h10 | (i30 != 4);
                i12 = (i11 & 112) ^ 48;
                if (i12 <= 32) {
                    ideVar2 = ideVar;
                    if (r9.f(ideVar2)) {
                        i13 = i30;
                        z6 = true;
                        h2 = z12 | z6 | r9.h(mnjVar8) | r9.h(mm6Var) | r9.h(lh3Var2) | r9.h(qbsVar);
                        Object K19 = r9.K();
                        if (!h2 || K19 == obj) {
                            tocVar = tocVar2;
                            i14 = i28;
                            ideVar3 = ideVar2;
                            lbsVar = lbsVar2;
                            i15 = i13;
                            ch0Var = ch0Var2;
                            lcsVar = lcsVar3;
                            kpvVar = kpvVar4;
                            uoiVar2 = uoiVar;
                            obj2 = obj;
                            i16 = i11;
                            axfVar2 = axfVar6;
                            l7tVar2 = l7tVar;
                            oq5Var2 = r9;
                            yocVar2 = yocVar5;
                            pl6Var = new pl6(axfVar2, z2, lcsVar, ybsVar, ideVar3, mnjVar8, qbsVar, mm6Var, lh3Var2);
                            ybsVar2 = ybsVar;
                            qbsVar = qbsVar;
                            lh3Var = lh3Var2;
                            z7 = z2;
                            oq5Var2.k0(pl6Var);
                        } else {
                            tocVar = tocVar2;
                            i14 = i28;
                            ideVar3 = ideVar2;
                            axfVar2 = axfVar6;
                            lbsVar = lbsVar2;
                            i15 = i13;
                            ch0Var = ch0Var2;
                            kpvVar = kpvVar4;
                            ybsVar2 = ybsVar;
                            uoiVar2 = uoiVar;
                            l7tVar2 = l7tVar;
                            obj2 = obj;
                            pl6Var = K19;
                            lh3Var = lh3Var2;
                            i16 = i11;
                            yocVar2 = yocVar5;
                            lcsVar = lcsVar3;
                            oq5Var2 = r9;
                            z7 = z2;
                        }
                        vci vciVar3 = vci.a;
                        yci k2 = androidx.compose.foundation.a.k(androidx.compose.ui.focus.a.b(androidx.compose.ui.focus.a.a(vciVar3, yocVar2), (Function1) pl6Var), z7, uoiVar2);
                        aqi o0 = szf.o0(Boolean.valueOf(z7), oq5Var2);
                        Unit unit2 = Unit.a;
                        boolean f4 = oq5Var2.f(o0) | oq5Var2.h(axfVar2) | oq5Var2.h(lcsVar) | oq5Var2.h(qbsVar);
                        if (i12 > 32 || !oq5Var2.f(ideVar3)) {
                            axfVar3 = axfVar2;
                            if ((i16 & 48) != 32) {
                                z8 = false;
                                z9 = f4 | z8;
                                Object K20 = oq5Var2.K();
                                if (!z9 || K20 == obj2) {
                                    yciVar2 = k2;
                                    i17 = i12;
                                    yocVar3 = yocVar2;
                                    vciVar = vciVar3;
                                    mnjVar2 = mnjVar8;
                                    unit = unit2;
                                    axfVar4 = axfVar3;
                                    ovVar = new ov(axfVar4, o0, lcsVar, qbsVar, ideVar3, (Continuation) null, 15);
                                    aqiVar = o0;
                                    lcsVar2 = lcsVar;
                                    oq5Var2.k0(ovVar);
                                } else {
                                    yciVar2 = k2;
                                    ovVar = K20;
                                    lcsVar2 = lcsVar;
                                    aqiVar = o0;
                                    i17 = i12;
                                    yocVar3 = yocVar2;
                                    mnjVar2 = mnjVar8;
                                    axfVar4 = axfVar3;
                                    vciVar = vciVar3;
                                    unit = unit2;
                                }
                                gld.w(oq5Var2, unit, (Function2) ovVar);
                                h3 = oq5Var2.h(axfVar4);
                                K5 = oq5Var2.K();
                                if (!h3 || K5 == obj2) {
                                    i18 = 1;
                                    K5 = new nl6(axfVar4, i18);
                                    oq5Var2.k0(K5);
                                } else {
                                    i18 = 1;
                                }
                                yci a3 = eur.a(vciVar, 8675309, new ff6(i18, (Function1) K5));
                                int i31 = i14;
                                h4 = oq5Var2.h(axfVar4) | (i29 == 16384) | (i31 == 2048) | oq5Var2.h(mnjVar2) | oq5Var2.h(qbsVar);
                                K6 = oq5Var2.K();
                                if (!h4 || K6 == obj2) {
                                    mnjVar3 = mnjVar2;
                                    ql6 ql6Var = new ql6(axfVar4, yocVar3, z2, qbsVar, mnjVar3);
                                    oq5Var2.k0(ql6Var);
                                    K6 = ql6Var;
                                } else {
                                    mnjVar3 = mnjVar2;
                                }
                                Function1 function13 = (Function1) K6;
                                if (z2) {
                                    a3 = vnj.q(a3, new yl0(10, function13, uoiVar2));
                                }
                                uiq uiqVar = qbsVar.x;
                                mbs mbsVar = qbsVar.w;
                                yci x2 = uwf.x(a3.f(new SuspendPointerInputElement(uiqVar, mbsVar, null, new ul6(uiqVar, mbsVar), 4)), c3x.h);
                                int i32 = i15;
                                h5 = oq5Var2.h(axfVar4) | (i32 == 4) | oq5Var2.h(mnjVar3);
                                K7 = oq5Var2.K();
                                int i33 = 11;
                                if (!h5 || K7 == obj2) {
                                    K7 = new lj0(i33, axfVar4, ybsVar2, mnjVar3);
                                    oq5Var2.k0(K7);
                                }
                                yci a4 = androidx.compose.ui.draw.a.a(vciVar, (Function1) K7);
                                kpvVar2 = kpvVar;
                                h6 = oq5Var2.h(axfVar4) | (i31 == 2048) | oq5Var2.f(kpvVar2) | oq5Var2.h(qbsVar) | (i32 == 4) | oq5Var2.h(mnjVar3);
                                K8 = oq5Var2.K();
                                if (!h6 || K8 == obj2) {
                                    mnjVar4 = mnjVar3;
                                    s23 s23Var = new s23(axfVar4, z2, kpvVar2, qbsVar, ybsVar2, mnjVar4);
                                    kpvVar3 = kpvVar2;
                                    oq5Var2.k0(s23Var);
                                    K8 = s23Var;
                                } else {
                                    kpvVar3 = kpvVar2;
                                    mnjVar4 = mnjVar3;
                                }
                                yci d5 = androidx.compose.ui.layout.a.d(vciVar, (Function1) K8);
                                axf axfVar7 = axfVar4;
                                mnj mnjVar9 = mnjVar4;
                                lcs lcsVar4 = lcsVar2;
                                qbs qbsVar2 = qbsVar;
                                CoreTextFieldSemanticsModifier coreTextFieldSemanticsModifier2 = new CoreTextFieldSemanticsModifier(l7tVar2, ybsVar, axfVar7, z2, mnjVar9, qbsVar2, ideVar, yocVar3);
                                axfVar5 = axfVar7;
                                if (!z2 && ((Boolean) ((dwf) kpvVar3).c.getValue()).booleanValue() && rds.b(((rds) axfVar5.z.getValue()).a) && rds.b(((rds) axfVar5.A.getValue()).a)) {
                                    coreTextFieldSemanticsModifier = coreTextFieldSemanticsModifier2;
                                    zk0 zk0Var = new zk0(f3rVar, axfVar5, ybsVar, mnjVar9, 2);
                                    axfVar5 = axfVar5;
                                    mnjVar5 = mnjVar9;
                                    vciVar2 = vnj.q(vciVar, zk0Var);
                                } else {
                                    mnjVar5 = mnjVar9;
                                    coreTextFieldSemanticsModifier = coreTextFieldSemanticsModifier2;
                                    vciVar2 = vciVar;
                                }
                                h7 = oq5Var2.h(qbsVar2);
                                K9 = oq5Var2.K();
                                if (!h7 || K9 == obj2) {
                                    K9 = new hl6(qbsVar2, 0);
                                    oq5Var2.k0(K9);
                                }
                                gld.k(qbsVar2, (Function1) K9, oq5Var2);
                                h8 = oq5Var2.h(axfVar5) | oq5Var2.h(lcsVar4) | (i32 == 4) | ((i17 <= 32 && oq5Var2.f(ideVar)) || (i16 & 48) == 32);
                                K10 = oq5Var2.K();
                                if (!h8 || K10 == obj2) {
                                    ak0 ak0Var = new ak0(axfVar5, lcsVar4, ybsVar, ideVar, 3);
                                    ideVar4 = ideVar;
                                    oq5Var2.k0(ak0Var);
                                    K10 = ak0Var;
                                } else {
                                    ideVar4 = ideVar;
                                }
                                gld.k(ideVar4, (Function1) K10, oq5Var2);
                                CoreTextFieldSemanticsModifier coreTextFieldSemanticsModifier3 = coreTextFieldSemanticsModifier;
                                mnj mnjVar10 = mnjVar5;
                                yci q = vnj.q(vciVar, new ebs(axfVar5, qbsVar2, ybsVar, true, i2 == 1, mnjVar10, mitVar, axfVar5.v, ideVar4.e));
                                int i34 = ideVar4.d;
                                z10 = (i34 == 7 || i34 == 8) ? false : true;
                                boolean booleanValue = ((Boolean) aqiVar.getValue()).booleanValue();
                                ch0 ch0Var3 = ch0Var;
                                g2 = oq5Var2.g(z10) | oq5Var2.h(ch0Var3);
                                K11 = oq5Var2.K();
                                if (!g2 || K11 == obj2) {
                                    K11 = new si2(z10, ch0Var3, 1);
                                    oq5Var2.k0(K11);
                                }
                                yci a5 = androidx.compose.foundation.text.handwriting.a.a(booleanValue, z10, (Function0) K11);
                                long j6 = ((d85) oq5Var2.j(je2.a)).a;
                                h9 = oq5Var2.h(axfVar5) | oq5Var2.e(j6);
                                K12 = oq5Var2.K();
                                if (!h9 || K12 == obj2) {
                                    K12 = new ol6(axfVar5, j6, 0);
                                    oq5Var2.k0(K12);
                                }
                                lbs lbsVar3 = lbsVar;
                                yci f5 = vnj.q(androidx.compose.ui.input.key.a.b(androidx.compose.ui.input.key.a.b(androidx.compose.foundation.text.input.internal.a.a(yciVar.f(androidx.compose.ui.draw.a.a(vciVar, (Function1) K12)), ch0Var3, axfVar5, qbsVar2).f(a5).f(yciVar2), new gcp(12, tocVar, axfVar5)), new sv4(5, axfVar5, qbsVar2)).f(q), new jdp(lbsVar3, z2, uoiVar2, 2)).f(x2).f(coreTextFieldSemanticsModifier3);
                                i19 = 0;
                                yci d6 = androidx.compose.ui.layout.a.d(f5, new nl6(axfVar5, i19));
                                if (z2 && axfVar5.b() && ((Boolean) axfVar5.q.getValue()).booleanValue() && ((Boolean) ((dwf) kpvVar3).c.getValue()).booleanValue()) {
                                    i19 = 1;
                                }
                                oq5Var = oq5Var2;
                                k(d6, qbsVar2, ild.C(-492537660, new ll6(pycVar, axfVar5, gesVar, i3, i2, lbsVar3, ybsVar, tiuVar, vciVar2, a4, d5, (i19 == 0 && x4h.a()) ? vnj.q(vciVar, new wk0(11, qbsVar2)) : vciVar, lh3Var, qbsVar2, i19, function12, mnjVar10, jx7Var2), oq5Var), oq5Var, 384);
                            }
                        } else {
                            axfVar3 = axfVar2;
                        }
                        z8 = true;
                        z9 = f4 | z8;
                        Object K202 = oq5Var2.K();
                        if (z9) {
                        }
                        yciVar2 = k2;
                        i17 = i12;
                        yocVar3 = yocVar2;
                        vciVar = vciVar3;
                        mnjVar2 = mnjVar8;
                        unit = unit2;
                        axfVar4 = axfVar3;
                        ovVar = new ov(axfVar4, o0, lcsVar, qbsVar, ideVar3, (Continuation) null, 15);
                        aqiVar = o0;
                        lcsVar2 = lcsVar;
                        oq5Var2.k0(ovVar);
                        gld.w(oq5Var2, unit, (Function2) ovVar);
                        h3 = oq5Var2.h(axfVar4);
                        K5 = oq5Var2.K();
                        if (h3) {
                        }
                        i18 = 1;
                        K5 = new nl6(axfVar4, i18);
                        oq5Var2.k0(K5);
                        yci a32 = eur.a(vciVar, 8675309, new ff6(i18, (Function1) K5));
                        int i312 = i14;
                        h4 = oq5Var2.h(axfVar4) | (i29 == 16384) | (i312 == 2048) | oq5Var2.h(mnjVar2) | oq5Var2.h(qbsVar);
                        K6 = oq5Var2.K();
                        if (h4) {
                        }
                        mnjVar3 = mnjVar2;
                        ql6 ql6Var2 = new ql6(axfVar4, yocVar3, z2, qbsVar, mnjVar3);
                        oq5Var2.k0(ql6Var2);
                        K6 = ql6Var2;
                        Function1 function132 = (Function1) K6;
                        if (z2) {
                        }
                        uiq uiqVar2 = qbsVar.x;
                        mbs mbsVar2 = qbsVar.w;
                        yci x22 = uwf.x(a32.f(new SuspendPointerInputElement(uiqVar2, mbsVar2, null, new ul6(uiqVar2, mbsVar2), 4)), c3x.h);
                        int i322 = i15;
                        h5 = oq5Var2.h(axfVar4) | (i322 == 4) | oq5Var2.h(mnjVar3);
                        K7 = oq5Var2.K();
                        int i332 = 11;
                        if (!h5) {
                        }
                        K7 = new lj0(i332, axfVar4, ybsVar2, mnjVar3);
                        oq5Var2.k0(K7);
                        yci a42 = androidx.compose.ui.draw.a.a(vciVar, (Function1) K7);
                        kpvVar2 = kpvVar;
                        h6 = oq5Var2.h(axfVar4) | (i312 == 2048) | oq5Var2.f(kpvVar2) | oq5Var2.h(qbsVar) | (i322 == 4) | oq5Var2.h(mnjVar3);
                        K8 = oq5Var2.K();
                        if (h6) {
                        }
                        mnjVar4 = mnjVar3;
                        s23 s23Var2 = new s23(axfVar4, z2, kpvVar2, qbsVar, ybsVar2, mnjVar4);
                        kpvVar3 = kpvVar2;
                        oq5Var2.k0(s23Var2);
                        K8 = s23Var2;
                        yci d52 = androidx.compose.ui.layout.a.d(vciVar, (Function1) K8);
                        axf axfVar72 = axfVar4;
                        mnj mnjVar92 = mnjVar4;
                        lcs lcsVar42 = lcsVar2;
                        qbs qbsVar22 = qbsVar;
                        CoreTextFieldSemanticsModifier coreTextFieldSemanticsModifier22 = new CoreTextFieldSemanticsModifier(l7tVar2, ybsVar, axfVar72, z2, mnjVar92, qbsVar22, ideVar, yocVar3);
                        axfVar5 = axfVar72;
                        if (!z2 && ((Boolean) ((dwf) kpvVar3).c.getValue()).booleanValue() && rds.b(((rds) axfVar5.z.getValue()).a) && rds.b(((rds) axfVar5.A.getValue()).a)) {
                        }
                        h7 = oq5Var2.h(qbsVar22);
                        K9 = oq5Var2.K();
                        if (!h7) {
                        }
                        K9 = new hl6(qbsVar22, 0);
                        oq5Var2.k0(K9);
                        gld.k(qbsVar22, (Function1) K9, oq5Var2);
                        h8 = oq5Var2.h(axfVar5) | oq5Var2.h(lcsVar42) | (i322 == 4) | ((i17 <= 32 && oq5Var2.f(ideVar)) || (i16 & 48) == 32);
                        K10 = oq5Var2.K();
                        if (h8) {
                        }
                        ak0 ak0Var2 = new ak0(axfVar5, lcsVar42, ybsVar, ideVar, 3);
                        ideVar4 = ideVar;
                        oq5Var2.k0(ak0Var2);
                        K10 = ak0Var2;
                        gld.k(ideVar4, (Function1) K10, oq5Var2);
                        CoreTextFieldSemanticsModifier coreTextFieldSemanticsModifier32 = coreTextFieldSemanticsModifier;
                        mnj mnjVar102 = mnjVar5;
                        yci q2 = vnj.q(vciVar, new ebs(axfVar5, qbsVar22, ybsVar, true, i2 == 1, mnjVar102, mitVar, axfVar5.v, ideVar4.e));
                        int i342 = ideVar4.d;
                        if (i342 == 7) {
                            boolean booleanValue2 = ((Boolean) aqiVar.getValue()).booleanValue();
                            ch0 ch0Var32 = ch0Var;
                            g2 = oq5Var2.g(z10) | oq5Var2.h(ch0Var32);
                            K11 = oq5Var2.K();
                            if (!g2) {
                            }
                            K11 = new si2(z10, ch0Var32, 1);
                            oq5Var2.k0(K11);
                            yci a52 = androidx.compose.foundation.text.handwriting.a.a(booleanValue2, z10, (Function0) K11);
                            long j62 = ((d85) oq5Var2.j(je2.a)).a;
                            h9 = oq5Var2.h(axfVar5) | oq5Var2.e(j62);
                            K12 = oq5Var2.K();
                            if (!h9) {
                            }
                            K12 = new ol6(axfVar5, j62, 0);
                            oq5Var2.k0(K12);
                            lbs lbsVar32 = lbsVar;
                            yci f52 = vnj.q(androidx.compose.ui.input.key.a.b(androidx.compose.ui.input.key.a.b(androidx.compose.foundation.text.input.internal.a.a(yciVar.f(androidx.compose.ui.draw.a.a(vciVar, (Function1) K12)), ch0Var32, axfVar5, qbsVar22).f(a52).f(yciVar2), new gcp(12, tocVar, axfVar5)), new sv4(5, axfVar5, qbsVar22)).f(q2), new jdp(lbsVar32, z2, uoiVar2, 2)).f(x22).f(coreTextFieldSemanticsModifier32);
                            i19 = 0;
                            yci d62 = androidx.compose.ui.layout.a.d(f52, new nl6(axfVar5, i19));
                            if (z2) {
                                i19 = 1;
                            }
                            oq5Var = oq5Var2;
                            k(d62, qbsVar22, ild.C(-492537660, new ll6(pycVar, axfVar5, gesVar, i3, i2, lbsVar32, ybsVar, tiuVar, vciVar2, a42, d52, (i19 == 0 && x4h.a()) ? vnj.q(vciVar, new wk0(11, qbsVar22)) : vciVar, lh3Var, qbsVar22, i19, function12, mnjVar102, jx7Var2), oq5Var), oq5Var, 384);
                        }
                        boolean booleanValue22 = ((Boolean) aqiVar.getValue()).booleanValue();
                        ch0 ch0Var322 = ch0Var;
                        g2 = oq5Var2.g(z10) | oq5Var2.h(ch0Var322);
                        K11 = oq5Var2.K();
                        if (!g2) {
                        }
                        K11 = new si2(z10, ch0Var322, 1);
                        oq5Var2.k0(K11);
                        yci a522 = androidx.compose.foundation.text.handwriting.a.a(booleanValue22, z10, (Function0) K11);
                        long j622 = ((d85) oq5Var2.j(je2.a)).a;
                        h9 = oq5Var2.h(axfVar5) | oq5Var2.e(j622);
                        K12 = oq5Var2.K();
                        if (!h9) {
                        }
                        K12 = new ol6(axfVar5, j622, 0);
                        oq5Var2.k0(K12);
                        lbs lbsVar322 = lbsVar;
                        yci f522 = vnj.q(androidx.compose.ui.input.key.a.b(androidx.compose.ui.input.key.a.b(androidx.compose.foundation.text.input.internal.a.a(yciVar.f(androidx.compose.ui.draw.a.a(vciVar, (Function1) K12)), ch0Var322, axfVar5, qbsVar22).f(a522).f(yciVar2), new gcp(12, tocVar, axfVar5)), new sv4(5, axfVar5, qbsVar22)).f(q2), new jdp(lbsVar322, z2, uoiVar2, 2)).f(x22).f(coreTextFieldSemanticsModifier32);
                        i19 = 0;
                        yci d622 = androidx.compose.ui.layout.a.d(f522, new nl6(axfVar5, i19));
                        if (z2) {
                        }
                        oq5Var = oq5Var2;
                        k(d622, qbsVar22, ild.C(-492537660, new ll6(pycVar, axfVar5, gesVar, i3, i2, lbsVar322, ybsVar, tiuVar, vciVar2, a42, d52, (i19 == 0 && x4h.a()) ? vnj.q(vciVar, new wk0(11, qbsVar22)) : vciVar, lh3Var, qbsVar22, i19, function12, mnjVar102, jx7Var2), oq5Var), oq5Var, 384);
                    }
                } else {
                    ideVar2 = ideVar;
                }
                i13 = i30;
                if ((i11 & 48) != 32) {
                    z6 = false;
                    h2 = z12 | z6 | r9.h(mnjVar8) | r9.h(mm6Var) | r9.h(lh3Var2) | r9.h(qbsVar);
                    Object K192 = r9.K();
                    if (h2) {
                    }
                    tocVar = tocVar2;
                    i14 = i28;
                    ideVar3 = ideVar2;
                    lbsVar = lbsVar2;
                    i15 = i13;
                    ch0Var = ch0Var2;
                    lcsVar = lcsVar3;
                    kpvVar = kpvVar4;
                    uoiVar2 = uoiVar;
                    obj2 = obj;
                    i16 = i11;
                    axfVar2 = axfVar6;
                    l7tVar2 = l7tVar;
                    oq5Var2 = r9;
                    yocVar2 = yocVar5;
                    pl6Var = new pl6(axfVar2, z2, lcsVar, ybsVar, ideVar3, mnjVar8, qbsVar, mm6Var, lh3Var2);
                    ybsVar2 = ybsVar;
                    qbsVar = qbsVar;
                    lh3Var = lh3Var2;
                    z7 = z2;
                    oq5Var2.k0(pl6Var);
                    vci vciVar32 = vci.a;
                    yci k22 = androidx.compose.foundation.a.k(androidx.compose.ui.focus.a.b(androidx.compose.ui.focus.a.a(vciVar32, yocVar2), (Function1) pl6Var), z7, uoiVar2);
                    aqi o02 = szf.o0(Boolean.valueOf(z7), oq5Var2);
                    Unit unit22 = Unit.a;
                    boolean f42 = oq5Var2.f(o02) | oq5Var2.h(axfVar2) | oq5Var2.h(lcsVar) | oq5Var2.h(qbsVar);
                    if (i12 > 32) {
                    }
                    axfVar3 = axfVar2;
                    if ((i16 & 48) != 32) {
                    }
                    z8 = true;
                    z9 = f42 | z8;
                    Object K2022 = oq5Var2.K();
                    if (z9) {
                    }
                    yciVar2 = k22;
                    i17 = i12;
                    yocVar3 = yocVar2;
                    vciVar = vciVar32;
                    mnjVar2 = mnjVar8;
                    unit = unit22;
                    axfVar4 = axfVar3;
                    ovVar = new ov(axfVar4, o02, lcsVar, qbsVar, ideVar3, (Continuation) null, 15);
                    aqiVar = o02;
                    lcsVar2 = lcsVar;
                    oq5Var2.k0(ovVar);
                    gld.w(oq5Var2, unit, (Function2) ovVar);
                    h3 = oq5Var2.h(axfVar4);
                    K5 = oq5Var2.K();
                    if (h3) {
                    }
                    i18 = 1;
                    K5 = new nl6(axfVar4, i18);
                    oq5Var2.k0(K5);
                    yci a322 = eur.a(vciVar, 8675309, new ff6(i18, (Function1) K5));
                    int i3122 = i14;
                    h4 = oq5Var2.h(axfVar4) | (i29 == 16384) | (i3122 == 2048) | oq5Var2.h(mnjVar2) | oq5Var2.h(qbsVar);
                    K6 = oq5Var2.K();
                    if (h4) {
                    }
                    mnjVar3 = mnjVar2;
                    ql6 ql6Var22 = new ql6(axfVar4, yocVar3, z2, qbsVar, mnjVar3);
                    oq5Var2.k0(ql6Var22);
                    K6 = ql6Var22;
                    Function1 function1322 = (Function1) K6;
                    if (z2) {
                    }
                    uiq uiqVar22 = qbsVar.x;
                    mbs mbsVar22 = qbsVar.w;
                    yci x222 = uwf.x(a322.f(new SuspendPointerInputElement(uiqVar22, mbsVar22, null, new ul6(uiqVar22, mbsVar22), 4)), c3x.h);
                    int i3222 = i15;
                    h5 = oq5Var2.h(axfVar4) | (i3222 == 4) | oq5Var2.h(mnjVar3);
                    K7 = oq5Var2.K();
                    int i3322 = 11;
                    if (!h5) {
                    }
                    K7 = new lj0(i3322, axfVar4, ybsVar2, mnjVar3);
                    oq5Var2.k0(K7);
                    yci a422 = androidx.compose.ui.draw.a.a(vciVar, (Function1) K7);
                    kpvVar2 = kpvVar;
                    h6 = oq5Var2.h(axfVar4) | (i3122 == 2048) | oq5Var2.f(kpvVar2) | oq5Var2.h(qbsVar) | (i3222 == 4) | oq5Var2.h(mnjVar3);
                    K8 = oq5Var2.K();
                    if (h6) {
                    }
                    mnjVar4 = mnjVar3;
                    s23 s23Var22 = new s23(axfVar4, z2, kpvVar2, qbsVar, ybsVar2, mnjVar4);
                    kpvVar3 = kpvVar2;
                    oq5Var2.k0(s23Var22);
                    K8 = s23Var22;
                    yci d522 = androidx.compose.ui.layout.a.d(vciVar, (Function1) K8);
                    axf axfVar722 = axfVar4;
                    mnj mnjVar922 = mnjVar4;
                    lcs lcsVar422 = lcsVar2;
                    qbs qbsVar222 = qbsVar;
                    CoreTextFieldSemanticsModifier coreTextFieldSemanticsModifier222 = new CoreTextFieldSemanticsModifier(l7tVar2, ybsVar, axfVar722, z2, mnjVar922, qbsVar222, ideVar, yocVar3);
                    axfVar5 = axfVar722;
                    if (!z2 && ((Boolean) ((dwf) kpvVar3).c.getValue()).booleanValue() && rds.b(((rds) axfVar5.z.getValue()).a) && rds.b(((rds) axfVar5.A.getValue()).a)) {
                    }
                    h7 = oq5Var2.h(qbsVar222);
                    K9 = oq5Var2.K();
                    if (!h7) {
                    }
                    K9 = new hl6(qbsVar222, 0);
                    oq5Var2.k0(K9);
                    gld.k(qbsVar222, (Function1) K9, oq5Var2);
                    h8 = oq5Var2.h(axfVar5) | oq5Var2.h(lcsVar422) | (i3222 == 4) | ((i17 <= 32 && oq5Var2.f(ideVar)) || (i16 & 48) == 32);
                    K10 = oq5Var2.K();
                    if (h8) {
                    }
                    ak0 ak0Var22 = new ak0(axfVar5, lcsVar422, ybsVar, ideVar, 3);
                    ideVar4 = ideVar;
                    oq5Var2.k0(ak0Var22);
                    K10 = ak0Var22;
                    gld.k(ideVar4, (Function1) K10, oq5Var2);
                    CoreTextFieldSemanticsModifier coreTextFieldSemanticsModifier322 = coreTextFieldSemanticsModifier;
                    mnj mnjVar1022 = mnjVar5;
                    yci q22 = vnj.q(vciVar, new ebs(axfVar5, qbsVar222, ybsVar, true, i2 == 1, mnjVar1022, mitVar, axfVar5.v, ideVar4.e));
                    int i3422 = ideVar4.d;
                    if (i3422 == 7) {
                    }
                    boolean booleanValue222 = ((Boolean) aqiVar.getValue()).booleanValue();
                    ch0 ch0Var3222 = ch0Var;
                    g2 = oq5Var2.g(z10) | oq5Var2.h(ch0Var3222);
                    K11 = oq5Var2.K();
                    if (!g2) {
                    }
                    K11 = new si2(z10, ch0Var3222, 1);
                    oq5Var2.k0(K11);
                    yci a5222 = androidx.compose.foundation.text.handwriting.a.a(booleanValue222, z10, (Function0) K11);
                    long j6222 = ((d85) oq5Var2.j(je2.a)).a;
                    h9 = oq5Var2.h(axfVar5) | oq5Var2.e(j6222);
                    K12 = oq5Var2.K();
                    if (!h9) {
                    }
                    K12 = new ol6(axfVar5, j6222, 0);
                    oq5Var2.k0(K12);
                    lbs lbsVar3222 = lbsVar;
                    yci f5222 = vnj.q(androidx.compose.ui.input.key.a.b(androidx.compose.ui.input.key.a.b(androidx.compose.foundation.text.input.internal.a.a(yciVar.f(androidx.compose.ui.draw.a.a(vciVar, (Function1) K12)), ch0Var3222, axfVar5, qbsVar222).f(a5222).f(yciVar2), new gcp(12, tocVar, axfVar5)), new sv4(5, axfVar5, qbsVar222)).f(q22), new jdp(lbsVar3222, z2, uoiVar2, 2)).f(x222).f(coreTextFieldSemanticsModifier322);
                    i19 = 0;
                    yci d6222 = androidx.compose.ui.layout.a.d(f5222, new nl6(axfVar5, i19));
                    if (z2) {
                    }
                    oq5Var = oq5Var2;
                    k(d6222, qbsVar222, ild.C(-492537660, new ll6(pycVar, axfVar5, gesVar, i3, i2, lbsVar3222, ybsVar, tiuVar, vciVar2, a422, d522, (i19 == 0 && x4h.a()) ? vnj.q(vciVar, new wk0(11, qbsVar222)) : vciVar, lh3Var, qbsVar222, i19, function12, mnjVar1022, jx7Var2), oq5Var), oq5Var, 384);
                }
                z6 = true;
                h2 = z12 | z6 | r9.h(mnjVar8) | r9.h(mm6Var) | r9.h(lh3Var2) | r9.h(qbsVar);
                Object K1922 = r9.K();
                if (h2) {
                }
                tocVar = tocVar2;
                i14 = i28;
                ideVar3 = ideVar2;
                lbsVar = lbsVar2;
                i15 = i13;
                ch0Var = ch0Var2;
                lcsVar = lcsVar3;
                kpvVar = kpvVar4;
                uoiVar2 = uoiVar;
                obj2 = obj;
                i16 = i11;
                axfVar2 = axfVar6;
                l7tVar2 = l7tVar;
                oq5Var2 = r9;
                yocVar2 = yocVar5;
                pl6Var = new pl6(axfVar2, z2, lcsVar, ybsVar, ideVar3, mnjVar8, qbsVar, mm6Var, lh3Var2);
                ybsVar2 = ybsVar;
                qbsVar = qbsVar;
                lh3Var = lh3Var2;
                z7 = z2;
                oq5Var2.k0(pl6Var);
                vci vciVar322 = vci.a;
                yci k222 = androidx.compose.foundation.a.k(androidx.compose.ui.focus.a.b(androidx.compose.ui.focus.a.a(vciVar322, yocVar2), (Function1) pl6Var), z7, uoiVar2);
                aqi o022 = szf.o0(Boolean.valueOf(z7), oq5Var2);
                Unit unit222 = Unit.a;
                boolean f422 = oq5Var2.f(o022) | oq5Var2.h(axfVar2) | oq5Var2.h(lcsVar) | oq5Var2.h(qbsVar);
                if (i12 > 32) {
                }
                axfVar3 = axfVar2;
                if ((i16 & 48) != 32) {
                }
                z8 = true;
                z9 = f422 | z8;
                Object K20222 = oq5Var2.K();
                if (z9) {
                }
                yciVar2 = k222;
                i17 = i12;
                yocVar3 = yocVar2;
                vciVar = vciVar322;
                mnjVar2 = mnjVar8;
                unit = unit222;
                axfVar4 = axfVar3;
                ovVar = new ov(axfVar4, o022, lcsVar, qbsVar, ideVar3, (Continuation) null, 15);
                aqiVar = o022;
                lcsVar2 = lcsVar;
                oq5Var2.k0(ovVar);
                gld.w(oq5Var2, unit, (Function2) ovVar);
                h3 = oq5Var2.h(axfVar4);
                K5 = oq5Var2.K();
                if (h3) {
                }
                i18 = 1;
                K5 = new nl6(axfVar4, i18);
                oq5Var2.k0(K5);
                yci a3222 = eur.a(vciVar, 8675309, new ff6(i18, (Function1) K5));
                int i31222 = i14;
                h4 = oq5Var2.h(axfVar4) | (i29 == 16384) | (i31222 == 2048) | oq5Var2.h(mnjVar2) | oq5Var2.h(qbsVar);
                K6 = oq5Var2.K();
                if (h4) {
                }
                mnjVar3 = mnjVar2;
                ql6 ql6Var222 = new ql6(axfVar4, yocVar3, z2, qbsVar, mnjVar3);
                oq5Var2.k0(ql6Var222);
                K6 = ql6Var222;
                Function1 function13222 = (Function1) K6;
                if (z2) {
                }
                uiq uiqVar222 = qbsVar.x;
                mbs mbsVar222 = qbsVar.w;
                yci x2222 = uwf.x(a3222.f(new SuspendPointerInputElement(uiqVar222, mbsVar222, null, new ul6(uiqVar222, mbsVar222), 4)), c3x.h);
                int i32222 = i15;
                h5 = oq5Var2.h(axfVar4) | (i32222 == 4) | oq5Var2.h(mnjVar3);
                K7 = oq5Var2.K();
                int i33222 = 11;
                if (!h5) {
                }
                K7 = new lj0(i33222, axfVar4, ybsVar2, mnjVar3);
                oq5Var2.k0(K7);
                yci a4222 = androidx.compose.ui.draw.a.a(vciVar, (Function1) K7);
                kpvVar2 = kpvVar;
                h6 = oq5Var2.h(axfVar4) | (i31222 == 2048) | oq5Var2.f(kpvVar2) | oq5Var2.h(qbsVar) | (i32222 == 4) | oq5Var2.h(mnjVar3);
                K8 = oq5Var2.K();
                if (h6) {
                }
                mnjVar4 = mnjVar3;
                s23 s23Var222 = new s23(axfVar4, z2, kpvVar2, qbsVar, ybsVar2, mnjVar4);
                kpvVar3 = kpvVar2;
                oq5Var2.k0(s23Var222);
                K8 = s23Var222;
                yci d5222 = androidx.compose.ui.layout.a.d(vciVar, (Function1) K8);
                axf axfVar7222 = axfVar4;
                mnj mnjVar9222 = mnjVar4;
                lcs lcsVar4222 = lcsVar2;
                qbs qbsVar2222 = qbsVar;
                CoreTextFieldSemanticsModifier coreTextFieldSemanticsModifier2222 = new CoreTextFieldSemanticsModifier(l7tVar2, ybsVar, axfVar7222, z2, mnjVar9222, qbsVar2222, ideVar, yocVar3);
                axfVar5 = axfVar7222;
                if (!z2 && ((Boolean) ((dwf) kpvVar3).c.getValue()).booleanValue() && rds.b(((rds) axfVar5.z.getValue()).a) && rds.b(((rds) axfVar5.A.getValue()).a)) {
                }
                h7 = oq5Var2.h(qbsVar2222);
                K9 = oq5Var2.K();
                if (!h7) {
                }
                K9 = new hl6(qbsVar2222, 0);
                oq5Var2.k0(K9);
                gld.k(qbsVar2222, (Function1) K9, oq5Var2);
                h8 = oq5Var2.h(axfVar5) | oq5Var2.h(lcsVar4222) | (i32222 == 4) | ((i17 <= 32 && oq5Var2.f(ideVar)) || (i16 & 48) == 32);
                K10 = oq5Var2.K();
                if (h8) {
                }
                ak0 ak0Var222 = new ak0(axfVar5, lcsVar4222, ybsVar, ideVar, 3);
                ideVar4 = ideVar;
                oq5Var2.k0(ak0Var222);
                K10 = ak0Var222;
                gld.k(ideVar4, (Function1) K10, oq5Var2);
                CoreTextFieldSemanticsModifier coreTextFieldSemanticsModifier3222 = coreTextFieldSemanticsModifier;
                mnj mnjVar10222 = mnjVar5;
                yci q222 = vnj.q(vciVar, new ebs(axfVar5, qbsVar2222, ybsVar, true, i2 == 1, mnjVar10222, mitVar, axfVar5.v, ideVar4.e));
                int i34222 = ideVar4.d;
                if (i34222 == 7) {
                }
                boolean booleanValue2222 = ((Boolean) aqiVar.getValue()).booleanValue();
                ch0 ch0Var32222 = ch0Var;
                g2 = oq5Var2.g(z10) | oq5Var2.h(ch0Var32222);
                K11 = oq5Var2.K();
                if (!g2) {
                }
                K11 = new si2(z10, ch0Var32222, 1);
                oq5Var2.k0(K11);
                yci a52222 = androidx.compose.foundation.text.handwriting.a.a(booleanValue2222, z10, (Function0) K11);
                long j62222 = ((d85) oq5Var2.j(je2.a)).a;
                h9 = oq5Var2.h(axfVar5) | oq5Var2.e(j62222);
                K12 = oq5Var2.K();
                if (!h9) {
                }
                K12 = new ol6(axfVar5, j62222, 0);
                oq5Var2.k0(K12);
                lbs lbsVar32222 = lbsVar;
                yci f52222 = vnj.q(androidx.compose.ui.input.key.a.b(androidx.compose.ui.input.key.a.b(androidx.compose.foundation.text.input.internal.a.a(yciVar.f(androidx.compose.ui.draw.a.a(vciVar, (Function1) K12)), ch0Var32222, axfVar5, qbsVar2222).f(a52222).f(yciVar2), new gcp(12, tocVar, axfVar5)), new sv4(5, axfVar5, qbsVar2222)).f(q222), new jdp(lbsVar32222, z2, uoiVar2, 2)).f(x2222).f(coreTextFieldSemanticsModifier3222);
                i19 = 0;
                yci d62222 = androidx.compose.ui.layout.a.d(f52222, new nl6(axfVar5, i19));
                if (z2) {
                }
                oq5Var = oq5Var2;
                k(d62222, qbsVar2222, ild.C(-492537660, new ll6(pycVar, axfVar5, gesVar, i3, i2, lbsVar32222, ybsVar, tiuVar, vciVar2, a4222, d5222, (i19 == 0 && x4h.a()) ? vnj.q(vciVar, new wk0(11, qbsVar2222)) : vciVar, lh3Var, qbsVar2222, i19, function12, mnjVar10222, jx7Var2), oq5Var), oq5Var, 384);
            }
            z5 = false;
            if (rdsVar2 != null) {
            }
            if (z4) {
            }
            bh3 bh3Var22 = (bh3) pt0Var.b;
            bh3Var22.d = -1;
            bh3Var22.e = -1;
            a2 = ybs.a(ybsVar, null, 0L, 3);
            ybs ybsVar32 = (ybs) pt0Var.a;
            pt0Var.a = a2;
            if (pcsVar != null) {
            }
            K = r9.K();
            if (K == obj) {
            }
            mitVar = (mit) K;
            long currentTimeMillis2 = System.currentTimeMillis();
            if (!mitVar.e) {
            }
            mitVar.d = Long.valueOf(currentTimeMillis2);
            mitVar.a(ybsVar);
            K2 = r9.K();
            if (K2 == obj) {
            }
            mm6 mm6Var2 = (mm6) K2;
            K3 = r9.K();
            if (K3 == obj) {
            }
            lh3 lh3Var22 = (lh3) K3;
            K4 = r9.K();
            if (K4 == obj) {
            }
            qbs qbsVar3 = (qbs) K4;
            mnj mnjVar82 = mnjVar;
            qbsVar3.b = mnjVar82;
            qbsVar3.f = tiuVar;
            qbsVar3.c = axfVar6.v;
            qbsVar3.d = axfVar6;
            qbsVar3.e.setValue(ybsVar);
            qbsVar3.h = (kp4) r9.j(es5.f);
            qbsVar3.i = mm6Var2;
            qbsVar3.j = (hes) r9.j(es5.q);
            qbsVar3.k = (msd) r9.j(es5.l);
            yoc yocVar52 = yocVar;
            qbsVar3.l = yocVar52;
            qbsVar3.m.setValue(true);
            qbsVar3.n.setValue(Boolean.valueOf(z2));
            i11 = i10;
            int i282 = i11 & 7168;
            int i292 = i11 & 57344;
            boolean h102 = (i282 != 2048) | r9.h(axfVar6) | (i292 != 16384) | r9.h(lcsVar3);
            int i302 = i9;
            boolean z122 = h102 | (i302 != 4);
            i12 = (i11 & 112) ^ 48;
            if (i12 <= 32) {
            }
            i13 = i302;
            if ((i11 & 48) != 32) {
            }
            z6 = true;
            h2 = z122 | z6 | r9.h(mnjVar82) | r9.h(mm6Var2) | r9.h(lh3Var22) | r9.h(qbsVar3);
            Object K19222 = r9.K();
            if (h2) {
            }
            tocVar = tocVar2;
            i14 = i282;
            ideVar3 = ideVar2;
            lbsVar = lbsVar2;
            i15 = i13;
            ch0Var = ch0Var2;
            lcsVar = lcsVar3;
            kpvVar = kpvVar4;
            uoiVar2 = uoiVar;
            obj2 = obj;
            i16 = i11;
            axfVar2 = axfVar6;
            l7tVar2 = l7tVar;
            oq5Var2 = r9;
            yocVar2 = yocVar52;
            pl6Var = new pl6(axfVar2, z2, lcsVar, ybsVar, ideVar3, mnjVar82, qbsVar3, mm6Var2, lh3Var22);
            ybsVar2 = ybsVar;
            qbsVar3 = qbsVar3;
            lh3Var = lh3Var22;
            z7 = z2;
            oq5Var2.k0(pl6Var);
            vci vciVar3222 = vci.a;
            yci k2222 = androidx.compose.foundation.a.k(androidx.compose.ui.focus.a.b(androidx.compose.ui.focus.a.a(vciVar3222, yocVar2), (Function1) pl6Var), z7, uoiVar2);
            aqi o0222 = szf.o0(Boolean.valueOf(z7), oq5Var2);
            Unit unit2222 = Unit.a;
            boolean f4222 = oq5Var2.f(o0222) | oq5Var2.h(axfVar2) | oq5Var2.h(lcsVar) | oq5Var2.h(qbsVar3);
            if (i12 > 32) {
            }
            axfVar3 = axfVar2;
            if ((i16 & 48) != 32) {
            }
            z8 = true;
            z9 = f4222 | z8;
            Object K202222 = oq5Var2.K();
            if (z9) {
            }
            yciVar2 = k2222;
            i17 = i12;
            yocVar3 = yocVar2;
            vciVar = vciVar3222;
            mnjVar2 = mnjVar82;
            unit = unit2222;
            axfVar4 = axfVar3;
            ovVar = new ov(axfVar4, o0222, lcsVar, qbsVar3, ideVar3, (Continuation) null, 15);
            aqiVar = o0222;
            lcsVar2 = lcsVar;
            oq5Var2.k0(ovVar);
            gld.w(oq5Var2, unit, (Function2) ovVar);
            h3 = oq5Var2.h(axfVar4);
            K5 = oq5Var2.K();
            if (h3) {
            }
            i18 = 1;
            K5 = new nl6(axfVar4, i18);
            oq5Var2.k0(K5);
            yci a32222 = eur.a(vciVar, 8675309, new ff6(i18, (Function1) K5));
            int i312222 = i14;
            h4 = oq5Var2.h(axfVar4) | (i292 == 16384) | (i312222 == 2048) | oq5Var2.h(mnjVar2) | oq5Var2.h(qbsVar3);
            K6 = oq5Var2.K();
            if (h4) {
            }
            mnjVar3 = mnjVar2;
            ql6 ql6Var2222 = new ql6(axfVar4, yocVar3, z2, qbsVar3, mnjVar3);
            oq5Var2.k0(ql6Var2222);
            K6 = ql6Var2222;
            Function1 function132222 = (Function1) K6;
            if (z2) {
            }
            uiq uiqVar2222 = qbsVar3.x;
            mbs mbsVar2222 = qbsVar3.w;
            yci x22222 = uwf.x(a32222.f(new SuspendPointerInputElement(uiqVar2222, mbsVar2222, null, new ul6(uiqVar2222, mbsVar2222), 4)), c3x.h);
            int i322222 = i15;
            h5 = oq5Var2.h(axfVar4) | (i322222 == 4) | oq5Var2.h(mnjVar3);
            K7 = oq5Var2.K();
            int i332222 = 11;
            if (!h5) {
            }
            K7 = new lj0(i332222, axfVar4, ybsVar2, mnjVar3);
            oq5Var2.k0(K7);
            yci a42222 = androidx.compose.ui.draw.a.a(vciVar, (Function1) K7);
            kpvVar2 = kpvVar;
            h6 = oq5Var2.h(axfVar4) | (i312222 == 2048) | oq5Var2.f(kpvVar2) | oq5Var2.h(qbsVar3) | (i322222 == 4) | oq5Var2.h(mnjVar3);
            K8 = oq5Var2.K();
            if (h6) {
            }
            mnjVar4 = mnjVar3;
            s23 s23Var2222 = new s23(axfVar4, z2, kpvVar2, qbsVar3, ybsVar2, mnjVar4);
            kpvVar3 = kpvVar2;
            oq5Var2.k0(s23Var2222);
            K8 = s23Var2222;
            yci d52222 = androidx.compose.ui.layout.a.d(vciVar, (Function1) K8);
            axf axfVar72222 = axfVar4;
            mnj mnjVar92222 = mnjVar4;
            lcs lcsVar42222 = lcsVar2;
            qbs qbsVar22222 = qbsVar3;
            CoreTextFieldSemanticsModifier coreTextFieldSemanticsModifier22222 = new CoreTextFieldSemanticsModifier(l7tVar2, ybsVar, axfVar72222, z2, mnjVar92222, qbsVar22222, ideVar, yocVar3);
            axfVar5 = axfVar72222;
            if (!z2 && ((Boolean) ((dwf) kpvVar3).c.getValue()).booleanValue() && rds.b(((rds) axfVar5.z.getValue()).a) && rds.b(((rds) axfVar5.A.getValue()).a)) {
            }
            h7 = oq5Var2.h(qbsVar22222);
            K9 = oq5Var2.K();
            if (!h7) {
            }
            K9 = new hl6(qbsVar22222, 0);
            oq5Var2.k0(K9);
            gld.k(qbsVar22222, (Function1) K9, oq5Var2);
            h8 = oq5Var2.h(axfVar5) | oq5Var2.h(lcsVar42222) | (i322222 == 4) | ((i17 <= 32 && oq5Var2.f(ideVar)) || (i16 & 48) == 32);
            K10 = oq5Var2.K();
            if (h8) {
            }
            ak0 ak0Var2222 = new ak0(axfVar5, lcsVar42222, ybsVar, ideVar, 3);
            ideVar4 = ideVar;
            oq5Var2.k0(ak0Var2222);
            K10 = ak0Var2222;
            gld.k(ideVar4, (Function1) K10, oq5Var2);
            CoreTextFieldSemanticsModifier coreTextFieldSemanticsModifier32222 = coreTextFieldSemanticsModifier;
            mnj mnjVar102222 = mnjVar5;
            yci q2222 = vnj.q(vciVar, new ebs(axfVar5, qbsVar22222, ybsVar, true, i2 == 1, mnjVar102222, mitVar, axfVar5.v, ideVar4.e));
            int i342222 = ideVar4.d;
            if (i342222 == 7) {
            }
            boolean booleanValue22222 = ((Boolean) aqiVar.getValue()).booleanValue();
            ch0 ch0Var322222 = ch0Var;
            g2 = oq5Var2.g(z10) | oq5Var2.h(ch0Var322222);
            K11 = oq5Var2.K();
            if (!g2) {
            }
            K11 = new si2(z10, ch0Var322222, 1);
            oq5Var2.k0(K11);
            yci a522222 = androidx.compose.foundation.text.handwriting.a.a(booleanValue22222, z10, (Function0) K11);
            long j622222 = ((d85) oq5Var2.j(je2.a)).a;
            h9 = oq5Var2.h(axfVar5) | oq5Var2.e(j622222);
            K12 = oq5Var2.K();
            if (!h9) {
            }
            K12 = new ol6(axfVar5, j622222, 0);
            oq5Var2.k0(K12);
            lbs lbsVar322222 = lbsVar;
            yci f522222 = vnj.q(androidx.compose.ui.input.key.a.b(androidx.compose.ui.input.key.a.b(androidx.compose.foundation.text.input.internal.a.a(yciVar.f(androidx.compose.ui.draw.a.a(vciVar, (Function1) K12)), ch0Var322222, axfVar5, qbsVar22222).f(a522222).f(yciVar2), new gcp(12, tocVar, axfVar5)), new sv4(5, axfVar5, qbsVar22222)).f(q2222), new jdp(lbsVar322222, z2, uoiVar2, 2)).f(x22222).f(coreTextFieldSemanticsModifier32222);
            i19 = 0;
            yci d622222 = androidx.compose.ui.layout.a.d(f522222, new nl6(axfVar5, i19));
            if (z2) {
            }
            oq5Var = oq5Var2;
            k(d622222, qbsVar22222, ild.C(-492537660, new ll6(pycVar, axfVar5, gesVar, i3, i2, lbsVar322222, ybsVar, tiuVar, vciVar2, a42222, d52222, (i19 == 0 && x4h.a()) ? vnj.q(vciVar, new wk0(11, qbsVar22222)) : vciVar, lh3Var, qbsVar22222, i19, function12, mnjVar102222, jx7Var2), oq5Var), oq5Var, 384);
        } else {
            oq5Var = r9;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new ml6(ybsVar, function1, yciVar, gesVar, tiuVar, function12, uoiVar, f3rVar, z, i2, i3, ideVar, pbfVar, z2, pycVar, i4, i5);
        }
    }

    public static final String j0() {
        l18 l18Var = l18.b;
        bdt I = hag.I(d76.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        d76 d76Var = (d76) qdcVar.C(I);
        boolean g2 = d76Var.a.g();
        skr skrVar = d76Var.b;
        return g2 ? skrVar.c(R.string.error_unknown) : skrVar.c(hld.y(d76Var.a.a()));
    }

    public static final void k(yci yciVar, qbs qbsVar, wn5 wn5Var, hq5 hq5Var, int i2) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-20551815);
        int i3 = (oq5Var.f(yciVar) ? 4 : 2) | i2 | (oq5Var.h(qbsVar) ? 32 : 16);
        if (oq5Var.P(i3 & 1, (i3 & 147) != 146)) {
            kfh d2 = ug3.d(b2c.b, true);
            int i4 = oq5Var.P;
            androidx.compose.runtime.internal.a l2 = oq5Var.l();
            yci H = vnj.H(oq5Var, yciVar);
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
            wct.f(qbsVar, wn5Var, oq5Var, (i3 >> 3) & 126);
            oq5Var.p(true);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new lf0(yciVar, qbsVar, wn5Var, i2, 3);
        }
    }

    public static final String k0() {
        l18 l18Var = l18.b;
        bdt I = hag.I(d76.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        d76 d76Var = (d76) qdcVar.C(I);
        return d76Var.b.c(hld.y(d76Var.a.a()));
    }

    public static final void l(Function0 function0, hq5 hq5Var, int i2) {
        int i3;
        Function0 function02 = function0;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1338114789);
        if ((((oq5Var.h(function02) ? 4 : 2) | i2) & 3) == 2 && oq5Var.z()) {
            oq5Var.S();
            i3 = 0;
        } else {
            hz2 hz2Var = b2c.l;
            vci vciVar = vci.a;
            float f2 = 16;
            yci p = a.p(androidx.compose.foundation.a.e(d.d(vciVar, 1.0f), false, null, null, function02, 7), f2, 10, f2, 8);
            nho a2 = lho.a(qx0.a, hz2Var, oq5Var, 48);
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
            kb5 kb5Var = wp5.f;
            g0g.U(oq5Var, a2, kb5Var);
            kb5 kb5Var2 = wp5.e;
            g0g.U(oq5Var, l2, kb5Var2);
            kb5 kb5Var3 = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var, i4, kb5Var3);
            }
            kb5 kb5Var4 = wp5.d;
            g0g.U(oq5Var, H, kb5Var4);
            iz2 iz2Var = b2c.f;
            yci m2 = d.m(vciVar, 48);
            agr agrVar = eq0.a;
            yci b2 = androidx.compose.foundation.a.b(m2, ((dq0) oq5Var.j(agrVar)).d.c, o5g.E(oq5Var));
            kfh d2 = ug3.d(iz2Var, false);
            int i5 = oq5Var.P;
            androidx.compose.runtime.internal.a l3 = oq5Var.l();
            yci H2 = vnj.H(oq5Var, b2);
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, d2, kb5Var);
            g0g.U(oq5Var, l3, kb5Var2);
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i5))) {
                ouj.x(i5, oq5Var, i5, kb5Var3);
            }
            g0g.U(oq5Var, H2, kb5Var4);
            gae.b(a0g.E(R.drawable.ic_add_24, 0, oq5Var), null, d.m(vciVar, 24), ((dq0) oq5Var.j(agrVar)).a.c, oq5Var, 432, 0);
            oq5Var.p(true);
            String M = rvf.M(R.string.menu_create_new_playlist, oq5Var);
            ges j2 = nu0.j();
            long j3 = ((dq0) oq5Var.j(agrVar)).b.a;
            yci q = a.q(vciVar, f2, 0.0f, 0.0f, 0.0f, 14);
            if (1.0f <= 0.0d) {
                qme.a("invalid weight; must be greater than zero");
            }
            i3 = 0;
            function02 = function0;
            xcs.b(M, vz1.g(1.0f, q, true), j3, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, j2, oq5Var, 0, 0, 65528);
            oq5Var = oq5Var;
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new zk(function02, i2, i3);
        }
    }

    public static final void l0(axf axfVar, ybs ybsVar, mnj mnjVar) {
        b2r G = wyf.G();
        Function1 e2 = G != null ? G.e() : null;
        b2r Q = wyf.Q(G);
        try {
            dds d2 = axfVar.d();
            if (d2 == null) {
                return;
            }
            pcs pcsVar = axfVar.e;
            if (pcsVar == null) {
                return;
            }
            wof c2 = axfVar.c();
            if (c2 == null) {
                return;
            }
            ezf.L(ybsVar, axfVar.a, d2.a, c2, pcsVar, axfVar.b(), mnjVar);
        } finally {
            wyf.b0(G, Q, e2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x01ad, code lost:
    
        if (r3.h(r9) != false) goto L77;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x020d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0281  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m(final eua euaVar, lta ltaVar, yci yciVar, hq5 hq5Var, int i2) {
        int i3;
        oq5 oq5Var;
        yci yciVar2;
        long j2;
        kjn kjnVar;
        long j3;
        dua duaVar;
        long j4;
        int i4;
        int i5;
        float f2;
        lta ltaVar2;
        boolean z;
        boolean z2;
        kjn kjnVar2;
        long j5;
        boolean z3;
        Object K;
        int i6;
        String str;
        ltaVar.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(422335719);
        if ((i2 & 6) == 0) {
            i3 = i2 | (oq5Var2.f(euaVar) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? oq5Var2.f(ltaVar) : oq5Var2.h(ltaVar) ? 32 : 16;
        }
        int i7 = i3 | 384;
        if (oq5Var2.P(i7 & 1, (i7 & 147) != 146)) {
            ynn i8 = irv.i(oq5Var2);
            Object K2 = oq5Var2.K();
            kjn kjnVar3 = gq5.a;
            if (K2 == kjnVar3) {
                K2 = vz1.h(oq5Var2);
            }
            final uoi uoiVar = (uoi) K2;
            dua duaVar2 = !((ma5) oq5Var2.j(pa5.a)).g() ? euaVar.f : euaVar.e;
            d85 d85Var = duaVar2 != null ? duaVar2.c : null;
            if (d85Var == null) {
                oq5Var2.Z(2137713806);
                j2 = ((dq0) oq5Var2.j(eq0.a)).c.a;
                oq5Var2.p(false);
            } else {
                oq5Var2.Z(2137712504);
                oq5Var2.p(false);
                j2 = d85Var.a;
            }
            d85 d85Var2 = duaVar2 != null ? duaVar2.a : null;
            if (d85Var2 == null) {
                oq5Var2.Z(2137716238);
                kjnVar = kjnVar3;
                j3 = ((dq0) oq5Var2.j(eq0.a)).b.a;
                oq5Var2.p(false);
            } else {
                kjnVar = kjnVar3;
                oq5Var2.Z(2137714781);
                oq5Var2.p(false);
                j3 = d85Var2.a;
            }
            d85 d85Var3 = duaVar2 != null ? duaVar2.b : null;
            if (d85Var3 == null) {
                oq5Var2.Z(2137718864);
                duaVar = duaVar2;
                j4 = ((dq0) oq5Var2.j(eq0.a)).b.b;
                oq5Var2.p(false);
            } else {
                duaVar = duaVar2;
                oq5Var2.Z(2137717314);
                oq5Var2.p(false);
                j4 = d85Var3.a;
            }
            p85 b0 = pd.b0(j2);
            float f3 = b0.a;
            float f4 = b0.b + 0.1f;
            if (f4 > 1.0f) {
                f4 = 1.0f;
            }
            float f5 = b0.c - 0.06f;
            if (f5 < 0.0f) {
                f5 = 0.0f;
            }
            int i9 = d85.o;
            final long z4 = mvt.z(f3, f4, f5, 1.0f, 16);
            final long j6 = j4;
            long j7 = j3;
            final ges j8 = nu0.j();
            final ges i10 = nu0.i();
            ges h2 = nu0.h();
            boolean z5 = euaVar.h != null;
            if (z5) {
                oq5Var2.Z(2137729646);
                i4 = 0;
                i5 = 2;
                f2 = (w1g.p(h2, 0, oq5Var2, 0, 2) * 2) + 4;
                oq5Var2.p(false);
            } else {
                i4 = 0;
                i5 = 2;
                if (z5) {
                    throw vz1.i(oq5Var2, 2137728527, false);
                }
                oq5Var2.Z(2137731497);
                oq5Var2.p(false);
                f2 = 0;
            }
            float f6 = i5;
            float max = Math.max((w1g.p(i10, 0, oq5Var2, 0, i5) * f6) + (w1g.p(j8, i4, oq5Var2, i4, i5) * f6) + 4 + f2, 104);
            vci vciVar = vci.a;
            yci u = xp3.u(d.d(d.e(vciVar, max), 1.0f), o5g.G(oq5Var2));
            geo a2 = eeo.a(0.0f, 7, 0L, false);
            meo meoVar = new meo(0);
            int i11 = i7 & 112;
            if (i11 != 32) {
                if ((i7 & 64) != 0) {
                    ltaVar2 = ltaVar;
                } else {
                    ltaVar2 = ltaVar;
                }
                z = false;
                int i12 = i7 & 14;
                z2 = (i12 != 4) | z;
                Object K3 = oq5Var2.K();
                if (z2) {
                    kjnVar2 = kjnVar;
                    if (K3 != kjnVar2) {
                        j5 = j7;
                        yci d2 = androidx.compose.foundation.a.d(u, uoiVar, a2, false, null, meoVar, (Function0) K3, 12);
                        z3 = (i11 != 32 || ((i7 & 64) != 0 && oq5Var2.h(ltaVar2))) | (i12 == 4);
                        K = oq5Var2.K();
                        if (!z3 || K == kjnVar2) {
                            K = new kw5(23, ltaVar2, euaVar);
                            oq5Var2.k0(K);
                        }
                        yci b2 = com.yandex.music.core.ui.compose.a.b(d2, i8, 0L, 0.0f, null, (Function2) K, 14);
                        kfh d3 = ug3.d(b2c.b, false);
                        i6 = oq5Var2.P;
                        androidx.compose.runtime.internal.a l2 = oq5Var2.l();
                        yci H = vnj.H(oq5Var2, b2);
                        xp5.T.getClass();
                        grb grbVar = wp5.b;
                        oq5Var2.d0();
                        if (oq5Var2.O) {
                            oq5Var2.k(grbVar);
                        } else {
                            oq5Var2.n0();
                        }
                        g0g.U(oq5Var2, d3, wp5.f);
                        g0g.U(oq5Var2, l2, wp5.e);
                        kb5 kb5Var = wp5.g;
                        if (!oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i6))) {
                            ouj.x(i6, oq5Var2, i6, kb5Var);
                        }
                        g0g.U(oq5Var2, H, wp5.d);
                        qo6 qo6Var = qo6.m;
                        str = duaVar != null ? duaVar.d : null;
                        if (str == null) {
                            str = "";
                        }
                        ltg.e(qo6Var, str, d.c(vciVar, 1.0f), null, null, null, ild.C(-471727411, new bu0(j2, 5), oq5Var2), null, oq5Var2, 1573254, 184);
                        oq5Var = oq5Var2;
                        final boolean z6 = z5;
                        final lta ltaVar3 = ltaVar2;
                        final long j9 = j5;
                        zc4.m(z4, ild.C(261286173, new Function2() { // from class: ota
                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Type inference failed for: r9v11 */
                            /* JADX WARN: Type inference failed for: r9v8 */
                            /* JADX WARN: Type inference failed for: r9v9, types: [boolean, int] */
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                ?? r9;
                                hq5 hq5Var2 = (hq5) obj;
                                int intValue = ((Integer) obj2).intValue();
                                int i13 = 1;
                                oq5 oq5Var3 = (oq5) hq5Var2;
                                if (oq5Var3.P(intValue & 1, (intValue & 3) != 2)) {
                                    b bVar = b.a;
                                    vci vciVar2 = vci.a;
                                    yci b3 = bVar.b(vciVar2);
                                    long j10 = z4;
                                    ug3.a(e.a(b3, uoi.this, eeo.a(0.0f, 3, j10, false)), oq5Var3, 0);
                                    float f7 = 16;
                                    yci o = a.o(d.c(vciVar2, 1.0f), f7, 0.0f, 2);
                                    nho a3 = lho.a(qx0.a, b2c.l, oq5Var3, 48);
                                    int i14 = oq5Var3.P;
                                    androidx.compose.runtime.internal.a l3 = oq5Var3.l();
                                    yci H2 = vnj.H(oq5Var3, o);
                                    xp5.T.getClass();
                                    grb grbVar2 = wp5.b;
                                    oq5Var3.d0();
                                    if (oq5Var3.O) {
                                        oq5Var3.k(grbVar2);
                                    } else {
                                        oq5Var3.n0();
                                    }
                                    kb5 kb5Var2 = wp5.f;
                                    g0g.U(oq5Var3, a3, kb5Var2);
                                    kb5 kb5Var3 = wp5.e;
                                    g0g.U(oq5Var3, l3, kb5Var3);
                                    kb5 kb5Var4 = wp5.g;
                                    if (oq5Var3.O || !Intrinsics.d(oq5Var3.K(), Integer.valueOf(i14))) {
                                        ouj.x(i14, oq5Var3, i14, kb5Var4);
                                    }
                                    kb5 kb5Var5 = wp5.d;
                                    g0g.U(oq5Var3, H2, kb5Var5);
                                    qo6 qo6Var2 = qo6.m;
                                    eua euaVar2 = euaVar;
                                    ltg.e(qo6Var2, euaVar2.d, d.m(a.o(vciVar2, 0.0f, f7, 1), 72), hd6.b, null, null, null, null, oq5Var3, 3462, 240);
                                    yci q = a.q(vciVar2, 12, 0.0f, f7, 0.0f, 10);
                                    if (1.0f <= 0.0d) {
                                        qme.a("invalid weight; must be greater than zero");
                                    }
                                    yci g2 = vz1.g(1.0f, q, true);
                                    ta5 a4 = sa5.a(qx0.c, b2c.n, oq5Var3, 0);
                                    int i15 = oq5Var3.P;
                                    androidx.compose.runtime.internal.a l4 = oq5Var3.l();
                                    yci H3 = vnj.H(oq5Var3, g2);
                                    oq5Var3.d0();
                                    if (oq5Var3.O) {
                                        oq5Var3.k(grbVar2);
                                    } else {
                                        oq5Var3.n0();
                                    }
                                    g0g.U(oq5Var3, a4, kb5Var2);
                                    g0g.U(oq5Var3, l4, kb5Var3);
                                    if (oq5Var3.O || !Intrinsics.d(oq5Var3.K(), Integer.valueOf(i15))) {
                                        ouj.x(i15, oq5Var3, i15, kb5Var4);
                                    }
                                    g0g.U(oq5Var3, H3, kb5Var5);
                                    xv7.j(euaVar2.b, null, j9, 0L, 0L, 0, 0L, 2, false, 2, 0, null, j8, oq5Var3, 0, 3120, 55290);
                                    float f8 = 4;
                                    u1g.l(oq5Var3, d.e(vciVar2, f8));
                                    String str2 = euaVar2.c;
                                    long j11 = j6;
                                    xv7.j(str2, null, j11, 0L, 0L, 0, 0L, 2, false, 2, 0, null, i10, oq5Var3, 0, 3120, 55290);
                                    if (z6) {
                                        oq5Var3.Z(-1365721258);
                                        u1g.l(oq5Var3, d.e(vciVar2, f8));
                                        lta ltaVar4 = ltaVar3;
                                        boolean h3 = oq5Var3.h(ltaVar4) | oq5Var3.f(euaVar2);
                                        Object K4 = oq5Var3.K();
                                        if (h3 || K4 == gq5.a) {
                                            K4 = new nta(ltaVar4, euaVar2, i13);
                                            oq5Var3.k0(K4);
                                        }
                                        lg3.a((Function0) K4, null, j11, j10, oq5Var3, 0, 2);
                                        r9 = 0;
                                    } else {
                                        r9 = 0;
                                        oq5Var3.Z(-1372565345);
                                    }
                                    oq5Var3.p(r9);
                                    oq5Var3.p(true);
                                    gae.b(a0g.E(R.drawable.ic_arrow_mid_right_edge_24, r9, oq5Var3), null, null, ((dq0) oq5Var3.j(eq0.a)).a.c, oq5Var3, 48, 4);
                                    oq5Var3.p(true);
                                } else {
                                    oq5Var3.S();
                                }
                                return Unit.a;
                            }
                        }, oq5Var), oq5Var, 48, 0);
                        oq5Var.p(true);
                        yciVar2 = vciVar;
                    }
                } else {
                    kjnVar2 = kjnVar;
                }
                j5 = j7;
                K3 = new nta(ltaVar2, euaVar, 0);
                oq5Var2.k0(K3);
                yci d22 = androidx.compose.foundation.a.d(u, uoiVar, a2, false, null, meoVar, (Function0) K3, 12);
                z3 = (i11 != 32 || ((i7 & 64) != 0 && oq5Var2.h(ltaVar2))) | (i12 == 4);
                K = oq5Var2.K();
                if (!z3) {
                }
                K = new kw5(23, ltaVar2, euaVar);
                oq5Var2.k0(K);
                yci b22 = com.yandex.music.core.ui.compose.a.b(d22, i8, 0L, 0.0f, null, (Function2) K, 14);
                kfh d32 = ug3.d(b2c.b, false);
                i6 = oq5Var2.P;
                androidx.compose.runtime.internal.a l22 = oq5Var2.l();
                yci H2 = vnj.H(oq5Var2, b22);
                xp5.T.getClass();
                grb grbVar2 = wp5.b;
                oq5Var2.d0();
                if (oq5Var2.O) {
                }
                g0g.U(oq5Var2, d32, wp5.f);
                g0g.U(oq5Var2, l22, wp5.e);
                kb5 kb5Var2 = wp5.g;
                if (!oq5Var2.O) {
                }
                ouj.x(i6, oq5Var2, i6, kb5Var2);
                g0g.U(oq5Var2, H2, wp5.d);
                qo6 qo6Var2 = qo6.m;
                if (duaVar != null) {
                }
                if (str == null) {
                }
                ltg.e(qo6Var2, str, d.c(vciVar, 1.0f), null, null, null, ild.C(-471727411, new bu0(j2, 5), oq5Var2), null, oq5Var2, 1573254, 184);
                oq5Var = oq5Var2;
                final boolean z62 = z5;
                final lta ltaVar32 = ltaVar2;
                final long j92 = j5;
                zc4.m(z4, ild.C(261286173, new Function2() { // from class: ota
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r9v11 */
                    /* JADX WARN: Type inference failed for: r9v8 */
                    /* JADX WARN: Type inference failed for: r9v9, types: [boolean, int] */
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ?? r9;
                        hq5 hq5Var2 = (hq5) obj;
                        int intValue = ((Integer) obj2).intValue();
                        int i13 = 1;
                        oq5 oq5Var3 = (oq5) hq5Var2;
                        if (oq5Var3.P(intValue & 1, (intValue & 3) != 2)) {
                            b bVar = b.a;
                            vci vciVar2 = vci.a;
                            yci b3 = bVar.b(vciVar2);
                            long j10 = z4;
                            ug3.a(e.a(b3, uoi.this, eeo.a(0.0f, 3, j10, false)), oq5Var3, 0);
                            float f7 = 16;
                            yci o = a.o(d.c(vciVar2, 1.0f), f7, 0.0f, 2);
                            nho a3 = lho.a(qx0.a, b2c.l, oq5Var3, 48);
                            int i14 = oq5Var3.P;
                            androidx.compose.runtime.internal.a l3 = oq5Var3.l();
                            yci H22 = vnj.H(oq5Var3, o);
                            xp5.T.getClass();
                            grb grbVar22 = wp5.b;
                            oq5Var3.d0();
                            if (oq5Var3.O) {
                                oq5Var3.k(grbVar22);
                            } else {
                                oq5Var3.n0();
                            }
                            kb5 kb5Var22 = wp5.f;
                            g0g.U(oq5Var3, a3, kb5Var22);
                            kb5 kb5Var3 = wp5.e;
                            g0g.U(oq5Var3, l3, kb5Var3);
                            kb5 kb5Var4 = wp5.g;
                            if (oq5Var3.O || !Intrinsics.d(oq5Var3.K(), Integer.valueOf(i14))) {
                                ouj.x(i14, oq5Var3, i14, kb5Var4);
                            }
                            kb5 kb5Var5 = wp5.d;
                            g0g.U(oq5Var3, H22, kb5Var5);
                            qo6 qo6Var22 = qo6.m;
                            eua euaVar2 = euaVar;
                            ltg.e(qo6Var22, euaVar2.d, d.m(a.o(vciVar2, 0.0f, f7, 1), 72), hd6.b, null, null, null, null, oq5Var3, 3462, 240);
                            yci q = a.q(vciVar2, 12, 0.0f, f7, 0.0f, 10);
                            if (1.0f <= 0.0d) {
                                qme.a("invalid weight; must be greater than zero");
                            }
                            yci g2 = vz1.g(1.0f, q, true);
                            ta5 a4 = sa5.a(qx0.c, b2c.n, oq5Var3, 0);
                            int i15 = oq5Var3.P;
                            androidx.compose.runtime.internal.a l4 = oq5Var3.l();
                            yci H3 = vnj.H(oq5Var3, g2);
                            oq5Var3.d0();
                            if (oq5Var3.O) {
                                oq5Var3.k(grbVar22);
                            } else {
                                oq5Var3.n0();
                            }
                            g0g.U(oq5Var3, a4, kb5Var22);
                            g0g.U(oq5Var3, l4, kb5Var3);
                            if (oq5Var3.O || !Intrinsics.d(oq5Var3.K(), Integer.valueOf(i15))) {
                                ouj.x(i15, oq5Var3, i15, kb5Var4);
                            }
                            g0g.U(oq5Var3, H3, kb5Var5);
                            xv7.j(euaVar2.b, null, j92, 0L, 0L, 0, 0L, 2, false, 2, 0, null, j8, oq5Var3, 0, 3120, 55290);
                            float f8 = 4;
                            u1g.l(oq5Var3, d.e(vciVar2, f8));
                            String str2 = euaVar2.c;
                            long j11 = j6;
                            xv7.j(str2, null, j11, 0L, 0L, 0, 0L, 2, false, 2, 0, null, i10, oq5Var3, 0, 3120, 55290);
                            if (z62) {
                                oq5Var3.Z(-1365721258);
                                u1g.l(oq5Var3, d.e(vciVar2, f8));
                                lta ltaVar4 = ltaVar32;
                                boolean h3 = oq5Var3.h(ltaVar4) | oq5Var3.f(euaVar2);
                                Object K4 = oq5Var3.K();
                                if (h3 || K4 == gq5.a) {
                                    K4 = new nta(ltaVar4, euaVar2, i13);
                                    oq5Var3.k0(K4);
                                }
                                lg3.a((Function0) K4, null, j11, j10, oq5Var3, 0, 2);
                                r9 = 0;
                            } else {
                                r9 = 0;
                                oq5Var3.Z(-1372565345);
                            }
                            oq5Var3.p(r9);
                            oq5Var3.p(true);
                            gae.b(a0g.E(R.drawable.ic_arrow_mid_right_edge_24, r9, oq5Var3), null, null, ((dq0) oq5Var3.j(eq0.a)).a.c, oq5Var3, 48, 4);
                            oq5Var3.p(true);
                        } else {
                            oq5Var3.S();
                        }
                        return Unit.a;
                    }
                }, oq5Var), oq5Var, 48, 0);
                oq5Var.p(true);
                yciVar2 = vciVar;
            } else {
                ltaVar2 = ltaVar;
            }
            z = true;
            int i122 = i7 & 14;
            z2 = (i122 != 4) | z;
            Object K32 = oq5Var2.K();
            if (z2) {
            }
            j5 = j7;
            K32 = new nta(ltaVar2, euaVar, 0);
            oq5Var2.k0(K32);
            yci d222 = androidx.compose.foundation.a.d(u, uoiVar, a2, false, null, meoVar, (Function0) K32, 12);
            z3 = (i11 != 32 || ((i7 & 64) != 0 && oq5Var2.h(ltaVar2))) | (i122 == 4);
            K = oq5Var2.K();
            if (!z3) {
            }
            K = new kw5(23, ltaVar2, euaVar);
            oq5Var2.k0(K);
            yci b222 = com.yandex.music.core.ui.compose.a.b(d222, i8, 0L, 0.0f, null, (Function2) K, 14);
            kfh d322 = ug3.d(b2c.b, false);
            i6 = oq5Var2.P;
            androidx.compose.runtime.internal.a l222 = oq5Var2.l();
            yci H22 = vnj.H(oq5Var2, b222);
            xp5.T.getClass();
            grb grbVar22 = wp5.b;
            oq5Var2.d0();
            if (oq5Var2.O) {
            }
            g0g.U(oq5Var2, d322, wp5.f);
            g0g.U(oq5Var2, l222, wp5.e);
            kb5 kb5Var22 = wp5.g;
            if (!oq5Var2.O) {
            }
            ouj.x(i6, oq5Var2, i6, kb5Var22);
            g0g.U(oq5Var2, H22, wp5.d);
            qo6 qo6Var22 = qo6.m;
            if (duaVar != null) {
            }
            if (str == null) {
            }
            ltg.e(qo6Var22, str, d.c(vciVar, 1.0f), null, null, null, ild.C(-471727411, new bu0(j2, 5), oq5Var2), null, oq5Var2, 1573254, 184);
            oq5Var = oq5Var2;
            final boolean z622 = z5;
            final lta ltaVar322 = ltaVar2;
            final long j922 = j5;
            zc4.m(z4, ild.C(261286173, new Function2() { // from class: ota
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r9v11 */
                /* JADX WARN: Type inference failed for: r9v8 */
                /* JADX WARN: Type inference failed for: r9v9, types: [boolean, int] */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ?? r9;
                    hq5 hq5Var2 = (hq5) obj;
                    int intValue = ((Integer) obj2).intValue();
                    int i13 = 1;
                    oq5 oq5Var3 = (oq5) hq5Var2;
                    if (oq5Var3.P(intValue & 1, (intValue & 3) != 2)) {
                        b bVar = b.a;
                        vci vciVar2 = vci.a;
                        yci b3 = bVar.b(vciVar2);
                        long j10 = z4;
                        ug3.a(e.a(b3, uoi.this, eeo.a(0.0f, 3, j10, false)), oq5Var3, 0);
                        float f7 = 16;
                        yci o = a.o(d.c(vciVar2, 1.0f), f7, 0.0f, 2);
                        nho a3 = lho.a(qx0.a, b2c.l, oq5Var3, 48);
                        int i14 = oq5Var3.P;
                        androidx.compose.runtime.internal.a l3 = oq5Var3.l();
                        yci H222 = vnj.H(oq5Var3, o);
                        xp5.T.getClass();
                        grb grbVar222 = wp5.b;
                        oq5Var3.d0();
                        if (oq5Var3.O) {
                            oq5Var3.k(grbVar222);
                        } else {
                            oq5Var3.n0();
                        }
                        kb5 kb5Var222 = wp5.f;
                        g0g.U(oq5Var3, a3, kb5Var222);
                        kb5 kb5Var3 = wp5.e;
                        g0g.U(oq5Var3, l3, kb5Var3);
                        kb5 kb5Var4 = wp5.g;
                        if (oq5Var3.O || !Intrinsics.d(oq5Var3.K(), Integer.valueOf(i14))) {
                            ouj.x(i14, oq5Var3, i14, kb5Var4);
                        }
                        kb5 kb5Var5 = wp5.d;
                        g0g.U(oq5Var3, H222, kb5Var5);
                        qo6 qo6Var222 = qo6.m;
                        eua euaVar2 = euaVar;
                        ltg.e(qo6Var222, euaVar2.d, d.m(a.o(vciVar2, 0.0f, f7, 1), 72), hd6.b, null, null, null, null, oq5Var3, 3462, 240);
                        yci q = a.q(vciVar2, 12, 0.0f, f7, 0.0f, 10);
                        if (1.0f <= 0.0d) {
                            qme.a("invalid weight; must be greater than zero");
                        }
                        yci g2 = vz1.g(1.0f, q, true);
                        ta5 a4 = sa5.a(qx0.c, b2c.n, oq5Var3, 0);
                        int i15 = oq5Var3.P;
                        androidx.compose.runtime.internal.a l4 = oq5Var3.l();
                        yci H3 = vnj.H(oq5Var3, g2);
                        oq5Var3.d0();
                        if (oq5Var3.O) {
                            oq5Var3.k(grbVar222);
                        } else {
                            oq5Var3.n0();
                        }
                        g0g.U(oq5Var3, a4, kb5Var222);
                        g0g.U(oq5Var3, l4, kb5Var3);
                        if (oq5Var3.O || !Intrinsics.d(oq5Var3.K(), Integer.valueOf(i15))) {
                            ouj.x(i15, oq5Var3, i15, kb5Var4);
                        }
                        g0g.U(oq5Var3, H3, kb5Var5);
                        xv7.j(euaVar2.b, null, j922, 0L, 0L, 0, 0L, 2, false, 2, 0, null, j8, oq5Var3, 0, 3120, 55290);
                        float f8 = 4;
                        u1g.l(oq5Var3, d.e(vciVar2, f8));
                        String str2 = euaVar2.c;
                        long j11 = j6;
                        xv7.j(str2, null, j11, 0L, 0L, 0, 0L, 2, false, 2, 0, null, i10, oq5Var3, 0, 3120, 55290);
                        if (z622) {
                            oq5Var3.Z(-1365721258);
                            u1g.l(oq5Var3, d.e(vciVar2, f8));
                            lta ltaVar4 = ltaVar322;
                            boolean h3 = oq5Var3.h(ltaVar4) | oq5Var3.f(euaVar2);
                            Object K4 = oq5Var3.K();
                            if (h3 || K4 == gq5.a) {
                                K4 = new nta(ltaVar4, euaVar2, i13);
                                oq5Var3.k0(K4);
                            }
                            lg3.a((Function0) K4, null, j11, j10, oq5Var3, 0, 2);
                            r9 = 0;
                        } else {
                            r9 = 0;
                            oq5Var3.Z(-1372565345);
                        }
                        oq5Var3.p(r9);
                        oq5Var3.p(true);
                        gae.b(a0g.E(R.drawable.ic_arrow_mid_right_edge_24, r9, oq5Var3), null, null, ((dq0) oq5Var3.j(eq0.a)).a.c, oq5Var3, 48, 4);
                        oq5Var3.p(true);
                    } else {
                        oq5Var3.S();
                    }
                    return Unit.a;
                }
            }, oq5Var), oq5Var, 48, 0);
            oq5Var.p(true);
            yciVar2 = vciVar;
        } else {
            oq5Var = oq5Var2;
            oq5Var.S();
            yciVar2 = yciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new yja(euaVar, ltaVar, yciVar2, i2, 1);
        }
    }

    public static final zj0 m0() {
        Pair[] pairArr = {new Pair(Float.valueOf(0.0f), new d85(c3x.h(4294925389L))), new Pair(Float.valueOf(0.27f), new d85(c3x.h(4293609119L))), new Pair(Float.valueOf(0.75f), new d85(c3x.h(4286792175L))), new Pair(Float.valueOf(1.0f), new d85(c3x.h(4282345721L)))};
        ArrayList arrayList = new ArrayList(4);
        for (int i2 = 0; i2 < 4; i2++) {
            arrayList.add(new d85(((d85) pairArr[i2].b).a));
        }
        ArrayList arrayList2 = new ArrayList(4);
        for (int i3 = 0; i3 < 4; i3++) {
            arrayList2.add(Float.valueOf(((Number) pairArr[i3].a).floatValue()));
        }
        return new zj0(arrayList, arrayList2);
    }

    public static final void n(final lta ltaVar, final yci yciVar, hq5 hq5Var, final int i2) {
        ltaVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(2026550437);
        int w = oq5Var.w();
        int i3 = (oq5Var.f(ltaVar) ? 4 : 2) | i2 | 48;
        if (oq5Var.P(i3 & 1, (i3 & 19) != 18)) {
            iua iuaVar = (iua) szf.Q(ltaVar.c, oq5Var).getValue();
            final vci vciVar = vci.a;
            yci a2 = androidx.compose.ui.platform.a.a(vciVar, "dynamic_banner_block");
            kfh d2 = ug3.d(b2c.b, false);
            int i4 = oq5Var.P;
            androidx.compose.runtime.internal.a l2 = oq5Var.l();
            yci H = vnj.H(oq5Var, a2);
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
            oq5Var.Z(1474489700);
            if (Intrinsics.d(iuaVar, gua.a) || Intrinsics.d(iuaVar, fua.a)) {
                oq5Var.Z(1474576189);
                oq5Var.p(false);
                oq5Var.t(w);
                xmn r = oq5Var.r();
                if (r != null) {
                    final int i5 = 0;
                    r.d = new Function2(ltaVar, vciVar, i2, i5) { // from class: mta
                        public final /* synthetic */ int a;
                        public final /* synthetic */ lta b;
                        public final /* synthetic */ yci c;

                        {
                            this.a = i5;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i6 = this.a;
                            hq5 hq5Var2 = (hq5) obj;
                            ((Integer) obj2).getClass();
                            switch (i6) {
                                case 0:
                                    j66.n(this.b, this.c, hq5Var2, rvf.R(1));
                                    break;
                                default:
                                    j66.n(this.b, this.c, hq5Var2, rvf.R(1));
                                    break;
                            }
                            return Unit.a;
                        }
                    };
                    return;
                }
                return;
            }
            if (!(iuaVar instanceof hua)) {
                throw vz1.i(oq5Var, -783719809, false);
            }
            oq5Var.Z(-783715138);
            m(((hua) iuaVar).a, ltaVar, null, oq5Var, (i3 << 3) & 112);
            f1d.u(oq5Var, false, false, true);
            yciVar = vciVar;
        } else {
            oq5Var.S();
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            final int i6 = 1;
            r2.d = new Function2(ltaVar, yciVar, i2, i6) { // from class: mta
                public final /* synthetic */ int a;
                public final /* synthetic */ lta b;
                public final /* synthetic */ yci c;

                {
                    this.a = i6;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i62 = this.a;
                    hq5 hq5Var2 = (hq5) obj;
                    ((Integer) obj2).getClass();
                    switch (i62) {
                        case 0:
                            j66.n(this.b, this.c, hq5Var2, rvf.R(1));
                            break;
                        default:
                            j66.n(this.b, this.c, hq5Var2, rvf.R(1));
                            break;
                    }
                    return Unit.a;
                }
            };
        }
    }

    public static final bb0 n0(hq5 hq5Var) {
        oq5 oq5Var = (oq5) hq5Var;
        jx7 jx7Var = (jx7) oq5Var.j(es5.h);
        boolean f2 = oq5Var.f(jx7Var);
        Object K = oq5Var.K();
        if (f2 || K == gq5.a) {
            K = new bb0(jx7Var);
            oq5Var.k0(K);
        }
        return (bb0) K;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x009e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void o(wn5 wn5Var, uoi uoiVar, yci yciVar, Function0 function0, Function0 function02, wn5 wn5Var2, hq5 hq5Var, int i2, int i3) {
        int i4;
        Function0 function03;
        Function0 function04;
        Function0 function05;
        int i5;
        int i6;
        xmn r;
        uoiVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1530738874);
        if ((i2 & 6) == 0) {
            i4 = (oq5Var.h(wn5Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= oq5Var.f(uoiVar) ? 32 : 16;
        }
        yci yciVar2 = yciVar;
        if ((i2 & 384) == 0) {
            i4 |= oq5Var.f(yciVar2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= oq5Var.h(function0) ? 2048 : 1024;
        }
        int i7 = i3 & 16;
        if (i7 != 0) {
            i4 |= 24576;
        } else if ((i2 & 24576) == 0) {
            function03 = function02;
            i4 |= oq5Var.h(function03) ? 16384 : RemoteCameraConfig.Notification.ID;
            if ((196608 & i2) == 0) {
                i4 |= oq5Var.h(wn5Var2) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
            }
            if ((74899 & i4) == 74898 || !oq5Var.z()) {
                function04 = i7 == 0 ? null : function03;
                if (function0 == null || function04 != null) {
                    oq5Var.Z(1721328045);
                    if (function0 != null) {
                        oq5Var.Z(1721373274);
                        Object K = oq5Var.K();
                        if (K == gq5.a) {
                            K = new htb(26);
                            oq5Var.k0(K);
                        }
                        oq5Var.p(false);
                        function05 = (Function0) K;
                    } else {
                        oq5Var.Z(2133737811);
                        oq5Var.p(false);
                        function05 = function0;
                    }
                    yci f2 = androidx.compose.foundation.a.f(yciVar2, uoiVar, null, false, null, irf.S(function04, oq5Var, (i4 >> 12) & 14), null, function05, 188);
                    oq5Var.p(false);
                    yciVar2 = f2;
                } else {
                    oq5Var.Z(1721539620);
                    oq5Var.p(false);
                }
                ta5 a2 = sa5.a(qx0.c, b2c.n, oq5Var, 0);
                i5 = oq5Var.P;
                androidx.compose.runtime.internal.a l2 = oq5Var.l();
                yci H = vnj.H(oq5Var, yciVar2);
                xp5.T.getClass();
                grb grbVar = wp5.b;
                oq5Var.d0();
                if (oq5Var.O) {
                    oq5Var.n0();
                } else {
                    oq5Var.k(grbVar);
                }
                kb5 kb5Var = wp5.f;
                g0g.U(oq5Var, a2, kb5Var);
                kb5 kb5Var2 = wp5.e;
                g0g.U(oq5Var, l2, kb5Var2);
                kb5 kb5Var3 = wp5.g;
                if (!oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i5))) {
                    ouj.x(i5, oq5Var, i5, kb5Var3);
                }
                kb5 kb5Var4 = wp5.d;
                g0g.U(oq5Var, H, kb5Var4);
                vci vciVar = vci.a;
                yci d2 = a.d(vciVar, 1.0f);
                kfh d3 = ug3.d(b2c.b, false);
                i6 = oq5Var.P;
                int i8 = i4;
                androidx.compose.runtime.internal.a l3 = oq5Var.l();
                yci H2 = vnj.H(oq5Var, d2);
                oq5Var.d0();
                Function0 function06 = function04;
                if (oq5Var.O) {
                    oq5Var.n0();
                } else {
                    oq5Var.k(grbVar);
                }
                g0g.U(oq5Var, d3, kb5Var);
                g0g.U(oq5Var, l3, kb5Var2);
                if (!oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i6))) {
                    ouj.x(i6, oq5Var, i6, kb5Var3);
                }
                g0g.U(oq5Var, H2, kb5Var4);
                wn5Var.invoke(b.a, oq5Var, Integer.valueOf(((i8 << 3) & 112) | 6));
                oq5Var.p(true);
                u1g.l(oq5Var, d.e(vciVar, 8));
                wn5Var2.invoke(wa5.a, oq5Var, Integer.valueOf(6 | ((i8 >> 12) & 112)));
                oq5Var.p(true);
                function03 = function06;
            } else {
                oq5Var.S();
            }
            r = oq5Var.r();
            if (r == null) {
                r.d = new fd1(wn5Var, uoiVar, yciVar, function0, function03, wn5Var2, i2, i3);
                return;
            }
            return;
        }
        function03 = function02;
        if ((196608 & i2) == 0) {
        }
        if ((74899 & i4) == 74898) {
        }
        if (i7 == 0) {
        }
        if (function0 == null) {
        }
        oq5Var.Z(1721328045);
        if (function0 != null) {
        }
        yci f22 = androidx.compose.foundation.a.f(yciVar2, uoiVar, null, false, null, irf.S(function04, oq5Var, (i4 >> 12) & 14), null, function05, 188);
        oq5Var.p(false);
        yciVar2 = f22;
        ta5 a22 = sa5.a(qx0.c, b2c.n, oq5Var, 0);
        i5 = oq5Var.P;
        androidx.compose.runtime.internal.a l22 = oq5Var.l();
        yci H3 = vnj.H(oq5Var, yciVar2);
        xp5.T.getClass();
        grb grbVar2 = wp5.b;
        oq5Var.d0();
        if (oq5Var.O) {
        }
        kb5 kb5Var5 = wp5.f;
        g0g.U(oq5Var, a22, kb5Var5);
        kb5 kb5Var22 = wp5.e;
        g0g.U(oq5Var, l22, kb5Var22);
        kb5 kb5Var32 = wp5.g;
        if (!oq5Var.O) {
        }
        ouj.x(i5, oq5Var, i5, kb5Var32);
        kb5 kb5Var42 = wp5.d;
        g0g.U(oq5Var, H3, kb5Var42);
        vci vciVar2 = vci.a;
        yci d22 = a.d(vciVar2, 1.0f);
        kfh d32 = ug3.d(b2c.b, false);
        i6 = oq5Var.P;
        int i82 = i4;
        androidx.compose.runtime.internal.a l32 = oq5Var.l();
        yci H22 = vnj.H(oq5Var, d22);
        oq5Var.d0();
        Function0 function062 = function04;
        if (oq5Var.O) {
        }
        g0g.U(oq5Var, d32, kb5Var5);
        g0g.U(oq5Var, l32, kb5Var22);
        if (!oq5Var.O) {
        }
        ouj.x(i6, oq5Var, i6, kb5Var32);
        g0g.U(oq5Var, H22, kb5Var42);
        wn5Var.invoke(b.a, oq5Var, Integer.valueOf(((i82 << 3) & 112) | 6));
        oq5Var.p(true);
        u1g.l(oq5Var, d.e(vciVar2, 8));
        wn5Var2.invoke(wa5.a, oq5Var, Integer.valueOf(6 | ((i82 >> 12) & 112)));
        oq5Var.p(true);
        function03 = function062;
        r = oq5Var.r();
        if (r == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void p(String str, dup dupVar, yci yciVar, Function0 function0, qo6 qo6Var, Function0 function02, pyc pycVar, wn5 wn5Var, hq5 hq5Var, int i2, int i3) {
        int i4;
        Function0 function03;
        int i5;
        pyc pycVar2;
        Object K;
        xmn r;
        str.getClass();
        dupVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1134651916);
        if ((i2 & 6) == 0) {
            i4 = (oq5Var.f(str) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= oq5Var.f(dupVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= oq5Var.f(yciVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= oq5Var.h(function0) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= oq5Var.d(qo6Var == null ? -1 : qo6Var.ordinal()) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        int i6 = i3 & 32;
        if (i6 != 0) {
            i4 |= 196608;
        } else if ((196608 & i2) == 0) {
            function03 = function02;
            i4 |= oq5Var.h(function03) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
            i5 = i3 & 64;
            if (i5 == 0) {
                i4 |= ScreenMirroringConfig.Video.BITRATE_1_5MB;
            } else if ((1572864 & i2) == 0) {
                pycVar2 = pycVar;
                i4 |= oq5Var.h(pycVar2) ? 1048576 : 524288;
                if ((12582912 & i2) == 0) {
                    i4 |= oq5Var.h(wn5Var) ? 8388608 : RemoteCameraConfig.Camera.BITRATE;
                }
                if ((4793491 & i4) == 4793490 || !oq5Var.z()) {
                    if (i6 != 0) {
                        function03 = null;
                    }
                    pyc pycVar3 = i5 != 0 ? null : pycVar2;
                    K = oq5Var.K();
                    if (K == gq5.a) {
                        K = vz1.h(oq5Var);
                    }
                    uoi uoiVar = (uoi) K;
                    o(ild.C(-2082831142, new lc(str, dupVar, uoiVar, pycVar3, qo6Var, 5), oq5Var), uoiVar, yciVar, function0, function03, wn5Var, oq5Var, (i4 & 896) | 54 | (i4 & 7168) | ((i4 >> 3) & 57344) | ((i4 >> 6) & 458752), 0);
                    pycVar2 = pycVar3;
                } else {
                    oq5Var.S();
                }
                r = oq5Var.r();
                if (r != null) {
                    r.d = new gd1(str, dupVar, yciVar, function0, qo6Var, function03, pycVar2, wn5Var, i2, i3);
                    return;
                }
                return;
            }
            pycVar2 = pycVar;
            if ((12582912 & i2) == 0) {
            }
            if ((4793491 & i4) == 4793490) {
            }
            if (i6 != 0) {
            }
            if (i5 != 0) {
            }
            K = oq5Var.K();
            if (K == gq5.a) {
            }
            uoi uoiVar2 = (uoi) K;
            o(ild.C(-2082831142, new lc(str, dupVar, uoiVar2, pycVar3, qo6Var, 5), oq5Var), uoiVar2, yciVar, function0, function03, wn5Var, oq5Var, (i4 & 896) | 54 | (i4 & 7168) | ((i4 >> 3) & 57344) | ((i4 >> 6) & 458752), 0);
            pycVar2 = pycVar3;
            r = oq5Var.r();
            if (r != null) {
            }
        }
        function03 = function02;
        i5 = i3 & 64;
        if (i5 == 0) {
        }
        pycVar2 = pycVar;
        if ((12582912 & i2) == 0) {
        }
        if ((4793491 & i4) == 4793490) {
        }
        if (i6 != 0) {
        }
        if (i5 != 0) {
        }
        K = oq5Var.K();
        if (K == gq5.a) {
        }
        uoi uoiVar22 = (uoi) K;
        o(ild.C(-2082831142, new lc(str, dupVar, uoiVar22, pycVar3, qo6Var, 5), oq5Var), uoiVar22, yciVar, function0, function03, wn5Var, oq5Var, (i4 & 896) | 54 | (i4 & 7168) | ((i4 >> 3) & 57344) | ((i4 >> 6) & 458752), 0);
        pycVar2 = pycVar3;
        r = oq5Var.r();
        if (r != null) {
        }
    }

    public static final void q(String str, wn5 wn5Var, dup dupVar, yci yciVar, uoi uoiVar, hq5 hq5Var, int i2) {
        int i3;
        yci yciVar2;
        yci yciVar3;
        str.getClass();
        dupVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(2096249878);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var.f(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var.h(wn5Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= oq5Var.f(dupVar) ? 256 : 128;
        }
        int i4 = i3 | 3072;
        if ((i2 & 24576) == 0) {
            i4 |= oq5Var.f(uoiVar) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((i4 & 9363) == 9362 && oq5Var.z()) {
            oq5Var.S();
            yciVar3 = yciVar;
        } else {
            oq5Var.W(156478175, str);
            iz2 iz2Var = b2c.f;
            vci vciVar = vci.a;
            yci u = xp3.u(vciVar, dupVar);
            if (uoiVar != null) {
                oq5Var.Z(556154475);
                yciVar2 = e.a(vciVar, uoiVar, (yie) oq5Var.j(e.a));
                oq5Var.p(false);
            } else {
                oq5Var.Z(556347636);
                oq5Var.p(false);
                yciVar2 = vciVar;
            }
            w1g.j(str, null, androidx.compose.ui.platform.a.a(d.c(u.f(yciVar2), 1.0f), "grid_image"), null, null, iz2Var, hd6.a, 0.0f, null, 0, ild.C(1587164905, new j26(wn5Var, 4), oq5Var), oq5Var, (i4 & 14) | 1769520, 920);
            oq5Var.p(false);
            yciVar3 = vciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new tu(i2, 14, str, wn5Var, dupVar, yciVar3, uoiVar);
        }
    }

    public static final void r(String str, yci yciVar, jzb jzbVar, int i2, hq5 hq5Var, int i3, int i4) {
        int i5;
        int i6;
        yci yciVar2;
        jzb jzbVar2;
        int i7;
        str.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(786136378);
        int i8 = i3 | (oq5Var.f(str) ? 4 : 2);
        int i9 = i4 & 2;
        if (i9 != 0) {
            i8 |= 48;
        } else if ((i3 & 48) == 0) {
            i8 |= oq5Var.f(yciVar) ? 32 : 16;
        }
        int i10 = i4 & 4;
        if (i10 != 0) {
            i5 = i8 | 384;
        } else {
            i5 = i8 | (oq5Var.d(jzbVar == null ? -1 : jzbVar.ordinal()) ? 256 : 128);
        }
        int i11 = i4 & 8;
        if (i11 != 0) {
            i6 = i5 | 3072;
        } else {
            i6 = i5 | (oq5Var.d(i2) ? 2048 : 1024);
        }
        if ((i6 & 1171) == 1170 && oq5Var.z()) {
            oq5Var.S();
            yciVar2 = yciVar;
            jzbVar2 = jzbVar;
            i7 = i2;
        } else {
            yciVar2 = i9 != 0 ? vci.a : yciVar;
            jzb jzbVar3 = i10 != 0 ? null : jzbVar;
            int i12 = i11 != 0 ? 1 : i2;
            bg3.a(yciVar2, null, false, ild.C(-1598011356, new dv(jzbVar3, str, i12, 1), oq5Var), oq5Var, ((i6 >> 3) & 14) | 3072, 6);
            jzbVar2 = jzbVar3;
            i7 = i12;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new vpd(str, yciVar2, jzbVar2, i7, i3, i4);
        }
    }

    public static final void s(ArrayList arrayList, ygf ygfVar, fvf fvfVar, o0k o0kVar, hq5 hq5Var, int i2) {
        int i3;
        ygfVar.getClass();
        fvfVar.getClass();
        o0kVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-784194921);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var.h(arrayList) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var.h(ygfVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= oq5Var.f(fvfVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= oq5Var.f(o0kVar) ? 2048 : 1024;
        }
        if (oq5Var.P(i3 & 1, (i3 & 1171) != 1170)) {
            c3x.t(fvfVar, arrayList, oq5Var, ((i3 >> 6) & 14) | ((i3 << 3) & 112));
            boolean f2 = oq5Var.f(arrayList);
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            Object obj = K;
            if (f2 || K == kjnVar) {
                ArrayList arrayList2 = new ArrayList(v75.o(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((b2t) it.next()).a);
                }
                oq5Var.k0(arrayList2);
                obj = arrayList2;
            }
            List list = (List) obj;
            vm C = ghh.C(o0kVar, a.c(0.0f, 24, 0.0f, 16, 5));
            yci a2 = androidx.compose.ui.platform.a.a(d.c(vci.a, 1.0f), "track_list");
            boolean h2 = oq5Var.h(arrayList) | oq5Var.h(ygfVar) | oq5Var.h(list);
            Object K2 = oq5Var.K();
            if (h2 || K2 == kjnVar) {
                K2 = new p3e(3, arrayList, ygfVar, list);
                oq5Var.k0(K2);
            }
            weo.f(a2, fvfVar, C, null, null, null, false, null, (Function1) K2, oq5Var, ((i3 >> 3) & 112) | 6, 504);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new wda(i2, 16, arrayList, ygfVar, fvfVar, o0kVar);
        }
    }

    public static final yci s0(yci yciVar, mn0 mn0Var, ges gesVar, Function1 function1, int i2, boolean z, int i3, int i4, ppc ppcVar, List list, Function1 function12, iep iepVar, a95 a95Var, Function1 function13) {
        if (iepVar == null) {
            return yciVar.f(vci.a).f(new TextAnnotatedStringElement(mn0Var, gesVar, ppcVar, function1, i2, z, i3, i4, list, function12, a95Var, function13));
        }
        return yciVar.f(iepVar.f).f(new SelectableTextAnnotatedStringElement(mn0Var, gesVar, ppcVar, function1, i2, z, i3, i4, list, function12, iepVar, a95Var));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [hq5, oq5] */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [gds, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11, types: [aqi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v28, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v36 */
    /* JADX WARN: Type inference failed for: r8v12, types: [java.lang.Object] */
    public static final void t(yci yciVar, mn0 mn0Var, Function1 function1, boolean z, Map map, ges gesVar, int i2, boolean z2, int i3, int i4, ppc ppcVar, iep iepVar, a95 a95Var, Function1 function12, hq5 hq5Var, int i5, int i6) {
        int i7;
        int i8;
        ?? r6;
        ha0 ha0Var;
        Function0 function0;
        Pair pair;
        kf0 kf0Var;
        ?? r7;
        boolean z3;
        Object obj;
        Object yh0Var;
        boolean z4;
        boolean z5;
        Object obj2;
        Map map2 = map;
        ?? r1 = (oq5) hq5Var;
        r1.b0(-2118572703);
        if ((i5 & 6) == 0) {
            i7 = (r1.f(yciVar) ? 4 : 2) | i5;
        } else {
            i7 = i5;
        }
        if ((i5 & 48) == 0) {
            i7 |= r1.f(mn0Var) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i7 |= r1.h(function1) ? 256 : 128;
        }
        if ((i5 & 3072) == 0) {
            i7 |= r1.g(z) ? 2048 : 1024;
        }
        int i9 = i5 & 24576;
        int i10 = RemoteCameraConfig.Notification.ID;
        if (i9 == 0) {
            i7 |= r1.h(map2) ? 16384 : 8192;
        }
        if ((196608 & i5) == 0) {
            i7 |= r1.f(gesVar) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        if ((i5 & ScreenMirroringConfig.Video.BITRATE_1_5MB) == 0) {
            i7 |= r1.d(i2) ? 1048576 : 524288;
        }
        if ((i5 & 12582912) == 0) {
            i7 |= r1.g(z2) ? 8388608 : RemoteCameraConfig.Camera.BITRATE;
        }
        if ((i5 & 100663296) == 0) {
            i7 |= r1.d(i3) ? 67108864 : 33554432;
        }
        if ((i5 & 805306368) == 0) {
            i7 |= r1.d(i4) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
        }
        if ((i6 & 6) == 0) {
            i8 = i6 | (r1.h(ppcVar) ? 4 : 2);
        } else {
            i8 = i6;
        }
        if ((i6 & 48) == 0) {
            i8 |= r1.h(iepVar) ? 32 : 16;
        }
        if ((i6 & 384) == 0) {
            i8 |= r1.h(a95Var) ? 256 : 128;
        }
        if ((i6 & 3072) == 0) {
            i8 |= r1.h(function12) ? 2048 : 1024;
        }
        if ((i6 & 24576) == 0) {
            if ((i6 & SQLiteDatabase.OPEN_NOMUTEX) == 0 ? r1.f(null) : r1.h(null)) {
                i10 = 16384;
            }
            i8 |= i10;
        }
        if (r1.P(i7 & 1, ((i7 & 306783379) == 306783378 && (i8 & 9363) == 9362) ? false : true)) {
            boolean C = fxf.C(mn0Var);
            kjn kjnVar = gq5.a;
            if (C) {
                r1.Z(-613484007);
                boolean z6 = (i7 & 112) == 32;
                Object K = r1.K();
                Object obj3 = K;
                if (z6 || K == kjnVar) {
                    gds gdsVar = new gds(mn0Var);
                    r1.k0(gdsVar);
                    obj3 = gdsVar;
                }
                r1.p(false);
                r6 = (gds) obj3;
            } else {
                r1.Z(-613418350);
                r1.p(false);
                r6 = 0;
            }
            if (fxf.C(mn0Var)) {
                r1.Z(-613220135);
                boolean f2 = ((i7 & 112) == 32) | r1.f(r6);
                ?? K2 = r1.K();
                ha0 ha0Var2 = K2;
                if (f2 || K2 == kjnVar) {
                    ha0 ha0Var3 = new ha0(13, r6, mn0Var);
                    r1.k0(ha0Var3);
                    ha0Var2 = ha0Var3;
                }
                ha0Var = ha0Var2;
                r1.p(false);
            } else {
                r1.Z(-613122857);
                boolean z7 = (i7 & 112) == 32;
                Object K3 = r1.K();
                Object obj4 = K3;
                if (z7 || K3 == kjnVar) {
                    k5 k5Var = new k5(10, mn0Var);
                    r1.k0(k5Var);
                    obj4 = k5Var;
                }
                ha0Var = (Function0) obj4;
                r1.p(false);
            }
            if (z) {
                if (map2 != null) {
                    Pair pair2 = qn0.a;
                    if (!map2.isEmpty()) {
                        function0 = ha0Var;
                        List b2 = mn0Var.b(0, mn0Var.b.length(), "androidx.compose.foundation.text.inlineContent");
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        int size = b2.size();
                        int i11 = 0;
                        while (i11 < size) {
                            List list = b2;
                            ln0 ln0Var = (ln0) b2.get(i11);
                            int i12 = size;
                            Object obj5 = ln0Var.a;
                            int i13 = i11;
                            int i14 = ln0Var.c;
                            int i15 = ln0Var.b;
                            yme ymeVar = (yme) map2.get(obj5);
                            if (ymeVar != null) {
                                arrayList.add(new ln0(ymeVar.a, i15, i14));
                                arrayList2.add(new ln0(ymeVar.b, i15, i14));
                            }
                            i11 = i13 + 1;
                            map2 = map;
                            size = i12;
                            b2 = list;
                        }
                        pair = new Pair(arrayList, arrayList2);
                        kf0Var = null;
                    }
                }
                function0 = ha0Var;
                pair = qn0.a;
                kf0Var = null;
            } else {
                function0 = ha0Var;
                kf0Var = null;
                pair = new Pair(null, null);
            }
            List list2 = (List) pair.a;
            List list3 = (List) pair.b;
            if (z) {
                r1.Z(-612806750);
                Object K4 = r1.K();
                Object obj6 = K4;
                if (K4 == kjnVar) {
                    x6k g0 = szf.g0(kf0Var);
                    r1.k0(g0);
                    obj6 = g0;
                }
                r1.p(false);
                r7 = (aqi) obj6;
            } else {
                r1.Z(-612718990);
                r1.p(false);
                r7 = kf0Var;
            }
            if (z) {
                r1.Z(-612625741);
                boolean f3 = r1.f(r7);
                ?? K5 = r1.K();
                kf0 kf0Var2 = K5;
                if (f3 || K5 == kjnVar) {
                    kf0 kf0Var3 = new kf0(r7, 2);
                    r1.k0(kf0Var3);
                    kf0Var2 = kf0Var3;
                }
                kf0Var = kf0Var2;
                r1.p(false);
            } else {
                r1.Z(-612554318);
                r1.p(false);
            }
            Function1 function13 = kf0Var;
            mn0 mn0Var2 = (mn0) function0.invoke();
            boolean h2 = r1.h(r6) | ((i7 & 896) == 256);
            Object K6 = r1.K();
            Object obj7 = K6;
            if (h2 || K6 == kjnVar) {
                sv2 sv2Var = new sv2(r6, function1, 0);
                r1.k0(sv2Var);
                obj7 = sv2Var;
            }
            yci s0 = s0(yciVar, mn0Var2, gesVar, (Function1) obj7, i2, z2, i3, i4, ppcVar, list2, function13, iepVar, a95Var, function12);
            int i16 = 3;
            if (z) {
                r1.Z(-611365560);
                boolean h3 = r1.h(r6);
                Object K7 = r1.K();
                Object obj8 = K7;
                if (h3 || K7 == kjnVar) {
                    tv2 tv2Var = new tv2(r6, 1);
                    r1.k0(tv2Var);
                    obj8 = tv2Var;
                }
                Function0 function02 = (Function0) obj8;
                boolean f4 = r1.f(r7);
                Object K8 = r1.K();
                if (f4 || K8 == kjnVar) {
                    z3 = false;
                    uv2 uv2Var = new uv2(r7, false ? 1 : 0);
                    r1.k0(uv2Var);
                    obj = uv2Var;
                } else {
                    z3 = false;
                    obj = K8;
                }
                yh0Var = new yh0(i16, function02, (Function0) obj);
                r1.p(z3);
            } else {
                r1.Z(-611542291);
                boolean h4 = r1.h(r6);
                Object K9 = r1.K();
                if (h4 || K9 == kjnVar) {
                    z5 = false;
                    tv2 tv2Var2 = new tv2(r6, false ? 1 : 0);
                    r1.k0(tv2Var2);
                    obj2 = tv2Var2;
                } else {
                    z5 = false;
                    obj2 = K9;
                }
                yh0Var = new n5b(5, (Function0) obj2);
                r1.p(z5);
            }
            int i17 = r1.P;
            androidx.compose.runtime.internal.a l2 = r1.l();
            yci H = vnj.H(r1, s0);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            r1.d0();
            if (r1.O) {
                r1.k(grbVar);
            } else {
                r1.n0();
            }
            g0g.U(r1, yh0Var, wp5.f);
            g0g.U(r1, l2, wp5.e);
            kb5 kb5Var = wp5.g;
            if (r1.O || !Intrinsics.d(r1.K(), Integer.valueOf(i17))) {
                ouj.x(i17, r1, i17, kb5Var);
            }
            g0g.U(r1, H, wp5.d);
            if (r6 == 0) {
                r1.Z(-509592027);
                z4 = false;
            } else {
                z4 = false;
                r1.Z(537750876);
                r6.a(0, r1);
            }
            r1.p(z4);
            if (list3 == null) {
                r1.Z(-509541249);
            } else {
                r1.Z(-509541248);
                qn0.a(mn0Var, list3, r1, (i7 >> 3) & 14);
            }
            r1.p(z4);
            r1.p(true);
        } else {
            r1.S();
        }
        xmn r = r1.r();
        if (r != null) {
            r.d = new vv2(yciVar, mn0Var, function1, z, map, gesVar, i2, z2, i3, i4, ppcVar, iepVar, a95Var, function12, i5, i6);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00e1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0093 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final mqs t0(ig5 ig5Var, List list, List list2, oq oqVar, i1m i1mVar) {
        CoverPath coverPath;
        String str;
        k10 k10Var;
        Date date;
        Map map;
        Map map2;
        String str2;
        Date parse;
        boolean z;
        Float f2;
        boolean z2;
        nxs nxsVar;
        String str3;
        nxs nxsVar2;
        String str4;
        List list3;
        qvs qvsVar;
        list.getClass();
        String str5 = ig5Var.a;
        Float f3 = ig5Var.y;
        String str6 = ig5Var.b;
        String str7 = ig5Var.c;
        k10 k10Var2 = new k10(ig5Var.F, ig5Var.G, ig5Var.a, ig5Var.E, ig5Var.J, ig5Var.I, false, 192);
        long j2 = ig5Var.e;
        String str8 = ig5Var.o;
        String str9 = ig5Var.p;
        String str10 = ig5Var.q;
        boolean z3 = ig5Var.g;
        dg2 valueOf = dg2.valueOf(ig5Var.h);
        boolean z4 = ig5Var.r;
        WarningContent valueOf2 = WarningContent.valueOf(ig5Var.f);
        boolean z5 = ig5Var.k;
        hqs hqsVar = new hqs(ig5Var.l, ig5Var.m);
        String str11 = ig5Var.H;
        WebPath$Storage webPath$Storage = WebPath$Storage.AVATARS;
        CoverPath x = men.x(str11, webPath$Storage);
        String str12 = ig5Var.n;
        String str13 = ig5Var.d;
        String str14 = ig5Var.t;
        if (str14 != null) {
            if (str14.length() <= 0) {
                str14 = null;
            }
            if (str14 != null) {
                coverPath = men.x(str14, webPath$Storage);
                str = ig5Var.u;
                Gson gson = y85.a;
                if (str != null) {
                    map2 = e5b.a;
                    map2.getClass();
                } else {
                    try {
                        map2 = (Map) y85.a.e(str, Map.class);
                        map2.getClass();
                    } catch (JsonSyntaxException e2) {
                        k10Var = k10Var2;
                        date = null;
                        Assertions.throwOrSkip$default(new FailedAssertionException(hrg.q("color palette failed to parse, json = '", str, "'"), e2), null, 2, null);
                        Map map3 = e5b.a;
                        map3.getClass();
                        map = map3;
                    }
                }
                map = map2;
                k10Var = k10Var2;
                date = null;
                str2 = ig5Var.w;
                mo moVar = hkg.a;
                if (str2 != null) {
                    try {
                        Object obj = hkg.a.get();
                        obj.getClass();
                        parse = ((SimpleDateFormat) obj).parse(str2);
                    } catch (ParseException unused) {
                    }
                    String str15 = ig5Var.s;
                    String str16 = ig5Var.v;
                    z = ig5Var.z;
                    Date date2 = parse;
                    f2 = ig5Var.x;
                    if (f2 != null || f3 == null) {
                        z2 = z;
                        nxsVar = null;
                    } else {
                        z2 = z;
                        nxsVar = new nxs(f2.floatValue(), f3.floatValue());
                    }
                    List B = q7g.B(ig5Var.A);
                    B.getClass();
                    str3 = ig5Var.B;
                    if (str3 != null) {
                        nxsVar2 = nxsVar;
                        str4 = str15;
                        list3 = StringsKt__StringsKt.split$default(str3, new String[]{StringUtils.COMMA}, false, 0, 6, null);
                    } else {
                        nxsVar2 = nxsVar;
                        str4 = str15;
                        list3 = null;
                    }
                    if (list3 == null && list3.size() == 4) {
                        qvsVar = new qvs(Long.parseLong((String) list3.get(0)), Long.parseLong((String) list3.get(1)), Long.parseLong((String) list3.get(2)), Long.parseLong((String) list3.get(3)));
                    } else {
                        qvsVar = null;
                    }
                    List q = t7g.q(ig5Var.j);
                    boolean z6 = ig5Var.i;
                    List B2 = q7g.B(ig5Var.C);
                    B2.getClass();
                    List B3 = q7g.B(ig5Var.D);
                    B3.getClass();
                    return new mqs(str5, str6, str7, k10Var, j2, list, str8, str9, str10, z3, valueOf, z4, valueOf2, z5, hqsVar, x, str12, null, str13, oqVar, list2, i1mVar, coverPath, date2, str4, str16, z2, nxsVar2, B, qvsVar, null, q, z6, map, B2, B3, null, false, 0L, null, 1073872896, 496);
                }
                parse = date;
                String str152 = ig5Var.s;
                String str162 = ig5Var.v;
                z = ig5Var.z;
                Date date22 = parse;
                f2 = ig5Var.x;
                if (f2 != null) {
                }
                z2 = z;
                nxsVar = null;
                List B4 = q7g.B(ig5Var.A);
                B4.getClass();
                str3 = ig5Var.B;
                if (str3 != null) {
                }
                if (list3 == null) {
                }
                qvsVar = null;
                List q2 = t7g.q(ig5Var.j);
                boolean z62 = ig5Var.i;
                List B22 = q7g.B(ig5Var.C);
                B22.getClass();
                List B32 = q7g.B(ig5Var.D);
                B32.getClass();
                return new mqs(str5, str6, str7, k10Var, j2, list, str8, str9, str10, z3, valueOf, z4, valueOf2, z5, hqsVar, x, str12, null, str13, oqVar, list2, i1mVar, coverPath, date22, str4, str162, z2, nxsVar2, B4, qvsVar, null, q2, z62, map, B22, B32, null, false, 0L, null, 1073872896, 496);
            }
        }
        coverPath = null;
        str = ig5Var.u;
        Gson gson2 = y85.a;
        if (str != null) {
        }
        map = map2;
        k10Var = k10Var2;
        date = null;
        str2 = ig5Var.w;
        mo moVar2 = hkg.a;
        if (str2 != null) {
        }
        parse = date;
        String str1522 = ig5Var.s;
        String str1622 = ig5Var.v;
        z = ig5Var.z;
        Date date222 = parse;
        f2 = ig5Var.x;
        if (f2 != null) {
        }
        z2 = z;
        nxsVar = null;
        List B42 = q7g.B(ig5Var.A);
        B42.getClass();
        str3 = ig5Var.B;
        if (str3 != null) {
        }
        if (list3 == null) {
        }
        qvsVar = null;
        List q22 = t7g.q(ig5Var.j);
        boolean z622 = ig5Var.i;
        List B222 = q7g.B(ig5Var.C);
        B222.getClass();
        List B322 = q7g.B(ig5Var.D);
        B322.getClass();
        return new mqs(str5, str6, str7, k10Var, j2, list, str8, str9, str10, z3, valueOf, z4, valueOf2, z5, hqsVar, x, str12, null, str13, oqVar, list2, i1mVar, coverPath, date222, str4, str1622, z2, nxsVar2, B42, qvsVar, null, q22, z622, map, B222, B322, null, false, 0L, null, 1073872896, 496);
    }

    public static final void u(i5j i5jVar, yci yciVar, String str, String str2, hq5 hq5Var, int i2) {
        i5j i5jVar2;
        yci yciVar2;
        int i3;
        boolean z;
        boolean z2;
        int i4;
        i5jVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-13442191);
        int i5 = i2 | (oq5Var.f(i5jVar) ? 4 : 2) | 48 | (oq5Var.f(str) ? 256 : 128) | (oq5Var.f(str2) ? 2048 : 1024);
        if (oq5Var.P(i5 & 1, (i5 & 1171) != 1170)) {
            int i6 = i5 >> 3;
            ta5 a2 = sa5.a(qx0.c, b2c.n, oq5Var, 0);
            int i7 = oq5Var.P;
            androidx.compose.runtime.internal.a l2 = oq5Var.l();
            vci vciVar = vci.a;
            yci H = vnj.H(oq5Var, vciVar);
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
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i7))) {
                ouj.x(i7, oq5Var, i7, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            float f2 = ((Configuration) oq5Var.j(AndroidCompositionLocals_androidKt.a)).screenWidthDp;
            float f3 = a5j.b;
            float f4 = a5j.a;
            float s = o5g.s(f2, a.f(a.a(f3 + f4, 0.0f, 2), (xof) oq5Var.j(es5.n)), f4, a5j.c, a5j.d, Integer.MAX_VALUE, 0.0f, f3, oq5Var, 64);
            oq5Var = oq5Var;
            int i8 = (int) (f2 / s);
            if (str == null || StringsKt.U(str)) {
                i3 = i5;
                i5jVar2 = i5jVar;
                z = false;
                oq5Var.Z(115981159);
            } else {
                oq5Var.Z(122688567);
                boolean z3 = (i5 & 14) == 4;
                Object K = oq5Var.K();
                if (z3 || K == gq5.a) {
                    i3 = i5;
                    z2 = true;
                    i4 = i6;
                    z = false;
                    sui suiVar = new sui(0, i5jVar, i5j.class, "onViewAllClick", "onViewAllClick()V", 0, 9);
                    oq5Var.k0(suiVar);
                    K = suiVar;
                } else {
                    i3 = i5;
                    z2 = true;
                    i4 = i6;
                    z = false;
                }
                h9f h9fVar = (h9f) K;
                q0k c2 = r43.c(null, new cma(12), 7);
                boolean z4 = i8 == z2 ? z2 : z;
                i5jVar2 = i5jVar;
                irf.h(str, null, str2, c2, (Function0) h9fVar, false, null, z4, null, oq5Var, ((i3 >> 6) & 14) | (i4 & 896), 354);
            }
            oq5Var.p(z);
            v(i5jVar2, null, oq5Var, i3 & 14);
            oq5Var.p(true);
            yciVar2 = vciVar;
        } else {
            i5jVar2 = i5jVar;
            oq5Var.S();
            yciVar2 = yciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new av5(i5jVar2, yciVar2, str, str2, i2);
        }
    }

    public static /* synthetic */ mqs u0(ig5 ig5Var, List list, List list2, oq oqVar, int i2) {
        if ((i2 & 2) != 0) {
            list2 = null;
        }
        if ((i2 & 4) != 0) {
            oqVar = null;
        }
        return t0(ig5Var, list, list2, oqVar, null);
    }

    public static final void v(i5j i5jVar, yci yciVar, hq5 hq5Var, int i2) {
        yci yciVar2;
        i5jVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1574614632);
        int i3 = ((i2 & 6) == 0 ? i2 | (oq5Var.f(i5jVar) ? 4 : 2) : i2) | 48;
        if (oq5Var.P(i3 & 1, (i3 & 19) != 18)) {
            ynn i4 = irv.i(oq5Var);
            dht dhtVar = (dht) gld.M(i5jVar.g(), oq5Var).getValue();
            boolean z = dhtVar instanceof qgt;
            vci vciVar = vci.a;
            if (z) {
                oq5Var.Z(288592558);
                yciVar2 = vciVar;
                hld.l(((qgt) dhtVar).a, androidx.compose.ui.platform.a.a(d.d(vciVar, 1.0f), "new_releases_block"), null, a5j.c, a5j.a, a5j.b, 0.0f, null, a5j.d, false, false, false, ild.C(2125824567, new jv(13, i5jVar, i4), oq5Var), oq5Var, 100887552, 390, 2756);
                oq5Var.p(false);
            } else {
                yciVar2 = vciVar;
                if (!(dhtVar instanceof dgt)) {
                    throw vz1.i(oq5Var, -1376166506, false);
                }
                oq5Var.Z(289684161);
                ArrayList arrayList = new ArrayList(5);
                for (int i5 = 0; i5 < 5; i5++) {
                    arrayList.add(Integer.valueOf(i5));
                }
                Object K = oq5Var.K();
                if (K == gq5.a) {
                    K = new m2j(4);
                    oq5Var.k0(K);
                }
                hld.l(arrayList, d.d(nfp.a(yciVar2, (Function1) K), 1.0f), null, a5j.c, a5j.a, a5j.b, 0.0f, null, a5j.d, false, false, false, ild.C(-1964181492, new t31(16, (dgt) dhtVar), oq5Var), oq5Var, 100887552, 438, 708);
                oq5Var.p(false);
            }
        } else {
            oq5Var.S();
            yciVar2 = yciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new gva(i5jVar, yciVar2, i2, 21);
        }
    }

    public static final void w(final yci yciVar, final Integer num, final uo6 uo6Var, final Function0 function0, final Function0 function02, hq5 hq5Var, final int i2) {
        oq5 oq5Var;
        xmn r;
        Function2 function2;
        qo6 qo6Var = qo6.d;
        yciVar.getClass();
        uo6Var.getClass();
        function0.getClass();
        function02.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(507586727);
        int i3 = i2 | (oq5Var2.f(yciVar) ? 4 : 2) | (oq5Var2.f(num) ? 256 : 128) | (oq5Var2.f(uo6Var) ? 2048 : 1024) | (oq5Var2.h(function0) ? 16384 : RemoteCameraConfig.Notification.ID) | (oq5Var2.h(function02) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX);
        if (!oq5Var2.P(i3 & 1, (74899 & i3) != 74898)) {
            oq5Var = oq5Var2;
            oq5Var.S();
        } else {
            if (((Boolean) oq5Var2.j(koe.a)).booleanValue()) {
                oq5Var2.Z(-1063409097);
                gce gceVar = gce.d;
                Object K = oq5Var2.K();
                if (K == gq5.a) {
                    K = new m2j(3);
                    oq5Var2.k0(K);
                }
                swf.d(qo6Var, gceVar, androidx.compose.ui.draw.a.c(yciVar, (Function1) K), null, 0L, 0L, false, oq5Var2, 54, 120);
                oq5Var2.p(false);
                r = oq5Var2.r();
                if (r != null) {
                    final int i4 = 0;
                    function2 = new Function2(yciVar, num, uo6Var, function0, function02, i2, i4) { // from class: s4j
                        public final /* synthetic */ int a;
                        public final /* synthetic */ yci b;
                        public final /* synthetic */ Integer c;
                        public final /* synthetic */ uo6 d;
                        public final /* synthetic */ Function0 e;
                        public final /* synthetic */ Function0 f;

                        {
                            this.a = i4;
                            qo6 qo6Var2 = qo6.a;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            switch (this.a) {
                                case 0:
                                    qo6 qo6Var2 = qo6.a;
                                    ((Integer) obj2).getClass();
                                    int R = rvf.R(49);
                                    j66.w(this.b, this.c, this.d, this.e, this.f, (hq5) obj, R);
                                    break;
                                default:
                                    qo6 qo6Var3 = qo6.a;
                                    ((Integer) obj2).getClass();
                                    int R2 = rvf.R(49);
                                    j66.w(this.b, this.c, this.d, this.e, this.f, (hq5) obj, R2);
                                    break;
                            }
                            return Unit.a;
                        }
                    };
                    r.d = function2;
                }
                return;
            }
            oq5Var = oq5Var2;
            oq5Var.Z(-1081045989);
            oq5Var.p(false);
            yci d2 = a.d(xp3.u(yciVar, ugo.a), 1.0f);
            bs1 d3 = uo6Var.d();
            if (d3 instanceof as1) {
                oq5Var.Z(-1062968494);
                w4k w4kVar = ((as1) d3).a;
                iz2 iz2Var = b2c.f;
                yci j2 = androidx.compose.foundation.a.j(d2, null, irf.S(function02, oq5Var, (i3 >> 15) & 14), function0, 111);
                long g0 = jf0.g0(num != null ? c3x.f(num.intValue()) : uo6Var.a(), null, 0.6f, 1);
                j2.getClass();
                irf.r(w4kVar, null, androidx.compose.ui.draw.a.b(j2, new fn1(g0, 6)), iz2Var, hd6.a, 0.0f, null, oq5Var, 27696, 96);
                oq5Var = oq5Var;
                oq5Var.p(false);
            } else {
                if (!(d3 instanceof xr1) && !(d3 instanceof zr1) && !(d3 instanceof yr1)) {
                    throw vz1.i(oq5Var, -1835407719, false);
                }
                oq5Var.Z(-1062263151);
                swf.e(0, 0, oq5Var, d2);
                oq5Var.p(false);
            }
        }
        r = oq5Var.r();
        if (r != null) {
            final int i5 = 1;
            function2 = new Function2(yciVar, num, uo6Var, function0, function02, i2, i5) { // from class: s4j
                public final /* synthetic */ int a;
                public final /* synthetic */ yci b;
                public final /* synthetic */ Integer c;
                public final /* synthetic */ uo6 d;
                public final /* synthetic */ Function0 e;
                public final /* synthetic */ Function0 f;

                {
                    this.a = i5;
                    qo6 qo6Var2 = qo6.a;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    switch (this.a) {
                        case 0:
                            qo6 qo6Var2 = qo6.a;
                            ((Integer) obj2).getClass();
                            int R = rvf.R(49);
                            j66.w(this.b, this.c, this.d, this.e, this.f, (hq5) obj, R);
                            break;
                        default:
                            qo6 qo6Var3 = qo6.a;
                            ((Integer) obj2).getClass();
                            int R2 = rvf.R(49);
                            j66.w(this.b, this.c, this.d, this.e, this.f, (hq5) obj, R2);
                            break;
                    }
                    return Unit.a;
                }
            };
            r.d = function2;
        }
    }

    public static final void x(wn5 wn5Var, wn5 wn5Var2, wn5 wn5Var3, yci yciVar, hq5 hq5Var, int i2) {
        int i3;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1826980001);
        if ((i2 & 3072) == 0) {
            i3 = (oq5Var.f(yciVar) ? 2048 : 1024) | i2;
        } else {
            i3 = i2;
        }
        if (oq5Var.P(i3 & 1, (i3 & 1171) != 1170)) {
            float f2 = 2;
            float f3 = 10 * f2;
            int K = ff7.K(((cma) yhn.a(new cma(w1g.p(nu0.i(), 0, oq5Var, 0, 2) + w1g.p(nu0.j(), 2, oq5Var, 48, 0) + f2 + f3), new cma(80 + f3))).a, oq5Var);
            List h2 = u75.h(wn5Var, wn5Var2, wn5Var3);
            boolean d2 = oq5Var.d(K);
            Object K2 = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (d2 || K2 == kjnVar) {
                K2 = new u4j(K);
                oq5Var.k0(K2);
            }
            ggi ggiVar = (ggi) K2;
            wn5 o = ghh.o(h2);
            boolean f4 = oq5Var.f(ggiVar);
            Object K3 = oq5Var.K();
            if (f4 || K3 == kjnVar) {
                K3 = new hgi(ggiVar);
                oq5Var.k0(K3);
            }
            kfh kfhVar = (kfh) K3;
            int i4 = oq5Var.P;
            androidx.compose.runtime.internal.a l2 = oq5Var.l();
            yci H = vnj.H(oq5Var, yciVar);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, kfhVar, wp5.f);
            g0g.U(oq5Var, l2, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var, i4, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            eta.l(0, o, oq5Var, true);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new wda(i2, 23, wn5Var, wn5Var2, wn5Var3, yciVar);
        }
    }

    public static final void y(boolean z, hq5 hq5Var, int i2) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-937082300);
        int i3 = (oq5Var.g(z) ? 4 : 2) | i2;
        if (oq5Var.P(i3 & 1, (i3 & 3) != 2)) {
            x(ild.C(-364647582, new sm(27, z), oq5Var), ild.C(582519361, new sm(28, z), oq5Var), nt0.l, a.o(vci.a, 4, 0.0f, 2), oq5Var, 3510);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new sm(i2, 29, z);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void z(l5j l5jVar, int i2, i5j i5jVar, yci yciVar, hq5 hq5Var, int i3) {
        int i4;
        i5j i5jVar2;
        int i5;
        oq5 oq5Var;
        l5j l5jVar2;
        u9b u9bVar;
        String e2;
        Object X;
        u9b u9bVar2;
        int i6;
        Object obj;
        List list;
        boolean z;
        String n;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean g2;
        String str;
        int i7;
        Object obj2;
        int i8;
        Object K;
        bc5 bc5Var;
        yci yciVar2 = yciVar;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-1359291149);
        if ((i3 & 6) == 0) {
            i4 = (oq5Var2.f(l5jVar) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= oq5Var2.d(i2) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= oq5Var2.f(i5jVar) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= oq5Var2.f(yciVar2) ? 2048 : 1024;
        }
        if (oq5Var2.P(i4 & 1, (i4 & 1171) != 1170)) {
            if (((Boolean) oq5Var2.j(koe.a)).booleanValue()) {
                oq5Var2.Z(-1690733844);
                oq5Var2.p(false);
                X = i;
            } else {
                oq5Var2.Z(-1690683376);
                String str2 = "";
                if (!pd.N(oq5Var2) ? !((u9bVar = l5jVar.h) == null || (e2 = u9bVar.e(wct.t(), WebPath$Storage.AVATARS)) == null) : !((u9bVar2 = l5jVar.i) == null || (e2 = u9bVar2.e(wct.t(), WebPath$Storage.AVATARS)) == null)) {
                    str2 = e2;
                }
                X = leu.X(str2, oq5Var2);
                oq5Var2.p(false);
            }
            Object obj3 = X;
            List list2 = l5jVar.b;
            List list3 = list2;
            Object K2 = oq5Var2.K();
            kjn kjnVar = gq5.a;
            Object obj4 = K2;
            if (K2 == kjnVar) {
                m2j m2jVar = new m2j(5);
                oq5Var2.k0(m2jVar);
                obj4 = m2jVar;
            }
            String X2 = CollectionsKt.X(list3, ", ", null, null, (Function1) obj4, 30);
            lt ltVar = l5jVar.c;
            int i9 = i4 & 896;
            int i10 = i4 & 14;
            int i11 = i4 & 112;
            boolean z6 = (i9 == 256) | (i10 == 4) | (i11 == 32);
            Object K3 = oq5Var2.K();
            if (z6 || K3 == kjnVar) {
                i6 = 1;
                r4j r4jVar = new r4j(i5jVar, l5jVar, i2, i6);
                oq5Var2.k0(r4jVar);
                obj = r4jVar;
            } else {
                i6 = 1;
                obj = K3;
            }
            bc5 e3 = i5jVar.e(ltVar, (Function0) obj, oq5Var2, i9);
            int ordinal = ((kw) gld.M(e3.c(), oq5Var2).getValue()).ordinal();
            if (ordinal != 0) {
                if (ordinal == i6) {
                    z = false;
                    list = list2;
                    n = vz1.n(oq5Var2, 538014763, R.string.pause, oq5Var2, false);
                    z2 = (i9 != 256 ? true : z) | (i10 != 4) | (i11 != 32);
                    Object K4 = oq5Var2.K();
                    Object obj5 = K4;
                    if (!z2 || K4 == kjnVar) {
                        r4j r4jVar2 = new r4j(i5jVar, l5jVar, i2, 2);
                        oq5Var2.k0(r4jVar2);
                        obj5 = r4jVar2;
                    }
                    Function0 function0 = (Function0) obj5;
                    z3 = (i9 != 256) | (i10 != 4) | (i11 != 32);
                    Object K5 = oq5Var2.K();
                    int i12 = 3;
                    Object obj6 = K5;
                    if (!z3 || K5 == kjnVar) {
                        r4j r4jVar3 = new r4j(i5jVar, l5jVar, i2, i12);
                        oq5Var2.k0(r4jVar3);
                        obj6 = r4jVar3;
                    }
                    Function0 function02 = (Function0) obj6;
                    z4 = (i9 != 256) | (i10 != 4) | (i11 != 32);
                    Object K6 = oq5Var2.K();
                    Object obj7 = K6;
                    if (!z4 || K6 == kjnVar) {
                        r4j r4jVar4 = new r4j(i5jVar, l5jVar, i2, 4);
                        oq5Var2.k0(r4jVar4);
                        obj7 = r4jVar4;
                    }
                    Function0 function03 = (Function0) obj7;
                    String M = rvf.M(R.string.menu_element_trailer, oq5Var2);
                    String M2 = rvf.M(R.string.dialog_action_move_to_album, oq5Var2);
                    z5 = l5jVar.k;
                    String M3 = rvf.M(list.size() <= 1 ? R.string.dialog_action_move_to_artists : R.string.dialog_action_move_to_artist, oq5Var2);
                    g2 = oq5Var2.g(z5) | oq5Var2.d(list.size());
                    Object K7 = oq5Var2.K();
                    if (!g2 || K7 == kjnVar) {
                        n8g b2 = t75.b();
                        str = X2;
                        i7 = 1;
                        b2.add(new nw6(M2, new g1j(i7, function0)));
                        b2.add(new nw6(M3, new g1j(2, function02)));
                        if (z5) {
                            b2.add(new nw6(M, new g1j(3, function03)));
                        }
                        n8g a2 = t75.a(b2);
                        oq5Var2.k0(a2);
                        obj2 = a2;
                    } else {
                        str = X2;
                        i7 = 1;
                        obj2 = K7;
                    }
                    List list4 = (List) obj2;
                    i8 = (oq5Var2.f(n) ? 1 : 0) | (i10 != 4 ? i7 : 0) | (oq5Var2.f(e3) ? 1 : 0) | (i9 != 256 ? i7 : 0) | (oq5Var2.h(list4) ? 1 : 0);
                    K = oq5Var2.K();
                    if (i8 == 0 || K == kjnVar) {
                        r90 r90Var = new r90(n, l5jVar, list4, e3, i5jVar, 3);
                        bc5Var = e3;
                        oq5Var2.k0(r90Var);
                        K = r90Var;
                    } else {
                        bc5Var = e3;
                    }
                    yciVar2 = yciVar;
                    yci o = a.o(nfp.a(yciVar2, (Function1) K), 4, 0.0f, 2);
                    String str3 = str;
                    wda wdaVar = new wda(i2, 24, str3, l5jVar, obj3, i5jVar);
                    i5 = i2;
                    i5jVar2 = i5jVar;
                    l5jVar2 = l5jVar;
                    oq5Var = oq5Var2;
                    x(ild.C(-355577963, wdaVar, oq5Var2), ild.C(1787906198, new yja(l5jVar2, i5, bc5Var, i5jVar2), oq5Var2), ild.C(-363576937, new da1(str3, 9), oq5Var2), o, oq5Var, 438);
                } else if (ordinal != 2) {
                    throw vz1.i(oq5Var2, 538009220, false);
                }
            }
            list = list2;
            z = false;
            n = vz1.n(oq5Var2, 538012236, R.string.listen, oq5Var2, false);
            z2 = (i9 != 256 ? true : z) | (i10 != 4) | (i11 != 32);
            Object K42 = oq5Var2.K();
            Object obj52 = K42;
            if (!z2) {
            }
            r4j r4jVar22 = new r4j(i5jVar, l5jVar, i2, 2);
            oq5Var2.k0(r4jVar22);
            obj52 = r4jVar22;
            Function0 function04 = (Function0) obj52;
            z3 = (i9 != 256) | (i10 != 4) | (i11 != 32);
            Object K52 = oq5Var2.K();
            int i122 = 3;
            Object obj62 = K52;
            if (!z3) {
            }
            r4j r4jVar32 = new r4j(i5jVar, l5jVar, i2, i122);
            oq5Var2.k0(r4jVar32);
            obj62 = r4jVar32;
            Function0 function022 = (Function0) obj62;
            z4 = (i9 != 256) | (i10 != 4) | (i11 != 32);
            Object K62 = oq5Var2.K();
            Object obj72 = K62;
            if (!z4) {
            }
            r4j r4jVar42 = new r4j(i5jVar, l5jVar, i2, 4);
            oq5Var2.k0(r4jVar42);
            obj72 = r4jVar42;
            Function0 function032 = (Function0) obj72;
            String M4 = rvf.M(R.string.menu_element_trailer, oq5Var2);
            String M22 = rvf.M(R.string.dialog_action_move_to_album, oq5Var2);
            z5 = l5jVar.k;
            String M32 = rvf.M(list.size() <= 1 ? R.string.dialog_action_move_to_artists : R.string.dialog_action_move_to_artist, oq5Var2);
            g2 = oq5Var2.g(z5) | oq5Var2.d(list.size());
            Object K72 = oq5Var2.K();
            if (g2) {
            }
            n8g b22 = t75.b();
            str = X2;
            i7 = 1;
            b22.add(new nw6(M22, new g1j(i7, function04)));
            b22.add(new nw6(M32, new g1j(2, function022)));
            if (z5) {
            }
            n8g a22 = t75.a(b22);
            oq5Var2.k0(a22);
            obj2 = a22;
            List list42 = (List) obj2;
            i8 = (oq5Var2.f(n) ? 1 : 0) | (i10 != 4 ? i7 : 0) | (oq5Var2.f(e3) ? 1 : 0) | (i9 != 256 ? i7 : 0) | (oq5Var2.h(list42) ? 1 : 0);
            K = oq5Var2.K();
            if (i8 == 0) {
            }
            r90 r90Var2 = new r90(n, l5jVar, list42, e3, i5jVar, 3);
            bc5Var = e3;
            oq5Var2.k0(r90Var2);
            K = r90Var2;
            yciVar2 = yciVar;
            yci o2 = a.o(nfp.a(yciVar2, (Function1) K), 4, 0.0f, 2);
            String str32 = str;
            wda wdaVar2 = new wda(i2, 24, str32, l5jVar, obj3, i5jVar);
            i5 = i2;
            i5jVar2 = i5jVar;
            l5jVar2 = l5jVar;
            oq5Var = oq5Var2;
            x(ild.C(-355577963, wdaVar2, oq5Var2), ild.C(1787906198, new yja(l5jVar2, i5, bc5Var, i5jVar2), oq5Var2), ild.C(-363576937, new da1(str32, 9), oq5Var2), o2, oq5Var, 438);
        } else {
            i5jVar2 = i5jVar;
            i5 = i2;
            oq5Var = oq5Var2;
            l5jVar2 = l5jVar;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new lx(i5, i3, 13, yciVar2, l5jVar2, i5jVar2);
        }
    }

    public abstract boolean I(int i2, int i3);

    public abstract boolean J(int i2, int i3);

    public Object T(int i2, int i3) {
        return null;
    }

    public abstract int U();

    public abstract List W(String str);

    public abstract int X();

    public abstract DisplayMetrics Y();

    public abstract int Z();

    public abstract int a0();

    public int b0() {
        return 0;
    }

    public int c0() {
        return 0;
    }

    public abstract void p0(boolean z);

    public abstract void q0(int i2);

    public abstract void r0(int i2);

    public void o0(int i2, jk9 jk9Var, boolean z) {
    }
}
