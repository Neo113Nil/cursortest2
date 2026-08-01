package q2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.OutOfContextTestingActivity;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.AbstractC3569ma;
import com.google.android.gms.internal.ads.BinderC3464kd;
import com.google.android.gms.internal.ads.C2501Ce;
import java.util.Objects;

/* renamed from: q2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4876d extends AbstractC4898o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ OutOfContextTestingActivity f40125b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BinderC3464kd f40126c;

    public C4876d(C4896n c4896n, OutOfContextTestingActivity outOfContextTestingActivity, BinderC3464kd binderC3464kd) {
        this.f40125b = outOfContextTestingActivity;
        this.f40126c = binderC3464kd;
        Objects.requireNonNull(c4896n);
    }

    @Override // q2.AbstractC4898o
    public final /* bridge */ /* synthetic */ Object a() {
        C4896n.p(this.f40125b, "out_of_context_tester");
        return null;
    }

    @Override // q2.AbstractC4898o
    public final Object b() {
        C4910u0 c4910u0;
        OutOfContextTestingActivity outOfContextTestingActivity = this.f40125b;
        W2.b bVar = new W2.b(outOfContextTestingActivity);
        AbstractC3569ma.a(outOfContextTestingActivity);
        if (((Boolean) r.f40207e.f40210c.a(AbstractC3569ma.Ja)).booleanValue()) {
            try {
                try {
                    IBinder b9 = com.bumptech.glide.f.D(outOfContextTestingActivity).b("com.google.android.gms.ads.DynamiteOutOfContextTesterCreatorImpl");
                    if (b9 == null) {
                        c4910u0 = null;
                    } else {
                        IInterface queryLocalInterface = b9.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTesterCreator");
                        c4910u0 = queryLocalInterface instanceof C4910u0 ? (C4910u0) queryLocalInterface : new C4910u0(b9, "com.google.android.gms.ads.internal.client.IOutOfContextTesterCreator", 2);
                    }
                    return c4910u0.t1(bVar, this.f40126c);
                } catch (Exception e9) {
                    throw new v2.j(e9);
                }
            } catch (RemoteException e10) {
                e = e10;
                C2501Ce.a(outOfContextTestingActivity).e("ClientApiBroker.getOutOfContextTester", e);
                return null;
            } catch (NullPointerException e11) {
                e = e11;
                C2501Ce.a(outOfContextTestingActivity).e("ClientApiBroker.getOutOfContextTester", e);
                return null;
            } catch (v2.j e12) {
                e = e12;
                C2501Ce.a(outOfContextTestingActivity).e("ClientApiBroker.getOutOfContextTester", e);
                return null;
            }
        }
        return null;
    }

    @Override // q2.AbstractC4898o
    public final Object c(X x9) {
        OutOfContextTestingActivity outOfContextTestingActivity = this.f40125b;
        W2.b bVar = new W2.b(outOfContextTestingActivity);
        AbstractC3569ma.a(outOfContextTestingActivity);
        if (((Boolean) r.f40207e.f40210c.a(AbstractC3569ma.Ja)).booleanValue()) {
            return x9.A1(bVar, this.f40126c, ModuleDescriptor.MODULE_VERSION);
        }
        return null;
    }
}
