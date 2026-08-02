package s2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.AdActivity;
import com.google.android.gms.internal.ads.AbstractBinderC3542le;
import com.google.android.gms.internal.ads.AbstractBinderC3704oe;
import com.google.android.gms.internal.ads.AbstractC3411j8;
import com.google.android.gms.internal.ads.AbstractC3592ma;
import com.google.android.gms.internal.ads.C2521Ce;
import com.google.android.gms.internal.ads.C2773Rb;
import com.google.android.gms.internal.ads.C3488ke;
import com.google.android.gms.internal.ads.C3650ne;
import com.google.android.gms.internal.ads.InterfaceC2538De;
import com.google.android.gms.internal.ads.InterfaceC3596me;
import com.google.android.gms.internal.ads.InterfaceC3758pe;
import java.util.Objects;

/* renamed from: s2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4923c extends AbstractC4947o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AdActivity f40394b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C4945n f40395c;

    public C4923c(C4945n c4945n, AdActivity adActivity) {
        this.f40394b = adActivity;
        Objects.requireNonNull(c4945n);
        this.f40395c = c4945n;
    }

    @Override // s2.AbstractC4947o
    public final /* bridge */ /* synthetic */ Object a() {
        C4945n.p(this.f40394b, "ad_overlay");
        return null;
    }

    @Override // s2.AbstractC4947o
    public final Object b() {
        InterfaceC3758pe c3650ne;
        AdActivity adActivity = this.f40394b;
        AbstractC3592ma.a(adActivity);
        boolean booleanValue = ((Boolean) r.f40506e.f40509c.a(AbstractC3592ma.cc)).booleanValue();
        C4945n c4945n = this.f40395c;
        if (!booleanValue) {
            C2773Rb c2773Rb = (C2773Rb) c4945n.f40495y;
            try {
                Y2.b bVar = new Y2.b(adActivity);
                C3650ne c3650ne2 = (C3650ne) ((InterfaceC3758pe) c2773Rb.i(adActivity));
                Parcel F02 = c3650ne2.F0();
                AbstractC3411j8.e(F02, bVar);
                Parcel K02 = c3650ne2.K0(F02, 1);
                IBinder readStrongBinder = K02.readStrongBinder();
                K02.recycle();
                if (readStrongBinder == null) {
                    return null;
                }
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
                return queryLocalInterface instanceof InterfaceC3596me ? (InterfaceC3596me) queryLocalInterface : new C3488ke(readStrongBinder);
            } catch (Y2.c e9) {
                x2.i.g("Could not create remote AdOverlay.", e9);
                return null;
            } catch (RemoteException e10) {
                x2.i.g("Could not create remote AdOverlay.", e10);
                return null;
            }
        }
        try {
            Y2.b bVar2 = new Y2.b(adActivity);
            try {
                IBinder b9 = com.bumptech.glide.e.y(adActivity).b("com.google.android.gms.ads.ChimeraAdOverlayCreatorImpl");
                int i = AbstractBinderC3704oe.f33701n;
                if (b9 == null) {
                    c3650ne = null;
                } else {
                    IInterface queryLocalInterface2 = b9.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
                    c3650ne = queryLocalInterface2 instanceof InterfaceC3758pe ? (InterfaceC3758pe) queryLocalInterface2 : new C3650ne(b9);
                }
                C3650ne c3650ne3 = (C3650ne) c3650ne;
                Parcel F03 = c3650ne3.F0();
                AbstractC3411j8.e(F03, bVar2);
                Parcel K03 = c3650ne3.K0(F03, 1);
                IBinder readStrongBinder2 = K03.readStrongBinder();
                K03.recycle();
                int i4 = AbstractBinderC3542le.f32551n;
                if (readStrongBinder2 == null) {
                    return null;
                }
                IInterface queryLocalInterface3 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
                return queryLocalInterface3 instanceof InterfaceC3596me ? (InterfaceC3596me) queryLocalInterface3 : new C3488ke(readStrongBinder2);
            } catch (Exception e11) {
                throw new x2.j(e11);
            }
        } catch (RemoteException | NullPointerException | x2.j e12) {
            InterfaceC2538De a9 = C2521Ce.a(adActivity.getApplicationContext());
            c4945n.getClass();
            a9.e("ClientApiBroker.createAdOverlay", e12);
            return null;
        }
    }

    @Override // s2.AbstractC4947o
    public final Object c(X x9) {
        return x9.zzf(new Y2.b(this.f40394b));
    }
}
