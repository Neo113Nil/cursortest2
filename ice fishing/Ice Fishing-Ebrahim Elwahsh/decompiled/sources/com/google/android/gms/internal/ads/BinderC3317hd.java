package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.customevent.CustomEventAdapter;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import w2.AbstractC5153a;
import w2.InterfaceC5157e;
import x2.InterfaceC5208a;

/* renamed from: com.google.android.gms.internal.ads.hd, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC3317hd extends AbstractBinderC3186f8 implements InterfaceC3423jd {
    public BinderC3317hd() {
        super("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    public static InterfaceC3423jd G3(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
        return queryLocalInterface instanceof InterfaceC3423jd ? (InterfaceC3423jd) queryLocalInterface : new C3371id(iBinder, "com.google.android.gms.ads.internal.mediation.client.IAdapterCreator", 2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3423jd
    public final InterfaceC2669Md C(String str) {
        return new BinderC2737Qd((RtbAdapter) Class.forName(str, false, AbstractC2720Pd.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3423jd
    public final boolean E(String str) {
        try {
            return AbstractC5153a.class.isAssignableFrom(Class.forName(str, false, BinderC3317hd.class.getClassLoader()));
        } catch (Throwable unused) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 104);
            sb.append("Could not load custom event implementation class as Adapter: ");
            sb.append(str);
            sb.append(", assuming old custom event implementation.");
            u2.i.f(sb.toString());
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3186f8
    public final boolean F3(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            String readString = parcel.readString();
            AbstractC3241g8.f(parcel);
            InterfaceC3531ld b9 = b(readString);
            parcel2.writeNoException();
            AbstractC3241g8.e(parcel2, b9);
            return true;
        }
        if (i == 2) {
            String readString2 = parcel.readString();
            AbstractC3241g8.f(parcel);
            boolean N8 = N(readString2);
            parcel2.writeNoException();
            parcel2.writeInt(N8 ? 1 : 0);
            return true;
        }
        if (i == 3) {
            String readString3 = parcel.readString();
            AbstractC3241g8.f(parcel);
            InterfaceC2669Md C7 = C(readString3);
            parcel2.writeNoException();
            AbstractC3241g8.e(parcel2, C7);
            return true;
        }
        if (i != 4) {
            return false;
        }
        String readString4 = parcel.readString();
        AbstractC3241g8.f(parcel);
        boolean E8 = E(readString4);
        parcel2.writeNoException();
        parcel2.writeInt(E8 ? 1 : 0);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3423jd
    public final boolean N(String str) {
        try {
            return InterfaceC5208a.class.isAssignableFrom(Class.forName(str, false, BinderC3317hd.class.getClassLoader()));
        } catch (Throwable unused) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 88);
            sb.append("Could not load custom event implementation class: ");
            sb.append(str);
            sb.append(", trying Adapter implementation class.");
            u2.i.f(sb.toString());
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3423jd
    public final InterfaceC3531ld b(String str) {
        try {
            try {
                Class<?> cls = Class.forName(str, false, BinderC3317hd.class.getClassLoader());
                if (InterfaceC5157e.class.isAssignableFrom(cls)) {
                    return new BinderC4178xd((InterfaceC5157e) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                }
                if (AbstractC5153a.class.isAssignableFrom(cls)) {
                    return new BinderC4178xd((AbstractC5153a) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                }
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 64);
                sb.append("Could not instantiate mediation adapter: ");
                sb.append(str);
                sb.append(" (not a valid adapter).");
                u2.i.f(sb.toString());
                throw new RemoteException();
            } catch (Throwable th) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 43);
                sb2.append("Could not instantiate mediation adapter: ");
                sb2.append(str);
                sb2.append(". ");
                u2.i.g(sb2.toString(), th);
                throw new RemoteException();
            }
        } catch (Throwable unused) {
            u2.i.a("Reflection failed, retrying using direct instantiation");
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                return new BinderC4178xd(new AdMobAdapter());
            }
            if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                return new BinderC4178xd(new CustomEventAdapter());
            }
            throw new RemoteException();
        }
    }
}
