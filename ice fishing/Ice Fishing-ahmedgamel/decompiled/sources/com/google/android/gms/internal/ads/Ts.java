package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import r2.C4906k;

/* loaded from: classes2.dex */
public final /* synthetic */ class Ts implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28602a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f28603b;

    public /* synthetic */ Ts(int i, Object obj) {
        this.f28602a = i;
        this.f28603b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i;
        Object apply;
        File file;
        File file2;
        boolean z6 = true;
        char c9 = 1;
        boolean z9 = false;
        Object obj = null;
        switch (this.f28602a) {
            case 0:
                Context context = ((C3073cs) this.f28603b).f30384c;
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                String networkOperator = telephonyManager.getNetworkOperator();
                int phoneType = telephonyManager.getPhoneType();
                C4906k c4906k = C4906k.f40186C;
                w2.D d9 = c4906k.f40191c;
                int i4 = -1;
                if (w2.D.c(context, "android.permission.ACCESS_NETWORK_STATE")) {
                    ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                    NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                    if (activeNetworkInfo != null) {
                        int type = activeNetworkInfo.getType();
                        i4 = activeNetworkInfo.getDetailedState().ordinal();
                        i = type;
                    } else {
                        i = -1;
                    }
                    z9 = connectivityManager.isActiveNetworkMetered();
                } else {
                    i = -2;
                }
                return new Ss(networkOperator, i, c4906k.f40194f.A(context), phoneType, z9, i4);
            case 1:
                String str = (String) ((ND) this.f28603b).f27259n;
                ND nd = ND.f27257u;
                return new C3933ss(c9 == true ? 1 : 0, str, obj);
            case 2:
                return new Xr(2, (ArrayList) ((C3180es) this.f28603b).f30780c);
            case 3:
                ((Hu) this.f28603b).mo3c();
                return null;
            case 4:
                Context context2 = (Context) ((C2590Gf) this.f28603b).f25830u;
                return AbstractC2792Sd.f(context2, context2.getPackageName(), Integer.toString(context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0).versionCode));
            case 5:
                C4263yy c4263yy = (C4263yy) this.f28603b;
                synchronized (c4263yy) {
                    try {
                        FileInputStream fileInputStream = new FileInputStream(c4263yy.f36037a);
                        try {
                            apply = c4263yy.f36039c.g(fileInputStream);
                            fileInputStream.close();
                        } finally {
                        }
                    } catch (C4101vy e9) {
                        apply = c4263yy.f36040d.apply(e9);
                    } catch (FileNotFoundException unused) {
                        apply = c4263yy.f36039c.i();
                    } catch (IOException e10) {
                        apply = c4263yy.f36040d.apply(new C4101vy(e10));
                    }
                }
                return apply;
            case 6:
                Qy qy = (Qy) this.f28603b;
                ((Xy) qy.f27898c.f()).a();
                ((C3241fz) qy.f27897b.f()).a();
                return null;
            case 7:
                return ((InterfaceC3158eN) this.f28603b).f();
            case 8:
                C2985bA c2985bA = (C2985bA) this.f28603b;
                C4006uA c4006uA = c2985bA.i;
                C4263yy c4263yy2 = c2985bA.f30022b;
                C4263yy c4263yy3 = c2985bA.f30024d;
                InterfaceC3158eN interfaceC3158eN = c2985bA.f30026f;
                try {
                    File file3 = c4263yy2.f36037a;
                    boolean exists = file3.exists();
                    File file4 = c4263yy2.f36037a;
                    if (exists) {
                        File file5 = ((C4263yy) interfaceC3158eN.f()).f36037a;
                        File file6 = ((C4263yy) c2985bA.f30025e.f()).f36037a;
                        try {
                            if (file5.exists()) {
                                File parentFile = file6.getParentFile();
                                if (parentFile != null) {
                                    MA.N(parentFile);
                                }
                                AbstractC3066cl.u(file6);
                                AbstractC3066cl.x(file5, file6);
                            }
                            File file7 = c4263yy3.f36037a;
                            File file8 = c4263yy3.f36037a;
                            File file9 = c2985bA.f30023c.f36037a;
                            try {
                                if (file7.exists()) {
                                    AbstractC3066cl.u(file9);
                                    AbstractC3066cl.x(file7, file9);
                                }
                                File file10 = c2985bA.f30021a.f36037a;
                                try {
                                    if (file3.exists()) {
                                        AbstractC3066cl.u(file10);
                                        AbstractC3066cl.x(file3, file10);
                                    }
                                    file4.delete();
                                    ((C4263yy) interfaceC3158eN.f()).f36037a.delete();
                                    file8.delete();
                                } catch (IOException | SecurityException e11) {
                                    c4006uA.d(15313, e11);
                                    file4.delete();
                                    file2 = ((C4263yy) interfaceC3158eN.f()).f36037a;
                                    file2.delete();
                                    file8.delete();
                                    z6 = false;
                                    return new Boolean(z6);
                                }
                            } catch (IOException | SecurityException e12) {
                                c4006uA.d(15312, e12);
                                file4.delete();
                                file2 = ((C4263yy) interfaceC3158eN.f()).f36037a;
                            }
                        } catch (IOException e13) {
                            e = e13;
                            c4006uA.d(15311, e);
                            file4.delete();
                            ((C4263yy) interfaceC3158eN.f()).f36037a.delete();
                            file = c4263yy3.f36037a;
                            file.delete();
                            z6 = false;
                            return new Boolean(z6);
                        } catch (SecurityException e14) {
                            e = e14;
                            c4006uA.d(15311, e);
                            file4.delete();
                            ((C4263yy) interfaceC3158eN.f()).f36037a.delete();
                            file = c4263yy3.f36037a;
                            file.delete();
                            z6 = false;
                            return new Boolean(z6);
                        }
                        return new Boolean(z6);
                    }
                    file4.delete();
                    ((C4263yy) interfaceC3158eN.f()).f36037a.delete();
                    file = c4263yy3.f36037a;
                    file.delete();
                    z6 = false;
                    return new Boolean(z6);
                } catch (Throwable th) {
                    c4263yy2.f36037a.delete();
                    ((C4263yy) interfaceC3158eN.f()).f36037a.delete();
                    c4263yy3.f36037a.delete();
                    throw th;
                }
            case 9:
                C3629nA c3629nA = (C3629nA) this.f28603b;
                c3629nA.getClass();
                C2742Pe c2742Pe = new C2742Pe(13, c3629nA);
                synchronized (c3629nA) {
                    C4006uA c4006uA2 = c3629nA.f33479c;
                    C3955tD u6 = QC.u(com.bumptech.glide.g.j(new S0.c(25, c3629nA.f33478b, c3629nA.f33481e)), c2742Pe, c3629nA.f33480d);
                    c4006uA2.e(52, u6);
                    c3629nA.f33483g = u6;
                }
                return "";
            case 10:
                Context context3 = ((C3629nA) this.f28603b).f33478b;
                try {
                    return AbstractC2792Sd.f(context3, context3.getPackageName(), Integer.toString(context3.getPackageManager().getPackageInfo(context3.getPackageName(), 0).versionCode));
                } catch (Throwable unused2) {
                    return null;
                }
            default:
                C3844rA c3844rA = (C3844rA) this.f28603b;
                c3844rA.getClass();
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.USER_PRESENT");
                intentFilter.addAction("android.intent.action.SCREEN_OFF");
                c3844rA.f34300a.registerReceiver(c3844rA, intentFilter);
                return null;
        }
    }

    public /* synthetic */ Ts(ND nd) {
        this.f28602a = 1;
        ND nd2 = ND.f27257u;
        this.f28603b = nd;
    }
}
