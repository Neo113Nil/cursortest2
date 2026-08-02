package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.google.android.datatransport.cct.internal.ClientInfo;
import com.google.android.datatransport.cct.internal.ComplianceData;
import com.google.android.datatransport.cct.internal.NetworkConnectionInfo;
import com.google.android.datatransport.cct.internal.a;
import com.google.android.datatransport.cct.internal.b;
import com.google.android.datatransport.cct.internal.c;
import com.google.android.datatransport.cct.internal.e;
import com.google.android.datatransport.cct.internal.g;
import com.google.android.datatransport.cct.internal.i;
import com.ybsdk.network.dto.CreateApplicationWithProductJsonAdapter;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes.dex */
public final class u59 implements d011 {
    public final vit a;
    public final ConnectivityManager b;
    public final Context c;
    public final URL d;
    public final s3c e;
    public final s3c f;
    public final int g;

    public u59(Context context, s3c s3cVar, s3c s3cVar2) {
        mcx mcxVar = new mcx();
        fp3 fp3Var = fp3.a;
        mcxVar.a(if5.class, fp3Var);
        mcxVar.a(s34.class, fp3Var);
        kp3 kp3Var = kp3.a;
        mcxVar.a(ifz.class, kp3Var);
        mcxVar.a(i74.class, kp3Var);
        a aVar = a.a;
        mcxVar.a(ClientInfo.class, aVar);
        mcxVar.a(e.class, aVar);
        ep3 ep3Var = ep3.a;
        mcxVar.a(v72.class, ep3Var);
        mcxVar.a(h34.class, ep3Var);
        jp3 jp3Var = jp3.a;
        mcxVar.a(gez.class, jp3Var);
        mcxVar.a(g74.class, jp3Var);
        b bVar = b.a;
        mcxVar.a(ComplianceData.class, bVar);
        mcxVar.a(g.class, bVar);
        ip3 ip3Var = ip3.a;
        mcxVar.a(u0p.class, ip3Var);
        mcxVar.a(p64.class, ip3Var);
        hp3 hp3Var = hp3.a;
        mcxVar.a(s0p.class, hp3Var);
        mcxVar.a(n64.class, hp3Var);
        c cVar = c.a;
        mcxVar.a(NetworkConnectionInfo.class, cVar);
        mcxVar.a(i.class, cVar);
        gp3 gp3Var = gp3.a;
        mcxVar.a(pqo.class, gp3Var);
        mcxVar.a(l64.class, gp3Var);
        mcxVar.d = true;
        this.a = new vit(24, mcxVar);
        this.c = context;
        this.b = (ConnectivityManager) context.getSystemService("connectivity");
        this.d = b(d87.c);
        this.e = s3cVar2;
        this.f = s3cVar;
        this.g = 130000;
    }

    public static URL b(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            yci0.p(g8e.o("Invalid url: ", str), e);
            return null;
        }
    }

    public final rfo a(rfo rfoVar) {
        int subtype;
        NetworkInfo activeNetworkInfo = this.b.getActiveNetworkInfo();
        h64 m = rfoVar.m();
        ((HashMap) m.b()).put("sdk-version", String.valueOf(Build.VERSION.SDK_INT));
        m.a("model", Build.MODEL);
        m.a("hardware", Build.HARDWARE);
        m.a("device", Build.DEVICE);
        m.a(CreateApplicationWithProductJsonAdapter.productKey, Build.PRODUCT);
        m.a("os-uild", Build.ID);
        m.a("manufacturer", Build.MANUFACTURER);
        m.a("fingerprint", Build.FINGERPRINT);
        Calendar.getInstance();
        ((HashMap) m.b()).put("tz-offset", String.valueOf(TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000));
        ((HashMap) m.b()).put("net-type", String.valueOf(activeNetworkInfo == null ? NetworkConnectionInfo.NetworkType.NONE.b() : activeNetworkInfo.getType()));
        int i = -1;
        if (activeNetworkInfo == null) {
            subtype = NetworkConnectionInfo.MobileSubtype.UNKNOWN_MOBILE_SUBTYPE.b();
        } else {
            subtype = activeNetworkInfo.getSubtype();
            if (subtype == -1) {
                subtype = NetworkConnectionInfo.MobileSubtype.COMBINED.b();
            } else if (NetworkConnectionInfo.MobileSubtype.a(subtype) == null) {
                subtype = 0;
            }
        }
        ((HashMap) m.b()).put("mobile-subtype", String.valueOf(subtype));
        m.a("country", Locale.getDefault().getCountry());
        m.a("locale", Locale.getDefault().getLanguage());
        Context context = this.c;
        String simOperator = ((TelephonyManager) context.getSystemService("phone")).getSimOperator();
        if (simOperator == null) {
            simOperator = "";
        }
        m.a("mcc_mnc", simOperator);
        try {
            i = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            rzo.v(e, "CctTransportBackend", "Unable to find version code for package");
        }
        m.a("application_build", Integer.toString(i));
        return m.c();
    }
}
