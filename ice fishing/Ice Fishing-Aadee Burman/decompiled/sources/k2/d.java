package k2;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.BinderC2802Ub;
import com.google.android.gms.internal.ads.BinderC3464kd;
import com.google.android.gms.internal.ads.C3462kb;
import q2.C4888j;
import q2.C4896n;
import q2.C4900p;
import q2.G;
import q2.O0;
import q2.P0;
import q2.Z0;
import q2.a1;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final Context f38580a;

    /* renamed from: b, reason: collision with root package name */
    public final G f38581b;

    public d(Context context, String str) {
        P2.w.i(context, "context cannot be null");
        C4896n c4896n = C4900p.f40196g.f40198b;
        BinderC3464kd binderC3464kd = new BinderC3464kd();
        c4896n.getClass();
        G g4 = (G) new C4888j(c4896n, context, str, binderC3464kd).d(context, false);
        this.f38580a = context;
        this.f38581b = g4;
    }

    public final e a() {
        Context context = this.f38580a;
        try {
            return new e(context, this.f38581b.d());
        } catch (RemoteException e9) {
            v2.i.d("Failed to build AdLoader.", e9);
            return new e(context, new O0(new P0()));
        }
    }

    public final void b(A2.b bVar) {
        try {
            this.f38581b.J2(new BinderC2802Ub(1, bVar));
        } catch (RemoteException e9) {
            v2.i.g("Failed to add google native ad listener", e9);
        }
    }

    public final void c(c cVar) {
        try {
            this.f38581b.G2(new a1(cVar));
        } catch (RemoteException e9) {
            v2.i.g("Failed to set AdListener.", e9);
        }
    }

    public final void d(A2.c cVar) {
        try {
            G g4 = this.f38581b;
            boolean z3 = cVar.f19a;
            boolean z6 = cVar.f21c;
            int i = cVar.f22d;
            w wVar = cVar.f23e;
            g4.J3(new C3462kb(4, z3, -1, z6, i, wVar != null ? new Z0(wVar) : null, cVar.f24f, cVar.f20b, cVar.f26h, cVar.f25g, cVar.i - 1));
        } catch (RemoteException e9) {
            v2.i.g("Failed to specify native ad options", e9);
        }
    }
}
