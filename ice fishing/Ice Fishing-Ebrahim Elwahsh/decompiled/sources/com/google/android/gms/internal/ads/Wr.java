package com.google.android.gms.internal.ads;

import a.AbstractC0415a;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.InstallSourceInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class Wr implements Rs {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28479a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f28480b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f28481c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f28482d;

    public Wr(C2892Zf c2892Zf, ScheduledExecutorService scheduledExecutorService, C3157eg c3157eg) {
        this.f28479a = 4;
        this.f28480b = c2892Zf;
        this.f28482d = scheduledExecutorService;
        this.f28481c = c3157eg;
    }

    @Override // com.google.android.gms.internal.ads.Rs
    public final J3.a a() {
        String str;
        String str2;
        String str3;
        String str4;
        InstallSourceInfo installSourceInfo;
        String initiatingPackageName;
        String str5 = null;
        Object obj = this.f28480b;
        Object obj2 = this.f28482d;
        Object obj3 = this.f28481c;
        switch (this.f28479a) {
            case 0:
                SD sd = (SD) obj3;
                J3.a y6 = C3686oN.y((J3.a) obj, C2538Ei.i, sd);
                if (((Integer) q2.r.f40116e.f40119c.a(AbstractC3368ia.Vd)).intValue() > 0) {
                    y6 = C3686oN.w(y6, ((Integer) r4.f40119c.a(r1)).intValue(), TimeUnit.MILLISECONDS, (ScheduledExecutorService) obj2);
                }
                return C3686oN.v(y6, Throwable.class, C2538Ei.f24796h, sd);
            case 1:
                return ((C3157eg) obj).b(new CallableC3454k7(11, this));
            case 2:
                Context context = (Context) obj2;
                String str6 = ((ApplicationInfo) obj).packageName;
                PackageInfo packageInfo = (PackageInfo) obj3;
                Integer valueOf = packageInfo == null ? null : Integer.valueOf(packageInfo.versionCode);
                String str7 = packageInfo == null ? null : packageInfo.versionName;
                try {
                    t2.D d2 = t2.G.f40858l;
                    Context context2 = U2.c.a(context).f3280n;
                    str = String.valueOf(context2.getPackageManager().getApplicationLabel(context2.getPackageManager().getApplicationInfo(str6, 0)));
                } catch (PackageManager.NameNotFoundException unused) {
                    str = null;
                }
                if (Build.VERSION.SDK_INT >= 30) {
                    if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.ke)).booleanValue()) {
                        try {
                            installSourceInfo = context.getPackageManager().getInstallSourceInfo(str6);
                        } catch (PackageManager.NameNotFoundException e6) {
                            e = e6;
                            str4 = null;
                        }
                        if (installSourceInfo != null) {
                            str4 = installSourceInfo.getInstallingPackageName();
                            try {
                                if (TextUtils.isEmpty(str4)) {
                                    t2.C.k("No installing package name found");
                                    str4 = null;
                                }
                                initiatingPackageName = installSourceInfo.getInitiatingPackageName();
                                try {
                                } catch (PackageManager.NameNotFoundException e9) {
                                    e = e9;
                                    str5 = initiatingPackageName;
                                    p2.j.f39798C.f39808h.d("PackageInfoSignalSource.getInstallSourceInfo", e);
                                    str3 = str5;
                                    str2 = str4;
                                    return C3686oN.c(new Gs(str6, valueOf, str7, str, str2, str3));
                                }
                            } catch (PackageManager.NameNotFoundException e10) {
                                e = e10;
                            }
                            if (!TextUtils.isEmpty(initiatingPackageName)) {
                                str2 = str4;
                                str3 = initiatingPackageName;
                                return C3686oN.c(new Gs(str6, valueOf, str7, str, str2, str3));
                            }
                            t2.C.k("No initiating package name found");
                            str3 = str5;
                            str2 = str4;
                            return C3686oN.c(new Gs(str6, valueOf, str7, str, str2, str3));
                        }
                    }
                }
                str2 = null;
                str3 = null;
                return C3686oN.c(new Gs(str6, valueOf, str7, str, str2, str3));
            case 3:
                return ((C3157eg) obj3).b(new CallableC3454k7(25, this));
            default:
                C3151ea c3151ea = AbstractC3368ia.f31504N3;
                q2.r rVar = q2.r.f40116e;
                if (((Boolean) rVar.f40119c.a(c3151ea)).booleanValue()) {
                    if (((Boolean) rVar.f40119c.a(AbstractC3368ia.f31547S3)).booleanValue()) {
                        C3157eg c3157eg = (C3157eg) obj3;
                        J3.a y8 = C3686oN.y(AbstractC2655Lg.e(AbstractC0415a.r(null)), C2538Ei.f24799l, c3157eg);
                        if (((Boolean) AbstractC2462Aa.f23874a.r()).booleanValue()) {
                            y8 = C3686oN.w(y8, ((Long) AbstractC2462Aa.f23875b.r()).longValue(), TimeUnit.MILLISECONDS, (ScheduledExecutorService) obj2);
                        }
                        return C3686oN.u(y8, Exception.class, new C2670Me(5, this), c3157eg);
                    }
                }
                return C3686oN.c(new C3438js(null, -1, 2));
        }
    }

    @Override // com.google.android.gms.internal.ads.Rs
    public final int d() {
        switch (this.f28479a) {
            case 0:
                return 6;
            case 1:
                return 9;
            case 2:
                return 29;
            case 3:
                return 34;
            default:
                return 43;
        }
    }

    public /* synthetic */ Wr(Object obj, Object obj2, Object obj3, int i) {
        this.f28479a = i;
        this.f28480b = obj;
        this.f28481c = obj2;
        this.f28482d = obj3;
    }
}
