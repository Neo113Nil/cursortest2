package X1;

import I0.j;
import X3.d;
import Y1.e;
import Y1.f;
import Y1.h;
import Y1.i;
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
import a2.g;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import i2.InterfaceC4581a;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;
import q2.C4896n;

/* loaded from: classes.dex */
public final class c implements g {

    /* renamed from: a, reason: collision with root package name */
    public final j f3764a;

    /* renamed from: b, reason: collision with root package name */
    public final ConnectivityManager f3765b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f3766c;

    /* renamed from: d, reason: collision with root package name */
    public final URL f3767d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC4581a f3768e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC4581a f3769f;

    /* renamed from: g, reason: collision with root package name */
    public final int f3770g;

    public c(Context context, InterfaceC4581a interfaceC4581a, InterfaceC4581a interfaceC4581a2) {
        d dVar = new d();
        Y1.c cVar = Y1.c.f3884a;
        dVar.a(o.class, cVar);
        dVar.a(i.class, cVar);
        f fVar = f.f3897a;
        dVar.a(s.class, fVar);
        dVar.a(l.class, fVar);
        Y1.d dVar2 = Y1.d.f3886a;
        dVar.a(q.class, dVar2);
        dVar.a(Y1.j.class, dVar2);
        Y1.b bVar = Y1.b.f3872a;
        dVar.a(Y1.a.class, bVar);
        dVar.a(h.class, bVar);
        e eVar = e.f3889a;
        dVar.a(r.class, eVar);
        dVar.a(k.class, eVar);
        Y1.g gVar = Y1.g.f3905a;
        dVar.a(v.class, gVar);
        dVar.a(n.class, gVar);
        dVar.f3804d = true;
        this.f3764a = new j(13, dVar);
        this.f3766c = context;
        this.f3765b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f3767d = b(a.f3754c);
        this.f3768e = interfaceC4581a2;
        this.f3769f = interfaceC4581a;
        this.f3770g = 130000;
    }

    public static URL b(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e9) {
            throw new IllegalArgumentException(u1.h.f("Invalid url: ", str), e9);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a7, code lost:
    
        if (((Y1.t) Y1.t.f3939n.get(r0)) != null) goto L21;
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
        NetworkInfo activeNetworkInfo = this.f3765b.getActiveNetworkInfo();
        C4896n c9 = hVar.c();
        int i = Build.VERSION.SDK_INT;
        HashMap hashMap2 = (HashMap) c9.f40194z;
        if (hashMap2 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        hashMap2.put("sdk-version", String.valueOf(i));
        c9.a("model", Build.MODEL);
        c9.a("hardware", Build.HARDWARE);
        c9.a("device", Build.DEVICE);
        c9.a("product", Build.PRODUCT);
        c9.a("os-uild", Build.ID);
        c9.a("manufacturer", Build.MANUFACTURER);
        c9.a("fingerprint", Build.FINGERPRINT);
        Calendar.getInstance();
        long offset = TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000;
        HashMap hashMap3 = (HashMap) c9.f40194z;
        if (hashMap3 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        hashMap3.put("tz-offset", String.valueOf(offset));
        int i6 = -1;
        if (activeNetworkInfo == null) {
            SparseArray sparseArray = u.f3941n;
            type = -1;
        } else {
            type = activeNetworkInfo.getType();
        }
        HashMap hashMap4 = (HashMap) c9.f40194z;
        if (hashMap4 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        hashMap4.put("net-type", String.valueOf(type));
        if (activeNetworkInfo != null) {
            subtype = activeNetworkInfo.getSubtype();
            if (subtype == -1) {
                SparseArray sparseArray2 = t.f3939n;
                subtype = 100;
            }
            hashMap = (HashMap) c9.f40194z;
            if (hashMap != null) {
                throw new IllegalStateException("Property \"autoMetadata\" has not been set");
            }
            hashMap.put("mobile-subtype", String.valueOf(subtype));
            c9.a("country", Locale.getDefault().getCountry());
            c9.a("locale", Locale.getDefault().getLanguage());
            Context context = this.f3766c;
            c9.a("mcc_mnc", ((TelephonyManager) context.getSystemService("phone")).getSimOperator());
            try {
                i6 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
            } catch (PackageManager.NameNotFoundException e9) {
                O3.b.k("CctTransportBackend", "Unable to find version code for package", e9);
            }
            c9.a("application_build", Integer.toString(i6));
            return c9.c();
        }
        SparseArray sparseArray3 = t.f3939n;
        subtype = 0;
        hashMap = (HashMap) c9.f40194z;
        if (hashMap != null) {
        }
    }
}
