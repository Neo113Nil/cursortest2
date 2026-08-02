package defpackage;

import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import androidx.compose.foundation.layout.d;
import androidx.compose.runtime.internal.a;
import com.connectsdk.discovery.provider.ssdp.SSDPDeviceDescriptionParser;
import com.connectsdk.service.airplay.PListParser;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import io.appmetrica.analytics.rtm.internal.Constants;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.KotlinVersion;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;
import ru.yandex.music.R;
import ru.yandex.music.data.stores.CoverPath;

/* loaded from: classes3.dex */
public abstract class xp3 {
    public static final wvo a = new wvo(14);
    public static final wn5 b = new wn5(new go5(16), -1744996865, false);
    public static final wn5 c;
    public static final wn5 d;
    public static final wn5 e;
    public static final wn5 f;
    public static final wn5 g;
    public static final wn5 h;
    public static final wn5 i;
    public static final wn5 j;
    public static final l29 k;
    public static final String[] l;
    public static final int[] m;
    public static final int[] n;
    public static final int[] o;
    public static final int[] p;
    public static final int[] q;
    public static final int[] r;
    public static final String[] s;
    public static final String[] t;
    public static final String[] u;

    static {
        new wn5(new fo5(24), -129080971, false);
        c = new wn5(new lo5(26), 985292923, false);
        d = new wn5(new lo5(27), 1210495890, false);
        e = new wn5(new lo5(28), 902577557, false);
        f = new wn5(new bp5(4), -912197042, false);
        g = new wn5(new bp5(5), 563316934, false);
        int i2 = 6;
        h = new wn5(new ap5(i2), 180512581, false);
        i = new wn5(new bp5(i2), 1143735158, false);
        j = new wn5(new bp5(7), -1736257976, false);
        new wn5(new bp5(8), -311128505, false);
        k = new l29(17);
        l = new String[]{"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};
        m = new int[]{RemoteCameraConfig.Mic.SAMPLING_RATE, ScreenMirroringConfig.Audio.SAMPLING_RATE, 32000};
        n = new int[]{32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};
        o = new int[]{32000, ScreenMirroringConfig.Audio.SAMPLING_RATE, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};
        p = new int[]{32000, ScreenMirroringConfig.Audio.SAMPLING_RATE, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};
        q = new int[]{32000, 40000, ScreenMirroringConfig.Audio.SAMPLING_RATE, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};
        r = new int[]{8000, 16000, 24000, 32000, 40000, ScreenMirroringConfig.Audio.SAMPLING_RATE, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};
        s = new String[]{"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};
        t = new String[]{"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};
        u = new String[]{"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList A(InputStream inputStream, HttpURLConnection httpURLConnection, qod qodVar) {
        Object obj;
        qodVar.getClass();
        String N = gvt.N(inputStream);
        HashMap hashMap = lsg.d;
        synchronized (j3c.a) {
        }
        Object nextValue = new JSONTokener(N).nextValue();
        nextValue.getClass();
        int size = qodVar.c.size();
        ArrayList arrayList = new ArrayList(size);
        if (size == 1) {
            ood oodVar = (ood) qodVar.get(0);
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("body", nextValue);
                jSONObject.put("code", httpURLConnection.getResponseCode());
                JSONArray jSONArray = new JSONArray();
                jSONArray.put(jSONObject);
                obj = jSONArray;
            } catch (IOException e2) {
                arrayList.add(new rod(oodVar, httpURLConnection, new g3c(e2)));
            } catch (JSONException e3) {
                arrayList.add(new rod(oodVar, httpURLConnection, new g3c(e3)));
            }
            if (obj instanceof JSONArray) {
                JSONArray jSONArray2 = (JSONArray) obj;
                if (jSONArray2.length() == size) {
                    int length = jSONArray2.length();
                    for (int i2 = 0; i2 < length; i2++) {
                        ood oodVar2 = (ood) qodVar.get(i2);
                        try {
                            Object obj2 = ((JSONArray) obj).get(i2);
                            obj2.getClass();
                            arrayList.add(z(oodVar2, httpURLConnection, obj2, nextValue));
                        } catch (c3c e4) {
                            arrayList.add(new rod(oodVar2, httpURLConnection, new g3c(e4)));
                        } catch (JSONException e5) {
                            arrayList.add(new rod(oodVar2, httpURLConnection, new g3c(e5)));
                        }
                    }
                    HashMap hashMap2 = lsg.d;
                    synchronized (j3c.a) {
                    }
                    return arrayList;
                }
            }
            throw new c3c("Unexpected number of results");
        }
        obj = nextValue;
        if (obj instanceof JSONArray) {
        }
        throw new c3c("Unexpected number of results");
    }

    public static final boolean B(szb szbVar, szb szbVar2) {
        if (szbVar == null && szbVar2 == null) {
            return true;
        }
        if (szbVar == null || !(szbVar instanceof ozb) || szbVar2 == null || !(szbVar2 instanceof ozb)) {
            return false;
        }
        return ((szbVar.b() instanceof JSONObject) || (szbVar.b() instanceof JSONArray)) ? Intrinsics.d(szbVar.b().toString(), szbVar2.b().toString()) : Intrinsics.d(szbVar.b(), szbVar2.b());
    }

    public static final boolean C(vzb vzbVar, vzb vzbVar2) {
        if (vzbVar == null && vzbVar2 == null) {
            return true;
        }
        return vzbVar != null && (vzbVar instanceof i86) && vzbVar2 != null && (vzbVar2 instanceof i86) && Intrinsics.d(((i86) vzbVar).a, ((i86) vzbVar2).a);
    }

    public static final Object D(String str, List list, boolean z) {
        Object t7oVar;
        Object t7oVar2;
        str.getClass();
        list.getClass();
        JSONObject jSONObject = (JSONObject) CollectionsKt.Q(list);
        int size = list.size() - 1;
        for (int i2 = 1; i2 < size; i2++) {
            Object obj = list.get(i2);
            obj.getClass();
            String str2 = (String) obj;
            try {
                r7o r7oVar = z7o.b;
                jSONObject.getClass();
                Object opt = jSONObject.opt(str2);
                jSONObject = opt instanceof JSONObject ? (JSONObject) opt : null;
                t7oVar2 = Unit.a;
            } catch (Throwable th) {
                r7o r7oVar2 = z7o.b;
                t7oVar2 = new t7o(th);
            }
            if (z7o.a(t7oVar2) != null) {
                h0(str, hrg.q("Missing property \"", str2, "\" in the dict."), list, z);
                throw null;
            }
        }
        Object Y = CollectionsKt.Y(list);
        Y.getClass();
        String str3 = (String) Y;
        try {
            r7o r7oVar3 = z7o.b;
            jSONObject.getClass();
            t7oVar = jSONObject.get(str3);
        } catch (Throwable th2) {
            r7o r7oVar4 = z7o.b;
            t7oVar = new t7o(th2);
        }
        if (z7o.a(t7oVar) == null) {
            t7oVar.getClass();
            return t7oVar;
        }
        h0(str, hrg.q("Missing property \"", str3, "\" in the dict."), list, z);
        throw null;
    }

    public static final Object E(String str, List list, boolean z) {
        str.getClass();
        list.getClass();
        s(str, list, z);
        Object obj = list.get(0);
        obj.getClass();
        Object obj2 = list.get(1);
        obj2.getClass();
        Object obj3 = ((JSONArray) obj).get((int) ((Long) obj2).longValue());
        obj3.getClass();
        return obj3;
    }

    public static final Object F(String str, List list) {
        Object t7oVar;
        str.getClass();
        list.getClass();
        try {
            r7o r7oVar = z7o.b;
            s(str, list, false);
            Object obj = list.get(0);
            obj.getClass();
            Object obj2 = list.get(1);
            obj2.getClass();
            t7oVar = ((JSONArray) obj).get((int) ((Long) obj2).longValue());
        } catch (Throwable th) {
            r7o r7oVar2 = z7o.b;
            t7oVar = new t7o(th);
        }
        if (t7oVar instanceof t7o) {
            return null;
        }
        return t7oVar;
    }

    public static final Object G(List list, Object obj, boolean z) {
        list.getClass();
        int i2 = !z ? 1 : 0;
        Object obj2 = list.get(i2);
        JSONObject jSONObject = obj2 instanceof JSONObject ? (JSONObject) obj2 : null;
        if (jSONObject != null) {
            int size = list.size() - 1;
            for (int i3 = i2 + 1; i3 < size; i3++) {
                Object obj3 = list.get(i3);
                obj3.getClass();
                jSONObject = jSONObject.optJSONObject((String) obj3);
                if (jSONObject != null) {
                }
            }
            Object Y = CollectionsKt.Y(list);
            Y.getClass();
            return jSONObject.opt((String) Y);
        }
        return obj;
    }

    public static byte[] H(db7 db7Var, String str, byte[] bArr, Map map) {
        Map map2;
        List list;
        ngr ngrVar = new ngr(db7Var);
        Map map3 = Collections.EMPTY_MAP;
        Uri parse = Uri.parse(str);
        vq1.C(parse, "The uri must be set.");
        nb7 nb7Var = new nb7(parse, 0L, 2, bArr, map, 0L, -1L, null, 1);
        int i2 = 0;
        int i3 = 0;
        nb7 nb7Var2 = nb7Var;
        while (true) {
            try {
                kb7 kb7Var = new kb7(ngrVar, nb7Var2);
                try {
                    try {
                        byte[] b2 = zm3.b(kb7Var);
                        dvt.g(kb7Var);
                        return b2;
                    } catch (i6e e2) {
                        int i4 = e2.d;
                        String str2 = null;
                        if ((i4 == 307 || i4 == 308) && i3 < 5 && (map2 = e2.e) != null && (list = (List) map2.get("Location")) != null && !list.isEmpty()) {
                            str2 = (String) list.get(i2);
                        }
                        if (str2 == null) {
                            throw e2;
                        }
                        i3++;
                        mb7 a2 = nb7Var2.a();
                        a2.a = Uri.parse(str2);
                        nb7Var2 = a2.a();
                        dvt.g(kb7Var);
                    }
                } catch (Throwable th) {
                    dvt.g(kb7Var);
                    throw th;
                }
            } catch (Exception e3) {
                throw new tmh(nb7Var, ngrVar.c, ngrVar.a.b(), ngrVar.b, e3);
            }
        }
    }

    public static final n8g I(List list) {
        list.getClass();
        n8g b2 = t75.b();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            c01 c01Var = (c01) it.next();
            if (!c01Var.equals(c01.v)) {
                b2.add(c01Var);
                List list2 = c01Var.h;
                List list3 = list2;
                if (list3 != null && !list3.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : list2) {
                        if (!((c01) obj).equals(c01.v)) {
                            arrayList.add(obj);
                        }
                    }
                    HashSet hashSet = new HashSet();
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        Object next = it2.next();
                        if (hashSet.add(((c01) next).a)) {
                            arrayList2.add(next);
                        }
                    }
                    b2.addAll(arrayList2);
                }
            }
        }
        return t75.a(b2);
    }

