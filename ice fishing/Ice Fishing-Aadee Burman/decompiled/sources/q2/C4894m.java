package q2;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.widget.FrameLayout;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.AbstractBinderC4001ub;
import com.google.android.gms.internal.ads.AbstractBinderC4217yb;
import com.google.android.gms.internal.ads.AbstractC3388j8;
import com.google.android.gms.internal.ads.AbstractC3569ma;
import com.google.android.gms.internal.ads.C2501Ce;
import com.google.android.gms.internal.ads.C2753Rb;
import com.google.android.gms.internal.ads.C3947tb;
import com.google.android.gms.internal.ads.C4163xb;
import com.google.android.gms.internal.ads.InterfaceC2518De;
import com.google.android.gms.internal.ads.InterfaceC4055vb;
import com.google.android.gms.internal.ads.InterfaceC4271zb;
import java.util.Objects;

/* renamed from: q2.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4894m extends AbstractC4898o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NativeAdView f40184b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ FrameLayout f40185c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f40186d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C4896n f40187e;

    public C4894m(C4896n c4896n, NativeAdView nativeAdView, FrameLayout frameLayout, Context context) {
        this.f40184b = nativeAdView;
        this.f40185c = frameLayout;
        this.f40186d = context;
        Objects.requireNonNull(c4896n);
        this.f40187e = c4896n;
    }

    @Override // q2.AbstractC4898o
    public final Object a() {
        C4896n.p(this.f40186d, "native_ad_view_delegate");
        return new S0();
    }

    @Override // q2.AbstractC4898o
    public final Object b() {
        InterfaceC4271zb c4163xb;
        Context context = this.f40186d;
        AbstractC3569ma.a(context);
        boolean booleanValue = ((Boolean) r.f40204e.f40207c.a(AbstractC3569ma.cc)).booleanValue();
        FrameLayout frameLayout = this.f40185c;
        NativeAdView nativeAdView = this.f40184b;
        C4896n c4896n = this.f40187e;
        if (!booleanValue) {
            C2753Rb c2753Rb = (C2753Rb) c4896n.f40192x;
            try {
                W2.b bVar = new W2.b(context);
                W2.b bVar2 = new W2.b(nativeAdView);
                W2.b bVar3 = new W2.b(frameLayout);
                C4163xb c4163xb2 = (C4163xb) ((InterfaceC4271zb) c2753Rb.j(context));
                Parcel H02 = c4163xb2.H0();
                AbstractC3388j8.e(H02, bVar);
                AbstractC3388j8.e(H02, bVar2);
                AbstractC3388j8.e(H02, bVar3);
                H02.writeInt(ModuleDescriptor.MODULE_VERSION);
                Parcel M02 = c4163xb2.M0(H02, 1);
                IBinder readStrongBinder = M02.readStrongBinder();
                M02.recycle();
                if (readStrongBinder == null) {
                    return null;
                }
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
                return queryLocalInterface instanceof InterfaceC4055vb ? (InterfaceC4055vb) queryLocalInterface : new C3947tb(readStrongBinder);
            } catch (W2.c e9) {
                e = e9;
                v2.i.g("Could not create remote NativeAdViewDelegate.", e);
                return null;
            } catch (RemoteException e10) {
                e = e10;
                v2.i.g("Could not create remote NativeAdViewDelegate.", e);
                return null;
            }
        }
        try {
            W2.b bVar4 = new W2.b(context);
            W2.b bVar5 = new W2.b(nativeAdView);
            W2.b bVar6 = new W2.b(frameLayout);
            try {
                IBinder b9 = com.bumptech.glide.f.D(context).b("com.google.android.gms.ads.ChimeraNativeAdViewDelegateCreatorImpl");
                int i = AbstractBinderC4217yb.f35173n;
                if (b9 == null) {
                    c4163xb = null;
                } else {
                    IInterface queryLocalInterface2 = b9.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
                    c4163xb = queryLocalInterface2 instanceof InterfaceC4271zb ? (InterfaceC4271zb) queryLocalInterface2 : new C4163xb(b9);
                }
                C4163xb c4163xb3 = (C4163xb) c4163xb;
                Parcel H03 = c4163xb3.H0();
                AbstractC3388j8.e(H03, bVar4);
                AbstractC3388j8.e(H03, bVar5);
                AbstractC3388j8.e(H03, bVar6);
                H03.writeInt(ModuleDescriptor.MODULE_VERSION);
                Parcel M03 = c4163xb3.M0(H03, 1);
                IBinder readStrongBinder2 = M03.readStrongBinder();
                M03.recycle();
                int i6 = AbstractBinderC4001ub.f34546n;
                if (readStrongBinder2 == null) {
                    return null;
                }
                IInterface queryLocalInterface3 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
                return queryLocalInterface3 instanceof InterfaceC4055vb ? (InterfaceC4055vb) queryLocalInterface3 : new C3947tb(readStrongBinder2);
            } catch (Exception e11) {
                throw new v2.j(e11);
            }
        } catch (RemoteException | NullPointerException | v2.j e12) {
            InterfaceC2518De a9 = C2501Ce.a(context);
            c4896n.getClass();
            a9.e("ClientApiBroker.createNativeAdViewDelegate", e12);
            return null;
        }
    }

    @Override // q2.AbstractC4898o
    public final Object c(X x9) {
        return x9.K3(new W2.b(this.f40184b), new W2.b(this.f40185c));
    }
}
