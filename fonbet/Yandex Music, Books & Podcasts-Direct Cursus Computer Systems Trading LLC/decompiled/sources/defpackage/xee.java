package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Build;
import android.util.DisplayMetrics;
import androidx.compose.animation.c;
import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.b;
import androidx.compose.foundation.layout.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import com.yandex.music.shared.dto.domainitem.AlbumDomainItemDto;
import com.yandex.music.shared.dto.domainitem.ContentRestrictionsDto;
import com.yandex.music.shared.dto.domainitem.EntityCoverDto;
import com.yandex.pulse.histogram.ComponentHistograms;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;
import ru.yandex.music.data.audio.Album$AlbumType;
import ru.yandex.music.data.audio.WarningContent;

/* loaded from: classes.dex */
public abstract class xee {
    public static final wn5 a = new wn5(new t83(18), -1275433001, false);
    public static final wn5 b = new wn5(new h3(8), 1319083058, false);
    public static final wn5 c = new wn5(new h3(9), -1345918383, false);
    public static final wn5 d = new wn5(new rz3(5), -1875380261, false);
    public static final wn5 e = new wn5(new po5(11), 1210361559, false);
    public static final wn5 f = new wn5(new ap5(14), 623810461, false);
    public static final wn5 g = new wn5(new ap5(15), -1421680492, false);
    public static final imp h = new imp();
    public static final jnm i = new jnm(Integer.MAX_VALUE);

