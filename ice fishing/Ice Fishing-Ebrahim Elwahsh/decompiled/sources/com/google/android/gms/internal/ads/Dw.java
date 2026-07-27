package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public class Dw {

    /* renamed from: e, reason: collision with root package name */
    public static volatile int f24605e = 1;

    /* renamed from: a, reason: collision with root package name */
    public final Context f24606a;

    /* renamed from: b, reason: collision with root package name */
    public final ExecutorService f24607b;

    /* renamed from: c, reason: collision with root package name */
    public final h3.n f24608c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f24609d;

    public Dw(Context context, ExecutorService executorService, h3.n nVar, boolean z8) {
        this.f24606a = context;
        this.f24607b = executorService;
        this.f24608c = nVar;
        this.f24609d = z8;
    }

    public static Dw a(Context context, ExecutorService executorService, boolean z8) {
        h3.h hVar = new h3.h();
        if (z8) {
            executorService.execute(new RunnableC3329hp(context, hVar));
        } else {
            executorService.execute(new RunnableC3873rw(2, hVar));
        }
        return new Dw(context, executorService, hVar.f38206a, z8);
    }

    public void b(int i, long j9) {
        e(i, j9, null, null, null);
    }

    public void c(int i, long j9, Exception exc) {
        e(i, j9, exc, null, null);
    }

    public void d(int i, String str) {
        e(i, 0L, null, null, str);
    }

    public final h3.n e(int i, long j9, Exception exc, String str, String str2) {
        if (!this.f24609d) {
            return this.f24608c.d(this.f24607b, Dr.f24581F);
        }
        Context context = this.f24606a;
        C3347i6 A8 = C3561m6.A();
        String packageName = context.getPackageName();
        A8.h();
        ((C3561m6) A8.f30000u).B(packageName);
        A8.h();
        ((C3561m6) A8.f30000u).C(j9);
        int i4 = f24605e;
        A8.h();
        ((C3561m6) A8.f30000u).H(i4);
        if (exc != null) {
            Object obj = AbstractC3566mB.f32671a;
            StringWriter stringWriter = new StringWriter();
            exc.printStackTrace(new PrintWriter(stringWriter));
            String stringWriter2 = stringWriter.toString();
            A8.h();
            ((C3561m6) A8.f30000u).D(stringWriter2);
            String name = exc.getClass().getName();
            A8.h();
            ((C3561m6) A8.f30000u).E(name);
        }
        if (str2 != null) {
            A8.h();
            ((C3561m6) A8.f30000u).F(str2);
        }
        if (str != null) {
            A8.h();
            ((C3561m6) A8.f30000u).G(str);
        }
        return this.f24608c.d(this.f24607b, new G1.a(A8, i, 13));
    }
}
