package q2;

import a.AbstractC0415a;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.widget.FrameLayout;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.google.android.gms.internal.ads.AbstractBinderC3799qb;
import com.google.android.gms.internal.ads.AbstractBinderC3960tb;
import com.google.android.gms.internal.ads.AbstractC3241g8;
import com.google.android.gms.internal.ads.AbstractC3368ia;
import com.google.android.gms.internal.ads.C2684Nb;
import com.google.android.gms.internal.ads.C3745pb;
import com.google.android.gms.internal.ads.C3906sb;
import com.google.android.gms.internal.ads.C4287ze;
import com.google.android.gms.internal.ads.InterfaceC2466Ae;
import com.google.android.gms.internal.ads.InterfaceC3852rb;
import com.google.android.gms.internal.ads.InterfaceC4014ub;
import java.util.Objects;

/* renamed from: q2.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4901m extends AbstractC4905o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NativeAdView f40096b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ FrameLayout f40097c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f40098d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C4903n f40099e;

    public C4901m(C4903n c4903n, NativeAdView nativeAdView, FrameLayout frameLayout, Context context) {
        this.f40096b = nativeAdView;
        this.f40097c = frameLayout;
        this.f40098d = context;
        Objects.requireNonNull(c4903n);
        this.f40099e = c4903n;
    }

    @Override // q2.AbstractC4905o
    public final Object a() {
        C4903n.p(this.f40098d, "native_ad_view_delegate");
        return new T0();
    }

    @Override // q2.AbstractC4905o
    public final Object b() {
        IInterface c3906sb;
        Context context = this.f40098d;
        AbstractC3368ia.a(context);
        boolean booleanValue = ((Boolean) r.f40116e.f40119c.a(AbstractC3368ia.cc)).booleanValue();
        FrameLayout frameLayout = this.f40097c;
        NativeAdView nativeAdView = this.f40096b;
        C4903n c4903n = this.f40099e;
        if (!booleanValue) {
            C2684Nb c2684Nb = (C2684Nb) c4903n.f40104x;
            try {
                V2.b bVar = new V2.b(context);
                V2.b bVar2 = new V2.b(nativeAdView);
                V2.b bVar3 = new V2.b(frameLayout);
                C3906sb c3906sb2 = (C3906sb) ((InterfaceC4014ub) c2684Nb.j(context));
                Parcel A02 = c3906sb2.A0();
                AbstractC3241g8.e(A02, bVar);
                AbstractC3241g8.e(A02, bVar2);
                AbstractC3241g8.e(A02, bVar3);
                A02.writeInt(261710000);
                Parcel D02 = c3906sb2.D0(A02, 1);
                IBinder readStrongBinder = D02.readStrongBinder();
                D02.recycle();
                if (readStrongBinder == null) {
                    return null;
                }
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
                return queryLocalInterface instanceof InterfaceC3852rb ? (InterfaceC3852rb) queryLocalInterface : new C3745pb(readStrongBinder);
            } catch (V2.c e6) {
                e = e6;
                u2.i.g("Could not create remote NativeAdViewDelegate.", e);
                return null;
            } catch (RemoteException e9) {
                e = e9;
                u2.i.g("Could not create remote NativeAdViewDelegate.", e);
                return null;
            }
        }
        try {
            V2.b bVar4 = new V2.b(context);
            V2.b bVar5 = new V2.b(nativeAdView);
            V2.b bVar6 = new V2.b(frameLayout);
            try {
                IBinder b9 = AbstractC0415a.I(context).b("com.google.android.gms.ads.ChimeraNativeAdViewDelegateCreatorImpl");
                int i = AbstractBinderC3960tb.f34421n;
                if (b9 == null) {
                    c3906sb = null;
                } else {
                    IInterface queryLocalInterface2 = b9.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
                    c3906sb = queryLocalInterface2 instanceof InterfaceC4014ub ? (InterfaceC4014ub) queryLocalInterface2 : new C3906sb(b9);
                }
                C3906sb c3906sb3 = (C3906sb) c3906sb;
                Parcel A03 = c3906sb3.A0();
                AbstractC3241g8.e(A03, bVar4);
                AbstractC3241g8.e(A03, bVar5);
                AbstractC3241g8.e(A03, bVar6);
                A03.writeInt(261710000);
                Parcel D03 = c3906sb3.D0(A03, 1);
                IBinder readStrongBinder2 = D03.readStrongBinder();
                D03.recycle();
                int i4 = AbstractBinderC3799qb.f33733n;
                if (readStrongBinder2 == null) {
                    return null;
                }
                IInterface queryLocalInterface3 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
                return queryLocalInterface3 instanceof InterfaceC3852rb ? (InterfaceC3852rb) queryLocalInterface3 : new C3745pb(readStrongBinder2);
            } catch (Exception e10) {
                throw new u2.j(e10);
            }
        } catch (RemoteException | NullPointerException | u2.j e11) {
            InterfaceC2466Ae a9 = C4287ze.a(context);
            c4903n.getClass();
            a9.e("ClientApiBroker.createNativeAdViewDelegate", e11);
            return null;
        }
    }

    @Override // q2.AbstractC4905o
    public final Object c(X x3) {
        return x3.v0(new V2.b(this.f40096b), new V2.b(this.f40097c));
    }
}
