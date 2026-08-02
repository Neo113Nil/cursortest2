package com.google.android.gms.internal.ads;

import android.os.ConditionVariable;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Random;

/* renamed from: com.google.android.gms.internal.ads.h7, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3304h7 {

    /* renamed from: c, reason: collision with root package name */
    public static final ConditionVariable f31507c = new ConditionVariable();

    /* renamed from: d, reason: collision with root package name */
    public static volatile C3131dx f31508d = null;

    /* renamed from: e, reason: collision with root package name */
    public static volatile Random f31509e = null;

    /* renamed from: a, reason: collision with root package name */
    public final C4219y7 f31510a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Boolean f31511b;

    public C3304h7(C4219y7 c4219y7) {
        this.f31510a = c4219y7;
        c4219y7.f35882b.execute(new RunnableC3134e(this));
    }

    public final void a(int i, int i4, long j6, String str, Exception exc) {
        try {
            f31507c.block();
            if (!this.f31511b.booleanValue() || f31508d == null) {
                return;
            }
            C3571m6 A9 = C3733p6.A();
            String packageName = this.f31510a.f35881a.getPackageName();
            A9.h();
            ((C3733p6) A9.f28504u).B(packageName);
            A9.h();
            ((C3733p6) A9.f28504u).C(j6);
            if (str != null) {
                A9.h();
                ((C3733p6) A9.f28504u).F(str);
            }
            if (exc != null) {
                StringWriter stringWriter = new StringWriter();
                exc.printStackTrace(new PrintWriter(stringWriter));
                String stringWriter2 = stringWriter.toString();
                A9.h();
                ((C3733p6) A9.f28504u).D(stringWriter2);
                String name = exc.getClass().getName();
                A9.h();
                ((C3733p6) A9.f28504u).E(name);
            }
            C3131dx c3131dx = f31508d;
            byte[] b9 = ((C3733p6) A9.j()).b();
            c3131dx.getClass();
            J3.q qVar = new J3.q(c3131dx, b9);
            qVar.f1503b = i;
            if (i4 != -1) {
                qVar.f1502a = i4;
            }
            qVar.b();
        } catch (Exception unused) {
        }
    }
}
