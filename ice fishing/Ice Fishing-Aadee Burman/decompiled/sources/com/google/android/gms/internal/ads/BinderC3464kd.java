package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.customevent.CustomEventAdapter;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import x2.AbstractC5187a;
import x2.InterfaceC5191e;
import y2.InterfaceC5229a;

/* renamed from: com.google.android.gms.internal.ads.kd, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC3464kd extends AbstractBinderC3336i8 implements InterfaceC3572md {
    public BinderC3464kd() {
        super("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    public static InterfaceC3572md U3(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
        return queryLocalInterface instanceof InterfaceC3572md ? (InterfaceC3572md) queryLocalInterface : new C3518ld(iBinder, "com.google.android.gms.ads.internal.mediation.client.IAdapterCreator", 2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3572md
    public final boolean B0(String str) {
        try {
            return AbstractC5187a.class.isAssignableFrom(Class.forName(str, false, BinderC3464kd.class.getClassLoader()));
        } catch (Throwable unused) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 104);
            sb.append("Could not load custom event implementation class as Adapter: ");
            sb.append(str);
            sb.append(", assuming old custom event implementation.");
            v2.i.f(sb.toString());
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3572md
    public final InterfaceC2721Pd H(String str) {
        return new BinderC2788Td((RtbAdapter) Class.forName(str, false, AbstractC2772Sd.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3336i8
    public final boolean T3(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            String readString = parcel.readString();
            AbstractC3388j8.f(parcel);
            InterfaceC3680od b9 = b(readString);
            parcel2.writeNoException();
            AbstractC3388j8.e(parcel2, b9);
            return true;
        }
        if (i == 2) {
            String readString2 = parcel.readString();
            AbstractC3388j8.f(parcel);
            boolean z3 = z(readString2);
            parcel2.writeNoException();
            parcel2.writeInt(z3 ? 1 : 0);
            return true;
        }
        if (i == 3) {
            String readString3 = parcel.readString();
            AbstractC3388j8.f(parcel);
            InterfaceC2721Pd H8 = H(readString3);
            parcel2.writeNoException();
            AbstractC3388j8.e(parcel2, H8);
            return true;
        }
        if (i != 4) {
            return false;
        }
        String readString4 = parcel.readString();
        AbstractC3388j8.f(parcel);
        boolean B02 = B0(readString4);
        parcel2.writeNoException();
        parcel2.writeInt(B02 ? 1 : 0);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3572md
    public final InterfaceC3680od b(String str) {
        try {
            try {
                Class<?> cls = Class.forName(str, false, BinderC3464kd.class.getClassLoader());
                if (InterfaceC5191e.class.isAssignableFrom(cls)) {
                    return new BinderC2466Ad((InterfaceC5191e) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                }
                if (AbstractC5187a.class.isAssignableFrom(cls)) {
                    return new BinderC2466Ad((AbstractC5187a) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                }
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 64);
                sb.append("Could not instantiate mediation adapter: ");
                sb.append(str);
                sb.append(" (not a valid adapter).");
                v2.i.f(sb.toString());
                throw new RemoteException();
            } catch (Throwable th) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 43);
                sb2.append("Could not instantiate mediation adapter: ");
                sb2.append(str);
                sb2.append(". ");
                v2.i.g(sb2.toString(), th);
                throw new RemoteException();
            }
        } catch (Throwable unused) {
            v2.i.a("Reflection failed, retrying using direct instantiation");
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                return new BinderC2466Ad(new AdMobAdapter());
            }
            if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                return new BinderC2466Ad(new CustomEventAdapter());
            }
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3572md
    public final boolean z(String str) {
        try {
            return InterfaceC5229a.class.isAssignableFrom(Class.forName(str, false, BinderC3464kd.class.getClassLoader()));
        } catch (Throwable unused) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 88);
            sb.append("Could not load custom event implementation class: ");
            sb.append(str);
            sb.append(", trying Adapter implementation class.");
            v2.i.f(sb.toString());
            return false;
        }
    }
}
