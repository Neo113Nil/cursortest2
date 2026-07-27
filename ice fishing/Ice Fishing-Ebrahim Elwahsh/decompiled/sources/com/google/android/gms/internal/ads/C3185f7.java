package com.google.android.gms.internal.ads;

import android.os.ConditionVariable;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Random;

/* renamed from: com.google.android.gms.internal.ads.f7, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3185f7 {

    /* renamed from: c, reason: collision with root package name */
    public static final ConditionVariable f30624c = new ConditionVariable();

    /* renamed from: d, reason: collision with root package name */
    public static volatile C3119dx f30625d = null;

    /* renamed from: e, reason: collision with root package name */
    public static volatile Random f30626e = null;

    /* renamed from: a, reason: collision with root package name */
    public final C4101w7 f30627a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Boolean f30628b;

    public C3185f7(C4101w7 c4101w7) {
        this.f30627a = c4101w7;
        c4101w7.f34930b.execute(new RunnableC3068d(this));
    }

    public final void a(int i, int i4, long j9, String str, Exception exc) {
        try {
            f30624c.block();
            if (!this.f30628b.booleanValue() || f30625d == null) {
                return;
            }
            C3347i6 A8 = C3561m6.A();
            String packageName = this.f30627a.f34929a.getPackageName();
            A8.h();
            ((C3561m6) A8.f30000u).B(packageName);
            A8.h();
            ((C3561m6) A8.f30000u).C(j9);
            if (str != null) {
                A8.h();
                ((C3561m6) A8.f30000u).F(str);
            }
            if (exc != null) {
                StringWriter stringWriter = new StringWriter();
                exc.printStackTrace(new PrintWriter(stringWriter));
                String stringWriter2 = stringWriter.toString();
                A8.h();
                ((C3561m6) A8.f30000u).D(stringWriter2);
                String name = exc.getClass().getName();
                A8.h();
                ((C3561m6) A8.f30000u).E(name);
            }
            C3119dx c3119dx = f30625d;
            byte[] b9 = ((C3561m6) A8.j()).b();
            c3119dx.getClass();
            F3.q qVar = new F3.q(c3119dx, b9);
            qVar.f1060b = i;
            if (i4 != -1) {
                qVar.f1059a = i4;
            }
            qVar.b();
        } catch (Exception unused) {
        }
    }
}
