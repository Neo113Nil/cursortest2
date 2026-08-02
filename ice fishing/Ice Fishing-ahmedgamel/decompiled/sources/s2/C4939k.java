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

/* renamed from: s2.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4939k extends AbstractC4947o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f40481b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BinderC3487kd f40482c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C4945n f40483d;

    public C4939k(C4945n c4945n, Context context, BinderC3487kd binderC3487kd) {
        this.f40481b = context;
        this.f40482c = binderC3487kd;
        Objects.requireNonNull(c4945n);
        this.f40483d = c4945n;
    }

    @Override // s2.AbstractC4947o
    public final /* bridge */ /* synthetic */ Object a() {
        C4945n.p(this.f40481b, "ads_preloader");
        return null;
    }

    @Override // s2.AbstractC4947o
    public final Object b() {
        T t6;
        S q8;
        Context context = this.f40481b;
        Y2.b bVar = new Y2.b(context);
        AbstractC3592ma.a(context);
        boolean booleanValue = ((Boolean) r.f40506e.f40509c.a(AbstractC3592ma.cc)).booleanValue();
        BinderC3487kd binderC3487kd = this.f40482c;
        C4945n c4945n = this.f40483d;
        if (!booleanValue) {
            C2773Rb c2773Rb = (C2773Rb) c4945n.f40496z;
            try {
                Y2.b bVar2 = new Y2.b(context);
                T t9 = (T) c2773Rb.i(context);
                Parcel F02 = t9.F0();
                AbstractC3411j8.e(F02, bVar2);
                AbstractC3411j8.e(F02, binderC3487kd);
                F02.writeInt(ModuleDescriptor.MODULE_VERSION);
                Parcel K02 = t9.K0(F02, 1);
                IBinder readStrongBinder = K02.readStrongBinder();
                K02.recycle();
                if (readStrongBinder == null) {
                    return null;
                }
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloader");
                return queryLocalInterface instanceof S ? (S) queryLocalInterface : new Q(readStrongBinder);
            } catch (Y2.c e9) {
                e = e9;
                x2.i.g("Could not get remote AdPreloaderCreator.", e);
                return null;
            } catch (RemoteException e10) {
                e = e10;
                x2.i.g("Could not get remote AdPreloaderCreator.", e);
                return null;
            } catch (NullPointerException e11) {
                e = e11;
                x2.i.g("Could not get remote AdPreloaderCreator.", e);
                return null;
            }
        }
        try {
            try {
                IBinder b9 = com.bumptech.glide.e.y(context).b("com.google.android.gms.ads.ChimeraAdPreloaderCreatorImpl");
                if (b9 == null) {
                    t6 = null;
                } else {
                    IInterface queryLocalInterface2 = b9.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloaderCreator");
                    t6 = queryLocalInterface2 instanceof T ? (T) queryLocalInterface2 : new T(b9);
                }
                Parcel F03 = t6.F0();
                AbstractC3411j8.e(F03, bVar);
                AbstractC3411j8.e(F03, binderC3487kd);
                F03.writeInt(ModuleDescriptor.MODULE_VERSION);
                Parcel K03 = t6.K0(F03, 1);
                IBinder readStrongBinder2 = K03.readStrongBinder();
                K03.recycle();
                if (readStrongBinder2 == null) {
                    q8 = null;
                } else {
                    IInterface queryLocalInterface3 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloader");
                    q8 = queryLocalInterface3 instanceof S ? (S) queryLocalInterface3 : new Q(readStrongBinder2);
                }
                q8.U0(binderC3487kd);
                return q8;
            } catch (Exception e12) {
                throw new x2.j(e12);
            }
        } catch (RemoteException e13) {
            e = e13;
            InterfaceC2538De a9 = C2521Ce.a(context);
            c4945n.getClass();
            a9.e("ClientApiBroker.getAdPreloader", e);
            return null;
        } catch (NullPointerException e14) {
            e = e14;
            InterfaceC2538De a92 = C2521Ce.a(context);
            c4945n.getClass();
            a92.e("ClientApiBroker.getAdPreloader", e);
            return null;
        } catch (x2.j e15) {
            e = e15;
            InterfaceC2538De a922 = C2521Ce.a(context);
            c4945n.getClass();
            a922.e("ClientApiBroker.getAdPreloader", e);
            return null;
        }
    }

    @Override // s2.AbstractC4947o
    public final Object c(X x9) {
        return x9.U1(new Y2.b(this.f40481b), this.f40482c, ModuleDescriptor.MODULE_VERSION);
    }
}
