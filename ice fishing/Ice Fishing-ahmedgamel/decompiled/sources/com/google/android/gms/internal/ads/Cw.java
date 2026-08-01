package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public class Cw {

    /* renamed from: e, reason: collision with root package name */
    public static volatile int f24272e = 1;

    /* renamed from: a, reason: collision with root package name */
    public final Context f24273a;

    /* renamed from: b, reason: collision with root package name */
    public final ExecutorService f24274b;

    /* renamed from: c, reason: collision with root package name */
    public final j3.m f24275c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f24276d;

    public Cw(Context context, ExecutorService executorService, j3.m mVar, boolean z3) {
        this.f24273a = context;
        this.f24274b = executorService;
        this.f24275c = mVar;
        this.f24276d = z3;
    }

    public static Cw a(Context context, ExecutorService executorService, boolean z3) {
        j3.h hVar = new j3.h();
        if (z3) {
            executorService.execute(new RunnableC3048cq(17, context, hVar));
        } else {
            executorService.execute(new RunnableC3807qw(2, hVar));
        }
        return new Cw(context, executorService, hVar.f38358a, z3);
    }

    public void b(int i, long j6) {
        e(i, j6, null, null, null);
    }

    public void c(int i, long j6, Exception exc) {
        e(i, j6, exc, null, null);
    }

    public void d(int i, String str) {
        e(i, 0L, null, null, str);
    }

    public final j3.m e(int i, long j6, Exception exc, String str, String str2) {
        if (!this.f24276d) {
            return this.f24275c.d(this.f24274b, C3586mr.f32603G);
        }
        Context context = this.f24273a;
        C3548m6 A9 = C3710p6.A();
        String packageName = context.getPackageName();
        A9.h();
        ((C3710p6) A9.f27721u).B(packageName);
        A9.h();
        ((C3710p6) A9.f27721u).C(j6);
        int i6 = f24272e;
        A9.h();
        ((C3710p6) A9.f27721u).H(i6);
        if (exc != null) {
            Object obj = AbstractC3391jB.f31212a;
            StringWriter stringWriter = new StringWriter();
            exc.printStackTrace(new PrintWriter(stringWriter));
            String stringWriter2 = stringWriter.toString();
            A9.h();
            ((C3710p6) A9.f27721u).D(stringWriter2);
            String name = exc.getClass().getName();
            A9.h();
            ((C3710p6) A9.f27721u).E(name);
        }
        if (str2 != null) {
            A9.h();
            ((C3710p6) A9.f27721u).F(str2);
        }
        if (str != null) {
            A9.h();
            ((C3710p6) A9.f27721u).G(str);
        }
        return this.f24275c.d(this.f24274b, new G1.a(A9, i, 11));
    }
}
