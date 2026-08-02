package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.util.Patterns;
import android.util.TypedValue;
import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.yandex.media.ynison.service.a0;
import com.yandex.media.ynison.service.x;
import com.yandex.music.shared.dto.domainitem.ArtistDomainItemDto;
import com.yandex.music.shared.wizard.entry.data.dto.WizardEntryBlockDto;
import io.appmetrica.analytics.BuildConfig;
import j$.time.ZonedDateTime;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.zip.Inflater;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.c;
import ru.yandex.music.R;
import ru.yandex.music.data.stores.CoverPath;

/* loaded from: classes.dex */
public abstract class ocg {
    public static Field a;
    public static boolean b;
    public static Class c;
    public static boolean d;
    public static Field e;
    public static boolean f;
    public static Field g;
    public static boolean h;
    public static bde i;

    public static final boolean A(Resources.Theme theme, int i2, boolean z) {
        theme.getClass();
        TypedValue z2 = z(i2, theme);
        return z2 != null ? z2.data != 0 : z;
    }

    public static final int B(int i2, Resources.Theme theme) {
        theme.getClass();
        TypedValue z = z(i2, theme);
        if (z != null) {
            return z.data;
        }
        xq0.x("No integer for passed attribute");
        return 0;
    }

    public static int C(int i2, Resources.Theme theme) {
        theme.getClass();
        TypedValue z = z(i2, theme);
        if (z != null) {
            return z.resourceId;
        }
        return 0;
    }

    public static final mnp D(szb szbVar) {
        szbVar.getClass();
        String obj = szbVar.b().toString();
        obj.getClass();
        Matcher matcher = Patterns.WEB_URL.matcher(obj);
        mnp mnpVar = new mnp();
        while (matcher.find()) {
            String group = matcher.group();
            group.getClass();
            if (c.v(group, "https", true)) {
                mnpVar.add(group);
            }
        }
        return uop.a(mnpVar);
    }

    public static h06 E(us5 us5Var, int i2) {
        us5Var.getClass();
        String str = us5Var.a;
        String str2 = us5Var.c;
        String str3 = us5Var.i;
        String str4 = us5Var.j;
        ZonedDateTime zonedDateTime = us5Var.h;
        String str5 = us5Var.l;
        String str6 = us5Var.n;
        String pathForSize = us5Var.r.a.getPathForSize(i2);
        pathForSize.getClass();
        return new h06(str, str2, null, str3, str4, zonedDateTime, str5, str6, pathForSize, 0, us5Var.f, us5Var.g, us5Var.q);
    }

    public static final w1s F(r0s r0sVar) {
        r0sVar.getClass();
        String str = r0sVar.a;
        String str2 = r0sVar.b;
        String str3 = r0sVar.c;
        List<CoverPath> list = r0sVar.d;
        ArrayList arrayList = new ArrayList(v75.o(list, 10));
        for (CoverPath coverPath : list) {
            arrayList.add(y1s.a[coverPath.getType().ordinal()] == 1 ? null : coverPath.getPathForSize(wct.s()));
        }
        return new w1s(str, str2, str3, arrayList);
    }

