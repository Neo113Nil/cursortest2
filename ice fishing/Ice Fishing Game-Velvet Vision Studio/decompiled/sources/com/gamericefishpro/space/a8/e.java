package com.gamericefishpro.space.a8;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import com.appsflyer.AdRevenueScheme;
import com.gamericefishpro.space.b8.f;
import com.gamericefishpro.space.b8.g;
import com.gamericefishpro.space.b8.h;
import com.gamericefishpro.space.b8.i;
import com.gamericefishpro.space.b8.j;
import com.gamericefishpro.space.b8.l;
import com.gamericefishpro.space.b8.m;
import com.gamericefishpro.space.b8.o;
import com.gamericefishpro.space.b8.p;
import com.gamericefishpro.space.b8.r;
import com.gamericefishpro.space.b8.s;
import com.gamericefishpro.space.b8.t;
import com.gamericefishpro.space.b8.u;
import com.gamericefishpro.space.b8.v;
import com.gamericefishpro.space.b8.w;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements com.gamericefishpro.space.d8.e {
    public final com.gamericefishpro.space.vb.c a;
    public final ConnectivityManager b;
    public final Context c;
    public final URL d;
    public final com.gamericefishpro.space.l8.a e;
    public final com.gamericefishpro.space.l8.a f;
    public final int g;

    public e(Context context, com.gamericefishpro.space.l8.a aVar, com.gamericefishpro.space.l8.a aVar2) {
        com.gamericefishpro.space.ib.d dVar = new com.gamericefishpro.space.ib.d();
        com.gamericefishpro.space.b8.c cVar = com.gamericefishpro.space.b8.c.a;
        dVar.a(p.class, cVar);
        dVar.a(i.class, cVar);
        f fVar = f.a;
        dVar.a(t.class, fVar);
        dVar.a(m.class, fVar);
        com.gamericefishpro.space.b8.d dVar2 = com.gamericefishpro.space.b8.d.a;
        dVar.a(r.class, dVar2);
        dVar.a(j.class, dVar2);
        com.gamericefishpro.space.b8.b bVar = com.gamericefishpro.space.b8.b.a;
        dVar.a(com.gamericefishpro.space.b8.a.class, bVar);
        dVar.a(h.class, bVar);
        com.gamericefishpro.space.b8.e eVar = com.gamericefishpro.space.b8.e.a;
        dVar.a(s.class, eVar);
        dVar.a(l.class, eVar);
        g gVar = g.a;
        dVar.a(w.class, gVar);
        dVar.a(o.class, gVar);
        dVar.d = true;
        this.a = new com.gamericefishpro.space.vb.c(24, dVar);
        this.c = context;
        this.b = (ConnectivityManager) context.getSystemService("connectivity");
        this.d = b(a.c);
        this.e = aVar2;
        this.f = aVar;
        this.g = 130000;
    }

    public static URL b(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(com.gamericefishpro.space.m5.a.u("Invalid url: ", str), e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00af  */
    /* JADX WARN: Code duplicated, block: B:30:0x010a  */
    public final com.gamericefishpro.space.c8.i a(com.gamericefishpro.space.c8.i iVar) {
        int type;
        int subtype;
        HashMap map;
        NetworkInfo activeNetworkInfo = this.b.getActiveNetworkInfo();
        com.gamericefishpro.space.c8.h hVarC = iVar.c();
        int i = Build.VERSION.SDK_INT;
        HashMap map2 = (HashMap) hVarC.f;
        if (map2 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map2.put("sdk-version", String.valueOf(i));
        hVarC.f("model", Build.MODEL);
        hVarC.f("hardware", Build.HARDWARE);
        hVarC.f("device", Build.DEVICE);
        hVarC.f("product", Build.PRODUCT);
        hVarC.f("os-uild", Build.ID);
        hVarC.f("manufacturer", Build.MANUFACTURER);
        hVarC.f("fingerprint", Build.FINGERPRINT);
        Calendar.getInstance();
        long offset = TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000;
        HashMap map3 = (HashMap) hVarC.f;
        if (map3 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map3.put("tz-offset", String.valueOf(offset));
        int i2 = -1;
        if (activeNetworkInfo == null) {
            SparseArray sparseArray = v.d;
            type = -1;
        } else {
            type = activeNetworkInfo.getType();
        }
        HashMap map4 = (HashMap) hVarC.f;
        if (map4 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map4.put("net-type", String.valueOf(type));
        if (activeNetworkInfo != null) {
            subtype = activeNetworkInfo.getSubtype();
            if (subtype == -1) {
                SparseArray sparseArray2 = u.d;
                subtype = 100;
            } else if (((u) u.d.get(subtype)) == null) {
            }
            map = (HashMap) hVarC.f;
            if (map != null) {
                throw new IllegalStateException("Property \"autoMetadata\" has not been set");
            }
            map.put("mobile-subtype", String.valueOf(subtype));
            hVarC.f(AdRevenueScheme.COUNTRY, Locale.getDefault().getCountry());
            hVarC.f("locale", Locale.getDefault().getLanguage());
            Context context = this.c;
            hVarC.f("mcc_mnc", ((TelephonyManager) context.getSystemService("phone")).getSimOperator());
            try {
                i2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
            } catch (PackageManager.NameNotFoundException e) {
                com.gamericefishpro.space.wa.b.s("CctTransportBackend", "Unable to find version code for package", e);
            }
            hVarC.f("application_build", Integer.toString(i2));
            return hVarC.h();
        }
        SparseArray sparseArray3 = u.d;
        subtype = 0;
        map = (HashMap) hVarC.f;
        if (map != null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map.put("mobile-subtype", String.valueOf(subtype));
        hVarC.f(AdRevenueScheme.COUNTRY, Locale.getDefault().getCountry());
        hVarC.f("locale", Locale.getDefault().getLanguage());
        Context context2 = this.c;
        hVarC.f("mcc_mnc", ((TelephonyManager) context2.getSystemService("phone")).getSimOperator());
        i2 = context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0).versionCode;
        hVarC.f("application_build", Integer.toString(i2));
        return hVarC.h();
    }
}
