package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.media.MediaDrm;
import android.media.UnsupportedSchemeException;
import android.net.NetworkCapabilities;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.fragment.app.y;
import com.connectsdk.service.DeviceService;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import ru.kinopoisk.tvauth.res.kinopoisk.R;
import ru.yandex.music.data.stores.CoverPath;
import ru.yandex.music.data.stores.WebPath$Storage;

/* loaded from: classes.dex */
public class ovn implements agg, rek, p7q, nbt, ydx, c20, oob, rvc {
    public static Boolean a;
    public static final ovn b = new ovn();
    public static final ovn c = new ovn();
    public static final ovn d = new ovn();
    public static final ovn e = new ovn();
    public static final ovn f = new ovn();
    public static final ovn g = new ovn();
    public static final ovn h = new ovn();
    public static final /* synthetic */ ovn i = new ovn();
    public static final ovn j = new ovn();
    public static final ovn k = new ovn();
    public static final ovn l = new ovn();
    public static final ovn m = new ovn();
    public static cy2 n;

    public static pn3 A(String str) {
        if (str.length() % 2 != 0) {
            xq0.o("Unexpected hex string: ".concat(str));
            return null;
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = i2 * 2;
            bArr[i2] = (byte) (kg5.l(str.charAt(i3 + 1)) + (kg5.l(str.charAt(i3)) << 4));
        }
        return new pn3(bArr);
    }

    public static pn3 C(String str) {
        str.getClass();
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        bytes.getClass();
        pn3 pn3Var = new pn3(bytes);
        pn3Var.c = str;
        return pn3Var;
    }

    public static e51 D(String str) {
        Object obj;
        rdb rdbVar = e51.d;
        rdbVar.getClass();
        c7 c7Var = new c7(0, rdbVar);
        while (true) {
            if (!c7Var.hasNext()) {
                obj = null;
                break;
            }
            obj = c7Var.next();
            if (((e51) obj).a.equals(str)) {
                break;
            }
        }
        return (e51) obj;
    }

    public static m77 E() {
        Object t7oVar;
        String str;
        String str2;
        Object t7oVar2;
        try {
            r7o r7oVar = z7o.b;
            t7oVar = new MediaDrm(n77.a);
        } catch (Throwable th) {
            r7o r7oVar2 = z7o.b;
            t7oVar = new t7o(th);
        }
        Throwable a2 = z7o.a(t7oVar);
        if (a2 != null) {
            if ((!(a2 instanceof UnsupportedSchemeException) ? c : null) != null) {
                try {
                    t7oVar2 = new MediaDrm(n77.a);
                } catch (Throwable th2) {
                    r7o r7oVar3 = z7o.b;
                    t7oVar2 = new t7o(th2);
                }
                t7oVar = (MediaDrm) (t7oVar2 instanceof t7o ? null : t7oVar2);
            } else {
                t7oVar = null;
            }
        }
        MediaDrm mediaDrm = (MediaDrm) t7oVar;
        if (mediaDrm == null) {
            return MediaDrm.isCryptoSchemeSupported(n77.a) ? j77.a : l77.a;
        }
        try {
            String F = F(mediaDrm, "vendor");
            String F2 = F(mediaDrm, "version");
            String F3 = F(mediaDrm, "algorithms");
            String F4 = F(mediaDrm, "systemId");
            String F5 = F(mediaDrm, "securityLevel");
            String F6 = F(mediaDrm, "hdcpLevel");
            String F7 = F(mediaDrm, "maxHdcpLevel");
            String F8 = F(mediaDrm, "usageReportingSupport");
            String F9 = F(mediaDrm, "maxNumberOfSessions");
            String F10 = F(mediaDrm, "numberOfOpenSessions");
            String F11 = F(mediaDrm, DeviceService.KEY_DESC);
            try {
                byte[] propertyByteArray = mediaDrm.getPropertyByteArray("deviceUniqueId");
                propertyByteArray.getClass();
                str = new String(propertyByteArray, Charsets.UTF_8);
            } catch (Exception unused) {
                str = "unknown";
            }
            try {
                byte[] propertyByteArray2 = mediaDrm.getPropertyByteArray("provisioningUniqueId");
                propertyByteArray2.getClass();
                str2 = "unknown";
                try {
                    str2 = new String(propertyByteArray2, Charsets.UTF_8);
                } catch (Exception unused2) {
                }
            } catch (Exception unused3) {
                str2 = "unknown";
            }
            k77 i2 = mvn.i(F, F2, F3, F4, F5, F6, F7, F8, F9, F10, F11, str, str2, F(mediaDrm, "privacyMode"), F(mediaDrm, "sessionSharing"), F(mediaDrm, "oemCryptoApiVersion"));
            if (Build.VERSION.SDK_INT >= 28) {
                try {
                    mediaDrm.release();
                    return i2;
                } catch (Throwable unused4) {
                    r7o r7oVar4 = z7o.b;
                    return i2;
                }
            }
            try {
                mediaDrm.release();
                return i2;
            } catch (Throwable unused5) {
                r7o r7oVar5 = z7o.b;
                return i2;
            }
        } catch (Throwable th3) {
            if (Build.VERSION.SDK_INT >= 28) {
                try {
                    r7o r7oVar6 = z7o.b;
                    mediaDrm.release();
                } catch (Throwable unused6) {
                    r7o r7oVar7 = z7o.b;
                }
            } else {
                try {
                    r7o r7oVar8 = z7o.b;
                    mediaDrm.release();
                } catch (Throwable unused7) {
                    r7o r7oVar9 = z7o.b;
                }
            }
            throw th3;
        }
    }

