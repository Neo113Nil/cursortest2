package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.DisplayMetrics;
import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.di, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3117di implements InterfaceC3320hN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30594a;

    /* renamed from: b, reason: collision with root package name */
    public final C3374iN f30595b;

    public /* synthetic */ C3117di(C3374iN c3374iN, int i) {
        this.f30594a = i;
        this.f30595b = c3374iN;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3534lN
    public final Object f() {
        RD wd;
        switch (this.f30594a) {
            case 0:
                C3332hi c3332hi = (C3332hi) this.f30595b.f31812a;
                AbstractC3364iD.j(c3332hi);
                return c3332hi;
            case 1:
                return new C3680o7(22, (C3917sc) this.f30595b.f31812a);
            case 2:
                return new C4201xq(2, (C3816qi) this.f30595b.f31812a);
            case 3:
                return new Lr(3, (C3880rt) this.f30595b.f31812a);
            case 4:
                return new Ns((Bt) this.f30595b.f31812a);
            case 5:
                File dir = ((Context) this.f30595b.f31812a).getDir("yqzdkcache", 0);
                AbstractC3364iD.j(dir);
                return dir;
            case 6:
                ExecutorService executorService = (ExecutorService) this.f30595b.f31812a;
                if (executorService instanceof RD) {
                    wd = (RD) executorService;
                } else {
                    wd = executorService instanceof ScheduledExecutorService ? new WD((ScheduledExecutorService) executorService) : new C3383ig(executorService);
                }
                AbstractC3364iD.j(wd);
                return wd;
            case 7:
                return new C4317zy((ExecutorService) this.f30595b.f31812a);
            default:
                DisplayMetrics displayMetrics = ((Context) this.f30595b.f31812a).getResources().getDisplayMetrics();
                AbstractC3364iD.j(displayMetrics);
                return displayMetrics;
        }
    }
}
