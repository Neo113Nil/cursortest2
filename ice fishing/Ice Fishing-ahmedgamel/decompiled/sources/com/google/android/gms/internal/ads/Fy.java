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
public final /* synthetic */ class Fy implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f25688n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Gy f25689u;

    public /* synthetic */ Fy(Gy gy, int i) {
        this.f25688n = i;
        this.f25689u = gy;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3409j6 c3409j6;
        RB n9;
        int i;
        String str;
        StringWriter stringWriter;
        PrintWriter printWriter;
        switch (this.f25688n) {
            case 0:
                Gy gy = this.f25689u;
                if (!gy.f25951e || gy.f25957l.getAndSet(true)) {
                    return;
                }
                Context context = gy.f25947a;
                String str2 = gy.f25955j;
                int i4 = gy.f25965t;
                double d9 = gy.i;
                long j6 = gy.f25956k;
                Locale locale = Locale.getDefault();
                if (i4 == 1) {
                    AbstractC3103dL.a();
                    throw null;
                }
                int i6 = i4 - 2;
                int i9 = 4;
                int i10 = i6 != 0 ? i6 != 1 ? i6 != 2 ? 5 : 4 : 3 : 2;
                C3409j6 A9 = C3463k6.A();
                long j9 = Build.VERSION.SDK_INT;
                A9.h();
                ((C3463k6) A9.f28504u).D(j9);
                String str3 = Build.MODEL;
                A9.h();
                ((C3463k6) A9.f28504u).E(str3);
                String language = locale.getLanguage();
                A9.h();
                ((C3463k6) A9.f28504u).F(language);
                String country = locale.getCountry();
                A9.h();
                ((C3463k6) A9.f28504u).G(country);
                A9.h();
                ((C3463k6) A9.f28504u).J(str2);
                A9.h();
                ((C3463k6) A9.f28504u).P(i10);
                A9.h();
                ((C3463k6) A9.f28504u).Q(3);
                String packageName = context.getPackageName();
                A9.h();
                ((C3463k6) A9.f28504u).H(packageName);
                A9.h();
                ((C3463k6) A9.f28504u).M(j6);
                if (d9 > 0.0d) {
                    A9.h();
                    ((C3463k6) A9.f28504u).L((int) (1.0d / d9));
                }
                PackageManager packageManager = context.getPackageManager();
                try {
                    long j10 = packageManager.getPackageInfo(context.getPackageName(), 0).versionCode;
                    A9.h();
                    ((C3463k6) A9.f28504u).I(j10);
                } catch (Exception unused) {
                }
                try {
                    if (packageManager.hasSystemFeature("android.hardware.type.automotive")) {
                        i9 = 5;
                    } else if (!packageManager.hasSystemFeature("android.hardware.type.watch")) {
                        if (packageManager.hasSystemFeature("android.hardware.type.pc")) {
                            i9 = 7;
                        } else {
                            UiModeManager uiModeManager = (UiModeManager) context.getSystemService("uimode");
                            i9 = (uiModeManager == null || uiModeManager.getCurrentModeType() != 4) ? 2 : 6;
                        }
                    }
                    A9.h();
                    ((C3463k6) A9.f28504u).O(i9);
                } catch (RuntimeException unused2) {
                }
                C3463k6 c3463k6 = (C3463k6) A9.j();
                synchronized (gy.f25958m) {
                    gy.f25961p.k(c3463k6);
                }
                return;
            default:
                Gy gy2 = this.f25689u;
                synchronized (gy2.f25958m) {
                    C3409j6 c3409j62 = gy2.f25961p;
                    TK tk = (TK) c3409j62.f28503n.w(5, null);
                    tk.f28504u = c3409j62.i();
                    c3409j6 = (C3409j6) tk;
                }
                synchronized (gy2.f25959n) {
                    ArrayList arrayList = gy2.f25962q;
                    n9 = RB.n(arrayList);
                    arrayList.clear();
                    gy2.f25963r = false;
                }
                int size = n9.size();
                int i11 = 0;
                int i12 = 0;
                while (i12 < size) {
                    Ey ey = (Ey) n9.get(i12);
                    if (i11 >= gy2.f25953g) {
                        gy2.b((C3463k6) c3409j6.j());
                        c3409j6.h();
                        ((C3463k6) c3409j6.f28504u).C();
                        i = 0;
                    } else {
                        i = i11;
                    }
                    C3840r6 A10 = C3894s6.A();
                    long j11 = ey.f25445a;
                    A10.h();
                    ((C3894s6) A10.f28504u).B(j11);
                    long j12 = ey.f25446b;
                    A10.h();
                    ((C3894s6) A10.f28504u).C(j12);
                    long j13 = ey.f25449e;
                    A10.h();
                    ((C3894s6) A10.f28504u).F(j13);
                    String str4 = ey.f25448d;
                    if (str4 != null) {
                        A10.h();
                        ((C3894s6) A10.f28504u).G(str4);
                    }
                    Throwable th = ey.f25447c;
                    int i13 = th == null ? 2 : 3;
                    A10.h();
                    ((C3894s6) A10.f28504u).H(i13);
                    if (th != null) {
                        String name = th.getClass().getName();
                        A10.h();
                        ((C3894s6) A10.f28504u).D(name);
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
                            A10.h();
                            ((C3894s6) A10.f28504u).E(str);
                        } finally {
                            break;
                        }
                    }
                    C3894s6 c3894s6 = (C3894s6) A10.j();
                    c3409j6.h();
                    ((C3463k6) c3409j6.f28504u).B(c3894s6);
                    i12++;
                    i11 = i + 1;
                }
                if (i11 > 0) {
                    gy2.b((C3463k6) c3409j6.j());
                    c3409j6.h();
                    ((C3463k6) c3409j6.f28504u).C();
                    return;
                }
                return;
        }
    }
}
