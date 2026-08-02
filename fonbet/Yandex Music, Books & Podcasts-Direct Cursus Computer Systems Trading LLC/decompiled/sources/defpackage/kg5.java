package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Build;
import android.os.Debug;
import android.util.Log;
import android.view.View;
import androidx.compose.foundation.e;
import androidx.compose.foundation.layout.d;
import androidx.compose.material.MinimumInteractiveModifier;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.yandex.music.core.ui.compose.b;
import com.yandex.music.shared.backend_utils.MusicBackendInvocationError;
import com.yandex.music.shared.dto.account.AccountAboutDto;
import com.yandex.music.shared.network.repositories.api.EmptyAccountException;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.RandomAccess;
import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.a;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import org.json.JSONArray;
import org.json.JSONObject;
import retrofit2.Call;
import ru.yandex.music.R;
import ru.yandex.music.catalog.artist.ArtistItemsActivity;
import ru.yandex.music.data.stores.CoverPath;
import ru.yandex.music.data.stores.WebPath$Storage;

/* loaded from: classes3.dex */
public abstract class kg5 {
    public static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final char[] b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final wn5 c = new wn5(new h3(28), 1054384780, false);
    public static final wn5 d = new wn5(new fo5(0), -556688839, false);
    public static final wn5 e;
    public static final wn5 f;
    public static final wn5 g;
    public static final os2 h;
    public static final ns9 i;
    public static final fq4 j;
    public static int k = 16777214;

    static {
        new wn5(new fo5(1), 148563222, false);
        int i2 = 11;
        e = new wn5(new rz3(i2), 2095604210, false);
        int i3 = 10;
        new wn5(new lo5(i3), -330569546, false);
        f = new wn5(new po5(24), 54549878, false);
        g = new wn5(new wo5(i2), 1681177595, false);
        new wn5(new wo5(12), -1076321770, false);
        new wn5(new wo5(13), 1648884084, false);
        h = new os2(i3);
        i = new ns9(20);
        j = new fq4(0.0f, 1.0f);
    }

    public static boolean A() {
        if (Build.PRODUCT.contains("sdk")) {
            return true;
        }
        String str = Build.HARDWARE;
        return str.contains("goldfish") || str.contains("ranchu");
    }

    public static boolean B() {
        return ((Boolean) c2e.e.getValue()).booleanValue();
    }

    public static boolean C() {
        boolean A = A();
        String str = Build.TAGS;
        if ((A || str == null || !str.contains("test-keys")) && !new File("/system/app/Superuser.apk").exists()) {
            return !A && new File("/system/xbin/su").exists();
        }
        return true;
    }

    public static hx3 D(String str) {
        str.getClass();
        String X = CollectionsKt.X(up6.P(str, StringUtil.SPACE), "", null, null, null, 62);
        if (X.length() == 0) {
            return hx3.UNKNOWN;
        }
        if (StringsKt.r0(10, X) == null) {
            return hx3.UNKNOWN;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = vx3.f;
        ArrayList j2 = u75.j(hx3.AmericanExpress, hx3.DinersClub, hx3.DiscoverCard, hx3.JCB, hx3.HUMO, hx3.Maestro, hx3.MasterCard, hx3.MIR, hx3.UnionPay, hx3.Uzcard, hx3.VISA, hx3.VISA_ELECTRON, hx3.UNKNOWN);
        ArrayList arrayList3 = new ArrayList();
        Iterator it = j2.iterator();
        while (it.hasNext()) {
            hx3 hx3Var = (hx3) it.next();
            ArrayList arrayList4 = vx3.f;
            arrayList3.add(gos.n(hx3Var, false));
        }
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            vx3 vx3Var = (vx3) it2.next();
            for (jx3 jx3Var : vx3Var.b) {
                String str2 = jx3Var.a;
                String str3 = jx3Var.b;
                if (str3 == null) {
                    str3 = str2;
                }
                int length = X.length();
                int length2 = str2.length();
                if (length >= length2) {
                    length = length2;
                }
                int length3 = X.length();
                int length4 = str3.length();
                if (length3 >= length4) {
                    length3 = length4;
                }
                Long r0 = StringsKt.r0(10, up6.S(0, Integer.valueOf(length), X));
                r0.getClass();
                long longValue = r0.longValue();
                Long r02 = StringsKt.r0(10, up6.S(0, Integer.valueOf(length), str2));
                r02.getClass();
                if (longValue >= r02.longValue()) {
                    Long r03 = StringsKt.r0(10, up6.S(0, Integer.valueOf(length3), X));
                    r03.getClass();
                    long longValue2 = r03.longValue();
                    Long r04 = StringsKt.r0(10, up6.S(0, Integer.valueOf(length3), str3));
                    r04.getClass();
                    if (longValue2 <= r04.longValue()) {
                        arrayList.add(vx3Var.a);
                    }
                }
            }
        }
        return arrayList.size() > 1 ? hx3.UNKNOWN : arrayList.size() == 1 ? (hx3) arrayList.get(0) : hx3.UNKNOWN;
    }

    public static pm9 E(String str) {
        List split$default;
        ArrayList arrayList = new ArrayList();
        split$default = StringsKt__StringsKt.split$default(str, new String[]{"/"}, false, 0, 6, null);
        try {
            long parseLong = Long.parseLong((String) split$default.get(0));
            if (split$default.size() % 2 != 1) {
                throw new iak(f1d.g("Must be even number of states in path: ", str), null);
            }
            a l = yhn.l(2, yhn.m(1, split$default.size()));
            int i2 = l.a;
            int i3 = l.b;
            int i4 = l.c;
            if ((i4 > 0 && i2 <= i3) || (i4 < 0 && i3 <= i2)) {
                while (true) {
                    arrayList.add(new Pair(split$default.get(i2), split$default.get(i2 + 1)));
                    if (i2 == i3) {
                        break;
                    }
                    i2 += i4;
                }
            }
            return new pm9(parseLong, (List) arrayList, split$default, true);
        } catch (NumberFormatException e2) {
            throw new iak(f1d.g("Top level id must be number: ", str), e2);
        }
    }

    public static void F(String str, LinkedHashMap linkedHashMap, LinkedHashSet linkedHashSet, LinkedHashSet linkedHashSet2, LinkedHashMap linkedHashMap2) {
        ArrayList arrayList;
        if (linkedHashSet.contains(str)) {
            List w0 = CollectionsKt.w0(linkedHashSet);
            StringBuilder sb = new StringBuilder();
            int size = w0.size();
            for (int indexOf = w0.indexOf(str); indexOf < size; indexOf++) {
                sb.append((String) w0.get(indexOf));
                sb.append(" -> ");
            }
            sb.append(str);
            throw new my1(sb.toString());
        }
        if (linkedHashSet2.contains(str)) {
            return;
        }
        List list = (List) linkedHashMap.get(str);
        if (list != null) {
            arrayList = new ArrayList();
            for (Object obj : list) {
                if (linkedHashMap.containsKey((String) obj)) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null && !arrayList.isEmpty()) {
            linkedHashSet.add(str);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                F((String) it.next(), linkedHashMap, linkedHashSet, linkedHashSet2, linkedHashMap2);
            }
            linkedHashSet.remove(str);
        }
        linkedHashSet2.add(str);
        RandomAccess randomAccess = arrayList;
        if (arrayList == null) {
            randomAccess = c5b.a;
        }
        linkedHashMap2.put(str, CollectionsKt.A0((Iterable) randomAccess));
    }

