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

/* loaded from: classes2.dex */
public final /* synthetic */ class Vs implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28313a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f28314b;

    public /* synthetic */ Vs(int i, Object obj) {
        this.f28313a = i;
        this.f28314b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i;
        Object apply;
        File file;
        File file2;
        boolean z8 = true;
        boolean z9 = false;
        switch (this.f28313a) {
            case 0:
                Context context = ((C3169es) this.f28314b).f30524c;
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                String networkOperator = telephonyManager.getNetworkOperator();
                int phoneType = telephonyManager.getPhoneType();
                p2.j jVar = p2.j.f39798C;
                t2.G g9 = jVar.f39803c;
                int i4 = -1;
                if (t2.G.c(context, "android.permission.ACCESS_NETWORK_STATE")) {
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
                return new Us(networkOperator, i, jVar.f39806f.F(context), phoneType, z9, i4);
            case 1:
                String str = (String) ((OD) this.f28314b).f26667n;
                OD od = OD.f26665u;
                return new C4031us(1, str, null);
            case 2:
                return new C2951as(2, (ArrayList) ((C3278gs) this.f28314b).f31113c);
            case 3:
                ((Ju) this.f28314b).mo1a();
                return null;
            case 4:
                Context context2 = (Context) ((C2518Df) this.f28314b).f24453u;
                return PA.h(context2, context2.getPackageName(), Integer.toString(context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0).versionCode));
            case 5:
                C4307zy c4307zy = (C4307zy) this.f28314b;
                synchronized (c4307zy) {
                    try {
                        FileInputStream fileInputStream = new FileInputStream(c4307zy.f35643a);
                        try {
                            apply = c4307zy.f35645c.h(fileInputStream);
                            fileInputStream.close();
                        } finally {
                        }
                    } catch (C4199xy e6) {
                        apply = c4307zy.f35646d.apply(e6);
                    } catch (FileNotFoundException unused) {
                        apply = c4307zy.f35645c.i();
                    } catch (IOException e9) {
                        apply = c4307zy.f35646d.apply(new C4199xy(e9));
                    }
                }
                return apply;
            case 6:
                Sy sy = (Sy) this.f28314b;
                ((Zy) sy.f27658c.d()).a();
                ((C3391iz) sy.f27657b.d()).a();
                return null;
            case 7:
                return ((InterfaceC3901sN) this.f28314b).d();
            case 8:
                C3133eA c3133eA = (C3133eA) this.f28314b;
                C4158xA c4158xA = c3133eA.i;
                C4307zy c4307zy2 = c3133eA.f30323b;
                C4307zy c4307zy3 = c3133eA.f30325d;
                InterfaceC3901sN interfaceC3901sN = c3133eA.f30327f;
                try {
                    File file3 = c4307zy2.f35643a;
                    boolean exists = file3.exists();
                    File file4 = c4307zy2.f35643a;
                    if (exists) {
                        File file5 = ((C4307zy) interfaceC3901sN.d()).f35643a;
                        File file6 = ((C4307zy) c3133eA.f30326e.d()).f35643a;
                        try {
                            if (file5.exists()) {
                                File parentFile = file6.getParentFile();
                                if (parentFile != null) {
                                    AbstractC2720Pd.K(parentFile);
                                }
                                AbstractC3035cL.u(file6);
                                AbstractC3035cL.y(file5, file6);
                            }
                            File file7 = c4307zy3.f35643a;
                            File file8 = c4307zy3.f35643a;
                            File file9 = c3133eA.f30324c.f35643a;
                            try {
                                if (file7.exists()) {
                                    AbstractC3035cL.u(file9);
                                    AbstractC3035cL.y(file7, file9);
                                }
                                File file10 = c3133eA.f30322a.f35643a;
                                try {
                                    if (file3.exists()) {
                                        AbstractC3035cL.u(file10);
                                        AbstractC3035cL.y(file3, file10);
                                    }
                                    file4.delete();
                                    ((C4307zy) interfaceC3901sN.d()).f35643a.delete();
                                    file8.delete();
                                } catch (IOException | SecurityException e10) {
                                    c4158xA.d(15313, e10);
                                    file4.delete();
                                    file2 = ((C4307zy) interfaceC3901sN.d()).f35643a;
                                    file2.delete();
                                    file8.delete();
                                    z8 = false;
                                    return new Boolean(z8);
                                }
                            } catch (IOException | SecurityException e11) {
                                c4158xA.d(15312, e11);
                                file4.delete();
                                file2 = ((C4307zy) interfaceC3901sN.d()).f35643a;
                            }
                        } catch (IOException e12) {
                            e = e12;
                            c4158xA.d(15311, e);
                            file4.delete();
                            ((C4307zy) interfaceC3901sN.d()).f35643a.delete();
                            file = c4307zy3.f35643a;
                            file.delete();
                            z8 = false;
                            return new Boolean(z8);
                        } catch (SecurityException e13) {
                            e = e13;
                            c4158xA.d(15311, e);
                            file4.delete();
                            ((C4307zy) interfaceC3901sN.d()).f35643a.delete();
                            file = c4307zy3.f35643a;
                            file.delete();
                            z8 = false;
                            return new Boolean(z8);
                        }
                        return new Boolean(z8);
                    }
                    file4.delete();
                    ((C4307zy) interfaceC3901sN.d()).f35643a.delete();
                    file = c4307zy3.f35643a;
                    file.delete();
                    z8 = false;
                    return new Boolean(z8);
                } catch (Throwable th) {
                    c4307zy2.f35643a.delete();
                    ((C4307zy) interfaceC3901sN.d()).f35643a.delete();
                    c4307zy3.f35643a.delete();
                    throw th;
                }
            case 9:
                C3727pA c3727pA = (C3727pA) this.f28314b;
                c3727pA.getClass();
                C2670Me c2670Me = new C2670Me(13, c3727pA);
                synchronized (c3727pA) {
                    C4158xA c4158xA2 = c3727pA.f33337c;
                    C3999uD A8 = C3686oN.A(com.bumptech.glide.f.i(new C2593Hm(25, c3727pA.f33336b, c3727pA.f33339e)), c2670Me, c3727pA.f33338d);
                    c4158xA2.e(52, A8);
                    c3727pA.f33341g = A8;
                }
                return "";
            case 10:
                Context context3 = ((C3727pA) this.f28314b).f33336b;
                try {
                    return PA.h(context3, context3.getPackageName(), Integer.toString(context3.getPackageManager().getPackageInfo(context3.getPackageName(), 0).versionCode));
                } catch (Throwable unused2) {
                    return null;
                }
            default:
                C3996uA c3996uA = (C3996uA) this.f28314b;
                c3996uA.getClass();
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.USER_PRESENT");
                intentFilter.addAction("android.intent.action.SCREEN_OFF");
                c3996uA.f34547a.registerReceiver(c3996uA, intentFilter);
                return null;
        }
    }

    public /* synthetic */ Vs(OD od) {
        this.f28313a = 1;
        OD od2 = OD.f26665u;
        this.f28314b = od;
    }
}
