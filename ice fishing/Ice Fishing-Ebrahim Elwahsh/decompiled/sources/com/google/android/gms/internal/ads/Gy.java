package com.google.android.gms.internal.ads;

import android.app.UiModeManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Locale;

/* loaded from: classes2.dex */
public final /* synthetic */ class Gy implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f25261n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Hy f25262u;

    public /* synthetic */ Gy(Hy hy, int i) {
        this.f25261n = i;
        this.f25262u = hy;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3184f6 c3184f6;
        UB n9;
        int i;
        String str;
        StringWriter stringWriter;
        PrintWriter printWriter;
        switch (this.f25261n) {
            case 0:
                Hy hy = this.f25262u;
                if (!hy.f25476e || hy.f25482l.getAndSet(true)) {
                    return;
                }
                Context context = hy.f25472a;
                String str2 = hy.f25480j;
                int i4 = hy.f25490t;
                double d2 = hy.i;
                long j9 = hy.f25481k;
                Locale locale = Locale.getDefault();
                if (i4 == 1) {
                    AbstractC3684oL.a();
                    throw null;
                }
                int i9 = i4 - 2;
                int i10 = 4;
                int i11 = i9 != 0 ? i9 != 1 ? i9 != 2 ? 5 : 4 : 3 : 2;
                C3184f6 A8 = C3239g6.A();
                long j10 = Build.VERSION.SDK_INT;
                A8.h();
                ((C3239g6) A8.f30000u).D(j10);
                String str3 = Build.MODEL;
                A8.h();
                ((C3239g6) A8.f30000u).E(str3);
                String language = locale.getLanguage();
                A8.h();
                ((C3239g6) A8.f30000u).F(language);
                String country = locale.getCountry();
                A8.h();
                ((C3239g6) A8.f30000u).G(country);
                A8.h();
                ((C3239g6) A8.f30000u).J(str2);
                A8.h();
                ((C3239g6) A8.f30000u).P(i11);
                A8.h();
                ((C3239g6) A8.f30000u).Q(3);
                String packageName = context.getPackageName();
                A8.h();
                ((C3239g6) A8.f30000u).H(packageName);
                A8.h();
                ((C3239g6) A8.f30000u).M(j9);
                if (d2 > 0.0d) {
                    A8.h();
                    ((C3239g6) A8.f30000u).L((int) (1.0d / d2));
                }
                PackageManager packageManager = context.getPackageManager();
                try {
                    long j11 = packageManager.getPackageInfo(context.getPackageName(), 0).versionCode;
                    A8.h();
                    ((C3239g6) A8.f30000u).I(j11);
                } catch (Exception unused) {
                }
                try {
                    if (packageManager.hasSystemFeature("android.hardware.type.automotive")) {
                        i10 = 5;
                    } else if (!packageManager.hasSystemFeature("android.hardware.type.watch")) {
                        if (packageManager.hasSystemFeature("android.hardware.type.pc")) {
                            i10 = 7;
                        } else {
                            UiModeManager uiModeManager = (UiModeManager) context.getSystemService("uimode");
                            i10 = (uiModeManager == null || uiModeManager.getCurrentModeType() != 4) ? 2 : 6;
                        }
                    }
                    A8.h();
                    ((C3239g6) A8.f30000u).O(i10);
                } catch (RuntimeException unused2) {
                }
                C3239g6 c3239g6 = (C3239g6) A8.j();
                synchronized (hy.f25483m) {
                    hy.f25486p.k(c3239g6);
                }
                return;
            default:
                Hy hy2 = this.f25262u;
                synchronized (hy2.f25483m) {
                    C3184f6 c3184f62 = hy2.f25486p;
                    AbstractC3090dL abstractC3090dL = (AbstractC3090dL) c3184f62.f29999n.w(5, null);
                    abstractC3090dL.f30000u = c3184f62.i();
                    c3184f6 = (C3184f6) abstractC3090dL;
                }
                synchronized (hy2.f25484n) {
                    ArrayList arrayList = hy2.f25487q;
                    n9 = UB.n(arrayList);
                    arrayList.clear();
                    hy2.f25488r = false;
                }
                int size = n9.size();
                int i12 = 0;
                int i13 = 0;
                while (i13 < size) {
                    Fy fy = (Fy) n9.get(i13);
                    if (i12 >= hy2.f25478g) {
                        hy2.c((C3239g6) c3184f6.j());
                        c3184f6.h();
                        ((C3239g6) c3184f6.f30000u).C();
                        i = 0;
                    } else {
                        i = i12;
                    }
                    C3669o6 A9 = C3723p6.A();
                    long j12 = fy.f25061a;
                    A9.h();
                    ((C3723p6) A9.f30000u).B(j12);
                    long j13 = fy.f25062b;
                    A9.h();
                    ((C3723p6) A9.f30000u).C(j13);
                    long j14 = fy.f25065e;
                    A9.h();
                    ((C3723p6) A9.f30000u).F(j14);
                    String str4 = fy.f25064d;
                    if (str4 != null) {
                        A9.h();
                        ((C3723p6) A9.f30000u).G(str4);
                    }
                    Throwable th = fy.f25063c;
                    int i14 = th == null ? 2 : 3;
                    A9.h();
                    ((C3723p6) A9.f30000u).H(i14);
                    if (th != null) {
                        String name = th.getClass().getName();
                        A9.h();
                        ((C3723p6) A9.f30000u).D(name);
                        try {
                            stringWriter = new StringWriter();
                            try {
                                printWriter = new PrintWriter(stringWriter);
                            } finally {
                                break;
                            }
                        } catch (IOException unused3) {
                            str = "";
                        }
                        try {
                            th.printStackTrace(printWriter);
                            str = stringWriter.toString();
                            printWriter.close();
                            stringWriter.close();
                            A9.h();
                            ((C3723p6) A9.f30000u).E(str);
                        } finally {
                            break;
                        }
                    }
                    C3723p6 c3723p6 = (C3723p6) A9.j();
                    c3184f6.h();
                    ((C3239g6) c3184f6.f30000u).B(c3723p6);
                    i13++;
                    i12 = i + 1;
                }
                if (i12 > 0) {
                    hy2.c((C3239g6) c3184f6.j());
                    c3184f6.h();
                    ((C3239g6) c3184f6.f30000u).C();
                    return;
                }
                return;
        }
    }
}
