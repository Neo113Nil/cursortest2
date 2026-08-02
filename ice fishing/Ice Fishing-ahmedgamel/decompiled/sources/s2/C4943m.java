package s2;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.widget.FrameLayout;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.AbstractBinderC4024ub;
import com.google.android.gms.internal.ads.AbstractBinderC4240yb;
import com.google.android.gms.internal.ads.AbstractC3411j8;
import com.google.android.gms.internal.ads.AbstractC3592ma;
import com.google.android.gms.internal.ads.C2521Ce;
import com.google.android.gms.internal.ads.C2773Rb;
import com.google.android.gms.internal.ads.C3970tb;
import com.google.android.gms.internal.ads.C4186xb;
import com.google.android.gms.internal.ads.InterfaceC2538De;
import com.google.android.gms.internal.ads.InterfaceC4078vb;
import com.google.android.gms.internal.ads.InterfaceC4294zb;
import java.util.Objects;

/* renamed from: s2.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4943m extends AbstractC4947o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NativeAdView f40486b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ FrameLayout f40487c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f40488d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C4945n f40489e;

    public C4943m(C4945n c4945n, NativeAdView nativeAdView, FrameLayout frameLayout, Context context) {
        this.f40486b = nativeAdView;
        this.f40487c = frameLayout;
        this.f40488d = context;
        Objects.requireNonNull(c4945n);
        this.f40489e = c4945n;
    }

    @Override // s2.AbstractC4947o
    public final Object a() {
        C4945n.p(this.f40488d, "native_ad_view_delegate");
        return new S0();
    }

    @Override // s2.AbstractC4947o
    public final Object b() {
        InterfaceC4294zb c4186xb;
        Context context = this.f40488d;
        AbstractC3592ma.a(context);
        boolean booleanValue = ((Boolean) r.f40506e.f40509c.a(AbstractC3592ma.cc)).booleanValue();
        FrameLayout frameLayout = this.f40487c;
        NativeAdView nativeAdView = this.f40486b;
        C4945n c4945n = this.f40489e;
        if (!booleanValue) {
            C2773Rb c2773Rb = (C2773Rb) c4945n.f40494x;
            try {
                Y2.b bVar = new Y2.b(context);
                Y2.b bVar2 = new Y2.b(nativeAdView);
                Y2.b bVar3 = new Y2.b(frameLayout);
                C4186xb c4186xb2 = (C4186xb) ((InterfaceC4294zb) c2773Rb.i(context));
                Parcel F02 = c4186xb2.F0();
                AbstractC3411j8.e(F02, bVar);
                AbstractC3411j8.e(F02, bVar2);
                AbstractC3411j8.e(F02, bVar3);
                F02.writeInt(ModuleDescriptor.MODULE_VERSION);
                Parcel K02 = c4186xb2.K0(F02, 1);
                IBinder readStrongBinder = K02.readStrongBinder();
                K02.recycle();
                if (readStrongBinder == null) {
                    return null;
                }
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
                return queryLocalInterface instanceof InterfaceC4078vb ? (InterfaceC4078vb) queryLocalInterface : new C3970tb(readStrongBinder);
            } catch (Y2.c e9) {
                e = e9;
                x2.i.g("Could not create remote NativeAdViewDelegate.", e);
                return null;
            } catch (RemoteException e10) {
                e = e10;
                x2.i.g("Could not create remote NativeAdViewDelegate.", e);
                return null;
            }
        }
        try {
            Y2.b bVar4 = new Y2.b(context);
            Y2.b bVar5 = new Y2.b(nativeAdView);
            Y2.b bVar6 = new Y2.b(frameLayout);
            try {
                IBinder b9 = com.bumptech.glide.e.y(context).b("com.google.android.gms.ads.ChimeraNativeAdViewDelegateCreatorImpl");
                int i = AbstractBinderC4240yb.f35963n;
                if (b9 == null) {
                    c4186xb = null;
                } else {
                    IInterface queryLocalInterface2 = b9.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
                    c4186xb = queryLocalInterface2 instanceof InterfaceC4294zb ? (InterfaceC4294zb) queryLocalInterface2 : new C4186xb(b9);
                }
                C4186xb c4186xb3 = (C4186xb) c4186xb;
                Parcel F03 = c4186xb3.F0();
                AbstractC3411j8.e(F03, bVar4);
                AbstractC3411j8.e(F03, bVar5);
                AbstractC3411j8.e(F03, bVar6);
                F03.writeInt(ModuleDescriptor.MODULE_VERSION);
                Parcel K03 = c4186xb3.K0(F03, 1);
                IBinder readStrongBinder2 = K03.readStrongBinder();
                K03.recycle();
                int i4 = AbstractBinderC4024ub.f35318n;
                if (readStrongBinder2 == null) {
                    return null;
                }
                IInterface queryLocalInterface3 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
                return queryLocalInterface3 instanceof InterfaceC4078vb ? (InterfaceC4078vb) queryLocalInterface3 : new C3970tb(readStrongBinder2);
            } catch (Exception e11) {
                throw new x2.j(e11);
            }
        } catch (RemoteException | NullPointerException | x2.j e12) {
            InterfaceC2538De a9 = C2521Ce.a(context);
            c4945n.getClass();
            a9.e("ClientApiBroker.createNativeAdViewDelegate", e12);
            return null;
        }
    }

    @Override // s2.AbstractC4947o
    public final Object c(X x9) {
        return x9.W0(new Y2.b(this.f40486b), new Y2.b(this.f40487c));
    }
}
