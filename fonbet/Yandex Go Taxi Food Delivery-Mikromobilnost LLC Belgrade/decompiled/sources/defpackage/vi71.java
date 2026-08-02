package defpackage;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.view.View;
import com.google.android.gms.tasks.Task;
import com.yandex.mobile.ads.common.AdActivity;
import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import com.yandex.payment.common.result.ResultType;
import java.io.EOFException;
import java.io.IOException;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ScheduledFuture;
import javax.net.ssl.SSLException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.collections.a;
import kotlin.collections.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.text.Regex;
import org.json.JSONException;
import org.json.JSONObject;
import org.xmlpull.v1.XmlPullParser;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;
import yads.bo2;
import yads.c63;
import yads.cw2;
import yads.dv;
import yads.hm2;
import yads.jk3;
import yads.kk;
import yads.n72;
import yads.n83;
import yads.p62;
import yads.p9;
import yads.p93;
import yads.q63;
import yads.qe2;
import yads.qf0;
import yads.qp1;
import yads.rf0;
import yads.s93;
import yads.sf0;
import yads.tp0;
import yads.y43;
import yads.y92;

/* loaded from: classes7.dex */
public class vi71 implements vk61, g291, pj71, zc81, xn71, f291, ku71, wx60 {
    public final /* synthetic */ int a;
    public final Object b;
    public Object c;
    public Object w;

    public vi71(Context context, ge71 ge71Var, int i) {
        this.a = i;
        switch (i) {
            case 12:
                xf81 xf81Var = new xf81();
                hlx0 hlx0Var = new hlx0(context, ge71Var);
                it71 it71Var = new it71();
                this.b = xf81Var;
                this.c = hlx0Var;
                this.w = it71Var;
                break;
            case 27:
                xf81 xf81Var2 = new xf81();
                y971 y971Var = new y971();
                fp71 fp71Var = new fp71(context, ge71Var);
                this.b = xf81Var2;
                this.c = y971Var;
                this.w = fp71Var;
                break;
            default:
                t281 t281Var = new t281();
                rr41 rr41Var = new rr41(context, ge71Var, 19);
                e871 e871Var = new e871();
                this.b = t281Var;
                this.c = rr41Var;
                this.w = e871Var;
                break;
        }
    }

    private final void l(jk3 jk3Var) {
    }

