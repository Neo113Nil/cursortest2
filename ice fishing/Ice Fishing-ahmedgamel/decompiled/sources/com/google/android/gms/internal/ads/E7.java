package com.google.android.gms.internal.ads;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Build;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class E7 {

    /* renamed from: e, reason: collision with root package name */
    public static final String[] f25302e = {"android:establish_vpn_service", "android:establish_vpn_manager"};

    /* renamed from: a, reason: collision with root package name */
    public long f25303a;

    /* renamed from: b, reason: collision with root package name */
    public long f25304b;

    /* renamed from: c, reason: collision with root package name */
    public long f25305c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f25306d;

    public static E7 a(Context context, Executor executor) {
        String[] strArr = f25302e;
        E7 e72 = new E7();
        e72.f25303a = 0L;
        e72.f25304b = 0L;
        e72.f25305c = -1L;
        e72.f25306d = false;
        if (Build.VERSION.SDK_INT >= 30) {
            try {
                ((AppOpsManager) context.getSystemService("appops")).startWatchingActive(strArr, executor, new D7(e72));
            } catch (IllegalArgumentException | NoSuchMethodError unused) {
            }
        }
        return e72;
    }
}
