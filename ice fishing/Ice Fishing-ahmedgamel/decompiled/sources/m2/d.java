package m2;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.BinderC2824Ub;
import com.google.android.gms.internal.ads.BinderC3487kd;
import com.google.android.gms.internal.ads.C3485kb;
import s2.C4937j;
import s2.C4945n;
import s2.C4949p;
import s2.G;
import s2.O0;
import s2.P0;
import s2.Z0;
import s2.a1;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final Context f39369a;

    /* renamed from: b, reason: collision with root package name */
    public final G f39370b;

    public d(Context context, String str) {
        R2.w.i(context, "context cannot be null");
        C4945n c4945n = C4949p.f40498g.f40500b;
        BinderC3487kd binderC3487kd = new BinderC3487kd();
        c4945n.getClass();
        G g9 = (G) new C4937j(c4945n, context, str, binderC3487kd).d(context, false);
        this.f39369a = context;
        this.f39370b = g9;
    }

    public final e a() {
        Context context = this.f39369a;
        try {
            return new e(context, this.f39370b.d());
        } catch (RemoteException e9) {
            x2.i.d("Failed to build AdLoader.", e9);
            return new e(context, new O0(new P0()));
        }
    }

    public final void b(C2.b bVar) {
        try {
            this.f39370b.H2(new BinderC2824Ub(1, bVar));
        } catch (RemoteException e9) {
            x2.i.g("Failed to add google native ad listener", e9);
        }
    }

    public final void c(c cVar) {
        try {
            this.f39370b.M0(new a1(cVar));
        } catch (RemoteException e9) {
            x2.i.g("Failed to set AdListener.", e9);
        }
    }

    public final void d(C2.c cVar) {
        try {
            G g9 = this.f39370b;
            boolean z6 = cVar.f318a;
            boolean z9 = cVar.f320c;
            int i = cVar.f321d;
            w wVar = cVar.f322e;
            g9.H3(new C3485kb(4, z6, -1, z9, i, wVar != null ? new Z0(wVar) : null, cVar.f323f, cVar.f319b, cVar.f325h, cVar.f324g, cVar.i - 1));
        } catch (RemoteException e9) {
            x2.i.g("Failed to specify native ad options", e9);
        }
    }
}
