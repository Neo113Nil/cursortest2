package q2;

import a.AbstractC0415a;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.AbstractC3241g8;
import com.google.android.gms.internal.ads.AbstractC3368ia;
import com.google.android.gms.internal.ads.C2684Nb;
import com.google.android.gms.internal.ads.C4287ze;
import com.google.android.gms.internal.ads.InterfaceC2466Ae;
import java.util.Objects;

/* renamed from: q2.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4899l extends AbstractC4905o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f40094b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C4903n f40095c;

    public C4899l(C4903n c4903n, Context context) {
        this.f40094b = context;
        Objects.requireNonNull(c4903n);
        this.f40095c = c4903n;
    }

    @Override // q2.AbstractC4905o
    public final Object a() {
        C4903n.p(this.f40094b, "mobile_ads_settings");
        return new S0();
    }

    @Override // q2.AbstractC4905o
    public final Object b() {
        C4892h0 c4892h0;
        Context context = this.f40094b;
        AbstractC3368ia.a(context);
        boolean booleanValue = ((Boolean) r.f40116e.f40119c.a(AbstractC3368ia.cc)).booleanValue();
        C4903n c4903n = this.f40095c;
        if (!booleanValue) {
            C2684Nb c2684Nb = (C2684Nb) c4903n.f40103w;
            try {
                V2.b bVar = new V2.b(context);
                C4892h0 c4892h02 = (C4892h0) c2684Nb.j(context);
                Parcel A02 = c4892h02.A0();
                AbstractC3241g8.e(A02, bVar);
                A02.writeInt(261710000);
                Parcel D02 = c4892h02.D0(A02, 1);
                IBinder readStrongBinder = D02.readStrongBinder();
                D02.recycle();
                if (readStrongBinder == null) {
                    return null;
                }
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
                return queryLocalInterface instanceof InterfaceC4890g0 ? (InterfaceC4890g0) queryLocalInterface : new C4886e0(readStrongBinder);
            } catch (V2.c e6) {
                e = e6;
                u2.i.g("Could not get remote MobileAdsSettingManager.", e);
                return null;
            } catch (RemoteException e9) {
                e = e9;
                u2.i.g("Could not get remote MobileAdsSettingManager.", e);
                return null;
            }
        }
        try {
            V2.b bVar2 = new V2.b(context);
            try {
                IBinder b9 = AbstractC0415a.I(context).b("com.google.android.gms.ads.ChimeraMobileAdsSettingManagerCreatorImpl");
                if (b9 == null) {
                    c4892h0 = null;
                } else {
                    IInterface queryLocalInterface2 = b9.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
                    c4892h0 = queryLocalInterface2 instanceof C4892h0 ? (C4892h0) queryLocalInterface2 : new C4892h0(b9);
                }
                Parcel A03 = c4892h0.A0();
                AbstractC3241g8.e(A03, bVar2);
                A03.writeInt(261710000);
                Parcel D03 = c4892h0.D0(A03, 1);
                IBinder readStrongBinder2 = D03.readStrongBinder();
                D03.recycle();
                if (readStrongBinder2 == null) {
                    return null;
                }
                IInterface queryLocalInterface3 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
                return queryLocalInterface3 instanceof InterfaceC4890g0 ? (InterfaceC4890g0) queryLocalInterface3 : new C4886e0(readStrongBinder2);
            } catch (Exception e10) {
                throw new u2.j(e10);
            }
        } catch (RemoteException e11) {
            e = e11;
            InterfaceC2466Ae a9 = C4287ze.a(context);
            c4903n.getClass();
            a9.e("ClientApiBroker.getMobileAdsSettingsManager", e);
            return null;
        } catch (NullPointerException e12) {
            e = e12;
            InterfaceC2466Ae a92 = C4287ze.a(context);
            c4903n.getClass();
            a92.e("ClientApiBroker.getMobileAdsSettingsManager", e);
            return null;
        } catch (u2.j e13) {
            e = e13;
            InterfaceC2466Ae a922 = C4287ze.a(context);
            c4903n.getClass();
            a922.e("ClientApiBroker.getMobileAdsSettingsManager", e);
            return null;
        }
    }

    @Override // q2.AbstractC4905o
    public final Object c(X x3) {
        return x3.Y0(new V2.b(this.f40094b), 261710000);
    }
}
