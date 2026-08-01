package q2;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.BinderC3464kd;
import com.google.android.gms.internal.ads.C3252gf;
import com.google.android.gms.internal.ads.C3628nf;
import com.google.android.gms.internal.ads.InterfaceC3412jf;
import java.util.Objects;

/* renamed from: q2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4872b extends AbstractC4898o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f40090b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f40091c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ BinderC3464kd f40092d;

    public C4872b(C4896n c4896n, Context context, String str, BinderC3464kd binderC3464kd) {
        this.f40090b = context;
        this.f40091c = str;
        this.f40092d = binderC3464kd;
        Objects.requireNonNull(c4896n);
    }

    @Override // q2.AbstractC4898o
    public final Object a() {
        C4896n.p(this.f40090b, "rewarded");
        return new T0();
    }

    @Override // q2.AbstractC4898o
    public final Object b() {
        C3628nf c3628nf;
        IBinder t12;
        String str = this.f40091c;
        BinderC3464kd binderC3464kd = this.f40092d;
        Context context = this.f40090b;
        W2.b bVar = new W2.b(context);
        try {
            try {
                IBinder b9 = com.bumptech.glide.f.D(context).b("com.google.android.gms.ads.rewarded.ChimeraRewardedAdCreatorImpl");
                if (b9 == null) {
                    c3628nf = null;
                } else {
                    IInterface queryLocalInterface = b9.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCreator");
                    c3628nf = queryLocalInterface instanceof C3628nf ? (C3628nf) queryLocalInterface : new C3628nf(b9, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCreator", 2);
                }
                t12 = c3628nf.t1(bVar, str, binderC3464kd);
            } catch (Exception e9) {
                throw new v2.j(e9);
            }
        } catch (RemoteException e10) {
            e = e10;
            v2.i.i("#007 Could not call remote method.", e);
            return null;
        } catch (v2.j e11) {
            e = e11;
            v2.i.i("#007 Could not call remote method.", e);
            return null;
        }
        if (t12 == null) {
            return null;
        }
        IInterface queryLocalInterface2 = t12.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
        return queryLocalInterface2 instanceof InterfaceC3412jf ? (InterfaceC3412jf) queryLocalInterface2 : new C3252gf(t12);
    }

    @Override // q2.AbstractC4898o
    public final Object c(X x9) {
        return x9.e3(new W2.b(this.f40090b), this.f40091c, this.f40092d, ModuleDescriptor.MODULE_VERSION);
    }
}
