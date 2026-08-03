package u5;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import d8.m;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;
import m7.g;
import v5.e;
import v5.h;
import v5.i;
import v5.j;
import v5.k;
import v5.l;
import v5.n;
import v5.o;
import v5.q;
import v5.r;
import v5.s;
import v5.t;
import v5.u;
import v5.v;
import x5.f;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class c implements f {

    /* renamed from: a, reason: collision with root package name */
    public final g f6702a;

    /* renamed from: b, reason: collision with root package name */
    public final ConnectivityManager f6703b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f6704c;

    /* renamed from: d, reason: collision with root package name */
    public final URL f6705d;

    /* renamed from: e, reason: collision with root package name */
    public final f6.a f6706e;

    /* renamed from: f, reason: collision with root package name */
    public final f6.a f6707f;

    /* renamed from: g, reason: collision with root package name */
    public final int f6708g;

    public c(Context context, f6.a aVar, f6.a aVar2) {
        r7.d dVar = new r7.d();
        v5.c cVar = v5.c.f7238a;
        dVar.a(o.class, cVar);
        dVar.a(i.class, cVar);
        v5.f fVar = v5.f.f7251a;
        dVar.a(s.class, fVar);
        dVar.a(l.class, fVar);
        v5.d dVar2 = v5.d.f7240a;
        dVar.a(q.class, dVar2);
        dVar.a(j.class, dVar2);
        v5.b bVar = v5.b.f7225a;
        dVar.a(v5.a.class, bVar);
        dVar.a(h.class, bVar);
        e eVar = e.f7243a;
        dVar.a(r.class, eVar);
        dVar.a(k.class, eVar);
        v5.g gVar = v5.g.f7259a;
        dVar.a(v.class, gVar);
        dVar.a(n.class, gVar);
        dVar.f6104d = true;
        this.f6702a = new g(14, dVar);
        this.f6704c = context;
        this.f6703b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f6705d = b(a.f6694c);
        this.f6706e = aVar2;
        this.f6707f = aVar;
        this.f6708g = 130000;
    }

    public static URL b(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e10) {
            throw new IllegalArgumentException("Invalid url: " + str, e10);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a7, code lost:
    
        if (((v5.t) v5.t.f7294g.get(r0)) != null) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x010a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final w5.h a(w5.h hVar) {
        int type;
        int subtype;
        HashMap hashMap;
        NetworkInfo activeNetworkInfo = this.f6703b.getActiveNetworkInfo();
        m c3 = hVar.c();
        int i10 = Build.VERSION.SDK_INT;
        HashMap hashMap2 = (HashMap) c3.f1802f;
        if (hashMap2 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        hashMap2.put("sdk-version", String.valueOf(i10));
        c3.f("model", Build.MODEL);
        c3.f("hardware", Build.HARDWARE);
        c3.f("device", Build.DEVICE);
        c3.f("product", Build.PRODUCT);
        c3.f("os-uild", Build.ID);
        c3.f("manufacturer", Build.MANUFACTURER);
        c3.f("fingerprint", Build.FINGERPRINT);
        Calendar.getInstance();
        long offset = TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000;
        HashMap hashMap3 = (HashMap) c3.f1802f;
        if (hashMap3 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        hashMap3.put("tz-offset", String.valueOf(offset));
        int i11 = -1;
        if (activeNetworkInfo == null) {
            SparseArray sparseArray = u.f7296g;
            type = -1;
        } else {
            type = activeNetworkInfo.getType();
        }
        HashMap hashMap4 = (HashMap) c3.f1802f;
        if (hashMap4 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        hashMap4.put("net-type", String.valueOf(type));
        if (activeNetworkInfo != null) {
            subtype = activeNetworkInfo.getSubtype();
            if (subtype == -1) {
                SparseArray sparseArray2 = t.f7294g;
                subtype = 100;
            }
            hashMap = (HashMap) c3.f1802f;
            if (hashMap != null) {
                throw new IllegalStateException("Property \"autoMetadata\" has not been set");
            }
            hashMap.put("mobile-subtype", String.valueOf(subtype));
            c3.f("country", Locale.getDefault().getCountry());
            c3.f("locale", Locale.getDefault().getLanguage());
            Context context = this.f6704c;
            c3.f("mcc_mnc", ((TelephonyManager) context.getSystemService("phone")).getSimOperator());
            try {
                i11 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
            } catch (PackageManager.NameNotFoundException e10) {
                a.a.u("CctTransportBackend", "Unable to find version code for package", e10);
            }
            c3.f("application_build", Integer.toString(i11));
            return c3.h();
        }
        SparseArray sparseArray3 = t.f7294g;
        subtype = 0;
        hashMap = (HashMap) c3.f1802f;
        if (hashMap != null) {
        }
    }
}