    public static Serializable A(q1f q1fVar) {
        q1fVar.getClass();
        switch (q1fVar.a.ordinal()) {
            case 0:
                return Long.valueOf(((oqe) q1fVar).b);
            case 1:
                return Double.valueOf(((d9a) q1fVar).b);
            case 2:
                return ((jkr) q1fVar).b;
            case 3:
                return Boolean.valueOf(((mc3) q1fVar).b);
            case 4:
                return null;
            case 5:
                Map map = ((z9h) q1fVar).b;
                LinkedHashMap linkedHashMap = new LinkedHashMap(tah.a(map.size()));
                for (Map.Entry entry : map.entrySet()) {
                    linkedHashMap.put(entry.getKey(), A((q1f) entry.getValue()));
                }
                return linkedHashMap;
            case 6:
                ArrayList arrayList = ((my0) q1fVar).b;
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(A((q1f) it.next()));
                }
                return arrayList2;
            default:
                b6e.s();
                return null;
        }
    }

    public static ComponentHistograms B() {
        ComponentHistograms componentHistograms;
        synchronized (ComponentHistograms.b) {
            ciq ciqVar = ComponentHistograms.c;
            if (!ciqVar.containsKey("")) {
                ciqVar.put("", new ComponentHistograms(""));
            }
            Object obj = ciqVar.get("");
            obj.getClass();
            componentHistograms = (ComponentHistograms) obj;
        }
        return componentHistograms;
    }

    public static final Class C(String str) {
        if (bp6.a.contains(xee.class)) {
            return null;
        }
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (Throwable th) {
            bp6.a(xee.class, th);
            return null;
        }
    }

    public static ComponentHistograms D(String str) {
        ComponentHistograms componentHistograms;
        str.getClass();
        synchronized (ComponentHistograms.b) {
            if (str.equals("")) {
                throw new IllegalArgumentException("Wrong library name");
            }
            ciq ciqVar = ComponentHistograms.c;
            if (!ciqVar.containsKey(str)) {
                ciqVar.put(str, new ComponentHistograms(str));
            }
            Object obj = ciqVar.get(str);
            obj.getClass();
            componentHistograms = (ComponentHistograms) obj;
        }
        return componentHistograms;
    }

    public static final Method E(Class cls, String str, Class... clsArr) {
        if (!bp6.a.contains(xee.class)) {
            try {
                return cls.getMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            } catch (NoSuchMethodException unused) {
            } catch (Throwable th) {
                bp6.a(xee.class, th);
            }
        }
        return null;
    }

    public static q1f F(Object obj) {
        if (obj == null) {
            return new ngj(r1f.e);
        }
        if (obj instanceof Integer) {
            return new oqe(((Number) obj).intValue(), true);
        }
        if (obj instanceof Long) {
            return new oqe(((Number) obj).longValue(), true);
        }
        if (obj instanceof Double) {
            return new d9a(((Number) obj).doubleValue());
        }
        if (obj instanceof String) {
            return new jkr((String) obj);
        }
        if (obj instanceof Boolean) {
            return new mc3(((Boolean) obj).booleanValue());
        }
        if (obj instanceof List) {
            my0 my0Var = new my0();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                my0Var.b.add(F(it.next()));
            }
            return my0Var;
        }
        if (!(obj instanceof Map)) {
            wvs.p(hrg.n(obj, "Unknown type of JSON value: "));
            return null;
        }
        Set<Map.Entry> entrySet = ((Map) obj).entrySet();
        z9h z9hVar = new z9h();
        for (Map.Entry entry : entrySet) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            key.getClass();
            w1g.B(z9hVar.b, (String) key, F(value));
        }
        return z9hVar;
    }

    public static final Object G(Class cls, Object obj, Method method, Object... objArr) {
        if (!bp6.a.contains(xee.class)) {
            try {
                cls.getClass();
                method.getClass();
                if (obj != null) {
                    obj = cls.cast(obj);
                }
                try {
                    return method.invoke(obj, Arrays.copyOf(objArr, objArr.length));
                } catch (IllegalAccessException | InvocationTargetException unused) {
                }
            } catch (Throwable th) {
                bp6.a(xee.class, th);
                return null;
            }
        }
        return null;
    }

    public static final int[] H(List list, int i2) {
        int i3;
        int i4 = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            int size = list.size();
            int[] iArr = new int[size];
            while (i4 < size) {
                iArr[i4] = c3x.U(((d85) list.get(i4)).a);
                i4++;
            }
            return iArr;
        }
        int[] iArr2 = new int[list.size() + i2];
        int size2 = list.size() - 1;
        int size3 = list.size();
        int i5 = 0;
        while (i4 < size3) {
            long j = ((d85) list.get(i4)).a;
            if (d85.d(j) == 0.0f) {
                if (i4 == 0) {
                    i3 = i5 + 1;
                    iArr2[i5] = c3x.U(d85.b(((d85) list.get(1)).a, 0.0f, 0.0f, 0.0f, 0.0f, 14));
                } else if (i4 == size2) {
                    i3 = i5 + 1;
                    iArr2[i5] = c3x.U(d85.b(((d85) list.get(i4 - 1)).a, 0.0f, 0.0f, 0.0f, 0.0f, 14));
                } else {
                    int i6 = i5 + 1;
                    iArr2[i5] = c3x.U(d85.b(((d85) list.get(i4 - 1)).a, 0.0f, 0.0f, 0.0f, 0.0f, 14));
                    i5 += 2;
                    iArr2[i6] = c3x.U(d85.b(((d85) list.get(i4 + 1)).a, 0.0f, 0.0f, 0.0f, 0.0f, 14));
                }
                i5 = i3;
            } else {
                iArr2[i5] = c3x.U(j);
                i5++;
            }
            i4++;
        }
        return iArr2;
    }

    public static final float[] I(int i2, List list, List list2) {
        if (i2 == 0) {
            if (list != null) {
                return CollectionsKt.t0(list);
            }
            return null;
        }
        float[] fArr = new float[list2.size() + i2];
        fArr[0] = list != null ? ((Number) list.get(0)).floatValue() : 0.0f;
        int size = list2.size() - 1;
        int i3 = 1;
        for (int i4 = 1; i4 < size; i4++) {
            long j = ((d85) list2.get(i4)).a;
            float floatValue = list != null ? ((Number) list.get(i4)).floatValue() : i4 / (list2.size() - 1);
            int i5 = i3 + 1;
            fArr[i3] = floatValue;
            if (d85.d(j) == 0.0f) {
                i3 += 2;
                fArr[i5] = floatValue;
            } else {
                i3 = i5;
            }
        }
        fArr[i3] = list != null ? ((Number) list.get(list2.size() - 1)).floatValue() : 1.0f;
        return fArr;
    }

    public static final lt J(AlbumDomainItemDto albumDomainItemDto) {
        WarningContent warningContent;
        albumDomainItemDto.getClass();
        String id = albumDomainItemDto.getId();
        if (id != null) {
            o6c o6cVar = Album$AlbumType.b;
            String albumType = albumDomainItemDto.getAlbumType();
            o6cVar.getClass();
            Album$AlbumType e2 = o6c.e(albumType);
            String title = albumDomainItemDto.getTitle();
            if (title != null) {
                String contentWarning = albumDomainItemDto.getContentWarning();
                if (contentWarning == null || (warningContent = WarningContent.a(contentWarning)) == null) {
                    warningContent = WarningContent.NONE;
                }
                ContentRestrictionsDto contentRestrictions = albumDomainItemDto.getContentRestrictions();
                gd6 F = contentRestrictions != null ? lxe.F(contentRestrictions) : null;
                EntityCoverDto cover = albumDomainItemDto.getCover();
                return new lt(id, e2, title, warningContent, cover != null ? c3x.V(cover) : null, F);
            }
        }
        return null;
    }

    public static final s7a K(m7a m7aVar) {
        m7aVar.getClass();
        u51 u51Var = m7aVar.c;
        String str = u51Var.a;
        String str2 = u51Var.b;
        u7a u7aVar = m7aVar.b;
        return new s7a(str, str2, u7aVar != null ? u7aVar.a : null, u51Var.c);
    }

    public static final List L(List list) {
        int size = list.size();
        return size != 0 ? size != 1 ? Collections.unmodifiableList(new ArrayList(list)) : Collections.singletonList(CollectionsKt.Q(list)) : c5b.a;
    }

    public static final Map M(Map map) {
        int size = map.size();
        if (size == 0) {
            e5b e5bVar = e5b.a;
            e5bVar.getClass();
            return e5bVar;
        }
        if (size != 1) {
            return Collections.unmodifiableMap(new LinkedHashMap(map));
        }
        Map.Entry entry = (Map.Entry) CollectionsKt.P(map.entrySet());
        return Collections.singletonMap(entry.getKey(), entry.getValue());
    }

    public static final String N(long j, hq5 hq5Var) {
        msa msaVar = nsa.b;
        long N = yd5.N(j, ssa.MILLISECONDS);
        oq5 oq5Var = (oq5) hq5Var;
        Resources resources = ((Context) oq5Var.j(AndroidCompositionLocals_androidKt.b)).getResources();
        resources.getClass();
        boolean h2 = oq5Var.h(resources);
        Object K = oq5Var.K();
        if (h2 || K == gq5.a) {
            K = new le0(2, resources, Resources.class, "getQuantityString", "getQuantityString(II)Ljava/lang/String;", 0, 10);
            oq5Var.k0(K);
        }
        return O(N, (Function2) ((h9f) K));
    }

    public static final String O(long j, Function2 function2) {
        function2.getClass();
        msa msaVar = nsa.b;
        long s = nsa.s(j, ssa.HOURS);
        int g2 = nsa.g(j);
        int i2 = nsa.i(j);
        nsa.h(j);
        StringBuilder sb = new StringBuilder();
        if (s > 0) {
            sb.append(s + StringUtil.SPACE + ((String) function2.invoke(Integer.valueOf(R.plurals.number_of_hours), Integer.valueOf((int) s))) + StringUtil.SPACE);
        }
        if (g2 > 0) {
            sb.append(g2 + StringUtil.SPACE + ((String) function2.invoke(Integer.valueOf(R.plurals.number_of_minutes), Integer.valueOf(g2))));
        }
        if (i2 > 0 || sb.length() == 0) {
            sb.append(i2 + StringUtil.SPACE + ((String) function2.invoke(Integer.valueOf(R.plurals.number_of_seconds), Integer.valueOf(i2))));
        }
        return sb.toString();
    }

    public static final void P(List list, List list2) {
        if (list2 == null) {
            if (list.size() >= 2) {
                return;
            }
            xq0.x("colors must have length of at least 2 if colorStops is omitted.");
        } else {
            if (list.size() == list2.size()) {
                return;
            }
            xq0.x("colors and colorStops arguments must have equal length.");
        }
    }

    public static final void a(t41 t41Var, Function0 function0, yci yciVar, hq5 hq5Var, int i2) {
        yci yciVar2;
        int i3;
        vci vciVar;
        vci vciVar2;
        boolean z;
        ges j;
        long j2;
        t41Var.getClass();
        function0.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1014304673);
        int i4 = i2 | (oq5Var.f(t41Var) ? 4 : 2) | (oq5Var.h(function0) ? 32 : 16) | 384;
        if (oq5Var.P(i4 & 1, (i4 & 147) != 146)) {
            long a2 = svd.a(oq5Var);
            jzk jzkVar = vnj.i;
            vci vciVar3 = vci.a;
            yci e2 = d.e(d.d(gut.p1(a.b(vciVar3, a2, jzkVar)), 1.0f), 56);
            kfh d2 = ug3.d(b2c.b, false);
            int i5 = oq5Var.P;
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
            kb5 kb5Var = wp5.f;
            g0g.U(oq5Var, d2, kb5Var);
            kb5 kb5Var2 = wp5.e;
            g0g.U(oq5Var, l, kb5Var2);
            kb5 kb5Var3 = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i5))) {
                ouj.x(i5, oq5Var, i5, kb5Var3);
            }
            kb5 kb5Var4 = wp5.d;
            g0g.U(oq5Var, H, kb5Var4);
            if (t41Var.equals(q41.a) || t41Var.equals(s41.a)) {
                i3 = i4;
                oq5Var.Z(-1728529350);
                vciVar = vciVar3;
                float f2 = 16;
                ivf.l(t41Var instanceof s41, d.r(androidx.compose.foundation.layout.a.q(b.a.a(vciVar, b2c.c), f2, f2, f2, 0.0f, 8), 148), nu0.j(), oq5Var, 0, 0);
                oq5Var.p(false);
            } else {
                if (!(t41Var instanceof r41)) {
                    throw vz1.i(oq5Var, -748497604, false);
                }
                oq5Var.Z(-1728038899);
                yci c2 = d.c(vciVar3, 1.0f);
                kfh d3 = ug3.d(b2c.f, false);
                int i6 = oq5Var.P;
                androidx.compose.runtime.internal.a l2 = oq5Var.l();
                yci H2 = vnj.H(oq5Var, c2);
                oq5Var.d0();
                if (oq5Var.O) {
                    oq5Var.k(grbVar);
                } else {
                    oq5Var.n0();
                }
                g0g.U(oq5Var, d3, kb5Var);
                g0g.U(oq5Var, l2, kb5Var2);
                if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i6))) {
                    ouj.x(i6, oq5Var, i6, kb5Var3);
                }
                g0g.U(oq5Var, H2, kb5Var4);
                Object K = oq5Var.K();
                if (K == gq5.a) {
                    K = new zs0(12);
                    oq5Var.k0(K);
                }
                yci b2 = nfp.b(vciVar3, true, (Function1) K);
                ta5 a3 = sa5.a(qx0.e, b2c.o, oq5Var, 54);
                int i7 = oq5Var.P;
                androidx.compose.runtime.internal.a l3 = oq5Var.l();
                yci H3 = vnj.H(oq5Var, b2);
                oq5Var.d0();
                if (oq5Var.O) {
                    oq5Var.k(grbVar);
                } else {
                    oq5Var.n0();
                }
                g0g.U(oq5Var, a3, kb5Var);
                g0g.U(oq5Var, l3, kb5Var2);
                if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i7))) {
                    ouj.x(i7, oq5Var, i7, kb5Var3);
                }
                g0g.U(oq5Var, H3, kb5Var4);
                r41 r41Var = (r41) t41Var;
                boolean z2 = r41Var.a != null;
                if (z2) {
                    oq5Var.Z(-2000020034);
                    i3 = i4;
                    z = false;
                    vciVar2 = vciVar3;
                    xv7.j(r41Var.a, null, ((dq0) oq5Var.j(eq0.a)).b.a, 0L, 0L, 0, 0L, 2, false, 1, 0, null, nu0.j(), oq5Var, 0, 3120, 55290);
                    oq5Var = oq5Var;
                } else {
                    i3 = i4;
                    vciVar2 = vciVar3;
                    z = false;
                    oq5Var.Z(-2002795836);
                }
                oq5Var.p(z);
                String M = rvf.M(R.string.artist_concerts_screen_title, oq5Var);
                if (z2) {
                    oq5Var.Z(-757234614);
                    j = nu0.h();
                } else {
                    oq5Var.Z(-757233430);
                    j = nu0.j();
                }
                oq5Var.p(z);
                ges gesVar = j;
                if (z2) {
                    oq5Var.Z(-757227225);
                    j2 = ((dq0) oq5Var.j(eq0.a)).b.b;
                } else {
                    oq5Var.Z(-757226107);
                    j2 = ((dq0) oq5Var.j(eq0.a)).b.a;
                }
                oq5Var.p(z);
                oq5 oq5Var2 = oq5Var;
                xv7.j(M, null, j2, 0L, 0L, 0, 0L, 2, false, 1, 0, null, gesVar, oq5Var2, 0, 3120, 55290);
                oq5Var = oq5Var2;
                f1d.u(oq5Var, true, true, z);
                vciVar = vciVar2;
            }
            oq5 oq5Var3 = oq5Var;
            t7g.h(null, function0, null, null, oq5Var3, (i3 & 112) | 3456, 1);
            oq5Var = oq5Var3;
            oq5Var.p(true);
            yciVar2 = vciVar;
        } else {
            oq5Var.S();
            yciVar2 = yciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new x3(t41Var, function0, yciVar2, i2, 14);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(List list, float f2, float f3, yci yciVar, float f4, gar garVar, wn5 wn5Var, hq5 hq5Var, int i2, int i3) {
        int i4;
        yci yciVar2;
        int i5;
        gar garVar2;
        float f5;
        yci yciVar3;
        xmn r;
        list.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1802826661);
        if ((i2 & 6) == 0) {
            i4 = ((i2 & 8) == 0 ? oq5Var.f(list) : oq5Var.h(list) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= oq5Var.c(f2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= oq5Var.c(f3) ? 256 : 128;
        }
        int i6 = i3 & 8;
        if (i6 != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            yciVar2 = yciVar;
            i4 |= oq5Var.f(yciVar2) ? 2048 : 1024;
            i5 = i4 | 221184;
            if ((i2 & ScreenMirroringConfig.Video.BITRATE_1_5MB) == 0) {
                i5 |= oq5Var.h(wn5Var) ? 1048576 : 524288;
            }
            if ((599187 & i5) == 599186 || !oq5Var.z()) {
                if (i6 != 0) {
                    yciVar2 = vci.a;
                }
                float f6 = 2;
                gar garVar3 = gar.a;
                yci yciVar4 = yciVar2;
                c(list, f2, f3, yciVar4, f6, garVar3, ild.C(-1443185143, new lo1(wn5Var, 0), oq5Var), oq5Var, 1572864 | (i5 & 14) | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (i5 & 458752), 0);
                garVar2 = garVar3;
                f5 = f6;
                yciVar3 = yciVar4;
            } else {
                oq5Var.S();
                f5 = f4;
                yciVar3 = yciVar2;
                garVar2 = garVar;
            }
            r = oq5Var.r();
            if (r == null) {
                r.d = new mo1(list, f2, f3, yciVar3, f5, garVar2, wn5Var, i2, i3, 0);
                return;
            }
            return;
        }
        yciVar2 = yciVar;
        i5 = i4 | 221184;
        if ((i2 & ScreenMirroringConfig.Video.BITRATE_1_5MB) == 0) {
        }
        if ((599187 & i5) == 599186) {
        }
        if (i6 != 0) {
        }
        float f62 = 2;
        gar garVar32 = gar.a;
        yci yciVar42 = yciVar2;
        c(list, f2, f3, yciVar42, f62, garVar32, ild.C(-1443185143, new lo1(wn5Var, 0), oq5Var), oq5Var, 1572864 | (i5 & 14) | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (i5 & 458752), 0);
        garVar2 = garVar32;
        f5 = f62;
        yciVar3 = yciVar42;
        r = oq5Var.r();
        if (r == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x014c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0166 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(List list, final float f2, final float f3, yci yciVar, float f4, gar garVar, wn5 wn5Var, hq5 hq5Var, int i2, int i3) {
        yci yciVar2;
        int i4;
        float f5;
        int i5;
        wn5 wn5Var2;
        int i6;
        final gar garVar2;
        boolean z;
        boolean f6;
        int i7;
        float f7;
        yci yciVar3;
        xmn r;
        int i8;
        List list2 = list;
        list2.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1536619356);
        int i9 = (i2 & 6) == 0 ? ((i2 & 8) == 0 ? oq5Var.f(list2) : oq5Var.h(list2) ? 4 : 2) | i2 : i2;
        if ((i2 & 48) == 0) {
            i9 |= oq5Var.c(f2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i9 |= oq5Var.c(f3) ? 256 : 128;
        }
        int i10 = i3 & 8;
        if (i10 != 0) {
            i9 |= 3072;
        } else if ((i2 & 3072) == 0) {
            yciVar2 = yciVar;
            i9 |= oq5Var.f(yciVar2) ? 2048 : 1024;
            i4 = i3 & 16;
            if (i4 == 0) {
                i9 |= 24576;
            } else if ((i2 & 24576) == 0) {
                f5 = f4;
                i9 |= oq5Var.c(f5) ? 16384 : RemoteCameraConfig.Notification.ID;
                i5 = i3 & 32;
                if (i5 == 0) {
                    i8 = (196608 & i2) == 0 ? oq5Var.d(garVar == null ? -1 : garVar.ordinal()) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX : 196608;
                    if ((1572864 & i2) != 0) {
                        wn5Var2 = wn5Var;
                        i9 |= oq5Var.h(wn5Var2) ? 1048576 : 524288;
                    } else {
                        wn5Var2 = wn5Var;
                    }
                    i6 = i9;
                    if ((599187 & i6) == 599186 || !oq5Var.z()) {
                        yci yciVar4 = i10 == 0 ? vci.a : yciVar2;
                        final float f8 = i4 == 0 ? 2 : f5;
                        garVar2 = i5 == 0 ? gar.a : garVar;
                        oq5Var.Z(-777538441);
                        List list3 = list2;
                        ArrayList arrayList = new ArrayList(v75.o(list3, 10));
                        boolean z2 = false;
                        final int i11 = 0;
                        for (final Object obj : list3) {
                            int i12 = i11 + 1;
                            if (i11 < 0) {
                                u75.n();
                                throw null;
                            }
                            final wn5 wn5Var3 = wn5Var2;
                            final List list4 = list2;
                            arrayList.add(ild.C(-2052573006, new Function2() { // from class: no1
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj2, Object obj3) {
                                    boolean z3;
                                    hq5 hq5Var2 = (hq5) obj2;
                                    if ((((Integer) obj3).intValue() & 3) == 2) {
                                        oq5 oq5Var2 = (oq5) hq5Var2;
                                        if (oq5Var2.z()) {
                                            oq5Var2.S();
                                            return Unit.a;
                                        }
                                    }
                                    int i13 = i11;
                                    boolean z4 = i13 == 0;
                                    boolean z5 = i13 == u75.g(list4);
                                    yci b2 = androidx.compose.ui.graphics.a.b(vci.a, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, ugo.a, true, 124927);
                                    gar garVar3 = garVar2;
                                    int ordinal = garVar3.ordinal();
                                    if (ordinal == 0) {
                                        z3 = z5;
                                    } else {
                                        if (ordinal != 1) {
                                            b6e.s();
                                            return null;
                                        }
                                        z3 = z4;
                                    }
                                    float f9 = f2;
                                    yci w = xee.w(b2, f9, (f9 / 2) + f8, z3, garVar3, new oo1(f9, f3, 0));
                                    kfh d2 = ug3.d(b2c.b, true);
                                    oq5 oq5Var3 = (oq5) hq5Var2;
                                    int i14 = oq5Var3.P;
                                    androidx.compose.runtime.internal.a l = oq5Var3.l();
                                    yci H = vnj.H(hq5Var2, w);
                                    xp5.T.getClass();
                                    grb grbVar = wp5.b;
                                    oq5Var3.d0();
                                    if (oq5Var3.O) {
                                        oq5Var3.k(grbVar);
                                    } else {
                                        oq5Var3.n0();
                                    }
                                    g0g.U(hq5Var2, d2, wp5.f);
                                    g0g.U(hq5Var2, l, wp5.e);
                                    kb5 kb5Var = wp5.g;
                                    if (oq5Var3.O || !Intrinsics.d(oq5Var3.K(), Integer.valueOf(i14))) {
                                        ouj.x(i14, oq5Var3, i14, kb5Var);
                                    }
                                    g0g.U(hq5Var2, H, wp5.d);
                                    wn5Var3.invoke(Integer.valueOf(i13), obj, hq5Var2, 0);
                                    oq5Var3.p(true);
                                    return Unit.a;
                                }
                            }, oq5Var));
                            list2 = list;
                            z2 = z2;
                            i11 = i12;
                            wn5Var2 = wn5Var;
                        }
                        boolean z3 = z2;
                        oq5Var.p(z3);
                        z = (i6 & 896) != 256 ? true : z3 ? 1 : 0;
                        Object K = oq5Var.K();
                        kjn kjnVar = gq5.a;
                        Object obj2 = K;
                        if (!z || K == kjnVar) {
                            ro1 ro1Var = new ro1(f3);
                            oq5Var.k0(ro1Var);
                            obj2 = ro1Var;
                        }
                        ggi ggiVar = (ggi) obj2;
                        wn5 o = ghh.o(arrayList);
                        f6 = oq5Var.f(ggiVar);
                        Object K2 = oq5Var.K();
                        Object obj3 = K2;
                        if (!f6 || K2 == kjnVar) {
                            hgi hgiVar = new hgi(ggiVar);
                            oq5Var.k0(hgiVar);
                            obj3 = hgiVar;
                        }
                        kfh kfhVar = (kfh) obj3;
                        i7 = oq5Var.P;
                        androidx.compose.runtime.internal.a l = oq5Var.l();
                        yci H = vnj.H(oq5Var, yciVar4);
                        xp5.T.getClass();
                        grb grbVar = wp5.b;
                        oq5Var.d0();
                        if (oq5Var.O) {
                            oq5Var.n0();
                        } else {
                            oq5Var.k(grbVar);
                        }
                        g0g.U(oq5Var, kfhVar, wp5.f);
                        g0g.U(oq5Var, l, wp5.e);
                        kb5 kb5Var = wp5.g;
                        if (!oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i7))) {
                            ouj.x(i7, oq5Var, i7, kb5Var);
                        }
                        g0g.U(oq5Var, H, wp5.d);
                        eta.l(z3 ? 1 : 0, o, oq5Var, true);
                        f7 = f8;
                        yciVar3 = yciVar4;
                    } else {
                        oq5Var.S();
                        yciVar3 = yciVar2;
                        f7 = f5;
                        garVar2 = garVar;
                    }
                    r = oq5Var.r();
                    if (r == null) {
                        r.d = new mo1(list, f2, f3, yciVar3, f7, garVar2, wn5Var, i2, i3, 1);
                        return;
                    }
                    return;
                }
                i9 |= i8;
                if ((1572864 & i2) != 0) {
                }
                i6 = i9;
                if ((599187 & i6) == 599186) {
                }
                if (i10 == 0) {
                }
                if (i4 == 0) {
                }
                if (i5 == 0) {
                }
                oq5Var.Z(-777538441);
                List list32 = list2;
                ArrayList arrayList2 = new ArrayList(v75.o(list32, 10));
                boolean z22 = false;
                final int i112 = 0;
                while (r16.hasNext()) {
                }
                boolean z32 = z22;
                oq5Var.p(z32);
                if ((i6 & 896) != 256) {
                }
                Object K3 = oq5Var.K();
                kjn kjnVar2 = gq5.a;
                Object obj22 = K3;
                if (!z) {
                }
                ro1 ro1Var2 = new ro1(f3);
                oq5Var.k0(ro1Var2);
                obj22 = ro1Var2;
                ggi ggiVar2 = (ggi) obj22;
                wn5 o2 = ghh.o(arrayList2);
                f6 = oq5Var.f(ggiVar2);
                Object K22 = oq5Var.K();
                Object obj32 = K22;
                if (!f6) {
                }
                hgi hgiVar2 = new hgi(ggiVar2);
                oq5Var.k0(hgiVar2);
                obj32 = hgiVar2;
                kfh kfhVar2 = (kfh) obj32;
                i7 = oq5Var.P;
                androidx.compose.runtime.internal.a l2 = oq5Var.l();
                yci H2 = vnj.H(oq5Var, yciVar4);
                xp5.T.getClass();
                grb grbVar2 = wp5.b;
                oq5Var.d0();
                if (oq5Var.O) {
                }
                g0g.U(oq5Var, kfhVar2, wp5.f);
                g0g.U(oq5Var, l2, wp5.e);
                kb5 kb5Var2 = wp5.g;
                if (!oq5Var.O) {
                }
                ouj.x(i7, oq5Var, i7, kb5Var2);
                g0g.U(oq5Var, H2, wp5.d);
                eta.l(z32 ? 1 : 0, o2, oq5Var, true);
                f7 = f8;
                yciVar3 = yciVar4;
                r = oq5Var.r();
                if (r == null) {
                }
            }
            f5 = f4;
            i5 = i3 & 32;
            if (i5 == 0) {
            }
            i9 |= i8;
            if ((1572864 & i2) != 0) {
            }
            i6 = i9;
            if ((599187 & i6) == 599186) {
            }
            if (i10 == 0) {
            }
            if (i4 == 0) {
            }
            if (i5 == 0) {
            }
            oq5Var.Z(-777538441);
            List list322 = list2;
            ArrayList arrayList22 = new ArrayList(v75.o(list322, 10));
            boolean z222 = false;
            final int i1122 = 0;
            while (r16.hasNext()) {
            }
            boolean z322 = z222;
            oq5Var.p(z322);
            if ((i6 & 896) != 256) {
            }
            Object K32 = oq5Var.K();
            kjn kjnVar22 = gq5.a;
            Object obj222 = K32;
            if (!z) {
            }
            ro1 ro1Var22 = new ro1(f3);
            oq5Var.k0(ro1Var22);
            obj222 = ro1Var22;
            ggi ggiVar22 = (ggi) obj222;
            wn5 o22 = ghh.o(arrayList22);
            f6 = oq5Var.f(ggiVar22);
            Object K222 = oq5Var.K();
            Object obj322 = K222;
            if (!f6) {
            }
            hgi hgiVar22 = new hgi(ggiVar22);
            oq5Var.k0(hgiVar22);
            obj322 = hgiVar22;
            kfh kfhVar22 = (kfh) obj322;
            i7 = oq5Var.P;
            androidx.compose.runtime.internal.a l22 = oq5Var.l();
            yci H22 = vnj.H(oq5Var, yciVar4);
            xp5.T.getClass();
            grb grbVar22 = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
            }
            g0g.U(oq5Var, kfhVar22, wp5.f);
            g0g.U(oq5Var, l22, wp5.e);
            kb5 kb5Var22 = wp5.g;
            if (!oq5Var.O) {
            }
            ouj.x(i7, oq5Var, i7, kb5Var22);
            g0g.U(oq5Var, H22, wp5.d);
            eta.l(z322 ? 1 : 0, o22, oq5Var, true);
            f7 = f8;
            yciVar3 = yciVar4;
            r = oq5Var.r();
            if (r == null) {
            }
        }
        yciVar2 = yciVar;
        i4 = i3 & 16;
        if (i4 == 0) {
        }
        f5 = f4;
        i5 = i3 & 32;
        if (i5 == 0) {
        }
        i9 |= i8;
        if ((1572864 & i2) != 0) {
        }
        i6 = i9;
        if ((599187 & i6) == 599186) {
        }
        if (i10 == 0) {
        }
        if (i4 == 0) {
        }
        if (i5 == 0) {
        }
        oq5Var.Z(-777538441);
        List list3222 = list2;
        ArrayList arrayList222 = new ArrayList(v75.o(list3222, 10));
        boolean z2222 = false;
        final int i11222 = 0;
        while (r16.hasNext()) {
        }
        boolean z3222 = z2222;
        oq5Var.p(z3222);
        if ((i6 & 896) != 256) {
        }
        Object K322 = oq5Var.K();
        kjn kjnVar222 = gq5.a;
        Object obj2222 = K322;
        if (!z) {
        }
        ro1 ro1Var222 = new ro1(f3);
        oq5Var.k0(ro1Var222);
        obj2222 = ro1Var222;
        ggi ggiVar222 = (ggi) obj2222;
        wn5 o222 = ghh.o(arrayList222);
        f6 = oq5Var.f(ggiVar222);
        Object K2222 = oq5Var.K();
        Object obj3222 = K2222;
        if (!f6) {
        }
        hgi hgiVar222 = new hgi(ggiVar222);
        oq5Var.k0(hgiVar222);
        obj3222 = hgiVar222;
        kfh kfhVar222 = (kfh) obj3222;
        i7 = oq5Var.P;
        androidx.compose.runtime.internal.a l222 = oq5Var.l();
        yci H222 = vnj.H(oq5Var, yciVar4);
        xp5.T.getClass();
        grb grbVar222 = wp5.b;
        oq5Var.d0();
        if (oq5Var.O) {
        }
        g0g.U(oq5Var, kfhVar222, wp5.f);
        g0g.U(oq5Var, l222, wp5.e);
        kb5 kb5Var222 = wp5.g;
        if (!oq5Var.O) {
        }
        ouj.x(i7, oq5Var, i7, kb5Var222);
        g0g.U(oq5Var, H222, wp5.d);
        eta.l(z3222 ? 1 : 0, o222, oq5Var, true);
        f7 = f8;
        yciVar3 = yciVar4;
        r = oq5Var.r();
        if (r == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x027d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void d(Function0 function0, yci yciVar, boolean z, lk7 lk7Var, dup dupVar, kk7 kk7Var, o0k o0kVar, pyc pycVar, hq5 hq5Var, int i2, int i3) {
        int i4;
        yci yciVar2;
        int i5;
        boolean z2;
        lk7 lk7Var2;
        dup dupVar2;
        kk7 kk7Var2;
        int i6;
        int i7;
        int i8;
        o0k o0kVar2;
        boolean z3;
        oq5 oq5Var;
        lk7 lk7Var3;
        dup dupVar3;
        kk7 kk7Var3;
        xmn r;
        dup dupVar4;
        oq5 oq5Var2;
        boolean z4;
        int i9;
        kk7 kk7Var4;
        dup dupVar5;
        kk7 kk7Var5;
        yci yciVar3;
        boolean z5;
        o0k o0kVar3;
        Object K;
        kjn kjnVar;
        long j;
        yci yciVar4;
        kk7 kk7Var6;
        boolean z6;
        uoi uoiVar;
        int i10;
        fk0 fk0Var;
        vm0 vm0Var;
        int i11;
        int i12;
        int i13;
        oq5 oq5Var3 = (oq5) hq5Var;
        oq5Var3.b0(-2116133464);
        if ((i2 & 6) == 0) {
            i4 = (oq5Var3.h(function0) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i14 = i3 & 2;
        if (i14 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            yciVar2 = yciVar;
            i4 |= oq5Var3.f(yciVar2) ? 32 : 16;
            i5 = i3 & 4;
            if (i5 == 0) {
                i4 |= 384;
            } else if ((i2 & 384) == 0) {
                z2 = z;
                i4 |= oq5Var3.g(z2) ? 256 : 128;
                if ((i3 & 8) != 0) {
                    i4 |= 3072;
                } else if ((i2 & 3072) == 0) {
                    i4 |= oq5Var3.f(null) ? 2048 : 1024;
                }
                if ((i2 & 24576) == 0) {
                    if ((i3 & 16) == 0) {
                        lk7Var2 = lk7Var;
                        if (oq5Var3.f(lk7Var2)) {
                            i13 = 16384;
                            i4 |= i13;
                        }
                    } else {
                        lk7Var2 = lk7Var;
                    }
                    i13 = RemoteCameraConfig.Notification.ID;
                    i4 |= i13;
                } else {
                    lk7Var2 = lk7Var;
                }
                if ((196608 & i2) == 0) {
                    dupVar2 = dupVar;
                    i4 |= ((i3 & 32) == 0 && oq5Var3.f(dupVar2)) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
                } else {
                    dupVar2 = dupVar;
                }
                if ((i3 & 64) != 0) {
                    i4 |= ScreenMirroringConfig.Video.BITRATE_1_5MB;
                } else if ((i2 & ScreenMirroringConfig.Video.BITRATE_1_5MB) == 0) {
                    i4 |= oq5Var3.f(null) ? 1048576 : 524288;
                }
                if ((12582912 & i2) == 0) {
                    if ((i3 & 128) == 0) {
                        kk7Var2 = kk7Var;
                        if (oq5Var3.f(kk7Var2)) {
                            i12 = 8388608;
                            i4 |= i12;
                        }
                    } else {
                        kk7Var2 = kk7Var;
                    }
                    i12 = RemoteCameraConfig.Camera.BITRATE;
                    i4 |= i12;
                } else {
                    kk7Var2 = kk7Var;
                }
                i6 = i3 & 256;
                if (i6 != 0) {
                    i4 |= 100663296;
                } else if ((i2 & 100663296) == 0) {
                    i7 = i6;
                    i4 |= oq5Var3.f(o0kVar) ? 67108864 : 33554432;
                    if ((i2 & 805306368) == 0) {
                        i4 |= oq5Var3.h(pycVar) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
                    }
                    i8 = i4;
                    boolean z7 = true;
                    if (oq5Var3.P(i8 & 1, (i8 & 306783379) == 306783378)) {
                        oq5Var3.S();
                        o0kVar2 = o0kVar;
                        z3 = z2;
                        oq5Var = oq5Var3;
                        lk7Var3 = lk7Var2;
                        dupVar3 = dupVar2;
                        kk7Var3 = kk7Var;
                    } else {
                        oq5Var3.U();
                        if ((i2 & 1) == 0 || oq5Var3.y()) {
                            yci yciVar5 = i14 != 0 ? vci.a : yciVar2;
                            boolean z8 = i5 != 0 ? true : z2;
                            if ((i3 & 16) != 0) {
                                i8 &= -57345;
                                lk7Var2 = bl3.b(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, oq5Var3, 196608, 31);
                            }
                            if ((i3 & 32) != 0) {
                                dupVar4 = ((ivp) oq5Var3.j(kvp.a)).a;
                                i8 &= -458753;
                            } else {
                                dupVar4 = dupVar2;
                            }
                            int i15 = i8;
                            if ((i3 & 128) != 0) {
                                z4 = false;
                                i9 = i7;
                                kk7Var4 = bl3.a(0L, 0L, 0L, 0L, oq5Var3, 24576, 15);
                                oq5Var2 = oq5Var3;
                                i15 &= -29360129;
                            } else {
                                oq5Var2 = oq5Var3;
                                z4 = false;
                                i9 = i7;
                                kk7Var4 = kk7Var;
                            }
                            i8 = i15;
                            if (i9 != 0) {
                                kk7Var5 = kk7Var4;
                                z5 = z8;
                                o0kVar3 = bl3.a;
                                dupVar5 = dupVar4;
                                yciVar3 = yciVar5;
                                oq5Var2.q();
                                oq5Var2.Z(1050689923);
                                K = oq5Var2.K();
                                kjnVar = gq5.a;
                                if (K == kjnVar) {
                                    K = vz1.h(oq5Var2);
                                }
                                uoi uoiVar2 = (uoi) K;
                                oq5Var2.p(z4);
                                int i16 = i8 >> 6;
                                kk7Var5.getClass();
                                oq5Var2.Z(-2133647540);
                                aqi o0 = szf.o0(new d85(!z5 ? kk7Var5.b : kk7Var5.d), oq5Var2);
                                oq5Var2.p(false);
                                yci b2 = nfp.b(yciVar3, false, rq1.z0);
                                oq5Var2.Z(-655254499);
                                yci yciVar6 = yciVar3;
                                dup dupVar6 = dupVar5;
                                aqi o02 = szf.o0(new d85(!z5 ? kk7Var5.a : kk7Var5.c), oq5Var2);
                                oq5Var2.p(false);
                                long j2 = ((d85) o02.getValue()).a;
                                long b3 = d85.b(((d85) o0.getValue()).a, 1.0f, 0.0f, 0.0f, 0.0f, 14);
                                if (lk7Var2 != null) {
                                    oq5Var2.Z(1051096580);
                                    oq5Var2.p(false);
                                    j = b3;
                                    yciVar4 = b2;
                                    kk7Var6 = kk7Var5;
                                    z6 = z5;
                                    uoiVar = uoiVar2;
                                    i10 = i8;
                                    i11 = 0;
                                    vm0Var = null;
                                } else {
                                    oq5Var2.Z(-243188323);
                                    oq5Var2.Z(-1588756907);
                                    Object K2 = oq5Var2.K();
                                    if (K2 == kjnVar) {
                                        K2 = new s2r();
                                        oq5Var2.k0(K2);
                                    }
                                    s2r s2rVar = (s2r) K2;
                                    boolean f2 = oq5Var2.f(uoiVar2);
                                    j = b3;
                                    Object K3 = oq5Var2.K();
                                    if (f2 || K3 == kjnVar) {
                                        yciVar4 = b2;
                                        K3 = new dl3(uoiVar2, s2rVar, null, 1);
                                        oq5Var2.k0(K3);
                                    } else {
                                        yciVar4 = b2;
                                    }
                                    gld.w(oq5Var2, uoiVar2, (Function2) K3);
                                    tre treVar = (tre) CollectionsKt.Z(s2rVar);
                                    float f3 = !z5 ? lk7Var2.c : treVar instanceof rqm ? lk7Var2.b : treVar instanceof k4e ? lk7Var2.d : treVar instanceof poc ? lk7Var2.e : lk7Var2.a;
                                    Object K4 = oq5Var2.K();
                                    if (K4 == kjnVar) {
                                        kk7Var6 = kk7Var5;
                                        K4 = new fk0(new cma(f3), azt.c, null, 12);
                                        oq5Var2.k0(K4);
                                    } else {
                                        kk7Var6 = kk7Var5;
                                    }
                                    fk0 fk0Var2 = (fk0) K4;
                                    cma cmaVar = new cma(f3);
                                    boolean h2 = oq5Var2.h(fk0Var2) | oq5Var2.c(f3) | ((((i16 & 14) ^ 6) > 4 && oq5Var2.g(z5)) || (i16 & 6) == 4);
                                    if ((((i16 & 896) ^ 384) <= 256 || !oq5Var2.f(lk7Var2)) && (i16 & 384) != 256) {
                                        z7 = false;
                                    }
                                    boolean h3 = h2 | z7 | oq5Var2.h(treVar);
                                    Object K5 = oq5Var2.K();
                                    if (h3 || K5 == kjnVar) {
                                        z6 = z5;
                                        uoiVar = uoiVar2;
                                        i10 = i8;
                                        fk0Var = fk0Var2;
                                        el3 el3Var = new el3(fk0Var, f3, z6, lk7Var2, treVar, null, 1);
                                        oq5Var2.k0(el3Var);
                                        K5 = el3Var;
                                    } else {
                                        z6 = z5;
                                        uoiVar = uoiVar2;
                                        i10 = i8;
                                        fk0Var = fk0Var2;
                                    }
                                    gld.w(oq5Var2, cmaVar, (Function2) K5);
                                    vm0Var = fk0Var.c;
                                    i11 = 0;
                                    oq5Var2.p(false);
                                    oq5Var2.p(false);
                                }
                                boolean z9 = z6;
                                oq5Var = oq5Var2;
                                q5g.l(function0, yciVar4, z9, dupVar6, j2, j, null, vm0Var == null ? ((cma) vm0Var.b.getValue()).a : i11, uoiVar, ild.C(7524271, new lf0(1, o0, o0kVar3, pycVar), oq5Var2), oq5Var, (i10 & 3670016) | (i10 & 14) | 805306368 | (i10 & 896) | (i16 & 7168), 0);
                                o0kVar2 = o0kVar3;
                                lk7Var3 = lk7Var2;
                                dupVar3 = dupVar6;
                                z3 = z9;
                                yciVar2 = yciVar6;
                                kk7Var3 = kk7Var6;
                            } else {
                                dupVar5 = dupVar4;
                                kk7Var5 = kk7Var4;
                                yciVar3 = yciVar5;
                                z5 = z8;
                            }
                        } else {
                            oq5Var3.S();
                            if ((i3 & 16) != 0) {
                                i8 &= -57345;
                            }
                            if ((i3 & 32) != 0) {
                                i8 &= -458753;
                            }
                            if ((i3 & 128) != 0) {
                                i8 &= -29360129;
                            }
                            yciVar3 = yciVar2;
                            z5 = z2;
                            oq5Var2 = oq5Var3;
                            kk7Var5 = kk7Var2;
                            z4 = false;
                            dupVar5 = dupVar2;
                        }
                        o0kVar3 = o0kVar;
                        oq5Var2.q();
                        oq5Var2.Z(1050689923);
                        K = oq5Var2.K();
                        kjnVar = gq5.a;
                        if (K == kjnVar) {
                        }
                        uoi uoiVar22 = (uoi) K;
                        oq5Var2.p(z4);
                        int i162 = i8 >> 6;
                        kk7Var5.getClass();
                        oq5Var2.Z(-2133647540);
                        aqi o03 = szf.o0(new d85(!z5 ? kk7Var5.b : kk7Var5.d), oq5Var2);
                        oq5Var2.p(false);
                        yci b22 = nfp.b(yciVar3, false, rq1.z0);
                        oq5Var2.Z(-655254499);
                        yci yciVar62 = yciVar3;
                        dup dupVar62 = dupVar5;
                        aqi o022 = szf.o0(new d85(!z5 ? kk7Var5.a : kk7Var5.c), oq5Var2);
                        oq5Var2.p(false);
                        long j22 = ((d85) o022.getValue()).a;
                        long b32 = d85.b(((d85) o03.getValue()).a, 1.0f, 0.0f, 0.0f, 0.0f, 14);
                        if (lk7Var2 != null) {
                        }
                        boolean z92 = z6;
                        oq5Var = oq5Var2;
                        q5g.l(function0, yciVar4, z92, dupVar62, j22, j, null, vm0Var == null ? ((cma) vm0Var.b.getValue()).a : i11, uoiVar, ild.C(7524271, new lf0(1, o03, o0kVar3, pycVar), oq5Var2), oq5Var, (i10 & 3670016) | (i10 & 14) | 805306368 | (i10 & 896) | (i162 & 7168), 0);
                        o0kVar2 = o0kVar3;
                        lk7Var3 = lk7Var2;
                        dupVar3 = dupVar62;
                        z3 = z92;
                        yciVar2 = yciVar62;
                        kk7Var3 = kk7Var6;
                    }
                    r = oq5Var.r();
                    if (r == null) {
                        r.d = new hl3(function0, yciVar2, z3, lk7Var3, dupVar3, kk7Var3, o0kVar2, pycVar, i2, i3);
                        return;
                    }
                    return;
                }
                i7 = i6;
                if ((i2 & 805306368) == 0) {
                }
                i8 = i4;
                boolean z72 = true;
                if (oq5Var3.P(i8 & 1, (i8 & 306783379) == 306783378)) {
                }
                r = oq5Var.r();
                if (r == null) {
                }
            }
            z2 = z;
            if ((i3 & 8) != 0) {
            }
            if ((i2 & 24576) == 0) {
            }
            if ((196608 & i2) == 0) {
            }
            if ((i3 & 64) != 0) {
            }
            if ((12582912 & i2) == 0) {
            }
            i6 = i3 & 256;
            if (i6 != 0) {
            }
            i7 = i6;
            if ((i2 & 805306368) == 0) {
            }
            i8 = i4;
            boolean z722 = true;
            if (oq5Var3.P(i8 & 1, (i8 & 306783379) == 306783378)) {
            }
            r = oq5Var.r();
            if (r == null) {
            }
        }
        yciVar2 = yciVar;
        i5 = i3 & 4;
        if (i5 == 0) {
        }
        z2 = z;
        if ((i3 & 8) != 0) {
        }
        if ((i2 & 24576) == 0) {
        }
        if ((196608 & i2) == 0) {
        }
        if ((i3 & 64) != 0) {
        }
        if ((12582912 & i2) == 0) {
        }
        i6 = i3 & 256;
        if (i6 != 0) {
        }
        i7 = i6;
        if ((i2 & 805306368) == 0) {
        }
        i8 = i4;
        boolean z7222 = true;
        if (oq5Var3.P(i8 & 1, (i8 & 306783379) == 306783378)) {
        }
        r = oq5Var.r();
        if (r == null) {
        }
    }

    public static final void e(ArrayList arrayList, i10 i10Var, fvf fvfVar, o0k o0kVar, pu4 pu4Var, hq5 hq5Var, int i2) {
        int i3;
        fvf fvfVar2;
        oq5 oq5Var;
        fvfVar.getClass();
        o0kVar.getClass();
        pu4Var.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-1970238844);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? oq5Var2.f(arrayList) : oq5Var2.h(arrayList) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var2.d(i10Var.ordinal()) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            fvfVar2 = fvfVar;
            i3 |= oq5Var2.f(fvfVar2) ? 256 : 128;
        } else {
            fvfVar2 = fvfVar;
        }
        if ((i2 & 3072) == 0) {
            i3 |= oq5Var2.f(o0kVar) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= oq5Var2.h(pu4Var) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        int i4 = i3;
        if (oq5Var2.P(i4 & 1, (i4 & 9363) != 9362)) {
            boolean booleanValue = ((Boolean) gld.M(pu4Var.f, oq5Var2).getValue()).booleanValue();
            boolean h2 = oq5Var2.h(pu4Var);
            Object K = oq5Var2.K();
            if (h2 || K == gq5.a) {
                K = new ub4(0, pu4Var, pu4.class, "onRefresh", "onRefresh()V", 0, 14);
                oq5Var2.k0(K);
            }
            oq5Var = oq5Var2;
            bfg.f(booleanValue, (Function0) ((h9f) K), o0kVar, null, false, ild.C(26140164, new bj(fvfVar2, arrayList, o0kVar, i10Var, pu4Var, 9), oq5Var2), oq5Var, ((i4 >> 3) & 896) | 196608, 24);
        } else {
            oq5Var = oq5Var2;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new tu(i2, 7, arrayList, i10Var, fvfVar, o0kVar, pu4Var);
        }
    }

    public static final void f(qan qanVar, xo6 xo6Var, boolean z, pbu pbuVar, Function1 function1, float f2, yci yciVar, hq5 hq5Var, int i2) {
        qanVar.getClass();
        pbuVar.getClass();
        function1.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1713299979);
        int i3 = i2 | (oq5Var.f(qanVar) ? 4 : 2) | (oq5Var.g(z) ? 256 : 128) | (oq5Var.f(pbuVar) ? 2048 : 1024) | (oq5Var.h(function1) ? 16384 : RemoteCameraConfig.Notification.ID) | (oq5Var.c(f2) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX) | (oq5Var.f(yciVar) ? 1048576 : 524288);
        if (oq5Var.P(i3 & 1, (i3 & 599187) != 599186)) {
            sdr b2 = pk0.b(z ? 1.0f : 0.89f, null, "center item", null, oq5Var, 3072, 22);
            p14 p14Var = new p14(qanVar.a, qanVar.b, qanVar.c);
            float f3 = 30;
            yci D = ksw.D(androidx.compose.ui.platform.a.a(yciVar, "cover_carousel"), rvf.M(R.string.cover_carousel_description, oq5Var), null);
            Object K = oq5Var.K();
            Object obj = gq5.a;
            if (K == obj) {
                K = new cp5(19);
                oq5Var.k0(K);
            }
            Function0 function0 = (Function0) K;
            boolean f4 = oq5Var.f(b2);
            Object K2 = oq5Var.K();
            if (f4 || K2 == obj) {
                K2 = new la1(b2, 21);
                oq5Var.k0(K2);
            }
            yd5.g(p14Var, function1, D, function0, (Function0) K2, f2, f3, false, ild.C(1453724706, new pu(xo6Var, z, pbuVar, qanVar, 5), oq5Var), oq5Var, ((i3 >> 9) & 112) | 102239232 | (i3 & 458752), 128);
            oq5Var = oq5Var;
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new fn6(qanVar, xo6Var, z, pbuVar, function1, f2, yciVar, i2);
        }
    }

    public static final void g(xxk xxkVar, xo6 xo6Var, boolean z, pbu pbuVar, boolean z2, hq5 hq5Var, int i2) {
        int i3;
        oq5 oq5Var;
        boolean z3;
        float f2;
        oq5 oq5Var2;
        boolean z4;
        int i4;
        act actVar;
        boolean z5;
        int i5;
        bs1 bs1Var;
        b bVar;
        oq5 oq5Var3 = (oq5) hq5Var;
        oq5Var3.b0(-2136543058);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var3.f(xxkVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var3.f(xo6Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= oq5Var3.g(z) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= oq5Var3.f(pbuVar) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= oq5Var3.g(z2) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if (oq5Var3.P(i3 & 1, (i3 & 9363) != 9362)) {
            xje D = fgq.D(null, oq5Var3, 1);
            act S = weo.S(800, 0, null, 6);
            jyn jynVar = jyn.a;
            sdr s = fgq.s(D, 0.0f, 1.0f, new vje(S), null, oq5Var3, 4536, 8);
            oq5Var = oq5Var3;
            boolean z6 = (pbuVar instanceof nbu) && z && z2;
            kjn kjnVar = gq5.a;
            if (z6) {
                oq5Var.Z(-223490936);
            } else {
                oq5Var.Z(1661747477);
                Object K = oq5Var.K();
                if (K == kjnVar) {
                    K = szf.g0(Float.valueOf(0.0f));
                    oq5Var.k0(K);
                }
                s = (aqi) K;
            }
            oq5Var.p(false);
            vci vciVar = vci.a;
            yci d2 = androidx.compose.foundation.layout.a.d(d.d(vciVar, 1.0f), 1.0f);
            kfh d3 = ug3.d(b2c.b, false);
            int i6 = oq5Var.P;
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
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i6))) {
                ouj.x(i6, oq5Var, i6, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            bo6 a2 = xo6Var.a(xxkVar);
            if (a2 == null) {
                oq5Var.Z(270322287);
                oq5Var.p(false);
            } else {
                oq5Var.Z(270322288);
                float f3 = 8;
                yci u = xp3.u(d.c(androidx.compose.ui.platform.a.a(vciVar, "cover_carouser_image"), 1.0f), ugo.a(f3));
                boolean f4 = oq5Var.f(s);
                Object K2 = oq5Var.K();
                if (f4 || K2 == kjnVar) {
                    K2 = new la1(s, 22);
                    oq5Var.k0(K2);
                }
                yci s2 = wyf.s(u, (Function0) K2);
                bs1 bs1Var2 = (bs1) a2.e.getValue();
                boolean z7 = bs1Var2 instanceof as1;
                b bVar2 = b.a;
                if (z7) {
                    oq5Var.Z(60311411);
                    if (xxkVar.h) {
                        oq5Var.Z(60332367);
                        w4k w4kVar = ((as1) bs1Var2).a;
                        zn6 zn6Var = (zn6) a2.f.getValue();
                        boolean f5 = oq5Var.f(s);
                        i5 = 3;
                        Object K3 = oq5Var.K();
                        if (f5 || K3 == kjnVar) {
                            K3 = new la1(s, 23);
                            oq5Var.k0(K3);
                        }
                        f2 = f3;
                        z4 = false;
                        bVar = bVar2;
                        oq5Var2 = oq5Var;
                        bs1Var = bs1Var2;
                        i4 = 4;
                        actVar = null;
                        z5 = true;
                        p(w4kVar, zn6Var, z, z2, (Function0) K3, oq5Var2, ((i3 >> 3) & 7168) | (i3 & 896));
                    } else {
                        f2 = f3;
                        oq5Var2 = oq5Var;
                        z4 = false;
                        i4 = 4;
                        actVar = null;
                        z5 = true;
                        i5 = 3;
                        bs1Var = bs1Var2;
                        bVar = bVar2;
                        oq5Var2.Z(54701279);
                    }
                    oq5Var2.p(z4);
                    act actVar2 = actVar;
                    oq5 oq5Var4 = oq5Var2;
                    z3 = z4;
                    int i7 = i5;
                    irf.r(((as1) bs1Var).a, null, s2, null, hd6.a, 0.0f, null, oq5Var4, 24624, 104);
                    etn.f(z6, bVar.a(androidx.compose.foundation.layout.a.m(vciVar, f2), b2c.j), c.e(actVar2, i7), c.f(actVar2, i7), null, ild.C(-1554752237, new ix(s, i4), oq5Var4), oq5Var4, 200064, 16);
                    oq5Var4.p(z3);
                    oq5Var = oq5Var4;
                } else {
                    z3 = false;
                    if (bs1Var2 instanceof yr1) {
                        oq5Var.Z(61887916);
                        swf.d(xxkVar.g, gce.d, a.b(s2, ((dq0) oq5Var.j(eq0.a)).a.e, vnj.i), bVar2.a(d.c(vciVar, 0.2f), b2c.f), 0L, d85.m, false, oq5Var, 196656, 80);
                        oq5Var = oq5Var;
                        oq5Var.p(false);
                    } else {
                        oq5Var.Z(62386985);
                        irf.r(new w85(((dq0) oq5Var.j(eq0.a)).a.e), null, s2, null, null, 0.0f, null, oq5Var, 48, 120);
                        oq5Var = oq5Var;
                        oq5Var.p(false);
                    }
                }
                oq5Var.p(z3);
            }
            oq5Var.p(true);
        } else {
            oq5Var = oq5Var3;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new en6(xxkVar, xo6Var, z, pbuVar, z2, i2);
        }
    }

    public static final void h(o78 o78Var, g88 g88Var, hq5 hq5Var, int i2) {
        o78 o78Var2;
        g88 g88Var2;
        boolean z;
        String n;
        o78Var.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1858954721);
        int i3 = i2 | (oq5Var.f(o78Var) ? 4 : 2) | (oq5Var.f(g88Var) ? 32 : 16);
        if ((i3 & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
            o78Var2 = o78Var;
            g88Var2 = g88Var;
        } else {
            vci vciVar = vci.a;
            yci q = androidx.compose.foundation.layout.a.q(d.d(vciVar, 1.0f), 0.0f, 0.0f, 0.0f, 52, 7);
            ta5 a2 = sa5.a(qx0.c, b2c.o, oq5Var, 48);
            int i4 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, q);
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
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var, i4, kb5Var3);
            }
            kb5 kb5Var4 = wp5.d;
            g0g.U(oq5Var, H, kb5Var4);
            yci d2 = d.d(vciVar, 1.0f);
            kfh d3 = ug3.d(b2c.c, false);
            int i5 = oq5Var.P;
            androidx.compose.runtime.internal.a l2 = oq5Var.l();
            yci H2 = vnj.H(oq5Var, d2);
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, d3, kb5Var);
            g0g.U(oq5Var, l2, kb5Var2);
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i5))) {
                ouj.x(i5, oq5Var, i5, kb5Var3);
            }
            g0g.U(oq5Var, H2, kb5Var4);
            float f2 = 32;
            irf.r(a0g.E(2131231247, 0, oq5Var), null, d.o(androidx.compose.foundation.layout.a.q(vciVar, 0.0f, 64, 0.0f, f2, 5), 160, 140), null, hd6.d, 0.0f, null, oq5Var, 25008, 104);
            oq5Var.p(true);
            String M = rvf.M(R.string.storage_warning_title, oq5Var);
            yci q2 = androidx.compose.foundation.layout.a.q(androidx.compose.foundation.layout.a.o(vciVar, f2, 0.0f, 2), 0.0f, 0.0f, 0.0f, 8, 7);
            agr agrVar = eq0.a;
            xcs.b(M, q2, ((dq0) oq5Var.j(agrVar)).b.a, 0L, null, 0L, null, new o9s(3), 0L, 0, false, 0, 0, null, nu0.c(), oq5Var, 48, 0, 65016);
            xcs.b(rvf.M(R.string.storage_warning_description, oq5Var), androidx.compose.foundation.layout.a.q(androidx.compose.foundation.layout.a.o(vciVar, f2, 0.0f, 2), 0.0f, 0.0f, 0.0f, f2, 7), ((dq0) oq5Var.j(agrVar)).b.a, 0L, null, 0L, null, new o9s(3), 0L, 0, false, 0, 0, null, nu0.j(), oq5Var, 48, 0, 65016);
            oq5Var = oq5Var;
            String M2 = rvf.M(R.string.storage_warning_button_storage_phone, oq5Var);
            int i6 = i3 & 14;
            boolean z2 = i6 == 4;
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (z2 || K == kjnVar) {
                o78Var2 = o78Var;
                K = new yg6(9, o78Var2);
                oq5Var.k0(K);
            } else {
                o78Var2 = o78Var;
            }
            float f3 = 290;
            hdg.o(M2, (Function0) K, d.t(androidx.compose.foundation.layout.a.o(vciVar, 42, 0.0f, 2), f3, 0.0f, 2), 0.0f, oq5Var, 384, 8);
            u1g.l(oq5Var, d.e(vciVar, 12));
            g88Var2 = g88Var;
            if (g88Var2.equals(l48.c)) {
                z = false;
                n = vz1.n(oq5Var, 958857300, R.string.storage_warning_button_got_it, oq5Var, false);
            } else {
                z = false;
                if (!g88Var2.equals(fs7.c)) {
                    throw vz1.i(oq5Var, 958855787, false);
                }
                n = vz1.n(oq5Var, 958860671, R.string.storage_warning_button_download_settings, oq5Var, false);
            }
            boolean z3 = (i3 & 112) != 32 ? z : true;
            if (i6 == 4) {
                z = true;
            }
            boolean z4 = z3 | z;
            Object K2 = oq5Var.K();
            if (z4 || K2 == kjnVar) {
                K2 = new aw5(16, g88Var2, o78Var2);
                oq5Var.k0(K2);
            }
            hdg.t(n, (Function0) K2, d.t(androidx.compose.foundation.layout.a.o(vciVar, f2, 0.0f, 2), f3, 0.0f, 2), null, oq5Var, 384, 8);
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new kw5(o78Var2, g88Var2, i2, 12);
        }
    }

    public static final void i(yci yciVar, long j, hq5 hq5Var, int i2) {
        long j2 = j;
        Float valueOf = Float.valueOf(1.0f);
        Float valueOf2 = Float.valueOf(0.8f);
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(683184177);
        int i3 = (oq5Var.f(yciVar) ? 4 : 2) | i2 | (oq5Var.e(j2) ? 32 : 16);
        if (oq5Var.P(i3 & 1, (i3 & 19) != 18)) {
            Float valueOf3 = Float.valueOf(0.0f);
            long j3 = d85.m;
            Pair pair = new Pair(valueOf3, new d85(j3));
            Float valueOf4 = Float.valueOf(0.2f);
            long j4 = d85.b;
            o6g G = y9w.G(new Pair[]{pair, new Pair(valueOf4, new d85(j4)), new Pair(valueOf2, new d85(j4)), new Pair(valueOf, new d85(j3))}, 0.0f, 0.0f, 14);
            j2 = j;
            o6g U = y9w.U(new Pair[]{new Pair(Float.valueOf(0.7f), new d85(j2)), new Pair(valueOf2, new d85(d85.b(j2, 0.4f, 0.0f, 0.0f, 0.0f, 14))), new Pair(Float.valueOf(0.95f), new d85(d85.b(j, 0.05f, 0.0f, 0.0f, 0.0f, 14))), new Pair(valueOf, new d85(d85.b(j2, 0.0f, 0.0f, 0.0f, 0.0f, 14)))}, 14);
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (K == kjnVar) {
                K = new kz5(26);
                oq5Var.k0(K);
            }
            yci a2 = androidx.compose.ui.graphics.a.a(yciVar, (Function1) K);
            boolean f2 = oq5Var.f(U) | oq5Var.f(G);
            Object K2 = oq5Var.K();
            if (f2 || K2 == kjnVar) {
                K2 = new s24(U, G, 1);
                oq5Var.k0(K2);
            }
            u1g.l(oq5Var, androidx.compose.ui.draw.a.c(a2, (Function1) K2));
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new gn1(yciVar, j2, i2);
        }
    }

    public static final void j(e7c e7cVar, yci yciVar, hq5 hq5Var, int i2) {
        yci yciVar2;
        yci yciVar3;
        e7cVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(2126975814);
        int i3 = (oq5Var.f(e7cVar) ? 4 : 2) | i2 | 48;
        if (oq5Var.P(i3 & 1, (i3 & 19) != 18)) {
            h7c h7cVar = (h7c) szf.Q(e7cVar.c, oq5Var).getValue();
            boolean z = h7cVar instanceof f7c;
            vci vciVar = vci.a;
            if (z) {
                oq5Var.Z(-380667970);
                Object K = oq5Var.K();
                if (K == gq5.a) {
                    K = new qxb(23);
                    oq5Var.k0(K);
                }
                yciVar3 = nfp.a(vciVar, (Function1) K);
                oq5Var.p(false);
            } else {
                if (!(h7cVar instanceof g7c)) {
                    throw vz1.i(oq5Var, -380669963, false);
                }
                oq5Var.Z(-380665970);
                oq5Var.p(false);
                yciVar3 = vciVar;
            }
            float f2 = 8;
            hld.l(h7cVar.a(), androidx.compose.ui.platform.a.a(yciVar3, "features"), null, 0.0f, f2, f2, 0.0f, null, 0, h7cVar instanceof f7c, false, false, ild.C(-1336276216, new jv(8, e7cVar, irv.i(oq5Var)), oq5Var), oq5Var, 221184, 384, 3532);
            yciVar2 = vciVar;
        } else {
            oq5Var.S();
            yciVar2 = yciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new t1b(e7cVar, yciVar2, i2, 9);
        }
    }

    public static final void k(boolean z, hq5 hq5Var, int i2) {
        int i3;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1320676839);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var.g(z) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        int i4 = i2 & 48;
        vci vciVar = vci.a;
        if (i4 == 0) {
            i3 |= oq5Var.f(vciVar) ? 32 : 16;
        }
        if (oq5Var.P(i3 & 1, (i3 & 19) != 18)) {
            l(ild.C(766301020, new xu0(10, z), oq5Var), ild.C(1785775540, new sm(22, z), oq5Var), ild.C(-148430859, new sm(23, z), oq5Var), vciVar, oq5Var, ((i3 << 6) & 7168) | 438);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new vf4(i2, 3, z);
        }
    }

    public static final void l(wn5 wn5Var, Function2 function2, Function2 function22, yci yciVar, hq5 hq5Var, int i2) {
        int i3;
        boolean z;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-756971822);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var.h(wn5Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var.h(function2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= oq5Var.h(function22) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= oq5Var.f(yciVar) ? 2048 : 1024;
        }
        if (oq5Var.P(i3 & 1, (i3 & 1171) != 1170)) {
            kx0 kx0Var = qx0.c;
            gz2 gz2Var = b2c.n;
            ta5 a2 = sa5.a(kx0Var, gz2Var, oq5Var, 0);
            int i4 = oq5Var.P;
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
            kb5 kb5Var = wp5.f;
            g0g.U(oq5Var, a2, kb5Var);
            kb5 kb5Var2 = wp5.e;
            g0g.U(oq5Var, l, kb5Var2);
            kb5 kb5Var3 = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var, i4, kb5Var3);
            }
            kb5 kb5Var4 = wp5.d;
            g0g.U(oq5Var, H, kb5Var4);
            vci vciVar = vci.a;
            wn5Var.invoke(xp3.u(d.d(d.e(vciVar, 230), 1.0f), o5g.G(oq5Var)), oq5Var, Integer.valueOf((i3 << 3) & 112));
            u1g.l(oq5Var, d.e(vciVar, 10));
            float f2 = 4;
            yci u = d.u(d.e(vciVar, (w1g.p(nu0.j(), 0, oq5Var, 0, 2) * 3) + f2), b2c.k, true);
            ta5 a3 = sa5.a(kx0Var, gz2Var, oq5Var, 0);
            int i5 = oq5Var.P;
            androidx.compose.runtime.internal.a l2 = oq5Var.l();
            yci H2 = vnj.H(oq5Var, u);
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a3, kb5Var);
            g0g.U(oq5Var, l2, kb5Var2);
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i5))) {
                ouj.x(i5, oq5Var, i5, kb5Var3);
            }
            g0g.U(oq5Var, H2, kb5Var4);
            if (function2 != null) {
                oq5Var.Z(618565391);
                xcs.a(nu0.j(), ild.C(-643895846, new im0(function2, 6), oq5Var), oq5Var, 48);
                eta.p(vciVar, f2, oq5Var, false);
            } else {
                oq5Var.Z(610177628);
                oq5Var.p(false);
            }
            if (function22 != null) {
                oq5Var.Z(618805765);
                xcs.a(nu0.j(), ild.C(-1578935613, new im0(function22, 7), oq5Var), oq5Var, 48);
                z = false;
            } else {
                z = false;
                oq5Var.Z(610177628);
            }
            oq5Var.p(z);
            oq5Var.p(true);
            oq5Var.p(true);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new wda(i2, 5, wn5Var, function2, function22, yciVar);
        }
    }

    public static final void m(y6c y6cVar, int i2, e7c e7cVar, ynn ynnVar, yci yciVar, hq5 hq5Var, int i3) {
        int i4;
        wn5 C;
        wn5 wn5Var;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1164592645);
        if ((i3 & 6) == 0) {
            i4 = (oq5Var.f(y6cVar) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= oq5Var.d(i2) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= (i3 & RemoteCameraConfig.Mic.BUFFER_SIZE) == 0 ? oq5Var.f(e7cVar) : oq5Var.h(e7cVar) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= oq5Var.f(ynnVar) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i4 |= oq5Var.f(yciVar) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if (oq5Var.P(i4 & 1, (i4 & 9363) != 9362)) {
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (K == kjnVar) {
                K = vz1.h(oq5Var);
            }
            uoi uoiVar = (uoi) K;
            wn5 C2 = ild.C(755913456, new vtb(2, y6cVar, uoiVar, e7cVar), oq5Var);
            String str = y6cVar.c;
            wn5 wn5Var2 = null;
            if (str == null) {
                oq5Var.Z(367596585);
                oq5Var.p(false);
                C = null;
            } else {
                oq5Var.Z(367596586);
                C = ild.C(-27353923, new da1(str, 7), oq5Var);
                oq5Var.p(false);
            }
            String str2 = y6cVar.d;
            if (str2 == null) {
                oq5Var.Z(367983899);
            } else {
                oq5Var.Z(367983900);
                wn5Var2 = ild.C(221924478, new da1(str2, 8), oq5Var);
            }
            oq5Var.p(false);
            wn5 wn5Var3 = wn5Var2;
            int i5 = i4 & 896;
            int i6 = i4 & 14;
            wn5 wn5Var4 = C;
            int i7 = i4 & 112;
            boolean z = (i6 == 4) | (i5 == 256 || ((i4 & RemoteCameraConfig.Mic.BUFFER_SIZE) != 0 && oq5Var.h(e7cVar))) | (i7 == 32);
            Object K2 = oq5Var.K();
            if (z || K2 == kjnVar) {
                wn5Var = C2;
                K2 = new de(e7cVar, y6cVar, i2, 17);
                oq5Var.k0(K2);
            } else {
                wn5Var = C2;
            }
            yci d2 = a.d(yciVar, uoiVar, null, false, null, null, (Function0) K2, 28);
            boolean z2 = (i5 == 256 || ((i4 & RemoteCameraConfig.Mic.BUFFER_SIZE) != 0 && oq5Var.h(e7cVar))) | (i6 == 4) | (i7 == 32);
            Object K3 = oq5Var.K();
            if (z2 || K3 == kjnVar) {
                K3 = new gva(e7cVar, y6cVar, i2, 8);
                oq5Var.k0(K3);
            }
            l(wn5Var, wn5Var4, wn5Var3, com.yandex.music.core.ui.compose.a.b(d2, ynnVar, 0L, 0.0f, null, (Function2) K3, 14), oq5Var, 6);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new hq(y6cVar, i2, e7cVar, ynnVar, yciVar, i3, 12);
        }
    }

    public static final void n(a7c a7cVar, int i2, e7c e7cVar, ynn ynnVar, yci yciVar, hq5 hq5Var, int i3) {
        int i4;
        yci yciVar2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-96355697);
        if ((i3 & 6) == 0) {
            i4 = (oq5Var.f(a7cVar) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= oq5Var.d(i2) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= (i3 & RemoteCameraConfig.Mic.BUFFER_SIZE) == 0 ? oq5Var.f(e7cVar) : oq5Var.h(e7cVar) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= oq5Var.f(ynnVar) ? 2048 : 1024;
        }
        int i5 = i4 | 24576;
        if (oq5Var.P(i5 & 1, (i5 & 9363) != 9362)) {
            boolean z = a7cVar instanceof y6c;
            vci vciVar = vci.a;
            if (z) {
                oq5Var.Z(1891462436);
                m((y6c) a7cVar, i2, e7cVar, ynnVar, com.yandex.music.core.ui.compose.b.b(androidx.compose.ui.platform.a.a(vciVar, "featureItem"), i2), oq5Var, i5 & 8190);
                oq5Var.p(false);
            } else {
                if (!(a7cVar instanceof z6c)) {
                    throw vz1.i(oq5Var, 1891461284, false);
                }
                oq5Var.Z(1891472314);
                k(((z6c) a7cVar).a, oq5Var, (i5 >> 9) & 112);
                oq5Var.p(false);
            }
            yciVar2 = vciVar;
        } else {
            oq5Var.S();
            yciVar2 = yciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new hq(a7cVar, i2, e7cVar, ynnVar, yciVar2, i3, 11);
        }
    }

    public static yg0 o(int i2, int i3, int i4) {
        Bitmap createBitmap;
        rdo rdoVar = n95.e;
        Bitmap.Config p = fx1.p(i4);
        if (Build.VERSION.SDK_INT >= 26) {
            createBitmap = woe.j(i2, i3, i4, rdoVar);
        } else {
            createBitmap = Bitmap.createBitmap((DisplayMetrics) null, i2, i3, p);
            createBitmap.setHasAlpha(true);
        }
        return new yg0(createBitmap);
    }

    public static final void p(w4k w4kVar, zn6 zn6Var, boolean z, boolean z2, Function0 function0, hq5 hq5Var, int i2) {
        int i3;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1469942960);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var.h(w4kVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var.f(zn6Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= oq5Var.g(z) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= oq5Var.g(z2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= oq5Var.h(function0) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if (oq5Var.P(i3 & 1, (i3 & 9363) != 9362)) {
            int i4 = Build.VERSION.SDK_INT;
            vci vciVar = vci.a;
            if (i4 >= 31) {
                oq5Var.Z(-415592093);
                boolean z3 = z2 && z;
                yci k = androidx.compose.foundation.layout.a.k(d.c(vciVar, 1.0f), 0.0f, 48, 1);
                Object K = oq5Var.K();
                if (K == gq5.a) {
                    K = new kz5(27);
                    oq5Var.k0(K);
                }
                etn.f(z3, androidx.compose.ui.graphics.a.a(k, (Function1) K), c.e(null, 3), c.f(null, 3), null, ild.C(-107969955, new ar(23, function0, w4kVar), oq5Var), oq5Var, 200112, 16);
                oq5Var.p(false);
            } else {
                oq5Var.Z(-414864523);
                if (zn6Var instanceof yn6) {
                    oq5Var.Z(-414808971);
                    etn.f(z2 && z, androidx.compose.foundation.layout.a.k(d.c(vciVar, 1.0f), 0.0f, 36, 1), c.e(null, 3), c.f(null, 3), null, ild.C(-1295973575, new ar(24, zn6Var, function0), oq5Var), oq5Var, 200112, 16);
                } else {
                    oq5Var.Z(-423804334);
                }
                oq5Var.p(false);
                oq5Var.p(false);
            }
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new en6(w4kVar, zn6Var, z, z2, function0, i2, 0);
        }
    }

    public static final void q(Function0 function0, yci yciVar, boolean z, kk7 kk7Var, wn5 wn5Var, hq5 hq5Var, int i2, int i3) {
        if ((i3 & 2) != 0) {
            yciVar = vci.a;
        }
        yci yciVar2 = yciVar;
        if ((i3 & 4) != 0) {
            z = true;
        }
        boolean z2 = z;
        tgo tgoVar = ((ivp) ((oq5) hq5Var).j(kvp.a)).a;
        if ((i3 & 128) != 0) {
            kk7Var = bl3.c(0L, hq5Var, 7);
        }
        d(function0, yciVar2, z2, null, tgoVar, kk7Var, bl3.d, wn5Var, hq5Var, i2 & 2147483646, 0);
    }

    public static final Long r(Long l, Long l2) {
        if (l == null || l2 == null) {
            return null;
        }
        long longValue = l.longValue() - l2.longValue();
        if (longValue < 0) {
            return null;
        }
        return Long.valueOf(longValue);
    }

    public static final boolean s(hur hurVar) {
        List list = hurVar.f.t.a;
        int size = list.size();
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            if (((lfm) list.get(i2)).d) {
                z = true;
                break;
            }
            i2++;
        }
        return !z;
    }

    public static void t(kv6 kv6Var, tv1 tv1Var) {
        Object obj;
        tv1Var.getClass();
        if (tv1Var instanceof rv1) {
            v0t a2 = kv6Var.Z().a();
            a2.c();
            a2.j(Integer.MAX_VALUE);
            a2.g(false);
            a2.h();
            w0t b2 = a2.b();
            if (b2.equals(kv6Var.Z())) {
                return;
            }
            kv6Var.H(b2);
            return;
        }
        if (!(tv1Var instanceof sv1)) {
            b6e.s();
            return;
        }
        int i2 = ((sv1) tv1Var).a;
        e3t O = kv6Var.O();
        TreeSet treeSet = new TreeSet();
        xz0.U(new Integer[0], treeSet);
        ude listIterator = O.a.listIterator(0);
        listIterator.getClass();
        while (listIterator.hasNext()) {
            d3t d3tVar = (d3t) listIterator.next();
            if (d3tVar.b.c == 1) {
                int i3 = d3tVar.a;
                for (int i4 = 0; i4 < i3; i4++) {
                    int i5 = d3tVar.a(i4).j;
                    if (i5 > 0) {
                        treeSet.add(Integer.valueOf(i5));
                    }
                }
            }
        }
        List w0 = CollectionsKt.w0(treeSet);
        if (!w0.isEmpty()) {
            Iterator it = w0.iterator();
            if (it.hasNext()) {
                Object next = it.next();
                if (it.hasNext()) {
                    int abs = Math.abs(((Number) next).intValue() - i2);
                    do {
                        Object next2 = it.next();
                        int abs2 = Math.abs(((Number) next2).intValue() - i2);
                        if (abs > abs2) {
                            next = next2;
                            abs = abs2;
                        }
                    } while (it.hasNext());
                }
                obj = next;
            } else {
                obj = null;
            }
            Integer num = (Integer) obj;
            if (num != null) {
                i2 = num.intValue();
            }
        }
        v0t a3 = kv6Var.Z().a();
        a3.c();
        a3.j(i2);
        a3.g(true);
        a3.h();
        w0t b3 = a3.b();
        if (b3.equals(kv6Var.Z())) {
            return;
        }
        kv6Var.H(b3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x003c, code lost:
    
        if (s(r7) == false) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0048 -> B:10:0x004b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object u(hur hurVar, gfm gfmVar, kq2 kq2Var) {
        yqc yqcVar;
        int i2;
        if (kq2Var instanceof yqc) {
            yqcVar = (yqc) kq2Var;
            int i3 = yqcVar.m;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                yqcVar.m = i3 - Integer.MIN_VALUE;
                Object obj = yqcVar.l;
                nm6 nm6Var = nm6.a;
                i2 = yqcVar.m;
                if (i2 == 0) {
                    if (i2 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    gfm gfmVar2 = yqcVar.k;
                    hur hurVar2 = yqcVar.j;
                    qgg.h0(obj);
                    gfmVar = gfmVar2;
                    hurVar = hurVar2;
                    List list = ((ffm) obj).a;
                    int size = list.size();
                    int i4 = 0;
                    while (i4 < size) {
                        if (((lfm) list.get(i4)).d) {
                            yqcVar.j = hurVar;
                            yqcVar.k = gfmVar;
                            yqcVar.m = 1;
                            obj = hurVar.a(gfmVar, yqcVar);
                            if (obj == nm6Var) {
                                return nm6Var;
                            }
                            List list2 = ((ffm) obj).a;
                            int size2 = list2.size();
                            int i42 = 0;
                            while (i42 < size2) {
                            }
                        } else {
                            i42++;
                        }
                    }
                    return Unit.a;
                }
                qgg.h0(obj);
            }
        }
        yqcVar = new yqc(kq2Var);
        Object obj2 = yqcVar.l;
        nm6 nm6Var2 = nm6.a;
        i2 = yqcVar.m;
        if (i2 == 0) {
        }
    }

    public static final Object v(pfm pfmVar, Function2 function2, Continuation continuation) {
        Object S0 = ((iur) pfmVar).S0(new zqc(continuation.getContext(), function2, (Continuation) null), continuation);
        return S0 == nm6.a ? S0 : Unit.a;
    }

    public static final yci w(yci yciVar, float f2, float f3, boolean z, gar garVar, Function1 function1) {
        yciVar.getClass();
        garVar.getClass();
        function1.getClass();
        yci b2 = androidx.compose.ui.graphics.a.b(d.m(yciVar, f2), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, false, 65535);
        yci yciVar2 = vci.a;
        if (!z) {
            yciVar2 = androidx.compose.ui.draw.a.c(yciVar2, new po1(function1, garVar, f3, 0));
        }
        return b2.f(yciVar2);
    }

    public static final float x(Context context) {
        Object t7oVar;
        if (!qv0.a()) {
            return 16;
        }
        try {
            r7o r7oVar = z7o.b;
            t7oVar = Float.valueOf(context.getResources().getDimension(android.R.dimen.system_app_widget_background_radius) / context.getResources().getDisplayMetrics().density);
        } catch (Throwable th) {
            r7o r7oVar2 = z7o.b;
            t7oVar = new t7o(th);
        }
        Object valueOf = Float.valueOf(0.0f);
        if (t7oVar instanceof t7o) {
            t7oVar = valueOf;
        }
        float floatValue = ((Number) t7oVar).floatValue();
        return Float.compare(floatValue, (float) 0) > 0 ? floatValue : 16;
    }

    public static final int y(List list) {
        int i2 = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            return 0;
        }
        int g2 = u75.g(list);
        for (int i3 = 1; i3 < g2; i3++) {
            if (d85.d(((d85) list.get(i3)).a) == 0.0f) {
                i2++;
            }
        }
        return i2;
    }

    public static yci z(final long j, yci yciVar, int i2) {
        final float f2 = (i2 & 8) != 0 ? 0.0f : 1.0f;
        final float f3 = (i2 & 16) == 0 ? 0.0f : 1.0f;
        yciVar.getClass();
        return androidx.compose.ui.draw.a.b(yciVar, new Function1() { // from class: mya
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                np3 np3Var = (np3) obj;
                np3Var.getClass();
                ArrayList arrayList = new ArrayList(16);
                for (int i3 = 0; i3 < 16; i3++) {
                    float pow = (float) Math.pow(i3 / 15, 2.4f);
                    float f4 = f3;
                    float f5 = f2;
                    arrayList.add(new d85(d85.b(j, su4.e(f4, f5, pow, f5), 0.0f, 0.0f, 0.0f, 14)));
                }
                return np3Var.a(new g83(y9w.T(arrayList, 0.0f, 0.0f, 14), 4));
            }
        });
    }
}
