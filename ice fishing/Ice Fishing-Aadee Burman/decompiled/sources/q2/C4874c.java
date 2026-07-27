package q2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.AdActivity;
import com.google.android.gms.internal.ads.AbstractBinderC3519le;
import com.google.android.gms.internal.ads.AbstractBinderC3681oe;
import com.google.android.gms.internal.ads.AbstractC3388j8;
import com.google.android.gms.internal.ads.AbstractC3569ma;
import com.google.android.gms.internal.ads.C2501Ce;
import com.google.android.gms.internal.ads.C2753Rb;
import com.google.android.gms.internal.ads.C3465ke;
import com.google.android.gms.internal.ads.C3627ne;
import com.google.android.gms.internal.ads.InterfaceC2518De;
import com.google.android.gms.internal.ads.InterfaceC3573me;
import com.google.android.gms.internal.ads.InterfaceC3735pe;
import java.util.Objects;

/* renamed from: q2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4874c extends AbstractC4898o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AdActivity f40092b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C4896n f40093c;

    public C4874c(C4896n c4896n, AdActivity adActivity) {
        this.f40092b = adActivity;
        Objects.requireNonNull(c4896n);
        this.f40093c = c4896n;
    }

    @Override // q2.AbstractC4898o
    public final /* bridge */ /* synthetic */ Object a() {
        C4896n.p(this.f40092b, "ad_overlay");
        return null;
    }

    @Override // q2.AbstractC4898o
    public final Object b() {
        InterfaceC3735pe c3627ne;
        AdActivity adActivity = this.f40092b;
        AbstractC3569ma.a(adActivity);
        boolean booleanValue = ((Boolean) r.f40204e.f40207c.a(AbstractC3569ma.cc)).booleanValue();
        C4896n c4896n = this.f40093c;
        if (!booleanValue) {
            C2753Rb c2753Rb = (C2753Rb) c4896n.f40193y;
            try {
                W2.b bVar = new W2.b(adActivity);
                C3627ne c3627ne2 = (C3627ne) ((InterfaceC3735pe) c2753Rb.j(adActivity));
                Parcel H02 = c3627ne2.H0();
                AbstractC3388j8.e(H02, bVar);
                Parcel M02 = c3627ne2.M0(H02, 1);
                IBinder readStrongBinder = M02.readStrongBinder();
                M02.recycle();
                if (readStrongBinder == null) {
                    return null;
                }
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
                return queryLocalInterface instanceof InterfaceC3573me ? (InterfaceC3573me) queryLocalInterface : new C3465ke(readStrongBinder);
            } catch (W2.c e9) {
                v2.i.g("Could not create remote AdOverlay.", e9);
                return null;
            } catch (RemoteException e10) {
                v2.i.g("Could not create remote AdOverlay.", e10);
                return null;
            }
        }
        try {
            W2.b bVar2 = new W2.b(adActivity);
            try {
                IBinder b9 = com.bumptech.glide.f.D(adActivity).b("com.google.android.gms.ads.ChimeraAdOverlayCreatorImpl");
                int i = AbstractBinderC3681oe.f32915n;
                if (b9 == null) {
                    c3627ne = null;
                } else {
                    IInterface queryLocalInterface2 = b9.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
                    c3627ne = queryLocalInterface2 instanceof InterfaceC3735pe ? (InterfaceC3735pe) queryLocalInterface2 : new C3627ne(b9);
                }
                C3627ne c3627ne3 = (C3627ne) c3627ne;
                Parcel H03 = c3627ne3.H0();
                AbstractC3388j8.e(H03, bVar2);
                Parcel M03 = c3627ne3.M0(H03, 1);
                IBinder readStrongBinder2 = M03.readStrongBinder();
                M03.recycle();
                int i6 = AbstractBinderC3519le.f31772n;
                if (readStrongBinder2 == null) {
                    return null;
                }
                IInterface queryLocalInterface3 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
                return queryLocalInterface3 instanceof InterfaceC3573me ? (InterfaceC3573me) queryLocalInterface3 : new C3465ke(readStrongBinder2);
            } catch (Exception e11) {
                throw new v2.j(e11);
            }
        } catch (RemoteException | NullPointerException | v2.j e12) {
            InterfaceC2518De a9 = C2501Ce.a(adActivity.getApplicationContext());
            c4896n.getClass();
            a9.e("ClientApiBroker.createAdOverlay", e12);
            return null;
        }
    }

    @Override // q2.AbstractC4898o
    public final Object c(X x9) {
        return x9.zzf(new W2.b(this.f40092b));
    }
}