    public static String F(MediaDrm mediaDrm, String str) {
        String str2;
        try {
            str2 = mediaDrm.getPropertyString(str);
        } catch (Exception unused) {
            str2 = "unknown";
        }
        str2.getClass();
        return str2;
    }

    public static zzi H(NetworkCapabilities networkCapabilities) {
        if (networkCapabilities == null) {
            return zzi.d;
        }
        return new zzi(networkCapabilities.hasCapability(12), networkCapabilities.hasTransport(1) ? yzi.a : networkCapabilities.hasTransport(0) ? yzi.b : yzi.c, networkCapabilities.getLinkDownstreamBandwidthKbps());
    }

    public static l7a K(bmg bmgVar) {
        k7a k7aVar;
        bmgVar.getClass();
        String str = bmgVar.a;
        String str2 = bmgVar.b;
        int ordinal = bmgVar.c.ordinal();
        if (ordinal == 0) {
            k7aVar = k7a.a;
        } else if (ordinal == 1) {
            k7aVar = k7a.b;
        } else {
            if (ordinal != 2) {
                b6e.s();
                return null;
            }
            k7aVar = k7a.c;
        }
        return new l7a(str, str2, k7aVar);
    }

    public static pn3 L(int i2, byte[] bArr) {
        bArr.getClass();
        if (i2 == -1234567890) {
            i2 = bArr.length;
        }
        ox6.A(bArr.length, 0, i2);
        return new pn3(uz0.j(bArr, 0, i2));
    }

    public static pn3 M(byte... bArr) {
        bArr.getClass();
        return new pn3(Arrays.copyOf(bArr, bArr.length));
    }

