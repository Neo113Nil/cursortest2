package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import kotlin.Pair;
import kotlin.coroutines.f;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public class wvo implements dup, nn5, xwt, n2r, w2q, p7q, z1r, f, lr5, nd, b0q, ear, dhc {
    public static final wvo b = new wvo(1);
    public static final wvo c = new wvo(3);
    public static final wvo d = new wvo(4);
    public static final wvo e = new wvo(5);
    public static final wvo f = new wvo(6);
    public static final wvo g = new wvo(7);
    public static final wvo h = new wvo(8);
    public static final wvo i = new wvo(9);
    public static final wvo j = new wvo(10);
    public static final wvo k = new wvo(11);
    public final /* synthetic */ int a;

    public /* synthetic */ wvo(int i2) {
        this.a = i2;
    }

    public static lzb A() {
        lzb lzbVar = new lzb();
        lzbVar.a = new Random();
        lzbVar.b = 120000000000L;
        lzbVar.c = 1.6d;
        lzbVar.d = 0.2d;
        lzbVar.e = 1000000000L;
        return lzbVar;
    }

    public static String H(dm9 dm9Var) {
        String str = dm9Var.p;
        if (str != null) {
            return str;
        }
        String str2 = dm9Var.x;
        return str2 == null ? "" : str2;
    }

    public static ArrayList K(List list, Function1 function1, Function1 function12) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List list2 = list;
        Iterator it = list2.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            dp8 d2 = ((jc8) function1.invoke(it.next())).d();
            String H = d2 instanceof dm9 ? H((dm9) d2) : d2.getId();
            if (H != null) {
                Integer num = (Integer) linkedHashMap.get(H);
                linkedHashMap.put(H, Integer.valueOf((num != null ? num.intValue() : 0) + 1));
            }
        }
        ArrayList arrayList = new ArrayList(v75.o(list2, 10));
        int i2 = 0;
        for (Object obj : list2) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                u75.n();
                throw null;
            }
            dp8 d3 = ((jc8) function1.invoke(obj)).d();
            String H2 = d3 instanceof dm9 ? H((dm9) d3) : d3.getId();
            if (H2 != null) {
                Integer num2 = (Integer) linkedHashMap.get(H2);
                if ((num2 != null ? num2.intValue() : 0) > 1) {
                    H2 = H2 + '#' + i2;
                }
            } else {
                zzb zzbVar = (zzb) function12.invoke(obj);
                String str = zzbVar != null ? zzbVar.g : null;
                if (str == null) {
                    ArrayList arrayList2 = kj4.a;
                    if (arrayList2.size() <= i2) {
                        arrayList2.ensureCapacity(i3);
                        int size = arrayList2.size();
                        if (size <= i2) {
                            while (true) {
                                arrayList2.add(size, "child#" + size);
                                if (size == i2) {
                                    break;
                                }
                                size++;
                            }
                        }
                    }
                    H2 = (String) arrayList2.get(i2);
                } else {
                    H2 = str;
                }
            }
            arrayList.add(H2);
            i2 = i3;
        }
        return arrayList;
    }

    public static String[] L(Context context, String str) {
        StringBuilder sb = new StringBuilder("lib");
        char c2 = File.separatorChar;
        sb.append(c2);
        sb.append("([^\\");
        sb.append(c2);
        sb.append("]*)");
        sb.append(c2);
        sb.append(str);
        Pattern compile = Pattern.compile(sb.toString());
        HashSet hashSet = new HashSet();
        for (String str2 : O(context)) {
            try {
                Enumeration<? extends ZipEntry> entries = new ZipFile(new File(str2), 1).entries();
                while (entries.hasMoreElements()) {
                    Matcher matcher = compile.matcher(entries.nextElement().getName());
                    if (matcher.matches()) {
                        hashSet.add(matcher.group(1));
                    }
                }
            } catch (IOException unused) {
            }
        }
        return (String[]) hashSet.toArray(new String[hashSet.size()]);
    }

    public static String[] O(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        String[] strArr = applicationInfo.splitSourceDirs;
        if (strArr == null || strArr.length == 0) {
            return new String[]{applicationInfo.sourceDir};
        }
        String[] strArr2 = new String[strArr.length + 1];
        strArr2[0] = applicationInfo.sourceDir;
        System.arraycopy(strArr, 0, strArr2, 1, strArr.length);
        return strArr2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0020, code lost:
    
        if (y(r7, r2) == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005e, code lost:
    
        if (r7 != null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0019, code lost:
    
        if (r8.b == r9.a) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0060, code lost:
    
        return null;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Pair P(View view, qv8 qv8Var, pm9 pm9Var, xzb xzbVar) {
        ob8 ob8Var;
        mm9 y = y(view, pm9Var);
        if (y == null) {
            pm9 g2 = pm9Var.g();
            if (g2.b.isEmpty()) {
            }
        }
        if (y == null || (ob8Var = y.getDiv()) == null) {
            jc8 jc8Var = qv8Var.a;
            List list = pm9Var.b;
            if (!list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    String str = (String) ((Pair) it.next()).a;
                    if (jc8Var != null && (jc8Var = o(jc8Var, xzbVar, str)) != null) {
                    }
                }
                ob8Var = !(jc8Var instanceof ob8) ? (ob8) jc8Var : null;
            }
            jc8Var = null;
            if (!(jc8Var instanceof ob8)) {
            }
        }
        return new Pair(y, ob8Var);
    }

    public static void e(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static le3 f(Context context, String[] strArr, String str, x3n x3nVar) {
        String[] O = O(context);
        int length = O.length;
        int i2 = 0;
        while (true) {
            ZipFile zipFile = null;
            if (i2 >= length) {
                return null;
            }
            String str2 = O[i2];
            int i3 = 0;
            while (true) {
                int i4 = i3 + 1;
                if (i3 >= 5) {
                    break;
                }
                try {
                    zipFile = new ZipFile(new File(str2), 1);
                    break;
                } catch (IOException unused) {
                    i3 = i4;
                }
            }
            if (zipFile != null) {
                int i5 = 0;
                while (true) {
                    int i6 = i5 + 1;
                    if (i5 < 5) {
                        for (String str3 : strArr) {
                            StringBuilder sb = new StringBuilder("lib");
                            char c2 = File.separatorChar;
                            sb.append(c2);
                            sb.append(str3);
                            sb.append(c2);
                            sb.append(str);
                            String sb2 = sb.toString();
                            x3nVar.r0("Looking for %s in APK %s...", sb2, str2);
                            ZipEntry entry = zipFile.getEntry(sb2);
                            if (entry != null) {
                                le3 le3Var = new le3();
                                le3Var.a = zipFile;
                                le3Var.b = entry;
                                return le3Var;
                            }
                        }
                        i5 = i6;
                    } else {
                        try {
                            zipFile.close();
                            break;
                        } catch (IOException unused2) {
                        }
                    }
                }
            }
            i2++;
        }
    }

    public static jc8 o(jc8 jc8Var, xzb xzbVar, String str) {
        if (jc8Var instanceof ob8) {
            dm9 dm9Var = ((ob8) jc8Var).c;
            if (!H(dm9Var).equals(str)) {
                jc8Var = null;
            }
            ob8 ob8Var = (ob8) jc8Var;
            if (ob8Var != null) {
                return ob8Var;
            }
            Iterator it = dm9Var.I.iterator();
            while (it.hasNext()) {
                jc8 jc8Var2 = ((cm9) it.next()).c;
                jc8 o = jc8Var2 != null ? o(jc8Var2, xzbVar, str) : null;
                if (o != null) {
                    return o;
                }
            }
        } else if (jc8Var instanceof qb8) {
            Iterator it2 = ((qb8) jc8Var).c.q.iterator();
            while (it2.hasNext()) {
                jc8 jc8Var3 = ((ro9) it2.next()).a;
                jc8 o2 = jc8Var3 != null ? o(jc8Var3, xzbVar, str) : null;
                if (o2 != null) {
                    return o2;
                }
            }
        } else {
            if (jc8Var instanceof cb8) {
                jt8 jt8Var = ((cb8) jc8Var).c;
                return p(qwp.x(jt8Var.B, jt8Var.z, xzbVar), str);
            }
            if (jc8Var instanceof gb8) {
                Iterable<jc8> iterable = ((gb8) jc8Var).c.y;
                if (iterable == null) {
                    iterable = c5b.a;
                }
                for (jc8 jc8Var4 : iterable) {
                    jc8 o3 = jc8Var4 != null ? o(jc8Var4, xzbVar, str) : null;
                    if (o3 != null) {
                        return o3;
                    }
                }
                return null;
            }
            if (jc8Var instanceof eb8) {
                s09 s09Var = ((eb8) jc8Var).c;
                return p(qwp.x(s09Var.u, s09Var.s, xzbVar), str);
            }
            if (jc8Var instanceof kb8) {
                eb9 eb9Var = ((kb8) jc8Var).c;
                return p(qwp.x(eb9Var.t, eb9Var.r, xzbVar), str);
            }
            if (!(jc8Var instanceof db8)) {
                if ((jc8Var instanceof rb8) || (jc8Var instanceof hb8) || (jc8Var instanceof nb8) || (jc8Var instanceof jb8) || (jc8Var instanceof fb8) || (jc8Var instanceof ib8) || (jc8Var instanceof mb8) || (jc8Var instanceof lb8) || (jc8Var instanceof sb8) || (jc8Var instanceof pb8)) {
                    return null;
                }
                b6e.s();
                return null;
            }
            List<jc8> list = ((db8) jc8Var).c.q;
            if (list != null) {
                for (jc8 jc8Var5 : list) {
                    jc8 o4 = jc8Var5 != null ? o(jc8Var5, xzbVar, str) : null;
                    if (o4 != null) {
                        return o4;
                    }
                }
            }
        }
        return null;
    }

    public static jc8 p(Iterable iterable, String str) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            k79 k79Var = (k79) it.next();
            jc8 o = o(k79Var.a, k79Var.b, str);
            if (o != null) {
                return o;
            }
        }
        return null;
    }

    public static mm9 y(View view, pm9 pm9Var) {
        boolean d2;
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof mm9) {
            mm9 mm9Var = (mm9) view;
            pm9 path = mm9Var.getPath();
            if (pm9Var.d) {
                d2 = Intrinsics.d(path != null ? path.e() : null, pm9Var.e());
            } else {
                d2 = Intrinsics.d(path != null ? path.g().c() : null, pm9Var.g().c());
            }
            if (d2) {
                return mm9Var;
            }
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int i2 = 0;
        mm9 mm9Var2 = null;
        while (true) {
            if (!(i2 < viewGroup.getChildCount())) {
                return mm9Var2;
            }
            int i3 = i2 + 1;
            View childAt = viewGroup.getChildAt(i2);
            if (childAt == null) {
                rj7.m();
                return null;
            }
            mm9 y = y(childAt, pm9Var);
            if (y != null) {
                if (String.valueOf(mm9Var2 != null ? mm9Var2.getPath() : null).equals(String.valueOf(y.getPath()))) {
                    StringBuilder sb = new StringBuilder("Error resolving state for '");
                    sb.append(pm9Var);
                    pm9 path2 = y.getPath();
                    sb.append("'. Found multiple elements that respond to path '");
                    sb.append(path2);
                    sb.append("'!");
                    throw new tdr(sb.toString(), null);
                }
                mm9Var2 = y;
            }
            i2 = i3;
        }
    }

    @Override // defpackage.b0q
    public Object B(aaq aaqVar) {
        boolean z;
        aaqVar.getClass();
        if ((aaqVar instanceof t9q) || (aaqVar instanceof u9q) || (aaqVar instanceof x9q) || Intrinsics.d(aaqVar, y9q.a) || (aaqVar instanceof caq) || (aaqVar instanceof paq) || (aaqVar instanceof uaq)) {
            z = false;
        } else {
            if (!(aaqVar instanceof hbq)) {
                b6e.s();
                return null;
            }
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.nn5
    public Object C(rdk rdkVar) {
        Object k2 = rdkVar.k(new m5n(ozf.class, Executor.class));
        k2.getClass();
        return u2x.E((Executor) k2);
    }

    @Override // defpackage.b0q
    public Object D(yc5 yc5Var) {
        yc5Var.getClass();
        return Boolean.FALSE;
    }

    public List E(Context context, rih rihVar, dsc dscVar, boolean z, boolean z2) {
        context.getClass();
        rihVar.getClass();
        dscVar.getClass();
        String str = dscVar.n;
        if (str == null) {
            return c5b.a;
        }
        if (dvt.a >= 26 && "video/dolby-vision".equals(str) && !gvt.k(context)) {
            String b2 = zjh.b(dscVar);
            List b3 = b2 == null ? qsn.e : rihVar.b(b2, z, z2);
            b3.getClass();
            if (!b3.isEmpty()) {
                return b3;
            }
        }
        qsn g2 = zjh.g(rihVar, dscVar, z, z2);
        g2.getClass();
        return g2;
    }

    @Override // defpackage.b0q
    public Object F(doc docVar) {
        docVar.getClass();
        return Boolean.FALSE;
    }

    @Override // defpackage.b0q
    public Object G(xc5 xc5Var) {
        xc5Var.getClass();
        return Boolean.FALSE;
    }

    @Override // defpackage.dup
    public ocg I(long j2, xof xofVar, jx7 jx7Var) {
        switch (this.a) {
            case 1:
                float c2 = nmq.c(j2) / 2.0f;
                long floatToRawIntBits = (Float.floatToRawIntBits(c2) << 32) | (Float.floatToRawIntBits(c2) & 4294967295L);
                return new byj(cb0.l(ywf.d(0L, j2), floatToRawIntBits, floatToRawIntBits, floatToRawIntBits, floatToRawIntBits));
            default:
                xofVar.getClass();
                jx7Var.getClass();
                nh0 a = ph0.a();
                Path path = a.a;
                a.h();
                int i2 = (int) (4294967295L & j2);
                float intBitsToFloat = Float.intBitsToFloat(i2);
                float intBitsToFloat2 = Float.intBitsToFloat(i2);
                bak bakVar = bak.a;
                if (a.b == null) {
                    a.b = new RectF();
                }
                RectF rectF = a.b;
                rectF.getClass();
                rectF.set(0.0f, 0.0f, intBitsToFloat, intBitsToFloat2);
                RectF rectF2 = a.b;
                rectF2.getClass();
                path.addOval(rectF2, ph0.b(bakVar));
                int i3 = (int) (j2 >> 32);
                float intBitsToFloat3 = Float.intBitsToFloat(i3) - Float.intBitsToFloat(i2);
                float intBitsToFloat4 = Float.intBitsToFloat(i3);
                float intBitsToFloat5 = Float.intBitsToFloat(i2);
                if (a.b == null) {
                    a.b = new RectF();
                }
                RectF rectF3 = a.b;
                rectF3.getClass();
                rectF3.set(intBitsToFloat3, 0.0f, intBitsToFloat4, intBitsToFloat5);
                RectF rectF4 = a.b;
                rectF4.getClass();
                path.addOval(rectF4, ph0.b(bakVar));
                a.b();
                return new zxj(a);
        }
    }

    @Override // defpackage.n2r
    public boolean J(Object obj, Object obj2) {
        return false;
    }

    @Override // defpackage.b0q
    public Object M(g1q g1qVar) {
        boolean z;
        g1qVar.getClass();
        if ((g1qVar instanceof d1q) || (g1qVar instanceof f1q) || (g1qVar instanceof i1q) || (g1qVar instanceof l1q) || (g1qVar instanceof s1q) || (g1qVar instanceof b2q)) {
            z = false;
        } else {
            if (!(g1qVar instanceof v1q)) {
                b6e.s();
                return null;
            }
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.b0q
    public Object N(cd5 cd5Var) {
        cd5Var.getClass();
        return Boolean.FALSE;
    }

    @Override // defpackage.b0q
    public Object R(w3d w3dVar) {
        w3dVar.getClass();
        return Boolean.FALSE;
    }

    @Override // defpackage.z1r
    public int a(int i2, int i3, int i4, int i5) {
        return 0;
    }

    @Override // defpackage.dhc
    public mif b(yop yopVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        r1f r1fVar = r1f.a;
        vtm vtmVar = new vtm((Map) linkedHashMap);
        ci0 ci0Var = qjb.a;
        int i2 = 1;
        ci0Var.a = su4.g(1, ci0Var.a);
        vtmVar.u(qee.n() + ci0Var.a, "eventus_id");
        qne j2 = su4.j(vtmVar, "event_name", "xflags_activate_flags", "xflags_activate_flags", vtmVar);
        w60 w60Var = new w60(qee.n(), i2);
        j2.y();
        mif.b(mif.b(yopVar, new pjb(j2, w60Var, 0), null, 5), lhb.x0, new pjb(j2, w60Var, i2), 1);
        return yopVar;
    }

    @Override // defpackage.w2q
    public Object c(foc focVar) {
        focVar.getClass();
        throw null;
    }

    @Override // defpackage.b0q
    public Object d(w6u w6uVar) {
        w6uVar.getClass();
        return Boolean.FALSE;
    }

    @Override // defpackage.w2q
    public Object g(faq faqVar) {
        faqVar.getClass();
        if (faqVar instanceof naq) {
            return ((naq) faqVar).e.a;
        }
        if (faqVar instanceof daq) {
            return ((daq) faqVar).e.a;
        }
        if (faqVar instanceof saq) {
            return ((saq) faqVar).e.a;
        }
        if (faqVar instanceof qaq) {
            return "unknown";
        }
        b6e.s();
        return null;
    }

    @Override // defpackage.w2q
    public Object h(jzs jzsVar) {
        jzsVar.getClass();
        return jzsVar.a.a;
    }

    @Override // defpackage.w2q
    public Object i(m1q m1qVar) {
        m1qVar.getClass();
        if (m1qVar instanceof e2q) {
            return "unknown";
        }
        if (m1qVar instanceof j1q) {
            return ((j1q) m1qVar).d.a;
        }
        if (m1qVar instanceof c2q) {
            return ((c2q) m1qVar).d.a;
        }
        b6e.s();
        return null;
    }

    @Override // defpackage.w2q
    public Object j(i5u i5uVar) {
        i5uVar.getClass();
        return i5uVar.a.a;
    }

    @Override // defpackage.w2q
    public Object k(k4d k4dVar) {
        k4dVar.getClass();
        return k4dVar.a.a;
    }

    @Override // defpackage.ear
    public StackTraceElement[] l(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[1024];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr2, 0, RemoteCameraConfig.Mic.BUFFER_SIZE);
        System.arraycopy(stackTraceElementArr, stackTraceElementArr.length - RemoteCameraConfig.Mic.BUFFER_SIZE, stackTraceElementArr2, RemoteCameraConfig.Mic.BUFFER_SIZE, RemoteCameraConfig.Mic.BUFFER_SIZE);
        return stackTraceElementArr2;
    }

    @Override // defpackage.p7q
    public Object m(ioc iocVar) {
        switch (this.a) {
            case 7:
                iocVar.getClass();
                return nyn.a;
            default:
                iocVar.getClass();
                dfi.r("This should not happen. FmRadioQueueState should have already been processed earlier", "PlayAudio2:".concat("PlaybackUtils"));
                return null;
        }
    }

    @Override // defpackage.p7q
    public Object n(szu szuVar) {
        switch (this.a) {
            case 7:
                szuVar.getClass();
                return szuVar.c;
            default:
                szuVar.getClass();
                dfi.r("This should not happen. WaveQueueState should have already been processed earlier", "PlayAudio2:".concat("PlaybackUtils"));
                return null;
        }
    }

    @Override // defpackage.p7q
    public Object q(y4d y4dVar) {
        switch (this.a) {
            case 7:
                y4dVar.getClass();
                return nyn.a;
            default:
                y4dVar.getClass();
                dfi.r("This should not happen. GenerativeQueueState should have already been processed earlier", "PlayAudio2:".concat("PlaybackUtils"));
                return null;
        }
    }

    @Override // defpackage.p7q
    public Object q0(maq maqVar) {
        switch (this.a) {
            case 7:
                maqVar.getClass();
                if (maqVar instanceof jbq) {
                    return ((jbq) maqVar).e;
                }
                if ((maqVar instanceof eaq) || (maqVar instanceof raq) || (maqVar instanceof vaq)) {
                    return nyn.a;
                }
                b6e.s();
                return null;
            default:
                maqVar.getClass();
                dfi.r("This should not happen. Ynison is not tracking", "PlayAudio2:".concat("PlaybackUtils"));
                return null;
        }
    }

    @Override // defpackage.xwt
    public Object r(b7f b7fVar, float f2) {
        return Integer.valueOf(Math.round(p7f.d(b7fVar) * f2));
    }

    @Override // defpackage.b0q
    public Object s(d0t d0tVar) {
        d0tVar.getClass();
        return Boolean.TRUE;
    }

    @Override // defpackage.p7q
    public Object t(t1q t1qVar) {
        switch (this.a) {
            case 7:
                t1qVar.getClass();
                return nyn.a;
            default:
                t1qVar.getClass();
                dfi.r("This should not happen. Glagol is not tracking", "PlayAudio2:".concat("PlaybackUtils"));
                return null;
        }
    }

    public String toString() {
        switch (this.a) {
            case 5:
                return "NeverEqualPolicy";
            case 8:
                return "Start";
            case 23:
                return "EmptyAction";
            case 26:
                return "internal:health-check-consumer-listener";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.p7q
    public Object u(u7u u7uVar) {
        switch (this.a) {
            case 7:
                u7uVar.getClass();
                return nyn.a;
            default:
                u7uVar.getClass();
                dfi.r("This should not happen. Video clip is not tracking", "PlayAudio2:".concat("PlaybackUtils"));
                return null;
        }
    }

    @Override // defpackage.mr5
    public int v(w8 w8Var, int i2, Object obj, int i3) {
        return w8Var.I();
    }

    @Override // defpackage.b0q
    public Object w(bd5 bd5Var) {
        bd5Var.getClass();
        return Boolean.FALSE;
    }

    @Override // defpackage.b0q
    public Object x(aou aouVar) {
        boolean z;
        aouVar.getClass();
        if ((aouVar instanceof tnu) || (aouVar instanceof unu)) {
            z = true;
        } else {
            if (!(aouVar instanceof znu)) {
                b6e.s();
                return null;
            }
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public i1 z() {
        i1 i1Var;
        pt0 pt0Var = pt0.h;
        if (pt0Var != null) {
            return pt0Var;
        }
        synchronized (this) {
            i1Var = pt0.h;
            if (i1Var == null) {
                Log.w("AbConfigDatabaseImpl", "AbConfigDatabaseImpl has to be initialized first. Fallback to dummy");
                i1Var = new e88(21);
            }
        }
        return i1Var;
    }

    @Override // defpackage.nd
    /* renamed from: run */
    public void mo32run() {
    }
}
