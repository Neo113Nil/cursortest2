package com.google.android.gms.internal.ads;

import android.os.ConditionVariable;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Random;

/* renamed from: com.google.android.gms.internal.ads.h7, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3281h7 {

    /* renamed from: c, reason: collision with root package name */
    public static final ConditionVariable f30741c = new ConditionVariable();

    /* renamed from: d, reason: collision with root package name */
    public static volatile C3108dx f30742d = null;

    /* renamed from: e, reason: collision with root package name */
    public static volatile Random f30743e = null;

    /* renamed from: a, reason: collision with root package name */
    public final C4196y7 f30744a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Boolean f30745b;

    public C3281h7(C4196y7 c4196y7) {
        this.f30744a = c4196y7;
        c4196y7.f35096b.execute(new RunnableC3111e(this));
    }

    public final void a(int i, int i6, long j6, String str, Exception exc) {
        try {
            f30741c.block();
            if (!this.f30745b.booleanValue() || f30742d == null) {
                return;
            }
            C3548m6 A9 = C3710p6.A();
            String packageName = this.f30744a.f35095a.getPackageName();
            A9.h();
            ((C3710p6) A9.f27721u).B(packageName);
            A9.h();
            ((C3710p6) A9.f27721u).C(j6);
            if (str != null) {
                A9.h();
                ((C3710p6) A9.f27721u).F(str);
            }
            if (exc != null) {
                StringWriter stringWriter = new StringWriter();
                exc.printStackTrace(new PrintWriter(stringWriter));
                String stringWriter2 = stringWriter.toString();
                A9.h();
                ((C3710p6) A9.f27721u).D(stringWriter2);
                String name = exc.getClass().getName();
                A9.h();
                ((C3710p6) A9.f27721u).E(name);
            }
            C3108dx c3108dx = f30742d;
            byte[] b9 = ((C3710p6) A9.j()).b();
            c3108dx.getClass();
            H3.q qVar = new H3.q(c3108dx, b9);
            qVar.f1147b = i;
            if (i6 != -1) {
                qVar.f1146a = i6;
            }
            qVar.b();
        } catch (Exception unused) {
        }
    }
}
