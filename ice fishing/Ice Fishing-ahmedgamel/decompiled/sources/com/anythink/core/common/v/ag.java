package com.anythink.core.common.v;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.util.SparseBooleanArray;
import com.anythink.core.common.v.ad;
import java.util.List;

/* loaded from: classes.dex */
public class ag {

    /* renamed from: a, reason: collision with root package name */
    private static final int f17450a = 1;

    /* renamed from: b, reason: collision with root package name */
    private static final int f17451b = 2;

    /* renamed from: c, reason: collision with root package name */
    private static final int f17452c = 3;

    /* renamed from: e, reason: collision with root package name */
    private static volatile ag f17453e;

    /* renamed from: d, reason: collision with root package name */
    private final SparseBooleanArray f17454d = new SparseBooleanArray(3);

    public static ag a() {
        if (f17453e == null) {
            synchronized (ag.class) {
                try {
                    if (f17453e == null) {
                        f17453e = new ag();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f17453e;
    }

    public final synchronized boolean b(Context context) {
        if (this.f17454d.indexOfKey(2) >= 0) {
            return this.f17454d.get(2);
        }
        boolean z6 = false;
        try {
            Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(intent, 0);
            if (queryIntentServices != null) {
                if (queryIntentServices.size() > 0) {
                    z6 = true;
                }
            }
        } catch (Exception unused) {
        }
        this.f17454d.put(2, z6);
        return z6;
    }

    public final synchronized boolean a(Context context) {
        if (this.f17454d.indexOfKey(1) >= 0) {
            return this.f17454d.get(1);
        }
        boolean z6 = false;
        try {
            ad adVar = new ad(context);
            ad.a a9 = adVar.a("com.huawei.hwid");
            String b9 = adVar.b("com.huawei.hwid");
            if (a9 == ad.a.ENABLED) {
                if ("B92825C2BD5D6D6D1E7F39EECD17843B7D9016F611136B75441BC6F4D3F00F05".equalsIgnoreCase(b9)) {
                    z6 = true;
                }
            }
        } catch (Exception unused) {
        }
        this.f17454d.put(1, z6);
        return z6;
    }

    public final synchronized boolean b() {
        boolean z6;
        if (this.f17454d.indexOfKey(3) >= 0) {
            return this.f17454d.get(3);
        }
        try {
            Class.forName("com.tencent.mm.opensdk.openapi.WXAPIFactory");
            z6 = true;
        } catch (Exception unused) {
            z6 = false;
        }
        this.f17454d.put(3, z6);
        return z6;
    }
}
