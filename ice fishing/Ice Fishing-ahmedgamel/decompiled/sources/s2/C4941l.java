package s2;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.AbstractC3411j8;
import com.google.android.gms.internal.ads.AbstractC3592ma;
import com.google.android.gms.internal.ads.C2521Ce;
import com.google.android.gms.internal.ads.C2773Rb;
import com.google.android.gms.internal.ads.InterfaceC2538De;
import java.util.Objects;

/* renamed from: s2.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4941l extends AbstractC4947o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f40484b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C4945n f40485c;

    public C4941l(C4945n c4945n, Context context) {
        this.f40484b = context;
        Objects.requireNonNull(c4945n);
        this.f40485c = c4945n;
    }

    @Override // s2.AbstractC4947o
    public final Object a() {
        C4945n.p(this.f40484b, "mobile_ads_settings");
        return new R0();
    }

    @Override // s2.AbstractC4947o
    public final Object b() {
        C4934h0 c4934h0;
        Context context = this.f40484b;
        AbstractC3592ma.a(context);
        boolean booleanValue = ((Boolean) r.f40506e.f40509c.a(AbstractC3592ma.cc)).booleanValue();
        C4945n c4945n = this.f40485c;
        if (!booleanValue) {
            C2773Rb c2773Rb = (C2773Rb) c4945n.f40493w;
            try {
                Y2.b bVar = new Y2.b(context);
                C4934h0 c4934h02 = (C4934h0) c2773Rb.i(context);
                Parcel F02 = c4934h02.F0();
                AbstractC3411j8.e(F02, bVar);
                F02.writeInt(ModuleDescriptor.MODULE_VERSION);
                Parcel K02 = c4934h02.K0(F02, 1);
                IBinder readStrongBinder = K02.readStrongBinder();
                K02.recycle();
                if (readStrongBinder == null) {
                    return null;
                }
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
                return queryLocalInterface instanceof InterfaceC4932g0 ? (InterfaceC4932g0) queryLocalInterface : new C4928e0(readStrongBinder);
            } catch (Y2.c e9) {
                e = e9;
                x2.i.g("Could not get remote MobileAdsSettingManager.", e);
                return null;
            } catch (RemoteException e10) {
                e = e10;
                x2.i.g("Could not get remote MobileAdsSettingManager.", e);
                return null;
            }
        }
        try {
            Y2.b bVar2 = new Y2.b(context);
            try {
                IBinder b9 = com.bumptech.glide.e.y(context).b("com.google.android.gms.ads.ChimeraMobileAdsSettingManagerCreatorImpl");
                if (b9 == null) {
                    c4934h0 = null;
                } else {
                    IInterface queryLocalInterface2 = b9.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
                    c4934h0 = queryLocalInterface2 instanceof C4934h0 ? (C4934h0) queryLocalInterface2 : new C4934h0(b9);
                }
                Parcel F03 = c4934h0.F0();
                AbstractC3411j8.e(F03, bVar2);
                F03.writeInt(ModuleDescriptor.MODULE_VERSION);
                Parcel K03 = c4934h0.K0(F03, 1);
                IBinder readStrongBinder2 = K03.readStrongBinder();
                K03.recycle();
                if (readStrongBinder2 == null) {
                    return null;
                }
                IInterface queryLocalInterface3 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
                return queryLocalInterface3 instanceof InterfaceC4932g0 ? (InterfaceC4932g0) queryLocalInterface3 : new C4928e0(readStrongBinder2);
            } catch (Exception e11) {
                throw new x2.j(e11);
            }
        } catch (RemoteException e12) {
            e = e12;
            InterfaceC2538De a9 = C2521Ce.a(context);
            c4945n.getClass();
            a9.e("ClientApiBroker.getMobileAdsSettingsManager", e);
            return null;
        } catch (NullPointerException e13) {
            e = e13;
            InterfaceC2538De a92 = C2521Ce.a(context);
            c4945n.getClass();
            a92.e("ClientApiBroker.getMobileAdsSettingsManager", e);
            return null;
        } catch (x2.j e14) {
            e = e14;
            InterfaceC2538De a922 = C2521Ce.a(context);
            c4945n.getClass();
            a922.e("ClientApiBroker.getMobileAdsSettingsManager", e);
            return null;
        }
    }

    @Override // s2.AbstractC4947o
    public final Object c(X x9) {
        return x9.Q3(new Y2.b(this.f40484b), ModuleDescriptor.MODULE_VERSION);
    }
}
