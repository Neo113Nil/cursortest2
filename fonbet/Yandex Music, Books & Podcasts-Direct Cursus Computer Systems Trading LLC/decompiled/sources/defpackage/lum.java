package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.text.style.StrikethroughSpan;
import android.text.style.UnderlineSpan;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.view.a;
import androidx.fragment.app.o;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import com.yandex.div.core.util.text.DivBackgroundSpan;
import com.yandex.div.internal.spannable.NoStrikethroughSpan;
import com.yandex.div.internal.spannable.NoUnderlineSpan;
import com.yandex.div.internal.spannable.TextColorSpan;
import com.yandex.music.databases.main.MainDatabase;
import com.yandex.music.shared.playback.api.commands.PauseCommand;
import com.yandex.music.shared.player.api.download.PlayerPlaybackException;
import com.yandex.music.shared.player.api.download.c;
import com.yandex.music.shared.player.api.download.e;
import com.yandex.music.shared.player.api.download.g;
import com.yandex.music.shared.player.api.download.h;
import com.yandex.music.shared.player.api.download.i;
import com.yandex.music.shared.player.api.download.j;
import com.yandex.music.shared.player.api.download.k;
import com.yandex.music.shared.player.api.download.l;
import com.yandex.music.shared.player.api.download.n;
import com.yandex.passport.api.exception.t;
import com.yandex.passport.api.y1;
import com.yandex.passport.api.z1;
import com.yandex.passport.common.logger.d;
import com.yandex.passport.internal.impl.q0;
import com.yandex.passport.internal.impl.x;
import com.yandex.passport.internal.methods.requester.b;
import com.yandex.passport.internal.methods.requester.f;
import com.yandex.passport.internal.methods.s;
import com.yandex.passport.internal.methods.u3;
import com.yandex.passport.internal.properties.m;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import org.json.JSONObject;
import ru.yandex.music.R;
import ru.yandex.music.common.media.control.QueuePreparationException;
import ru.yandex.music.common.media.queue.ChromeRemoteQueueStartException;
import ru.yandex.music.common.media.queue.DoNotLaunchQueueStartException;
import ru.yandex.music.common.media.queue.GlagolRemoteQueueStartException;
import ru.yandex.music.common.media.queue.RemoteQueueStartException;
import ru.yandex.music.common.media.queue.YnisonPassiveLaunchException;
import ru.yandex.music.common.media.queue.YnisonRemoteDeviceNotAvailableException;
import ru.yandex.music.common.media.queue.YnisonRemoteQueueStartException;
import ru.yandex.music.common.media.queue.YnisonSecondaryQueuePassiveLaunchException;

/* loaded from: classes3.dex */
public final class lum implements c1j, joo, vdj, oc5, p7q, pwq, d6w {
    public Object a;
    public Object b;
    public Object c;

    public lum(int i, boolean z) {
        switch (i) {
            case 4:
                this.a = new LinkedHashSet();
                this.b = new LinkedHashSet();
                ecg ecgVar = fcg.a;
                this.c = new LinkedHashSet();
                break;
            case 25:
                this.a = new HashMap();
                this.b = new ArrayList();
                break;
            default:
                this.a = new kum();
                this.b = new kum();
                this.c = new xy0(0);
                break;
        }
    }

    public static pgb E(rce rceVar, Throwable th) {
        Drawable b;
        if (th instanceof sgj) {
            rceVar.getClass();
            yp7 yp7Var = rceVar.F;
            b = yp7Var.l;
            yp7 yp7Var2 = i.a;
            if (b == null) {
                b = i.b(rceVar, rceVar.D, rceVar.C, yp7Var.k);
            }
        } else {
            b = i.b(rceVar, rceVar.D, rceVar.C, rceVar.F.k);
        }
        return new pgb(b, rceVar, th);
    }

