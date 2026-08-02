package com.yandex.passport.internal.sso;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.os.Bundle;
import android.util.Base64;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.yandex.passport.R;
import com.yandex.passport.common.network.r;
import com.yandex.passport.internal.analytics.o0;
import com.yandex.passport.internal.entities.s;
import defpackage.c5b;
import defpackage.e5b;
import defpackage.itv;
import defpackage.jhp;
import defpackage.lcc;
import defpackage.o7t;
import defpackage.tah;
import defpackage.v75;
import defpackage.wz0;
import java.io.ByteArrayInputStream;
import java.security.NoSuchAlgorithmException;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class g {
    public final Context a;
    public final com.yandex.passport.internal.config.a b;
    public final o0 c;
    public final X509Certificate d;

    public g(Context context, com.yandex.passport.internal.config.a aVar, o0 o0Var) {
        context.getClass();
        this.a = context;
        this.b = aVar;
        this.c = o0Var;
        String string = context.getString(R.string.passport_sso_trusted_certificate);
        string.getClass();
        byte[] decode = Base64.decode(string, 0);
        decode.getClass();
        Certificate generateCertificate = CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(decode));
        generateCertificate.getClass();
        this.d = (X509Certificate) generateCertificate;
    }

    public final List a() {
        Intent intent = new Intent("com.yandex.passport.ACTION_SSO_ANNOUNCEMENT");
        Context context = this.a;
        List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, RemoteCameraConfig.Mic.BUFFER_SIZE);
        queryBroadcastReceivers.getClass();
        final int i = 1;
        final int i2 = 0;
        List k = jhp.k(jhp.e(new o7t(new lcc(new wz0(i, queryBroadcastReceivers), true, new Function1(this) { // from class: com.yandex.passport.internal.sso.f
            public final /* synthetic */ g b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                ResolveInfo resolveInfo = (ResolveInfo) obj;
                switch (i2) {
                    case 0:
                        return Boolean.valueOf(!Intrinsics.d(resolveInfo.activityInfo.packageName, this.b.a.getPackageName()));
                    default:
                        String str = resolveInfo.activityInfo.packageName;
                        str.getClass();
                        return this.b.c(str, new r(28));
                }
            }
        }), new Function1(this) { // from class: com.yandex.passport.internal.sso.f
            public final /* synthetic */ g b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                ResolveInfo resolveInfo = (ResolveInfo) obj;
                switch (i) {
                    case 0:
                        return Boolean.valueOf(!Intrinsics.d(resolveInfo.activityInfo.packageName, this.b.a.getPackageName()));
                    default:
                        String str = resolveInfo.activityInfo.packageName;
                        str.getClass();
                        return this.b.c(str, new r(28));
                }
            }
        })));
        if (k.isEmpty()) {
            return c5b.a;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : k) {
            String encodeToString = Base64.encodeToString(((d) obj).c.b(), 2);
            encodeToString.getClass();
            Object obj2 = linkedHashMap.get(encodeToString);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(encodeToString, obj2);
            }
            ((List) obj2).add(obj);
        }
        byte[] bArr = s.c;
        PackageManager packageManager = context.getPackageManager();
        packageManager.getClass();
        String packageName = context.getPackageName();
        packageName.getClass();
        s q = com.yandex.plus.core.network.api.utils.a.q(packageManager, packageName);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            String encodeToString2 = Base64.encodeToString(q.b(), 2);
            encodeToString2.getClass();
            if (!Intrinsics.d(key, encodeToString2)) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        Collection<List> values = linkedHashMap2.values();
        ArrayList arrayList = new ArrayList(v75.o(values, 10));
        for (List list : values) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj3 : list) {
                d dVar = (d) obj3;
                if (dVar.a(this.d, new itv(28, this, dVar))) {
                    arrayList2.add(obj3);
                }
            }
            arrayList.add(CollectionsKt.o0(arrayList2, new com.yandex.passport.internal.core.accounts.r(i)));
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (!((List) next).isEmpty()) {
                arrayList3.add(next);
            }
        }
        ArrayList arrayList4 = new ArrayList(v75.o(arrayList3, 10));
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            arrayList4.add(new m((List) it2.next()));
        }
        return arrayList4;
    }

    public final boolean b(String str) {
        str.getClass();
        d c = c(str, new r(28));
        if (c == null) {
            return false;
        }
        return c.a(this.d, new itv(29, this, str));
    }

    public final d c(String str, Function1 function1) {
        Map map;
        X509Certificate x509Certificate;
        Bundle bundle;
        Bundle bundle2;
        com.yandex.passport.internal.config.a aVar = this.b;
        if (aVar != null) {
            Map<String, ?> all = ((SharedPreferences) aVar.b.getValue()).getAll();
            all.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, ?> entry : all.entrySet()) {
                if (!Intrinsics.d(entry.getKey(), "blacklisted_apps")) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            map = new LinkedHashMap(tah.a(linkedHashMap.size()));
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                map.put(entry2.getKey(), String.valueOf(entry2.getValue()));
            }
        } else {
            map = e5b.a;
            map.getClass();
        }
        Map map2 = map;
        Context context = this.a;
        context.getClass();
        str.getClass();
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, (Build.VERSION.SDK_INT >= 28 ? 134217728 : 64) | 128);
            if (packageInfo != null && com.yandex.passport.common.util.a.c(packageInfo) != null) {
                byte[] bArr = s.c;
                s p = com.yandex.plus.core.network.api.utils.a.p(packageInfo);
                ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                int i = -1;
                if (applicationInfo != null && (bundle2 = applicationInfo.metaData) != null) {
                    i = bundle2.getInt("com.yandex.auth.INTERNAL_VERSION", -1);
                }
                int i2 = i;
                ApplicationInfo applicationInfo2 = packageInfo.applicationInfo;
                String z = com.yandex.plus.core.network.api.utils.a.z((applicationInfo2 == null || (bundle = applicationInfo2.metaData) == null) ? null : bundle.getString("com.yandex.passport.SSO.CERT", null));
                PackageManager packageManager = context.getPackageManager();
                packageManager.getClass();
                String packageName = context.getPackageName();
                packageName.getClass();
                s q = com.yandex.plus.core.network.api.utils.a.q(packageManager, packageName);
                if (z != null) {
                    byte[] decode = Base64.decode(z, 0);
                    decode.getClass();
                    Certificate generateCertificate = CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(decode));
                    generateCertificate.getClass();
                    x509Certificate = (X509Certificate) generateCertificate;
                } else {
                    x509Certificate = null;
                }
                return new d(str, q, p, map2, i2, x509Certificate);
            }
        } catch (PackageManager.NameNotFoundException e) {
            function1.invoke(e);
        } catch (NoSuchAlgorithmException e2) {
            function1.invoke(e2);
        }
        return null;
    }
}
