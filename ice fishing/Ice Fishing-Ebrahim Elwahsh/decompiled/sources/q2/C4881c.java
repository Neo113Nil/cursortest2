package q2;

import a.AbstractC0415a;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.AdActivity;
import com.google.android.gms.internal.ads.AbstractBinderC3372ie;
import com.google.android.gms.internal.ads.AbstractBinderC3532le;
import com.google.android.gms.internal.ads.AbstractC3241g8;
import com.google.android.gms.internal.ads.AbstractC3368ia;
import com.google.android.gms.internal.ads.C2684Nb;
import com.google.android.gms.internal.ads.C3318he;
import com.google.android.gms.internal.ads.C3478ke;
import com.google.android.gms.internal.ads.C4287ze;
import com.google.android.gms.internal.ads.InterfaceC2466Ae;
import com.google.android.gms.internal.ads.InterfaceC3424je;
import com.google.android.gms.internal.ads.InterfaceC3586me;
import java.util.Objects;

/* renamed from: q2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4881c extends AbstractC4905o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AdActivity f40002b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C4903n f40003c;

    public C4881c(C4903n c4903n, AdActivity adActivity) {
        this.f40002b = adActivity;
        Objects.requireNonNull(c4903n);
        this.f40003c = c4903n;
    }

    @Override // q2.AbstractC4905o
    public final /* bridge */ /* synthetic */ Object a() {
        C4903n.p(this.f40002b, "ad_overlay");
        return null;
    }

    @Override // q2.AbstractC4905o
    public final Object b() {
        InterfaceC3586me c3478ke;
        AdActivity adActivity = this.f40002b;
        AbstractC3368ia.a(adActivity);
        boolean booleanValue = ((Boolean) r.f40116e.f40119c.a(AbstractC3368ia.cc)).booleanValue();
        C4903n c4903n = this.f40003c;
        if (!booleanValue) {
            C2684Nb c2684Nb = (C2684Nb) c4903n.f40105y;
            try {
                V2.b bVar = new V2.b(adActivity);
                C3478ke c3478ke2 = (C3478ke) ((InterfaceC3586me) c2684Nb.j(adActivity));
                Parcel A02 = c3478ke2.A0();
                AbstractC3241g8.e(A02, bVar);
                Parcel D02 = c3478ke2.D0(A02, 1);
                IBinder readStrongBinder = D02.readStrongBinder();
                D02.recycle();
                if (readStrongBinder == null) {
                    return null;
                }
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
                return queryLocalInterface instanceof InterfaceC3424je ? (InterfaceC3424je) queryLocalInterface : new C3318he(readStrongBinder);
            } catch (V2.c e6) {
                u2.i.g("Could not create remote AdOverlay.", e6);
                return null;
            } catch (RemoteException e9) {
                u2.i.g("Could not create remote AdOverlay.", e9);
                return null;
            }
        }
        try {
            V2.b bVar2 = new V2.b(adActivity);
            try {
                IBinder b9 = AbstractC0415a.I(adActivity).b("com.google.android.gms.ads.ChimeraAdOverlayCreatorImpl");
                int i = AbstractBinderC3532le.f32572n;
                if (b9 == null) {
                    c3478ke = null;
                } else {
                    IInterface queryLocalInterface2 = b9.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
                    c3478ke = queryLocalInterface2 instanceof InterfaceC3586me ? (InterfaceC3586me) queryLocalInterface2 : new C3478ke(b9);
                }
                C3478ke c3478ke3 = (C3478ke) c3478ke;
                Parcel A03 = c3478ke3.A0();
                AbstractC3241g8.e(A03, bVar2);
                Parcel D03 = c3478ke3.D0(A03, 1);
                IBinder readStrongBinder2 = D03.readStrongBinder();
                D03.recycle();
                int i4 = AbstractBinderC3372ie.f31860n;
                if (readStrongBinder2 == null) {
                    return null;
                }
                IInterface queryLocalInterface3 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
                return queryLocalInterface3 instanceof InterfaceC3424je ? (InterfaceC3424je) queryLocalInterface3 : new C3318he(readStrongBinder2);
            } catch (Exception e10) {
                throw new u2.j(e10);
            }
        } catch (RemoteException | NullPointerException | u2.j e11) {
            InterfaceC2466Ae a9 = C4287ze.a(adActivity.getApplicationContext());
            c4903n.getClass();
            a9.e("ClientApiBroker.createAdOverlay", e11);
            return null;
        }
    }

    @Override // q2.AbstractC4905o
    public final Object c(X x3) {
        return x3.V(new V2.b(this.f40002b));
    }
}
