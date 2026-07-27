package q2;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.AbstractC3388j8;
import com.google.android.gms.internal.ads.AbstractC3569ma;
import com.google.android.gms.internal.ads.C2501Ce;
import com.google.android.gms.internal.ads.C2753Rb;
import com.google.android.gms.internal.ads.InterfaceC2518De;
import java.util.Objects;

/* renamed from: q2.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4892l extends AbstractC4898o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f40182b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C4896n f40183c;

    public C4892l(C4896n c4896n, Context context) {
        this.f40182b = context;
        Objects.requireNonNull(c4896n);
        this.f40183c = c4896n;
    }

    @Override // q2.AbstractC4898o
    public final Object a() {
        C4896n.p(this.f40182b, "mobile_ads_settings");
        return new R0();
    }

    @Override // q2.AbstractC4898o
    public final Object b() {
        C4885h0 c4885h0;
        Context context = this.f40182b;
        AbstractC3569ma.a(context);
        boolean booleanValue = ((Boolean) r.f40204e.f40207c.a(AbstractC3569ma.cc)).booleanValue();
        C4896n c4896n = this.f40183c;
        if (!booleanValue) {
            C2753Rb c2753Rb = (C2753Rb) c4896n.f40191w;
            try {
                W2.b bVar = new W2.b(context);
                C4885h0 c4885h02 = (C4885h0) c2753Rb.j(context);
                Parcel H02 = c4885h02.H0();
                AbstractC3388j8.e(H02, bVar);
                H02.writeInt(ModuleDescriptor.MODULE_VERSION);
                Parcel M02 = c4885h02.M0(H02, 1);
                IBinder readStrongBinder = M02.readStrongBinder();
                M02.recycle();
                if (readStrongBinder == null) {
                    return null;
                }
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
                return queryLocalInterface instanceof InterfaceC4883g0 ? (InterfaceC4883g0) queryLocalInterface : new C4879e0(readStrongBinder);
            } catch (W2.c e9) {
                e = e9;
                v2.i.g("Could not get remote MobileAdsSettingManager.", e);
                return null;
            } catch (RemoteException e10) {
                e = e10;
                v2.i.g("Could not get remote MobileAdsSettingManager.", e);
                return null;
            }
        }
        try {
            W2.b bVar2 = new W2.b(context);
            try {
                IBinder b9 = com.bumptech.glide.f.D(context).b("com.google.android.gms.ads.ChimeraMobileAdsSettingManagerCreatorImpl");
                if (b9 == null) {
                    c4885h0 = null;
                } else {
                    IInterface queryLocalInterface2 = b9.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
                    c4885h0 = queryLocalInterface2 instanceof C4885h0 ? (C4885h0) queryLocalInterface2 : new C4885h0(b9);
                }
                Parcel H03 = c4885h0.H0();
                AbstractC3388j8.e(H03, bVar2);
                H03.writeInt(ModuleDescriptor.MODULE_VERSION);
                Parcel M03 = c4885h0.M0(H03, 1);
                IBinder readStrongBinder2 = M03.readStrongBinder();
                M03.recycle();
                if (readStrongBinder2 == null) {
                    return null;
                }
                IInterface queryLocalInterface3 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
                return queryLocalInterface3 instanceof InterfaceC4883g0 ? (InterfaceC4883g0) queryLocalInterface3 : new C4879e0(readStrongBinder2);
            } catch (Exception e11) {
                throw new v2.j(e11);
            }
        } catch (RemoteException e12) {
            e = e12;
            InterfaceC2518De a9 = C2501Ce.a(context);
            c4896n.getClass();
            a9.e("ClientApiBroker.getMobileAdsSettingsManager", e);
            return null;
        } catch (NullPointerException e13) {
            e = e13;
            InterfaceC2518De a92 = C2501Ce.a(context);
            c4896n.getClass();
            a92.e("ClientApiBroker.getMobileAdsSettingsManager", e);
            return null;
        } catch (v2.j e14) {
            e = e14;
            InterfaceC2518De a922 = C2501Ce.a(context);
            c4896n.getClass();
            a922.e("ClientApiBroker.getMobileAdsSettingsManager", e);
            return null;
        }
    }

    @Override // q2.AbstractC4898o
    public final Object c(X x9) {
        return x9.v2(new W2.b(this.f40182b), ModuleDescriptor.MODULE_VERSION);
    }
}
