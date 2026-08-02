package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import androidx.compose.animation.c;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.a;
import androidx.compose.foundation.layout.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.work.impl.WorkDatabase;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSyntaxException;
import com.yandex.music.core.ui.compose.b;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Future;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import ru.yandex.music.R;
import ru.yandex.music.catalog.album.screen.AlbumScreenActivity;
import ru.yandex.music.common.media.context.PlaybackScope;

/* loaded from: classes3.dex */
public abstract class leu {
    public static final wn5 a = new wn5(new rz3(4), 816701855, false);
    public static final wn5 b = new wn5(new rz3(7), -1666401049, false);
    public static final wn5 c = new wn5(new io5(28), -1759874300, false);
    public static final wn5 d;
    public static final wn5 e;
    public static final v4e f;
    public static final int[] g;

    static {
        new wn5(new io5(29), 389001664, false);
        d = new wn5(new ro5(23), 546645299, false);
        e = new wn5(new rz3(25), -1058068649, false);
        f = new v4e();
        g = new int[]{1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [arf, java.lang.Object] */
    public static final rn0 A(mn0 mn0Var, int i, float f2, float f3, nim nimVar, ges gesVar, boolean z, boolean z2, float f4, hq5 hq5Var, int i2, int i3, int i4) {
        int i5;
        rn0 rn0Var;
        List split$default;
        ogi ogiVar;
        int i6;
        int i7 = i;
        ?? r10 = nimVar.c;
        mn0Var.getClass();
        jx7 jx7Var = (jx7) ((oq5) hq5Var).j(es5.h);
        ppc ppcVar = (ppc) ((oq5) hq5Var).j(es5.k);
        boolean z3 = (i4 & RemoteCameraConfig.Mic.BUFFER_SIZE) != 0 ? false : z2;
        float max = Math.max(0.0f, ff7.Q(f2, hq5Var) - ff7.Q(f4, hq5Var));
        float Q = ff7.Q(f3, hq5Var);
        oq5 oq5Var = (oq5) hq5Var;
        boolean f5 = oq5Var.f(nimVar) | ((((i2 & 14) ^ 6) > 4 && ((oq5) hq5Var).f(mn0Var)) || (i2 & 6) == 4) | ((((i2 & 112) ^ 48) > 32 && ((oq5) hq5Var).d(i7)) || (i2 & 48) == 32) | ((((i2 & 458752) ^ 196608) > 131072 && ((oq5) hq5Var).f(gesVar)) || (i2 & 196608) == 131072) | oq5Var.f(ppcVar) | ((((i2 & 3670016) ^ ScreenMirroringConfig.Video.BITRATE_1_5MB) > 1048576 && oq5Var.f(jx7Var)) || (i2 & ScreenMirroringConfig.Video.BITRATE_1_5MB) == 1048576);
        Object K = oq5Var.K();
        if (f5 || K == gq5.a) {
            if (z3) {
                ogi ogiVar2 = new ogi(mn0Var, gesVar, ia6.a(0, (int) max, 0, (int) Q), jx7Var, ppcVar, i7, false);
                jx7Var = jx7Var;
                ppcVar = ppcVar;
                i5 = i7;
                i7 = q5g.F(ogiVar2, mn0Var.b);
            } else {
                i5 = i7;
            }
            jx7 jx7Var2 = jx7Var;
            ppc ppcVar2 = ppcVar;
            ogi B = B(mn0Var, max, gesVar, jx7Var2, ppcVar2, i7, 32);
            int i8 = B.f;
            if (B.c) {
                rn0Var = C(B, nimVar, max, gesVar, jx7Var2, ppcVar2, mn0Var, i7);
            } else if (z) {
                rn0Var = new rn0(mn0Var, false, i7);
            } else {
                float E = E((mn0) r10.getValue(), max, gesVar, jx7Var2, ppcVar2);
                int i9 = i8 - 1;
                float g2 = B.g(i9);
                int d2 = B.d(i9, true);
                if (!D(B, max, mn0Var, g2, d2, E, false)) {
                    kn0 kn0Var = new kn0();
                    kn0Var.b(mn0Var.subSequence(0, d2));
                    kn0Var.b((mn0) r10.getValue());
                    K = new rn0(kn0Var.h(), true, i7);
                } else if (i8 == i5) {
                    rn0Var = C(B, nimVar, max, gesVar, jx7Var2, ppcVar2, mn0Var, i7);
                } else {
                    split$default = StringsKt__StringsKt.split$default(mn0Var, new String[]{StringUtil.SPACE}, false, 0, 6, null);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : split$default) {
                        if (!StringsKt.U((String) obj)) {
                            arrayList.add(obj);
                        }
                    }
                    rn0 rn0Var2 = null;
                    if (arrayList.size() < 2) {
                        ogiVar = B;
                        i6 = i7;
                    } else {
                        String X = CollectionsKt.X(CollectionsKt.M(arrayList), StringUtil.SPACE, null, null, null, 62);
                        String str = (String) CollectionsKt.Y(arrayList);
                        StringBuilder sb = new StringBuilder(16);
                        new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        new ArrayList();
                        sb.append(str);
                        String sb2 = sb.toString();
                        ogiVar = B;
                        ArrayList arrayList3 = new ArrayList(arrayList2.size());
                        i6 = i7;
                        int i10 = 0;
                        for (int size = arrayList2.size(); i10 < size; size = size) {
                            arrayList3.add(((jn0) arrayList2.get(i10)).a(sb.length()));
                            i10++;
                        }
                        if (E(new mn0(sb2, arrayList3), max, gesVar, jx7Var2, ppcVar2) + E <= max) {
                            kn0 kn0Var2 = new kn0();
                            kn0Var2.c(X);
                            kn0Var2.append('\n');
                            kn0Var2.d(str);
                            kn0Var2.b((mn0) r10.getValue());
                            rn0Var2 = new rn0(kn0Var2.h(), true, i5);
                        }
                    }
                    if (rn0Var2 == null) {
                        rn0Var = C(ogiVar, nimVar, max, gesVar, jx7Var2, ppcVar2, mn0Var, i6);
                    } else {
                        K = rn0Var2;
                    }
                }
                oq5Var.k0(K);
            }
            K = rn0Var;
            oq5Var.k0(K);
        }
        return (rn0) K;
    }

    public static ogi B(mn0 mn0Var, float f2, ges gesVar, jx7 jx7Var, ppc ppcVar, int i, int i2) {
        if ((i2 & 16) != 0) {
            i = Integer.MAX_VALUE;
        }
        return new ogi(mn0Var, gesVar, ia6.b((int) f2, 0, 13), jx7Var, ppcVar, i, false);
    }

    /* JADX WARN: Type inference failed for: r12v1, types: [arf, java.lang.Object] */
    public static final rn0 C(ogi ogiVar, nim nimVar, float f2, ges gesVar, jx7 jx7Var, ppc ppcVar, mn0 mn0Var, int i) {
        kn0 kn0Var = new kn0();
        String str = nimVar.b;
        kn0Var.d(str);
        ?? r12 = nimVar.c;
        kn0Var.b((mn0) r12.getValue());
        float E = E(kn0Var.h(), f2, gesVar, jx7Var, ppcVar);
        int min = Math.min(ogiVar.f, i) - 1;
        float g2 = ogiVar.g(min);
        int d2 = ogiVar.d(min, false);
        while (D(ogiVar, f2, mn0Var, g2, d2, E, true)) {
            d2--;
        }
        kn0 kn0Var2 = new kn0();
        kn0Var2.b(mn0Var.subSequence(0, d2));
        kn0Var2.d(str);
        kn0Var2.b((mn0) r12.getValue());
        return new rn0(kn0Var2.h(), true, i);
    }

    public static final boolean D(ogi ogiVar, float f2, mn0 mn0Var, float f3, int i, float f4, boolean z) {
        float f5 = (ogiVar.b(i).c - f3) + f4;
        if (i <= 1) {
            return false;
        }
        if (f5 <= f2) {
            if (!z) {
                return false;
            }
            if (!CharsKt.d(mn0Var.b.charAt(i - 1))) {
                return false;
            }
        }
        return true;
    }

    public static final float E(mn0 mn0Var, float f2, ges gesVar, jx7 jx7Var, ppc ppcVar) {
        ogi B = B(mn0Var, f2, gesVar, jx7Var, ppcVar, 0, 48);
        B.p(0);
        ArrayList arrayList = B.h;
        t5k t5kVar = (t5k) arrayList.get(cb0.x(arrayList, 0));
        ih0 ih0Var = t5kVar.a;
        return ((ads) ih0Var.d).f.getLineWidth(0 - t5kVar.d);
    }

    public static final boolean F(Uri uri, w0a w0aVar) {
        String authority;
        return (uri == null || (authority = uri.getAuthority()) == null || !"download".equals(authority) || uri.getQueryParameter("url") == null || !(w0aVar instanceof gc8)) ? false : true;
    }

    public static final void G(g4w g4wVar, String str) {
        n5w b2;
        WorkDatabase workDatabase = g4wVar.c;
        workDatabase.getClass();
        x4w A = workDatabase.A();
        rx7 v = workDatabase.v();
        ArrayList j = u75.j(str);
        while (!j.isEmpty()) {
            String str2 = (String) z75.A(j);
            c4w d2 = A.d(str2);
            if (d2 != c4w.c && d2 != c4w.d) {
                ((Number) up6.F(A.a, false, true, new v4w(str2, 1))).intValue();
            }
            j.addAll(v.a(str2));
        }
        htm htmVar = g4wVar.f;
        htmVar.getClass();
        synchronized (htmVar.k) {
            jsg.j().e(htm.l, "Processor cancelling " + str);
            htmVar.i.add(str);
            b2 = htmVar.b(str);
        }
        htm.d(str, b2, 1);
        Iterator it = g4wVar.e.iterator();
        while (it.hasNext()) {
            ((kto) it.next()).b(str);
        }
    }

    public static byte[] K(String str) {
        if (str.length() % 2 != 0) {
            xq0.x("Expected a string of even length");
            return null;
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            int digit = Character.digit(str.charAt(i2), 16);
            int digit2 = Character.digit(str.charAt(i2 + 1), 16);
            if (digit == -1 || digit2 == -1) {
                xq0.x("input is not hexadecimal");
                return null;
            }
            bArr[i] = (byte) ((digit * 16) + digit2);
        }
        return bArr;
    }

    public static bts L(String str) {
        str.getClass();
        try {
            JsonElement b2 = JsonParser.b(str);
            if (b2 instanceof JsonArray) {
                JsonArray jsonArray = (JsonArray) b2;
                ArrayList arrayList = jsonArray.a;
                if (!arrayList.isEmpty()) {
                    if (!Intrinsics.d(jsonArray.t(0).q(), "VERSION_KEY")) {
                        int size = arrayList.size();
                        if (2 > size || size >= 4) {
                            throw new IOException(new JsonParseException("Unknown enc cacheKey format ".concat(str)));
                        }
                        String q = jsonArray.t(0).q();
                        q.getClass();
                        Uri parse = Uri.parse(q);
                        parse.getClass();
                        c5b c5bVar = c5b.a;
                        String q2 = jsonArray.t(1).q();
                        q2.getClass();
                        return new bts(parse, c5bVar, q2, arrayList.size() > 2 ? new Date(jsonArray.t(2).o()) : new Date(System.currentTimeMillis()));
                    }
                    JsonElement t = jsonArray.t(1);
                    t.getClass();
                    Integer F = cxb.F(t);
                    if (F == null) {
                        throw new IOException(new JsonParseException("Unknown enc cacheKey format ".concat(str)));
                    }
                    if (F.intValue() != 1) {
                        throw new IOException(new JsonParseException("Unknown enc cacheKey format " + str + ", version " + F + " is not supported"));
                    }
                    if (arrayList.size() != 6) {
                        throw new IOException(new JsonParseException("Unknown enc cacheKey format ".concat(str)));
                    }
                    String q3 = jsonArray.t(2).q();
                    q3.getClass();
                    Uri parse2 = Uri.parse(q3);
                    parse2.getClass();
                    String q4 = jsonArray.t(3).q();
                    q4.getClass();
                    Date date = new Date(jsonArray.t(4).o());
                    JsonArray g2 = jsonArray.t(5).g();
                    ArrayList arrayList2 = new ArrayList(v75.o(g2, 10));
                    Iterator it = g2.a.iterator();
                    while (it.hasNext()) {
                        String q5 = ((JsonElement) it.next()).q();
                        q5.getClass();
                        arrayList2.add(Uri.parse(q5));
                    }
                    return new bts(parse2, arrayList2, q4, date);
                }
            }
            throw new IOException(new JsonParseException("Unknown enc cacheKey format ".concat(str)));
        } catch (JsonSyntaxException e2) {
            ssg.a(7, null, "Malformed json: ".concat(str), e2);
            throw new IOException(e2);
        }
    }

    public static String M(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b2 : bArr) {
            int i = b2 & 255;
            sb.append("0123456789abcdef".charAt(i / 16));
            sb.append("0123456789abcdef".charAt(i % 16));
        }
        return sb.toString();
    }

