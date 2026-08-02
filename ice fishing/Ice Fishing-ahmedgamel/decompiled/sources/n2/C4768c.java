package n2;

import R2.w;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.AbstractC2704Na;
import com.google.android.gms.internal.ads.AbstractC3592ma;
import com.google.android.gms.internal.ads.RunnableC3214fP;
import m2.h;
import m2.l;
import m2.v;
import s2.G0;
import s2.K;
import s2.Z0;
import s2.r;
import x2.AbstractC5190b;
import x2.i;

/* renamed from: n2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4768c extends l {
    public C4768c(Context context) {
        super(context);
        w.i(context, "Context cannot be null");
    }

    public final void c(C4767b c4767b) {
        w.d("#008 Must be called on the main UI thread.");
        AbstractC3592ma.a(getContext());
        if (((Boolean) AbstractC2704Na.f27281f.r()).booleanValue()) {
            if (((Boolean) r.f40506e.f40509c.a(AbstractC3592ma.Cc)).booleanValue()) {
                AbstractC5190b.f41851b.execute(new RunnableC3214fP(15, this, c4767b));
                return;
            }
        }
        this.f39393n.b(c4767b.f39373a);
    }

    public h[] getAdSizes() {
        return this.f39393n.f40342g;
    }

    public InterfaceC4769d getAppEventListener() {
        return this.f39393n.f40343h;
    }

    public v getVideoController() {
        return this.f39393n.f40338c;
    }

    public m2.w getVideoOptions() {
        return this.f39393n.f40344j;
    }

    public void setAdSizes(h... hVarArr) {
        if (hVarArr == null || hVarArr.length <= 0) {
            throw new IllegalArgumentException("The supported ad sizes must contain at least one valid ad size.");
        }
        this.f39393n.d(hVarArr);
    }

    public void setAppEventListener(InterfaceC4769d interfaceC4769d) {
        this.f39393n.e(interfaceC4769d);
    }

    public void setManualImpressionsEnabled(boolean z6) {
        G0 g02 = this.f39393n;
        g02.f40347m = z6;
        try {
            K k9 = g02.i;
            if (k9 != null) {
                k9.c2(z6);
            }
        } catch (RemoteException e9) {
            i.i("#007 Could not call remote method.", e9);
        }
    }

    public void setVideoOptions(m2.w wVar) {
        G0 g02 = this.f39393n;
        g02.f40344j = wVar;
        try {
            K k9 = g02.i;
            if (k9 != null) {
                k9.o2(wVar == null ? null : new Z0(wVar));
            }
        } catch (RemoteException e9) {
            i.i("#007 Could not call remote method.", e9);
        }
    }
}