    public static Pair G(b7q b7qVar, fts ftsVar, maa maaVar) {
        bdt I = hag.I(vsb.class);
        qdc qdcVar = b7qVar.a;
        qdcVar.getClass();
        vsb vsbVar = (vsb) qdcVar.C(I);
        bdt I2 = hag.I(nbo.class);
        qdc qdcVar2 = b7qVar.a;
        qdcVar2.getClass();
        bb6 bb6Var = bb6.a;
        bq3 bq3Var = new bq3(bb6Var);
        liq d2 = vsbVar.d(ftsVar.c);
        ip3 ip3Var = null;
        if (d2 != null) {
            rjn rjnVar = new rjn(d2);
            sco m = m(vsbVar, nbo.b(maaVar));
            ip3 ip3Var2 = new ip3();
            ip3Var2.a = rjnVar;
            ip3Var2.d = vp3.R;
            ip3Var2.f = new bq3(bb6Var);
            ip3Var2.b = m;
            ip3Var2.c = null;
            ip3Var2.e = true;
            ip3Var = ip3Var2;
        }
        return new Pair(bq3Var, ip3Var);
    }

    public static void H(qc9 qc9Var, JSONObject jSONObject, boolean z, ArrayList arrayList) {
        String str;
        if (z) {
            Object opt = jSONObject.opt("type");
            if (opt == JSONObject.NULL) {
                opt = null;
            }
            if (opt == null) {
                throw a8k.g("type", jSONObject);
            }
            try {
                if (((String) opt).length() <= 0) {
                    throw a8k.e(jSONObject, "type", opt);
                }
                str = (String) opt;
            } catch (ClassCastException unused) {
                throw a8k.l(jSONObject, "type", opt);
            }
        } else {
            str = (String) etn.V(qc9Var, jSONObject, "type", i);
        }
        if (str != null) {
            arrayList.add(str);
        }
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            Object obj = jSONObject.get(keys.next());
            if (obj instanceof JSONObject) {
                H(qc9Var, (JSONObject) obj, false, arrayList);
            }
        }
        Iterator<String> keys2 = jSONObject.keys();
        while (keys2.hasNext()) {
            Object obj2 = jSONObject.get(keys2.next());
            if (obj2 instanceof JSONArray) {
                JSONArray jSONArray = (JSONArray) obj2;
                int length = jSONArray.length();
                for (int i2 = 0; i2 < length; i2++) {
                    Object obj3 = jSONArray.get(i2);
                    if (obj3 instanceof JSONObject) {
                        H(qc9Var, (JSONObject) obj3, false, arrayList);
                    }
                }
            }
        }
    }

    public static final View I(sv7 sv7Var) {
        if (!((xci) sv7Var).a.n) {
            sme.b("Cannot get View because the Modifier node is not currently attached.");
        }
        return (View) ppf.a(bcx.F(sv7Var));
    }

    public static String J(String str) {
        byte[] bytes = str.getBytes();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.update(bytes);
            return x(messageDigest.digest());
        } catch (NoSuchAlgorithmException e2) {
            Log.e("FirebaseCrashlytics", "Could not create hashing algorithm: SHA-1, returning empty string.", e2);
            return "";
        }
    }

    public static LinkedHashMap K(qc9 qc9Var, JSONObject jSONObject) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(jSONObject.length());
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof JSONObject) {
                ArrayList arrayList = new ArrayList();
                H(qc9Var, (JSONObject) obj, true, arrayList);
                linkedHashMap.put(next, arrayList);
            }
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        Iterator it = linkedHashMap.keySet().iterator();
        while (it.hasNext()) {
            F((String) it.next(), linkedHashMap, linkedHashSet, linkedHashSet2, linkedHashMap2);
        }
        return linkedHashMap2;
    }

    public static String L(FileInputStream fileInputStream) {
        Scanner useDelimiter = new Scanner(fileInputStream).useDelimiter("\\A");
        try {
            String next = useDelimiter.hasNext() ? useDelimiter.next() : "";
            useDelimiter.close();
            return next;
        } catch (Throwable th) {
            if (useDelimiter != null) {
                try {
                    useDelimiter.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static final CoverPath M(u9b u9bVar, WebPath$Storage webPath$Storage) {
        webPath$Storage.getClass();
        if (u9bVar == null) {
            CoverPath none = CoverPath.none();
            none.getClass();
            return none;
        }
        String str = u9bVar.a;
        str.getClass();
        return etn.B(str, webPath$Storage);
    }

    public static final void a(v40 v40Var, hq5 hq5Var, int i2) {
        int i3;
        v40Var.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1876524538);
        int i4 = (oq5Var.h(v40Var) ? 4 : 2) | i2;
        if (oq5Var.P(i4 & 1, (i4 & 3) != 2)) {
            c50 c50Var = (c50) szf.Q(v40Var.e, oq5Var).getValue();
            int i5 = 3;
            fvf a2 = hvf.a(0, 0, oq5Var, 0, 3);
            boolean h2 = oq5Var.h(v40Var);
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (h2 || K == kjnVar) {
                zy zyVar = new zy(0, v40Var, v40.class, "onBackClicked", "onBackClicked()V", 0, 5);
                oq5Var.k0(zyVar);
                K = zyVar;
            }
            Function0 function0 = (Function0) ((h9f) K);
            boolean h3 = oq5Var.h(v40Var);
            Object K2 = oq5Var.K();
            if (h3 || K2 == kjnVar) {
                zy zyVar2 = new zy(0, v40Var, v40.class, "onSearchClicked", "onSearchClicked()V", 0, 6);
                oq5Var.k0(zyVar2);
                K2 = zyVar2;
            }
            Function0 function02 = (Function0) ((h9f) K2);
            boolean h4 = oq5Var.h(v40Var);
            Object K3 = oq5Var.K();
            if (h4 || K3 == kjnVar) {
                zy zyVar3 = new zy(0, v40Var, v40.class, "openSortBottomSheet", "openSortBottomSheet()V", 0, 7);
                oq5Var.k0(zyVar3);
                K3 = zyVar3;
            }
            i3 = 4;
            g(R.string.audiobooks_title, a2, function0, function02, (Function0) ((h9f) K3), ild.C(787393593, new xk(i5, c50Var, v40Var, a2), oq5Var), oq5Var, 196608, 0);
        } else {
            i3 = 4;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new q2(v40Var, i2, i3);
        }
    }

    public static final void b(int i2, hq5 hq5Var, yci yciVar, String str, Function0 function0, boolean z) {
        boolean z2;
        str.getClass();
        function0.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(94230581);
        int i3 = i2 | (oq5Var.f(str) ? 4 : 2) | (oq5Var.h(function0) ? 32 : 16);
        if (oq5Var.P(i3 & 1, (i3 & 1171) != 1170)) {
            z2 = z;
            ltg.i(yciVar, false, 0L, function0, null, ild.C(1576557807, new ed3(z2, str, 0), oq5Var), oq5Var, 196614 | ((i3 << 6) & 7168), 22);
        } else {
            z2 = z;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new fd3(function0, yciVar, z2, str, i2, 0);
        }
    }

    public static final void c(ww5 ww5Var, hq5 hq5Var, int i2) {
        ww5 ww5Var2;
        oq5 oq5Var;
        ww5Var.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-523408540);
        int i3 = (oq5Var2.f(ww5Var) ? 4 : 2) | i2;
        if ((i3 & 3) == 2 && oq5Var2.z()) {
            oq5Var2.S();
            ww5Var2 = ww5Var;
            oq5Var = oq5Var2;
        } else {
            int i4 = i3 & 14;
            boolean z = i4 == 4;
            Object K = oq5Var2.K();
            kjn kjnVar = gq5.a;
            if (z || K == kjnVar) {
                int i5 = 0;
                e65 e65Var = new e65(0, ww5Var, ww5.class, "onBackClick", "onBackClick()V", i5, 11);
                mt4 mt4Var = new mt4(1, ww5Var, ww5.class, "onQueryChanged", "onQueryChanged(Ljava/lang/String;)V", i5, 16);
                ww5Var2 = ww5Var;
                m1p m1pVar = new m1p("", e65Var, mt4Var);
                oq5Var2.k0(m1pVar);
                K = m1pVar;
            } else {
                ww5Var2 = ww5Var;
            }
            m1p m1pVar2 = (m1p) K;
            float f2 = 8;
            yci q = androidx.compose.foundation.layout.a.q(d.d(androidx.compose.foundation.a.b(vci.a, ((dq0) oq5Var2.j(eq0.a)).c.a, vnj.i), 1.0f), 0.0f, f2, 16, f2, 1);
            boolean z2 = i4 == 4;
            Object K2 = oq5Var2.K();
            if (z2 || K2 == kjnVar) {
                K2 = new xw5(ww5Var2);
                oq5Var2.k0(K2);
            }
            oq5Var = oq5Var2;
            w1g.h(com.yandex.music.core.ui.compose.a.b(q, null, 0L, 0.0f, null, (Function2) K2, 15), m1pVar2, vq2.i, oq5Var, 448, 0);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new xw5(ww5Var2, i2, 2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v21, types: [int] */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v60 */
    /* JADX WARN: Type inference failed for: r3v63 */
    public static final void d(cwk cwkVar, final zi6 zi6Var, n1g n1gVar, Function0 function0, Function0 function02, Function0 function03, final Function1 function1, final Function1 function12, Function1 function13, Function1 function14, yci yciVar, tbl tblVar, hq5 hq5Var, int i2) {
        n1g n1gVar2;
        int i3;
        int i4;
        float f2;
        j1g j1gVar;
        vci vciVar;
        xi6 xi6Var;
        yi6 yi6Var;
        xi6 xi6Var2;
        kjn kjnVar;
        float f3;
        boolean z;
        j1g j1gVar2;
        final float f4;
        boolean z2;
        final ?? r10;
        int i5;
        final String n;
        String str;
        int i6;
        int i7;
        j1g j1gVar3;
        String n2;
        boolean z3;
        String str2;
        boolean z4;
        zi6Var.getClass();
        xi6 xi6Var3 = zi6Var.b;
        n1gVar.getClass();
        function0.getClass();
        function02.getClass();
        function03.getClass();
        function1.getClass();
        function12.getClass();
        function13.getClass();
        function14.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(383681287);
        int i8 = i2 | (oq5Var.d(cwkVar.ordinal()) ? 4 : 2) | (oq5Var.f(zi6Var) ? 32 : 16) | (oq5Var.f(n1gVar) ? 256 : 128) | (oq5Var.h(function0) ? 2048 : 1024) | (oq5Var.h(function02) ? 16384 : RemoteCameraConfig.Notification.ID) | (oq5Var.h(function03) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX) | (oq5Var.h(function1) ? 1048576 : 524288) | (oq5Var.h(function12) ? 8388608 : RemoteCameraConfig.Camera.BITRATE) | (oq5Var.h(function13) ? 67108864 : 33554432) | (oq5Var.h(function14) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456);
        if (oq5Var.P(i8 & 1, ((i8 & 306783379) == 306783378 && (((6 | (oq5Var.d(tblVar.ordinal()) ? ' ' : (char) 16)) == true ? 1 : 0) & 19) == 18) ? false : true)) {
            int ordinal = tblVar.ordinal();
            if (ordinal == 0) {
                i3 = 24;
            } else {
                if (ordinal != 1) {
                    b6e.s();
                    return;
                }
                i3 = 32;
            }
            final float f5 = i3;
            int ordinal2 = tblVar.ordinal();
            if (ordinal2 == 0) {
                i4 = 64;
            } else {
                if (ordinal2 != 1) {
                    b6e.s();
                    return;
                }
                i4 = 76;
            }
            float f6 = i4;
            yci a2 = androidx.compose.ui.platform.a.a(yciVar, "controls");
            nho a3 = lho.a(qx0.g, b2c.l, oq5Var, 54);
            int i9 = oq5Var.P;
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
            g0g.U(oq5Var, a3, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i9))) {
                ouj.x(i9, oq5Var, i9, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            boolean z5 = n1gVar.c;
            j1g j1gVar4 = n1gVar.a;
            vci vciVar2 = vci.a;
            if (z5) {
                oq5Var.Z(-1895111375);
                j1g j1gVar5 = j1g.c;
                aae.a(function02, b.c(androidx.compose.ui.platform.a.a(ksw.D(vciVar2, rvf.M(R.string.menu_element_dislike, oq5Var), rvf.M(j1gVar4 == j1gVar5 ? R.string.accessibility_uncheck_action : R.string.accessibility_check_action, oq5Var)), "dislike_button"), "is_disliked", Boolean.valueOf(j1gVar4 == j1gVar5)), false, ild.C(-356494366, new ze4(f5, n1gVar, 1), oq5Var), oq5Var, ((i8 >> 12) & 14) | 24576, 12);
                oq5Var.p(false);
            } else {
                oq5Var.Z(-1894144361);
                vz1.B(vciVar2, 48, oq5Var, false);
            }
            xi6 xi6Var4 = zi6Var.c;
            yi6 yi6Var2 = zi6Var.a;
            xi6 xi6Var5 = xi6.a;
            kjn kjnVar2 = gq5.a;
            if (xi6Var3 != xi6Var5) {
                oq5Var.Z(-1893945000);
                int ordinal3 = yi6Var2.ordinal();
                if (ordinal3 != 0) {
                    i6 = 1;
                    if (ordinal3 != 1) {
                        b6e.s();
                        return;
                    }
                    i7 = R.drawable.ic_seek_15_big_24;
                } else {
                    i6 = 1;
                    i7 = R.drawable.ic_backward_big_24;
                }
                int ordinal4 = yi6Var2.ordinal();
                if (ordinal4 == 0) {
                    j1gVar3 = j1gVar4;
                    n2 = vz1.n(oq5Var, -2139294773, R.string.player_previous_description, oq5Var, false);
                } else {
                    if (ordinal4 != i6) {
                        throw vz1.i(oq5Var, -2139297179, false);
                    }
                    oq5Var.Z(-2139290931);
                    n2 = rvf.N(R.string.player_seek_backward_description, new Object[]{15}, oq5Var);
                    oq5Var.p(false);
                    j1gVar3 = j1gVar4;
                }
                final String str3 = n2;
                int ordinal5 = yi6Var2.ordinal();
                if (ordinal5 != 0) {
                    z3 = true;
                    if (ordinal5 != 1) {
                        b6e.s();
                        return;
                    }
                    str2 = "seek_backward_button";
                } else {
                    z3 = true;
                    str2 = "previous_button";
                }
                yci a4 = androidx.compose.ui.platform.a.a(vciVar2, str2);
                boolean z6 = xi6Var3 == xi6.c ? z3 : false;
                boolean z7 = ((i8 & 3670016) == 1048576 ? z3 : false) | ((i8 & 112) == 32);
                Object K = oq5Var.K();
                if (z7 || K == kjnVar2) {
                    z4 = false;
                    final ?? r2 = 0 == true ? 1 : 0;
                    K = new Function0() { // from class: ri6
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            switch (r2) {
                                case 0:
                                    function1.invoke(zi6Var.a);
                                    break;
                                default:
                                    function1.invoke(zi6Var.a);
                                    break;
                            }
                            return Unit.a;
                        }
                    };
                    oq5Var.k0(K);
                } else {
                    z4 = false;
                }
                final int i10 = 0;
                vciVar = vciVar2;
                final int i11 = i7;
                z = z4;
                xi6Var = xi6Var4;
                yi6Var = yi6Var2;
                j1gVar = j1gVar3;
                f3 = f6;
                xi6Var2 = xi6Var5;
                f2 = f5;
                kjnVar = kjnVar2;
                i((Function0) K, function13, a4, z6, null, ild.C(-31344965, new Function2() { // from class: si6
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        long j2;
                        long j3;
                        int i12 = i10;
                        hq5 hq5Var2 = (hq5) obj;
                        int intValue = ((Integer) obj2).intValue();
                        switch (i12) {
                            case 0:
                                oq5 oq5Var2 = (oq5) hq5Var2;
                                if (oq5Var2.P(intValue & 1, (intValue & 3) != 2)) {
                                    yci m = d.m(androidx.compose.foundation.layout.a.m(vci.a, 8), f5);
                                    w4k E = a0g.E(i11, 0, oq5Var2);
                                    if (zi6Var.b == xi6.c) {
                                        oq5Var2.Z(-1789578724);
                                        j2 = ((dq0) oq5Var2.j(eq0.a)).a.a;
                                        oq5Var2.p(false);
                                    } else {
                                        oq5Var2.Z(-1789498341);
                                        j2 = ((dq0) oq5Var2.j(eq0.a)).a.e;
                                        oq5Var2.p(false);
                                    }
                                    gae.b(E, str3, m, j2, oq5Var2, 0, 0);
                                } else {
                                    oq5Var2.S();
                                }
                                break;
                            default:
                                oq5 oq5Var3 = (oq5) hq5Var2;
                                if (oq5Var3.P(intValue & 1, (intValue & 3) != 2)) {
                                    yci m2 = d.m(androidx.compose.foundation.layout.a.m(vci.a, 8), f5);
                                    w4k E2 = a0g.E(i11, 0, oq5Var3);
                                    if (zi6Var.c == xi6.c) {
                                        oq5Var3.Z(1456004667);
                                        j3 = ((dq0) oq5Var3.j(eq0.a)).a.a;
                                        oq5Var3.p(false);
                                    } else {
                                        oq5Var3.Z(1456085050);
                                        j3 = ((dq0) oq5Var3.j(eq0.a)).a.e;
                                        oq5Var3.p(false);
                                    }
                                    gae.b(E2, str3, m2, j3, oq5Var3, 0, 0);
                                } else {
                                    oq5Var3.S();
                                }
                                break;
                        }
                        return Unit.a;
                    }
                }, oq5Var), oq5Var, ((i8 >> 21) & 112) | 196608);
                oq5Var = oq5Var;
                oq5Var.p(z);
            } else {
                f2 = f5;
                j1gVar = j1gVar4;
                vciVar = vciVar2;
                xi6Var = xi6Var4;
                yi6Var = yi6Var2;
                xi6Var2 = xi6Var5;
                kjnVar = kjnVar2;
                f3 = f6;
                z = false;
                oq5Var.Z(-1892154409);
                vz1.B(vciVar, 48, oq5Var, false);
            }
            oq5 oq5Var2 = oq5Var;
            j(f3, function03, b.c(androidx.compose.ui.platform.a.a(vciVar, "play_pause_button"), "is_playing", Boolean.valueOf(cwkVar == cwk.b ? true : z)), false, null, ild.C(487125592, new ze4(cwkVar, f3), oq5Var), oq5Var2, ((i8 >> 12) & 112) | 196608);
            oq5Var = oq5Var2;
            if (xi6Var != xi6Var2) {
                oq5Var.Z(-1891081499);
                int ordinal6 = yi6Var.ordinal();
                if (ordinal6 != 0) {
                    r10 = 1;
                    if (ordinal6 != 1) {
                        b6e.s();
                        return;
                    }
                    i5 = R.drawable.ic_seek_30_big_24;
                } else {
                    r10 = 1;
                    i5 = R.drawable.ic_forward_big_24;
                }
                int ordinal7 = yi6Var.ordinal();
                if (ordinal7 == 0) {
                    n = vz1.n(oq5Var, -2139202649, R.string.player_skip_description, oq5Var, z);
                } else {
                    if (ordinal7 != r10) {
                        throw vz1.i(oq5Var, -2139205057, z);
                    }
                    oq5Var.Z(-2139198933);
                    n = rvf.N(R.string.player_seek_forward_description, new Object[]{30}, oq5Var);
                    oq5Var.p(z);
                }
                int ordinal8 = yi6Var.ordinal();
                if (ordinal8 == 0) {
                    str = "skip_button";
                } else {
                    if (ordinal8 != r10) {
                        b6e.s();
                        return;
                    }
                    str = "seek_forward_button";
                }
                yci a5 = androidx.compose.ui.platform.a.a(vciVar, str);
                boolean z8 = xi6Var == xi6.c ? r10 : z;
                boolean z9 = ((i8 & 29360128) == 8388608 ? r10 : z) | ((i8 & 112) == 32 ? r10 : z);
                Object K2 = oq5Var.K();
                if (z9 || K2 == kjnVar) {
                    K2 = new Function0() { // from class: ri6
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            switch (r10) {
                                case 0:
                                    function12.invoke(zi6Var.a);
                                    break;
                                default:
                                    function12.invoke(zi6Var.a);
                                    break;
                            }
                            return Unit.a;
                        }
                    };
                    oq5Var.k0(K2);
                }
                Function0 function04 = (Function0) K2;
                final int i12 = i5;
                final int i13 = 1;
                f4 = f2;
                j1gVar2 = j1gVar;
                z2 = r10;
                i(function04, function14, a5, z8, null, ild.C(-2070808452, new Function2() { // from class: si6
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        long j2;
                        long j3;
                        int i122 = i13;
                        hq5 hq5Var2 = (hq5) obj;
                        int intValue = ((Integer) obj2).intValue();
                        switch (i122) {
                            case 0:
                                oq5 oq5Var22 = (oq5) hq5Var2;
                                if (oq5Var22.P(intValue & 1, (intValue & 3) != 2)) {
                                    yci m = d.m(androidx.compose.foundation.layout.a.m(vci.a, 8), f4);
                                    w4k E = a0g.E(i12, 0, oq5Var22);
                                    if (zi6Var.b == xi6.c) {
                                        oq5Var22.Z(-1789578724);
                                        j2 = ((dq0) oq5Var22.j(eq0.a)).a.a;
                                        oq5Var22.p(false);
                                    } else {
                                        oq5Var22.Z(-1789498341);
                                        j2 = ((dq0) oq5Var22.j(eq0.a)).a.e;
                                        oq5Var22.p(false);
                                    }
                                    gae.b(E, n, m, j2, oq5Var22, 0, 0);
                                } else {
                                    oq5Var22.S();
                                }
                                break;
                            default:
                                oq5 oq5Var3 = (oq5) hq5Var2;
                                if (oq5Var3.P(intValue & 1, (intValue & 3) != 2)) {
                                    yci m2 = d.m(androidx.compose.foundation.layout.a.m(vci.a, 8), f4);
                                    w4k E2 = a0g.E(i12, 0, oq5Var3);
                                    if (zi6Var.c == xi6.c) {
                                        oq5Var3.Z(1456004667);
                                        j3 = ((dq0) oq5Var3.j(eq0.a)).a.a;
                                        oq5Var3.p(false);
                                    } else {
                                        oq5Var3.Z(1456085050);
                                        j3 = ((dq0) oq5Var3.j(eq0.a)).a.e;
                                        oq5Var3.p(false);
                                    }
                                    gae.b(E2, n, m2, j3, oq5Var3, 0, 0);
                                } else {
                                    oq5Var3.S();
                                }
                                break;
                        }
                        return Unit.a;
                    }
                }, oq5Var), oq5Var, ((i8 >> 24) & 112) | 196608);
                oq5Var = oq5Var;
                oq5Var.p(z);
            } else {
                j1gVar2 = j1gVar;
                f4 = f2;
                z2 = true;
                oq5Var.Z(-1889334153);
                vz1.B(vciVar, 48, oq5Var, z);
            }
            n1gVar2 = n1gVar;
            if (n1gVar2.b) {
                oq5Var.Z(-1889209502);
                yci m = d.m(androidx.compose.foundation.layout.a.m(vciVar, 8), f4);
                boolean z10 = j1gVar2 == j1g.a ? z2 : z;
                agr agrVar = eq0.a;
                int i14 = (i8 >> 6) & 112;
                oq5 oq5Var3 = oq5Var;
                szf.b(z10, function0, null, m, ((dq0) oq5Var.j(agrVar)).a.a, ((dq0) oq5Var.j(agrVar)).a.c, oq5Var3, i14, 4);
                oq5Var = oq5Var3;
                oq5Var.p(z);
            } else {
                oq5Var.Z(-1888833193);
                vz1.B(vciVar, 48, oq5Var, z);
            }
            oq5Var.p(z2);
        } else {
            n1gVar2 = n1gVar;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new ma3(cwkVar, zi6Var, n1gVar2, function0, function02, function03, function1, function12, function13, function14, yciVar, tblVar, i2);
        }
    }

    public static final void e(pu0 pu0Var, bci bciVar, pt6 pt6Var, yci yciVar, hq5 hq5Var, int i2) {
        int i3;
        bciVar.getClass();
        pt6Var.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1497993973);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var.f(pu0Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? oq5Var.f(bciVar) : oq5Var.h(bciVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= oq5Var.h(pt6Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= oq5Var.f(yciVar) ? 2048 : 1024;
        }
        if ((i3 & 1171) == 1170 && oq5Var.z()) {
            oq5Var.S();
        } else {
            vt6 vt6Var = (vt6) gld.M(pt6Var.a(), oq5Var).getValue();
            if (Intrinsics.d(vt6Var, qt6.a)) {
                oq5Var.Z(758173593);
                oq5Var.p(false);
            } else {
                if (!(vt6Var instanceof ut6)) {
                    throw vz1.i(oq5Var, 758170520, false);
                }
                oq5Var.Z(2028612826);
                jf0.a(new qzm[0], pu0Var, false, ild.C(-1270716356, new ot6((ut6) vt6Var, bciVar, pt6Var, yciVar), oq5Var), oq5Var, (i3 << 3) & 112, 4);
                oq5Var.p(false);
            }
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new uu(pu0Var, bciVar, false, pt6Var, yciVar, i2, 28);
        }
    }

    public static final void f(ut6 ut6Var, bci bciVar, pt6 pt6Var, yci yciVar, hq5 hq5Var, int i2) {
        bci bciVar2;
        yci yciVar2;
        bciVar.getClass();
        pt6Var.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-390394140);
        int i3 = (oq5Var.h(ut6Var) ? 4 : 2) | i2 | (oq5Var.h(bciVar) ? 32 : 16) | (oq5Var.h(pt6Var) ? 256 : 128) | (oq5Var.f(yciVar) ? 2048 : 1024);
        if ((i3 & 1171) == 1170 && oq5Var.z()) {
            oq5Var.S();
            bciVar2 = bciVar;
            yciVar2 = yciVar;
        } else {
            jmj f2 = pt6Var.f(((i3 >> 3) & 112) | 6, oq5Var);
            boolean z = ut6Var instanceof tt6;
            boolean h2 = oq5Var.h(ut6Var) | oq5Var.h(f2);
            Object K = oq5Var.K();
            if (h2 || K == gq5.a) {
                K = new ny2(9, ut6Var, f2);
                oq5Var.k0(K);
            }
            bciVar2 = bciVar;
            vq1.g(yciVar, bciVar2, z, (Function1) K, oq5Var, ((i3 >> 9) & 14) | 64 | (i3 & 112), 4);
            yciVar2 = yciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new ot6(ut6Var, bciVar2, pt6Var, yciVar2, i2);
        }
    }

    public static final void g(int i2, mxo mxoVar, Function0 function0, Function0 function02, Function0 function03, wn5 wn5Var, hq5 hq5Var, int i3, int i4) {
        Function0 function04;
        int i5;
        oq5 oq5Var;
        mxoVar.getClass();
        function0.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-1083517646);
        int i6 = i3 | (oq5Var2.d(i2) ? 4 : 2) | (oq5Var2.h(mxoVar) ? 32 : 16) | (oq5Var2.h(function0) ? 256 : 128) | (oq5Var2.h(function02) ? 2048 : 1024);
        int i7 = i4 & 16;
        if (i7 != 0) {
            i5 = i6 | 24576;
            function04 = function03;
        } else {
            function04 = function03;
            i5 = i6 | (oq5Var2.h(function04) ? 16384 : RemoteCameraConfig.Notification.ID);
        }
        if (oq5Var2.P(i5 & 1, (74899 & i5) != 74898)) {
            Function0 function05 = i7 != 0 ? null : function04;
            oq5Var = oq5Var2;
            xp3.d(rvf.M(i2, oq5Var2), mxoVar, androidx.compose.ui.platform.a.a(vci.a, "collection_downloaded_toolbar"), ghh.C(zs4.g(oq5Var2), ogp.A(oq5Var2)), function0, ild.C(-1847496972, new gja(function05, function02, 0), oq5Var2), false, false, null, null, null, ild.C(236859196, new j26(wn5Var, 2), oq5Var2), oq5Var, (i5 & 112) | 196992 | ((i5 << 6) & 57344), 48, 1984);
            function04 = function05;
        } else {
            oq5Var = oq5Var2;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new cj(i2, mxoVar, function0, function02, function04, wn5Var, i3, i4);
        }
    }

    public static final void h(cdf cdfVar, hq5 hq5Var, int i2) {
        fvf fvfVar;
        qdf qdfVar;
        int i3;
        cdfVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1007568068);
        int i4 = (oq5Var.h(cdfVar) ? 4 : 2) | i2;
        if (oq5Var.P(i4 & 1, (i4 & 3) != 2)) {
            qdf qdfVar2 = (qdf) szf.Q(cdfVar.e, oq5Var).getValue();
            fvf a2 = hvf.a(0, 0, oq5Var, 0, 3);
            ogp.g.e(false, qdfVar2 instanceof mdf, null, oq5Var, 4096, 5);
            yci a3 = androidx.compose.ui.platform.a.a(vci.a, "collection_kids_albums_screen");
            boolean booleanValue = ((Boolean) szf.Q(cdfVar.f, oq5Var).getValue()).booleanValue();
            boolean h2 = oq5Var.h(cdfVar);
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (h2 || K == kjnVar) {
                fvfVar = a2;
                qdfVar = qdfVar2;
                i3 = 4;
                v2d v2dVar = new v2d(0, cdfVar, cdf.class, "onRefresh", "onRefresh()V", 0, 15);
                oq5Var.k0(v2dVar);
                K = v2dVar;
            } else {
                qdfVar = qdfVar2;
                i3 = 4;
                fvfVar = a2;
            }
            h9f h9fVar = (h9f) K;
            boolean h3 = oq5Var.h(cdfVar);
            Object K2 = oq5Var.K();
            if (h3 || K2 == kjnVar) {
                v2d v2dVar2 = new v2d(0, cdfVar, cdf.class, "onBackClicked", "onBackClicked()V", 0, 17);
                oq5Var.k0(v2dVar2);
                K2 = v2dVar2;
            }
            h9f h9fVar2 = (h9f) K2;
            boolean h4 = oq5Var.h(cdfVar);
            Object K3 = oq5Var.K();
            if (h4 || K3 == kjnVar) {
                v2d v2dVar3 = new v2d(0, cdfVar, cdf.class, "onSearchClicked", "onSearchClicked()V", 0, 19);
                oq5Var.k0(v2dVar3);
                K3 = v2dVar3;
            }
            h9f h9fVar3 = (h9f) K3;
            boolean h5 = oq5Var.h(cdfVar);
            Object K4 = oq5Var.K();
            if (h5 || K4 == kjnVar) {
                v2d v2dVar4 = new v2d(0, cdfVar, cdf.class, "openSortBottomSheet", "openSortBottomSheet()V", 0, 20);
                oq5Var.k0(v2dVar4);
                K4 = v2dVar4;
            }
            xp3.g(R.string.kids_subscribes_title, fvfVar, booleanValue, (Function0) h9fVar, (Function0) h9fVar2, a3, (Function0) h9fVar3, (Function0) ((h9f) K4), ild.C(-817093312, new vtb(i3, qdfVar, cdfVar, fvfVar), oq5Var), oq5Var, 100859904, 0);
            oq5Var = oq5Var;
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new nha(cdfVar, i2, 22);
        }
    }

    public static final void i(Function0 function0, Function1 function1, yci yciVar, boolean z, uoi uoiVar, wn5 wn5Var, hq5 hq5Var, int i2) {
        int i3;
        uoi uoiVar2;
        kjn kjnVar;
        Object wi6Var;
        uoi uoiVar3;
        int i4;
        boolean z2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1846943933);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var.h(function0) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var.h(function1) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= oq5Var.f(yciVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= oq5Var.g(z) ? 2048 : 1024;
        }
        int i5 = i3 | 24576;
        if ((196608 & i2) == 0) {
            i5 |= oq5Var.h(wn5Var) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        if (oq5Var.P(i5 & 1, (74899 & i5) != 74898)) {
            Object K = oq5Var.K();
            kjn kjnVar2 = gq5.a;
            if (K == kjnVar2) {
                K = vz1.h(oq5Var);
            }
            uoi uoiVar4 = (uoi) K;
            aqi o0 = szf.o0(function0, oq5Var);
            aqi o02 = szf.o0(Boolean.valueOf(z), oq5Var);
            Object K2 = oq5Var.K();
            if (K2 == kjnVar2) {
                K2 = szf.g0(Boolean.FALSE);
                oq5Var.k0(K2);
            }
            aqi aqiVar = (aqi) K2;
            agr agrVar = v5i.a;
            yciVar.getClass();
            int i6 = 0;
            yci a2 = e.a(vnj.r(yciVar, "com.yandex.music.screen.player.ui.components.slider.minimumTouchTargetSize", new Object[0], new ep5(19)), uoiVar4, eeo.a(24, 4, 0L, false));
            boolean f2 = oq5Var.f(o02) | ((i5 & 112) == 32) | ((57344 & i5) == 16384) | oq5Var.f(o0);
            Object K3 = oq5Var.K();
            if (f2 || K3 == kjnVar2) {
                kjnVar = kjnVar2;
                uoiVar3 = uoiVar4;
                i4 = 2048;
                z2 = true;
                wi6Var = new wi6(function1, o02, aqiVar, uoiVar3, o0);
                oq5Var.k0(wi6Var);
            } else {
                uoiVar3 = uoiVar4;
                wi6Var = K3;
                kjnVar = kjnVar2;
                i4 = 2048;
                z2 = true;
            }
            yci a3 = eur.a(a2, uoiVar3, (PointerInputEventHandler) wi6Var);
            boolean f3 = oq5Var.f(o0) | ((i5 & 7168) == i4 ? z2 : false);
            Object K4 = oq5Var.K();
            if (f3 || K4 == kjnVar) {
                K4 = new pi6(z, o0, i6);
                oq5Var.k0(K4);
            }
            yci b2 = nfp.b(a3, z2, (Function1) K4);
            kfh d2 = ug3.d(b2c.f, false);
            int i7 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, b2);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, d2, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i7))) {
                ouj.x(i7, oq5Var, i7, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            eta.l((i5 >> 15) & 14, wn5Var, oq5Var, z2);
            uoiVar2 = uoiVar3;
        } else {
            oq5Var.S();
            uoiVar2 = uoiVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new dq(i2, 8, function0, function1, yciVar, uoiVar2, wn5Var, z);
        }
    }

    public static final void j(float f2, Function0 function0, yci yciVar, boolean z, uoi uoiVar, wn5 wn5Var, hq5 hq5Var, int i2) {
        int i3;
        boolean z2;
        uoi uoiVar2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1386720119);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var.c(f2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var.h(function0) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= oq5Var.f(yciVar) ? 256 : 128;
        }
        int i4 = i3 | 27648;
        if ((196608 & i2) == 0) {
            i4 |= oq5Var.h(wn5Var) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        if (oq5Var.P(i4 & 1, (74899 & i4) != 74898)) {
            Object K = oq5Var.K();
            if (K == gq5.a) {
                K = vz1.h(oq5Var);
            }
            uoi uoiVar3 = (uoi) K;
            yci m = d.m(yciVar, f2);
            agr agrVar = yre.a;
            yci d2 = androidx.compose.foundation.a.d(m.f(MinimumInteractiveModifier.a), uoiVar3, eeo.a(f2 / 2, 4, 0L, false), true, null, new meo(0), function0, 8);
            kfh d3 = ug3.d(b2c.f, false);
            int i5 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
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
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i5))) {
                ouj.x(i5, oq5Var, i5, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            oq5Var.Z(-1322726332);
            qs5 qs5Var = mb6.a;
            float floatValue = ((Number) oq5Var.j(qs5Var)).floatValue();
            oq5Var.p(false);
            etn.l(qs5Var.a(Float.valueOf(floatValue)), wn5Var, oq5Var, ((i4 >> 12) & 112) | 8);
            oq5Var.p(true);
            uoiVar2 = uoiVar3;
            z2 = true;
        } else {
            oq5Var.S();
            z2 = z;
            uoiVar2 = uoiVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new qi6(f2, function0, yciVar, z2, uoiVar2, wn5Var, i2, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object k(Call call, cg6 cg6Var) {
        uc ucVar;
        int i2;
        tqn tqnVar;
        bii biiVar;
        Object J;
        String login;
        wc wcVar;
        if (cg6Var instanceof uc) {
            ucVar = (uc) cg6Var;
            int i3 = ucVar.l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                ucVar.l = i3 - Integer.MIN_VALUE;
                Object obj = ucVar.k;
                nm6 nm6Var = nm6.a;
                i2 = ucVar.l;
                if (i2 != 0) {
                    qgg.h0(obj);
                    tqn tqnVar2 = new tqn();
                    ucVar.j = tqnVar2;
                    ucVar.l = 1;
                    Object N = swf.N(call, ucVar);
                    if (N == nm6Var) {
                        return nm6Var;
                    }
                    tqnVar = tqnVar2;
                    obj = N;
                } else {
                    if (i2 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    tqnVar = ucVar.j;
                    qgg.h0(obj);
                }
                biiVar = (bii) obj;
                if (!(biiVar instanceof aii)) {
                    AccountAboutDto accountAboutDto = (AccountAboutDto) ((aii) biiVar).a;
                    if (accountAboutDto.getUid() == null || accountAboutDto.getLogin() == null) {
                        tqnVar.a = true;
                    }
                    String uid = accountAboutDto.getUid();
                    if (uid == null || (login = accountAboutDto.getLogin()) == null) {
                        wcVar = null;
                    } else {
                        String fullName = accountAboutDto.getFullName();
                        String str = fullName == null ? "" : fullName;
                        String email = accountAboutDto.getEmail();
                        String geoRegionIso = accountAboutDto.getGeoRegionIso();
                        if (geoRegionIso == null) {
                            geoRegionIso = "unknown";
                        }
                        b6d b6dVar = new b6d(geoRegionIso);
                        Boolean isServiceAvailable = accountAboutDto.getIsServiceAvailable();
                        boolean booleanValue = isServiceAvailable != null ? isServiceAvailable.booleanValue() : false;
                        Boolean isChild = accountAboutDto.getIsChild();
                        boolean booleanValue2 = isChild != null ? isChild.booleanValue() : false;
                        Boolean hasPlus = accountAboutDto.getHasPlus();
                        boolean booleanValue3 = hasPlus != null ? hasPlus.booleanValue() : false;
                        Boolean hasMusicSubscription = accountAboutDto.getHasMusicSubscription();
                        boolean booleanValue4 = hasMusicSubscription != null ? hasMusicSubscription.booleanValue() : false;
                        List options = accountAboutDto.getOptions();
                        wcVar = new wc(uid, login, str, email, booleanValue, b6dVar, booleanValue3, booleanValue4, booleanValue2, options != null ? CollectionsKt.O(options) : c5b.a);
                    }
                    J = wcVar == null ? new nj6(null) : new qj6(wcVar);
                } else if (biiVar instanceof xhi) {
                    xhi xhiVar = (xhi) biiVar;
                    MusicBackendInvocationError musicBackendInvocationError = xhiVar.c;
                    int i4 = xhiVar.b;
                    String name = musicBackendInvocationError.getName();
                    String str2 = name == null ? "" : name;
                    String message = musicBackendInvocationError.getMessage();
                    J = new kj6(i4, musicBackendInvocationError.getDetails(), str2, message == null ? "" : message, xhiVar.a);
                } else if (biiVar instanceof yhi) {
                    yhi yhiVar = (yhi) biiVar;
                    J = new lj6(yhiVar.b, yhiVar.c, yhiVar.a);
                } else {
                    if (!(biiVar instanceof zhi)) {
                        b6e.s();
                        return null;
                    }
                    J = uwf.J((zhi) biiVar);
                }
                return ((J instanceof nj6) && tqnVar.a) ? new nj6(new EmptyAccountException()) : J;
            }
        }
        ucVar = new uc(cg6Var);
        Object obj2 = ucVar.k;
        nm6 nm6Var2 = nm6.a;
        i2 = ucVar.l;
        if (i2 != 0) {
        }
        biiVar = (bii) obj2;
        if (!(biiVar instanceof aii)) {
        }
        if (J instanceof nj6) {
            return J;
        }
    }

    public static final int l(char c2) {
        if ('0' <= c2 && c2 < ':') {
            return c2 - '0';
        }
        if ('a' <= c2 && c2 < 'g') {
            return c2 - 'W';
        }
        if ('A' <= c2 && c2 < 'G') {
            return c2 - '7';
        }
        xla.e(c2, "Unexpected hex digit: ");
        return 0;
    }

    public static sco m(vsb vsbVar, lum lumVar) {
        l9c l9cVar = new l9c();
        obo oboVar = (obo) lumVar.c;
        c5b c5bVar = c5b.a;
        ywd ywdVar = ywd.d;
        b7q b7qVar = vsbVar.a;
        bdt I = hag.I(oco.class);
        qdc qdcVar = b7qVar.a;
        qdcVar.getClass();
        oco ocoVar = (oco) qdcVar.C(I);
        bdt I2 = hag.I(dpt.class);
        qdc qdcVar2 = b7qVar.a;
        qdcVar2.getClass();
        return new sco(ocoVar, null, l9cVar, oboVar, c5bVar, (dpt) qdcVar2.C(I2), ywdVar);
    }

    public static final int n(Bitmap bitmap) {
        bitmap.getClass();
        int height = bitmap.getHeight();
        int width = bitmap.getWidth();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < 10; i6++) {
            for (int i7 = 0; i7 < 10; i7++) {
                int pixel = bitmap.getPixel((((i7 * 2) + 1) * width) / 20, (((i6 * 2) + 1) * height) / 20);
                i2 += Color.red(pixel);
                i4 += Color.green(pixel);
                i5 += Color.blue(pixel);
                i3++;
            }
        }
        return Color.rgb(i2 / i3, i4 / i3, i5 / i3);
    }

    public static synchronized long o(Context context) {
        long j2;
        synchronized (kg5.class) {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
            j2 = memoryInfo.totalMem;
        }
        return j2;
    }

    public static final void p(long j2, bxj bxjVar) {
        if (bxjVar == bxj.a) {
            if (ga6.h(j2) != Integer.MAX_VALUE) {
                return;
            }
            vme.c("Vertically scrollable component was measured with an infinity maximum height constraints, which is disallowed. One of the common reasons is nesting layouts like LazyColumn and Column(Modifier.verticalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyColumn scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
        } else {
            if (ga6.i(j2) != Integer.MAX_VALUE) {
                return;
            }
            vme.c("Horizontally scrollable component was measured with an infinity maximum width constraints, which is disallowed. One of the common reasons is nesting layouts like LazyRow and Row(Modifier.horizontalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyRow scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
        }
    }

    public static void q(Closeable closeable, String str) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e2) {
                Log.e("FirebaseCrashlytics", str, e2);
            }
        }
    }

    public static final long r(int i2, hq5 hq5Var) {
        oq5 oq5Var = (oq5) hq5Var;
        Context context = (Context) oq5Var.j(AndroidCompositionLocals_androidKt.b);
        Resources K = gdg.K(oq5Var);
        Resources.Theme theme = context.getTheme();
        ThreadLocal threadLocal = e3o.a;
        return c3x.f(K.getColor(i2, theme));
    }

    public static tw6 s(b7q b7qVar, fts ftsVar, maa maaVar, g7q g7qVar) {
        List list;
        so3 so3Var;
        b7qVar.getClass();
        maaVar.getClass();
        bdt I = hag.I(vsb.class);
        qdc qdcVar = b7qVar.a;
        qdcVar.getClass();
        vsb vsbVar = (vsb) qdcVar.C(I);
        b7q b7qVar2 = vsbVar.a;
        bdt I2 = hag.I(dl2.class);
        qdc qdcVar2 = b7qVar.a;
        qdcVar2.getClass();
        dl2 dl2Var = (dl2) qdcVar2.C(I2);
        bdt I3 = hag.I(nbo.class);
        qdc qdcVar3 = b7qVar.a;
        qdcVar3.getClass();
        bdt I4 = hag.I(xol.class);
        qdc qdcVar4 = b7qVar.a;
        qdcVar4.getClass();
        xol xolVar = (xol) qdcVar4.C(I4);
        bdt I5 = hag.I(tcl.class);
        qdc qdcVar5 = b7qVar.a;
        qdcVar5.getClass();
        tcl tclVar = (tcl) qdcVar5.C(I5);
        a76 a76Var = new a76(vsbVar.e(dl2Var.a), vsbVar.f);
        obo oboVar = (obo) nbo.b(maaVar).b;
        p9 p9Var = ftsVar.d;
        thr thrVar = ftsVar.c;
        bts btsVar = p9Var instanceof bts ? (bts) p9Var : null;
        if (btsVar == null || (list = btsVar.c) == null) {
            list = c5b.a;
        }
        List list2 = list;
        ywd ywdVar = (maaVar != maa.a || ((Boolean) tclVar.a.k.invoke()).booleanValue()) ? ywd.d : ywd.c;
        bdt I6 = hag.I(oco.class);
        qdc qdcVar6 = b7qVar2.a;
        qdcVar6.getClass();
        oco ocoVar = (oco) qdcVar6.C(I6);
        bdt I7 = hag.I(dpt.class);
        qdc qdcVar7 = b7qVar2.a;
        qdcVar7.getClass();
        zk7 zk7Var = new zk7(new sco(ocoVar, g7qVar, a76Var, oboVar, list2, (dpt) qdcVar7.C(I7), ywdVar));
        thrVar.getClass();
        niq niqVar = (niq) vsbVar.b.getValue();
        ConcurrentHashMap concurrentHashMap = niqVar.d;
        uhr uhrVar = niqVar.b;
        String b2 = uhrVar.b();
        File e2 = uhrVar.e(thrVar, b2);
        if (e2 == null) {
            so3Var = null;
        } else {
            so3Var = (d3i) concurrentHashMap.get(e2);
            if (so3Var == null) {
                niqVar.a(e2, thrVar, b2);
                Object obj = concurrentHashMap.get(e2);
                obj.getClass();
                so3Var = (d3i) obj;
            }
        }
        if (so3Var == null) {
            ssg.a(7, "ExoDataSources", "Illegal state of selected storage being unavailable selected=" + thrVar + ", using StubCache", null);
            so3Var = com.yandex.music.shared.player.download2.exo.b.a;
        }
        int ordinal = maaVar.ordinal();
        if (ordinal == 0) {
            tw6 b3 = vsb.b(new yae(new rjn(so3Var), xolVar), zk7Var, m(vsbVar, nbo.b(maaVar)), new kj3((so3) new yae(so3Var, xolVar), (xol) vsbVar.d.getValue(), false, true));
            b3.g = new xla(22);
            return b3;
        }
        if (ordinal != 1 && ordinal != 2 && ordinal != 3) {
            b6e.s();
            return null;
        }
        rjn rjnVar = new rjn(so3Var);
        sco m = m(vsbVar, nbo.b(maaVar));
        kj3 kj3Var = new kj3(so3Var, (xol) vsbVar.d.getValue(), true, false);
        bdt I8 = hag.I(l73.class);
        qdc qdcVar8 = b7qVar.a;
        qdcVar8.getClass();
        tw6 b4 = vsb.b(new i73(rjnVar, (l73) qdcVar8.C(I8)), zk7Var, m, kj3Var);
        b4.g = new xla(23);
        return b4;
    }

    public static final ss3 t(pjc pjcVar, nyf nyfVar, lyf lyfVar) {
        pjcVar.getClass();
        nyfVar.getClass();
        return zsd.I(new d57(nyfVar, lyfVar, pjcVar, (Continuation) null, 8));
    }

    public static voe u(int i2, long j2) {
        long j3 = i2;
        long j4 = j3 / 1000000000;
        if ((j3 ^ 1000000000) < 0 && j4 * 1000000000 != j3) {
            j4--;
        }
        long j5 = j2 + j4;
        if ((j2 ^ j5) < 0 && (j4 ^ j2) >= 0) {
            return j2 > 0 ? voe.d : voe.c;
        }
        if (j5 < -31557014167219200L) {
            return voe.c;
        }
        if (j5 > 31556889864403199L) {
            return voe.d;
        }
        long j6 = j3 % 1000000000;
        return new voe(j5, (int) (j6 + ((((j6 ^ 1000000000) & ((-j6) | j6)) >> 63) & 1000000000)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    public static int v() {
        boolean A = A();
        ?? r0 = A;
        if (C()) {
            r0 = (A ? 1 : 0) | 2;
        }
        return (Debug.isDebuggerConnected() || Debug.waitingForDebugger()) ? r0 | 4 : r0;
    }

    public static int w(Context context, String str, String str2) {
        String packageName;
        Resources resources = context.getResources();
        int i2 = context.getApplicationContext().getApplicationInfo().icon;
        if (i2 > 0) {
            try {
                packageName = context.getResources().getResourcePackageName(i2);
                if (ConstantDeviceInfo.APP_PLATFORM.equals(packageName)) {
                    packageName = context.getPackageName();
                }
            } catch (Resources.NotFoundException unused) {
                packageName = context.getPackageName();
            }
        } else {
            packageName = context.getPackageName();
        }
        return resources.getIdentifier(str, str2, packageName);
    }

    public static String x(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        for (int i2 = 0; i2 < bArr.length; i2++) {
            byte b2 = bArr[i2];
            int i3 = i2 * 2;
            char[] cArr2 = a;
            cArr[i3] = cArr2[(b2 & 255) >>> 4];
            cArr[i3 + 1] = cArr2[b2 & 15];
        }
        return new String(cArr);
    }

    public static ip3 y(b7q b7qVar, fts ftsVar, maa maaVar) {
        b7qVar.getClass();
        maaVar.getClass();
        bdt I = hag.I(vsb.class);
        qdc qdcVar = b7qVar.a;
        qdcVar.getClass();
        vsb vsbVar = (vsb) qdcVar.C(I);
        bdt I2 = hag.I(nbo.class);
        qdc qdcVar2 = b7qVar.a;
        qdcVar2.getClass();
        liq d2 = vsbVar.d(ftsVar.c);
        if (d2 == null) {
            throw new aue(null);
        }
        ip3 c2 = vsb.c(vsbVar, d2, m(vsbVar, nbo.b(maaVar)), new hl5(0, new bq3(bb6.b), d2), 24);
        if (maaVar != maa.a) {
            bdt I3 = hag.I(ssm.class);
            qdc qdcVar3 = b7qVar.a;
            qdcVar3.getClass();
            c2.g = (ssm) qdcVar3.C(I3);
        }
        return c2;
    }

    public static Intent z(Context context, u51 u51Var, zb1 zb1Var) {
        Intent intent = new Intent(context, (Class<?>) ArtistItemsActivity.class);
        u51Var.getClass();
        Intent putExtra = intent.putExtra("extra.artist", u51Var).putExtra("extra.infoType", zb1Var);
        putExtra.getClass();
        return putExtra;
    }
}
