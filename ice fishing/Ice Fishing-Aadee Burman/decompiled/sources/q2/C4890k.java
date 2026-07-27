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

/* renamed from: q2.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4890k extends AbstractC4898o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f40179b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BinderC3464kd f40180c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C4896n f40181d;

    public C4890k(C4896n c4896n, Context context, BinderC3464kd binderC3464kd) {
        this.f40179b = context;
        this.f40180c = binderC3464kd;
        Objects.requireNonNull(c4896n);
        this.f40181d = c4896n;
    }

    @Override // q2.AbstractC4898o
    public final /* bridge */ /* synthetic */ Object a() {
        C4896n.p(this.f40179b, "ads_preloader");
        return null;
    }

    @Override // q2.AbstractC4898o
    public final Object b() {
        T t6;
        S q8;
        Context context = this.f40179b;
        W2.b bVar = new W2.b(context);
        AbstractC3569ma.a(context);
        boolean booleanValue = ((Boolean) r.f40204e.f40207c.a(AbstractC3569ma.cc)).booleanValue();
        BinderC3464kd binderC3464kd = this.f40180c;
        C4896n c4896n = this.f40181d;
        if (!booleanValue) {
            C2753Rb c2753Rb = (C2753Rb) c4896n.f40194z;
            try {
                W2.b bVar2 = new W2.b(context);
                T t9 = (T) c2753Rb.j(context);
                Parcel H02 = t9.H0();
                AbstractC3388j8.e(H02, bVar2);
                AbstractC3388j8.e(H02, binderC3464kd);
                H02.writeInt(ModuleDescriptor.MODULE_VERSION);
                Parcel M02 = t9.M0(H02, 1);
                IBinder readStrongBinder = M02.readStrongBinder();
                M02.recycle();
                if (readStrongBinder == null) {
                    return null;
                }
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloader");
                return queryLocalInterface instanceof S ? (S) queryLocalInterface : new Q(readStrongBinder);
            } catch (W2.c e9) {
                e = e9;
                v2.i.g("Could not get remote AdPreloaderCreator.", e);
                return null;
            } catch (RemoteException e10) {
                e = e10;
                v2.i.g("Could not get remote AdPreloaderCreator.", e);
                return null;
            } catch (NullPointerException e11) {
                e = e11;
                v2.i.g("Could not get remote AdPreloaderCreator.", e);
                return null;
            }
        }
        try {
            try {
                IBinder b9 = com.bumptech.glide.f.D(context).b("com.google.android.gms.ads.ChimeraAdPreloaderCreatorImpl");
                if (b9 == null) {
                    t6 = null;
                } else {
                    IInterface queryLocalInterface2 = b9.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloaderCreator");
                    t6 = queryLocalInterface2 instanceof T ? (T) queryLocalInterface2 : new T(b9);
                }
                Parcel H03 = t6.H0();
                AbstractC3388j8.e(H03, bVar);
                AbstractC3388j8.e(H03, binderC3464kd);
                H03.writeInt(ModuleDescriptor.MODULE_VERSION);
                Parcel M03 = t6.M0(H03, 1);
                IBinder readStrongBinder2 = M03.readStrongBinder();
                M03.recycle();
                if (readStrongBinder2 == null) {
                    q8 = null;
                } else {
                    IInterface queryLocalInterface3 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloader");
                    q8 = queryLocalInterface3 instanceof S ? (S) queryLocalInterface3 : new Q(readStrongBinder2);
                }
                q8.V0(binderC3464kd);
                return q8;
            } catch (Exception e12) {
                throw new v2.j(e12);
            }
        } catch (RemoteException e13) {
            e = e13;
            InterfaceC2518De a9 = C2501Ce.a(context);
            c4896n.getClass();
            a9.e("ClientApiBroker.getAdPreloader", e);
            return null;
        } catch (NullPointerException e14) {
            e = e14;
            InterfaceC2518De a92 = C2501Ce.a(context);
            c4896n.getClass();
            a92.e("ClientApiBroker.getAdPreloader", e);
            return null;
        } catch (v2.j e15) {
            e = e15;
            InterfaceC2518De a922 = C2501Ce.a(context);
            c4896n.getClass();
            a922.e("ClientApiBroker.getAdPreloader", e);
            return null;
        }
    }

    @Override // q2.AbstractC4898o
    public final Object c(X x9) {
        return x9.y1(new W2.b(this.f40179b), this.f40180c, ModuleDescriptor.MODULE_VERSION);
    }
}