    public static final ArrayList G(List list) {
        list.getClass();
        List list2 = list;
        ArrayList arrayList = new ArrayList(v75.o(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(F((r0s) it.next()));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [c5b] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
    public static final juv H(WizardEntryBlockDto wizardEntryBlockDto) {
        ?? r4;
        wizardEntryBlockDto.getClass();
        String title = wizardEntryBlockDto.getTitle();
        if (title == null || StringsKt.U(title)) {
            return null;
        }
        String title2 = wizardEntryBlockDto.getTitle();
        String subtitle = wizardEntryBlockDto.getSubtitle();
        Boolean needToPassWizard = wizardEntryBlockDto.getNeedToPassWizard();
        boolean booleanValue = needToPassWizard != null ? needToPassWizard.booleanValue() : false;
        List<ArtistDomainItemDto> artists = wizardEntryBlockDto.getArtists();
        if (artists != null) {
            r4 = new ArrayList();
            for (ArtistDomainItemDto artistDomainItemDto : artists) {
                u51 K = artistDomainItemDto != null ? ltg.K(artistDomainItemDto) : null;
                if (K != null) {
                    r4.add(K);
                }
            }
        } else {
            r4 = c5b.a;
        }
        return new juv(title2, subtitle, r4, booleanValue);
    }

    public static String I(String str, Object... objArr) {
        int length;
        int length2;
        int indexOf;
        String s;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            length = objArr.length;
            if (i3 >= length) {
                break;
            }
            Object obj = objArr[i3];
            if (obj == null) {
                s = "null";
            } else {
                try {
                    s = obj.toString();
                } catch (Exception e2) {
                    String o = ouj.o(obj.getClass().getName(), "@", Integer.toHexString(System.identityHashCode(obj)));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(o), (Throwable) e2);
                    s = hrg.s("<", o, " threw ", e2.getClass().getName(), ">");
                }
            }
            objArr[i3] = s;
            i3++;
        }
        StringBuilder sb = new StringBuilder(str.length() + (length * 16));
        int i4 = 0;
        while (true) {
            length2 = objArr.length;
            if (i2 >= length2 || (indexOf = str.indexOf("%s", i4)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i4, indexOf);
            sb.append(objArr[i2]);
            i2++;
            i4 = indexOf + 2;
        }
        sb.append((CharSequence) str, i4, str.length());
        if (i2 < length2) {
            sb.append(" [");
            sb.append(objArr[i2]);
            for (int i5 = i2 + 1; i5 < objArr.length; i5++) {
                sb.append(", ");
                sb.append(objArr[i5]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static final void a(zrj zrjVar, Function0 function0, yci yciVar, hq5 hq5Var, int i2) {
        oq5 oq5Var;
        zrjVar.getClass();
        function0.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(671413713);
        int i3 = i2 | (oq5Var2.f(zrjVar) ? 4 : 2) | (oq5Var2.h(function0) ? 32 : 16);
        if (oq5Var2.P(i3 & 1, (i3 & 147) != 146)) {
            yci b2 = a.b(androidx.compose.ui.platform.a.a(a.e(xp3.u(androidx.compose.foundation.layout.a.o(d.d(yciVar, 1.0f), 16, 0.0f, 2), ugo.a(8)), false, null, new meo(0), function0, 3), "misspell_search_hint"), ((dq0) oq5Var2.j(eq0.a)).d.c, vnj.i);
            kfh d2 = ug3.d(b2c.f, false);
            int i4 = oq5Var2.P;
            androidx.compose.runtime.internal.a l = oq5Var2.l();
            yci H = vnj.H(oq5Var2, b2);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var2.d0();
            if (oq5Var2.O) {
                oq5Var2.k(grbVar);
            } else {
                oq5Var2.n0();
            }
            g0g.U(oq5Var2, d2, wp5.f);
            g0g.U(oq5Var2, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var2, i4, kb5Var);
            }
            g0g.U(oq5Var2, H, wp5.d);
            String str = zrjVar.a;
            xcs.c(o8g.x(rvf.N(R.string.misspell_search_hint, new Object[]{str}, oq5Var2), StringsKt.T(rvf.M(R.string.misspell_search_hint, oq5Var2), "%s", 0, false, 6), str.length(), oq5Var2), androidx.compose.foundation.layout.a.m(vci.a, 12), 0L, 0L, null, 0L, new o9s(3), 0L, 0, false, 0, 0, null, null, nu0.j(), oq5Var2, 48, 0, 130556);
            oq5Var = oq5Var2;
            oq5Var.p(true);
        } else {
            oq5Var = oq5Var2;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new q6h(zrjVar, function0, yciVar, i2, 1);
        }
    }

    public static final void b(mvi mviVar, dvi dviVar, fvf fvfVar, o0k o0kVar, String str, hq5 hq5Var, int i2) {
        int i3;
        fvf fvfVar2;
        o0k o0kVar2 = o0kVar;
        fvfVar.getClass();
        o0kVar2.getClass();
        str.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1387931509);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var.f(mviVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? oq5Var.f(dviVar) : oq5Var.h(dviVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            fvfVar2 = fvfVar;
            i3 |= oq5Var.f(fvfVar2) ? 256 : 128;
        } else {
            fvfVar2 = fvfVar;
        }
        if ((i2 & 3072) == 0) {
            i3 |= oq5Var.f(o0kVar2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= oq5Var.f(str) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        boolean z = true;
        if (!oq5Var.P(i3 & 1, (i3 & 9363) != 9362)) {
            oq5Var.S();
        } else if (((Boolean) gld.M(dviVar.e, oq5Var).getValue()).booleanValue()) {
            oq5Var.Z(217768393);
            gz2 gz2Var = b2c.o;
            boolean z2 = ((i3 & 14) == 4) | ((57344 & i3) == 16384);
            if ((i3 & 112) != 32 && ((i3 & 64) == 0 || !oq5Var.h(dviVar))) {
                z = false;
            }
            boolean z3 = z2 | z;
            Object K = oq5Var.K();
            if (z3 || K == gq5.a) {
                K = new p3e(9, str, mviVar, dviVar);
                oq5Var.k0(K);
            }
            int i4 = i3 >> 3;
            weo.f(null, fvfVar2, o0kVar2, null, gz2Var, null, false, null, (Function1) K, oq5Var, (i4 & 112) | 196608 | (i4 & 896), 473);
            o0kVar2 = o0kVar2;
            oq5Var.p(false);
        } else {
            oq5Var.Z(218864708);
            hag.c((i3 >> 12) & 14, oq5Var, androidx.compose.foundation.layout.a.l(vci.a, o0kVar2), str);
            oq5Var.p(false);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new tu(i2, 22, mviVar, dviVar, fvfVar, o0kVar2, str);
        }
    }

    public static final void c(String str, String str2, j0s j0sVar, Function1 function1, hq5 hq5Var, int i2) {
        str.getClass();
        str2.getClass();
        j0sVar.getClass();
        function1.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1139413800);
        int i3 = i2 | (oq5Var.f(str) ? 4 : 2) | (oq5Var.f(str2) ? 32 : 16) | (oq5Var.d(j0sVar.ordinal()) ? 256 : 128) | (oq5Var.h(function1) ? 2048 : 1024);
        if (oq5Var.P(i3 & 1, (i3 & 1171) != 1170)) {
            int i4 = i3 & 7168;
            boolean z = i4 == 2048;
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (z || K == kjnVar) {
                K = new pl3(3, function1);
                oq5Var.k0(K);
            }
            Function0 function0 = (Function0) K;
            boolean z2 = i4 == 2048;
            Object K2 = oq5Var.K();
            if (z2 || K2 == kjnVar) {
                K2 = new pl3(4, function1);
                oq5Var.k0(K2);
            }
            dag.m(str, str2, function0, (Function0) K2, j0sVar, androidx.compose.foundation.layout.a.q(d.d(vci.a, 1.0f), 0.0f, 0.0f, 0.0f, 16, 7), oq5Var, (i3 & 14) | 196608 | (i3 & 112) | ((i3 << 6) & 57344));
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new av5(i2, 26, str, str2, j0sVar, function1);
        }
    }

    public static final void d(xam xamVar, u0s u0sVar, jab jabVar, thj thjVar, rbm rbmVar, hq5 hq5Var, int i2) {
        oq5 oq5Var;
        oq5 oq5Var2;
        wdj G;
        u0s u0sVar2 = u0sVar;
        jab jabVar2 = jabVar;
        rbm rbmVar2 = rbmVar;
        rbmVar2.getClass();
        oq5 oq5Var3 = (oq5) hq5Var;
        oq5Var3.b0(-2073560641);
        int i3 = i2 | (oq5Var3.f(xamVar) ? 4 : 2) | (oq5Var3.h(u0sVar2) ? 32 : 16) | (oq5Var3.h(jabVar2) ? 256 : 128) | (oq5Var3.h(thjVar) ? 2048 : 1024) | (oq5Var3.f(rbmVar2) ? 16384 : RemoteCameraConfig.Notification.ID);
        if (oq5Var3.P(i3 & 1, (i3 & 9363) != 9362)) {
            ham hamVar = xamVar.a;
            saj sajVar = hamVar.e;
            if (sajVar == null) {
                oq5Var3.Z(1069848654);
                oq5Var3.p(false);
                G = null;
                oq5Var2 = oq5Var3;
            } else {
                mqs mqsVar = sajVar.b;
                oq5Var3.Z(1069848655);
                oq5Var2 = oq5Var3;
                int i4 = i3 << 6;
                G = t7g.G(rbmVar2, mqsVar, 0, u0sVar2, jabVar, szf.M(mqsVar, 0, 0), oq5Var2, (i4 & 57344) | ((i3 >> 12) & 14) | 1573248 | (i4 & 7168), 0);
                rbmVar2 = rbmVar2;
                u0sVar2 = u0sVar2;
                jabVar2 = jabVar;
                oq5Var2.p(false);
            }
            wdj wdjVar = G;
            int i5 = i3 & 57344;
            boolean h2 = (i5 == 16384) | oq5Var2.h(jabVar2) | oq5Var2.h(u0sVar2);
            Object K = oq5Var2.K();
            kjn kjnVar = gq5.a;
            if (h2 || K == kjnVar) {
                K = new eam(rbmVar2, jabVar2, u0sVar2, 0);
                oq5Var2.k0(K);
            }
            Function0 function0 = (Function0) K;
            Object K2 = oq5Var2.K();
            if (K2 == kjnVar) {
                K2 = new hvl(15);
                oq5Var2.k0(K2);
            }
            Function0 function02 = (Function0) K2;
            yci q = androidx.compose.foundation.layout.a.q(vci.a, 0.0f, 8, 0.0f, 0.0f, 13);
            boolean h3 = oq5Var2.h(jabVar2) | (i5 == 16384) | oq5Var2.h(thjVar) | oq5Var2.h(u0sVar2);
            Object K3 = oq5Var2.K();
            if (h3 || K3 == kjnVar) {
                gam gamVar = new gam(rbmVar2, jabVar2, thjVar, u0sVar, 0);
                oq5Var2.k0(gamVar);
                K3 = gamVar;
            }
            oq5 oq5Var4 = oq5Var2;
            pcg.g(hamVar, wdjVar, function0, function02, com.yandex.music.core.ui.compose.a.b(q, null, 0L, 0.0f, null, (Function2) K3, 15), oq5Var4, 3072);
            oq5Var = oq5Var4;
        } else {
            oq5Var = oq5Var3;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new pli(i2, 8, xamVar, u0sVar, jabVar, thjVar, rbmVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void e(final String str, final j5 j5Var, yci yciVar, d85 d85Var, hq5 hq5Var, final int i2, final int i3) {
        int i4;
        yci yciVar2;
        int i5;
        d85 d85Var2;
        String str2;
        final yci yciVar3;
        final d85 d85Var3;
        xmn r;
        Function2 function2;
        str.getClass();
        j5Var.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1753819830);
        if ((i2 & 6) == 0) {
            i4 = (oq5Var.f(str) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= oq5Var.f(j5Var) ? 32 : 16;
        }
        int i6 = i3 & 4;
        if (i6 != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            yciVar2 = yciVar;
            i4 |= oq5Var.f(yciVar2) ? 256 : 128;
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else if ((i2 & 3072) == 0) {
                d85Var2 = d85Var;
                i4 |= oq5Var.f(d85Var2) ? 2048 : 1024;
                if ((i4 & 1171) == 1170 || !oq5Var.z()) {
                    yci yciVar4 = vci.a;
                    final yci yciVar5 = i6 != 0 ? yciVar4 : yciVar2;
                    String str3 = null;
                    d85 d85Var4 = i5 != 0 ? null : d85Var2;
                    if (((Boolean) oq5Var.j(koe.a)).booleanValue()) {
                        oq5Var.Z(230802587);
                        qo6 qo6Var = qo6.k;
                        gce gceVar = gce.d;
                        if (j5Var instanceof htq) {
                            yciVar4 = xp3.u(yciVar4, ((htq) j5Var).e);
                        }
                        yci f2 = yciVar5.f(yciVar4);
                        boolean z = (i4 & 112) == 32;
                        Object K = oq5Var.K();
                        if (z || K == gq5.a) {
                            K = new kzp(14, j5Var);
                            oq5Var.k0(K);
                        }
                        swf.d(qo6Var, gceVar, androidx.compose.ui.draw.a.c(f2, (Function1) K), null, 0L, 0L, false, oq5Var, 54, 120);
                        oq5Var.p(false);
                        r = oq5Var.r();
                        if (r != null) {
                            final int i7 = 0;
                            final d85 d85Var5 = d85Var4;
                            function2 = new Function2() { // from class: ktq
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    switch (i7) {
                                        case 0:
                                            ((Integer) obj2).getClass();
                                            ocg.e(str, j5Var, yciVar5, d85Var5, (hq5) obj, rvf.R(i2 | 1), i3);
                                            break;
                                        default:
                                            ((Integer) obj2).getClass();
                                            ocg.e(str, j5Var, yciVar5, d85Var5, (hq5) obj, rvf.R(i2 | 1), i3);
                                            break;
                                    }
                                    return Unit.a;
                                }
                            };
                            r.d = function2;
                            return;
                        }
                        return;
                    }
                    str2 = str;
                    yci yciVar6 = yciVar5;
                    d85 d85Var6 = d85Var4;
                    oq5Var.Z(228549848);
                    oq5Var.p(false);
                    pce pceVar = new pce((Context) oq5Var.j(AndroidCompositionLocals_androidKt.b));
                    pceVar.c = str2;
                    pceVar.o = Boolean.FALSE;
                    rce a2 = pceVar.a();
                    jd6 jd6Var = (jd6) j5Var.a;
                    iz2 iz2Var = (iz2) j5Var.b;
                    if (j5Var instanceof htq) {
                        yciVar4 = xp3.u(yciVar4, ((htq) j5Var).e);
                    }
                    yci f3 = yciVar6.f(yciVar4);
                    Integer num = (Integer) j5Var.c;
                    if (num == null) {
                        oq5Var.Z(232024792);
                    } else {
                        oq5Var.Z(232024793);
                        str3 = rvf.M(num.intValue(), oq5Var);
                    }
                    oq5Var.p(false);
                    wn5 C = ild.C(2021597290, new f6p(7, d85Var6, j5Var), oq5Var);
                    oq5Var = oq5Var;
                    w1g.j(a2, str3, f3, null, null, iz2Var, jd6Var, 0.0f, null, 0, C, oq5Var, 0, 920);
                    yciVar3 = yciVar6;
                    d85Var3 = d85Var6;
                } else {
                    oq5Var.S();
                    str2 = str;
                    yciVar3 = yciVar2;
                    d85Var3 = d85Var2;
                }
                r = oq5Var.r();
                if (r != null) {
                    final int i8 = 1;
                    final String str4 = str2;
                    function2 = new Function2() { // from class: ktq
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            switch (i8) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    ocg.e(str4, j5Var, yciVar3, d85Var3, (hq5) obj, rvf.R(i2 | 1), i3);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    ocg.e(str4, j5Var, yciVar3, d85Var3, (hq5) obj, rvf.R(i2 | 1), i3);
                                    break;
                            }
                            return Unit.a;
                        }
                    };
                    r.d = function2;
                    return;
                }
                return;
            }
            d85Var2 = d85Var;
            if ((i4 & 1171) == 1170) {
            }
            yci yciVar42 = vci.a;
            if (i6 != 0) {
            }
            String str32 = null;
            if (i5 != 0) {
            }
            if (((Boolean) oq5Var.j(koe.a)).booleanValue()) {
            }
        }
        yciVar2 = yciVar;
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        d85Var2 = d85Var;
        if ((i4 & 1171) == 1170) {
        }
        yci yciVar422 = vci.a;
        if (i6 != 0) {
        }
        String str322 = null;
        if (i5 != 0) {
        }
        if (((Boolean) oq5Var.j(koe.a)).booleanValue()) {
        }
    }

    public static final void f(float f2, Function0 function0, Function0 function02, Function0 function03, Function0 function04, hq5 hq5Var, int i2) {
        int i3;
        Function0 function05;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-20036773);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var.c(f2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var.h(function0) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            function05 = function02;
            i3 |= oq5Var.h(function05) ? 256 : 128;
        } else {
            function05 = function02;
        }
        if ((i2 & 3072) == 0) {
            i3 |= oq5Var.h(function03) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= oq5Var.h(function04) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((i3 & 9363) == 9362 && oq5Var.z()) {
            oq5Var.S();
        } else {
            bde bdeVar = i;
            if (bdeVar == null) {
                float f3 = 21;
                ade adeVar = new ade("SparkleIcon", f3, f3, 21.0f, 21.0f, 0L, 0, false, 224);
                f3r f3rVar = new f3r(d85.f);
                ArrayList arrayList = new ArrayList(32);
                arrayList.add(new qak(9.70765f, 20.7692f));
                arrayList.add(new nak(9.36771f, 15.5375f, 5.15137f, 11.4025f, 0.0f, 11.4025f));
                arrayList.add(new dbk(10.0497f));
                arrayList.add(new nak(5.3736f, 10.0497f, 9.72977f, 5.55031f, 9.72977f, 0.0f));
                arrayList.add(new oak(11.0395f));
                arrayList.add(new nak(11.0395f, 5.55031f, 15.3956f, 10.0497f, 20.7692f, 10.0497f));
                arrayList.add(new dbk(11.4025f));
                arrayList.add(new nak(15.6179f, 11.4025f, 11.4015f, 15.5375f, 11.0616f, 20.7692f));
                arrayList.add(new oak(9.70765f));
                arrayList.add(mak.c);
                ade.a(adeVar, arrayList, 1, f3rVar, 0);
                bdeVar = adeVar.b();
                i = bdeVar;
            }
            bde bdeVar2 = bdeVar;
            long j = d85.f;
            yci m = d.m(vci.a, f2);
            boolean z = ((i3 & 7168) == 2048) | ((57344 & i3) == 16384) | ((i3 & 112) == 32) | ((i3 & 896) == 256);
            Object K = oq5Var.K();
            if (z || K == gq5.a) {
                q9v q9vVar = new q9v(function04, function03, function0, function05, 0);
                oq5Var.k0(q9vVar);
                K = q9vVar;
            }
            gae.a(bdeVar2, androidx.compose.ui.graphics.a.a(m, (Function1) K), j, oq5Var, 3120, 0);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new o7a(f2, function0, function02, function03, function04, i2);
        }
    }

    public static final void g(float f2, final yci yciVar, final float f3, hq5 hq5Var, final int i2, final int i3) {
        int i4;
        int i5;
        float f4;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1652274306);
        if ((i2 & 6) == 0) {
            i4 = (oq5Var.c(f2) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i6 = i4 | (oq5Var.f(yciVar) ? 32 : 16);
        int i7 = i3 & 4;
        if (i7 != 0) {
            i5 = i6 | 384;
        } else {
            i5 = i6 | (oq5Var.c(f3) ? 256 : 128);
        }
        if ((i5 & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
            f4 = f2;
        } else {
            if (i7 != 0) {
                f3 = 2;
            }
            float f5 = f3;
            agr agrVar = eq0.a;
            f4 = f2;
            vum.a(f4, androidx.compose.foundation.layout.a.d(yciVar, 1.0f), ((dq0) oq5Var.j(agrVar)).a.a, f5, ((dq0) oq5Var.j(agrVar)).a.e, oq5Var, (i5 & 14) | ((i5 << 3) & 7168), 0);
            f3 = f5;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            final float f6 = f4;
            r.d = new Function2() { // from class: xss
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ocg.g(f6, yciVar, f3, (hq5) obj, rvf.R(i2 | 1), i3);
                    return Unit.a;
                }
            };
        }
    }

    public static final void h(pru pruVar, nru nruVar, yci yciVar, hq5 hq5Var, int i2) {
        int i3;
        float f2;
        sdr sdrVar;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1760431058);
        if (((i2 | (oq5Var.f(pruVar) ? 4 : 2) | (oq5Var.h(nruVar) ? 32 : 16) | (oq5Var.f(yciVar) ? 256 : 128)) & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
        } else {
            yci Q = bfg.Q(yciVar, bfg.C(oq5Var), false, 14);
            ta5 a2 = sa5.a(qx0.e, b2c.o, oq5Var, 54);
            int i4 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
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
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var, i4, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            if (1.0f <= 0.0d) {
                qme.a("invalid weight; must be greater than zero");
            }
            u1g.l(oq5Var, new LayoutWeightElement(true, 1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f));
            w4k E = a0g.E(2131232992, 0, oq5Var);
            float f3 = BuildConfig.API_LEVEL;
            vci vciVar = vci.a;
            irf.r(E, null, d.m(vciVar, f3), null, null, 0.0f, null, oq5Var, 432, 120);
            xcs.b(vz1.o(vciVar, 16, oq5Var, R.string.wave_for_two_empty_screen_description, oq5Var), null, ((dq0) oq5Var.j(eq0.a)).b.a, 0L, null, 0L, null, new o9s(3), 0L, 0, false, 0, 0, null, nu0.j(), oq5Var, 0, 0, 65018);
            u1g.l(oq5Var, d.e(vciVar, 24));
            boolean z = pruVar.a;
            kjn kjnVar = gq5.a;
            if (z) {
                oq5Var.Z(-557853317);
                sdrVar = pm0.f(oq5Var);
                i3 = 0;
                oq5Var.p(false);
                f2 = 1.0f;
            } else {
                i3 = 0;
                oq5Var.Z(-557800338);
                Object K = oq5Var.K();
                if (K == kjnVar) {
                    f2 = 1.0f;
                    K = tlm.h(1.0f, oq5Var);
                } else {
                    f2 = 1.0f;
                }
                sdrVar = (poi) K;
                oq5Var.p(false);
            }
            sdr sdrVar2 = sdrVar;
            boolean h2 = oq5Var.h(nruVar);
            Object K2 = oq5Var.K();
            if (h2 || K2 == kjnVar) {
                j6u j6uVar = new j6u(0, nruVar, nru.class, "onInviteClick", "onInviteClick()V", 0, 21);
                oq5Var.k0(j6uVar);
                K2 = j6uVar;
            }
            Function0 function0 = (Function0) ((h9f) K2);
            yci t = d.t(vciVar, 128, 0.0f, 2);
            boolean f4 = oq5Var.f(sdrVar2);
            Object K3 = oq5Var.K();
            if (f4 || K3 == kjnVar) {
                K3 = new f6u(sdrVar2, 7);
                oq5Var.k0(K3);
            }
            oq5Var = oq5Var;
            hdg.n(384, 0, gld.e, oq5Var, wyf.s(t, (Function0) K3), function0);
            if (f2 <= 0.0d) {
                qme.a("invalid weight; must be greater than zero");
            }
            u1g.l(oq5Var, new LayoutWeightElement(true, f2 > Float.MAX_VALUE ? Float.MAX_VALUE : f2));
            q7g.a(6, i3, oq5Var, androidx.compose.foundation.layout.a.q(vciVar, 0.0f, 32, 0.0f, 0.0f, 13));
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new kws(pruVar, nruVar, yciVar, i2, 10);
        }
    }

    public static final void i(b7v b7vVar, yci yciVar, float f2, float f3, hq5 hq5Var, int i2, int i3) {
        int i4;
        yci yciVar2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1620450446);
        int i5 = (oq5Var.f(b7vVar) ? 4 : 2) | i2;
        int i6 = i3 & 2;
        if (i6 != 0) {
            i4 = i5 | 48;
        } else {
            i4 = i5 | (oq5Var.f(yciVar) ? 32 : 16);
        }
        if ((i4 & 1171) == 1170 && oq5Var.z()) {
            oq5Var.S();
            yciVar2 = yciVar;
        } else {
            yciVar2 = i6 != 0 ? vci.a : yciVar;
            float f4 = b7vVar.g;
            float f5 = (-f4) / 2.0f;
            yci m = d.m(androidx.compose.foundation.layout.a.j(d.x(yciVar2, null, 1), f5 + f2, f5 + f3), 3 * f4);
            int ordinal = b7vVar.d.ordinal();
            if (ordinal == 0) {
                oq5Var.Z(1820266434);
                j(f4, m, oq5Var, 0);
                oq5Var.p(false);
            } else {
                if (ordinal != 1) {
                    throw vz1.i(oq5Var, 1820264614, false);
                }
                oq5Var.Z(1820271242);
                ug3.a(m, oq5Var, 0);
                oq5Var.p(false);
            }
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new o9v(b7vVar, yciVar2, f2, f3, i2, i3);
        }
    }

    public static final void j(float f2, yci yciVar, hq5 hq5Var, int i2) {
        float f3;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(347567424);
        int i3 = (oq5Var.c(f2) ? 4 : 2) | i2 | (oq5Var.f(yciVar) ? 32 : 16);
        if ((i3 & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
            f3 = f2;
        } else {
            Object K = oq5Var.K();
            Object obj = gq5.a;
            if (K == obj) {
                K = new ov6(0.71f, 0.0f, 0.28f, 1.0f);
                oq5Var.k0(K);
            }
            ov6 ov6Var = (ov6) K;
            Object K2 = oq5Var.K();
            if (K2 == obj) {
                K2 = vq2.a(0.0f);
                oq5Var.k0(K2);
            }
            fk0 fk0Var = (fk0) K2;
            Unit unit = Unit.a;
            boolean h2 = oq5Var.h(fk0Var);
            Object K3 = oq5Var.K();
            if (h2 || K3 == obj) {
                K3 = new r9v(fk0Var, ov6Var, null, 0);
                oq5Var.k0(K3);
            }
            gld.w(oq5Var, unit, (Function2) K3);
            kfh d2 = ug3.d(b2c.f, false);
            int i4 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
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
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var, i4, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            float f4 = f2 / 2;
            boolean c2 = oq5Var.c(f4) | oq5Var.h(fk0Var);
            Object K4 = oq5Var.K();
            if (c2 || K4 == obj) {
                K4 = new p9v(f4, fk0Var, 2);
                oq5Var.k0(K4);
            }
            Function0 function02 = (Function0) K4;
            boolean c3 = oq5Var.c(f4) | oq5Var.h(fk0Var);
            Object K5 = oq5Var.K();
            if (c3 || K5 == obj) {
                K5 = new p9v(f4, fk0Var, 3);
                oq5Var.k0(K5);
            }
            Function0 function03 = (Function0) K5;
            boolean h3 = oq5Var.h(fk0Var);
            Object K6 = oq5Var.K();
            if (h3 || K6 == obj) {
                K6 = new gn6(fk0Var, 7);
                oq5Var.k0(K6);
            }
            Function0 function04 = (Function0) K6;
            boolean h4 = oq5Var.h(fk0Var);
            Object K7 = oq5Var.K();
            if (h4 || K7 == obj) {
                K7 = new gn6(fk0Var, 8);
                oq5Var.k0(K7);
            }
            int i5 = i3 & 14;
            f3 = f2;
            f(f3, function02, function03, function04, (Function0) K7, oq5Var, i5);
            boolean c4 = oq5Var.c(f4) | oq5Var.h(fk0Var);
            Object K8 = oq5Var.K();
            if (c4 || K8 == obj) {
                K8 = new p9v(f4, fk0Var, 4);
                oq5Var.k0(K8);
            }
            Function0 function05 = (Function0) K8;
            boolean c5 = oq5Var.c(f4) | oq5Var.h(fk0Var);
            Object K9 = oq5Var.K();
            if (c5 || K9 == obj) {
                K9 = new p9v(f4, fk0Var, 5);
                oq5Var.k0(K9);
            }
            Function0 function06 = (Function0) K9;
            boolean h5 = oq5Var.h(fk0Var);
            Object K10 = oq5Var.K();
            if (h5 || K10 == obj) {
                K10 = new gn6(fk0Var, 4);
                oq5Var.k0(K10);
            }
            Function0 function07 = (Function0) K10;
            Object K11 = oq5Var.K();
            if (K11 == obj) {
                K11 = new s2(28);
                oq5Var.k0(K11);
            }
            f(f3, function05, function06, function07, (Function0) K11, oq5Var, i5 | 24576);
            boolean c6 = oq5Var.c(f4) | oq5Var.h(fk0Var);
            Object K12 = oq5Var.K();
            if (c6 || K12 == obj) {
                K12 = new p9v(f4, fk0Var, 0);
                oq5Var.k0(K12);
            }
            Function0 function08 = (Function0) K12;
            boolean c7 = oq5Var.c(f4) | oq5Var.h(fk0Var);
            Object K13 = oq5Var.K();
            if (c7 || K13 == obj) {
                K13 = new p9v(f4, fk0Var, 1);
                oq5Var.k0(K13);
            }
            Function0 function09 = (Function0) K13;
            boolean h6 = oq5Var.h(fk0Var);
            Object K14 = oq5Var.K();
            if (h6 || K14 == obj) {
                K14 = new gn6(fk0Var, 5);
                oq5Var.k0(K14);
            }
            Function0 function010 = (Function0) K14;
            boolean h7 = oq5Var.h(fk0Var);
            Object K15 = oq5Var.K();
            if (h7 || K15 == obj) {
                K15 = new gn6(fk0Var, 6);
                oq5Var.k0(K15);
            }
            f(f3, function08, function09, function010, (Function0) K15, oq5Var, i5);
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new dh6(f3, i2, 1, yciVar);
        }
    }

    public static final Object k(u3q u3qVar, v3q v3qVar) {
        u3qVar.getClass();
        if (u3qVar instanceof j3q) {
            return v3qVar.K((j3q) u3qVar);
        }
        if (u3qVar instanceof l3q) {
            return v3qVar.H((l3q) u3qVar);
        }
        if (u3qVar instanceof p3q) {
            return v3qVar.A((p3q) u3qVar);
        }
        if (u3qVar instanceof m3q) {
            return v3qVar.v((m3q) u3qVar);
        }
        if (u3qVar instanceof m4q) {
            return v3qVar.z((m4q) u3qVar);
        }
        if (u3qVar instanceof e5q) {
            return v3qVar.E((e5q) u3qVar);
        }
        if (u3qVar instanceof x3q) {
            return v3qVar.p((x3q) u3qVar);
        }
        if (u3qVar instanceof y3q) {
            return v3qVar.y((y3q) u3qVar);
        }
        if (u3qVar instanceof z3q) {
            return v3qVar.O((z3q) u3qVar);
        }
        if (u3qVar instanceof f5q) {
            return v3qVar.P((f5q) u3qVar);
        }
        kac.j(u3qVar, "Developer Error. Unexpected class for visit ");
        return null;
    }

    public static final ydp l(qep qepVar, kg3 kg3Var) {
        boolean z = qepVar.e() == iu6.a;
        return new ydp(p(qepVar.j(), z, true, qepVar.k(), kg3Var), p(qepVar.i(), z, false, qepVar.d(), kg3Var), z);
    }

    public static final float m(float f2, float f3, float f4, float f5) {
        double d2 = 2;
        return (float) Math.sqrt(((float) Math.pow(f2 - f4, d2)) + ((float) Math.pow(f3 - f5, d2)));
    }

    public static final j5n n(z5 z5Var, nyf nyfVar) {
        if (nyfVar.b().compareTo(lyf.a) <= 0) {
            tuh.c("Cannot configure ", z5Var, " to disposeComposition at Lifecycle ON_DESTROY: ", nyfVar, "is already destroyed");
            return null;
        }
        ru2 ru2Var = new ru2(10, z5Var);
        nyfVar.a(ru2Var);
        return new j5n(18, nyfVar, ru2Var);
    }

    public static final xdp o(qep qepVar, idp idpVar, xdp xdpVar) {
        int i2 = qepVar.a() ? idpVar.c : idpVar.d;
        int k = qepVar.a() ? qepVar.k() : qepVar.d();
        int i3 = idpVar.b;
        cds cdsVar = idpVar.f;
        int i4 = idpVar.e;
        if (k != i3) {
            return idpVar.a(i2);
        }
        bwf bwfVar = bwf.c;
        arf a2 = btf.a(bwfVar, new bp9(idpVar, i2, 1));
        arf a3 = btf.a(bwfVar, new aep(idpVar, i2, qepVar.a() ? idpVar.d : idpVar.c, qepVar, a2));
        if (idpVar.a != xdpVar.c) {
            return (xdp) a3.getValue();
        }
        if (i2 == i4) {
            return xdpVar;
        }
        if (((Number) a2.getValue()).intValue() != cdsVar.b.e(i4)) {
            return (xdp) a3.getValue();
        }
        int i5 = xdpVar.b;
        long h2 = cdsVar.h(i5);
        boolean a4 = qepVar.a();
        if (i4 != -1) {
            if (i2 != i4) {
                if (((a4 ? 1 : 0) ^ (idpVar.b() != iu6.a ? 0 : 1)) == 0) {
                }
            }
            return idpVar.a(i2);
        }
        int i6 = rds.c;
        return (i5 == ((int) (h2 >> 32)) || i5 == ((int) (h2 & 4294967295L))) ? (xdp) a3.getValue() : idpVar.a(i2);
    }

    public static final xdp p(idp idpVar, boolean z, boolean z2, int i2, kg3 kg3Var) {
        long j;
        int i3 = z2 ? idpVar.c : idpVar.d;
        if (i2 != idpVar.b) {
            return idpVar.a(i3);
        }
        long h2 = kg3Var.h(idpVar, i3);
        if (z ^ z2) {
            int i4 = rds.c;
            j = h2 >> 32;
        } else {
            int i5 = rds.c;
            j = 4294967295L & h2;
        }
        return idpVar.a((int) j);
    }

    public static final int q(long j) {
        return (int) Math.ceil(j / 1048576.0d);
    }

    public static final xdp r(xdp xdpVar, idp idpVar, int i2) {
        return new xdp(idpVar.f.a(i2), i2, xdpVar.c);
    }

    public static final void s(TypedArray typedArray, int i2) {
        if (typedArray.hasValue(i2)) {
            return;
        }
        xq0.x("Attribute not defined in set.");
    }

    public static RadialGradient t(pcg pcgVar, hag hagVar, hag hagVar2, int[] iArr, float[] fArr, int i2, int i3) {
        float f2;
        float f3;
        float floatValue;
        if (hagVar instanceof bfn) {
            f2 = ((bfn) hagVar).a;
        } else {
            if (!(hagVar instanceof cfn)) {
                b6e.s();
                return null;
            }
            f2 = ((cfn) hagVar).a * i2;
        }
        float f4 = f2;
        if (hagVar2 instanceof bfn) {
            f3 = ((bfn) hagVar2).a;
        } else {
            if (!(hagVar2 instanceof cfn)) {
                b6e.s();
                return null;
            }
            f3 = ((cfn) hagVar2).a * i3;
        }
        float f5 = f3;
        float f6 = i2;
        float f7 = i3;
        jyr b2 = btf.b(new dfn(f6, f7, f4, f5, 0));
        jyr b3 = btf.b(new dfn(f6, f7, f4, f5, 1));
        if (!(pcgVar instanceof efn)) {
            if (pcgVar instanceof ffn) {
                int D = ouj.D(((ffn) pcgVar).a);
                if (D == 0) {
                    Float M = xz0.M((Float[]) b2.getValue());
                    M.getClass();
                    floatValue = M.floatValue();
                } else if (D == 1) {
                    Float L = xz0.L((Float[]) b2.getValue());
                    L.getClass();
                    floatValue = L.floatValue();
                } else if (D == 2) {
                    Float M2 = xz0.M((Float[]) b3.getValue());
                    M2.getClass();
                    floatValue = M2.floatValue();
                } else if (D == 3) {
                    Float L2 = xz0.L((Float[]) b3.getValue());
                    L2.getClass();
                    floatValue = L2.floatValue();
                }
            }
            b6e.s();
            return null;
        }
        floatValue = ((efn) pcgVar).a;
        if (floatValue <= 0.0f) {
            floatValue = 0.01f;
        }
        return new RadialGradient(f4, f5, floatValue, iArr, fArr, Shader.TileMode.CLAMP);
    }

    public static final float u(hq5 hq5Var) {
        float c2 = nnu.c(true, hq5Var);
        float f2 = trp.a;
        float f3 = cub.e;
        return f2 + f3 + c2 + f3 + cub.c;
    }

    public static final float v(oq5 oq5Var) {
        float f2 = r43.a;
        float p = w1g.p(r43.b(), 0, oq5Var, 0, 2);
        agr agrVar = lkg.a;
        float d2 = ((o0k) oq5Var.j(agrVar)).d() + p;
        float f3 = 16;
        return trp.a + cub.e + cub.c + ((o0k) oq5Var.j(agrVar)).a() + d2 + f3 + f3;
    }

    public static final x w(a0 a0Var) {
        a0Var.getClass();
        if (a0Var.l()) {
            return a0Var.j();
        }
        return null;
    }

    public static ys3 x(CoroutineContext coroutineContext, Function2 function2) {
        pm6 pm6Var = pm6.a;
        coroutineContext.getClass();
        return wct.z(new u13(coroutineContext, pm6Var, function2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x003c, code lost:
    
        if (r3 != 1918990112) goto L4;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01bc A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v15, types: [yvm] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList y(d7k d7kVar) {
        char c2;
        ArrayList arrayList;
        boolean z;
        int i2;
        ArrayList arrayList2;
        d7k d7kVar2 = d7kVar;
        ArrayList arrayList3 = null;
        if (d7kVar2.v() == 0) {
            char c3 = 7;
            d7kVar2.I(7);
            int h2 = d7kVar2.h();
            boolean z2 = true;
            if (h2 == 1684433976) {
                d7k d7kVar3 = new d7k();
                Inflater inflater = new Inflater(true);
                try {
                    if (!dvt.S(d7kVar2, d7kVar3, inflater)) {
                        return null;
                    }
                    inflater.end();
                    d7kVar2 = d7kVar3;
                } finally {
                    inflater.end();
                }
            }
            ArrayList arrayList4 = new ArrayList();
            int i3 = d7kVar2.b;
            int i4 = d7kVar2.c;
            while (i3 < i4) {
                int h3 = d7kVar2.h() + i3;
                if (h3 > i3 && h3 <= i4) {
                    if (d7kVar2.h() == 1835365224) {
                        int h4 = d7kVar2.h();
                        if (h4 <= 10000) {
                            float[] fArr = new float[h4];
                            for (int i5 = 0; i5 < h4; i5++) {
                                fArr[i5] = Float.intBitsToFloat(d7kVar2.h());
                            }
                            int h5 = d7kVar2.h();
                            if (h5 <= 32000) {
                                double log = Math.log(2.0d);
                                c2 = c3;
                                ArrayList arrayList5 = arrayList3;
                                int ceil = (int) Math.ceil(Math.log(h4 * 2.0d) / log);
                                z = z2;
                                byte[] bArr = d7kVar2.a;
                                v94 v94Var = new v94(bArr, bArr.length);
                                v94Var.q(d7kVar2.b * 8);
                                float[] fArr2 = new float[h5 * 5];
                                int i6 = 5;
                                int[] iArr = new int[5];
                                arrayList = arrayList5;
                                int i7 = 0;
                                int i8 = 0;
                                while (true) {
                                    if (i7 < h5) {
                                        int i9 = 0;
                                        while (i9 < i6) {
                                            int i10 = iArr[i9];
                                            int i11 = v94Var.i(ceil);
                                            int i12 = ((i11 >> 1) ^ (-(i11 & 1))) + i10;
                                            if (i12 >= h4 || i12 < 0) {
                                                break;
                                            }
                                            fArr2[i8] = fArr[i12];
                                            iArr[i9] = i12;
                                            i9++;
                                            i8++;
                                            i6 = 5;
                                        }
                                        i7++;
                                        i6 = 5;
                                    } else {
                                        v94Var.q((v94Var.g() + 7) & (-8));
                                        int i13 = 32;
                                        int i14 = v94Var.i(32);
                                        ah3[] ah3VarArr = new ah3[i14];
                                        int i15 = 0;
                                        while (i15 < i14) {
                                            int i16 = v94Var.i(8);
                                            int i17 = v94Var.i(8);
                                            int i18 = v94Var.i(i13);
                                            if (i18 <= 128000) {
                                                int i19 = i14;
                                                float[] fArr3 = fArr2;
                                                int ceil2 = (int) Math.ceil(Math.log(h5 * 2.0d) / log);
                                                float[] fArr4 = new float[i18 * 3];
                                                float[] fArr5 = new float[i18 * 2];
                                                i2 = i4;
                                                int i20 = 0;
                                                int i21 = 0;
                                                while (i20 < i18) {
                                                    int i22 = v94Var.i(ceil2);
                                                    v94 v94Var2 = v94Var;
                                                    int i23 = ((i22 >> 1) ^ (-(i22 & 1))) + i21;
                                                    if (i23 >= 0 && i23 < h5) {
                                                        int i24 = i20 * 3;
                                                        int i25 = i23 * 5;
                                                        fArr4[i24] = fArr3[i25];
                                                        fArr4[i24 + 1] = fArr3[i25 + 1];
                                                        fArr4[i24 + 2] = fArr3[i25 + 2];
                                                        int i26 = i20 * 2;
                                                        fArr5[i26] = fArr3[i25 + 3];
                                                        fArr5[i26 + 1] = fArr3[i25 + 4];
                                                        i20++;
                                                        i21 = i23;
                                                        v94Var = v94Var2;
                                                    }
                                                }
                                                ah3VarArr[i15] = new ah3(i16, i17, fArr4, fArr5);
                                                i15++;
                                                i14 = i19;
                                                fArr2 = fArr3;
                                                i4 = i2;
                                                v94Var = v94Var;
                                                i13 = 32;
                                            }
                                        }
                                        i2 = i4;
                                        arrayList2 = new yvm(ah3VarArr);
                                    }
                                }
                                i2 = i4;
                                arrayList2 = arrayList;
                                if (arrayList2 != null) {
                                    return arrayList;
                                }
                                arrayList4.add(arrayList2);
                            }
                        }
                        c2 = c3;
                        ArrayList arrayList6 = arrayList3;
                        arrayList = arrayList6;
                        z = z2;
                        i2 = i4;
                        arrayList2 = arrayList6;
                        if (arrayList2 != null) {
                        }
                    } else {
                        c2 = c3;
                        arrayList = arrayList3;
                        z = z2;
                        i2 = i4;
                    }
                    d7kVar2.H(h3);
                    i3 = h3;
                    c3 = c2;
                    z2 = z;
                    arrayList3 = arrayList;
                    i4 = i2;
                }
            }
            return arrayList4;
        }
        return arrayList3;
    }

    public static final TypedValue z(int i2, Resources.Theme theme) {
        theme.getClass();
        TypedValue typedValue = new TypedValue();
        if (theme.resolveAttribute(i2, typedValue, true)) {
            return typedValue;
        }
        return null;
    }
}