    public Object a(Context context, Intent intent, qe2 qe2Var) {
        Object failure;
        br81 br81Var;
        j18 j18Var = new j18(1, dvw.b(qe2Var));
        j18Var.u();
        long andIncrement = zh71.a.getAndIncrement();
        Object obj = ((ji41) this.w).b;
        Intent intent2 = new Intent(context, (Class<?>) AdActivity.class);
        intent2.putExtra("window_type", "window_type_activity_result");
        intent2.putExtra("data_identifier", andIncrement);
        vi71 vi71Var = (vi71) this.c;
        rf0 rf0Var = new rf0(j18Var);
        sf0 sf0Var = new sf0(j18Var);
        vi71Var.getClass();
        lk81 lk81Var = new lk81((d881) vi71Var.w, (fe81) vi71Var.b, new cl81(), (v981) vi71Var.c, new z181(intent, rf0Var, sf0Var), 48);
        br81 br81Var2 = br81.c;
        if (br81Var2 == null) {
            synchronized (br81.b) {
                br81Var = br81.c;
                if (br81Var == null) {
                    br81Var = new br81();
                    br81.c = br81Var;
                }
            }
            br81Var2 = br81Var;
        }
        synchronized (br81.b) {
            br81Var2.a.put(Long.valueOf(andIncrement), lk81Var);
        }
        j18Var.w(new qf0(br81Var2, andIncrement));
        try {
            context.startActivity(intent2);
            failure = zy11.a;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a = Result.a(failure);
        if (a != null) {
            br81Var2.a(andIncrement);
            ((ge71) this.b).d("Failed to launch AdActivity for result", a);
            if (j18Var.t() instanceof mf60) {
                j18Var.resumeWith(new Result.Failure(a));
            }
        }
        Object s = j18Var.s();
        return s == CoroutineSingletons.COROUTINE_SUSPENDED ? s : zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0245 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ArrayList b(List list) {
        List x0;
        Iterator it;
        Iterator it2;
        Iterator it3;
        zw81 zw81Var;
        l371 l371Var;
        l371 l371Var2;
        Object obj;
        Object obj2;
        l371 l371Var3;
        zw81 zw81Var2;
        ((op61) this.b).getClass();
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it4 = list.iterator();
            while (it4.hasNext()) {
                if (((bs81) it4.next()).D != null) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : list) {
                        if (((bs81) obj3).D != null) {
                            arrayList.add(obj3);
                        }
                    }
                    x0 = a.x0(arrayList, new bm61());
                    hlx0 hlx0Var = (hlx0) this.c;
                    hlx0Var.getClass();
                    zw81 zw81Var3 = (zw81) hlx0Var.w;
                    ArrayList arrayList2 = new ArrayList();
                    it = x0.iterator();
                    while (it.hasNext()) {
                        bs81 bs81Var = (bs81) it.next();
                        k781 k781Var = (k781) a.R(bs81Var.b);
                        if (k781Var != null) {
                            if (k781Var.b.isEmpty()) {
                                gg81 gg81Var = (gg81) hlx0Var.y;
                                if (gg81Var != null && gg81Var.D0 && bs81Var.a) {
                                    String str = bs81Var.B;
                                    if (str == null) {
                                        str = "";
                                    }
                                    l371Var3 = new l371(bs81Var, k781Var, new na71(str, null, null, null, null, null, 0, 0, 0, null), null, null, null, null);
                                } else {
                                    hn71 hn71Var = (hn71) hlx0Var.b;
                                    ArrayList arrayList3 = k781Var.a;
                                    hn71Var.getClass();
                                    Iterator it5 = arrayList3.iterator();
                                    double d = -1.0d;
                                    na71 na71Var = null;
                                    while (it5.hasNext()) {
                                        na71 na71Var2 = (na71) it5.next();
                                        double d2 = "video/mp4".equals(na71Var2.d) ? 1.5d : 1.0d;
                                        i971 i971Var = (i971) hn71Var.c;
                                        i971Var.getClass();
                                        Iterator it6 = it;
                                        int i = na71Var2.i;
                                        if (i == 0) {
                                            int i2 = na71Var2.g * na71Var2.h;
                                            qd71 qd71Var = (qd71) i971Var.b;
                                            zw81Var2 = zw81Var3;
                                            i = (int) ((i2 / (qd71Var.b * qd71Var.a)) * qd71Var.c);
                                        } else {
                                            zw81Var2 = zw81Var3;
                                        }
                                        hn71 hn71Var2 = hn71Var;
                                        double abs = d2 / ((((int) Math.max(0.0d, i)) < 100 ? 10.0d : ((int) Math.abs(r3 - r1)) / ((qd71) hn71Var.b).c) + 1.0d);
                                        if (abs > d) {
                                            d = abs;
                                            na71Var = na71Var2;
                                        }
                                        it = it6;
                                        zw81Var3 = zw81Var2;
                                        hn71Var = hn71Var2;
                                    }
                                    it3 = it;
                                    zw81Var = zw81Var3;
                                    l371Var = null;
                                    if (na71Var != null) {
                                        uc71 uc71Var = bs81Var.w;
                                        ((h271) hlx0Var.c).getClass();
                                        Iterator it7 = uc71Var.a.iterator();
                                        while (true) {
                                            if (!it7.hasNext()) {
                                                obj = null;
                                                break;
                                            }
                                            obj = it7.next();
                                            cj61 cj61Var = (cj61) obj;
                                            if (cj61Var.a.equals("social_ad_info") && cj61Var.b.length() > 0) {
                                                break;
                                            }
                                        }
                                        cj61 cj61Var2 = (cj61) obj;
                                        String str2 = cj61Var2 != null ? cj61Var2.b : null;
                                        cz61 cz61Var = str2 != null ? new cz61(str2) : null;
                                        zw81Var.getClass();
                                        String a = zw81.a(uc71Var);
                                        String a2 = zw81.a(uc71Var);
                                        JSONObject c = a2 != null ? xf71.c(a2) : null;
                                        ((io81) hlx0Var.x).getClass();
                                        Iterator it8 = uc71Var.a.iterator();
                                        while (true) {
                                            if (!it8.hasNext()) {
                                                obj2 = null;
                                                break;
                                            }
                                            obj2 = it8.next();
                                            if (((cj61) obj2).a.equals("AdTune")) {
                                                break;
                                            }
                                        }
                                        cj61 cj61Var3 = (cj61) obj2;
                                        String str3 = cj61Var3 != null ? cj61Var3.b : null;
                                        JSONObject c2 = str3 != null ? xf71.c(str3) : null;
                                        l371Var3 = new l371(bs81Var, k781Var, na71Var, cz61Var, a, c, c2 != null ? new wh81(c2.optString(AuthSdkActivity.RESPONSE_TYPE_TOKEN), c2.optString("advertiserInfo"), c2.optInt("show", 0) == 1) : null);
                                        l371Var2 = l371Var3;
                                        if (l371Var2 != null) {
                                            arrayList2.add(l371Var2);
                                        }
                                        it = it3;
                                        zw81Var3 = zw81Var;
                                    }
                                }
                            } else {
                                l371Var3 = new l371(bs81Var, k781Var, new na71("", null, null, null, null, null, 0, 0, 0, null), null, null, null, null);
                            }
                            it3 = it;
                            zw81Var = zw81Var3;
                            l371Var2 = l371Var3;
                            if (l371Var2 != null) {
                            }
                            it = it3;
                            zw81Var3 = zw81Var;
                        } else {
                            it3 = it;
                            zw81Var = zw81Var3;
                            l371Var = null;
                        }
                        l371Var2 = l371Var;
                        if (l371Var2 != null) {
                        }
                        it = it3;
                        zw81Var3 = zw81Var;
                    }
                    arrayList2.size();
                    ArrayList arrayList4 = new ArrayList(tcc.n(arrayList2, 10));
                    it2 = arrayList2.iterator();
                    int i3 = 0;
                    while (it2.hasNext()) {
                        Object next = it2.next();
                        int i4 = i3 + 1;
                        if (i3 < 0) {
                            scc.m();
                            throw null;
                        }
                        l371 l371Var4 = (l371) next;
                        ((r400) this.w).getClass();
                        bs81 bs81Var2 = l371Var4.a;
                        k781 k781Var2 = l371Var4.b;
                        na71 na71Var3 = l371Var4.c;
                        wh81 wh81Var = l371Var4.d;
                        if (wh81Var != null) {
                            String str4 = wh81Var.c;
                            ArrayList arrayList5 = new ArrayList();
                            String str5 = wh81Var.b;
                            if (!evu0.J(str4)) {
                                arrayList5.add(str4);
                            }
                            if (!evu0.J(str5)) {
                                arrayList5.add("erid: ".concat(str5));
                            }
                            a.X(arrayList5, " · ", null, null, null, 62);
                        }
                        arrayList4.add(new i581(k781Var2, bs81Var2, na71Var3, new a4(na71Var3.h, na71Var3.g, na71Var3.a), String.valueOf(zh71.a.getAndIncrement())));
                        i3 = i4;
                    }
                    return arrayList4;
                }
            }
        }
        x0 = a.J0(list);
        hlx0 hlx0Var2 = (hlx0) this.c;
        hlx0Var2.getClass();
        zw81 zw81Var32 = (zw81) hlx0Var2.w;
        ArrayList arrayList22 = new ArrayList();
        it = x0.iterator();
        while (it.hasNext()) {
        }
        arrayList22.size();
        ArrayList arrayList42 = new ArrayList(tcc.n(arrayList22, 10));
        it2 = arrayList22.iterator();
        int i32 = 0;
        while (it2.hasNext()) {
        }
        return arrayList42;
    }

    @Override // defpackage.vk61
    public kg61 c(du71 du71Var, bq71 bq71Var) {
        return new cf71((Context) this.w, du71Var, bq71Var, (d881) this.b, (qp1) this.c);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public uy71 d(JSONObject jSONObject, zy2 zy2Var) {
        s191 oe81Var;
        if (!y6a1.a(jSONObject, "name", "type", "clickable", "required")) {
            yx61.e("Native Ad json has not required attributes");
            return null;
        }
        String optString = jSONObject.optString("type");
        if (optString == null || optString.length() == 0 || optString.equals("null")) {
            yx61.e("Native Ad json has not required attributes");
            return null;
        }
        String optString2 = jSONObject.optString("name");
        if (optString2 == null || optString2.length() == 0 || optString2.equals("null")) {
            yx61.e("Native Ad json has not required attributes");
            return null;
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("link");
        fj71 r = optJSONObject == null ? null : ((lm71) this.c).r(optJSONObject, zy2Var);
        Context context = (Context) this.w;
        ge71 ge71Var = (ge71) this.b;
        if (optString2.equals("close_button")) {
            oe81Var = new fn81();
        } else {
            if (!optString2.equals("feedback")) {
                switch (optString.hashCode()) {
                    case -1034364087:
                        if (optString.equals("number")) {
                            oe81Var = new oe81();
                            break;
                        }
                        break;
                    case -951532658:
                        if (optString.equals("qrcode")) {
                            oe81Var = new u291();
                            break;
                        }
                        break;
                    case -891985903:
                        if (optString.equals("string")) {
                            oe81Var = new ir71();
                            break;
                        }
                        break;
                    case -410956671:
                        if (optString.equals("container")) {
                            oe81Var = new qc81();
                            break;
                        }
                        break;
                    case 100313435:
                        if (optString.equals("image")) {
                            oe81Var = new yk61();
                            break;
                        }
                        break;
                    case 103772132:
                        if (optString.equals("media")) {
                            oe81Var = new s421(context, ge71Var, zy2Var);
                            break;
                        }
                        break;
                    case 1124446108:
                        if (optString.equals("warning")) {
                            oe81Var = new fn71();
                            break;
                        }
                        break;
                }
                yx61.e("Native Ad json has not required attributes");
                return null;
            }
            oe81Var = new lm71(20, new yk61());
        }
        return new uy71(optString2, optString, oe81Var.a(jSONObject), r, jSONObject.getBoolean("clickable"), jSONObject.getBoolean("required"));
    }

    public te81 e(Context context, int i, boolean z) {
        d881 d881Var = (d881) this.c;
        o081 o081Var = (o081) this.w;
        View a = o081Var != null ? o081Var.c.a() : null;
        if (a == null) {
            return new a581(p93.g, null, null);
        }
        if (sj71.e(a)) {
            return new a581(p93.h, null, null);
        }
        lp81 a2 = sj71.a.a(a);
        String str = a2.b;
        if (a2.a < 1) {
            return new a581(p93.i, null, str);
        }
        int b = sj71.b(a);
        return (b >= i || z) ? (!jl40.l(d881Var.j, "divkit") || d881Var.C) ? ((vi71) this.b).g(z) : new f881() : new a581(p93.e, null, oyr.h(b, i, "actualPercent: ", ", expectedPercent: "));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.zc81
    public Object f(XmlPullParser xmlPullParser, zy2 zy2Var) {
        int i;
        String str;
        ArrayList arrayList;
        boolean z;
        y971 y971Var;
        ArrayList arrayList2;
        xf81 xf81Var;
        boolean z2;
        vi71 vi71Var = this;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        switch (vi71Var.a) {
            case 16:
                return p(xmlPullParser, zy2Var);
            default:
                ((xf81) vi71Var.b).getClass();
                int i2 = 2;
                String str2 = null;
                xmlPullParser2.require(2, null, "Creative");
                String attributeValue = xmlPullParser2.getAttributeValue(null, "id");
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                hn71 hn71Var = null;
                String str3 = null;
                mf1 mf1Var = null;
                String str4 = null;
                boolean z3 = false;
                int i3 = 0;
                while (xmlPullParser2.next() != 3) {
                    if (xmlPullParser2.getEventType() == i2) {
                        String name = xmlPullParser2.getName();
                        if ("Linear".equals(name)) {
                            y971 y971Var2 = (y971) vi71Var.c;
                            xf81 xf81Var2 = y971Var2.a;
                            xf81Var2.getClass();
                            xmlPullParser2.require(i2, str2, "Linear");
                            y971Var2.d.getClass();
                            String attributeValue2 = xmlPullParser2.getAttributeValue(str2, "skipoffset");
                            if (attributeValue2 == null) {
                                attributeValue2 = "";
                            }
                            mf1Var = attributeValue2.length() > 0 ? new mf1((byte) 0, 28, attributeValue2) : null;
                            while (true) {
                                xf81Var2.getClass();
                                if (xmlPullParser2.next() != 3) {
                                    if (xmlPullParser2.getEventType() == 2) {
                                        String name2 = xmlPullParser2.getName();
                                        if (name2 != null) {
                                            switch (name2.hashCode()) {
                                                case -2049897434:
                                                    if (name2.equals("VideoClicks")) {
                                                        y971Var2.b.getClass();
                                                        u881 a = ac81.a(xmlPullParser2);
                                                        str3 = a.b;
                                                        for (Iterator it = a.a.iterator(); it.hasNext(); it = it) {
                                                            arrayList5.add(new tz61("clickTracking", (String) it.next(), null));
                                                            y971Var2 = y971Var2;
                                                        }
                                                        break;
                                                    }
                                                    break;
                                                case -1927368268:
                                                    if (name2.equals("Duration")) {
                                                        xf81 xf81Var3 = y971Var2.c.a;
                                                        xmlPullParser2.require(2, null, "Duration");
                                                        Long a2 = mga1.a(xf81.a(xmlPullParser2));
                                                        if (a2 != null) {
                                                            i3 = (int) a2.longValue();
                                                            break;
                                                        } else {
                                                            i3 = 0;
                                                            break;
                                                        }
                                                    } else {
                                                        break;
                                                    }
                                                case -1348833651:
                                                    if (name2.equals("AdParameters")) {
                                                        str4 = xf81.a(xmlPullParser2);
                                                        break;
                                                    } else {
                                                        break;
                                                    }
                                                case -385055469:
                                                    if (name2.equals("MediaFiles")) {
                                                        arrayList3.addAll(y971Var2.e.f(xmlPullParser2, zy2Var));
                                                        break;
                                                    }
                                                    break;
                                                case 70476538:
                                                    if (name2.equals("Icons")) {
                                                        arrayList4.addAll(y971Var2.f.p(xmlPullParser2, zy2Var));
                                                        break;
                                                    }
                                                    break;
                                                case 611554000:
                                                    if (name2.equals("TrackingEvents")) {
                                                        Iterator it2 = y971Var2.g.p(xmlPullParser2, zy2Var).iterator();
                                                        while (it2.hasNext()) {
                                                            arrayList5.add((tz61) it2.next());
                                                        }
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                        y971Var = y971Var2;
                                        xf81.b(xmlPullParser2);
                                        y971Var2 = y971Var;
                                    }
                                    y971Var = y971Var2;
                                    y971Var2 = y971Var;
                                } else {
                                    z3 = true;
                                }
                            }
                        } else if ("CreativeExtensions".equals(name)) {
                            fp71 fp71Var = (fp71) vi71Var.w;
                            xf81 xf81Var4 = (xf81) fp71Var.a;
                            xf81Var4.getClass();
                            xmlPullParser2.require(2, null, "CreativeExtensions");
                            tp0 tp0Var = null;
                            ArrayList arrayList6 = null;
                            au2 au2Var = null;
                            while (true) {
                                xf81Var4.getClass();
                                if (xmlPullParser2.next() != 3) {
                                    if (xmlPullParser2.getEventType() != 2) {
                                        arrayList2 = arrayList3;
                                        xf81Var = xf81Var4;
                                        z2 = z3;
                                    } else if ("CreativeExtension".equals(xmlPullParser2.getName())) {
                                        String attributeValue3 = xmlPullParser2.getAttributeValue(null, "type");
                                        if ("false_click".equals(attributeValue3)) {
                                            tp0Var = (tp0) ((i971) fp71Var.w).f(xmlPullParser2, zy2Var);
                                        } else if ("yandex_tracking_events".equals(attributeValue3)) {
                                            arrayList6 = ((vi71) fp71Var.x).p(xmlPullParser2, zy2Var);
                                        } else if ("yandex_linear_creative_info".equals(attributeValue3)) {
                                            s421 s421Var = (s421) fp71Var.b;
                                            s421Var.getClass();
                                            try {
                                                ((xf81) s421Var.w).getClass();
                                                JSONObject jSONObject = new JSONObject(xf81.a(xmlPullParser2));
                                                Iterator<String> keys = jSONObject.keys();
                                                arrayList2 = arrayList3;
                                                List list = EmptyList.a;
                                                while (keys.hasNext()) {
                                                    xf81 xf81Var5 = xf81Var4;
                                                    String next = keys.next();
                                                    boolean z4 = z3;
                                                    if ("assets".equals(next)) {
                                                        list = ((nr41) s421Var.b).a(jSONObject, zy2Var);
                                                    } else if ("link".equals(next)) {
                                                        ((lm71) s421Var.x).r(jSONObject.getJSONObject(next), zy2Var);
                                                    } else if ("settings".equals(next)) {
                                                        JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                                                        ((sf71) s421Var.c).getClass();
                                                        JSONObject optJSONObject = jSONObject2.optJSONObject("videoSelection");
                                                        if (optJSONObject != null) {
                                                            optJSONObject.optString("preferableMimeType").getClass();
                                                            optJSONObject.optBoolean("inOrderOfList");
                                                        }
                                                    }
                                                    z3 = z4;
                                                    xf81Var4 = xf81Var5;
                                                }
                                                xf81Var = xf81Var4;
                                                z2 = z3;
                                                xmlPullParser2 = xmlPullParser;
                                                au2Var = new au2(list);
                                                z3 = z2;
                                                arrayList3 = arrayList2;
                                                xf81Var4 = xf81Var;
                                            } catch (Exception e) {
                                                throw new JSONException(e.getMessage());
                                            }
                                        } else {
                                            arrayList2 = arrayList3;
                                            xf81Var = xf81Var4;
                                            z2 = z3;
                                            if ("yandex_designs".equals(attributeValue3)) {
                                                s421 s421Var2 = (s421) fp71Var.c;
                                                s421Var2.getClass();
                                                try {
                                                    ((xf81) s421Var2.c).getClass();
                                                    s421Var2.i(xf81.a(xmlPullParser), zy2Var.b);
                                                } catch (Exception e2) {
                                                    ((ge71) s421Var2.b).d("Failed to parse DivKit designs from VAST CreativeExtension", e2);
                                                }
                                            } else {
                                                xf81.b(xmlPullParser);
                                            }
                                        }
                                    } else {
                                        arrayList2 = arrayList3;
                                        xf81Var = xf81Var4;
                                        z2 = z3;
                                        xf81.b(xmlPullParser);
                                    }
                                    xmlPullParser2 = xmlPullParser;
                                    z3 = z2;
                                    arrayList3 = arrayList2;
                                    xf81Var4 = xf81Var;
                                } else {
                                    hn71Var = new hn71(tp0Var, arrayList6, au2Var);
                                    vi71Var = this;
                                    xmlPullParser2 = xmlPullParser;
                                }
                            }
                        } else {
                            arrayList = arrayList3;
                            z = z3;
                            str = null;
                            i = 2;
                            xf81.b(xmlPullParser);
                        }
                        i2 = 2;
                        str2 = null;
                    } else {
                        i = i2;
                        str = str2;
                        arrayList = arrayList3;
                        z = z3;
                    }
                    vi71Var = this;
                    xmlPullParser2 = xmlPullParser;
                    str2 = str;
                    i2 = i;
                    z3 = z;
                    arrayList3 = arrayList;
                }
                String str5 = str2;
                ArrayList arrayList7 = arrayList3;
                if (!z3) {
                    return str5;
                }
                ArrayList arrayList8 = new ArrayList();
                Iterator it3 = arrayList7.iterator();
                while (it3.hasNext()) {
                    Object next2 = it3.next();
                    if (next2 instanceof na71) {
                        arrayList8.add(next2);
                    }
                }
                ArrayList arrayList9 = new ArrayList();
                Iterator it4 = arrayList7.iterator();
                while (it4.hasNext()) {
                    Object next3 = it4.next();
                    if (next3 instanceof bs71) {
                        arrayList9.add(next3);
                    }
                }
                return new k781(arrayList8, arrayList9, arrayList4, arrayList5, hn71Var, str3, mf1Var, attributeValue, i3, str4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public te81 g(boolean z) {
        Object obj;
        boolean z2;
        i281 a;
        Iterator it;
        int i;
        List list = (List) this.b;
        ArrayList arrayList = new ArrayList();
        o081 o081Var = (o081) this.w;
        if (o081Var != null) {
            Iterator it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it2.next();
                uy71 uy71Var = (uy71) obj;
                if (uy71Var.f && uy71Var.a.equals("sponsored")) {
                    break;
                }
            }
            uy71 uy71Var2 = (uy71) obj;
            if (uy71Var2 == null || ((a = o081Var.a(uy71Var2)) != null && a.d())) {
                z2 = true;
                if (!z2 && !z) {
                    arrayList.add(s93.d);
                }
                if ((list instanceof Collection) || !list.isEmpty()) {
                    it = list.iterator();
                    i = 0;
                    while (it.hasNext()) {
                        if (((uy71) it.next()).f && (i = i + 1) < 0) {
                            scc.l();
                            throw null;
                        }
                    }
                } else {
                    i = 0;
                }
                if (i >= 2 && !k(new u381(1, this)) && !z) {
                    arrayList.add(s93.e);
                }
                if (!k(new u381(2, this))) {
                    arrayList.add(s93.c);
                }
                return (!k(new u381(0, this)) || z) ? new f881(arrayList) : new a581(p93.f, (String) this.c, null);
            }
        }
        z2 = false;
        if (!z2) {
            arrayList.add(s93.d);
        }
        if (list instanceof Collection) {
        }
        it = list.iterator();
        i = 0;
        while (it.hasNext()) {
        }
        if (i >= 2) {
            arrayList.add(s93.e);
        }
        if (!k(new u381(2, this))) {
        }
        if (k(new u381(0, this))) {
        }
    }

    public mw81 h(Context context, tg81 tg81Var, v881 v881Var, ck61 ck61Var, nr41 nr41Var) {
        jl71 jl71Var;
        Context context2 = context;
        tg81 tg81Var2 = tg81Var;
        o381 o381Var = new o381();
        vi71 vi71Var = (vi71) this.c;
        vi71Var.getClass();
        ArrayList arrayList = new ArrayList();
        List<se71> list = tg81Var2.a.a;
        uj61 uj61Var = ck61Var.c;
        for (se71 se71Var : list) {
            cf71 cf71Var = new cf71(se71Var);
            z4m0 z4m0Var = new z4m0(context2, se71Var, v881Var, cf71Var);
            yg61 yg61Var = ((ur81) vi71Var.c).a;
            hlx0 hlx0Var = new hlx0(se71Var.b, yg61.a(se71Var.i, null), yg61.a(se71Var.h, null), se71Var.c, se71Var.g, se71Var.j);
            tg81 tg81Var3 = tg81Var2;
            hq71 a = ((ph71) vi71Var.w).a(context2, tg81Var3, hlx0Var, cf71Var, ck61Var, o381Var, se71Var, p9.d);
            o381 o381Var2 = o381Var;
            lu71 lu71Var = (lu71) vi71Var.b;
            bo2 bo2Var = se71Var.a;
            lu71Var.getClass();
            int ordinal = bo2Var.ordinal();
            if (ordinal != 0 && ordinal != 1 && ordinal != 2 && ordinal != 3) {
                w511.b();
                return null;
            }
            context2 = context;
            arrayList.add(new t681(context2, se71Var, z4m0Var, v881Var, a, nr41Var));
            tg81Var2 = tg81Var3;
            o381Var = o381Var2;
        }
        tg81 tg81Var4 = tg81Var2;
        Context context3 = context2;
        o381 o381Var3 = o381Var;
        au81 au81Var = new au81(arrayList);
        cf71 cf71Var2 = (cf71) this.w;
        ((k671) cf71Var2.c).getClass();
        qb71 qb71Var = tg81Var4.a;
        List list2 = qb71Var.b;
        hlx0 hlx0Var2 = new hlx0(list2, yg61.a(null, qb71Var.g), yg61.a(null, qb71Var.c), "ad_unit", qb71Var.d, (xn61) null);
        jl71 jl71Var2 = jl71.b;
        if (jl71Var2 == null) {
            synchronized (jl71.a) {
                jl71Var = jl71.b;
                if (jl71Var == null) {
                    jl71Var = new jl71();
                    jl71.b = jl71Var;
                }
            }
            jl71Var2 = jl71Var;
        }
        vi71 vi71Var2 = new vi71(list2, jl71Var2);
        return new mw81(context3, au81Var, v881Var, new hq71(tg81Var4, new tt81(au81Var, vi71Var2, dha1.f(), tg81Var4.b), hlx0Var2, new shu(list2, 4), ck61Var, new j371(o381Var3, 0), new cr71(context3, vi71Var2, jl71Var2), (v981) cf71Var2.b, null, p9.c), nr41Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x039b, code lost:
    
        if (r14 == r6) goto L265;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x039d, code lost:
    
        defpackage.ej71.a(r14, r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x005f A[Catch: all -> 0x0041, TryCatch #0 {all -> 0x0041, blocks: (B:8:0x001c, B:10:0x0033, B:13:0x003a, B:19:0x0222, B:20:0x0225, B:26:0x039d, B:29:0x03a3, B:32:0x03a9, B:34:0x03ac, B:38:0x03af, B:99:0x022d, B:101:0x0235, B:104:0x023f, B:107:0x024a, B:109:0x0252, B:112:0x025c, B:115:0x0267, B:118:0x0273, B:121:0x027f, B:123:0x0287, B:125:0x028f, B:128:0x0299, B:130:0x02a7, B:133:0x02b1, B:136:0x02bc, B:138:0x02c4, B:140:0x02d2, B:142:0x02e0, B:145:0x02f0, B:147:0x02fe, B:150:0x0308, B:152:0x0310, B:154:0x0318, B:156:0x0320, B:159:0x032a, B:161:0x0332, B:164:0x0341, B:166:0x0349, B:169:0x0352, B:171:0x035a, B:174:0x0363, B:176:0x036b, B:179:0x0374, B:192:0x005f, B:199:0x0098, B:200:0x009c, B:203:0x01f4, B:220:0x00a1, B:224:0x00af, B:228:0x00bd, B:232:0x00cb, B:236:0x00d9, B:240:0x00e7, B:244:0x00f5, B:248:0x0103, B:252:0x0111, B:256:0x011f, B:260:0x012c, B:264:0x013a, B:268:0x0148, B:272:0x0156, B:276:0x0164, B:280:0x0172, B:284:0x0180, B:288:0x018d, B:292:0x019a, B:296:0x01a5, B:300:0x01b0, B:304:0x01bc, B:308:0x01c8, B:312:0x01d3, B:316:0x01de, B:320:0x01e9, B:323:0x0075, B:327:0x0081, B:331:0x008d), top: B:7:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0222 A[Catch: all -> 0x0041, TryCatch #0 {all -> 0x0041, blocks: (B:8:0x001c, B:10:0x0033, B:13:0x003a, B:19:0x0222, B:20:0x0225, B:26:0x039d, B:29:0x03a3, B:32:0x03a9, B:34:0x03ac, B:38:0x03af, B:99:0x022d, B:101:0x0235, B:104:0x023f, B:107:0x024a, B:109:0x0252, B:112:0x025c, B:115:0x0267, B:118:0x0273, B:121:0x027f, B:123:0x0287, B:125:0x028f, B:128:0x0299, B:130:0x02a7, B:133:0x02b1, B:136:0x02bc, B:138:0x02c4, B:140:0x02d2, B:142:0x02e0, B:145:0x02f0, B:147:0x02fe, B:150:0x0308, B:152:0x0310, B:154:0x0318, B:156:0x0320, B:159:0x032a, B:161:0x0332, B:164:0x0341, B:166:0x0349, B:169:0x0352, B:171:0x035a, B:174:0x0363, B:176:0x036b, B:179:0x0374, B:192:0x005f, B:199:0x0098, B:200:0x009c, B:203:0x01f4, B:220:0x00a1, B:224:0x00af, B:228:0x00bd, B:232:0x00cb, B:236:0x00d9, B:240:0x00e7, B:244:0x00f5, B:248:0x0103, B:252:0x0111, B:256:0x011f, B:260:0x012c, B:264:0x013a, B:268:0x0148, B:272:0x0156, B:276:0x0164, B:280:0x0172, B:284:0x0180, B:288:0x018d, B:292:0x019a, B:296:0x01a5, B:300:0x01b0, B:304:0x01bc, B:308:0x01c8, B:312:0x01d3, B:316:0x01de, B:320:0x01e9, B:323:0x0075, B:327:0x0081, B:331:0x008d), top: B:7:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x03a3 A[Catch: all -> 0x0041, TryCatch #0 {all -> 0x0041, blocks: (B:8:0x001c, B:10:0x0033, B:13:0x003a, B:19:0x0222, B:20:0x0225, B:26:0x039d, B:29:0x03a3, B:32:0x03a9, B:34:0x03ac, B:38:0x03af, B:99:0x022d, B:101:0x0235, B:104:0x023f, B:107:0x024a, B:109:0x0252, B:112:0x025c, B:115:0x0267, B:118:0x0273, B:121:0x027f, B:123:0x0287, B:125:0x028f, B:128:0x0299, B:130:0x02a7, B:133:0x02b1, B:136:0x02bc, B:138:0x02c4, B:140:0x02d2, B:142:0x02e0, B:145:0x02f0, B:147:0x02fe, B:150:0x0308, B:152:0x0310, B:154:0x0318, B:156:0x0320, B:159:0x032a, B:161:0x0332, B:164:0x0341, B:166:0x0349, B:169:0x0352, B:171:0x035a, B:174:0x0363, B:176:0x036b, B:179:0x0374, B:192:0x005f, B:199:0x0098, B:200:0x009c, B:203:0x01f4, B:220:0x00a1, B:224:0x00af, B:228:0x00bd, B:232:0x00cb, B:236:0x00d9, B:240:0x00e7, B:244:0x00f5, B:248:0x0103, B:252:0x0111, B:256:0x011f, B:260:0x012c, B:264:0x013a, B:268:0x0148, B:272:0x0156, B:276:0x0164, B:280:0x0172, B:284:0x0180, B:288:0x018d, B:292:0x019a, B:296:0x01a5, B:300:0x01b0, B:304:0x01bc, B:308:0x01c8, B:312:0x01d3, B:316:0x01de, B:320:0x01e9, B:323:0x0075, B:327:0x0081, B:331:0x008d), top: B:7:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x022d A[Catch: all -> 0x0041, TryCatch #0 {all -> 0x0041, blocks: (B:8:0x001c, B:10:0x0033, B:13:0x003a, B:19:0x0222, B:20:0x0225, B:26:0x039d, B:29:0x03a3, B:32:0x03a9, B:34:0x03ac, B:38:0x03af, B:99:0x022d, B:101:0x0235, B:104:0x023f, B:107:0x024a, B:109:0x0252, B:112:0x025c, B:115:0x0267, B:118:0x0273, B:121:0x027f, B:123:0x0287, B:125:0x028f, B:128:0x0299, B:130:0x02a7, B:133:0x02b1, B:136:0x02bc, B:138:0x02c4, B:140:0x02d2, B:142:0x02e0, B:145:0x02f0, B:147:0x02fe, B:150:0x0308, B:152:0x0310, B:154:0x0318, B:156:0x0320, B:159:0x032a, B:161:0x0332, B:164:0x0341, B:166:0x0349, B:169:0x0352, B:171:0x035a, B:174:0x0363, B:176:0x036b, B:179:0x0374, B:192:0x005f, B:199:0x0098, B:200:0x009c, B:203:0x01f4, B:220:0x00a1, B:224:0x00af, B:228:0x00bd, B:232:0x00cb, B:236:0x00d9, B:240:0x00e7, B:244:0x00f5, B:248:0x0103, B:252:0x0111, B:256:0x011f, B:260:0x012c, B:264:0x013a, B:268:0x0148, B:272:0x0156, B:276:0x0164, B:280:0x0172, B:284:0x0180, B:288:0x018d, B:292:0x019a, B:296:0x01a5, B:300:0x01b0, B:304:0x01bc, B:308:0x01c8, B:312:0x01d3, B:316:0x01de, B:320:0x01e9, B:323:0x0075, B:327:0x0081, B:331:0x008d), top: B:7:0x001c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void i(u871 u871Var, Uri uri, Map map, long j, long j2, ng71 ng71Var) {
        String str;
        char c;
        int i;
        String lastPathSegment;
        int i2;
        n771[] n771VarArr;
        w971 w971Var = new w971(u871Var, j, j2);
        this.w = w971Var;
        if (((n771) this.c) != null) {
            return;
        }
        synchronized (((ej71) this.b)) {
            try {
                int[] iArr = ej71.a;
                ArrayList arrayList = new ArrayList(16);
                List list = (List) map.get("Content-Type");
                if (list != null && !list.isEmpty()) {
                    str = (String) list.get(0);
                    int i3 = 8;
                    if (str == null) {
                        ArrayList arrayList2 = g681.a;
                        int hashCode = str.hashCode();
                        if (hashCode != -1007807498) {
                            if (hashCode != -586683234) {
                                if (hashCode == 187090231 && str.equals("audio/mp3")) {
                                    str = "audio/mpeg";
                                }
                            } else if (str.equals("audio/x-wav")) {
                                str = "audio/wav";
                            }
                        } else if (str.equals("audio/x-flac")) {
                            str = "audio/flac";
                        }
                        switch (str.hashCode()) {
                            case -2123537834:
                                if (str.equals("audio/eac3-joc")) {
                                    c = 0;
                                    break;
                                }
                                c = 65535;
                                break;
                            case -1662384011:
                                if (str.equals("video/mp2p")) {
                                    c = 1;
                                    break;
                                } else {
                                    c = 65535;
                                    break;
                                }
                            case -1662384007:
                                if (str.equals("video/mp2t")) {
                                    c = 2;
                                    break;
                                } else {
                                    c = 65535;
                                    break;
                                }
                            case -1662095187:
                                if (str.equals("video/webm")) {
                                    c = 3;
                                    break;
                                } else {
                                    c = 65535;
                                    break;
                                }
                            case -1606874997:
                                if (str.equals("audio/amr-wb")) {
                                    c = 4;
                                    break;
                                } else {
                                    c = 65535;
                                    break;
                                }
                            case -1487394660:
                                if (str.equals("image/jpeg")) {
                                    c = 5;
                                    break;
                                } else {
                                    c = 65535;
                                    break;
                                }
                            case -1248337486:
                                if (str.equals("application/mp4")) {
                                    c = 6;
                                    break;
                                } else {
                                    c = 65535;
                                    break;
                                }
                            case -1079884372:
                                if (str.equals("video/x-msvideo")) {
                                    c = 7;
                                    break;
                                } else {
                                    c = 65535;
                                    break;
                                }
                            case -1004728940:
                                if (str.equals("text/vtt")) {
                                    c = '\b';
                                    break;
                                } else {
                                    c = 65535;
                                    break;
                                }
                            case -387023398:
                                if (str.equals("audio/x-matroska")) {
                                    c = '\t';
                                    break;
                                } else {
                                    c = 65535;
                                    break;
                                }
                            case -43467528:
                                if (str.equals("application/webm")) {
                                    c = '\n';
                                    break;
                                } else {
                                    c = 65535;
                                    break;
                                }
                            case 13915911:
                                if (str.equals("video/x-flv")) {
                                    c = 11;
                                    break;
                                } else {
                                    c = 65535;
                                    break;
                                }
                            case 187078296:
                                if (str.equals("audio/ac3")) {
                                    c = '\f';
                                    break;
                                } else {
                                    c = 65535;
                                    break;
                                }
                            case 187078297:
                                if (str.equals("audio/ac4")) {
                                    c = '\r';
                                    break;
                                } else {
                                    c = 65535;
                                    break;
                                }
                            case 187078669:
                                if (str.equals("audio/amr")) {
                                    c = 14;
                                    break;
                                } else {
                                    c = 65535;
                                    break;
                                }
                            case 187090232:
                                if (str.equals("audio/mp4")) {
                                    c = 15;
                                    break;
                                } else {
                                    c = 65535;
                                    break;
                                }
                            case 187091926:
                                if (str.equals("audio/ogg")) {
                                    c = 16;
                                    break;
                                } else {
                                    c = 65535;
                                    break;
                                }
                            case 187099443:
                                if (str.equals("audio/wav")) {
                                    c = 17;
                                    break;
                                } else {
                                    c = 65535;
                                    break;
                                }
                            case 1331848029:
                                if (str.equals("video/mp4")) {
                                    c = 18;
                                    break;
                                } else {
                                    c = 65535;
                                    break;
                                }
                            case 1503095341:
                                if (str.equals("audio/3gpp")) {
                                    c = 19;
                                    break;
                                } else {
                                    c = 65535;
                                    break;
                                }
                            case 1504578661:
                                if (str.equals("audio/eac3")) {
                                    c = 20;
                                    break;
                                } else {
                                    c = 65535;
                                    break;
                                }
                            case 1504619009:
                                if (str.equals("audio/flac")) {
                                    c = 21;
                                    break;
                                } else {
                                    c = 65535;
                                    break;
                                }
                            case 1504824762:
                                if (str.equals("audio/midi")) {
                                    c = 22;
                                    break;
                                } else {
                                    c = 65535;
                                    break;
                                }
                            case 1504831518:
                                if (str.equals("audio/mpeg")) {
                                    c = 23;
                                    break;
                                } else {
                                    c = 65535;
                                    break;
                                }
                            case 1505118770:
                                if (str.equals("audio/webm")) {
                                    c = 24;
                                    break;
                                } else {
                                    c = 65535;
                                    break;
                                }
                            case 2039520277:
                                if (str.equals("video/x-matroska")) {
                                    c = 25;
                                    break;
                                } else {
                                    c = 65535;
                                    break;
                                }
                            default:
                                c = 65535;
                                break;
                        }
                        switch (c) {
                            case 0:
                            case '\f':
                            case 20:
                                i = 0;
                                break;
                            case 1:
                                i = 10;
                                break;
                            case 2:
                                i = 11;
                                break;
                            case 3:
                            case '\t':
                            case '\n':
                            case 24:
                            case 25:
                                i = 6;
                                break;
                            case 4:
                            case 14:
                            case 19:
                                i = 3;
                                break;
                            case 5:
                                i = 14;
                                break;
                            case 6:
                            case 15:
                            case 18:
                                i = 8;
                                break;
                            case 7:
                                i = 16;
                                break;
                            case '\b':
                                i = 13;
                                break;
                            case 11:
                                i = 5;
                                break;
                            case '\r':
                                i = 1;
                                break;
                            case 16:
                                i = 9;
                                break;
                            case 17:
                                i = 12;
                                break;
                            case 21:
                                i = 4;
                                break;
                            case 22:
                                i = 15;
                                break;
                            case 23:
                                i = 7;
                                break;
                        }
                        if (i != -1) {
                            ej71.a(i, arrayList);
                        }
                        lastPathSegment = uri.getLastPathSegment();
                        if (lastPathSegment != null) {
                            if (!lastPathSegment.endsWith(".ac3") && !lastPathSegment.endsWith(".ec3")) {
                                if (lastPathSegment.endsWith(".ac4")) {
                                    i3 = 1;
                                } else {
                                    if (!lastPathSegment.endsWith(".adts") && !lastPathSegment.endsWith(".aac")) {
                                        if (lastPathSegment.endsWith(".amr")) {
                                            i3 = 3;
                                        } else if (lastPathSegment.endsWith(".flac")) {
                                            i3 = 4;
                                        } else if (lastPathSegment.endsWith(".flv")) {
                                            i3 = 5;
                                        } else {
                                            if (!lastPathSegment.endsWith(".mid") && !lastPathSegment.endsWith(".midi") && !lastPathSegment.endsWith(".smf")) {
                                                if (!lastPathSegment.startsWith(".mk", lastPathSegment.length() - 4) && !lastPathSegment.endsWith(".webm")) {
                                                    if (lastPathSegment.endsWith(".mp3")) {
                                                        i3 = 7;
                                                    } else if (!lastPathSegment.endsWith(".mp4") && !lastPathSegment.startsWith(".m4", lastPathSegment.length() - 4) && !lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5) && !lastPathSegment.startsWith(".cmf", lastPathSegment.length() - 5)) {
                                                        if (!lastPathSegment.startsWith(".og", lastPathSegment.length() - 4) && !lastPathSegment.endsWith(".opus")) {
                                                            if (!lastPathSegment.endsWith(".ps") && !lastPathSegment.endsWith(".mpeg") && !lastPathSegment.endsWith(".mpg") && !lastPathSegment.endsWith(".m2p")) {
                                                                if (!lastPathSegment.endsWith(".ts") && !lastPathSegment.startsWith(".ts", lastPathSegment.length() - 4)) {
                                                                    if (!lastPathSegment.endsWith(".wav") && !lastPathSegment.endsWith(".wave")) {
                                                                        if (!lastPathSegment.endsWith(".vtt") && !lastPathSegment.endsWith(".webvtt")) {
                                                                            if (!lastPathSegment.endsWith(".jpg") && !lastPathSegment.endsWith(".jpeg")) {
                                                                                if (lastPathSegment.endsWith(".avi")) {
                                                                                    i3 = 16;
                                                                                }
                                                                            }
                                                                            i3 = 14;
                                                                        }
                                                                        i3 = 13;
                                                                    }
                                                                    i3 = 12;
                                                                }
                                                                i3 = 11;
                                                            }
                                                            i3 = 10;
                                                        }
                                                        i3 = 9;
                                                    }
                                                }
                                                i3 = 6;
                                            }
                                            i3 = 15;
                                        }
                                    }
                                    i3 = 2;
                                }
                                for (i2 = 0; i2 < 16; i2++) {
                                    int i4 = iArr[i2];
                                    if (i4 != i && i4 != i3) {
                                        ej71.a(i4, arrayList);
                                    }
                                }
                                n771VarArr = (n771[]) arrayList.toArray(new n771[arrayList.size()]);
                            }
                            i3 = 0;
                            while (i2 < 16) {
                            }
                            n771VarArr = (n771[]) arrayList.toArray(new n771[arrayList.size()]);
                        }
                        i3 = -1;
                        while (i2 < 16) {
                        }
                        n771VarArr = (n771[]) arrayList.toArray(new n771[arrayList.size()]);
                    }
                    i = -1;
                    if (i != -1) {
                    }
                    lastPathSegment = uri.getLastPathSegment();
                    if (lastPathSegment != null) {
                    }
                    i3 = -1;
                    while (i2 < 16) {
                    }
                    n771VarArr = (n771[]) arrayList.toArray(new n771[arrayList.size()]);
                }
                str = null;
                int i32 = 8;
                if (str == null) {
                }
                i = -1;
                if (i != -1) {
                }
                lastPathSegment = uri.getLastPathSegment();
                if (lastPathSegment != null) {
                }
                i32 = -1;
                while (i2 < 16) {
                }
                n771VarArr = (n771[]) arrayList.toArray(new n771[arrayList.size()]);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (n771VarArr.length == 1) {
            this.c = n771VarArr[0];
        } else {
            int length = n771VarArr.length;
            int i5 = 0;
            while (true) {
                if (i5 < length) {
                    n771 n771Var = n771VarArr[i5];
                    try {
                    } catch (EOFException unused) {
                        if (((n771) this.c) != null) {
                            continue;
                        } else if (w971Var.w != j) {
                            ny61.k();
                            return;
                        }
                    } catch (Throwable th2) {
                        if (((n771) this.c) != null || w971Var.w == j) {
                            w971Var.y = 0;
                            throw th2;
                        }
                        ny61.k();
                        return;
                    }
                    if (n771Var.f(w971Var)) {
                        this.c = n771Var;
                        w971Var.y = 0;
                    } else {
                        if (((n771) this.c) == null && w971Var.w != j) {
                            ny61.k();
                            return;
                        }
                        w971Var.y = 0;
                        i5++;
                    }
                }
            }
            if (((n771) this.c) == null) {
                StringBuilder sb = new StringBuilder("None of the available extractors (");
                int i6 = rf71.a;
                StringBuilder sb2 = new StringBuilder();
                for (int i7 = 0; i7 < n771VarArr.length; i7++) {
                    sb2.append(n771VarArr[i7].getClass().getSimpleName());
                    if (i7 < n771VarArr.length - 1) {
                        sb2.append(Extension.FIX_SPACE);
                    }
                }
                sb.append(sb2.toString());
                sb.append(") could read the stream.");
                throw new n83(sb.toString(), null, false, 1);
            }
        }
        ((n771) this.c).b(ng71Var);
    }

    @Override // defpackage.wf81
    public void j(jk3 jk3Var) {
        gl61 gl61Var;
        gl61 gl61Var2;
        gl61 gl61Var3;
        Integer valueOf;
        gl61 gl61Var4;
        String message;
        switch (this.a) {
            case 4:
                jk3Var.getClass();
                if (jk3Var instanceof y43) {
                    gl61Var = rma1.c((y43) jk3Var);
                } else if (jk3Var instanceof n72) {
                    gl61Var = bia1.e((n72) jk3Var);
                } else if (jk3Var instanceof p62) {
                    p62 p62Var = (p62) jk3Var;
                    Throwable cause = p62Var.getCause();
                    if (cause == null || (message = cause.getMessage()) == null) {
                        message = p62Var.getMessage();
                    }
                    if (cause instanceof SSLException) {
                        gl61Var = qca1.a((SSLException) cause);
                    } else if (cause instanceof IOException) {
                        gl61Var = bia1.d((IOException) cause);
                        if (gl61Var == null) {
                            c63 c63Var = c63.c;
                            if (message == null) {
                                message = "I/O error";
                            }
                            gl61Var = new gl61(c63Var, "io_error", message, null);
                        }
                    } else {
                        c63 c63Var2 = c63.c;
                        if (message == null) {
                            message = "Network error";
                        }
                        gl61Var = new gl61(c63Var2, "network_error", message, null);
                    }
                } else {
                    String str = "client_error";
                    if (jk3Var instanceof dv) {
                        dv dvVar = (dv) jk3Var;
                        gb81 gb81Var = dvVar.b;
                        valueOf = gb81Var != null ? Integer.valueOf(gb81Var.a) : null;
                        String message2 = dvVar.getMessage();
                        String str2 = (valueOf != null && valueOf.intValue() == 400) ? "Bad request" : (valueOf != null && valueOf.intValue() == 401) ? "Unauthorized" : (valueOf != null && valueOf.intValue() == 403) ? "Forbidden" : (valueOf != null && valueOf.intValue() == 404) ? "Not found" : "Client error";
                        c63 c63Var3 = c63.f;
                        if (valueOf != null && valueOf.intValue() == 400) {
                            str = "client_bad_request";
                        } else if (valueOf != null && valueOf.intValue() == 401) {
                            str = "client_unauthorized";
                        } else if (valueOf != null && valueOf.intValue() == 403) {
                            str = "client_forbidden";
                        } else if (valueOf != null && valueOf.intValue() == 404) {
                            str = "client_not_found";
                        }
                        if (message2 == null) {
                            message2 = str2;
                        }
                        gl61Var4 = new gl61(c63Var3, str, message2, valueOf);
                    } else {
                        String str3 = "server_error";
                        if (jk3Var instanceof cw2) {
                            cw2 cw2Var = (cw2) jk3Var;
                            gb81 gb81Var2 = cw2Var.b;
                            valueOf = gb81Var2 != null ? Integer.valueOf(gb81Var2.a) : null;
                            String message3 = cw2Var.getMessage();
                            String str4 = (valueOf != null && valueOf.intValue() == 500) ? "Internal server error" : (valueOf != null && valueOf.intValue() == 502) ? "Bad gateway" : (valueOf != null && valueOf.intValue() == 503) ? "Service unavailable" : (valueOf != null && valueOf.intValue() == 504) ? "Gateway timeout" : "Server error";
                            c63 c63Var4 = c63.e;
                            if (valueOf != null && valueOf.intValue() == 500) {
                                str3 = "server_internal_error";
                            } else if (valueOf != null && valueOf.intValue() == 502) {
                                str3 = "server_bad_gateway";
                            } else if (valueOf != null && valueOf.intValue() == 503) {
                                str3 = "server_unavailable";
                            } else if (valueOf != null && valueOf.intValue() == 504) {
                                str3 = "server_gateway_timeout";
                            }
                            if (message3 == null) {
                                message3 = str4;
                            }
                            gl61Var4 = new gl61(c63Var4, str3, message3, valueOf);
                        } else if (jk3Var instanceof y92) {
                            c63 c63Var5 = c63.h;
                            String message4 = jk3Var.getMessage();
                            if (message4 == null) {
                                message4 = "Response parsing error";
                            }
                            gl61Var = new gl61(c63Var5, "parse_error", message4, null);
                        } else if (jk3Var instanceof kk) {
                            c63 c63Var6 = c63.i;
                            String message5 = jk3Var.getMessage();
                            if (message5 == null) {
                                message5 = "Authentication failure";
                            }
                            gl61Var = new gl61(c63Var6, "auth_failure", message5, null);
                        } else {
                            LinkedHashSet linkedHashSet = new LinkedHashSet();
                            linkedHashSet.add(jk3Var);
                            Throwable th = jk3Var;
                            for (Throwable cause2 = jk3Var.getCause(); cause2 != null && !cause2.equals(th) && !linkedHashSet.contains(cause2); cause2 = cause2.getCause()) {
                                linkedHashSet.add(cause2);
                                th = cause2;
                            }
                            if (th.equals(jk3Var)) {
                                th = null;
                            }
                            if (th instanceof UnknownHostException) {
                                gl61Var = bia1.e(new n72((IOException) th));
                            } else if (th instanceof SSLException) {
                                gl61Var = qca1.a((SSLException) th);
                            } else if (th instanceof SocketTimeoutException) {
                                gl61Var = rma1.c(new y43());
                            } else if (th instanceof ConnectException) {
                                gl61Var = bia1.e(new n72((IOException) th));
                            } else if (!(th instanceof IOException) || (gl61Var = bia1.d((IOException) th)) == null) {
                                String message6 = jk3Var.getMessage();
                                if (message6 == null) {
                                    message6 = th != null ? th.getMessage() : null;
                                }
                                if (message6 != null) {
                                    String lowerCase = message6.toLowerCase(Locale.ROOT);
                                    gl61 gl61Var5 = (evu0.y(lowerCase, "unable to resolve host", false) || evu0.y(lowerCase, "nodename nor servname provided", false) || evu0.y(lowerCase, "temporary failure in name resolution", false)) ? new gl61(c63.c, "unknown_host", message6, null) : (evu0.y(lowerCase, "timeout", false) || evu0.y(lowerCase, "timed out", false)) ? new gl61(c63.d, "timeout", message6, null) : evu0.y(lowerCase, "connection refused", false) ? new gl61(c63.c, "connection_refused", message6, null) : evu0.y(lowerCase, "network is unreachable", false) ? new gl61(c63.c, "network_unreachable", message6, null) : evu0.y(lowerCase, "no route to host", false) ? new gl61(c63.c, "no_route", message6, null) : evu0.y(lowerCase, "host is down", false) ? new gl61(c63.c, "host_down", message6, null) : (evu0.y(lowerCase, "ssl", false) || evu0.y(lowerCase, "tls", false)) ? new gl61(c63.g, "ssl_error", message6, null) : evu0.y(lowerCase, "interrupted", false) ? new gl61(c63.c, "interrupted", message6, null) : null;
                                    if (gl61Var5 != null) {
                                        gl61Var = gl61Var5;
                                    }
                                }
                                gb81 gb81Var3 = jk3Var.b;
                                Integer valueOf2 = gb81Var3 != null ? Integer.valueOf(gb81Var3.a) : null;
                                if (valueOf2 != null) {
                                    int intValue = valueOf2.intValue();
                                    if (400 > intValue || intValue >= 500) {
                                        if (500 > intValue || intValue >= 600) {
                                            c63 c63Var7 = c63.j;
                                            if (message6 == null) {
                                                message6 = oyr.i(intValue, "Unknown HTTP code: ");
                                            }
                                            gl61Var3 = new gl61(c63Var7, "unknown_http_code", message6, valueOf2);
                                        } else {
                                            c63 c63Var8 = c63.e;
                                            if (message6 == null) {
                                                message6 = oyr.j(intValue, "Server error (HTTP ", Extension.C_BRAKE);
                                            }
                                            gl61Var3 = new gl61(c63Var8, "server_error", message6, valueOf2);
                                        }
                                        gl61Var = gl61Var3;
                                    } else {
                                        c63 c63Var9 = c63.f;
                                        if (message6 == null) {
                                            message6 = oyr.j(intValue, "Client error (HTTP ", Extension.C_BRAKE);
                                        }
                                        gl61Var2 = new gl61(c63Var9, "client_error", message6, valueOf2);
                                        gl61Var = gl61Var2;
                                    }
                                } else if (message6 != null) {
                                    gl61Var2 = new gl61(c63.j, "unknown", gvu0.A0(100, new Regex("\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}(:\\d+)?").j(b64.k("https?://[^\\s]+", message6, "[url]"), "[ip]")), null);
                                    gl61Var = gl61Var2;
                                } else {
                                    gl61Var = new gl61(c63.j, "unknown", "Unknown error", null);
                                }
                            }
                        }
                    }
                    gl61Var = gl61Var4;
                }
                c63 c63Var10 = gl61Var.a;
                if (c63Var10 == c63.j) {
                    LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                    linkedHashSet2.add(jk3Var);
                    Object obj = jk3Var;
                    for (Throwable cause3 = jk3Var.getCause(); cause3 != null && !cause3.equals(obj) && !linkedHashSet2.contains(cause3); cause3 = cause3.getCause()) {
                        linkedHashSet2.add(cause3);
                        obj = cause3;
                    }
                    obj.equals(jk3Var);
                }
                LinkedHashMap l = b.l(new Pair("tracking_result", ResultType.RESULT_TYPE_FAILURE), new Pair("tracking_url_type", ((q63) this.w).name().toLowerCase(Locale.ROOT)), new Pair("error_description", c63Var10.b), new Pair("error_code", gl61Var.b), new Pair("error_message", gl61Var.c));
                Integer num = gl61Var.d;
                if (num != null) {
                    l.put(AuthSdkActivity.RESPONSE_TYPE_CODE, Integer.valueOf(num.intValue()));
                }
                ((hn71) this.c).k(l, (gg81) this.b);
                break;
        }
    }

    public boolean k(u381 u381Var) {
        Object obj;
        Object obj2;
        Object obj3;
        o081 o081Var = (o081) this.w;
        if (o081Var == null) {
            return false;
        }
        int i = u381Var.a;
        vi71 vi71Var = u381Var.b;
        switch (i) {
            case 0:
                List list = (List) vi71Var.b;
                ArrayList arrayList = new ArrayList();
                for (Object obj4 : list) {
                    if (((uy71) obj4).f) {
                        arrayList.add(obj4);
                    }
                }
                Iterator it = arrayList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        i281 a = o081Var.a((uy71) obj);
                        if (a != null && a.e()) {
                        }
                    } else {
                        obj = null;
                    }
                }
                uy71 uy71Var = (uy71) obj;
                vi71Var.c = uy71Var != null ? uy71Var.a : null;
                if (uy71Var != null) {
                    return false;
                }
                break;
            case 1:
                List list2 = (List) vi71Var.b;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj5 : list2) {
                    if (((uy71) obj5).f) {
                        arrayList2.add(obj5);
                    }
                }
                if (arrayList2.isEmpty()) {
                    return false;
                }
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    i281 a2 = o081Var.a((uy71) it2.next());
                    if (a2 != null && a2.d()) {
                        break;
                    }
                }
                return false;
            case 2:
                List list3 = (List) vi71Var.b;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj6 : list3) {
                    if (((uy71) obj6).f) {
                        arrayList3.add(obj6);
                    }
                }
                Iterator it3 = arrayList3.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        obj2 = it3.next();
                        uy71 uy71Var2 = (uy71) obj2;
                        i281 a3 = o081Var.a(uy71Var2);
                        if (a3 == null) {
                            a3 = null;
                        }
                        if (a3 != null && a3.a(uy71Var2.c)) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                uy71 uy71Var3 = (uy71) obj2;
                vi71Var.c = uy71Var3 != null ? uy71Var3.a : null;
                if (uy71Var3 != null) {
                    return false;
                }
                break;
            default:
                List list4 = (List) vi71Var.b;
                ArrayList arrayList4 = new ArrayList();
                for (Object obj7 : list4) {
                    if (((uy71) obj7).f) {
                        arrayList4.add(obj7);
                    }
                }
                Iterator it4 = arrayList4.iterator();
                while (true) {
                    if (it4.hasNext()) {
                        obj3 = it4.next();
                        i281 a4 = o081Var.a((uy71) obj3);
                        if (a4 != null && a4.b()) {
                        }
                    } else {
                        obj3 = null;
                    }
                }
                uy71 uy71Var4 = (uy71) obj3;
                vi71Var.c = uy71Var4 != null ? uy71Var4.a : null;
                if (uy71Var4 != null) {
                    return false;
                }
                break;
        }
        return true;
    }

    @Override // defpackage.pj71
    public void m(View view, uy71 uy71Var) {
        if (view.getTag() == null) {
            view.setTag(la71.a(uy71Var.a));
        }
    }

    @Override // defpackage.f291
    public void n(qb71 qb71Var) {
        d881 d881Var = (d881) this.c;
        oj61 oj61Var = (oj61) this.w;
        fe81 fe81Var = oj61Var.b.b;
        ai71 ai71Var = new ai71();
        mj31 mj31Var = oj61Var.f;
        Context context = (Context) this.b;
        mj31Var.q(context, d881Var, oj61Var.e);
        mj31Var.getClass();
        Map f = b.f();
        if (!ym11.h(f)) {
            f = null;
        }
        if (f == null) {
            new LinkedHashMap();
        }
        hn71 d = ai71Var.d(fe81Var, d881Var, qb71Var);
        d.r("success", ACSPConstants.STATUS);
        mj31Var.s(context, d881Var, hm2.g, d);
    }

    @Override // defpackage.pj71
    public void o(uy71 uy71Var, vj81 vj81Var) {
        fj71 fj71Var = uy71Var.d;
        if (fj71Var == null) {
            fj71Var = (fj71) this.w;
        }
        vi71 vi71Var = (vi71) this.c;
        o081 o081Var = (o081) this.b;
        vi71Var.getClass();
        if (!uy71Var.e || fj71Var == null) {
            return;
        }
        vj81Var.b(fj71Var, new jq81(uy71Var, (b181) vi71Var.b, o081Var, (iz71) vi71Var.c, (bl61) vi71Var.w));
    }

    @Override // defpackage.wx60
    public void onComplete(Task task) {
        com.google.android.gms.cloudmessaging.a aVar = (com.google.android.gms.cloudmessaging.a) this.b;
        String str = (String) this.c;
        ScheduledFuture scheduledFuture = (ScheduledFuture) this.w;
        synchronized (aVar.a) {
            aVar.a.remove(str);
        }
        scheduledFuture.cancel(false);
    }

    public ArrayList p(XmlPullParser xmlPullParser, zy2 zy2Var) {
        ArrayList arrayList = new ArrayList();
        xmlPullParser.require(2, null, (String) this.c);
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (((String) this.w).equals(xmlPullParser.getName())) {
                    Object f = ((zc81) this.b).f(xmlPullParser, zy2Var);
                    if (f != null) {
                        arrayList.add(f);
                    }
                } else {
                    xf81.b(xmlPullParser);
                }
            }
        }
        return arrayList;
    }

    @Override // defpackage.ku71
    public void r(gr71 gr71Var, boolean z) {
        Bitmap bitmap = gr71Var.a;
        if (bitmap != null) {
            no6 no6Var = (no6) this.b;
            String str = (String) this.c;
            gs51 gs51Var = (gs51) this.w;
            v881 v881Var = (v881) no6Var.c;
            v881Var.b.putAll(gw00.e(new Pair(str, bitmap)));
            gs51Var.e(bitmap);
        }
    }

    public vi71(Context context) {
        this.a = 3;
        l971 l971Var = of71.g;
        of71 of71Var = of71.i;
        if (of71Var == null) {
            synchronized (l971Var) {
                of71Var = of71.i;
                if (of71Var == null) {
                    of71Var = new of71(context);
                    of71.i = of71Var;
                }
            }
        }
        this.b = of71Var;
        this.c = new Object();
        this.w = new ArrayList();
    }

    public vi71(Context context, qz61 qz61Var) {
        this.a = 20;
        op61 op61Var = new op61();
        hlx0 hlx0Var = new hlx0(context, 24);
        r400 r400Var = new r400(20, qz61Var);
        this.b = op61Var;
        this.c = hlx0Var;
        this.w = r400Var;
    }

    public /* synthetic */ vi71(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.w = obj3;
    }

    public vi71(Context context, ge71 ge71Var, lm71 lm71Var) {
        this.a = 26;
        this.b = ge71Var;
        this.c = lm71Var;
        this.w = context.getApplicationContext();
    }

    public vi71(Context context, d881 d881Var, fe81 fe81Var, v981 v981Var, p9 p9Var, ArrayList arrayList) {
        this.a = 6;
        pb81 pb81Var = new pb81(context, fe81Var, v981Var);
        z4m0 z4m0Var = new z4m0(context, fe81Var, v981Var, d881Var, p9Var);
        this.b = arrayList;
        this.c = pb81Var;
        this.w = z4m0Var;
    }

    public vi71(Context context, d881 d881Var, qp1 qp1Var) {
        this.a = 1;
        this.b = d881Var;
        this.c = qp1Var;
        Context applicationContext = context.getApplicationContext();
        this.w = applicationContext != null ? applicationContext : context;
    }

    public vi71(oj61 oj61Var, Context context, d881 d881Var) {
        this.a = 23;
        this.w = oj61Var;
        this.b = context;
        this.c = d881Var;
    }

    public vi71(e971 e971Var) {
        this.a = 2;
        fw81 fw81Var = new fw81();
        df71 df71Var = new df71();
        this.b = e971Var;
        this.c = fw81Var;
        this.w = df71Var;
    }

    public vi71(e971 e971Var, ge71 ge71Var) {
        this.a = 28;
        bg81 bg81Var = new bg81();
        fc71 fc71Var = new fc71(e971Var, 1);
        this.b = ge71Var;
        this.c = bg81Var;
        this.w = fc71Var;
    }

    public vi71(vi71 vi71Var, d881 d881Var) {
        this.a = 8;
        this.b = vi71Var;
        this.c = d881Var;
    }

    public vi71(String str, ArrayList arrayList, byte[] bArr) {
        List unmodifiableList;
        this.a = 10;
        this.b = str;
        if (arrayList == null) {
            unmodifiableList = Collections.EMPTY_LIST;
        } else {
            unmodifiableList = Collections.unmodifiableList(arrayList);
        }
        this.c = unmodifiableList;
        this.w = bArr;
    }

    public vi71(List list, jl71 jl71Var) {
        this.a = 14;
        this.b = list;
    }

    public vi71(ej71 ej71Var) {
        this.a = 13;
        this.b = ej71Var;
    }

    public vi71(v981 v981Var, int i) {
        this.a = i;
        switch (i) {
            case 18:
                yg61 yg61Var = new yg61();
                vi71 vi71Var = new vi71(v981Var, 9);
                cf71 cf71Var = new cf71(v981Var);
                this.b = yg61Var;
                this.c = vi71Var;
                this.w = cf71Var;
                break;
            default:
                lu71 lu71Var = new lu71();
                ur81 ur81Var = new ur81();
                ph71 ph71Var = new ph71(v981Var);
                this.b = lu71Var;
                this.c = ur81Var;
                this.w = ph71Var;
                break;
        }
    }

    public vi71(fe81 fe81Var, v981 v981Var) {
        this.a = 15;
        k281 k281Var = new k281();
        this.b = fe81Var;
        this.c = v981Var;
        this.w = k281Var;
    }

    public vi71(fe81 fe81Var, v981 v981Var, d881 d881Var) {
        this.a = 19;
        Context context = ((n291) v981Var).a;
        ge71 c = wha1.c(context, context);
        vi71 vi71Var = new vi71(7, fe81Var, v981Var, d881Var);
        ji41 ji41Var = new ji41(24, new ij61());
        this.b = c;
        this.c = vi71Var;
        this.w = ji41Var;
    }

    public vi71(lv81[] lv81VarArr) {
        this.a = 25;
        tn61 tn61Var = new tn61();
        j871 j871Var = new j871();
        lv81[] lv81VarArr2 = new lv81[lv81VarArr.length + 2];
        this.b = lv81VarArr2;
        System.arraycopy(lv81VarArr, 0, lv81VarArr2, 0, lv81VarArr.length);
        this.c = tn61Var;
        this.w = j871Var;
        lv81VarArr2[lv81VarArr.length] = tn61Var;
        lv81VarArr2[lv81VarArr.length + 1] = j871Var;
    }

    @Override // defpackage.fj81
    public void a(Object obj) {
        ((hn71) this.c).k(b.l(new Pair("tracking_result", "success"), new Pair("tracking_url_type", ((q63) this.w).name().toLowerCase(Locale.ROOT)), new Pair(AuthSdkActivity.RESPONSE_TYPE_CODE, Integer.valueOf(((gb81) obj).a))), (gg81) this.b);
    }

    @Override // defpackage.f291, defpackage.hz61
    /* renamed from: a */
    public void mo492a() {
        oj61 oj61Var = (oj61) this.w;
        mj31 mj31Var = oj61Var.f;
        Context context = (Context) this.b;
        d881 d881Var = (d881) this.c;
        mj31Var.q(context, d881Var, oj61Var.e);
        mj31Var.getClass();
        hn71 hn71Var = new hn71(3, (HashMap) null);
        hn71Var.r("success", ACSPConstants.STATUS);
        mj31Var.s(context, d881Var, hm2.g, hn71Var);
    }
}
