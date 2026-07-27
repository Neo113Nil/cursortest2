package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.InstallSourceInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import p2.C4835j;
import u2.HandlerC5068A;

/* loaded from: classes2.dex */
public final class Ur implements Ps {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27997a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f27998b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f27999c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f28000d;

    public /* synthetic */ Ur(int i, Object obj, Object obj2, Object obj3) {
        this.f27997a = i;
        this.f27998b = obj;
        this.f27999c = obj2;
        this.f28000d = obj3;
    }

    @Override // com.google.android.gms.internal.ads.Ps
    public final N3.a c() {
        String str;
        String str2;
        String str3;
        String str4;
        InstallSourceInfo installSourceInfo;
        String initiatingPackageName;
        String str5 = null;
        Object obj = this.f27998b;
        Object obj2 = this.f28000d;
        Object obj3 = this.f27999c;
        switch (this.f27997a) {
            case 0:
                RD rd = (RD) obj3;
                N3.a t6 = QC.t((N3.a) obj, C2556Fi.i, rd);
                if (((Integer) q2.r.f40204e.f40207c.a(AbstractC3569ma.Vd)).intValue() > 0) {
                    t6 = QC.s(t6, ((Integer) r4.f40207c.a(r1)).intValue(), TimeUnit.MILLISECONDS, (ScheduledExecutorService) obj2);
                }
                return QC.r(t6, Throwable.class, C2556Fi.f24826h, rd);
            case 1:
                return ((C3360ig) obj).b(new CallableC3549m7(11, this));
            case 2:
                Context context = (Context) obj2;
                String str6 = ((ApplicationInfo) obj).packageName;
                PackageInfo packageInfo = (PackageInfo) obj3;
                Integer valueOf = packageInfo == null ? null : Integer.valueOf(packageInfo.versionCode);
                String str7 = packageInfo == null ? null : packageInfo.versionName;
                try {
                    HandlerC5068A handlerC5068A = u2.D.f41234l;
                    Context context2 = V2.c.a(context).f3273u;
                    str = String.valueOf(context2.getPackageManager().getApplicationLabel(context2.getPackageManager().getApplicationInfo(str6, 0)));
                } catch (PackageManager.NameNotFoundException unused) {
                    str = null;
                }
                if (Build.VERSION.SDK_INT >= 30) {
                    if (((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.ke)).booleanValue()) {
                        try {
                            installSourceInfo = context.getPackageManager().getInstallSourceInfo(str6);
                        } catch (PackageManager.NameNotFoundException e9) {
                            e = e9;
                            str4 = null;
                        }
                        if (installSourceInfo != null) {
                            str4 = installSourceInfo.getInstallingPackageName();
                            try {
                                if (TextUtils.isEmpty(str4)) {
                                    u2.z.k("No installing package name found");
                                    str4 = null;
                                }
                                initiatingPackageName = installSourceInfo.getInitiatingPackageName();
                                try {
                                } catch (PackageManager.NameNotFoundException e10) {
                                    e = e10;
                                    str5 = initiatingPackageName;
                                    C4835j.f39730C.f39740h.d("PackageInfoSignalSource.getInstallSourceInfo", e);
                                    str3 = str5;
                                    str2 = str4;
                                    return QC.c(new Es(str6, valueOf, str7, str, str2, str3));
                                }
                            } catch (PackageManager.NameNotFoundException e11) {
                                e = e11;
                            }
                            if (!TextUtils.isEmpty(initiatingPackageName)) {
                                str2 = str4;
                                str3 = initiatingPackageName;
                                return QC.c(new Es(str6, valueOf, str7, str, str2, str3));
                            }
                            u2.z.k("No initiating package name found");
                            str3 = str5;
                            str2 = str4;
                            return QC.c(new Es(str6, valueOf, str7, str, str2, str3));
                        }
                    }
                }
                str2 = null;
                str3 = null;
                return QC.c(new Es(str6, valueOf, str7, str, str2, str3));
            case 3:
                return ((C3360ig) obj3).b(new CallableC3549m7(25, this));
            default:
                C3301ha c3301ha = AbstractC3569ma.f32083N3;
                q2.r rVar = q2.r.f40204e;
                if (((Boolean) rVar.f40207c.a(c3301ha)).booleanValue()) {
                    if (((Boolean) rVar.f40207c.a(AbstractC3569ma.f32127S3)).booleanValue()) {
                        C3360ig c3360ig = (C3360ig) obj3;
                        N3.a t9 = QC.t(AbstractC2968bG.b(S0.f.i(null)), C2556Fi.f24829l, c3360ig);
                        if (((Boolean) AbstractC2531Ea.f24629a.r()).booleanValue()) {
                            t9 = QC.s(t9, ((Long) AbstractC2531Ea.f24630b.r()).longValue(), TimeUnit.MILLISECONDS, (ScheduledExecutorService) obj2);
                        }
                        return QC.q(t9, Exception.class, new C2722Pe(5, this), c3360ig);
                    }
                }
                return QC.c(new C3265gs(str5, -1, 2));
        }
    }

    @Override // com.google.android.gms.internal.ads.Ps
    public final int f() {
        switch (this.f27997a) {
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

    public Ur(C3038cg c3038cg, ScheduledExecutorService scheduledExecutorService, C3360ig c3360ig) {
        this.f27997a = 4;
        this.f27998b = c3038cg;
        this.f28000d = scheduledExecutorService;
        this.f27999c = c3360ig;
    }
}
