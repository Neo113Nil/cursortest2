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
public final class C3750pt implements InterfaceC3297hN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33152a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final C3351iN f33153b;

    /* renamed from: c, reason: collision with root package name */
    public final C3351iN f33154c;

    /* renamed from: d, reason: collision with root package name */
    public final C3243gN f33155d;

    /* renamed from: e, reason: collision with root package name */
    public final C3243gN f33156e;

    /* renamed from: f, reason: collision with root package name */
    public final C3243gN f33157f;

    /* renamed from: g, reason: collision with root package name */
    public final C3243gN f33158g;

    /* renamed from: h, reason: collision with root package name */
    public final C3351iN f33159h;

    public C3750pt(C3351iN c3351iN, C3243gN c3243gN, C3351iN c3351iN2, C3351iN c3351iN3, C3243gN c3243gN2, C3243gN c3243gN3, C3243gN c3243gN4) {
        this.f33153b = c3351iN;
        this.f33155d = c3243gN;
        this.f33154c = c3351iN2;
        this.f33159h = c3351iN3;
        this.f33156e = c3243gN2;
        this.f33157f = c3243gN3;
        this.f33158g = c3243gN4;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3511lN
    public final Object f() {
        switch (this.f33152a) {
            case 0:
                return new C3696ot((Context) this.f33153b.f31039a, (Executor) this.f33155d.f(), (q2.f1) this.f33154c.f31039a, (C3309hi) this.f33159h.f31039a, (Dr) this.f33156e.f(), (Fr) this.f33157f.f(), new C2999bu(), (C3418jl) this.f33158g.f());
            default:
                Context context = (Context) this.f33153b.f31039a;
                ExecutorService executorService = (ExecutorService) this.f33154c.f31039a;
                Xy xy = (Xy) this.f33155d.f();
                C3164ez c3164ez = (C3164ez) this.f33156e.f();
                File file = (File) this.f33157f.f();
                C3983uA c3983uA = (C3983uA) this.f33158g.f();
                C2949ay c2949ay = (C2949ay) this.f33159h.f31039a;
                XB i = XB.i(new C3272gz("uhXgNuGSyd8UZxNVLle6+R5FVDrGs3ztJxFRccM25tfzP1xuUPcwCU9TKSVvh2k9", "qKJ/azzJVrSI96ukKyGiETTBFTHn9OIRjLO/t8+zHyA=", Context.class), new C3272gz("yVK2BtjhkWiqPWfXVe7pCdqpfz2Ps9CcWbBtlKTt4FN37/tD76f0HDGVwAjTsvKH", "Fo5nkU2nfGSO+g2iGIxI5+P04k6pQ8lbcFZjpNOd5oc=", new Class[0]), new C3272gz("lgB22o3+xtO6b1PB1kHO8Agbi+6HbLXaRU20SARWIrq6m129Ofvaya/yhX25r56V", "Rqk2tq5zRAYapYluu1wAppyX64RE9M13E2H+pIaATIY=", NetworkCapabilities.class, Long.class, Long.class), new C3272gz("Sg9wh/uRZZt11trI0/ArQR457JKvhvXPZq07aU70olp83YOM+BSyiAIXktC8LJHR", "EzsZPxHde//8PaxXqjETRoZ/+tCf60bKZdwrCpNCQLk=", String.class), new C3272gz("1lfY2PujDI83L37TUM18aHWHBqDSAahgyhidgEksUB/zDEol7S6B03Ggb0FWJZjW", "FoX2EoxLxkVC+ircfmZ3nlw9JLpL8iQtQvisY+wPqkA=", View.class, Activity.class), new C3272gz("1WgZ3mEd4p+W8SVE9tx/naUqatZo+XVfLsKM/o+CSVYyRyaBWFiQiHaYs+1ib01V", "yEc5jsed/vAVK/yCIwJWSyA9BW0RHK/xnzaQgPM8Vgw=", DisplayMetrics.class, View.class), new C3272gz("FRbH3YSkWLoeHfFsbLmVPzOa63aS7qRNcxlL25CUBAPaDEl/9m5xoZHvOSUnXb3F", "n3MzKzWgNLpU97/XE2w+GCw7DhFJXqnLmao7nSZ1jSU=", Long[].class, Integer.class), new C3272gz("50+sX4d44jerXZ0t37Z07Ss5Y2LVKA0u1WWlTsyrM+njWBpcjf8xU2ZOd5yoshWp", "IaakTOOFGOw3T0IOJ/LBUMRFnsvXDEiR+LxXdy42JcU=", new Class[0]), new C3272gz("+PCjsR8uUrE+ODYObgFJ15LzzbP31PRWxMEYlQ7sSRGBdHPl6GvLcY6T0RM0sryv", "LK6oYs0YHGkrF/9CgiECppIXTefV1s/9lm3/dqGO06I=", Context.class, Integer.class), new C3272gz("VfejF6jLqZSis5lDsrO62jUDAXJqP6cPz4mgjtZND5tZ2P5VWHtedQvP3pauMLAi", "2mDHoFGLT7ybGaRwjjkTGPAVzRPlkIteOrAkiSTAkLw=", Integer.class, Context.class, Boolean.class), new C3272gz("SZhD94EfxCH1aUaqL3kliCVXsuzYhOJtOn/V0ec5JepY8dU6lMpt78s7q3QiFI+n", "9JUJL19Ne/lezLGl66/0Sq/KunPDyKseh4J4ncxdc50=", Context.class), new C3272gz("H0YdM17mgrrozxD0WVa3M40/jGgbp6xsWEqC8q+HAngxqz5clYs9XrZGt0ruoMVC", "vTRbdp+bvCvcqmoB2mkwDXNuKnz+mZ0QzFSaQEl2hgg=", Context.class), new C3272gz("yEN9KgeW2ShR+kJNMVm4gRcjBaCiP+NkfaG+4w0YdiFdjOQUuGzxN01qjMkIt53T", "+ZwABUDFslQ7udw7VsU5AeCjEmTqogfLUUw0gHzd544=", MotionEvent.class, DisplayMetrics.class), new C3272gz("ha9rMPg9+yg7CQJd8hulZYYnWyvcb9rIbXzM+WEcFYbGtaIOAjDJnYEoauGRuKjN", "nl2mD60ZrulhoIB3vhnGQRCpmcQlp+xDYCmCtO11lLQ=", MotionEvent.class, DisplayMetrics.class));
                AbstractC3341iD.j(i);
                return new C3218fz(context, executorService, xy, c3164ez, file, c3983uA, c2949ay.d0(), i);
        }
    }

    public C3750pt(C3351iN c3351iN, C3351iN c3351iN2, C3243gN c3243gN, C3243gN c3243gN2, C3243gN c3243gN3, C3243gN c3243gN4, C3351iN c3351iN3) {
        this.f33153b = c3351iN;
        this.f33154c = c3351iN2;
        this.f33155d = c3243gN;
        this.f33156e = c3243gN2;
        this.f33157f = c3243gN3;
        this.f33158g = c3243gN4;
        this.f33159h = c3351iN3;
    }
}
