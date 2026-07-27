package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.DisplayMetrics;
import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.bi, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2996bi implements InterfaceC4063vN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29550a;

    /* renamed from: b, reason: collision with root package name */
    public final C4117wN f29551b;

    public /* synthetic */ C2996bi(C4117wN c4117wN, int i) {
        this.f29550a = i;
        this.f29551b = c4117wN;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4279zN
    public final Object d() {
        SD xd;
        switch (this.f29550a) {
            case 0:
                C3214fi c3214fi = (C3214fi) this.f29551b.f34977a;
                AbstractC3137eE.h(c3214fi);
                return c3214fi;
            case 1:
                return new C3562m7(21, (C3584mc) this.f29551b.f34977a);
            case 2:
                return new C2478Aq(2, (C3644ni) this.f29551b.f34977a);
            case 3:
                return new Or(3, (C3924st) this.f29551b.f34977a);
            case 4:
                return new Ps((Ct) this.f29551b.f34977a);
            case 5:
                File dir = ((Context) this.f29551b.f34977a).getDir("yqzdkcache", 0);
                AbstractC3137eE.h(dir);
                return dir;
            case 6:
                ExecutorService executorService = (ExecutorService) this.f29551b.f34977a;
                if (executorService instanceof SD) {
                    xd = (SD) executorService;
                } else {
                    xd = executorService instanceof ScheduledExecutorService ? new XD((ScheduledExecutorService) executorService) : new C3157eg(executorService);
                }
                AbstractC3137eE.h(xd);
                return xd;
            case 7:
                return new Ay((ExecutorService) this.f29551b.f34977a);
            default:
                DisplayMetrics displayMetrics = ((Context) this.f29551b.f34977a).getResources().getDisplayMetrics();
                AbstractC3137eE.h(displayMetrics);
                return displayMetrics;
        }
    }
}
