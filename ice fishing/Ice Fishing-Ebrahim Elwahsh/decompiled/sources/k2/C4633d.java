package k2;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.BinderC2735Qb;
import com.google.android.gms.internal.ads.BinderC3317hd;
import com.google.android.gms.internal.ads.C3261gb;
import q2.C4895j;
import q2.C4903n;
import q2.C4907p;
import q2.G;
import q2.O0;
import q2.P0;
import q2.a1;
import q2.b1;
import z2.C5273c;
import z2.InterfaceC5272b;

/* renamed from: k2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4633d {

    /* renamed from: a, reason: collision with root package name */
    public final Context f38700a;

    /* renamed from: b, reason: collision with root package name */
    public final G f38701b;

    public C4633d(Context context, String str) {
        O2.w.i(context, "context cannot be null");
        C4903n c4903n = C4907p.f40108g.f40110b;
        BinderC3317hd binderC3317hd = new BinderC3317hd();
        c4903n.getClass();
        G g9 = (G) new C4895j(c4903n, context, str, binderC3317hd).d(context, false);
        this.f38700a = context;
        this.f38701b = g9;
    }

    public final C4634e a() {
        Context context = this.f38700a;
        try {
            return new C4634e(context, this.f38701b.c());
        } catch (RemoteException e6) {
            u2.i.d("Failed to build AdLoader.", e6);
            return new C4634e(context, new O0(new P0()));
        }
    }

    public final void b(InterfaceC5272b interfaceC5272b) {
        try {
            this.f38701b.q2(new BinderC2735Qb(1, interfaceC5272b));
        } catch (RemoteException e6) {
            u2.i.g("Failed to add google native ad listener", e6);
        }
    }

    public final void c(AbstractC4632c abstractC4632c) {
        try {
            this.f38701b.A2(new b1(abstractC4632c));
        } catch (RemoteException e6) {
            u2.i.g("Failed to set AdListener.", e6);
        }
    }

    public final void d(C5273c c5273c) {
        try {
            G g9 = this.f38701b;
            boolean z8 = c5273c.f42149a;
            boolean z9 = c5273c.f42151c;
            int i = c5273c.f42152d;
            w wVar = c5273c.f42153e;
            g9.t0(new C3261gb(4, z8, -1, z9, i, wVar != null ? new a1(wVar) : null, c5273c.f42154f, c5273c.f42150b, c5273c.f42156h, c5273c.f42155g, c5273c.i - 1));
        } catch (RemoteException e6) {
            u2.i.g("Failed to specify native ad options", e6);
        }
    }
}
