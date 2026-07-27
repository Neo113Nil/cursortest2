package k2;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.AbstractC2684Na;
import com.google.android.gms.internal.ads.AbstractC3569ma;
import com.google.android.gms.internal.ads.RunnableC3191fP;
import q2.D;
import q2.F0;
import q2.e1;
import v2.AbstractC5111b;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final Context f38582a;

    /* renamed from: b, reason: collision with root package name */
    public final D f38583b;

    public e(Context context, D d2) {
        this.f38582a = context;
        this.f38583b = d2;
    }

    public final void a(F0 f02) {
        Context context = this.f38582a;
        AbstractC3569ma.a(context);
        if (((Boolean) AbstractC2684Na.f26495c.r()).booleanValue()) {
            if (((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.Cc)).booleanValue()) {
                AbstractC5111b.f41394b.execute(new RunnableC3191fP(12, this, f02));
                return;
            }
        }
        try {
            this.f38583b.y2(e1.a(context, f02));
        } catch (RemoteException e9) {
            v2.i.d("Failed to load ad.", e9);
        }
    }
}
