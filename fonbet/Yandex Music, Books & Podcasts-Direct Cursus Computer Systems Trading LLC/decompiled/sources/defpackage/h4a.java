package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.VerticalAlignElement;
import androidx.compose.foundation.layout.b;
import androidx.compose.foundation.layout.d;
import androidx.fragment.app.o;
import coil.compose.ContentPainterElement;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import ru.yandex.music.R;
import ru.yandex.music.data.audio.WarningContent;
import ru.yandex.music.data.stores.CoverPath;
import ru.yandex.music.data.stores.WebPath$Storage;

/* loaded from: classes5.dex */
public abstract class h4a {
    public static final wn5 a = new wn5(new h3(17), -917604856, false);
    public static final wn5 b;
    public static final wn5 c;
    public static final wn5 d;
    public static final wn5 e;
    public static final wn5 f;
    public static final wn5 g;
    public static final wn5 h;
    public static final wn5 i;
    public static ehc j;
    public static final Object k;
    public static Method l;
    public static boolean m;

    static {
        new wn5(new bo5(1), 1676238735, false);
        new wn5(new bo5(2), 2062735357, false);
        new wn5(new bo5(3), -1689089044, false);
        b = new wn5(new jo5(6), -358802810, false);
        c = new wn5(new io5(10), -547320784, false);
        d = new wn5(new io5(11), -644702130, false);
        e = new wn5(new io5(12), 1066576237, false);
        f = new wn5(new io5(13), -545349394, false);
        new wn5(new io5(14), 234726262, false);
        new wn5(new jo5(7), 745915658, false);
        g = new wn5(new po5(15), -190124392, false);
        h = new wn5(new po5(16), 1704209494, false);
        i = new wn5(new ap5(24), -335196075, false);
        new wn5(new ap5(25), 1471776493, false);
        new wn5(new ap5(26), -1596990812, false);
        j = new ofc(23);
        k = new Object();
    }

    public static boolean A(double d2) {
        return Math.getExponent(d2) <= 1023;
    }

    public static final boolean B(o oVar) {
        if (oVar.isRemoving() || oVar.requireActivity().isFinishing()) {
            return true;
        }
        boolean z = false;
        for (o parentFragment = oVar.getParentFragment(); !z && parentFragment != null; parentFragment = parentFragment.getParentFragment()) {
            z = parentFragment.isRemoving();
        }
        return z;
    }

    public static Object C(c9c c9cVar, JSONObject jSONObject, String str, Function1 function1, ywt ywtVar) {
        if (c9cVar.b && jSONObject.has(str)) {
            return etn.Q(jSONObject, str, function1, ywtVar);
        }
        int i2 = c9cVar.a;
        if (i2 == 2) {
            return ((a9c) c9cVar).c;
        }
        if (i2 == 3) {
            return etn.Q(jSONObject, ((z8c) c9cVar).c, function1, ywtVar);
        }
        throw a8k.g(str, jSONObject);
    }

    public static Object D(t7k t7kVar, c9c c9cVar, JSONObject jSONObject, String str, arf arfVar, arf arfVar2) {
        if (c9cVar.b && jSONObject.has(str)) {
            return etn.O(t7kVar, jSONObject, str, arfVar2);
        }
        int i2 = c9cVar.a;
        if (i2 != 2) {
            if (i2 == 3) {
                return etn.O(t7kVar, jSONObject, ((z8c) c9cVar).c, arfVar2);
            }
            throw a8k.g(str, jSONObject);
        }
        try {
            return ((u8s) arfVar.getValue()).a(t7kVar, (d7f) ((a9c) c9cVar).c, jSONObject);
        } catch (z7k e2) {
            throw a8k.b(jSONObject, str, e2);
        }
    }

    public static final int E(d8t d8tVar) {
        x6k x6kVar = d8tVar.d;
        if ((x6kVar.getValue() instanceof qsv) && (d8tVar.c() instanceof tsv)) {
            return 450;
        }
        if ((x6kVar.getValue() instanceof tsv) && (d8tVar.c() instanceof qsv)) {
            return 450;
        }
        if ((!(x6kVar.getValue() instanceof rsv) || !(d8tVar.c() instanceof tsv)) && (x6kVar.getValue() instanceof tsv)) {
            d8tVar.c();
        }
        return 300;
    }

    public static szb F(t7k t7kVar, c9c c9cVar, JSONObject jSONObject, String str, uct uctVar) {
        if (c9cVar.b && jSONObject.has(str)) {
            return e5f.b(t7kVar, jSONObject, str, uctVar, bcx.i, bcx.h);
        }
        int i2 = c9cVar.a;
        if (i2 == 2) {
            return (szb) ((a9c) c9cVar).c;
        }
        if (i2 == 3) {
            return e5f.a(t7kVar, jSONObject, ((z8c) c9cVar).c, uctVar);
        }
        throw a8k.g(str, jSONObject);
    }

    public static szb G(t7k t7kVar, c9c c9cVar, JSONObject jSONObject, String str, uct uctVar, Function1 function1) {
        ns9 ns9Var = bcx.h;
        if (c9cVar.b && jSONObject.has(str)) {
            return e5f.b(t7kVar, jSONObject, str, uctVar, function1, ns9Var);
        }
        int i2 = c9cVar.a;
        if (i2 == 2) {
            return (szb) ((a9c) c9cVar).c;
        }
        if (i2 == 3) {
            return e5f.b(t7kVar, jSONObject, ((z8c) c9cVar).c, uctVar, function1, ns9Var);
        }
        throw a8k.g(str, jSONObject);
    }

    public static szb H(t7k t7kVar, c9c c9cVar, JSONObject jSONObject, String str, uct uctVar, Function1 function1, ywt ywtVar) {
        if (c9cVar.b && jSONObject.has(str)) {
            return e5f.b(t7kVar, jSONObject, str, uctVar, function1, ywtVar);
        }
        int i2 = c9cVar.a;
        if (i2 == 2) {
            return (szb) ((a9c) c9cVar).c;
        }
        if (i2 == 3) {
            return e5f.b(t7kVar, jSONObject, ((z8c) c9cVar).c, uctVar, function1, ywtVar);
        }
        throw a8k.g(str, jSONObject);
    }

    public static szb I(t7k t7kVar, c9c c9cVar, JSONObject jSONObject, String str, ywt ywtVar) {
        ox8 ox8Var = vct.c;
        s3f s3fVar = bcx.i;
        if (c9cVar.b && jSONObject.has(str)) {
            return e5f.b(t7kVar, jSONObject, str, ox8Var, s3fVar, ywtVar);
        }
        int i2 = c9cVar.a;
        if (i2 == 2) {
            return (szb) ((a9c) c9cVar).c;
        }
        if (i2 == 3) {
            return e5f.b(t7kVar, jSONObject, ((z8c) c9cVar).c, ox8Var, s3fVar, ywtVar);
        }
        throw a8k.g(str, jSONObject);
    }

    public static List J(t7k t7kVar, c9c c9cVar, JSONObject jSONObject, String str, arf arfVar, arf arfVar2, mag magVar) {
        if (c9cVar.b && jSONObject.has(str)) {
            return etn.S(t7kVar, jSONObject, str, arfVar2, magVar);
        }
        int i2 = c9cVar.a;
        if (i2 != 2) {
            if (i2 == 3) {
                return etn.S(t7kVar, jSONObject, ((z8c) c9cVar).c, arfVar2, magVar);
            }
            throw a8k.g(str, jSONObject);
        }
        List list = (List) ((a9c) c9cVar).c;
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        u8s u8sVar = (u8s) arfVar.getValue();
        for (int i3 = 0; i3 < size; i3++) {
            Object M = M(t7kVar, (d7f) list.get(i3), jSONObject, u8sVar);
            if (M != null) {
                arrayList.add(M);
            }
        }
        if (magVar.b(arrayList)) {
            return arrayList;
        }
        throw a8k.e(jSONObject, str, arrayList);
    }

    public static Object K(t7k t7kVar, c9c c9cVar, JSONObject jSONObject, String str, arf arfVar, arf arfVar2) {
        if (c9cVar.b && jSONObject.has(str)) {
            return etn.U(t7kVar, jSONObject, str, arfVar2);
        }
        int i2 = c9cVar.a;
        if (i2 == 2) {
            return M(t7kVar, (d7f) ((a9c) c9cVar).c, jSONObject, (u8s) arfVar.getValue());
        }
        if (i2 == 3) {
            return etn.U(t7kVar, jSONObject, ((z8c) c9cVar).c, arfVar2);
        }
        return null;
    }

    public static Object L(c9c c9cVar, t7k t7kVar, String str, Function1 function1, JSONObject jSONObject) {
        if (c9cVar.b && jSONObject.has(str)) {
            return etn.W(t7kVar, jSONObject, str, function1);
        }
        int i2 = c9cVar.a;
        if (i2 == 2) {
            return ((a9c) c9cVar).c;
        }
        if (i2 == 3) {
            return etn.W(t7kVar, jSONObject, ((z8c) c9cVar).c, function1);
        }
        return null;
    }

    public static Object M(t7k t7kVar, d7f d7fVar, JSONObject jSONObject, u8s u8sVar) {
        try {
            return u8sVar.a(t7kVar, d7fVar, jSONObject);
        } catch (z7k e2) {
            t7kVar.a().a(e2);
            return null;
        }
    }

    public static szb N(t7k t7kVar, c9c c9cVar, JSONObject jSONObject, String str, uct uctVar) {
        s3f s3fVar = bcx.i;
        if (c9cVar.b && jSONObject.has(str)) {
            return e5f.e(t7kVar, jSONObject, str, uctVar, s3fVar, bcx.h, null);
        }
        int i2 = c9cVar.a;
        if (i2 == 2) {
            return (szb) ((a9c) c9cVar).c;
        }
        if (i2 == 3) {
            return e5f.d(t7kVar, jSONObject, ((z8c) c9cVar).c, uctVar, s3fVar);
        }
        return null;
    }

    public static szb O(t7k t7kVar, c9c c9cVar, JSONObject jSONObject, String str, uct uctVar, Function1 function1) {
        if (c9cVar.b && jSONObject.has(str)) {
            return e5f.e(t7kVar, jSONObject, str, uctVar, function1, bcx.h, null);
        }
        int i2 = c9cVar.a;
        if (i2 == 2) {
            return (szb) ((a9c) c9cVar).c;
        }
        if (i2 == 3) {
            return e5f.d(t7kVar, jSONObject, ((z8c) c9cVar).c, uctVar, function1);
        }
        return null;
    }

