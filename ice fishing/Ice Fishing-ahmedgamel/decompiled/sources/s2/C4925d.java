package s2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.OutOfContextTestingActivity;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.AbstractC3592ma;
import com.google.android.gms.internal.ads.BinderC3487kd;
import com.google.android.gms.internal.ads.C2521Ce;
import java.util.Objects;

/* renamed from: s2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4925d extends AbstractC4947o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ OutOfContextTestingActivity f40424b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BinderC3487kd f40425c;

    public C4925d(C4945n c4945n, OutOfContextTestingActivity outOfContextTestingActivity, BinderC3487kd binderC3487kd) {
        this.f40424b = outOfContextTestingActivity;
        this.f40425c = binderC3487kd;
        Objects.requireNonNull(c4945n);
    }

    @Override // s2.AbstractC4947o
    public final /* bridge */ /* synthetic */ Object a() {
        C4945n.p(this.f40424b, "out_of_context_tester");
        return null;
    }

    @Override // s2.AbstractC4947o
    public final Object b() {
        C4959u0 c4959u0;
        OutOfContextTestingActivity outOfContextTestingActivity = this.f40424b;
        Y2.b bVar = new Y2.b(outOfContextTestingActivity);
        AbstractC3592ma.a(outOfContextTestingActivity);
        if (((Boolean) r.f40506e.f40509c.a(AbstractC3592ma.Ja)).booleanValue()) {
            try {
                try {
                    IBinder b9 = com.bumptech.glide.e.y(outOfContextTestingActivity).b("com.google.android.gms.ads.DynamiteOutOfContextTesterCreatorImpl");
                    if (b9 == null) {
                        c4959u0 = null;
                    } else {
                        IInterface queryLocalInterface = b9.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTesterCreator");
                        c4959u0 = queryLocalInterface instanceof C4959u0 ? (C4959u0) queryLocalInterface : new C4959u0(b9, "com.google.android.gms.ads.internal.client.IOutOfContextTesterCreator", 1);
                    }
                    return c4959u0.r1(bVar, this.f40425c);
                } catch (Exception e9) {
                    throw new x2.j(e9);
                }
            } catch (RemoteException e10) {
                e = e10;
                C2521Ce.a(outOfContextTestingActivity).e("ClientApiBroker.getOutOfContextTester", e);
                return null;
            } catch (NullPointerException e11) {
                e = e11;
                C2521Ce.a(outOfContextTestingActivity).e("ClientApiBroker.getOutOfContextTester", e);
                return null;
            } catch (x2.j e12) {
                e = e12;
                C2521Ce.a(outOfContextTestingActivity).e("ClientApiBroker.getOutOfContextTester", e);
                return null;
            }
        }
        return null;
    }

    @Override // s2.AbstractC4947o
    public final Object c(X x9) {
        OutOfContextTestingActivity outOfContextTestingActivity = this.f40424b;
        Y2.b bVar = new Y2.b(outOfContextTestingActivity);
        AbstractC3592ma.a(outOfContextTestingActivity);
        if (((Boolean) r.f40506e.f40509c.a(AbstractC3592ma.Ja)).booleanValue()) {
            return x9.i1(bVar, this.f40425c, ModuleDescriptor.MODULE_VERSION);
        }
        return null;
    }
}
