package defpackage;

import android.content.res.Configuration;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.b;
import androidx.compose.foundation.layout.d;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.a;
import androidx.media3.exoplayer.ExoPlayer;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import java.util.regex.Matcher;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.c;
import ru.yandex.music.R;

/* loaded from: classes5.dex */
public abstract class q5g {
    public static final long A(ffm ffmVar) {
        long y = y(ffmVar, true);
        if (enj.c(y, 9205357640488583168L)) {
            return 0L;
        }
        return enj.g(y, y(ffmVar, false));
    }

    public static final void B(int i) {
        if (i >= 1) {
            return;
        }
        xq0.o(k5r.i(i, "Expected positive parallelism level, but got "));
    }

    public static twh C(String str) {
        str.getClass();
        Matcher matcher = twh.e.matcher(str);
        if (!matcher.lookingAt()) {
            xq0.o(ouj.k('\"', "No subtype found for: \"", str));
            return null;
        }
        String group = matcher.group(1);
        group.getClass();
        Locale locale = Locale.US;
        String s = ouj.s(locale, group, locale);
        String group2 = matcher.group(2);
        group2.getClass();
        String lowerCase = group2.toLowerCase(locale);
        lowerCase.getClass();
        ArrayList arrayList = new ArrayList();
        Matcher matcher2 = twh.f.matcher(str);
        int end = matcher.end();
        while (end < str.length()) {
            matcher2.region(end, str.length());
            if (!matcher2.lookingAt()) {
                throw new IllegalArgumentException(("Parameter is not formatted correctly: \"" + str.substring(end) + "\" for: \"" + str + '\"').toString());
            }
            String group3 = matcher2.group(1);
            if (group3 == null) {
                end = matcher2.end();
            } else {
                String group4 = matcher2.group(2);
                if (group4 == null) {
                    group4 = matcher2.group(3);
                } else if (c.v(group4, "'", false) && c.n(group4, "'", false) && group4.length() > 2) {
                    group4 = f1d.d(1, 1, group4);
                }
                arrayList.add(group3);
                arrayList.add(group4);
                end = matcher2.end();
            }
        }
        return new twh(str, s, lowerCase, (String[]) arrayList.toArray(new String[0]));
    }

    public static final boolean D(onu onuVar) {
        onuVar.getClass();
        return onuVar == onu.a;
    }

    public static final void E(Throwable th, CoroutineContext coroutineContext) {
        if (th instanceof CancellationException) {
            return;
        }
        try {
            y5g.g0(th);
        } catch (Throwable th2) {
            fob.a(th, th2);
            cxb.V(th, coroutineContext);
        }
    }

    public static final int F(ogi ogiVar, String str) {
        Integer num;
        int i = ogiVar.f;
        str.getClass();
        kcc kccVar = new kcc(new lcc(StringsKt.g0(str, new String[]{StringUtil.SPACE}), true, new d5s(24)));
        int i2 = 0;
        while (kccVar.hasNext()) {
            String str2 = (String) kccVar.next();
            while (str.charAt(i2) != str2.charAt(0)) {
                i2++;
            }
            int length = (str2.length() + i2) - 1;
            int length2 = str2.length() + 1 + i2;
            int e = ogiVar.e(i2);
            if (e == i) {
                break;
            }
            if (e != ogiVar.e(length)) {
                num = Integer.valueOf(e + 1);
                break;
            }
            i2 = length2;
        }
        num = null;
        return num != null ? num.intValue() : i;
    }

    public static iiw G(String str, String str2) {
        List split$default;
        CharSequence charSequence;
        str.getClass();
        int i = 0;
        split$default = StringsKt__StringsKt.split$default(str, new String[]{StringUtils.PROCESS_POSTFIX_DELIMITER}, false, 0, 6, null);
        String str3 = (String) CollectionsKt.S(split$default, 0);
        if (str3 != null) {
            str = str3;
        }
        if (TextUtils.isDigitsOnly(str)) {
            int length = str.length();
            while (true) {
                if (i >= length) {
                    charSequence = "";
                    break;
                }
                if (str.charAt(i) != '0') {
                    charSequence = str.subSequence(i, str.length());
                    break;
                }
                i++;
            }
            str = charSequence.toString();
        }
        String str4 = (String) CollectionsKt.S(split$default, 1);
        if (str4 != null) {
            str2 = str4;
        }
        String str5 = null;
        if (str2 != null) {
            if (str2.equals(CommonUrlParts.Values.FALSE_INTEGER)) {
                str2 = null;
            }
            if (str2 != null && !StringsKt.U(str2)) {
                str5 = str2;
            }
        }
        return new iiw(str, str5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b2, code lost:
    
        if (r7.o(defpackage.apl.a, r0) != r1) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b4, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0082, code lost:
    
        if (r7.d(r9, r0) == r1) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object H(cg6 cg6Var, vx6 vx6Var, boolean z) {
        obk obkVar;
        int i;
        uol uolVar;
        g4q g4qVar;
        q7q w;
        n7q n7qVar;
        if (cg6Var instanceof obk) {
            obkVar = (obk) cg6Var;
            int i2 = obkVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                obkVar.n = i2 - Integer.MIN_VALUE;
                Object obj = obkVar.m;
                nm6 nm6Var = nm6.a;
                i = obkVar.n;
                if (i != 0) {
                    qgg.h0(obj);
                    uolVar = (uol) vx6Var.d;
                    f7l f7lVar = (f7l) vx6Var.b;
                    if (!z) {
                        e6l e6lVar = (e6l) f7lVar.c.getValue();
                        e6l e6lVar2 = (e6l) f7lVar.d.getValue();
                        if (!p6g.C(e6lVar) && !p6g.D(e6lVar) && !p6g.C(e6lVar2) && !p6g.D(e6lVar2)) {
                            return Boolean.TRUE;
                        }
                    }
                    obkVar.j = vx6Var;
                    obkVar.k = uolVar;
                    obkVar.l = z;
                    obkVar.n = 1;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj);
                            return Boolean.TRUE;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z = obkVar.l;
                    uol uolVar2 = obkVar.k;
                    vx6 vx6Var2 = obkVar.j;
                    qgg.h0(obj);
                    uolVar = uolVar2;
                    vx6Var = vx6Var2;
                }
                g4qVar = (g4q) ((g4l) vx6Var.c).c.getValue();
                if (g4qVar != null && (w = pcg.w(g4qVar)) != null && (n7qVar = w.a) != null && n7qVar.d()) {
                    obkVar.j = null;
                    obkVar.k = null;
                    obkVar.l = z;
                    obkVar.n = 2;
                }
                return Boolean.TRUE;
            }
        }
        obkVar = new obk(cg6Var);
        Object obj2 = obkVar.m;
        nm6 nm6Var2 = nm6.a;
        i = obkVar.n;
        if (i != 0) {
        }
        g4qVar = (g4q) ((g4l) vx6Var.c).c.getValue();
        if (g4qVar != null) {
            obkVar.j = null;
            obkVar.k = null;
            obkVar.l = z;
            obkVar.n = 2;
        }
        return Boolean.TRUE;
    }