    public static szb P(t7k t7kVar, c9c c9cVar, JSONObject jSONObject, String str, uct uctVar, Function1 function1, szb szbVar) {
        ns9 ns9Var = bcx.h;
        if (c9cVar.b && jSONObject.has(str)) {
            return e5f.e(t7kVar, jSONObject, str, uctVar, function1, ns9Var, szbVar);
        }
        int i2 = c9cVar.a;
        if (i2 == 2) {
            return (szb) ((a9c) c9cVar).c;
        }
        if (i2 == 3) {
            return e5f.e(t7kVar, jSONObject, ((z8c) c9cVar).c, uctVar, function1, ns9Var, szbVar);
        }
        return null;
    }

    public static szb Q(t7k t7kVar, c9c c9cVar, JSONObject jSONObject, String str, uct uctVar, Function1 function1, ywt ywtVar) {
        if (c9cVar.b && jSONObject.has(str)) {
            return e5f.e(t7kVar, jSONObject, str, uctVar, function1, ywtVar, null);
        }
        int i2 = c9cVar.a;
        if (i2 == 2) {
            return (szb) ((a9c) c9cVar).c;
        }
        if (i2 == 3) {
            return e5f.e(t7kVar, jSONObject, ((z8c) c9cVar).c, uctVar, function1, ywtVar, null);
        }
        return null;
    }

    public static szb R(t7k t7kVar, c9c c9cVar, JSONObject jSONObject, String str, uct uctVar, Function1 function1, ywt ywtVar, szb szbVar) {
        if (c9cVar.b && jSONObject.has(str)) {
            return e5f.e(t7kVar, jSONObject, str, uctVar, function1, ywtVar, szbVar);
        }
        int i2 = c9cVar.a;
        if (i2 == 2) {
            return (szb) ((a9c) c9cVar).c;
        }
        if (i2 == 3) {
            return e5f.e(t7kVar, jSONObject, ((z8c) c9cVar).c, uctVar, function1, ywtVar, szbVar);
        }
        return null;
    }

    public static vzb S(t7k t7kVar, c9c c9cVar, JSONObject jSONObject, uct uctVar, mag magVar) {
        if (c9cVar.b && jSONObject.has("colors")) {
            return e5f.f(t7kVar, jSONObject, "colors", uctVar, magVar);
        }
        int i2 = c9cVar.a;
        if (i2 == 2) {
            return (vzb) ((a9c) c9cVar).c;
        }
        if (i2 == 3) {
            return e5f.f(t7kVar, jSONObject, ((z8c) c9cVar).c, uctVar, magVar);
        }
        return null;
    }

    public static List T(t7k t7kVar, c9c c9cVar, JSONObject jSONObject, mag magVar) {
        if (c9cVar.b && jSONObject.has("transition_triggers")) {
            return etn.a0(t7kVar, jSONObject, "transition_triggers", magVar);
        }
        int i2 = c9cVar.a;
        if (i2 == 2) {
            return (List) ((a9c) c9cVar).c;
        }
        if (i2 == 3) {
            return etn.a0(t7kVar, jSONObject, ((z8c) c9cVar).c, magVar);
        }
        return null;
    }

    public static List U(t7k t7kVar, c9c c9cVar, JSONObject jSONObject, jyr jyrVar, jyr jyrVar2, mag magVar) {
        if (c9cVar.b && jSONObject.has("color_map")) {
            return etn.Z(t7kVar, jSONObject, "color_map", jyrVar2, magVar);
        }
        int i2 = c9cVar.a;
        if (i2 != 2) {
            if (i2 == 3) {
                return etn.Z(t7kVar, jSONObject, ((z8c) c9cVar).c, jyrVar2, magVar);
            }
            return null;
        }
        List list = (List) ((a9c) c9cVar).c;
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        u8s u8sVar = (u8s) jyrVar.getValue();
        for (int i3 = 0; i3 < size; i3++) {
            Object M = M(t7kVar, (d7f) list.get(i3), jSONObject, u8sVar);
            if (M != null) {
                arrayList.add(M);
            }
        }
        if (magVar.b(arrayList)) {
            return arrayList;
        }
        t7kVar.a().a(a8k.e(jSONObject, "color_map", arrayList));
        return null;
    }

    public static List V(t7k t7kVar, c9c c9cVar, JSONObject jSONObject, String str, arf arfVar, arf arfVar2) {
        if (c9cVar.b && jSONObject.has(str)) {
            return etn.Y(t7kVar, jSONObject, str, arfVar2);
        }
        int i2 = c9cVar.a;
        if (i2 != 2) {
            if (i2 == 3) {
                return etn.Y(t7kVar, jSONObject, ((z8c) c9cVar).c, arfVar2);
            }
            return null;
        }
        List list = (List) ((a9c) c9cVar).c;
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        u8s u8sVar = (u8s) arfVar.getValue();
        for (int i3 = 0; i3 < size; i3++) {
            Object M = M(t7kVar, (d7f) list.get(i3), jSONObject, u8sVar);
            if (M != null) {
                arrayList.add(M);
            }
        }
        return arrayList;
    }

    public static final void W(zt3 zt3Var, Continuation continuation, boolean z) {
        Object f2;
        Object obj = zt3.g.get(zt3Var);
        Throwable e2 = zt3Var.e(obj);
        if (e2 != null) {
            r7o r7oVar = z7o.b;
            f2 = new t7o(e2);
        } else {
            r7o r7oVar2 = z7o.b;
            f2 = zt3Var.f(obj);
        }
        if (!z) {
            continuation.resumeWith(f2);
            return;
        }
        continuation.getClass();
        v98 v98Var = (v98) continuation;
        cg6 cg6Var = v98Var.e;
        Object obj2 = v98Var.g;
        CoroutineContext context = cg6Var.getContext();
        Object c2 = nfs.c(context, obj2);
        kit c3 = c2 != nfs.a ? bm6.c(cg6Var, context, c2) : null;
        try {
            cg6Var.resumeWith(f2);
            if (c3 == null || c3.q0()) {
                nfs.a(context, c2);
            }
        } catch (Throwable th) {
            if (c3 == null || c3.q0()) {
                nfs.a(context, c2);
            }
            throw th;
        }
    }

    public static final oq X(zv zvVar) {
        zvVar.getClass();
        ArrayList arrayList = new ArrayList();
        String str = zvVar.y;
        String str2 = zvVar.z;
        String str3 = zvVar.x;
        if (str != null && str3 != null && str2 != null) {
            List D = ff7.D(str);
            List D2 = ff7.D(str3);
            List E = ff7.E(str2);
            List E2 = ff7.E(zvVar.A);
            List E3 = ff7.E(zvVar.B);
            int min = Math.min(D2.size(), D.size());
            for (int i2 = 0; i2 < min; i2++) {
                String str4 = (String) D2.get(i2);
                String str5 = (String) D.get(i2);
                String upperCase = ((String) D.get(i2)).toUpperCase(Locale.ROOT);
                upperCase.getClass();
                List B = q7g.B((String) CollectionsKt.S(E, i2));
                B.getClass();
                String str6 = (String) CollectionsKt.S(E2, i2);
                WebPath$Storage webPath$Storage = WebPath$Storage.AVATARS;
                arrayList.add(new zp2(str4, str5, upperCase, null, null, B, men.x(str6, webPath$Storage), men.x((String) CollectionsKt.S(E3, i2), webPath$Storage), 24));
            }
        }
        String str7 = zvVar.c;
        String str8 = zvVar.a;
        String str9 = zvVar.r;
        boolean z = zvVar.v;
        String str10 = zvVar.m;
        String str11 = zvVar.n;
        WarningContent valueOf = WarningContent.valueOf(zvVar.l);
        String str12 = zvVar.h;
        String str13 = zvVar.i;
        String str14 = zvVar.j;
        int i3 = zvVar.g;
        String str15 = zvVar.k;
        CoverPath x = men.x(zvVar.f, WebPath$Storage.AVATARS);
        int i4 = zvVar.o;
        boolean z2 = zvVar.p;
        CoverPath x2 = men.x(zvVar.q, WebPath$Storage.ENTITY_BACKGROUND_IMG);
        String str16 = zvVar.t;
        List B2 = q7g.B(zvVar.u);
        B2.getClass();
        oq oqVar = new oq(str7, str8, str9, z, str10, str11, valueOf, str12, str13, str14, i3, str15, arrayList, x, i4, z2, x2, str16, B2, zvVar.s, null, t7g.q(zvVar.e), zvVar.d, zvVar.w, 211845248);
        tfs tfsVar = wc7.a;
        oqVar.E = wc7.a.b(zvVar.b);
        return oqVar;
    }

    public static final long Y(long j2, long j3) {
        int c2;
        int e2 = rds.e(j2);
        int d2 = rds.d(j2);
        if ((rds.e(j3) < rds.d(j2)) && (rds.e(j2) < rds.d(j3))) {
            if ((rds.e(j3) <= rds.e(j2)) && (rds.d(j2) <= rds.d(j3))) {
                e2 = rds.e(j3);
                d2 = e2;
            } else {
                if ((rds.e(j2) <= rds.e(j3)) && (rds.d(j3) <= rds.d(j2))) {
                    c2 = rds.c(j3);
                } else {
                    int e3 = rds.e(j3);
                    if (e2 >= rds.d(j3) || e3 > e2) {
                        d2 = rds.e(j3);
                    } else {
                        e2 = rds.e(j3);
                        c2 = rds.c(j3);
                    }
                }
                d2 -= c2;
            }
        } else if (d2 > rds.e(j3)) {
            e2 -= rds.c(j3);
            c2 = rds.c(j3);
            d2 -= c2;
        }
        return y5g.P(e2, d2);
    }

