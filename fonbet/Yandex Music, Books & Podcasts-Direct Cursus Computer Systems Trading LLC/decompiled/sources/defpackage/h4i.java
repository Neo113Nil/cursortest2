package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import com.yandex.pulse.ApplicationParams;
import com.yandex.pulse.ComponentParams;
import com.yandex.pulse.R;
import com.yandex.pulse.metrics.a;
import com.yandex.pulse.metrics.b;
import com.yandex.pulse.metrics.c;
import com.yandex.pulse.metrics.d;
import com.yandex.pulse.metrics.d2;
import com.yandex.pulse.metrics.f;
import com.yandex.pulse.metrics.g;
import com.yandex.pulse.metrics.h;
import com.yandex.pulse.metrics.i;
import com.yandex.pulse.metrics.j;
import com.yandex.pulse.metrics.o;
import com.yandex.pulse.metrics.p;
import com.yandex.pulse.metrics.q1;
import com.yandex.pulse.metrics.u0;
import com.yandex.pulse.metrics.v0;
import com.yandex.pulse.metrics.z1;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.collections.CollectionsKt;
import kotlin.text.Charsets;

/* loaded from: classes5.dex */
public final class h4i {
    public final int a;
    public final d5i b;
    public final t4i[] c;
    public final pk4 d;
    public final ryd e;
    public final HashMap f;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x02d2 A[LOOP:1: B:46:0x02d0->B:47:0x02d2, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public h4i(Context context, String str, int i, int i2, d5i d5iVar, t4i[] t4iVarArr) {
        uzr uzrVar;
        int length;
        int i3;
        uzr uzrVar2;
        t4i[] t4iVarArr2 = t4iVarArr;
        context.getClass();
        this.a = i2;
        this.b = d5iVar;
        this.c = t4iVarArr2;
        pk4 newBuilder = a.newBuilder();
        this.d = newBuilder;
        SystemClock.elapsedRealtime();
        this.e = new ryd();
        this.f = new HashMap();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            byte[] bytes = str.getBytes(Charsets.UTF_8);
            bytes.getClass();
            long j = ByteBuffer.wrap(messageDigest.digest(bytes)).order(ByteOrder.BIG_ENDIAN).getLong();
            newBuilder.d();
            ((a) newBuilder.b).setClientId(j);
            newBuilder.d();
            ((a) newBuilder.b).setSessionId(i);
            p newBuilder2 = o.newBuilder();
            uyr uyrVar = uyr.a;
            Locale locale = Locale.getDefault();
            String language = locale.getLanguage();
            String country = locale.getCountry();
            country.getClass();
            if (country.length() == 0) {
                language.getClass();
            } else {
                language = hrg.l('-', language, country);
            }
            newBuilder2.d();
            ((o) newBuilder2.b).setApplicationLocale(language);
            uzr uzrVar3 = uzr.CHANNEL_CANARY;
            uzr uzrVar4 = uzr.CHANNEL_DEV;
            uzr uzrVar5 = uzr.CHANNEL_BETA;
            uzr uzrVar6 = uzr.CHANNEL_STABLE;
            uzr uzrVar7 = uzr.CHANNEL_UNKNOWN;
            int i4 = 2;
            if (d5iVar != 0) {
                ComponentParams componentParams = (ComponentParams) ((b6) d5iVar).b;
                String str2 = componentParams.packageName;
                newBuilder2.d();
                ((o) newBuilder2.b).setAppPackageName(str2);
                String str3 = componentParams.versionString;
                newBuilder2.d();
                ((o) newBuilder2.b).setAppVersion(str3);
                int i5 = componentParams.channel;
                if (i5 != 0) {
                    if (i5 == 1) {
                        uzrVar2 = uzrVar3;
                    } else if (i5 == 2) {
                        uzrVar2 = uzrVar4;
                    } else if (i5 == 3) {
                        uzrVar2 = uzrVar5;
                    } else if (i5 == 4) {
                        uzrVar2 = uzrVar6;
                    }
                    uzr b = uzr.b(uzrVar2.a);
                    newBuilder2.d();
                    ((o) newBuilder2.b).setChannel(b);
                }
                uzrVar2 = uzrVar7;
                uzr b2 = uzr.b(uzrVar2.a);
                newBuilder2.d();
                ((o) newBuilder2.b).setChannel(b2);
            }
            u0 newBuilder3 = o.i.newBuilder();
            v0 newBuilder4 = o.i.a.newBuilder();
            newBuilder4.d();
            ((o.i.a) newBuilder4.b).setVendorName("unknown");
            newBuilder4.d();
            ((o.i.a) newBuilder4.b).setSignature(0);
            int i6 = ryr.a;
            newBuilder4.d();
            ((o.i.a) newBuilder4.b).setNumCores(i6);
            o.i.a aVar = (o.i.a) newBuilder4.b();
            newBuilder3.d();
            ((o.i) newBuilder3.b).setCpu(aVar);
            String str4 = qyr.a;
            newBuilder3.d();
            ((o.i) newBuilder3.b).setCpuArchitecture(str4);
            long j2 = 1024;
            long j3 = (oyr.a / j2) / j2;
            newBuilder3.d();
            ((o.i) newBuilder3.b).setSystemRamMb(j3);
            Build.MODEL.getClass();
            newBuilder3.d();
            ((o.i) newBuilder3.b).setHardwareClass(Build.MODEL);
            int i7 = uyr.d(context).widthPixels;
            newBuilder3.d();
            ((o.i) newBuilder3.b).setPrimaryScreenWidth(i7);
            int i8 = uyr.d(context).heightPixels;
            newBuilder3.d();
            ((o.i) newBuilder3.b).setPrimaryScreenHeight(i8);
            float f = uyr.d(context).density;
            newBuilder3.d();
            ((o.i) newBuilder3.b).setPrimaryScreenScaleFactor(f);
            o.i iVar = (o.i) newBuilder3.b();
            newBuilder2.d();
            ((o) newBuilder2.b).setHardware(iVar);
            q1 newBuilder5 = o.l.newBuilder();
            newBuilder5.d();
            ((o.l) newBuilder5.b).setName("Android");
            Build.VERSION.RELEASE.getClass();
            newBuilder5.d();
            ((o.l) newBuilder5.b).setVersion(Build.VERSION.RELEASE);
            String str5 = pyr.a;
            newBuilder5.d();
            ((o.l) newBuilder5.b).setBuildFingerprint(str5);
            o.l lVar = (o.l) newBuilder5.b();
            newBuilder2.d();
            ((o) newBuilder2.b).setOs(lVar);
            z1 newBuilder6 = o.C0020o.newBuilder();
            if (d5iVar != 0) {
                String str6 = ((ComponentParams) ((b6) d5iVar).b).metricaApiKey;
                newBuilder6.d();
                ((o.C0020o) newBuilder6.b).setMetricaApiKey(str6);
                ApplicationParams applicationParams = (ApplicationParams) ((ComponentParams) ((u4i) d5iVar).b);
                String str7 = applicationParams.metricaDeviceId;
                if (str7 != null) {
                    newBuilder6.d();
                    ((o.C0020o) newBuilder6.b).setUi(str7);
                }
                String str8 = applicationParams.metricaUuid;
                if (str8 != null) {
                    newBuilder6.d();
                    ((o.C0020o) newBuilder6.b).setUuid(str8);
                }
            }
            d2 d2Var = context.getResources().getInteger(R.integer.me_min_screen_width_bucket) >= 2 ? d2.DEVICE_FORM_FACTOR_TABLET : d2.DEVICE_FORM_FACTOR_PHONE;
            newBuilder6.d();
            ((o.C0020o) newBuilder6.b).setDeviceFormFactor(d2Var);
            newBuilder6.d();
            ((o.C0020o) newBuilder6.b).setClientVersion("PulseSDK 5.0.0");
            o.C0020o c0020o = (o.C0020o) newBuilder6.b();
            newBuilder2.d();
            ((o) newBuilder2.b).setYa(c0020o);
            o oVar = (o) newBuilder2.b();
            newBuilder.d();
            ((a) newBuilder.b).setSystemProfile(oVar);
            ArrayList arrayList = new ArrayList(t4iVarArr2.length);
            int length2 = t4iVarArr2.length;
            int i9 = 0;
            while (i9 < length2) {
                t4i t4iVar = t4iVarArr2[i9];
                g newBuilder7 = i.newBuilder();
                ComponentParams componentParams2 = (ComponentParams) t4iVar.b;
                String str9 = componentParams2.packageName;
                newBuilder7.d();
                ((i) newBuilder7.b).setAppPackageName(str9);
                String str10 = componentParams2.versionString;
                newBuilder7.d();
                ((i) newBuilder7.b).setAppVersion(str10);
                int i10 = componentParams2.channel;
                if (i10 != 0) {
                    if (i10 == 1) {
                        uzrVar = uzrVar3;
                    } else if (i10 == i4) {
                        uzrVar = uzrVar4;
                    } else if (i10 == 3) {
                        uzrVar = uzrVar5;
                    } else if (i10 == 4) {
                        uzrVar = uzrVar6;
                    }
                    txf b3 = txf.b(uzrVar.a);
                    newBuilder7.d();
                    ((i) newBuilder7.b).setChannel(b3);
                    j newBuilder8 = i.b.newBuilder();
                    String str11 = componentParams2.metricaApiKey;
                    newBuilder8.d();
                    ((i.b) newBuilder8.b).setMetricaApiKey(str11);
                    i.b bVar = (i.b) newBuilder8.b();
                    newBuilder7.d();
                    ((i) newBuilder7.b).setYa(bVar);
                    oe5[] oe5VarArr = (oe5[]) t4iVar.c;
                    ArrayList arrayList2 = new ArrayList(oe5VarArr.length);
                    length = oe5VarArr.length;
                    i3 = 0;
                    while (i3 < length) {
                        oe5 oe5Var = oe5VarArr[i3];
                        h newBuilder9 = i.a.newBuilder();
                        int G = f8g.G(oe5Var.a);
                        newBuilder9.d();
                        ((i.a) newBuilder9.b).setNameId(G);
                        int G2 = f8g.G(oe5Var.b);
                        newBuilder9.d();
                        ((i.a) newBuilder9.b).setGroupId(G2);
                        arrayList2.add((i.a) newBuilder9.b());
                        i3++;
                        length2 = length2;
                    }
                    List w0 = CollectionsKt.w0(arrayList2);
                    newBuilder7.d();
                    ((i) newBuilder7.b).addAllFieldTrial(w0);
                    i iVar2 = (i) newBuilder7.b();
                    qxf newBuilder10 = f.newBuilder();
                    newBuilder10.d();
                    ((f) newBuilder10.b).setLibraryProfile(iVar2);
                    f fVar = (f) newBuilder10.b();
                    newBuilder.d();
                    ((a) newBuilder.b).addLibraryMetrics(fVar);
                    arrayList.add(iVar2);
                    i9++;
                    t4iVarArr2 = t4iVarArr;
                    length2 = length2;
                    i4 = 2;
                }
                uzrVar = uzrVar7;
                txf b32 = txf.b(uzrVar.a);
                newBuilder7.d();
                ((i) newBuilder7.b).setChannel(b32);
                j newBuilder82 = i.b.newBuilder();
                String str112 = componentParams2.metricaApiKey;
                newBuilder82.d();
                ((i.b) newBuilder82.b).setMetricaApiKey(str112);
                i.b bVar2 = (i.b) newBuilder82.b();
                newBuilder7.d();
                ((i) newBuilder7.b).setYa(bVar2);
                oe5[] oe5VarArr2 = (oe5[]) t4iVar.c;
                ArrayList arrayList22 = new ArrayList(oe5VarArr2.length);
                length = oe5VarArr2.length;
                i3 = 0;
                while (i3 < length) {
                }
                List w02 = CollectionsKt.w0(arrayList22);
                newBuilder7.d();
                ((i) newBuilder7.b).addAllFieldTrial(w02);
                i iVar22 = (i) newBuilder7.b();
                qxf newBuilder102 = f.newBuilder();
                newBuilder102.d();
                ((f) newBuilder102.b).setLibraryProfile(iVar22);
                f fVar2 = (f) newBuilder102.b();
                newBuilder.d();
                ((a) newBuilder.b).addLibraryMetrics(fVar2);
                arrayList.add(iVar22);
                i9++;
                t4iVarArr2 = t4iVarArr;
                length2 = length2;
                i4 = 2;
            }
        } catch (NoSuchAlgorithmException e) {
            wvs.m(e);
            throw null;
        }
    }

