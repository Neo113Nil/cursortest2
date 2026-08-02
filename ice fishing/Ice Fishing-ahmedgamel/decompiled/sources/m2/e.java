package m2;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.AbstractC2704Na;
import com.google.android.gms.internal.ads.AbstractC3592ma;
import com.google.android.gms.internal.ads.RunnableC3214fP;
import s2.D;
import s2.F0;
import s2.e1;
import x2.AbstractC5190b;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final Context f39371a;

    /* renamed from: b, reason: collision with root package name */
    public final D f39372b;

    public e(Context context, D d9) {
        this.f39371a = context;
        this.f39372b = d9;
    }

    public final void a(F0 f02) {
        Context context = this.f39371a;
        AbstractC3592ma.a(context);
        if (((Boolean) AbstractC2704Na.f27278c.r()).booleanValue()) {
            if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.Cc)).booleanValue()) {
                AbstractC5190b.f41851b.execute(new RunnableC3214fP(12, this, f02));
                return;
            }
        }
        try {
            this.f39372b.j3(e1.a(context, f02));
        } catch (RemoteException e9) {
            x2.i.d("Failed to load ad.", e9);
        }
    }
}