    public static final void Z(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i2) {
        if (i2 < 0 || byteBuffer2.remaining() < i2 || byteBuffer3.remaining() < i2 || byteBuffer.remaining() < i2) {
            xq0.x("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
            return;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            byteBuffer.put((byte) (byteBuffer2.get() ^ byteBuffer3.get()));
        }
    }

    public static final void a(is1 is1Var, String str, yci yciVar, Function1 function1, Function1 function12, g40 g40Var, jd6 jd6Var, float f2, m85 m85Var, int i2, hq5 hq5Var, int i3, int i4) {
        int i5;
        Function1 function13;
        Function1 function14;
        int i6;
        int i7;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-421592773);
        if ((i3 & 14) == 0) {
            i5 = (oq5Var.f(is1Var) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 112) == 0) {
            i5 |= oq5Var.f(str) ? 32 : 16;
        }
        if ((i3 & 896) == 0) {
            i5 |= oq5Var.f(yciVar) ? 256 : 128;
        }
        if ((i3 & 7168) == 0) {
            function13 = function1;
            i5 |= oq5Var.h(function13) ? 2048 : 1024;
        } else {
            function13 = function1;
        }
        if ((i3 & 57344) == 0) {
            function14 = function12;
            i5 |= oq5Var.h(function14) ? 16384 : RemoteCameraConfig.Notification.ID;
        } else {
            function14 = function12;
        }
        if ((i3 & 458752) == 0) {
            i5 |= oq5Var.f(g40Var) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        if ((i3 & 3670016) == 0) {
            i5 |= oq5Var.f(jd6Var) ? 1048576 : 524288;
        }
        if ((i3 & 29360128) == 0) {
            i5 |= oq5Var.c(f2) ? 8388608 : RemoteCameraConfig.Camera.BITRATE;
        }
        if ((234881024 & i3) == 0) {
            i5 |= oq5Var.f(m85Var) ? 67108864 : 33554432;
        }
        if ((i3 & 1879048192) == 0) {
            i5 |= oq5Var.d(i2) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
        }
        if ((i4 & 14) == 0) {
            i6 = 57344;
            i7 = i4 | (oq5Var.g(true) ? 4 : 2);
        } else {
            i6 = 57344;
            i7 = i4;
        }
        if ((1533916891 & i5) == 306783378 && (i7 & 11) == 2 && oq5Var.z()) {
            oq5Var.S();
        } else {
            rce a2 = zvt.a(is1Var.a, jd6Var, oq5Var);
            int i8 = i5 >> 3;
            int i9 = i5 >> 6;
            int i10 = i9 & i6;
            fs1 E = yd5.E(a2, is1Var.c, function13, function14, jd6Var, i2, is1Var.b, oq5Var, (i8 & 7168) | (i8 & 896) | 72 | i10 | ((i5 >> 12) & 458752), 0);
            bnq bnqVar = a2.y;
            f(bnqVar instanceof ka6 ? yciVar.f((yci) bnqVar) : yciVar, E, str, g40Var, jd6Var, f2, m85Var, oq5Var, ((i5 << 3) & 896) | (i9 & 7168) | i10 | (i9 & 458752) | (i9 & 3670016) | ((i7 << 21) & 29360128));
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new ur1(is1Var, str, yciVar, function1, function12, g40Var, jd6Var, f2, m85Var, i2, i3, i4);
        }
    }

    public static final byte[] a0(int i2, int i3, int i4, byte[] bArr, byte[] bArr2) {
        if (i4 < 0 || bArr.length - i4 < i2 || bArr2.length - i4 < i3) {
            xq0.x("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
            return null;
        }
        byte[] bArr3 = new byte[i4];
        for (int i5 = 0; i5 < i4; i5++) {
            bArr3[i5] = (byte) (bArr[i5 + i2] ^ bArr2[i5 + i3]);
        }
        return bArr3;
    }

    public static final void b(Object obj, String str, cce cceVar, yci yciVar, Function1 function1, Function1 function12, g40 g40Var, jd6 jd6Var, float f2, m85 m85Var, int i2, hq5 hq5Var, int i3, int i4) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.a0(-2030202961);
        is1 is1Var = new is1(obj, ild.j, cceVar);
        int i5 = i3 >> 3;
        a(is1Var, str, yciVar, function1, function12, g40Var, jd6Var, f2, m85Var, i2, oq5Var, (i3 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | (3670016 & i5) | (29360128 & i5) | (i5 & 234881024) | ((i4 << 27) & 1879048192), 6);
        oq5Var.p(false);
    }

    public static final byte[] b0(byte[] bArr, byte[] bArr2) {
        if (bArr.length == bArr2.length) {
            return a0(0, 0, bArr.length, bArr, bArr2);
        }
        xq0.x("The lengths of x and y should match.");
        return null;
    }

    public static final void c(Object obj, String str, cce cceVar, yci yciVar, w4k w4kVar, w4k w4kVar2, w4k w4kVar3, Function1 function1, Function1 function12, Function1 function13, g40 g40Var, jd6 jd6Var, float f2, int i2, hq5 hq5Var, int i3, int i4) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.a0(-245964807);
        is1 is1Var = new is1(obj, ild.j, cceVar);
        xkn xknVar = zvt.b;
        int i5 = i4 << 15;
        a(is1Var, str, yciVar, (w4kVar == null && w4kVar2 == null && w4kVar3 == null) ? rq1.u : new lma(28, w4kVar, w4kVar3, w4kVar2), (function1 == null && function12 == null && function13 == null) ? null : new lma(27, function1, function12, function13), g40Var, jd6Var, f2, null, i2, oq5Var, (i3 & 112) | ((i3 >> 3) & 896) | (458752 & i5) | (3670016 & i5) | (29360128 & i5) | (234881024 & i5) | (i5 & 1879048192), 6);
        oq5Var.p(false);
    }

    public static final void d(vb4 vb4Var, hq5 hq5Var, int i2) {
        vb4Var.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-215701357);
        int i3 = (oq5Var.h(vb4Var) ? 4 : 2) | i2;
        if ((i3 & 3) != 2 || !oq5Var.z()) {
            vci vciVar = vci.a;
            u1g.l(oq5Var, d.e(vciVar, 16));
            oq5Var.Z(-1130568666);
            ListIterator listIterator = vb4Var.b.listIterator(0);
            int i4 = 0;
            while (true) {
                ezd ezdVar = (ezd) listIterator;
                if (!ezdVar.hasNext()) {
                    oq5Var.p(false);
                    u1g.l(oq5Var, d.e(vciVar, 40));
                    break;
                }
                Object next = ezdVar.next();
                int i5 = i4 + 1;
                if (i4 < 0) {
                    u75.n();
                    throw null;
                }
                n((tb4) next, vb4Var, i4 == 0 ? a.k(vciVar, true, null) : vciVar, oq5Var, (i3 << 3) & 112);
                i4 = i5;
            }
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new q2(vb4Var, i2, 25);
        }
    }

    public static final void e(jz4 jz4Var, bz4 bz4Var, qnq qnqVar, hq5 hq5Var, int i2) {
        jz4Var.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(190145300);
        int i3 = i2 | (oq5Var.h(jz4Var) ? 4 : 2) | (oq5Var.f(bz4Var) ? 32 : 16) | (oq5Var.h(qnqVar) ? 256 : 128);
        if (oq5Var.P(i3 & 1, (i3 & 147) != 146)) {
            fvf a2 = hvf.a(0, 0, oq5Var, 0, 3);
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (K == kjnVar) {
                K = szf.g0(new cma(0));
                oq5Var.k0(K);
            }
            aqi aqiVar = (aqi) K;
            float i4 = uwf.i(oq5Var);
            ogp.g.f(ogp.r().d(), oq5Var, 64);
            boolean c2 = oq5Var.c(i4);
            Object K2 = oq5Var.K();
            if (c2 || K2 == kjnVar) {
                K2 = new kz4(aqiVar, i4, 0);
                oq5Var.k0(K2);
            }
            q6k.c(a2, jz4Var, (Function1) K2, ild.C(18294985, new lz4(jz4Var, i4, aqiVar, a2, bz4Var, qnqVar, 0), oq5Var), oq5Var, ((i3 << 3) & 112) | 3072);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new sh1(jz4Var, bz4Var, qnqVar, i2, 20);
        }
    }

