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
    public final /* synthetic */ int f24898n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Gy f24899u;

    public /* synthetic */ Fy(Gy gy, int i) {
        this.f24898n = i;
        this.f24899u = gy;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3386j6 c3386j6;
        RB n9;
        int i;
        String str;
        StringWriter stringWriter;
        PrintWriter printWriter;
        switch (this.f24898n) {
            case 0:
                Gy gy = this.f24899u;
                if (!gy.f25179e || gy.f25185l.getAndSet(true)) {
                    return;
                }
                Context context = gy.f25175a;
                String str2 = gy.f25183j;
                int i6 = gy.f25193t;
                double d2 = gy.i;
                long j6 = gy.f25184k;
                Locale locale = Locale.getDefault();
                if (i6 == 1) {
                    AbstractC3080dL.a();
                    throw null;
                }
                int i9 = i6 - 2;
                int i10 = 4;
                int i11 = i9 != 0 ? i9 != 1 ? i9 != 2 ? 5 : 4 : 3 : 2;
                C3386j6 A9 = C3440k6.A();
                long j9 = Build.VERSION.SDK_INT;
                A9.h();
                ((C3440k6) A9.f27721u).D(j9);
                String str3 = Build.MODEL;
                A9.h();
                ((C3440k6) A9.f27721u).E(str3);
                String language = locale.getLanguage();
                A9.h();
                ((C3440k6) A9.f27721u).F(language);
                String country = locale.getCountry();
                A9.h();
                ((C3440k6) A9.f27721u).G(country);
                A9.h();
                ((C3440k6) A9.f27721u).J(str2);
                A9.h();
                ((C3440k6) A9.f27721u).P(i11);
                A9.h();
                ((C3440k6) A9.f27721u).Q(3);
                String packageName = context.getPackageName();
                A9.h();
                ((C3440k6) A9.f27721u).H(packageName);
                A9.h();
                ((C3440k6) A9.f27721u).M(j6);
                if (d2 > 0.0d) {
                    A9.h();
                    ((C3440k6) A9.f27721u).L((int) (1.0d / d2));
                }
                PackageManager packageManager = context.getPackageManager();
                try {
                    long j10 = packageManager.getPackageInfo(context.getPackageName(), 0).versionCode;
                    A9.h();
                    ((C3440k6) A9.f27721u).I(j10);
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
                    A9.h();
                    ((C3440k6) A9.f27721u).O(i10);
                } catch (RuntimeException unused2) {
                }
                C3440k6 c3440k6 = (C3440k6) A9.j();
                synchronized (gy.f25186m) {
                    gy.f25189p.k(c3440k6);
                }
                return;
            default:
                Gy gy2 = this.f24899u;
                synchronized (gy2.f25186m) {
                    C3386j6 c3386j62 = gy2.f25189p;
                    TK tk = (TK) c3386j62.f27720n.w(5, null);
                    tk.f27721u = c3386j62.i();
                    c3386j6 = (C3386j6) tk;
                }
                synchronized (gy2.f25187n) {
                    ArrayList arrayList = gy2.f25190q;
                    n9 = RB.n(arrayList);
                    arrayList.clear();
                    gy2.f25191r = false;
                }
                int size = n9.size();
                int i12 = 0;
                int i13 = 0;
                while (i13 < size) {
                    Ey ey = (Ey) n9.get(i13);
                    if (i12 >= gy2.f25181g) {
                        gy2.b((C3440k6) c3386j6.j());
                        c3386j6.h();
                        ((C3440k6) c3386j6.f27721u).C();
                        i = 0;
                    } else {
                        i = i12;
                    }
                    C3817r6 A10 = C3871s6.A();
                    long j11 = ey.f24689a;
                    A10.h();
                    ((C3871s6) A10.f27721u).B(j11);
                    long j12 = ey.f24690b;
                    A10.h();
                    ((C3871s6) A10.f27721u).C(j12);
                    long j13 = ey.f24693e;
                    A10.h();
                    ((C3871s6) A10.f27721u).F(j13);
                    String str4 = ey.f24692d;
                    if (str4 != null) {
                        A10.h();
                        ((C3871s6) A10.f27721u).G(str4);
                    }
                    Throwable th = ey.f24691c;
                    int i14 = th == null ? 2 : 3;
                    A10.h();
                    ((C3871s6) A10.f27721u).H(i14);
                    if (th != null) {
                        String name = th.getClass().getName();
                        A10.h();
                        ((C3871s6) A10.f27721u).D(name);
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
                            ((C3871s6) A10.f27721u).E(str);
                        } finally {
                            break;
                        }
                    }
                    C3871s6 c3871s6 = (C3871s6) A10.j();
                    c3386j6.h();
                    ((C3440k6) c3386j6.f27721u).B(c3871s6);
                    i13++;
                    i12 = i + 1;
                }
                if (i12 > 0) {
                    gy2.b((C3440k6) c3386j6.j());
                    c3386j6.h();
                    ((C3440k6) c3386j6.f27721u).C();
                    return;
                }
                return;
        }
    }
}
