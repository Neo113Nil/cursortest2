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
import p2.C4835j;

/* loaded from: classes2.dex */
public final /* synthetic */ class Ts implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27805a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f27806b;

    public /* synthetic */ Ts(int i, Object obj) {
        this.f27805a = i;
        this.f27806b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i;
        Object apply;
        File file;
        File file2;
        boolean z3 = true;
        char c9 = 1;
        boolean z6 = false;
        Object obj = null;
        switch (this.f27805a) {
            case 0:
                Context context = ((C3050cs) this.f27806b).f29614c;
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                String networkOperator = telephonyManager.getNetworkOperator();
                int phoneType = telephonyManager.getPhoneType();
                C4835j c4835j = C4835j.f39730C;
                u2.D d2 = c4835j.f39735c;
                int i6 = -1;
                if (u2.D.c(context, "android.permission.ACCESS_NETWORK_STATE")) {
                    ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                    NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                    if (activeNetworkInfo != null) {
                        int type = activeNetworkInfo.getType();
                        i6 = activeNetworkInfo.getDetailedState().ordinal();
                        i = type;
                    } else {
                        i = -1;
                    }
                    z6 = connectivityManager.isActiveNetworkMetered();
                } else {
                    i = -2;
                }
                return new Ss(networkOperator, i, c4835j.f39738f.x(context), phoneType, z6, i6);
            case 1:
                String str = (String) ((ND) this.f27806b).f26475n;
                ND nd = ND.f26473u;
                return new C3910ss(c9 == true ? 1 : 0, str, obj);
            case 2:
                return new Xr(2, (ArrayList) ((C3157es) this.f27806b).f29991c);
            case 3:
                ((Hu) this.f27806b).mo4c();
                return null;
            case 4:
                Context context2 = (Context) ((C2570Gf) this.f27806b).f25042u;
                return AbstractC2772Sd.f(context2, context2.getPackageName(), Integer.toString(context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0).versionCode));
            case 5:
                C4240yy c4240yy = (C4240yy) this.f27806b;
                synchronized (c4240yy) {
                    try {
                        FileInputStream fileInputStream = new FileInputStream(c4240yy.f35253a);
                        try {
                            apply = c4240yy.f35255c.g(fileInputStream);
                            fileInputStream.close();
                        } finally {
                        }
                    } catch (C4078vy e9) {
                        apply = c4240yy.f35256d.apply(e9);
                    } catch (FileNotFoundException unused) {
                        apply = c4240yy.f35255c.i();
                    } catch (IOException e10) {
                        apply = c4240yy.f35256d.apply(new C4078vy(e10));
                    }
                }
                return apply;
            case 6:
                Qy qy = (Qy) this.f27806b;
                ((Xy) qy.f27142c.f()).a();
                ((C3218fz) qy.f27141b.f()).a();
                return null;
            case 7:
                return ((InterfaceC3135eN) this.f27806b).f();
            case 8:
                C2962bA c2962bA = (C2962bA) this.f27806b;
                C3983uA c3983uA = c2962bA.i;
                C4240yy c4240yy2 = c2962bA.f29234b;
                C4240yy c4240yy3 = c2962bA.f29236d;
                InterfaceC3135eN interfaceC3135eN = c2962bA.f29238f;
                try {
                    File file3 = c4240yy2.f35253a;
                    boolean exists = file3.exists();
                    File file4 = c4240yy2.f35253a;
                    if (exists) {
                        File file5 = ((C4240yy) interfaceC3135eN.f()).f35253a;
                        File file6 = ((C4240yy) c2962bA.f29237e.f()).f35253a;
                        try {
                            if (file5.exists()) {
                                File parentFile = file6.getParentFile();
                                if (parentFile != null) {
                                    MA.N(parentFile);
                                }
                                AbstractC3043cl.u(file6);
                                AbstractC3043cl.x(file5, file6);
                            }
                            File file7 = c4240yy3.f35253a;
                            File file8 = c4240yy3.f35253a;
                            File file9 = c2962bA.f29235c.f35253a;
                            try {
                                if (file7.exists()) {
                                    AbstractC3043cl.u(file9);
                                    AbstractC3043cl.x(file7, file9);
                                }
                                File file10 = c2962bA.f29233a.f35253a;
                                try {
                                    if (file3.exists()) {
                                        AbstractC3043cl.u(file10);
                                        AbstractC3043cl.x(file3, file10);
                                    }
                                    file4.delete();
                                    ((C4240yy) interfaceC3135eN.f()).f35253a.delete();
                                    file8.delete();
                                } catch (IOException | SecurityException e11) {
                                    c3983uA.d(15313, e11);
                                    file4.delete();
                                    file2 = ((C4240yy) interfaceC3135eN.f()).f35253a;
                                    file2.delete();
                                    file8.delete();
                                    z3 = false;
                                    return new Boolean(z3);
                                }
                            } catch (IOException | SecurityException e12) {
                                c3983uA.d(15312, e12);
                                file4.delete();
                                file2 = ((C4240yy) interfaceC3135eN.f()).f35253a;
                            }
                        } catch (IOException e13) {
                            e = e13;
                            c3983uA.d(15311, e);
                            file4.delete();
                            ((C4240yy) interfaceC3135eN.f()).f35253a.delete();
                            file = c4240yy3.f35253a;
                            file.delete();
                            z3 = false;
                            return new Boolean(z3);
                        } catch (SecurityException e14) {
                            e = e14;
                            c3983uA.d(15311, e);
                            file4.delete();
                            ((C4240yy) interfaceC3135eN.f()).f35253a.delete();
                            file = c4240yy3.f35253a;
                            file.delete();
                            z3 = false;
                            return new Boolean(z3);
                        }
                        return new Boolean(z3);
                    }
                    file4.delete();
                    ((C4240yy) interfaceC3135eN.f()).f35253a.delete();
                    file = c4240yy3.f35253a;
                    file.delete();
                    z3 = false;
                    return new Boolean(z3);
                } catch (Throwable th) {
                    c4240yy2.f35253a.delete();
                    ((C4240yy) interfaceC3135eN.f()).f35253a.delete();
                    c4240yy3.f35253a.delete();
                    throw th;
                }
            case 9:
                C3606nA c3606nA = (C3606nA) this.f27806b;
                c3606nA.getClass();
                C2722Pe c2722Pe = new C2722Pe(13, c3606nA);
                synchronized (c3606nA) {
                    C3983uA c3983uA2 = c3606nA.f32701c;
                    C3932tD u3 = QC.u(com.bumptech.glide.g.f(new S0.c(22, c3606nA.f32700b, c3606nA.f32703e)), c2722Pe, c3606nA.f32702d);
                    c3983uA2.e(52, u3);
                    c3606nA.f32705g = u3;
                }
                return "";
            case 10:
                Context context3 = ((C3606nA) this.f27806b).f32700b;
                try {
                    return AbstractC2772Sd.f(context3, context3.getPackageName(), Integer.toString(context3.getPackageManager().getPackageInfo(context3.getPackageName(), 0).versionCode));
                } catch (Throwable unused2) {
                    return null;
                }
            default:
                C3821rA c3821rA = (C3821rA) this.f27806b;
                c3821rA.getClass();
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.USER_PRESENT");
                intentFilter.addAction("android.intent.action.SCREEN_OFF");
                c3821rA.f33532a.registerReceiver(c3821rA, intentFilter);
                return null;
        }
    }

    public /* synthetic */ Ts(ND nd) {
        this.f27805a = 1;
        ND nd2 = ND.f26473u;
        this.f27806b = nd;
    }
}
