package com.google.android.gms.internal.ads;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Build;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class E7 {

    /* renamed from: e, reason: collision with root package name */
    public static final String[] f24541e = {"android:establish_vpn_service", "android:establish_vpn_manager"};

    /* renamed from: a, reason: collision with root package name */
    public long f24542a;

    /* renamed from: b, reason: collision with root package name */
    public long f24543b;

    /* renamed from: c, reason: collision with root package name */
    public long f24544c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f24545d;

    public static E7 a(Context context, Executor executor) {
        String[] strArr = f24541e;
        E7 e72 = new E7();
        e72.f24542a = 0L;
        e72.f24543b = 0L;
        e72.f24544c = -1L;
        e72.f24545d = false;
        if (Build.VERSION.SDK_INT >= 30) {
            try {
                ((AppOpsManager) context.getSystemService("appops")).startWatchingActive(strArr, executor, new D7(e72));
            } catch (IllegalArgumentException | NoSuchMethodError unused) {
            }
        }
        return e72;
    }
}
