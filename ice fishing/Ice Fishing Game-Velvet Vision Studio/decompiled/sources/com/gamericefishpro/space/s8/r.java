package com.gamericefishpro.space.s8;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.gamericefishpro.space.i9.y3;
import com.gamericefishpro.space.v8.a0;
import com.gamericefishpro.space.v8.b0;
import com.gamericefishpro.space.v8.c0;
import com.gamericefishpro.space.v8.z;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class r {
    public static final m a;
    public static final m b;
    public static volatile b0 c;
    public static final Object d;
    public static Context e;

    static {
        new m(0, n.G("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u007f¢fú§p\u0085xb±"));
        new m(1, n.G("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014QÕÛ\u0004÷XçB\u0086<"));
        new m(2, n.G("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"));
        new m(3, n.G("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"));
        a = new m(4, n.G("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"));
        b = new m(5, n.G("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"));
        d = new Object();
    }

    public static void a() {
        b0 zVar;
        if (c != null) {
            return;
        }
        c0.g(e);
        synchronized (d) {
            try {
                if (c == null) {
                    IBinder iBinderB = com.gamericefishpro.space.d9.f.c(e, com.gamericefishpro.space.d9.f.d, "com.google.android.gms.googlecertificates").b("com.google.android.gms.common.GoogleCertificatesImpl");
                    int i = a0.e;
                    if (iBinderB == null) {
                        zVar = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = iBinderB.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
                        zVar = iInterfaceQueryLocalInterface instanceof b0 ? (b0) iInterfaceQueryLocalInterface : new z(iBinderB, "com.google.android.gms.common.internal.IGoogleCertificatesApi", 1);
                    }
                    c = zVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static u b(String str, o oVar, boolean z, boolean z2) {
        try {
            a();
            c0.g(e);
            try {
                b0 b0Var = c;
                com.gamericefishpro.space.c9.b bVar = new com.gamericefishpro.space.c9.b(e.getPackageManager());
                z zVar = (z) b0Var;
                Parcel parcelH = zVar.H();
                int i = com.gamericefishpro.space.h9.i.a;
                boolean z3 = true;
                parcelH.writeInt(1);
                int iV = y3.V(parcelH, 20293);
                y3.Q(parcelH, 1, str);
                y3.O(parcelH, 2, oVar);
                y3.U(parcelH, 3, 4);
                parcelH.writeInt(z ? 1 : 0);
                y3.U(parcelH, 4, 4);
                parcelH.writeInt(z2 ? 1 : 0);
                y3.W(parcelH, iV);
                com.gamericefishpro.space.h9.i.b(parcelH, bVar);
                Parcel parcelF = zVar.F(parcelH, 5);
                if (parcelF.readInt() == 0) {
                    z3 = false;
                }
                parcelF.recycle();
                return z3 ? u.c : new t(new p(z, str, oVar));
            } catch (RemoteException e2) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
                return u.c("module call", e2);
            }
        } catch (com.gamericefishpro.space.d9.b e3) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e3);
            return u.c("module init: ".concat(String.valueOf(e3.getMessage())), e3);
        }
    }
}
