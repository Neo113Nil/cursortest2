package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.DisplayMetrics;
import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.di, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3094di implements InterfaceC3297hN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29821a;

    /* renamed from: b, reason: collision with root package name */
    public final C3351iN f29822b;

    public /* synthetic */ C3094di(C3351iN c3351iN, int i) {
        this.f29821a = i;
        this.f29822b = c3351iN;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3511lN
    public final Object f() {
        RD wd;
        switch (this.f29821a) {
            case 0:
                C3309hi c3309hi = (C3309hi) this.f29822b.f31039a;
                AbstractC3341iD.j(c3309hi);
                return c3309hi;
            case 1:
                return new C3657o7(22, (C3894sc) this.f29822b.f31039a);
            case 2:
                return new C4178xq(2, (C3793qi) this.f29822b.f31039a);
            case 3:
                return new Lr(3, (C3857rt) this.f29822b.f31039a);
            case 4:
                return new Ns((Bt) this.f29822b.f31039a);
            case 5:
                File dir = ((Context) this.f29822b.f31039a).getDir("yqzdkcache", 0);
                AbstractC3341iD.j(dir);
                return dir;
            case 6:
                ExecutorService executorService = (ExecutorService) this.f29822b.f31039a;
                if (executorService instanceof RD) {
                    wd = (RD) executorService;
                } else {
                    wd = executorService instanceof ScheduledExecutorService ? new WD((ScheduledExecutorService) executorService) : new C3360ig(executorService);
                }
                AbstractC3341iD.j(wd);
                return wd;
            case 7:
                return new C4294zy((ExecutorService) this.f29822b.f31039a);
            default:
                DisplayMetrics displayMetrics = ((Context) this.f29822b.f31039a).getResources().getDisplayMetrics();
                AbstractC3341iD.j(displayMetrics);
                return displayMetrics;
        }
    }
}
