package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import androidx.compose.foundation.layout.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.a;
import androidx.media3.exoplayer.ExoPlayer;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.c;
import ru.yandex.music.R;

/* loaded from: classes.dex */
public abstract class zwf {
    public static final cvl A(drt drtVar) {
        drtVar.getClass();
        String b = g3o.b(R.string.favorite_playlist_title);
        b.getClass();
        return new cvl("3", b, drtVar, 0, -1, false, 0, 0, 0, 0L, 0L, null, 0L, null, null, null, null, null, 0, null, null, null, false, null, false, null, null, 134217704);
    }

    public static final String B(String str, List list) {
        list.getClass();
        String L = xp3.L(list, c5b.a);
        if (str != null) {
            if (StringsKt.U(str)) {
                str = null;
            }
            if (str != null) {
                List<zp2> list2 = list;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    for (zp2 zp2Var : list2) {
                        if (!c.o(zp2Var.b, str, true)) {
                            List list3 = zp2Var.e;
                            if (list3 != null) {
                                List list4 = list3;
                                if (!(list4 instanceof Collection) || !list4.isEmpty()) {
                                    Iterator it = list4.iterator();
                                    while (it.hasNext()) {
                                        if (c.o(((zp2) it.next()).b, str, true)) {
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return L.length() == 0 ? str : ouj.o(L, ", ", str);
            }
        }
        return L;
    }

    public static final String C(TimeZone timeZone) {
        Date date = new Date(System.currentTimeMillis());
        if (timeZone == null) {
            timeZone = TimeZone.getDefault();
        }
        timeZone.getClass();
        return hkg.a(date, timeZone);
    }

    public static final kfu D(View view) {
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_view_model_store_owner);
            kfu kfuVar = tag instanceof kfu ? (kfu) tag : null;
            if (kfuVar != null) {
                return kfuVar;
            }
            Object B = rvf.B(view);
            view = B instanceof View ? (View) B : null;
        }
        return null;
    }

    public static String G(d0o d0oVar) {
        String str;
        d0oVar.getClass();
        woj wojVar = (woj) woj.class.cast(d0oVar.e.get(woj.class));
        return (wojVar == null || (str = wojVar.a) == null) ? "RID(UNKNOOWN)" : hrg.q("RID(", str, ")");
    }

    public static final String H(nab nabVar) {
        nabVar.getClass();
        if (!(nabVar instanceof jab)) {
            if (!(nabVar instanceof lab)) {
                b6e.s();
                return null;
            }
            lab labVar = (lab) nabVar;
            String str = labVar.a;
            int i = labVar.c;
            return f1d.i(f1d.l(i, "RemoteBlock(type=", str, ", at(x=", ",y="), labVar.d, "))");
        }
        jab jabVar = (jab) nabVar;
        String str2 = jabVar.e;
        String str3 = jabVar.f;
        int i2 = jabVar.b;
        int i3 = jabVar.c;
        StringBuilder m = f1d.m("UiBlock(type=", str2, ", id=", str3, ", at(x=");
        m.append(i2);
        m.append(",y=");
        m.append(i3);
        m.append("))");
        return m.toString();
    }

    public static final String I(fcc fccVar) {
        fccVar.getClass();
        return "Filter(value=" + fccVar.b + ", at=" + fccVar.c + ")";
    }

    public static final String J(cvo cvoVar) {
        cvoVar.getClass();
        dvo dvoVar = cvoVar.d;
        String str = null;
        String g = dvoVar.a.length() > 0 ? f1d.g("landing=", dvoVar.a) : null;
        avo avoVar = cvoVar.e;
        pkb pkbVar = avoVar.a;
        if (pkbVar != pkb.NonApplicable) {
            str = "object=" + pkbVar + "(id=" + avoVar.b + ")";
        }
        return cvoVar.a + "(" + xz0.w(new String[]{g, str}) + "))";
    }

    public static final String K(u0s u0sVar) {
        StringBuilder sb;
        String str;
        u0sVar.getClass();
        boolean z = u0sVar.c;
        int i = u0sVar.b;
        String str2 = u0sVar.a;
        if (z) {
            sb = new StringBuilder("Tab(id=");
            sb.append(str2);
            sb.append(", at=");
            sb.append(i);
            str = ", default)";
        } else {
            sb = new StringBuilder("Tab(id=");
            sb.append(str2);
            sb.append(", at=");
            sb.append(i);
            str = ")";
        }
        sb.append(str);
        return sb.toString();
    }

    public static final int N(int i, int i2) {
        return (i >> i2) & 31;
    }

    public static final t9f P(Object obj, t9f... t9fVarArr) {
        Class[] clsArr;
        try {
            if (t9fVarArr.length == 0) {
                clsArr = new Class[0];
            } else {
                int length = t9fVarArr.length;
                Class[] clsArr2 = new Class[length];
                for (int i = 0; i < length; i++) {
                    clsArr2[i] = t9f.class;
                }
                clsArr = clsArr2;
            }
            Object invoke = obj.getClass().getDeclaredMethod("serializer", (Class[]) Arrays.copyOf(clsArr, clsArr.length)).invoke(obj, Arrays.copyOf(t9fVarArr, t9fVarArr.length));
            if (invoke instanceof t9f) {
                return (t9f) invoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        } catch (InvocationTargetException e) {
            Throwable cause = e.getCause();
            if (cause == null) {
                throw e;
            }
            String message = cause.getMessage();
            if (message == null) {
                message = e.getMessage();
            }
            throw new InvocationTargetException(cause, message);
        }
    }

    public static String R(String str, Object... objArr) {
        int indexOf;
        String sb;
        String valueOf = String.valueOf(str);
        int i = 0;
        for (int i2 = 0; i2 < objArr.length; i2++) {
            Object obj = objArr[i2];
            if (obj == null) {
                sb = "null";
            } else {
                try {
                    sb = obj.toString();
                } catch (Exception e) {
                    String str2 = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
                    Logger.getLogger("com.google.common.base.Strings").log(Level.WARNING, "Exception during lenientFormat for ".concat(str2), (Throwable) e);
                    StringBuilder u = ouj.u("<", str2, " threw ");
                    u.append(e.getClass().getName());
                    u.append(">");
                    sb = u.toString();
                }
            }
            objArr[i2] = sb;
        }
        StringBuilder sb2 = new StringBuilder((objArr.length * 16) + valueOf.length());
        int i3 = 0;
        while (i < objArr.length && (indexOf = valueOf.indexOf("%s", i3)) != -1) {
            sb2.append((CharSequence) valueOf, i3, indexOf);
            sb2.append(objArr[i]);
            i3 = indexOf + 2;
            i++;
        }
        sb2.append((CharSequence) valueOf, i3, valueOf.length());
        if (i < objArr.length) {
            sb2.append(" [");
            sb2.append(objArr[i]);
            for (int i4 = i + 1; i4 < objArr.length; i4++) {
                sb2.append(", ");
                sb2.append(objArr[i4]);
            }
            sb2.append(']');
        }
        return sb2.toString();
    }

    public static final String S(thj thjVar, nab nabVar, Integer num) {
        thjVar.getClass();
        nabVar.getClass();
        pkb pkbVar = thjVar.a;
        String str = thjVar.b;
        int i = thjVar.c;
        int i2 = thjVar.d;
        int intValue = num.intValue();
        StringBuilder sb = new StringBuilder("Object(type=");
        sb.append(pkbVar);
        sb.append(", id=");
        sb.append(str);
        sb.append(", at(x=");
        hrg.w(i, i2, ",y=", ")/", sb);
        return f1d.i(sb, intValue, "))");
    }

    public static void U(ipr iprVar, int i, ua6 ua6Var) {
        long o = iprVar.o(i);
        List g = iprVar.g(o);
        if (g.isEmpty()) {
            return;
        }
        if (i == iprVar.q() - 1) {
            e7o.n();
            return;
        }
        long o2 = iprVar.o(i + 1) - iprVar.o(i);
        if (o2 > 0) {
            ua6Var.accept(new uv6(o, o2, g));
        }
    }

    public static final sdr V(act actVar, ArrayList arrayList, hq5 hq5Var, int i) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.Z(-1641454727);
        if ((i & 2) != 0) {
            arrayList = null;
        }
        kjn kjnVar = gq5.a;
        if (arrayList == null) {
            oq5Var.Z(1920025865);
            ArrayList Y = sk3.Y(m3w.a(null, oq5Var));
            Object K = oq5Var.K();
            if (K == kjnVar) {
                K = szf.g0(sk3.q(Y));
                oq5Var.k0(K);
            }
            aqi aqiVar = (aqi) K;
            oq5Var.p(false);
            oq5Var.p(false);
            return aqiVar;
        }
        oq5Var.Z(1919245161);
        oq5Var.p(false);
        oq5Var.Z(-1184982463);
        ArrayList arrayList2 = new ArrayList(v75.o(arrayList, 10));
        int i2 = 0;
        for (Object obj : arrayList) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                u75.n();
                throw null;
            }
            Pair pair = (Pair) obj;
            float floatValue = ((Number) pair.a).floatValue();
            long j = ((d85) pair.b).a;
            Float valueOf = Float.valueOf(floatValue);
            act actVar2 = actVar;
            arrayList2.add(new Pair(valueOf, bmq.b(j, actVar2, k5r.i(i2, "WaveGradientAnim_ColorStopAt_"), oq5Var, 48, 8)));
            actVar = actVar2;
            i2 = i3;
        }
        oq5Var.p(false);
        boolean f = oq5Var.f(arrayList);
        Object K2 = oq5Var.K();
        if (f || K2 == kjnVar) {
            K2 = szf.U(new x71(arrayList2, 4));
            oq5Var.k0(K2);
        }
        sdr sdrVar = (sdr) K2;
        oq5Var.p(false);
        return sdrVar;
    }

    public static final tvd X(fvf fvfVar, hq5 hq5Var, int i) {
        float f = edo.b;
        fvfVar.getClass();
        WeakHashMap weakHashMap = rqv.w;
        eoe n = p6g.n(z7l.h(hq5Var).f, hq5Var);
        jx7 jx7Var = (jx7) ((oq5) hq5Var).j(es5.h);
        if ((i & 8) != 0) {
            f = edo.a;
        }
        return edo.e(fvfVar, n, jx7Var, f, hq5Var, 0);
    }

    public static final void a(yci yciVar, bci bciVar, boolean z, boolean z2, Function1 function1, hq5 hq5Var, int i) {
        int i2;
        function1.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1517453583);
        if ((i & 6) == 0) {
            i2 = (oq5Var.f(yciVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? oq5Var.f(bciVar) : oq5Var.h(bciVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.h(null) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var.g(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= oq5Var.g(z2) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((196608 & i) == 0) {
            i2 |= oq5Var.h(function1) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        if ((74899 & i2) == 74898 && oq5Var.z()) {
            oq5Var.S();
        } else {
            oq5Var.U();
            if ((i & 1) != 0 && !oq5Var.y()) {
                oq5Var.S();
            }
            oq5Var.q();
            aqi o0 = szf.o0(function1, oq5Var);
            Object K = oq5Var.K();
            if (K == gq5.a) {
                K = szf.T(rwd.h, new jc(o0, 12));
                oq5Var.k0(K);
            }
            sdr sdrVar = (sdr) K;
            wn5 C = ild.C(97694217, new wd1(sdrVar, 3), oq5Var);
            wn5 C2 = ild.C(-374493488, new ix(sdrVar, 5), oq5Var);
            int i3 = (i2 & 14) | 4480 | ((i2 << 6) & 7168) | ((i2 << 9) & 458752);
            int i4 = i2 << 12;
            yd5.f(yciVar, C, bciVar, null, null, false, z, z2, 0L, 0L, 0.0f, C2, oq5Var, i3 | (29360128 & i4) | (i4 & 234881024), 3666);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new en6(yciVar, bciVar, z, z2, function1, i, 2);
        }
    }

    public static final String a0(mqs mqsVar, o8q o8qVar, int i) {
        mqsVar.getClass();
        o8qVar.getClass();
        k10 k10Var = mqsVar.d;
        switch (vzs.a[k10Var.d().ordinal()]) {
            case 1:
                return mqsVar.l() ? StringsKt.t0(k10Var.d).toString() : o8qVar.a.c(i);
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                String B = B(mqsVar.i, mqsVar.f);
                return B.length() > 0 ? StringsKt.t0(B).toString() : "";
            default:
                b6e.s();
                return null;
        }
    }

    public static final void b(o2j o2jVar, yci yciVar, hq5 hq5Var, int i) {
        o2jVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-799997234);
        int i2 = (oq5Var.f(o2jVar) ? 4 : 2) | i | 48;
        if (oq5Var.P(i2 & 1, (i2 & 19) != 18)) {
            kht khtVar = (kht) szf.Q(o2jVar.c, oq5Var).getValue();
            wn5 C = ild.C(-1522500670, new tt5(25, o2jVar), oq5Var);
            vci vciVar = vci.a;
            tt0.g(khtVar, vciVar, null, "NeuromusicBlockCrossfade", C, oq5Var, 27696, 4);
            yciVar = vciVar;
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new m2g(o2jVar, yciVar, i, 20);
        }
    }

    public static final String b0(long j, TimeZone timeZone) {
        Date date = new Date(j);
        if (timeZone == null) {
            timeZone = TimeZone.getDefault();
        }
        timeZone.getClass();
        return hkg.a(date, timeZone);
    }

    public static final void c(kgt kgtVar, yci yciVar, hq5 hq5Var, int i) {
        yci yciVar2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-827198241);
        int i2 = ((i & 6) == 0 ? (oq5Var.f(kgtVar) ? 4 : 2) | i : i) | 48;
        if (oq5Var.P(i2 & 1, (i2 & 19) != 18)) {
            ArrayList arrayList = new ArrayList(3);
            for (int i3 = 0; i3 < 3; i3++) {
                arrayList.add(Integer.valueOf(i3));
            }
            vci vciVar = vci.a;
            hld.l(arrayList, a.a(vciVar, "neuromusic_block_stations"), null, 0.0f, 0.0f, 0.0f, 0.0f, null, 0, true, false, false, ild.C(-161702670, new t31(15, kgtVar), oq5Var), oq5Var, 805306368, 432, 1532);
            yciVar2 = vciVar;
        } else {
            oq5Var.S();
            yciVar2 = yciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new gva(kgtVar, yciVar2, i, 19);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0059 A[LOOP:0: B:14:0x0053->B:16:0x0059, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void c0(ipr iprVar, tpr tprVar, ua6 ua6Var) {
        int e;
        boolean z;
        int i;
        long j = tprVar.b;
        if (j == -9223372036854775807L) {
            e = 0;
        } else {
            e = iprVar.e(j);
            if (e == -1) {
                e = iprVar.q();
            }
            if (e > 0 && iprVar.o(e - 1) == j) {
                e--;
            }
        }
        if (j != -9223372036854775807L && e < iprVar.q()) {
            List g = iprVar.g(j);
            long o = iprVar.o(e);
            if (!g.isEmpty()) {
                long j2 = tprVar.b;
                if (j2 < o) {
                    ua6Var.accept(new uv6(j2, o - j2, g));
                    z = true;
                    for (i = e; i < iprVar.q(); i++) {
                        U(iprVar, i, ua6Var);
                    }
                    if (tprVar.a) {
                        return;
                    }
                    if (z) {
                        e--;
                    }
                    for (int i2 = 0; i2 < e; i2++) {
                        U(iprVar, i2, ua6Var);
                    }
                    if (z) {
                        ua6Var.accept(new uv6(iprVar.o(e), j - iprVar.o(e), iprVar.g(j)));
                        return;
                    }
                    return;
                }
            }
        }
        z = false;
        while (i < iprVar.q()) {
        }
        if (tprVar.a) {
        }
    }

    public static final void d(xgt xgtVar, o2j o2jVar, yci yciVar, hq5 hq5Var, int i) {
        int i2;
        oq5 oq5Var;
        yci yciVar2;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-1381462748);
        if ((i & 6) == 0) {
            i2 = i | (oq5Var2.f(xgtVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? oq5Var2.f(o2jVar) : oq5Var2.h(o2jVar) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (oq5Var2.P(i3 & 1, (i3 & 147) != 146)) {
            ynn i4 = irv.i(oq5Var2);
            List list = xgtVar.a;
            vci vciVar = vci.a;
            oq5Var = oq5Var2;
            hld.l(list, a.a(vciVar, "neuromusic_block_stations"), null, 0.0f, 0.0f, 0.0f, 0.0f, null, 0, false, false, false, ild.C(-1195531416, new jv(12, o2jVar, i4), oq5Var2), oq5Var, 0, 384, 4092);
            yciVar2 = vciVar;
        } else {
            oq5Var = oq5Var2;
            oq5Var.S();
            yciVar2 = yciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new yja(xgtVar, o2jVar, yciVar2, i, 25);
        }
    }

    public static final void d0(ffm ffmVar, long j, Function1 function1, boolean z) {
        fmq fmqVar = ffmVar.b;
        MotionEvent motionEvent = fmqVar != null ? (MotionEvent) ((aqd) fmqVar.d).c : null;
        if (motionEvent == null) {
            xq0.x("The PointerEvent receiver cannot have a null MotionEvent.");
            return;
        }
        int action = motionEvent.getAction();
        if (z) {
            motionEvent.setAction(3);
        }
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        motionEvent.offsetLocation(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
        function1.invoke(motionEvent);
        motionEvent.offsetLocation(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
        motionEvent.setAction(action);
    }

    public static final void e(int i, hq5 hq5Var, yci yciVar, String str, Function0 function0, boolean z) {
        Function0 function02;
        boolean z2;
        yci yciVar2;
        str.getClass();
        function0.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(956042953);
        int i2 = (oq5Var.f(str) ? 4 : 2) | i | (oq5Var.g(z) ? 32 : 16) | (oq5Var.h(function0) ? 256 : 128) | (oq5Var.f(yciVar) ? 2048 : 1024);
        if ((i2 & 1171) == 1170 && oq5Var.z()) {
            oq5Var.S();
            function02 = function0;
            yciVar2 = yciVar;
            z2 = z;
        } else {
            int i3 = i2 >> 3;
            function02 = function0;
            g(z, function02, yciVar, ild.C(-646629401, new da1(str, 10), oq5Var), oq5Var, (i3 & 14) | 3072 | (i3 & 112) | (i3 & 896));
            z2 = z;
            yciVar2 = yciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new fd3(str, z2, function02, yciVar2, i);
        }
    }

    public static final void f(mn0 mn0Var, boolean z, Function0 function0, yci yciVar, hq5 hq5Var, int i, int i2) {
        int i3;
        boolean z2;
        Function0 function02;
        yci yciVar2;
        function0.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1984217695);
        int i4 = (oq5Var.f(mn0Var) ? 4 : 2) | i | (oq5Var.g(z) ? 32 : 16) | (oq5Var.h(function0) ? 256 : 128);
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 = i4 | 3072;
        } else {
            i3 = i4 | (oq5Var.f(yciVar) ? 2048 : 1024);
        }
        if ((i3 & 1171) == 1170 && oq5Var.z()) {
            oq5Var.S();
            yciVar2 = yciVar;
            function02 = function0;
            z2 = z;
        } else {
            if (i5 != 0) {
                yciVar = vci.a;
            }
            yci yciVar3 = yciVar;
            int i6 = i3 >> 3;
            g(z, function0, yciVar3, ild.C(-988055997, new o1h(mn0Var, 2), oq5Var), oq5Var, (i6 & 14) | 3072 | (i6 & 112) | (i6 & 896));
            z2 = z;
            function02 = function0;
            yciVar2 = yciVar3;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new pp(mn0Var, z2, function02, yciVar2, i, i2);
        }
    }

    public static final void g(boolean z, Function0 function0, yci yciVar, wn5 wn5Var, hq5 hq5Var, int i) {
        int i2;
        long j;
        long j2;
        function0.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1930956093);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (oq5Var.g(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.h(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.f(yciVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var.h(wn5Var) ? 2048 : 1024;
        }
        if ((i2 & 1171) == 1170 && oq5Var.z()) {
            oq5Var.S();
        } else {
            yci u = xp3.u(d.a(yciVar, Float.NaN, 40), ugo.a);
            if (z) {
                oq5Var.Z(222944198);
                j = ((dq0) oq5Var.j(eq0.a)).d.c;
                oq5Var.p(false);
            } else {
                oq5Var.Z(222944872);
                oq5Var.p(false);
                j = d85.m;
            }
            yci o = androidx.compose.foundation.layout.a.o(androidx.compose.foundation.a.e(androidx.compose.foundation.a.b(u, j, vnj.i), false, null, null, function0, 7), 16, 0.0f, 2);
            boolean z2 = (i2 & 14) == 4;
            Object K = oq5Var.K();
            if (z2 || K == gq5.a) {
                K = new i32(i3, z);
                oq5Var.k0(K);
            }
            yci b = nfp.b(o, false, (Function1) K);
            kfh d = ug3.d(b2c.f, false);
            int i4 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, b);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, d, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var, i4, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            if (z) {
                oq5Var.Z(1474839114);
                j2 = ((dq0) oq5Var.j(eq0.a)).b.a;
            } else {
                oq5Var.Z(1474840172);
                j2 = ((dq0) oq5Var.j(eq0.a)).b.b;
            }
            oq5Var.p(false);
            long j3 = j2;
            h6g h6gVar = nu0.a;
            h6g h6gVar2 = h6g.c;
            xcs.a(ges.b(nu0.j(), j3, 0L, null, null, 0L, 0, 0L, null, null, 0, 0, 16777214), wn5Var, oq5Var, (i2 >> 6) & 112);
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new pp(z, function0, yciVar, wn5Var, i);
        }
    }

    public static final void h(wn5 wn5Var, hq5 hq5Var, int i) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1322912246);
        int i2 = (oq5Var.h(wn5Var) ? 4 : 2) | i;
        if (oq5Var.P(i2 & 1, (i2 & 3) != 2)) {
            wn5Var.invoke(oq5Var, Integer.valueOf(i2 & 14));
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new pp0(i, 4, wn5Var);
        }
    }

    public static final void i(long j, wn5 wn5Var, hq5 hq5Var, int i) {
        int i2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1046898219);
        if ((i & 6) == 0) {
            i2 = (oq5Var.e(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.h(wn5Var) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
        } else {
            etn.m(new qzm[]{sb6.a.a(new d85(j)), mb6.a.a(Float.valueOf(d85.d(j)))}, wn5Var, oq5Var, (i2 & 112) | 8);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new irj(j, wn5Var, i);
        }
    }

    public static final void j(raj rajVar, wdj wdjVar, boolean z, yci yciVar, hq5 hq5Var, int i) {
        int i2;
        int i3;
        kjn kjnVar;
        boolean z2;
        Object r9nVar;
        wdj wdjVar2;
        ges j;
        wdjVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1068668019);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? oq5Var.f(rajVar) : oq5Var.h(rajVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.h(wdjVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.g(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var.f(yciVar) ? 2048 : 1024;
        }
        if (oq5Var.P(i2 & 1, (i2 & 1171) != 1170)) {
            aqi M = gld.M(wdjVar.l(), oq5Var);
            aqi M2 = gld.M(wdjVar.c(), oq5Var);
            aqi M3 = gld.M(wdjVar.h(), oq5Var);
            aqi M4 = gld.M(wdjVar.g(), oq5Var);
            aqi P = szf.P(wdjVar.b(), j1g.b, null, oq5Var, 48, 2);
            rba rbaVar = (rba) M.getValue();
            lzs lzsVar = (lzs) M2.getValue();
            frs frsVar = (frs) M3.getValue();
            cdj cdjVar = (cdj) M4.getValue();
            boolean j2 = wdjVar.j();
            boolean h = oq5Var.h(wdjVar);
            Object K = oq5Var.K();
            kjn kjnVar2 = gq5.a;
            if (h || K == kjnVar2) {
                i3 = i2;
                kjnVar = kjnVar2;
                z2 = false;
                r9n r9nVar2 = new r9n(0, wdjVar, wdj.class, "onClick", "onClick()V", 0, 11);
                oq5Var.k0(r9nVar2);
                K = r9nVar2;
            } else {
                i3 = i2;
                z2 = false;
                kjnVar = kjnVar2;
            }
            h9f h9fVar = (h9f) K;
            boolean h2 = oq5Var.h(wdjVar);
            Object K2 = oq5Var.K();
            if (h2 || K2 == kjnVar) {
                r9n r9nVar3 = new r9n(0, wdjVar, wdj.class, "onLongClick", "onLongClick()V", 0, 12);
                oq5Var.k0(r9nVar3);
                K2 = r9nVar3;
            }
            h9f h9fVar2 = (h9f) K2;
            boolean h3 = oq5Var.h(wdjVar);
            Object K3 = oq5Var.K();
            if (h3 || K3 == kjnVar) {
                r9nVar = new r9n(0, wdjVar, wdj.class, "onOverflowClick", "onOverflowClick()V", 0, 13);
                wdjVar2 = wdjVar;
                oq5Var.k0(r9nVar);
            } else {
                r9nVar = K3;
                wdjVar2 = wdjVar;
            }
            h9f h9fVar3 = (h9f) r9nVar;
            e9g e9gVar = e9g.a;
            agr agrVar = eq0.a;
            long j3 = ((dq0) oq5Var.j(agrVar)).a.a;
            c0g R = a4g.R((j1g) P.getValue());
            if (z) {
                oq5Var.Z(-492741955);
                j = nu0.g();
            } else {
                oq5Var.Z(-492740647);
                j = nu0.j();
            }
            oq5Var.p(z2);
            long j4 = ((dq0) oq5Var.j(agrVar)).a.a;
            Function0 function0 = (Function0) h9fVar;
            Function0 function02 = (Function0) h9fVar2;
            Function0 function03 = (Function0) h9fVar3;
            boolean h4 = oq5Var.h(wdjVar2) | oq5Var.f(P);
            Object K4 = oq5Var.K();
            if (h4 || K4 == kjnVar) {
                K4 = new izo(wdjVar2, P, 0);
                oq5Var.k0(K4);
            }
            o5g.e(rajVar, rbaVar, lzsVar, frsVar, cdjVar, j2, function0, function02, function03, yciVar, e9gVar, j, j3, j4, R, (Function0) K4, oq5Var, (i3 & 14) | ((i3 << 18) & 1879048192), 6, 0);
            oq5Var = oq5Var;
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new jzo(rajVar, wdjVar, z, yciVar, i, 0);
        }
    }

    public static final void k(shq shqVar, yci yciVar, hq5 hq5Var, int i) {
        vhq vhqVar;
        boolean z;
        yci yciVar2;
        shqVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1532160636);
        if (((i | (oq5Var.h(shqVar) ? 4 : 2) | 48) & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
            yciVar2 = yciVar;
        } else {
            vhq vhqVar2 = (vhq) gld.M(shqVar.c, oq5Var).getValue();
            kx0 kx0Var = qx0.c;
            gz2 gz2Var = b2c.n;
            ta5 a = sa5.a(kx0Var, gz2Var, oq5Var, 0);
            int i2 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
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
            kb5 kb5Var = wp5.f;
            g0g.U(oq5Var, a, kb5Var);
            kb5 kb5Var2 = wp5.e;
            g0g.U(oq5Var, l, kb5Var2);
            kb5 kb5Var3 = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i2))) {
                ouj.x(i2, oq5Var, i2, kb5Var3);
            }
            kb5 kb5Var4 = wp5.d;
            g0g.U(oq5Var, H, kb5Var4);
            if (Intrinsics.d(vhqVar2, thq.a)) {
                oq5Var.Z(-511426602);
                oq5Var.p(false);
                yciVar2 = vciVar;
                z = true;
            } else {
                if (!(vhqVar2 instanceof uhq)) {
                    throw vz1.i(oq5Var, -511426924, false);
                }
                oq5Var.Z(1325763967);
                ta5 a2 = sa5.a(kx0Var, gz2Var, oq5Var, 0);
                int i3 = oq5Var.P;
                androidx.compose.runtime.internal.a l2 = oq5Var.l();
                yci H2 = vnj.H(oq5Var, vciVar);
                oq5Var.d0();
                if (oq5Var.O) {
                    oq5Var.k(grbVar);
                } else {
                    oq5Var.n0();
                }
                g0g.U(oq5Var, a2, kb5Var);
                g0g.U(oq5Var, l2, kb5Var2);
                if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                    ouj.x(i3, oq5Var, i3, kb5Var3);
                }
                g0g.U(oq5Var, H2, kb5Var4);
                String str = shqVar.a.c;
                if (str != null) {
                    oq5Var.Z(-1539185551);
                    vhqVar = vhqVar2;
                    yciVar2 = vciVar;
                    z = true;
                    irf.h(str, null, null, null, null, false, null, false, null, oq5Var, 0, 510);
                } else {
                    vhqVar = vhqVar2;
                    z = true;
                    yciVar2 = vciVar;
                    oq5Var.Z(-1540629159);
                }
                oq5Var.p(false);
                oq5Var.Z(-188191463);
                uhq uhqVar = (uhq) vhqVar;
                int i4 = 0;
                for (Object obj : uhqVar.a) {
                    int i5 = i4 + 1;
                    if (i4 < 0) {
                        u75.n();
                        throw null;
                    }
                    khq khqVar = (khq) obj;
                    boolean f = oq5Var.f(uhqVar) | oq5Var.f(khqVar) | oq5Var.d(i4);
                    Object K = oq5Var.K();
                    kjn kjnVar = gq5.a;
                    if (f || K == kjnVar) {
                        gjl gjlVar = uhqVar.b;
                        pkb pkbVar = pkb.Track;
                        String str2 = khqVar.b.a;
                        str2.getClass();
                        K = new qkl(gjlVar, new thj(pkbVar, str2, 1, i4 + 1, ""));
                        oq5Var.k0(K);
                    }
                    qkl qklVar = (qkl) K;
                    po6 po6Var = khqVar.a;
                    Object K2 = oq5Var.K();
                    if (K2 == kjnVar) {
                        K2 = tlm.f(gld.R(g.a, oq5Var), oq5Var);
                    }
                    mm6 mm6Var = ((fs5) K2).a;
                    Context context = (Context) oq5Var.j(AndroidCompositionLocals_androidKt.b);
                    boolean f2 = oq5Var.f(khqVar) | oq5Var.f(qklVar);
                    Object K3 = oq5Var.K();
                    if (f2 || K3 == kjnVar) {
                        mqs mqsVar = khqVar.b;
                        context.getClass();
                        mqsVar.getClass();
                        K3 = f8g.K(mm6Var, shqVar.b, mqsVar, context, new rhq(0, shqVar, qklVar));
                        oq5Var.k0(K3);
                    }
                    bg5 bg5Var = (bg5) K3;
                    ynn i6 = irv.i(oq5Var);
                    boolean h = oq5Var.h(shqVar);
                    Object K4 = oq5Var.K();
                    if (h || K4 == kjnVar) {
                        K4 = new tik(19, shqVar);
                        oq5Var.k0(K4);
                    }
                    vut.i(po6Var, bg5Var, com.yandex.music.core.ui.compose.a.c(yciVar2, i6, qklVar, (pyc) K4, 14), oq5Var, 0);
                    i4 = i5;
                    z = true;
                }
                f1d.u(oq5Var, false, z, false);
            }
            oq5Var.p(z);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new hon(shqVar, yciVar2, i, 23);
        }
    }

    public static final void l(tsf tsfVar, zpd zpdVar, fjt fjtVar, njt njtVar, vm vmVar, ynn ynnVar, String str, yci yciVar, hq5 hq5Var, int i) {
        int i2;
        ynn ynnVar2;
        yci yciVar2;
        oq5 oq5Var;
        boolean z;
        tsfVar.getClass();
        fjtVar.getClass();
        njtVar.getClass();
        ynnVar.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(1697234520);
        if ((i & 6) == 0) {
            i2 = (oq5Var2.f(tsfVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var2.d(zpdVar.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var2.h(fjtVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var2.h(njtVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= oq5Var2.f(vmVar) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((196608 & i) == 0) {
            ynnVar2 = ynnVar;
            i2 |= oq5Var2.f(ynnVar2) ? 131072 : SQLiteDatabase.OPEN_FULLMUTEX;
        } else {
            ynnVar2 = ynnVar;
        }
        if ((1572864 & i) == 0) {
            i2 |= oq5Var2.f(str) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            yciVar2 = yciVar;
            i2 |= oq5Var2.f(yciVar2) ? 8388608 : RemoteCameraConfig.Camera.BITRATE;
        } else {
            yciVar2 = yciVar;
        }
        int i3 = i2;
        if (oq5Var2.P(i3 & 1, (4793491 & i3) != 4793490)) {
            iic iicVar = new iic(160);
            nx0 g = qx0.g(16);
            nx0 g2 = qx0.g(20);
            boolean z2 = fjtVar instanceof ejt;
            boolean h = ((i3 & 14) == 4) | oq5Var2.h(fjtVar) | ((3670016 & i3) == 1048576) | ((458752 & i3) == 131072) | oq5Var2.h(njtVar) | ((i3 & 112) == 32);
            Object K = oq5Var2.K();
            if (h || K == gq5.a) {
                z = z2;
                m10 m10Var = new m10(fjtVar, str, tsfVar, ynnVar2, njtVar, zpdVar);
                oq5Var2.k0(m10Var);
                K = m10Var;
            } else {
                z = z2;
            }
            oq5Var = oq5Var2;
            wdp.U(iicVar, yciVar2, tsfVar, vmVar, g2, g, null, z, null, (Function1) K, oq5Var, ((i3 >> 18) & 112) | 1769472 | ((i3 << 6) & 896) | ((i3 >> 3) & 7168), 0, 656);
        } else {
            oq5Var = oq5Var2;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new bt4(tsfVar, zpdVar, fjtVar, njtVar, vmVar, ynnVar, str, yciVar, i, 2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void n(z1w z1wVar, fvf fvfVar, hq5 hq5Var, int i) {
        int i2;
        int i3;
        z1w z1wVar2;
        fvf fvfVar2;
        oq5 oq5Var;
        e2w e2wVar;
        xmn r;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-496772423);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? oq5Var2.f(z1wVar) : oq5Var2.h(z1wVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var2.f(fvfVar) ? 32 : 16;
        }
        int i4 = i2;
        if ((i4 & 19) == 18 && oq5Var2.z()) {
            oq5Var2.S();
        } else {
            k2w k2wVar = (k2w) gld.O(z1wVar.a, oq5Var2).getValue();
            boolean z = k2wVar instanceof e2w;
            kjn kjnVar = gq5.a;
            if (!z) {
                if (!(k2wVar instanceof j2w)) {
                    throw vz1.i(oq5Var2, -656924397, false);
                }
                oq5Var2.Z(1110511534);
                j2w j2wVar = (j2w) k2wVar;
                int i5 = i4 & 14;
                boolean z2 = i5 == 4 || ((i4 & 8) != 0 && oq5Var2.h(z1wVar));
                Object K = oq5Var2.K();
                if (z2 || K == kjnVar) {
                    i3 = i5;
                    w4i w4iVar = new w4i(2, z1wVar, z1w.class, "onArtistClick", "onArtistClick(Lcom/yandex/music/shared/wizard3/ui/logic/api/data/search/WizardSearchArtistUiData;I)V", 0, 22);
                    oq5Var2.k0(w4iVar);
                    K = w4iVar;
                } else {
                    i3 = i5;
                }
                Function2 function2 = (Function2) ((h9f) K);
                boolean z3 = i3 == 4 || ((i4 & 8) != 0 && oq5Var2.h(z1wVar));
                Object K2 = oq5Var2.K();
                if (z3 || K2 == kjnVar) {
                    w40 w40Var = new w40(3, z1wVar, z1w.class, "onArtistVisibilityChanged", "onArtistVisibilityChanged(Lcom/yandex/music/shared/wizard3/ui/logic/api/data/search/WizardSearchArtistUiData;IZ)V", 0, 11);
                    oq5Var2.k0(w40Var);
                    K2 = w40Var;
                }
                pyc pycVar = (pyc) ((h9f) K2);
                boolean z4 = i3 == 4 || ((i4 & 8) != 0 && oq5Var2.h(z1wVar));
                Object K3 = oq5Var2.K();
                if (z4 || K3 == kjnVar) {
                    K3 = new vtu(0, z1wVar, z1w.class, "onRetryClick", "onRetryClick()V", 0, 25);
                    z1wVar2 = z1wVar;
                    oq5Var2.k0(K3);
                } else {
                    z1wVar2 = z1wVar;
                }
                fvfVar2 = fvfVar;
                oq5Var = oq5Var2;
                r(j2wVar, fvfVar2, function2, pycVar, (Function0) ((h9f) K3), oq5Var, i4 & 112);
                oq5Var.p(false);
                r = oq5Var.r();
                if (r == null) {
                    r.d = new npu(z1wVar2, fvfVar2, i, 9);
                    return;
                }
                return;
            }
            oq5Var2.Z(1110291744);
            e2w e2wVar2 = (e2w) k2wVar;
            boolean z5 = (i4 & 14) == 4 || ((i4 & 8) != 0 && oq5Var2.h(z1wVar));
            Object K4 = oq5Var2.K();
            if (z5 || K4 == kjnVar) {
                e2wVar = e2wVar2;
                w4i w4iVar2 = new w4i(2, z1wVar, z1w.class, "onArtistClick", "onArtistClick(Lcom/yandex/music/shared/wizard3/ui/logic/api/data/search/WizardSearchArtistUiData;I)V", 0, 21);
                oq5Var2.k0(w4iVar2);
                K4 = w4iVar2;
            } else {
                e2wVar = e2wVar2;
            }
            q(e2wVar, (Function2) ((h9f) K4), oq5Var2, 0);
            oq5Var2.p(false);
        }
        z1wVar2 = z1wVar;
        fvfVar2 = fvfVar;
        oq5Var = oq5Var2;
        r = oq5Var.r();
        if (r == null) {
        }
    }

    public static final void o(Function0 function0, Function1 function1, hq5 hq5Var, int i) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1782544445);
        int i2 = (oq5Var.h(function0) ? 4 : 2) | i | (oq5Var.h(function1) ? 32 : 16);
        if ((i2 & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
        } else {
            m1p T = y1g.T(function0, function1, oq5Var, (i2 << 3) & 1008, 1);
            ges gesVar = neg.t(oq5Var).c.e;
            neg.s(oq5Var);
            neg.s(oq5Var);
            w1g.i(gesVar, androidx.compose.foundation.layout.a.q(d.d(androidx.compose.foundation.a.b(vci.a, ((dq0) oq5Var.j(eq0.a)).c.a, vnj.i), 1.0f), 0.0f, 2, 16, 12, 1), T, i4w.f, oq5Var, 229376);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new u0v(function0, function1, i, 20);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void p(w1w w1wVar, int i, Function2 function2, pyc pycVar, hq5 hq5Var, int i2, int i3) {
        int i4;
        Function2 function22;
        int i5;
        pyc pycVar2;
        Function2 function23;
        Function2 function24;
        xmn r;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-27033505);
        if ((i2 & 6) == 0) {
            i4 = (oq5Var.f(w1wVar) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= oq5Var.d(i) ? 32 : 16;
        }
        int i6 = i3 & 4;
        if (i6 != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            function22 = function2;
            i4 |= oq5Var.h(function22) ? 256 : 128;
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else if ((i2 & 3072) == 0) {
                pycVar2 = pycVar;
                i4 |= oq5Var.h(pycVar2) ? 2048 : 1024;
                if ((i4 & 1171) == 1170 || !oq5Var.z()) {
                    kjn kjnVar = gq5.a;
                    if (i6 != 0) {
                        Object K = oq5Var.K();
                        if (K == kjnVar) {
                            K = new jiv(10);
                            oq5Var.k0(K);
                        }
                        function23 = (Function2) K;
                    } else {
                        function23 = function22;
                    }
                    if (i5 != 0) {
                        Object K2 = oq5Var.K();
                        if (K2 == kjnVar) {
                            K2 = new vru(4);
                            oq5Var.k0(K2);
                        }
                        pycVar2 = (pyc) K2;
                    }
                    if (w1wVar instanceof u1w) {
                        oq5Var.Z(2099089618);
                        jd1 jd1Var = (jd1) ((u1w) w1wVar).a.g.getValue();
                        int i7 = i4 & 14;
                        int i8 = i4 & 112;
                        boolean z = ((i4 & 896) == 256) | (i7 == 4) | (i8 == 32);
                        Object K3 = oq5Var.K();
                        if (z || K3 == kjnVar) {
                            K3 = new hsl(function23, w1wVar, i, 12);
                            oq5Var.k0(K3);
                        }
                        Function0 function0 = (Function0) K3;
                        boolean z2 = ((i4 & 7168) == 2048) | (i7 == 4) | (i8 == 32);
                        Object K4 = oq5Var.K();
                        if (z2 || K4 == kjnVar) {
                            K4 = new v50(pycVar2, w1wVar, i, 22);
                            oq5Var.k0(K4);
                        }
                        c9g.n(jd1Var, null, function0, (Function1) K4, oq5Var, 0);
                        oq5Var.p(false);
                    } else {
                        if (!Intrinsics.d(w1wVar, v1w.a)) {
                            throw vz1.i(oq5Var, -209383416, false);
                        }
                        oq5Var.Z(2099488650);
                        jf0.d(221622, oq5Var, e9g.b, null, i4w.n);
                        oq5Var.p(false);
                    }
                    function24 = function23;
                } else {
                    oq5Var.S();
                    function24 = function22;
                }
                pyc pycVar3 = pycVar2;
                r = oq5Var.r();
                if (r != null) {
                    r.d = new vpd(w1wVar, i, function24, pycVar3, i2, i3);
                    return;
                }
                return;
            }
            pycVar2 = pycVar;
            if ((i4 & 1171) == 1170) {
            }
            kjn kjnVar2 = gq5.a;
            if (i6 != 0) {
            }
            if (i5 != 0) {
            }
            if (w1wVar instanceof u1w) {
            }
            function24 = function23;
            pyc pycVar32 = pycVar2;
            r = oq5Var.r();
            if (r != null) {
            }
        }
        function22 = function2;
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        pycVar2 = pycVar;
        if ((i4 & 1171) == 1170) {
        }
        kjn kjnVar22 = gq5.a;
        if (i6 != 0) {
        }
        if (i5 != 0) {
        }
        if (w1wVar instanceof u1w) {
        }
        function24 = function23;
        pyc pycVar322 = pycVar2;
        r = oq5Var.r();
        if (r != null) {
        }
    }

    public static final void q(e2w e2wVar, Function2 function2, hq5 hq5Var, int i) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-680433548);
        int i2 = i | (oq5Var.f(e2wVar) ? 4 : 2) | (oq5Var.h(function2) ? 32 : 16);
        if ((i2 & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
        } else {
            vci vciVar = vci.a;
            yci c = d.c(vciVar, 1.0f);
            ta5 a = sa5.a(qx0.c, b2c.n, oq5Var, 0);
            int i3 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, c);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var, i3, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            neg.u(oq5Var).getClass();
            neg.s(oq5Var);
            String upperCase = rvf.M(R.string.wizard_search_popular_artists, oq5Var).toUpperCase(Locale.ROOT);
            upperCase.getClass();
            float f = 8;
            boolean z = false;
            xcs.b(upperCase, d.d(androidx.compose.foundation.layout.a.q(vciVar, 0.0f, f, 0.0f, f, 5), 1.0f), ((dq0) oq5Var.j(eq0.a)).b.a, 0L, null, 0L, null, new o9s(3), 0L, 0, false, 0, 0, null, neg.t(oq5Var).c.b, oq5Var, 48, 0, 65016);
            oq5Var = oq5Var;
            yci q = androidx.compose.foundation.layout.a.q(vciVar, 0.0f, 12, 0.0f, 0.0f, 13);
            boolean z2 = (i2 & 14) == 4;
            if ((i2 & 112) == 32) {
                z = true;
            }
            boolean z3 = z2 | z;
            Object K = oq5Var.K();
            if (z3 || K == gq5.a) {
                K = new itv(5, e2wVar, function2);
                oq5Var.k0(K);
            }
            weo.g(q, null, null, null, null, null, false, (Function1) K, oq5Var, 6, 254);
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new u0v(e2wVar, function2, i, 21);
        }
    }

    public static final void r(j2w j2wVar, fvf fvfVar, Function2 function2, pyc pycVar, Function0 function0, hq5 hq5Var, int i) {
        int i2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(61181996);
        if ((i & 6) == 0) {
            i2 = (oq5Var.f(j2wVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.f(fvfVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.h(function2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var.h(pycVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= oq5Var.h(function0) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((i2 & 9363) == 9362 && oq5Var.z()) {
            oq5Var.S();
        } else {
            boolean z = j2wVar instanceof g2w;
            vci vciVar = vci.a;
            if (z || j2wVar.equals(h2w.a)) {
                oq5Var.Z(1607202761);
                yci q = androidx.compose.foundation.layout.a.q(vciVar, 0.0f, 12, 0.0f, 0.0f, 13);
                boolean z2 = ((i2 & 14) == 4) | ((i2 & 896) == 256) | ((i2 & 7168) == 2048);
                Object K = oq5Var.K();
                if (z2 || K == gq5.a) {
                    K = new zzq(23, j2wVar, function2, pycVar);
                    oq5Var.k0(K);
                }
                weo.g(q, fvfVar, null, null, null, null, false, (Function1) K, oq5Var, (i2 & 112) | 6, 252);
                oq5Var.p(false);
            } else if (j2wVar.equals(f2w.a)) {
                oq5Var.Z(1608465515);
                ywf.l(null, oq5Var, 0);
                oq5Var.p(false);
            } else {
                if (!j2wVar.equals(i2w.a)) {
                    throw vz1.i(oq5Var, -1333631376, false);
                }
                oq5Var.Z(1608567567);
                yci c = d.c(vciVar, 1.0f);
                ta5 a = sa5.a(qx0.e, b2c.o, oq5Var, 54);
                int i3 = oq5Var.P;
                androidx.compose.runtime.internal.a l = oq5Var.l();
                yci H = vnj.H(oq5Var, c);
                xp5.T.getClass();
                grb grbVar = wp5.b;
                oq5Var.d0();
                if (oq5Var.O) {
                    oq5Var.k(grbVar);
                } else {
                    oq5Var.n0();
                }
                g0g.U(oq5Var, a, wp5.f);
                g0g.U(oq5Var, l, wp5.e);
                kb5 kb5Var = wp5.g;
                if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                    ouj.x(i3, oq5Var, i3, kb5Var);
                }
                g0g.U(oq5Var, H, wp5.d);
                neg.u(oq5Var).c.invoke(function0, oq5Var, Integer.valueOf((i2 >> 12) & 14));
                oq5Var.p(true);
                oq5Var.p(false);
            }
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new x9v(j2wVar, fvfVar, function2, pycVar, function0, i);
        }
    }

    public static final void s(z1w z1wVar, yci yciVar, hq5 hq5Var, int i) {
        yci yciVar2;
        z1wVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1527829410);
        int i2 = (oq5Var.f(z1wVar) ? 4 : 2) | i | 48;
        if ((i2 & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
            yciVar2 = yciVar;
        } else {
            fvf a = hvf.a(0, 0, oq5Var, 0, 3);
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (K == kjnVar) {
                K = tlm.f(gld.R(g.a, oq5Var), oq5Var);
            }
            mm6 mm6Var = ((fs5) K).a;
            int i3 = i2 & 14;
            boolean z = i3 == 4;
            Object K2 = oq5Var.K();
            if (z || K2 == kjnVar) {
                K2 = new dxv(5, z1wVar);
                oq5Var.k0(K2);
            }
            pd.c(0, 1, oq5Var, (Function0) K2, false);
            vci vciVar = vci.a;
            yci c = d.c(gut.z(gut.a0(gut.p1(vciVar))), 1.0f);
            ta5 a2 = sa5.a(qx0.c, b2c.n, oq5Var, 0);
            int i4 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, c);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a2, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var, i4, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            boolean z2 = i3 == 4;
            Object K3 = oq5Var.K();
            if (z2 || K3 == kjnVar) {
                vtu vtuVar = new vtu(0, z1wVar, z1w.class, "closeSearchScreen", "closeSearchScreen()V", 0, 26);
                oq5Var.k0(vtuVar);
                K3 = vtuVar;
            }
            Function0 function0 = (Function0) ((h9f) K3);
            boolean h = oq5Var.h(mm6Var) | oq5Var.f(a) | (i3 == 4);
            Object K4 = oq5Var.K();
            if (h || K4 == kjnVar) {
                K4 = new zzq(22, mm6Var, z1wVar, a);
                oq5Var.k0(K4);
            }
            o(function0, (Function1) K4, oq5Var, 0);
            n(z1wVar, a, oq5Var, i3);
            oq5Var.p(true);
            yciVar2 = vciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new u0v(z1wVar, yciVar2, i, 19);
        }
    }

    public static final int t(float[] fArr) {
        int i = 0;
        if (fArr.length < 16) {
            return 0;
        }
        int i2 = (fArr[0] == 1.0f && fArr[1] == 0.0f && fArr[2] == 0.0f && fArr[4] == 0.0f && fArr[5] == 1.0f && fArr[6] == 0.0f && fArr[8] == 0.0f && fArr[9] == 0.0f && fArr[10] == 1.0f) ? 1 : 0;
        if (fArr[12] == 0.0f && fArr[13] == 0.0f && fArr[14] == 0.0f && fArr[15] == 1.0f) {
            i = 1;
        }
        return (i2 << 1) | i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x007a, code lost:
    
        if (r6.length() > 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x003f, code lost:
    
        if (r3.length() > 0) goto L15;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final List u(mqs mqsVar) {
        String pathForSize;
        String pathForSize2;
        mqsVar.getClass();
        List<c01> list = mqsVar.u;
        if (list == null) {
            return c5b.a;
        }
        int s = wct.s();
        ArrayList arrayList = new ArrayList();
        for (c01 c01Var : list) {
            x41 x41Var = c01Var.o;
            c5b c5bVar = null;
            if (x41Var == x41.c || x41Var == x41.a) {
                pathForSize = c01Var.k.getPathForSize(s);
                pathForSize.getClass();
            }
            pathForSize = null;
            List i = u75.i(pathForSize);
            List<c01> list2 = c01Var.h;
            if (list2 != null) {
                ArrayList arrayList2 = new ArrayList();
                for (c01 c01Var2 : list2) {
                    x41 x41Var2 = c01Var2.o;
                    if (x41Var2 == x41.c || x41Var2 == x41.a) {
                        pathForSize2 = c01Var2.k.getPathForSize(s);
                        pathForSize2.getClass();
                    }
                    pathForSize2 = null;
                    if (pathForSize2 != null) {
                        arrayList2.add(pathForSize2);
                    }
                }
                c5bVar = arrayList2;
            }
            if (c5bVar == null) {
                c5bVar = c5b.a;
            }
            z75.t(arrayList, CollectionsKt.g0(i, c5bVar));
        }
        return arrayList;
    }

    public static final Object v(onx onxVar, poe poeVar) {
        if (!onxVar.k()) {
            zt3 zt3Var = new zt3(1, qxe.b(poeVar));
            zt3Var.s();
            onxVar.b(f48.b, new o9k(zt3Var));
            Object q = zt3Var.q();
            nm6 nm6Var = nm6.a;
            return q;
        }
        Exception g = onxVar.g();
        if (g != null) {
            throw g;
        }
        if (!onxVar.d) {
            return onxVar.h();
        }
        throw new CancellationException("Task " + onxVar + " was cancelled normally.");
    }

    public static float w(long j, long j2, long j3) {
        float f = 1;
        float f2 = j - j2;
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        return f - (f2 / j3);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:58|(1:(2:60|(1:63)(1:62))(2:112|113))|(5:107|108|109|(8:81|82|(1:(3:84|(1:102)(1:(1:90)(2:87|88))|89)(2:103|(1:105)))|91|(1:101)(1:95)|96|(1:98)|100)|(1:70)(2:71|(1:77)(2:79|80)))|65|(1:67)|81|82|(2:(0)(0)|89)|91|(1:93)|101|96|(0)|100|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x00f3, code lost:
    
        if (r12 == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x00ad, code lost:
    
        if (r11 == false) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0170 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0105 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x018b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0158 A[Catch: NoSuchFieldException -> 0x0188, TryCatch #0 {NoSuchFieldException -> 0x0188, blocks: (B:82:0x014a, B:84:0x0158, B:93:0x0175, B:95:0x017b, B:96:0x0181, B:98:0x0185, B:89:0x016d), top: B:81:0x014a }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0185 A[Catch: NoSuchFieldException -> 0x0188, TRY_LEAVE, TryCatch #0 {NoSuchFieldException -> 0x0188, blocks: (B:82:0x014a, B:84:0x0158, B:93:0x0175, B:95:0x017b, B:96:0x0181, B:98:0x0185, B:89:0x016d), top: B:81:0x014a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final t9f x(Class cls, t9f... t9fVarArr) {
        Object obj;
        t9f t9fVar;
        Class<?> cls2;
        Object obj2;
        t9f t9fVar2;
        int length;
        int i;
        Object obj3;
        Field field;
        vhp vhpVar;
        cls.getClass();
        if (cls.isEnum() && cls.getAnnotation(vhp.class) == null && cls.getAnnotation(hgm.class) == null) {
            Object[] enumConstants = cls.getEnumConstants();
            String canonicalName = cls.getCanonicalName();
            canonicalName.getClass();
            enumConstants.getClass();
            return new udb(canonicalName, (Enum[]) enumConstants);
        }
        t9f[] t9fVarArr2 = (t9f[]) Arrays.copyOf(t9fVarArr, t9fVarArr.length);
        try {
            Field declaredField = cls.getDeclaredField("Companion");
            declaredField.setAccessible(true);
            obj = declaredField.get(null);
        } catch (Throwable unused) {
            obj = null;
        }
        t9f P = obj == null ? null : P(obj, (t9f[]) Arrays.copyOf(t9fVarArr2, t9fVarArr2.length));
        if (P != null) {
            return P;
        }
        String canonicalName2 = cls.getCanonicalName();
        if (canonicalName2 != null && !c.v(canonicalName2, "java.", false) && !c.v(canonicalName2, "kotlin.", false)) {
            Field[] declaredFields = cls.getDeclaredFields();
            declaredFields.getClass();
            int length2 = declaredFields.length;
            Field field2 = null;
            int i2 = 0;
            boolean z = false;
            while (true) {
                if (i2 < length2) {
                    Field field3 = declaredFields[i2];
                    if (Intrinsics.d(field3.getName(), "INSTANCE") && Intrinsics.d(field3.getType(), cls) && Modifier.isStatic(field3.getModifiers())) {
                        if (z) {
                            break;
                        }
                        z = true;
                        field2 = field3;
                    }
                    i2++;
                }
            }
            field2 = null;
            if (field2 != null) {
                Object obj4 = field2.get(null);
                Method[] methods = cls.getMethods();
                methods.getClass();
                int length3 = methods.length;
                Method method = null;
                int i3 = 0;
                boolean z2 = false;
                while (true) {
                    if (i3 < length3) {
                        Method method2 = methods[i3];
                        if (Intrinsics.d(method2.getName(), "serializer")) {
                            Class<?>[] parameterTypes = method2.getParameterTypes();
                            parameterTypes.getClass();
                            if (parameterTypes.length == 0 && Intrinsics.d(method2.getReturnType(), t9f.class)) {
                                if (z2) {
                                    break;
                                }
                                z2 = true;
                                method = method2;
                            }
                        }
                        i3++;
                    }
                }
                method = null;
                if (method != null) {
                    Object invoke = method.invoke(obj4, null);
                    if (invoke instanceof t9f) {
                        t9fVar = (t9f) invoke;
                        if (t9fVar == null) {
                            return t9fVar;
                        }
                        t9f[] t9fVarArr3 = (t9f[]) Arrays.copyOf(t9fVarArr, t9fVarArr.length);
                        Class<?>[] declaredClasses = cls.getDeclaredClasses();
                        declaredClasses.getClass();
                        int length4 = declaredClasses.length;
                        int i4 = 0;
                        while (true) {
                            if (i4 >= length4) {
                                cls2 = null;
                                break;
                            }
                            cls2 = declaredClasses[i4];
                            if (cls2.getAnnotation(pwi.class) != null) {
                                break;
                            }
                            i4++;
                        }
                        if (cls2 != null) {
                            try {
                                Field declaredField2 = cls.getDeclaredField(cls2.getSimpleName());
                                declaredField2.setAccessible(true);
                                obj2 = declaredField2.get(null);
                            } catch (Throwable unused2) {
                            }
                            if (obj2 != null || (t9fVar2 = P(obj2, (t9f[]) Arrays.copyOf(t9fVarArr3, t9fVarArr3.length))) == null) {
                                Class<?>[] declaredClasses2 = cls.getDeclaredClasses();
                                declaredClasses2.getClass();
                                length = declaredClasses2.length;
                                Class<?> cls3 = null;
                                i = 0;
                                boolean z3 = false;
                                while (true) {
                                    if (i >= length) {
                                        Class<?> cls4 = declaredClasses2[i];
                                        if (cls4.getSimpleName().equals("$serializer")) {
                                            if (z3) {
                                                break;
                                            }
                                            z3 = true;
                                            cls3 = cls4;
                                        }
                                        i++;
                                    } else if (!z3) {
                                    }
                                }
                                cls3 = null;
                                obj3 = (cls3 != null || (field = cls3.getField("INSTANCE")) == null) ? null : field.get(null);
                                if (obj3 instanceof t9f) {
                                    t9fVar2 = (t9f) obj3;
                                }
                                t9fVar2 = null;
                            }
                            if (t9fVar2 == null) {
                                return t9fVar2;
                            }
                            if (cls.getAnnotation(hgm.class) == null && ((vhpVar = (vhp) cls.getAnnotation(vhp.class)) == null || !ern.a(vhpVar.with()).equals(ern.a(kgm.class)))) {
                                return null;
                            }
                            return new kgm(ern.a(cls));
                        }
                        obj2 = null;
                        if (obj2 != null) {
                        }
                        Class<?>[] declaredClasses22 = cls.getDeclaredClasses();
                        declaredClasses22.getClass();
                        length = declaredClasses22.length;
                        Class<?> cls32 = null;
                        i = 0;
                        boolean z32 = false;
                        while (true) {
                            if (i >= length) {
                            }
                            i++;
                        }
                        cls32 = null;
                        if (cls32 != null) {
                        }
                        if (obj3 instanceof t9f) {
                        }
                        t9fVar2 = null;
                        if (t9fVar2 == null) {
                        }
                    }
                }
            }
        }
        t9fVar = null;
        if (t9fVar == null) {
        }
    }

    public static Bundle y(String str, ugk ugkVar, List list, boolean z) {
        str.getClass();
        list.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("url", str);
        bundle.putBoolean("is_debug", ugkVar.a);
        List<bbt> list2 = list;
        ArrayList arrayList = new ArrayList(v75.o(list2, 10));
        for (bbt bbtVar : list2) {
            arrayList.add(new cbt(bbtVar.a, bbtVar.b));
        }
        bundle.putParcelableArray("trusted_urls", (cbt[]) arrayList.toArray(new cbt[0]));
        bundle.putBoolean("show_navigation_bar", z);
        bundle.putBoolean("handle_deeplink", false);
        return bundle;
    }

    public abstract long E();

    public abstract long F();

    public abstract long L();

    public abstract long M();

    public abstract boolean Y(sip sipVar);

    public abstract void Z(sip sipVar);

    public abstract void e0(tf6 tf6Var, ExoPlayer exoPlayer, ExoPlayer exoPlayer2, xdr xdrVar, xdr xdrVar2);

    public abstract Object f0(ExoPlayer exoPlayer, xdr xdrVar, Continuation continuation);

    public abstract Object g0(ExoPlayer exoPlayer, xdr xdrVar, Continuation continuation);

    public abstract Object h0(ExoPlayer exoPlayer, cg6 cg6Var);

    public abstract boolean z(long j);
}