    public static final void f(yci yciVar, fs1 fs1Var, String str, g40 g40Var, jd6 jd6Var, float f2, m85 m85Var, hq5 hq5Var, int i2) {
        int i3;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(777774312);
        if ((i2 & 14) == 0) {
            i3 = (oq5Var.f(yciVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 112) == 0) {
            i3 |= oq5Var.f(fs1Var) ? 32 : 16;
        }
        if ((i2 & 896) == 0) {
            i3 |= oq5Var.f(str) ? 256 : 128;
        }
        if ((i2 & 7168) == 0) {
            i3 |= oq5Var.f(g40Var) ? 2048 : 1024;
        }
        if ((57344 & i2) == 0) {
            i3 |= oq5Var.f(jd6Var) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((458752 & i2) == 0) {
            i3 |= oq5Var.c(f2) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        if ((3670016 & i2) == 0) {
            i3 |= oq5Var.f(m85Var) ? 1048576 : 524288;
        }
        if ((29360128 & i2) == 0) {
            i3 |= oq5Var.g(true) ? 8388608 : RemoteCameraConfig.Camera.BITRATE;
        }
        if ((i3 & 23967451) == 4793490 && oq5Var.z()) {
            oq5Var.S();
        } else {
            xkn xknVar = zvt.b;
            yci f3 = xp3.v(str != null ? nfp.b(yciVar, false, new r23(str, 11)) : yciVar).f(new ContentPainterElement(fs1Var, g40Var, jd6Var, f2, m85Var));
            r30 r30Var = r30.f;
            oq5Var.a0(544976794);
            int i4 = oq5Var.P;
            yci H = vnj.H(oq5Var, f3);
            androidx.compose.runtime.internal.a l2 = oq5Var.l();
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.a0(1405779621);
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(new vr1(0, grbVar));
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, r30Var, wp5.f);
            g0g.U(oq5Var, l2, wp5.e);
            g0g.U(oq5Var, H, wp5.d);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var, i4, kb5Var);
            }
            f1d.u(oq5Var, true, false, false);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new wr1(yciVar, fs1Var, str, g40Var, jd6Var, f2, m85Var, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void g(final un6 un6Var, final yci yciVar, Function2 function2, Function2 function22, hq5 hq5Var, final int i2, final int i3) {
        int i4;
        Function2 function23;
        int i5;
        un6 un6Var2;
        final Function2 function24;
        final Function2 function25;
        xmn r;
        Function2 function26;
        un6Var.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1907113897);
        if ((i2 & 6) == 0) {
            i4 = (oq5Var.f(un6Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= oq5Var.f(yciVar) ? 32 : 16;
        }
        int i6 = i3 & 4;
        if (i6 != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            function23 = function2;
            i4 |= oq5Var.h(function23) ? 256 : 128;
            i5 = i4 | 3072;
            if ((i5 & 1171) == 1170 || !oq5Var.z()) {
                final Function2 function27 = i6 == 0 ? up6.b : function23;
                final wn5 C = ild.C(-1676109886, new hn6(un6Var, 1), oq5Var);
                if (!((Boolean) oq5Var.j(koe.a)).booleanValue()) {
                    oq5Var.Z(1003185520);
                    qo6 qo6Var = qo6.d;
                    gce gceVar = gce.d;
                    Object K = oq5Var.K();
                    if (K == gq5.a) {
                        K = new rn6(1);
                        oq5Var.k0(K);
                    }
                    swf.d(qo6Var, gceVar, androidx.compose.ui.draw.a.c(yciVar, (Function1) K), null, 0L, 0L, false, oq5Var, 54, 120);
                    oq5Var.p(false);
                    r = oq5Var.r();
                    if (r != null) {
                        final int i7 = 0;
                        function26 = new Function2() { // from class: wn6
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                switch (i7) {
                                    case 0:
                                        ((Integer) obj2).getClass();
                                        h4a.g(un6Var, yciVar, function27, C, (hq5) obj, rvf.R(i2 | 1), i3);
                                        break;
                                    default:
                                        ((Integer) obj2).getClass();
                                        h4a.g(un6Var, yciVar, function27, C, (hq5) obj, rvf.R(i2 | 1), i3);
                                        break;
                                }
                                return Unit.a;
                            }
                        };
                        r.d = function26;
                        return;
                    }
                    return;
                }
                un6Var2 = un6Var;
                Function2 function28 = function27;
                oq5Var.Z(1001749817);
                oq5Var.p(false);
                oq5Var = oq5Var;
                w1g.j(un6Var2.b, null, yciVar, null, null, b2c.f, hd6.a, 0.0f, null, 0, ild.C(1678101193, new ar(25, function28, C), oq5Var), oq5Var, ((i5 << 3) & 896) | 1769520, 920);
                function24 = function28;
                function25 = C;
            } else {
                oq5Var.S();
                un6Var2 = un6Var;
                function24 = function23;
                function25 = function22;
            }
            r = oq5Var.r();
            if (r != null) {
                final int i8 = 1;
                final un6 un6Var3 = un6Var2;
                function26 = new Function2() { // from class: wn6
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        switch (i8) {
                            case 0:
                                ((Integer) obj2).getClass();
                                h4a.g(un6Var3, yciVar, function24, function25, (hq5) obj, rvf.R(i2 | 1), i3);
                                break;
                            default:
                                ((Integer) obj2).getClass();
                                h4a.g(un6Var3, yciVar, function24, function25, (hq5) obj, rvf.R(i2 | 1), i3);
                                break;
                        }
                        return Unit.a;
                    }
                };
                r.d = function26;
                return;
            }
            return;
        }
        function23 = function2;
        i5 = i4 | 3072;
        if ((i5 & 1171) == 1170) {
        }
        if (i6 == 0) {
        }
        final Function2 C2 = ild.C(-1676109886, new hn6(un6Var, 1), oq5Var);
        if (!((Boolean) oq5Var.j(koe.a)).booleanValue()) {
        }
    }

    public static final void h(ace aceVar, yci yciVar, hq5 hq5Var, int i2) {
        int i3;
        boolean z;
        aceVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(2136285170);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? oq5Var.f(aceVar) : oq5Var.h(aceVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if (((i3 | 48) & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
        } else {
            kfh d2 = ug3.d(b2c.b, false);
            int i4 = oq5Var.P;
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
            g0g.U(oq5Var, d2, wp5.f);
            g0g.U(oq5Var, l2, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var, i4, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            if (aceVar instanceof zbe) {
                oq5Var.Z(-897851783);
                irf.r(((zbe) aceVar).a, null, null, null, null, 0.0f, null, oq5Var, 48, 124);
                oq5Var.p(false);
            } else if (aceVar.equals(ybe.a)) {
                oq5Var.Z(-897659614);
                swf.e(0, 1, oq5Var, null);
                oq5Var.p(false);
            } else {
                if (!(aceVar instanceof xbe)) {
                    throw vz1.i(oq5Var, 1910698009, false);
                }
                oq5Var.Z(-897556291);
                yciVar = vciVar;
                z = true;
                swf.d(qo6.d, gce.d, null, null, 0L, 0L, false, oq5Var, 48, 124);
                oq5Var = oq5Var;
                oq5Var.p(false);
                oq5Var.p(z);
            }
            yciVar = vciVar;
            z = true;
            oq5Var.p(z);
        }
        yci yciVar2 = yciVar;
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new z2(aceVar, yciVar2, i2, 24);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void i(Integer num, Object obj, yci yciVar, boolean z, boolean z2, boolean z3, hq5 hq5Var, int i2, int i3) {
        int i4;
        yci yciVar2;
        int i5;
        boolean z4;
        int i6;
        yci yciVar3;
        boolean z5;
        xmn r;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-442642022);
        if ((i2 & 6) == 0) {
            i4 = (oq5Var.f(num) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= oq5Var.h(obj) ? 32 : 16;
        }
        int i7 = i3 & 4;
        if (i7 != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            yciVar2 = yciVar;
            i4 |= oq5Var.f(yciVar2) ? 256 : 128;
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else if ((i2 & 3072) == 0) {
                z4 = z;
                i4 |= oq5Var.g(z4) ? 2048 : 1024;
                if ((i2 & 24576) == 0) {
                    i4 |= oq5Var.g(z2) ? 16384 : RemoteCameraConfig.Notification.ID;
                }
                if ((196608 & i2) == 0) {
                    i4 |= oq5Var.g(z3) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
                }
                i6 = i4;
                if ((74899 & i6) == 74898 || !oq5Var.z()) {
                    vci vciVar = vci.a;
                    yciVar3 = i7 != 0 ? vciVar : yciVar2;
                    if (i5 != 0) {
                        z4 = false;
                    }
                    if (z2) {
                        hz2 hz2Var = b2c.l;
                        oq5Var.a0(693286680);
                        nho a2 = lho.a(qx0.a, hz2Var, oq5Var, 48);
                        oq5Var.a0(-1323940314);
                        int i8 = oq5Var.P;
                        androidx.compose.runtime.internal.a l2 = oq5Var.l();
                        xp5.T.getClass();
                        grb grbVar = wp5.b;
                        wn5 A = ghh.A(yciVar3);
                        oq5Var.d0();
                        if (oq5Var.O) {
                            oq5Var.k(grbVar);
                        } else {
                            oq5Var.n0();
                        }
                        g0g.U(oq5Var, a2, wp5.f);
                        g0g.U(oq5Var, l2, wp5.e);
                        kb5 kb5Var = wp5.g;
                        if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i8))) {
                            ouj.x(i8, oq5Var, i8, kb5Var);
                        }
                        A.invoke(new lrq(oq5Var), oq5Var, 0);
                        oq5Var.a0(2058660585);
                        oq5Var.a0(-1710999514);
                        if (z3) {
                            oq5Var.a0(-1710998367);
                            if (num != null) {
                                m((i6 >> 3) & 896, 2, oq5Var, null, rvf.M(num.intValue(), oq5Var), z4);
                            }
                            z5 = false;
                            oq5Var.p(false);
                            oq5Var.a0(-862651793);
                            u3r u3rVar = (u3r) oq5Var.j(bfs.c);
                            oq5Var.p(false);
                            u1g.l(oq5Var, d.r(vciVar, u3rVar.c));
                        } else {
                            z5 = false;
                        }
                        oq5Var.p(z5);
                        boolean z6 = z4;
                        j(num, obj, null, z6, 0L, oq5Var, i6 & 7294);
                        z4 = z6;
                        oq5Var = oq5Var;
                        k5r.s(oq5Var, z5, true, z5, z5);
                    }
                } else {
                    oq5Var.S();
                    yciVar3 = yciVar2;
                }
                boolean z7 = z4;
                r = oq5Var.r();
                if (r != null) {
                    r.d = new q73(num, obj, yciVar3, z7, z2, z3, i2, i3);
                    return;
                }
                return;
            }
            z4 = z;
            if ((i2 & 24576) == 0) {
            }
            if ((196608 & i2) == 0) {
            }
            i6 = i4;
            if ((74899 & i6) == 74898) {
            }
            vci vciVar2 = vci.a;
            if (i7 != 0) {
            }
            if (i5 != 0) {
            }
            if (z2) {
            }
            boolean z72 = z4;
            r = oq5Var.r();
            if (r != null) {
            }
        }
        yciVar2 = yciVar;
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        z4 = z;
        if ((i2 & 24576) == 0) {
        }
        if ((196608 & i2) == 0) {
        }
        i6 = i4;
        if ((74899 & i6) == 74898) {
        }
        vci vciVar22 = vci.a;
        if (i7 != 0) {
        }
        if (i5 != 0) {
        }
        if (z2) {
        }
        boolean z722 = z4;
        r = oq5Var.r();
        if (r != null) {
        }
    }

    public static final void j(Integer num, Object obj, yci yciVar, boolean z, long j2, hq5 hq5Var, int i2) {
        int i3;
        int i4;
        yci yciVar2;
        long j3;
        long j4;
        oq5 oq5Var;
        yci yciVar3;
        long j5;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-1757086545);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var2.f(num) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var2.h(obj) ? 32 : 16;
        }
        int i5 = i3 | 384;
        if ((i2 & 3072) == 0) {
            i5 |= oq5Var2.g(z) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i5 |= RemoteCameraConfig.Notification.ID;
        }
        if ((i5 & 9363) == 9362 && oq5Var2.z()) {
            oq5Var2.S();
            yciVar3 = yciVar;
            j5 = j2;
            oq5Var = oq5Var2;
        } else {
            oq5Var2.U();
            if ((i2 & 1) == 0 || oq5Var2.y()) {
                oq5Var2.a0(118080530);
                h95 h95Var = (h95) oq5Var2.j(bfs.a);
                oq5Var2.p(false);
                long j6 = h95Var.a;
                i4 = i5 & (-57345);
                yciVar2 = vci.a;
                j3 = j6;
            } else {
                oq5Var2.S();
                i4 = i5 & (-57345);
                yciVar2 = yciVar;
                j3 = j2;
            }
            oq5Var2.q();
            String u = u(num, obj, oq5Var2);
            oq5Var2.a0(-662919159);
            if (z) {
                oq5Var2.a0(118080530);
                h95 h95Var2 = (h95) oq5Var2.j(bfs.a);
                oq5Var2.p(false);
                j4 = h95Var2.b;
            } else {
                j4 = j3;
            }
            oq5Var2.p(false);
            tqc tqcVar = z ? tqc.p : tqc.m;
            oq5Var2.a0(105784523);
            agr agrVar = bfs.b;
            tdt tdtVar = (tdt) oq5Var2.j(agrVar);
            oq5Var2.p(false);
            ges gesVar = tdtVar.a;
            oq5Var2.a0(105784523);
            tdt tdtVar2 = (tdt) oq5Var2.j(agrVar);
            oq5Var2.p(false);
            oq5Var = oq5Var2;
            yci yciVar4 = yciVar2;
            wcs.b(u, yciVar4, j4, 0L, tqcVar, 0L, new o9s(5), 0L, 0, false, 0, 0, ges.b(gesVar, 0L, tdtVar2.b, null, null, 0L, 0, 0L, null, null, 0, 0, 16777213), oq5Var, (i4 >> 3) & 112, 0, 64984);
            yciVar3 = yciVar4;
            j5 = j3;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new u73(num, obj, yciVar3, z, j5, i2);
        }
    }

    public static final void k(int i2, String str, int i3, int i4, int i5, yci yciVar, hq5 hq5Var, int i6) {
        yci yciVar2;
        str.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-237966134);
        int i7 = i6 | (oq5Var.d(i2) ? 4 : 2) | (oq5Var.f(str) ? 32 : 16) | (oq5Var.d(i3) ? 256 : 128) | (oq5Var.d(i4) ? 2048 : 1024) | (oq5Var.d(i5) ? 16384 : RemoteCameraConfig.Notification.ID) | 196608;
        if ((74899 & i7) == 74898 && oq5Var.z()) {
            oq5Var.S();
            yciVar2 = yciVar;
        } else {
            x2i x2iVar = qx0.a;
            oq5Var.a0(-862651793);
            u3r u3rVar = (u3r) oq5Var.j(bfs.c);
            oq5Var.p(false);
            nx0 g2 = qx0.g(u3rVar.b);
            oq5Var.a0(693286680);
            nho a2 = lho.a(g2, b2c.k, oq5Var, 0);
            oq5Var.a0(-1323940314);
            int i8 = oq5Var.P;
            androidx.compose.runtime.internal.a l2 = oq5Var.l();
            xp5.T.getClass();
            grb grbVar = wp5.b;
            yciVar2 = vci.a;
            wn5 A = ghh.A(yciVar2);
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a2, wp5.f);
            g0g.U(oq5Var, l2, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i8))) {
                ouj.x(i8, oq5Var, i8, kb5Var);
            }
            A.invoke(new lrq(oq5Var), oq5Var, 0);
            oq5Var.a0(2058660585);
            i(Integer.valueOf(R.string.decodersId), Integer.valueOf(i2), null, false, vut.I(oq5Var).o, vut.I(oq5Var).p, oq5Var, (i7 << 3) & 112, 12);
            Integer valueOf = Integer.valueOf(R.string.decodersName);
            if (1.0f <= 0.0d) {
                qme.a("invalid weight; must be greater than zero");
            }
            i(valueOf, str, new LayoutWeightElement(false, 1.0f), false, vut.I(oq5Var).q, vut.I(oq5Var).r, oq5Var, i7 & 112, 8);
            i(Integer.valueOf(R.string.decodersNumOfInits), Integer.valueOf(i3), null, false, vut.I(oq5Var).s, vut.I(oq5Var).t, oq5Var, (i7 >> 3) & 112, 12);
            i(Integer.valueOf(R.string.decodersNumOfReuses), Integer.valueOf(i4), null, false, vut.I(oq5Var).u, vut.I(oq5Var).v, oq5Var, (i7 >> 6) & 112, 12);
            i(Integer.valueOf(R.string.decodersNumOfReleases), Integer.valueOf(i5), null, false, vut.I(oq5Var).w, vut.I(oq5Var).x, oq5Var, (i7 >> 9) & 112, 12);
            k5r.s(oq5Var, false, true, false, false);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new ra5(i2, str, i3, i4, i5, yciVar2, i6);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0137, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r12.K(), java.lang.Integer.valueOf(r13)) == false) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x03a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void l(final m1v m1vVar, yci yciVar, float f2, hq5 hq5Var, final int i2, final int i3) {
        yci yciVar2;
        int i4;
        float f3;
        int i5;
        float f4;
        Object K;
        Object obj;
        int i6;
        b bVar;
        int i7;
        Object K2;
        grb grbVar;
        kb5 kb5Var;
        kb5 kb5Var2;
        vci vciVar;
        float f5;
        x2i x2iVar;
        hz2 hz2Var;
        vci vciVar2;
        int i8;
        Object K3;
        float f6;
        boolean z;
        Object K4;
        boolean z2;
        Object obj2;
        vci vciVar3;
        b bVar2;
        Object K5;
        final float f7;
        final yci yciVar3;
        String str;
        xmn r;
        hz2 hz2Var2 = b2c.l;
        m1vVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1595680668);
        int i9 = i2 | (oq5Var.f(m1vVar) ? 4 : 2);
        int i10 = i3 & 2;
        if (i10 != 0) {
            i9 |= 48;
        } else if ((i2 & 48) == 0) {
            yciVar2 = yciVar;
            i9 |= oq5Var.f(yciVar2) ? 32 : 16;
            i4 = i3 & 4;
            if (i4 == 0) {
                i5 = i9 | 384;
                f3 = f2;
            } else {
                f3 = f2;
                i5 = i9 | (oq5Var.c(f3) ? 256 : 128);
            }
            if ((i5 & 147) == 146 || !oq5Var.z()) {
                vci vciVar4 = vci.a;
                yci yciVar4 = i10 == 0 ? vciVar4 : yciVar2;
                float f8 = i4 == 0 ? 0 : f3;
                if (((Boolean) gld.O((vdr) m1vVar.e.b, oq5Var).getValue()).booleanValue()) {
                    oq5Var.Z(145808301);
                    f4 = irv.f(oq5Var);
                    oq5Var.p(false);
                } else {
                    oq5Var.Z(145808030);
                    oq5Var.p(false);
                    f4 = 4;
                }
                sdr a2 = pk0.a(f4, null, "landing header padding animation for bar above", oq5Var, 384, 10);
                aqi O = gld.O(m1vVar.j, oq5Var);
                yci yciVar5 = yciVar4;
                yci d2 = d.d(d.e(androidx.compose.foundation.layout.a.q(yciVar4, 0.0f, ((cma) a2.getValue()).a, 0.0f, 0.0f, 13), ild.v(oq5Var)), 1.0f);
                K = oq5Var.K();
                int i11 = 22;
                obj = gq5.a;
                if (K == obj) {
                    K = new g4d(i11);
                    oq5Var.k0(K);
                }
                yci b2 = nfp.b(d2, false, (Function1) K);
                iz2 iz2Var = b2c.b;
                kfh d3 = ug3.d(iz2Var, false);
                int i12 = oq5Var.P;
                androidx.compose.runtime.internal.a l2 = oq5Var.l();
                yci H = vnj.H(oq5Var, b2);
                xp5.T.getClass();
                grb grbVar2 = wp5.b;
                oq5Var.d0();
                if (oq5Var.O) {
                    oq5Var.n0();
                } else {
                    oq5Var.k(grbVar2);
                }
                kb5 kb5Var3 = wp5.f;
                g0g.U(oq5Var, d3, kb5Var3);
                kb5 kb5Var4 = wp5.e;
                g0g.U(oq5Var, l2, kb5Var4);
                kb5 kb5Var5 = wp5.g;
                if (oq5Var.O) {
                    i6 = i5;
                } else {
                    i6 = i5;
                }
                ouj.x(i12, oq5Var, i12, kb5Var5);
                kb5 kb5Var6 = wp5.d;
                g0g.U(oq5Var, H, kb5Var6);
                float f9 = 56;
                yci e2 = d.e(vciVar4, f9);
                bVar = b.a;
                float f10 = f8;
                yci g0 = f8g.g0(bVar.a(e2, iz2Var), 1.0f);
                x2i x2iVar2 = qx0.a;
                nho a3 = lho.a(x2iVar2, b2c.k, oq5Var, 0);
                i7 = oq5Var.P;
                androidx.compose.runtime.internal.a l3 = oq5Var.l();
                yci H2 = vnj.H(oq5Var, g0);
                oq5Var.d0();
                if (oq5Var.O) {
                    oq5Var.n0();
                } else {
                    oq5Var.k(grbVar2);
                }
                g0g.U(oq5Var, a3, kb5Var3);
                g0g.U(oq5Var, l3, kb5Var4);
                if (!oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i7))) {
                    ouj.x(i7, oq5Var, i7, kb5Var5);
                }
                g0g.U(oq5Var, H2, kb5Var6);
                qzc qzcVar = m1vVar.d;
                yci a4 = androidx.compose.animation.b.a(f8g.g0(d.w(d.t(vciVar4, 0.0f, f9, 1), iz2Var, true), 1.0f), null, 3);
                K2 = oq5Var.K();
                if (K2 == obj) {
                    K2 = new g4d(23);
                    oq5Var.k0(K2);
                }
                o8g.d(qzcVar, nfp.b(a4, false, (Function1) K2), oq5Var, 0);
                if (m1vVar.a()) {
                    grbVar = grbVar2;
                    kb5Var = kb5Var3;
                    kb5Var2 = kb5Var4;
                    vciVar = vciVar4;
                    f5 = f10;
                    x2iVar = x2iVar2;
                    hz2Var = hz2Var2;
                    oq5Var.Z(804080432);
                } else {
                    oq5Var.Z(808332888);
                    String M = rvf.M(R.string.new_wave_onboarding_content_description, oq5Var);
                    boolean z3 = (i6 & 14) == 4;
                    Object K6 = oq5Var.K();
                    if (z3 || K6 == obj) {
                        vciVar = vciVar4;
                        f5 = f10;
                        x2iVar = x2iVar2;
                        grbVar = grbVar2;
                        kb5Var = kb5Var3;
                        kb5Var2 = kb5Var4;
                        str = M;
                        v2d v2dVar = new v2d(0, m1vVar, m1v.class, "onFeedbackEntryPointClick", "onFeedbackEntryPointClick()V", 0, 3);
                        oq5Var.k0(v2dVar);
                        K6 = v2dVar;
                    } else {
                        str = M;
                        grbVar = grbVar2;
                        kb5Var = kb5Var3;
                        kb5Var2 = kb5Var4;
                        vciVar = vciVar4;
                        f5 = f10;
                        x2iVar = x2iVar2;
                    }
                    Function0 function0 = (Function0) ((h9f) K6);
                    hz2Var = hz2Var2;
                    yci k2 = androidx.compose.foundation.layout.a.k(new VerticalAlignElement(hz2Var), -18, 0.0f, 2);
                    boolean f11 = oq5Var.f(str);
                    Object K7 = oq5Var.K();
                    if (f11 || K7 == obj) {
                        K7 = new wq(str, 26);
                        oq5Var.k0(K7);
                    }
                    zc4.i(function0, nfp.b(k2, false, (Function1) K7), oq5Var, 0);
                }
                oq5Var.p(false);
                oq5Var.p(true);
                vciVar2 = vciVar;
                yci o = androidx.compose.foundation.layout.a.o(d.c(vciVar2, 1.0f), !m1vVar.a() ? 48 : 22, 0.0f, 2);
                nho a5 = lho.a(x2iVar, hz2Var, oq5Var, 48);
                i8 = oq5Var.P;
                androidx.compose.runtime.internal.a l4 = oq5Var.l();
                yci H3 = vnj.H(oq5Var, o);
                oq5Var.d0();
                if (oq5Var.O) {
                    oq5Var.n0();
                } else {
                    oq5Var.k(grbVar);
                }
                g0g.U(oq5Var, a5, kb5Var);
                g0g.U(oq5Var, l4, kb5Var2);
                if (!oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i8))) {
                    ouj.x(i8, oq5Var, i8, kb5Var5);
                }
                g0g.U(oq5Var, H3, kb5Var6);
                c3v c3vVar = (c3v) O.getValue();
                act S = weo.S(300, 0, null, 6);
                if (1.0f <= 0.0d) {
                    qme.a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement = new LayoutWeightElement(true, 1.0f);
                K3 = oq5Var.K();
                if (K3 == obj) {
                    K3 = new g4d(24);
                    oq5Var.k0(K3);
                }
                ot0.l(c3vVar, (Function1) K3, layoutWeightElement, S, null, false, ild.C(-1821463796, new tt5(16, m1vVar), oq5Var), oq5Var, 1772592, 16);
                oq5Var = oq5Var;
                f6 = f5;
                if (Float.compare(f6, 0) <= 0) {
                    oq5Var.Z(-242617747);
                    u1g.l(oq5Var, d.r(vciVar2, f6));
                } else {
                    oq5Var.Z(-249713337);
                }
                oq5Var.p(false);
                oq5Var.p(true);
                z = (i6 & 14) != 4;
                K4 = oq5Var.K();
                if (!z || K4 == obj) {
                    z2 = false;
                    obj2 = obj;
                    vciVar3 = vciVar2;
                    bVar2 = bVar;
                    v2d v2dVar2 = new v2d(0, m1vVar, m1v.class, "onSearchClick", "onSearchClick()V", 0, 4);
                    oq5Var.k0(v2dVar2);
                    K4 = v2dVar2;
                } else {
                    vciVar3 = vciVar2;
                    z2 = false;
                    obj2 = obj;
                    bVar2 = bVar;
                }
                Function0 function02 = (Function0) ((h9f) K4);
                yci q = androidx.compose.foundation.layout.a.q(bVar2.a(vciVar3, b2c.g), 0.0f, 0.0f, 4, 0.0f, 11);
                K5 = oq5Var.K();
                if (K5 == obj2) {
                    K5 = new g4d(25);
                    oq5Var.k0(K5);
                }
                aae.a(function02, nfp.b(q, z2, (Function1) K5), false, qwp.b, oq5Var, 24576, 12);
                oq5Var.p(true);
                f7 = f6;
                yciVar3 = yciVar5;
            } else {
                oq5Var.S();
                yciVar3 = yciVar2;
                f7 = f3;
            }
            r = oq5Var.r();
            if (r == null) {
                r.d = new Function2() { // from class: uud
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj3, Object obj4) {
                        ((Integer) obj4).getClass();
                        h4a.l(m1v.this, yciVar3, f7, (hq5) obj3, rvf.R(i2 | 1), i3);
                        return Unit.a;
                    }
                };
                return;
            }
            return;
        }
        yciVar2 = yciVar;
        i4 = i3 & 4;
        if (i4 == 0) {
        }
        if ((i5 & 147) == 146) {
        }
        vci vciVar42 = vci.a;
        if (i10 == 0) {
        }
        if (i4 == 0) {
        }
        if (((Boolean) gld.O((vdr) m1vVar.e.b, oq5Var).getValue()).booleanValue()) {
        }
        sdr a22 = pk0.a(f4, null, "landing header padding animation for bar above", oq5Var, 384, 10);
        aqi O2 = gld.O(m1vVar.j, oq5Var);
        yci yciVar52 = yciVar4;
        yci d22 = d.d(d.e(androidx.compose.foundation.layout.a.q(yciVar4, 0.0f, ((cma) a22.getValue()).a, 0.0f, 0.0f, 13), ild.v(oq5Var)), 1.0f);
        K = oq5Var.K();
        int i112 = 22;
        obj = gq5.a;
        if (K == obj) {
        }
        yci b22 = nfp.b(d22, false, (Function1) K);
        iz2 iz2Var2 = b2c.b;
        kfh d32 = ug3.d(iz2Var2, false);
        int i122 = oq5Var.P;
        androidx.compose.runtime.internal.a l22 = oq5Var.l();
        yci H4 = vnj.H(oq5Var, b22);
        xp5.T.getClass();
        grb grbVar22 = wp5.b;
        oq5Var.d0();
        if (oq5Var.O) {
        }
        kb5 kb5Var32 = wp5.f;
        g0g.U(oq5Var, d32, kb5Var32);
        kb5 kb5Var42 = wp5.e;
        g0g.U(oq5Var, l22, kb5Var42);
        kb5 kb5Var52 = wp5.g;
        if (oq5Var.O) {
        }
        ouj.x(i122, oq5Var, i122, kb5Var52);
        kb5 kb5Var62 = wp5.d;
        g0g.U(oq5Var, H4, kb5Var62);
        float f92 = 56;
        yci e22 = d.e(vciVar42, f92);
        bVar = b.a;
        float f102 = f8;
        yci g02 = f8g.g0(bVar.a(e22, iz2Var2), 1.0f);
        x2i x2iVar22 = qx0.a;
        nho a32 = lho.a(x2iVar22, b2c.k, oq5Var, 0);
        i7 = oq5Var.P;
        androidx.compose.runtime.internal.a l32 = oq5Var.l();
        yci H22 = vnj.H(oq5Var, g02);
        oq5Var.d0();
        if (oq5Var.O) {
        }
        g0g.U(oq5Var, a32, kb5Var32);
        g0g.U(oq5Var, l32, kb5Var42);
        if (!oq5Var.O) {
        }
        ouj.x(i7, oq5Var, i7, kb5Var52);
        g0g.U(oq5Var, H22, kb5Var62);
        qzc qzcVar2 = m1vVar.d;
        yci a42 = androidx.compose.animation.b.a(f8g.g0(d.w(d.t(vciVar42, 0.0f, f92, 1), iz2Var2, true), 1.0f), null, 3);
        K2 = oq5Var.K();
        if (K2 == obj) {
        }
        o8g.d(qzcVar2, nfp.b(a42, false, (Function1) K2), oq5Var, 0);
        if (m1vVar.a()) {
        }
        oq5Var.p(false);
        oq5Var.p(true);
        vciVar2 = vciVar;
        yci o2 = androidx.compose.foundation.layout.a.o(d.c(vciVar2, 1.0f), !m1vVar.a() ? 48 : 22, 0.0f, 2);
        nho a52 = lho.a(x2iVar, hz2Var, oq5Var, 48);
        i8 = oq5Var.P;
        androidx.compose.runtime.internal.a l42 = oq5Var.l();
        yci H32 = vnj.H(oq5Var, o2);
        oq5Var.d0();
        if (oq5Var.O) {
        }
        g0g.U(oq5Var, a52, kb5Var);
        g0g.U(oq5Var, l42, kb5Var2);
        if (!oq5Var.O) {
        }
        ouj.x(i8, oq5Var, i8, kb5Var52);
        g0g.U(oq5Var, H32, kb5Var62);
        c3v c3vVar2 = (c3v) O2.getValue();
        act S2 = weo.S(300, 0, null, 6);
        if (1.0f <= 0.0d) {
        }
        LayoutWeightElement layoutWeightElement2 = new LayoutWeightElement(true, 1.0f);
        K3 = oq5Var.K();
        if (K3 == obj) {
        }
        ot0.l(c3vVar2, (Function1) K3, layoutWeightElement2, S2, null, false, ild.C(-1821463796, new tt5(16, m1vVar), oq5Var), oq5Var, 1772592, 16);
        oq5Var = oq5Var;
        f6 = f5;
        if (Float.compare(f6, 0) <= 0) {
        }
        oq5Var.p(false);
        oq5Var.p(true);
        if ((i6 & 14) != 4) {
        }
        K4 = oq5Var.K();
        if (z) {
        }
        z2 = false;
        obj2 = obj;
        vciVar3 = vciVar2;
        bVar2 = bVar;
        v2d v2dVar22 = new v2d(0, m1vVar, m1v.class, "onSearchClick", "onSearchClick()V", 0, 4);
        oq5Var.k0(v2dVar22);
        K4 = v2dVar22;
        Function0 function022 = (Function0) ((h9f) K4);
        yci q2 = androidx.compose.foundation.layout.a.q(bVar2.a(vciVar3, b2c.g), 0.0f, 0.0f, 4, 0.0f, 11);
        K5 = oq5Var.K();
        if (K5 == obj2) {
        }
        aae.a(function022, nfp.b(q2, z2, (Function1) K5), false, qwp.b, oq5Var, 24576, 12);
        oq5Var.p(true);
        f7 = f6;
        yciVar3 = yciVar52;
        r = oq5Var.r();
        if (r == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m(int i2, int i3, hq5 hq5Var, yci yciVar, String str, boolean z) {
        String str2;
        int i4;
        boolean z2;
        boolean z3;
        long j2;
        yci yciVar2;
        oq5 oq5Var;
        xmn r;
        str.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-159945410);
        if ((i2 & 6) == 0) {
            str2 = str;
            i4 = (oq5Var2.f(str2) ? 4 : 2) | i2;
        } else {
            str2 = str;
            i4 = i2;
        }
        int i5 = i4 | 48;
        int i6 = i3 & 4;
        if (i6 != 0) {
            i5 = i4 | 432;
        } else if ((i2 & 384) == 0) {
            z2 = z;
            i5 |= oq5Var2.g(z2) ? 256 : 128;
            if ((i5 & 147) == 146 || !oq5Var2.z()) {
                z3 = i6 == 0 ? false : z2;
                if (z3) {
                    oq5Var2.a0(535300102);
                    oq5Var2.a0(118080530);
                    h95 h95Var = (h95) oq5Var2.j(bfs.a);
                    oq5Var2.p(false);
                    j2 = h95Var.a;
                    oq5Var2.p(false);
                } else {
                    oq5Var2.a0(535230011);
                    oq5Var2.a0(118080530);
                    h95 h95Var2 = (h95) oq5Var2.j(bfs.a);
                    oq5Var2.p(false);
                    j2 = h95Var2.b;
                    oq5Var2.p(false);
                }
                tqc tqcVar = tqc.p;
                oq5Var2.a0(105784523);
                agr agrVar = bfs.b;
                tdt tdtVar = (tdt) oq5Var2.j(agrVar);
                oq5Var2.p(false);
                ges gesVar = tdtVar.a;
                oq5Var2.a0(105784523);
                tdt tdtVar2 = (tdt) oq5Var2.j(agrVar);
                oq5Var2.p(false);
                long j3 = tdtVar2.b;
                oq5Var2.a0(105784523);
                tdt tdtVar3 = (tdt) oq5Var2.j(agrVar);
                oq5Var2.p(false);
                float f2 = tdtVar3.c;
                v7g.p(j3);
                ges b2 = ges.b(gesVar, 0L, v7g.D(kes.c(j3) * f2, 1095216660480L & j3), null, null, 0L, 0, 0L, null, null, 0, 0, 16777213);
                o9s o9sVar = new o9s(6);
                int i7 = (i5 & 14) | 196608 | (i5 & 112);
                yciVar2 = vci.a;
                oq5Var = oq5Var2;
                wcs.b(str2, yciVar2, j2, 0L, tqcVar, 0L, o9sVar, 0L, 0, false, 0, 0, b2, oq5Var, i7, 384, 60888);
                z2 = z3;
            } else {
                oq5Var2.S();
                yciVar2 = yciVar;
                oq5Var = oq5Var2;
            }
            r = oq5Var.r();
            if (r == null) {
                r.d = new w73(str, i2, z2, yciVar2, i3);
                return;
            }
            return;
        }
        z2 = z;
        if ((i5 & 147) == 146) {
        }
        if (i6 == 0) {
        }
        if (z3) {
        }
        tqc tqcVar2 = tqc.p;
        oq5Var2.a0(105784523);
        agr agrVar2 = bfs.b;
        tdt tdtVar4 = (tdt) oq5Var2.j(agrVar2);
        oq5Var2.p(false);
        ges gesVar2 = tdtVar4.a;
        oq5Var2.a0(105784523);
        tdt tdtVar22 = (tdt) oq5Var2.j(agrVar2);
        oq5Var2.p(false);
        long j32 = tdtVar22.b;
        oq5Var2.a0(105784523);
        tdt tdtVar32 = (tdt) oq5Var2.j(agrVar2);
        oq5Var2.p(false);
        float f22 = tdtVar32.c;
        v7g.p(j32);
        ges b22 = ges.b(gesVar2, 0L, v7g.D(kes.c(j32) * f22, 1095216660480L & j32), null, null, 0L, 0, 0L, null, null, 0, 0, 16777213);
        o9s o9sVar2 = new o9s(6);
        int i72 = (i5 & 14) | 196608 | (i5 & 112);
        yciVar2 = vci.a;
        oq5Var = oq5Var2;
        wcs.b(str2, yciVar2, j2, 0L, tqcVar2, 0L, o9sVar2, 0L, 0, false, 0, 0, b22, oq5Var, i72, 384, 60888);
        z2 = z3;
        r = oq5Var.r();
        if (r == null) {
        }
    }

    public static final void n(tb4 tb4Var, vb4 vb4Var, yci yciVar, hq5 hq5Var, int i2) {
        int i3;
        yrm yrmVar;
        oq5 oq5Var;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-1307538220);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var2.d(tb4Var.ordinal()) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var2.h(vb4Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= oq5Var2.f(yciVar) ? 256 : 128;
        }
        int i4 = i3;
        if ((i4 & 147) == 146 && oq5Var2.z()) {
            oq5Var2.S();
            oq5Var = oq5Var2;
        } else {
            int ordinal = tb4Var.ordinal();
            kjn kjnVar = gq5.a;
            if (ordinal == 0) {
                oq5Var2.Z(-1812471071);
                boolean f2 = oq5Var2.f(vb4Var);
                Object K = oq5Var2.K();
                if (f2 || K == kjnVar) {
                    yrm yrmVar2 = new yrm(R.drawable.ic_take_photo_24, R.string.playlist_upload_cover_take_picture, "dialog_action_take_photo", new t93(0, vb4Var, vb4.class, "onTakePhotoClick", "onTakePhotoClick()V", 0, 28));
                    oq5Var2.k0(yrmVar2);
                    K = yrmVar2;
                }
                yrmVar = (yrm) K;
                oq5Var2.p(false);
            } else if (ordinal == 1) {
                oq5Var2.Z(-1812115718);
                boolean f3 = oq5Var2.f(vb4Var);
                Object K2 = oq5Var2.K();
                if (f3 || K2 == kjnVar) {
                    yrm yrmVar3 = new yrm(R.drawable.ic_photo_album_24, R.string.playlist_upload_cover_choose_picture, "dialog_action_choose_photo", new t93(0, vb4Var, vb4.class, "onChoosePhotoClick", "onChoosePhotoClick()V", 0, 29));
                    oq5Var2.k0(yrmVar3);
                    K2 = yrmVar3;
                }
                yrmVar = (yrm) K2;
                oq5Var2.p(false);
            } else {
                if (ordinal != 2) {
                    throw vz1.i(oq5Var2, 1881195422, false);
                }
                oq5Var2.Z(-1811753886);
                boolean f4 = oq5Var2.f(vb4Var);
                Object K3 = oq5Var2.K();
                if (f4 || K3 == kjnVar) {
                    yrm yrmVar4 = new yrm(R.drawable.ic_trash_24, R.string.playlist_upload_cover_delete_cover, "dialog_action_delete_cover", new ub4(0, vb4Var, vb4.class, "onDeleteCoverClick", "onDeleteCoverClick()V", 0, 0));
                    oq5Var2.k0(yrmVar4);
                    K3 = yrmVar4;
                }
                yrmVar = (yrm) K3;
                oq5Var2.p(false);
            }
            yrm yrmVar5 = yrmVar;
            oq5Var = oq5Var2;
            ivf.o(yrmVar5, yrmVar5.a, yciVar, null, null, oq5Var, i4 & 896, 24);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new b3(tb4Var, vb4Var, yciVar, i2, 20);
        }
    }

    public static final void o(yci yciVar, hq5 hq5Var, int i2) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(2055545417);
        if ((((oq5Var.f(yciVar) ? 4 : 2) | i2) & 3) == 2 && oq5Var.z()) {
            oq5Var.S();
        } else {
            irf.r(a0g.E(Intrinsics.d(((zpg) stk.a.F().a.get(0)).a.getLanguage(), "ru") ? R.drawable.ic_yandex_music_logo_ru : R.drawable.ic_yandex_music_logo_en, 0, oq5Var), rvf.M(R.string.app_name_new, oq5Var), d.e(yciVar, 44), null, hd6.c, 0.0f, new d43(((dq0) oq5Var.j(eq0.a)).a.h, 5), oq5Var, 24576, 40);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new u71(yciVar, i2, 29);
        }
    }

    public static byte[] p(byte[]... bArr) {
        int i2 = 0;
        for (byte[] bArr2 : bArr) {
            if (i2 > Integer.MAX_VALUE - bArr2.length) {
                b6e.m("exceeded size limit");
                return null;
            }
            i2 += bArr2.length;
        }
        byte[] bArr3 = new byte[i2];
        int i3 = 0;
        for (byte[] bArr4 : bArr) {
            System.arraycopy(bArr4, 0, bArr3, i3, bArr4.length);
            i3 += bArr4.length;
        }
        return bArr3;
    }

    public static q91 q(u51 u51Var) {
        return new q91(u51Var.b, vz1.w(kg5.M(u51Var.c, WebPath$Storage.AVATARS)), false);
    }

    public static final boolean r(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr2 == null || bArr.length != bArr2.length) {
            return false;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < bArr.length; i3++) {
            i2 |= bArr[i3] ^ bArr2[i3];
        }
        return i2 == 0;
    }

    public static oe6 s(wn5 wn5Var, o14 o14Var) {
        o14Var.getClass();
        Object obj = o14Var.a;
        qne qneVar = obj != null ? new qne(obj, a0g.C(new wn5(new le6(wn5Var, obj, 0), -1076011399, true)), false) : null;
        qne qneVar2 = new qne(o14Var.b, a0g.C(new wn5(new kw5(7, wn5Var, o14Var), 1247276088, true)), false);
        Object obj2 = o14Var.c;
        return new oe6(qneVar, qneVar2, obj2 != null ? new qne(obj2, a0g.C(new wn5(new le6(wn5Var, obj2, 3), -1948421961, true)), false) : null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object t(String str, Context context, cce cceVar, boolean z, Continuation continuation) {
        yce yceVar;
        int i2;
        sce sceVar;
        if (continuation instanceof yce) {
            yceVar = (yce) continuation;
            int i3 = yceVar.k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                yceVar.k = i3 - Integer.MIN_VALUE;
                Object obj = yceVar.j;
                Object obj2 = nm6.a;
                i2 = yceVar.k;
                if (i2 != 0) {
                    qgg.h0(obj);
                    pce pceVar = new pce(context);
                    pceVar.c = str;
                    pceVar.e(lmq.c);
                    pceVar.j = xee.L(xz0.X(new e7t[]{new g3r(z)}));
                    rce a2 = pceVar.a();
                    yceVar.k = 1;
                    obj = cceVar.a(a2, yceVar);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i2 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                sceVar = (sce) obj;
                if (sceVar instanceof bqr) {
                    Drawable drawable = ((bqr) sceVar).a;
                    if (drawable instanceof BitmapDrawable) {
                        Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
                        bitmap.getClass();
                        return new d85(c3x.f(bitmap.getPixel(0, 0)));
                    }
                }
                return null;
            }
        }
        yceVar = new yce(continuation);
        Object obj3 = yceVar.j;
        Object obj22 = nm6.a;
        i2 = yceVar.k;
        if (i2 != 0) {
        }
        sceVar = (sce) obj3;
        if (sceVar instanceof bqr) {
        }
        return null;
    }

    public static final String u(Integer num, Object obj, hq5 hq5Var) {
        int intValue;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.a0(-1388819989);
        String obj2 = obj != null ? obj.toString() : null;
        if (obj2 == null) {
            if (num == null || ((intValue = num.intValue()) != R.string.epsilonUuid && (intValue == R.string.epsilonPlayerIndex || intValue == R.string.epsilonEngineIndex || intValue == R.string.epsilonPreloadState || intValue == R.string.epsilonCurrentQuality || intValue == R.string.epsilonCurrentBufferSize || !(intValue == R.string.decodersId || intValue == R.string.decodersName || intValue == R.string.decodersNumOfInits || intValue == R.string.decodersNumOfReuses || intValue == R.string.decodersNumOfReleases || intValue == R.string.speedTelemetryBlurShownTime || intValue == R.string.speedTelemetryImageShownTime || intValue == R.string.speedTelemetryFirstFrameShownTime || intValue == R.string.speedTelemetryPlayDeltaTime || intValue == R.string.speedTelemetryTotalTime || (intValue != R.string.compactSpeedTelemetryBlurShownTime && intValue != R.string.compactSpeedTelemetryImageShownTime && intValue != R.string.compactSpeedTelemetryFirstFrameShownTime && intValue != R.string.compactSpeedTelemetryPlayDeltaTime && intValue != R.string.compactSpeedTelemetryTotalTime && (intValue == R.string.numOfFatals || intValue == R.string.isStartFromCache || intValue == R.string.isOnDemandStart || (intValue != R.string.bandwidthMinValue && intValue != R.string.bandwidthMaxValue && intValue != R.string.bandwidthLastValue && intValue != R.string.networkRequestsTotalNumOfSuccess && intValue != R.string.networkRequestsTotalNumOfErrors && intValue != R.string.networkRequestsCurrentNumOfSuccess && intValue != R.string.networkRequestsCurrentNumOfErrors && intValue != R.string.networkRequestsMaxValues && intValue != R.string.networkRequestsLastValues))))))) {
                oq5Var.a0(-707788702);
                obj2 = rvf.M(R.string.noDataLabel, oq5Var);
                oq5Var.p(false);
            } else {
                oq5Var.a0(-707858173);
                obj2 = rvf.M(R.string.errorLabel, oq5Var);
                oq5Var.p(false);
            }
        }
        oq5Var.p(false);
        return obj2;
    }

    public static long v(double d2) {
        o2g.J("not a normal value", A(d2));
        int exponent = Math.getExponent(d2);
        long doubleToRawLongBits = Double.doubleToRawLongBits(d2) & 4503599627370495L;
        return exponent == -1023 ? doubleToRawLongBits << 1 : doubleToRawLongBits | 4503599627370496L;
    }

    public static String w(int i2, int i3) {
        return i2 != 64 ? i2 != 128 ? i2 != 192 ? dfi.c(i3, "[UNIVERSAL ", "]") : dfi.c(i3, "[PRIVATE ", "]") : dfi.c(i3, "[CONTEXT ", "]") : dfi.c(i3, "[APPLICATION ", "]");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int x(String str) {
        char c2;
        if (str == null) {
            return -1;
        }
        String p = l5i.p(str);
        p.getClass();
        switch (p.hashCode()) {
            case -2123537834:
                if (p.equals("audio/eac3-joc")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case -1662384011:
                if (p.equals("video/mp2p")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case -1662384007:
                if (p.equals("video/mp2t")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case -1662095187:
                if (p.equals("video/webm")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case -1606874997:
                if (p.equals("audio/amr-wb")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case -1487656890:
                if (p.equals("image/avif")) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            case -1487464693:
                if (p.equals("image/heic")) {
                    c2 = 6;
                    break;
                }
                c2 = 65535;
                break;
            case -1487464690:
                if (p.equals("image/heif")) {
                    c2 = 7;
                    break;
                }
                c2 = 65535;
                break;
            case -1487394660:
                if (p.equals("image/jpeg")) {
                    c2 = '\b';
                    break;
                }
                c2 = 65535;
                break;
            case -1487018032:
                if (p.equals("image/webp")) {
                    c2 = '\t';
                    break;
                }
                c2 = 65535;
                break;
            case -1248337486:
                if (p.equals("application/mp4")) {
                    c2 = '\n';
                    break;
                }
                c2 = 65535;
                break;
            case -1079884372:
                if (p.equals("video/x-msvideo")) {
                    c2 = 11;
                    break;
                }
                c2 = 65535;
                break;
            case -1004728940:
                if (p.equals("text/vtt")) {
                    c2 = '\f';
                    break;
                }
                c2 = 65535;
                break;
            case -879272239:
                if (p.equals("image/bmp")) {
                    c2 = '\r';
                    break;
                }
                c2 = 65535;
                break;
            case -879258763:
                if (p.equals("image/png")) {
                    c2 = 14;
                    break;
                }
                c2 = 65535;
                break;
            case -387023398:
                if (p.equals("audio/x-matroska")) {
                    c2 = 15;
                    break;
                }
                c2 = 65535;
                break;
            case -43467528:
                if (p.equals("application/webm")) {
                    c2 = 16;
                    break;
                }
                c2 = 65535;
                break;
            case 13915911:
                if (p.equals("video/x-flv")) {
                    c2 = 17;
                    break;
                }
                c2 = 65535;
                break;
            case 187078296:
                if (p.equals("audio/ac3")) {
                    c2 = 18;
                    break;
                }
                c2 = 65535;
                break;
            case 187078297:
                if (p.equals("audio/ac4")) {
                    c2 = 19;
                    break;
                }
                c2 = 65535;
                break;
            case 187078669:
                if (p.equals("audio/amr")) {
                    c2 = 20;
                    break;
                }
                c2 = 65535;
                break;
            case 187090232:
                if (p.equals("audio/mp4")) {
                    c2 = 21;
                    break;
                }
                c2 = 65535;
                break;
            case 187091926:
                if (p.equals("audio/ogg")) {
                    c2 = 22;
                    break;
                }
                c2 = 65535;
                break;
            case 187099443:
                if (p.equals("audio/wav")) {
                    c2 = 23;
                    break;
                }
                c2 = 65535;
                break;
            case 1331848029:
                if (p.equals("video/mp4")) {
                    c2 = 24;
                    break;
                }
                c2 = 65535;
                break;
            case 1503095341:
                if (p.equals("audio/3gpp")) {
                    c2 = 25;
                    break;
                }
                c2 = 65535;
                break;
            case 1504578661:
                if (p.equals("audio/eac3")) {
                    c2 = 26;
                    break;
                }
                c2 = 65535;
                break;
            case 1504619009:
                if (p.equals("audio/flac")) {
                    c2 = 27;
                    break;
                }
                c2 = 65535;
                break;
            case 1504824762:
                if (p.equals("audio/midi")) {
                    c2 = 28;
                    break;
                }
                c2 = 65535;
                break;
            case 1504831518:
                if (p.equals("audio/mpeg")) {
                    c2 = 29;
                    break;
                }
                c2 = 65535;
                break;
            case 1505118770:
                if (p.equals("audio/webm")) {
                    c2 = 30;
                    break;
                }
                c2 = 65535;
                break;
            case 2039520277:
                if (p.equals("video/x-matroska")) {
                    c2 = 31;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        switch (c2) {
        }
        return -1;
    }

    public static int y(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return -1;
        }
        if (lastPathSegment.endsWith(".ac3") || lastPathSegment.endsWith(".ec3")) {
            return 0;
        }
        if (lastPathSegment.endsWith(".ac4")) {
            return 1;
        }
        if (lastPathSegment.endsWith(".adts") || lastPathSegment.endsWith(".aac")) {
            return 2;
        }
        if (lastPathSegment.endsWith(".amr")) {
            return 3;
        }
        if (lastPathSegment.endsWith(".flac")) {
            return 4;
        }
        if (lastPathSegment.endsWith(".flv")) {
            return 5;
        }
        if (lastPathSegment.endsWith(".mid") || lastPathSegment.endsWith(".midi") || lastPathSegment.endsWith(".smf")) {
            return 15;
        }
        if (lastPathSegment.startsWith(".mk", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".webm")) {
            return 6;
        }
        if (lastPathSegment.endsWith(".mp3")) {
            return 7;
        }
        if (lastPathSegment.endsWith(".mp4") || lastPathSegment.startsWith(".m4", lastPathSegment.length() - 4) || lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5) || lastPathSegment.startsWith(".cmf", lastPathSegment.length() - 5)) {
            return 8;
        }
        if (lastPathSegment.startsWith(".og", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".opus")) {
            return 9;
        }
        if (lastPathSegment.endsWith(".ps") || lastPathSegment.endsWith(".mpeg") || lastPathSegment.endsWith(".mpg") || lastPathSegment.endsWith(".m2p")) {
            return 10;
        }
        if (lastPathSegment.endsWith(".ts") || lastPathSegment.startsWith(".ts", lastPathSegment.length() - 4)) {
            return 11;
        }
        if (lastPathSegment.endsWith(".wav") || lastPathSegment.endsWith(".wave")) {
            return 12;
        }
        if (lastPathSegment.endsWith(".vtt") || lastPathSegment.endsWith(".webvtt")) {
            return 13;
        }
        if (lastPathSegment.endsWith(".jpg") || lastPathSegment.endsWith(".jpeg")) {
            return 14;
        }
        if (lastPathSegment.endsWith(".avi")) {
            return 16;
        }
        if (lastPathSegment.endsWith(".png")) {
            return 17;
        }
        if (lastPathSegment.endsWith(".webp")) {
            return 18;
        }
        if (lastPathSegment.endsWith(".bmp") || lastPathSegment.endsWith(".dib")) {
            return 19;
        }
        if (lastPathSegment.endsWith(".heic") || lastPathSegment.endsWith(".heif")) {
            return 20;
        }
        return lastPathSegment.endsWith(".avif") ? 21 : -1;
    }

    public static final void z(epf epfVar) {
        bcx.F(epfVar).D();
    }
}