    public static final ArrayList J(Collection collection, Collection collection2) {
        collection.getClass();
        collection2.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            zp2 zp2Var = (zp2) it.next();
            if (!zp2Var.equals(zp2.k) && !collection2.contains(zp2Var)) {
                arrayList.add(zp2Var);
                List list = zp2Var.e;
                List list2 = list;
                if (list2 != null && !list2.isEmpty()) {
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj : list) {
                        if (!((zp2) obj).equals(zp2.k)) {
                            arrayList2.add(obj);
                        }
                    }
                    z75.t(arrayList, arrayList2);
                }
            }
        }
        return arrayList;
    }

    public static final ckd K(mab mabVar, hgp hgpVar, Function1 function1, Function0 function0, boolean z, boolean z2) {
        String id;
        mqs mqsVar;
        if (mabVar != null) {
            if (z) {
                mabVar = null;
            }
            if (mabVar != null) {
                kab prev = z2 ? mabVar.getPrev() : mabVar.getNext();
                if (prev != null && (id = prev.getId()) != null && (mqsVar = (mqs) ((HashMap) hgpVar.d).get(id)) != null) {
                    function1.getClass();
                    String str = mqsVar.a;
                    bkd bkdVar = bkd.c;
                    String str2 = mqsVar.c;
                    String obj = function1.invoke(mqsVar).toString();
                    CoverPath coverPath = mqsVar.w;
                    return new ckd(str, false, bkdVar, str2, obj, coverPath != null ? coverPath.getUri() : null, mqsVar.e);
                }
            }
        }
        String str3 = (String) function0.invoke();
        str3.getClass();
        return new ckd(str3.concat("_fake_id"), false, bkd.g, str3, "", null, 0L);
    }

    public static final String L(Collection collection, Collection collection2) {
        collection.getClass();
        collection2.getClass();
        StringBuilder sb = new StringBuilder();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            zp2 zp2Var = (zp2) it.next();
            if (!zp2Var.equals(zp2.k) && !collection2.contains(zp2Var)) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(zp2Var.b);
                List<zp2> list = zp2Var.e;
                if (list != null) {
                    for (zp2 zp2Var2 : list) {
                        String str = zp2Var2.d;
                        if (str == null) {
                            str = ", ";
                        }
                        sb.append(str);
                        sb.append(zp2Var2.b);
                    }
                }
            }
        }
        return sb.toString();
    }

    public static final String M(ArrayList arrayList) {
        arrayList.getClass();
        return CollectionsKt.X(arrayList, ", ", null, null, new zs0(28), 30);
    }

    public static String N(Collection collection) {
        c5b c5bVar = c5b.a;
        collection.getClass();
        c5bVar.getClass();
        StringBuilder sb = new StringBuilder();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            c01 c01Var = (c01) it.next();
            if (!c01Var.equals(c01.v)) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(c01Var.b);
                List<c01> list = c01Var.h;
                if (list != null) {
                    for (c01 c01Var2 : list) {
                        String str = c01Var2.i;
                        if (str == null) {
                            str = ", ";
                        }
                        sb.append(str);
                        sb.append(c01Var2.b);
                    }
                }
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0032, code lost:
    
        if (r11 == Integer.MAX_VALUE) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0034, code lost:
    
        r9 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0036, code lost:
    
        r9 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0047, code lost:
    
        if (r11 == Integer.MAX_VALUE) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005c, code lost:
    
        if (r11 == Integer.MAX_VALUE) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int O(int i2, int i3, int i4, int i5, int i6) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2) - i3;
        int i7 = 0;
        int max = Math.max(0, size);
        if (mode == Integer.MIN_VALUE) {
            if (i4 < 0 || i4 > Integer.MAX_VALUE) {
                if (i4 == -1) {
                    i4 = Math.min(Math.max(max, i5), i6);
                } else if (i4 != -2) {
                    if (i4 == -3) {
                        i4 = Math.min(Math.max(max, i5), i6);
                    }
                    i4 = 0;
                }
                i7 = Integer.MIN_VALUE;
            }
            i7 = 1073741824;
        } else if (mode != 0) {
            if (mode == 1073741824) {
                if (i4 < 0 || i4 > Integer.MAX_VALUE) {
                    if (i4 == -1) {
                        i4 = Math.min(Math.max(max, i5), i6);
                    } else if (i4 != -2) {
                        if (i4 == -3) {
                            i4 = Math.min(Math.max(max, i5), i6);
                            i7 = Integer.MIN_VALUE;
                        }
                    }
                }
                i7 = 1073741824;
            }
            i4 = 0;
        } else {
            if (i4 < 0) {
            }
            i7 = 1073741824;
        }
        return View.MeasureSpec.makeMeasureSpec(i4, i7);
    }

    public static final String P(unl unlVar) {
        unlVar.getClass();
        String id = unlVar.getId();
        if (U(unlVar) != bkd.c && U(unlVar) != bkd.f) {
            id = null;
        }
        return id == null ? "" : id;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0059 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final rhd Q(unl unlVar) {
        String str;
        Iterator it;
        Object obj;
        rhd rhdVar;
        String type;
        unlVar.getClass();
        mab entityInfo = unlVar.getEntityInfo();
        if (entityInfo != null && (type = entityInfo.getType()) != null) {
            mab entityInfo2 = unlVar.getEntityInfo();
            if ((entityInfo2 != null ? entityInfo2.getId() : null) == null) {
                type = null;
            }
            if (type != null) {
                Locale locale = Locale.ENGLISH;
                str = ouj.s(locale, type, locale);
                rhd.b.getClass();
                it = rhd.g.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((rhd) obj).a.equals(str)) {
                        break;
                    }
                }
                rhdVar = (rhd) obj;
                if (rhdVar == null) {
                    return rhdVar;
                }
                v3w.l("new glagol entity type detected: ", str, 6, null, null);
                return rhd.e;
            }
        }
        str = null;
        rhd.b.getClass();
        it = rhd.g.iterator();
        while (true) {
            if (it.hasNext()) {
            }
        }
        rhdVar = (rhd) obj;
        if (rhdVar == null) {
        }
    }

    public static int R(int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        if ((i2 & (-2097152)) != -2097152 || (i3 = (i2 >>> 19) & 3) == 1 || (i4 = (i2 >>> 17) & 3) == 0 || (i5 = (i2 >>> 12) & 15) == 0 || i5 == 15 || (i6 = (i2 >>> 10) & 3) == 3) {
            return -1;
        }
        int i7 = m[i6];
        if (i3 == 2) {
            i7 /= 2;
        } else if (i3 == 0) {
            i7 /= 4;
        }
        int i8 = (i2 >>> 9) & 1;
        if (i4 == 3) {
            return ((((i3 == 3 ? n[i5 - 1] : o[i5 - 1]) * 12) / i7) + i8) * 4;
        }
        int i9 = i3 == 3 ? i4 == 2 ? p[i5 - 1] : q[i5 - 1] : r[i5 - 1];
        if (i3 == 3) {
            return tlm.b(i9, 144, i7, i8);
        }
        return tlm.b(i4 == 1 ? 72 : 144, i9, i7, i8);
    }

    public static final boolean S(unl unlVar) {
        unlVar.getClass();
        String liveStreamText = unlVar.getLiveStreamText();
        return !(liveStreamText == null || StringsKt.U(liveStreamText));
    }

    public static final ckd T(unl unlVar) {
        Double duration;
        if (unlVar == null) {
            return new ckd("unknown", false, bkd.g, "", "", null, -1L);
        }
        String id = unlVar.getId();
        String str = id == null ? "" : id;
        boolean S = S(unlVar);
        bkd U = U(unlVar);
        String title = unlVar.getTitle();
        String str2 = title == null ? "" : title;
        String subtitle = unlVar.getSubtitle();
        String str3 = (subtitle == null && (subtitle = unlVar.getLiveStreamText()) == null) ? "" : subtitle;
        Map extra = unlVar.getExtra();
        String str4 = extra != null ? (String) extra.get("coverURI") : null;
        long j2 = 0;
        if (!S(unlVar) && (duration = unlVar.getDuration()) != null) {
            j2 = (long) (duration.doubleValue() * 1000);
        }
        return new ckd(str, S, U, str2, str3, str4, j2);
    }

    public static final bkd U(unl unlVar) {
        String str;
        unlVar.getClass();
        String id = unlVar.getId();
        if (id == null) {
            id = "";
        }
        String type = unlVar.getType();
        rhd Q = Q(unlVar);
        String title = unlVar.getTitle();
        String subtitle = unlVar.getSubtitle();
        String liveStreamText = unlVar.getLiveStreamText();
        if (type != null) {
            Locale locale = Locale.ENGLISH;
            str = ouj.s(locale, type, locale);
        } else {
            str = null;
        }
        if (Q == rhd.d) {
            return bkd.f;
        }
        if (!Intrinsics.d(str, "track")) {
            return Intrinsics.d(str, "shot") ? bkd.d : (liveStreamText == null || !(StringsKt.U(liveStreamText) ^ true)) ? bkd.g : bkd.e;
        }
        if (StringsKt.U(id)) {
            return bkd.g;
        }
        return (StringsKt.M(title != null ? title : "", "Шот от Алисы", false) && (subtitle == null || StringsKt.U(subtitle))) ? bkd.d : bkd.c;
    }

    public static final boolean V(szb szbVar) {
        return szbVar == null || (szbVar instanceof ozb);
    }

    public static boolean W(Throwable th) {
        return dvt.a == 34 && (th instanceof NoSuchMethodError) && th.getMessage() != null && th.getMessage().contains("Landroid/media/NotProvisionedException;.<init>(");
    }

    public static boolean X(Throwable th) {
        return dvt.a == 34 && (th instanceof NoSuchMethodError) && th.getMessage() != null && th.getMessage().contains("Landroid/media/ResourceBusyException;.<init>(");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005e, code lost:
    
        if (r6 == (-1)) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static au1 Y(String str) {
        XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
        newPullParser.setInput(new StringReader(str));
        newPullParser.next();
        if (!g0g.R("x:xmpmeta", newPullParser)) {
            throw r7k.a(null, "Couldn't find xmp metadata");
        }
        ude udeVar = yde.b;
        qsn qsnVar = qsn.e;
        long j2 = -9223372036854775807L;
        loop0: while (true) {
            newPullParser.next();
            if (g0g.R("rdf:Description", newPullParser)) {
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    if (i3 >= 4) {
                        break loop0;
                    }
                    String K = g0g.K(s[i3], newPullParser);
                    if (K == null) {
                        i3++;
                    } else {
                        if (Integer.parseInt(K) != 1) {
                            break;
                        }
                        int i4 = 0;
                        while (true) {
                            if (i4 >= 4) {
                                break;
                            }
                            String K2 = g0g.K(t[i4], newPullParser);
                            if (K2 != null) {
                                j2 = Long.parseLong(K2);
                            } else {
                                i4++;
                            }
                        }
                        j2 = -9223372036854775807L;
                        while (true) {
                            if (i2 >= 2) {
                                ude udeVar2 = yde.b;
                                qsnVar = qsn.e;
                                break;
                            }
                            String K3 = g0g.K(u[i2], newPullParser);
                            if (K3 != null) {
                                qsnVar = yde.z(new tei("image/jpeg", 0L, 0L), new tei("video/mp4", Long.parseLong(K3), 0L));
                                break;
                            }
                            i2++;
                        }
                    }
                }
            } else if (g0g.R("Container:Directory", newPullParser)) {
                qsnVar = Z(newPullParser, "Container", "Item");
            } else if (g0g.R("GContainer:Directory", newPullParser)) {
                qsnVar = Z(newPullParser, "GContainer", "GContainerItem");
            }
            if (g0g.Q("x:xmpmeta", newPullParser)) {
                if (!qsnVar.isEmpty()) {
                    return new au1(j2, qsnVar, 10);
                }
            }
        }
        return null;
    }

    public static qsn Z(XmlPullParser xmlPullParser, String str, String str2) {
        tde u2 = yde.u();
        String concat = str.concat(":Item");
        String concat2 = str.concat(":Directory");
        do {
            xmlPullParser.next();
            if (g0g.R(concat, xmlPullParser)) {
                String concat3 = str2.concat(":Mime");
                String concat4 = str2.concat(":Semantic");
                String concat5 = str2.concat(":Length");
                String concat6 = str2.concat(":Padding");
                String K = g0g.K(concat3, xmlPullParser);
                String K2 = g0g.K(concat4, xmlPullParser);
                String K3 = g0g.K(concat5, xmlPullParser);
                String K4 = g0g.K(concat6, xmlPullParser);
                if (K == null || K2 == null) {
                    return qsn.e;
                }
                u2.a(new tei(K, K3 != null ? Long.parseLong(K3) : 0L, K4 != null ? Long.parseLong(K4) : 0L));
            }
        } while (!g0g.Q(concat2, xmlPullParser));
        return u2.f();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(ik ikVar, yci yciVar, ges gesVar, int i2, Function2 function2, hq5 hq5Var, int i3, int i4) {
        yci yciVar2;
        ges gesVar2;
        int i5;
        int i6;
        int i7;
        int i8;
        Function2 function22;
        int i9;
        int i10;
        ges gesVar3;
        ges gesVar4;
        Function2 function23;
        int i11;
        oq5 oq5Var;
        ges gesVar5;
        yci yciVar3;
        int i12;
        boolean z;
        ikVar.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(1236353936);
        int i13 = (oq5Var2.f(ikVar) ? 4 : 2) | i3;
        int i14 = i4 & 2;
        if (i14 != 0) {
            i13 |= 48;
        } else if ((i3 & 48) == 0) {
            yciVar2 = yciVar;
            i13 |= oq5Var2.f(yciVar2) ? 32 : 16;
            if ((i4 & 4) != 0) {
                gesVar2 = gesVar;
                if (oq5Var2.f(gesVar2)) {
                    i5 = 256;
                    int i15 = i13 | i5;
                    i6 = i4 & 8;
                    if (i6 != 0) {
                        i15 |= 3072;
                    } else if ((i3 & 3072) == 0) {
                        i7 = i2;
                        i15 |= oq5Var2.d(i7) ? 2048 : 1024;
                        i8 = i4 & 16;
                        if (i8 == 0) {
                            i9 = i15 | 24576;
                            function22 = function2;
                        } else {
                            function22 = function2;
                            i9 = i15 | (oq5Var2.h(function22) ? 16384 : RemoteCameraConfig.Notification.ID);
                        }
                        if ((i9 & 9363) == 9362 || !oq5Var2.z()) {
                            oq5Var2.U();
                            i10 = i3 & 1;
                            vci vciVar = vci.a;
                            if (i10 != 0 || oq5Var2.y()) {
                                if (i14 != 0) {
                                    yciVar2 = vciVar;
                                }
                                if ((i4 & 4) == 0) {
                                    h6g h6gVar = nu0.a;
                                    h6g h6gVar2 = h6g.c;
                                    gesVar3 = nu0.g();
                                    i9 &= -897;
                                } else {
                                    gesVar3 = gesVar2;
                                }
                                if (i6 != 0) {
                                    i7 = 1;
                                }
                                if (i8 == 0) {
                                    function23 = null;
                                    gesVar4 = gesVar3;
                                    i11 = i7;
                                    oq5Var2.q();
                                    if (!(ikVar instanceof fk) || (ikVar instanceof gk)) {
                                        oq5Var = oq5Var2;
                                        gesVar5 = gesVar4;
                                        oq5Var.Z(-1419047057);
                                        b(ikVar instanceof gk, d.r(yciVar2, 250), gesVar5, oq5Var, i9 & 896);
                                        oq5Var.p(false);
                                    } else {
                                        if (!(ikVar instanceof hk)) {
                                            throw vz1.i(oq5Var2, -1569799336, false);
                                        }
                                        oq5Var2.Z(-1418745334);
                                        kjn kjnVar = gq5.a;
                                        int i16 = 12;
                                        if (function23 != null) {
                                            oq5Var2.Z(-1418721154);
                                            ta5 a2 = sa5.a(qx0.c, b2c.n, oq5Var2, 0);
                                            int i17 = oq5Var2.P;
                                            a l2 = oq5Var2.l();
                                            yci H = vnj.H(oq5Var2, yciVar2);
                                            xp5.T.getClass();
                                            grb grbVar = wp5.b;
                                            oq5Var2.d0();
                                            if (oq5Var2.O) {
                                                oq5Var2.k(grbVar);
                                            } else {
                                                oq5Var2.n0();
                                            }
                                            g0g.U(oq5Var2, a2, wp5.f);
                                            g0g.U(oq5Var2, l2, wp5.e);
                                            kb5 kb5Var = wp5.g;
                                            if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i17))) {
                                                ouj.x(i17, oq5Var2, i17, kb5Var);
                                            }
                                            g0g.U(oq5Var2, H, wp5.d);
                                            String str = ((hk) ikVar).a;
                                            Object K = oq5Var2.K();
                                            if (K == kjnVar) {
                                                K = new u4(i16);
                                                oq5Var2.k0(K);
                                            }
                                            z = false;
                                            xcs.b(str, nfp.b(vciVar, false, (Function1) K), 0L, 0L, null, 0L, null, null, 0L, 2, false, i11, 0, null, gesVar4, oq5Var2, 0, (i9 & 7168) | 48 | ((i9 << 12) & 3670016), 55292);
                                            oq5Var = oq5Var2;
                                            function23.invoke(oq5Var, Integer.valueOf((i9 >> 12) & 14));
                                            oq5Var.p(true);
                                            oq5Var.p(false);
                                            gesVar5 = gesVar4;
                                        } else {
                                            z = false;
                                            oq5Var2.Z(-1418269422);
                                            String str2 = ((hk) ikVar).a;
                                            Object K2 = oq5Var2.K();
                                            if (K2 == kjnVar) {
                                                K2 = new u4(13);
                                                oq5Var2.k0(K2);
                                            }
                                            xcs.b(str2, nfp.b(yciVar2, false, (Function1) K2), 0L, 0L, null, 0L, null, null, 0L, 2, false, i11, 0, null, gesVar4, oq5Var2, 0, (i9 & 7168) | 48 | ((i9 << 12) & 3670016), 55292);
                                            gesVar5 = gesVar4;
                                            oq5Var = oq5Var2;
                                            oq5Var.p(false);
                                        }
                                        oq5Var.p(z);
                                    }
                                    yciVar3 = yciVar2;
                                    i12 = i11;
                                } else {
                                    gesVar4 = gesVar3;
                                }
                            } else {
                                oq5Var2.S();
                                if ((i4 & 4) != 0) {
                                    i9 &= -897;
                                }
                                gesVar4 = gesVar2;
                            }
                            i11 = i7;
                            function23 = function22;
                            oq5Var2.q();
                            if (ikVar instanceof fk) {
                            }
                            oq5Var = oq5Var2;
                            gesVar5 = gesVar4;
                            oq5Var.Z(-1419047057);
                            b(ikVar instanceof gk, d.r(yciVar2, 250), gesVar5, oq5Var, i9 & 896);
                            oq5Var.p(false);
                            yciVar3 = yciVar2;
                            i12 = i11;
                        } else {
                            oq5Var2.S();
                            oq5Var = oq5Var2;
                            yciVar3 = yciVar2;
                            gesVar5 = gesVar2;
                            i12 = i7;
                            function23 = function22;
                        }
                        xmn r2 = oq5Var.r();
                        if (r2 != null) {
                            r2.d = new xj(ikVar, yciVar3, gesVar5, i12, function23, i3, i4);
                            return;
                        }
                        return;
                    }
                    i7 = i2;
                    i8 = i4 & 16;
                    if (i8 == 0) {
                    }
                    if ((i9 & 9363) == 9362) {
                    }
                    oq5Var2.U();
                    i10 = i3 & 1;
                    vci vciVar2 = vci.a;
                    if (i10 != 0) {
                    }
                    if (i14 != 0) {
                    }
                    if ((i4 & 4) == 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (i8 == 0) {
                    }
                }
            } else {
                gesVar2 = gesVar;
            }
            i5 = 128;
            int i152 = i13 | i5;
            i6 = i4 & 8;
            if (i6 != 0) {
            }
            i7 = i2;
            i8 = i4 & 16;
            if (i8 == 0) {
            }
            if ((i9 & 9363) == 9362) {
            }
            oq5Var2.U();
            i10 = i3 & 1;
            vci vciVar22 = vci.a;
            if (i10 != 0) {
            }
            if (i14 != 0) {
            }
            if ((i4 & 4) == 0) {
            }
            if (i6 != 0) {
            }
            if (i8 == 0) {
            }
        }
        yciVar2 = yciVar;
        if ((i4 & 4) != 0) {
        }
        i5 = 128;
        int i1522 = i13 | i5;
        i6 = i4 & 8;
        if (i6 != 0) {
        }
        i7 = i2;
        i8 = i4 & 16;
        if (i8 == 0) {
        }
        if ((i9 & 9363) == 9362) {
        }
        oq5Var2.U();
        i10 = i3 & 1;
        vci vciVar222 = vci.a;
        if (i10 != 0) {
        }
        if (i14 != 0) {
        }
        if ((i4 & 4) == 0) {
        }
        if (i6 != 0) {
        }
        if (i8 == 0) {
        }
    }

    public static final c85 a0(String str) {
        Object t7oVar;
        if (str == null) {
            return null;
        }
        try {
            r7o r7oVar = z7o.b;
            t7oVar = new c85(bow.v(str));
        } catch (Throwable th) {
            r7o r7oVar2 = z7o.b;
            t7oVar = new t7o(th);
        }
        return (c85) (t7oVar instanceof t7o ? null : t7oVar);
    }

    public static final void b(boolean z, yci yciVar, ges gesVar, hq5 hq5Var, int i2) {
        int i3;
        oq5 oq5Var;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-841331867);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var2.g(z) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var2.f(yciVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= oq5Var2.f(gesVar) ? 256 : 128;
        }
        int i4 = i3;
        if ((i4 & 147) == 146 && oq5Var2.z()) {
            oq5Var2.S();
            oq5Var = oq5Var2;
        } else {
            oq5Var2.U();
            if ((i2 & 1) != 0 && !oq5Var2.y()) {
                oq5Var2.S();
            }
            oq5Var2.q();
            boolean z2 = false;
            ids O = o5g.O(0, 1, oq5Var2);
            jx7 jx7Var = (jx7) oq5Var2.j(es5.h);
            if ((((i4 & 896) ^ 384) > 256 && oq5Var2.f(gesVar)) || (i4 & 384) == 256) {
                z2 = true;
            }
            boolean f2 = z2 | oq5Var2.f(jx7Var);
            Object K = oq5Var2.K();
            kjn kjnVar = gq5.a;
            if (f2 || K == kjnVar) {
                K = Integer.valueOf(eeh.b(ids.a(O, StringUtil.SPACE, gesVar, 0, false, 0, 0L, 1020).e));
                oq5Var2.k0(K);
            }
            int intValue = ((Number) K).intValue();
            boolean d2 = oq5Var2.d(intValue);
            Object K2 = oq5Var2.K();
            if (d2 || K2 == kjnVar) {
                K2 = new ak(intValue);
                oq5Var2.k0(K2);
            }
            kfh kfhVar = (kfh) K2;
            int i5 = oq5Var2.P;
            a l2 = oq5Var2.l();
            yci H = vnj.H(oq5Var2, yciVar);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var2.d0();
            if (oq5Var2.O) {
                oq5Var2.k(grbVar);
            } else {
                oq5Var2.n0();
            }
            g0g.U(oq5Var2, kfhVar, wp5.f);
            g0g.U(oq5Var2, l2, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i5))) {
                ouj.x(i5, oq5Var2, i5, kb5Var);
            }
            g0g.U(oq5Var2, H, wp5.d);
            oq5Var = oq5Var2;
            ivf.l(z, null, gesVar, oq5Var, i4 & 910, 2);
            oq5Var.p(true);
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new yj(z, yciVar, gesVar, i2, 0);
        }
    }

    public static final String b0(String str) {
        Object t7oVar;
        if (str == null) {
            return null;
        }
        try {
            r7o r7oVar = z7o.b;
            try {
                new URL(str);
                t7oVar = new lpt(str);
            } catch (MalformedURLException unused) {
                throw new IllegalArgumentException("Invalid url ".concat(str));
            }
        } catch (Throwable th) {
            r7o r7oVar2 = z7o.b;
            t7oVar = new t7o(th);
        }
        if (t7oVar instanceof t7o) {
            t7oVar = null;
        }
        lpt lptVar = (lpt) t7oVar;
        if (lptVar != null) {
            return lptVar.a;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(ik ikVar, mxo mxoVar, yci yciVar, o0k o0kVar, Function0 function0, pyc pycVar, boolean z, boolean z2, Function2 function2, Function0 function02, Function1 function1, wn5 wn5Var, hq5 hq5Var, int i2, int i3, int i4) {
        int i5;
        o0k o0kVar2;
        int i6;
        pyc pycVar2;
        int i7;
        boolean z3;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z4;
        boolean z5;
        Object K;
        final o0k o0kVar3;
        Function2 function22;
        pyc pycVar3;
        Function0 function03;
        Function1 function12;
        pyc pycVar4;
        Function2 function23;
        Function0 function04;
        Function1 function13;
        wn5 C;
        xmn r2;
        mxoVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(2054563675);
        if ((i2 & 6) == 0) {
            i5 = ((i2 & 8) == 0 ? oq5Var.f(ikVar) : oq5Var.h(ikVar) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 |= oq5Var.h(mxoVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i5 |= oq5Var.f(yciVar) ? 256 : 128;
        }
        int i16 = i4 & 8;
        if (i16 != 0) {
            i5 |= 3072;
        } else if ((i2 & 3072) == 0) {
            o0kVar2 = o0kVar;
            i5 |= oq5Var.f(o0kVar2) ? 2048 : 1024;
            if ((i2 & 24576) == 0) {
                i5 |= oq5Var.h(function0) ? 16384 : RemoteCameraConfig.Notification.ID;
            }
            i6 = i4 & 32;
            if (i6 == 0) {
                i5 |= 196608;
                pycVar2 = pycVar;
            } else {
                pycVar2 = pycVar;
                if ((i2 & 196608) == 0) {
                    i5 |= oq5Var.h(pycVar2) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
                }
            }
            if ((i2 & ScreenMirroringConfig.Video.BITRATE_1_5MB) == 0) {
                i5 |= oq5Var.g(z) ? 1048576 : 524288;
            }
            i7 = i4 & 128;
            if (i7 == 0) {
                i5 |= 12582912;
                z3 = z2;
            } else {
                z3 = z2;
                if ((i2 & 12582912) == 0) {
                    i5 |= oq5Var.g(z3) ? 8388608 : RemoteCameraConfig.Camera.BITRATE;
                }
            }
            i8 = i5;
            i9 = i4 & 256;
            if (i9 == 0) {
                i8 |= 100663296;
            } else if ((i2 & 100663296) == 0) {
                i10 = i9;
                i8 |= oq5Var.h(function2) ? 67108864 : 33554432;
                i11 = i4 & RemoteCameraConfig.Mic.BUFFER_SIZE;
                if (i11 != 0) {
                    i8 |= 805306368;
                } else if ((i2 & 805306368) == 0) {
                    i12 = i11;
                    i8 |= oq5Var.h(function02) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
                    i13 = i4 & 1024;
                    if (i13 == 0) {
                        i15 = i3 | 6;
                        i14 = i13;
                    } else if ((i3 & 6) == 0) {
                        i14 = i13;
                        i15 = i3 | (oq5Var.h(function1) ? 4 : 2);
                    } else {
                        i14 = i13;
                        i15 = i3;
                    }
                    if ((i3 & 48) == 0) {
                        i15 |= oq5Var.h(wn5Var) ? 32 : 16;
                    }
                    if ((i8 & 306783379) != 306783378 && (i15 & 19) == 18 && oq5Var.z()) {
                        oq5Var.S();
                        function23 = function2;
                        function04 = function02;
                        function13 = function1;
                        pycVar4 = pycVar2;
                    } else {
                        final o0k a2 = i16 == 0 ? androidx.compose.foundation.layout.a.a(0.0f, 0.0f, 3) : o0kVar2;
                        if (i6 != 0) {
                            pycVar2 = ksw.c;
                        }
                        z4 = i7 == 0 ? true : z3;
                        Function2 function24 = i10 == 0 ? null : function2;
                        Function0 function05 = i12 == 0 ? null : function02;
                        Function1 function14 = i14 == 0 ? null : function1;
                        u7g.a(((ma5) oq5Var.j(pa5.a)).g(), oq5Var, 0);
                        z5 = (i15 & 112) != 32;
                        K = oq5Var.K();
                        if (!z5 || K == gq5.a) {
                            wn5 wn5Var2 = new wn5(new wk0(8, new jfi(wn5Var)), -434707029, true);
                            oq5Var.k0(wn5Var2);
                            K = wn5Var2;
                        }
                        final pyc pycVar5 = (pyc) K;
                        if (z4) {
                            o0kVar3 = a2;
                            oq5Var.Z(-71294196);
                            pyc pycVar6 = pycVar2;
                            Function2 function25 = function24;
                            Function0 function06 = function05;
                            Function1 function15 = function14;
                            function22 = function25;
                            pycVar3 = pycVar6;
                            function03 = function06;
                            function12 = function15;
                            wn5 C2 = ild.C(-1083302695, new zt2(function25, function0, pycVar6, ikVar, function06, function15, 0), oq5Var);
                            yci c2 = d.c(yciVar, 1.0f);
                            final int i17 = 1;
                            wn5 C3 = ild.C(-403771693, new pyc() { // from class: yt2
                                @Override // defpackage.pyc
                                public final Object invoke(Object obj, Object obj2, Object obj3) {
                                    int i18 = i17;
                                    o0k o0kVar4 = (o0k) obj;
                                    hq5 hq5Var2 = (hq5) obj2;
                                    int intValue = ((Integer) obj3).intValue();
                                    switch (i18) {
                                        case 0:
                                            o0kVar4.getClass();
                                            if ((intValue & 17) == 16) {
                                                oq5 oq5Var2 = (oq5) hq5Var2;
                                                if (oq5Var2.z()) {
                                                    oq5Var2.S();
                                                    break;
                                                }
                                            }
                                            pycVar5.invoke(o0kVar3, hq5Var2, 0);
                                        default:
                                            o0kVar4.getClass();
                                            if ((intValue & 6) == 0) {
                                                intValue |= ((oq5) hq5Var2).f(o0kVar4) ? 4 : 2;
                                            }
                                            if ((intValue & 19) == 18) {
                                                oq5 oq5Var3 = (oq5) hq5Var2;
                                                if (oq5Var3.z()) {
                                                    oq5Var3.S();
                                                    break;
                                                }
                                            }
                                            pycVar5.invoke(ghh.C(o0kVar4, o0kVar3), hq5Var2, 0);
                                    }
                                    return Unit.a;
                                }
                            }, oq5Var);
                            oq5Var = oq5Var;
                            q7g.r(3078, 4, C2, C3, oq5Var, c2, false);
                            oq5Var.p(false);
                        } else {
                            oq5Var.Z(-71760436);
                            int i18 = i8 >> 3;
                            ek C4 = yd5.C(mxoVar, oq5Var);
                            if (function0 == null) {
                                oq5Var.Z(-71596199);
                                oq5Var.p(false);
                                C = null;
                            } else {
                                oq5Var.Z(-71596198);
                                C = ild.C(-440569939, new zk(8, function0), oq5Var);
                                oq5Var.p(false);
                            }
                            wn5 wn5Var3 = C;
                            final int i19 = 0;
                            o0kVar3 = a2;
                            lsq.h(C4, ikVar, pycVar2, d.c(yciVar, 1.0f), wn5Var3, z, ild.C(1169891343, new pyc() { // from class: yt2
                                @Override // defpackage.pyc
                                public final Object invoke(Object obj, Object obj2, Object obj3) {
                                    int i182 = i19;
                                    o0k o0kVar4 = (o0k) obj;
                                    hq5 hq5Var2 = (hq5) obj2;
                                    int intValue = ((Integer) obj3).intValue();
                                    switch (i182) {
                                        case 0:
                                            o0kVar4.getClass();
                                            if ((intValue & 17) == 16) {
                                                oq5 oq5Var2 = (oq5) hq5Var2;
                                                if (oq5Var2.z()) {
                                                    oq5Var2.S();
                                                    break;
                                                }
                                            }
                                            pycVar5.invoke(a2, hq5Var2, 0);
                                        default:
                                            o0kVar4.getClass();
                                            if ((intValue & 6) == 0) {
                                                intValue |= ((oq5) hq5Var2).f(o0kVar4) ? 4 : 2;
                                            }
                                            if ((intValue & 19) == 18) {
                                                oq5 oq5Var3 = (oq5) hq5Var2;
                                                if (oq5Var3.z()) {
                                                    oq5Var3.S();
                                                    break;
                                                }
                                            }
                                            pycVar5.invoke(ghh.C(o0kVar4, a2), hq5Var2, 0);
                                    }
                                    return Unit.a;
                                }
                            }, oq5Var), oq5Var, ((i8 << 3) & 112) | ScreenMirroringConfig.Video.BITRATE_1_5MB | ((i8 >> 9) & 896) | (i18 & 458752));
                            oq5Var.p(false);
                            oq5Var = oq5Var;
                            pycVar3 = pycVar2;
                            function22 = function24;
                            function03 = function05;
                            function12 = function14;
                        }
                        pycVar4 = pycVar3;
                        o0kVar2 = o0kVar3;
                        z3 = z4;
                        function23 = function22;
                        function04 = function03;
                        function13 = function12;
                    }
                    r2 = oq5Var.r();
                    if (r2 == null) {
                        r2.d = new xt2(ikVar, mxoVar, yciVar, o0kVar2, function0, pycVar4, z, z3, function23, function04, function13, wn5Var, i2, i3, i4, 1);
                        return;
                    }
                    return;
                }
                i12 = i11;
                i13 = i4 & 1024;
                if (i13 == 0) {
                }
                if ((i3 & 48) == 0) {
                }
                if ((i8 & 306783379) != 306783378) {
                }
                if (i16 == 0) {
                }
                if (i6 != 0) {
                }
                if (i7 == 0) {
                }
                if (i10 == 0) {
                }
                if (i12 == 0) {
                }
                if (i14 == 0) {
                }
                u7g.a(((ma5) oq5Var.j(pa5.a)).g(), oq5Var, 0);
                if ((i15 & 112) != 32) {
                }
                K = oq5Var.K();
                if (!z5) {
                }
                wn5 wn5Var22 = new wn5(new wk0(8, new jfi(wn5Var)), -434707029, true);
                oq5Var.k0(wn5Var22);
                K = wn5Var22;
                final pyc pycVar52 = (pyc) K;
                if (z4) {
                }
                pycVar4 = pycVar3;
                o0kVar2 = o0kVar3;
                z3 = z4;
                function23 = function22;
                function04 = function03;
                function13 = function12;
                r2 = oq5Var.r();
                if (r2 == null) {
                }
            }
            i10 = i9;
            i11 = i4 & RemoteCameraConfig.Mic.BUFFER_SIZE;
            if (i11 != 0) {
            }
            i12 = i11;
            i13 = i4 & 1024;
            if (i13 == 0) {
            }
            if ((i3 & 48) == 0) {
            }
            if ((i8 & 306783379) != 306783378) {
            }
            if (i16 == 0) {
            }
            if (i6 != 0) {
            }
            if (i7 == 0) {
            }
            if (i10 == 0) {
            }
            if (i12 == 0) {
            }
            if (i14 == 0) {
            }
            u7g.a(((ma5) oq5Var.j(pa5.a)).g(), oq5Var, 0);
            if ((i15 & 112) != 32) {
            }
            K = oq5Var.K();
            if (!z5) {
            }
            wn5 wn5Var222 = new wn5(new wk0(8, new jfi(wn5Var)), -434707029, true);
            oq5Var.k0(wn5Var222);
            K = wn5Var222;
            final pyc pycVar522 = (pyc) K;
            if (z4) {
            }
            pycVar4 = pycVar3;
            o0kVar2 = o0kVar3;
            z3 = z4;
            function23 = function22;
            function04 = function03;
            function13 = function12;
            r2 = oq5Var.r();
            if (r2 == null) {
            }
        }
        o0kVar2 = o0kVar;
        if ((i2 & 24576) == 0) {
        }
        i6 = i4 & 32;
        if (i6 == 0) {
        }
        if ((i2 & ScreenMirroringConfig.Video.BITRATE_1_5MB) == 0) {
        }
        i7 = i4 & 128;
        if (i7 == 0) {
        }
        i8 = i5;
        i9 = i4 & 256;
        if (i9 == 0) {
        }
        i10 = i9;
        i11 = i4 & RemoteCameraConfig.Mic.BUFFER_SIZE;
        if (i11 != 0) {
        }
        i12 = i11;
        i13 = i4 & 1024;
        if (i13 == 0) {
        }
        if ((i3 & 48) == 0) {
        }
        if ((i8 & 306783379) != 306783378) {
        }
        if (i16 == 0) {
        }
        if (i6 != 0) {
        }
        if (i7 == 0) {
        }
        if (i10 == 0) {
        }
        if (i12 == 0) {
        }
        if (i14 == 0) {
        }
        u7g.a(((ma5) oq5Var.j(pa5.a)).g(), oq5Var, 0);
        if ((i15 & 112) != 32) {
        }
        K = oq5Var.K();
        if (!z5) {
        }
        wn5 wn5Var2222 = new wn5(new wk0(8, new jfi(wn5Var)), -434707029, true);
        oq5Var.k0(wn5Var2222);
        K = wn5Var2222;
        final pyc pycVar5222 = (pyc) K;
        if (z4) {
        }
        pycVar4 = pycVar3;
        o0kVar2 = o0kVar3;
        z3 = z4;
        function23 = function22;
        function04 = function03;
        function13 = function12;
        r2 = oq5Var.r();
        if (r2 == null) {
        }
    }

    public static void c0(p86 p86Var, View view, float[] fArr) {
        Class<?> cls = view.getClass();
        String str = "set" + p86Var.b;
        try {
            int D = ouj.D(p86Var.c);
            Class cls2 = Integer.TYPE;
            Class cls3 = Float.TYPE;
            boolean z = true;
            switch (D) {
                case 0:
                    cls.getMethod(str, cls2).invoke(view, Integer.valueOf((int) fArr[0]));
                    return;
                case 1:
                    cls.getMethod(str, cls3).invoke(view, Float.valueOf(fArr[0]));
                    return;
                case 2:
                    cls.getMethod(str, cls2).invoke(view, Integer.valueOf((t((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (t((int) (fArr[3] * 255.0f)) << 24) | (t((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | t((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f))));
                    return;
                case 3:
                    Method method = cls.getMethod(str, Drawable.class);
                    int t2 = (t((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (t((int) (fArr[3] * 255.0f)) << 24) | (t((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | t((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f));
                    ColorDrawable colorDrawable = new ColorDrawable();
                    colorDrawable.setColor(t2);
                    method.invoke(view, colorDrawable);
                    return;
                case 4:
                    throw new RuntimeException("unable to interpolate strings " + p86Var.b);
                case 5:
                    Method method2 = cls.getMethod(str, Boolean.TYPE);
                    if (fArr[0] <= 0.5f) {
                        z = false;
                    }
                    method2.invoke(view, Boolean.valueOf(z));
                    return;
                case 6:
                    cls.getMethod(str, cls3).invoke(view, Float.valueOf(fArr[0]));
                    return;
                default:
                    return;
            }
        } catch (IllegalAccessException e2) {
            StringBuilder u2 = ouj.u("Cannot access method ", str, " on View \"");
            u2.append(irf.P(view));
            u2.append("\"");
            Log.e("CustomSupport", u2.toString(), e2);
        } catch (NoSuchMethodException e3) {
            StringBuilder u3 = ouj.u("No method ", str, " on View \"");
            u3.append(irf.P(view));
            u3.append("\"");
            Log.e("CustomSupport", u3.toString(), e3);
        } catch (InvocationTargetException e4) {
            StringBuilder u4 = ouj.u("Cannot invoke method ", str, " on View \"");
            u4.append(irf.P(view));
            u4.append("\"");
            Log.e("CustomSupport", u4.toString(), e4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0138  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void d(String str, mxo mxoVar, yci yciVar, o0k o0kVar, Function0 function0, pyc pycVar, boolean z, boolean z2, Function2 function2, Function0 function02, Function1 function1, wn5 wn5Var, hq5 hq5Var, int i2, int i3, int i4) {
        int i5;
        mxo mxoVar2;
        yci yciVar2;
        int i6;
        o0k o0kVar2;
        int i7;
        Function0 function03;
        int i8;
        pyc pycVar2;
        int i9;
        boolean z3;
        int i10;
        boolean z4;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        yci yciVar3;
        o0k o0kVar3;
        Function0 function04;
        pyc pycVar3;
        boolean z5;
        boolean z6;
        Function2 function22;
        Function0 function05;
        Function1 function12;
        xmn r2;
        str.getClass();
        mxoVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-651869289);
        if ((i2 & 6) == 0) {
            i5 = (oq5Var.f(str) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            mxoVar2 = mxoVar;
            i5 |= oq5Var.h(mxoVar2) ? 32 : 16;
        } else {
            mxoVar2 = mxoVar;
        }
        int i19 = i4 & 4;
        if (i19 != 0) {
            i5 |= 384;
        } else if ((i2 & 384) == 0) {
            yciVar2 = yciVar;
            i5 |= oq5Var.f(yciVar2) ? 256 : 128;
            i6 = i4 & 8;
            if (i6 == 0) {
                i5 |= 3072;
            } else if ((i2 & 3072) == 0) {
                o0kVar2 = o0kVar;
                i5 |= oq5Var.f(o0kVar2) ? 2048 : 1024;
                i7 = i4 & 16;
                if (i7 != 0) {
                    i5 |= 24576;
                } else if ((i2 & 24576) == 0) {
                    function03 = function0;
                    i5 |= oq5Var.h(function03) ? 16384 : RemoteCameraConfig.Notification.ID;
                    i8 = i4 & 32;
                    if (i8 == 0) {
                        i5 |= 196608;
                        pycVar2 = pycVar;
                    } else {
                        pycVar2 = pycVar;
                        if ((i2 & 196608) == 0) {
                            i5 |= oq5Var.h(pycVar2) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
                        }
                    }
                    i9 = i4 & 64;
                    if (i9 == 0) {
                        i5 |= ScreenMirroringConfig.Video.BITRATE_1_5MB;
                        z3 = z;
                    } else {
                        z3 = z;
                        if ((i2 & ScreenMirroringConfig.Video.BITRATE_1_5MB) == 0) {
                            i5 |= oq5Var.g(z3) ? 1048576 : 524288;
                        }
                    }
                    i10 = i4 & 128;
                    if (i10 == 0) {
                        i5 |= 12582912;
                        z4 = z2;
                    } else {
                        z4 = z2;
                        if ((i2 & 12582912) == 0) {
                            i5 |= oq5Var.g(z4) ? 8388608 : RemoteCameraConfig.Camera.BITRATE;
                        }
                    }
                    i11 = i5;
                    i12 = i4 & 256;
                    if (i12 == 0) {
                        i11 |= 100663296;
                    } else if ((i2 & 100663296) == 0) {
                        i13 = i12;
                        i11 |= oq5Var.h(function2) ? 67108864 : 33554432;
                        i14 = i4 & RemoteCameraConfig.Mic.BUFFER_SIZE;
                        if (i14 != 0) {
                            i11 |= 805306368;
                        } else if ((i2 & 805306368) == 0) {
                            i15 = i14;
                            i11 |= oq5Var.h(function02) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
                            i16 = i4 & 1024;
                            if (i16 == 0) {
                                i18 = i3 | 6;
                                i17 = i16;
                            } else if ((i3 & 6) == 0) {
                                i17 = i16;
                                i18 = i3 | (oq5Var.h(function1) ? 4 : 2);
                            } else {
                                i17 = i16;
                                i18 = i3;
                            }
                            if ((i3 & 48) == 0) {
                                i18 |= oq5Var.h(wn5Var) ? 32 : 16;
                            }
                            if ((i11 & 306783379) != 306783378 && (i18 & 19) == 18 && oq5Var.z()) {
                                oq5Var.S();
                                function05 = function02;
                                pycVar3 = pycVar2;
                                z6 = z4;
                                yciVar3 = yciVar2;
                                function04 = function03;
                                function22 = function2;
                                z5 = z3;
                                o0kVar3 = o0kVar2;
                                function12 = function1;
                            } else {
                                yci yciVar4 = i19 == 0 ? vci.a : yciVar2;
                                o0k a2 = i6 == 0 ? androidx.compose.foundation.layout.a.a(0.0f, 0.0f, 3) : o0kVar2;
                                Function0 function06 = i7 == 0 ? null : function03;
                                if (i8 != 0) {
                                    pycVar2 = ksw.b;
                                }
                                if (i9 != 0) {
                                    z3 = true;
                                }
                                if (i10 != 0) {
                                    z4 = true;
                                }
                                Function2 function23 = i13 == 0 ? null : function2;
                                Function0 function07 = i15 == 0 ? null : function02;
                                Function1 function13 = i17 == 0 ? null : function1;
                                int i20 = i11 & 2147483632;
                                int i21 = i18 & 126;
                                yci yciVar5 = yciVar4;
                                pyc pycVar4 = pycVar2;
                                boolean z7 = z3;
                                Function2 function24 = function23;
                                boolean z8 = z4;
                                c(new hk(str), mxoVar2, yciVar5, a2, function06, pycVar4, z7, z8, function24, function07, function13, wn5Var, oq5Var, i20, i21, 0);
                                yciVar3 = yciVar5;
                                o0kVar3 = a2;
                                function04 = function06;
                                pycVar3 = pycVar4;
                                z5 = z7;
                                z6 = z8;
                                function22 = function24;
                                function05 = function07;
                                function12 = function13;
                            }
                            r2 = oq5Var.r();
                            if (r2 == null) {
                                r2.d = new xt2(str, mxoVar, yciVar3, o0kVar3, function04, pycVar3, z5, z6, function22, function05, function12, wn5Var, i2, i3, i4, 0);
                                return;
                            }
                            return;
                        }
                        i15 = i14;
                        i16 = i4 & 1024;
                        if (i16 == 0) {
                        }
                        if ((i3 & 48) == 0) {
                        }
                        if ((i11 & 306783379) != 306783378) {
                        }
                        if (i19 == 0) {
                        }
                        if (i6 == 0) {
                        }
                        if (i7 == 0) {
                        }
                        if (i8 != 0) {
                        }
                        if (i9 != 0) {
                        }
                        if (i10 != 0) {
                        }
                        if (i13 == 0) {
                        }
                        if (i15 == 0) {
                        }
                        if (i17 == 0) {
                        }
                        int i202 = i11 & 2147483632;
                        int i212 = i18 & 126;
                        yci yciVar52 = yciVar4;
                        pyc pycVar42 = pycVar2;
                        boolean z72 = z3;
                        Function2 function242 = function23;
                        boolean z82 = z4;
                        c(new hk(str), mxoVar2, yciVar52, a2, function06, pycVar42, z72, z82, function242, function07, function13, wn5Var, oq5Var, i202, i212, 0);
                        yciVar3 = yciVar52;
                        o0kVar3 = a2;
                        function04 = function06;
                        pycVar3 = pycVar42;
                        z5 = z72;
                        z6 = z82;
                        function22 = function242;
                        function05 = function07;
                        function12 = function13;
                        r2 = oq5Var.r();
                        if (r2 == null) {
                        }
                    }
                    i13 = i12;
                    i14 = i4 & RemoteCameraConfig.Mic.BUFFER_SIZE;
                    if (i14 != 0) {
                    }
                    i15 = i14;
                    i16 = i4 & 1024;
                    if (i16 == 0) {
                    }
                    if ((i3 & 48) == 0) {
                    }
                    if ((i11 & 306783379) != 306783378) {
                    }
                    if (i19 == 0) {
                    }
                    if (i6 == 0) {
                    }
                    if (i7 == 0) {
                    }
                    if (i8 != 0) {
                    }
                    if (i9 != 0) {
                    }
                    if (i10 != 0) {
                    }
                    if (i13 == 0) {
                    }
                    if (i15 == 0) {
                    }
                    if (i17 == 0) {
                    }
                    int i2022 = i11 & 2147483632;
                    int i2122 = i18 & 126;
                    yci yciVar522 = yciVar4;
                    pyc pycVar422 = pycVar2;
                    boolean z722 = z3;
                    Function2 function2422 = function23;
                    boolean z822 = z4;
                    c(new hk(str), mxoVar2, yciVar522, a2, function06, pycVar422, z722, z822, function2422, function07, function13, wn5Var, oq5Var, i2022, i2122, 0);
                    yciVar3 = yciVar522;
                    o0kVar3 = a2;
                    function04 = function06;
                    pycVar3 = pycVar422;
                    z5 = z722;
                    z6 = z822;
                    function22 = function2422;
                    function05 = function07;
                    function12 = function13;
                    r2 = oq5Var.r();
                    if (r2 == null) {
                    }
                }
                function03 = function0;
                i8 = i4 & 32;
                if (i8 == 0) {
                }
                i9 = i4 & 64;
                if (i9 == 0) {
                }
                i10 = i4 & 128;
                if (i10 == 0) {
                }
                i11 = i5;
                i12 = i4 & 256;
                if (i12 == 0) {
                }
                i13 = i12;
                i14 = i4 & RemoteCameraConfig.Mic.BUFFER_SIZE;
                if (i14 != 0) {
                }
                i15 = i14;
                i16 = i4 & 1024;
                if (i16 == 0) {
                }
                if ((i3 & 48) == 0) {
                }
                if ((i11 & 306783379) != 306783378) {
                }
                if (i19 == 0) {
                }
                if (i6 == 0) {
                }
                if (i7 == 0) {
                }
                if (i8 != 0) {
                }
                if (i9 != 0) {
                }
                if (i10 != 0) {
                }
                if (i13 == 0) {
                }
                if (i15 == 0) {
                }
                if (i17 == 0) {
                }
                int i20222 = i11 & 2147483632;
                int i21222 = i18 & 126;
                yci yciVar5222 = yciVar4;
                pyc pycVar4222 = pycVar2;
                boolean z7222 = z3;
                Function2 function24222 = function23;
                boolean z8222 = z4;
                c(new hk(str), mxoVar2, yciVar5222, a2, function06, pycVar4222, z7222, z8222, function24222, function07, function13, wn5Var, oq5Var, i20222, i21222, 0);
                yciVar3 = yciVar5222;
                o0kVar3 = a2;
                function04 = function06;
                pycVar3 = pycVar4222;
                z5 = z7222;
                z6 = z8222;
                function22 = function24222;
                function05 = function07;
                function12 = function13;
                r2 = oq5Var.r();
                if (r2 == null) {
                }
            }
            o0kVar2 = o0kVar;
            i7 = i4 & 16;
            if (i7 != 0) {
            }
            function03 = function0;
            i8 = i4 & 32;
            if (i8 == 0) {
            }
            i9 = i4 & 64;
            if (i9 == 0) {
            }
            i10 = i4 & 128;
            if (i10 == 0) {
            }
            i11 = i5;
            i12 = i4 & 256;
            if (i12 == 0) {
            }
            i13 = i12;
            i14 = i4 & RemoteCameraConfig.Mic.BUFFER_SIZE;
            if (i14 != 0) {
            }
            i15 = i14;
            i16 = i4 & 1024;
            if (i16 == 0) {
            }
            if ((i3 & 48) == 0) {
            }
            if ((i11 & 306783379) != 306783378) {
            }
            if (i19 == 0) {
            }
            if (i6 == 0) {
            }
            if (i7 == 0) {
            }
            if (i8 != 0) {
            }
            if (i9 != 0) {
            }
            if (i10 != 0) {
            }
            if (i13 == 0) {
            }
            if (i15 == 0) {
            }
            if (i17 == 0) {
            }
            int i202222 = i11 & 2147483632;
            int i212222 = i18 & 126;
            yci yciVar52222 = yciVar4;
            pyc pycVar42222 = pycVar2;
            boolean z72222 = z3;
            Function2 function242222 = function23;
            boolean z82222 = z4;
            c(new hk(str), mxoVar2, yciVar52222, a2, function06, pycVar42222, z72222, z82222, function242222, function07, function13, wn5Var, oq5Var, i202222, i212222, 0);
            yciVar3 = yciVar52222;
            o0kVar3 = a2;
            function04 = function06;
            pycVar3 = pycVar42222;
            z5 = z72222;
            z6 = z82222;
            function22 = function242222;
            function05 = function07;
            function12 = function13;
            r2 = oq5Var.r();
            if (r2 == null) {
            }
        }
        yciVar2 = yciVar;
        i6 = i4 & 8;
        if (i6 == 0) {
        }
        o0kVar2 = o0kVar;
        i7 = i4 & 16;
        if (i7 != 0) {
        }
        function03 = function0;
        i8 = i4 & 32;
        if (i8 == 0) {
        }
        i9 = i4 & 64;
        if (i9 == 0) {
        }
        i10 = i4 & 128;
        if (i10 == 0) {
        }
        i11 = i5;
        i12 = i4 & 256;
        if (i12 == 0) {
        }
        i13 = i12;
        i14 = i4 & RemoteCameraConfig.Mic.BUFFER_SIZE;
        if (i14 != 0) {
        }
        i15 = i14;
        i16 = i4 & 1024;
        if (i16 == 0) {
        }
        if ((i3 & 48) == 0) {
        }
        if ((i11 & 306783379) != 306783378) {
        }
        if (i19 == 0) {
        }
        if (i6 == 0) {
        }
        if (i7 == 0) {
        }
        if (i8 != 0) {
        }
        if (i9 != 0) {
        }
        if (i10 != 0) {
        }
        if (i13 == 0) {
        }
        if (i15 == 0) {
        }
        if (i17 == 0) {
        }
        int i2022222 = i11 & 2147483632;
        int i2122222 = i18 & 126;
        yci yciVar522222 = yciVar4;
        pyc pycVar422222 = pycVar2;
        boolean z722222 = z3;
        Function2 function2422222 = function23;
        boolean z822222 = z4;
        c(new hk(str), mxoVar2, yciVar522222, a2, function06, pycVar422222, z722222, z822222, function2422222, function07, function13, wn5Var, oq5Var, i2022222, i2122222, 0);
        yciVar3 = yciVar522222;
        o0kVar3 = a2;
        function04 = function06;
        pycVar3 = pycVar422222;
        z5 = z722222;
        z6 = z822222;
        function22 = function2422222;
        function05 = function07;
        function12 = function13;
        r2 = oq5Var.r();
        if (r2 == null) {
        }
    }

    public static void d0(String str, String str2, List list) {
        str.getClass();
        list.getClass();
        g0(PListParser.TAG_ARRAY, str, list, str2, false);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void e(te teVar, Function0 function0, yci yciVar, Function0 function02, float f2, q0k q0kVar, d85 d85Var, hq5 hq5Var, int i2, int i3) {
        int i4;
        Function0 function03;
        int i5;
        float f3;
        int i6;
        d85 d85Var2;
        int i7;
        d85 d85Var3;
        float f4;
        int i8;
        boolean z;
        float f5;
        Function0 function04;
        d85 d85Var4;
        xmn r2;
        function0.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1674986785);
        if ((i2 & 6) == 0) {
            i4 = ((i2 & 8) == 0 ? oq5Var.f(teVar) : oq5Var.h(teVar) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= oq5Var.h(function0) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= oq5Var.f(yciVar) ? 256 : 128;
        }
        int i9 = i3 & 8;
        if (i9 != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            function03 = function02;
            i4 |= oq5Var.h(function03) ? 2048 : 1024;
            i5 = i3 & 16;
            if (i5 == 0) {
                i4 |= 24576;
            } else if ((i2 & 24576) == 0) {
                f3 = f2;
                i4 |= oq5Var.c(f3) ? 16384 : RemoteCameraConfig.Notification.ID;
                if ((196608 & i2) == 0) {
                    i4 |= oq5Var.f(q0kVar) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
                }
                i6 = i3 & 64;
                if (i6 != 0) {
                    i4 |= ScreenMirroringConfig.Video.BITRATE_1_5MB;
                } else if ((1572864 & i2) == 0) {
                    d85Var2 = d85Var;
                    i4 |= oq5Var.f(d85Var2) ? 1048576 : 524288;
                    if ((599187 & i4) == 599186 || !oq5Var.z()) {
                        oq5Var.U();
                        i7 = i2 & 1;
                        kjn kjnVar = gq5.a;
                        if (i7 != 0 || oq5Var.y()) {
                            if (i9 != 0) {
                                Object K = oq5Var.K();
                                if (K == kjnVar) {
                                    K = new uf3(1);
                                    oq5Var.k0(K);
                                }
                                function03 = (Function0) K;
                            }
                            if (i5 != 0) {
                                f3 = 24;
                            }
                            if (i6 != 0) {
                                d85Var3 = null;
                                f4 = f3;
                                oq5Var.q();
                                yci d2 = d.d(d.g(androidx.compose.ui.platform.a.a(yciVar, "block_branded_buttons"), f4, 0.0f, 2), 1.0f);
                                kfh d3 = ug3.d(b2c.f, false);
                                i8 = oq5Var.P;
                                a l2 = oq5Var.l();
                                yci H = vnj.H(oq5Var, d2);
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
                                if (!oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i8))) {
                                    ouj.x(i8, oq5Var, i8, kb5Var);
                                }
                                g0g.U(oq5Var, H, wp5.d);
                                if (teVar == null) {
                                    oq5Var.Z(-2052981787);
                                    z = false;
                                } else {
                                    oq5Var.Z(-2052981786);
                                    boolean z2 = (i4 & 7168) == 2048;
                                    Object K2 = oq5Var.K();
                                    if (z2 || K2 == kjnVar) {
                                        K2 = new or(9, function03);
                                        oq5Var.k0(K2);
                                    }
                                    com.yandex.music.core.ui.compose.a.a((Function0) K2, oq5Var, 0);
                                    int i10 = i4 & 112;
                                    z = false;
                                    hdg.b(teVar.a, function0, androidx.compose.ui.platform.a.a(androidx.compose.foundation.layout.a.l(vci.a, q0kVar), "branded_button"), d85Var3 == null ? teVar.b : d85Var3, null, oq5Var, i10, 16);
                                }
                                oq5Var.p(z);
                                oq5Var.p(true);
                                d85 d85Var5 = d85Var3;
                                f5 = f4;
                                function04 = function03;
                                d85Var4 = d85Var5;
                            }
                        } else {
                            oq5Var.S();
                        }
                        f4 = f3;
                        d85Var3 = d85Var2;
                        oq5Var.q();
                        yci d22 = d.d(d.g(androidx.compose.ui.platform.a.a(yciVar, "block_branded_buttons"), f4, 0.0f, 2), 1.0f);
                        kfh d32 = ug3.d(b2c.f, false);
                        i8 = oq5Var.P;
                        a l22 = oq5Var.l();
                        yci H2 = vnj.H(oq5Var, d22);
                        xp5.T.getClass();
                        grb grbVar2 = wp5.b;
                        oq5Var.d0();
                        if (oq5Var.O) {
                        }
                        g0g.U(oq5Var, d32, wp5.f);
                        g0g.U(oq5Var, l22, wp5.e);
                        kb5 kb5Var2 = wp5.g;
                        if (!oq5Var.O) {
                        }
                        ouj.x(i8, oq5Var, i8, kb5Var2);
                        g0g.U(oq5Var, H2, wp5.d);
                        if (teVar == null) {
                        }
                        oq5Var.p(z);
                        oq5Var.p(true);
                        d85 d85Var52 = d85Var3;
                        f5 = f4;
                        function04 = function03;
                        d85Var4 = d85Var52;
                    } else {
                        oq5Var.S();
                        function04 = function03;
                        f5 = f3;
                        d85Var4 = d85Var2;
                    }
                    r2 = oq5Var.r();
                    if (r2 == null) {
                        r2.d = new hh3(teVar, function0, yciVar, function04, f5, q0kVar, d85Var4, i2, i3);
                        return;
                    }
                    return;
                }
                d85Var2 = d85Var;
                if ((599187 & i4) == 599186) {
                }
                oq5Var.U();
                i7 = i2 & 1;
                kjn kjnVar2 = gq5.a;
                if (i7 != 0) {
                }
                if (i9 != 0) {
                }
                if (i5 != 0) {
                }
                if (i6 != 0) {
                }
                f4 = f3;
                d85Var3 = d85Var2;
                oq5Var.q();
                yci d222 = d.d(d.g(androidx.compose.ui.platform.a.a(yciVar, "block_branded_buttons"), f4, 0.0f, 2), 1.0f);
                kfh d322 = ug3.d(b2c.f, false);
                i8 = oq5Var.P;
                a l222 = oq5Var.l();
                yci H22 = vnj.H(oq5Var, d222);
                xp5.T.getClass();
                grb grbVar22 = wp5.b;
                oq5Var.d0();
                if (oq5Var.O) {
                }
                g0g.U(oq5Var, d322, wp5.f);
                g0g.U(oq5Var, l222, wp5.e);
                kb5 kb5Var22 = wp5.g;
                if (!oq5Var.O) {
                }
                ouj.x(i8, oq5Var, i8, kb5Var22);
                g0g.U(oq5Var, H22, wp5.d);
                if (teVar == null) {
                }
                oq5Var.p(z);
                oq5Var.p(true);
                d85 d85Var522 = d85Var3;
                f5 = f4;
                function04 = function03;
                d85Var4 = d85Var522;
                r2 = oq5Var.r();
                if (r2 == null) {
                }
            }
            f3 = f2;
            if ((196608 & i2) == 0) {
            }
            i6 = i3 & 64;
            if (i6 != 0) {
            }
            d85Var2 = d85Var;
            if ((599187 & i4) == 599186) {
            }
            oq5Var.U();
            i7 = i2 & 1;
            kjn kjnVar22 = gq5.a;
            if (i7 != 0) {
            }
            if (i9 != 0) {
            }
            if (i5 != 0) {
            }
            if (i6 != 0) {
            }
            f4 = f3;
            d85Var3 = d85Var2;
            oq5Var.q();
            yci d2222 = d.d(d.g(androidx.compose.ui.platform.a.a(yciVar, "block_branded_buttons"), f4, 0.0f, 2), 1.0f);
            kfh d3222 = ug3.d(b2c.f, false);
            i8 = oq5Var.P;
            a l2222 = oq5Var.l();
            yci H222 = vnj.H(oq5Var, d2222);
            xp5.T.getClass();
            grb grbVar222 = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
            }
            g0g.U(oq5Var, d3222, wp5.f);
            g0g.U(oq5Var, l2222, wp5.e);
            kb5 kb5Var222 = wp5.g;
            if (!oq5Var.O) {
            }
            ouj.x(i8, oq5Var, i8, kb5Var222);
            g0g.U(oq5Var, H222, wp5.d);
            if (teVar == null) {
            }
            oq5Var.p(z);
            oq5Var.p(true);
            d85 d85Var5222 = d85Var3;
            f5 = f4;
            function04 = function03;
            d85Var4 = d85Var5222;
            r2 = oq5Var.r();
            if (r2 == null) {
            }
        }
        function03 = function02;
        i5 = i3 & 16;
        if (i5 == 0) {
        }
        f3 = f2;
        if ((196608 & i2) == 0) {
        }
        i6 = i3 & 64;
        if (i6 != 0) {
        }
        d85Var2 = d85Var;
        if ((599187 & i4) == 599186) {
        }
        oq5Var.U();
        i7 = i2 & 1;
        kjn kjnVar222 = gq5.a;
        if (i7 != 0) {
        }
        if (i9 != 0) {
        }
        if (i5 != 0) {
        }
        if (i6 != 0) {
        }
        f4 = f3;
        d85Var3 = d85Var2;
        oq5Var.q();
        yci d22222 = d.d(d.g(androidx.compose.ui.platform.a.a(yciVar, "block_branded_buttons"), f4, 0.0f, 2), 1.0f);
        kfh d32222 = ug3.d(b2c.f, false);
        i8 = oq5Var.P;
        a l22222 = oq5Var.l();
        yci H2222 = vnj.H(oq5Var, d22222);
        xp5.T.getClass();
        grb grbVar2222 = wp5.b;
        oq5Var.d0();
        if (oq5Var.O) {
        }
        g0g.U(oq5Var, d32222, wp5.f);
        g0g.U(oq5Var, l22222, wp5.e);
        kb5 kb5Var2222 = wp5.g;
        if (!oq5Var.O) {
        }
        ouj.x(i8, oq5Var, i8, kb5Var2222);
        g0g.U(oq5Var, H2222, wp5.d);
        if (teVar == null) {
        }
        oq5Var.p(z);
        oq5Var.p(true);
        d85 d85Var52222 = d85Var3;
        f5 = f4;
        function04 = function03;
        d85Var4 = d85Var52222;
        r2 = oq5Var.r();
        if (r2 == null) {
        }
    }

    public static final void e0(String str, List list, mhb mhbVar, Object obj, boolean z) {
        str.getClass();
        list.getClass();
        obj.getClass();
        g0(PListParser.TAG_ARRAY, str, list, "Incorrect value type: expected " + mhbVar.a + ", got " + (!obj.equals(JSONObject.NULL) ? !(obj instanceof Number) ? !(obj instanceof JSONObject) ? obj instanceof JSONArray ? "Array" : obj.getClass().getSimpleName() : "Dict" : "Number" : "Null") + '.', z);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void f(xbb xbbVar, pwu pwuVar, Function0 function0, hq5 hq5Var, int i2, int i3) {
        int i4;
        Function0 function02;
        int i5;
        kb5 kb5Var;
        int i6;
        q91 q91Var;
        kb5 kb5Var2;
        oq5 oq5Var;
        kb5 kb5Var3;
        kb5 kb5Var4;
        boolean z;
        int i7;
        iz2 iz2Var;
        Function0 function03;
        klu kluVar;
        boolean z2;
        Function0 function04;
        xmn r2;
        xbbVar.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-663695824);
        if ((i2 & 6) == 0) {
            i4 = ((i2 & 8) == 0 ? oq5Var2.f(xbbVar) : oq5Var2.h(xbbVar) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= oq5Var2.h(pwuVar) ? 32 : 16;
        }
        int i8 = i2 & 384;
        vci vciVar = vci.a;
        if (i8 == 0) {
            i4 |= oq5Var2.f(vciVar) ? 256 : 128;
        }
        int i9 = i3 & 8;
        if (i9 != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            function02 = function0;
            i4 |= oq5Var2.h(function02) ? 2048 : 1024;
            if ((i4 & 1171) == 1170 || !oq5Var2.z()) {
                Function0 function05 = i9 == 0 ? null : function02;
                float f2 = 8;
                yci n2 = androidx.compose.foundation.layout.a.n(d.d(vciVar, 1.0f), 16, f2);
                nho a2 = lho.a(qx0.e, b2c.k, oq5Var2, 54);
                i5 = oq5Var2.P;
                a l2 = oq5Var2.l();
                yci H = vnj.H(oq5Var2, n2);
                xp5.T.getClass();
                grb grbVar = wp5.b;
                oq5Var2.d0();
                if (oq5Var2.O) {
                    oq5Var2.n0();
                } else {
                    oq5Var2.k(grbVar);
                }
                kb5 kb5Var5 = wp5.f;
                g0g.U(oq5Var2, a2, kb5Var5);
                kb5 kb5Var6 = wp5.e;
                g0g.U(oq5Var2, l2, kb5Var6);
                kb5Var = wp5.g;
                if (!oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i5))) {
                    ouj.x(i5, oq5Var2, i5, kb5Var);
                }
                kb5 kb5Var7 = wp5.d;
                g0g.U(oq5Var2, H, kb5Var7);
                qho qhoVar = qho.a;
                yci a3 = qhoVar.a(1.0f, vciVar, true);
                iz2 iz2Var2 = b2c.c;
                kfh d2 = ug3.d(iz2Var2, false);
                i6 = oq5Var2.P;
                Function0 function06 = function05;
                a l3 = oq5Var2.l();
                yci H2 = vnj.H(oq5Var2, a3);
                oq5Var2.d0();
                if (oq5Var2.O) {
                    oq5Var2.n0();
                } else {
                    oq5Var2.k(grbVar);
                }
                g0g.U(oq5Var2, d2, kb5Var5);
                g0g.U(oq5Var2, l3, kb5Var6);
                if (!oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i6))) {
                    ouj.x(i6, oq5Var2, i6, kb5Var);
                }
                g0g.U(oq5Var2, H2, kb5Var7);
                q91Var = xbbVar.g;
                kjn kjnVar = gq5.a;
                if (q91Var == null) {
                    oq5Var2.Z(-575598606);
                    String str = xbbVar.c;
                    Object K = oq5Var2.K();
                    if (K == kjnVar) {
                        K = new dcb(0);
                        oq5Var2.k0(K);
                    }
                    nt0.g(q91Var, nfp.b(vciVar, true, (Function1) K), str, oq5Var2, 0);
                    oq5Var2.p(false);
                    i7 = i4;
                    kb5Var2 = kb5Var6;
                    kb5Var3 = kb5Var;
                    kb5Var4 = kb5Var7;
                    iz2Var = iz2Var2;
                    z = false;
                    oq5Var = oq5Var2;
                    function03 = function06;
                } else {
                    oq5Var2.Z(-575345925);
                    kb5Var2 = kb5Var6;
                    rab rabVar = xbbVar.e;
                    Object K2 = oq5Var2.K();
                    if (K2 == kjnVar) {
                        K2 = new dcb(1);
                        oq5Var2.k0(K2);
                    }
                    oq5Var = oq5Var2;
                    int i10 = i4 & 7168;
                    kb5Var3 = kb5Var;
                    kb5Var4 = kb5Var7;
                    z = false;
                    i7 = i4;
                    iz2Var = iz2Var2;
                    tt0.a(rabVar, nfp.b(vciVar, true, (Function1) K2), xbbVar.h, function06, oq5Var, i10);
                    function03 = function06;
                    oq5Var.p(false);
                }
                oq5Var.p(true);
                kluVar = xbbVar.f;
                if (kluVar == null) {
                    oq5Var.Z(-1363374533);
                    u1g.l(oq5Var, d.r(vciVar, f2));
                    yci a4 = qhoVar.a(1.0f, vciVar, true);
                    kfh d3 = ug3.d(iz2Var, z);
                    int i11 = oq5Var.P;
                    a l4 = oq5Var.l();
                    yci H3 = vnj.H(oq5Var, a4);
                    oq5Var.d0();
                    if (oq5Var.O) {
                        oq5Var.k(grbVar);
                    } else {
                        oq5Var.n0();
                    }
                    g0g.U(oq5Var, d3, kb5Var5);
                    g0g.U(oq5Var, l4, kb5Var2);
                    if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i11))) {
                        ouj.x(i11, oq5Var, i11, kb5Var3);
                    }
                    g0g.U(oq5Var, H3, kb5Var4);
                    oq5 oq5Var3 = oq5Var;
                    y1g.f(kluVar, pwuVar, null, null, null, oq5Var3, (i7 & 112) | 24576);
                    oq5Var = oq5Var3;
                    z2 = true;
                    oq5Var.p(true);
                    oq5Var.p(z);
                } else {
                    z2 = true;
                    oq5Var.Z(-1362948624);
                    u1g.l(oq5Var, qhoVar.a(1.0f, vciVar, true));
                    oq5Var.p(z);
                }
                oq5Var.p(z2);
                function04 = function03;
            } else {
                oq5Var2.S();
                function04 = function02;
                oq5Var = oq5Var2;
            }
            r2 = oq5Var.r();
            if (r2 == null) {
                r2.d = new lx(xbbVar, pwuVar, function04, i2, i3);
                return;
            }
            return;
        }
        function02 = function0;
        if ((i4 & 1171) == 1170) {
        }
        if (i9 == 0) {
        }
        float f22 = 8;
        yci n22 = androidx.compose.foundation.layout.a.n(d.d(vciVar, 1.0f), 16, f22);
        nho a22 = lho.a(qx0.e, b2c.k, oq5Var2, 54);
        i5 = oq5Var2.P;
        a l22 = oq5Var2.l();
        yci H4 = vnj.H(oq5Var2, n22);
        xp5.T.getClass();
        grb grbVar2 = wp5.b;
        oq5Var2.d0();
        if (oq5Var2.O) {
        }
        kb5 kb5Var52 = wp5.f;
        g0g.U(oq5Var2, a22, kb5Var52);
        kb5 kb5Var62 = wp5.e;
        g0g.U(oq5Var2, l22, kb5Var62);
        kb5Var = wp5.g;
        if (!oq5Var2.O) {
        }
        ouj.x(i5, oq5Var2, i5, kb5Var);
        kb5 kb5Var72 = wp5.d;
        g0g.U(oq5Var2, H4, kb5Var72);
        qho qhoVar2 = qho.a;
        yci a32 = qhoVar2.a(1.0f, vciVar, true);
        iz2 iz2Var22 = b2c.c;
        kfh d22 = ug3.d(iz2Var22, false);
        i6 = oq5Var2.P;
        Function0 function062 = function05;
        a l32 = oq5Var2.l();
        yci H22 = vnj.H(oq5Var2, a32);
        oq5Var2.d0();
        if (oq5Var2.O) {
        }
        g0g.U(oq5Var2, d22, kb5Var52);
        g0g.U(oq5Var2, l32, kb5Var62);
        if (!oq5Var2.O) {
        }
        ouj.x(i6, oq5Var2, i6, kb5Var);
        g0g.U(oq5Var2, H22, kb5Var72);
        q91Var = xbbVar.g;
        kjn kjnVar2 = gq5.a;
        if (q91Var == null) {
        }
        oq5Var.p(true);
        kluVar = xbbVar.f;
        if (kluVar == null) {
        }
        oq5Var.p(z2);
        function04 = function03;
        r2 = oq5Var.r();
        if (r2 == null) {
        }
    }

    public static final void f0(String str, String str2, List list) {
        str.getClass();
        list.getClass();
        g0(PListParser.TAG_DICT, str, list, str2, false);
        throw null;
    }

    public static final void g(int i2, mxo mxoVar, boolean z, Function0 function0, Function0 function02, yci yciVar, Function0 function03, Function0 function04, wn5 wn5Var, hq5 hq5Var, int i3, int i4) {
        Function0 function05;
        int i5;
        oq5 oq5Var;
        Function0 function06;
        mxoVar.getClass();
        function0.getClass();
        function02.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(741786758);
        int i6 = i3 | (oq5Var2.d(i2) ? 4 : 2) | (oq5Var2.h(mxoVar) ? 32 : 16) | (oq5Var2.g(z) ? 256 : 128) | (oq5Var2.h(function0) ? 2048 : 1024) | (oq5Var2.h(function02) ? 16384 : RemoteCameraConfig.Notification.ID) | (oq5Var2.h(function03) ? 1048576 : 524288);
        int i7 = i4 & 128;
        if (i7 != 0) {
            i5 = i6 | 12582912;
            function05 = function04;
        } else {
            function05 = function04;
            i5 = i6 | (oq5Var2.h(function05) ? 8388608 : RemoteCameraConfig.Camera.BITRATE);
        }
        if (oq5Var2.P(i5 & 1, (38347923 & i5) != 38347922)) {
            Function0 function07 = i7 != 0 ? null : function05;
            oq5Var = oq5Var2;
            d(rvf.M(i2, oq5Var2), mxoVar, yciVar, ghh.C(zs4.g(oq5Var2), ogp.A(oq5Var2)), function02, ild.C(-737938428, new gja(function07, function03, 1), oq5Var2), false, false, null, null, null, ild.C(-1164173124, new qt(z, function0, wn5Var, 8), oq5Var2), oq5Var, (i5 & 112) | 196992 | (i5 & 57344), 48, 1984);
            function06 = function07;
        } else {
            oq5Var = oq5Var2;
            oq5Var.S();
            function06 = function05;
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new mgf(i2, mxoVar, z, function0, function02, yciVar, function03, function06, wn5Var, i3, i4);
        }
    }

    public static final void g0(String str, String str2, List list, String str3, boolean z) {
        str2.getClass();
        list.getClass();
        ghh.I(CollectionsKt.X(list.subList(1, list.size()), null, hrg.l('(', str2, z ? "" : hrg.q("<", str, ">, ")), ")", d5.B0, 25), str3, null);
        throw null;
    }

    public static final void h(int i2, hq5 hq5Var, yci yciVar, Function0 function0, boolean z) {
        yci yciVar2;
        function0.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(2109535788);
        int i3 = (oq5Var.h(function0) ? 4 : 2) | i2 | (oq5Var.g(z) ? 32 : 16) | 384;
        if (oq5Var.P(i3 & 1, (i3 & 147) != 146)) {
            vci vciVar = vci.a;
            a0g.n(function0, androidx.compose.ui.platform.a.a(androidx.compose.foundation.layout.a.m(d.m(vciVar, 48), 8), "playback_button"), false, false, false, 0.0f, ild.C(212121924, new xu0(4, z), oq5Var), oq5Var, (i3 & 14) | ScreenMirroringConfig.Video.BITRATE_1_5MB, 60);
            yciVar2 = vciVar;
        } else {
            oq5Var.S();
            yciVar2 = yciVar;
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new tm(function0, z, yciVar2, i2, 2);
        }
    }

    public static final void h0(String str, String str2, List list, boolean z) {
        str.getClass();
        list.getClass();
        ghh.I(CollectionsKt.X(list.subList(1, list.size()), null, hrg.l('(', str, z ? "" : "<dict>, "), ")", e27.G, 25), str2, null);
        throw null;
    }

    public static final void i(final ik ikVar, final Function2 function2, final Function0 function0, final Function1 function1, final Function2 function22, final pyc pycVar, opv opvVar, long j2, long j3, float f2, hq5 hq5Var, final int i2) {
        opv a2;
        long j4;
        long j5;
        int i3;
        float E;
        final float f3;
        final long j6;
        final long j7;
        final opv opvVar2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-2011523859);
        int i4 = i2 | (oq5Var.f(ikVar) ? 4 : 2) | (oq5Var.h(function2) ? 32 : 16) | (oq5Var.h(function0) ? 256 : 128) | (oq5Var.h(function1) ? 2048 : 1024) | (oq5Var.h(function22) ? 16384 : RemoteCameraConfig.Notification.ID) | (oq5Var.h(pycVar) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX) | 306708480;
        if ((306783379 & i4) == 306783378 && oq5Var.z()) {
            oq5Var.S();
            opvVar2 = opvVar;
            j7 = j2;
            j6 = j3;
            f3 = f2;
        } else {
            oq5Var.U();
            if ((i2 & 1) == 0 || oq5Var.y()) {
                a2 = mp0.a(oq5Var);
                long a3 = svd.a(oq5Var);
                j4 = ((dq0) oq5Var.j(eq0.a)).b.a;
                j5 = a3;
                i3 = i4 & (-2146959361);
                E = u7g.E(R.dimen.elevation_toolbar, oq5Var);
            } else {
                oq5Var.S();
                a2 = opvVar;
                j5 = j2;
                j4 = j3;
                i3 = i4 & (-2146959361);
                E = f2;
            }
            oq5Var.q();
            jx7 jx7Var = (jx7) oq5Var.j(es5.h);
            jzk jzkVar = vnj.i;
            yci g2 = d.g(androidx.compose.ui.platform.a.a(vci.a, "top_app_bar"), 56, 0.0f, 2);
            boolean f4 = oq5Var.f(jx7Var) | ((i3 & 7168) == 2048);
            Object K = oq5Var.K();
            if (f4 || K == gq5.a) {
                K = new kc(29, jx7Var, function1);
                oq5Var.k0(K);
            }
            opv opvVar3 = a2;
            long j8 = j5;
            f3 = E;
            long j9 = j4;
            q5g.k(androidx.compose.ui.layout.a.f(g2, (Function1) K), jzkVar, j8, j9, null, f3, ild.C(-416398543, new ut2(opvVar3, function22, function0, ikVar, function2, pycVar, 0), oq5Var), oq5Var, 1572912, 16);
            j6 = j9;
            j7 = j8;
            opvVar2 = opvVar3;
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new Function2(function2, function0, function1, function22, pycVar, opvVar2, j7, j6, f3, i2) { // from class: vt2
                public final /* synthetic */ Function2 b;
                public final /* synthetic */ Function0 c;
                public final /* synthetic */ Function1 d;
                public final /* synthetic */ Function2 e;
                public final /* synthetic */ pyc f;
                public final /* synthetic */ opv g;
                public final /* synthetic */ long h;
                public final /* synthetic */ long i;
                public final /* synthetic */ float j;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    xp3.i(ik.this, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, (hq5) obj, rvf.R(1));
                    return Unit.a;
                }
            };
        }
    }

    public static final void i0(String str, List list, mhb mhbVar, Object obj, boolean z) {
        str.getClass();
        list.getClass();
        mhbVar.getClass();
        obj.getClass();
        h0(str, "Incorrect value type: expected " + mhbVar.a + ", got " + (!obj.equals(JSONObject.NULL) ? !(obj instanceof Number) ? !(obj instanceof JSONObject) ? obj instanceof JSONArray ? "Array" : obj.getClass().getSimpleName() : "Dict" : "Number" : "Null") + '.', list, z);
        throw null;
    }

    public static final int j(int i2, eqi eqiVar) {
        int i3 = eqiVar.c - 1;
        int i4 = 0;
        while (i4 < i3) {
            int b2 = ouj.b(i3, i4, 2, i4);
            Object[] objArr = eqiVar.a;
            int i5 = ((dxe) objArr[b2]).a;
            if (i5 != i2) {
                if (i5 < i2) {
                    i4 = b2 + 1;
                    if (i2 < ((dxe) objArr[i4]).a) {
                    }
                } else {
                    i3 = b2 - 1;
                }
            }
            return b2;
        }
        return i4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /* JADX WARN: Type inference failed for: r0v27, types: [kotlin.jvm.functions.Function0] */
    /* JADX WARN: Type inference failed for: r3v12, types: [kotlin.jvm.functions.Function0] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object j0(unl unlVar, hgp hgpVar, g4d g4dVar, htb htbVar, cg6 cg6Var) {
        bk6 bk6Var;
        int i2;
        unl unlVar2;
        hgp hgpVar2;
        htb htbVar2;
        Function1 function1;
        m1q m1qVar;
        m1q m1qVar2;
        Pair pair;
        m1q m1qVar3;
        int i3;
        Object k0;
        m1q m1qVar4;
        hgp hgpVar3;
        if (cg6Var instanceof bk6) {
            bk6Var = (bk6) cg6Var;
            int i4 = bk6Var.r;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                bk6Var.r = i4 - Integer.MIN_VALUE;
                bk6 bk6Var2 = bk6Var;
                Object obj = bk6Var2.q;
                nm6 nm6Var = nm6.a;
                i2 = bk6Var2.r;
                if (i2 != 0) {
                    qgg.h0(obj);
                    if (unlVar == null) {
                        return t1q.h;
                    }
                    bk6Var2.j = unlVar;
                    bk6Var2.k = hgpVar;
                    bk6Var2.l = g4dVar;
                    bk6Var2.m = htbVar;
                    bk6Var2.r = 1;
                    Object k02 = k0(unlVar, g4dVar, htbVar, hgpVar, 0, true, bk6Var2);
                    if (k02 != nm6Var) {
                        unlVar2 = unlVar;
                        hgpVar2 = hgpVar;
                        htbVar2 = htbVar;
                        obj = k02;
                        function1 = g4dVar;
                    }
                    return nm6Var;
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        m1qVar4 = bk6Var2.o;
                        m1qVar3 = bk6Var2.n;
                        Function0 function0 = bk6Var2.m;
                        Function1 function12 = bk6Var2.l;
                        hgpVar3 = bk6Var2.k;
                        qgg.h0(obj);
                        pair = new Pair(m1qVar4, (m1q) (((m1q) obj).d().a.length() != 16 ? obj : null));
                        m1qVar2 = m1qVar3;
                        hgpVar2 = hgpVar3;
                        m1q m1qVar5 = (m1q) pair.a;
                        m1q m1qVar6 = (m1q) pair.b;
                        return new t1q((z3q) hgpVar2.c, m1qVar5, m1qVar2, m1qVar6, xz0.w(new m1q[]{m1qVar5, m1qVar2, m1qVar6}));
                    }
                    i3 = bk6Var2.p;
                    m1qVar3 = bk6Var2.n;
                    Function0 function02 = bk6Var2.m;
                    function1 = bk6Var2.l;
                    hgp hgpVar4 = bk6Var2.k;
                    unl unlVar3 = bk6Var2.j;
                    qgg.h0(obj);
                    htbVar2 = function02;
                    unlVar2 = unlVar3;
                    hgpVar2 = hgpVar4;
                    if (((m1q) obj).d().a.length() == 16) {
                        obj = null;
                    }
                    m1q m1qVar7 = (m1q) obj;
                    boolean z = i3 == 0;
                    bk6Var2.j = null;
                    bk6Var2.k = hgpVar2;
                    bk6Var2.l = null;
                    bk6Var2.m = null;
                    bk6Var2.n = m1qVar3;
                    bk6Var2.o = m1qVar7;
                    bk6Var2.p = i3;
                    bk6Var2.r = 3;
                    k0 = k0(unlVar2, function1, htbVar2, hgpVar2, 1, z, bk6Var2);
                    if (k0 != nm6Var) {
                        obj = k0;
                        m1qVar4 = m1qVar7;
                        hgpVar3 = hgpVar2;
                        pair = new Pair(m1qVar4, (m1q) (((m1q) obj).d().a.length() != 16 ? obj : null));
                        m1qVar2 = m1qVar3;
                        hgpVar2 = hgpVar3;
                        m1q m1qVar52 = (m1q) pair.a;
                        m1q m1qVar62 = (m1q) pair.b;
                        return new t1q((z3q) hgpVar2.c, m1qVar52, m1qVar2, m1qVar62, xz0.w(new m1q[]{m1qVar52, m1qVar2, m1qVar62}));
                    }
                    return nm6Var;
                }
                Function0 function03 = bk6Var2.m;
                Function1 function13 = bk6Var2.l;
                hgp hgpVar5 = bk6Var2.k;
                unl unlVar4 = bk6Var2.j;
                qgg.h0(obj);
                htbVar2 = function03;
                hgpVar2 = hgpVar5;
                unlVar2 = unlVar4;
                function1 = function13;
                m1qVar = (m1q) obj;
                if (m1qVar.d().h) {
                    m1qVar2 = m1qVar;
                    pair = new Pair(null, null);
                    m1q m1qVar522 = (m1q) pair.a;
                    m1q m1qVar622 = (m1q) pair.b;
                    return new t1q((z3q) hgpVar2.c, m1qVar522, m1qVar2, m1qVar622, xz0.w(new m1q[]{m1qVar522, m1qVar2, m1qVar622}));
                }
                ?? r8 = (((z3q) hgpVar2.c).e().b == rhd.c || ((z3q) hgpVar2.c).e().b == rhd.d) ? 1 : 0;
                bk6Var2.j = unlVar2;
                bk6Var2.k = hgpVar2;
                bk6Var2.l = function1;
                bk6Var2.m = htbVar2;
                bk6Var2.n = m1qVar;
                bk6Var2.p = r8;
                bk6Var2.r = 2;
                Object k03 = k0(unlVar2, function1, htbVar2, hgpVar2, -1, r8, bk6Var2);
                if (k03 != nm6Var) {
                    m1qVar3 = m1qVar;
                    obj = k03;
                    i3 = r8;
                    if (((m1q) obj).d().a.length() == 16) {
                    }
                    m1q m1qVar72 = (m1q) obj;
                    if (i3 == 0) {
                    }
                    bk6Var2.j = null;
                    bk6Var2.k = hgpVar2;
                    bk6Var2.l = null;
                    bk6Var2.m = null;
                    bk6Var2.n = m1qVar3;
                    bk6Var2.o = m1qVar72;
                    bk6Var2.p = i3;
                    bk6Var2.r = 3;
                    k0 = k0(unlVar2, function1, htbVar2, hgpVar2, 1, z, bk6Var2);
                    if (k0 != nm6Var) {
                    }
                }
                return nm6Var;
            }
        }
        bk6Var = new bk6(cg6Var);
        bk6 bk6Var22 = bk6Var;
        Object obj2 = bk6Var22.q;
        nm6 nm6Var2 = nm6.a;
        i2 = bk6Var22.r;
        if (i2 != 0) {
        }
        m1qVar = (m1q) obj2;
        if (m1qVar.d().h) {
        }
    }

    public static final boolean k(View view, View view2) {
        for (ViewParent parent = view2.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == view.getParent()) {
                return true;
            }
        }
        return false;
    }

    public static final Object k0(unl unlVar, Function1 function1, Function0 function0, hgp hgpVar, int i2, boolean z, bk6 bk6Var) {
        hgp hgpVar2;
        ckd K;
        if (i2 < 0) {
            hgpVar2 = hgpVar;
            K = K(unlVar.getEntityInfo(), hgpVar2, function1, function0, z, true);
        } else {
            hgpVar2 = hgpVar;
            K = i2 > 0 ? K(unlVar.getEntityInfo(), hgpVar2, function1, function0, z, false) : T(unlVar);
        }
        return hgpVar2.j(K, bk6Var);
    }

    public static final Rect l(toc tocVar, View view, View view2) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        view2.getLocationOnScreen(iArr2);
        dpc x = ff7.x(((uoc) tocVar).f);
        ynn y = x != null ? ff7.y(x) : null;
        if (y == null) {
            return null;
        }
        int i2 = (int) y.a;
        int i3 = iArr[0];
        int i4 = iArr2[0];
        int i5 = (int) y.b;
        int i6 = iArr[1];
        int i7 = iArr2[1];
        return new Rect((i2 + i3) - i4, (i5 + i6) - i7, (((int) y.c) + i3) - i4, (((int) y.d) + i6) - i7);
    }

    public static String l0(String str) {
        int i2;
        if (str.length() == 0 || (str.indexOf(92) < 0 && str.indexOf(34) < 0)) {
            return str.trim();
        }
        char[] charArray = str.toCharArray();
        StringBuffer stringBuffer = new StringBuffer(str.length());
        if (charArray[0] == '\\' && charArray[1] == '#') {
            stringBuffer.append("\\#");
            i2 = 2;
        } else {
            i2 = 0;
        }
        boolean z = false;
        int i3 = 0;
        boolean z2 = false;
        boolean z3 = false;
        char c2 = 0;
        while (i2 != charArray.length) {
            char c3 = charArray[i2];
            if (c3 != ' ') {
                z3 = true;
            }
            if (c3 != '\"') {
                if (c3 == '\\' && !z && !z2) {
                    i3 = stringBuffer.length();
                    z = true;
                } else if (c3 != ' ' || z || z3) {
                    if (!z || (('0' > c3 || c3 > '9') && (('a' > c3 || c3 > 'f') && ('A' > c3 || c3 > 'F')))) {
                        stringBuffer.append(c3);
                    } else if (c2 != 0) {
                        stringBuffer.append((char) (y(c3) + (y(c2) * 16)));
                        z = false;
                        c2 = 0;
                    } else {
                        c2 = c3;
                    }
                }
                i2++;
            } else if (z) {
                stringBuffer.append(c3);
            } else {
                z2 = !z2;
            }
            z = false;
            i2++;
        }
        if (stringBuffer.length() > 0) {
            while (stringBuffer.charAt(stringBuffer.length() - 1) == ' ' && i3 != stringBuffer.length() - 1) {
                stringBuffer.setLength(stringBuffer.length() - 1);
            }
        }
        return stringBuffer.toString();
    }

    public static final View m(xci xciVar) {
        oj0 oj0Var = bcx.F(xciVar.a).o;
        View interopView = oj0Var != null ? oj0Var.getInteropView() : null;
        if (interopView != null) {
            return interopView;
        }
        xq0.q("Could not fetch interop view");
        return null;
    }

    public static List m0(List list) {
        int s2 = wct.s();
        list.getClass();
        List<e24> list2 = list;
        ArrayList arrayList = new ArrayList(v75.o(list2, 10));
        for (e24 e24Var : list2) {
            String pathForSize = e24Var.b.a.getPathForSize(s2);
            pathForSize.getClass();
            qo6 qo6Var = e24Var.c;
            Integer num = e24Var.d;
            arrayList.add(num == null ? new sgs(qo6Var, pathForSize) : new tgs(pathForSize, qo6Var, c3x.f(num.intValue())));
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (hashSet.add(((ugs) next).getUrl())) {
                arrayList2.add(next);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            Object next2 = it2.next();
            if (!StringsKt.U(((ugs) next2).getUrl())) {
                arrayList3.add(next2);
            }
        }
        return CollectionsKt.q0(arrayList3, 3);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|23|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object n(Function0 function0, Function2 function2, cg6 cg6Var) {
        g90 g90Var;
        int i2;
        if (cg6Var instanceof g90) {
            g90Var = (g90) cg6Var;
            int i3 = g90Var.k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                g90Var.k = i3 - Integer.MIN_VALUE;
                Object obj = g90Var.j;
                nm6 nm6Var = nm6.a;
                i2 = g90Var.k;
                if (i2 != 0) {
                    qgg.h0(obj);
                    l90 l90Var = new l90(function0, function2, null, 1);
                    g90Var.k = 1;
                    if (gld.Q(l90Var, g90Var) == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i2 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            }
        }
        g90Var = new g90(cg6Var);
        Object obj2 = g90Var.j;
        nm6 nm6Var2 = nm6.a;
        i2 = g90Var.k;
        if (i2 != 0) {
        }
        return Unit.a;
    }

    public static final List n0(List list) {
        list.getClass();
        List list2 = list;
        ArrayList arrayList = new ArrayList(v75.o(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((e24) it.next()).a);
        }
        List w0 = CollectionsKt.w0(CollectionsKt.z0(arrayList));
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : w0) {
            if (!StringsKt.U((String) obj)) {
                arrayList2.add(obj);
            }
        }
        return CollectionsKt.q0(arrayList2, 3);
    }

    public static yci o(yci yciVar, ka0 ka0Var, bxj bxjVar, boolean z, boolean z2, int i2) {
        boolean z3 = (i2 & 8) != 0 ? false : z2;
        return zoa.a(yciVar, ka0Var.f, bxjVar, z, null, ka0Var.l.getValue() != null, null, new d90(ka0Var, (Continuation) null, 0), z3, 32);
    }

    public static String o0(d0 d0Var) {
        StringBuffer stringBuffer = new StringBuffer();
        int i2 = 0;
        if (!(d0Var instanceof y0) || (d0Var instanceof h07)) {
            try {
                stringBuffer.append('#');
                byte[] s2 = d0Var.n().s();
                jtc jtcVar = ixd.a;
                stringBuffer.append(fxf.B(ixd.a(s2.length, s2)));
            } catch (IOException unused) {
                xq0.x("Other value has no encoded form");
                return null;
            }
        } else {
            String o2 = ((y0) d0Var).o();
            if (o2.length() > 0 && o2.charAt(0) == '#') {
                stringBuffer.append('\\');
            }
            stringBuffer.append(o2);
        }
        int length = stringBuffer.length();
        int i3 = (stringBuffer.length() >= 2 && stringBuffer.charAt(0) == '\\' && stringBuffer.charAt(1) == '#') ? 2 : 0;
        while (i3 != length) {
            char charAt = stringBuffer.charAt(i3);
            if (charAt != '\"' && charAt != '\\' && charAt != '+' && charAt != ',') {
                switch (charAt) {
                    case ';':
                    case ScreenMirroringConfig.Video.FRAMERATE /* 60 */:
                    case '=':
                    case '>':
                        break;
                    default:
                        i3++;
                        break;
                }
            }
            stringBuffer.insert(i3, "\\");
            i3 += 2;
            length++;
        }
        if (stringBuffer.length() > 0) {
            while (stringBuffer.length() > i2 && stringBuffer.charAt(i2) == ' ') {
                stringBuffer.insert(i2, "\\");
                i2 += 2;
            }
        }
        for (int length2 = stringBuffer.length() - 1; length2 >= i2 && stringBuffer.charAt(length2) == ' '; length2--) {
            stringBuffer.insert(length2, '\\');
        }
        return stringBuffer.toString();
    }

    public static final Object p(ka0 ka0Var, Object obj, float f2, cg6 cg6Var) {
        Object b2 = ka0Var.b(obj, hqi.a, new e90(ka0Var, f2, null, 1), cg6Var);
        return b2 == nm6.a ? b2 : Unit.a;
    }

    public static void q(StringBuffer stringBuffer, vu1 vu1Var, Hashtable hashtable) {
        String str = (String) hashtable.get(vu1Var.a);
        if (str != null) {
            stringBuffer.append(str);
        } else {
            stringBuffer.append(vu1Var.a.a);
        }
        stringBuffer.append('=');
        stringBuffer.append(o0(vu1Var.b));
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x008f, code lost:
    
        if (r7 >= r0) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String r(d0 d0Var) {
        String o0 = o0(d0Var);
        if (o0.length() > 0 && o0.charAt(0) == '#') {
            try {
                try {
                    Object y = s0.y(ixd.a.u(o0.length() - 1, o0));
                    if (y instanceof y0) {
                        o0 = ((y0) y).o();
                    }
                } catch (Exception e2) {
                    q0 q0Var = new q0("exception decoding Hex string: " + e2.getMessage(), 1);
                    q0Var.b = e2;
                    throw q0Var;
                }
            } catch (IOException e3) {
                b6e.u(e3, "unknown encoding in name: ");
                return null;
            }
        }
        String a0 = fxf.a0(o0);
        int length = a0.length();
        if (length < 2) {
            return a0;
        }
        int i2 = length - 1;
        int i3 = 0;
        while (i3 < i2 && a0.charAt(i3) == '\\' && a0.charAt(i3 + 1) == ' ') {
            i3 += 2;
        }
        int i4 = i3 + 1;
        int i5 = i2;
        while (i5 > i4 && a0.charAt(i5 - 1) == '\\' && a0.charAt(i5) == ' ') {
            i5 -= 2;
        }
        a0 = a0.substring(i3, i5 + 1);
        if (a0.indexOf("  ") < 0) {
            return a0;
        }
        StringBuffer stringBuffer = new StringBuffer();
        char charAt = a0.charAt(0);
        stringBuffer.append(charAt);
        for (int i6 = 1; i6 < a0.length(); i6++) {
            char charAt2 = a0.charAt(i6);
            if (charAt != ' ' || charAt2 != ' ') {
                stringBuffer.append(charAt2);
                charAt = charAt2;
            }
        }
        return stringBuffer.toString();
    }

    public static final void s(String str, List list, boolean z) {
        Object obj = list.get(0);
        obj.getClass();
        int length = ((JSONArray) obj).length();
        Object obj2 = list.get(1);
        obj2.getClass();
        long longValue = ((Long) obj2).longValue();
        if (longValue < length) {
            return;
        }
        str.getClass();
        g0(PListParser.TAG_ARRAY, str, list, "Requested index (" + longValue + ") out of bounds array size (" + length + ").", z);
        throw null;
    }

    public static int t(int i2) {
        int i3 = (i2 & (~(i2 >> 31))) - 255;
        return (i3 & (i3 >> 31)) + KotlinVersion.MAX_COMPONENT_VALUE;
    }

    public static final yci u(yci yciVar, dup dupVar) {
        return androidx.compose.ui.graphics.a.b(yciVar, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, dupVar, true, 124927);
    }

    public static final yci v(yci yciVar) {
        return androidx.compose.ui.graphics.a.b(yciVar, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, true, 126975);
    }

    public static final fcc w(rw5 rw5Var, boolean z) {
        rw5Var.getClass();
        if (!z) {
            return null;
        }
        rx5 rx5Var = (rx5) rw5Var.f.getValue();
        if (!(rx5Var instanceof ox5)) {
            return null;
        }
        pkb pkbVar = pkb.Audiobook;
        String valueOf = String.valueOf(((ox5) rx5Var).a.a);
        valueOf.getClass();
        return new fcc(SSDPDeviceDescriptionParser.TAG_LOCATION, valueOf, 1);
    }

    public static ArrayList x(AbstractList abstractList, HttpURLConnection httpURLConnection, c3c c3cVar) {
        abstractList.getClass();
        ArrayList arrayList = new ArrayList(v75.o(abstractList, 10));
        Iterator it = abstractList.iterator();
        while (it.hasNext()) {
            arrayList.add(new rod((ood) it.next(), httpURLConnection, new g3c(c3cVar)));
        }
        return arrayList;
    }

    public static int y(char c2) {
        return ('0' > c2 || c2 > '9') ? ('a' > c2 || c2 > 'f') ? c2 - '7' : c2 - 'W' : c2 - '0';
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static rod z(ood oodVar, HttpURLConnection httpURLConnection, Object obj, Object obj2) {
        g3c g3cVar;
        ja jaVar;
        ja jaVar2;
        boolean z;
        int optInt;
        int optInt2;
        String str;
        boolean z2;
        String str2;
        String str3;
        String str4;
        int i2;
        boolean z3;
        Object obj3 = obj;
        ehv ehvVar = gs4.i;
        if (obj3 instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) obj3;
            if (jSONObject.has("code")) {
                int i3 = jSONObject.getInt("code");
                Object w = gvt.w(jSONObject, "body", "FACEBOOK_NON_JSON_RESULT");
                if (w != null && (w instanceof JSONObject)) {
                    if (((JSONObject) w).has("error")) {
                        JSONObject jSONObject2 = (JSONObject) gvt.w((JSONObject) w, "error", null);
                        String optString = jSONObject2 != null ? jSONObject2.optString("type", null) : null;
                        String optString2 = jSONObject2 != null ? jSONObject2.optString(Constants.KEY_MESSAGE, null) : null;
                        int optInt3 = jSONObject2 != null ? jSONObject2.optInt("code", -1) : -1;
                        int optInt4 = jSONObject2 != null ? jSONObject2.optInt("error_subcode", -1) : -1;
                        String optString3 = jSONObject2 != null ? jSONObject2.optString("error_user_msg", null) : null;
                        String optString4 = jSONObject2 != null ? jSONObject2.optString("error_user_title", null) : null;
                        if (jSONObject2 != null) {
                            i2 = optInt4;
                            z3 = jSONObject2.optBoolean("is_transient", false);
                        } else {
                            i2 = optInt4;
                            z3 = false;
                        }
                        z2 = z3;
                        str = optString;
                        str4 = optString3;
                        str3 = optString4;
                        optInt2 = i2;
                        z = true;
                        optInt = optInt3;
                        str2 = optString2;
                    } else {
                        z = false;
                        if (!((JSONObject) w).has("error_code") && !((JSONObject) w).has("error_msg") && !((JSONObject) w).has("error_reason")) {
                            optInt = -1;
                            optInt2 = -1;
                            z2 = false;
                            str = null;
                            str2 = null;
                            str3 = null;
                            str4 = null;
                        }
                        String optString5 = ((JSONObject) w).optString("error_reason", null);
                        String optString6 = ((JSONObject) w).optString("error_msg", null);
                        optInt = ((JSONObject) w).optInt("error_code", -1);
                        optInt2 = ((JSONObject) w).optInt("error_subcode", -1);
                        str = optString5;
                        z2 = false;
                        str2 = optString6;
                        z = true;
                        str3 = null;
                        str4 = null;
                    }
                    if (z) {
                        g3cVar = new g3c(i3, optInt, optInt2, str, str2, str3, str4, obj2, null, z2);
                        if (g3cVar != null) {
                            Log.e("rod", g3cVar.toString());
                            if (g3cVar.d == 190 && (jaVar = oodVar.a) != null) {
                                Date date = ja.l;
                                if (jaVar.equals(n7w.N())) {
                                    if (g3cVar.e != 493) {
                                        ehvVar.o().V(null, true);
                                    } else {
                                        ja N = n7w.N();
                                        if (N != null && !new Date().after(N.a) && (jaVar2 = (ja) ehvVar.o().a) != null) {
                                            ehvVar.o().V(new ja(jaVar2.e, jaVar2.h, jaVar2.i, jaVar2.b, jaVar2.c, jaVar2.d, jaVar2.f, new Date(), new Date(), jaVar2.j), true);
                                        }
                                    }
                                }
                            }
                            return new rod(oodVar, httpURLConnection, g3cVar);
                        }
                        Object w2 = gvt.w(jSONObject, "body", "FACEBOOK_NON_JSON_RESULT");
                        if (w2 instanceof JSONObject) {
                            return new rod(oodVar, httpURLConnection, w2.toString(), (JSONObject) w2);
                        }
                        if (w2 instanceof JSONArray) {
                            String obj4 = w2.toString();
                            oodVar.getClass();
                            obj4.getClass();
                            return new rod(oodVar, httpURLConnection, null, (JSONArray) w2, null);
                        }
                        obj3 = JSONObject.NULL;
                        obj3.getClass();
                    }
                }
                if (200 <= i3 && 299 >= i3) {
                }
                if (jSONObject.has("body")) {
                }
                g3cVar = new g3c(i3, -1, -1, null, null, null, null, obj2, null, false);
                if (g3cVar != null) {
                }
            }
            g3cVar = null;
            if (g3cVar != null) {
            }
        }
        if (obj3 == JSONObject.NULL) {
            return new rod(oodVar, httpURLConnection, obj3.toString(), null);
        }
        throw new c3c("Got unexpected object type in response, class: ".concat(obj3.getClass().getSimpleName()));
    }
}