    public static final LinkedHashMap N(q1f q1fVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if ((q1fVar != null ? q1fVar.a : null) == r1f.f) {
            q1fVar.getClass();
            w1g.n(((z9h) q1fVar).b, new u60(linkedHashMap, 4));
        }
        return linkedHashMap;
    }

    public static Object O(Future future) {
        o2g.S(future, "Future was expected to be done: %s", future.isDone());
        return uwf.t(future);
    }

    public static final Class P(f9f f9fVar) {
        f9fVar.getClass();
        Class b2 = ((dm4) f9fVar).b();
        b2.getClass();
        return b2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final Class Q(f9f f9fVar) {
        f9fVar.getClass();
        Class b2 = ((dm4) f9fVar).b();
        if (b2.isPrimitive()) {
            String name = b2.getName();
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals("double")) {
                        return Double.class;
                    }
                    break;
                case 104431:
                    if (name.equals("int")) {
                        return Integer.class;
                    }
                    break;
                case 3039496:
                    if (name.equals("byte")) {
                        return Byte.class;
                    }
                    break;
                case 3052374:
                    if (name.equals("char")) {
                        return Character.class;
                    }
                    break;
                case 3327612:
                    if (name.equals("long")) {
                        return Long.class;
                    }
                    break;
                case 3625364:
                    if (name.equals("void")) {
                        return Void.class;
                    }
                    break;
                case 64711720:
                    if (name.equals("boolean")) {
                        return Boolean.class;
                    }
                    break;
                case 97526364:
                    if (name.equals("float")) {
                        return Float.class;
                    }
                    break;
                case 109413500:
                    if (name.equals("short")) {
                        return Short.class;
                    }
                    break;
            }
        }
        return b2;
    }

    public static final lm4 R(Class cls) {
        cls.getClass();
        return ern.a(cls);
    }

    public static kde S(Object obj) {
        return obj == null ? kde.b : new kde(obj);
    }

    public static Intent T(Context context, lt ltVar, PlaybackScope playbackScope) {
        context.getClass();
        ltVar.getClass();
        Intent putExtra = new Intent(context, (Class<?>) AlbumScreenActivity.class).putExtra("extra.activityParams", (Serializable) new uq(ltVar, playbackScope != null ? playbackScope.c(ltVar).a() : null)).putExtra("extra.playbackScope", playbackScope);
        putExtra.getClass();
        return putExtra;
    }

    public static boolean U(int i, boolean z) {
        if ((i >>> 8) == 3368816) {
            return true;
        }
        if (i == 1751476579 && z) {
            return true;
        }
        for (int i2 = 0; i2 < 29; i2++) {
            if (g[i2] == i) {
                return true;
            }
        }
        return false;
    }

    public static final uo6 X(String str, hq5 hq5Var) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.Z(-1625437414);
        long j = ((dq0) oq5Var.j(eq0.a)).c.c;
        if (((Boolean) oq5Var.j(koe.a)).booleanValue()) {
            ci0 ci0Var = new ci0(j);
            oq5Var.p(false);
            return ci0Var;
        }
        Object K = oq5Var.K();
        kjn kjnVar = gq5.a;
        if (K == kjnVar) {
            K = tlm.f(gld.R(g.a, oq5Var), oq5Var);
        }
        mm6 mm6Var = ((fs5) K).a;
        Context context = (Context) oq5Var.j(AndroidCompositionLocals_androidKt.b);
        cce cceVar = (cce) oq5Var.j(tkg.a);
        boolean f2 = oq5Var.f(str) | oq5Var.f(mm6Var) | oq5Var.e(j);
        Object K2 = oq5Var.K();
        if (f2 || K2 == kjnVar) {
            vo6 vo6Var = new vo6(str, mm6Var, j, context, cceVar);
            oq5Var.k0(vo6Var);
            K2 = vo6Var;
        }
        vo6 vo6Var2 = (vo6) K2;
        oq5Var.p(false);
        return vo6Var2;
    }

    public static String Y(bts btsVar) {
        JsonArray jsonArray = new JsonArray();
        jsonArray.s("VERSION_KEY");
        JsonPrimitive jsonPrimitive = new JsonPrimitive((Number) 1);
        ArrayList arrayList = jsonArray.a;
        arrayList.add(jsonPrimitive);
        jsonArray.s(btsVar.b.toString());
        jsonArray.s(btsVar.d);
        arrayList.add(new JsonPrimitive(Long.valueOf(btsVar.e.getTime())));
        JsonArray jsonArray2 = new JsonArray();
        Iterator it = btsVar.c.iterator();
        while (it.hasNext()) {
            jsonArray2.s(((Uri) it.next()).toString());
        }
        jsonArray.r(jsonArray2);
        String jsonElement = jsonArray.toString();
        jsonElement.getClass();
        return jsonElement;
    }

    public static x2r Z(s2c s2cVar, boolean z, boolean z2) {
        x2r x2rVar;
        int i;
        long j;
        int i2;
        int i3;
        int i4;
        int[] iArr;
        long length = s2cVar.getLength();
        long j2 = -1;
        int i5 = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
        long j3 = 4096;
        if (i5 != 0 && length <= 4096) {
            j3 = length;
        }
        int i6 = (int) j3;
        d7k d7kVar = new d7k(64);
        int i7 = 0;
        int i8 = 0;
        boolean z3 = false;
        while (i8 < i6) {
            d7kVar.E(8);
            if (!s2cVar.l(d7kVar.a, i7, 8, true)) {
                break;
            }
            long x = d7kVar.x();
            int h = d7kVar.h();
            if (x == 1) {
                j = j2;
                s2cVar.A(d7kVar.a, 8, 8);
                i3 = 16;
                d7kVar.G(16);
                x = d7kVar.p();
                i2 = i8;
            } else {
                j = j2;
                if (x == 0) {
                    long length2 = s2cVar.getLength();
                    if (length2 != j) {
                        i2 = i8;
                        x = (length2 - s2cVar.s()) + 8;
                        i3 = 8;
                    }
                }
                i2 = i8;
                i3 = 8;
            }
            long j4 = x;
            long j5 = i3;
            x2rVar = null;
            int i9 = 14;
            if (j4 < j5) {
                return new gos(i9);
            }
            int i10 = i2 + i3;
            if (h == 1836019574) {
                i6 += (int) j4;
                if (i5 != 0 && i6 > length) {
                    i6 = (int) length;
                }
                i8 = i10;
                j2 = j;
                i7 = 0;
            } else {
                if (h == 1836019558 || h == 1836475768) {
                    i = 1;
                    break;
                }
                if (h == 1835295092) {
                    z3 = true;
                }
                int i11 = i5;
                long j6 = length;
                if ((i10 + j4) - j5 >= i6) {
                    i = 0;
                    break;
                }
                int i12 = (int) (j4 - j5);
                i8 = i10 + i12;
                if (h != 1718909296) {
                    i4 = 0;
                    if (i12 != 0) {
                        s2cVar.u(i12);
                    }
                } else {
                    if (i12 < 8) {
                        return new gos(14);
                    }
                    d7kVar.E(i12);
                    i4 = 0;
                    s2cVar.A(d7kVar.a, 0, i12);
                    if (U(d7kVar.h(), z2)) {
                        z3 = true;
                    }
                    d7kVar.I(4);
                    int a2 = d7kVar.a() / 4;
                    if (!z3 && a2 > 0) {
                        iArr = new int[a2];
                        int i13 = 0;
                        while (true) {
                            if (i13 >= a2) {
                                break;
                            }
                            int h2 = d7kVar.h();
                            iArr[i13] = h2;
                            if (U(h2, z2)) {
                                z3 = true;
                                break;
                            }
                            i13++;
                        }
                    } else {
                        iArr = null;
                    }
                    if (!z3) {
                        dxl dxlVar = new dxl();
                        if (iArr == null) {
                            sde sdeVar = sde.c;
                            return dxlVar;
                        }
                        sde sdeVar2 = sde.c;
                        if (iArr.length == 0) {
                            sde sdeVar3 = sde.c;
                            return dxlVar;
                        }
                        new sde(Arrays.copyOf(iArr, iArr.length));
                        return dxlVar;
                    }
                }
                i7 = i4;
                i5 = i11;
                j2 = j;
                length = j6;
            }
        }
        x2rVar = null;
        i = i7;
        return !z3 ? e3s.g : z != i ? i != 0 ? mvt.f : mvt.g : x2rVar;
    }

    public static final void a(ka1 ka1Var, yi1 yi1Var, q0d q0dVar, gvd gvdVar, pbu pbuVar, tvd tvdVar, hab habVar, Function0 function0, dib dibVar, Function0 function02, yci yciVar, hq5 hq5Var, int i) {
        oq5 oq5Var;
        ka1Var.getClass();
        gvdVar.getClass();
        pbuVar.getClass();
        tvdVar.getClass();
        habVar.getClass();
        dibVar.getClass();
        function02.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-1106820830);
        int i2 = i | (oq5Var2.f(ka1Var) ? 4 : 2) | (oq5Var2.h(yi1Var) ? 32 : 16) | (oq5Var2.h(q0dVar) ? 256 : 128) | (oq5Var2.f(gvdVar) ? 2048 : 1024) | (oq5Var2.f(pbuVar) ? 16384 : RemoteCameraConfig.Notification.ID) | (oq5Var2.f(tvdVar) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX) | (oq5Var2.f(habVar) ? 1048576 : 524288) | (oq5Var2.h(function0) ? 8388608 : RemoteCameraConfig.Camera.BITRATE) | (oq5Var2.h(dibVar) ? 67108864 : 33554432) | (oq5Var2.h(function02) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456);
        char c2 = oq5Var2.f(yciVar) ? (char) 4 : (char) 2;
        if ((i2 & 306783379) == 306783378 && (c2 & 3) == 2 && oq5Var2.z()) {
            oq5Var2.S();
            oq5Var = oq5Var2;
        } else {
            Object K = oq5Var2.K();
            kjn kjnVar = gq5.a;
            if (K == kjnVar) {
                K = szf.U(new nr(tvdVar, 5));
                oq5Var2.k0(K);
            }
            sdr sdrVar = (sdr) K;
            Boolean bool = (Boolean) sdrVar.getValue();
            bool.getClass();
            boolean h = oq5Var2.h(q0dVar);
            Object K2 = oq5Var2.K();
            if (h || K2 == kjnVar) {
                K2 = new qi(q0dVar, sdrVar, (Continuation) null, 7);
                oq5Var2.k0(K2);
            }
            gld.w(oq5Var2, bool, (Function2) K2);
            oq5Var = oq5Var2;
            jf0.a(new qzm[0], null, true, ild.C(-528102502, new v91(q0dVar, yciVar, gvdVar, tvdVar, function0, ka1Var, habVar, pbuVar, function02, yi1Var, dibVar), oq5Var2), oq5Var, 3072, 2);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new v91(ka1Var, yi1Var, q0dVar, gvdVar, pbuVar, tvdVar, habVar, function0, dibVar, function02, yciVar, i);
        }
    }

    public static void a0(Throwable th) {
        if (th instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th);
        }
        if (th instanceof ThreadDeath) {
            throw ((ThreadDeath) th);
        }
        if (th instanceof LinkageError) {
            throw ((LinkageError) th);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00e5, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r5.K(), java.lang.Integer.valueOf(r15)) == false) goto L49;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(boolean z, Function1 function1, boolean z2, hq5 hq5Var, int i) {
        int i2;
        boolean z3;
        String n;
        String n2;
        boolean z4 = z;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1649197562);
        int i3 = (oq5Var.g(z4) ? 4 : 2) | i | (oq5Var.h(function1) ? 32 : 16) | (oq5Var.g(z2) ? 256 : 128);
        int i4 = 0;
        if (oq5Var.P(i3 & 1, (i3 & 147) != 146)) {
            int i5 = i3 & 14;
            Object[] objArr = i5 == 4;
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (objArr != false || K == kjnVar) {
                K = new i32(i4, z4);
                oq5Var.k0(K);
            }
            vci vciVar = vci.a;
            yci b2 = nfp.b(vciVar, true, (Function1) K);
            int i6 = i3 & 112;
            boolean z5 = (i6 == 32) | (i5 == 4);
            Object K2 = oq5Var.K();
            if (z5 || K2 == kjnVar) {
                K2 = new j32(function1, z4, 0);
                oq5Var.k0(K2);
            }
            float f2 = 16;
            yci m = a.m(androidx.compose.foundation.a.e(b2, false, null, null, (Function0) K2, 7), f2);
            nho a2 = lho.a(qx0.a, b2c.k, oq5Var, 0);
            int i7 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, m);
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
            g0g.U(oq5Var, l, kb5Var2);
            kb5 kb5Var3 = wp5.g;
            if (oq5Var.O) {
                i2 = i6;
            } else {
                i2 = i6;
            }
            ouj.x(i7, oq5Var, i7, kb5Var3);
            kb5 kb5Var4 = wp5.d;
            g0g.U(oq5Var, H, kb5Var4);
            if (1.0f <= 0.0d) {
                qme.a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(true, 1.0f);
            ta5 a3 = sa5.a(qx0.c, b2c.n, oq5Var, 0);
            int i8 = oq5Var.P;
            androidx.compose.runtime.internal.a l2 = oq5Var.l();
            yci H2 = vnj.H(oq5Var, layoutWeightElement);
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a3, kb5Var);
            g0g.U(oq5Var, l2, kb5Var2);
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i8))) {
                ouj.x(i8, oq5Var, i8, kb5Var3);
            }
            g0g.U(oq5Var, H2, kb5Var4);
            if (z2) {
                z3 = false;
                n = vz1.n(oq5Var, 1183659542, R.string.auto_downloading_title, oq5Var, false);
            } else {
                z3 = false;
                if (z2) {
                    throw vz1.i(oq5Var, 1183657755, false);
                }
                n = vz1.n(oq5Var, 1183662232, R.string.auto_download_like_title, oq5Var, false);
            }
            String str = n;
            ges j = nu0.j();
            agr agrVar = eq0.a;
            boolean z6 = z3;
            xcs.b(str, androidx.compose.ui.platform.a.a(vciVar, "auto_cache_switcher_title"), ((dq0) oq5Var.j(agrVar)).b.a, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, j, oq5Var, 48, 0, 65528);
            u1g.l(oq5Var, d.e(vciVar, 4));
            if (z2) {
                n2 = vz1.n(oq5Var, 1183675587, R.string.auto_downloading_toggle_description, oq5Var, z6);
            } else {
                if (z2) {
                    throw vz1.i(oq5Var, 1183673806, z6);
                }
                n2 = vz1.n(oq5Var, 1183678686, R.string.auto_download_like_description, oq5Var, z6);
            }
            xcs.b(n2, androidx.compose.ui.platform.a.a(vciVar, "auto_cache_switcher_description"), d85.b(((dq0) oq5Var.j(agrVar)).b.b, 0.5f, 0.0f, 0.0f, 0.0f, 14), 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, nu0.i(), oq5Var, 48, 0, 65528);
            oq5Var.p(true);
            u1g.l(oq5Var, d.r(vciVar, f2));
            long j2 = ((dq0) oq5Var.j(agrVar)).e.a;
            long j3 = ((dq0) oq5Var.j(agrVar)).e.b;
            int i9 = i2;
            ds7 n3 = s7g.n(j2, j3, oq5Var, 967);
            Object K3 = oq5Var.K();
            if (K3 == kjnVar) {
                K3 = new uv1(13);
                oq5Var.k0(K3);
            }
            yci c2 = b.c(androidx.compose.ui.platform.a.a(nfp.b(vciVar, z6, (Function1) K3), "auto_cache_switcher"), "auto_cache_switcher_value", Boolean.valueOf(z));
            Object[] objArr2 = i9 == 32 ? true : z6 ? 1 : 0;
            Object K4 = oq5Var.K();
            if (objArr2 != false || K4 == kjnVar) {
                K4 = new k32(z6 ? 1 : 0, function1);
                oq5Var.k0(K4);
            }
            z4 = z;
            uvr.a(z4, (Function1) K4, c2, false, n3, oq5Var, i5, 24);
            oq5Var.p(true);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new l32(z4, function1, z2, i);
        }
    }

    public static final Map b0(WeakHashMap weakHashMap) {
        if (weakHashMap.isEmpty()) {
            e5b e5bVar = e5b.a;
            e5bVar.getClass();
            return e5bVar;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : weakHashMap.entrySet()) {
            try {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            } catch (NoSuchElementException unused) {
            }
        }
        return linkedHashMap;
    }

    public static final void c(q32 q32Var, fvf fvfVar, o0k o0kVar, boolean z, hq5 hq5Var, int i) {
        int i2;
        fvf fvfVar2;
        o0k o0kVar2;
        q32Var.getClass();
        fvfVar.getClass();
        o0kVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(560395954);
        if ((i & 6) == 0) {
            i2 = (oq5Var.h(q32Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            fvfVar2 = fvfVar;
            i2 |= oq5Var.f(fvfVar2) ? 32 : 16;
        } else {
            fvfVar2 = fvfVar;
        }
        if ((i & 384) == 0) {
            o0kVar2 = o0kVar;
            i2 |= oq5Var.f(o0kVar2) ? 256 : 128;
        } else {
            o0kVar2 = o0kVar;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var.g(z) ? 2048 : 1024;
        }
        if (oq5Var.P(i2 & 1, (i2 & 1171) != 1170)) {
            w32 w32Var = (w32) gld.M(q32Var.d, oq5Var).getValue();
            yci a2 = androidx.compose.ui.platform.a.a(d.c(vci.a, 1.0f), "auto_cache_main_screen");
            boolean f2 = oq5Var.f(w32Var) | oq5Var.h(q32Var) | ((i2 & 7168) == 2048);
            Object K = oq5Var.K();
            if (f2 || K == gq5.a) {
                K = new y20(w32Var, q32Var, z, 1);
                oq5Var.k0(K);
            }
            weo.f(a2, fvfVar2, o0kVar2, null, null, null, false, null, (Function1) K, oq5Var, (i2 & 112) | 6 | (i2 & 896), 504);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new pp(q32Var, fvfVar, o0kVar, z, i, 4);
        }
    }

    public static final eu7 c0(eu7 eu7Var, int i, int i2) {
        int i3;
        int i4;
        eu7Var.getClass();
        if (i == i2) {
            return eu7Var;
        }
        if (Intrinsics.e(i, i2) < 0) {
            i4 = i2 + 1;
            i3 = i;
        } else {
            i3 = i + 1;
            i4 = i2;
        }
        cu7 cu7Var = eu7Var.a;
        du7 du7Var = eu7Var.b;
        egc egcVar = cu7Var.a;
        eu7 d0 = d0(eu7Var, t75.c(egcVar.e(i)), (i4 < 0 || i4 >= egcVar.getElements().size()) ? i4 : egcVar.c(i4), i4, false);
        if (du7Var.a == i) {
            d0 = n7w.A(d0, i4);
            du7 du7Var2 = d0.b;
            if (du7Var.c) {
                d0 = eu7.a(d0, null, du7.a(du7Var2, du7Var2.a), 1);
            } else if (du7Var.b == i2) {
                d0 = eu7.a(d0, null, du7.a(du7Var2, du7Var2.b + 1), 1);
            }
        }
        return e0(d0, i3);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void d(String str, boolean z, fud fudVar, Function0 function0, Function0 function02, Function0 function03, yci yciVar, hq5 hq5Var, int i, int i2) {
        int i3;
        yci yciVar2;
        String str2;
        yci yciVar3;
        xmn r;
        float f2;
        fudVar.getClass();
        function0.getClass();
        function02.getClass();
        function03.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1516748567);
        if ((i & 48) == 0) {
            i3 = (oq5Var.g(z) ? 32 : 16) | i;
        } else {
            i3 = i;
        }
        int i4 = i3 | (oq5Var.h(fudVar) ? 256 : 128);
        if ((i & 3072) == 0) {
            i4 |= oq5Var.h(function0) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i4 |= oq5Var.h(function02) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((196608 & i) == 0) {
            i4 |= oq5Var.h(function03) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        int i5 = i2 & 64;
        if (i5 != 0) {
            i4 |= ScreenMirroringConfig.Video.BITRATE_1_5MB;
        } else if ((1572864 & i) == 0) {
            yciVar2 = yciVar;
            i4 |= oq5Var.f(yciVar2) ? 1048576 : 524288;
            if (oq5Var.P(i4 & 1, (599187 & i4) == 599186)) {
                str2 = str;
                oq5Var.S();
                yciVar3 = yciVar2;
            } else {
                yci yciVar4 = i5 != 0 ? vci.a : yciVar2;
                if (z) {
                    oq5Var.Z(1601504318);
                    f2 = 114 - 12;
                } else {
                    oq5Var.Z(1601506215);
                    f2 = 114;
                }
                oq5Var.p(false);
                str2 = str;
                int i6 = ((i4 >> 18) & 14) | 3504;
                int i7 = i4 << 6;
                tt0.s(yciVar4, ild.C(-2073316517, new qt(z, str2, function03, 4), oq5Var), y2x.c, y2x.d, fudVar, function0, function02, function03, f2, oq5Var, i6 | (57344 & i7) | (458752 & i7) | (3670016 & i7) | (i7 & 29360128), 0);
                yciVar3 = yciVar4;
            }
            r = oq5Var.r();
            if (r == null) {
                r.d = new i93(str2, z, fudVar, function0, function02, function03, yciVar3, i, i2);
                return;
            }
            return;
        }
        yciVar2 = yciVar;
        if (oq5Var.P(i4 & 1, (599187 & i4) == 599186)) {
        }
        r = oq5Var.r();
        if (r == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final eu7 d0(eu7 eu7Var, List list, int i, int i2, boolean z) {
        int size;
        du7 du7Var;
        cu7 cu7Var;
        eu7Var.getClass();
        list.getClass();
        cu7 cu7Var2 = eu7Var.a;
        du7 du7Var2 = eu7Var.b;
        int i3 = du7Var2.a;
        int i4 = du7Var2.b;
        egc q0 = wdp.q0(cu7Var2.a, list, i, i2);
        if (z) {
            int size2 = cu7Var2.a.getElements().size();
            if (i4 < 0 || i4 >= size2) {
                size = 0;
                if (Intrinsics.e(i2, i3) > 0) {
                    cu7Var = cu7.a(cu7Var2, q0, null, 2);
                    du7Var = new du7(i3 + size, i4 + size);
                } else if (Intrinsics.e(i2, i4) <= 0) {
                    cu7Var = cu7.a(cu7Var2, q0, null, 2);
                    du7Var = new du7(i3, i4 + size);
                } else {
                    cu7 a2 = cu7.a(cu7Var2, q0, null, 2);
                    du7Var = du7Var2;
                    cu7Var = a2;
                }
                return new eu7(cu7Var, du7Var);
            }
        }
        size = list.size();
        if (Intrinsics.e(i2, i3) > 0) {
        }
        return new eu7(cu7Var, du7Var);
    }

    public static final void e(kf4 kf4Var, yci yciVar, hq5 hq5Var, int i) {
        Pair pair;
        int i2;
        yci yciVar2;
        kf4Var.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-555849483);
        int i3 = (oq5Var.d(kf4Var.ordinal()) ? 4 : 2) | i | (oq5Var.f(yciVar) ? 32 : 16);
        int i4 = 18;
        if ((i3 & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
            yciVar2 = yciVar;
        } else {
            int ordinal = kf4Var.ordinal();
            if (ordinal == 0) {
                oq5Var.Z(-1595402479);
                pair = new Pair(Integer.valueOf(R.drawable.ic_chart_crown_20), new d85(((dq0) oq5Var.j(eq0.a)).a.h));
                oq5Var.p(false);
            } else if (ordinal == 1) {
                oq5Var.Z(-1595399121);
                pair = new Pair(Integer.valueOf(!((ma5) oq5Var.j(pa5.a)).g() ? R.drawable.ic_chart_new_multicolor_dark_20 : R.drawable.ic_chart_new_multicolor_light_20), null);
                oq5Var.p(false);
            } else if (ordinal == 2) {
                oq5Var.Z(-1595393939);
                pair = new Pair(Integer.valueOf(R.drawable.ic_chart_up_20), new d85(((dq0) oq5Var.j(eq0.a)).a.f));
                oq5Var.p(false);
            } else if (ordinal == 3) {
                oq5Var.Z(-1595390733);
                pair = new Pair(Integer.valueOf(R.drawable.ic_chart_static_20), new d85(((dq0) oq5Var.j(eq0.a)).a.c));
                oq5Var.p(false);
            } else {
                if (ordinal != 4) {
                    throw vz1.i(oq5Var, -1595403910, false);
                }
                oq5Var.Z(-1595387331);
                pair = new Pair(Integer.valueOf(R.drawable.ic_chart_down_20), new d85(kg5.r(R.color.icon_like_day, oq5Var)));
                oq5Var.p(false);
            }
            int intValue = ((Number) pair.a).intValue();
            d85 d85Var = (d85) pair.b;
            int ordinal2 = kf4Var.ordinal();
            if (ordinal2 == 0) {
                i2 = R.string.chart_top_description;
            } else if (ordinal2 == 1) {
                i2 = R.string.chart_new_description;
            } else if (ordinal2 == 2) {
                i2 = R.string.chart_up_description;
            } else if (ordinal2 == 3) {
                i2 = R.string.chart_same_description;
            } else {
                if (ordinal2 != 4) {
                    b6e.s();
                    return;
                }
                i2 = R.string.chart_down_description;
            }
            String M = rvf.M(i2, oq5Var);
            w4k E = a0g.E(intValue, 0, oq5Var);
            yciVar2 = yciVar;
            irf.r(E, M, yciVar2, null, null, 0.0f, d85Var != null ? new d43(d85Var.a, 5) : null, oq5Var, (i3 << 3) & 896, 56);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new m32(kf4Var, yciVar2, i, i4);
        }
    }

    public static final eu7 e0(eu7 eu7Var, int i) {
        egc km7Var;
        cu7 a2;
        du7 du7Var;
        cu7 cu7Var;
        Integer valueOf;
        eu7Var.getClass();
        cu7 cu7Var2 = eu7Var.a;
        egc egcVar = cu7Var2.a;
        List list = cu7Var2.b;
        du7 du7Var2 = eu7Var.b;
        int i2 = du7Var2.a;
        int i3 = du7Var2.b;
        int c2 = egcVar.c(i);
        if (egcVar instanceof xeq) {
            xeq xeqVar = (xeq) egcVar;
            List list2 = xeqVar.a;
            List list3 = list2;
            int size = list3.size();
            if (c2 < 0 || c2 >= size) {
                rj7.g(dfi.f("originalPosition = ", c2, list2.size(), " is out of fixed queue bounds (size = ", "). Can't remove not existing element."));
                return null;
            }
            ArrayList arrayList = new ArrayList(list3);
            arrayList.remove(c2);
            if (arrayList.isEmpty()) {
                km7Var = y4b.a;
            } else {
                List list4 = xeqVar.b;
                ArrayList arrayList2 = new ArrayList();
                Iterator it = list4.iterator();
                while (it.hasNext()) {
                    int intValue = ((Number) it.next()).intValue();
                    if (intValue == c2) {
                        valueOf = null;
                    } else {
                        if (intValue > c2) {
                            intValue--;
                        }
                        valueOf = Integer.valueOf(intValue);
                    }
                    if (valueOf != null) {
                        arrayList2.add(valueOf);
                    }
                }
                km7Var = new xeq(arrayList, arrayList2);
            }
        } else {
            if (!(egcVar instanceof km7)) {
                if (egcVar.equals(y4b.a)) {
                    e7o.o(hrg.q("Can't remove element at originalPosition = ", gxj.a(c2), " from empty queue"));
                    return null;
                }
                b6e.s();
                return null;
            }
            List list5 = ((km7) egcVar).a;
            List list6 = list5;
            int size2 = list6.size();
            if (c2 < 0 || c2 >= size2) {
                rj7.g(dfi.f("originalPosition = ", c2, list5.size(), " is out of fixed queue bounds (size = ", "). Can't remove not existing element."));
                return null;
            }
            ArrayList arrayList3 = new ArrayList(list6);
            arrayList3.remove(c2);
            km7Var = new km7(arrayList3);
        }
        if (Intrinsics.e(i, i2) < 0) {
            cu7Var = cu7.a(cu7Var2, km7Var, null, 2);
            du7Var = new du7(i2 - 1, i3 - 1);
        } else {
            if (Intrinsics.e(i, i3) > 0) {
                a2 = cu7.a(cu7Var2, km7Var, null, 2);
            } else if (i == i2) {
                int g2 = u75.g(egcVar.getElements());
                if (Intrinsics.e(i2, g2) < 0) {
                    cu7Var = cu7.a(cu7Var2, km7Var, null, 2);
                    if (i2 != i3) {
                        i3--;
                    }
                    du7Var = new du7(i2, i3);
                } else {
                    if (i2 != g2) {
                        e7o.o(dfi.c(i, "removePosition = ", " is equal to current position and is out of fixed queue bounds. Can't remove not existing element."));
                        return null;
                    }
                    mwk mwkVar = (mwk) CollectionsKt.firstOrNull(list);
                    if (mwkVar == null) {
                        a2 = cu7.a(cu7Var2, km7Var, null, 2);
                    } else {
                        egc o0 = wdp.o0(km7Var, mwkVar);
                        List L = CollectionsKt.L(list, 1);
                        L.getClass();
                        cu7 cu7Var3 = new cu7(o0, L);
                        du7Var = du7Var2;
                        cu7Var = cu7Var3;
                    }
                }
            } else {
                int i4 = i == i3 ? 1 : 0;
                cu7 a3 = cu7.a(cu7Var2, km7Var, null, 2);
                du7 du7Var3 = new du7(i2, Math.max(i3 - (i4 ^ 1), i2));
                cu7Var = a3;
                du7Var = du7Var3;
            }
            cu7 cu7Var4 = a2;
            du7Var = du7Var2;
            cu7Var = cu7Var4;
        }
        return new eu7(cu7Var, du7Var);
    }

    public static final void f(tsf tsfVar, wct wctVar, ut5 ut5Var, vm vmVar, yci yciVar, hq5 hq5Var, int i) {
        tsfVar.getClass();
        ut5Var.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(78751600);
        int i2 = i | (oq5Var.f(tsfVar) ? 4 : 2) | (oq5Var.f(wctVar) ? 32 : 16) | (oq5Var.h(ut5Var) ? 256 : 128) | (oq5Var.f(vmVar) ? 2048 : 1024);
        if ((i2 & 9363) == 9362 && oq5Var.z()) {
            oq5Var.S();
        } else {
            boolean z = wctVar instanceof gt5;
            lvf lvfVar = null;
            gt5 gt5Var = z ? (gt5) wctVar : null;
            fs fsVar = gt5Var != null ? gt5Var.j : null;
            if (fsVar == null) {
                oq5Var.Z(1037083287);
            } else {
                oq5Var.Z(-1629113686);
                lvfVar = ovf.a(fsVar, oq5Var);
            }
            oq5Var.p(false);
            float f2 = ((Configuration) oq5Var.j(AndroidCompositionLocals_androidKt.a)).screenWidthDp;
            float f3 = 16;
            iic iicVar = new iic(160);
            xof xofVar = (xof) oq5Var.j(es5.n);
            float b2 = (f2 - vmVar.b(xofVar)) - vmVar.c(xofVar);
            oq5Var.Z(-1629100083);
            jx7 jx7Var = (jx7) oq5Var.j(es5.h);
            int K = ff7.K(b2, oq5Var);
            int K2 = ff7.K(f3, oq5Var);
            jx7Var.getClass();
            int size = iicVar.b.a(jx7Var, K, K2).size();
            int i3 = size >= 2 ? size : 2;
            oq5Var.p(false);
            nx0 g2 = qx0.g(f3);
            nx0 g3 = qx0.g(20);
            boolean h = oq5Var.h(lvfVar) | ((i2 & 112) == 32) | oq5Var.d(i3) | oq5Var.h(ut5Var);
            Object K3 = oq5Var.K();
            if (h || K3 == gq5.a) {
                rt5 rt5Var = new rt5(wctVar, lvfVar, i3, ut5Var, 0);
                oq5Var.k0(rt5Var);
                K3 = rt5Var;
            }
            wdp.T(iicVar, yciVar, tsfVar, vmVar, g3, g2, null, z, (Function1) K3, oq5Var, ((i2 << 6) & 896) | 1769520 | (i2 & 7168));
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new bj(tsfVar, wctVar, ut5Var, vmVar, yciVar, i, 13);
        }
    }

    public static final void g(long j, Function0 function0, Function1 function1, wn5 wn5Var, yci yciVar, hq5 hq5Var, int i) {
        int i2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-597299166);
        if ((i & 6) == 0) {
            i2 = (oq5Var.e(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.h(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.h(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var.h(wn5Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= oq5Var.f(yciVar) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((i2 & 9363) == 9362 && oq5Var.z()) {
            oq5Var.S();
        } else {
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (K == kjnVar) {
                K = vz1.h(oq5Var);
            }
            uoi uoiVar = (uoi) K;
            yci d2 = d.d((yci) function1.invoke(androidx.compose.foundation.a.d(xp3.u(yciVar, o5g.G(oq5Var)), uoiVar, null, false, null, null, function0, 28)), 1.0f);
            Object K2 = oq5Var.K();
            if (K2 == kjnVar) {
                K2 = new kz5(21);
                oq5Var.k0(K2);
            }
            yci b2 = nfp.b(d2, false, (Function1) K2);
            kfh d3 = ug3.d(b2c.b, false);
            int i3 = oq5Var.P;
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
            g0g.U(oq5Var, d3, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var, i3, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            zc4.m(j, ild.C(573374252, new fh3(uoiVar, j, wn5Var, 1), oq5Var), oq5Var, (i2 & 14) | 48, 0);
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new pb1(j, function0, function1, wn5Var, yciVar, i);
        }
    }

    public static final void h(oho ohoVar, String str, float f2, wn5 wn5Var, hq5 hq5Var, int i) {
        int i2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-838454643);
        if ((i & 6) == 0) {
            i2 = (oq5Var.f(ohoVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.f(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.c(f2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var.h(wn5Var) ? 2048 : 1024;
        }
        if ((i2 & 1171) == 1170 && oq5Var.z()) {
            oq5Var.S();
        } else {
            bg3.a(ohoVar.a(1.0f, vci.a, false), null, false, ild.C(1370318307, new ng6(str, f2, wn5Var), oq5Var), oq5Var, 3072, 6);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new og6(f2, i, 0, ohoVar, str, wn5Var);
        }
    }

    public static final void i(int i, String str, String str2, hh6 hh6Var, hq5 hq5Var, int i2) {
        iz2 iz2Var = b2c.b;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1660631790);
        int i3 = i2 | (oq5Var.d(i) ? 4 : 2) | (oq5Var.f(str) ? 32 : 16) | (oq5Var.f(str2) ? 256 : 128) | (oq5Var.f(hh6Var) ? 2048 : 1024);
        if ((i3 & 1171) == 1170 && oq5Var.z()) {
            oq5Var.S();
        } else {
            oq5Var.U();
            if ((i2 & 1) != 0 && !oq5Var.y()) {
                oq5Var.S();
            }
            oq5Var.q();
            if (hh6Var.a) {
                oq5Var.Z(-1859144780);
            } else {
                oq5Var.Z(-1846352568);
                vci vciVar = vci.a;
                if (str == null && str2 == null) {
                    oq5Var.Z(-1846295063);
                    float f2 = 60;
                    yci m = d.m(a.o(vciVar, 0.0f, 4, 1), f2);
                    kfh d2 = ug3.d(iz2Var, false);
                    int i4 = oq5Var.P;
                    androidx.compose.runtime.internal.a l = oq5Var.l();
                    yci H = vnj.H(oq5Var, m);
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
                    if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                        ouj.x(i4, oq5Var, i4, kb5Var);
                    }
                    g0g.U(oq5Var, H, wp5.d);
                    irf.r(a0g.E(i, i3 & 14, oq5Var), null, androidx.compose.ui.platform.a.a(d.m(vciVar, f2), "my_shelf_block_button_cover_placeholder"), null, hd6.a, 0.0f, null, oq5Var, 25008, 104);
                    oq5Var.p(true);
                    oq5Var.p(false);
                } else {
                    oq5Var.Z(-1845775193);
                    yci m2 = d.m(a.o(vciVar, 0.0f, 4, 1), 60);
                    kfh d3 = ug3.d(iz2Var, false);
                    int i5 = oq5Var.P;
                    androidx.compose.runtime.internal.a l2 = oq5Var.l();
                    yci H2 = vnj.H(oq5Var, m2);
                    xp5.T.getClass();
                    grb grbVar2 = wp5.b;
                    oq5Var.d0();
                    if (oq5Var.O) {
                        oq5Var.k(grbVar2);
                    } else {
                        oq5Var.n0();
                    }
                    g0g.U(oq5Var, d3, wp5.f);
                    g0g.U(oq5Var, l2, wp5.e);
                    kb5 kb5Var2 = wp5.g;
                    if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i5))) {
                        ouj.x(i5, oq5Var, i5, kb5Var2);
                    }
                    g0g.U(oq5Var, H2, wp5.d);
                    l(vciVar, ild.C(849200341, new kp1(str2, str), oq5Var), oq5Var, 54);
                    oq5Var.p(true);
                    oq5Var.p(false);
                }
            }
            oq5Var.p(false);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new b3(i, str, str2, hh6Var, i2);
        }
    }

    public static final void j(int i, hq5 hq5Var, yci yciVar, String str) {
        boolean booleanValue;
        vci vciVar;
        yci yciVar2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-358715948);
        int i2 = (oq5Var.f(str) ? 4 : 2) | i | 432;
        if ((i2 & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
            yciVar2 = yciVar;
        } else {
            if (str == null) {
                oq5Var.Z(-628057621);
                oq5Var.p(false);
                booleanValue = true;
            } else {
                oq5Var.Z(-1128637349);
                booleanValue = ((Boolean) oq5Var.j(koe.a)).booleanValue();
                oq5Var.p(false);
            }
            vci vciVar2 = vci.a;
            if (booleanValue) {
                oq5Var.Z(-628008847);
                k(54, 0, oq5Var, vciVar2);
                oq5Var.p(false);
                vciVar = vciVar2;
            } else {
                oq5Var.Z(-627906113);
                vciVar = vciVar2;
                w1g.j(str, null, androidx.compose.ui.platform.a.a(xp3.u(ezf.N(d.c(vciVar2, 1.0f), 0.0f), o5g.E(oq5Var)), "my_shelf_block_button_cover"), null, null, null, hd6.a, 0.0f, null, 0, yd5.b, oq5Var, (i2 & 14) | 1572912, 952);
                oq5Var.p(false);
            }
            yciVar2 = vciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new cb1(str, yciVar2, i, 6);
        }
    }

    public static final void k(int i, int i2, hq5 hq5Var, yci yciVar) {
        int i3;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(769925142);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (oq5Var.f(yciVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= oq5Var.c(0.0f) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
        } else {
            if (i4 != 0) {
                yciVar = vci.a;
            }
            ug3.a(androidx.compose.foundation.a.b(ezf.N(d.c(yciVar, 1.0f), 0.0f), d85.b(d85.b, 0.2f, 0.0f, 0.0f, 0.0f, 14), o5g.E(oq5Var)), oq5Var, 0);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new rl4(yciVar, i, i2, 2);
        }
    }

    public static final void l(yci yciVar, wn5 wn5Var, hq5 hq5Var, int i) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(231949186);
        if ((i & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
        } else {
            Object K = oq5Var.K();
            if (K == gq5.a) {
                K = r30.h;
                oq5Var.k0(K);
            }
            kfh kfhVar = (kfh) K;
            int i2 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
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
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i2))) {
                ouj.x(i2, oq5Var, i2, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            eta.l(6, wn5Var, oq5Var, true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new pg6(yciVar, wn5Var, i);
        }
    }

    public static final void m(rfa rfaVar, hq5 hq5Var, int i) {
        rfaVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1213420601);
        int i2 = (oq5Var.h(rfaVar) ? 4 : 2) | i;
        if (oq5Var.P(i2 & 1, (i2 & 3) != 2)) {
            xfa xfaVar = (xfa) szf.Q(rfaVar.h, oq5Var).getValue();
            fvf a2 = hvf.a(0, 0, oq5Var, 0, 3);
            boolean h = oq5Var.h(rfaVar);
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (h || K == kjnVar) {
                dda ddaVar = new dda(0, rfaVar, rfa.class, "onBackClicked", "onBackClicked()V", 0, 8);
                oq5Var.k0(ddaVar);
                K = ddaVar;
            }
            Function0 function0 = (Function0) ((h9f) K);
            boolean h2 = oq5Var.h(rfaVar);
            Object K2 = oq5Var.K();
            if (h2 || K2 == kjnVar) {
                dda ddaVar2 = new dda(0, rfaVar, rfa.class, "onSearchClicked", "onSearchClicked()V", 0, 9);
                oq5Var.k0(ddaVar2);
                K2 = ddaVar2;
            }
            kg5.g(R.string.downloaded_kids, a2, function0, (Function0) ((h9f) K2), null, ild.C(-766708998, new xk(26, xfaVar, rfaVar, a2), oq5Var), oq5Var, 196608, 16);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new kv4(rfaVar, i, 28);
        }
    }

    public static final void n(qyf qyfVar, fle fleVar, nke nkeVar, yci yciVar, hq5 hq5Var, int i) {
        oq5 oq5Var;
        yci yciVar2;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(2067259997);
        int i2 = i | (oq5Var2.h(qyfVar) ? 4 : 2) | (oq5Var2.h(fleVar) ? 32 : 16) | (oq5Var2.h(nkeVar) ? 256 : 128) | 3072;
        final int i3 = 0;
        final int i4 = 1;
        if (oq5Var2.P(i2 & 1, (i2 & 1171) != 1170)) {
            int i5 = i2 & 112;
            boolean z = i5 == 32 || oq5Var2.f(fleVar);
            Object K = oq5Var2.K();
            Object obj = gq5.a;
            if (z || K == obj) {
                K = new rhp();
                oq5Var2.k0(K);
            }
            final rhp rhpVar = (rhp) K;
            boolean h = oq5Var2.h(rhpVar);
            Object K2 = oq5Var2.K();
            if (h || K2 == obj) {
                K2 = new Function1() { // from class: uke
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        switch (i3) {
                            case 0:
                                r2f r2fVar = (r2f) obj2;
                                r2fVar.getClass();
                                rhp rhpVar2 = rhpVar;
                                rhpVar2.getClass();
                                rhpVar2.c(r2fVar);
                                return Unit.a;
                            default:
                                ((oa8) obj2).getClass();
                                return new hi(8, rhpVar);
                        }
                    }
                };
                oq5Var2.k0(K2);
            }
            Set set = fle.e;
            pd.b(new qzm[0], false, ild.C(-1985304556, new t1b(fleVar, nke.b(qyfVar, fleVar, (Function1) K2, null, oq5Var2, i5 | (i2 & 14) | 64 | SQLiteDatabase.OPEN_NOMUTEX | ((i2 << 6) & 57344), 8)), oq5Var2), oq5Var2, 0, 2);
            oq5Var = oq5Var2;
            Unit unit = Unit.a;
            boolean h2 = oq5Var.h(rhpVar);
            Object K3 = oq5Var.K();
            if (h2 || K3 == obj) {
                K3 = new Function1() { // from class: uke
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        switch (i4) {
                            case 0:
                                r2f r2fVar = (r2f) obj2;
                                r2fVar.getClass();
                                rhp rhpVar2 = rhpVar;
                                rhpVar2.getClass();
                                rhpVar2.c(r2fVar);
                                return Unit.a;
                            default:
                                ((oa8) obj2).getClass();
                                return new hi(8, rhpVar);
                        }
                    }
                };
                oq5Var.k0(K3);
            }
            gld.k(unit, (Function1) K3, oq5Var);
            yciVar2 = vci.a;
        } else {
            oq5Var = oq5Var2;
            oq5Var.S();
            yciVar2 = yciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new av5(qyfVar, fleVar, nkeVar, yciVar2, i, 13);
        }
    }

    public static final void o(yci yciVar, hq5 hq5Var, int i) {
        int i2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-2097297063);
        if ((i & 6) == 0) {
            i2 = (oq5Var.g(true) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.f(yciVar) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
        } else {
            yci d2 = d.d(yciVar, 1.0f);
            nho a2 = lho.a(qx0.g(8), b2c.k, oq5Var, 6);
            int i3 = oq5Var.P;
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
            g0g.U(oq5Var, a2, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var, i3, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            if (1.0f <= 0.0d) {
                qme.a("invalid weight; must be greater than zero");
            }
            int i4 = i2 & 14;
            r(new LayoutWeightElement(false, 1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f), null, oq5Var, i4, 4);
            if (1.0f <= 0.0d) {
                qme.a("invalid weight; must be greater than zero");
            }
            u(new LayoutWeightElement(false, 1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f), null, oq5Var, i4, 4);
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new jm0(yciVar, i, 6);
        }
    }

    public static final void p(qh6 qh6Var, o3j o3jVar, zg6 zg6Var, yci yciVar, hq5 hq5Var, int i) {
        int i2;
        yci yciVar2;
        float f2;
        double d2;
        boolean z;
        boolean z2;
        float f3 = ug6.c;
        zg6Var.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-430779664);
        if ((i & 6) == 0) {
            i2 = (oq5Var.f(qh6Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.f(o3jVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.h(zg6Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var.c(f3) ? 2048 : 1024;
        }
        int i3 = i2 | 24576;
        if ((i3 & 9363) == 9362 && oq5Var.z()) {
            oq5Var.S();
            yciVar2 = yciVar;
        } else {
            yciVar2 = vci.a;
            yci e2 = d.e(d.d(yciVar2, 1.0f), f3);
            nho a2 = lho.a(qx0.g(8), b2c.k, oq5Var, 6);
            int i4 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, e2);
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
            if (qh6Var == null) {
                oq5Var.Z(-248221153);
                oq5Var.p(false);
                f2 = Float.MAX_VALUE;
                d2 = 0.0d;
                z2 = true;
                z = false;
            } else {
                oq5Var.Z(-248221152);
                if (1.0f <= 0.0d) {
                    qme.a("invalid weight; must be greater than zero");
                }
                f2 = Float.MAX_VALUE;
                d2 = 0.0d;
                z = false;
                z2 = true;
                s(zg6Var, qh6Var, f3, new LayoutWeightElement(true, 1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f), oq5Var, ((i3 >> 6) & 14) | ((i3 >> 3) & 896), 0);
                oq5Var.p(false);
            }
            if (o3jVar == null) {
                oq5Var.Z(-247961094);
            } else {
                oq5Var.Z(-247961093);
                if (1.0f <= d2) {
                    qme.a("invalid weight; must be greater than zero");
                }
                v(zg6Var, o3jVar, f3, new LayoutWeightElement(z2, 1.0f > f2 ? f2 : 1.0f), oq5Var, ((i3 >> 6) & 14) | ((i3 >> 3) & 896), 0);
            }
            oq5Var.p(z);
            oq5Var.p(z2);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new uu(qh6Var, o3jVar, zg6Var, yciVar2, i);
        }
    }

    public static final void q(String str, List list, String str2, String str3, Function1 function1, float f2, yci yciVar, hh6 hh6Var, hq5 hq5Var, int i) {
        int i2;
        yci yciVar2;
        hh6 q;
        int i3;
        oq5 oq5Var;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-1955279995);
        if ((i & 6) == 0) {
            i2 = (oq5Var2.f(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var2.f(list) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var2.f(str2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var2.f(str3) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= oq5Var2.h(function1) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((196608 & i) == 0) {
            i2 |= oq5Var2.c(f2) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        if ((1572864 & i) == 0) {
            yciVar2 = yciVar;
            i2 |= oq5Var2.f(yciVar2) ? 1048576 : 524288;
        } else {
            yciVar2 = yciVar;
        }
        if ((12582912 & i) == 0) {
            i2 |= RemoteCameraConfig.Camera.BITRATE;
        }
        if ((4793491 & i2) == 4793490 && oq5Var2.z()) {
            oq5Var2.S();
            q = hh6Var;
            oq5Var = oq5Var2;
        } else {
            oq5Var2.U();
            if ((i & 1) == 0 || oq5Var2.y()) {
                q = bow.q(oq5Var2);
                i3 = i2 & (-29360129);
            } else {
                oq5Var2.S();
                i3 = i2 & (-29360129);
                q = hh6Var;
            }
            int i4 = i3;
            oq5Var2.q();
            long h = c3x.h(4284495230L);
            p85 b0 = pd.b0(h);
            float f3 = b0.a;
            float f4 = b0.b + 0.1f;
            if (f4 > 1.0f) {
                f4 = 1.0f;
            }
            float f5 = b0.c - 0.06f;
            if (f5 < 0.0f) {
                f5 = 0.0f;
            }
            int i5 = d85.o;
            long z = mvt.z(f3, f4, f5, 1.0f, 16);
            int i6 = 1;
            boolean z2 = ((i4 & 57344) == 16384) | ((i4 & 14) == 4);
            Object K = oq5Var2.K();
            kjn kjnVar = gq5.a;
            if (z2 || K == kjnVar) {
                K = new lg6(0, str, function1);
                oq5Var2.k0(K);
            }
            Function0 function0 = (Function0) K;
            Object K2 = oq5Var2.K();
            if (K2 == kjnVar) {
                K2 = new fn1(h, i6);
                oq5Var2.k0(K2);
            }
            oq5Var = oq5Var2;
            g(z, function0, (Function1) K2, ild.C(-642921758, new lz4(str, f2, str2, str3, q, list, 1), oq5Var2), yciVar2, oq5Var, ((i4 >> 6) & 57344) | 3456);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new mg6(str, list, str2, str3, function1, f2, yciVar, q, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void r(yci yciVar, hh6 hh6Var, hq5 hq5Var, int i, int i2) {
        int i3;
        yci yciVar2;
        int i4;
        hh6 q;
        int i5;
        yci yciVar3;
        Object K;
        int i6;
        hh6 hh6Var2;
        int i7;
        boolean z;
        yci yciVar4;
        hh6 hh6Var3;
        xmn r;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1619715436);
        if ((i & 6) == 0) {
            i3 = (oq5Var.g(true) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            yciVar2 = yciVar;
            i3 |= oq5Var.f(yciVar2) ? 32 : 16;
            if ((i & 384) == 0) {
                i3 |= 128;
            }
            if ((i3 & 147) == 146 || !oq5Var.z()) {
                oq5Var.U();
                i4 = i & 1;
                vci vciVar = vci.a;
                if (i4 != 0 || oq5Var.y()) {
                    if (i8 != 0) {
                        yciVar2 = vciVar;
                    }
                    q = bow.q(oq5Var);
                    yci yciVar5 = yciVar2;
                    i5 = i3 & (-897);
                    yciVar3 = yciVar5;
                } else {
                    oq5Var.S();
                    yci yciVar6 = yciVar2;
                    i5 = i3 & (-897);
                    yciVar3 = yciVar6;
                    q = hh6Var;
                }
                oq5Var.q();
                yci d2 = d.d(a.m(androidx.compose.foundation.a.b(xp3.u(yciVar3, o5g.G(oq5Var)), ((dq0) oq5Var.j(eq0.a)).c.c, vnj.i), 8), 1.0f);
                K = oq5Var.K();
                if (K == gq5.a) {
                    K = new kz5(20);
                    oq5Var.k0(K);
                }
                yci b2 = nfp.b(d2, false, (Function1) K);
                lx0 lx0Var = qx0.g;
                nho a2 = lho.a(lx0Var, b2c.l, oq5Var, 54);
                i6 = oq5Var.P;
                androidx.compose.runtime.internal.a l = oq5Var.l();
                yci H = vnj.H(oq5Var, b2);
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
                g0g.U(oq5Var, l, kb5Var2);
                kb5 kb5Var3 = wp5.g;
                if (!oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i6))) {
                    ouj.x(i6, oq5Var, i6, kb5Var3);
                }
                kb5 kb5Var4 = wp5.d;
                g0g.U(oq5Var, H, kb5Var4);
                yci b3 = d.b(vciVar, 1.0f);
                hh6Var2 = q;
                if (1.0f <= 0.0d) {
                    qme.a("invalid weight; must be greater than zero");
                }
                yci g2 = vz1.g(1.0f, b3, false);
                ta5 a3 = sa5.a(lx0Var, b2c.n, oq5Var, 6);
                i7 = oq5Var.P;
                androidx.compose.runtime.internal.a l2 = oq5Var.l();
                yci H2 = vnj.H(oq5Var, g2);
                oq5Var.d0();
                if (oq5Var.O) {
                    oq5Var.n0();
                } else {
                    oq5Var.k(grbVar);
                }
                g0g.U(oq5Var, a3, kb5Var);
                g0g.U(oq5Var, l2, kb5Var2);
                if (!oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i7))) {
                    ouj.x(i7, oq5Var, i7, kb5Var3);
                }
                g0g.U(oq5Var, H2, kb5Var4);
                int i9 = i5 & 14;
                int i10 = i9 | 48;
                ivf.l(true, d.r(vciVar, 64), nu0.i(), oq5Var, i10, 0);
                ivf.l(true, d.r(vciVar, 40), nu0.i(), oq5Var, i10, 0);
                oq5Var.p(true);
                if (hh6Var2.a) {
                    oq5Var.Z(-1287878770);
                    z = false;
                    ivf.k(i9, 0, oq5Var, xp3.u(d.m(a.m(vciVar, 4), 60), o5g.G(oq5Var)), true);
                } else {
                    z = false;
                    oq5Var.Z(-1302838254);
                }
                oq5Var.p(z);
                oq5Var.p(true);
                yciVar4 = yciVar3;
                hh6Var3 = hh6Var2;
            } else {
                oq5Var.S();
                hh6Var3 = hh6Var;
                yciVar4 = yciVar2;
            }
            r = oq5Var.r();
            if (r == null) {
                r.d = new kg6(yciVar4, hh6Var3, i, i2, 1);
                return;
            }
            return;
        }
        yciVar2 = yciVar;
        if ((i & 384) == 0) {
        }
        if ((i3 & 147) == 146) {
        }
        oq5Var.U();
        i4 = i & 1;
        vci vciVar2 = vci.a;
        if (i4 != 0) {
        }
        if (i8 != 0) {
        }
        q = bow.q(oq5Var);
        yci yciVar52 = yciVar2;
        i5 = i3 & (-897);
        yciVar3 = yciVar52;
        oq5Var.q();
        yci d22 = d.d(a.m(androidx.compose.foundation.a.b(xp3.u(yciVar3, o5g.G(oq5Var)), ((dq0) oq5Var.j(eq0.a)).c.c, vnj.i), 8), 1.0f);
        K = oq5Var.K();
        if (K == gq5.a) {
        }
        yci b22 = nfp.b(d22, false, (Function1) K);
        lx0 lx0Var2 = qx0.g;
        nho a22 = lho.a(lx0Var2, b2c.l, oq5Var, 54);
        i6 = oq5Var.P;
        androidx.compose.runtime.internal.a l3 = oq5Var.l();
        yci H3 = vnj.H(oq5Var, b22);
        xp5.T.getClass();
        grb grbVar2 = wp5.b;
        oq5Var.d0();
        if (oq5Var.O) {
        }
        kb5 kb5Var5 = wp5.f;
        g0g.U(oq5Var, a22, kb5Var5);
        kb5 kb5Var22 = wp5.e;
        g0g.U(oq5Var, l3, kb5Var22);
        kb5 kb5Var32 = wp5.g;
        if (!oq5Var.O) {
        }
        ouj.x(i6, oq5Var, i6, kb5Var32);
        kb5 kb5Var42 = wp5.d;
        g0g.U(oq5Var, H3, kb5Var42);
        yci b32 = d.b(vciVar2, 1.0f);
        hh6Var2 = q;
        if (1.0f <= 0.0d) {
        }
        yci g22 = vz1.g(1.0f, b32, false);
        ta5 a32 = sa5.a(lx0Var2, b2c.n, oq5Var, 6);
        i7 = oq5Var.P;
        androidx.compose.runtime.internal.a l22 = oq5Var.l();
        yci H22 = vnj.H(oq5Var, g22);
        oq5Var.d0();
        if (oq5Var.O) {
        }
        g0g.U(oq5Var, a32, kb5Var5);
        g0g.U(oq5Var, l22, kb5Var22);
        if (!oq5Var.O) {
        }
        ouj.x(i7, oq5Var, i7, kb5Var32);
        g0g.U(oq5Var, H22, kb5Var42);
        int i92 = i5 & 14;
        int i102 = i92 | 48;
        ivf.l(true, d.r(vciVar2, 64), nu0.i(), oq5Var, i102, 0);
        ivf.l(true, d.r(vciVar2, 40), nu0.i(), oq5Var, i102, 0);
        oq5Var.p(true);
        if (hh6Var2.a) {
        }
        oq5Var.p(z);
        oq5Var.p(true);
        yciVar4 = yciVar3;
        hh6Var3 = hh6Var2;
        r = oq5Var.r();
        if (r == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void s(zg6 zg6Var, qh6 qh6Var, float f2, yci yciVar, hq5 hq5Var, int i, int i2) {
        int i3;
        yci yciVar2;
        boolean h;
        Object K;
        boolean h2;
        Object K2;
        xmn r;
        zg6Var.getClass();
        qh6Var.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1478701320);
        if ((i & 6) == 0) {
            i3 = (oq5Var.h(zg6Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= oq5Var.f(qh6Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= oq5Var.c(f2) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            yciVar2 = yciVar;
            i3 |= oq5Var.f(yciVar2) ? 2048 : 1024;
            if ((i3 & 1171) == 1170 || !oq5Var.z()) {
                yci yciVar3 = i4 == 0 ? vci.a : yciVar2;
                yci a2 = androidx.compose.ui.platform.a.a(yciVar3, "my_shelf_block_button");
                h = oq5Var.h(zg6Var);
                K = oq5Var.K();
                kjn kjnVar = gq5.a;
                if (!h || K == kjnVar) {
                    K = new hg6(zg6Var, 0);
                    oq5Var.k0(K);
                }
                yci b2 = com.yandex.music.core.ui.compose.a.b(a2, null, 0L, 0.0f, null, (Function2) K, 15);
                String str = qh6Var.a;
                List list = qh6Var.b;
                v9b v9bVar = qh6Var.c;
                String str2 = v9bVar == null ? v9bVar.a : null;
                v9b v9bVar2 = qh6Var.d;
                String str3 = v9bVar2 != null ? v9bVar2.a : null;
                h2 = oq5Var.h(zg6Var);
                K2 = oq5Var.K();
                if (!h2 || K2 == kjnVar) {
                    K2 = new ig6(zg6Var, 0);
                    oq5Var.k0(K2);
                }
                q(str, list, str2, str3, (Function1) K2, f2, b2, null, oq5Var, (i3 << 9) & 458752);
                yciVar2 = yciVar3;
            } else {
                oq5Var.S();
            }
            r = oq5Var.r();
            if (r == null) {
                r.d = new jg6(zg6Var, qh6Var, f2, yciVar2, i, i2, 0);
                return;
            }
            return;
        }
        yciVar2 = yciVar;
        if ((i3 & 1171) == 1170) {
        }
        if (i4 == 0) {
        }
        yci a22 = androidx.compose.ui.platform.a.a(yciVar3, "my_shelf_block_button");
        h = oq5Var.h(zg6Var);
        K = oq5Var.K();
        kjn kjnVar2 = gq5.a;
        if (!h) {
        }
        K = new hg6(zg6Var, 0);
        oq5Var.k0(K);
        yci b22 = com.yandex.music.core.ui.compose.a.b(a22, null, 0L, 0.0f, null, (Function2) K, 15);
        String str4 = qh6Var.a;
        List list2 = qh6Var.b;
        v9b v9bVar3 = qh6Var.c;
        if (v9bVar3 == null) {
        }
        v9b v9bVar22 = qh6Var.d;
        if (v9bVar22 != null) {
        }
        h2 = oq5Var.h(zg6Var);
        K2 = oq5Var.K();
        if (!h2) {
        }
        K2 = new ig6(zg6Var, 0);
        oq5Var.k0(K2);
        q(str4, list2, str2, str3, (Function1) K2, f2, b22, null, oq5Var, (i3 << 9) & 458752);
        yciVar2 = yciVar3;
        r = oq5Var.r();
        if (r == null) {
        }
    }

    public static final void t(String str, String str2, String str3, String str4, Function1 function1, float f2, yci yciVar, hh6 hh6Var, hq5 hq5Var, int i) {
        int i2;
        String str5;
        yci yciVar2;
        hh6 q;
        int i3;
        String str6;
        oq5 oq5Var;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-1558623536);
        if ((i & 6) == 0) {
            i2 = (oq5Var2.f(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var2.f(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var2.f(str3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            str5 = str4;
            i2 |= oq5Var2.f(str5) ? 2048 : 1024;
        } else {
            str5 = str4;
        }
        if ((i & 24576) == 0) {
            i2 |= oq5Var2.h(function1) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((196608 & i) == 0) {
            i2 |= oq5Var2.c(f2) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        if ((1572864 & i) == 0) {
            yciVar2 = yciVar;
            i2 |= oq5Var2.f(yciVar2) ? 1048576 : 524288;
        } else {
            yciVar2 = yciVar;
        }
        if ((12582912 & i) == 0) {
            i2 |= RemoteCameraConfig.Camera.BITRATE;
        }
        if ((4793491 & i2) == 4793490 && oq5Var2.z()) {
            oq5Var2.S();
            q = hh6Var;
            oq5Var = oq5Var2;
        } else {
            oq5Var2.U();
            if ((i & 1) == 0 || oq5Var2.y()) {
                q = bow.q(oq5Var2);
                i3 = i2 & (-29360129);
            } else {
                oq5Var2.S();
                i3 = i2 & (-29360129);
                q = hh6Var;
            }
            int i4 = i3;
            oq5Var2.q();
            long h = c3x.h(4291571080L);
            o6g U = y9w.U(new Pair[]{new Pair(Float.valueOf(0.0f), new d85(h)), new Pair(Float.valueOf(1.0f), new d85(c3x.h(4289077100L)))}, 14);
            p85 b0 = pd.b0(h);
            float f3 = b0.a;
            float f4 = b0.b + 0.1f;
            if (f4 > 1.0f) {
                f4 = 1.0f;
            }
            float f5 = b0.c - 0.06f;
            if (f5 < 0.0f) {
                f5 = 0.0f;
            }
            long z = mvt.z(f3, f4, f5, 1.0f, 16);
            boolean z2 = ((i4 & 57344) == 16384) | ((i4 & 14) == 4);
            Object K = oq5Var2.K();
            kjn kjnVar = gq5.a;
            if (z2 || K == kjnVar) {
                str6 = str;
                K = new lg6(1, str6, function1);
                oq5Var2.k0(K);
            } else {
                str6 = str;
            }
            Function0 function0 = (Function0) K;
            Object K2 = oq5Var2.K();
            if (K2 == kjnVar) {
                K2 = new g83(U, 2);
                oq5Var2.k0(K2);
            }
            oq5Var = oq5Var2;
            g(z, function0, (Function1) K2, ild.C(692644499, new lz4(str6, f2, str3, str5, q, str2, 2), oq5Var2), yciVar2, oq5Var, ((i4 >> 6) & 57344) | 3456);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new mg6(str, str2, str3, str4, function1, f2, yciVar, q, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void u(yci yciVar, hh6 hh6Var, hq5 hq5Var, int i, int i2) {
        int i3;
        yci yciVar2;
        int i4;
        hh6 q;
        int i5;
        yci yciVar3;
        Object K;
        int i6;
        hh6 hh6Var2;
        int i7;
        boolean z;
        yci yciVar4;
        hh6 hh6Var3;
        xmn r;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1190486438);
        if ((i & 6) == 0) {
            i3 = (oq5Var.g(true) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            yciVar2 = yciVar;
            i3 |= oq5Var.f(yciVar2) ? 32 : 16;
            if ((i & 384) == 0) {
                i3 |= 128;
            }
            if ((i3 & 147) == 146 || !oq5Var.z()) {
                oq5Var.U();
                i4 = i & 1;
                vci vciVar = vci.a;
                if (i4 != 0 || oq5Var.y()) {
                    if (i8 != 0) {
                        yciVar2 = vciVar;
                    }
                    q = bow.q(oq5Var);
                    yci yciVar5 = yciVar2;
                    i5 = i3 & (-897);
                    yciVar3 = yciVar5;
                } else {
                    oq5Var.S();
                    yci yciVar6 = yciVar2;
                    i5 = i3 & (-897);
                    yciVar3 = yciVar6;
                    q = hh6Var;
                }
                oq5Var.q();
                yci d2 = d.d(a.m(androidx.compose.foundation.a.b(xp3.u(yciVar3, o5g.G(oq5Var)), ((dq0) oq5Var.j(eq0.a)).c.c, vnj.i), 8), 1.0f);
                K = oq5Var.K();
                if (K == gq5.a) {
                    K = new kz5(19);
                    oq5Var.k0(K);
                }
                yci b2 = nfp.b(d2, false, (Function1) K);
                lx0 lx0Var = qx0.g;
                nho a2 = lho.a(lx0Var, b2c.l, oq5Var, 54);
                i6 = oq5Var.P;
                androidx.compose.runtime.internal.a l = oq5Var.l();
                yci H = vnj.H(oq5Var, b2);
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
                g0g.U(oq5Var, l, kb5Var2);
                kb5 kb5Var3 = wp5.g;
                if (!oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i6))) {
                    ouj.x(i6, oq5Var, i6, kb5Var3);
                }
                kb5 kb5Var4 = wp5.d;
                g0g.U(oq5Var, H, kb5Var4);
                yci b3 = d.b(vciVar, 1.0f);
                hh6Var2 = q;
                if (1.0f <= 0.0d) {
                    qme.a("invalid weight; must be greater than zero");
                }
                yci g2 = vz1.g(1.0f, b3, false);
                ta5 a3 = sa5.a(lx0Var, b2c.n, oq5Var, 6);
                i7 = oq5Var.P;
                androidx.compose.runtime.internal.a l2 = oq5Var.l();
                yci H2 = vnj.H(oq5Var, g2);
                oq5Var.d0();
                if (oq5Var.O) {
                    oq5Var.n0();
                } else {
                    oq5Var.k(grbVar);
                }
                g0g.U(oq5Var, a3, kb5Var);
                g0g.U(oq5Var, l2, kb5Var2);
                if (!oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i7))) {
                    ouj.x(i7, oq5Var, i7, kb5Var3);
                }
                g0g.U(oq5Var, H2, kb5Var4);
                int i9 = i5 & 14;
                int i10 = i9 | 48;
                ivf.l(true, d.r(vciVar, 64), nu0.i(), oq5Var, i10, 0);
                ivf.l(true, d.r(vciVar, 40), nu0.i(), oq5Var, i10, 0);
                oq5Var.p(true);
                if (hh6Var2.a) {
                    oq5Var.Z(-313918700);
                    z = false;
                    ivf.k(i9, 0, oq5Var, xp3.u(d.m(a.m(vciVar, 4), 60), o5g.G(oq5Var)), true);
                } else {
                    z = false;
                    oq5Var.Z(-330350312);
                }
                oq5Var.p(z);
                oq5Var.p(true);
                yciVar4 = yciVar3;
                hh6Var3 = hh6Var2;
            } else {
                oq5Var.S();
                hh6Var3 = hh6Var;
                yciVar4 = yciVar2;
            }
            r = oq5Var.r();
            if (r == null) {
                r.d = new kg6(yciVar4, hh6Var3, i, i2, 0);
                return;
            }
            return;
        }
        yciVar2 = yciVar;
        if ((i & 384) == 0) {
        }
        if ((i3 & 147) == 146) {
        }
        oq5Var.U();
        i4 = i & 1;
        vci vciVar2 = vci.a;
        if (i4 != 0) {
        }
        if (i8 != 0) {
        }
        q = bow.q(oq5Var);
        yci yciVar52 = yciVar2;
        i5 = i3 & (-897);
        yciVar3 = yciVar52;
        oq5Var.q();
        yci d22 = d.d(a.m(androidx.compose.foundation.a.b(xp3.u(yciVar3, o5g.G(oq5Var)), ((dq0) oq5Var.j(eq0.a)).c.c, vnj.i), 8), 1.0f);
        K = oq5Var.K();
        if (K == gq5.a) {
        }
        yci b22 = nfp.b(d22, false, (Function1) K);
        lx0 lx0Var2 = qx0.g;
        nho a22 = lho.a(lx0Var2, b2c.l, oq5Var, 54);
        i6 = oq5Var.P;
        androidx.compose.runtime.internal.a l3 = oq5Var.l();
        yci H3 = vnj.H(oq5Var, b22);
        xp5.T.getClass();
        grb grbVar2 = wp5.b;
        oq5Var.d0();
        if (oq5Var.O) {
        }
        kb5 kb5Var5 = wp5.f;
        g0g.U(oq5Var, a22, kb5Var5);
        kb5 kb5Var22 = wp5.e;
        g0g.U(oq5Var, l3, kb5Var22);
        kb5 kb5Var32 = wp5.g;
        if (!oq5Var.O) {
        }
        ouj.x(i6, oq5Var, i6, kb5Var32);
        kb5 kb5Var42 = wp5.d;
        g0g.U(oq5Var, H3, kb5Var42);
        yci b32 = d.b(vciVar2, 1.0f);
        hh6Var2 = q;
        if (1.0f <= 0.0d) {
        }
        yci g22 = vz1.g(1.0f, b32, false);
        ta5 a32 = sa5.a(lx0Var2, b2c.n, oq5Var, 6);
        i7 = oq5Var.P;
        androidx.compose.runtime.internal.a l22 = oq5Var.l();
        yci H22 = vnj.H(oq5Var, g22);
        oq5Var.d0();
        if (oq5Var.O) {
        }
        g0g.U(oq5Var, a32, kb5Var5);
        g0g.U(oq5Var, l22, kb5Var22);
        if (!oq5Var.O) {
        }
        ouj.x(i7, oq5Var, i7, kb5Var32);
        g0g.U(oq5Var, H22, kb5Var42);
        int i92 = i5 & 14;
        int i102 = i92 | 48;
        ivf.l(true, d.r(vciVar2, 64), nu0.i(), oq5Var, i102, 0);
        ivf.l(true, d.r(vciVar2, 40), nu0.i(), oq5Var, i102, 0);
        oq5Var.p(true);
        if (hh6Var2.a) {
        }
        oq5Var.p(z);
        oq5Var.p(true);
        yciVar4 = yciVar3;
        hh6Var3 = hh6Var2;
        r = oq5Var.r();
        if (r == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void v(zg6 zg6Var, o3j o3jVar, float f2, yci yciVar, hq5 hq5Var, int i, int i2) {
        int i3;
        yci yciVar2;
        boolean h;
        Object K;
        boolean h2;
        Object K2;
        xmn r;
        zg6Var.getClass();
        o3jVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1462959258);
        if ((i & 6) == 0) {
            i3 = (oq5Var.h(zg6Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= oq5Var.f(o3jVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= oq5Var.c(f2) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            yciVar2 = yciVar;
            i3 |= oq5Var.f(yciVar2) ? 2048 : 1024;
            if ((i3 & 1171) == 1170 || !oq5Var.z()) {
                yci yciVar3 = i4 == 0 ? vci.a : yciVar2;
                yci a2 = androidx.compose.ui.platform.a.a(yciVar3, "my_shelf_block_new_episodes_button");
                h = oq5Var.h(zg6Var);
                K = oq5Var.K();
                kjn kjnVar = gq5.a;
                if (!h || K == kjnVar) {
                    K = new hg6(zg6Var, 1);
                    oq5Var.k0(K);
                }
                yci b2 = com.yandex.music.core.ui.compose.a.b(a2, null, 0L, 0.0f, null, (Function2) K, 15);
                String str = o3jVar.a;
                String str2 = o3jVar.b;
                v9b v9bVar = o3jVar.c;
                String str3 = v9bVar == null ? v9bVar.a : null;
                v9b v9bVar2 = o3jVar.d;
                String str4 = v9bVar2 != null ? v9bVar2.a : null;
                h2 = oq5Var.h(zg6Var);
                K2 = oq5Var.K();
                if (!h2 || K2 == kjnVar) {
                    K2 = new ig6(zg6Var, 1);
                    oq5Var.k0(K2);
                }
                t(str, str2, str3, str4, (Function1) K2, f2, b2, null, oq5Var, (i3 << 9) & 458752);
                yciVar2 = yciVar3;
            } else {
                oq5Var.S();
            }
            r = oq5Var.r();
            if (r == null) {
                r.d = new jg6(zg6Var, o3jVar, f2, yciVar2, i, i2, 1);
                return;
            }
            return;
        }
        yciVar2 = yciVar;
        if ((i3 & 1171) == 1170) {
        }
        if (i4 == 0) {
        }
        yci a22 = androidx.compose.ui.platform.a.a(yciVar3, "my_shelf_block_new_episodes_button");
        h = oq5Var.h(zg6Var);
        K = oq5Var.K();
        kjn kjnVar2 = gq5.a;
        if (!h) {
        }
        K = new hg6(zg6Var, 1);
        oq5Var.k0(K);
        yci b22 = com.yandex.music.core.ui.compose.a.b(a22, null, 0L, 0.0f, null, (Function2) K, 15);
        String str5 = o3jVar.a;
        String str22 = o3jVar.b;
        v9b v9bVar3 = o3jVar.c;
        if (v9bVar3 == null) {
        }
        v9b v9bVar22 = o3jVar.d;
        if (v9bVar22 != null) {
        }
        h2 = oq5Var.h(zg6Var);
        K2 = oq5Var.K();
        if (!h2) {
        }
        K2 = new ig6(zg6Var, 1);
        oq5Var.k0(K2);
        t(str5, str22, str3, str4, (Function1) K2, f2, b22, null, oq5Var, (i3 << 9) & 458752);
        yciVar2 = yciVar3;
        r = oq5Var.r();
        if (r == null) {
        }
    }

    public static final void w(v32 v32Var, q32 q32Var, hq5 hq5Var, int i) {
        oq5 oq5Var;
        float f2;
        Float valueOf = Float.valueOf(0.0f);
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(457019665);
        int i2 = i | (oq5Var2.f(v32Var) ? 4 : 2) | (oq5Var2.h(q32Var) ? 32 : 16);
        if (oq5Var2.P(i2 & 1, (i2 & 19) != 18)) {
            String M = rvf.M(v32Var.c.a, oq5Var2);
            nho a2 = lho.a(qx0.a, b2c.k, oq5Var2, 0);
            int i3 = oq5Var2.P;
            androidx.compose.runtime.internal.a l = oq5Var2.l();
            vci vciVar = vci.a;
            yci H = vnj.H(oq5Var2, vciVar);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var2.d0();
            if (oq5Var2.O) {
                oq5Var2.k(grbVar);
            } else {
                oq5Var2.n0();
            }
            g0g.U(oq5Var2, a2, wp5.f);
            g0g.U(oq5Var2, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var2, i3, kb5Var);
            }
            g0g.U(oq5Var2, H, wp5.d);
            String M2 = rvf.M(R.string.auto_download_slider_title, oq5Var2);
            ges j = nu0.j();
            agr agrVar = eq0.a;
            xcs.b(M2, androidx.compose.ui.platform.a.a(vciVar, "auto_cache_slider_title"), ((dq0) oq5Var2.j(agrVar)).b.a, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, j, oq5Var2, 48, 0, 65528);
            if (1.0f <= 0.0d) {
                qme.a("invalid weight; must be greater than zero");
            }
            u1g.l(oq5Var2, new LayoutWeightElement(true, 1.0f));
            ges j2 = nu0.j();
            long b2 = d85.b(((dq0) oq5Var2.j(agrVar)).b.b, 0.5f, 0.0f, 0.0f, 0.0f, 14);
            Object K = oq5Var2.K();
            kjn kjnVar = gq5.a;
            if (K == kjnVar) {
                K = new uv1(14);
                oq5Var2.k0(K);
            }
            xcs.b(M, androidx.compose.ui.platform.a.a(nfp.b(vciVar, false, (Function1) K), "auto_cache_slider_limit"), b2, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, j2, oq5Var2, 0, 0, 65528);
            oq5Var2.p(true);
            float f3 = 10;
            u1g.l(oq5Var2, d.e(vciVar, f3));
            fq4 fq4Var = new fq4(0.0f, 1.0f);
            Object K2 = oq5Var2.K();
            if (K2 == kjnVar) {
                q32Var.getClass();
                t32 t32Var = q32Var.a;
                t32Var.getClass();
                Object value = t32Var.n.getValue();
                v32 v32Var2 = value instanceof v32 ? (v32) value : null;
                if (v32Var2 != null) {
                    List list = v32Var2.b;
                    int size = list.size() - 1;
                    f2 = (((Float.valueOf(1.0f).floatValue() - valueOf.floatValue()) / size) * list.indexOf(v32Var2.c)) + valueOf.floatValue();
                } else {
                    f2 = 0.0f;
                }
                K2 = szf.g0(Float.valueOf(f2));
                oq5Var2.k0(K2);
            }
            aqi aqiVar = (aqi) K2;
            float floatValue = ((Number) aqiVar.getValue()).floatValue();
            int size2 = v32Var.b.size() - 2;
            agr agrVar2 = pa5.a;
            long e2 = ((ma5) oq5Var2.j(agrVar2)).e();
            long j3 = ((dq0) oq5Var2.j(agrVar)).a.e;
            long j4 = ((d85) oq5Var2.j(sb6.a)).a;
            if (((ma5) oq5Var2.j(agrVar2)).g()) {
                c3x.N(j4);
            } else {
                c3x.N(j4);
            }
            long D = c3x.D(d85.b(j3, 0.38f, 0.0f, 0.0f, 0.0f, 14), ((dq0) oq5Var2.j(agrVar)).c.a);
            long j5 = ((dq0) oq5Var2.j(agrVar)).c.a;
            long j6 = ((dq0) oq5Var2.j(agrVar)).c.a;
            long j7 = ((dq0) oq5Var2.j(agrVar)).a.a;
            long j8 = ((dq0) oq5Var2.j(agrVar)).a.c;
            long b3 = d85.b(((dq0) oq5Var2.j(agrVar)).a.c, 0.32f, 0.0f, 0.0f, 0.0f, 14);
            long b4 = d85.b(b3, 0.12f, 0.0f, 0.0f, 0.0f, 14);
            lr7 lr7Var = new lr7(e2, D, j6, j5, j7, j8, b3, b4, j7, d85.b(j7, 0.54f, 0.0f, 0.0f, 0.0f, 14), d85.b(j7, 0.12f, 0.0f, 0.0f, 0.0f, 14), d85.b(b4, 0.12f, 0.0f, 0.0f, 0.0f, 14));
            boolean f4 = oq5Var2.f(M);
            Object K3 = oq5Var2.K();
            if (f4 || K3 == kjnVar) {
                K3 = new wq(M, 5);
                oq5Var2.k0(K3);
            }
            yci a3 = androidx.compose.ui.platform.a.a(nfp.b(vciVar, false, (Function1) K3), "auto_cache_slider");
            boolean h = oq5Var2.h(q32Var) | oq5Var2.f(fq4Var);
            Object K4 = oq5Var2.K();
            if (h || K4 == kjnVar) {
                K4 = new g3(13, q32Var, fq4Var, aqiVar);
                oq5Var2.k0(K4);
            }
            kuq.b(floatValue, (Function1) K4, a3, null, null, false, null, size2, null, lr7Var, oq5Var2, 0, 888);
            u1g.l(oq5Var2, d.e(vciVar, f3));
            oq5Var = oq5Var2;
            xcs.b(rvf.M(v32Var.c.b, oq5Var2), androidx.compose.ui.platform.a.a(vciVar, "auto_cache_slider_description"), d85.b(((dq0) oq5Var2.j(agrVar)).b.b, 0.5f, 0.0f, 0.0f, 0.0f, 14), 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, nu0.i(), oq5Var, 48, 0, 65528);
        } else {
            oq5Var = oq5Var2;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new m32(v32Var, q32Var, i, 0);
        }
    }

    public static final void x(q32 q32Var, v32 v32Var, boolean z, hq5 hq5Var, int i) {
        oq5 oq5Var;
        final q32 q32Var2 = q32Var;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-1328523124);
        int i2 = i | (oq5Var2.h(q32Var2) ? 4 : 2) | (oq5Var2.f(v32Var) ? 32 : 16) | (oq5Var2.g(z) ? 256 : 128);
        if (oq5Var2.P(i2 & 1, (i2 & 147) != 146)) {
            boolean booleanValue = ((Boolean) gld.M(q32Var2.e, oq5Var2).getValue()).booleanValue();
            boolean h = oq5Var2.h(q32Var2);
            Object K = oq5Var2.K();
            kjn kjnVar = gq5.a;
            if (h || K == kjnVar) {
                final int i3 = 0;
                K = new Function0() { // from class: n32
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i3) {
                            case 0:
                                q32Var2.a(true);
                                break;
                            case 1:
                                q32Var2.a(false);
                                break;
                            default:
                                q32Var2.a.G(true);
                                break;
                        }
                        return Unit.a;
                    }
                };
                oq5Var2.k0(K);
            }
            Function0 function0 = (Function0) K;
            boolean h2 = oq5Var2.h(q32Var2);
            Object K2 = oq5Var2.K();
            if (h2 || K2 == kjnVar) {
                final int i4 = 1;
                K2 = new Function0() { // from class: n32
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i4) {
                            case 0:
                                q32Var2.a(true);
                                break;
                            case 1:
                                q32Var2.a(false);
                                break;
                            default:
                                q32Var2.a.G(true);
                                break;
                        }
                        return Unit.a;
                    }
                };
                oq5Var2.k0(K2);
            }
            Function0 function02 = (Function0) K2;
            boolean h3 = oq5Var2.h(q32Var2);
            Object K3 = oq5Var2.K();
            if (h3 || K3 == kjnVar) {
                final int i5 = 2;
                K3 = new Function0() { // from class: n32
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i5) {
                            case 0:
                                q32Var2.a(true);
                                break;
                            case 1:
                                q32Var2.a(false);
                                break;
                            default:
                                q32Var2.a.G(true);
                                break;
                        }
                        return Unit.a;
                    }
                };
                oq5Var2.k0(K3);
            }
            vwb.k(booleanValue, function0, function02, (Function0) K3, oq5Var2, 0);
            u1g.l(oq5Var2, d.e(vci.a, 28));
            boolean z2 = v32Var.a;
            boolean h4 = oq5Var2.h(q32Var2);
            Object K4 = oq5Var2.K();
            if (h4 || K4 == kjnVar) {
                m5 m5Var = new m5(1, q32Var, q32.class, "changeAutoCacheModeClick", "changeAutoCacheModeClick(Z)V", 0, 20);
                q32Var2 = q32Var;
                oq5Var2.k0(m5Var);
                K4 = m5Var;
            }
            b(z2, (Function1) ((h9f) K4), z, oq5Var2, i2 & 896);
            boolean z3 = v32Var.a;
            e9b e2 = c.e(weo.S(400, 0, null, 6), 2);
            act S = weo.S(400, 0, null, 6);
            Object K5 = oq5Var2.K();
            if (K5 == kjnVar) {
                K5 = new uv1(15);
                oq5Var2.k0(K5);
            }
            e9b a2 = e2.a(c.l(S, (Function1) K5));
            vpb f2 = c.f(weo.S(400, 0, null, 6), 2);
            act S2 = weo.S(400, 0, null, 6);
            Object K6 = oq5Var2.K();
            if (K6 == kjnVar) {
                K6 = new uv1(15);
                oq5Var2.k0(K6);
            }
            oq5Var = oq5Var2;
            etn.f(z3, null, a2, f2.a(c.n(S2, (Function1) K6)), null, ild.C(-1248921756, new ar(12, v32Var, q32Var2), oq5Var2), oq5Var, 200064, 18);
        } else {
            oq5Var = oq5Var2;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new oc1(q32Var2, v32Var, z, i, 4);
        }
    }

    public static final void y(ttf ttfVar, Object obj, int i, Object obj2, hq5 hq5Var, int i2) {
        int i3;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1439843069);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var.f(ttfVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var.f(obj) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= oq5Var.d(i) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= oq5Var.f(obj2) ? 2048 : 1024;
        }
        if (oq5Var.P(i3 & 1, (i3 & 1171) != 1170)) {
            ((hoo) obj).b(obj2, ild.C(980966366, new kg0(i, ttfVar, obj2), oq5Var), oq5Var, 48);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new rj0(ttfVar, obj, i, obj2, i2);
        }
    }

    public static final boolean z(List... listArr) {
        for (List list : listArr) {
            if (list != null && !list.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    public abstract boolean H(j9 j9Var, b9 b9Var, b9 b9Var2);

    public abstract boolean I(j9 j9Var, Object obj, Object obj2);

    public abstract boolean J(j9 j9Var, h9 h9Var, h9 h9Var2);

    public abstract void V(h9 h9Var, h9 h9Var2);

    public abstract void W(h9 h9Var, Thread thread);
}
