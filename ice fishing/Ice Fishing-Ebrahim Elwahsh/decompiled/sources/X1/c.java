package X1;

import T3.d;
import Y1.e;
import Y1.g;
import Y1.h;
import Y1.i;
import Y1.j;
import Y1.k;
import Y1.l;
import Y1.n;
import Y1.o;
import Y1.q;
import Y1.r;
import Y1.s;
import Y1.t;
import Y1.u;
import Y1.v;
import a2.f;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import g1.C4523c;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;
import q2.C4903n;
import t0.AbstractC5051n;

/* loaded from: classes.dex */
public final class c implements f {

    /* renamed from: a, reason: collision with root package name */
    public final C4523c f3820a;

    /* renamed from: b, reason: collision with root package name */
    public final ConnectivityManager f3821b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f3822c;

    /* renamed from: d, reason: collision with root package name */
    public final URL f3823d;

    /* renamed from: e, reason: collision with root package name */
    public final i2.a f3824e;

    /* renamed from: f, reason: collision with root package name */
    public final i2.a f3825f;

    /* renamed from: g, reason: collision with root package name */
    public final int f3826g;

    public c(Context context, i2.a aVar, i2.a aVar2) {
        d dVar = new d();
        Y1.c cVar = Y1.c.f3897a;
        dVar.a(o.class, cVar);
        dVar.a(i.class, cVar);
        Y1.f fVar = Y1.f.f3910a;
        dVar.a(s.class, fVar);
        dVar.a(l.class, fVar);
        Y1.d dVar2 = Y1.d.f3899a;
        dVar.a(q.class, dVar2);
        dVar.a(j.class, dVar2);
        Y1.b bVar = Y1.b.f3885a;
        dVar.a(Y1.a.class, bVar);
        dVar.a(h.class, bVar);
        e eVar = e.f3902a;
        dVar.a(r.class, eVar);
        dVar.a(k.class, eVar);
        g gVar = g.f3918a;
        dVar.a(v.class, gVar);
        dVar.a(n.class, gVar);
        dVar.f3110d = true;
        this.f3820a = new C4523c(11, dVar);
        this.f3822c = context;
        this.f3821b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f3823d = b(a.f3810c);
        this.f3824e = aVar2;
        this.f3825f = aVar;
        this.f3826g = 130000;
    }

    public static URL b(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e6) {
            throw new IllegalArgumentException(AbstractC5051n.f("Invalid url: ", str), e6);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a7, code lost:
    
        if (((Y1.t) Y1.t.f3952n.get(r0)) != null) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x010a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Z1.h a(Z1.h hVar) {
        int type;
        int subtype;
        HashMap hashMap;
        NetworkInfo activeNetworkInfo = this.f3821b.getActiveNetworkInfo();
        C4903n c4 = hVar.c();
        int i = Build.VERSION.SDK_INT;
        HashMap hashMap2 = (HashMap) c4.f40106z;
        if (hashMap2 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        hashMap2.put("sdk-version", String.valueOf(i));
        c4.a("model", Build.MODEL);
        c4.a("hardware", Build.HARDWARE);
        c4.a("device", Build.DEVICE);
        c4.a("product", Build.PRODUCT);
        c4.a("os-uild", Build.ID);
        c4.a("manufacturer", Build.MANUFACTURER);
        c4.a("fingerprint", Build.FINGERPRINT);
        Calendar.getInstance();
        long offset = TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000;
        HashMap hashMap3 = (HashMap) c4.f40106z;
        if (hashMap3 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        hashMap3.put("tz-offset", String.valueOf(offset));
        int i4 = -1;
        if (activeNetworkInfo == null) {
            SparseArray sparseArray = u.f3954n;
            type = -1;
        } else {
            type = activeNetworkInfo.getType();
        }
        HashMap hashMap4 = (HashMap) c4.f40106z;
        if (hashMap4 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        hashMap4.put("net-type", String.valueOf(type));
        if (activeNetworkInfo != null) {
            subtype = activeNetworkInfo.getSubtype();
            if (subtype == -1) {
                SparseArray sparseArray2 = t.f3952n;
                subtype = 100;
            }
            hashMap = (HashMap) c4.f40106z;
            if (hashMap != null) {
                throw new IllegalStateException("Property \"autoMetadata\" has not been set");
            }
            hashMap.put("mobile-subtype", String.valueOf(subtype));
            c4.a("country", Locale.getDefault().getCountry());
            c4.a("locale", Locale.getDefault().getLanguage());
            Context context = this.f3822c;
            c4.a("mcc_mnc", ((TelephonyManager) context.getSystemService("phone")).getSimOperator());
            try {
                i4 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
            } catch (PackageManager.NameNotFoundException e6) {
                U2.a.d("CctTransportBackend", "Unable to find version code for package", e6);
            }
            c4.a("application_build", Integer.toString(i4));
            return c4.c();
        }
        SparseArray sparseArray3 = t.f3952n;
        subtype = 0;
        hashMap = (HashMap) c4.f40106z;
        if (hashMap != null) {
        }
    }
}
