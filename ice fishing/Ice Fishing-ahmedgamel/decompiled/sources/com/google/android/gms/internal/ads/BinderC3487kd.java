package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.customevent.CustomEventAdapter;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import z2.AbstractC5224a;
import z2.InterfaceC5228e;

/* renamed from: com.google.android.gms.internal.ads.kd, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC3487kd extends AbstractBinderC3359i8 implements InterfaceC3595md {
    public BinderC3487kd() {
        super("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    public static InterfaceC3595md U3(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
        return queryLocalInterface instanceof InterfaceC3595md ? (InterfaceC3595md) queryLocalInterface : new C3541ld(iBinder, "com.google.android.gms.ads.internal.mediation.client.IAdapterCreator", 1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3595md
    public final InterfaceC2741Pd G(String str) {
        return new BinderC2809Td((RtbAdapter) Class.forName(str, false, AbstractC2792Sd.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3359i8
    public final boolean T3(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            String readString = parcel.readString();
            AbstractC3411j8.f(parcel);
            InterfaceC3703od b9 = b(readString);
            parcel2.writeNoException();
            AbstractC3411j8.e(parcel2, b9);
            return true;
        }
        if (i == 2) {
            String readString2 = parcel.readString();
            AbstractC3411j8.f(parcel);
            boolean z6 = z(readString2);
            parcel2.writeNoException();
            parcel2.writeInt(z6 ? 1 : 0);
            return true;
        }
        if (i == 3) {
            String readString3 = parcel.readString();
            AbstractC3411j8.f(parcel);
            InterfaceC2741Pd G2 = G(readString3);
            parcel2.writeNoException();
            AbstractC3411j8.e(parcel2, G2);
            return true;
        }
        if (i != 4) {
            return false;
        }
        String readString4 = parcel.readString();
        AbstractC3411j8.f(parcel);
        boolean y02 = y0(readString4);
        parcel2.writeNoException();
        parcel2.writeInt(y02 ? 1 : 0);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3595md
    public final InterfaceC3703od b(String str) {
        try {
            try {
                Class<?> cls = Class.forName(str, false, BinderC3487kd.class.getClassLoader());
                if (InterfaceC5228e.class.isAssignableFrom(cls)) {
                    return new BinderC2486Ad((InterfaceC5228e) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                }
                if (AbstractC5224a.class.isAssignableFrom(cls)) {
                    return new BinderC2486Ad((AbstractC5224a) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                }
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 64);
                sb.append("Could not instantiate mediation adapter: ");
                sb.append(str);
                sb.append(" (not a valid adapter).");
                x2.i.f(sb.toString());
                throw new RemoteException();
            } catch (Throwable th) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 43);
                sb2.append("Could not instantiate mediation adapter: ");
                sb2.append(str);
                sb2.append(". ");
                x2.i.g(sb2.toString(), th);
                throw new RemoteException();
            }
        } catch (Throwable unused) {
            x2.i.a("Reflection failed, retrying using direct instantiation");
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                return new BinderC2486Ad(new AdMobAdapter());
            }
            if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                return new BinderC2486Ad(new CustomEventAdapter());
            }
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3595md
    public final boolean y0(String str) {
        try {
            return AbstractC5224a.class.isAssignableFrom(Class.forName(str, false, BinderC3487kd.class.getClassLoader()));
        } catch (Throwable unused) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 104);
            sb.append("Could not load custom event implementation class as Adapter: ");
            sb.append(str);
            sb.append(", assuming old custom event implementation.");
            x2.i.f(sb.toString());
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3595md
    public final boolean z(String str) {
        try {
            return A2.a.class.isAssignableFrom(Class.forName(str, false, BinderC3487kd.class.getClassLoader()));
        } catch (Throwable unused) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 88);
            sb.append("Could not load custom event implementation class: ");
            sb.append(str);
            sb.append(", trying Adapter implementation class.");
            x2.i.f(sb.toString());
            return false;
        }
    }
}
