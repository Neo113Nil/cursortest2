package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import com.appsflyer.AdRevenueScheme;
import com.yandex.passport.sloth.ui.dependencies.m;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes.dex */
public final class p94 implements j9t {
    public final cib a;
    public final ConnectivityManager b;
    public final Context c;
    public final URL d;
    public final up4 e;
    public final up4 f;
    public final int g;

    public p94(Context context, up4 up4Var, up4 up4Var2) {
        r4f r4fVar = new r4f();
        g12 g12Var = g12.a;
        r4fVar.a(zv2.class, g12Var);
        r4fVar.a(mb2.class, g12Var);
        n12 n12Var = n12.a;
        r4fVar.a(trg.class, n12Var);
        r4fVar.a(nd2.class, n12Var);
        h12 h12Var = h12.a;
        r4fVar.a(go4.class, h12Var);
        r4fVar.a(nb2.class, h12Var);
        f12 f12Var = f12.a;
        r4fVar.a(be0.class, f12Var);
        r4fVar.a(kb2.class, f12Var);
        m12 m12Var = m12.a;
        r4fVar.a(wqg.class, m12Var);
        r4fVar.a(md2.class, m12Var);
        i12 i12Var = i12.a;
        r4fVar.a(um5.class, i12Var);
        r4fVar.a(ob2.class, i12Var);
        l12 l12Var = l12.a;
        r4fVar.a(a2c.class, l12Var);
        r4fVar.a(gd2.class, l12Var);
        k12 k12Var = k12.a;
        r4fVar.a(z1c.class, k12Var);
        r4fVar.a(fd2.class, k12Var);
        o12 o12Var = o12.a;
        r4fVar.a(rzi.class, o12Var);
        r4fVar.a(pd2.class, o12Var);
        j12 j12Var = j12.a;
        r4fVar.a(lxb.class, j12Var);
        r4fVar.a(ed2.class, j12Var);
        r4fVar.d = true;
        this.a = new cib(8, r4fVar);
        this.c = context;
        this.b = (ConnectivityManager) context.getSystemService("connectivity");
        this.d = b(vn3.c);
        this.e = up4Var2;
        this.f = up4Var;
        this.g = 130000;
    }

    public static URL b(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(f1d.g("Invalid url: ", str), e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a8, code lost:
    
        if (((defpackage.pzi) defpackage.pzi.a.get(r0)) != null) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0110  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final cd2 a(cd2 cd2Var) {
        int type;
        int subtype;
        HashMap hashMap;
        NetworkInfo activeNetworkInfo = this.b.getActiveNetworkInfo();
        m c = cd2Var.c();
        int i = Build.VERSION.SDK_INT;
        HashMap hashMap2 = (HashMap) c.g;
        if (hashMap2 == null) {
            xq0.q("Property \"autoMetadata\" has not been set");
            return null;
        }
        hashMap2.put("sdk-version", String.valueOf(i));
        c.b(CommonUrlParts.MODEL, Build.MODEL);
        c.b("hardware", Build.HARDWARE);
        c.b("device", Build.DEVICE);
        c.b("product", Build.PRODUCT);
        c.b("os-uild", Build.ID);
        c.b("manufacturer", Build.MANUFACTURER);
        c.b("fingerprint", Build.FINGERPRINT);
        Calendar.getInstance();
        long offset = TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000;
        HashMap hashMap3 = (HashMap) c.g;
        if (hashMap3 == null) {
            xq0.q("Property \"autoMetadata\" has not been set");
            return null;
        }
        hashMap3.put("tz-offset", String.valueOf(offset));
        int i2 = -1;
        if (activeNetworkInfo == null) {
            SparseArray sparseArray = qzi.a;
            type = -1;
        } else {
            type = activeNetworkInfo.getType();
        }
        HashMap hashMap4 = (HashMap) c.g;
        if (hashMap4 == null) {
            xq0.q("Property \"autoMetadata\" has not been set");
            return null;
        }
        hashMap4.put("net-type", String.valueOf(type));
        if (activeNetworkInfo != null) {
            subtype = activeNetworkInfo.getSubtype();
            if (subtype == -1) {
                SparseArray sparseArray2 = pzi.a;
                subtype = 100;
            }
            hashMap = (HashMap) c.g;
            if (hashMap != null) {
                xq0.q("Property \"autoMetadata\" has not been set");
                return null;
            }
            hashMap.put("mobile-subtype", String.valueOf(subtype));
            c.b(AdRevenueScheme.COUNTRY, Locale.getDefault().getCountry());
            c.b(CommonUrlParts.LOCALE, Locale.getDefault().getLanguage());
            Context context = this.c;
            String simOperator = ((TelephonyManager) context.getSystemService("phone")).getSimOperator();
            if (simOperator == null) {
                simOperator = "";
            }
            c.b("mcc_mnc", simOperator);
            try {
                i2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
            } catch (PackageManager.NameNotFoundException e) {
                tyf.s("CctTransportBackend", "Unable to find version code for package", e);
            }
            c.b("application_build", Integer.toString(i2));
            return c.c();
        }
        SparseArray sparseArray3 = pzi.a;
        subtype = 0;
        hashMap = (HashMap) c.g;
        if (hashMap != null) {
        }
    }
}