    public static void I(Window window, boolean z) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            qdq.L(window, z);
        } else {
            if (i >= 30) {
                qdq.K(window, z);
                return;
            }
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
        }
    }

    public static final void J(puj pujVar, int i, Object obj) {
        pujVar.e[(pujVar.f - pujVar.a[pujVar.b - 1].c) + i] = obj;
    }

    public static final void K(puj pujVar, int i, Object obj, int i2, Object obj2) {
        int i3 = pujVar.f - pujVar.a[pujVar.b - 1].c;
        Object[] objArr = pujVar.e;
        objArr[i + i3] = obj;
        objArr[i3 + i2] = obj2;
    }

    public static final void L(puj pujVar, Object obj, Object obj2, Object obj3) {
        int i = pujVar.f - pujVar.a[pujVar.b - 1].c;
        Object[] objArr = pujVar.e;
        objArr[i] = obj;
        objArr[i + 1] = obj2;
        objArr[i + 2] = obj3;
    }

    public static final j2m M(t2m t2mVar, int i, long j) {
        t2mVar.getClass();
        if (i < 0) {
            su4.s(2, null, k5r.i(i, "position = "), null);
        }
        rr5 rr5Var = t2mVar.a;
        String str = rr5Var.a;
        String str2 = rr5Var.b;
        if (str2 == null) {
            str2 = CommonUrlParts.Values.FALSE_INTEGER;
        }
        String str3 = str2;
        tfs tfsVar = wc7.a;
        Date date = t2mVar.b;
        if (date == null) {
            date = new Date(System.currentTimeMillis());
        }
        return new j2m(0L, j, str, str3, wc7.a(date), i);
    }

    public static final ia N(mqs mqsVar, ArrayList arrayList) {
        Object obj;
        mqsVar.getClass();
        ArrayList arrayList2 = new ArrayList(v75.o(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((rvs) it.next()).a(mqsVar));
        }
        Iterator it2 = arrayList2.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            if (((ia) obj) instanceof ha) {
                break;
            }
        }
        ia iaVar = (ia) obj;
        ha haVar = iaVar instanceof ha ? (ha) iaVar : null;
        return haVar != null ? haVar : ea.a;
    }

    public static final void a(m4u m4uVar, sdr sdrVar, hq5 hq5Var, int i) {
        Object lcoVar;
        aqi aqiVar;
        x1u x1uVar = m4uVar.b;
        boolean z = m4uVar.c;
        wn5 wn5Var = xp3.h;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1500339898);
        int i2 = (oq5Var.f(m4uVar) ? 4 : 2) | i | (oq5Var.f(sdrVar) ? 32 : 16);
        if (oq5Var.P(i2 & 1, (i2 & 147) != 146)) {
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (K == kjnVar) {
                K = szf.g0(Boolean.valueOf(z));
                oq5Var.k0(K);
            }
            aqi aqiVar2 = (aqi) K;
            Object K2 = oq5Var.K();
            if (K2 == kjnVar) {
                K2 = szf.g0(x1uVar);
                oq5Var.k0(K2);
            }
            aqi aqiVar3 = (aqi) K2;
            if (Intrinsics.d((x1u) aqiVar3.getValue(), x1uVar)) {
                oq5Var.Z(-1098425287);
                oq5Var.p(false);
                aqiVar2.setValue(Boolean.valueOf(z));
                aqiVar = aqiVar2;
            } else {
                oq5Var.Z(-1098364372);
                Unit unit = Unit.a;
                boolean z2 = ((i2 & 112) == 32) | ((i2 & 14) == 4);
                Object K3 = oq5Var.K();
                if (z2 || K3 == kjnVar) {
                    aqiVar = aqiVar2;
                    lcoVar = new lco(m4uVar, sdrVar, aqiVar, aqiVar3, (Continuation) null, 27);
                    oq5Var.k0(lcoVar);
                } else {
                    lcoVar = K3;
                    aqiVar = aqiVar2;
                }
                gld.w(oq5Var, unit, (Function2) lcoVar);
                oq5Var.p(false);
            }
            Boolean bool = (Boolean) aqiVar.getValue();
            bool.getClass();
            wn5Var.invoke(bool, oq5Var, 48);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new c6u(m4uVar, sdrVar, i);
        }
    }

    public static final void b(n9b n9bVar, final l1h l1hVar) {
        n9bVar.getClass();
        l1hVar.getClass();
        lg3.D(n9bVar, 8);
        final int i = 0;
        wn5 wn5Var = new wn5(new Function2() { // from class: p1h
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                switch (i) {
                    case 0:
                        hq5 hq5Var = (hq5) obj;
                        if ((((Integer) obj2).intValue() & 3) == 2) {
                            oq5 oq5Var = (oq5) hq5Var;
                            if (oq5Var.z()) {
                                oq5Var.S();
                                break;
                            }
                        }
                        oq5 oq5Var2 = (oq5) hq5Var;
                        Object K = oq5Var2.K();
                        if (K == gq5.a) {
                            K = new brg(24);
                            oq5Var2.k0(K);
                        }
                        bg3.a(a.a(androidx.compose.foundation.a.k(nfp.b(vci.a, true, (Function1) K), true, null), "lyrics_bottom_sheet_track_title"), null, false, ild.C(996988959, new tt5(21, l1hVar), oq5Var2), oq5Var2, 3072, 6);
                    default:
                        hq5 hq5Var2 = (hq5) obj;
                        if ((((Integer) obj2).intValue() & 3) == 2) {
                            oq5 oq5Var3 = (oq5) hq5Var2;
                            if (oq5Var3.z()) {
                                oq5Var3.S();
                                break;
                            }
                        }
                        oq5 oq5Var4 = (oq5) hq5Var2;
                        oq5Var4.Z(1165500559);
                        StringBuilder sb = new StringBuilder();
                        l1h l1hVar2 = l1hVar;
                        CharSequence charSequence = l1hVar2.d;
                        Long l = l1hVar2.c;
                        sb.append(charSequence);
                        oq5Var4.Z(1840330104);
                        String N = xee.N(l.longValue(), oq5Var4);
                        oq5Var4.p(false);
                        sb.append(N);
                        String sb2 = sb.toString();
                        oq5Var4.p(false);
                        kn0 kn0Var = new kn0();
                        kn0Var.c(l1hVar2.d);
                        kn0Var.d(" • ");
                        kn0Var.c(lxe.K(l.longValue()));
                        mn0 h = kn0Var.h();
                        ges j = nu0.j();
                        long j2 = ((dq0) oq5Var4.j(eq0.a)).b.b;
                        yci o = androidx.compose.foundation.layout.a.o(d.d(vci.a, 1.0f), 24, 0.0f, 2);
                        boolean f = oq5Var4.f(sb2);
                        Object K2 = oq5Var4.K();
                        if (f || K2 == gq5.a) {
                            K2 = new q1h(sb2, 0);
                            oq5Var4.k0(K2);
                        }
                        xv7.i(h, a.a(androidx.compose.foundation.a.k(nfp.b(o, false, (Function1) K2), true, null), "lyrics_bottom_sheet_artist_subtitle"), j2, 0L, 0L, 3, 0L, 0, false, 0, 0, null, null, j, null, null, oq5Var4, 0, 0, 917240);
                        break;
                }
                return Unit.a;
            }
        }, -757564215, true);
        ubi ubiVar = n9bVar.a;
        ubiVar.a(wn5Var);
        lg3.D(n9bVar, 6);
        if (l1hVar.d != null) {
            final int i2 = 1;
            ubiVar.a(new wn5(new Function2() { // from class: p1h
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    switch (i2) {
                        case 0:
                            hq5 hq5Var = (hq5) obj;
                            if ((((Integer) obj2).intValue() & 3) == 2) {
                                oq5 oq5Var = (oq5) hq5Var;
                                if (oq5Var.z()) {
                                    oq5Var.S();
                                    break;
                                }
                            }
                            oq5 oq5Var2 = (oq5) hq5Var;
                            Object K = oq5Var2.K();
                            if (K == gq5.a) {
                                K = new brg(24);
                                oq5Var2.k0(K);
                            }
                            bg3.a(a.a(androidx.compose.foundation.a.k(nfp.b(vci.a, true, (Function1) K), true, null), "lyrics_bottom_sheet_track_title"), null, false, ild.C(996988959, new tt5(21, l1hVar), oq5Var2), oq5Var2, 3072, 6);
                        default:
                            hq5 hq5Var2 = (hq5) obj;
                            if ((((Integer) obj2).intValue() & 3) == 2) {
                                oq5 oq5Var3 = (oq5) hq5Var2;
                                if (oq5Var3.z()) {
                                    oq5Var3.S();
                                    break;
                                }
                            }
                            oq5 oq5Var4 = (oq5) hq5Var2;
                            oq5Var4.Z(1165500559);
                            StringBuilder sb = new StringBuilder();
                            l1h l1hVar2 = l1hVar;
                            CharSequence charSequence = l1hVar2.d;
                            Long l = l1hVar2.c;
                            sb.append(charSequence);
                            oq5Var4.Z(1840330104);
                            String N = xee.N(l.longValue(), oq5Var4);
                            oq5Var4.p(false);
                            sb.append(N);
                            String sb2 = sb.toString();
                            oq5Var4.p(false);
                            kn0 kn0Var = new kn0();
                            kn0Var.c(l1hVar2.d);
                            kn0Var.d(" • ");
                            kn0Var.c(lxe.K(l.longValue()));
                            mn0 h = kn0Var.h();
                            ges j = nu0.j();
                            long j2 = ((dq0) oq5Var4.j(eq0.a)).b.b;
                            yci o = androidx.compose.foundation.layout.a.o(d.d(vci.a, 1.0f), 24, 0.0f, 2);
                            boolean f = oq5Var4.f(sb2);
                            Object K2 = oq5Var4.K();
                            if (f || K2 == gq5.a) {
                                K2 = new q1h(sb2, 0);
                                oq5Var4.k0(K2);
                            }
                            xv7.i(h, a.a(androidx.compose.foundation.a.k(nfp.b(o, false, (Function1) K2), true, null), "lyrics_bottom_sheet_artist_subtitle"), j2, 0L, 0L, 3, 0L, 0, false, 0, 0, null, null, j, null, null, oq5Var4, 0, 0, 917240);
                            break;
                    }
                    return Unit.a;
                }
            }, -1442361017, true));
        }
        lg3.D(n9bVar, 32);
    }

    public static final void c(rli rliVar, yci yciVar, hq5 hq5Var, int i) {
        yci yciVar2;
        boolean z;
        cmi cmiVar;
        Object obj;
        fvf fvfVar;
        ek ekVar;
        rli rliVar2 = rliVar;
        rliVar2.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1014653290);
        int i2 = (oq5Var.h(rliVar2) ? 4 : 2) | i | 48;
        if (oq5Var.P(i2 & 1, (i2 & 19) != 18)) {
            cmi cmiVar2 = (cmi) gld.M(rliVar2.r, oq5Var).getValue();
            fvf a = hvf.a(0, 0, oq5Var, 0, 3);
            ek C = yd5.C(a, oq5Var);
            boolean f = oq5Var.f(C);
            Object K = oq5Var.K();
            Object obj2 = gq5.a;
            if (f || K == obj2) {
                K = new dmg(23, C);
                oq5Var.k0(K);
            }
            Function0 function0 = (Function0) K;
            wxi L = zc4.L(C, false, oq5Var, 2);
            vci vciVar = vci.a;
            yci a2 = androidx.compose.ui.input.nestedscroll.a.a(vciVar, L, null);
            qxo.c(a, "MusicHistory", oq5Var, 48);
            ogp.g.e(cmiVar2 instanceof zli, cmiVar2 instanceof ami, null, oq5Var, 4096, 4);
            kfh d = ug3.d(b2c.b, false);
            int i3 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, a2);
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
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var, i3, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            boolean booleanValue = ((Boolean) gld.M(rliVar2.q, oq5Var).getValue()).booleanValue();
            boolean h = oq5Var.h(rliVar2);
            Object K2 = oq5Var.K();
            if (h || K2 == obj2) {
                z = true;
                cmiVar = cmiVar2;
                obj = obj2;
                fvfVar = a;
                ekVar = C;
                k5h k5hVar = new k5h(0, rliVar2, rli.class, "onRefresh", "onRefresh()V", 0, 15);
                oq5Var.k0(k5hVar);
                K2 = k5hVar;
            } else {
                cmiVar = cmiVar2;
                obj = obj2;
                fvfVar = a;
                ekVar = C;
                z = true;
            }
            Function0 function02 = (Function0) ((h9f) K2);
            boolean f2 = oq5Var.f(cmiVar.getClass());
            Object K3 = oq5Var.K();
            if (f2 || K3 == obj) {
                K3 = Boolean.valueOf(cmiVar instanceof bmi);
                oq5Var.k0(K3);
            }
            rliVar2 = rliVar;
            bfg.f(booleanValue, function02, null, null, ((Boolean) K3).booleanValue(), ild.C(-1346817636, new pli(cmiVar, ekVar, function0, rliVar, fvfVar, 0), oq5Var), oq5Var, 196608, 12);
            oq5Var = oq5Var;
            oq5Var.p(z);
            yciVar2 = vciVar;
        } else {
            oq5Var.S();
            yciVar2 = yciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new m2g(rliVar2, yciVar2, i, 13);
        }
    }

    public static final void d(o0k o0kVar, int i, hq5 hq5Var, int i2) {
        int i3;
        o0kVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(923995714);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var.f(o0kVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var.d(i) ? 32 : 16;
        }
        if (oq5Var.P(i3 & 1, (i3 & 19) != 18)) {
            vci vciVar = vci.a;
            yci c = d.c(androidx.compose.foundation.layout.a.l(vciVar, o0kVar), 1.0f);
            iz2 iz2Var = b2c.c;
            kfh d = ug3.d(iz2Var, false);
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
            g0g.U(oq5Var, d, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var, i4, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            float f = 16;
            xcs.b(rvf.M(i, oq5Var), a.a(androidx.compose.foundation.layout.a.q(b.a.a(vciVar, iz2Var), f, 64, f, 0.0f, 8), "collection_non_music_empty_screen_text"), ((dq0) oq5Var.j(eq0.a)).b.a, 0L, null, 0L, null, new o9s(3), 0L, 0, false, 0, 0, null, nu0.j(), oq5Var, 0, 0, 65016);
            oq5Var = oq5Var;
            oq5Var.p(true);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new cv5(o0kVar, i, i2, 3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:144:0x05e0  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0674  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x06b3  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x06da  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0746  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0776  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x07a2  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x07cb  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0830  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x07d6  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x07ae  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0799  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x074a  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x06f8  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x06b7  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0678  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x05ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void e(final m4u m4uVar, final q84 q84Var, final boolean z, final boolean z2, final boolean z3, final boolean z4, final boolean z5, final boolean z6, m6u m6uVar, final Function1 function1, Function0 function0, final Function0 function02, final Function0 function03, final Function0 function04, final Function0 function05, final Function0 function06, final Function0 function07, final Function0 function08, hq5 hq5Var, final int i) {
        Function0 function09;
        final m6u m6uVar2;
        boolean z7;
        act actVar;
        boolean z8;
        boolean z9;
        boolean z10;
        kb5 kb5Var;
        float f;
        boolean z11;
        agr agrVar;
        boolean z12;
        kjn kjnVar;
        Configuration configuration;
        int i2;
        int i3;
        int i4;
        int i5;
        long j;
        int i6;
        int i7;
        String str;
        boolean z13;
        String N;
        String str2;
        int i8;
        long j2;
        iz2 iz2Var = b2c.d;
        iz2 iz2Var2 = b2c.f;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-2070722217);
        int i9 = i | (oq5Var.f(m4uVar) ? 4 : 2) | (oq5Var.f(q84Var) ? 32 : 16) | (oq5Var.g(z) ? 256 : 128) | (oq5Var.g(z2) ? 2048 : 1024);
        boolean g = oq5Var.g(z3);
        int i10 = RemoteCameraConfig.Notification.ID;
        int i11 = i9 | (g ? 16384 : 8192);
        boolean g2 = oq5Var.g(z4);
        int i12 = SQLiteDatabase.OPEN_FULLMUTEX;
        int i13 = i11 | (g2 ? 131072 : 65536) | (oq5Var.g(z5) ? 1048576 : 524288);
        boolean g3 = oq5Var.g(z6);
        int i14 = RemoteCameraConfig.Camera.BITRATE;
        int i15 = i13 | (g3 ? 8388608 : 4194304) | (oq5Var.f(m6uVar) ? 67108864 : 33554432) | (oq5Var.h(function1) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456);
        int i16 = (oq5Var.h(function0) ? 4 : 2) | (oq5Var.h(function02) ? 32 : 16) | (oq5Var.h(function03) ? 256 : 128) | (oq5Var.h(function04) ? 2048 : 1024);
        if (oq5Var.h(function05)) {
            i10 = 16384;
        }
        int i17 = i16 | i10;
        if (oq5Var.h(function06)) {
            i12 = 131072;
        }
        int i18 = i17 | i12 | (oq5Var.h(function07) ? 1048576 : 524288);
        if (oq5Var.h(function08)) {
            i14 = 8388608;
        }
        int i19 = i18 | i14;
        if (oq5Var.P(i15 & 1, ((i15 & 306783379) == 306783378 && (i19 & 4793491) == 4793490) ? false : true)) {
            z9u z9uVar = m4uVar.a;
            act S = weo.S(100, 0, null, 6);
            vci vciVar = vci.a;
            yci c = d.c(vciVar, 1.0f);
            iz2 iz2Var3 = b2c.b;
            kfh d = ug3.d(iz2Var3, false);
            int i20 = oq5Var.P;
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
            kb5 kb5Var2 = wp5.f;
            g0g.U(oq5Var, d, kb5Var2);
            kb5 kb5Var3 = wp5.e;
            g0g.U(oq5Var, l, kb5Var3);
            kb5 kb5Var4 = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i20))) {
                ouj.x(i20, oq5Var, i20, kb5Var4);
            }
            kb5 kb5Var5 = wp5.d;
            g0g.U(oq5Var, H, kb5Var5);
            b bVar = b.a;
            if (z6) {
                oq5Var.Z(891490432);
                yci a = bVar.a(vciVar, iz2Var2);
                int i21 = d85.o;
                vum.b(a, d85.f, 4, 0L, 0, oq5Var, 432, 24);
                z7 = false;
            } else {
                z7 = false;
                oq5Var.Z(885162309);
            }
            oq5Var.p(z7);
            jzb jzbVar = z9uVar.h;
            if (jzbVar != null) {
                oq5Var.Z(891823093);
                actVar = S;
                etn.f((!z5 || z4 || z6) ? false : true, bVar.a(androidx.compose.foundation.layout.a.n(vciVar, 72, 24), iz2Var), androidx.compose.animation.c.e(S, 2), androidx.compose.animation.c.f(S, 2), null, ild.C(1315174023, new e6u(jzbVar, 0), oq5Var), oq5Var, 200064, 16);
                z8 = false;
            } else {
                actVar = S;
                z8 = false;
                oq5Var.Z(885162309);
            }
            oq5Var.p(z8);
            float f2 = 0.0f;
            act actVar2 = actVar;
            final sdr b = pk0.b(z4 ? 1.0f : 0.0f, actVar2, "alphaAnimation", null, oq5Var, 3120, 20);
            if (((Number) b.getValue()).floatValue() > 0.0f) {
                oq5Var.Z(893200547);
                yci c2 = d.c(vciVar, 1.0f);
                int i22 = d85.o;
                yci n = androidx.compose.foundation.layout.a.n(androidx.compose.foundation.a.b(c2, d85.b(d85.b, 0.5f, 0.0f, 0.0f, 0.0f, 14), vnj.i), 60, 20);
                boolean f3 = oq5Var.f(b);
                Object K = oq5Var.K();
                kjn kjnVar2 = gq5.a;
                if (f3 || K == kjnVar2) {
                    z10 = false;
                    K = new f6u(b, 0 == true ? 1 : 0);
                    oq5Var.k0(K);
                } else {
                    z10 = false;
                }
                yci s = wyf.s(n, (Function0) K);
                kfh d2 = ug3.d(iz2Var3, z10);
                int i23 = oq5Var.P;
                androidx.compose.runtime.internal.a l2 = oq5Var.l();
                yci H2 = vnj.H(oq5Var, s);
                oq5Var.d0();
                if (oq5Var.O) {
                    oq5Var.k(grbVar);
                } else {
                    oq5Var.n0();
                }
                g0g.U(oq5Var, d2, kb5Var2);
                g0g.U(oq5Var, l2, kb5Var3);
                if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i23))) {
                    ouj.x(i23, oq5Var, i23, kb5Var4);
                }
                g0g.U(oq5Var, H2, kb5Var5);
                yci a2 = bVar.a(androidx.compose.foundation.layout.a.q(vciVar, 0.0f, 4, 0.0f, 0.0f, 13), iz2Var3);
                kx0 kx0Var = qx0.c;
                gz2 gz2Var = b2c.n;
                ta5 a3 = sa5.a(kx0Var, gz2Var, oq5Var, 0);
                int i24 = oq5Var.P;
                androidx.compose.runtime.internal.a l3 = oq5Var.l();
                yci H3 = vnj.H(oq5Var, a2);
                oq5Var.d0();
                if (oq5Var.O) {
                    oq5Var.k(grbVar);
                } else {
                    oq5Var.n0();
                }
                g0g.U(oq5Var, a3, kb5Var2);
                g0g.U(oq5Var, l3, kb5Var3);
                if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i24))) {
                    ouj.x(i24, oq5Var, i24, kb5Var4);
                }
                g0g.U(oq5Var, H3, kb5Var5);
                String str3 = z9uVar.e;
                ges c3 = nu0.c();
                agr agrVar2 = eq0.a;
                xcs.b(str3, a.a(vciVar, "video_clip_title"), ((dq0) oq5Var.j(agrVar2)).b.a, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, c3, oq5Var, 48, 0, 65528);
                u1g.l(oq5Var, d.m(vciVar, 2));
                xcs.b(z9uVar.f, a.a(vciVar, "video_clip_subtitle"), ((dq0) oq5Var.j(agrVar2)).b.b, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, nu0.j(), oq5Var, 48, 0, 65528);
                oq5Var.p(true);
                etn.f(!z6, bVar.a(vciVar, iz2Var2), androidx.compose.animation.c.e(actVar2, 2), androidx.compose.animation.c.f(actVar2, 2), null, ild.C(1906425934, new pyc() { // from class: g6u
                    @Override // defpackage.pyc
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        hq5 hq5Var2 = (hq5) obj2;
                        ((Integer) obj3).getClass();
                        ((am0) obj).getClass();
                        hz2 hz2Var = b2c.l;
                        vci vciVar2 = vci.a;
                        yci a4 = a.a(androidx.compose.foundation.layout.a.q(vciVar2, 0.0f, 0.0f, 12, 0.0f, 11), "video_clip_controls");
                        nho a5 = lho.a(qx0.a, hz2Var, hq5Var2, 48);
                        oq5 oq5Var2 = (oq5) hq5Var2;
                        int i25 = oq5Var2.P;
                        androidx.compose.runtime.internal.a l4 = oq5Var2.l();
                        yci H4 = vnj.H(hq5Var2, a4);
                        xp5.T.getClass();
                        Function0 function010 = wp5.b;
                        oq5Var2.d0();
                        if (oq5Var2.O) {
                            oq5Var2.k(function010);
                        } else {
                            oq5Var2.n0();
                        }
                        g0g.U(hq5Var2, a5, wp5.f);
                        g0g.U(hq5Var2, l4, wp5.e);
                        kb5 kb5Var6 = wp5.g;
                        if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i25))) {
                            ouj.x(i25, oq5Var2, i25, kb5Var6);
                        }
                        g0g.U(hq5Var2, H4, wp5.d);
                        float f4 = 24;
                        yci q = androidx.compose.foundation.layout.a.q(vciVar2, 0.0f, 0.0f, f4, 0.0f, 11);
                        if (1.0f <= 0.0d) {
                            qme.a("invalid weight; must be greater than zero");
                        }
                        u1g.l(hq5Var2, q.f(new LayoutWeightElement(true, 1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f)));
                        boolean z14 = z2;
                        yci a6 = a.a(d.m(xv.z(vciVar2, z14 ? 1.0f : 0.5f), f4), "video_clip_previous");
                        Function0 function011 = function03;
                        boolean f5 = oq5Var2.f(function011);
                        Object K2 = oq5Var2.K();
                        Object obj4 = gq5.a;
                        if (f5 || K2 == obj4) {
                            K2 = new gct(3, function011);
                            oq5Var2.k0(K2);
                        }
                        aae.a((Function0) K2, a6, z14, xp3.f, hq5Var2, 24576, 8);
                        boolean z15 = z;
                        boolean g4 = oq5Var2.g(z15);
                        Function0 function012 = function06;
                        boolean f6 = g4 | oq5Var2.f(function012);
                        Function0 function013 = function05;
                        boolean f7 = f6 | oq5Var2.f(function013);
                        Object K3 = oq5Var2.K();
                        if (f7 || K3 == obj4) {
                            K3 = new x2h(z15, function012, function013, 1);
                            oq5Var2.k0(K3);
                        }
                        float f8 = 64;
                        aae.a((Function0) K3, ksw.D(a.a(d.m(androidx.compose.foundation.layout.a.o(vciVar2, f8, 0.0f, 2), f8), "video_clip_play"), null, rvf.M(z15 ? R.string.pause : R.string.listen, hq5Var2)), false, ild.C(-746484347, new k4m(9, z15), hq5Var2), hq5Var2, 24576, 12);
                        boolean z16 = z3;
                        yci a7 = a.a(d.m(xv.z(vciVar2, z16 ? 1.0f : 0.5f), f4), "video_clip_next");
                        Function0 function014 = function04;
                        boolean f9 = oq5Var2.f(function014);
                        Object K4 = oq5Var2.K();
                        if (f9 || K4 == obj4) {
                            K4 = new gct(4, function014);
                            oq5Var2.k0(K4);
                        }
                        aae.a((Function0) K4, a7, z16, xp3.g, hq5Var2, 24576, 8);
                        if (1.0f <= 0.0d) {
                            qme.a("invalid weight; must be greater than zero");
                        }
                        u1g.l(hq5Var2, new LayoutWeightElement(true, 1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f));
                        yci a8 = a.a(d.m(vciVar2, f4), "video_clip_like");
                        String M = rvf.M(R.string.menu_element_like, hq5Var2);
                        m4u m4uVar2 = m4uVar;
                        aae.a(function07, ksw.D(a8, M, rvf.M(m4uVar2.c ? R.string.accessibility_uncheck_action : R.string.accessibility_check_action, hq5Var2)), false, ild.C(1873118215, new c6u(m4uVar2, b), hq5Var2), hq5Var2, 24576, 12);
                        oq5Var2.p(true);
                        return Unit.a;
                    }
                }, oq5Var), oq5Var, 200064, 16);
                oq5Var = oq5Var;
                float f4 = 12;
                yci a4 = bVar.a(androidx.compose.foundation.layout.a.q(vciVar, 0.0f, f4, f4, 0.0f, 9), iz2Var);
                nho a5 = lho.a(qx0.a, b2c.k, oq5Var, 0);
                int i25 = oq5Var.P;
                androidx.compose.runtime.internal.a l4 = oq5Var.l();
                yci H4 = vnj.H(oq5Var, a4);
                oq5Var.d0();
                if (oq5Var.O) {
                    oq5Var.k(grbVar);
                } else {
                    oq5Var.n0();
                }
                g0g.U(oq5Var, a5, kb5Var2);
                g0g.U(oq5Var, l4, kb5Var3);
                if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i25))) {
                    kb5Var = kb5Var4;
                    ouj.x(i25, oq5Var, i25, kb5Var);
                } else {
                    kb5Var = kb5Var4;
                }
                g0g.U(oq5Var, H4, kb5Var5);
                if (jzbVar != null) {
                    oq5Var.Z(322781098);
                    f = f4;
                    etn.f(z5, null, androidx.compose.animation.c.e(actVar2, 2), androidx.compose.animation.c.f(actVar2, 2), null, ild.C(1924383373, new e6u(jzbVar, 1), oq5Var), oq5Var, 200064 | ((i15 >> 18) & 14), 18);
                    z11 = false;
                } else {
                    f = f4;
                    z11 = false;
                    oq5Var.Z(309040968);
                }
                oq5Var.p(z11);
                float f5 = 32;
                float f6 = 24;
                yci m = d.m(androidx.compose.foundation.layout.a.q(vciVar, 0.0f, 0.0f, f5, 0.0f, 11), f6);
                kfh d3 = ug3.d(iz2Var3, z11);
                int i26 = oq5Var.P;
                androidx.compose.runtime.internal.a l5 = oq5Var.l();
                yci H5 = vnj.H(oq5Var, m);
                oq5Var.d0();
                if (oq5Var.O) {
                    oq5Var.k(grbVar);
                } else {
                    oq5Var.n0();
                }
                g0g.U(oq5Var, d3, kb5Var2);
                g0g.U(oq5Var, l5, kb5Var3);
                if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i26))) {
                    ouj.x(i26, oq5Var, i26, kb5Var);
                }
                g0g.U(oq5Var, H5, kb5Var5);
                if (q84Var != null) {
                    boolean z14 = q84Var.m;
                    oq5Var.Z(2000633317);
                    yci c4 = com.yandex.music.core.ui.compose.b.c(a.a(vciVar, "cast_picker_button"), "is_casting", Boolean.valueOf(z14));
                    int i27 = q84Var.n.a;
                    if (z14) {
                        oq5Var.Z(-1598017944);
                        agrVar = agrVar2;
                        i8 = i27;
                        j2 = ((dq0) oq5Var.j(agrVar)).a.h;
                        z12 = false;
                    } else {
                        agrVar = agrVar2;
                        i8 = i27;
                        z12 = false;
                        oq5Var.Z(-1598016857);
                        j2 = ((dq0) oq5Var.j(agrVar)).a.a;
                    }
                    oq5Var.p(z12);
                    hld.h(i8, (i19 >> 15) & 896, j2, oq5Var, c4, function08);
                } else {
                    agrVar = agrVar2;
                    z12 = false;
                    oq5Var.Z(1985880386);
                }
                oq5Var.p(z12);
                oq5Var.p(true);
                boolean z15 = (i19 & 14) == 4;
                Object K2 = oq5Var.K();
                if (z15) {
                    kjnVar = kjnVar2;
                } else {
                    kjnVar = kjnVar2;
                    if (K2 != kjnVar) {
                        function09 = function0;
                        aae.a((Function0) K2, ksw.D(a.a(d.m(androidx.compose.foundation.layout.a.q(vciVar, 0.0f, 0.0f, f5, 0.0f, 11), f6), "video_clip_overflow"), rvf.M(R.string.overflow_menu_content_description, oq5Var), null), false, xp3.i, oq5Var, 24576, 12);
                        configuration = (Configuration) oq5Var.j(AndroidCompositionLocals_androidKt.a);
                        configuration.getClass();
                        if (configuration.smallestScreenWidthDp < 600) {
                            oq5Var.Z(309040968);
                            i2 = 0;
                            oq5Var.p(false);
                        } else {
                            oq5Var.Z(325121288);
                            boolean z16 = (i19 & 112) == 32;
                            Object K3 = oq5Var.K();
                            if (z16 || K3 == kjnVar) {
                                K3 = new gct(7, function02);
                                oq5Var.k0(K3);
                            }
                            aae.a((Function0) K3, ksw.D(a.a(d.m(vciVar, f6), "video_clip_exit"), rvf.M(R.string.collapse_video_description, oq5Var), null), false, xp3.j, oq5Var, 24576, 12);
                            i2 = 0;
                            oq5Var.p(false);
                        }
                        oq5Var.p(true);
                        float f7 = f;
                        yci a6 = bVar.a(androidx.compose.foundation.layout.a.q(vciVar, 0.0f, 0.0f, f7, 0.0f, 11), b2c.i);
                        ta5 a7 = sa5.a(kx0Var, gz2Var, oq5Var, i2);
                        i3 = oq5Var.P;
                        androidx.compose.runtime.internal.a l6 = oq5Var.l();
                        yci H6 = vnj.H(oq5Var, a6);
                        oq5Var.d0();
                        if (oq5Var.O) {
                            oq5Var.n0();
                        } else {
                            oq5Var.k(grbVar);
                        }
                        g0g.U(oq5Var, a7, kb5Var2);
                        g0g.U(oq5Var, l6, kb5Var3);
                        if (!oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                            ouj.x(i3, oq5Var, i3, kb5Var);
                        }
                        g0g.U(oq5Var, H6, kb5Var5);
                        yci m2 = androidx.compose.foundation.layout.a.m(vciVar, f7);
                        kfh d4 = ug3.d(iz2Var3, false);
                        i4 = oq5Var.P;
                        androidx.compose.runtime.internal.a l7 = oq5Var.l();
                        yci H7 = vnj.H(oq5Var, m2);
                        oq5Var.d0();
                        if (oq5Var.O) {
                            oq5Var.n0();
                        } else {
                            oq5Var.k(grbVar);
                        }
                        g0g.U(oq5Var, d4, kb5Var2);
                        g0g.U(oq5Var, l7, kb5Var3);
                        if (!oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                            ouj.x(i4, oq5Var, i4, kb5Var);
                        }
                        g0g.U(oq5Var, H7, kb5Var5);
                        if (m6uVar == null) {
                            m6uVar2 = m6uVar;
                            float f8 = m6uVar2.b / m6uVar2.c;
                            Float valueOf = Float.valueOf(f8);
                            if (Float.isNaN(f8)) {
                                valueOf = null;
                            }
                            if (valueOf != null) {
                                f2 = valueOf.floatValue();
                            }
                        } else {
                            m6uVar2 = m6uVar;
                        }
                        q7g.s(f2, function1, function06, function05, a.a(vciVar, "video_clip_progress_bar"), null, oq5Var, ((i15 >> 24) & 112) | 24576 | ((i19 >> 9) & 896) | ((i19 >> 3) & 7168), 32);
                        oq5Var.p(true);
                        hz2 hz2Var = b2c.l;
                        lx0 lx0Var = qx0.g;
                        yci d5 = d.d(vciVar, 1.0f);
                        nho a8 = lho.a(lx0Var, hz2Var, oq5Var, 54);
                        i5 = oq5Var.P;
                        androidx.compose.runtime.internal.a l8 = oq5Var.l();
                        yci H8 = vnj.H(oq5Var, d5);
                        oq5Var.d0();
                        if (oq5Var.O) {
                            oq5Var.n0();
                        } else {
                            oq5Var.k(grbVar);
                        }
                        g0g.U(oq5Var, a8, kb5Var2);
                        g0g.U(oq5Var, l8, kb5Var3);
                        if (!oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i5))) {
                            ouj.x(i5, oq5Var, i5, kb5Var);
                        }
                        g0g.U(oq5Var, H8, kb5Var5);
                        if (m6uVar2 == null) {
                            long j3 = m6uVar2.b;
                            j = 1000;
                            i7 = 60;
                            i6 = 2;
                            str = String.format("%d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j3 / 60000), Long.valueOf((j3 / 1000) % 60)}, 2));
                        } else {
                            j = 1000;
                            i6 = 2;
                            i7 = 60;
                            str = "";
                        }
                        if (m6uVar2 != null) {
                            oq5Var.Z(-1092749222);
                            z13 = false;
                            oq5Var.p(false);
                            N = null;
                        } else {
                            z13 = false;
                            oq5Var.Z(-1092749221);
                            N = rvf.N(R.string.player_progress_description, new Object[]{saf.q0(m6uVar2.b)}, oq5Var);
                            oq5Var.p(false);
                        }
                        if (m6uVar2 != null) {
                            oq5Var.Z(-1092434758);
                            oq5Var.p(z13);
                            str2 = null;
                        } else {
                            oq5Var.Z(-1092434757);
                            String N2 = rvf.N(R.string.player_duration_description, new Object[]{saf.q0(m6uVar2.c)}, oq5Var);
                            oq5Var.p(z13);
                            str2 = N2;
                        }
                        xcs.b(str, a.a(ksw.D(vciVar, N, null), "video_clip_progress"), ((dq0) oq5Var.j(agrVar)).b.b, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, nu0.i(), oq5Var, 0, 0, 65528);
                        xcs.b(m6uVar2 != null ? String.format("%d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(m6uVar2.c / 60000), Long.valueOf((m6uVar2.c / j) % i7)}, i6)) : "", a.a(ksw.D(vciVar, str2, null), "video_clip_duration"), ((dq0) oq5Var.j(agrVar)).b.b, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, nu0.i(), oq5Var, 0, 0, 65528);
                        z9 = true;
                        k5r.s(oq5Var, true, true, true, false);
                    }
                }
                function09 = function0;
                K2 = new gct(6, function09);
                oq5Var.k0(K2);
                aae.a((Function0) K2, ksw.D(a.a(d.m(androidx.compose.foundation.layout.a.q(vciVar, 0.0f, 0.0f, f5, 0.0f, 11), f6), "video_clip_overflow"), rvf.M(R.string.overflow_menu_content_description, oq5Var), null), false, xp3.i, oq5Var, 24576, 12);
                configuration = (Configuration) oq5Var.j(AndroidCompositionLocals_androidKt.a);
                configuration.getClass();
                if (configuration.smallestScreenWidthDp < 600) {
                }
                oq5Var.p(true);
                float f72 = f;
                yci a62 = bVar.a(androidx.compose.foundation.layout.a.q(vciVar, 0.0f, 0.0f, f72, 0.0f, 11), b2c.i);
                ta5 a72 = sa5.a(kx0Var, gz2Var, oq5Var, i2);
                i3 = oq5Var.P;
                androidx.compose.runtime.internal.a l62 = oq5Var.l();
                yci H62 = vnj.H(oq5Var, a62);
                oq5Var.d0();
                if (oq5Var.O) {
                }
                g0g.U(oq5Var, a72, kb5Var2);
                g0g.U(oq5Var, l62, kb5Var3);
                if (!oq5Var.O) {
                }
                ouj.x(i3, oq5Var, i3, kb5Var);
                g0g.U(oq5Var, H62, kb5Var5);
                yci m22 = androidx.compose.foundation.layout.a.m(vciVar, f72);
                kfh d42 = ug3.d(iz2Var3, false);
                i4 = oq5Var.P;
                androidx.compose.runtime.internal.a l72 = oq5Var.l();
                yci H72 = vnj.H(oq5Var, m22);
                oq5Var.d0();
                if (oq5Var.O) {
                }
                g0g.U(oq5Var, d42, kb5Var2);
                g0g.U(oq5Var, l72, kb5Var3);
                if (!oq5Var.O) {
                }
                ouj.x(i4, oq5Var, i4, kb5Var);
                g0g.U(oq5Var, H72, kb5Var5);
                if (m6uVar == null) {
                }
                q7g.s(f2, function1, function06, function05, a.a(vciVar, "video_clip_progress_bar"), null, oq5Var, ((i15 >> 24) & 112) | 24576 | ((i19 >> 9) & 896) | ((i19 >> 3) & 7168), 32);
                oq5Var.p(true);
                hz2 hz2Var2 = b2c.l;
                lx0 lx0Var2 = qx0.g;
                yci d52 = d.d(vciVar, 1.0f);
                nho a82 = lho.a(lx0Var2, hz2Var2, oq5Var, 54);
                i5 = oq5Var.P;
                androidx.compose.runtime.internal.a l82 = oq5Var.l();
                yci H82 = vnj.H(oq5Var, d52);
                oq5Var.d0();
                if (oq5Var.O) {
                }
                g0g.U(oq5Var, a82, kb5Var2);
                g0g.U(oq5Var, l82, kb5Var3);
                if (!oq5Var.O) {
                }
                ouj.x(i5, oq5Var, i5, kb5Var);
                g0g.U(oq5Var, H82, kb5Var5);
                if (m6uVar2 == null) {
                }
                if (m6uVar2 != null) {
                }
                if (m6uVar2 != null) {
                }
                xcs.b(str, a.a(ksw.D(vciVar, N, null), "video_clip_progress"), ((dq0) oq5Var.j(agrVar)).b.b, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, nu0.i(), oq5Var, 0, 0, 65528);
                xcs.b(m6uVar2 != null ? String.format("%d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(m6uVar2.c / 60000), Long.valueOf((m6uVar2.c / j) % i7)}, i6)) : "", a.a(ksw.D(vciVar, str2, null), "video_clip_duration"), ((dq0) oq5Var.j(agrVar)).b.b, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, nu0.i(), oq5Var, 0, 0, 65528);
                z9 = true;
                k5r.s(oq5Var, true, true, true, false);
            } else {
                m6uVar2 = m6uVar;
                function09 = function0;
                z9 = true;
                oq5Var.Z(885162309);
                oq5Var.p(false);
            }
            oq5Var.p(z9);
        } else {
            function09 = function0;
            m6uVar2 = m6uVar;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            final Function0 function010 = function09;
            r.d = new Function2(q84Var, z, z2, z3, z4, z5, z6, m6uVar2, function1, function010, function02, function03, function04, function05, function06, function07, function08, i) { // from class: h6u
                public final /* synthetic */ q84 b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ boolean d;
                public final /* synthetic */ boolean e;
                public final /* synthetic */ boolean f;
                public final /* synthetic */ boolean g;
                public final /* synthetic */ boolean h;
                public final /* synthetic */ m6u i;
                public final /* synthetic */ Function1 j;
                public final /* synthetic */ Function0 k;
                public final /* synthetic */ Function0 l;
                public final /* synthetic */ Function0 m;
                public final /* synthetic */ Function0 n;
                public final /* synthetic */ Function0 o;
                public final /* synthetic */ Function0 p;
                public final /* synthetic */ Function0 q;
                public final /* synthetic */ Function0 r;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int R = rvf.R(1);
                    q5g.e(m4u.this, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, (hq5) obj, R);
                    return Unit.a;
                }
            };
        }
    }

    public static final void f(boolean z, Function2 function2, hq5 hq5Var, int i) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-642000585);
        int i2 = (oq5Var.g(z) ? 4 : 2) | i | (oq5Var.h(function2) ? 32 : 16);
        if ((i2 & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
        } else {
            aqi o0 = szf.o0(function2, oq5Var);
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (K == kjnVar) {
                K = tlm.f(gld.R(g.a, oq5Var), oq5Var);
            }
            mm6 mm6Var = ((fs5) K).a;
            Object K2 = oq5Var.K();
            Object obj = K2;
            if (K2 == kjnVar) {
                Function2 function22 = (Function2) o0.getValue();
                slm slmVar = new slm(z);
                slmVar.b = mm6Var;
                slmVar.c = function22;
                oq5Var.k0(slmVar);
                obj = slmVar;
            }
            slm slmVar2 = (slm) obj;
            boolean f = oq5Var.f((Function2) o0.getValue()) | oq5Var.f(mm6Var);
            Object K3 = oq5Var.K();
            if (f || K3 == kjnVar) {
                slmVar2.c = (Function2) o0.getValue();
                slmVar2.b = mm6Var;
                oq5Var.k0(Unit.a);
            }
            Boolean valueOf = Boolean.valueOf(z);
            boolean h = ((i2 & 14) == 4) | oq5Var.h(slmVar2);
            Object K4 = oq5Var.K();
            if (h || K4 == kjnVar) {
                K4 = new ze1(slmVar2, z, null, 10);
                oq5Var.k0(K4);
            }
            gld.w(oq5Var, valueOf, (Function2) K4);
            rpj a = elg.a(oq5Var);
            if (a == null) {
                xq0.q("No OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner");
                return;
            }
            qpj onBackPressedDispatcher = a.getOnBackPressedDispatcher();
            dzf dzfVar = (dzf) oq5Var.j(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            boolean h2 = oq5Var.h(onBackPressedDispatcher) | oq5Var.h(dzfVar) | oq5Var.h(slmVar2);
            Object K5 = oq5Var.K();
            if (h2 || K5 == kjnVar) {
                K5 = new lma(17, onBackPressedDispatcher, dzfVar, slmVar2);
                oq5Var.k0(K5);
            }
            gld.j(dzfVar, onBackPressedDispatcher, (Function1) K5, oq5Var);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new f9k(z, function2, i, 1);
        }
    }

    public static final void g(t5n t5nVar, hq5 hq5Var, int i) {
        oq5 oq5Var;
        aqi aqiVar;
        t5nVar.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-261438763);
        int i2 = (oq5Var2.h(t5nVar) ? 4 : 2) | i;
        if (oq5Var2.P(i2 & 1, (i2 & 3) != 2)) {
            aqi P = szf.P(t5nVar.d, new j6n(t5nVar.e), null, oq5Var2, 0, 2);
            ogp.g.e(false, false, ogp.r().d(), oq5Var2, 4096, 3);
            String M = rvf.M(R.string.quality_settings_screen_title, oq5Var2);
            fvf a = hvf.a(0, 0, oq5Var2, 0, 3);
            vm C = ghh.C(zs4.g(oq5Var2), ogp.A(oq5Var2));
            boolean h = oq5Var2.h(t5nVar);
            Object K = oq5Var2.K();
            if (h || K == gq5.a) {
                aqiVar = P;
                ebm ebmVar = new ebm(0, t5nVar, t5n.class, "onBackPressed", "onBackPressed()V", 0, 26);
                oq5Var2.k0(ebmVar);
                K = ebmVar;
            } else {
                aqiVar = P;
            }
            oq5Var = oq5Var2;
            xp3.d(M, a, null, C, (Function0) ((h9f) K), null, false, false, null, null, null, ild.C(621388555, new gab(27, t5nVar, aqiVar), oq5Var2), oq5Var, 0, 48, 2020);
        } else {
            oq5Var = oq5Var2;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new ucm(t5nVar, i, 11);
        }
    }

    public static final void h(c0p c0pVar, List list, s2p s2pVar, Function0 function0, yci yciVar, Function0 function02, hq5 hq5Var, int i) {
        c0p c0pVar2;
        oq5 oq5Var;
        c0pVar.getClass();
        list.getClass();
        function0.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-558001595);
        int i2 = i | (oq5Var2.d(c0pVar.ordinal()) ? 4 : 2) | (oq5Var2.f(list) ? 32 : 16) | (oq5Var2.f(s2pVar) ? 256 : 128) | (oq5Var2.h(function0) ? 2048 : 1024) | (oq5Var2.h(function02) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX);
        if (oq5Var2.P(i2 & 1, (74899 & i2) != 74898)) {
            fvf a = hvf.a(0, 0, oq5Var2, 0, 3);
            boolean z = (i2 & 7168) == 2048;
            Object K = oq5Var2.K();
            Object obj = gq5.a;
            if (z || K == obj) {
                K = new g1j(15, function0);
                oq5Var2.k0(K);
            }
            ezf.d(a, (Function0) K, oq5Var2, 0);
            ezf.e(a, function02, null, oq5Var2, (i2 >> 12) & 112);
            yci a2 = a.a(yciVar, "search_history_success");
            kfh d = ug3.d(b2c.b, false);
            int i3 = oq5Var2.P;
            androidx.compose.runtime.internal.a l = oq5Var2.l();
            yci H = vnj.H(oq5Var2, a2);
            xp5.T.getClass();
            Function0 function03 = wp5.b;
            oq5Var2.d0();
            if (oq5Var2.O) {
                oq5Var2.k(function03);
            } else {
                oq5Var2.n0();
            }
            g0g.U(oq5Var2, d, wp5.f);
            g0g.U(oq5Var2, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var2, i3, kb5Var);
            }
            g0g.U(oq5Var2, H, wp5.d);
            int i4 = i2 & 896;
            boolean z2 = i4 == 256;
            Object K2 = oq5Var2.K();
            if (z2 || K2 == obj) {
                K2 = new q2p(s2pVar, 0);
                oq5Var2.k0(K2);
            }
            com.yandex.music.core.ui.compose.a.a((Function0) K2, oq5Var2, 0);
            yci c = d.c(vci.a, 1.0f);
            q0k g = zs4.g(oq5Var2);
            boolean f = ((i2 & 112) == 32) | ((i2 & 14) == 4) | (i4 == 256) | oq5Var2.f(a);
            Object K3 = oq5Var2.K();
            if (f || K3 == obj) {
                c0pVar2 = c0pVar;
                K3 = new i50(list, a, c0pVar2, s2pVar);
                oq5Var2.k0(K3);
            } else {
                c0pVar2 = c0pVar;
            }
            weo.f(c, a, g, null, null, null, false, null, (Function1) K3, oq5Var2, 6, 504);
            oq5Var = oq5Var2;
            oq5Var.p(true);
        } else {
            c0pVar2 = c0pVar;
            oq5Var = oq5Var2;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new pr((Object) c0pVar2, (Object) list, (Object) s2pVar, (Object) function0, yciVar, (Object) function02, i, 19);
        }
    }

    public static final void i(zwp zwpVar, vvp vvpVar, Function2 function2, boolean z, wwp wwpVar, Function1 function1, bci bciVar, hq5 hq5Var, int i) {
        function2.getClass();
        wwpVar.getClass();
        function1.getClass();
        bciVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1578114345);
        int i2 = (oq5Var.h(bciVar) ? 1048576 : 524288) | i | (oq5Var.h(zwpVar) ? 4 : 2) | (oq5Var.h(vvpVar) ? 32 : 16) | (oq5Var.h(function2) ? 256 : 128) | (oq5Var.g(z) ? 2048 : 1024) | (oq5Var.h(wwpVar) ? 16384 : RemoteCameraConfig.Notification.ID) | (oq5Var.h(function1) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX);
        if ((599187 & i2) == 599186 && oq5Var.z()) {
            oq5Var.S();
        } else if (vvpVar instanceof uvp) {
            oq5Var.Z(892866795);
            pd.g(6, 0, oq5Var, d.x(d.c(vci.a, 1.0f), null, 3));
            oq5Var.p(false);
        } else {
            if (!(vvpVar instanceof tvp)) {
                throw vz1.i(oq5Var, 444442423, false);
            }
            oq5Var.Z(893106146);
            yd5.f(null, null, bciVar, null, null, false, false, false, 0L, 0L, 0.0f, ild.C(-725535669, new h54(zwpVar, vvpVar, function2, z, wwpVar, function1), oq5Var), oq5Var, 4096 | ((i2 >> 9) & 7168), 4087);
            oq5Var.p(false);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new k26(zwpVar, vvpVar, function2, z, wwpVar, function1, bciVar, i, 2);
        }
    }

    public static final void j(final String str, final Function0 function0, long j, final d85 d85Var, final yci yciVar, o0k o0kVar, hq5 hq5Var, final int i) {
        long j2;
        final o0k o0kVar2;
        str.getClass();
        function0.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1996058420);
        int i2 = i | (oq5Var.f(str) ? 4 : 2) | (oq5Var.h(function0) ? 32 : 16) | (oq5Var.e(j) ? 256 : 128) | (oq5Var.f(d85Var) ? 2048 : 1024) | (oq5Var.f(yciVar) ? 16384 : RemoteCameraConfig.Notification.ID) | 196608;
        if (oq5Var.P(i2 & 1, (74899 & i2) != 74898)) {
            q0k a = androidx.compose.foundation.layout.a.a(24, 0.0f, 2);
            agr agrVar = eq0.a;
            j2 = j;
            pd.o(((i2 >> 3) & 14) | 1572912, 32, ((dq0) oq5Var.j(agrVar)).b.a, ((dq0) oq5Var.j(agrVar)).c.c, ild.C(1731475435, new aqp(5, d85Var, a, str), oq5Var), oq5Var, androidx.compose.foundation.a.b(xp3.u(d.g(yciVar, 48, 0.0f, 2), ugo.a), j2, vnj.i), function0, true, false);
            o0kVar2 = a;
        } else {
            j2 = j;
            oq5Var.S();
            o0kVar2 = o0kVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            final long j3 = j2;
            r.d = new Function2(str, function0, j3, d85Var, yciVar, o0kVar2, i) { // from class: x5r
                public final /* synthetic */ String a;
                public final /* synthetic */ Function0 b;
                public final /* synthetic */ long c;
                public final /* synthetic */ d85 d;
                public final /* synthetic */ yci e;
                public final /* synthetic */ o0k f;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int R = rvf.R(1);
                    q5g.j(this.a, this.b, this.c, this.d, this.e, this.f, (hq5) obj, R);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void k(yci yciVar, dup dupVar, long j, long j2, dd3 dd3Var, float f, Function2 function2, hq5 hq5Var, int i, int i2) {
        int i3;
        dup dupVar2;
        long j3;
        long j4;
        int i4;
        dd3 dd3Var2;
        int i5;
        float f2;
        Function2 function22;
        yci yciVar2;
        dup dupVar3;
        long j5;
        long j6;
        dd3 dd3Var3;
        float f3;
        xmn r;
        yci yciVar3;
        float f4;
        dup dupVar4;
        long j7;
        dd3 dd3Var4;
        int i6;
        int i7;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1412203386);
        int i8 = i2 & 1;
        if (i8 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (oq5Var.f(yciVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            dupVar2 = dupVar;
            i3 |= oq5Var.f(dupVar2) ? 32 : 16;
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    j3 = j;
                    if (oq5Var.e(j3)) {
                        i7 = 256;
                        i3 |= i7;
                    }
                } else {
                    j3 = j;
                }
                i7 = 128;
                i3 |= i7;
            } else {
                j3 = j;
            }
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    j4 = j2;
                    if (oq5Var.e(j4)) {
                        i6 = 2048;
                        i3 |= i6;
                    }
                } else {
                    j4 = j2;
                }
                i6 = 1024;
                i3 |= i6;
            } else {
                j4 = j2;
            }
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                dd3Var2 = dd3Var;
                i3 |= oq5Var.f(dd3Var2) ? 16384 : RemoteCameraConfig.Notification.ID;
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= 196608;
                } else if ((196608 & i) == 0) {
                    f2 = f;
                    i3 |= oq5Var.c(f2) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
                    if ((1572864 & i) != 0) {
                        function22 = function2;
                        i3 |= oq5Var.h(function22) ? 1048576 : 524288;
                    } else {
                        function22 = function2;
                    }
                    if (oq5Var.P(i3 & 1, (i3 & 599187) == 599186)) {
                        oq5Var.S();
                        yciVar2 = yciVar;
                        dupVar3 = dupVar2;
                        j5 = j3;
                        j6 = j4;
                        dd3Var3 = dd3Var2;
                        f3 = f2;
                    } else {
                        oq5Var.U();
                        if ((i & 1) == 0 || oq5Var.y()) {
                            yci yciVar4 = i8 != 0 ? vci.a : yciVar;
                            if (i9 != 0) {
                                dupVar2 = vnj.i;
                            }
                            if ((i2 & 4) != 0) {
                                j3 = ((ma5) oq5Var.j(pa5.a)).f();
                            }
                            if ((i2 & 8) != 0) {
                                j4 = pa5.b(j3, oq5Var);
                            }
                            if (i4 != 0) {
                                dd3Var2 = null;
                            }
                            if (i5 != 0) {
                                yciVar3 = yciVar4;
                                f4 = 0;
                                dupVar4 = dupVar2;
                                j7 = j3;
                                dd3Var4 = dd3Var2;
                                oq5Var.q();
                                qs5 qs5Var = t2b.b;
                                float f5 = ((cma) oq5Var.j(qs5Var)).a + f4;
                                etn.m(new qzm[]{sb6.a.a(new d85(j4)), qs5Var.a(new cma(f5))}, ild.C(-1822160838, new mtr(yciVar3, dupVar4, j7, f5, dd3Var4, f4, function22), oq5Var), oq5Var, 56);
                                j6 = j4;
                                yciVar2 = yciVar3;
                                dupVar3 = dupVar4;
                                j5 = j7;
                                dd3Var3 = dd3Var4;
                                f3 = f4;
                            } else {
                                yciVar3 = yciVar4;
                            }
                        } else {
                            oq5Var.S();
                            yciVar3 = yciVar;
                        }
                        dupVar4 = dupVar2;
                        j7 = j3;
                        dd3Var4 = dd3Var2;
                        f4 = f2;
                        oq5Var.q();
                        qs5 qs5Var2 = t2b.b;
                        float f52 = ((cma) oq5Var.j(qs5Var2)).a + f4;
                        etn.m(new qzm[]{sb6.a.a(new d85(j4)), qs5Var2.a(new cma(f52))}, ild.C(-1822160838, new mtr(yciVar3, dupVar4, j7, f52, dd3Var4, f4, function22), oq5Var), oq5Var, 56);
                        j6 = j4;
                        yciVar2 = yciVar3;
                        dupVar3 = dupVar4;
                        j5 = j7;
                        dd3Var3 = dd3Var4;
                        f3 = f4;
                    }
                    r = oq5Var.r();
                    if (r == null) {
                        r.d = new rp0(yciVar2, dupVar3, j5, j6, dd3Var3, f3, function2, i, i2);
                        return;
                    }
                    return;
                }
                f2 = f;
                if ((1572864 & i) != 0) {
                }
                if (oq5Var.P(i3 & 1, (i3 & 599187) == 599186)) {
                }
                r = oq5Var.r();
                if (r == null) {
                }
            }
            dd3Var2 = dd3Var;
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            f2 = f;
            if ((1572864 & i) != 0) {
            }
            if (oq5Var.P(i3 & 1, (i3 & 599187) == 599186)) {
            }
            r = oq5Var.r();
            if (r == null) {
            }
        }
        dupVar2 = dupVar;
        if ((i & 384) != 0) {
        }
        if ((i & 3072) != 0) {
        }
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        dd3Var2 = dd3Var;
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        f2 = f;
        if ((1572864 & i) != 0) {
        }
        if (oq5Var.P(i3 & 1, (i3 & 599187) == 599186)) {
        }
        r = oq5Var.r();
        if (r == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void l(Function0 function0, yci yciVar, boolean z, dup dupVar, long j, long j2, dd3 dd3Var, float f, uoi uoiVar, wn5 wn5Var, hq5 hq5Var, int i, int i2) {
        int i3;
        dup dupVar2;
        long j3;
        float f2;
        int i4;
        int i5;
        long j4;
        float f3;
        uoi uoiVar2;
        xmn r;
        uoi uoiVar3;
        int i6;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1560876237);
        if ((i & 6) == 0) {
            i3 = (oq5Var.h(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= oq5Var.f(yciVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= oq5Var.g(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            dupVar2 = dupVar;
            i3 |= oq5Var.f(dupVar2) ? 2048 : 1024;
        } else {
            dupVar2 = dupVar;
        }
        if ((i & 24576) == 0) {
            i3 |= oq5Var.e(j) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((196608 & i) == 0) {
            if ((i2 & 32) == 0) {
                j3 = j2;
                if (oq5Var.e(j3)) {
                    i6 = SQLiteDatabase.OPEN_SHAREDCACHE;
                    i3 |= i6;
                }
            } else {
                j3 = j2;
            }
            i6 = SQLiteDatabase.OPEN_FULLMUTEX;
            i3 |= i6;
        } else {
            j3 = j2;
        }
        if ((1572864 & i) == 0) {
            i3 |= oq5Var.f(dd3Var) ? 1048576 : 524288;
        }
        int i7 = i2 & 128;
        if (i7 != 0) {
            i3 |= 12582912;
        } else if ((12582912 & i) == 0) {
            f2 = f;
            i3 |= oq5Var.c(f2) ? 8388608 : RemoteCameraConfig.Camera.BITRATE;
            i4 = i2 & 256;
            if (i4 == 0) {
                i5 = i3 | 100663296;
            } else {
                int i8 = i3;
                if ((i & 100663296) == 0) {
                    i5 = i8 | (oq5Var.f(uoiVar) ? 67108864 : 33554432);
                } else {
                    i5 = i8;
                }
            }
            if ((i & 805306368) == 0) {
                i5 |= oq5Var.h(wn5Var) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
            }
            if (oq5Var.P(i5 & 1, (i5 & 306783379) == 306783378)) {
                oq5Var.S();
                j4 = j3;
                f3 = f2;
                uoiVar2 = uoiVar;
            } else {
                oq5Var.U();
                if ((i & 1) == 0 || oq5Var.y()) {
                    if ((i2 & 32) != 0) {
                        j3 = pa5.b(j, oq5Var);
                    }
                    if (i7 != 0) {
                        f2 = 0;
                    }
                    if (i4 != 0) {
                        uoiVar3 = null;
                        long j5 = j3;
                        float f4 = f2;
                        oq5Var.q();
                        qs5 qs5Var = t2b.b;
                        float f5 = ((cma) oq5Var.j(qs5Var)).a + f4;
                        etn.m(new qzm[]{sb6.a.a(new d85(j5)), qs5Var.a(new cma(f5))}, ild.C(2031491085, new otr(yciVar, dupVar2, j, f5, dd3Var, f4, uoiVar3, z, function0, wn5Var), oq5Var), oq5Var, 56);
                        f3 = f4;
                        uoiVar2 = uoiVar3;
                        j4 = j5;
                    }
                } else {
                    oq5Var.S();
                }
                uoiVar3 = uoiVar;
                long j52 = j3;
                float f42 = f2;
                oq5Var.q();
                qs5 qs5Var2 = t2b.b;
                float f52 = ((cma) oq5Var.j(qs5Var2)).a + f42;
                etn.m(new qzm[]{sb6.a.a(new d85(j52)), qs5Var2.a(new cma(f52))}, ild.C(2031491085, new otr(yciVar, dupVar2, j, f52, dd3Var, f42, uoiVar3, z, function0, wn5Var), oq5Var), oq5Var, 56);
                f3 = f42;
                uoiVar2 = uoiVar3;
                j4 = j52;
            }
            r = oq5Var.r();
            if (r == null) {
                r.d = new ptr(function0, yciVar, z, dupVar, j, j4, dd3Var, f3, uoiVar2, wn5Var, i, i2);
                return;
            }
            return;
        }
        f2 = f;
        i4 = i2 & 256;
        if (i4 == 0) {
        }
        if ((i & 805306368) == 0) {
        }
        if (oq5Var.P(i5 & 1, (i5 & 306783379) == 306783378)) {
        }
        r = oq5Var.r();
        if (r == null) {
        }
    }

    public static final void m(Function2 function2, Function1 function1, Function2 function22, Function0 function0, wn5 wn5Var, hq5 hq5Var, int i) {
        int i2;
        Function2 function23;
        yci f;
        wn5 wn5Var2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1975738079);
        if ((i & 6) == 0) {
            i2 = (oq5Var.h(function2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.h(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            function23 = function22;
            i2 |= oq5Var.h(function23) ? 256 : 128;
        } else {
            function23 = function22;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var.h(function0) ? 2048 : 1024;
        }
        if ((i2 & 9363) == 9362 && oq5Var.z()) {
            oq5Var.S();
            wn5Var2 = wn5Var;
        } else {
            WeakHashMap weakHashMap = rqv.w;
            yci a = sqv.a(vci.a, new n5g(z7l.h(oq5Var).e, q7g.e));
            Unit unit = Unit.a;
            boolean z = ((i2 & 14) == 4) | ((i2 & 112) == 32) | ((i2 & 896) == 256) | ((i2 & 7168) == 2048);
            Object K = oq5Var.K();
            if (z || K == gq5.a) {
                inr inrVar = new inr(function1, function23, function0, function2, (Continuation) null, 5);
                oq5Var.k0(inrVar);
                K = inrVar;
            }
            f = a.f(new SuspendPointerInputElement(unit, null, null, new dur((Function2) K), 6));
            kfh d = ug3.d(b2c.f, false);
            int i3 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, f);
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
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var, i3, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            wn5Var2 = wn5Var;
            eta.l(6, wn5Var2, oq5Var, true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new tu(i, 25, function2, function1, function22, function0, wn5Var2);
        }
    }

    public static final void n(final String str, yci yciVar, final ges gesVar, final Function1 function1, final int i, final long j, final int i2, final int i3, hq5 hq5Var, int i4) {
        str.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1706154671);
        int i5 = i4 | (oq5Var.f(str) ? 4 : 2) | (oq5Var.f(yciVar) ? 32 : 16) | (oq5Var.f(gesVar) ? 256 : 128) | (oq5Var.e(j) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX) | (oq5Var.d(i2) ? 1048576 : 524288);
        if ((4793491 & i5) == 4793490 && oq5Var.z()) {
            oq5Var.S();
        } else {
            oq5Var.U();
            if ((i4 & 1) != 0 && !oq5Var.y()) {
                oq5Var.S();
            }
            oq5Var.q();
            bg3.a(yciVar, null, false, ild.C(-1665401723, new pyc() { // from class: mds
                @Override // defpackage.pyc
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    androidx.compose.foundation.layout.c cVar = (androidx.compose.foundation.layout.c) obj;
                    hq5 hq5Var2 = (hq5) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    cVar.getClass();
                    if ((intValue & 6) == 0) {
                        intValue |= ((oq5) hq5Var2).f(cVar) ? 4 : 2;
                    }
                    if ((intValue & 19) == 18) {
                        oq5 oq5Var2 = (oq5) hq5Var2;
                        if (oq5Var2.z()) {
                            oq5Var2.S();
                            return Unit.a;
                        }
                    }
                    String str2 = str;
                    mn0 mn0Var = new mn0(6, str2, (ArrayList) null);
                    long b = ga6.b(cVar.b, 0, 0, 0, 0, 10);
                    oq5 oq5Var3 = (oq5) hq5Var2;
                    jx7 jx7Var = (jx7) oq5Var3.j(es5.h);
                    ppc ppcVar = (ppc) oq5Var3.j(es5.k);
                    ges gesVar2 = gesVar;
                    xcs.b(str2, null, j, 0L, null, 0L, null, new o9s(i2), 0L, i3, false, q5g.F(new ogi(mn0Var, gesVar2, b, jx7Var, ppcVar, i, true), str2), 0, function1, gesVar2, oq5Var3, 0, 0, 22010);
                    return Unit.a;
                }
            }, oq5Var), oq5Var, ((i5 >> 3) & 14) | 3072, 6);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new fgo(str, yciVar, gesVar, function1, i, j, i2, i3, i4);
        }
    }

    public static final void o(Function2 function2, Function1 function1, Function2 function22, Function0 function0, wn5 wn5Var, hq5 hq5Var, int i) {
        Function0 function02;
        Function2 function23;
        Function1 function12;
        Function2 function24;
        function2.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-435324531);
        int i2 = (oq5Var.h(function2) ? 4 : 2) | i | (oq5Var.h(function1) ? 32 : 16) | (oq5Var.h(function22) ? 256 : 128) | (oq5Var.h(function0) ? 2048 : 1024);
        if ((i2 & 9363) == 9362 && oq5Var.z()) {
            oq5Var.S();
            function02 = function0;
            function24 = function22;
            function12 = function1;
            function23 = function2;
        } else {
            function02 = function0;
            m(function2, function1, function22, function02, ild.C(-698080665, new lqr(wn5Var, 13), oq5Var), oq5Var, (i2 & 14) | 24576 | (i2 & 112) | (i2 & 896) | (i2 & 7168));
            function23 = function2;
            function12 = function1;
            function24 = function22;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new pli(function23, function12, function24, function02, wn5Var, i);
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public static final void p(defpackage.x53 r33, defpackage.eqp r34, defpackage.yci r35, defpackage.hq5 r36, int r37) {
        /*
            Method dump skipped, instructions count: 437
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q5g.p(x53, eqp, yci, hq5, int):void");
    }

    public static final void q(yci yciVar, hq5 hq5Var, int i) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1119280606);
        int i2 = (oq5Var.f(yciVar) ? 4 : 2) | i;
        if (oq5Var.P(i2 & 1, (i2 & 3) != 2)) {
            pm0.a(lm0.n, ild.C(-737533977, new cxd(yciVar, 19), oq5Var), oq5Var, 48, 0);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new cxd(yciVar, i, 20);
        }
    }

    public static final void r(List list, y8u y8uVar, yci yciVar, hq5 hq5Var, int i, int i2) {
        int i3;
        yci yciVar2;
        int i4;
        oq5 oq5Var;
        yci yciVar3;
        Object zhsVar;
        yci yciVar4;
        Boolean bool;
        boolean z;
        yci yciVar5;
        aqi aqiVar;
        int i5;
        float f;
        y8u y8uVar2;
        oq5 oq5Var2;
        kb5 kb5Var;
        kb5 kb5Var2;
        kb5 kb5Var3;
        kb5 kb5Var4;
        boolean z2;
        oq5 oq5Var3;
        list.getClass();
        oq5 oq5Var4 = (oq5) hq5Var;
        oq5Var4.b0(1068971330);
        if ((i & 6) == 0) {
            i3 = i | (oq5Var4.f(list) ? 4 : 2);
        } else {
            i3 = i;
        }
        int i6 = i3 | (oq5Var4.f(y8uVar) ? 32 : 16);
        int i7 = i2 & 4;
        if (i7 != 0) {
            i4 = i6 | 384;
            yciVar2 = yciVar;
        } else {
            yciVar2 = yciVar;
            i4 = i6 | (oq5Var4.f(yciVar2) ? 256 : 128);
        }
        if (oq5Var4.P(i4 & 1, (i4 & 147) != 146)) {
            vci vciVar = vci.a;
            yci yciVar6 = i7 != 0 ? vciVar : yciVar2;
            aqi Q = szf.Q(y8uVar.e(), oq5Var4);
            aqi Q2 = szf.Q(y8uVar.g(), oq5Var4);
            aqi Q3 = szf.Q(y8uVar.p(), oq5Var4);
            aqi Q4 = szf.Q(y8uVar.getProgress(), oq5Var4);
            aqi Q5 = szf.Q(y8uVar.v(), oq5Var4);
            aqi Q6 = szf.Q(y8uVar.t(), oq5Var4);
            aqi Q7 = szf.Q(y8uVar.o(), oq5Var4);
            aqi Q8 = szf.Q(y8uVar.h(), oq5Var4);
            yci c = d.c(yciVar6, 1.0f);
            Boolean bool2 = (Boolean) Q6.getValue();
            boolean booleanValue = bool2.booleanValue();
            int i8 = i4 & 112;
            boolean z3 = i8 == 32;
            Object K = oq5Var4.K();
            kjn kjnVar = gq5.a;
            if (z3 || K == kjnVar) {
                yciVar4 = c;
                bool = bool2;
                z = booleanValue;
                yciVar5 = yciVar6;
                aqiVar = Q;
                i5 = i8;
                f = 1.0f;
                zhsVar = new zhs(0, y8uVar, y8u.class, "toggleControlsFromAccessibility", "toggleControlsFromAccessibility()V", 0, 24);
                y8uVar2 = y8uVar;
                oq5Var4.k0(zhsVar);
            } else {
                yciVar4 = c;
                bool = bool2;
                z = booleanValue;
                yciVar5 = yciVar6;
                aqiVar = Q;
                i5 = i8;
                f = 1.0f;
                zhsVar = K;
                y8uVar2 = y8uVar;
            }
            Function0 function0 = (Function0) ((h9f) zhsVar);
            yciVar4.getClass();
            function0.getClass();
            yci f2 = yciVar4.f(new ubf("com.yandex.music.screen.videoclip.ui.screen.clipAccessibilityControls", bool, function0, new e4k(1, function0, z)));
            iz2 iz2Var = b2c.b;
            kfh d = ug3.d(iz2Var, false);
            int i9 = oq5Var4.P;
            androidx.compose.runtime.internal.a l = oq5Var4.l();
            yci H = vnj.H(oq5Var4, f2);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var4.d0();
            if (oq5Var4.O) {
                oq5Var4.k(grbVar);
            } else {
                oq5Var4.n0();
            }
            kb5 kb5Var5 = wp5.f;
            g0g.U(oq5Var4, d, kb5Var5);
            kb5 kb5Var6 = wp5.e;
            g0g.U(oq5Var4, l, kb5Var6);
            kb5 kb5Var7 = wp5.g;
            if (oq5Var4.O || !Intrinsics.d(oq5Var4.K(), Integer.valueOf(i9))) {
                ouj.x(i9, oq5Var4, i9, kb5Var7);
            }
            kb5 kb5Var8 = wp5.d;
            g0g.U(oq5Var4, H, kb5Var8);
            if (((ExoPlayer) Q2.getValue()) != null) {
                oq5Var4.Z(-1833024569);
                yci c2 = d.c(vciVar, f);
                ExoPlayer exoPlayer = (ExoPlayer) Q2.getValue();
                exoPlayer.getClass();
                kb5Var4 = kb5Var5;
                kb5Var = kb5Var8;
                kb5Var2 = kb5Var6;
                kb5Var3 = kb5Var7;
                y7g.f(exoPlayer, c2, null, null, oq5Var4, 48, 12);
                oq5Var2 = oq5Var4;
                z2 = false;
            } else {
                oq5Var2 = oq5Var4;
                kb5Var = kb5Var8;
                kb5Var2 = kb5Var6;
                kb5Var3 = kb5Var7;
                kb5Var4 = kb5Var5;
                z2 = false;
                oq5Var2.Z(-1837198502);
            }
            oq5Var2.p(z2);
            yci c3 = d.c(vciVar, f);
            boolean z4 = i5 == 32;
            Object K2 = oq5Var2.K();
            if (z4 || K2 == kjnVar) {
                K2 = new b6u(y8uVar2, 0);
                oq5Var2.k0(K2);
            }
            yci e = androidx.compose.foundation.a.e(c3, false, null, null, (Function0) K2, 7);
            kfh d2 = ug3.d(iz2Var, false);
            int i10 = oq5Var2.P;
            androidx.compose.runtime.internal.a l2 = oq5Var2.l();
            yci H2 = vnj.H(oq5Var2, e);
            oq5Var2.d0();
            if (oq5Var2.O) {
                oq5Var2.k(grbVar);
            } else {
                oq5Var2.n0();
            }
            g0g.U(oq5Var2, d2, kb5Var4);
            g0g.U(oq5Var2, l2, kb5Var2);
            if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i10))) {
                ouj.x(i10, oq5Var2, i10, kb5Var3);
            }
            g0g.U(oq5Var2, H2, kb5Var);
            m4u m4uVar = (m4u) list.get(((Number) Q3.getValue()).intValue());
            String str = m4uVar.a.b;
            boolean f3 = (i5 == 32) | oq5Var2.f(m4uVar);
            Object K3 = oq5Var2.K();
            Continuation continuation = null;
            if (f3 || K3 == kjnVar) {
                K3 = new i6u(y8uVar2, m4uVar, continuation, 0);
                oq5Var2.k0(K3);
            }
            gld.w(oq5Var2, str, (Function2) K3);
            q84 q84Var = (q84) Q8.getValue();
            boolean booleanValue2 = ((Boolean) aqiVar.getValue()).booleanValue();
            boolean z5 = ((Number) Q3.getValue()).intValue() > 0;
            boolean z6 = ((Number) Q3.getValue()).intValue() < list.size() + (-1);
            boolean booleanValue3 = ((Boolean) Q6.getValue()).booleanValue();
            boolean booleanValue4 = ((Boolean) Q7.getValue()).booleanValue();
            boolean booleanValue5 = ((Boolean) Q5.getValue()).booleanValue();
            m6u m6uVar = (m6u) Q4.getValue();
            m6u m6uVar2 = Intrinsics.d(m6uVar.a, m4uVar.a.b) ? m6uVar : null;
            boolean z7 = i5 == 32;
            Object K4 = oq5Var2.K();
            if (z7 || K4 == kjnVar) {
                oq5Var3 = oq5Var2;
                lgq lgqVar = new lgq(1, y8uVar, y8u.class, "seekTo", "seekTo(F)V", 0, 19);
                oq5Var3.k0(lgqVar);
                K4 = lgqVar;
            } else {
                oq5Var3 = oq5Var2;
            }
            h9f h9fVar = (h9f) K4;
            boolean z8 = i5 == 32;
            Object K5 = oq5Var3.K();
            if (z8 || K5 == kjnVar) {
                K5 = new zhs(0, y8uVar, y8u.class, "collapsePlayer", "collapsePlayer()V", 0, 27);
                oq5Var3.k0(K5);
            }
            h9f h9fVar2 = (h9f) K5;
            boolean z9 = i5 == 32;
            Object K6 = oq5Var3.K();
            if (z9 || K6 == kjnVar) {
                K6 = new zhs(0, y8uVar, y8u.class, "showOverflow", "showOverflow()V", 0, 28);
                oq5Var3.k0(K6);
            }
            h9f h9fVar3 = (h9f) K6;
            boolean z10 = i5 == 32;
            Object K7 = oq5Var3.K();
            if (z10 || K7 == kjnVar) {
                K7 = new zhs(0, y8uVar, y8u.class, "rewind", "rewind()V", 0, 29);
                oq5Var3.k0(K7);
            }
            h9f h9fVar4 = (h9f) K7;
            boolean z11 = i5 == 32;
            Object K8 = oq5Var3.K();
            if (z11 || K8 == kjnVar) {
                K8 = new j6u(0, y8uVar, y8u.class, "skip", "skip()V", 0, 0);
                oq5Var3.k0(K8);
            }
            h9f h9fVar5 = (h9f) K8;
            boolean z12 = i5 == 32;
            Object K9 = oq5Var3.K();
            if (z12 || K9 == kjnVar) {
                K9 = new j6u(0, y8uVar, y8u.class, "play", "play()V", 0, 1);
                oq5Var3.k0(K9);
            }
            h9f h9fVar6 = (h9f) K9;
            boolean z13 = i5 == 32;
            Object K10 = oq5Var3.K();
            if (z13 || K10 == kjnVar) {
                K10 = new j6u(0, y8uVar, y8u.class, "pause", "pause()V", 0, 2);
                oq5Var3.k0(K10);
            }
            h9f h9fVar7 = (h9f) K10;
            boolean z14 = i5 == 32;
            Object K11 = oq5Var3.K();
            if (z14 || K11 == kjnVar) {
                K11 = new zhs(0, y8uVar, y8u.class, "toggleLike", "toggleLike()V", 0, 25);
                oq5Var3.k0(K11);
            }
            h9f h9fVar8 = (h9f) K11;
            boolean z15 = i5 == 32;
            Object K12 = oq5Var3.K();
            if (z15 || K12 == kjnVar) {
                K12 = new zhs(0, y8uVar, y8u.class, "onCast", "onCast()V", 0, 26);
                oq5Var3.k0(K12);
            }
            oq5 oq5Var5 = oq5Var3;
            e(m4uVar, q84Var, booleanValue2, z5, z6, booleanValue3, booleanValue4, booleanValue5, m6uVar2, (Function1) h9fVar, (Function0) h9fVar3, (Function0) h9fVar2, (Function0) h9fVar4, (Function0) h9fVar5, (Function0) h9fVar6, (Function0) h9fVar7, (Function0) h9fVar8, (Function0) ((h9f) K12), oq5Var5, 0);
            oq5Var = oq5Var5;
            oq5Var.p(true);
            oq5Var.p(true);
            yciVar3 = yciVar5;
        } else {
            oq5Var = oq5Var4;
            oq5Var.S();
            yciVar3 = yciVar2;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new d6u(list, y8uVar, yciVar3, i, i2, 0);
        }
    }

    public static final void s(tlf tlfVar, Function0 function0, Function0 function02, yci yciVar, hq5 hq5Var, int i) {
        function0.getClass();
        function02.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1038114992);
        int i2 = i | (oq5Var.h(tlfVar) ? 4 : 2) | (oq5Var.h(function0) ? 32 : 16) | (oq5Var.h(function02) ? 256 : 128) | (oq5Var.f(yciVar) ? 2048 : 1024);
        if ((i2 & 1171) == 1170 && oq5Var.z()) {
            oq5Var.S();
        } else {
            yci i3 = androidx.compose.foundation.a.i(androidx.compose.foundation.a.b(androidx.compose.foundation.layout.a.o(d.g(d.z(yciVar, 3), 40, 0.0f, 2), 56, 0.0f, 2), d85.l, vnj.i), null, irf.S(function02, oq5Var, (i2 >> 6) & 14), function0, 47);
            kfh d = ug3.d(b2c.b, false);
            int i4 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, i3);
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
            xv7.j(tlfVar.getClass().getSimpleName(), null, 0L, 0L, 0L, 0, 0L, 0, false, 0, 0, null, null, oq5Var, 0, 0, 131070);
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new mqr(i, 11, tlfVar, function0, function02, yciVar);
        }
    }

    public static final yci t(yci yciVar, dup dupVar, long j, dd3 dd3Var, float f) {
        yci d0 = y1g.d0(yciVar, f, dupVar, false, 24);
        yci yciVar2 = vci.a;
        if (dd3Var != null) {
            yciVar2 = c3x.z(yciVar2, dd3Var.a, dd3Var.b, dupVar);
        }
        return xp3.u(androidx.compose.foundation.a.b(d0.f(yciVar2), j, dupVar), dupVar);
    }

    public static final long u(long j, wl7 wl7Var, float f, oq5 oq5Var) {
        if (!d85.c(j, ((ma5) oq5Var.j(pa5.a)).f()) || wl7Var == null) {
            oq5Var.Z(1082990783);
            oq5Var.p(false);
            return j;
        }
        oq5Var.Z(1082922676);
        long a = wl7.a(f, 0, j, oq5Var);
        oq5Var.p(false);
        return a;
    }

    public static final float v(long j) {
        if (Float.intBitsToFloat((int) (j >> 32)) == 0.0f && Float.intBitsToFloat((int) (j & 4294967295L)) == 0.0f) {
            return 0.0f;
        }
        return ((-((float) Math.atan2(Float.intBitsToFloat(r0), Float.intBitsToFloat((int) (j & 4294967295L))))) * 180.0f) / 3.1415927f;
    }

    public static final uvn w(drf drfVar) {
        drfVar.getClass();
        if (drfVar instanceof uvn) {
            return (uvn) drfVar;
        }
        return null;
    }

    public static final rmb x(tmb tmbVar, s63 s63Var) {
        u0s u0sVar;
        tmbVar.getClass();
        s63Var.getClass();
        drf drfVar = s63Var.a;
        String str = drfVar.a().a;
        String str2 = drfVar.a().b;
        int i = s63Var.b + 1;
        str2.getClass();
        str.getClass();
        lab labVar = new lab(1, i, 0, str2, str);
        t63 t63Var = s63Var.d;
        if (t63Var != null) {
            u0sVar = new u0s(t63Var.a, t63Var.b, t63Var.c);
        } else {
            u0sVar = null;
        }
        return tmbVar.a(labVar, u0sVar);
    }

    public static final long y(ffm ffmVar, boolean z) {
        List list = ffmVar.a;
        int size = list.size();
        long j = 0;
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            lfm lfmVar = (lfm) list.get(i2);
            if (lfmVar.d && lfmVar.h) {
                j = enj.h(j, z ? lfmVar.c : lfmVar.g);
                i++;
            }
        }
        if (i == 0) {
            return 9205357640488583168L;
        }
        return enj.b(i, j);
    }

    public static final float z(ffm ffmVar, boolean z) {
        long y = y(ffmVar, z);
        float f = 0.0f;
        if (enj.c(y, 9205357640488583168L)) {
            return 0.0f;
        }
        List list = ffmVar.a;
        int size = list.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            lfm lfmVar = (lfm) list.get(i2);
            if (lfmVar.d && lfmVar.h) {
                i++;
                f = enj.d(enj.g(z ? lfmVar.c : lfmVar.g, y)) + f;
            }
        }
        return f / i;
    }
}