    public static void a(ryd rydVar, String str, String str2, wyd wydVar) {
        m78 m78Var = wydVar.a;
        rydVar.getClass();
        str.getClass();
        str2.getClass();
        ArrayList arrayList = rydVar.a;
        d newBuilder = c.newBuilder();
        String concat = str.concat(str2);
        newBuilder.d();
        ((c) newBuilder.b).setName(concat);
        String name = ((c) newBuilder.b).getName();
        name.getClass();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            byte[] bytes = name.getBytes(Charsets.UTF_8);
            bytes.getClass();
            long j = ByteBuffer.wrap(messageDigest.digest(bytes)).order(ByteOrder.BIG_ENDIAN).getLong();
            newBuilder.d();
            ((c) newBuilder.b).setNameHash(j);
            long j2 = ((AtomicLong) m78Var.b).get();
            Long valueOf = Long.valueOf(j2);
            if (j2 == 0) {
                valueOf = null;
            }
            if (valueOf != null) {
                long longValue = valueOf.longValue();
                newBuilder.d();
                ((c) newBuilder.b).setSum(longValue);
            }
            long j3 = ((AtomicLong) m78Var.c).get();
            newBuilder.d();
            ((c) newBuilder.b).setFiniteSum(j3);
            ArrayList arrayList2 = new ArrayList();
            uno e = wydVar.e();
            while (!e.u()) {
                b newBuilder2 = c.a.newBuilder();
                long t = e.t();
                newBuilder2.d();
                ((c.a) newBuilder2.b).setMin(t);
                long B = e.B();
                newBuilder2.d();
                ((c.a) newBuilder2.b).setMax(B);
                int count = e.getCount();
                Integer valueOf2 = Integer.valueOf(count);
                if (count == 1) {
                    valueOf2 = null;
                }
                if (valueOf2 != null) {
                    long intValue = valueOf2.intValue();
                    newBuilder2.d();
                    ((c.a) newBuilder2.b).setCount(intValue);
                }
                arrayList2.add(newBuilder2);
                e.next();
            }
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList2.get(i);
                obj.getClass();
                b bVar = (b) obj;
                i++;
                if (i < arrayList2.size() && ((c.a) bVar.b).getMax() == ((c.a) ((b) arrayList2.get(i)).b).getMin()) {
                    bVar.d();
                    ((c.a) bVar.b).clearMax();
                } else if (((c.a) bVar.b).getMax() == ((c.a) bVar.b).getMin() + 1) {
                    bVar.d();
                    ((c.a) bVar.b).clearMin();
                }
            }
            ArrayList arrayList3 = new ArrayList(v75.o(arrayList2, 10));
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList3.add((c.a) ((b) it.next()).b());
            }
            newBuilder.d();
            ((c) newBuilder.b).addAllBucket(arrayList3);
            arrayList.add(newBuilder.b());
        } catch (NoSuchAlgorithmException e2) {
            wvs.m(e2);
        }
    }
}