    public static void R(y yVar, u51 u51Var, oa1 oa1Var, jfu jfuVar, h1d h1dVar) {
        jyr b2 = btf.b(new pa1(0));
        yVar.getClass();
        u51Var.getClass();
        jfuVar.getClass();
        String str = u51Var.a;
        ybf ybfVar = new ybf(str, new r71(jfuVar, 1), new vz(11, new hb(15, u51Var, b2)));
        CoverPath M = kg5.M(u51Var.c, WebPath$Storage.AVATARS);
        String uri = M.getUri();
        e3s.X(new cvo(wjb.AboutArtistScreen, hlb.Bottomsheet, glb.Bottom, (dvo) null, new avo(pkb.Artist, str), 40), yVar, "ARTIST_INFO_DIALOG_TAG", null, null, new wn5(new up(ybfVar, new m91((uri == null || StringsKt.U(uri)) ? c5b.a : t75.c(M), null), h1dVar, oa1Var, 5), -215727416, true), 56);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0071, code lost:
    
        r2 = kotlin.collections.CollectionsKt.o0(r3, new defpackage.dl4(1));
        r3 = r1.c.a;
        r4 = new java.util.ArrayList();
        r3 = r3.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008e, code lost:
    
        if (r3.hasNext() == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0090, code lost:
    
        r6 = (defpackage.je3) r3.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0098, code lost:
    
        if ((r6 instanceof defpackage.he3) == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x009a, code lost:
    
        r6 = (defpackage.he3) r6;
        r7 = (defpackage.tx3) r10.invoke(r6.a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a4, code lost:
    
        if (r7 != null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a6, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c4, code lost:
    
        if (r8 == null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c6, code lost:
    
        r4.add(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a8, code lost:
    
        r7 = r7.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00aa, code lost:
    
        if (r7 != null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ad, code lost:
    
        r8 = new defpackage.ge3(r6.b, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b7, code lost:
    
        if ((r6 instanceof defpackage.ie3) == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b9, code lost:
    
        r6 = (defpackage.ie3) r6;
        r8 = new defpackage.ge3(r6.a, r6.b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ca, code lost:
    
        defpackage.b6e.s();
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ce, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00cf, code lost:
    
        r0.add(new defpackage.qs4(r1.a, new defpackage.hps(r1.b.a, r2), new defpackage.fe3(r4)));
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v13, types: [ips] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ps4 y(ns4 ns4Var, Function1 function1) {
        List<rs4> list = ns4Var.a;
        ArrayList arrayList = new ArrayList(v75.o(list, 10));
        for (rs4 rs4Var : list) {
            List list2 = rs4Var.b.b;
            ArrayList arrayList2 = new ArrayList();
            Iterator it = list2.iterator();
            while (true) {
                jps jpsVar = null;
                if (!it.hasNext()) {
                    break;
                }
                nps npsVar = (nps) it.next();
                if (npsVar instanceof lps) {
                    lps lpsVar = (lps) npsVar;
                    tx3 tx3Var = (tx3) function1.invoke(lpsVar.a);
                    if (tx3Var != null) {
                        jpsVar = new ips(tx3Var.a, lpsVar.b);
                    }
                } else {
                    if (!(npsVar instanceof mps)) {
                        b6e.s();
                        return null;
                    }
                    mps mpsVar = (mps) npsVar;
                    jpsVar = new jps(mpsVar.a, mpsVar.b);
                }
                if (jpsVar != null) {
                    arrayList2.add(jpsVar);
                }
            }
        }
        return new ps4(arrayList);
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x007a, code lost:
    
        r6 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static pn3 z(String str) {
        int i2;
        char charAt;
        str.getClass();
        byte[] bArr = a.a;
        int length = str.length();
        while (length > 0 && ((charAt = str.charAt(length - 1)) == '=' || charAt == '\n' || charAt == '\r' || charAt == ' ' || charAt == '\t')) {
            length--;
        }
        int i3 = (int) ((length * 6) / 8);
        byte[] bArr2 = new byte[i3];
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            if (i4 < length) {
                char charAt2 = str.charAt(i4);
                if ('A' <= charAt2 && charAt2 < '[') {
                    i2 = charAt2 - 'A';
                } else if ('a' <= charAt2 && charAt2 < '{') {
                    i2 = charAt2 - 'G';
                } else if ('0' <= charAt2 && charAt2 < ':') {
                    i2 = charAt2 + 4;
                } else if (charAt2 == '+' || charAt2 == '-') {
                    i2 = 62;
                } else if (charAt2 == '/' || charAt2 == '_') {
                    i2 = 63;
                } else {
                    if (charAt2 != '\n' && charAt2 != '\r' && charAt2 != ' ' && charAt2 != '\t') {
                        break;
                    }
                    i4++;
                }
                i6 = (i6 << 6) | i2;
                i5++;
                if (i5 % 4 == 0) {
                    bArr2[i7] = (byte) (i6 >> 16);
                    int i8 = i7 + 2;
                    bArr2[i7 + 1] = (byte) (i6 >> 8);
                    i7 += 3;
                    bArr2[i8] = (byte) i6;
                }
                i4++;
            } else {
                int i9 = i5 % 4;
                if (i9 != 1) {
                    if (i9 == 2) {
                        bArr2[i7] = (byte) ((i6 << 12) >> 16);
                        i7++;
                    } else if (i9 == 3) {
                        int i10 = i6 << 6;
                        int i11 = i7 + 1;
                        bArr2[i7] = (byte) (i10 >> 16);
                        i7 += 2;
                        bArr2[i11] = (byte) (i10 >> 8);
                    }
                    if (i7 != i3) {
                        bArr2 = Arrays.copyOf(bArr2, i7);
                    }
                }
            }
        }
        if (bArr2 != null) {
            return new pn3(bArr2);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0050, code lost:
    
        if (r8 == r1) goto L22;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0060 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0061 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object B(Function2 function2, cg6 cg6Var) {
        y77 y77Var;
        int i2;
        Function2 function22;
        if (cg6Var instanceof y77) {
            y77Var = (y77) cg6Var;
            int i3 = y77Var.m;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                y77Var.m = i3 - Integer.MIN_VALUE;
                Object obj = y77Var.k;
                nm6 nm6Var = nm6.a;
                i2 = y77Var.m;
                if (i2 != 0) {
                    qgg.h0(obj);
                    bca bcaVar = new bca(a87.b, 18);
                    y77Var.j = (aur) function2;
                    y77Var.m = 1;
                    obj = zsd.g0(bcaVar, y77Var);
                    function22 = function2;
                } else {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            qgg.h0(obj);
                            return obj;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Function2 function23 = (Function2) y77Var.j;
                    qgg.h0(obj);
                    function22 = function23;
                }
                y77Var.j = null;
                y77Var.m = 2;
                Object invoke = function22.invoke((n87) obj, y77Var);
                return invoke != nm6Var ? nm6Var : invoke;
            }
        }
        y77Var = new y77(this, cg6Var);
        Object obj2 = y77Var.k;
        nm6 nm6Var2 = nm6.a;
        i2 = y77Var.m;
        if (i2 != 0) {
        }
        y77Var.j = null;
        y77Var.m = 2;
        Object invoke2 = function22.invoke((n87) obj2, y77Var);
        if (invoke2 != nm6Var2) {
        }
    }

    public Intent G(Context context) {
        if (bp6.a.contains(this)) {
            return null;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                Intent intent = new Intent("ReceiverService");
                intent.setPackage("com.facebook.katana");
                if (packageManager.resolveService(intent, 0) != null && m3c.a(context, "com.facebook.katana")) {
                    return intent;
                }
                Intent intent2 = new Intent("ReceiverService");
                intent2.setPackage("com.facebook.wakizashi");
                if (packageManager.resolveService(intent2, 0) != null) {
                    if (m3c.a(context, "com.facebook.wakizashi")) {
                        return intent2;
                    }
                }
            }
            return null;
        } catch (Throwable th) {
            bp6.a(this, th);
            return null;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:0|1|(2:3|(13:5|6|7|(1:(2:10|11)(2:26|27))(3:28|29|(1:31))|12|13|14|(1:16)|17|(2:20|18)|21|22|23))|38|6|7|(0)(0)|12|13|14|(0)|17|(1:18)|21|22|23) */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0030, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0077, code lost:
    
        android.util.Log.e("GlanceAppWidget", "Set of layout structures for App Widget id " + r9 + " is corrupted", r0);
        r10 = defpackage.iqf.n();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x002d, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0061, code lost:
    
        android.util.Log.e("GlanceAppWidget", "I/O error reading set of layout structures for App Widget id " + r9, r0);
        r10 = defpackage.iqf.n();
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b4 A[LOOP:0: B:18:0x00ae->B:20:0x00b4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object I(Context context, int i2, cg6 cg6Var) {
        uof uofVar;
        int i3;
        int a2;
        if (cg6Var instanceof uof) {
            uofVar = (uof) cg6Var;
            int i4 = uofVar.n;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                uofVar.n = i4 - Integer.MIN_VALUE;
                Object obj = uofVar.l;
                nm6 nm6Var = nm6.a;
                i3 = uofVar.n;
                if (i3 != 0) {
                    qgg.h0(obj);
                    uofVar.j = context;
                    uofVar.k = i2;
                    uofVar.n = 1;
                    obj = bld.a.c(context, uqf.b, "appWidgetLayout-" + i2, uofVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i3 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i2 = uofVar.k;
                    context = uofVar.j;
                    qgg.h0(obj);
                }
                iqf n2 = (iqf) obj;
                Context context2 = context;
                int i5 = i2;
                sse<kqf> o = n2.o();
                a2 = tah.a(v75.o(o, 10));
                if (a2 < 16) {
                    a2 = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(a2);
                for (kqf kqfVar : o) {
                    linkedHashMap.put(kqfVar.m(), new Integer(kqfVar.n()));
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
                return new vof(context2, linkedHashMap2, n2.p(), i5, CollectionsKt.z0(linkedHashMap2.values()));
            }
        }
        uofVar = new uof(this, cg6Var);
        Object obj2 = uofVar.l;
        nm6 nm6Var2 = nm6.a;
        i3 = uofVar.n;
        if (i3 != 0) {
        }
        iqf n22 = (iqf) obj2;
        Context context22 = context;
        int i52 = i2;
        sse<kqf> o2 = n22.o();
        a2 = tah.a(v75.o(o2, 10));
        if (a2 < 16) {
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(a2);
        while (r8.hasNext()) {
        }
        LinkedHashMap linkedHashMap22 = new LinkedHashMap(linkedHashMap3);
        return new vof(context22, linkedHashMap22, n22.p(), i52, CollectionsKt.z0(linkedHashMap22.values()));
    }

    public void J(String str) {
        otk otkVar = otk.a;
        otk.j(otk.a, str, 6);
    }

    public int Q(String str, List list, int i2) {
        if (bp6.a.contains(this)) {
            return 0;
        }
        try {
            Context b2 = j3c.b();
            Intent G = G(b2);
            int i3 = 2;
            if (G == null) {
                return 2;
            }
            nvn nvnVar = new nvn();
            try {
                if (!b2.bindService(G, nvnVar, 1)) {
                    return 3;
                }
                try {
                    try {
                        nvnVar.a.await(5L, TimeUnit.SECONDS);
                        IBinder iBinder = nvnVar.b;
                        if (iBinder != null) {
                            s9e R = r9e.R(iBinder);
                            Bundle o = mvn.o(str, list, i2);
                            if (o != null) {
                                ((q9e) R).R(o);
                                o.toString();
                            }
                            i3 = 1;
                        }
                        b2.unbindService(nvnVar);
                        return i3;
                    } catch (InterruptedException unused) {
                        HashSet hashSet = j3c.a;
                        b2.unbindService(nvnVar);
                        return 3;
                    }
                } catch (RemoteException unused2) {
                    HashSet hashSet2 = j3c.a;
                    b2.unbindService(nvnVar);
                    return 3;
                }
            } catch (Throwable th) {
                b2.unbindService(nvnVar);
                HashSet hashSet3 = j3c.a;
                throw th;
            }
        } catch (Throwable th2) {
            bp6.a(this, th2);
            return 0;
        }
    }

    @Override // defpackage.nbt
    public int a() {
        return R.string.error_screen_common_subtitle;
    }

    @Override // defpackage.ydx
    public hex b(Class cls) {
        if (!mcx.class.isAssignableFrom(cls)) {
            xq0.x("Unsupported message type: ".concat(cls.getName()));
            return null;
        }
        try {
            return (hex) mcx.h(cls.asSubclass(mcx.class)).d(3);
        } catch (Exception e2) {
            kac.k("Unable to get message info for ".concat(cls.getName()), e2);
            return null;
        }
    }

    @Override // defpackage.nbt
    public void c(yci yciVar, zbt zbtVar, boolean z, hq5 hq5Var, int i2) {
        int i3;
        zbt zbtVar2;
        yciVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-351493712);
        if ((i2 & 14) == 0) {
            i3 = (oq5Var.f(yciVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 112) == 0) {
            zbtVar2 = zbtVar;
            i3 |= oq5Var.f(zbtVar2) ? 32 : 16;
        } else {
            zbtVar2 = zbtVar;
        }
        if ((i2 & 7168) == 0) {
            i3 |= oq5Var.g(false) ? 2048 : 1024;
        }
        if ((i3 & 5211) == 1042 && oq5Var.z()) {
            oq5Var.S();
        } else {
            int i4 = ubt.a[zbtVar2.ordinal()];
            Integer valueOf = i4 != 1 ? i4 != 2 ? null : Integer.valueOf(R.raw.samsung_install_tv_app_lottie_animation) : Integer.valueOf(R.raw.lg_install_tv_app_lottie_animation);
            if (valueOf == null) {
                xmn r = oq5Var.r();
                if (r != null) {
                    r.d = new tbt(this, yciVar, zbtVar, z, i2, 2);
                    return;
                }
                return;
            }
            jyg Q = y1g.Q(new myg(valueOf.intValue()), oq5Var);
            qxg B = quj.B(Q.getValue(), true, Integer.MAX_VALUE, oq5Var);
            oq5Var.a0(-115901173);
            ayg value = Q.getValue();
            oq5Var.a0(-1527755867);
            boolean f2 = oq5Var.f(B);
            Object K = oq5Var.K();
            if (f2 || K == gq5.a) {
                K = new ncs(7, B);
                oq5Var.k0(K);
            }
            oq5Var.p(false);
            u1g.d(value, (Function0) K, yciVar, false, null, null, null, null, false, oq5Var, ((i3 << 6) & 896) | 8, 0, 131064);
            oq5Var.p(false);
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new tbt(this, yciVar, zbtVar2, z, i2, 1);
        }
    }

    @Override // defpackage.nbt
    public int d(boolean z) {
        return R.drawable.kp_android_tv_instruction_image2;
    }

    @Override // defpackage.nbt
    public void e(boolean z, hq5 hq5Var, int i2) {
        int i3;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(572532210);
        if ((i2 & 14) == 0) {
            i3 = (oq5Var.g(z) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 11) == 2 && oq5Var.z()) {
            oq5Var.S();
        } else {
            irf.r(a0g.E(z ? R.drawable.kinopoisk_tv_stub : R.drawable.kinopoisk_tv_stub_dark, 0, oq5Var), null, null, null, null, 0.0f, null, oq5Var, 56, 124);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new rl6(this, z, i2, 1);
        }
    }

    @Override // defpackage.nbt
    public void f(yci yciVar, hq5 hq5Var, int i2) {
        int i3;
        yci yciVar2;
        yciVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1879924147);
        if ((i2 & 14) == 0) {
            i3 = (oq5Var.f(yciVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 11) == 2 && oq5Var.z()) {
            oq5Var.S();
            yciVar2 = yciVar;
        } else {
            yciVar2 = yciVar;
            irf.r(a0g.E(R.drawable.kinopoisk_success, 0, oq5Var), null, yciVar2, null, null, 0.0f, null, oq5Var, ((i3 << 6) & 896) | 56, 120);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new sbt(this, yciVar2, i2, 1);
        }
    }

    @Override // defpackage.nbt
    public int g() {
        return R.string.waiting_for_install_screen_subtitle;
    }

    @Override // defpackage.nbt
    public void h(int i2, hq5 hq5Var, yci yciVar, boolean z) {
        int i3;
        yciVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1724584910);
        if ((i2 & 14) == 0) {
            i3 = (oq5Var.f(yciVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 112) == 0) {
            i3 |= oq5Var.g(z) ? 32 : 16;
        }
        if ((i3 & 91) == 18 && oq5Var.z()) {
            oq5Var.S();
        } else {
            irf.r(a0g.E(z ? R.drawable.kp_error_light : R.drawable.kp_error, 0, oq5Var), null, yciVar, null, null, 0.0f, null, oq5Var, ((i3 << 6) & 896) | 56, 120);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new rbt(this, yciVar, z, i2, 1);
        }
    }

    @Override // defpackage.nbt
    public int j(boolean z) {
        return R.drawable.kp_android_tv_instruction_image1;
    }

    @Override // defpackage.nbt
    public int k() {
        return R.string.common_instruction_screen_subtitle;
    }

    @Override // defpackage.ydx
    public boolean l(Class cls) {
        return mcx.class.isAssignableFrom(cls);
    }

    @Override // defpackage.p7q
    public Object m(ioc iocVar) {
        iocVar.getClass();
        return t75.c(null);
    }

    @Override // defpackage.p7q
    public Object n(szu szuVar) {
        szuVar.getClass();
        return szuVar.k();
    }

    @Override // defpackage.nbt
    public void o(yci yciVar, hq5 hq5Var, int i2) {
        int i3;
        yci yciVar2;
        yciVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-2003900092);
        if ((i2 & 14) == 0) {
            i3 = (oq5Var.f(yciVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 11) == 2 && oq5Var.z()) {
            oq5Var.S();
            yciVar2 = yciVar;
        } else {
            yciVar2 = yciVar;
            irf.r(a0g.E(R.drawable.kinopoisk, 0, oq5Var), null, yciVar2, null, null, 0.0f, null, oq5Var, ((i3 << 6) & 896) | 56, 120);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new sbt(this, yciVar2, i2, 0);
        }
    }

    @Override // defpackage.nbt
    public int p() {
        return R.string.android_tv_instruction_screen_first_step_description;
    }

    @Override // defpackage.p7q
    public Object q(y4d y4dVar) {
        y4dVar.getClass();
        return t75.c(y4dVar.b);
    }

    @Override // defpackage.p7q
    public Object q0(maq maqVar) {
        maqVar.getClass();
        if (maqVar instanceof jbq) {
            return ((jbq) maqVar).h.a.a.f();
        }
        if (maqVar instanceof eaq) {
            return t75.c(((eaq) maqVar).d);
        }
        if (maqVar instanceof raq) {
            raq raqVar = (raq) maqVar;
            return t75.c((qaq) raqVar.c.get(raqVar.d));
        }
        if (maqVar instanceof vaq) {
            return ((vaq) maqVar).c;
        }
        b6e.s();
        return null;
    }

    @Override // defpackage.nbt
    public int r() {
        return R.string.waiting_for_open_app_screen_title;
    }

    @Override // defpackage.nbt
    public void s(int i2, hq5 hq5Var, yci yciVar, boolean z) {
        int i3;
        yciVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-657321439);
        if ((i2 & 14) == 0) {
            i3 = (oq5Var.f(yciVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 11) == 2 && oq5Var.z()) {
            oq5Var.S();
        } else {
            irf.r(a0g.E(R.drawable.kp_android_tv_image, 0, oq5Var), null, yciVar, null, null, 0.0f, null, oq5Var, ((i3 << 6) & 896) | 56, 120);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new rbt(this, yciVar, z, i2, 0);
        }
    }

    @Override // defpackage.p7q
    public Object t(t1q t1qVar) {
        t1qVar.getClass();
        return t1qVar.e;
    }

    @Override // defpackage.p7q
    public Object u(u7u u7uVar) {
        u7uVar.getClass();
        return u7uVar.g;
    }

    @Override // defpackage.nbt
    public int v() {
        return R.string.continue_connection_screen_subtitle;
    }

    @Override // defpackage.nbt
    public void w(yci yciVar, zbt zbtVar, boolean z, hq5 hq5Var, int i2) {
        int i3;
        int i4;
        yciVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1893073934);
        if ((i2 & 14) == 0) {
            i3 = i2 | (oq5Var.f(yciVar) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 112) == 0) {
            i3 |= oq5Var.f(zbtVar) ? 32 : 16;
        }
        if ((i3 & 91) == 18 && oq5Var.z()) {
            oq5Var.S();
        } else {
            int i5 = ubt.a[zbtVar.ordinal()];
            if (i5 == 1) {
                i4 = R.drawable.lg_image;
            } else if (i5 == 2) {
                i4 = R.drawable.samsung_image;
            } else {
                if (i5 != 3) {
                    b6e.s();
                    return;
                }
                i4 = R.drawable.kp_android_tv_image;
            }
            irf.r(a0g.E(i4, 0, oq5Var), null, yciVar, null, null, 0.0f, null, oq5Var, ((i3 << 6) & 896) | 56, 120);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new tbt(this, yciVar, zbtVar, z, i2, 0);
        }
    }

    @Override // defpackage.nbt
    public int x() {
        return R.string.final_screen_subtitle;
    }

    public void N(String str) {
    }

    public void P(String str) {
    }

    @Override // defpackage.agg
    public Drawable i(Drawable drawable) {
        return drawable;
    }

    public void O(String str, String str2) {
    }
}
