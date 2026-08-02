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
import r2.C4906k;
import w2.HandlerC5139A;

/* loaded from: classes2.dex */
public final class Ur implements Ps {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28794a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f28795b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f28796c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f28797d;

    public /* synthetic */ Ur(int i, Object obj, Object obj2, Object obj3) {
        this.f28794a = i;
        this.f28795b = obj;
        this.f28796c = obj2;
        this.f28797d = obj3;
    }

    @Override // com.google.android.gms.internal.ads.Ps
    public final P3.a c() {
        String str;
        String str2;
        String str3;
        String str4;
        InstallSourceInfo installSourceInfo;
        String initiatingPackageName;
        String str5 = null;
        Object obj = this.f28795b;
        Object obj2 = this.f28797d;
        Object obj3 = this.f28796c;
        switch (this.f28794a) {
            case 0:
                RD rd = (RD) obj3;
                P3.a t6 = QC.t((P3.a) obj, C2576Fi.i, rd);
                if (((Integer) s2.r.f40506e.f40509c.a(AbstractC3592ma.Vd)).intValue() > 0) {
                    t6 = QC.s(t6, ((Integer) r4.f40509c.a(r1)).intValue(), TimeUnit.MILLISECONDS, (ScheduledExecutorService) obj2);
                }
                return QC.r(t6, Throwable.class, C2576Fi.f25615h, rd);
            case 1:
                return ((C3383ig) obj).b(new CallableC3572m7(11, this));
            case 2:
                Context context = (Context) obj2;
                String str6 = ((ApplicationInfo) obj).packageName;
                PackageInfo packageInfo = (PackageInfo) obj3;
                Integer valueOf = packageInfo == null ? null : Integer.valueOf(packageInfo.versionCode);
                String str7 = packageInfo == null ? null : packageInfo.versionName;
                try {
                    HandlerC5139A handlerC5139A = w2.D.f41627l;
                    Context context2 = X2.b.a(context).f60u;
                    str = String.valueOf(context2.getPackageManager().getApplicationLabel(context2.getPackageManager().getApplicationInfo(str6, 0)));
                } catch (PackageManager.NameNotFoundException unused) {
                    str = null;
                }
                if (Build.VERSION.SDK_INT >= 30) {
                    if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.ke)).booleanValue()) {
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
                                    w2.z.k("No installing package name found");
                                    str4 = null;
                                }
                                initiatingPackageName = installSourceInfo.getInitiatingPackageName();
                                try {
                                } catch (PackageManager.NameNotFoundException e10) {
                                    e = e10;
                                    str5 = initiatingPackageName;
                                    C4906k.f40186C.f40196h.d("PackageInfoSignalSource.getInstallSourceInfo", e);
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
                            w2.z.k("No initiating package name found");
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
                return ((C3383ig) obj3).b(new CallableC3572m7(25, this));
            default:
                C3324ha c3324ha = AbstractC3592ma.f32862N3;
                s2.r rVar = s2.r.f40506e;
                if (((Boolean) rVar.f40509c.a(c3324ha)).booleanValue()) {
                    if (((Boolean) rVar.f40509c.a(AbstractC3592ma.f32906S3)).booleanValue()) {
                        C3383ig c3383ig = (C3383ig) obj3;
                        P3.a t9 = QC.t(AbstractC2991bG.b(com.bumptech.glide.d.r(null)), C2576Fi.f25618l, c3383ig);
                        if (((Boolean) AbstractC2551Ea.f25382a.r()).booleanValue()) {
                            t9 = QC.s(t9, ((Long) AbstractC2551Ea.f25383b.r()).longValue(), TimeUnit.MILLISECONDS, (ScheduledExecutorService) obj2);
                        }
                        return QC.q(t9, Exception.class, new C2742Pe(5, this), c3383ig);
                    }
                }
                return QC.c(new C3288gs(str5, -1, 2));
        }
    }

    @Override // com.google.android.gms.internal.ads.Ps
    public final int f() {
        switch (this.f28794a) {
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

    public Ur(C3061cg c3061cg, ScheduledExecutorService scheduledExecutorService, C3383ig c3383ig) {
        this.f28794a = 4;
        this.f28795b = c3061cg;
        this.f28797d = scheduledExecutorService;
        this.f28796c = c3383ig;
    }
}
