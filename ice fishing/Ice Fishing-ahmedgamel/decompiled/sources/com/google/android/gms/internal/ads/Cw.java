package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public class Cw {

    /* renamed from: e, reason: collision with root package name */
    public static volatile int f25017e = 1;

    /* renamed from: a, reason: collision with root package name */
    public final Context f25018a;

    /* renamed from: b, reason: collision with root package name */
    public final ExecutorService f25019b;

    /* renamed from: c, reason: collision with root package name */
    public final l3.m f25020c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f25021d;

    public Cw(Context context, ExecutorService executorService, l3.m mVar, boolean z6) {
        this.f25018a = context;
        this.f25019b = executorService;
        this.f25020c = mVar;
        this.f25021d = z6;
    }

    public static Cw a(Context context, ExecutorService executorService, boolean z6) {
        l3.h hVar = new l3.h();
        if (z6) {
            executorService.execute(new RunnableC3071cq(17, context, hVar));
        } else {
            executorService.execute(new RunnableC3830qw(2, hVar));
        }
        return new Cw(context, executorService, hVar.f38870a, z6);
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

    public final l3.m e(int i, long j6, Exception exc, String str, String str2) {
        if (!this.f25021d) {
            return this.f25020c.d(this.f25019b, C3609mr.f33381G);
        }
        Context context = this.f25018a;
        C3571m6 A9 = C3733p6.A();
        String packageName = context.getPackageName();
        A9.h();
        ((C3733p6) A9.f28504u).B(packageName);
        A9.h();
        ((C3733p6) A9.f28504u).C(j6);
        int i4 = f25017e;
        A9.h();
        ((C3733p6) A9.f28504u).H(i4);
        if (exc != null) {
            Object obj = AbstractC3414jB.f31999a;
            StringWriter stringWriter = new StringWriter();
            exc.printStackTrace(new PrintWriter(stringWriter));
            String stringWriter2 = stringWriter.toString();
            A9.h();
            ((C3733p6) A9.f28504u).D(stringWriter2);
            String name = exc.getClass().getName();
            A9.h();
            ((C3733p6) A9.f28504u).E(name);
        }
        if (str2 != null) {
            A9.h();
            ((C3733p6) A9.f28504u).F(str2);
        }
        if (str != null) {
            A9.h();
            ((C3733p6) A9.f28504u).G(str);
        }
        return this.f25020c.d(this.f25019b, new I1.a(A9, i, 11));
    }
}
