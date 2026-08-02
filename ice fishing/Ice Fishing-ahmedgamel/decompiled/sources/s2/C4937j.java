package s2;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.AbstractC3411j8;
import com.google.android.gms.internal.ads.AbstractC3592ma;
import com.google.android.gms.internal.ads.BinderC3487kd;
import com.google.android.gms.internal.ads.C2521Ce;
import com.google.android.gms.internal.ads.C2773Rb;
import com.google.android.gms.internal.ads.InterfaceC2538De;
import java.util.Objects;

/* renamed from: s2.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4937j extends AbstractC4947o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f40477b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f40478c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ BinderC3487kd f40479d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C4945n f40480e;

    public C4937j(C4945n c4945n, Context context, String str, BinderC3487kd binderC3487kd) {
        this.f40477b = context;
        this.f40478c = str;
        this.f40479d = binderC3487kd;
        Objects.requireNonNull(c4945n);
        this.f40480e = c4945n;
    }

    @Override // s2.AbstractC4947o
    public final Object a() {
        C4945n.p(this.f40477b, "native_ad");
        return new P0();
    }

    @Override // s2.AbstractC4947o
    public final Object b() {
        H h3;
        Context context = this.f40477b;
        AbstractC3592ma.a(context);
        boolean booleanValue = ((Boolean) r.f40506e.f40509c.a(AbstractC3592ma.cc)).booleanValue();
        BinderC3487kd binderC3487kd = this.f40479d;
        C4945n c4945n = this.f40480e;
        String str = this.f40478c;
        if (!booleanValue) {
            C2773Rb c2773Rb = (C2773Rb) c4945n.f40492v;
            try {
                Y2.b bVar = new Y2.b(context);
                H h9 = (H) c2773Rb.i(context);
                Parcel F02 = h9.F0();
                AbstractC3411j8.e(F02, bVar);
                F02.writeString(str);
                AbstractC3411j8.e(F02, binderC3487kd);
                F02.writeInt(ModuleDescriptor.MODULE_VERSION);
                Parcel K02 = h9.K0(F02, 1);
                IBinder readStrongBinder = K02.readStrongBinder();
                K02.recycle();
                if (readStrongBinder == null) {
                    return null;
                }
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
                return queryLocalInterface instanceof G ? (G) queryLocalInterface : new E(readStrongBinder);
            } catch (Y2.c e9) {
                e = e9;
                x2.i.g("Could not create remote builder for AdLoader.", e);
                return null;
            } catch (RemoteException e10) {
                e = e10;
                x2.i.g("Could not create remote builder for AdLoader.", e);
                return null;
            }
        }
        try {
            Y2.b bVar2 = new Y2.b(context);
            try {
                IBinder b9 = com.bumptech.glide.e.y(context).b("com.google.android.gms.ads.ChimeraAdLoaderBuilderCreatorImpl");
                if (b9 == null) {
                    h3 = null;
                } else {
                    IInterface queryLocalInterface2 = b9.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
                    h3 = queryLocalInterface2 instanceof H ? (H) queryLocalInterface2 : new H(b9);
                }
                Parcel F03 = h3.F0();
                AbstractC3411j8.e(F03, bVar2);
                F03.writeString(str);
                AbstractC3411j8.e(F03, binderC3487kd);
                F03.writeInt(ModuleDescriptor.MODULE_VERSION);
                Parcel K03 = h3.K0(F03, 1);
                IBinder readStrongBinder2 = K03.readStrongBinder();
                K03.recycle();
                if (readStrongBinder2 == null) {
                    return null;
                }
                IInterface queryLocalInterface3 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
                return queryLocalInterface3 instanceof G ? (G) queryLocalInterface3 : new E(readStrongBinder2);
            } catch (Exception e11) {
                throw new x2.j(e11);
            }
        } catch (RemoteException e12) {
            e = e12;
            InterfaceC2538De a9 = C2521Ce.a(context);
            c4945n.getClass();
            a9.e("ClientApiBroker.createAdLoaderBuilder", e);
            return null;
        } catch (NullPointerException e13) {
            e = e13;
            InterfaceC2538De a92 = C2521Ce.a(context);
            c4945n.getClass();
            a92.e("ClientApiBroker.createAdLoaderBuilder", e);
            return null;
        } catch (x2.j e14) {
            e = e14;
            InterfaceC2538De a922 = C2521Ce.a(context);
            c4945n.getClass();
            a922.e("ClientApiBroker.createAdLoaderBuilder", e);
            return null;
        }
    }

    @Override // s2.AbstractC4947o
    public final Object c(X x9) {
        return x9.D1(new Y2.b(this.f40477b), this.f40478c, this.f40479d, ModuleDescriptor.MODULE_VERSION);
    }
}
