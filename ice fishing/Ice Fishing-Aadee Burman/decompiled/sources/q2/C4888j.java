package q2;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.AbstractC3388j8;
import com.google.android.gms.internal.ads.AbstractC3569ma;
import com.google.android.gms.internal.ads.BinderC3464kd;
import com.google.android.gms.internal.ads.C2501Ce;
import com.google.android.gms.internal.ads.C2753Rb;
import com.google.android.gms.internal.ads.InterfaceC2518De;
import java.util.Objects;

/* renamed from: q2.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4888j extends AbstractC4898o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f40175b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f40176c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ BinderC3464kd f40177d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C4896n f40178e;

    public C4888j(C4896n c4896n, Context context, String str, BinderC3464kd binderC3464kd) {
        this.f40175b = context;
        this.f40176c = str;
        this.f40177d = binderC3464kd;
        Objects.requireNonNull(c4896n);
        this.f40178e = c4896n;
    }

    @Override // q2.AbstractC4898o
    public final Object a() {
        C4896n.p(this.f40175b, "native_ad");
        return new P0();
    }

    @Override // q2.AbstractC4898o
    public final Object b() {
        H h9;
        Context context = this.f40175b;
        AbstractC3569ma.a(context);
        boolean booleanValue = ((Boolean) r.f40204e.f40207c.a(AbstractC3569ma.cc)).booleanValue();
        BinderC3464kd binderC3464kd = this.f40177d;
        C4896n c4896n = this.f40178e;
        String str = this.f40176c;
        if (!booleanValue) {
            C2753Rb c2753Rb = (C2753Rb) c4896n.f40190v;
            try {
                W2.b bVar = new W2.b(context);
                H h10 = (H) c2753Rb.j(context);
                Parcel H02 = h10.H0();
                AbstractC3388j8.e(H02, bVar);
                H02.writeString(str);
                AbstractC3388j8.e(H02, binderC3464kd);
                H02.writeInt(ModuleDescriptor.MODULE_VERSION);
                Parcel M02 = h10.M0(H02, 1);
                IBinder readStrongBinder = M02.readStrongBinder();
                M02.recycle();
                if (readStrongBinder == null) {
                    return null;
                }
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
                return queryLocalInterface instanceof G ? (G) queryLocalInterface : new E(readStrongBinder);
            } catch (W2.c e9) {
                e = e9;
                v2.i.g("Could not create remote builder for AdLoader.", e);
                return null;
            } catch (RemoteException e10) {
                e = e10;
                v2.i.g("Could not create remote builder for AdLoader.", e);
                return null;
            }
        }
        try {
            W2.b bVar2 = new W2.b(context);
            try {
                IBinder b9 = com.bumptech.glide.f.D(context).b("com.google.android.gms.ads.ChimeraAdLoaderBuilderCreatorImpl");
                if (b9 == null) {
                    h9 = null;
                } else {
                    IInterface queryLocalInterface2 = b9.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
                    h9 = queryLocalInterface2 instanceof H ? (H) queryLocalInterface2 : new H(b9);
                }
                Parcel H03 = h9.H0();
                AbstractC3388j8.e(H03, bVar2);
                H03.writeString(str);
                AbstractC3388j8.e(H03, binderC3464kd);
                H03.writeInt(ModuleDescriptor.MODULE_VERSION);
                Parcel M03 = h9.M0(H03, 1);
                IBinder readStrongBinder2 = M03.readStrongBinder();
                M03.recycle();
                if (readStrongBinder2 == null) {
                    return null;
                }
                IInterface queryLocalInterface3 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
                return queryLocalInterface3 instanceof G ? (G) queryLocalInterface3 : new E(readStrongBinder2);
            } catch (Exception e11) {
                throw new v2.j(e11);
            }
        } catch (RemoteException e12) {
            e = e12;
            InterfaceC2518De a9 = C2501Ce.a(context);
            c4896n.getClass();
            a9.e("ClientApiBroker.createAdLoaderBuilder", e);
            return null;
        } catch (NullPointerException e13) {
            e = e13;
            InterfaceC2518De a92 = C2501Ce.a(context);
            c4896n.getClass();
            a92.e("ClientApiBroker.createAdLoaderBuilder", e);
            return null;
        } catch (v2.j e14) {
            e = e14;
            InterfaceC2518De a922 = C2501Ce.a(context);
            c4896n.getClass();
            a922.e("ClientApiBroker.createAdLoaderBuilder", e);
            return null;
        }
    }

    @Override // q2.AbstractC4898o
    public final Object c(X x9) {
        return x9.N2(new W2.b(this.f40175b), this.f40176c, this.f40177d, ModuleDescriptor.MODULE_VERSION);
    }
}
