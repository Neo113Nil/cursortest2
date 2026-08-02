package Z1;

import Z3.d;
import a2.AbstractC0429a;
import a2.C0430b;
import a2.C0431c;
import a2.C0432d;
import a2.e;
import a2.g;
import a2.h;
import a2.i;
import a2.j;
import a2.k;
import a2.l;
import a2.n;
import a2.o;
import a2.q;
import a2.r;
import a2.s;
import a2.t;
import a2.u;
import a2.v;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import c2.f;
import i1.C4586c;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;
import k2.InterfaceC4642a;
import s2.C4945n;
import w.AbstractC5128c;

/* loaded from: classes.dex */
public final class c implements f {

    /* renamed from: a, reason: collision with root package name */
    public final C4586c f4115a;

    /* renamed from: b, reason: collision with root package name */
    public final ConnectivityManager f4116b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f4117c;

    /* renamed from: d, reason: collision with root package name */
    public final URL f4118d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC4642a f4119e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC4642a f4120f;

    /* renamed from: g, reason: collision with root package name */
    public final int f4121g;

    public c(Context context, InterfaceC4642a interfaceC4642a, InterfaceC4642a interfaceC4642a2) {
        d dVar = new d();
        C0431c c0431c = C0431c.f4237a;
        dVar.a(o.class, c0431c);
        dVar.a(i.class, c0431c);
        a2.f fVar = a2.f.f4250a;
        dVar.a(s.class, fVar);
        dVar.a(l.class, fVar);
        C0432d c0432d = C0432d.f4239a;
        dVar.a(q.class, c0432d);
        dVar.a(j.class, c0432d);
        C0430b c0430b = C0430b.f4225a;
        dVar.a(AbstractC0429a.class, c0430b);
        dVar.a(h.class, c0430b);
        e eVar = e.f4242a;
        dVar.a(r.class, eVar);
        dVar.a(k.class, eVar);
        g gVar = g.f4258a;
        dVar.a(v.class, gVar);
        dVar.a(n.class, gVar);
        dVar.f4149d = true;
        this.f4115a = new C4586c(11, dVar);
        this.f4117c = context;
        this.f4116b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f4118d = b(a.f4105c);
        this.f4119e = interfaceC4642a2;
        this.f4120f = interfaceC4642a;
        this.f4121g = 130000;
    }

    public static URL b(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e9) {
            throw new IllegalArgumentException(AbstractC5128c.f("Invalid url: ", str), e9);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a7, code lost:
    
        if (((a2.t) a2.t.f4292n.get(r0)) != null) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x010a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final b2.h a(b2.h hVar) {
        int type;
        int subtype;
        HashMap hashMap;
        NetworkInfo activeNetworkInfo = this.f4116b.getActiveNetworkInfo();
        C4945n c9 = hVar.c();
        int i = Build.VERSION.SDK_INT;
        HashMap hashMap2 = (HashMap) c9.f40496z;
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
        HashMap hashMap3 = (HashMap) c9.f40496z;
        if (hashMap3 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        hashMap3.put("tz-offset", String.valueOf(offset));
        int i4 = -1;
        if (activeNetworkInfo == null) {
            SparseArray sparseArray = u.f4294n;
            type = -1;
        } else {
            type = activeNetworkInfo.getType();
        }
        HashMap hashMap4 = (HashMap) c9.f40496z;
        if (hashMap4 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        hashMap4.put("net-type", String.valueOf(type));
        if (activeNetworkInfo != null) {
            subtype = activeNetworkInfo.getSubtype();
            if (subtype == -1) {
                SparseArray sparseArray2 = t.f4292n;
                subtype = 100;
            }
            hashMap = (HashMap) c9.f40496z;
            if (hashMap != null) {
                throw new IllegalStateException("Property \"autoMetadata\" has not been set");
            }
            hashMap.put("mobile-subtype", String.valueOf(subtype));
            c9.a("country", Locale.getDefault().getCountry());
            c9.a("locale", Locale.getDefault().getLanguage());
            Context context = this.f4117c;
            c9.a("mcc_mnc", ((TelephonyManager) context.getSystemService("phone")).getSimOperator());
            try {
                i4 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
            } catch (PackageManager.NameNotFoundException e9) {
                Z2.d.j("CctTransportBackend", "Unable to find version code for package", e9);
            }
            c9.a("application_build", Integer.toString(i4));
            return c9.c();
        }
        SparseArray sparseArray3 = t.f4292n;
        subtype = 0;
        hashMap = (HashMap) c9.f40496z;
        if (hashMap != null) {
        }
    }
}
