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
    private static final int f16663a = 1;

    /* renamed from: b, reason: collision with root package name */
    private static final int f16664b = 2;

    /* renamed from: c, reason: collision with root package name */
    private static final int f16665c = 3;

    /* renamed from: e, reason: collision with root package name */
    private static volatile ag f16666e;

    /* renamed from: d, reason: collision with root package name */
    private final SparseBooleanArray f16667d = new SparseBooleanArray(3);

    public static ag a() {
        if (f16666e == null) {
            synchronized (ag.class) {
                try {
                    if (f16666e == null) {
                        f16666e = new ag();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f16666e;
    }

    public final synchronized boolean b(Context context) {
        if (this.f16667d.indexOfKey(2) >= 0) {
            return this.f16667d.get(2);
        }
        boolean z3 = false;
        try {
            Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(intent, 0);
            if (queryIntentServices != null) {
                if (queryIntentServices.size() > 0) {
                    z3 = true;
                }
            }
        } catch (Exception unused) {
        }
        this.f16667d.put(2, z3);
        return z3;
    }

    public final synchronized boolean a(Context context) {
        if (this.f16667d.indexOfKey(1) >= 0) {
            return this.f16667d.get(1);
        }
        boolean z3 = false;
        try {
            ad adVar = new ad(context);
            ad.a a9 = adVar.a("com.huawei.hwid");
            String b9 = adVar.b("com.huawei.hwid");
            if (a9 == ad.a.ENABLED) {
                if ("B92825C2BD5D6D6D1E7F39EECD17843B7D9016F611136B75441BC6F4D3F00F05".equalsIgnoreCase(b9)) {
                    z3 = true;
                }
            }
        } catch (Exception unused) {
        }
        this.f16667d.put(1, z3);
        return z3;
    }

    public final synchronized boolean b() {
        boolean z3;
        if (this.f16667d.indexOfKey(3) >= 0) {
            return this.f16667d.get(3);
        }
        try {
            Class.forName("com.tencent.mm.opensdk.openapi.WXAPIFactory");
            z3 = true;
        } catch (Exception unused) {
            z3 = false;
        }
        this.f16667d.put(3, z3);
        return z3;
    }
}
