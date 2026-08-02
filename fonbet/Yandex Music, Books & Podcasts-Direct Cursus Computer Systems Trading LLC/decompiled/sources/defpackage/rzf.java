package defpackage;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.compose.animation.a;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.b;
import androidx.compose.foundation.layout.d;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.yandex.music.shared.dto.wave.recommendation.RadioRestrictionValueDto;
import com.yandex.music.shared.dto.wave.recommendation.RestrictionDto;
import com.yandex.music.shared.relay.common.proto.c;
import com.yandex.music.shared.relay.common.proto.i;
import com.yandex.music.shared.relay.common.proto.w;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public abstract class rzf {
    public static final boolean A(wxk wxkVar) {
        wxkVar.getClass();
        if ((wxkVar instanceof oxk) || (wxkVar instanceof sxk) || (wxkVar instanceof txk) || (wxkVar instanceof uxk)) {
            return true;
        }
        if (wxkVar instanceof pxk) {
            return false;
        }
        b6e.s();
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x008e, code lost:
    
        r0.add(r3);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Map B(Map map) {
        String name;
        List possibleValues;
        String name2;
        String value;
        String serializedSeed;
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            RestrictionDto restrictionDto = (RestrictionDto) entry.getValue();
            Pair pair = null;
            if (str != null && restrictionDto != null && (name = restrictionDto.getName()) != null && (possibleValues = restrictionDto.getPossibleValues()) != null) {
                List list = possibleValues;
                ArrayList arrayList2 = new ArrayList(v75.o(list, 10));
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        pair = new Pair(str, new i7o(name, arrayList2));
                        break;
                    }
                    RadioRestrictionValueDto radioRestrictionValueDto = (RadioRestrictionValueDto) it.next();
                    if (radioRestrictionValueDto == null || (name2 = radioRestrictionValueDto.getName()) == null || (value = radioRestrictionValueDto.getValue()) == null || (serializedSeed = radioRestrictionValueDto.getSerializedSeed()) == null) {
                        break;
                    }
                    Boolean isUnspecified = radioRestrictionValueDto.getIsUnspecified();
                    arrayList2.add(new j7o(name2, value, serializedSeed, isUnspecified != null ? isUnspecified.booleanValue() : false));
                }
            }
        }
        return uah.n(arrayList);
    }

    public static final boolean C(wxk wxkVar) {
        wxkVar.getClass();
        if ((wxkVar instanceof sxk) || (wxkVar instanceof uxk)) {
            return true;
        }
        if ((wxkVar instanceof oxk) || (wxkVar instanceof pxk) || (wxkVar instanceof txk)) {
            return false;
        }
        b6e.s();
        return false;
    }

    public static final boolean D(wxk wxkVar) {
        wxkVar.getClass();
        if (wxkVar instanceof sxk) {
            return ((sxk) wxkVar).f;
        }
        if (wxkVar instanceof uxk) {
            return true;
        }
        if ((wxkVar instanceof oxk) || (wxkVar instanceof pxk) || (wxkVar instanceof txk)) {
            return false;
        }
        b6e.s();
        return false;
    }

    public static final long E(long j) {
        if (j < 0) {
            nsa.b.getClass();
            return nsa.d;
        }
        nsa.b.getClass();
        return nsa.c;
    }

    public static final Calendar F(Date date, TimeZone timeZone) {
        Calendar calendar = Calendar.getInstance(timeZone);
        calendar.setTime(date);
        Calendar calendar2 = Calendar.getInstance(timeZone);
        calendar2.setTime(new Date(System.currentTimeMillis()));
        calendar2.set(11, calendar.get(11));
        calendar2.set(12, calendar.get(12));
        calendar2.set(13, 0);
        calendar2.set(14, 0);
        return calendar2;
    }

    public static final boolean G(List list, List list2) {
        list.getClass();
        list2.getClass();
        return i4w.A(list, list2, new j1p(20));
    }

    public static boolean H(MotionEvent motionEvent, int i) {
        return (motionEvent.getSource() & i) == i;
    }

    public static final String I(int i) {
        htr htrVar;
        l18 l18Var = l18.b;
        bdt I = hag.I(o8q.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        o8q o8qVar = (o8q) qdcVar.C(I);
        quk qukVar = htr.f;
        String language = swf.I().getLanguage();
        language.getClass();
        qukVar.getClass();
        int hashCode = language.hashCode();
        if (hashCode == 3424) {
            if (language.equals("kk")) {
                htrVar = htr.j;
            }
            htrVar = htr.g;
        } else if (hashCode != 3651) {
            if (hashCode == 3749 && language.equals("uz")) {
                htrVar = htr.i;
            }
            htrVar = htr.g;
        } else {
            if (language.equals("ru")) {
                htrVar = htr.h;
            }
            htrVar = htr.g;
        }
        Locale locale = htrVar.c;
        locale.getClass();
        String B = ot0.B(i, locale);
        skr skrVar = o8qVar.a;
        return i <= 0 ? skrVar.c(R.string.play_list_empty_text) : skrVar.b(R.plurals.contest_playlist_min_tracks_quantity, i, Arrays.copyOf(new Object[]{B}, 1));
    }

    public static final String J(cvl cvlVar, boolean z) {
        String b;
        l18 l18Var = l18.b;
        cvlVar.getClass();
        String I = I(z ? cvlVar.i : cvlVar.g);
        long j = cvlVar.j;
        if (j <= 0 || z) {
            int i = cvlVar.h;
            if (i <= 0 || z) {
                return I;
            }
            bdt I2 = hag.I(skr.class);
            qdc qdcVar = l18Var.a;
            qdcVar.getClass();
            return ouj.o(I, " • ", ((skr) qdcVar.C(I2)).b(R.plurals.likes_content_description, i, Integer.valueOf(i)));
        }
        bdt I3 = hag.I(skr.class);
        qdc qdcVar2 = l18Var.a;
        qdcVar2.getClass();
        skr skrVar = (skr) qdcVar2.C(I3);
        msa msaVar = nsa.b;
        long s = nsa.s(yd5.N(j, ssa.MILLISECONDS), ssa.MINUTES);
        if (s <= 45) {
            int i2 = (int) s;
            b = skrVar.b(R.plurals.number_of_minutes_rtl_support, i2, Integer.valueOf(i2));
        } else {
            double a = eeh.a(s / 30.0d) / 2.0d;
            String format = new DecimalFormat("#.#").format(a);
            if (a < 4.0d) {
                a += 0.5d;
            }
            b = skrVar.b(R.plurals.number_of_hours_rtl_support, (int) a, format);
        }
        return ouj.o(I, " • ", b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void K(acp acpVar, long j, Function1 function1) {
        vqj vqjVar = new vqj(j);
        uqj uqjVar = uqj.a;
        wct.o(3, uqjVar);
        xbp xbpVar = new xbp(acpVar, vqjVar, uqjVar, qf3.d, bcp.e, (aur) function1, null);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = acp.f;
        acpVar.i(xbpVar, false);
    }

    public static final Date L(String str, TimeZone timeZone) {
        timeZone.getClass();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm", Locale.US);
        simpleDateFormat.setTimeZone(timeZone);
        Date parse = simpleDateFormat.parse(str);
        parse.getClass();
        return parse;
    }

    public static final long M(long j, long j2) {
        ssa ssaVar = ssa.NANOSECONDS;
        long j3 = j - j2;
        if (((j3 ^ j) & (~(j3 ^ j2))) >= 0) {
            return yd5.N(j3, ssaVar);
        }
        ssa ssaVar2 = ssa.MILLISECONDS;
        if (ssaVar.compareTo(ssaVar2) >= 0) {
            return nsa.u(E(j3));
        }
        long j4 = (j / 1000000) - (j2 / 1000000);
        long j5 = (j % 1000000) - (j2 % 1000000);
        msa msaVar = nsa.b;
        return nsa.o(yd5.N(j4, ssaVar2), yd5.N(j5, ssaVar));
    }

    public static final e5w N(List list) {
        list.getClass();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            e5w e5wVar = (e5w) it.next();
            Date date = e5wVar.c;
            TimeZone timeZone = e5wVar.e;
            long timeInMillis = F(date, timeZone).getTimeInMillis();
            Calendar F = F(e5wVar.c, timeZone);
            Calendar F2 = F(e5wVar.d, timeZone);
            if (F2.before(F)) {
                F2.add(5, 1);
            }
            long timeInMillis2 = F2.getTimeInMillis();
            long timeInMillis3 = Calendar.getInstance(timeZone).getTimeInMillis();
            if (timeInMillis > timeInMillis3 || timeInMillis3 > timeInMillis2) {
                long j = timeInMillis2 - 86400000;
                if (timeInMillis - 86400000 > timeInMillis3 || timeInMillis3 > j) {
                }
            }
            return e5wVar;
        }
        return null;
    }

    public static final Long O(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return null;
        }
        Iterator it = list.iterator();
        long j = Long.MAX_VALUE;
        while (it.hasNext()) {
            e5w e5wVar = (e5w) it.next();
            Date date = e5wVar.c;
            TimeZone timeZone = e5wVar.e;
            Calendar F = F(date, timeZone);
            long timeInMillis = Calendar.getInstance(timeZone).getTimeInMillis();
            if (timeInMillis >= F.getTimeInMillis()) {
                F.add(5, 1);
            }
            long timeInMillis2 = F.getTimeInMillis() - timeInMillis;
            if (timeInMillis2 < j) {
                j = timeInMillis2;
            }
        }
        return Long.valueOf(j);
    }

    public static final w74 P(gow gowVar) {
        v74 v74Var;
        gowVar.getClass();
        String str = gowVar.a;
        String str2 = gowVar.c;
        boolean z = gowVar.k;
        switch (gowVar.b.ordinal()) {
            case 0:
            case 2:
                v74Var = v74.a;
                break;
            case 1:
                v74Var = v74.c;
                break;
            case 3:
                v74Var = v74.d;
                break;
            case 4:
                v74Var = v74.g;
                break;
            case 5:
                v74Var = v74.b;
                break;
            case 6:
                l18 l18Var = l18.b;
                bdt I = hag.I(byb.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                if (!((otw) ((byb) qdcVar.C(I)).b(otw.class)).h()) {
                    v74Var = v74.a;
                    break;
                } else {
                    v74Var = v74.f;
                    break;
                }
            case 7:
                v74Var = v74.h;
                break;
            case 8:
                v74Var = v74.e;
                break;
            case 9:
                v74Var = v74.a;
                break;
            default:
                b6e.s();
                return null;
        }
        return new w74(str, str2, v74Var, z);
    }

    public static dqj Q(g73 g73Var, String str, String str2, Function0 function0, x6k x6kVar, yci yciVar, int i) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            function0 = null;
        }
        if ((i & 8) != 0) {
            x6kVar = szf.g0(Boolean.valueOf(function0 != null));
        }
        if ((i & 32) != 0) {
            yciVar = vci.a;
        }
        x6kVar.getClass();
        yciVar.getClass();
        return new dqj(g73Var, yciVar, x6kVar, str, str2, function0);
    }

    public static int R(int i, int i2) {
        if (i2 < 0) {
            xq0.x("cannot store more than MAX_VALUE elements");
            return 0;
        }
        if (i2 <= i) {
            return i;
        }
        int i3 = i + (i >> 1) + 1;
        if (i3 < i2) {
            int highestOneBit = Integer.highestOneBit(i2 - 1);
            i3 = highestOneBit + highestOneBit;
        }
        if (i3 < 0) {
            return Integer.MAX_VALUE;
        }
        return i3;
    }

    public static final void a(int i, int i2, hq5 hq5Var, yci yciVar) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1169719338);
        int i3 = (oq5Var.d(i) ? 4 : 2) | i2 | (oq5Var.f(yciVar) ? 32 : 16);
        if (oq5Var.P(i3 & 1, (i3 & 19) != 18)) {
            o(i3 & 112, oq5Var, yciVar, rvf.N(R.string.album_volume, new Object[]{Integer.valueOf(i)}, oq5Var));
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new jm0(i, yciVar, i2, 15);
        }
    }

    public static final void b(qor qorVar, yci yciVar, hq5 hq5Var, int i) {
        int i2;
        qor qorVar2;
        yci yciVar2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1004300539);
        if ((i & 6) == 0) {
            i2 = (oq5Var.f(qorVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.f(yciVar) ? 32 : 16;
        }
        if (oq5Var.P(i2 & 1, (i2 & 19) != 18)) {
            int i3 = i2 & 14;
            boolean z = i3 == 4;
            Object K = oq5Var.K();
            if (z || K == gq5.a) {
                K = new pnr(qorVar, 0);
                oq5Var.k0(K);
            }
            int i4 = 1597440 | i3 | (i2 & 112);
            qorVar2 = qorVar;
            yciVar2 = yciVar;
            a.b(qorVar2, yciVar2, (Function1) K, null, "Change subscription banner state", null, y2x.f, oq5Var, i4, 40);
        } else {
            qorVar2 = qorVar;
            yciVar2 = yciVar;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new x8l(qorVar2, yciVar2, i, 22);
        }
    }

    public static final c c(String str, String str2) {
        v4c v4cVar = (v4c) c.d.createBuilder();
        if (str != null) {
            v4cVar.d();
            c cVar = (c) v4cVar.b;
            cVar.getClass();
            cVar.a |= 1;
            cVar.b = str;
        }
        if (str2 != null) {
            v4cVar.d();
            c cVar2 = (c) v4cVar.b;
            cVar2.getClass();
            cVar2.a |= 2;
            cVar2.c = str2;
        }
        return (c) v4cVar.b();
    }

    public static final void d(td3 td3Var, zuq zuqVar, hvq hvqVar, zsq zsqVar, yci yciVar, hq5 hq5Var, int i) {
        int i2;
        long j;
        td3Var.getClass();
        zuqVar.getClass();
        hvqVar.getClass();
        zsqVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(349189759);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? oq5Var.f(td3Var) : oq5Var.h(td3Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.h(zuqVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.h(hvqVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? oq5Var.f(zsqVar) : oq5Var.h(zsqVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= oq5Var.f(yciVar) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((i2 & 9363) == 9362 && oq5Var.z()) {
            oq5Var.S();
        } else {
            aqi Q = szf.Q(zuqVar.c(), oq5Var);
            ud3 ud3Var = ((Boolean) Q.getValue()).booleanValue() ? td3Var.e : td3Var.d;
            String str = ud3Var.a;
            long j2 = ud3Var.b;
            long j3 = ud3Var.c;
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (K == kjnVar) {
                K = new xjf(7);
                oq5Var.k0(K);
            }
            yci b = nfp.b(yciVar, true, (Function1) K);
            boolean h = oq5Var.h(ud3Var) | oq5Var.h(zuqVar) | oq5Var.h(hvqVar) | oq5Var.f(Q) | ((i2 & 7168) == 2048 || ((i2 & 4096) != 0 && oq5Var.h(zsqVar)));
            Object K2 = oq5Var.K();
            if (h || K2 == kjnVar) {
                j = j3;
                rh1 rh1Var = new rh1(ud3Var, zuqVar, hvqVar, zsqVar, Q, 8);
                oq5Var.k0(rh1Var);
                K2 = rh1Var;
            } else {
                j = j3;
            }
            wxf.e(str, j2, j, (Function0) K2, b, oq5Var, 0, 0);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new tu(i, 19, td3Var, zuqVar, hvqVar, zsqVar, yciVar);
        }
    }

    public static final void e(String str, String str2, String str3, yci yciVar, hq5 hq5Var, int i) {
        yci yciVar2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-758006034);
        int i2 = i | (oq5Var.f(str) ? 4 : 2) | (oq5Var.f(str2) ? 32 : 16) | (oq5Var.f(str3) ? 256 : 128) | 3072;
        if (oq5Var.P(i2 & 1, (i2 & 1171) != 1170)) {
            bg3.a(null, null, false, ild.C(461547460, new aqp(str, str2, str3), oq5Var), oq5Var, 3072, 7);
            yciVar2 = vci.a;
        } else {
            oq5Var.S();
            yciVar2 = yciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new wbh(str, str2, str3, yciVar2, i, 2);
        }
    }

    public static final void f(int i, int i2, hq5 hq5Var, yci yciVar) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1795975733);
        int i3 = 16;
        int i4 = (oq5Var.d(i) ? 4 : 2) | i2 | (oq5Var.f(yciVar) ? 32 : 16);
        if (oq5Var.P(i4 & 1, (i4 & 19) != 18)) {
            o(i4 & 112, oq5Var, yciVar, rvf.N(R.string.podcast_volume, new Object[]{Integer.valueOf(i)}, oq5Var));
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new jm0(i, yciVar, i2, i3);
        }
    }

    public static final i g(c cVar, w wVar) {
        ltn ltnVar = (ltn) i.d.createBuilder();
        if (cVar != null) {
            ltnVar.d();
            i iVar = (i) ltnVar.b;
            iVar.getClass();
            iVar.b = cVar;
            iVar.a |= 1;
        }
        if (wVar != null) {
            ltnVar.d();
            i iVar2 = (i) ltnVar.b;
            iVar2.getClass();
            iVar2.c = wVar;
            iVar2.a |= 2;
        }
        return (i) ltnVar.b();
    }

    public static final void h(az2 az2Var, boolean z, boolean z2, boolean z3, Function0 function0, Function0 function02, Function0 function03, yci yciVar, hq5 hq5Var, int i) {
        oq5 oq5Var;
        ges j;
        function0.getClass();
        function02.getClass();
        function03.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-1115007237);
        int i2 = (oq5Var2.f(yciVar) ? 8388608 : RemoteCameraConfig.Camera.BITRATE) | i | (oq5Var2.f(az2Var) ? 4 : 2) | (oq5Var2.g(z) ? 32 : 16) | (oq5Var2.g(z2) ? 256 : 128) | (oq5Var2.g(z3) ? 2048 : 1024) | (oq5Var2.h(function0) ? 16384 : RemoteCameraConfig.Notification.ID) | (oq5Var2.h(function02) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX) | (oq5Var2.h(function03) ? 1048576 : 524288);
        if (oq5Var2.P(i2 & 1, (4793491 & i2) != 4793490)) {
            kbj kbjVar = az2Var.a;
            if (z2) {
                oq5Var2.Z(-2075085557);
                j = nu0.g();
            } else {
                oq5Var2.Z(-2075084249);
                j = nu0.j();
            }
            oq5Var2.p(false);
            oq5Var = oq5Var2;
            p6g.d(kbjVar, function0, yciVar, 0L, null, j, true, ild.C(-1370506600, new mba(az2Var, z3, function03, function02, z), oq5Var2), e9g.a, oq5Var, ((i2 >> 9) & 112) | 114819072 | ((i2 >> 15) & 896), 24);
        } else {
            oq5Var = oq5Var2;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new gsl(az2Var, z, z2, z3, function0, function02, function03, yciVar, i, 2);
        }
    }

    public static final void i(Function0 function0, yci yciVar, hq5 hq5Var, int i) {
        int i2;
        Function0 function02;
        function0.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-298948384);
        if ((i & 6) == 0) {
            i2 = (oq5Var.h(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (oq5Var.P(i3 & 1, (i3 & 19) != 18)) {
            float f = 48;
            vci vciVar = vci.a;
            function02 = function0;
            aae.a(function02, androidx.compose.ui.platform.a.a(d.q(vciVar, f, f, 0.0f, 0.0f, 12), "button_settings"), false, wdp.c, oq5Var, (i3 & 14) | 24576, 12);
            yciVar = vciVar;
        } else {
            function02 = function0;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new ni6(function02, yciVar, i, 5);
        }
    }

    public static final void j(pjc pjcVar, yci yciVar, hq5 hq5Var, int i, int i2) {
        int i3;
        pjcVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-238350547);
        int i4 = (oq5Var.h(pjcVar) ? 4 : 2) | i;
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 = i4 | 48;
        } else {
            i3 = i4 | (oq5Var.f(yciVar) ? 32 : 16);
        }
        if ((i3 & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
        } else {
            vci vciVar = vci.a;
            if (i5 != 0) {
                yciVar = vciVar;
            }
            yci c = d.c(yciVar, 1.0f);
            kfh d = ug3.d(b2c.b, false);
            int i6 = oq5Var.P;
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
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i6))) {
                ouj.x(i6, oq5Var, i6, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (K == kjnVar) {
                K = new i1r();
                oq5Var.k0(K);
            }
            i1r i1rVar = (i1r) K;
            Unit unit = Unit.a;
            boolean h = oq5Var.h(pjcVar);
            Object K2 = oq5Var.K();
            if (h || K2 == kjnVar) {
                K2 = new kun(pjcVar, i1rVar, null, 28);
                oq5Var.k0(K2);
            }
            gld.w(oq5Var, unit, (Function2) K2);
            tyf.i(i1rVar, androidx.compose.foundation.layout.a.q(b.a.a(vciVar, b2c.i), 0.0f, 0.0f, 0.0f, zs4.e(oq5Var), 7), null, oq5Var, 6, 4);
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new x8l(pjcVar, yciVar, i, i2);
        }
    }

    public static final void k(i1r i1rVar, yci yciVar, hq5 hq5Var, int i) {
        i1r i1rVar2;
        i1rVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-929684995);
        if ((((oq5Var.f(yciVar) ? 32 : 16) | i) & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
            i1rVar2 = i1rVar;
        } else {
            yci c = d.c(yciVar, 1.0f);
            kfh d = ug3.d(b2c.b, false);
            int i2 = oq5Var.P;
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
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i2))) {
                ouj.x(i2, oq5Var, i2, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            i1rVar2 = i1rVar;
            tyf.i(i1rVar2, androidx.compose.foundation.layout.a.q(b.a.a(vci.a, b2c.i), 0.0f, 0.0f, 0.0f, zs4.e(oq5Var), 7), null, oq5Var, 6, 4);
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new hon(i1rVar2, yciVar, i, 25);
        }
    }

    public static final void l(Function0 function0, hq5 hq5Var, int i) {
        int i2;
        Function0 function02;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-222983881);
        if ((i & 6) == 0) {
            i2 = (oq5Var.h(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        boolean z = false;
        if (oq5Var.P(i2 & 1, (i2 & 3) != 2)) {
            float f = 13;
            float f2 = 10;
            function02 = function0;
            y7g.c(rvf.M(R.string.let_in_details, oq5Var), function02, d.t(vci.a, 96, 0.0f, 2), nu0.i(), new q0k(f, f2, f, f2), 40, oq5Var, ((i2 << 3) & 112) | 221568, 0);
        } else {
            function02 = function0;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new i80(i, 5, function02, z);
        }
    }

    public static final void m(qor qorVar, u0q u0qVar, Function0 function0, yci yciVar, hq5 hq5Var, int i) {
        int i2;
        u0q u0qVar2;
        kjn kjnVar;
        fk0 fk0Var;
        u0qVar.getClass();
        function0.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1707598984);
        if ((i & 6) == 0) {
            i2 = (oq5Var.f(qorVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.h(u0qVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.h(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var.f(yciVar) ? 2048 : 1024;
        }
        int i3 = i2;
        if (oq5Var.P(i3 & 1, (i3 & 1171) != 1170)) {
            Object K = oq5Var.K();
            int i4 = 12;
            Object obj = null;
            kjn kjnVar2 = gq5.a;
            if (K == kjnVar2) {
                K = new fk0(new cma(0), azt.c, obj, i4);
                oq5Var.k0(K);
            }
            fk0 fk0Var2 = (fk0) K;
            wnr wnrVar = (wnr) oq5Var.j(qpg.a);
            act S = weo.S(wnrVar.b, 0, null, 6);
            nyf lifecycle = ((dzf) oq5Var.j(ykg.a)).getLifecycle();
            boolean h = oq5Var.h(u0qVar) | oq5Var.h(lifecycle) | oq5Var.f(wnrVar) | oq5Var.h(fk0Var2) | oq5Var.f(S);
            Object K2 = oq5Var.K();
            if (h || K2 == kjnVar2) {
                kjnVar = kjnVar2;
                fk0Var = fk0Var2;
                inr inrVar = new inr(u0qVar, lifecycle, wnrVar, fk0Var, S, null, 1);
                u0qVar2 = u0qVar;
                oq5Var.k0(inrVar);
                K2 = inrVar;
            } else {
                u0qVar2 = u0qVar;
                fk0Var = fk0Var2;
                kjnVar = kjnVar2;
            }
            gld.w(oq5Var, u0qVar2, (Function2) K2);
            vm0 vm0Var = fk0Var.c;
            boolean f = oq5Var.f(vm0Var);
            Object K3 = oq5Var.K();
            if (f || K3 == kjnVar) {
                K3 = new xp(vm0Var, 17);
                oq5Var.k0(K3);
            }
            yci u = xp3.u(d.d(androidx.compose.foundation.layout.a.i(yciVar, (Function1) K3), 1.0f), ugo.a(100));
            agr agrVar = eq0.a;
            yci o = androidx.compose.foundation.layout.a.o(androidx.compose.foundation.layout.a.q(androidx.compose.foundation.a.e(androidx.compose.foundation.a.b(u, c3x.D(((dq0) oq5Var.j(agrVar)).c.c, ((dq0) oq5Var.j(agrVar)).c.a), vnj.i), false, null, null, function0, 7), 16, 0.0f, 12, 0.0f, 10), 0.0f, 14, 1);
            nho a = lho.a(qx0.g(6), b2c.l, oq5Var, 54);
            int i5 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, o);
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
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i5))) {
                ouj.x(i5, oq5Var, i5, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            if (1.0f <= 0.0d) {
                qme.a("invalid weight; must be greater than zero");
            }
            b(qorVar, new LayoutWeightElement(true, 1.0f), oq5Var, i3 & 14);
            l(function0, oq5Var, (i3 >> 6) & 14);
            oq5Var.p(true);
        } else {
            u0qVar2 = u0qVar;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new zkl(i, 11, qorVar, u0qVar2, function0, yciVar);
        }
    }

    public static final void n(yci yciVar, String str, String str2, String str3, onq onqVar, hq5 hq5Var, int i) {
        oq5 oq5Var;
        yci yciVar2;
        boolean z;
        boolean z2;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(913850442);
        int i2 = i | 6 | (oq5Var2.f(str) ? 32 : 16) | (oq5Var2.f(str2) ? 256 : 128) | (oq5Var2.f(str3) ? 2048 : 1024) | (oq5Var2.h(onqVar) ? 16384 : RemoteCameraConfig.Notification.ID);
        if (oq5Var2.P(i2 & 1, (i2 & 9363) != 9362)) {
            tgo C = o5g.C(oq5Var2);
            vci vciVar = vci.a;
            yci d = d.d(androidx.compose.foundation.layout.a.m(c3x.y(1, d85.b, androidx.compose.foundation.a.b(xp3.u(vciVar, C), c3x.h(4294949820L), vnj.i), o5g.C(oq5Var2)), 8), 1.0f);
            kfh d2 = ug3.d(b2c.f, false);
            int i3 = oq5Var2.P;
            androidx.compose.runtime.internal.a l = oq5Var2.l();
            yci H = vnj.H(oq5Var2, d);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var2.d0();
            if (oq5Var2.O) {
                oq5Var2.k(grbVar);
            } else {
                oq5Var2.n0();
            }
            kb5 kb5Var = wp5.f;
            g0g.U(oq5Var2, d2, kb5Var);
            kb5 kb5Var2 = wp5.e;
            g0g.U(oq5Var2, l, kb5Var2);
            kb5 kb5Var3 = wp5.g;
            if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var2, i3, kb5Var3);
            }
            kb5 kb5Var4 = wp5.d;
            g0g.U(oq5Var2, H, kb5Var4);
            ta5 a = sa5.a(qx0.c, b2c.n, oq5Var2, 0);
            int i4 = oq5Var2.P;
            androidx.compose.runtime.internal.a l2 = oq5Var2.l();
            yci H2 = vnj.H(oq5Var2, vciVar);
            oq5Var2.d0();
            if (oq5Var2.O) {
                oq5Var2.k(grbVar);
            } else {
                oq5Var2.n0();
            }
            g0g.U(oq5Var2, a, kb5Var);
            g0g.U(oq5Var2, l2, kb5Var2);
            if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var2, i4, kb5Var3);
            }
            g0g.U(oq5Var2, H2, kb5Var4);
            if (str != null) {
                oq5Var2.Z(-2051115744);
                z2 = true;
                z = false;
                xcs.b("Title: ".concat(str), null, 0L, 0L, tqc.p, 0L, null, null, 0L, 0, false, 0, 0, null, null, oq5Var2, 196608, 0, 131038);
                oq5Var = oq5Var2;
            } else {
                oq5Var = oq5Var2;
                z = false;
                z2 = true;
                oq5Var.Z(838461340);
            }
            oq5Var.p(z);
            if (str2 != null) {
                oq5Var.Z(-2051112660);
                oq5 oq5Var3 = oq5Var;
                xcs.b("Description: ".concat(str2), null, 0L, 0L, tqc.p, 0L, null, null, 0L, 0, false, 0, 0, null, null, oq5Var3, 196608, 0, 131038);
                oq5Var = oq5Var3;
            } else {
                oq5Var.Z(838461340);
            }
            oq5Var.p(z);
            if (str3 != null) {
                oq5Var.Z(-2051109238);
                oq5 oq5Var4 = oq5Var;
                xcs.b("ShowPolicy: ".concat(str3), null, 0L, 0L, tqc.p, 0L, null, null, 0L, 0, false, 0, 0, null, null, oq5Var4, 196608, 0, 131038);
                oq5Var = oq5Var4;
            } else {
                oq5Var.Z(838461340);
            }
            oq5Var.p(z);
            if (onqVar == null || Intrinsics.d(onqVar.a, "null")) {
                oq5Var.Z(838461340);
            } else {
                oq5Var.Z(-2051105246);
                oq5 oq5Var5 = oq5Var;
                xcs.b("Source: " + onqVar, null, 0L, 0L, tqc.p, 0L, null, null, 0L, 0, false, 0, 0, null, null, oq5Var5, 196608, 0, 131038);
                oq5Var = oq5Var5;
            }
            oq5Var.p(z);
            oq5Var.p(z2);
            oq5Var.p(z2);
            yciVar2 = vciVar;
        } else {
            oq5Var = oq5Var2;
            oq5Var.S();
            yciVar2 = yciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new pli(i, 22, yciVar2, str, str2, str3, onqVar);
        }
    }

    public static final void o(int i, hq5 hq5Var, yci yciVar, String str) {
        int i2;
        oq5 oq5Var;
        yci u;
        str.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(743518030);
        if ((i & 6) == 0) {
            i2 = (oq5Var2.f(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var2.f(yciVar) ? 32 : 16;
        }
        if (oq5Var2.P(i2 & 1, (i2 & 19) != 18)) {
            agr agrVar = eq0.a;
            long j = ((dq0) oq5Var2.j(agrVar)).b.b;
            ges i3 = nu0.i();
            u = d.u(androidx.compose.foundation.layout.a.q(androidx.compose.foundation.a.b(d.e(d.d(yciVar, 1.0f), 40), c3x.D(d85.m, ((dq0) oq5Var2.j(agrVar)).c.c), vnj.i), 16, 0.0f, 0.0f, 0.0f, 14), b2c.l, (r2 & 2) == 0);
            Object K = oq5Var2.K();
            if (K == gq5.a) {
                K = new d4u(21);
                oq5Var2.k0(K);
            }
            oq5Var = oq5Var2;
            xv7.j(str, nfp.b(u, false, (Function1) K), j, 0L, 0L, 0, 0L, 0, false, 0, 0, null, i3, oq5Var, i2 & 14, 0, 65528);
        } else {
            oq5Var = oq5Var2;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new a5(str, yciVar, i, 3);
        }
    }

    public static final void p(boolean z, yci yciVar, ihv ihvVar, boolean z2, hq5 hq5Var, int i, int i2) {
        int i3;
        yci yciVar2;
        boolean z3;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(642942778);
        if ((i & 6) == 0) {
            i3 = (oq5Var.g(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= oq5Var.f(yciVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= oq5Var.d(ihvVar == null ? -1 : ihvVar.ordinal()) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= oq5Var.g(z2) ? 2048 : 1024;
        }
        if ((i3 & 1171) == 1170 && oq5Var.z()) {
            oq5Var.S();
            yciVar2 = yciVar;
            z3 = z2;
        } else {
            if (i4 != 0) {
                yciVar = vci.a;
            }
            yci yciVar3 = yciVar;
            if (i5 != 0) {
                z2 = true;
            }
            boolean z4 = z2;
            wiv.c(z, yciVar3, ihvVar, z4, oq5Var, i3 & 8190);
            yciVar2 = yciVar3;
            z3 = z4;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new vkg(z, yciVar2, ihvVar, z3, i, i2, 4);
        }
    }

    public static final void q(xjv xjvVar, boolean z, boolean z2, yci yciVar, ihv ihvVar, hq5 hq5Var, int i) {
        int i2;
        ihv ihvVar2;
        oq5 oq5Var;
        yci yciVar2;
        xjvVar.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-1660919749);
        if ((i & 6) == 0) {
            i2 = (oq5Var2.h(xjvVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var2.g(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var2.g(z2) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        if ((i & 24576) == 0) {
            i3 |= oq5Var2.d(ihvVar == null ? -1 : ihvVar.ordinal()) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((i3 & 9363) == 9362 && oq5Var2.z()) {
            oq5Var2.S();
            yciVar2 = yciVar;
            ihvVar2 = ihvVar;
            oq5Var = oq5Var2;
        } else {
            ihvVar2 = ihvVar;
            oq5Var = oq5Var2;
            wiv.e(xjvVar, z, z2, ihvVar2, oq5Var, 65534 & i3);
            yciVar2 = vci.a;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new en6(xjvVar, z, z2, yciVar2, ihvVar2, i, 9);
        }
    }

    public static final boolean r(int i, KeyEvent keyEvent) {
        return ((int) (saf.R(keyEvent) >> 32)) == i;
    }

    public static final xci s(sv7 sv7Var, int i) {
        xci xciVar = ((xci) sv7Var).a.f;
        if (xciVar == null || (xciVar.d & i) == 0) {
            return null;
        }
        while (xciVar != null) {
            int i2 = xciVar.c;
            if ((i2 & 2) != 0) {
                return null;
            }
            if ((i2 & i) != 0) {
                return xciVar;
            }
            xciVar = xciVar.f;
        }
        return null;
    }

    public static final onh t(onh onhVar, String str) {
        str.getClass();
        hoh hohVar = onhVar.d;
        Bundle bundle = hohVar.I;
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putString("originalTrackId", str);
        eoh a = hohVar.a();
        a.H = bundle;
        hoh hohVar2 = new hoh(a);
        wmh a2 = onhVar.a();
        a2.k = hohVar2;
        return a2.a();
    }

    public static final cjc u(aqi aqiVar) {
        return aqiVar instanceof cjc ? (cjc) aqiVar : new dit(aqiVar);
    }

    public static final onu v(androidx.compose.foundation.layout.c cVar, boolean z, boolean z2, oq5 oq5Var, int i) {
        cVar.getClass();
        float c = cVar.c();
        float f = z0v.a;
        gtu gtuVar = (gtu) oq5Var.j(htu.a);
        float c2 = z0v.c(false, z, c, z2, oq5Var);
        if (z2) {
            c2 = (c2 - gtuVar.e) - gtuVar.j;
        }
        float f2 = gtuVar.a;
        return Float.compare(c2, ((f2 - z0v.b) + z0v.a) + z0v.d) >= 0 ? onu.a : Float.compare(c2, f2) >= 0 ? onu.b : onu.c;
    }

    public static pim w(JSONObject jSONObject) {
        return new pim(jSONObject.getInt("capacity"), jSONObject.getInt("min"), jSONObject.getInt("max"));
    }

    public static final pq4 x(onh onhVar) {
        String string;
        Bundle bundle;
        hoh hohVar = onhVar.d;
        Bundle bundle2 = hohVar.I;
        if (bundle2 == null || (string = bundle2.getString("codec")) == null || (bundle = hohVar.I) == null) {
            return null;
        }
        int i = bundle.getInt("bitrate");
        oq4.b.getClass();
        return new pq4(x2i.Y(string), i);
    }

    public static final String y(List list) {
        list.getClass();
        return CollectionsKt.X(list, null, null, null, new jwv(28), 31);
    }

    public static final String z(e5w e5wVar) {
        e5wVar.getClass();
        return ouj.o(e5wVar.a, "–", e5wVar.b);
    }
}
