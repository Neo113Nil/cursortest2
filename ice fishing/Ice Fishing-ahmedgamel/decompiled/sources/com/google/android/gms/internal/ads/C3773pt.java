package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.NetworkCapabilities;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import java.io.File;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* renamed from: com.google.android.gms.internal.ads.pt, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3773pt implements InterfaceC3320hN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33938a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final C3374iN f33939b;

    /* renamed from: c, reason: collision with root package name */
    public final C3374iN f33940c;

    /* renamed from: d, reason: collision with root package name */
    public final C3266gN f33941d;

    /* renamed from: e, reason: collision with root package name */
    public final C3266gN f33942e;

    /* renamed from: f, reason: collision with root package name */
    public final C3266gN f33943f;

    /* renamed from: g, reason: collision with root package name */
    public final C3266gN f33944g;

    /* renamed from: h, reason: collision with root package name */
    public final C3374iN f33945h;

    public C3773pt(C3374iN c3374iN, C3266gN c3266gN, C3374iN c3374iN2, C3374iN c3374iN3, C3266gN c3266gN2, C3266gN c3266gN3, C3266gN c3266gN4) {
        this.f33939b = c3374iN;
        this.f33941d = c3266gN;
        this.f33940c = c3374iN2;
        this.f33945h = c3374iN3;
        this.f33942e = c3266gN2;
        this.f33943f = c3266gN3;
        this.f33944g = c3266gN4;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3534lN
    public final Object f() {
        switch (this.f33938a) {
            case 0:
                return new C3719ot((Context) this.f33939b.f31812a, (Executor) this.f33941d.f(), (s2.f1) this.f33940c.f31812a, (C3332hi) this.f33945h.f31812a, (Dr) this.f33942e.f(), (Fr) this.f33943f.f(), new C3022bu(), (C3441jl) this.f33944g.f());
            default:
                Context context = (Context) this.f33939b.f31812a;
                ExecutorService executorService = (ExecutorService) this.f33940c.f31812a;
                Xy xy = (Xy) this.f33941d.f();
                C3187ez c3187ez = (C3187ez) this.f33942e.f();
                File file = (File) this.f33943f.f();
                C4006uA c4006uA = (C4006uA) this.f33944g.f();
                C2972ay c2972ay = (C2972ay) this.f33945h.f31812a;
                XB i = XB.i(new C3295gz("uhXgNuGSyd8UZxNVLle6+R5FVDrGs3ztJxFRccM25tfzP1xuUPcwCU9TKSVvh2k9", "qKJ/azzJVrSI96ukKyGiETTBFTHn9OIRjLO/t8+zHyA=", Context.class), new C3295gz("yVK2BtjhkWiqPWfXVe7pCdqpfz2Ps9CcWbBtlKTt4FN37/tD76f0HDGVwAjTsvKH", "Fo5nkU2nfGSO+g2iGIxI5+P04k6pQ8lbcFZjpNOd5oc=", new Class[0]), new C3295gz("lgB22o3+xtO6b1PB1kHO8Agbi+6HbLXaRU20SARWIrq6m129Ofvaya/yhX25r56V", "Rqk2tq5zRAYapYluu1wAppyX64RE9M13E2H+pIaATIY=", NetworkCapabilities.class, Long.class, Long.class), new C3295gz("Sg9wh/uRZZt11trI0/ArQR457JKvhvXPZq07aU70olp83YOM+BSyiAIXktC8LJHR", "EzsZPxHde//8PaxXqjETRoZ/+tCf60bKZdwrCpNCQLk=", String.class), new C3295gz("1lfY2PujDI83L37TUM18aHWHBqDSAahgyhidgEksUB/zDEol7S6B03Ggb0FWJZjW", "FoX2EoxLxkVC+ircfmZ3nlw9JLpL8iQtQvisY+wPqkA=", View.class, Activity.class), new C3295gz("1WgZ3mEd4p+W8SVE9tx/naUqatZo+XVfLsKM/o+CSVYyRyaBWFiQiHaYs+1ib01V", "yEc5jsed/vAVK/yCIwJWSyA9BW0RHK/xnzaQgPM8Vgw=", DisplayMetrics.class, View.class), new C3295gz("FRbH3YSkWLoeHfFsbLmVPzOa63aS7qRNcxlL25CUBAPaDEl/9m5xoZHvOSUnXb3F", "n3MzKzWgNLpU97/XE2w+GCw7DhFJXqnLmao7nSZ1jSU=", Long[].class, Integer.class), new C3295gz("50+sX4d44jerXZ0t37Z07Ss5Y2LVKA0u1WWlTsyrM+njWBpcjf8xU2ZOd5yoshWp", "IaakTOOFGOw3T0IOJ/LBUMRFnsvXDEiR+LxXdy42JcU=", new Class[0]), new C3295gz("+PCjsR8uUrE+ODYObgFJ15LzzbP31PRWxMEYlQ7sSRGBdHPl6GvLcY6T0RM0sryv", "LK6oYs0YHGkrF/9CgiECppIXTefV1s/9lm3/dqGO06I=", Context.class, Integer.class), new C3295gz("VfejF6jLqZSis5lDsrO62jUDAXJqP6cPz4mgjtZND5tZ2P5VWHtedQvP3pauMLAi", "2mDHoFGLT7ybGaRwjjkTGPAVzRPlkIteOrAkiSTAkLw=", Integer.class, Context.class, Boolean.class), new C3295gz("SZhD94EfxCH1aUaqL3kliCVXsuzYhOJtOn/V0ec5JepY8dU6lMpt78s7q3QiFI+n", "9JUJL19Ne/lezLGl66/0Sq/KunPDyKseh4J4ncxdc50=", Context.class), new C3295gz("H0YdM17mgrrozxD0WVa3M40/jGgbp6xsWEqC8q+HAngxqz5clYs9XrZGt0ruoMVC", "vTRbdp+bvCvcqmoB2mkwDXNuKnz+mZ0QzFSaQEl2hgg=", Context.class), new C3295gz("yEN9KgeW2ShR+kJNMVm4gRcjBaCiP+NkfaG+4w0YdiFdjOQUuGzxN01qjMkIt53T", "+ZwABUDFslQ7udw7VsU5AeCjEmTqogfLUUw0gHzd544=", MotionEvent.class, DisplayMetrics.class), new C3295gz("ha9rMPg9+yg7CQJd8hulZYYnWyvcb9rIbXzM+WEcFYbGtaIOAjDJnYEoauGRuKjN", "nl2mD60ZrulhoIB3vhnGQRCpmcQlp+xDYCmCtO11lLQ=", MotionEvent.class, DisplayMetrics.class));
                AbstractC3364iD.j(i);
                return new C3241fz(context, executorService, xy, c3187ez, file, c4006uA, c2972ay.d0(), i);
        }
    }

    public C3773pt(C3374iN c3374iN, C3374iN c3374iN2, C3266gN c3266gN, C3266gN c3266gN2, C3266gN c3266gN3, C3266gN c3266gN4, C3374iN c3374iN3) {
        this.f33939b = c3374iN;
        this.f33940c = c3374iN2;
        this.f33941d = c3266gN;
        this.f33942e = c3266gN2;
        this.f33943f = c3266gN3;
        this.f33944g = c3266gN4;
        this.f33945h = c3374iN3;
    }
}