    public static void I(List list, w71 w71Var) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            drf drfVar = (drf) it.next();
            if (drfVar instanceof m2s) {
                Iterator it2 = ((m2s) drfVar).c.iterator();
                while (it2.hasNext()) {
                    I(((r0s) it2.next()).e, w71Var);
                }
            } else {
                w71Var.invoke(drfVar);
            }
        }
    }

    public static o P(l37 l37Var, g8o g8oVar) {
        if (!n7w.R(q6c.e) || !n7w.R(q6c.m)) {
            l37Var = null;
        }
        return l37Var == null ? g8oVar : l37Var;
    }

    public static int R(int i, tq9 tq9Var, xzb xzbVar) {
        long longValue = ((Number) tq9Var.f.a(xzbVar)).longValue();
        int ordinal = ((sq9) tq9Var.d.a(xzbVar)).ordinal();
        if (ordinal == 0) {
            long j = longValue >> 31;
            return (j == 0 || j == -1) ? (int) longValue : longValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }
        if (ordinal != 1) {
            b6e.s();
            return 0;
        }
        long j2 = i - longValue;
        long j3 = j2 >> 31;
        return (j3 == 0 || j3 == -1) ? (int) j2 : j2 > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
    }

    public static boolean T(rce rceVar, Bitmap.Config config) {
        if (!fx1.j(config)) {
            return true;
        }
        if (!rceVar.n) {
            return false;
        }
        i6s i6sVar = rceVar.c;
        if (!(i6sVar instanceof lhu)) {
            return true;
        }
        View view = ((lhu) i6sVar).getView();
        return !view.isAttachedToWindow() || view.isHardwareAccelerated();
    }

    public static lum V(Context context, AttributeSet attributeSet, int[] iArr) {
        return new lum(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static lum W(Context context, AttributeSet attributeSet, int[] iArr, int i) {
        return new lum(context, context.obtainStyledAttributes(attributeSet, iArr, i, 0));
    }

    public static final void d(lum lumVar, Network network, boolean z) {
        Unit unit;
        boolean z2;
        Network[] allNetworks = ((ConnectivityManager) lumVar.a).getAllNetworks();
        int length = allNetworks.length;
        boolean z3 = false;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            Network network2 = allNetworks[i];
            if (Intrinsics.d(network2, network)) {
                z2 = z;
            } else {
                NetworkCapabilities networkCapabilities = ((ConnectivityManager) lumVar.a).getNetworkCapabilities(network2);
                z2 = networkCapabilities != null && networkCapabilities.hasCapability(12);
            }
            if (z2) {
                z3 = true;
                break;
            }
            i++;
        }
        czr czrVar = (czr) lumVar.b;
        synchronized (czrVar) {
            try {
                if (((skn) czrVar.a.get()) != null) {
                    czrVar.e = z3;
                    unit = Unit.a;
                } else {
                    unit = null;
                }
                if (unit == null) {
                    czrVar.b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void g(e23 e23Var, TextView textView, SpannableStringBuilder spannableStringBuilder, int i, int i2, List list) {
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return;
        }
        textView.setMovementMethod(kdp.a);
        spannableStringBuilder.setSpan(new kkk(e23Var, list), i, i2, 33);
        a e = wdu.e(textView);
        if (e == null) {
            e = new a();
        }
        wdu.q(textView, e);
    }

    public szn A(opi opiVar, int i) {
        LinkedHashSet linkedHashSet = (LinkedHashSet) this.c;
        linkedHashSet.getClass();
        szn sznVar = new szn(opiVar, i, linkedHashSet);
        ((LinkedHashSet) this.b).add(sznVar);
        return sznVar;
    }

    public szn B(opi opiVar, int i) {
        LinkedHashSet linkedHashSet = (LinkedHashSet) this.c;
        linkedHashSet.getClass();
        szn sznVar = new szn(opiVar, i, linkedHashSet);
        ((LinkedHashSet) this.b).add(sznVar);
        return sznVar;
    }

    public tzn C(opi opiVar, int i) {
        LinkedHashSet linkedHashSet = (LinkedHashSet) this.c;
        linkedHashSet.getClass();
        tzn tznVar = new tzn(opiVar, i, linkedHashSet);
        ((LinkedHashSet) this.a).add(tznVar);
        ((LinkedHashSet) this.b).add(tznVar);
        return tznVar;
    }

    public void D(bfk bfkVar, String str) {
        o P;
        sbp sbpVar = (sbp) this.c;
        ddu dduVar = sbpVar.a;
        ddu dduVar2 = sbpVar.a;
        dduVar.w(bfkVar);
        j8o j8oVar = sbpVar.b.a().e;
        boolean d = j8oVar.d();
        boolean z = j8oVar.a;
        if (d || sbpVar.g) {
            dduVar2.k();
            return;
        }
        dduVar2.q();
        if (str != null) {
            vds vdsVar = new vds(str);
            uds udsVar = z ? new uds(R.string.paymentsdk_login_done) : null;
            long j = j8oVar.b;
            t8o t8oVar = new t8o(bfkVar);
            l37 l37Var = new l37();
            l37Var.setArguments(cxb.K(new Pair("ARG_RESULT_TYPE", new r9o("failure", false, false, vdsVar, null, udsVar, null, null, j, null, t8oVar))));
            g8o g8oVar = new g8o();
            g8oVar.setArguments(cxb.K(new Pair("ARG_RESULT", e8o.b), new Pair("ARG_EXTERNAL_TEXT", str), new Pair("ARG_CLOSING", j8oVar)));
            P = P(l37Var, g8oVar);
        } else {
            uds udsVar2 = new uds(qgg.Y(bfkVar, R.string.paymentsdk_error_title));
            uds udsVar3 = z ? new uds(R.string.paymentsdk_login_done) : null;
            Integer S = qgg.S(bfkVar);
            uds udsVar4 = S != null ? new uds(S.intValue()) : null;
            long j2 = j8oVar.b;
            t8o t8oVar2 = new t8o(bfkVar);
            l37 l37Var2 = new l37();
            l37Var2.setArguments(cxb.K(new Pair("ARG_RESULT_TYPE", new r9o("failure", false, false, udsVar2, udsVar4, udsVar3, null, null, j2, null, t8oVar2))));
            int Y = qgg.Y(bfkVar, R.string.paymentsdk_error_title);
            Integer S2 = qgg.S(bfkVar);
            g8o g8oVar2 = new g8o();
            g8oVar2.setArguments(cxb.K(new Pair("ARG_RESULT", e8o.b), new Pair("ARG_TEXT", Integer.valueOf(Y)), new Pair("ARG_SUBTITLE", S2), new Pair("ARG_CLOSING", j8oVar)));
            P = P(l37Var2, g8oVar2);
        }
        op2.t(dduVar2, P, false, 0, 6);
        sbpVar.l();
        sbpVar.h();
    }

    public void F() {
        String str = (String) this.a;
        ((y1f) ((w1f) this.c).c).f(false);
        nmc nmcVar = (nmc) this.b;
        if (nmcVar.a == 0) {
            return;
        }
        String n = ouj.n(str, ".JankPercent");
        int i = nmcVar.b;
        float f = i == 0 ? 0.0f : nmcVar.c / i;
        qxp qxpVar = hdg.a;
        if (qxpVar == null) {
            Intrinsics.j("reporter");
            throw null;
        }
        qxpVar.i(n, f);
        String str2 = str + ".LongestFrame";
        msa msaVar = nsa.b;
        long f2 = nsa.f(yd5.N(nmcVar.a, ssa.NANOSECONDS));
        qxp qxpVar2 = hdg.a;
        if (qxpVar2 != null) {
            qxpVar2.h(str2, 0L, 100, 1000L, f2);
        } else {
            Intrinsics.j("reporter");
            throw null;
        }
    }

    public ArrayList G() {
        ArrayList arrayList = new ArrayList();
        w((List) this.b, arrayList, null);
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (hashSet.add(((s63) next).a.a().a)) {
                arrayList2.add(next);
            }
        }
        return arrayList2;
    }

    public void H() {
        kum kumVar = (kum) this.b;
        HashMap hashMap = new HashMap();
        kum kumVar2 = (kum) this.a;
        hashMap.put("view obtaining - total count", Integer.valueOf(kumVar2.b));
        hashMap.put("view obtaining - total time (µs)", Long.valueOf(o8g.P(kumVar2.a / 1000)));
        Iterator it = ((sy0) ((xy0) this.c).entrySet()).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            kum kumVar3 = (kum) entry.getValue();
            if (kumVar3.b > 0) {
                hashMap.put(hrg.q("blocking view obtaining for ", str, " - count"), Integer.valueOf(kumVar3.b));
                String str2 = "blocking view obtaining for " + str + " - avg time (µs)";
                int i = kumVar3.b;
                hashMap.put(str2, Long.valueOf(o8g.P((i != 0 ? kumVar3.a / i : 0L) / 1000)));
            }
        }
        int i2 = kumVar.b;
        if (i2 > 0) {
            hashMap.put("long view requests - count", Integer.valueOf(i2));
            int i3 = kumVar.b;
            hashMap.put("long view requests - avg time (µs)", Long.valueOf(o8g.P((i3 != 0 ? kumVar.a / i3 : 0L) / 1000)));
        }
    }

    public ColorStateList J(int i) {
        int resourceId;
        ColorStateList E;
        TypedArray typedArray = (TypedArray) this.b;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (E = etn.E((Context) this.a, resourceId)) == null) ? typedArray.getColorStateList(i) : E;
    }

    @Override // defpackage.pwq
    public xdr K() {
        return (xdr) this.c;
    }

    @Override // defpackage.pwq
    public ccg L() {
        return (cuk) this.b;
    }

    public Drawable M(int i) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.b;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) ? typedArray.getDrawable(i) : y2x.w((Context) this.a, resourceId);
    }

    public Drawable N(int i) {
        int resourceId;
        Drawable e;
        if (!((TypedArray) this.b).hasValue(i) || (resourceId = ((TypedArray) this.b).getResourceId(i, 0)) == 0) {
            return null;
        }
        ir0 a = ir0.a();
        Context context = (Context) this.a;
        synchronized (a) {
            e = a.a.e(context, resourceId, true);
        }
        return e;
    }

    public Typeface O(int i, int i2, gs0 gs0Var) {
        int resourceId = ((TypedArray) this.b).getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (((TypedValue) this.c) == null) {
            this.c = new TypedValue();
        }
        Context context = (Context) this.a;
        TypedValue typedValue = (TypedValue) this.c;
        ThreadLocal threadLocal = e3o.a;
        if (context.isRestricted()) {
            return null;
        }
        return e3o.b(context, resourceId, typedValue, i2, gs0Var, true, false);
    }

    public void Q(Throwable th) {
        String str;
        Context context = (Context) this.a;
        th.getClass();
        if (th instanceof QueuePreparationException) {
            v3w.l("queue preparation failed due to error: ", ((QueuePreparationException) th).getMessage(), 4, "QueueErrorHandler", null);
            return;
        }
        if (!(th instanceof RemoteQueueStartException)) {
            if (th instanceof DoNotLaunchQueueStartException) {
                v3w.l("No subscription remote launch error: ", ((DoNotLaunchQueueStartException) th).a, 3, "QueueErrorHandler", null);
                return;
            } else {
                hld.I(context, (z66) ((jyr) this.b).getValue());
                return;
            }
        }
        RemoteQueueStartException remoteQueueStartException = (RemoteQueueStartException) th;
        boolean z = remoteQueueStartException instanceof GlagolRemoteQueueStartException;
        int i = R.string.remote_queue_launch_error_general;
        if (z) {
            GlagolRemoteQueueStartException glagolRemoteQueueStartException = (GlagolRemoteQueueStartException) th;
            v3w.l("Can't launch on Yandex.Station: ", glagolRemoteQueueStartException.a, 5, "QueueErrorHandler", null);
            int ordinal = glagolRemoteQueueStartException.b.ordinal();
            if (ordinal == 0) {
                i = R.string.remote_queue_launch_error_wrong_content;
            } else if (ordinal != 1) {
                b6e.s();
                return;
            }
            context.getClass();
            hag.x(context, i, 0);
            return;
        }
        if (remoteQueueStartException instanceof YnisonRemoteQueueStartException) {
            YnisonRemoteQueueStartException ynisonRemoteQueueStartException = (YnisonRemoteQueueStartException) th;
            v3w.l("ynison remote launch error: ", ynisonRemoteQueueStartException.a, 3, "QueueErrorHandler", null);
            if (ynisonRemoteQueueStartException instanceof YnisonPassiveLaunchException) {
                ((ayk) ((jyr) this.c).getValue()).c(((YnisonPassiveLaunchException) ynisonRemoteQueueStartException).b.e());
                return;
            }
            if (ynisonRemoteQueueStartException instanceof YnisonRemoteDeviceNotAvailableException) {
                context.getClass();
                hag.x(context, R.string.remote_queue_launch_error_general, 0);
                return;
            } else if (!(ynisonRemoteQueueStartException instanceof YnisonSecondaryQueuePassiveLaunchException)) {
                b6e.s();
                return;
            } else {
                context.getClass();
                hag.x(context, R.string.remote_queue_launch_error_trailer, 0);
                return;
            }
        }
        if (!(remoteQueueStartException instanceof ChromeRemoteQueueStartException)) {
            b6e.s();
            return;
        }
        ChromeRemoteQueueStartException chromeRemoteQueueStartException = (ChromeRemoteQueueStartException) th;
        String str2 = chromeRemoteQueueStartException.a;
        mwk mwkVar = chromeRemoteQueueStartException.b;
        if (mwkVar != null) {
            str = mwkVar.getClass().getSimpleName() + "(" + System.identityHashCode(mwkVar) + ")";
        } else {
            str = null;
        }
        ssg.a(5, "QueueErrorHandler", hrg.r("Can't launch on Chrome Cast: ", str2, " on playable=", str), null);
        context.getClass();
        hag.x(context, R.string.remote_queue_launch_chrome_error_wrong_content, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00c6 A[Catch: RuntimeException -> 0x00cd, TryCatch #0 {RuntimeException -> 0x00cd, blocks: (B:12:0x00b3, B:14:0x00c6, B:15:0x00d0, B:17:0x00e5, B:24:0x00fb, B:26:0x00fe, B:28:0x0108, B:30:0x010b, B:32:0x010c, B:34:0x0116, B:35:0x011d, B:36:0x0122), top: B:11:0x00b3 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00e5 A[Catch: RuntimeException -> 0x00cd, TRY_LEAVE, TryCatch #0 {RuntimeException -> 0x00cd, blocks: (B:12:0x00b3, B:14:0x00c6, B:15:0x00d0, B:17:0x00e5, B:24:0x00fb, B:26:0x00fe, B:28:0x0108, B:30:0x010b, B:32:0x010c, B:34:0x0116, B:35:0x011d, B:36:0x0122), top: B:11:0x00b3 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00fb A[Catch: RuntimeException -> 0x00cd, TRY_ENTER, TryCatch #0 {RuntimeException -> 0x00cd, blocks: (B:12:0x00b3, B:14:0x00c6, B:15:0x00d0, B:17:0x00e5, B:24:0x00fb, B:26:0x00fe, B:28:0x0108, B:30:0x010b, B:32:0x010c, B:34:0x0116, B:35:0x011d, B:36:0x0122), top: B:11:0x00b3 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object S(cg6 cg6Var) {
        zdq zdqVar;
        int i;
        m mVar;
        q0 q0Var;
        m mVar2;
        m mVar3;
        x xVar;
        Throwable a;
        try {
            if (cg6Var instanceof zdq) {
                zdqVar = (zdq) cg6Var;
                int i2 = zdqVar.p;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    zdqVar.p = i2 - Integer.MIN_VALUE;
                    Object obj = zdqVar.n;
                    nm6 nm6Var = nm6.a;
                    i = zdqVar.p;
                    Continuation continuation = null;
                    if (i != 0) {
                        qgg.h0(obj);
                        q0 q0Var2 = (q0) this.a;
                        mVar = new m();
                        mVar.a = y1.d;
                        mVar.a = ((q9k) this.b).a.b() ? y1.b : y1.a;
                        j6m j6mVar = (j6m) ((jyr) this.c).getValue();
                        zdqVar.j = mVar;
                        zdqVar.k = mVar;
                        zdqVar.l = mVar;
                        zdqVar.m = q0Var2;
                        zdqVar.p = 1;
                        Object a2 = j6mVar.a(zdqVar);
                        if (a2 == nm6Var) {
                            return nm6Var;
                        }
                        q0Var = q0Var2;
                        obj = a2;
                        mVar2 = mVar;
                        mVar3 = mVar2;
                    } else {
                        if (i != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        q0Var = zdqVar.m;
                        mVar = zdqVar.l;
                        mVar3 = zdqVar.k;
                        mVar2 = zdqVar.j;
                        qgg.h0(obj);
                    }
                    z1 z1Var = (z1) obj;
                    mVar.getClass();
                    z1Var.getClass();
                    mVar.b = z1Var;
                    mVar3.getClass();
                    mVar3.c = "music";
                    mVar3.d = "plus";
                    int i3 = 0;
                    mVar3.e = false;
                    mVar2.getClass();
                    com.yandex.passport.internal.properties.o oVar = new com.yandex.passport.internal.properties.o(mVar2.a, com.yandex.passport.internal.ui.a.D(mVar2.getUid()), mVar2.d(), mVar2.e(), mVar2.e);
                    xVar = q0Var.b;
                    s sVar = s.a;
                    xVar.q();
                    f fVar = xVar.f;
                    u3 u3Var = new u3(sVar);
                    f9f[] f9fVarArr = new f9f[0];
                    if (!"robolectric".equals(Build.FINGERPRINT)) {
                        Looper.getMainLooper();
                        Looper.myLooper();
                    }
                    Object A = com.yandex.passport.internal.ui.a.A(new b(fVar, u3Var, continuation, i3));
                    f9f[] f9fVarArr2 = (f9f[]) Arrays.copyOf(f9fVarArr, 0);
                    a = z7o.a(A);
                    if (a != null) {
                        if (((Boolean) A).booleanValue()) {
                            q0Var.w.a(oVar);
                        } else {
                            q0Var.v.a(oVar);
                        }
                        return Unit.a;
                    }
                    int length = f9fVarArr2.length;
                    while (i3 < length) {
                        if (((lm4) f9fVarArr2[i3]).i(a)) {
                            throw a;
                        }
                        i3++;
                    }
                    d dVar = com.yandex.passport.common.logger.a.a;
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.b(com.yandex.passport.common.logger.b.e, null, "catch non-PassportException from provider", a);
                    }
                    throw new t(a);
                }
            }
            f fVar2 = xVar.f;
            u3 u3Var2 = new u3(sVar);
            f9f[] f9fVarArr3 = new f9f[0];
            if (!"robolectric".equals(Build.FINGERPRINT)) {
            }
            Object A2 = com.yandex.passport.internal.ui.a.A(new b(fVar2, u3Var2, continuation, i3));
            f9f[] f9fVarArr22 = (f9f[]) Arrays.copyOf(f9fVarArr3, 0);
            a = z7o.a(A2);
            if (a != null) {
            }
        } catch (RuntimeException e) {
            xVar.r(e);
            throw e;
        }
        zdqVar = new zdq(this, cg6Var);
        Object obj2 = zdqVar.n;
        nm6 nm6Var2 = nm6.a;
        i = zdqVar.p;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        z1 z1Var2 = (z1) obj2;
        mVar.getClass();
        z1Var2.getClass();
        mVar.b = z1Var2;
        mVar3.getClass();
        mVar3.c = "music";
        mVar3.d = "plus";
        int i32 = 0;
        mVar3.e = false;
        mVar2.getClass();
        com.yandex.passport.internal.properties.o oVar2 = new com.yandex.passport.internal.properties.o(mVar2.a, com.yandex.passport.internal.ui.a.D(mVar2.getUid()), mVar2.d(), mVar2.e(), mVar2.e);
        xVar = q0Var.b;
        s sVar2 = s.a;
        xVar.q();
    }

    public boolean U() {
        if (((sdr) this.a).getValue() != this.c) {
            return true;
        }
        lum lumVar = (lum) this.b;
        return lumVar != null && lumVar.U();
    }

    public void X(String str) {
        jlb[] jlbVarArr = jlb.a;
        nmb nmbVar = (nmb) this.a;
        r18 r18Var = (r18) this.c;
        String a = r18Var.a.a();
        if (a == null) {
            a = "";
        }
        String str2 = ((frt) this.b).c().a;
        String E = avf.E(r18Var.b);
        if (str == null) {
            str = "";
        }
        str2.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("device_id", a);
        linkedHashMap.put("puid", str2);
        linkedHashMap.put("device_name", E);
        linkedHashMap.put("error_type", "network");
        dfi.p(1, "error_message", str, "_meta", linkedHashMap);
        nmbVar.C("PayWallScreen.PromoCode.ErrorRaised", linkedHashMap);
    }

    public void Y(vdc vdcVar) {
        w7o w7oVar = (w7o) this.a;
        Parcelable parcelable = (Parcelable) this.b;
        Object obj = kib.a;
        com.yandex.plus.paymentsdk.internal.method.card.a a = kib.a(((sbp) this.c).b.b());
        if (a != null) {
            a.a(new e3s(29));
        }
        if (vdcVar instanceof udc) {
            k0(R.string.paymentsdk_success_title, parcelable);
            return;
        }
        if (!(vdcVar instanceof tdc)) {
            if (w7oVar instanceof u7o) {
                k0(((Number) ((u7o) w7oVar).a).intValue(), parcelable);
                return;
            } else {
                if (w7oVar instanceof s7o) {
                    D(((s7o) w7oVar).a, null);
                    return;
                }
                return;
            }
        }
        String str = ((tdc) vdcVar).a;
        if (str != null) {
            D(new bfk(zek.a, afk.e, null, null, str, null), str);
        } else if (w7oVar instanceof s7o) {
            D(((s7o) w7oVar).a, null);
        } else {
            D(new bfk(zek.a, afk.e, null, null, "", null), null);
        }
    }

    public void Z(String str, SslError sslError) {
        sslError.getClass();
        if (Intrinsics.d(sslError.getUrl(), str)) {
            jlb[] jlbVarArr = jlb.a;
            int primaryError = sslError.getPrimaryError();
            int primaryError2 = sslError.getPrimaryError();
            X("SslError[errorCode=" + primaryError + ", error=" + (primaryError2 != 0 ? primaryError2 != 1 ? primaryError2 != 2 ? primaryError2 != 3 ? primaryError2 != 4 ? primaryError2 != 5 ? "SSL_UNKNOWN" : "SSL_INVALID" : "SSL_DATE_INVALID" : "SSL_UNTRUSTED" : "SSL_IDMISMATCH" : "SSL_EXPIRED" : "SSL_NOTYETVALID") + "]");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0033, code lost:
    
        if (((defpackage.nsd) r16.c).e(r18) != false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public rwj a0(rce rceVar, lmq lmqVar) {
        List list = rceVar.i;
        Bitmap.Config config = rceVar.g;
        if (list.isEmpty() || xz0.u(k.a, config)) {
            if (fx1.j(config)) {
                if (T(rceVar, config)) {
                }
            }
            x97 x97Var = lmqVar.a;
            r38 r38Var = r38.n;
            return new rwj(rceVar.a, config, null, lmqVar, (!x97Var.equals(r38Var) || lmqVar.b.equals(r38Var)) ? nso.b : rceVar.z, i.a(rceVar), (rceVar.o || !rceVar.i.isEmpty() || config == Bitmap.Config.ALPHA_8) ? false : true, rceVar.p, rceVar.f, rceVar.k, rceVar.l, rceVar.A, rceVar.q, rceVar.r, rceVar.s);
        }
        config = Bitmap.Config.ARGB_8888;
        x97 x97Var2 = lmqVar.a;
        r38 r38Var2 = r38.n;
        return new rwj(rceVar.a, config, null, lmqVar, (!x97Var2.equals(r38Var2) || lmqVar.b.equals(r38Var2)) ? nso.b : rceVar.z, i.a(rceVar), (rceVar.o || !rceVar.i.isEmpty() || config == Bitmap.Config.ALPHA_8) ? false : true, rceVar.p, rceVar.f, rceVar.k, rceVar.l, rceVar.A, rceVar.q, rceVar.r, rceVar.s);
    }

    public Object b0(cg6 cg6Var) {
        Object V = x97.V(dm6.b(), new r0r((cr) this.a, null, 3), cg6Var);
        nm6 nm6Var = nm6.a;
        if (V != nm6Var) {
            V = Unit.a;
        }
        return V == nm6Var ? V : Unit.a;
    }

    @Override // defpackage.pwq
    public xdr c() {
        return (xdr) this.a;
    }

    public Object c0(aur aurVar) {
        Object V = x97.V(dm6.b(), new r0r((cr) this.a, null, 4), aurVar);
        nm6 nm6Var = nm6.a;
        if (V != nm6Var) {
            V = Unit.a;
        }
        return V == nm6Var ? V : Unit.a;
    }

    public Object d0(n7q n7qVar, long j, boolean z, boolean z2, gol golVar) {
        r5d r5dVar;
        cr crVar = (cr) this.a;
        mwk b = n7qVar.b();
        noh a = n7qVar.a();
        if (a instanceof ooh) {
            r5dVar = r5d.c;
        } else {
            if (!(a instanceof moh)) {
                b6e.s();
                return null;
            }
            b.getClass();
            r5dVar = b.equals(h1b.e) ? null : (r5d) dag.p(b, klx.h);
            if (r5dVar == null) {
                r5dVar = ((s5d) crVar.h).getPlayerType();
            }
        }
        r5d r5dVar2 = r5dVar;
        boolean booleanValue = ((Boolean) wdg.A(n7qVar, x2i.e)).booleanValue();
        boolean R = gut.R(n7qVar.g());
        EnumSet noneOf = EnumSet.noneOf(o5d.class);
        noneOf.getClass();
        if (booleanValue && (((Boolean) ((d1j) this.b).invoke()).booleanValue() || R)) {
            noneOf.add(o5d.a);
        }
        if (booleanValue) {
            noneOf.add(o5d.b);
        }
        if (R) {
            noneOf.add(o5d.c);
        }
        Object V = x97.V(dm6.b(), new t0r(crVar, r5dVar2, z, b, z2, j, n7qVar.g(), (t0q) wdg.A(n7qVar, l48.e), noneOf, a, null), golVar);
        nm6 nm6Var = nm6.a;
        if (V != nm6Var) {
            V = Unit.a;
        }
        return V == nm6Var ? V : Unit.a;
    }

    @Override // defpackage.oc5
    public void e(x1u x1uVar) {
        x1uVar.getClass();
        g6p g6pVar = (g6p) this.a;
        e4p e4pVar = ((h7p) this.b).c;
        ((Number) ((aqi) this.c).getValue()).intValue();
        g6pVar.A0(x1uVar, e4pVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00d2, code lost:
    
        if (r13 != r2) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Serializable e0(boolean z, Function2 function2, Continuation continuation) {
        o0p o0pVar;
        int i;
        int i2;
        Object obj;
        int i3;
        um4 um4Var;
        l18 l18Var = l18.b;
        if (continuation instanceof o0p) {
            o0pVar = (o0p) continuation;
            int i4 = o0pVar.p;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                o0pVar.p = i4 - Integer.MIN_VALUE;
                Object obj2 = o0pVar.n;
                nm6 nm6Var = nm6.a;
                i = o0pVar.p;
                if (i != 0) {
                    qgg.h0(obj2);
                    bdt I = hag.I(frt.class);
                    qdc qdcVar = l18Var.a;
                    qdcVar.getClass();
                    String str = ((frt) qdcVar.C(I)).c().a;
                    str.getClass();
                    bdt I2 = hag.I(i5h.class);
                    qdc qdcVar2 = l18Var.a;
                    qdcVar2.getClass();
                    i5h i5hVar = (i5h) qdcVar2.C(I2);
                    o0pVar.k = function2;
                    o0pVar.j = z;
                    i2 = 0;
                    o0pVar.l = 0;
                    o0pVar.m = 0;
                    o0pVar.p = 1;
                    Object b = i5hVar.b(str, o0pVar);
                    if (b != nm6Var) {
                        obj = b;
                        i3 = 0;
                    }
                    return nm6Var;
                }
                if (i != 1) {
                    if (i != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj2);
                    Iterable iterable = (Iterable) obj2;
                    ArrayList arrayList = new ArrayList(v75.o(iterable, 10));
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        arrayList.add(ngg.M((rxs) it.next()));
                    }
                    return arrayList;
                }
                int i5 = o0pVar.m;
                int i6 = o0pVar.l;
                boolean z2 = o0pVar.j;
                Function2 function22 = o0pVar.k;
                qgg.h0(obj2);
                i2 = i5;
                z = z2;
                obj = obj2;
                i3 = i6;
                function2 = function22;
                uxs Q = ((MainDatabase) obj).Q();
                ysr ysrVar = new ysr("track_mview");
                um4Var = new um4(pgp.a);
                function2.invoke(rxs.j, um4Var);
                if (z && gut.h1((z66) ((jyr) this.b).getValue())) {
                    um4Var.c("is_permanent", true);
                }
                tt0.K(ysrVar, um4Var);
                ysrVar.f = "timestamp DESC, position ASC";
                atn a = ysrVar.a();
                o0pVar.k = null;
                o0pVar.j = z;
                o0pVar.l = i3;
                o0pVar.m = i2;
                o0pVar.p = 2;
                obj2 = Q.b(a, o0pVar);
            }
        }
        o0pVar = new o0p(this, continuation);
        Object obj22 = o0pVar.n;
        nm6 nm6Var2 = nm6.a;
        i = o0pVar.p;
        if (i != 0) {
        }
        uxs Q2 = ((MainDatabase) obj).Q();
        ysr ysrVar2 = new ysr("track_mview");
        um4Var = new um4(pgp.a);
        function2.invoke(rxs.j, um4Var);
        if (z) {
            um4Var.c("is_permanent", true);
        }
        tt0.K(ysrVar2, um4Var);
        ysrVar2.f = "timestamp DESC, position ASC";
        atn a2 = ysrVar2.a();
        o0pVar.k = null;
        o0pVar.j = z;
        o0pVar.l = i3;
        o0pVar.m = i2;
        o0pVar.p = 2;
        obj22 = Q2.b(a2, o0pVar);
    }

    @Override // defpackage.vdj
    public void f(boolean z) {
        g6p g6pVar = (g6p) this.a;
        d7p d7pVar = (d7p) this.b;
        g6pVar.s0(d7pVar, ((Number) ((aqi) this.c).getValue()).intValue(), z, d7pVar.c);
    }

    public void f0() {
        ((TypedArray) this.b).recycle();
    }

    public void g0(int i) {
        for (rzn rznVar : (LinkedHashSet) this.b) {
            if ((rznVar.b & i) != 0) {
                rznVar.d = null;
                rznVar.e = null;
            }
        }
    }

    @Override // defpackage.oc5
    public boolean h(x1u x1uVar) {
        x1uVar.getClass();
        ((g6p) this.a).A(x1uVar, ((h7p) this.b).c, ((Number) ((aqi) this.c).getValue()).intValue());
        return true;
    }

    public void h0(Runnable runnable) {
        if (((HashMap) this.a).isEmpty()) {
            ((ArrayList) this.b).add(runnable);
        } else {
            runnable.run();
        }
    }

    @Override // defpackage.oc5
    public void i(x1u x1uVar) {
        x1uVar.getClass();
        ((g6p) this.a).J(((Number) ((aqi) this.c).getValue()).intValue(), ((h7p) this.b).c, x1uVar, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object i0(String str, onh onhVar, cg6 cg6Var) {
        vmp vmpVar;
        nm6 nm6Var;
        int i;
        fan fanVar;
        k1l k1lVar;
        qyk qykVar;
        ad0 ad0Var;
        onh onhVar2;
        try {
            if (cg6Var instanceof vmp) {
                vmpVar = (vmp) cg6Var;
                int i2 = vmpVar.m;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    vmpVar.m = i2 - Integer.MIN_VALUE;
                    Object obj = vmpVar.k;
                    nm6Var = nm6.a;
                    i = vmpVar.m;
                    if (i != 0) {
                        qgg.h0(obj);
                        cmp cmpVar = (cmp) ((jyr) this.c).getValue();
                        Bundle bundle = onhVar.f.c;
                        vmpVar.j = onhVar;
                        vmpVar.m = 1;
                        obj = cmpVar.a(str, bundle, vmpVar);
                        if (obj == nm6Var) {
                            return nm6Var;
                        }
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            onhVar2 = vmpVar.j;
                            qgg.h0(obj);
                            ((z7o) obj).getClass();
                            return t75.c(onhVar2);
                        }
                        onhVar = vmpVar.j;
                        qgg.h0(obj);
                    }
                    fanVar = (fan) this.b;
                    k1lVar = (k1l) this.a;
                    qykVar = uyk.d;
                    ad0Var = new ad0((v8n) obj, null, 1);
                    vmpVar.j = onhVar;
                    vmpVar.m = 2;
                    if (a0g.J(fanVar, k1lVar, qykVar, ad0Var, vmpVar) != nm6Var) {
                        onhVar2 = onhVar;
                        return t75.c(onhVar2);
                    }
                    return nm6Var;
                }
            }
            if (i != 0) {
            }
            fanVar = (fan) this.b;
            k1lVar = (k1l) this.a;
            qykVar = uyk.d;
            ad0Var = new ad0((v8n) obj, null, 1);
            vmpVar.j = onhVar;
            vmpVar.m = 2;
            if (a0g.J(fanVar, k1lVar, qykVar, ad0Var, vmpVar) != nm6Var) {
            }
            return nm6Var;
        } catch (Exception e) {
            if (!(e instanceof CancellationException)) {
                ssg.a(6, "SessionStartSearchQueryManager", "Error in Google Assistant search request", e);
            }
            throw e;
        }
        vmpVar = new vmp(this, cg6Var);
        Object obj2 = vmpVar.k;
        nm6Var = nm6.a;
        i = vmpVar.m;
    }

    public void j(pjp pjpVar) {
        k3i k3iVar = pjpVar.a;
        String str = (String) this.a;
        boolean equals = str.equals(k3iVar.c);
        String str2 = k3iVar.b;
        o2g.M(equals, "Method name should be prefixed with service name and separated with '/'. Expected service name: '%s'. Actual fully qualifed method name: '%s'.", str, str2);
        HashMap hashMap = (HashMap) this.c;
        o2g.S(str2, "Method by same name already registered: %s", !hashMap.containsKey(str2));
        hashMap.put(str2, pjpVar);
    }

    public void j0(final kd kdVar) {
        this.c = kdVar;
        HashMap hashMap = (HashMap) this.a;
        if (hashMap.isEmpty()) {
            return;
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            final Object key = entry.getKey();
            MenuItem menuItem = (MenuItem) entry.getValue();
            if (menuItem.getActionView() != null) {
                menuItem.getActionView().setOnClickListener(new fq2(9, kdVar, key));
            } else {
                menuItem.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: wos
                    @Override // android.view.MenuItem.OnMenuItemClickListener
                    public final boolean onMenuItemClick(MenuItem menuItem2) {
                        kd.this.mo33b(key);
                        return true;
                    }
                });
            }
        }
    }

    @Override // defpackage.oc5
    public void k(x1u x1uVar, boolean z) {
        x1uVar.getClass();
        ((g6p) this.a).N(((Number) ((aqi) this.c).getValue()).intValue(), ((h7p) this.b).c, x1uVar, z);
    }

    public void k0(int i, Parcelable parcelable) {
        o P;
        sbp sbpVar = (sbp) this.c;
        ddu dduVar = sbpVar.a;
        ddu dduVar2 = sbpVar.a;
        dduVar.x(parcelable);
        p77 p77Var = sbpVar.b;
        j8o j8oVar = p77Var.a().e;
        boolean z = j8oVar.c;
        boolean z2 = j8oVar.a;
        if (z || j8oVar.d() || sbpVar.g) {
            dduVar2.k();
            return;
        }
        dduVar2.q();
        boolean d = ((pmk) p77Var.s.get()).d();
        v8o v8oVar = v8o.a;
        if (!d || s9k.b() == null) {
            uds udsVar = new uds(i);
            uds udsVar2 = z2 ? new uds(R.string.paymentsdk_login_done) : null;
            long j = j8oVar.b;
            l37 l37Var = new l37();
            l37Var.setArguments(cxb.K(new Pair("ARG_RESULT_TYPE", new t9o("success", false, false, udsVar, null, udsVar2, null, null, j, v8oVar))));
            g8o g8oVar = new g8o();
            g8oVar.setArguments(cxb.K(new Pair("ARG_RESULT", e8o.a), new Pair("ARG_TEXT", Integer.valueOf(i)), new Pair("ARG_IS_LOGGED_IN", Boolean.TRUE), new Pair("ARG_CLOSING", j8oVar)));
            P = P(l37Var, g8oVar);
        } else {
            uds udsVar3 = new uds(i);
            uds udsVar4 = z2 ? new uds(R.string.paymentsdk_login) : null;
            long j2 = j8oVar.b;
            l37 l37Var2 = new l37();
            l37Var2.setArguments(cxb.K(new Pair("ARG_RESULT_TYPE", new t9o("success", false, false, udsVar3, null, udsVar4, null, null, j2, v8oVar))));
            l37.x(l37Var2, new j5n(10, this, sbpVar), null, null, 6);
            kmk kmkVar = sbpVar.h;
            boolean z3 = ((ugk) p77Var.q.get()).a;
            kmkVar.getClass();
            g8o g8oVar2 = new g8o();
            g8oVar2.setArguments(cxb.K(new Pair("ARG_RESULT", e8o.a), new Pair("ARG_TEXT", Integer.valueOf(i)), new Pair("ARG_IS_LOGGED_IN", Boolean.FALSE), new Pair("ARG_PERSONAL_INFO", kmkVar), new Pair("ARG_IS_DEBUG", Boolean.valueOf(z3))));
            P = P(l37Var2, g8oVar2);
        }
        op2.t(dduVar2, P, false, 0, 6);
        sbpVar.l();
        sbpVar.h();
    }

    public void l0() {
        tpi tpiVar = (tpi) this.a;
        String str = (String) this.b;
        List list = (List) tpiVar.k(str);
        if (list != null) {
            list.remove((uif) this.c);
        }
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return;
        }
        tpiVar.m(str, list);
    }

    @Override // defpackage.p7q
    public Object m(ioc iocVar) {
        iocVar.getClass();
        ((hjr) ((l6q) this.a).k.getValue()).O((hzk) this.b, iocVar);
        return Unit.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006a A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public rwj m0(rwj rwjVar) {
        boolean z;
        boolean z2;
        Bitmap.Config config = rwjVar.b;
        dq3 dq3Var = rwjVar.o;
        boolean z3 = true;
        if (!fx1.j(config) || ((nsd) this.c).n()) {
            z = false;
        } else {
            config = Bitmap.Config.ARGB_8888;
            z = true;
        }
        Bitmap.Config config2 = config;
        if (rwjVar.o.a) {
            czr czrVar = (czr) this.b;
            synchronized (czrVar) {
                czrVar.a();
                z2 = czrVar.e;
            }
            if (!z2) {
                dq3Var = dq3.DISABLED;
                return !z3 ? new rwj(rwjVar.a, config2, rwjVar.c, rwjVar.d, rwjVar.e, rwjVar.f, rwjVar.g, rwjVar.h, rwjVar.i, rwjVar.j, rwjVar.k, rwjVar.l, rwjVar.m, rwjVar.n, dq3Var) : rwjVar;
            }
        }
        z3 = z;
        if (!z3) {
        }
    }

    @Override // defpackage.p7q
    public Object n(szu szuVar) {
        szuVar.getClass();
        pvs pvsVar = (pvs) ((l6q) this.a).j.getValue();
        hzk hzkVar = (hzk) this.b;
        boolean z = ((mwk) this.c).a() != null ? !wyf.O(r1) : false;
        o oVar = (o) pvsVar.c;
        hzkVar.getClass();
        sml smlVar = pvsVar.i;
        boolean g = ((u5q) smlVar.a).b.b.g();
        boolean z2 = z && g;
        String str = "isMusic: " + z + ", isConnected: " + g;
        Throwable cause = hzkVar.getCause();
        PlayerPlaybackException playerPlaybackException = cause instanceof PlayerPlaybackException ? (PlayerPlaybackException) cause : null;
        if (playerPlaybackException instanceof h) {
            h hVar = (h) playerPlaybackException;
            if (hVar instanceof g) {
                ssg.a(6, "TrackErrorHandler", "Track fetch failed due to unauthorized access ".concat(str), playerPlaybackException);
                pvsVar.f.a();
                oVar.b();
            } else if (hVar instanceof com.yandex.music.shared.player.api.download.b) {
                ssg.a(6, "TrackErrorHandler", "Track fetch failed due to bad prepare response ".concat(str), playerPlaybackException);
                if (z2) {
                    pvsVar.O();
                } else if (z) {
                    pvsVar.P();
                } else {
                    pvsVar.F();
                }
            } else if (hVar instanceof c) {
                int i = ((c) playerPlaybackException).b;
                ssg.a(6, "TrackErrorHandler", hrg.p("Track fetch failed with prepare response code: ", i, StringUtil.SPACE, str), playerPlaybackException);
                if (i == 429) {
                    pvsVar.F();
                } else if (!z || 400 > i || i >= 500) {
                    pvsVar.F();
                } else if (((u5q) smlVar.a).b.b.g()) {
                    pvsVar.O();
                } else {
                    pvsVar.P();
                }
            } else if (hVar instanceof com.yandex.music.shared.player.api.download.d) {
                ssg.a(6, "TrackErrorHandler", "Track data loading failed due to bad response ".concat(str), playerPlaybackException);
                if (z2) {
                    pvsVar.O();
                } else {
                    pvsVar.F();
                }
            } else if (hVar instanceof e) {
                int i2 = ((e) playerPlaybackException).b;
                ssg.a(6, "TrackErrorHandler", hrg.p("Track data loading failed with response code: ", i2, StringUtil.SPACE, str), playerPlaybackException);
                if (!z || 400 > i2 || i2 >= 500) {
                    pvsVar.F();
                } else if (((u5q) smlVar.a).b.b.g()) {
                    pvsVar.O();
                } else {
                    pvsVar.F();
                }
            } else {
                if (!(hVar instanceof com.yandex.music.shared.player.api.download.f)) {
                    b6e.s();
                    return null;
                }
                boolean z3 = ((com.yandex.music.shared.player.api.download.f) playerPlaybackException).a;
                ssg.a(6, "TrackErrorHandler", "Track fetch failed due to transport error isPrepare=" + z3 + StringUtil.SPACE + str, playerPlaybackException);
                if (z2 && z3) {
                    pvsVar.F();
                } else if (!z) {
                    pvsVar.F();
                } else if (z3) {
                    pvsVar.P();
                } else {
                    pvsVar.F();
                }
            }
        } else if (playerPlaybackException instanceof com.yandex.music.shared.player.api.download.a) {
            ssg.a(6, "TrackErrorHandler", "Track fetch failed due to corrupted file ".concat(str), playerPlaybackException);
            if (z2) {
                pvsVar.O();
            } else if (z) {
                pvsVar.P();
            } else {
                pvsVar.F();
            }
        } else if (playerPlaybackException instanceof l) {
            l lVar = (l) playerPlaybackException;
            if (lVar instanceof j) {
                ssg.a(6, "TrackErrorHandler", "Track fetch failed due to storage issue ".concat(str), playerPlaybackException);
                k1l k1lVar = (k1l) pvsVar.b;
                k1lVar.getClass();
                k1lVar.a(PauseCommand.INSTANCE, a3t.a);
                ((vfb) oVar.a.getValue()).getClass();
                l18 l18Var = l18.b;
                bdt I = hag.I(Context.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                hag.x((Context) qdcVar.C(I), R.string.user_dont_have_memory, 0);
            } else {
                if (!(lVar instanceof i) && !(lVar instanceof k)) {
                    b6e.s();
                    return null;
                }
                ssg.a(6, "TrackErrorHandler", "Track fetch failed due to storage issue ".concat(str), playerPlaybackException);
                pvsVar.F();
            }
        } else if (playerPlaybackException instanceof n) {
            ssg.a(6, "TrackErrorHandler", "Track playback failed due to renderer error. ".concat(str), playerPlaybackException);
            pvsVar.F();
        } else if ((playerPlaybackException instanceof com.yandex.music.shared.player.api.download.m) || (playerPlaybackException instanceof com.yandex.music.shared.player.api.download.o)) {
            ssg.a(7, "TrackErrorHandler", "Unexpected track playback stream error. ".concat(str), playerPlaybackException);
            pvsVar.F();
        } else {
            if (playerPlaybackException != null) {
                b6e.s();
                return null;
            }
            ssg.a(6, "TrackErrorHandler", "Track error with unknown playback exception cause. ".concat(str), hzkVar);
            pvsVar.F();
        }
        return Unit.a;
    }

    @Override // defpackage.d6w
    public void o() {
        pm5 pm5Var = (pm5) this.c;
        sa7 sa7Var = (sa7) this.a;
        om3 om3Var = (om3) this.b;
        sa7Var.e(om3Var);
        if (om3Var.c == 0) {
            sa7Var.h(null);
            pm5Var.r(null);
        }
    }

    @Override // defpackage.p7q
    public Object q(y4d y4dVar) {
        y4dVar.getClass();
        ((hjr) ((l6q) this.a).k.getValue()).O((hzk) this.b, y4dVar);
        return Unit.a;
    }

    @Override // defpackage.p7q
    public Object q0(maq maqVar) {
        maqVar.getClass();
        return Unit.a;
    }

    @Override // defpackage.c1j
    public boolean r() {
        ConnectivityManager connectivityManager = (ConnectivityManager) this.a;
        for (Network network : connectivityManager.getAllNetworks()) {
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
            if (networkCapabilities != null && networkCapabilities.hasCapability(12)) {
                return true;
            }
        }
        return false;
    }

    public void s(u8c u8cVar) {
        if (((u8c) this.b) == null) {
            this.b = u8cVar;
        }
    }

    @Override // defpackage.c1j
    public void shutdown() {
        ((ConnectivityManager) this.a).unregisterNetworkCallback((xd0) this.c);
    }

    @Override // defpackage.p7q
    public Object t(t1q t1qVar) {
        t1qVar.getClass();
        return Unit.a;
    }

    @Override // defpackage.p7q
    public Object u(u7u u7uVar) {
        u7uVar.getClass();
        return Unit.a;
    }

    public void v(u8c u8cVar) {
        if (((u8c) this.a) == null) {
            this.a = u8cVar;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void w(List list, ArrayList arrayList, s63 s63Var) {
        int i;
        r0s r0sVar;
        s63 s63Var2;
        List list2;
        String str = (String) this.a;
        HashMap hashMap = (HashMap) this.c;
        int i2 = 0;
        int i3 = 0;
        for (Object obj : list) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                u75.n();
                throw null;
            }
            drf drfVar = (drf) obj;
            if (drfVar instanceof m2s) {
                m2s m2sVar = (m2s) drfVar;
                int i5 = m2sVar.b;
                String str2 = m2sVar.a.a;
                ArrayList arrayList2 = m2sVar.c;
                Pair pair = (Pair) hashMap.get(str2);
                if (pair != null) {
                    if (!Intrinsics.d(pair.a, drfVar)) {
                        pair = null;
                    }
                    if (pair != null) {
                        i = ((Number) pair.b).intValue();
                        r0sVar = (r0s) CollectionsKt.S(arrayList2, i);
                        if (r0sVar == null) {
                            r0sVar = (r0s) CollectionsKt.S(arrayList2, i2);
                        }
                        s63Var2 = new s63(drfVar, i3, str, r0sVar != null ? new t63(r0sVar.a, i, i == i5) : null);
                        if (arrayList2.size() > 1) {
                            arrayList.add(s63Var2);
                        }
                        if (r0sVar != null && (list2 = r0sVar.e) != null) {
                            w(list2, arrayList, s63Var2);
                        }
                    }
                }
                hashMap.put(str2, new Pair(drfVar, Integer.valueOf(i5)));
                i = i5;
                r0sVar = (r0s) CollectionsKt.S(arrayList2, i);
                if (r0sVar == null) {
                }
                if (r0sVar != null) {
                }
                s63Var2 = new s63(drfVar, i3, str, r0sVar != null ? new t63(r0sVar.a, i, i == i5) : null);
                if (arrayList2.size() > 1) {
                }
                if (r0sVar != null) {
                    w(list2, arrayList, s63Var2);
                }
            } else {
                arrayList.add(new s63(drfVar, i3, str, s63Var != null ? s63Var.d : null));
            }
            i3 = i4;
            i2 = 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:468:0x0d31, code lost:
    
        if ((r2 != null ? (defpackage.os7) r2.c : null) != null) goto L671;
     */
    /* JADX WARN: Code restructure failed: missing block: B:541:0x01c1, code lost:
    
        if (r8 > r14) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x067c, code lost:
    
        if (r1 == null) goto L275;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0782  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x078f  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x079f  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x07b1  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x07d0  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x07f4  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x083b  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0878  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0886  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x08bf A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x084a  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0853  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x085b  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0868  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x086d  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0862  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0858  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x084d  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x082a  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x07f9  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x07f1  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x077c  */
    /* JADX WARN: Removed duplicated region for block: B:446:0x0c82  */
    /* JADX WARN: Removed duplicated region for block: B:449:0x0c98  */
    /* JADX WARN: Removed duplicated region for block: B:452:0x0caf  */
    /* JADX WARN: Removed duplicated region for block: B:454:0x0cb5  */
    /* JADX WARN: Removed duplicated region for block: B:474:0x0d4b  */
    /* JADX WARN: Removed duplicated region for block: B:484:0x0d97 A[LOOP:5: B:420:0x0bc8->B:484:0x0d97, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:485:0x0da5 A[EDGE_INSN: B:485:0x0da5->B:486:0x0da5 BREAK  A[LOOP:5: B:420:0x0bc8->B:484:0x0d97], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:491:0x0d4d  */
    /* JADX WARN: Removed duplicated region for block: B:497:0x0cd1  */
    /* JADX WARN: Removed duplicated region for block: B:498:0x0cb2  */
    /* JADX WARN: Removed duplicated region for block: B:499:0x0ca5  */
    /* JADX WARN: Removed duplicated region for block: B:500:0x0c89  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x075d  */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v4, types: [c5b] */
    /* JADX WARN: Type inference failed for: r4v66 */
    /* JADX WARN: Type inference failed for: r4v96, types: [c5b] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SpannableStringBuilder x(e23 e23Var, TextView textView, xq9 xq9Var, String str, List list, List list2, List list3, Function1 function1, boolean z) {
        char c;
        Integer num;
        Integer num2;
        char c2;
        Integer num3;
        SpannableStringBuilder spannableStringBuilder;
        ly9 ly9Var;
        gc8 gc8Var;
        gc8 gc8Var2;
        Integer num4;
        e09 e09Var;
        ?? arrayList;
        int i;
        TreeSet treeSet;
        Integer num5;
        SpannableStringBuilder spannableStringBuilder2;
        ly9 ly9Var2;
        Integer num6;
        e09 e09Var2;
        int i2;
        Integer num7;
        Integer num8;
        zdg sbhVar;
        rtp rtpVar;
        Integer num9;
        List list4;
        Function1 function12;
        SpannableStringBuilder spannableStringBuilder3;
        int i3;
        int i4;
        es6 es6Var;
        boolean z2;
        boolean z3;
        boolean z4;
        char c3;
        String str2;
        kkk[] kkkVarArr;
        gc8 gc8Var3;
        List list5;
        String str3;
        String str4;
        os7 os7Var;
        int i5;
        int i6;
        Integer num10;
        Integer num11;
        String str5;
        Iterator it;
        cs9 cs9Var;
        Integer num12;
        Integer num13;
        int I;
        Integer num14;
        Integer num15;
        boolean z5;
        Integer num16;
        SpannableStringBuilder spannableStringBuilder4;
        z9s z9sVar;
        int i7;
        String str6;
        Integer num17;
        Double d;
        e89 e89Var;
        e89 e89Var2;
        ly9 ly9Var3;
        ky9 a;
        e09 e09Var3;
        Integer num18;
        int I2;
        Typeface e;
        rtp rtpVar2;
        zdg zdgVar;
        int i8;
        List list6;
        ly9 ly9Var4 = (ly9) this.a;
        Context context = textView.getContext();
        gc8 gc8Var4 = e23Var.a;
        gc8 gc8Var5 = e23Var.a;
        xzb xzbVar = e23Var.b;
        SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(str.length() == 0 ? "\u200b" : str);
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        long longValue = ((Number) xq9Var.v.a(xzbVar)).longValue();
        long j = longValue >> 31;
        int i9 = (j == 0 || j == -1) ? (int) longValue : longValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        jk9 jk9Var = (jk9) xq9Var.w.a(xzbVar);
        int b = eeh.b(bg3.n0(Integer.valueOf(i9), displayMetrics, jk9Var));
        szb szbVar = xq9Var.y;
        e09 e09Var4 = szbVar != null ? (e09) szbVar.a(xzbVar) : null;
        szb szbVar2 = xq9Var.z;
        if (szbVar2 != null) {
            c = 31;
            long longValue2 = ((Number) szbVar2.a(xzbVar)).longValue();
            long j2 = longValue2 >> 31;
            num = Integer.valueOf((j2 == 0 || j2 == -1) ? (int) longValue2 : longValue2 > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE);
        } else {
            c = 31;
            num = null;
        }
        szb szbVar3 = xq9Var.t;
        String str7 = szbVar3 != null ? (String) szbVar3.a(xzbVar) : null;
        szb szbVar4 = xq9Var.I;
        if (szbVar4 != null) {
            long longValue3 = ((Number) szbVar4.a(xzbVar)).longValue();
            long j3 = longValue3 >> c;
            num2 = Integer.valueOf(eeh.b(bg3.n0(Integer.valueOf((j3 == 0 || j3 == -1) ? (int) longValue3 : longValue3 > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE), displayMetrics, jk9Var)));
        } else {
            num2 = null;
        }
        z9s z9sVar2 = new z9s(str, b, i9, jk9Var, str7, e09Var4, num, num2, ((Number) xq9Var.Z.a(xzbVar)).intValue());
        e09 e09Var5 = e09Var4;
        Integer num19 = num;
        Integer num20 = num2;
        if (num20 == null && ((list6 = list) == null || list6.isEmpty())) {
            arrayList = c5b.a;
            num3 = num20;
            spannableStringBuilder = spannableStringBuilder5;
            ly9Var = ly9Var4;
            gc8Var = gc8Var4;
            gc8Var2 = gc8Var5;
            num4 = num19;
            e09Var = e09Var5;
            c2 = c;
        } else {
            int size = list != null ? list.size() : 0;
            c2 = c;
            TreeSet treeSet2 = new TreeSet();
            xz0.U(new Integer[0], treeSet2);
            ArrayList arrayList2 = new ArrayList(size + 1);
            int i10 = z9sVar2.j;
            if (list != null) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    uq9 uq9Var = (uq9) it2.next();
                    Context context2 = context;
                    gc8 gc8Var6 = gc8Var4;
                    gc8 gc8Var7 = gc8Var5;
                    long longValue4 = ((Number) uq9Var.q.a(xzbVar)).longValue();
                    long j4 = longValue4 >> c2;
                    int i11 = (j4 == 0 || j4 == -1) ? (int) longValue4 : longValue4 > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                    if (i11 > i10) {
                        i11 = i10;
                    }
                    szb szbVar5 = uq9Var.f;
                    if (szbVar5 != null) {
                        long longValue5 = ((Number) szbVar5.a(xzbVar)).longValue();
                        long j5 = longValue5 >> c2;
                        i = (j5 == 0 || j5 == -1) ? (int) longValue5 : longValue5 > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                    }
                    i = i10;
                    if (i11 < i) {
                        DisplayMetrics displayMetrics2 = context2.getResources().getDisplayMetrics();
                        int i12 = i11;
                        szb szbVar6 = uq9Var.i;
                        int i13 = i;
                        szb szbVar7 = uq9Var.u;
                        if (szbVar6 != null) {
                            num5 = num20;
                            long longValue6 = ((Number) szbVar6.a(xzbVar)).longValue();
                            long j6 = longValue6 >> c2;
                            num7 = Integer.valueOf((j6 == 0 || j6 == -1) ? (int) longValue6 : longValue6 > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE);
                        } else {
                            num5 = num20;
                            num7 = null;
                        }
                        jk9 jk9Var2 = (jk9) uq9Var.j.a(xzbVar);
                        i2 = i10;
                        szb szbVar8 = uq9Var.b;
                        yq9 yq9Var = szbVar8 != null ? (yq9) szbVar8.a(xzbVar) : null;
                        int b2 = eeh.b(bg3.n0((Number) uq9Var.d.a(xzbVar), displayMetrics2, jk9Var2));
                        szb szbVar9 = uq9Var.g;
                        String str8 = szbVar9 != null ? (String) szbVar9.a(xzbVar) : null;
                        szb szbVar10 = uq9Var.h;
                        String str9 = szbVar10 != null ? (String) szbVar10.a(xzbVar) : null;
                        Integer valueOf = num7 != null ? Integer.valueOf(eeh.b(bg3.n0(num7, displayMetrics2, jk9Var2))) : null;
                        szb szbVar11 = uq9Var.l;
                        e09 e09Var6 = szbVar11 != null ? (e09) szbVar11.a(xzbVar) : null;
                        szb szbVar12 = uq9Var.m;
                        if (szbVar12 != null) {
                            num6 = num19;
                            e09Var2 = e09Var5;
                            long longValue7 = ((Number) szbVar12.a(xzbVar)).longValue();
                            long j7 = longValue7 >> c2;
                            num8 = Integer.valueOf((j7 == 0 || j7 == -1) ? (int) longValue7 : longValue7 > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE);
                        } else {
                            num6 = num19;
                            e09Var2 = e09Var5;
                            num8 = null;
                        }
                        szb szbVar13 = uq9Var.k;
                        JSONObject jSONObject = szbVar13 != null ? (JSONObject) szbVar13.a(xzbVar) : null;
                        szb szbVar14 = uq9Var.n;
                        Double valueOf2 = szbVar14 != null ? Double.valueOf(((Number) szbVar14.a(xzbVar)).doubleValue() / (num7 != null ? num7.intValue() : z9sVar2.c)) : null;
                        szb szbVar15 = uq9Var.o;
                        Integer valueOf3 = szbVar15 != null ? Integer.valueOf(bg3.m0(Long.valueOf(((Number) szbVar15.a(xzbVar)).longValue()), displayMetrics2, jk9Var2)) : null;
                        ts9 ts9Var = uq9Var.p;
                        if (ts9Var == null) {
                            spannableStringBuilder2 = spannableStringBuilder5;
                            ly9Var2 = ly9Var4;
                            sbhVar = null;
                        } else {
                            DisplayMetrics displayMetrics3 = context2.getResources().getDisplayMetrics();
                            if (ts9Var instanceof rs9) {
                                ct9 ct9Var = ((rs9) ts9Var).b;
                                jz8 jz8Var = ct9Var.e;
                                spannableStringBuilder2 = spannableStringBuilder5;
                                ly9Var2 = ly9Var4;
                                sbhVar = new rbh(((Number) ct9Var.a.a(xzbVar)).intValue(), (float) ((Number) ct9Var.b.a(xzbVar)).doubleValue(), ((Boolean) ct9Var.c.a(xzbVar)).booleanValue(), ((Boolean) ct9Var.d.a(xzbVar)).booleanValue(), bg3.n0(Long.valueOf(((Number) jz8Var.b.a(xzbVar)).longValue()), displayMetrics3, (jk9) jz8Var.a.a(xzbVar)));
                            } else {
                                spannableStringBuilder2 = spannableStringBuilder5;
                                ly9Var2 = ly9Var4;
                                if (!(ts9Var instanceof ss9)) {
                                    b6e.s();
                                    return null;
                                }
                                it9 it9Var = ((ss9) ts9Var).b;
                                sbhVar = new sbh(((Number) it9Var.a.a(xzbVar)).intValue(), ((Boolean) it9Var.b.a(xzbVar)).booleanValue());
                            }
                        }
                        szb szbVar16 = uq9Var.r;
                        e89 e89Var3 = szbVar16 != null ? (e89) szbVar16.a(xzbVar) : null;
                        szb szbVar17 = uq9Var.s;
                        Integer num21 = szbVar17 != null ? (Integer) szbVar17.a(xzbVar) : null;
                        dj9 dj9Var = uq9Var.t;
                        if (dj9Var == null) {
                            treeSet = treeSet2;
                            rtpVar = null;
                        } else {
                            bf9 bf9Var = dj9Var.d;
                            DisplayMetrics displayMetrics4 = context2.getResources().getDisplayMetrics();
                            int i14 = z9sVar2.i >>> 24;
                            float y = bg3.y((Number) dj9Var.b.a(xzbVar), displayMetrics4);
                            float f0 = bg3.f0(bf9Var.a, displayMetrics4, xzbVar);
                            float f02 = bg3.f0(bf9Var.b, displayMetrics4, xzbVar);
                            Paint paint = (Paint) this.c;
                            paint.setColor(((Number) dj9Var.c.a(xzbVar)).intValue());
                            double doubleValue = ((Number) dj9Var.a.a(xzbVar)).doubleValue();
                            treeSet = treeSet2;
                            paint.setAlpha((int) (i14 * doubleValue));
                            rtpVar = new rtp(f0, f02, y, paint.getColor());
                        }
                        if (szbVar7 != null) {
                            long longValue8 = ((Number) szbVar7.a(xzbVar)).longValue();
                            long j8 = longValue8 >> c2;
                            num9 = Integer.valueOf(eeh.b(bg3.n0(Integer.valueOf((j8 == 0 || j8 == -1) ? (int) longValue8 : longValue8 > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE), displayMetrics2, jk9Var2)));
                        } else {
                            num9 = null;
                        }
                        Integer valueOf4 = szbVar7 != null ? Integer.valueOf(i12) : null;
                        Integer valueOf5 = szbVar7 != null ? Integer.valueOf(i13) : null;
                        szb szbVar18 = uq9Var.v;
                        e89 e89Var4 = szbVar18 != null ? (e89) szbVar18.a(xzbVar) : null;
                        b4r b4rVar = new b4r(i12, i13, yq9Var, b2, str8, str9, valueOf, jk9Var2, e09Var6, num8, jSONObject, valueOf2, valueOf3, sbhVar, e89Var3, num21, rtpVar, num9, valueOf4, valueOf5, e89Var4);
                        e89 e89Var5 = e89Var4;
                        if (yq9Var != null || b2 != 0 || str8 != null || str9 != null || valueOf != null || jk9Var2 != b4r.v || e09Var6 != null || num8 != null || valueOf2 != null || valueOf3 != null || sbhVar != null || e89Var3 != null || num21 != null || rtpVar != null || num9 != null || valueOf4 != null || valueOf5 != null || e89Var5 != null) {
                            treeSet.add(Integer.valueOf(i12));
                            treeSet.add(Integer.valueOf(i13));
                            arrayList2.add(b4rVar);
                        }
                    } else {
                        treeSet = treeSet2;
                        num5 = num20;
                        spannableStringBuilder2 = spannableStringBuilder5;
                        ly9Var2 = ly9Var4;
                        num6 = num19;
                        e09Var2 = e09Var5;
                        i2 = i10;
                    }
                    treeSet2 = treeSet;
                    context = context2;
                    gc8Var4 = gc8Var6;
                    gc8Var5 = gc8Var7;
                    num20 = num5;
                    i10 = i2;
                    e09Var5 = e09Var2;
                    num19 = num6;
                    ly9Var4 = ly9Var2;
                    spannableStringBuilder5 = spannableStringBuilder2;
                }
            }
            TreeSet treeSet3 = treeSet2;
            num3 = num20;
            spannableStringBuilder = spannableStringBuilder5;
            ly9Var = ly9Var4;
            gc8Var = gc8Var4;
            gc8Var2 = gc8Var5;
            num4 = num19;
            e09Var = e09Var5;
            int i15 = i10;
            y75.r(arrayList2);
            if (num3 != null) {
                int intValue = num3.intValue();
                treeSet3.add(0);
                treeSet3.add(Integer.valueOf(i15));
                arrayList2.add(0, new b4r(0, i15, null, 0, null, null, null, b4r.v, null, null, null, null, Integer.valueOf(intValue), null, null, null, null, null, null, null, null));
            }
            if (arrayList2.isEmpty()) {
                arrayList = c5b.a;
            } else {
                List w0 = CollectionsKt.w0(treeSet3);
                arrayList = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                int intValue2 = ((Number) CollectionsKt.Q(w0)).intValue();
                if (w0.size() == 1) {
                    b4r b4rVar2 = new b4r(intValue2, intValue2, null, 0, null, null, null, b4r.v, null, null, null, null, null, null, null, null, null, null, null, null, null);
                    Iterator it3 = arrayList2.iterator();
                    b4r b4rVar3 = b4rVar2;
                    while (it3.hasNext()) {
                        b4rVar3 = b4rVar3.a((b4r) it3.next(), intValue2, intValue2);
                    }
                    arrayList.add(b4rVar3);
                } else {
                    int size2 = w0.size();
                    int i16 = 1;
                    while (i16 < size2) {
                        int intValue3 = ((Number) w0.get(i16)).intValue();
                        int size3 = arrayList2.size();
                        for (int i17 = 0; i17 < size3; i17++) {
                            b4r b4rVar4 = (b4r) arrayList2.get(i17);
                            int i18 = b4rVar4.a;
                            if (intValue3 < i18) {
                                break;
                            }
                            if (intValue3 > i18 && intValue3 <= b4rVar4.b) {
                                arrayList3.add(b4rVar4);
                            }
                        }
                        if (!arrayList3.isEmpty()) {
                            b4r b4rVar5 = new b4r(intValue2, intValue3, null, 0, null, null, null, b4r.v, null, null, null, null, null, null, null, null, null, null, null, null, null);
                            int i19 = intValue2;
                            Iterator it4 = arrayList3.iterator();
                            b4r b4rVar6 = b4rVar5;
                            while (it4.hasNext()) {
                                b4rVar6 = b4rVar6.a((b4r) it4.next(), i19, intValue3);
                            }
                            arrayList.add(b4rVar6);
                        }
                        arrayList3.clear();
                        i16++;
                        intValue2 = intValue3;
                    }
                }
            }
        }
        int i20 = z9sVar2.j;
        if (list2 != null) {
            ArrayList arrayList4 = new ArrayList();
            for (Object obj : list2) {
                if (((Number) ((tq9) obj).f.a(xzbVar)).longValue() <= i20) {
                    arrayList4.add(obj);
                }
            }
            list4 = CollectionsKt.o0(arrayList4, new g4r(this, z9sVar2, xzbVar));
        }
        list4 = c5b.a;
        TextView textView2 = textView;
        List list7 = list4;
        boolean z6 = textView2 instanceof d89;
        d89 d89Var = z6 ? (d89) textView2 : null;
        char c4 = 65535;
        if (d89Var != null) {
            d89Var.w.clear();
            d89Var.x.clear();
            pj4 pj4Var = d89Var.y;
            if (pj4Var != null) {
                pj4Var.q(-1, 1);
            }
            d89Var.q();
            st9 textRoundedBgHelper$div_release = d89Var.getTextRoundedBgHelper$div_release();
            if (textRoundedBgHelper$div_release != null) {
                if (z) {
                    textRoundedBgHelper$div_release.d.clear();
                } else {
                    textRoundedBgHelper$div_release.c.clear();
                }
            }
        }
        Iterator it5 = ((Iterable) arrayList).iterator();
        while (it5.hasNext()) {
            b4r b4rVar7 = (b4r) it5.next();
            int i21 = b4rVar7.a;
            Integer num22 = b4rVar7.r;
            char c5 = c4;
            e09 e09Var7 = b4rVar7.i;
            String str10 = b4rVar7.e;
            Integer num23 = b4rVar7.g;
            Integer num24 = b4rVar7.j;
            Integer num25 = b4rVar7.m;
            Iterator it6 = it5;
            int i22 = b4rVar7.b;
            if (i21 > i22) {
                z5 = z6;
                z9sVar = z9sVar2;
                e09Var3 = e09Var;
                num18 = num4;
                ly9Var3 = ly9Var;
                spannableStringBuilder4 = spannableStringBuilder;
            } else {
                yq9 yq9Var2 = b4rVar7.c;
                yq9 yq9Var3 = yq9.BASELINE;
                z5 = z6;
                yq9 yq9Var4 = yq9Var2 == null ? yq9Var3 : yq9Var2;
                int i23 = b4rVar7.d;
                if (i23 != 0) {
                    if (num25 != null) {
                        i8 = num25.intValue();
                    } else if (num3 != null) {
                        i8 = num3.intValue();
                    } else {
                        num16 = num23;
                        i8 = 0;
                        xu2 xu2Var = new xu2(i23, i8, 0);
                        spannableStringBuilder4 = spannableStringBuilder;
                        spannableStringBuilder4.setSpan(xu2Var, i21, i22, 33);
                    }
                    num16 = num23;
                    xu2 xu2Var2 = new xu2(i23, i8, 0);
                    spannableStringBuilder4 = spannableStringBuilder;
                    spannableStringBuilder4.setSpan(xu2Var2, i21, i22, 33);
                } else {
                    num16 = num23;
                    spannableStringBuilder4 = spannableStringBuilder;
                    if (yq9Var4 != yq9Var3) {
                        int intValue4 = num16 != null ? num16.intValue() : 0;
                        int ordinal = yq9Var4.ordinal();
                        z9sVar = z9sVar2;
                        spannableStringBuilder4.setSpan(new b1u(intValue4, ordinal != 0 ? ordinal != 1 ? ordinal != 2 ? 3 : 4 : 2 : 1, new en9(2, textView2)), i21, i22, 33);
                        if (num16 == null) {
                            i7 = 33;
                            spannableStringBuilder4.setSpan(new xu2(num16.intValue(), num25 != null ? num25.intValue() : num3 != null ? num3.intValue() : 0, 1), i21, i22, 33);
                        } else {
                            i7 = 33;
                        }
                        str6 = b4rVar7.f;
                        if (str6 != null) {
                            spannableStringBuilder4.setSpan(new upc(str6, 0), i21, i22, i7);
                        }
                        num17 = b4rVar7.p;
                        if (num17 != null) {
                            spannableStringBuilder4.setSpan(new TextColorSpan(num17.intValue()), i21, i22, i7);
                        }
                        d = b4rVar7.l;
                        if (d != null) {
                            spannableStringBuilder4.setSpan(new yu2(1, (float) d.doubleValue()), i21, i22, i7);
                        }
                        e89Var = b4rVar7.o;
                        if (e89Var != null) {
                            int ordinal2 = e89Var.ordinal();
                            if (ordinal2 == 0) {
                                spannableStringBuilder4.setSpan(new NoStrikethroughSpan(), i21, i22, i7);
                            } else if (ordinal2 == 1) {
                                spannableStringBuilder4.setSpan(new StrikethroughSpan(), i21, i22, i7);
                            }
                        }
                        e89Var2 = b4rVar7.u;
                        if (e89Var2 != null) {
                            int ordinal3 = e89Var2.ordinal();
                            if (ordinal3 == 0) {
                                spannableStringBuilder4.setSpan(new NoUnderlineSpan(), i21, i22, 33);
                            } else if (ordinal3 == 1) {
                                spannableStringBuilder4.setSpan(new UnderlineSpan(), i21, i22, 33);
                            }
                        }
                        ly9Var3 = ly9Var;
                        a = ly9Var3.a(str10 != null ? str7 : str10);
                        if (str10 != null && e09Var7 == null && num24 == null) {
                            e09Var3 = e09Var;
                            num18 = num4;
                        } else {
                            if (e09Var7 == null || num24 != null) {
                                e09Var3 = e09Var;
                                num18 = num4;
                                I2 = tt0.I(e09Var7, num24);
                            } else {
                                e09Var3 = e09Var;
                                num18 = num4;
                                I2 = tt0.I(e09Var3, num18);
                            }
                            e = a.e(I2);
                            if (e == null) {
                                e = Typeface.DEFAULT;
                            }
                            spannableStringBuilder4.setSpan(new pdt(e, 0), i21, i22, 33);
                        }
                        if (woe.m()) {
                            a.getClass();
                        }
                        if (num25 == null || num22 != null) {
                            Integer num26 = num3;
                            int i24 = !Intrinsics.d(num25, num26) ? 18 : 33;
                            int intValue5 = num22 == null ? num22.intValue() : 0;
                            int intValue6 = num25 == null ? num25.intValue() : 0;
                            num3 = num26;
                            Integer num27 = b4rVar7.s;
                            spannableStringBuilder4.setSpan(new j6g(intValue5, intValue6, num27 == null ? num27.intValue() : i21), i21, i22, i24);
                        }
                        rtpVar2 = b4rVar7.q;
                        if (rtpVar2 != null) {
                            spannableStringBuilder4.setSpan(new ttp(rtpVar2), i21, i22, 33);
                        }
                        zdgVar = b4rVar7.n;
                        if (zdgVar != null) {
                            if (zdgVar instanceof rbh) {
                                if (((rbh) zdgVar).e) {
                                    spannableStringBuilder4.setSpan(new ubh(zdgVar, z5 ? (d89) textView2 : null), i21, i22, 33);
                                }
                            } else if ((zdgVar instanceof sbh) && ((sbh) zdgVar).c) {
                                spannableStringBuilder4.setSpan(new ubh(zdgVar, z5 ? (d89) textView2 : null), i21, i22, 33);
                            }
                        }
                    }
                }
                z9sVar = z9sVar2;
                if (num16 == null) {
                }
                str6 = b4rVar7.f;
                if (str6 != null) {
                }
                num17 = b4rVar7.p;
                if (num17 != null) {
                }
                d = b4rVar7.l;
                if (d != null) {
                }
                e89Var = b4rVar7.o;
                if (e89Var != null) {
                }
                e89Var2 = b4rVar7.u;
                if (e89Var2 != null) {
                }
                ly9Var3 = ly9Var;
                a = ly9Var3.a(str10 != null ? str7 : str10);
                if (str10 != null) {
                }
                if (e09Var7 == null) {
                }
                e09Var3 = e09Var;
                num18 = num4;
                I2 = tt0.I(e09Var7, num24);
                e = a.e(I2);
                if (e == null) {
                }
                spannableStringBuilder4.setSpan(new pdt(e, 0), i21, i22, 33);
                if (woe.m()) {
                }
                if (num25 == null) {
                }
                Integer num262 = num3;
                if (!Intrinsics.d(num25, num262)) {
                }
                if (num22 == null) {
                }
                if (num25 == null) {
                }
                num3 = num262;
                Integer num272 = b4rVar7.s;
                spannableStringBuilder4.setSpan(new j6g(intValue5, intValue6, num272 == null ? num272.intValue() : i21), i21, i22, i24);
                rtpVar2 = b4rVar7.q;
                if (rtpVar2 != null) {
                }
                zdgVar = b4rVar7.n;
                if (zdgVar != null) {
                }
            }
            c4 = c5;
            ly9Var = ly9Var3;
            spannableStringBuilder = spannableStringBuilder4;
            num4 = num18;
            e09Var = e09Var3;
            it5 = it6;
            z6 = z5;
            z9sVar2 = z9sVar;
        }
        boolean z7 = z6;
        z9s z9sVar3 = z9sVar2;
        e09 e09Var8 = e09Var;
        Integer num28 = num4;
        ly9 ly9Var5 = ly9Var;
        SpannableStringBuilder spannableStringBuilder6 = spannableStringBuilder;
        if (list != null) {
            List<uq9> list8 = list;
            if (!(list8 instanceof Collection) || !list8.isEmpty()) {
                for (uq9 uq9Var2 : list8) {
                    if (uq9Var2.a != null || uq9Var2.c != null || uq9Var2.e != null) {
                        Iterator it7 = list8.iterator();
                        while (it7.hasNext()) {
                            uq9 uq9Var3 = (uq9) it7.next();
                            long longValue9 = ((Number) uq9Var3.q.a(xzbVar)).longValue();
                            long j9 = longValue9 >> c2;
                            int i25 = (j9 == 0 || j9 == -1) ? (int) longValue9 : longValue9 > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                            int i26 = i25 > i20 ? i20 : i25;
                            szb szbVar19 = uq9Var3.f;
                            if (szbVar19 != null) {
                                i5 = i20;
                                long longValue10 = ((Number) szbVar19.a(xzbVar)).longValue();
                                long j10 = longValue10 >> c2;
                                int i27 = (j10 == 0 || j10 == -1) ? (int) longValue10 : longValue10 > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                                if (i27 > i5) {
                                    i27 = i5;
                                }
                                i6 = i27;
                            } else {
                                i5 = i20;
                                i6 = i5;
                            }
                            SpannableStringBuilder spannableStringBuilder7 = spannableStringBuilder6;
                            g(e23Var, textView2, spannableStringBuilder7, i26, i6, uq9Var3.a);
                            js9 js9Var = uq9Var3.e;
                            cs9 cs9Var2 = uq9Var3.c;
                            if (js9Var == null && cs9Var2 == null) {
                                it = it7;
                                num14 = num28;
                            } else {
                                DisplayMetrics displayMetrics5 = textView.getContext().getResources().getDisplayMetrics();
                                szb szbVar20 = uq9Var3.i;
                                if (szbVar20 != null) {
                                    num10 = num28;
                                    long longValue11 = ((Number) szbVar20.a(xzbVar)).longValue();
                                    long j11 = longValue11 >> c2;
                                    num11 = Integer.valueOf((j11 == 0 || j11 == -1) ? (int) longValue11 : longValue11 > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE);
                                } else {
                                    num10 = num28;
                                    num11 = null;
                                }
                                jk9 jk9Var3 = (jk9) uq9Var3.j.a(xzbVar);
                                szb szbVar21 = uq9Var3.g;
                                if (szbVar21 == null || (str5 = (String) szbVar21.a(xzbVar)) == null) {
                                    str5 = str7;
                                }
                                ky9 a2 = ly9Var5.a(str5);
                                it = it7;
                                szb szbVar22 = uq9Var3.l;
                                e09 e09Var9 = szbVar22 != null ? (e09) szbVar22.a(xzbVar) : null;
                                szb szbVar23 = uq9Var3.m;
                                if (szbVar23 != null) {
                                    cs9Var = cs9Var2;
                                    long longValue12 = ((Number) szbVar23.a(xzbVar)).longValue();
                                    long j12 = longValue12 >> c2;
                                    num12 = Integer.valueOf((j12 == 0 || j12 == -1) ? (int) longValue12 : longValue12 > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE);
                                } else {
                                    cs9Var = cs9Var2;
                                    num12 = null;
                                }
                                if (e09Var9 == null && num12 == null) {
                                    num13 = num10;
                                    I = tt0.I(e09Var8, num13);
                                } else {
                                    num13 = num10;
                                    I = tt0.I(e09Var9, num12);
                                }
                                szb szbVar24 = uq9Var3.k;
                                if (szbVar24 != null) {
                                }
                                a2.getClass();
                                int b3 = eeh.b(bg3.n0((Number) uq9Var3.d.a(xzbVar), displayMetrics5, jk9Var3));
                                szb szbVar25 = uq9Var3.b;
                                yq9 yq9Var5 = szbVar25 != null ? (yq9) szbVar25.a(xzbVar) : null;
                                szb szbVar26 = uq9Var3.o;
                                Integer valueOf6 = szbVar26 != null ? Integer.valueOf(bg3.m0(Long.valueOf(((Number) szbVar26.a(xzbVar)).longValue()), displayMetrics5, jk9Var3)) : null;
                                Integer valueOf7 = num11 != null ? Integer.valueOf(eeh.b(bg3.n0(num11, displayMetrics5, jk9Var3))) : null;
                                szb szbVar27 = uq9Var3.u;
                                if (szbVar27 != null) {
                                    num14 = num13;
                                    long longValue13 = ((Number) szbVar27.a(xzbVar)).longValue();
                                    long j13 = longValue13 >> c2;
                                    num15 = Integer.valueOf(eeh.b(bg3.n0(Integer.valueOf((j13 == 0 || j13 == -1) ? (int) longValue13 : longValue13 > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE), displayMetrics5, jk9Var3)));
                                } else {
                                    num14 = num13;
                                    num15 = null;
                                }
                                Typeface e2 = a2.e(I);
                                if (e2 == null) {
                                    e2 = Typeface.DEFAULT;
                                }
                                Typeface typeface = e2;
                                szb szbVar28 = uq9Var3.h;
                                DivBackgroundSpan divBackgroundSpan = new DivBackgroundSpan(js9Var, cs9Var, b3, yq9Var5, valueOf6, valueOf7, num15, typeface, szbVar28 != null ? (String) szbVar28.a(xzbVar) : null);
                                if (z7) {
                                    d89 d89Var2 = (d89) textView;
                                    if (d89Var2.getTextRoundedBgHelper$div_release() == null) {
                                        d89Var2.setTextRoundedBgHelper$div_release(new st9(d89Var2, xzbVar));
                                    } else {
                                        st9 textRoundedBgHelper$div_release2 = d89Var2.getTextRoundedBgHelper$div_release();
                                        textRoundedBgHelper$div_release2.getClass();
                                        ArrayList arrayList5 = textRoundedBgHelper$div_release2.c;
                                        if (arrayList5 == null || !arrayList5.isEmpty()) {
                                            Iterator it8 = arrayList5.iterator();
                                            while (it8.hasNext()) {
                                                DivBackgroundSpan divBackgroundSpan2 = (DivBackgroundSpan) it8.next();
                                                if (!Intrinsics.d(divBackgroundSpan2.a, divBackgroundSpan.a) || !Intrinsics.d(divBackgroundSpan2.b, divBackgroundSpan.b) || divBackgroundSpan2.c != divBackgroundSpan.c || divBackgroundSpan2.d != divBackgroundSpan.d || !Intrinsics.d(divBackgroundSpan2.e, divBackgroundSpan.e) || !Intrinsics.d(divBackgroundSpan2.f, divBackgroundSpan.f) || !Intrinsics.d(divBackgroundSpan2.g, divBackgroundSpan.g) || !Intrinsics.d(divBackgroundSpan2.h, divBackgroundSpan.h) || !Intrinsics.d(divBackgroundSpan2.i, divBackgroundSpan.i) || i6 != spannableStringBuilder7.getSpanEnd(divBackgroundSpan2) || i26 != spannableStringBuilder7.getSpanStart(divBackgroundSpan2)) {
                                                }
                                            }
                                        }
                                    }
                                    spannableStringBuilder7.setSpan(divBackgroundSpan, i26, i6, 33);
                                    st9 textRoundedBgHelper$div_release3 = d89Var2.getTextRoundedBgHelper$div_release();
                                    if (textRoundedBgHelper$div_release3 != null) {
                                        if (z) {
                                            textRoundedBgHelper$div_release3.d.add(divBackgroundSpan);
                                        } else {
                                            textRoundedBgHelper$div_release3.c.add(divBackgroundSpan);
                                        }
                                    }
                                }
                            }
                            textView2 = textView;
                            it7 = it;
                            spannableStringBuilder6 = spannableStringBuilder7;
                            i20 = i5;
                            num28 = num14;
                        }
                    }
                }
            }
        }
        int i28 = i20;
        SpannableStringBuilder spannableStringBuilder8 = spannableStringBuilder6;
        g(e23Var, textView, spannableStringBuilder8, 0, spannableStringBuilder8.length(), list3);
        SpannableStringBuilder spannableStringBuilder9 = spannableStringBuilder8;
        int size4 = list7.size() - 1;
        if (size4 >= 0) {
            while (true) {
                int i29 = size4 - 1;
                tq9 tq9Var = (tq9) list7.get(size4);
                int R = R(i28, tq9Var, xzbVar);
                int R2 = size4 > 0 ? R(i28, (tq9) list7.get(size4 - 1), xzbVar) : Integer.MIN_VALUE;
                spannableStringBuilder9.insert(R, (CharSequence) "#");
                DisplayMetrics displayMetrics6 = textView.getResources().getDisplayMetrics();
                int R3 = R(i28, tq9Var, xzbVar);
                int g0 = bg3.g0(tq9Var.j, displayMetrics6, xzbVar);
                int g02 = bg3.g0(tq9Var.c, displayMetrics6, xzbVar);
                z9s z9sVar4 = z9sVar3;
                Integer num29 = z9sVar4.h;
                int intValue7 = num29 != null ? num29.intValue() : 0;
                int ordinal4 = ((yq9) tq9Var.b.a(xzbVar)).ordinal();
                int i30 = ordinal4 != 0 ? ordinal4 != 1 ? ordinal4 != 2 ? 3 : 4 : 2 : 1;
                rq9 rq9Var = tq9Var.a;
                if (rq9Var != null) {
                    int ordinal5 = rq9Var.b.ordinal();
                    if (ordinal5 != 0) {
                        if (ordinal5 == 1) {
                            c3 = 4;
                            str2 = ern.a(Button.class).f();
                        } else if (ordinal5 == 2) {
                            c3 = 4;
                            str2 = ern.a(ImageView.class).f();
                        } else if (ordinal5 != 3) {
                            c3 = 4;
                            if (ordinal5 == 4) {
                                str2 = ern.a(ImageView.class).f();
                            }
                        } else {
                            c3 = 4;
                            str2 = ern.a(TextView.class).f();
                        }
                        szb szbVar29 = rq9Var.a;
                        String str11 = szbVar29 == null ? (String) szbVar29.a(xzbVar) : null;
                        kkkVarArr = (kkk[]) spannableStringBuilder9.getSpans(R3, R3 + 1, kkk.class);
                        if (kkkVarArr.length <= 1) {
                            gc8Var3 = gc8Var2;
                            wdp.n0(gc8Var3, new Throwable("Two or more clickable ranges intersect."));
                        } else {
                            gc8Var3 = gc8Var2;
                        }
                        kkk kkkVar = (kkk) xz0.z(kkkVarArr);
                        list5 = kkkVar == null ? kkkVar.b : null;
                        if (list5 == null) {
                            i3 = R2;
                            str3 = str2;
                            gc8 gc8Var8 = gc8Var3;
                            i4 = i29;
                            str4 = str11;
                            os7Var = new os7(gc8Var8, e23Var, textView, list5, 2);
                            gc8Var2 = gc8Var8;
                        } else {
                            i3 = R2;
                            str3 = str2;
                            gc8Var2 = gc8Var3;
                            i4 = i29;
                            str4 = str11;
                            os7Var = null;
                        }
                        es6Var = new es6(str3, str4, os7Var);
                    } else {
                        c3 = 4;
                    }
                    str2 = null;
                    szb szbVar292 = rq9Var.a;
                    if (szbVar292 == null) {
                    }
                    kkkVarArr = (kkk[]) spannableStringBuilder9.getSpans(R3, R3 + 1, kkk.class);
                    if (kkkVarArr.length <= 1) {
                    }
                    kkk kkkVar2 = (kkk) xz0.z(kkkVarArr);
                    if (kkkVar2 == null) {
                    }
                    if (list5 == null) {
                    }
                    es6Var = new es6(str3, str4, os7Var);
                } else {
                    i3 = R2;
                    i4 = i29;
                    es6Var = null;
                }
                uce uceVar = new uce(g0, g02, intValue7, i30, es6Var);
                spannableStringBuilder9.setSpan(uceVar, R3, R3 + 1, 33);
                d89 d89Var3 = z7 ? (d89) textView : null;
                if (d89Var3 != null) {
                    ArrayList arrayList6 = d89Var3.w;
                    if (Intrinsics.d(zb.b, Boolean.TRUE)) {
                        d89Var3.x.add(uceVar);
                        es6 es6Var2 = uceVar.e;
                        if ((es6Var2 != null ? (String) es6Var2.b : null) == null) {
                        }
                        arrayList6.add(uceVar);
                        pj4 pj4Var2 = d89Var3.y;
                        if (pj4Var2 != null) {
                            z3 = true;
                            z2 = false;
                            pj4Var2.q(arrayList6.size() - 1, 0);
                            z4 = i3 + 1 != R ? z3 : z2;
                            boolean z8 = (R > 0 || CharsKt.d(spannableStringBuilder9.charAt(R + (-1)))) ? z2 : z3;
                            if (!z4 && z8) {
                                spannableStringBuilder9.insert(R, (CharSequence) "\u2060");
                            }
                            function12 = function1;
                            SpannableStringBuilder spannableStringBuilder10 = spannableStringBuilder9;
                            spannableStringBuilder3 = spannableStringBuilder10;
                            gc8 gc8Var9 = gc8Var;
                            gc8Var9.p(((a39) this.b).b(((Uri) tq9Var.i.a(xzbVar)).toString(), new r29(e23Var, tq9Var, uceVar, spannableStringBuilder10, function12)));
                            if (i4 >= 0) {
                                break;
                            }
                            size4 = i4;
                            gc8Var = gc8Var9;
                            spannableStringBuilder9 = spannableStringBuilder3;
                            z9sVar3 = z9sVar4;
                        }
                    }
                }
                z2 = false;
                z3 = true;
                if (i3 + 1 != R) {
                }
                if (R > 0) {
                }
                if (!z4) {
                    spannableStringBuilder9.insert(R, (CharSequence) "\u2060");
                }
                function12 = function1;
                SpannableStringBuilder spannableStringBuilder102 = spannableStringBuilder9;
                spannableStringBuilder3 = spannableStringBuilder102;
                gc8 gc8Var92 = gc8Var;
                gc8Var92.p(((a39) this.b).b(((Uri) tq9Var.i.a(xzbVar)).toString(), new r29(e23Var, tq9Var, uceVar, spannableStringBuilder102, function12)));
                if (i4 >= 0) {
                }
            }
        } else {
            function12 = function1;
            spannableStringBuilder3 = spannableStringBuilder9;
        }
        if (function12 != null) {
            function12.invoke(spannableStringBuilder3);
        }
        return spannableStringBuilder3;
    }

    public Object y(int i) {
        for (an6 an6Var : (List) this.b) {
            if (i < an6Var.a()) {
                return (qon) an6Var.c.b;
            }
            i -= an6Var.a();
        }
        xq0.q(k5r.i(i, "Could not calculate space position for position: "));
        return null;
    }

    public int z(int i) {
        for (an6 an6Var : (List) this.b) {
            if (i < an6Var.a()) {
                return i;
            }
            i -= an6Var.a();
        }
        xq0.q(k5r.i(i, "Could not calculate space position for position: "));
        return 0;
    }

    @Override // defpackage.pwq
    public void a(int i) {
    }

    @Override // defpackage.pwq
    public void b(ArrayList arrayList) {
    }

    @Override // defpackage.pwq
    public void l(int i) {
    }

    @Override // defpackage.pwq
    public void p(int i) {
    }

    public /* synthetic */ lum(Object obj, Object obj2, Object obj3) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public lum(Window window, String str) {
        window.getClass();
        str.getClass();
        this.a = str;
        this.b = new nmc();
        w1f w1fVar = new w1f(window, new h5n(9, this));
        this.c = w1fVar;
        ((y1f) w1fVar.c).f(false);
    }

    public lum(String str, List list) {
        str.getClass();
        list.getClass();
        this.a = str;
        this.b = list;
        this.c = new HashMap();
    }

    public lum(qbo qboVar, obo oboVar, obo oboVar2) {
        qboVar.getClass();
        this.a = qboVar;
        this.b = oboVar;
        this.c = oboVar2;
    }

    public lum(Context context) {
        context.getClass();
        this.a = context;
        this.b = l18.b.b(hag.I(z66.class), true);
        this.c = btf.b(new b6n(4, this));
    }

    public lum(Context context, TypedArray typedArray) {
        this.a = context;
        this.b = typedArray;
    }

    public lum(ConnectivityManager connectivityManager, czr czrVar) {
        this.a = connectivityManager;
        this.b = czrVar;
        xd0 xd0Var = new xd0(4, this);
        this.c = xd0Var;
        connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().addCapability(12).build(), xd0Var);
    }

    public lum(odt odtVar, lum lumVar) {
        this.a = odtVar;
        this.b = lumVar;
        this.c = odtVar.getValue();
    }

    public lum(sbp sbpVar, w7o w7oVar, jg3 jg3Var) {
        this.c = sbpVar;
        this.a = w7oVar;
        this.b = jg3Var;
    }
}
