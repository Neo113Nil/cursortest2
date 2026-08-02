package s2;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.BinderC3487kd;
import com.google.android.gms.internal.ads.C3275gf;
import com.google.android.gms.internal.ads.C3651nf;
import com.google.android.gms.internal.ads.InterfaceC3435jf;
import java.util.Objects;

/* renamed from: s2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4921b extends AbstractC4947o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f40389b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f40390c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ BinderC3487kd f40391d;

    public C4921b(C4945n c4945n, Context context, String str, BinderC3487kd binderC3487kd) {
        this.f40389b = context;
        this.f40390c = str;
        this.f40391d = binderC3487kd;
        Objects.requireNonNull(c4945n);
    }

    @Override // s2.AbstractC4947o
    public final Object a() {
        C4945n.p(this.f40389b, "rewarded");
        return new T0();
    }

    @Override // s2.AbstractC4947o
    public final Object b() {
        C3651nf c3651nf;
        IBinder r1;
        String str = this.f40390c;
        BinderC3487kd binderC3487kd = this.f40391d;
        Context context = this.f40389b;
        Y2.b bVar = new Y2.b(context);
        try {
            try {
                IBinder b9 = com.bumptech.glide.e.y(context).b("com.google.android.gms.ads.rewarded.ChimeraRewardedAdCreatorImpl");
                if (b9 == null) {
                    c3651nf = null;
                } else {
                    IInterface queryLocalInterface = b9.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCreator");
                    c3651nf = queryLocalInterface instanceof C3651nf ? (C3651nf) queryLocalInterface : new C3651nf(b9, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCreator", 1);
                }
                r1 = c3651nf.r1(bVar, str, binderC3487kd);
            } catch (Exception e9) {
                throw new x2.j(e9);
            }
        } catch (RemoteException e10) {
            e = e10;
            x2.i.i("#007 Could not call remote method.", e);
            return null;
        } catch (x2.j e11) {
            e = e11;
            x2.i.i("#007 Could not call remote method.", e);
            return null;
        }
        if (r1 == null) {
            return null;
        }
        IInterface queryLocalInterface2 = r1.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
        return queryLocalInterface2 instanceof InterfaceC3435jf ? (InterfaceC3435jf) queryLocalInterface2 : new C3275gf(r1);
    }

    @Override // s2.AbstractC4947o
    public final Object c(X x9) {
        return x9.G2(new Y2.b(this.f40389b), this.f40390c, this.f40391d, ModuleDescriptor.MODULE_VERSION);
    }
}
